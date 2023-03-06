package com.sjh.spring_db_1.repository;

import com.sjh.spring_db_1.domain.Member;

public interface MemberRepository {
    Member save(Member member);

    Member findById(String memberId);

    void update(String memberId, int money);

    void delete(String memberId);
}
