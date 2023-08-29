package com.solution.proj.ProductByIdDto;

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
public class AllProductByIdResponseDto {
    @SerializedName("Data")
    @Expose
    private ProductByIdDataDto data;
    @SerializedName("Links")
    @Expose
    private LinksDto links;
    @SerializedName("Meta")
    @Expose
    private MetaDto meta;
}
