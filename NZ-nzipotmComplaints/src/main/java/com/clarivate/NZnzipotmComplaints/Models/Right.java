package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Right {
    private Long id;
    private boolean isOpponent;
    private String name;
    private String type;
    private String reference;
    private List<Classification> classification;
}
