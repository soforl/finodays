package com.solution.proj.agreement.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class AgreementResponse {
    @SerializedName("Data")
    @Expose
    private DataDto data;
    @SerializedName("Links")
    @Expose
    private LinksDto links;
}