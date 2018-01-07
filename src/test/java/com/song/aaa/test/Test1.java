package com.song.aaa.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.song.aaa.dao.TestDao;
import com.song.aaa.service.TestService;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class Test1 {
	 private static Logger logger = Logger.getLogger(Test1.class);  
	    @Autowired 
	    private TestService testservice ;  
	  
	    @Autowired 
	    private TestDao dao;
	    @Test  
	    public void test1() {  
	    	List<com.song.aaa.po.Test> all = dao.getAll();
	        logger.info(all.get(0).getName());  
	    } 
	    public static void main(String[] args) throws Exception {
//	    	String url="http://gw.api.tbsandbox.com/router/rest";
	    	String url="http://gw.api.taobao.com/router/rest";
			String appkey="23499074";
			String secret="89ffc060d0a3ccd90eacf849e6d0af18";
			TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
	    	AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
	    	req.setExtend("回显参数");
	    	req.setSmsType("normal");
	    	req.setSmsFreeSignName("宏扬");
	    	req.setSmsParamString("{\"all\":\"宋艳玲  你这个大傻逼 哈哈哈   我给你打短信啦  你看着办吧 \"}");
	    	req.setRecNum("17679074245");
	    	req.setSmsTemplateCode("SMS_24795157");
	    	AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
	    	System.out.println(rsp.getBody());
	    	
	    	
		}
}
