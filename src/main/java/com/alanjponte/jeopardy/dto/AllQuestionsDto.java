package com.alanjponte.jeopardy.dto;

import java.util.List;

public class AllQuestionsDto {
	private List<QuestionDto> questionList;

	public void setQuestionList(List<QuestionDto> questionList) {
		this.questionList = questionList;
	}

	public List<QuestionDto> getQuestionList() {
		return this.questionList;
	}
}
