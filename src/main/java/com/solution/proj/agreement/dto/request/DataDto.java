package com.solution.proj.agreement.dto.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class DataDto {
    @SerializedName("permissions")
    @Expose
    private List<String> permissions;
    @SerializedName("expirationDateTime")
    @Expose
    private String expirationDateTime;
    @SerializedName("transactionFromDateTime")
    @Expose
    private String transactionFromDateTime;
    @SerializedName("transactionToDateTime")
    @Expose
    private String transactionToDateTime;
}
