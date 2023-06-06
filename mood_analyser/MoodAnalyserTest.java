package com.bridgelabz.mood_analyser;
import com.bridgelabz.mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood(){
        MoodAnalyser obj = new MoodAnalyser("I am in sad mood");
        String res = obj.analyseMood();
        Assert.assertEquals("SAD", res);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood(){
        MoodAnalyser obj = new MoodAnalyser("I am in happy Mood");
        String res = obj.analyseMood();
        Assert.assertEquals("HAPPY", res);
    }

    @Test
    public void givenMessage_whenNull_shouldReturnHappy(){
        MoodAnalyser obj = new MoodAnalyser("NULL");
        String res = obj.analyseMood();
        Assert.assertEquals("HAPPY", res);
    }
}
