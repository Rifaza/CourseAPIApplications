package com.example.demo.Course;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@RestController
public class CourseController {
@Autowired
private CourseService corseService;
	
@RequestMapping("/topics/{id}/courses")
public List<Course> getAllCourses(@PathVariable String id) {
	return   corseService.getAllCourses(id);
}
@RequestMapping("/courses/{topicId}/courses/{id}")
public Course getCourse(@PathVariable String id) {
	return  corseService.getCourse(id);
	
}

@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
public void addCourse(@RequestBody Course course, @PathVariable String topicId)

{
	course.setTopic(new Topic(topicId,"",""));
	 corseService.addCourse(course);
	
}

@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id)
{
	course.setTopic(new Topic(topicId,"",""));
	
	 corseService.updateCourse(course);
	
}

@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
public void deleteTopic(@PathVariable String id)
{
	 corseService.deleteCourse(id);
	
}

}
