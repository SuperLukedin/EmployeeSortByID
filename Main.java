package com.Luke;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Company newCompany = new Company("Luke's");
        Employee Luke = new Employee("Luke",70,"pp54@njasit.edu");
        Employee Sara = new Employee("Sara",18,"xl332385@njvcsit.edu");
        Employee Yuchen = new Employee("Yuchen",7,"ttgg12354@ncjxit.edu");
        Employee Xinglei = new Employee("Xinglei",56,"yp54@njhhtit.edu");
        Employee BB = new Employee("Baby",10,"7758@njieet.edu");

        newCompany.addEmployee(Luke);
        newCompany.addEmployee(Sara);
        newCompany.addEmployee(Yuchen);
        newCompany.addEmployee(Xinglei);
        newCompany.addEmployee(BB);

        int[] idList = IDList(newCompany);
        System.out.println(Arrays.toString(idList));
        System.out.println("***************************");
        int[] sortedList = sort(idList);   // Arrange employee's ID in an ascending order.
        System.out.println(Arrays.toString(sortedList));
    }
    public static int[] IDList(Company company){
        int[] IDList = new int[company.getMembers().size()];
        for (int i = 0; i < company.getMembers().size(); i++){
            IDList[i] = company.getMembers().get(i).getId();
        }
        return IDList;
    }
    public static int[] sort(int[] IDList) {    //Insertion sort
        for (int i = 0; i < IDList.length; i++){
            int current = IDList[i];
            int j = i - 1;
            while(j >= 0 && IDList[j] > current){
                IDList[j+1] = IDList[j];
                j--;
            }
            IDList[j+1] = current;
        }
        return IDList;
    }
}

