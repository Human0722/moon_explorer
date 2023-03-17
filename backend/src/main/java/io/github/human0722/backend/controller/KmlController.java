package io.github.human0722.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueliang
 * @description KML handler
 * @date 2023-03-16 18:06
 */

@RestController
@RequestMapping(KmlController.BASE_URL)
public class KmlController {


    public static final String BASE_URL = "kml_handler";
}
