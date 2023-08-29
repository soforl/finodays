package com.solution.proj.lesson.service;

import com.solution.proj.lesson.entity.Lesson;

import java.util.List;
import java.util.UUID;

public interface LessonService {
    List<Lesson> getAll();
    Lesson findById(UUID id);
}
