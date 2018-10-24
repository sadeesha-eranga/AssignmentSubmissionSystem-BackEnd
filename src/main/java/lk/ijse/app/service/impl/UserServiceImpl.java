package lk.ijse.app.service.impl;

import lk.ijse.app.dto.UserDTO;
import lk.ijse.app.entity.User;
import lk.ijse.app.repository.UserRepository;
import lk.ijse.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:50 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean authenticateUser(UserDTO userDTO) {
        boolean exists = userRepository.existsById(userDTO.getUsername());

        if (!exists) {
            return false;
        }

        User user = userRepository.findById(userDTO.getUsername()).get();

        return user.getPassword().equals(userDTO.getPassword());
    }
}
