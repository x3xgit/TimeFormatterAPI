package technologycommunity.net.structures;

public class TimeLocale {
    public String onePrefix;

    String oneYearTimeUnit;
    String oneMonthTimeUnit;
    String oneDayTimeUnit;
    String oneHourTimeUnit;
    String oneMinuteTimeUnit;
    String oneSecondTimeUnit;

    String yearTimeUnit;
    String monthTimeUnit;
    String dayTimeUnit;
    String hourTimeUnit;
    String minuteTimeUnit;
    String secondTimeUnit;

    String yearsTimeUnit;
    String monthsTimeUnit;
    String daysTimeUnit;
    String hoursTimeUnit;
    String minutesTimeUnit;
    String secondsTimeUnit;

    public TimeLocale(
            String onePrefix,

            String oneYearTimeUnit,
            String oneMonthTimeUnit,
            String oneDayTimeUnit,
            String oneHourTimeUnit,
            String oneMinuteTimeUnit,
            String oneSecondTimeUnit,

            String yearTimeUnit,
            String monthTimeUnit,
            String dayTimeUnit,
            String hourTimeUnit,
            String minuteTimeUnit,
            String secondTimeUnit,

            String yearsTimeUnit,
            String monthsTimeUnit,
            String daysTimeUnit,
            String hoursTimeUnit,
            String minutesTimeUnit,
            String secondsTimeUnit
    )
    {
        this.onePrefix = onePrefix;

        this.oneYearTimeUnit = oneYearTimeUnit;
        this.oneMonthTimeUnit = oneMonthTimeUnit;
        this.oneDayTimeUnit = oneDayTimeUnit;
        this.oneHourTimeUnit = oneHourTimeUnit;
        this.oneMinuteTimeUnit = oneMinuteTimeUnit;
        this.oneSecondTimeUnit = oneSecondTimeUnit;

        this.yearTimeUnit = yearTimeUnit;
        this.monthTimeUnit = monthTimeUnit;
        this.dayTimeUnit = dayTimeUnit;
        this.hourTimeUnit = hourTimeUnit;
        this.minuteTimeUnit = minuteTimeUnit;
        this.secondTimeUnit = secondTimeUnit;

        this.yearsTimeUnit = yearsTimeUnit;
        this.monthsTimeUnit = monthsTimeUnit;
        this.daysTimeUnit = daysTimeUnit;
        this.hoursTimeUnit = hoursTimeUnit;
        this.minutesTimeUnit = minutesTimeUnit;
        this.secondsTimeUnit = secondsTimeUnit;
    }

    public String getDaysTimeUnit() {
        return daysTimeUnit;
    }

    public String getDayTimeUnit() {
        return dayTimeUnit;
    }

    public String getHoursTimeUnit() {
        return hoursTimeUnit;
    }

    public String getHourTimeUnit() {
        return hourTimeUnit;
    }

    public String getMinutesTimeUnit() {
        return minutesTimeUnit;
    }

    public String getMinuteTimeUnit() {
        return minuteTimeUnit;
    }

    public String getMonthsTimeUnit() {
        return monthsTimeUnit;
    }

    public String getMonthTimeUnit() {
        return monthTimeUnit;
    }

    public String getOneDayTimeUnit() {
        return oneDayTimeUnit;
    }

    public String getOneHourTimeUnit() {
        return oneHourTimeUnit;
    }

    public String getOneMinuteTimeUnit() {
        return oneMinuteTimeUnit;
    }

    public String getOneMonthTimeUnit() {
        return oneMonthTimeUnit;
    }

    public String getOneSecondTimeUnit() {
        return oneSecondTimeUnit;
    }

    public String getOneYearTimeUnit() {
        return oneYearTimeUnit;
    }

    public String getSecondsTimeUnit() {
        return secondsTimeUnit;
    }

    public String getSecondTimeUnit() {
        return secondTimeUnit;
    }

    public String getYearsTimeUnit() {
        return yearsTimeUnit;
    }

    public String getYearTimeUnit() {
        return yearTimeUnit;
    }
}