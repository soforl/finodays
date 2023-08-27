package com.solution.proj.lesson.dto;

import com.solution.proj.lesson.entity.Lesson;
import lombok.Data;


import java.util.UUID;

@Data
public class LessonDto
 {
         private UUID id;
         private String header;
         private Lesson lesson;

         public LessonDto(Lesson lessonEntity) {
                 this.id = lessonEntity.getId();
                 this.header = lessonEntity.getHeader();
                 this.lesson = lessonEntity;
         }
 }
