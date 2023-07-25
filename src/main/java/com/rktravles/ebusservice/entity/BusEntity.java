package com.rktravles.ebusservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(
        name = "bus_details"
)
public class BusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long bus_id;

    @Column(
            name = "bus_reg_num"
    )
    private String registerNumber;

    @Column(name = "seats_capacity")
    private String capacity;

    @Column(name = "service_number")
    private String serviceNumber;

    @Column(name="bus_owner")
    private String owner;

    @Column(name="creation_date")
    private LocalDate creationDate;

    @Column(name="update_date")
    private LocalDate updateDate;

}
