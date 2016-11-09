package by.home.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rpadalka on 11/9/2016.
 */
@Entity
public class Professor extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1914642755520371338L;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToMany
    @Column
    private List<Student> studentList;

    @OneToMany
    @Column
    private List<Lecture> lectureList;
}
