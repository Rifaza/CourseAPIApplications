package com.example.demo.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.topic.Topic;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	

	
	public List<Course> getAllCourses( String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		
		return courses;
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	//not working
	public <Optional>Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}
//	public Course getCourse(String id) {
//		return courseRepository.findOne(id);
//	}
	public void updateCourse(Course course) {
		
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
	

}
