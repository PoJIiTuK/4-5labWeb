package ua.lviv.iot.controller;

import ua.lviv.iot.dao.InformationDAO;
import ua.lviv.iot.model.Information;

import java.sql.SQLException;
import java.util.List;

public class InformationController implements GeneralController<Information> {

    InformationDAO airlineDAO = new InformationDAO();

    @Override
    public List<Information> findAll() throws SQLException {
        return airlineDAO.findAll();
    }

    @Override
    public Information findById(Integer id) throws SQLException {
        return airlineDAO.findById(id);
    }

    @Override
    public void create(Information information) throws SQLException {
        airlineDAO.create(information);
    }

    @Override
    public void update(Information information) throws SQLException {
        airlineDAO.update(information);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        airlineDAO.delete(id);
    }
}
