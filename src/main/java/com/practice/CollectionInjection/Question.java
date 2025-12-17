package com.practice.CollectionInjection;

import java.util.List;
import java.util.Set;

public class Question {
    private int qid;
    private Set<String> answers;

    public Question() {
    }


    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public Question(Set<String> answers, int qid) {
        this.answers = answers;
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Question{" +
                "answers=" + answers +
                ", qid=" + qid +
                '}';
    }

    public Set<String> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }
}
