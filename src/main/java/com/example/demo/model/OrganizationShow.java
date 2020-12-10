package com.example.demo.model;

import java.util.Optional;

public class OrganizationShow {
    private Organization organization;
    private String userName;
    private String ticketSubject;

    public OrganizationShow() {
    }

    public OrganizationShow(Organization organization, String userName, String ticketSubject) {
        this.organization = organization;
        this.userName = userName;
        this.ticketSubject = ticketSubject;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTicketSubject() {
        return ticketSubject;
    }

    public void setTicketSubject(String ticketSubject) {
        this.ticketSubject = ticketSubject;
    }

    @Override
    public String toString() {
        return "OrganizationShow{" +
                "organization=" + organization.toString() +
                ", userName='" + userName + '\'' +
                ", ticketSubject='" + ticketSubject + '\'' +
                '}';
    }
}
