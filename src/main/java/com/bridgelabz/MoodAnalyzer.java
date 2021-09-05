package com.bridgelabz;

public class MoodAnalyzer {
        private String message;

        public MoodAnalyzer(String message){
            this.message=message;
        }


    public void analyzeMethod(String message ){
            this.message=message;
        }


    public String analyzeMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        } catch (Exception e) {
            throw new MoodAnalysisException("please enter proper message");
        }
    }
}
