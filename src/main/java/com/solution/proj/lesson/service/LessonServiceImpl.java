package com.solution.proj.lesson.service;

import com.solution.proj.lesson.entity.Lesson;
import com.solution.proj.lesson.repository.JpaLessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LessonServiceImpl implements LessonService{

    private final JpaLessonRepository jpaLessonRepository;

    @Override
    public List<Lesson> getAll() {
        return jpaLessonRepository.findAll();
    }

    @Override
    public Lesson findById(UUID id) {
        return jpaLessonRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("lesson with id: " + id + "not found")
        );
    }
}
