package com.gdm.coursesv2.school_year;

import com.gdm.coursesv2.util.BaseEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "school_year")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class SchoolYear extends BaseEntity {

    @NonNull
    @Column(name = "start_date")
    private LocalDate startDate;

    @NonNull
    @Column(name = "end_date")
    private LocalDate endDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SchoolYear that = (SchoolYear) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
