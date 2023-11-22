package com.example.Exercise2.Controller;

import com.example.Exercise2.Services.LeetcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exercise2")
public class LeetcodeController {

    private final LeetcodeService leetcodeService;

    @Autowired
    public LeetcodeController(LeetcodeService leetcodeService) {
        this.leetcodeService = leetcodeService;
    }

    @GetMapping("/paste")
    public String codePasting(){
        return leetcodeService.codePasting();
    }
}
