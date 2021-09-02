package com.alanjponte.jeopardy.store;


import com.alanjponte.jeopardy.dto.JeopardyRequestDto;

/**
 * Redis implementaion of {@link com.alanjponte.jeopardy.store.JeopardyStore}
 */
public class RedisJeopardyStore implements JeopardyStore {
	@Override
	public void put(String uuid, final JeopardyRequestDto request) throws  IllegalArgumentException {
		// Noop
	}

	public JeopardyRequestDto get(final String uuid) throws IllegalArgumentException {
		return null;
	}
//
//	TODO: private JedisPool jedisPool;
//	private String keyFormat;
//	private String redisKeyNamespace;
//	private  Double keyTTl;
//
//	@Override
//	public void put(final String uuid, final JeopardyRequestDto request) throws IllegalArgumentException {
//		try {
//
//		} finally {
//			returnConnection(jedis);
//		}
//	}
//
//	@Override
//	public JeopardyRequestDto get(final String uuid) throws IllegalArgumentException {
//		return null;
//	}
}
