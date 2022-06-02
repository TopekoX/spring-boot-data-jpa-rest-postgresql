package com.topekox.example.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /**
     * @param email
     * @return -> SELECT * FROM student WHERE email = ?
     * atau bisa juga pakai annotation @Query("SELECT s FROM Student s WHERE s.email = ?1")
     */
    Optional<Student> findStudentByEmail(String email);

}
