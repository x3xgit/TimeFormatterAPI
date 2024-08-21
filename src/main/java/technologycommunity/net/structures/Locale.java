package technologycommunity.net.structures;

public enum Locale {
    RUSSIAN(
            new TimeLocale(
                    "а",
                    "год",
                    "месяц",
                    "день",
                    "час",
                    "минут",
                    "секунд",

                    "год",
                    "месяцев",
                    "дней",
                    "часов",
                    "минут",
                    "секунд",

                    "лет",
                    "месяца",
                    "дня",
                    "часа",
                    "минуты",
                    "секунды"
            )
    ),
    ENGLISH(
            new TimeLocale(
                    "",
                    "year",
                    "month",
                    "day",
                    "hour",
                    "minute",
                    "second",

                    "years",
                    "months",
                    "days",
                    "hours",
                    "minutes",
                    "seconds",

                    "years",
                    "months",
                    "days",
                    "hours",
                    "minutes",
                    "seconds"
            )
    );

    private final TimeLocale timeLocale;

    Locale(TimeLocale timeLocale) {
        this.timeLocale = timeLocale;
    }

    public TimeLocale getTimeLocale() {
        return timeLocale;
    }
}
