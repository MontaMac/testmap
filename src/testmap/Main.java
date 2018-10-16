package testmap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Map<String, String> translations
                = new TreeMap<>(Comparator.reverseOrder());

	    translations.put("one", "odin");
        translations.put("two", "dva");
        translations.put("home", "dom");
        translations.put("mouse", "mish");

        System.out.println(
                translations.containsKey("home"));

        System.out.println(
                translations.size());

        System.out.println(translations.get("home"));

        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s \n", k, translations.get(k));
        }
    }
}
