package br.com.walterretke.goal_app.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sales_representative")
public class SalesRepresentativeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "rol_last_period", precision = 19, scale = 2)
    private BigDecimal rolLastPeriod;

    @Column(name = "goal_current_year", precision = 19, scale = 2)
    private BigDecimal goalCurrentYear;
    
    @Column(name = "goal_current_year_in_percentage", precision = 8, scale = 2)
    private BigDecimal goalCurrentYearInPercentage;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}