package com.feignDemo1.Feign1;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {

    @PostMapping("/student/save")
    public Student save(Student student)
    {
        student.setFirstName("Anushka");
        student.setLastName("Kaur");
        return student;
    }
}
