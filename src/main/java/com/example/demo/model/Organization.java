package com.example.demo.model;

import java.util.Arrays;
import java.util.Collection;

public class Organization {
    private int _id;
    private String url;
    private String external_id;
    private String name;
    private String[] domain_names;
    private String created_at;
    private String details;
    private boolean shared_tickets;
    private String[] tags;

    public Organization() {
    }

    public Organization(int _id, String url, String external_id, String name, String[] domain_names, String created_at, String details, boolean shared_tickets, String[] tags) {
        this._id = _id;
        this.url = url;
        this.external_id = external_id;
        this.name = name;
        this.domain_names = domain_names;
        this.created_at = created_at;
        this.details = details;
        this.shared_tickets = shared_tickets;
        this.tags = tags;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
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

    public String getName() {
        if (name == null){
            return "";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDomain_names() {
        return domain_names;
    }

    public void setDomain_names(String[] domain_names) {
        this.domain_names = domain_names;
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

    public String getDetails() {
        if (details == null){
            return "";
        }
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isShared_tickets() {
        return shared_tickets;
    }

    public void setShared_tickets(boolean shared_tickets) {
        this.shared_tickets = shared_tickets;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "_id=" + _id +
                ", url='" + url + '\'' +
                ", external_id='" + external_id + '\'' +
                ", name='" + name + '\'' +
                ", domain_names=" + Arrays.toString(domain_names) +
                ", created_at='" + created_at + '\'' +
                ", details='" + details + '\'' +
                ", shared_tickets=" + shared_tickets +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
