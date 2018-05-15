public class Main {

    public static void main(String[] args) {


        Person[] personArr = new Person[4];


        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = new Person();
        }
//
//        personArr[0].firstName = "Hussein";
//        personArr[0].lastName = "Tirawi";
//        personArr[0].address = "Amman";
//        personArr[0].dateOfBirth = 1988;
//        personArr[0].nationality = "Jordanian";
//        personArr[0].city = "Amman";
//        personArr[0].weight = 65;
//        personArr[0].height = 178;
//        personArr[0].isMale = true;


        personArr[0].setFirstName("Hussein");
        personArr[0].setLastName("Tirawiii");
        personArr[0].setAddress("Amman");
        personArr[0].setDateOfBirth(1988);
        personArr[0].setNationality("Jordanian");
        personArr[0].setCity("Amman");
        personArr[0].setWeight(65);
        personArr[0].setHeight(178);
        personArr[0].setMale(true);

        personArr[0].getInfo();

    }
}
