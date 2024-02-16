package com.jarvanlee.youpipe.service;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadVideoService {

    private MinioClient minioClient;

    public boolean upload(MultipartFile file, String url) {
        try {
            minioClient = MinioClient.builder()
                    .endpoint("http://localhost:9000")
                    .credentials("minioadmin", "minioadmin")
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
