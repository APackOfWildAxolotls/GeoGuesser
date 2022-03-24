package com.jcallinan.GeoGuesser;

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResid, boolean AnswerTrue){
        mTextResID = textResid;
        mAnswerTrue = AnswerTrue;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean AnswerTrue) {
        mAnswerTrue = AnswerTrue;
    }
}
