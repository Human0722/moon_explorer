package io.github.human0722.backend.controller;

import io.github.human0722.Response.Response;
import io.github.human0722.backend.model.User;
import io.github.human0722.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueliang
 * @date 2023-03-17 17:04
 */
@RestController
@RequestMapping(UserController.BASE_URL)
@RequiredArgsConstructor
public class UserController {

    public static final String BASE_URL = "/handler_user";

    final private UserService userService;

    @PostMapping
    public Response<User> store() {
        return Response.success(userService.store());
    }
}
