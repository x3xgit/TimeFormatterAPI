import technologycommunity.net.TimeFormatter;
import technologycommunity.net.structures.Locale;

public class Test {
    public static void main(String[] args) {
        System.out.println(TimeFormatter.convert(Locale.RUSSIAN, 1000003264).getFastOutput());
    }
}
