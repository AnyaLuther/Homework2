public class Main
{
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 7;
        int a2 = 5;
        int b2 = 9;
        if (a1 > b2 || b1 < a2) {
            System.out.println(" Прямые не имеют точек пересечения. ");
        }
        else if (a1 == b2) {
            System.out.println(" Точка пересечения отрезков " + a1);
        }
        else if (b1 == a2) {
            System.out.println(" Точка пересечения отрезков " + b1);
        }
        else if (a1 >= a2 && b1 <= b2) {
            System.out.println(" Начало отрезка пересечения " + a1 + ". Конец отрезка пересечения " + b1);
        }
        else if (a1 <= a2 && b1 > b2) {
            System.out.println(" Начало отрезка пересечения " + a2 + ". Конец отрезка пересечения " + b2);
        }
        else if (a1 > a2 && b1 > b2) {
            System.out.println(" Начало отрезка пересечения " + a1 + ". Конец отрезка пересечения " + b2);
        }
        else if (a1 <= a2 && b1 > a2 && b1 <= b2) {
            System.out.println(" Начало отрезка пересечения " + a2 + ". Конец отрезка пересечения " + b1);
        }
    }
}