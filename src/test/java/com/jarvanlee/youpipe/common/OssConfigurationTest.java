package com.jarvanlee.youpipe.common;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OssConfigurationTest {

    @Autowired
    private OssConfiguration ossConfiguration;

    @Test
    void getProvider() {
        assertEquals("minio", ossConfiguration.getProvider());
    }
}
