package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Docket {
    private Long id;
    private String reference;
    private Long courtId;
    private String judge;
}
