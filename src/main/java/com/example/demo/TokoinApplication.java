package com.example.demo;

import com.example.demo.controller.ControllerOrganization;
import com.example.demo.controller.ControllerTicket;
import com.example.demo.controller.ControllerUser;
import com.example.demo.model.Organization;
import com.example.demo.model.Ticket;
import com.example.demo.model.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class TokoinApplication {

    @Autowired
    static
    ControllerUser controllerUser;
    @Autowired
    static
    ControllerTicket controllerTicket;
    @Autowired
    static
    ControllerOrganization controllerOrganization;

    public static void main(String[] args) {
        SpringApplication.run(TokoinApplication.class, args);
        readData();
    }

    public static void readData()
    {
        try (
                FileReader readerUser = new FileReader("src/data/users.json");
                FileReader readerTicket = new FileReader("src/data/tickets.json");
                FileReader readerOrganization = new FileReader("src/data/organizations.json");
        )
        {
            Gson gson = new Gson();
            User[] users = gson.fromJson(readerUser, User[].class); 
            Ticket[] tickets = gson.fromJson(readerTicket, Ticket[].class);
            Organization[] organizations = gson.fromJson(readerOrganization, Organization[].class);
 
            Scanner x = new Scanner(System.in);
            System.out.println("1. Search User");
            System.out.println("2. Search Ticket");
            System.out.println("3. Search Organization");
            System.out.println("4. Exit !!!");
            System.out.println("Please choose object search:");
            int inputSearch = x.nextInt();
            switch (inputSearch){
                case 1:
                    int inputUser = chooseTypeInput(x);

                    switch (inputUser){
                        case 1:
                            System.out.println("List term:\n 1. _id\n 2. organization_id");
                            System.out.println("Input user term:");
                            int userInt = x.nextInt();
                            String userIntTerm = "";
                            switch (userInt){
                                case 1:
                                    userIntTerm = "_id";
                                    break;
                                case 2:
                                    userIntTerm = "organization_id";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input user integer value:");
                            int ticketInteger = x.nextInt();
                            controllerUser.getUserInteger(users, tickets, organizations, userIntTerm, ticketInteger);
                            break;
                        case 2:
                            System.out.println("List term:\n 1. url\n 2. external_id\n 3. name\n 4. alias\n 5. created_at\n 6. locale\n 7. timezone\n 8. last_login_at\n 9. email\n 10. phone\n 11. signature\n 12. role");
                            System.out.println("Input user term:");
                            int userString = x.nextInt();
                            String fixBugString = x.nextLine();
                            String userStringTerm = "";
                            switch (userString){
                                case 1:
                                    userStringTerm = "url";
                                    break;
                                case 2:
                                    userStringTerm = "external_id";
                                    break;
                                case 3:
                                    userStringTerm = "name";
                                    break;
                                case 4:
                                    userStringTerm = "alias";
                                    break;
                                case 5:
                                    userStringTerm = "created_at";
                                    break;
                                case 6:
                                    userStringTerm = "locale";
                                    break;
                                case 7:
                                    userStringTerm = "timezone";
                                    break;
                                case 8:
                                    userStringTerm = "last_login_at";
                                    break;
                                case 9:
                                    userStringTerm = "email";
                                    break;
                                case 10:
                                    userStringTerm = "phone";
                                    break;
                                case 11:
                                    userStringTerm = "signature";
                                    break;
                                case 12:
                                    userStringTerm = "role";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input user string value:");
                            String ticketStringValue = x.nextLine();
                            controllerUser.getUserByString(users, tickets, organizations, userStringTerm, ticketStringValue);
                            break;
                        case 3:
                            System.out.println("List term:\n 1. active\n 2. verified\n 3. shared\n 4. suspended");
                            System.out.println("Input user term:");
                            int userBoolean = x.nextInt();
                            String userBooleanTerm = "";
                            switch (userBoolean){
                                case 1:
                                    userBooleanTerm = "has_incidents";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input user boolean value:");
                            Boolean ticketBooleanValue = x.nextBoolean();
                            controllerUser.getUserByBoolean(users, tickets, organizations, userBooleanTerm, ticketBooleanValue);
                            break;
                        default:
                            System.out.println("Input value was wrong. Please choose again !!!");
                            readData();
                            break;
                    }
                    break;
                case 2:
                    int inputTicket = chooseTypeInput(x);

                    switch (inputTicket){
                        case 1:
                            System.out.println("List term:\n 1. submitter_id\n 2. assignee_id\n 3. organization_id");
                            System.out.println("Input ticket term:");
                            int ticketInt = x.nextInt();
                            String ticketIntTerm = "";
                            switch (ticketInt){
                                case 1:
                                    ticketIntTerm = "submitter_id";
                                    break;
                                case 2:
                                    ticketIntTerm = "assignee_id";
                                    break;
                                case 3:
                                    ticketIntTerm = "organization_id";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input ticket integer value:");
                            int ticketInteger = x.nextInt();
                            controllerTicket.getTicketByInteger(users, tickets, organizations, ticketIntTerm, ticketInteger);
                            break;
                        case 2:
                            System.out.println("List term:\n 1. _id\n 2. url\n 3. external_id\n 4. created_at\n 5. type\n 6. subject\n 7. description\n 8. priority\n 9. status\n 10. due_at\n 11. via");
                            System.out.println("Input ticket term:");
                            int ticketString = x.nextInt();
                            String fixBugString = x.nextLine();
                            String ticketStringTerm = "";
                            switch (ticketString){
                                case 1:
                                    ticketStringTerm = "_id";
                                    break;
                                case 2:
                                    ticketStringTerm = "url";
                                    break;
                                case 3:
                                    ticketStringTerm = "external_id";
                                    break;
                                case 4:
                                    ticketStringTerm = "created_at";
                                    break;
                                case 5:
                                    ticketStringTerm = "type";
                                    break;
                                case 6:
                                    ticketStringTerm = "subject";
                                    break;
                                case 7:
                                    ticketStringTerm = "description";
                                    break;
                                case 8:
                                    ticketStringTerm = "priority";
                                    break;
                                case 9:
                                    ticketStringTerm = "status";
                                    break;
                                case 10:
                                    ticketStringTerm = "due_at";
                                    break;
                                case 11:
                                    ticketStringTerm = "via";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input ticket string value:");
                            String ticketStringValue = x.nextLine();
                            controllerTicket.getTicketByString(users, tickets, organizations, ticketStringTerm, ticketStringValue);
                            break;
                        case 3:
                            System.out.println("List term:\n 1. has_incidents");
                            System.out.println("Input ticket term:");
                            int ticketBoolean = x.nextInt();
                            String ticketBooleanTerm = "";
                            switch (ticketBoolean){
                                case 1:
                                    ticketBooleanTerm = "has_incidents";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input ticket boolean value:");
                            Boolean ticketBooleanValue = x.nextBoolean();
                            controllerTicket.getTicketByBoolean(users, tickets, organizations, ticketBooleanTerm, ticketBooleanValue);
                            break;
                        default:
                            System.out.println("Input value was wrong. Please choose again !!!");
                            readData();
                            break;
                    }
                    break;
                case 3:
                    int inputOrganization = chooseTypeInput(x);

                    switch (inputOrganization){
                        case 1:
                            System.out.println("List term:\n 1._id");
                            System.out.println("Input organization term:");
                            int organizationInt = x.nextInt();
                            String organizationIntTerm = "";
                            switch (organizationInt){
                                case 1:
                                    organizationIntTerm = "_id";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input organization integer value:");
                            int organizationIntValue = x.nextInt();
                            controllerOrganization.getOrganizationByInteger(users, tickets, organizations, organizationIntTerm, organizationIntValue);
                            break;
                        case 2:
                            System.out.println("List term:\n 1. url\n 2. external_id\n 3. name\n 4. created_at\n 5. details");
                            System.out.println("Input organization term:");
                            String fixBugString = x.nextLine();
                            int organizationString = x.nextInt();
                            String organizationStringTerm = "";
                            switch (organizationString){
                                case 1:
                                    organizationStringTerm = "url";
                                    break;
                                case 2:
                                    organizationStringTerm = "external_id";
                                    break;
                                case 3:
                                    organizationStringTerm = "name";
                                    break;
                                case 4:
                                    organizationStringTerm = "created_at";
                                    break;
                                case 5:
                                    organizationStringTerm = "details";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input organization string value:");
                            fixBugString = x.nextLine();
                            String organizationStringValue = x.nextLine();
                            controllerOrganization.getOrganizationByString(users, tickets, organizations, organizationStringTerm, organizationStringValue);
                            break;
                        case 3:
                            System.out.println("List term:\n 1. shared_tickets");
                            System.out.println("Input organization term:");
                            int organizationBoolean = x.nextInt();
                            String organizationBooleanTerm = "";
                            switch (organizationBoolean){
                                case 1:
                                    organizationBooleanTerm = "shared_tickets";
                                    break;
                                default:
                                    System.out.println("Input value was wrong. Please choose again !!!");
                                    readData();
                                    break;
                            }
                            System.out.println("Input organization boolean value:");
                            Boolean organizationBooleanValue = x.nextBoolean();
                            controllerOrganization.getOrganizationByBoolean(users, tickets, organizations, organizationBooleanTerm, organizationBooleanValue);
                            break;
                        default:
                            System.out.println("Input value was wrong. Please choose again !!!");
                            readData();
                            break;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Input value was wrong. Please choose again !!!");
                    readData();
                    break;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int chooseTypeInput(Scanner x){
        System.out.println("1. Interger");
        System.out.println("2. String");
        System.out.println("3. Boolean");
        System.out.println("Please choose type input value:");
        int input = x.nextInt();
        return input;
    }

}
