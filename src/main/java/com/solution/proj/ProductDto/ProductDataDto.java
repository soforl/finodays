package com.solution.proj.ProductDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class ProductDataDto {
    @SerializedName("Products")
    @Expose
    private List<ProductDto> products;

}
