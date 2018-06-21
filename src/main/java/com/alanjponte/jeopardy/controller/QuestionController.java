package com.alanjponte.jeopardy.controller;

import com.alanjponte.jeopardy.api.QuestionApi;
import com.alanjponte.jeopardy.dto.QuestionDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;


@RequestMapping("/v1")
@Controller("questionController")
public class QuestionController implements QuestionApi {

	public QuestionController() {

	}

	@Override
	@RequestMapping("/questions")
	public Set<QuestionDto> getQuestions() {
		QuestionDto question = new QuestionDto("what would a woodchuck do?");
		Set<QuestionDto> questionSet = new HashSet<>();
		questionSet.add(question);

		return questionSet;
	}

}
