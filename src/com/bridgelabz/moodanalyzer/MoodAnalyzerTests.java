package com.bridgelabz.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoodAnalyzerTests {

	@Test
    void givenSadMessage_ShouldReturnSAD() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD", result);
    }

    @Test
    void givenAnyMessage_ShouldReturnHAPPY() {
        MoodAnalyser analyser = new MoodAnalyser();
        String result = analyser.analyseMood("I am in Any Mood");
        assertEquals("HAPPY", result);
    }
}