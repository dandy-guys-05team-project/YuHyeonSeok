package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

// 사용자 엔티티에 대한 데이터베이스 접근을 위한 리포지토리 인터페이스
public interface UserRepository extends JpaRepository<SiteUser, Long> {
	// 사용자명으로 사용자 조회
	Optional<SiteUser> findByusername(String username);
}
