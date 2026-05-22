package com.bridgelabz.moodanalyzer;
public class MoodAnalyser {

    private String message;

    // Default Constructor
    public MoodAnalyser() {
    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // No parameter method
    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}