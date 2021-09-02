package com.alanjponte.jeopardy;

import com.alanjponte.jeopardy.dto.AnswerDto;
import com.alanjponte.jeopardy.dto.QuestionDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JeopardyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Before
	public void setUp() throws Exception {
		makeTestData();
	}

	private void makeTestData() {

		AnswerDto answer1 = new AnswerDto("A data strutcture which contains a pointer" +
				                    " to the next element of the stucture", 2);
		QuestionDto question1 = new QuestionDto("What is a Linked List");

	}

}
