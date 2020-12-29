package ua.lviv.iot.controller;

import ua.lviv.iot.dao.SingDAO;
import ua.lviv.iot.model.Sing;

import java.sql.SQLException;
import java.util.List;

public class SingController implements GeneralController<Sing> {

    SingDAO airportDAO = new SingDAO();

    @Override
    public List<Sing> findAll() throws SQLException {
        return airportDAO.findAll();
    }

    @Override
    public Sing findById(Integer id) throws SQLException {
        return airportDAO.findById(id);
    }

    @Override
    public void create(Sing sing) throws SQLException {
        airportDAO.create(sing);
    }

    @Override
    public void update(Sing sing) throws SQLException {
        airportDAO.update(sing);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        airportDAO.delete(id);
    }
}
