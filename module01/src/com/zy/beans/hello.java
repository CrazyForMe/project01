package com.zy.beans;

/**
 * @author zyAdmin
 * @describe
 * @date 2018/8/18
 */
public class hello {

    private String name;
    private int score;

    public hello(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
