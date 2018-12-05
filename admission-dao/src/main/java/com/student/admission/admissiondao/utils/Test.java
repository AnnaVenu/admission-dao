package com.student.admission.admissiondao.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static Timestamp stringToDateConverter(String str_date) {
		String dt = "10-Jan-2017";
		String pattern = "dd-MMM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Date:" + date);
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		System.out.println("Timestamp:" + timestamp.toInstant().toString());
		return timestamp;
	}

	public static String datetoStringConverter(Timestamp timestamp) {
		//Timestamp ts = 2017-01-09 18:30:00;
		/*Date date = new Date();
		date.setTime(timestamp.getTime());*/
		String formattedDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(timestamp);
		return formattedDate;
		
	}

	public static void main(String[] args) {
		Test.datetoStringConverter(new Timestamp(4464));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
	}

}
