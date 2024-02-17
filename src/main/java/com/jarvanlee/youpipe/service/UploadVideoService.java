package com.jarvanlee.youpipe.service;

import com.jarvanlee.youpipe.common.OssConfiguration;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadVideoService {

    private MinioClient minioClient;

    @Autowired
    private OssConfiguration ossConfiguration;

    public boolean upload(MultipartFile file, String url) {
        try {
            minioClient = MinioClient.builder()
                    .endpoint(ossConfiguration.getEndpoint())
                    .credentials(ossConfiguration.getAccessKey(), ossConfiguration.getSecretKey())
                    .build();

            minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket("raw")
                            .object(url)
                            .stream(file.getInputStream(), file.getSize(), -1)
                            .build());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
