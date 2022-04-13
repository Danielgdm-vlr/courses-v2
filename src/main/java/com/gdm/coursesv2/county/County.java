package com.gdm.coursesv2.county;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "county")

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

/*
    clasa entitate județ
 */
public class County extends BaseEntity {

    @NonNull
    @Column(name = "code")
    private String code;

    @NonNull
    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        County county = (County) o;
        return getId() != null && Objects.equals(getId(), county.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
