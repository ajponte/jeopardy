package com.alanjponte.jeopardy.store;

import com.alanjponte.jeopardy.dto.JeopardyRequestDto;

/**
 * Interface for storage.  This interface can
 * be used for any other storage solution (e.g. MongoDB, MySql, etc).
 */
public interface JeopardyStore {

	/**
	 * Adds a new JeopardyRequestDto record to the store.
	 *
	 * @param uuid - Unique id to track the request.
	 * @param request - The request to store.
	 */
	public void put(String uuid, JeopardyRequestDto request) throws IllegalArgumentException;

	/**
	 * Fetchs a current request from the store by uuid.
	 *
	 * @param uuid - Unique id to track the request.
	 */
	public JeopardyRequestDto get(String uuid) throws IllegalArgumentException;


}
