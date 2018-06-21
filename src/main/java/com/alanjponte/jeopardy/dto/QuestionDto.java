package com.alanjponte.jeopardy.dto;

/**
 * Represents a question in the Jeopardy game.
 */
public class QuestionDto {

	private String text;

	private int points;

	/**
	 * A new question.
	 *
	 * @param text - The text of the question.
	 *
	 */
	public QuestionDto(String text) {
		this.text = text;
		this.points = 0;
	}

	/**
	 * A new question.
	 *
	 * @param text - The text of the question.
	 * @param points - The number of points the question is worth.
	 *
	 */
	public QuestionDto(String text, int points) {
		this.points = points;
	}

}
