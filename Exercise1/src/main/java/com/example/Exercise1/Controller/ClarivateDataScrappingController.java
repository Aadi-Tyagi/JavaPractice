package com.example.Exercise1.Controller;

import com.example.Exercise1.Service.ClarivateDataScrappingService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("scrap")
public class ClarivateDataScrappingController {

    private final ClarivateDataScrappingService scrappingService;

    @Autowired
    public ClarivateDataScrappingController(ClarivateDataScrappingService scrappingService) {
        this.scrappingService = scrappingService;
    }

    @GetMapping("/clarivate")
    public Map<String, List<String>> ScrapData(){
        return scrappingService.ScrapData();
    }

}
