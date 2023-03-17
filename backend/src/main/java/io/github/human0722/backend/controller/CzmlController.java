package io.github.human0722.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueliang
 * @description TODO
 * @date 2023-03-16 18:08
 */

@RestController
@RequestMapping(CzmlController.BASE_URL)
public class CzmlController {
    public static final String BASE_URL = "czml_handler";
}
