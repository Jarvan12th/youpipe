package com.jarvanlee.youpipe.repository;

import com.jarvanlee.youpipe.entity.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoMetadataRepository extends MongoRepository<Video, String> {

}
