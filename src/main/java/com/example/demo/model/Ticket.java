package com.example.demo.model;

import java.util.Arrays;

public class Ticket {
    private String _id;
    private String url;
    private String external_id;
    private String created_at;
    private String type;
    private String subject;
    private String description;
    private String priority;
    private String status;
    private int submitter_id;
    private int assignee_id;
    private int organization_id;
    private String[] tags;
    private boolean has_incidents;
    private String due_at;
    private String via;

    public Ticket() {
    }

    public Ticket(String _id, String url, String external_id, String created_at, String type, String subject, String description, String priority, String status, int submitter_id, int assignee_id, int organization_id, String[] tags, boolean has_incidents, String due_at, String via) {
        this._id = _id;
        this.url = url;
        this.external_id = external_id;
        this.created_at = created_at;
        this.type = type;
        this.subject = subject;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.submitter_id = submitter_id;
        this.assignee_id = assignee_id;
        this.organization_id = organization_id;
        this.tags = tags;
        this.has_incidents = has_incidents;
        this.due_at = due_at;
        this.via = via;
    }

    public String get_id() {
        if (_id == null){
            return "";
        }
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUrl() {
        if (url == null){
            return "";
        }
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExternal_id() {
        if (external_id == null){
            return "";
        }
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getCreated_at() {
        if (created_at == null){
            return "";
        }
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        if (type == null){
            return "";
        }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        if (subject == null){
            return "";
        }
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        if (description == null){
            return "";
        }
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        if (priority == null){
            return "";
        }
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        if (status == null){
            return "";
        }
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(int submitter_id) {
        this.submitter_id = submitter_id;
    }

    public int getAssignee_id() {
        return assignee_id;
    }

    public void setAssignee_id(int assignee_id) {
        this.assignee_id = assignee_id;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public boolean isHas_incidents() {
        return has_incidents;
    }

    public void setHas_incidents(boolean has_incidents) {
        this.has_incidents = has_incidents;
    }

    public String getDue_at() {
        if (due_at == null){
            return "";
        }
        return due_at;
    }

    public void setDue_at(String due_at) {
        this.due_at = due_at;
    }

    public String getVia() {
        if (via == null){
            return "";
        }
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "_id='" + _id + '\'' +
                ", url='" + url + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at='" + created_at + '\'' +
                ", type='" + type + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", submitter_id=" + submitter_id +
                ", assignee_id=" + assignee_id +
                ", organization_id=" + organization_id +
                ", tags=" + Arrays.toString(tags) +
                ", has_incidents=" + has_incidents +
                ", due_at='" + due_at + '\'' +
                ", via='" + via + '\'' +
                '}';
    }
}
