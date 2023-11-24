package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Party {
    private String name;
    private String type;
    private List<String> representatives;
}
