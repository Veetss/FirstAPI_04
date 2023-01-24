package it.develhope.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public Map<String, String> getHeaders(@RequestHeader HttpHeaders headers) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("hostName", headers.getHost().getHostName());
        headerMap.put("hostPort", headers.getHost().getPort()+"");
        return headerMap;
    }
}
