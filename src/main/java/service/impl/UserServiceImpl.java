package service.impl;

import dto.UserDTO;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(UserDTO userDTO) {

    }

    @Override
    public void update(UserDTO userDTO) {

    }

    @Override
    public void delete(String uid) {

    }

    @Override
    public List<UserDTO> listUsers() {
        return List.of();
    }

    @Override
    public UserDTO getUserDetails(String uid) {
        return null;
    }
}
