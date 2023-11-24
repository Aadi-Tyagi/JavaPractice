package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Classification {
    private String name;
    private String type;
    private Long classNo;
    private String images;
}
