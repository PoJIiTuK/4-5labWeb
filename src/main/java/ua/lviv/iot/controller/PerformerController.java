package ua.lviv.iot.controller;

import ua.lviv.iot.dao.PerformerDAO;
import ua.lviv.iot.model.Performer;

import java.sql.SQLException;
import java.util.List;

public class PerformerController implements GeneralController<Performer> {

    PerformerDAO ticketDAO = new PerformerDAO();

    @Override
    public List<Performer> findAll() throws SQLException {
        return ticketDAO.findAll();
    }

    @Override
    public Performer findById(Integer id) throws SQLException {
        return ticketDAO.findById(id);
    }

    @Override
    public void create(Performer performer) throws SQLException {
        ticketDAO.create(performer);
    }

    @Override
    public void update(Performer performer) throws SQLException {
        ticketDAO.update(performer);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        ticketDAO.delete(id);
    }
}
