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
public class DataDto {

        @SerializedName("Account")
        @Expose
        private List<AccountDto> account;
}
