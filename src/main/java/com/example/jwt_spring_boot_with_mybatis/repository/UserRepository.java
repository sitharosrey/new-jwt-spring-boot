package com.example.jwt_spring_boot_with_mybatis.repository;

import com.example.jwt_spring_boot_with_mybatis.model.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository {
    @Select("SELECT user_role " +
            "FROM role_tb rt INNER JOIN user_role_tb ut ON rt.id = ut.role_id " +
            "WHERE ut.user_id = #{userId}")
    List<String> getUserRoleByUserId(int userId);

    @Select("SELECT * FROM user_tb WHERE user_email = #{email}")
    @Result(property = "userId", column = "user_id")
    @Result(property = "email", column = "user_email")
    @Result(property = "password", column = "user_password")
    @Result(property = "roles", column = "user_id", many = @Many(select = "getUserRoleByUserId"))
    User getUserByEmail(String email);
}
