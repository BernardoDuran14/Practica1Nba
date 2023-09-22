package com.example.nba.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private long id;
    @lombok.Getter(onMethod_ = {@JsonProperty("abbreviation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("abbreviation")})
    private String abbreviation;
    @lombok.Getter(onMethod_ = {@JsonProperty("city")})
    @lombok.Setter(onMethod_ = {@JsonProperty("city")})
    private String city;
    @lombok.Getter(onMethod_ = {@JsonProperty("conference")})
    @lombok.Setter(onMethod_ = {@JsonProperty("conference")})
    private String conference;
    @lombok.Getter(onMethod_ = {@JsonProperty("division")})
    @lombok.Setter(onMethod_ = {@JsonProperty("division")})
    private String division;
    @lombok.Getter(onMethod_ = {@JsonProperty("full_name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("full_name")})
    private String fullName;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
}
