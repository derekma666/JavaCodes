package Amigoscode;

import java.time.LocalDate;

public class Passports {
    public static void main(String[] args) {
        //classes
        Passport ukPassport = new Passport("1234",
                "UK",
                LocalDate.of(2025,1,1)
        );

        Passport usPassport = new Passport(
                "12999",
                "USA",
                LocalDate.of(2030,1,1)
        );
        System.out.println(ukPassport);
        System.out.println(usPassport);

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number,
                 String country,
                 LocalDate expiryDate
                 ){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "number='" + number + '\'' +
                    ", country='" + country + '\'' +
                    ", expiryDate=" + expiryDate +
                    '}';
        }
    }
}
