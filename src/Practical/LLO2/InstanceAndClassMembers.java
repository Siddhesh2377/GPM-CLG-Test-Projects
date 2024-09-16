package Practical.LLO2;

import services.U;

class InstanceAndClassMembers {

    //Static / Class Variable
    static int classVar;

    //Instance Variable
    int instanceVar;

    //Parametrize Constructor
    InstanceAndClassMembers(int val) {
        instanceVar = val;
    }

    //Static Class Member
    public static void modify(int val) {
        classVar = val;
    }

    public static void main(String[] args) {

        //Allotting '10' to classVar
        InstanceAndClassMembers.modify(130);

        //Creating Class Objects To Use Instance Variables while Allotting them Values
        InstanceAndClassMembers i1 = new InstanceAndClassMembers(2);
        InstanceAndClassMembers i2 = new InstanceAndClassMembers(4);

        //Displaying those Values
        i1.display();
        i2.display();

        //Editing the classVar value
        InstanceAndClassMembers.modify(230);

        //Displaying those Values
        i1.display();
        i2.display();

    }

    //Instance Class Member
    public void display() {
        U.println("Instance Variable : " + instanceVar);
        U.println("Class Variable : " + classVar);
    }

}
