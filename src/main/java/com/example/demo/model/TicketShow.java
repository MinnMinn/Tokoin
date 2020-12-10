package com.example.demo.model;

public class TicketShow {
    private Ticket ticket;
    private String submitterName;
    private String assigneeName;
    private String organizationName;

    public TicketShow() {
    }

    public TicketShow(Ticket ticket, String submitterName, String assigneeName, String organizationName) {
        this.ticket = ticket;
        this.submitterName = submitterName;
        this.assigneeName = assigneeName;
        this.organizationName = organizationName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "TicketShow{" +
                "ticket=" + ticket +
                ", submitterName='" + submitterName + '\'' +
                ", assigneeName='" + assigneeName + '\'' +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }
}
