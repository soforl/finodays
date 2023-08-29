package com.solution.proj.AccountDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class AllAccountsResponseDto {

        @SerializedName("Data")
        @Expose
        private DataDto data;
        @SerializedName("Risk")
        @Expose
        private RiskDto risk;
        @SerializedName("Links")
        @Expose
        private LinksDto links;
        @SerializedName("Meta")
        @Expose
        private MetaDto meta;

    }
