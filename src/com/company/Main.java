package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Чика";
        name[1] = "Азиз";
        name [2] = "Андрей";
        for (String name1:name) {
            switch (name1){
                case "Чика":
                    System.out.println("Доброе утро"+" "+name1);
                    break;
                case "Азиз":
                    System.out.println("Добрый день"+" "+name1);
                    break;
                case "Андрей":
                        System.out.println("Добрый вечер"+" " + name1);
                        break;

            }


        }




        }

}
