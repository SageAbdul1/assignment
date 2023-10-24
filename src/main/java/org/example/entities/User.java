package org.example.entities;

import org.example.enums.StateOfOrigin;

public abstract class User {
    private String name;
     private int age;
     private Long phoneNumber;

 @Override
 public String toString() {
  return "User{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", phoneNumber=" + phoneNumber +
          ", address='" + address + '\'' +
          ", position='" + position + '\'' +
          ", iD=" + iD +
          ", stateOfOrigin=" + stateOfOrigin +
          '}';
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public Long getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(Long phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getPosition() {
  return position;
 }

 public void setPosition(String position) {
  this.position = position;
 }

 public Long getiD() {
  return iD;
 }

 public void setiD(Long iD) {
  this.iD = iD;
 }

 public StateOfOrigin getStateOfOrigin() {
  return stateOfOrigin;
 }

 public void setStateOfOrigin(StateOfOrigin stateOfOrigin) {
  this.stateOfOrigin = stateOfOrigin;
 }

 private String address;
     private String position;
     private Long iD;
     private StateOfOrigin stateOfOrigin;



}
