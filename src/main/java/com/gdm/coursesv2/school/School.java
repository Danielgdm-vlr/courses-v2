package com.gdm.coursesv2.school;

import com.gdm.coursesv2.util.BaseEntity;
import com.gdm.coursesv2.util.SchoolEnvironment;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "school")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class School extends BaseEntity {

    @NonNull
    @Column(name = "name")
    private String name;

    @NonNull
    @Column(name = "environment")
    private SchoolEnvironment schoolEnvironment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        School school = (School) o;
        return getId() != null && Objects.equals(getId(), school.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
