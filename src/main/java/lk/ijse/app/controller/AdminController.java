package lk.ijse.app.controller;

import lk.ijse.app.dto.UserDTO;
import lk.ijse.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:54 PM
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean authenticateUser(@RequestBody UserDTO userDTO) {
        return adminService.authenticateUser(userDTO);
    }
}
