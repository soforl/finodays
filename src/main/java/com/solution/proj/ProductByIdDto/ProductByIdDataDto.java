package com.solution.proj.ProductByIdDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class ProductByIdDataDto {
    @SerializedName("Product")
    @Expose
    private ProductByIdDto product;
}
