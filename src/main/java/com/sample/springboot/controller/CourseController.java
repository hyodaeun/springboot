package com.sample.springboot.controller;

import com.sample.springboot.domain.Course;
import com.sample.springboot.domain.Hello;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @RequestMapping(value = "getCourse")
    @GetMapping() // @RequestMapping(value = "course", method = RequestMethod.GET)과 동일
    public Course getCourseFirst() {
        return new Course("컴퓨터공학기초", "남춘성", "getLink", "getId");
    }
    @RequestMapping(value = "postCourse")
    @PostMapping()
    public Course getCourseSecond() {
        return new Course("컴퓨터공학기초", "남춘성", "postLink", "postId");
    }
}
