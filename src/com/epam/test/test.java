package com.epam.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;


/**
 * Created by subs on 02.10.16.
 * <p>
 * Необходимо добавить интерфейс и реализацию Exam с дженериками, вывести обработку файла в отдельный класс ,
 */
public class test {

    static void printCollection(ArrayList<Event> lst) {
        for (Event str : lst
                ) {
            str.printEvent();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("res = " + args[0]);
        File file = new File(args[0]);
        List lines = FileUtils.readLines(file, "UTF-8");
        System.out.println(lines);
        ArrayList<Event> eventsCollection = new ArrayList<Event>();
        int i = 1;
        Event event = new Event1(Double.parseDouble(String.valueOf(lines.get(i)).split(",")[0]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[1]));
        if (event.isPassed()) {
            eventsCollection.add(event);
        }
        i++;
        event = new Event2(Double.parseDouble(String.valueOf(lines.get(i)).split(",")[0]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[1]));
        if (event.isPassed()) {
            eventsCollection.add(event);
        }
        i++;
        event = new Event3(Double.parseDouble(String.valueOf(lines.get(i)).split(",")[0]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[1]), Boolean.parseBoolean(String.valueOf(lines.get(i)).split(",")[2]));
        if (event.isPassed()) {
            eventsCollection.add(event);
        }
        i++;
        event = new Event4(Double.parseDouble(String.valueOf(lines.get(i)).split(",")[0]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[1]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[2]));
        if (event.isPassed()) {
            eventsCollection.add(event);
        }
        i++;
        event = new Event5(Boolean.parseBoolean(String.valueOf(lines.get(i)).split(",")[0]), Boolean.parseBoolean(String.valueOf(lines.get(i)).split(",")[1]), Double.parseDouble(String.valueOf(lines.get(i)).split(",")[2]));
        if (event.isPassed()) {
            eventsCollection.add(event);
        }
        System.out.println("unsorted");
        printCollection(eventsCollection);
        System.out.println("sorted");
        Collections.sort(eventsCollection, Event.DescSortByMaxMark);
        printCollection(eventsCollection);
        List<Event> markAbove15 = new ArrayList<Event>();
        for (Event str : eventsCollection
                ) {
            if (str.getMaxOfExams() > 15)
                markAbove15.add(str);
        }
        System.out.println("minAbove15");
        Collections.min(markAbove15,Event.MinAbove15).printEvent();

    }
}