package com.song.aaa.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZH {
	public static Integer toInt(String s) {
		if(s == null || s.equals("")) {
			return null;
		}
		return Integer.parseInt(s);
	}
	static SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
	public static Date toDate(String hiredate) {
		if(hiredate == null || hiredate.equals("")) {
			return new Date();
		}
		try {
			return sdf.parse(hiredate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}
	public static BigDecimal toBig(String comm) {
		if(comm == null || comm.equals("")) {
			return null;
		}
		return new BigDecimal(comm);
	}
}	
