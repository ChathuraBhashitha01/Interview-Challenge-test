package lk.ijse.gdse.interviewchallengetest.controller;

import lk.ijse.gdse.interviewchallengetest.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lk.ijse.gdse.interviewchallengetest.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public void createUser(UserDTO userDTO) {
        userService.save(userDTO);
    }

    @GetMapping("listUser")
    public List<UserDTO> listUser(UserDTO userDTO) {
        return userService.listUsers();
    }

    @GetMapping("getUserDetails")
    public UserDTO getUserDetails(String uid) {
        return userService.getUserDetails(uid);
    }

    @PatchMapping("updateUser")
    public void updateUser(UserDTO userDTO) {
        userService.update(userDTO);
    }

    @PatchMapping("deleteUser")
    public void deleteUser(String uid) {
        userService.delete(uid);
    }


}
