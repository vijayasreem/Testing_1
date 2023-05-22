package com.sample.test.model;

import javax.persistence.*;

@Entity
@Table(name="publications")
public class Publications {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="name", nullable=false, unique=true)
    private String name;
    
    @Column(name="days", nullable=false)
    private String days;
    
    @Column(name="publisher", nullable=false)
    private String publisher;
    
    @Column(name="active", nullable=false)
    private boolean active;
    
    public Publications(){}
    
    public Publications(String name, String days, String publisher, boolean active){
        this.name = name;
        this.days = days;
        this.publisher = publisher;
        this.active = active;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDays(){
        return days;
    }
    
    public void setDays(String days){
        this.days = days;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public boolean isActive(){
        return active;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    @Override
    public String toString(){
        return "Publications [name=" + name + ", days=" + days + ", publisher=" + publisher + ", active=" + active + "]";
    }
    
}