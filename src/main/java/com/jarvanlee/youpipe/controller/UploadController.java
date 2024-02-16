package com.jarvanlee.youpipe.controller;

import com.jarvanlee.youpipe.common.ResponseResult;
import com.jarvanlee.youpipe.entity.Video;
import com.jarvanlee.youpipe.service.UploadService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/videos")
public class UploadController {

    private final String URL_PREFIX = "/videos/";

    @Autowired
    private UploadService uploadService;

    // upload video files
    @PostMapping("/upload")
    public ResponseResult upload(MultipartHttpServletRequest request,
                         @RequestParam("title") String title,
                         @RequestParam("description") String description) {
        MultipartFile file = request.getFile("file");
        if (file == null) {
            return ResponseResult.error("No file received.");
        }

        Video video = new Video();
        String id = UUID.randomUUID().toString();
        video.setId(id);
        video.setTitle(title);
        video.setDescription(description);
        video.setUrl(URL_PREFIX + id);
        video.setUploadDate(new java.util.Date());

        boolean result = uploadService.upload(file, video);

        return result ? ResponseResult.success() : ResponseResult.error("Upload failed.");
    }
}
