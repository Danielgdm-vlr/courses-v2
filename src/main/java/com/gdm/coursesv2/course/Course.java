package com.gdm.coursesv2.course;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "course")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString

/*
    clasa entitate materie
 */

public class Course extends BaseEntity {

    @NonNull
    @Column
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Course course = (Course) o;
        return getId() != null && Objects.equals(getId(), course.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
