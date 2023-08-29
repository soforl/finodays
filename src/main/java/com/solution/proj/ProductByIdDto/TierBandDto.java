package com.solution.proj.ProductByIdDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class TierBandDto {
    @SerializedName("AER")
    @Expose
    private String aer;
    @SerializedName("comments")
    @Expose
    private List<String> comments;
    @SerializedName("identification")
    @Expose
    private String identification;
    @SerializedName("tierCurrency")
    @Expose
    private String tierCurrency;
    @SerializedName("interestRate")
    @Expose
    private String interestRate;
    @SerializedName("tierValueMinimum")
    @Expose
    private String tierValueMinimum;
    @SerializedName("tierValueMaximum")
    @Expose
    private String tierValueMaximum;
    @SerializedName("tierPrimaryValueMinimum")
    @Expose
    private String tierPrimaryValueMinimum;
    @SerializedName("tierPrimaryValueMaximum")
    @Expose
    private String tierPrimaryValueMaximum;
    @SerializedName("tierRemainValueMinimum")
    @Expose
    private String tierRemainValueMinimum;
    @SerializedName("tierValueMinTerm")
    @Expose
    private Integer tierValueMinTerm;
    @SerializedName("minTermPeriod")
    @Expose
    private String minTermPeriod;
    @SerializedName("tierValueMaxTerm")
    @Expose
    private Integer tierValueMaxTerm;
    @SerializedName("maxTermPeriod")
    @Expose
    private String maxTermPeriod;
    @SerializedName("applicationFrequency")
    @Expose
    private String applicationFrequency;
    @SerializedName("calculationFrequency")
    @Expose
    private String calculationFrequency;
}
