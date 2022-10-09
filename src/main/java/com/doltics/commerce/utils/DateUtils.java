package com.doltics.commerce.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import com.doltics.commerce.abstracts.AbstractUtil;

/**
 * 
 * Date Helpers Common Date functions
 * 
 * @author Paul Kevin
 *
 * @version enter version, 26 Feb 2018
 *
 * @since jdk 1.8
 */
public class DateUtils extends AbstractUtil {
	
	public static final String DATE_TIME_PATTERN = "dd-MM-yyyy hh:mm";
	
	private static SimpleDateFormat formatter;

	/**
	 * Format to SQL Date
	 * 
	 * @param dateString
	 * @return
	 */
	public static Date formatToSQLDate(String dateString) {
		return formatToSQLDate(dateString, DATE_TIME_PATTERN);
	}
	
	/**
	 * 
	 * <p>
	 * Format to sql date
	 * </p>
	 *
	 * @param dateString
	 * @param pattern
	 * @return
	 */
	public static Date formatToSQLDate(String dateString, String pattern) {

		SimpleDateFormat source = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = source.parse(dateString);
			return date;
		} catch (ParseException e) {
			log().error(e.getMessage(), e);
			return null;
		}
	}
	
	
	/**
	 * Format to SQL Date
	 * 
	 * @param dateString
	 * @return
	 */
	public static Date formatDateTimeToSQLDate(String dateString) {
		LocalDateTime myDateObj = LocalDateTime.parse(dateString);
		ZonedDateTime zdt = myDateObj.atZone(ZoneId.systemDefault());
		return Date.from(zdt.toInstant());
	}

	/**
	 * String to SQL Date
	 * 
	 * @param date
	 * @return
	 */
	public static String formatToSQLDateString(Date date) {

		formatter = new SimpleDateFormat(DATE_TIME_PATTERN);
		return formatter.format(date);
	}

	/**
	 * Compare time
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int compareTimes(Date d1, Date d2) {
		int t1;
		int t2;

		t1 = (int) (d1.getTime() % (24 * 60 * 60 * 1000L));
		t2 = (int) (d2.getTime() % (24 * 60 * 60 * 1000L));
		return (t1 - t2);
	}

	/**
	 * Add Days
	 * 
	 * @param days
	 * @return
	 */
	public static Date addDaysToDate(int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * Add Minutes
	 * 
	 * @param minutes
	 * @return
	 */
	public static Date addMinutesToDate(int minutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.MINUTE, minutes);
		return cal.getTime();
	}

	/**
	 * Check if first day of month
	 * 
	 * @param calender
	 * @return
	 */
	public static boolean isFirstDayofMonth(Calendar calender) {
		if (calender == null)
			return false;

		int dayOfMonth = calender.get(Calendar.DAY_OF_MONTH);
		return (dayOfMonth == 1);
	}

	/**
	 * Check if its a new week
	 * 
	 * @param date
	 * @return
	 */
	public static boolean isNewWeek(Date date) {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);

		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		Date monday = c.getTime();

		Date nextMonday = new Date(monday.getTime() + 7 * 24 * 60 * 60 * 1000);

		return date.after(monday) && date.before(nextMonday);
	}

	/**
	 * Check if date is before
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean isDateBefore(Date start, Date end) {
		long diff = end.getTime() - start.getTime();
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000);
		int diffInDays = (int) ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24));

		if (diffInDays > 1) {
			return false;
		} else if (diffHours > 24) {
			return false;
		} else if ((diffHours == 24) && (diffMinutes >= 1)) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * Get days left
	 * <p>
	 * @param date
	 * @return
	 */
	public static float getDaysLeft(Date date) {
		Date current = new Date();
		long difference = date.getTime() - current.getTime();
		float daysBetween = (difference / (1000 * 60 * 60 * 24));
		return daysBetween;
	}
	
	public static void main(String [] args) {
		System.out.println(formatDateTimeToSQLDate("2017-03-22T16:28:02"));
	}
}
