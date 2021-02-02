package com.unico.SWC.user.usersvc.online.user.repository;

import com.unico.SWC.user.usersvc.EntityMapper;
import com.unico.SWC.user.usersvc.online.user.dto.UserDTO;
import com.unico.SWC.user.usersvc.online.user.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserEntity,UserDTO> {


}
