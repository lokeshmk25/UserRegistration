package com.bridgelabz;

public enum ExpectedException {
    MoodAnalysisException;

    public static ExpectedException none() {
        return MoodAnalysisException;
    }

    public void expect(Class<MoodAnalysisException> moodAnalysisExceptionClass) {
    }
}
