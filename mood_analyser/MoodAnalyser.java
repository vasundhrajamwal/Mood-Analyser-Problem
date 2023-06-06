package com.bridgelabz.mood_analyser;
public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(){

        if(this.message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
