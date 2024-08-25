package lk.ijse.gdse.interviewchallengetest.controller;

import lk.ijse.gdse.interviewchallengetest.dto.UserDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lk.ijse.gdse.interviewchallengetest.service.UserService;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    public static final MediaType JSON = MediaType.get("application/json");
    OkHttpClient client = new OkHttpClient();

    @Autowired
    private UserService userService;

    //trying okHttp
    @PostMapping("createUser")
    public void createUser(UserDTO userDTO) {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url("POST /api/users")
                .post((okhttp3.RequestBody) body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            userService.save(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

    @DeleteMapping("deleteUser")
    public void deleteUser(String uid) {
        userService.delete(uid);
    }




}
