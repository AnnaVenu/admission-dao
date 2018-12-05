package com.student.admission.admissiondao.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {

	public static Timestamp stringToDateConverter(String stringDateFormat) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse(stringDateFormat);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		/*System.out.println("Date:" + date);*/
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		return timestamp;
	}

	public static String datetoStringConverter(Timestamp timestamp) {
		String date = "";
		if (null != timestamp) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = dateFormat.format(timestamp);
		}
		return date;

	}
}
