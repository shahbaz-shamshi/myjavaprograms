/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahbaz
 */
public class Account{
    
    
    private String number;
    private Double Balance;
    private String Name;
    private String emailAddress;
    private String phoneNumber;
    
    
    public void AmountDeposit(double deposit){
    
    this.Balance+=deposit;
    
    }
    
    public void AmountWithdrawal(double withdrawal){
    if(Balance-withdrawal>0){
         Balance-=withdrawal;
        System.out.println("remaining balance : "+Balance);
    }
    
    else{
    
        
    
    
    
    }
    
    
    }
    
    
    public void setNumber(String number){
    this.number=number;
    
    }
    
    public String getNumber(){
    return this.number;

    }
    
    
     public void setBalance(Double Balance){
    this.Balance=Balance;
    
    }
    
    public double getBalance(){
    return this.Balance;

    }
    
    
     public void setName(String Name){
    this.Name=Name;
    
    }
    
    public String getName(){
    return this.Name;

    }
    
     public void setemailAddress(String emailAddress){
    this.emailAddress=emailAddress;
    
    }
    
    public String getemailAddress(){
    return this.emailAddress;

    }
    
     public void setphoneNumber(String phoneNumber){
    this.phoneNumber=phoneNumber;
    
    }
    
    public String phoneNumber(){
    return this.phoneNumber;

    }
    
    }
