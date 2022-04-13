package com.gdm.coursesv2.city;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "city")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString

/*
    clasa entitate oraș
 */
public class City extends BaseEntity {

    @NonNull
    @Column(name = "name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        City city = (City) o;
        return getId() != null && Objects.equals(getId(), city.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
