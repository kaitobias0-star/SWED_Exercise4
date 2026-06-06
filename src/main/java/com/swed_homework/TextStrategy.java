package com.swed_homework;


// Regex helper function "cleanHtmlWithRegex" created by Gemini 
// Prompt: Wie kann ich eine website den reinen content vergleichen, also dass alle html inhalte rausgefiltert werden? In java, also mit welchem regex


public class TextStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(Website w1, Website w2) {
        String w1Content = w1.getContent();
        String w2Content = w2.getContent();

        w1Content = cleanHtmlWithRegex(w1Content);
        w2Content = cleanHtmlWithRegex(w2Content);

        return w1Content.equals(w2Content);
    }
    

    private String cleanHtmlWithRegex(String html) {
        if (html == null) {
            return "";
        }

        String text = html.replaceAll("(?is)<(script|style)[^>]*>.*?</\\1>", "");

        text = text.replaceAll("<[^>]*>", "");

        text = text.replaceAll("\\s+", " ").trim();

        return text;
    }
}
