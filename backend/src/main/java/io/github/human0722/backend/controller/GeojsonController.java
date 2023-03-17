package io.github.human0722.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueliang
 * @description TODO
 * @date 2023-03-16 18:09
 */
@RestController
@RequestMapping(GeojsonController.BASE_URL)
public class GeojsonController {
    public static final String BASE_URL ="geojson_handler";
}
