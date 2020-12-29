package ua.lviv.iot.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import ua.lviv.iot.connection.HibernateJPA;
import ua.lviv.iot.model.User;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class UserDAO implements GeneralDAO<User> {

    @Override
    public List<User> findAll() throws SQLException {
        List<User> users = new LinkedList<>();
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            users = session.createQuery("from User ").getResultList();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User findById(Integer id) throws SQLException {
        User user = null;
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            user = session.get(User.class, id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void create(User newUser) throws SQLException {

        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.save(newUser);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(User newUser) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.update(newUser);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            User userToDelete = session.get(User.class, id);
            if (userToDelete != null) {
                session.delete(userToDelete);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}