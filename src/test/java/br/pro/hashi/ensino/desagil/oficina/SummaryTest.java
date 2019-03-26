package br.pro.hashi.ensino.desagil.oficina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class SummaryTest {
    private Summary build(double[] grades) {
        LinkedList<Student> students = new LinkedList<>();

        for (double grade : grades) {
            Student student = new Student();
            student.setGrade(grade);
            students.add(student);
        }

        return new Summary(students);
    }

    @Test
    public void example() {
        Assertions.assertTrue(true);
    }
}
