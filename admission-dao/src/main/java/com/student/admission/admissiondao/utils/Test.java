package com.student.admission.admissiondao.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

	static String date = "20120213";

	public static Date stringtoDateConverter() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
		java.util.Date parsedDate = format.parse(date);
		Date sqlDate = new java.sql.Date(parsedDate.getTime());
		System.out.println(sqlDate);
		return sqlDate;
	}

	public static void main(String[] args) throws ParseException {
		Test.stringtoDateConverter();
	}

}
