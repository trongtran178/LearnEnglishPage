package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAO.LessonDAO;
import com.example.model.Lesson;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@RestController
@JsonAutoDetect(getterVisibility = Visibility.NONE)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainRestController {

	@Autowired
	private LessonDAO lessonDAO;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/lessons", //
			method = RequestMethod.GET, //
			produces = { "application/json" })
	@ResponseBody
	public List<Lesson> getLessons() {
		List<Lesson> list = lessonDAO.getLessons();
		return list;
	}

}
