package com.bridgelabz.mood_analyser;
import com.bridgelabz.mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood(){
        MoodAnalyser obj = new MoodAnalyser();
        String res = obj.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", res);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood(){
        MoodAnalyser obj = new MoodAnalyser();
        String res = obj.analyseMood("I am in happy Mood");
        Assert.assertEquals("HAPPY", res);
    }
}
