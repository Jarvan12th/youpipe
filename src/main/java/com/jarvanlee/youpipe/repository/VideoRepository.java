package com.jarvanlee.youpipe.repository;

import com.jarvanlee.youpipe.entity.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
