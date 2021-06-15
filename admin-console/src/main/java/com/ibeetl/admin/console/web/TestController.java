package com.ibeetl.admin.console.web;

import com.ibeetl.admin.core.conf.DefineConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    DefineConfig defineConfig;

    @GetMapping("/getConfig")
    public String getConfig() {
        String config1 = defineConfig.config1;
        return config1;
    }
}
