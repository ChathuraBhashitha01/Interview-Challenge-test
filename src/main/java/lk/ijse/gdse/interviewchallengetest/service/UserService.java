package lk.ijse.gdse.interviewchallengetest.service;

import lk.ijse.gdse.interviewchallengetest.dto.UserDTO;

import java.util.List;

public interface UserService {
     void save(UserDTO userDTO);
     void update(UserDTO userDTO);
     void delete(String uid);
     List<UserDTO> listUsers();
     UserDTO getUserDetails(String uid);
}
