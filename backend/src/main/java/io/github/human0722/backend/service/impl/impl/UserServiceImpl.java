package io.github.human0722.backend.service.impl.impl;

import io.github.human0722.backend.dao.UserDao;
import io.github.human0722.backend.model.User;
import io.github.human0722.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xueliang
 * @date 2023-03-17 17:07
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    @Override
    public User store() {
        User user = new User();
        user.setName("randy");
        userDao.store(user);
        return user;
    }
}
