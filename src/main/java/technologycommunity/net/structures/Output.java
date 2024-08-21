package technologycommunity.net.structures;

import java.util.Arrays;
import java.util.Iterator;

public class Output {
    private String fastOutput = "";
    private final String[] output;

    public Output(String[] output) {
        this.output = output;
        remake(", ");
    }

    public Output remake(String splitter) {
        StringBuilder text = new StringBuilder();
        Iterator<String> iterator = Arrays.stream(output).iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!isNumeric(next))
                if (iterator.hasNext())
                    text.append(next).append(splitter);
                else text.append(next);
            else text.append(next).append(" ");
        }

        fastOutput = text.toString();
        return this;
    }

    public String getFastOutput() {
        return fastOutput;
    }

    public String[] getOutput() {
        return output;
    }

    private boolean isNumeric(String args) {
        try {
            Integer.parseInt(args);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
