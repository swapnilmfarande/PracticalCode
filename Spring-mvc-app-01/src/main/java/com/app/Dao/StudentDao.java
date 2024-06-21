package com.app.Dao;

import com.app.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {
    JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudent(){
        String query = "select * from Registration.Persion";
        List<Student> students = jdbcTemplate.query(query,rs -> {
            List<Student> studentList = new ArrayList<>();
            while (rs.next()){
                Student student = Student.builder()
                        .StudentId(rs.getInt("id"))
                        .StudentName(rs.getNString("name"))
                        .StudentCity(rs.getNString("city"))
                        .StudentPhone(rs.getInt("phone"))
                        .build();
                studentList.add(student);
            }
            return studentList;
        });
        return students;
    }
}
