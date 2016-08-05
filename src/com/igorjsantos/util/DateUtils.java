package com.igorjsantos.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author igorjsantos
 *
 */
public class DateUtils {

	private static final DateTimeFormatter DEFAULT_LOCAL_DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter DEFAULT_STRING_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private static final Long WORKING_DAYS = [DayOfWeek.MONDAY, DayofWee;/k]

	public static LocalDate convertToLocalDateFormat(String date) {
		return LocalDate.parse(date, DEFAULT_LOCAL_DATE_FORMAT);
	}
	
	public static String convertToStringFormat(LocalDate date) {
		return date.format(DEFAULT_STRING_DATE_FORMAT);
	}

	public static boolean isNonWorkingDay(LocalDate date) {
		return date.getDayOfWeek().getValue() - DayOfWeek.FRIDAY.getValue() > 0;
	}

	public static LocalDate previousWorkingDay(LocalDate date) {
		LocalDate previousDay = date.minusDays(1);
		int decrementNonWorkinDays = previousDay.getDayOfWeek().getValue() - DayOfWeek.FRIDAY.getValue();

		if (decrementNonWorkinDays > 0) {
			return previousDay.minusDays(decrementNonWorkinDays);
		}
		return previousDay;
	}
}
