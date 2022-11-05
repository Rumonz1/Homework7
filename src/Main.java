public class Main {
    public static void main(String[] args) {
        //Задание 1
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = contribution + total;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
        }
        //Задание 2
        int o = 0;
        while (o < 10){
            o++;
            System.out.print(o + " ");
        }
        System.out.println();
        for (int p = 10; p >= 1; p--) {
            System.out.print(p + " ");
        }
        System.out.println();
        //Задание 3
        int population = 12_000_000;
        int fertilityYear = population / 1000 * 17;
        int mortalityYear = 8;
        for (int j = 1; j <= 10; j++) {
            population = fertilityYear + population - mortalityYear;
            System.out.println("Год "+j+" численность населения составляет "+population);
        }
        //Задание 1.2
        int contributionVasily = 15000;
        int extraContibution = contributionVasily / 100 * 7;
        int month = 0;
        while (month <108) {
            month = month + 1;
            contributionVasily = extraContibution * month + contributionVasily;
            if (month % 6 ==0){
            System.out.println("Месяц "+month+" ,сумма накоплений: "+contributionVasily);}
        }
        System.out.println("Через "+month+" месяцев ,будет накоплено "+contributionVasily);
        //
    }
}