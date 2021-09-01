package com.bridgelabz;

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if(message.contains("SAD"))
        return "SAD";
        else
            return "Happy";
    }
}
