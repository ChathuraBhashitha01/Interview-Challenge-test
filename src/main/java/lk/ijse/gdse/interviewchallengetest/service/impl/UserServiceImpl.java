package lk.ijse.gdse.interviewchallengetest.service.impl;

import lk.ijse.gdse.interviewchallengetest.dto.UserDTO;
import lk.ijse.gdse.interviewchallengetest.entity.User;
import lk.ijse.gdse.interviewchallengetest.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lk.ijse.gdse.interviewchallengetest.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void save(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public void update(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public void delete(String uid) {
        userRepository.delete(uid);

    }

    @Override
    public List<UserDTO> listUsers() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user,UserDTO.class)).toList();
    }

    @Override
    public UserDTO getUserDetails(String uid) {
        return modelMapper.map(userRepository.findById(uid).get(),UserDTO.class);
    }
}
