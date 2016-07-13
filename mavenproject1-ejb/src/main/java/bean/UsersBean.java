package bean;

import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Евгений on 09.07.2016.
 */
@Stateless
public class UsersBean {
    @PersistenceContext(unitName = "postgresTest")
    private EntityManager em;

    public User add(User user) {
        return  em.merge(user);
    }

}
