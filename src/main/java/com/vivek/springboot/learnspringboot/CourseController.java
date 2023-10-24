package com.vivek.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course(1, "course1", "vivek"),
				new Course(2, "course2", "virat"),
				new Course(3, "course3", "sonu")
		);
	}
}
