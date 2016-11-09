package by.home.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rpadalka on 11/9/2016.
 */
@Entity
public class Student extends AbstractPersistable<Long> {

    private static final long serialVersionUID = -6333663542921352145L;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToMany
    @Column
    private List<Professor> professorList;

    @OneToMany
    @Column
    private List<Lecture> lectureList;
}
