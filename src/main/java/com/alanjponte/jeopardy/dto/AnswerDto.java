package com.alanjponte.jeopardy.dto;

/**
 * Represents an AnswerDto in the Jeopardy game.
 */
public class AnswerDto {

	private String text;

	private int points;

	private QuestionDto question;

	/**
	 *  A new Jeopardy answer, with the number
	 *  of points awarded if correct.
	 *
	 * @param text - The text of the answer.
	 * @param points - The number of points awarded
	 *                 if a correct question to this
	 *                 answer is found.
	 */
	public AnswerDto(String text, int points) {
		this.text = text;
		this.points = points;
	}

	/**
	 * Returns the text of this answer.
	 *
	 * @return  The text of this answer.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Returns the number of points given for the correct question
	 * to this answer.
	 *
	 * @return The number of points given for a correct answer.
	 */
	public int getPoints( ) {
		return this.points;
	}
}
