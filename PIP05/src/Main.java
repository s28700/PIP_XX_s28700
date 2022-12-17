import java.util.Scanner;

//ZADANIE 1
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        zad1(n);
    }
    static void zad1(int n)
    {
        if(n > 0)
        {
            for(int i = 0; i <= n; i++)
                System.out.println(i);
        }
        else
        {
            for(int i = 0; i >= n; i--)
                System.out.print(i);
        }
    }
}*/
//ZADANIE 2
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n + "-ty wyraz ciągu Fibonacciego wraz z obliczeniami : ");
        Fibonacci(n);
    }
    static void Fibonacci(int n)
    {
        int i = 0;
        int pomoc1 = 0;
        int pomoc2 = 1;
        int wynik = 0;
        while (i <= n)
        {
             if(n==0)
             {
                 System.out.print(n);
                 break;
             }
             else if(n==1)
             {
                 System.out.print(n);
                 break;
             }
             else
             {
                 System.out.println(pomoc1);
                 wynik = pomoc1 + pomoc2;
                 pomoc1 = pomoc2;
                 pomoc2 = wynik;
             }
             i++;
        }
    }
}*/
//ZADANIE 3
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą dla zadania za 5pkt:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        za5pkt(n);
        System.out.println();
        System.out.println("Wpisz liczbę całkowitą dla zadania za 8pkt:");
        n = scan.nextInt();
        za8pkt(n);
    }
    static void za5pkt(int n)
    {
        String znak = "*";
        if(n%2==0)
        {
            int m = n - 1;
            System.out.println("Liczba całkowita jest parzysta-nowe n = " + m);
            for (int x = 0; x < m; x++)
            {
                for (int y = 0; y <= x; y++)
                {
                    System.out.print(znak);
                }
                System.out.println();
            }
        }
        else
        {
            for (int x = 0; x < n; x++)
            {
                for (int y = 0; y <= x; y++)
                {
                    System.out.print(znak);
                }
                System.out.println();
            }
        }
    }
    static void za8pkt(int n)
    {
        String znak = "*";
        if(n%2==0)
        {
            int m = n - 1;
            System.out.println("Liczba całkowita jest parzysta-nowe n = " + m);
            for (int x = 0; x < m; x++)
            {
                for (int y = 0; y < m * 2; y++)
                {
                    if (y < (m - x) || y > (m + x))
                    {
                        System.out.print(" ");
                    } else
                    {
                        System.out.print(znak);
                    }
                }
                System.out.println();
            }
        }
        else
        {
            for (int x = 0; x < n; x++)
            {
                for (int y = 0; y < n * 2; y++)
                {
                    if (y < (n - x) || y > (n + x))
                    {
                        System.out.print(" ");
                    } else
                    {
                        System.out.print(znak);
                    }
                }
                System.out.println();
            }
        }
    }
}*/
//ZADANIE 4
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj trzy liczby całkowite (X,Y,Z,) po każdej wciśnij SPACE i na koniec ENTER:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
        System.out.println();
        zad4(x,y,z);
    }
    static void zad4(int x,int y ,int z)
    {
        int m = 0;
        if(x > y && x > z)
        {
            m = x;
        }
        else if(y > z && y > x)
        {
            m = y;
        }
        else
        {
            m = z;
        }
        for (int i = 0; i < m; i++)
        {
            if (x==m)
            {
                System.out.print("*");
            }
            else if((m - x) > 0)
            {
                System.out.print(" ");
                x++;
            }
            else
            {
                System.out.println("*");
            }
            if (y==m)
            {
                System.out.print("*");
            }
            else if((m - y) > 0)
            {
                System.out.print(" ");
                y++;
            }
            else
            {
                System.out.println("*");
            }
            if (z==m)
            {
                System.out.print("*");
            }
            else if((m - z) > 0)
            {
                System.out.print(" ");
                z++;
            }
            else
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}