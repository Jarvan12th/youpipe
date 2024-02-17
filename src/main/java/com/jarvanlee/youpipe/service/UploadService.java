package com.jarvanlee.youpipe.service;

import com.jarvanlee.youpipe.entity.Video;
import com.jarvanlee.youpipe.repository.VideoMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {

    @Autowired
    private UploadVideoService uploadVideoService;

    @Autowired
    private VideoMetadataRepository videoMetadataRepository;

    public boolean upload(MultipartFile file, Video video) {
        boolean uploadResult = uploadVideoService.upload(file, video.getUrl());

        if (uploadResult) {
            return videoMetadataRepository.save(video) != null;
        } else {
            return false;
        }
    }
}
