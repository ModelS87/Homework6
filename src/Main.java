public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int a = 1; a <= 10; a = a + 1) {
            System.out.println(a);
        }
for (int b = 10; b >=1; b = b - 1) {
    System.out.println(b);
}
for (int c = 0; c<=17; c = c+2) {
        System.out.println(c);
    }
for (int d = 10; d >= -10; d = d-1) {
    System.out.println(d);
}
for (int e = 1904; e<2096; e = e+4) {
    System.out.println( e + " год является високосным.");
}
for (int f = 7; f<=98; f = f+7) {
    System.out.println(f);
}
for (int g = 1; g<=512; g = g*2)   {
    System.out.println(g);
}
int reserve = 29000;
int totalReserve = 0;
for (int h = 0; h<12; h++) {
    totalReserve = totalReserve + reserve;
    System.out.println( "Месяц " + h + " сумма накоплений равна " + totalReserve + " рублей.");
}
int reserve1 = 29000;
int totalReserve1 = 0;
for (int i = 0; i<12; i++) {
    totalReserve1 = totalReserve1 + totalReserve1/100;
    totalReserve1 = totalReserve1 + reserve1;
    System.out.println("Месяц " + i + " сумма накоплений равна " + totalReserve1 + " рублей.");
}
int summa = 1;
for (int j  = 1; j <= 10; j++) {
    summa = 2*j;
    System.out.println("2 * "+ j + " = " + summa);
}
    }
}