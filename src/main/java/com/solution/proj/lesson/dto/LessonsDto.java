package com.solution.proj.lesson.dto;

import com.solution.proj.lesson.entity.Lesson;
import lombok.Data;

import java.util.UUID;

@Data
public class LessonsDto
{
        private String name;
        private UUID id;

        public LessonsDto(Lesson lesson) {
                this.name = lesson.getHeader();
                this.id = lesson.getId();
        }
}
