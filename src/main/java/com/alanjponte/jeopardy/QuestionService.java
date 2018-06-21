package com.alanjponte.jeopardy;

import com.alanjponte.jeopardy.api.QuestionApi;
import com.alanjponte.jeopardy.dto.QuestionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Service responsible for CRUD operations on question objects.
 */
@Service("questionService")
public class QuestionService {

	@Autowired
	private final QuestionApi questionApi;

	public QuestionService(QuestionApi questionApi) {
		this.questionApi = questionApi;
	}

	public Set<QuestionDto> getQuestions() {
		return questionApi.getQuestions();
	}
}
