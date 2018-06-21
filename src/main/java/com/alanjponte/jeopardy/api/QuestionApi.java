package com.alanjponte.jeopardy.api;

import com.alanjponte.jeopardy.dto.QuestionDto;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


@RequestMapping("/v1")
public interface QuestionApi {
	@RequestMapping("/questions")
	public Set<QuestionDto> getQuestions();

}
