package com.clarivate.NZnzipotmComplaints.Controller;

import com.clarivate.NZnzipotmComplaints.Service.NzipotmComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NzipotmComplaintController {

    private final NzipotmComplaintService nzipotmComplaintService;
    @Autowired
    public NzipotmComplaintController(NzipotmComplaintService nzipotmComplaintService) {
        this.nzipotmComplaintService = nzipotmComplaintService;
    }

    @GetMapping("/run")
            public String runRobot() throws InterruptedException {
        return nzipotmComplaintService.runRobot();
    }

}
