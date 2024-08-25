package controller;

import dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @PostMapping("createUser")
    public void createUser(UserDTO userDTO) {

    }

    @GetMapping("listUser")
    public List<UserDTO> listUser(UserDTO userDTO) {
        return null;
    }

    @GetMapping("getUserDetails")
    public UserDTO getUserDetails(UserDTO userDTO) {
        return null;
    }

    @PatchMapping("updateUser")
    public void updateUser(UserDTO userDTO) {

    }

    @PatchMapping("deleteUser")
    public void deleteUser(UserDTO userDTO) {

    }


}
