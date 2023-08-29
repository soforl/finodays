package com.solution.proj.ProductByIdDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.solution.proj.ProductDto.BrandDto;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class ProductByIdDto {
    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("productType")
    @Expose
    private String productType;
    @SerializedName("productVersion")
    @Expose
    private String productVersion;
    @SerializedName("Brand")
    @Expose
    private BrandDto brand;
    @SerializedName("CreditInterest")
    @Expose
    private CreditInterestDto creditInterest;
}
