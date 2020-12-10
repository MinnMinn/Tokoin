package com.example.demo.model;

public class UserShow {
    private User user;
    private String assigneeTicketSubject;
    private String submittedTicketSubject;
    private String organizationName;

    public UserShow() {
    }

    public UserShow(User user, String assigneeTicketSubject, String submittedTicketSubject, String organizationName) {
        this.user = user;
        this.assigneeTicketSubject = assigneeTicketSubject;
        this.submittedTicketSubject = submittedTicketSubject;
        this.organizationName = organizationName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAssigneeTicketSubject() {
        return assigneeTicketSubject;
    }

    public void setAssigneeTicketSubject(String assigneeTicketSubject) {
        this.assigneeTicketSubject = assigneeTicketSubject;
    }

    public String getSubmittedTicketSubject() {
        return submittedTicketSubject;
    }

    public void setSubmittedTicketSubject(String submittedTicketSubject) {
        this.submittedTicketSubject = submittedTicketSubject;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "UserShow{" +
                "user=" + user +
                ", assigneeTicketSubject='" + assigneeTicketSubject + '\'' +
                ", submittedTicketSubject='" + submittedTicketSubject + '\'' +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }
}
