package com.dataloaderportal.DataLoaderPortal.service;

import com.dataloaderportal.DataLoaderPortal.entity.Role;
import com.dataloaderportal.DataLoaderPortal.entity.User;
import com.dataloaderportal.DataLoaderPortal.model.RoleModel;
import com.dataloaderportal.DataLoaderPortal.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserModel userModel;

    @Autowired
    private RoleModel roleModel;

    public User registerNewUser(User user){
        return userModel.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin access only");
        roleModel.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created Users");
        roleModel.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userModel.save(adminUser);

        User user = new User();
        user.setUserFirstName("user");
        user.setUserLastName("user");
        user.setUserName("user123");
        user.setUserPassword("user@pass");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userModel.save(user);
    }
}
