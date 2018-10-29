package lk.ijse.app.service.impl;

import lk.ijse.app.dto.UserDTO;
import lk.ijse.app.entity.Admin;
import lk.ijse.app.repository.AdminRepository;
import lk.ijse.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:50 PM
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public boolean authenticateUser(UserDTO userDTO) {
        boolean exists = adminRepository.existsById(userDTO.getUsername());

        if (!exists) {
            return false;
        }

        Admin admin = adminRepository.findById(userDTO.getUsername()).get();

        return admin.getPassword().equals(userDTO.getPassword());
    }
}
