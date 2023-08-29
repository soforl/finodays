package com.solution.proj.agreement.dto.response;

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
    @SerializedName("consentId")
    @Expose
    private String consentId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusUpdateDateTime")
    @Expose
    private String statusUpdateDateTime;
    @SerializedName("permissions")
    @Expose
    private List<String> permissions;
    @SerializedName("expirationDateTime")
    @Expose
    private String expirationDateTime;
}
