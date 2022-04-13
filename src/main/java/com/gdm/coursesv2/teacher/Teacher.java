package com.gdm.coursesv2.teacher;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "teacher")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Teacher extends BaseEntity {

    @NonNull
    @Column(name = "first-name")
    private String firstName;

    @NonNull
    @Column(name = "last-name")
    private String lastName;

    @NonNull
    @Column(name = "cnp")
    private String cnp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Teacher teacher = (Teacher) o;
        return getId() != null && Objects.equals(getId(), teacher.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
