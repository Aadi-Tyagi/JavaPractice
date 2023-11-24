package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Decision {
    private Long id;
    private String reference;
    private String judgmentDate;
    private String level;
    private String nature;
    private String robotSource;

}
