package com.example.demo.StudentServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody Student student) {
        Student result = studentService.studentValidate(student);

        if(result == null)
        {
            return ResponseEntity.status(400).body("Invalid input");
        }
        return  ResponseEntity.status(201).body(result);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        if (updatedStudent == null) {
            return ResponseEntity.status(404).body("Student not found");
        }
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        boolean isDeleted = studentService.deleteStudent(id);
        if (!isDeleted) {
            return ResponseEntity.status(404).body("Student not found");
        }
        return ResponseEntity.ok("Student deleted successfully");
    }
}
