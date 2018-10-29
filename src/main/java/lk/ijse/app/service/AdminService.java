package lk.ijse.app.service;

import lk.ijse.app.dto.UserDTO;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:49 PM
 */
public interface AdminService {

    boolean authenticateUser(UserDTO userDTO);

}
