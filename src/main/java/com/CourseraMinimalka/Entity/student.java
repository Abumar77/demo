package com.CourseraMinimalka.Entity;


import javax.persistence.*;

@Entity
 public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

     private Long id;

     private String fullname;

     private String email;

     private String password;

    public student(String fullname, String email, String password) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }

    public student(){


    }
}
