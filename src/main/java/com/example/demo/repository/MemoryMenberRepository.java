package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.demo.domain.Member;

public class MemoryMenberRepository implements MemberRepository{

	
	private static Map<Long, Member> store = new HashMap<>();
	private static long sequence = 0L;
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long idLong) {
		return Optional.ofNullable(store.get(idLong));
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream()
			.filter(member->member.getName().equals(name))
			.findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}

	
}
