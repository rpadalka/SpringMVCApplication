package by.home.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * Created by rpadalka on 11/9/2016.
 */
/*public class User {

}*/

@Entity
public class User extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1303417131998025391L;
}
