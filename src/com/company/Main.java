package com.company;

public class Main {

    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle(35000,"Toyota","Supra"); - rozwiązanie, które wywoła błąd kompilacji ze względu na klasę anstrakcyjną "Vehicle"
        //Vehicle v2 = new Vehicle(10000,"Skoda","Fabia"); - rozwiązanie, które wywoła błąd kompilacji ze względu na klasę anstrakcyjną "Vehicle"
        Vehicle v3 = new Car(35000, "Toyota", "Supra", "Sedan");
        Vehicle v4 = new Car(10000,"Skoda","Fabia", "Sedan");

        Car c1 = new Car(75000,"Ford","Mustang","FastBack");
        Car c2 = new Car(150000,"Mitsubishi","Lancer","Sedan");
        Motorcycle m1 = new Motorcycle(25000,"Honda","CBR 1000","Lancuch");
        Motorcycle m2 = new Motorcycle(1500,"Java","250","Lancuch");

        Product[] pojazdy = new Product[6];
        pojazdy[0] =v3;
        pojazdy[1] = v4;
        pojazdy[2] = c1;
        pojazdy[3] = c2;
        pojazdy[4] = m1;
        pojazdy[5] = m2;
        for(int i=0;i<6;i++)
        {
            System.out.println("Marka: " + ((Vehicle)pojazdy[i]).getBrand() + ", Model: " + ((Vehicle)pojazdy[i]).getModel() + ", Cena: " + ((Vehicle)pojazdy[i]).price + ", Cena promocyjna: " + ((Vehicle)pojazdy[i]).calculateBargainPrice());
        }

//W mainie prubójemy zaimplementować obiekt klasy abstrakcyjnej (możemy implementować tylko obiekty zwykłej klasy), czego zrobić nie można. Program się nie skompiluje.
//Można do obiektu klasy "Vehicle" przypisać jakiś obiekt klasy dziedziczącej po "Vehicle": "Car" lub "Motorcycle" - tak jak zrobiłem to dla zmiennych v3 i v4.
    }
}
