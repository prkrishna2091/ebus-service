package com.rktravles.ebusservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bus {

    @JsonProperty("bus_id")
    private String busId;

    @JsonProperty("register_number")
    private String busRegNumber;

    @JsonProperty("service_number")
    private String serviceNumber;

    @JsonProperty("seats_count")
    private String capacity;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("signup_date")
    //@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    @JsonIgnore
    private LocalDate updateDate;
}
