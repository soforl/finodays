package com.solution.proj.ProductDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.solution.proj.AccountDto.LinksDto;
import com.solution.proj.AccountDto.MetaDto;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class AllProductsResponseDto {
    @SerializedName("Data")
    @Expose
    private ProductDataDto data;
    @SerializedName("Links")
    @Expose
    private LinksDto links;
    @SerializedName("Meta")
    @Expose
    private MetaDto meta;
}
