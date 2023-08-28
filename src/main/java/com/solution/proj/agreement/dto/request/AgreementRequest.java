package com.solution.proj.agreement.dto.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class AgreementRequest {
    @SerializedName("Data")
    @Expose
    private DataDto data;
    @SerializedName("Risk")
    @Expose
    private RiskDto risk;
}
