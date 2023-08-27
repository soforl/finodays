package com.solution.proj.lesson.repository;

import com.solution.proj.lesson.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaLessonRepository extends JpaRepository<Lesson, UUID> {
}
