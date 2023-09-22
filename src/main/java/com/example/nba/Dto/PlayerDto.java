package com.example.nba.Dto;

import com.example.nba.model.Team;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private long id;
    @lombok.Getter(onMethod_ = {@JsonProperty("first_name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("first_name")})
    private String firstName;
    @lombok.Getter(onMethod_ = {@JsonProperty("height_feet")})
    @lombok.Setter(onMethod_ = {@JsonProperty("height_feet")})
    private long heightFeet;
    @lombok.Getter(onMethod_ = {@JsonProperty("height_inches")})
    @lombok.Setter(onMethod_ = {@JsonProperty("height_inches")})
    private long heightInches;
    @lombok.Getter(onMethod_ = {@JsonProperty("last_name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("last_name")})
    private String lastName;
    @lombok.Getter(onMethod_ = {@JsonProperty("position")})
    @lombok.Setter(onMethod_ = {@JsonProperty("position")})
    private String position;
    @lombok.Getter(onMethod_ = {@JsonProperty("team")})
    @lombok.Setter(onMethod_ = {@JsonProperty("team")})
    private TeamDto team;
    @lombok.Getter(onMethod_ = {@JsonProperty("weight_pounds")})
    @lombok.Setter(onMethod_ = {@JsonProperty("weight_pounds")})
    private long weightPounds;
}
