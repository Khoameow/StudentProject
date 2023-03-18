package net.javaguides.student.service;

import java.io.PrintWriter;

import java.util.List;
import net.javaguides.student.entity.Student;
public interface csvStudent {
    public void downloadCSVFile(PrintWriter printWriter,List<Student> studentsList);
}
