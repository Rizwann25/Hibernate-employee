package com.atmecs.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class ClassEmployee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "Empid")
private int Empid;

@Column(name = "EmpLastName")
private String EmpLastName;

@Column(name = "EmpFirstName")
private String EmpFirstName;

@Column(name = "EmpDesignation")
private String EmpDesignation;

@Column(name = "EmpSalary")
private int EmpSalary;

public ClassEmployee() {

}


public ClassEmployee (int Empid, String EmpLastName, String EmpFirstName, String EmpDesignation, double Empsalary) {

this.Empid = Empid;
this.EmpLastName = EmpLastName;
this.EmpFirstName = EmpFirstName;
this.EmpDesignation = EmpDesignation;
this.EmpSalary = EmpSalary;
}

public int getEmpId() {
return Empid;
}

public void setId() {
this.Empid = Empid;
}

public String getEmpLastName() {
return EmpLastName;
}

public void setEmpLastName() {
this.EmpLastName = EmpLastName;
}

public String getEmpFirstName() {
return EmpFirstName;
}

public void setEmpFirstName() {
this.EmpFirstName = EmpFirstName;
}

public String getEmpDesignation() {
return EmpDesignation;

}
public void setEmpDesignation() {
this.EmpDesignation = EmpDesignation;

}

public int getEmpSalary() {
return EmpSalary;

}
public void setEmpSalary() {
this.EmpSalary = EmpSalary;
}

}