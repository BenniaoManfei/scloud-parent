package com.daniel.scloud.demo.ls02mssms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${tony.configString}")
    private String config;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @GetMapping("")
    public String printConfig() {
        logger.info("printConfig(logged by DanielDai)<>【config:{}】",config);

        return config;
    }

}
