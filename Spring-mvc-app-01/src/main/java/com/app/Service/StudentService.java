package com.app.Service;

import com.app.Dao.StudentDao;
import com.app.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentDao studentDao;

    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }
}
