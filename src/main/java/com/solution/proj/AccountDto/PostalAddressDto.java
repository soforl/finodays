package com.solution.proj.AccountDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class PostalAddressDto {

        @SerializedName("addressType")
        @Expose
        private String addressType;
        @SerializedName("department")
        @Expose
        private String department;
        @SerializedName("subDepartment")
        @Expose
        private String subDepartment;
        @SerializedName("streetName")
        @Expose
        private String streetName;
        @SerializedName("buildingNumber")
        @Expose
        private String buildingNumber;
        @SerializedName("postCode")
        @Expose
        private String postCode;
        @SerializedName("townName")
        @Expose
        private String townName;
        @SerializedName("countrySubDivision")
        @Expose
        private String countrySubDivision;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("addressLine")
        @Expose
        private List<String> addressLine;
}
