package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard myIdentityCard=new IdentityCard();
        myIdentityCard.fullname="Broslavev Ivan Petrovich";
        myIdentityCard.sex="M";
        myIdentityCard.dateOfBirth="24.11.1996";
        myIdentityCard.nationality="UKR";
        myIdentityCard.documentNo="AO785612";

        System.out.println("\nMy IdentityCard info:");
        System.out.println("Title: " + myIdentityCard.fullname);
        System.out.println("Sex: " + myIdentityCard.sex);
        System.out.println("Date Of Birth: " + myIdentityCard.dateOfBirth);
        System.out.println("Nationality: " + myIdentityCard.nationality);
        System.out.println("DocumentNo: " + myIdentityCard.documentNo);
    }
}
