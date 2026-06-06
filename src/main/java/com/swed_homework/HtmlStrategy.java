package com.swed_homework;

public class HtmlStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(Website w1, Website w2) {
        String w1Content = w1.getContent();
        String w2Content = w2.getContent();
        return w1Content.equals(w2Content);
    }
}
