package technologycommunity.net;

import technologycommunity.net.structures.Locale;
import technologycommunity.net.structures.Output;
import technologycommunity.net.structures.TimeLocale;
import technologycommunity.net.structures.TimeUnit;

import java.util.*;

public class TimeFormatter {
    private static final Map<Integer, TimeUnit> TIME_UNITS = new LinkedHashMap<>();

    static {
        TIME_UNITS.put(31540000, TimeUnit.YEAR);
        TIME_UNITS.put(2628000, TimeUnit.MONTH);
        TIME_UNITS.put(86400, TimeUnit.DAY);
        TIME_UNITS.put(3600, TimeUnit.HOUR);
        TIME_UNITS.put(60, TimeUnit.MINUTE);
        TIME_UNITS.put(1, TimeUnit.SECOND);
    }

    public static Output convert(Locale locale, int seconds) {
        return convert(locale.getTimeLocale(), seconds);
    }

    public static Output convert(TimeLocale locale, int seconds) {
        List<String> builder = new ArrayList<>();
        int remainingSeconds = seconds;

        for (Map.Entry<Integer, TimeUnit> entry : TIME_UNITS.entrySet()) {
            int unitValue = entry.getKey();
            TimeUnit timeUnit = entry.getValue();

            if (remainingSeconds >= unitValue) {
                int value = remainingSeconds / unitValue;
                remainingSeconds %= unitValue;

                String timeLabel = getSuffix(value, locale, timeUnit);

                builder.add(String.valueOf(value));
                builder.add(timeLabel);
            }
        }

        return new Output(builder.toArray(new String[0]));
    }

    private static String getSuffix(int value, TimeLocale locale, TimeUnit unitKey) {
        if (value == 1) {
            switch (unitKey) {
                case TimeUnit.YEAR -> {
                    return locale.getOneYearTimeUnit();
                }
                case TimeUnit.MONTH -> {
                    return locale.getOneMonthTimeUnit();
                }
                case TimeUnit.DAY -> {
                    return locale.getOneDayTimeUnit();
                }
                case TimeUnit.HOUR -> {
                    return locale.getOneHourTimeUnit();
                }
                case TimeUnit.MINUTE -> {
                    return locale.getOneMinuteTimeUnit();
                }
                case TimeUnit.SECOND -> {
                    return locale.getOneSecondTimeUnit();
                }
            }
        } else if ((value >= 2 && value <= 4) || (value >= 22 && value <= 24) || (value >= 32 && value <= 34) || (value >= 42 && value <= 44) ||  (value >= 52 && value <= 54)) {
            switch (unitKey) {
                case TimeUnit.YEAR -> {
                    return locale.getYearsTimeUnit();
                }
                case TimeUnit.MONTH -> {
                    return locale.getMonthsTimeUnit();
                }
                case TimeUnit.DAY -> {
                    return locale.getDaysTimeUnit();
                }
                case TimeUnit.HOUR -> {
                    return locale.getHoursTimeUnit();
                }
                case TimeUnit.MINUTE -> {
                    return locale.getMinutesTimeUnit();
                }
                case TimeUnit.SECOND -> {
                    return locale.getSecondsTimeUnit();
                }
            }
        } else {
            switch (unitKey) {
                case TimeUnit.YEAR -> {
                    return locale.getYearTimeUnit();
                }
                case TimeUnit.MONTH -> {
                    return locale.getMonthTimeUnit();
                }
                case TimeUnit.DAY -> {
                    return locale.getDayTimeUnit();
                }
                case TimeUnit.HOUR -> {
                    return locale.getHourTimeUnit();
                }
                case TimeUnit.MINUTE -> {
                    return locale.getMinuteTimeUnit();
                }
                case TimeUnit.SECOND -> {
                    return locale.getSecondTimeUnit();
                }
            }
        }

        return "null";
    }

    public static Integer turnToSeconds(Long milliseconds) {
        return (int) (milliseconds / 1000);
    }

    public static Long turnToMilliseconds(Integer seconds) {
        return seconds * 1000L;
    }
}
