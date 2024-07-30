package org.example;

import java.util.HashMap;

class Abbreviations {
    private HashMap<String, String> abbreviationsMap;

    public Abbreviations() {
        this.abbreviationsMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationsMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationsMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviationsMap.get(abbreviation);
    }
}

public class AbbreviationsMain {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
