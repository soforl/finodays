package com.solution.proj.lesson.controller;

import com.solution.proj.lesson.dto.LessonDto;
import com.solution.proj.lesson.dto.LessonsDto;
import com.solution.proj.lesson.entity.Lesson;
import com.solution.proj.lesson.service.LessonService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/lesson")
@RestController
@Validated
public class LessonController {
    private final LessonService lessonService;

    @GetMapping(path = "/getAllLessons")
    public ResponseEntity<List<LessonsDto>> getAllLessons(){
        List<LessonsDto> lessonsDto = lessonService.getAll()
                .stream()
                .map(LessonsDto::new)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(lessonsDto);
    }

    @GetMapping(path = "/getLessonsById")
    public ResponseEntity<LessonDto> getLessonsById(@RequestParam UUID lessonId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(new LessonDto(lessonService.findById(lessonId)));
        }
        catch (Exception ex){
            return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
