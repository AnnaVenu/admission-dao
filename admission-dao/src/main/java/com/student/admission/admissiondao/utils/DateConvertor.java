package com.student.admission.admissiondao.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateConvertor {

	public static Timestamp stringToDateConverter(String date) {
		Timestamp timestamp = null;
		if (null != date && !date.isEmpty()) {
			timestamp = Timestamp.valueOf(date);
		}
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
