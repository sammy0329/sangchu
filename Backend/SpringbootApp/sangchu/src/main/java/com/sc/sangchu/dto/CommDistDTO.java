package com.sc.sangchu.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommDistDTO {
    private Integer coId;
    private String serviceCode;
    private String serviceName;
    private String coName;
    private String middleCategoryCode;
    private String middleCategoryName;
    private Integer majorCategoryCode;
    private String majorCategoryName;
    private Integer guCode;
    private String guName;
    private Integer dongCode;
    private String dongName;
    private Double coArea;
    private Integer coX;
    private Integer coY;
    private Double coScore;
    private Double coSalesScore;
    private Double coFlPoScore;
    private Double coRePoScore;
    private Double coCompScore;
    private Double coDiversityScore;
}
