package com.gdm.coursesv2.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository){

        this.teacherRepository = teacherRepository;
    }

    /*
        CRUD
     */

    // create or update and return the entity
    public Teacher saveOrUpdate(Teacher teacher){

        return teacherRepository.save(teacher);
    }

    // read
    public List<Teacher> findAll(){

        return (List<Teacher>) teacherRepository.findAll();
    }

    // delete
    public void delete(Teacher teacher){

        teacherRepository.delete(teacher);
    }
}
