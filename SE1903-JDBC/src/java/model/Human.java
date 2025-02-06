/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author king
 */
public class Human {
    int HumanID;
    String HumanName;
    String HumanDOB;
    String HumanGender;
    int TypeID;

    public Human() {
    }

    public Human(int HumanID, String HumanName, String HumanDOB, String HumanGender, int TypeID) {
        this.HumanID = HumanID;
        this.HumanName = HumanName;
        this.HumanDOB = HumanDOB;
        this.HumanGender = HumanGender;
        this.TypeID = TypeID;
    }

    public int getHumanID() {
        return HumanID;
    }

    public String getHumanName() {
        return HumanName;
    }

    public String getHumanDOB() {
        return HumanDOB;
    }

    public String getHumanGender() {
        return HumanGender;
    }

    public int getTypeID() {
        return TypeID;
    }

    @Override
    public String toString() {
        return "Human{" + "HumanID=" + HumanID + ", HumanName=" + HumanName + ", HumanDOB=" + HumanDOB + ", HumanGender=" + HumanGender + ", TypeID=" + TypeID + '}';
    }
      
}
