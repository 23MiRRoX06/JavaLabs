package ua.lviv.iot.firstLab;

public class ElectricLampRunner {

    public static void main(String [] args) {
        ElectricLamp officeLamp = new ElectricLamp();
        System.out.println(officeLamp);
        ElectricLamp sewingLamp = new ElectricLamp("OttLite", "China", 360, 24);
        System.out.println(sewingLamp);
        ElectricLamp studyLamp = new ElectricLamp("FunDesk", "China", 360, 10, "white", 1, "plastic", "hi-tech");
        System.out.println(studyLamp);
        officeLamp.printHeightInMillimeters();
        ElectricLamp.printStaticHeightInMillimeters();
        ElectricLamp [] setOfLamps = new ElectricLamp [4];
        int setOfLampsIndex = 0;
        while (setOfLampsIndex < 4) {
            setOfLamps[setOfLampsIndex] = new ElectricLamp();
            setOfLampsIndex++;
        }
        for (ElectricLamp arrayOfLampsIndex : setOfLamps){
            System.out.println(arrayOfLampsIndex);
        }
    }

}
