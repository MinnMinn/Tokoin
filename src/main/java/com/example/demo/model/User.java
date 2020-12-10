package com.example.demo.model;

import java.util.Arrays;

public class User {
    private int _id;
    private String url;
    private String external_id;
    private String name;
    private String alias;
    private String created_at;
    private boolean active;
    private boolean verified;
    private boolean shared;
    private String locale;
    private String timezone;
    private String last_login_at;
    private String email;
    private String phone;
    private String signature;
    private int organization_id;
    private String[] tags;
    private boolean suspended;
    private String role;

    public User() {
    }

    public User(int _id, String url, String external_id, String name, String alias, String created_at, boolean active, boolean verified, boolean shared, String locale, String timezone, String last_login_at, String email, String phone, String signature, int organization_id, String[] tags, boolean suspended, String role) {
        this._id = _id;
        this.url = url;
        this.external_id = external_id;
        this.name = name;
        this.alias = alias;
        this.created_at = created_at;
        this.active = active;
        this.verified = verified;
        this.shared = shared;
        this.locale = locale;
        this.timezone = timezone;
        this.last_login_at = last_login_at;
        this.email = email;
        this.phone = phone;
        this.signature = signature;
        this.organization_id = organization_id;
        this.tags = tags;
        this.suspended = suspended;
        this.role = role;
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

    public String getAlias() {
        if (alias == null){
            return "";
        }
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getLocale() {
        if (locale == null){
            return "";
        }
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getTimezone() {
        if (timezone == null){
            return "";
        }
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLast_login_at() {
        if (last_login_at == null){
            return "";
        }
        return last_login_at;
    }

    public void setLast_login_at(String last_login_at) {
        this.last_login_at = last_login_at;
    }

    public String getEmail() {
        if (email == null){
            return "";
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        if (phone == null){
            return "";
        }
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSignature() {
        if (signature == null){
            return "";
        }
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public String getRole() {
        if (role == null){
            return "";
        }
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id=" + _id +
                ", url='" + url + '\'' +
                ", external_id='" + external_id + '\'' +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", created_at='" + created_at + '\'' +
                ", active=" + active +
                ", verified=" + verified +
                ", shared=" + shared +
                ", locale='" + locale + '\'' +
                ", timezone='" + timezone + '\'' +
                ", last_login_at='" + last_login_at + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", signature='" + signature + '\'' +
                ", organization_id=" + organization_id +
                ", tags=" + Arrays.toString(tags) +
                ", suspended=" + suspended +
                ", role='" + role + '\'' +
                '}';
    }
}
