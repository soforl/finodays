package com.solution.proj.AccountDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class PartyIdentificationDto {

        @SerializedName("schemeName")
        @Expose
        private String schemeName;
        @SerializedName("identification")
        @Expose
        private String identification;

    }
