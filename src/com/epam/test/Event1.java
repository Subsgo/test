package com.epam.test;

import java.util.Comparator;

/**
 * Created by subs on 02.10.16.
 */
public class Event1 extends Event {
    static final int passMarkSum = 12;


    private double exam1 = 0;
    private double exam2 = 0;



    public void setExam1(double exam1) {
        if (exam1 <= this.MAX_EXAM_MARK_10) this.exam1 = exam1;
    }

    public void setExam2(double exam2) {
        if (exam2 <= this.MAX_EXAM_MARK_10) this.exam2 = exam2;
    }

    public double getExam1() {
        return exam1;
    }

    public double getExam2() {
        return exam2;
    }

    @Override
    public boolean isPassed() {
        if ((this.exam1 + this.exam2) >= this.passMarkSum)
            return true;
        else return false;
    }

    public Event1(double exam1, double exam2) {
        this.setExam1(exam1);
        this.setExam2(exam2);
    }

    @Override
    public double getMaxOfExams() {
        if (this.getExam1() > this.getExam2())
            return this.getExam1();
        else return this.getExam2();
    }


}
