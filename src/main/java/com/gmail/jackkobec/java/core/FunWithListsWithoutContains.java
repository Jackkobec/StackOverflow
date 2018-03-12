package com.gmail.jackkobec.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Jack <e.kobets>
 */
public class FunWithListsWithoutContains {

    public static void main(String[] args) {
        List<Student> studentBaseList = Arrays.asList(
                new Student("Kent", 22, null),
                new Student("Jack", 25, null),
                new Student("Rick", 27, null)
        );

        List<Student> studentList = new ArrayList<>(studentBaseList);
        String NAME_FOR_SEARCH  = "Jack";

        // Remove student with name Jack from studentList
        studentList.removeIf( student -> NAME_FOR_SEARCH.equals(student.getName()));
        System.out.println(studentList);

        List<Student> studentList2 = new ArrayList<>(studentBaseList);
        // Check if student with name Jack present in the list
        boolean isPresentStudentWithNameJack
                = studentList2.stream().anyMatch(student -> NAME_FOR_SEARCH.equals(student.getName()));
        System.out.println(isPresentStudentWithNameJack);

        List<Student> studentList3 = new ArrayList<>(studentBaseList);
        // Filter students with name Jack and create new list with students with name Jack.
        List<Student> onlyJackStudents = studentList3.stream()
                .filter(student -> NAME_FOR_SEARCH.equals(student.getName())).collect(Collectors.toList());
        System.out.println(onlyJackStudents);
    }
}
