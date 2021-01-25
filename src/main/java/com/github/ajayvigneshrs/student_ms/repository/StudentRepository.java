package com.github.ajayvigneshrs.student_ms.repository;


import com.github.ajayvigneshrs.student_ms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findById(String id);

    @Query(value = "select * from students where lower(name)=lower(:name)", nativeQuery = true)
    public Student findByName(@Param("name") String name);

}