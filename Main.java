public class Main {
    public static void main(String[] args) {
        HealthRecord hr = new HealthRecord("renny",20,173,65,54321);
        HealthRecord hr2 = new HealthRecord("sunny",12,160,40,34566);
        HealthRecord hr3 = new HealthRecord("bubu",18,180,67,98763);
        HealthRecord hr4 = new HealthRecord("cloud",57,189,56,23456);

        System.out.println("Patient Name: " + hr.getPatientName());
        System.out.println("Patient Age" + hr.getAge());
        System.out.println("Height " + hr.getHeight() + " centimeters");
        System.out.println("Weight " + hr.getWeight() + " kilograms");
        System.out.println("MinHeight " + HealthRecord.getMinHeight() + " centimeters");
        System.out.println("MaxHeight " + HealthRecord.getMaxHeight() + " centimeters");
        System.out.println("MinWeight " + HealthRecord.getMinWeight() + " kilograms");
        System.out.println("MaxWeight " + HealthRecord.getMaxWeight() + " kilograms");
        System.out.println("Patient ID: " + hr.getId());
    }
}
