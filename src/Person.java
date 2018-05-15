public class Person {


    // here all the attributes should be private to discard accessing them from outside the class
    // they only accessible through getter and setter
    private int counter;     // 0
    private String firstName = "Noor";  // Noor
    private String lastName = "Samir";    // Samir
    private String address="Amman";     // Amman
    private int dateOfBirth = 1990; // 1990
    private String nationality="Jordanian"; // Jordanian
    private String city="Amman";        // Amman
    private int weight=50;	   // 50
    private double height=165;      // 165 cm
    private boolean isMale=false;      // False

    Person(){
        counter++;

    }

    public Person(int counter, String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, int weight, double height, boolean isMale) {
        this.counter = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getFullName(String firstName, String lastName){
        return this.firstName + this.lastName;
    }

    public double getHeightInFeet(double height){
        return this.height = height;
    }

    public int getAge (int age){
        return age;
    }

    public void eating(){
        System.out.println("I am eating...");
        this.weight++;
    }

    public void getInfo() {
        System.out.println("You first Name is :" + this.firstName + "\n" +
                " Your last Name is :" + this.lastName +"\n" +
                " Your address is :" + this.address +"\n" +
                " Your DOB is :" + this.dateOfBirth +"\n" +
                " Your nationality is :" + this.nationality +"\n" +
                " Your city is :" + this.city +"\n" +
                " Your weight is :" + this.weight +"\n" +
                " Your height is :" + this.height +"\n" +
                " Are you male? " + this.isMale
        );

    }
}
