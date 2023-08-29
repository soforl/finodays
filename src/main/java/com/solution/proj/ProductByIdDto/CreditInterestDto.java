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
public class CreditInterestDto {
    @SerializedName("comments")
    @Expose
    private List<String> comments;
    @SerializedName("TierBandSet")
    @Expose
    private List<TierBandSetDto> tierBandSet;
}
