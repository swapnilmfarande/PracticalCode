package com.app.Controller;

import com.app.Model.Student;
import com.app.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    StudentService service;

    @RequestMapping(value = "/student" ,method = RequestMethod.GET)

    public ModelAndView getAllStudent(){
        List<Student> studentList = service.getAllStudent();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("students",studentList);
        studentList.forEach(System.out::println);
        return modelAndView;
    }


}
