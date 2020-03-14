package com.example.demo.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository  extends CrudRepository<Course, String>{

	/* For one topic there may be many courses*/
	/* unformal way
	 * public List<Course> getCoursesByTopics(String topics);
	 */
	public List<Course> findByTopicId(String topicId);
//	public <Optional>Course findById(String Id);

}
