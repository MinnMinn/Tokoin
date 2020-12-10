package com.example.demo.controller;

import com.example.demo.model.Organization;
import com.example.demo.model.OrganizationShow;
import com.example.demo.model.Ticket;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ControllerOrganization {
    public static List<Organization> getOrganizationByInteger(User[] users, Ticket[] tickets, Organization[] organizations, String term, int organizationInteger){
        List<Organization> organizationByInt = null;
        switch (term) {
            case "_id":
                organizationByInt = Arrays.stream(organizations).filter(o -> o.get_id() == organizationInteger).collect(Collectors.toList());
                organizationByInt.forEach(o -> showOrganization(users, tickets, o));
                break;
            default:
                break;
        }
        if (organizationByInt.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return organizationByInt;
    }

    public static List<Organization> getOrganizationByString(User[] users, Ticket[] tickets, Organization[] organizations, String term, String organizationString){
        List<Organization> organizationByString = null;
        switch (term){
            case "url":
                organizationByString = Arrays.stream(organizations).filter(o -> o.getUrl().equals(organizationString)).collect(Collectors.toList());
                organizationByString.forEach(o -> showOrganization(users, tickets, o));
                break;
            case "external_id":
                organizationByString = Arrays.stream(organizations).filter(o -> o.getExternal_id().equals(organizationString)).collect(Collectors.toList());
                organizationByString.forEach(o -> showOrganization(users, tickets, o));
                break;
            case "name":
                organizationByString = Arrays.stream(organizations).filter(o -> o.getName().equals(organizationString)).collect(Collectors.toList());
                organizationByString.forEach(o -> showOrganization(users, tickets, o));
                break;
            case "created_at":
                organizationByString = Arrays.stream(organizations).filter(o -> o.getCreated_at().equals(organizationString)).collect(Collectors.toList());
                organizationByString.forEach(o -> showOrganization(users, tickets, o));
                break;
            case "details":
                organizationByString = Arrays.stream(organizations).filter(o -> o.getDetails().equals(organizationString)).collect(Collectors.toList());
                organizationByString.forEach(o -> showOrganization(users, tickets, o));
                break;
            default:
                break;
        }
        if (organizationByString.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return organizationByString;
    }

    public static List<Organization> getOrganizationByBoolean(User[] users, Ticket[] tickets, Organization[] organizations, String term, boolean organizationBoolean){
        List<Organization> organizationByBoolean = null;
        switch (term) {
            case "shared_tickets":
                organizationByBoolean = Arrays.stream(organizations).filter(o -> o.isShared_tickets() == organizationBoolean).collect(Collectors.toList());
                organizationByBoolean.forEach(o -> showOrganization(users, tickets, o));
                break;
            default:
                break;
        }
        if (organizationByBoolean.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return organizationByBoolean;
    }

    public static void showOrganization(User[] users, Ticket[] tickets, Organization organization){
        Optional<User> user = Arrays.stream(users).filter(u -> u.getOrganization_id() == organization.get_id()).findFirst();
        Optional<Ticket> ticket = Arrays.stream(tickets).filter(t -> t.getOrganization_id() == organization.get_id()).findFirst();
        if (user.isPresent() && ticket.isPresent()){
            OrganizationShow organizationShow = new OrganizationShow();
            organizationShow.setOrganization(organization);
            organizationShow.setUserName(user.get().getName());
            organizationShow.setTicketSubject(ticket.get().getSubject());
            System.out.println(organizationShow.toString());
        } else if (!user.isPresent()){
            System.out.printf("The Organization %s haven't enough data with relate User!!! \n", organization.get_id());
        } else if (!ticket.isPresent()){
            System.out.printf("The Organization %s haven't enough data with relate Ticket!!! \n", organization.get_id());
        }
    }
}
