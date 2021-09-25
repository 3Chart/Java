package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ph {
    public static void main(String[] args) throws IOException {
        System.out.println("Задача 1");
        for (int i = 2; i < 10; i = i + 1) {
            if (i != 2) {
                System.out.println("");
                System.out.println("Для цифры:" + i);
            }
            for (int j = 2; j < 10; j = j + 1) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }

        System.out.println("Задача 2");
        int n = 253;
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);

        System.out.println("Задача 3");
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        if(t>60){
            while(t>60)
            {
                t = t-60;
            }
        }
        int flag = 0;
        while(t > 3) {
            if (t > 3) {
                t = t - 3;
                flag = 1;
            }
            if (t > 3) {
                t = t - 1;
                flag = 2;
            }
            if (t > 3) {
                t = t - 1;
                flag = 0;
            }
        }
        if(flag == 0 && t > 0)
        {
            t = t - 3;
            flag = 1;
        }
        if (flag == 1 && t > 0)
        {
            t = t - 1;
            flag = 2;
        }
        if(flag == 2 && t > 0){
            t = t - 1;
            flag = 0;
        }
        if(flag == 0)
        {
            System.out.println("Зеленый");
        }
        else if(flag == 1)
        {
            System.out.println("Желтый");
        }
        else
        {
            System.out.println("Красный");
        }

        System.out.println("Задача 5");
        ArrayList<String> a = new ArrayList<String>();
        int N;
        N = inp.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < N; i++)
        {
            a.add(i, reader.readLine());
        }
        for(int i = 0; i < N; i++)
        {
            System.out.println("Строка " + (i + 1) + "-ая: " + a.get(i));
        }
        int M = inp.nextInt();
       for(int i = 0; i < M; i++)
       {
           a.add(a.get(0));
           a.remove(0);
       }
        for(int i = 0; i < N; i++)
        {
            System.out.println("Строка " + (i + 1) + "-ая: " + a.get(i));
        }
    }
}
