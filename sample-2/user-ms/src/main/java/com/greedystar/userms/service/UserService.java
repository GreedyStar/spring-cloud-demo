package com.greedystar.userms.service;

import com.greedystar.userms.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-9
 */
@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        for (int i = 1; i < 6; i++) {
            users.add(new User(i, "USER_" + i, "1760064070" + i));
        }
    }

    public List<User> findUserList() {
        return users;
    }

}
