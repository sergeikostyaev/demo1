package com.example.demo.course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("Taking book from uni ");
    }


    public String returnBook(){
        System.out.println("Returning book from uni");
        return "War and peace";
    }

    public void getMagazine(){
        System.out.println("Getting magazine from uni");
    }

    public void returnMagazine(){
        System.out.println("returning magazine from uni");
    }

    public void addBook(String name, Book book){
        System.out.println("adding book from uni");
    }

    public void addMagazine(){
        System.out.println("adding magazine to uni");
    }



}
