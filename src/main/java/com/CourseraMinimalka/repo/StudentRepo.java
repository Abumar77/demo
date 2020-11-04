package com.CourseraMinimalka.repo;

import com.CourseraMinimalka.Entity.student;
 import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<student, Long> {
}
