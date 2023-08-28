package com.solution.proj.AccountDto;

import com.google.gson.annotations.Expose;
import com.nimbusds.jose.shaded.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class AccountDto {
        @SerializedName("accountId")
        @Expose
        private String accountId;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("statusUpdateDateTime")
        @Expose
        private String statusUpdateDateTime;
        @SerializedName("currency")
        @Expose
        private String currency;
        @SerializedName("accountType")
        @Expose
        private String accountType;
        @SerializedName("accountSubType")
        @Expose
        private String accountSubType;
        @SerializedName("accountDescription")
        @Expose
        private String accountDescription;
        @SerializedName("AccountDetails")
        @Expose
        private List<AccountDetailDto> accountDetails;
        @SerializedName("Owner")
        @Expose
        private OwnerDto owner;
        @SerializedName("ServiceProvider")
        @Expose
        private ServiceProviderDto serviceProvider;
}
