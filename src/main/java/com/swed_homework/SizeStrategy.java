package com.swed_homework;

public class SizeStrategy implements ComparisonStrategy {
    @Override
    public boolean compare(Website w1, Website w2) {
        int w1Size = w1.getContentSize();
        int w2Size = w2.getContentSize();
        return w1Size == w2Size;
    }
    
}
