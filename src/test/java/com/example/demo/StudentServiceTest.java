package com.example.demo;

import com.example.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.example.demo.StudentServer.Entiity.Student;
import com.example.demo.StudentServer.Service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;
    @Test
    void getStudentByIdTest() {
        CreateStudentRequestDTO dto = new CreateStudentRequestDTO();
        dto.setName("Ashish");
        dto.setAge(21);
        dto.setDepartment("CSE");
        var response = studentService.studentValidate(dto);
        Student student = studentService.getStudentById(response.getId());
        Assertions.assertNotNull(student);
        Assertions.assertEquals("Ashish", student.getName());
        Assertions.assertEquals(22, student.getAge());
        Assertions.assertEquals("CSE", student.getDepartment());
    }
}
