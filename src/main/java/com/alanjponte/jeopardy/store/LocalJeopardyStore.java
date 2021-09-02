package com.alanjponte.jeopardy.store;

import com.alanjponte.jeopardy.dto.JeopardyRequestDto;
import org.springframework.beans.factory.annotation.Required;

/**
 * "local" implemenation of the {@link com.alanjponte.jeopardy.store.JeopardyStore}
 * Using a HashMap.
 */
public class LocalJeopardyStore implements JeopardyStore {

	HashStore hashStore;

	@Override
	public void put(String uuid, JeopardyRequestDto request) throws IllegalArgumentException {
		if (uuid == null || request == null) {
			throw new IllegalArgumentException("uuid and request cannot be null");
		}

		hashStore.put(uuid, request);
	}

	public JeopardyRequestDto get(String uuid) throws IllegalArgumentException {
		if (uuid == null) {
			throw new IllegalArgumentException("uuid cannot be null");
		}

		return hashStore.get(uuid);
	}

	@Required
	public void setLocalStore(HashStore hashStore) {
		this.hashStore = hashStore;
	}
}
