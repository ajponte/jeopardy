package com.alanjponte.jeopardy.service;

import com.alanjponte.jeopardy.dto.QuestionDto;
import com.alanjponte.jeopardy.store.HashStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

	private HashStore hashStore;

	@Autowired
	public QuestionService(final HashStore hashStore) {
		this.hashStore = hashStore;
	}

	public List<QuestionDto> getQuestions() {
		return new ArrayList<QuestionDto>();
	}
}
