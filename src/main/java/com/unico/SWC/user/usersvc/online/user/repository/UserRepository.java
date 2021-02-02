package com.unico.SWC.user.usersvc.online.user.repository;

import com.unico.SWC.user.usersvc.online.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * repository interface
 * JPARepository<엔티티,엔티티의 id 자료형>를 상속받아야 함
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    //query 문 작성하듯 넣으면 된다.
    List<UserEntity> findByUserNmAndUseYn(String userNm, boolean useYn);

}
