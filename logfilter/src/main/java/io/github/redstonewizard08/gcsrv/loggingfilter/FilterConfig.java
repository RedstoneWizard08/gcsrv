package io.github.redstonewizard08.gcsrv.loggingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterConfig {
    public static List<String> filterBlacklist = new ArrayList<>();

    static {
        filterBlacklist.add("Invalid Conversion");
        filterBlacklist.add("Potentially Dangerous alternative prefix");
        filterBlacklist.add("Unknown ingredient");
    }
}
