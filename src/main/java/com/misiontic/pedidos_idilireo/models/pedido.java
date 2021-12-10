package com.misiontic.pedidos_idilireo.models;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class pedido {
    @Id
    private String          username;
    private List<String>    products = new ArrayList<String>();
    private Date            dateGenerate;
    private Integer         totalPrice;

    public pedido(String username, List products, Date dateGenerate, Integer totalPrice){
        this.username     = username;
        this.products     = products;
        this.dateGenerate = dateGenerate;
        this.totalPrice   = totalPrice;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public List getProducts(){
        return products;
    }

    public void setProducts(List products){
        this.products = products;
    }

    public Date getDateGenerate(){
        return dateGenerate;
    }

    public void setDateGenerate(Date dateGenerate){
        this.dateGenerate = dateGenerate;
    }

    public Integer getTotalPrice(){
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice){
        this.totalPrice = totalPrice;
    }
}


