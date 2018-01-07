package com.song.aaa.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.song.aaa.dao.DeptMapper;
import com.song.aaa.dao.EmpMapper;
import com.song.aaa.dao.PicMapper;
import com.song.aaa.po.Dept;
import com.song.aaa.po.Emp;
import com.song.aaa.po.Pic;
import com.song.aaa.util.ZH;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpMapper dao;
	@Autowired
	private PicMapper PDao;
	@RequestMapping("/add")
	public String add(HttpServletRequest request,HttpServletResponse resp ,Model model) {
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request)){
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
           //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();
            String ename = request.getParameter("ename");
            String job = request.getParameter("job");
            String mrg = request.getParameter("mrg");
            String hiredate = request.getParameter("hiredate");
            String sal = request.getParameter("sal");
            String comm = request.getParameter("comm");
            String deptno = request.getParameter("deptno");
            Emp emp = new Emp();
            emp.setComm(ZH.toBig(comm));
            emp.setDeptno(ZH.toInt(deptno));
            emp.setEname(ename);
            emp.setHiredate(ZH.toDate(hiredate));
            emp.setJob(job);
            emp.setMrg(ZH.toInt(mrg));
            emp.setSal(ZH.toBig(sal));
            dao.insert(emp);
            System.out.println(emp.getEmpno()+"主键!!!");
            String path = request.getSession().getServletContext().getRealPath("image"); 
            System.out.println(path);
            while(iter.hasNext()){
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null){
                    try {
						file.transferTo(new File(path+"\\"+file.getOriginalFilename()));
						Pic pic = new Pic();
						pic.setEmpid(emp.getEmpno());
						pic.setPname(file.getOriginalFilename());
						pic.setSavepath("/image/"+file.getOriginalFilename());
						PDao.insert(pic);
                    } catch (Exception e) {
						e.printStackTrace();
					}
                }
                 
            }
            
           
        }
		
		
		
		
//		PDao.insertSelective(record);
//		dao.insert(record);
		return "index";  
	}
	@Autowired
	private DeptMapper dao1;
	@RequestMapping("/addView")
	public String list(HttpServletRequest request,HttpServletResponse resp ,Model model) {
		List<Dept> list = dao1.selectAll();
		List<Emp> all1 = dao.selectAll();
		List<Emp> mrgs = dao.selectMrg();
		HashSet<Emp> all = new HashSet<Emp>(all1);
		HashSet<Emp> mrg = new HashSet<Emp>(mrgs);
		HashSet<Emp> set = new HashSet<Emp>();
		for (Emp e : mrg) {
			Emp aa = dao.selectByPrimaryKey(e.getMrg());
			set.add(aa);
		}
		request.setAttribute("list", list);
		request.setAttribute("all", all);
		request.setAttribute("set", set);
		
		return "emp/addView";  
	}
	

}

