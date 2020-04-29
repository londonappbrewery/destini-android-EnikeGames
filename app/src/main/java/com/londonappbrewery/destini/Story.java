package com.londonappbrewery.destini;

public class Story {
    private int story;
    private int Answer1;
    private int Answer2;

    public Story (int story, int answer1, int answer2){
        this.story = story;
        this.Answer1 = answer1;
        this .Answer2 = answer2;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(int answer1) {
        Answer1 = answer1;
    }

    public int getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(int answer2) {
        Answer2 = answer2;
    }
}
