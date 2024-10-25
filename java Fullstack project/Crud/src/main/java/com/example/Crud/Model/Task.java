package com.example.Crud.Model;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String productname;
    @Column(name = "product_section")
    private String section;
    @Column(name = "product_price")
    private int productprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    public int getProductprice() {
        return productprice; // Changed to lowercase
    }
    public void setProductprice(int productprice) {
        this.productprice = productprice; // Changed to lowercase
    }

    public String toString(){
         return this.id+" "+this.productname+" "+this.section+" "+this.productprice;
    }

}
