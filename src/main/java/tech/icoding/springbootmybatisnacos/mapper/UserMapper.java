package tech.icoding.springbootmybatisnacos.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tech.icoding.springbootmybatisnacos.model.User;

import java.util.List;

@Mapper
public interface UserMapper
{
    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
}