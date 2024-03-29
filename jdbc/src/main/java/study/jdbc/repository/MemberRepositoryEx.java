package study.jdbc.repository;

import study.jdbc.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;
    Member findById(String memberId) throws SQLException;
    void update(String memberId) throws SQLException;
    void delete(String memberId) throws SQLException;
}
