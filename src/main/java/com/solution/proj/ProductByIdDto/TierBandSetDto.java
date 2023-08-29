package com.solution.proj.ProductByIdDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
@Getter
@Setter
public class TierBandSetDto {
        @SerializedName("tierBandMethod")
        @Expose
        private String tierBandMethod;
        @SerializedName("calculationMethod")
        @Expose
        private String calculationMethod;
        @SerializedName("destination")
        @Expose
        private String destination;
        @SerializedName("comments")
        @Expose
        private List<String> comments;
        @SerializedName("TierBand")
        @Expose
        private List<TierBandDto> tierBand;
}
