package com.bridgelabz.mood_analyser;

public class MoodAnalyser {
    String message;

    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
