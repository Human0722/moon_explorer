package io.github.human0722.backend.controller;

import io.github.human0722.Response.Response;
import io.github.human0722.backend.service.ShapefileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xueliang
 * @description shapefile 文件处理器
 * @date 2023-03-16 18:04
 */
@RestController
@RequestMapping(ShapefileController.BASE_URL)
@RequiredArgsConstructor
public class ShapefileController {

    public static final String BASE_URL = "shapefile_handler";

    final private ShapefileService shapefileService;

    @PostMapping
    public Response<String> create(HttpServletRequest request, @RequestParam("file")MultipartFile file) {

        return Response.success(shapefileService.create(file));
    }
}
