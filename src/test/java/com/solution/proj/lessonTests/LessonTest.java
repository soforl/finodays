package com.solution.proj.lessonTests;

import com.solution.proj.lesson.entity.Lesson;
import com.solution.proj.lesson.repository.JpaLessonRepository;
import com.solution.proj.lesson.service.LessonServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class LessonTest {

    private static Lesson createLesson(){
        Lesson lesson = new Lesson();
        lesson.setHeader("header");
        lesson.setText("text");
        lesson.setAuthor("author");
        lesson.setImagesUrl(Arrays.asList("image1", "image2"));
        lesson.setAttribute("attribute");
        return lesson;
    }

    @Mock
    private JpaLessonRepository jpaLessonRepository;

    @InjectMocks
    private LessonServiceImpl lessonService;

    @Test
    void testGetAll() {
        // Arrange
        Lesson lesson1 = createLesson();
        Lesson lesson2 = createLesson();
        List<Lesson> expectedLessons = Arrays.asList(lesson1, lesson2);

        when(jpaLessonRepository.findAll()).thenReturn(expectedLessons);

        // Act
        List<Lesson> result = lessonService.getAll();

        // Assert
        assertEquals(expectedLessons, result);
        verify(jpaLessonRepository, times(1)).findAll();
    }

    @Test
    void testFindById_ExistingLesson() {
        // Arrange
        UUID id = UUID.randomUUID();
        Lesson expectedLesson = createLesson();

        when(jpaLessonRepository.findById(id)).thenReturn(Optional.of(expectedLesson));

        // Act
        Lesson result = lessonService.findById(id);

        // Assert
        assertEquals(expectedLesson, result);
        verify(jpaLessonRepository, times(1)).findById(id);
    }

    @Test
    void testFindById_NonExistingLesson() {
        // Arrange
        UUID id = UUID.randomUUID();

        when(jpaLessonRepository.findById(id)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> lessonService.findById(id));
        verify(jpaLessonRepository, times(1)).findById(id);
    }
}
