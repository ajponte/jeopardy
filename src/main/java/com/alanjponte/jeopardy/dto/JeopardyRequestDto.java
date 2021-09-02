package com.alanjponte.jeopardy.dto;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents a request in the jeopardy game.
 */
public class JeopardyRequestDto {

	private Map<AnswerDto, QuestionDto> requestMap;

	public JeopardyRequestDto() {
		requestMap = new HashMap<AnswerDto, QuestionDto>();
	}

	public JeopardyRequestDto(AnswerDto answer, QuestionDto question) {
		requestMap = new HashMap<>();
		requestMap.put(answer, question);
	}

	/**
	 * Adds a new answer/question combo to the internal map.
	 *
	 * @param answer - The answer (key) to add.
	 * @param question - The question (value) to add.
	 */
	public void add(AnswerDto answer, QuestionDto question) {
		requestMap.put(answer, question);
	}
}
