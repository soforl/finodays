package com.solution.proj.ProductDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class ProductDto {
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
}
