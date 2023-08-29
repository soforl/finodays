package com.solution.proj.ProductDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class BrandDto {

    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("applicationUri")
    @Expose
    private String applicationUri;

}