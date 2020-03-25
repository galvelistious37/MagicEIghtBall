package com.laptop.stuff;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AnswersTest {
    Answers subject;
    Map<Integer, String[]> shittyAnswers;
    Map<Integer, String[]> neutralAnswers;
    Map<Integer, String[]> goodAnswers;

    @Before
    public void setUp(){
        subject = new Answers();
        shittyAnswers = subject.populateShittyAnswers();
        neutralAnswers = subject.populateNeutralAnswers();
        goodAnswers = subject.populateGoodAnswers();
    }

    @After
    public void tearDown(){
        subject = null;
    }

    @Test
    public void shittyAnswersGreaterThanZero(){
        assertTrue("Shitty > 0", shittyAnswers.size() > 0);
    }

    @Test
    public void shittyAnswersContainsOne(){
        assertTrue("Shitty answers contains 1", shittyAnswers.containsKey(1));
    }

    @Test
    public void neutralAnswersGreaterThanZero(){
        assertTrue("Neutral > 0", neutralAnswers.size() > 0);
    }

    @Test
    public void neutralAnswersContainsKeyValueOne(){
        assertTrue("Neutral Contains Key(4)", neutralAnswers.containsKey(4));
    }

    @Test
    public void goodAnswersGreaterThanZero(){
        assertTrue("Good > 0", goodAnswers.size() > 0);
    }

    @Test
    public void goodAnswersContainsKeyValueOne(){
        assertTrue("Good Contains Key(4)", goodAnswers.containsKey(7));
    }

    @Test
    public void generateEightBallAnswersGetsAllAnswers(){
        Map<Integer, String[]> allAnswers = new HashMap<Integer, String[]>();
        allAnswers.putAll(shittyAnswers);
        allAnswers.putAll(neutralAnswers);
        allAnswers.putAll(goodAnswers);
        assertEquals("All answers = subject.getEightball", allAnswers.get(1), subject.getEightBallAnswers().get(1));
    }
}