package com.epam.test;

import java.util.Comparator;

/**
 * Created by subs on 02.10.16.
 */
public class Event3 extends Event {
    static final double passMark1 = 6.5;
    static final double passMark2 = 7.5;

    private double exam1 = 0;
    private double exam2 = 0;
    private boolean exam3 = false;

    public void setExam1(double exam1) {
        if (exam1 <= this.MAX_EXAM_MARK_1005) this.exam1 = exam1;
    }

    public void setExam2(double exam2) {
        if (exam2 <= this.MAX_EXAM_MARK_1005) this.exam2 = exam2;
    }

    public void setExam3(boolean exam3) {
        this.exam3 = exam3;
    }

    public double getExam1() {
        return exam1;
    }

    public double getExam2() {
        return exam2;
    }

    public boolean isExam3() {
        return exam3;
    }

    @Override
    public boolean isPassed() {
        if ((this.exam1 >= this.passMark1) && (this.exam2 >= this.passMark2) && this.exam3)
            return true;
        else return false;
    }

    public Event3(double exam1, double exam2, boolean exam3) {
        this.setExam1(exam1);
        this.setExam2(exam2);
        this.setExam3(exam3);
    }

    @Override
    public double getMaxOfExams() {
        if (this.getExam1() > this.getExam2())
            return this.getExam1();
        else return this.getExam2();
    }


}
