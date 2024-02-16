package com.jarvanlee.youpipe.service;

import com.jarvanlee.youpipe.entity.Video;
import com.jarvanlee.youpipe.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class UploadService {

    @Autowired
    private UploadVideoService uploadVideoService;

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> findAllVideos() {
        return videoRepository.findAll();
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public boolean upload(MultipartFile file, Video video) {
        boolean uploadResult = uploadVideoService.upload(file, video.getUrl());

        if (uploadResult) {
            videoRepository.save(video);
        } else {
            return false;
        }

        return true;
    }
}
