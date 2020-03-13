package com.laptop.stuff;

import java.util.HashMap;
import java.util.Map;

public class Answers {
    private final Map<Integer, String[]> eightBallAnswers;

    public Answers() {
        this.eightBallAnswers = buildEightBallAnswers();
    }

    private Map<Integer, String[]> buildEightBallAnswers(){
        Map<Integer, String[]> createAnswers = new HashMap<Integer, String[]>();
        createAnswers.put(1, "Hell Nah".split(" "));
        createAnswers.put(2, "Nope, don't even plan on it".split(" "));
        createAnswers.put(3, "Yeah... and by yeah, I mean no".split(" "));
        createAnswers.put(4, "Eh... Maybe".split(" "));
        createAnswers.put(5, "Ask me when I'm not drunk".split(" "));
        createAnswers.put(6, "I don't know".split(" "));
        createAnswers.put(7, "Yup".split(" "));
        createAnswers.put(8, "Hell Yeeeeaaaaahhhhh".split(" "));
        createAnswers.put(9, "Yup yup yup".split(" "));
        return createAnswers;
    }

    public Map<Integer, String[]> getEightBallAnswers() {
        return eightBallAnswers;
    }
}
