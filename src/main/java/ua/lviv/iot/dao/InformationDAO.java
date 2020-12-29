package ua.lviv.iot.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import ua.lviv.iot.connection.HibernateJPA;
import ua.lviv.iot.model.Information;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class InformationDAO implements GeneralDAO<Information> {

    @Override
    public List<Information> findAll() throws SQLException {
        List<Information> information = new LinkedList<>();
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            information = session.createQuery("from Information ").getResultList();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return information;
    }


    @Override
    public Information findById(Integer id) throws SQLException {
        Information information = null;
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            information = session.get(Information.class, id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return information;
    }

    @Override
    public void create(Information information) throws SQLException {

        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.save(information);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void update(Information newInformation) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            session.update(newInformation);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) throws SQLException {
        try (Session session = HibernateJPA.getSession()) {
            session.beginTransaction();
            Information informationToDelete = session.get(Information.class, id);
            if (informationToDelete != null) {
                session.delete(informationToDelete);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}

