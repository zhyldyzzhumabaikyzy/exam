package com.company;

public class Main {

    public static void main(String[] args) {
	//№1
        /*Азамат
                ойногону
        кетти
        Жогоруда корсотулгондой кылып консольго чыгарыныз!

        System.out.println("Азамат");
        System.out.println("\t\tойногону");
        System.out.println("\t\t\t\t\tкетти"); */

        //№2
        /* Консолдон уч сан алып, алардын суммасын, кобойтуусун жана
        арифметикалык орточо санын табыш керек.
        Мисалы консолго:
        5 7 8 деп жазып
        Жообу катары томондогудой жоопту алышыбыз керек:
        5 + 7 + 8 = 20
        5 * 7 * 8 = 280
        (5 + 7 + 8) / 3 = 6.6666666667 чекиттен кийинки сандар да чыгышы керек.

        Scanner zhyldyz = new Scanner(System.in);
        System.out.println("Каалаган уч санын жазыныз: ");
        int a = zhyldyz.nextInt();
        int b = zhyldyz.nextInt();
        int c = zhyldyz.nextInt();

        int summasi = a + b + c;
        System.out.printf("%d + %d + %d = %d",a, b, c,summasi);

        int koboytundu = a * b * c;
        System.out.printf("\n%d * %d * %d = %d",a, b, c,koboytundu);

        float ortochoSan = (a + b + c)/3f;
        System.out.printf("\n(%d + %d + %d) / 3 = %f",a, b, c,ortochoSan); */


        //№3-1
        /* Уч убакыт брилген консольдон (саат, минута, секунда)
        Ал убакытты секундага айландырып консольго чыгарыныз
        Мисалы: 1 1 1
        Жооп: 3661

        Scanner sc = new Scanner(System.in);
        int saat = sc.nextInt();
        int minuta = sc.nextInt();
        int secunda = sc.nextInt();

        System.out.println((saat * 3600) + (minuta * 60) + secunda); */

        //№3-2

        /* Уч орундуу санды консольдон бериниз
        Ар бир сандын арасына утур койуп консольдон чыгарынз
        Мисалы: 321
        Жооп: 3,2,1

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        System.out.println(b + "," + c + "," + d); */

        //№4

        /* int тибиндеги бир озгормо тузунуз.

        Кайсы кунго туш келсе ошол куну окуган сабагынызды консольго чыгарыныз.


        Мисалы: эгерде 1 болсо анда жава сабагы болот, эгерде 2 болсо анда техникалык англис тили болот, эгерде 6 болсо анда сабак болбойт ж.б
        Эскертуу 2 вариантта жибериниз, биринчисин if else менен, экинчисин switch case менен чыгарыныз.

        Scanner sc = new Scanner(System.in);
        int kun = sc.nextInt();
        if (kun == 1 || kun == 3 || kun == 5){
        System.out.println("Техникалык сабак болот");
        } else if (kun == 2){
        System.out.println("English жана практикалык сабак болот");
        } else if (kun == 4){
        System.out.println("Soft skills жана практикалык сабак болот");
        } else if (kun == 6){
        System.out.println("Кошумча практикалык сабак болот");
        } else if (kun == 7){
        System.out.println("English сабагы болот");
        } else {
        System.out.println("Мындай кун жок");
        }

        int kun2 = sc.nextInt();
        switch (kun2){
        case 1,3,5 :
        System.out.println("Техникалык сабак болот");
        break;
        case 2:
        System.out.println("English жана практикалык сабак болот");
        break;
        case 4:
        System.out.println("Soft skills жана практикалык сабак болот");
        break;
        case 6:
        System.out.println("Кошумча практикалык сабак болот");
        break;
        case 7:
        System.out.println("English сабагы болот");
        break;
        default:
        System.out.println("Мындай кун жок"); */

        //№5-1

        /* Консольдон эки сан алыныз. (0 < A < B)
        Алардын арасындагы так сандарды консольго чыгарыныз.
        Мисалы:
        10 20
        Жооп:
        11 13 15 17 19

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a > 0 && a < b) {
        if (b % 2 != 0) {
        System.out.print(b + " ");
        }
        b--;
        } */

        //№5-2

        /* Консолдон бир сан бериниз.
        Ал санга чейинки сандардын суммасын табыныз.
        Мисалы:
        10
        Жооп:
        55 -> себеби 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int eseptegich = c;
        while (c > 0) {
        c--;
        eseptegich += c;
        }
        System.out.println(eseptegich); */

        //№6

        /* 1ден 10го чейинки сан алыныз. Ал сандын факториалын консольго чыгарып бериниз.
        Мисалы:
        5
        Жооп:
        120

        n санынын факториалы - 1 ден n ге чейинки сандардын кобойтуусу

        n! = 1 * 2...n
        3! = 1 * 2 * 3 = 6
        4! = 1 * 2 * 3 * 4 = 24
        5! = 1 * 2 * 3 * 4 * 5 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("1 ден10 гочейинсанжазыныз:");
        int a = sc.nextInt();
        int eseptegich = 1;
        for (int i = a; i > 0; i--) {
        eseptegich*=i;
        }
        System.out.println(a + "!" + "=" + eseptegich);  */

        //№7

        /* Массив тузуп аны толтурунуз.
        Жуп сан болгон элементтерин консольго чыгарыныз.
        Массивдин элементтери:
        1 2 3 4 5 6 7 8 9 10
        Жооп:
        2 4 6 8 10

          Random rd = new Random();
                int[] array = new int[20];
                int[] array2 = new int[20];
                int jupSan = 1;

                for (int i = 0; i < array.length; i++) {
                    array[i] = rd.nextInt((100 - 1) +1) +1;
                    System.out.print(array[i] + " ");
                    }
                System.out.println();
                for (int i = 0; i < array2.length; i++) {
                    if (array[i] % 2 == 0) {
                        array2[jupSan] = array[i] ;
                        System.out.print( array2[jupSan] + " ");
                    }
                } */

        //№8

        /* Параметрине массив алган эки метод жазыныз, бириси массивдин
        эн кичине элементин тапса, экинчиси эн чон элементин
        табат жана консолго чыгарат.
        Мисалы:
        Массив: 1 8 3 3 4 4 9 12
        Минимальный элемент: 1
        Максимальный элемент: 12

        method1(new int[] {1,2,3,4,5,6,7,8,9,10});
        method2(new int[] {1,2,3,4,5,6,7,8,9,10});
    }

        static void method1(int[] array){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Максимальный элемент:" + max);
        }

        static void method2(int[] array2){
            int min = array2[0];
            for (int i = 0; i < array2.length; i++) {
                min = Math.min(min, array2[i]);
            }
            System.out.println("Минимальный элемент: " + min);
        } */

        //№9

        /*1ден 300го чейинки сандардын арасында 3ко, 4ко жана 5ке (баарына) калдыксыз
        болунгон сандардын суммасын табыныз.

         System.out.println("\n" + "3, 4, 5 ке болунгон сандардын суммасы: " + method1());
    }

        static int method1(){
            int c = 300;
            int eseptegich = 0;
            for (int a = 1; a < c; c--) {
                if (c % 3 == 0 && c % 4 == 0 && c % 5 == 0){
                    System.out.print(c + " ");
                    eseptegich+=c;
                }
            }
            return eseptegich;
        } */
    }
}
