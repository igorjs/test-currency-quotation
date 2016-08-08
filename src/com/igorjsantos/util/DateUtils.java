package com.igorjsantos.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author igorjsantos
 *
 */
public class DateUtils {

	private static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
	private static final String DEFAULT_CSV_DATE_FORMAT = "yyyyMMdd";	
	private static final Locale LOCALE_BRAZIL = new Locale("pt","BR");
	
	public static String toDataSourceDateFormat(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern(DEFAULT_CSV_DATE_FORMAT, LOCALE_BRAZIL));
	}

	public static LocalDate toLocalDateFormat(String date) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT, LOCALE_BRAZIL));
	}

	public static boolean isBussinesDay(LocalDate date) {
		return (date.getDayOfWeek().getValue() >= DayOfWeek.MONDAY.getValue()
				&& date.getDayOfWeek().getValue() <= DayOfWeek.FRIDAY.getValue());
	}

	public static LocalDate getLastBussinesDay(LocalDate date) {
		if (DayOfWeek.SATURDAY.equals(date.getDayOfWeek())) {
			return date.minusDays(1);
		}
		if (DayOfWeek.SUNDAY.equals(date.getDayOfWeek())) {
			return date.minusDays(2);
		}			
		return date;
	}
}
