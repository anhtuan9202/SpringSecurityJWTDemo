package com.example.demo.book;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String author;
    private String isbn;
    @CreatedDate
    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDateTime createDate;
    @LastModifiedDate
    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;



    @CreatedBy
    @Column(
            nullable = false,
            updatable = false
    )
    private Integer createBy;
    @LastModifiedBy
    @Column(
            insertable = false
    )
    private Integer lastModifiedBy;








}
