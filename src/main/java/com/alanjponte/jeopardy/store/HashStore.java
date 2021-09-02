package com.alanjponte.jeopardy.store;


import java.util.Map;
import java.util.HashMap;

import com.alanjponte.jeopardy.dto.JeopardyRequestDto;
import org.springframework.stereotype.Repository;

@Repository
public class HashStore implements JeopardyStore {

	private Map<String, JeopardyRequestDto> map = new HashMap<String, JeopardyRequestDto>();

	public Map getMap() {
		return map;
	}

	@Override
	public void put(String key, JeopardyRequestDto val) {
		map.put(key, val);
	}

	public JeopardyRequestDto get(String key) {
		return map.get(key);
	}
}
