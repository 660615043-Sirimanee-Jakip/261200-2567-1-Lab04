public class HealthRecord {
    private String patientName;
    private int age;

    private int height;
    private static final int MIN_ALLOWED_HEIGHT = 1;
    private static final int MAX_ALLOWED_AGE = 500;
    public static int minHeight = 500;
    public static int maxHeight = 1;

    private int weight;
    private static final int MIN_ALLOWED_WEIGHT = 1;
    private static final int MAX_ALLOWED_WEIGHT = 300;
    public static int minWeight = 300;
    public static int maxWeight = 1;

    private int id;

    public HealthRecord(String patientName, int age, int height, int weight, int id) {
        this.patientName = patientName;
        this.age = age;
        if (height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_AGE)
            this.height = 150;
        else {
            this.height = height;
            if (height > maxHeight)
                maxHeight = height;
            if (height < minHeight)
                minHeight = height;
        }
        if (weight < MIN_ALLOWED_WEIGHT || weight > MAX_ALLOWED_WEIGHT)
            this.weight = 50;
        else {
            this.weight = weight;
            if (weight > maxWeight)
                maxWeight = weight;
            if (weight < minWeight)
                minWeight = weight;
        }
        this.id = id;
    }
    public String getPatientName() {
        return patientName;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public static int getMinHeight(){
        return minHeight;
    }
    public static int getMaxHeight(){
        return maxHeight;
    }
    public static int getMinWeight(){
        return minWeight;
    }
    public static int getMaxWeight(){
        return maxWeight;
    }
    public int getId() {
        return id;
    }
}
