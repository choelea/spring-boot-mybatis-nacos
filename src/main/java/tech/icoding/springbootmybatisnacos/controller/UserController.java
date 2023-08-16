package tech.icoding.springbootmybatisnacos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.icoding.springbootmybatisnacos.mapper.UserMapper;
import tech.icoding.springbootmybatisnacos.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(userMapper.findAllUsers());
    }

    @PostMapping
    public ResponseEntity<?> create(User user){
        userMapper.insertUser(user);
        return  ResponseEntity.ok().build();
    }
}
