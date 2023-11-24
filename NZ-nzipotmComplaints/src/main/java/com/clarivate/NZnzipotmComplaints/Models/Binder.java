package com.clarivate.NZnzipotmComplaints.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Binder {
    private Long id;
    private String firstAction;
    private String firstActionDate;
    private String domain;

    private List<Docket> dockets;
    private List<Decision> decisions;
    private List<Party> parties;
    private List<Right> rights;

}
