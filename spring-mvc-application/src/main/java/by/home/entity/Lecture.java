package by.home.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by rpadalka on 11/9/2016.
 */
@Entity
public class Lecture extends AbstractPersistable<Long> {

    private static final long serialVersionUID = -6959602330926664726L;

    @Column
    private String name;

    @OneToOne
    @Column
    private Book book;
}
