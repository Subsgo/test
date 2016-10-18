package com.epam.test;

import java.util.Comparator;

/**
 * Created by subs on 02.10.16.
 */
public class Event5 extends Event {
    static final int passMarkSum = 75;

    private boolean exam1 = false;
    private boolean exam2 = false;
    private double exam3 = 0;

    public void setExam1(boolean exam1) {
        this.exam1 = exam1;
    }

    public void setExam2(boolean exam2) {
        this.exam2 = exam2;
    }

    public void setExam3(double exam3) {
        if (exam3 <= this.MAX_EXAM_MARK_100) this.exam3 = exam3;
    }

    public boolean isExam1() {
        return exam1;
    }

    public boolean isExam2() {
        return exam2;
    }

    public double getExam3() {
        return exam3;
    }
    @Override
    public boolean isPassed() {
        if (this.exam1 && this.exam2 && (this.exam3 >= this.passMarkSum))
            return true;
        else return false;
    }

    public Event5(boolean exam1, boolean exam2, double exam3) {
        this.setExam1(exam1);
        this.setExam2(exam2);
        this.setExam3(exam3);
    }
    @Override
    public double getMaxOfExams() {
            return this.getExam3();
    }

}
