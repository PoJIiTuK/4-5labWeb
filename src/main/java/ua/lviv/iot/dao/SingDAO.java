package ua.lviv.iot.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import ua.lviv.iot.connection.HibernateJPA;
import ua.lviv.iot.model.Sing;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SingDAO implements GeneralDAO<Sing> {


    @Override
    public List<Sing> findAll() throws SQLException {
        List<Sing> sings = new LinkedList<>();
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            sings = session.createQuery("from Sing").getResultList();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sings;
    }


    @Override
    public Sing findById(Integer id) throws SQLException {
        Sing sing = null;
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            sing = session.get(Sing.class, id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sing;
    }

    @Override
    public void create(Sing sing) throws SQLException {

        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.save(sing);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void update( Sing newSing) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.update(newSing);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            Sing singToDelete = session.get(Sing.class, id);
            if (singToDelete != null){
                session.delete(singToDelete);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
