package com.epam.test;

import java.util.Comparator;

/**
 * Created by subs on 02.10.16.
 */
public class Event4 extends Event {
    static final double passMarkSum = 26.5;


    private double exam1 = 0;
    private double exam2 = 0;
    private double exam3 = 0;

    public void setExam1(double exam1) {
        if (exam1 <= this.MAX_EXAM_MARK_10) this.exam1 = exam1;
    }

    public void setExam2(double exam2) {
        if (exam2 <= this.MAX_EXAM_MARK_10) this.exam2 = exam2;
    }

    public void setExam3(double exam3) {
        if (exam3 <= this.MAX_EXAM_MARK_2005) this.exam3 = exam3;
    }

    public double getExam1() {
        return exam1;
    }

    public double getExam2() {
        return exam2;
    }

    public double getExam3() {
        return exam3;
    }

    @Override
    public boolean isPassed() {
        if (((double) this.exam1 + (double) this.exam2 + this.exam3) >= this.passMarkSum)
            return true;
        else return false;
    }

    public Event4(double exam1, double exam2, double exam3) {
        this.setExam1(exam1);
        this.setExam2(exam2);
        this.setExam3(exam3);
    }

    @Override
    public double getMaxOfExams() {
        if (this.getExam1() > this.getExam2() & this.getExam1() > this.getExam3())
            return this.getExam1();
        else if (this.getExam2()>this.getExam3()) return this.getExam2();
        else return this.getExam3();
    }




}
