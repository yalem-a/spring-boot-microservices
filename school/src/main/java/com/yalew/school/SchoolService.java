package com.yalew.school;

import com.yalew.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;

    @Autowired
    private StudentClient studentClient;

    public void saveSchool(School school){
        repository.save(school);
    }

    public List<School> findAllSchools(){
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId).orElse(
                School.builder()
                        .name("NOT FOUND")
                        .email("NOT FOUND")
                        .build()
        );

        var students = studentClient.findAllStudentsBySchool(schoolId); //find all the students from the students microservice

        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
