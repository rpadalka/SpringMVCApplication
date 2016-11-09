package by.home.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by rpadalka on 11/9/2016.
 */
@Entity
public class Book extends AbstractPersistable<Long> {

    private static final long serialVersionUID = -4285718694246442109L;

    @Column
    private String author;

    @Column
    private String title;
}
