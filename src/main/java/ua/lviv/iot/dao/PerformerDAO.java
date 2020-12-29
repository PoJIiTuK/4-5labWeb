package ua.lviv.iot.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import ua.lviv.iot.connection.HibernateJPA;
import ua.lviv.iot.model.Performer;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PerformerDAO implements GeneralDAO<Performer> {

    @Override
    public List<Performer> findAll() throws SQLException {
        List<Performer> performers = new LinkedList<>();
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            performers = session.createQuery("from Performer ").getResultList();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return performers;
    }


    @Override
    public Performer findById(Integer id) throws SQLException {
        Performer performer = null;
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            performer = session.get(Performer.class, id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return performer;
    }

    @Override
    public void create(Performer performer) throws SQLException {

        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.save(performer);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void update(Performer newPerformer) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.update(newPerformer);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            Performer performerToDelete = session.get(Performer.class, id);
            if (performerToDelete != null) {
                session.delete(performerToDelete);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
