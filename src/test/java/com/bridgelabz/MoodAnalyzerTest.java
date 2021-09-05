package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood("This is a sad message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = null;
        try {
            mood = moodAnalyzer.analyzeMood("This is Happy Message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            String mood = moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenWrongClass_ThenthrowException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyzer.analyzeMood(null);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        }
    }

