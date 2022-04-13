package com.gdm.coursesv2.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/coursesv2/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService){

        this.teacherService = teacherService;
    }

    @PostMapping
    public Teacher saveOrUpdate(@RequestBody Teacher teacher){

        return teacherService.saveOrUpdate(teacher);
    }

    @PutMapping
    public Teacher update(@RequestBody Teacher teacher){

        return teacherService.saveOrUpdate(teacher);
    }

    @GetMapping
    public List<Teacher> findAll(){

        return teacherService.findAll();
    }

    @DeleteMapping
    public void delete(@RequestBody Teacher teacher){

        teacherService.delete(teacher);
    }
}
