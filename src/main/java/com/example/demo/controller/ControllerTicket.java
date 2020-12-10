package com.example.demo.controller;

import com.example.demo.model.Organization;
import com.example.demo.model.Ticket;
import com.example.demo.model.TicketShow;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ControllerTicket {
    public static List<Ticket> getTicketByInteger(User[] users, Ticket[] tickets, Organization[] organizations, String term, int integer){
        List<Ticket> ticketByInt = null;
        switch (term) {
            case "submitter_id":
                ticketByInt = Arrays.stream(tickets).filter(o -> o.getSubmitter_id() == integer).collect(Collectors.toList());
                ticketByInt.forEach(o -> showTicket(users, organizations, o));
                break;
            case "assignee_id":
                ticketByInt = Arrays.stream(tickets).filter(o -> o.getAssignee_id() == integer).collect(Collectors.toList());
                ticketByInt.forEach(o -> showTicket(users, organizations, o));
                break;
            case "organization_id":
                ticketByInt = Arrays.stream(tickets).filter(o -> o.getOrganization_id() == integer).collect(Collectors.toList());
                ticketByInt.forEach(o -> showTicket(users, organizations, o));
                break;
            default:
                break;
        }
        if (ticketByInt.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return ticketByInt;
    }

    public static List<Ticket> getTicketByString(User[] users, Ticket[] tickets, Organization[] organizations, String term, String text){
        List<Ticket> ticketByString = null;
        switch (term) {
            case "_id":
                ticketByString = Arrays.stream(tickets).filter(o -> o.get_id().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "url":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getUrl().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "external_id":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getExternal_id().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "created_at":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getCreated_at().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "type":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getType().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "subject":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getSubject().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "description":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getDescription().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "priority":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getPriority().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "status":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getStatus().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "due_at":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getDue_at().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            case "via":
                ticketByString = Arrays.stream(tickets).filter(o -> o.getVia().equals(text)).collect(Collectors.toList());
                ticketByString.forEach(o -> showTicket(users, organizations, o));
                break;
            default:
                break;
        }
        if (ticketByString.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return ticketByString;
    }

    public static List<Ticket> getTicketByBoolean(User[] users, Ticket[] tickets, Organization[] organizations, String term, boolean ticketBoolean){
        List<Ticket> ticketByBoolean = null;
        switch (term) {
            case "has_incidents":
                ticketByBoolean = Arrays.stream(tickets).filter(o -> o.isHas_incidents() == ticketBoolean).collect(Collectors.toList());
                ticketByBoolean.forEach(o -> showTicket(users, organizations, o));
                break;
            default:
                break;
        }
        if (ticketByBoolean.isEmpty()){
            System.out.println("Not found any data !!!");
        }
        return ticketByBoolean;
    }

    public static void showTicket(User[] users, Organization[] organizations, Ticket ticket){
        Optional<User> userSubmitter = Arrays.stream(users).filter(u -> u.get_id() == ticket.getSubmitter_id()).findAny();
        Optional<User> userAssignee = Arrays.stream(users).filter(u -> u.get_id() == ticket.getAssignee_id()).findAny();
        Optional<Organization> organization = Arrays.stream(organizations).filter(t -> t.get_id() == ticket.getOrganization_id()).findAny();
        if (userSubmitter.isPresent() && userAssignee.isPresent() && organization.isPresent()){
            TicketShow ticketShow = new TicketShow();
            ticketShow.setTicket(ticket);
            ticketShow.setSubmitterName(userSubmitter.get().getName());
            ticketShow.setAssigneeName(userAssignee.get().getName());
            ticketShow.setOrganizationName(organization.get().getName());
            System.out.println(ticketShow.toString());
        } else if (!userSubmitter.isPresent()){
            System.out.printf("The Ticket %s haven't enough data with relate Submitter !!! \n", ticket.get_id());
        } else if (!userAssignee.isPresent()){
            System.out.printf("The Ticket %s haven't enough data with relate Assignee !!! \n", ticket.get_id());
        } else if (!organization.isPresent()){
            System.out.printf("The Ticket %s haven't enough data with relate Organization !!! \n", ticket.get_id());
        }
    }
}
