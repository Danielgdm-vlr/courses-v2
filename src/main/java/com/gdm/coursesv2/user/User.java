package com.gdm.coursesv2.user;

import com.gdm.coursesv2.util.BaseEntity;
import com.gdm.coursesv2.util.UserRole;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "user_table")

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class User extends BaseEntity {

    @NonNull
    @Column(name = "username")
    private String username;

    @NonNull
    @Column(name = "password")
    private String password;

    @NonNull
    @Column(name = "date_created")
    private LocalDate dateCreated;

    @NonNull
    @Column(name = "role")
    private UserRole userRole;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return getId() != null && Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
