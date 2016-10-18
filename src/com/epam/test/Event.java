package com.epam.test;

import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by subs on 02.10.16.
 */
public abstract class Event {
    final double MAX_EXAM_MARK_100 = 100;
    final double MAX_EXAM_MARK_10 = 10;
    final double MAX_EXAM_MARK_1005 = 10;
    final double MAX_EXAM_MARK_2005 = 20;

    public boolean isPassed() {
        return false;
    }

    public double getMaxOfExams() {
        return 0;
    }


    double getExam1() {
        return 0;
    }

    double getExam2() {
        return 0;
    }

    double getExam3() {
        return 0;
    }

    void printEvent(){
        System.out.print(this.getClass().getName() + ":");
        System.out.print(this.getExam1() + ",");
        System.out.print(this.getExam2() + ",");
        System.out.println(this.getExam3() + ",");
    }

    static Comparator<Event> DescSortByMaxMark = new Comparator<Event>() {

        public int compare(Event s1, Event s2) {

            return Double.compare(s2.getMaxOfExams(), s1.getMaxOfExams());


        }
    };
    static Comparator<Event> MinAbove15 = new Comparator<Event>() {

        public int compare(Event s1, Event s2) {

            return Double.compare(s1.getMaxOfExams(), s2.getMaxOfExams());


        }
    };


}

