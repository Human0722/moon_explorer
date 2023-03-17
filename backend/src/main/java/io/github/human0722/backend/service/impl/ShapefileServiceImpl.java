package io.github.human0722.backend.service.impl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ZipUtil;
import io.github.human0722.backend.service.ShapefileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author xueliang
 * @date 2023-03-17 14:16
 */
@Service
public class ShapefileServiceImpl implements ShapefileService {
    @Override
    public String create(MultipartFile multipartFile) {
        String tmpDir = System.getProperty("java.io.tmpdir");
        File file = new File(tmpDir + File.separator + "tmp.zip");
        try {
            multipartFile.transferTo(file);
            File unzipDir = ZipUtil.unzip(file.getAbsolutePath(), tmpDir + File.separator + "/zz", Charset.forName("GBK"));

        }catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
