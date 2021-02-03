package com.unico.user.online.entity;


import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Entity 클래스
 * @Entity 어노테이션을 넣어야 한다.
 * @Table 어노테이션에 테이블명을 명시하지않으면 파일명을 테이블로 가정한다.
 * Entity 인스턴스는 변경이 일어나는 순간 쿼리를 생성해서 DB로 보내기때문에
 * Setter method를 사용할 수 없음. 따라서 빌더패턴을 이용해야 함.
 *
 */
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@AllArgsConstructor
@Entity
@Builder
@Getter
@Table( name = "TB_UNICO_USERS_M" )
public class UserEntity {
	@Id
	String userId;
	String userPwd;
	String userNm;
	@ColumnDefault(value = "true")
	boolean useYn;
	LocalDateTime createdAt;
	LocalDateTime updatedAt;

	public void updateUserPwd(String userPwd){
		if( userPwd != ""  && this.userPwd != userPwd){
			this.userPwd = userPwd;
			this.updatedAt = LocalDateTime.now();
		}
	}

	public void updateUserNm(String userNm){
		if( userNm != "" && this.userNm != userNm){
			this.userNm = userNm;
			this.updatedAt = LocalDateTime.now();
		}
	}

	public void updateUseYn(boolean useYn){
		if( this.useYn != useYn ){
			this.useYn = useYn;
			this.updatedAt = LocalDateTime.now();
		}
	}
}



