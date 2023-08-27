package com.solution.proj.AccountDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import jakarta.annotation.Generated;
import lombok.Getter;
import lombok.Setter;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class LinksDto {
        @SerializedName("self")
        @Expose
        private String self;
        @SerializedName("first")
        @Expose
        private String first;
        @SerializedName("prev")
        @Expose
        private String prev;
        @SerializedName("next")
        @Expose
        private String next;
        @SerializedName("last")
        @Expose
        private String last;
}
