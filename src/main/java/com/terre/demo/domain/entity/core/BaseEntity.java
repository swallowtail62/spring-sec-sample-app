package com.terre.demo.domain.entity.core;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * user who created
     */
    @CreatedBy
    private String inputUser;

    /**
     * time at created
     */
    @CreationTimestamp
    private Timestamp inputTimestamp;

    /**
     * user who updated
     */
    @LastModifiedBy
    private String updateUser;

    /**
     * time at updated
     */
    @UpdateTimestamp
    private Timestamp updateTimestamp;
}
