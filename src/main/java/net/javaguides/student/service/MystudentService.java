package net.javaguides.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.student.repository.StudentRepository;

import java.util.List;
//update id 
@Service
public class MystudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void updatedIds(){
        List<Long>ids= studentRepository.findAllIds();
        int size=ids.size();
        for(int i=0;i<size;i++){
            studentRepository.updateId(ids.get(i),Long.valueOf(i+1));
        }
    }
}
