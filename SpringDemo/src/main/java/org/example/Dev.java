package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //Filed Injection
    @Autowired
    @Qualifier("laptop")
    private Computer com;
    /* Constructor Injection*/
    /*
    *  public Dev (Computer com){
        this.com = com;

    }
    * */
    /* setterMethod Injection*/
    /*
    * private void setCom (Computer com){
        this.com = com;
    }
    * */
    public void build(){

        com.compile();
        System.out.println("Working on Project ....!");
    }
}
