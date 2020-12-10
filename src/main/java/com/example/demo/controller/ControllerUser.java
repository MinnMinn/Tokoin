package com.example.demo.controller;

import com.example.demo.model.Organization;
import com.example.demo.model.Ticket;
import com.example.demo.model.User;
import com.example.demo.model.UserShow;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ControllerUser {
    public static List<User> getUserInteger(User[] users, Ticket[] tickets, Organization[] organizations, String term, int userInteger){
        List<User> userByInt = null;
        switch (term) {
            case "_id":
                userByInt = Arrays.stream(users).filter(o -> o.get_id() == userInteger).collect(Collectors.toList());
                userByInt.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "organization_id":
                userByInt = Arrays.stream(users).filter(o -> o.getOrganization_id() == userInteger).collect(Collectors.toList());
                userByInt.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            default:
                break;
        }
        if (userByInt.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return userByInt;
    }

    public static List<User> getUserByString(User[] users, Ticket[] tickets, Organization[] organizations, String term, String userString){
        List<User> userByString = null;
        switch (term){
            case "url":
                userByString = Arrays.stream(users).filter(o -> o.getUrl().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "external_id":
                userByString = Arrays.stream(users).filter(o -> o.getExternal_id().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "name":
                userByString = Arrays.stream(users).filter(o -> o.getName().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "alias":
                userByString = Arrays.stream(users).filter(o -> o.getAlias().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "created_at":
                userByString = Arrays.stream(users).filter(o -> o.getCreated_at().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "locale":
                userByString = Arrays.stream(users).filter(o -> o.getLocale().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "timezone":
                userByString = Arrays.stream(users).filter(o -> o.getTimezone().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "last_login_at":
                userByString = Arrays.stream(users).filter(o -> o.getLast_login_at().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "email":
                userByString = Arrays.stream(users).filter(o -> o.getEmail().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "phone":
                userByString = Arrays.stream(users).filter(o -> o.getPhone().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "signature":
                userByString = Arrays.stream(users).filter(o -> o.getSignature().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "role":
                userByString = Arrays.stream(users).filter(o -> o.getRole().equals(userString)).collect(Collectors.toList());
                userByString.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            default:
                break;
        }
        if (userByString.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return userByString;
    }

    public static List<User> getUserByBoolean(User[] users, Ticket[] tickets, Organization[] organizations, String term, boolean userBoolean){
        List<User> userByBoolean = null;
        switch (term) {
            case "active":
                userByBoolean = Arrays.stream(users).filter(o -> o.isActive() == userBoolean).collect(Collectors.toList());
                userByBoolean.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "verified":
                userByBoolean = Arrays.stream(users).filter(o -> o.isVerified() == userBoolean).collect(Collectors.toList());
                userByBoolean.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "shared":
                userByBoolean = Arrays.stream(users).filter(o -> o.isShared() == userBoolean).collect(Collectors.toList());
                userByBoolean.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            case "suspended":
                userByBoolean = Arrays.stream(users).filter(o -> o.isSuspended() == userBoolean).collect(Collectors.toList());
                userByBoolean.forEach(o -> showUser(users, organizations, tickets, o));
                break;
            default:
                break;
        }
        if (userByBoolean.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return userByBoolean;
    }

    public static void showUser(User[] users, Organization[] organizations, Ticket[] tickets, User user){
        Optional<Organization> organization = Arrays.stream(organizations).filter(u -> u.get_id() == user.getOrganization_id()).findFirst();
        Optional<Ticket> ticket = Arrays.stream(tickets).filter(t -> t.getOrganization_id() == user.getOrganization_id()).findFirst();

        Optional<User> userSubmitter = Arrays.stream(users).filter(u -> u.get_id() == ticket.get().getSubmitter_id()).findAny();
        Optional<User> userAssignee = Arrays.stream(users).filter(u -> u.get_id() == ticket.get().getAssignee_id()).findAny();

        if (organization.isPresent() && ticket.isPresent()){
            UserShow userShow = new UserShow();
            userShow.setUser(user);
            userShow.setOrganizationName(organization.get().getName());
            userShow.setSubmittedTicketSubject(userSubmitter.get().getName());
            userShow.setAssigneeTicketSubject(userAssignee.get().getName());
            System.out.println(userShow.toString());
        } else if (!organization.isPresent()){
            System.out.printf("The User %s haven't enough data with relate Organization !!! \n", user.get_id());
        } else if (!ticket.isPresent()){
            System.out.printf("The User %s haven't enough data with relate Ticket !!! \n", user.get_id());
        }
    }
}
