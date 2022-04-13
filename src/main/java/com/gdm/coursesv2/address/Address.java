package com.gdm.coursesv2.address;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "address")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString

/*
    clasa entitate adresă
 */
public class Address extends BaseEntity {

    @NonNull
    @Column(name = "street")
    private String street;

    @NonNull
    @Column(name = "number")
    private String number;

    @NonNull
    @Column(name = "zip_code")
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return getId() != null && Objects.equals(getId(), address.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
