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
public class OwnerDto {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("mobileNumber")
        @Expose
        private String mobileNumber;
        @SerializedName("countryOfResidence")
        @Expose
        private String countryOfResidence;
        @SerializedName("countryOfBirth")
        @Expose
        private String countryOfBirth;
        @SerializedName("provinceOfBirth")
        @Expose
        private String provinceOfBirth;
        @SerializedName("cityOfBirth")
        @Expose
        private String cityOfBirth;
        @SerializedName("birthDate")
        @Expose
        private String birthDate;
        @SerializedName("PartyIdentification")
        @Expose
        private List<PartyIdentificationDto> partyIdentification;
        @SerializedName("PostalAddress")
        @Expose
        private List<PostalAddressDto> postalAddress;
}
