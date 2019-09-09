package com.hitex.mobicastutil.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class DateTimeUtil {

    public static Date getCurentDateGMT() {
        Calendar time = Calendar.getInstance();
        time.add(Calendar.MILLISECOND, -time.getTimeZone().getOffset(time.getTimeInMillis()));
        return time.getTime();
    }
}
