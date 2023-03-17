package io.github.human0722.backend.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xueliang
 * @description TODO
 * @date 2023-03-17 10:48
 */
public interface ShapefileService {
    String create(MultipartFile file);
}
