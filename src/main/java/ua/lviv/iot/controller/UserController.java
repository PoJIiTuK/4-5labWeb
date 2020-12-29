package ua.lviv.iot.controller;

import ua.lviv.iot.dao.UserDAO;
import ua.lviv.iot.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserController implements GeneralController<User> {

    UserDAO flightDAO = new UserDAO();

    @Override
    public List<User> findAll() throws SQLException {
        return flightDAO.findAll();
    }

    @Override
    public User findById(Integer id) throws SQLException {
        return flightDAO.findById(id);
    }

    @Override
    public void create(User user) throws SQLException {
        flightDAO.create(user);
    }

    @Override
    public void update(User user) throws SQLException {
        flightDAO.update(user);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        flightDAO.delete(id);
    }
}
