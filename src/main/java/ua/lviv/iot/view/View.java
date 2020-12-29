package ua.lviv.iot.view;

import ua.lviv.iot.controller.InformationController;
import ua.lviv.iot.controller.SingController;
import ua.lviv.iot.controller.UserController;
import ua.lviv.iot.controller.PerformerController;
import ua.lviv.iot.model.Information;
import ua.lviv.iot.model.Sing;
import ua.lviv.iot.model.User;
import ua.lviv.iot.model.Performer;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private final Map<String, Printable> menu = new LinkedHashMap<>();

    private final InformationController informationController = new InformationController();
    private final SingController singController = new SingController();
    private final UserController userController = new UserController();
    private final PerformerController performerController = new PerformerController();

    public View() {

        menu.put("11", this::getAllInformation);
        menu.put("12", this::getInformationById);
        menu.put("13", this::createInformation);
        menu.put("14", this::updateInformation);
        menu.put("15", this::deleteInformation);

        menu.put("21", this::getAllSings);
        menu.put("22", this::getSingById);
        menu.put("23", this::createSing);
        menu.put("24", this::updateSing);
        menu.put("25", this::deleteSing);

        menu.put("31", this::getAllUsers);
        menu.put("32", this::getUserById);
        menu.put("33", this::createUser);
        menu.put("34", this::updateUser);
        menu.put("35", this::deleteUser);

        menu.put("41", this::getAllPerformers);
        menu.put("42", this::getPerformerById);
        menu.put("43", this::createPerformer);
        menu.put("44", this::updatePerformer);
        menu.put("45", this::deletePerformer);

    }

    private void getAllInformation() throws SQLException {
        System.out.println("\nAll Information: ");
        System.out.println(informationController.findAll() + "\n");
    }

    private void getAllSings() throws SQLException {
        System.out.println("\nAll Sings: ");
        System.out.println(singController.findAll() + "\n");
    }

    private void getAllUsers() throws SQLException {
        System.out.println("\nAll Users: ");
        System.out.println(userController.findAll() + "\n");
    }

    private void getAllPerformers() throws SQLException {
        System.out.println("\nAll Performers: ");
        System.out.println(performerController.findAll() + "\n");
    }


    private void getInformationById() throws SQLException {
        System.out.println("\nEnter id to find Information with this id ...: ");
        Integer id = scanner.nextInt();
        System.out.println(informationController.findById(id) + "\n");
    }

    private void getSingById() throws SQLException {
        System.out.println("\nEnter id to find sing with this id ...: ");
        Integer id = scanner.nextInt();
        System.out.println(singController.findById(id) + "\n");
    }

    private void getUserById() throws SQLException {
        System.out.println("\nEnter id to find user with this id ...: ");
        Integer id = scanner.nextInt();
        System.out.println(userController.findById(id) + "\n");
    }

    private void getPerformerById() throws SQLException {
        System.out.println("\nEnter id to find performer with this id ...: ");
        Integer id = scanner.nextInt();
        System.out.println(performerController.findById(id) + "\n");
    }
    private Information getInformationValues() throws SQLException {
        System.out.println("Input sing id: ");
        Integer singId = scanner.nextInt();
        System.out.println("Input year: ");
        Integer year = scanner.nextInt();
        System.out.println("Input timecode: ");
        Integer timecode = scanner.nextInt();
        return new Information(singId, year, timecode);
    }


    private Performer getPerformerValues() throws SQLException {
        System.out.println("Input performer id: ");
        Integer id = scanner.nextInt();
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input surname: ");
        String surname = scanner.next();
        System.out.println("Input country name: ");
        String country = scanner.next();
        return new Performer(id, name, surname, country);
    }

    private User getUserValues() throws SQLException {
        System.out.println("Input name: ");
        String name = scanner.next();
        return new User(name);
    }

    private Sing getSingValues() throws SQLException {
        System.out.println("Input sing id: ");
        Integer id = scanner.nextInt();
        return new Sing(id);
    }


    private void createInformation() throws SQLException {
        System.out.println("\nAdd new Information...");
        Information information = getInformationValues();
        informationController.create(information);
        System.out.println("added an information\n");
    }

    private void createUser() throws SQLException {
        System.out.println("\nAdd new user...");
        User user = getUserValues();
        userController.create(user);
        System.out.println("added an user\n");
    }

    private void createSing() throws SQLException {
        System.out.println("\nAdd new sing...");
        User user = getUserValues();
        userController.create(user);
        System.out.println("added new sing\n");
    }

    private void createPerformer() throws SQLException {
        System.out.println("\nAdd new performer...");
        Performer performer = getPerformerValues();
        performerController.create(performer);
        System.out.println("added new performer\n");
    }

    private void updateInformation() throws SQLException {
        System.out.println("\nEnter id of information to update: ");
        Integer id = scanner.nextInt();
        Information information = getInformationValues();
        information.setId(id);
        System.out.println(information);
        informationController.update(information);
        System.out.println("Updated \n");
    }

    private void updateSing() throws SQLException {
        System.out.println("\nEnter id of update to update: ");
        Integer id = scanner.nextInt();
        Sing sing = getSingValues();
        sing.setId(id);
        System.out.println(sing);
        singController.update(sing);
        System.out.println("Updated \n");
    }

    private void updatePerformer() throws SQLException {
        System.out.println("\nEnter id of performer to update: ");
        Integer id = scanner.nextInt();
        Performer performer = getPerformerValues();
        performer.setId(id);

        performerController.update(performer);
        System.out.println("Updated \n");
    }


    private void updateUser() throws SQLException {
        System.out.println("\nEnter id of user to update: ");
        Integer id = scanner.nextInt();
        User user = getUserValues();
        user.setId(id);

        userController.update(user);
        System.out.println("Updated \n");
    }

    private void deleteInformation() throws SQLException {
        System.out.println("\nEnter ID of information to delete it: ");
        int id = scanner.nextInt();

        informationController.delete(id);
        System.out.println("Deleted \n");
    }

    private void deleteSing() throws SQLException {
        System.out.println("\nEnter ID of sing to delete it: ");
        int id = scanner.nextInt();

        singController.delete(id);
        System.out.println("Deleted \n");
    }

    private void deleteUser() throws SQLException {
        System.out.println("\nEnter ID of User to delete it: ");
        int id = scanner.nextInt();

        userController.delete(id);
        System.out.println("Deleted \n");
    }

    private void deletePerformer() throws SQLException {
        System.out.println("\nEnter ID of performer to delete it: ");
        int id = scanner.nextInt();

        performerController.delete(id);
        System.out.println("Deleted \n");
    }


    public final void view() {
        System.out.println("\nInput method key to deal with db:");
        String input;
        do {
            try {
                input = scanner.next();
                menu.get(input).print();
                System.out.println("\nInput method key to deal with db:");
            } catch (Exception e) {
                System.out.println("No operation for this key");
                System.out.println("\nInput method key to deal with db:");
            }
        } while (scanner.hasNext());
    }

}

