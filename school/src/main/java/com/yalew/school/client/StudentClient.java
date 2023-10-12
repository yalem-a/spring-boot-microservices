package com.yalew.school.client;


import com.yalew.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@EnableFeignClients
@FeignClient(name = "studentClient", url = "${application.config.students-url}") // helps making api calls to another microservice
public interface StudentClient {

    @GetMapping("/school/{school-id}")
    List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
