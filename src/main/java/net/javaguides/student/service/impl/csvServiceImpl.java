package net.javaguides.student.service.impl;

import java.io.PrintWriter;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.student.entity.Student;
import net.javaguides.student.service.csvStudent;
@Service
public class csvServiceImpl implements csvStudent{
    @Override
    public void downloadCSVFile(PrintWriter printWriter,List<Student> studenList){
        String csv="ID, FirstName, LastName, Email, Address, Score\n";
        printWriter.write(csv);
        for(Student student:studenList){
            printWriter.write(student.getId()+" , "
            +student.getFirstName()+" , "
            +student.getLastName()+" , "
            +student.getEmail()+" , "
            +student.getAddress()+" , "
            +student.getScore()+"\n");
        }
    }
}
