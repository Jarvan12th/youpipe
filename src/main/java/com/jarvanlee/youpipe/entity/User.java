package com.jarvanlee.youpipe.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String passwordHash;
    private UserProfile profile;
    private Date registrationDate;
    private List<String> roles;
    private String status;
}

@Data
class UserProfile {
    private String firstName;
    private String lastName;
    private String avatarUrl;
}
