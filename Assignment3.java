/*
public class Assignment3{
    public static void main(String[]args)
    {
        char a='A';
        a++;
        System.out.println("a="+a);

    }
}



public class Assignment3 {
    public static void main(String[]args)
    {
        char a='a';
        System.out.println((int)a);
    }
}



public class Assignment3 {
    public static void main(String[]args){
        int x=2349;
        System.out.println("x="+x/10*10);
    }
}


public class Assignment3 {
    public static void main(String[]args)
    {
        int x=993;
        int sum=x%10+x/10%10+x/100;
        System.out.println(sum);
    }
}


public class Assignment3 {
    public static void main(String[]args){
        double x= 5.5%1.5;
        System.out.println(x);
    }
}




public class Assignment3 {
    public static void main(String[]args){
        int x= 130;
        int reverse=x%10*100+((x/10)%10)*10+x/100;
        System.out.println(reverse);
    }
}

*
public class Assignment3 {
    public static void main(String[]args){
        int x=97;
        System.out.println((char)x);

        }
    }

public class Assignment3 {
    public static void main(String[]args){
        int x=65,y=20;
        switch (x)
        {
            case 65:
                switch (y){
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                    default:
                        System.out.println("inner Default");
                }
                System.out.println("outside inner switch");
            case 50:
                System.out.println("fifty");
                break;
            case 0:
                System.out.println("zero");
                break;
            default:
                System.out.println("Default");

        }
        System.out.println("Out of switch");

    }
}

 */
import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("David");
        uniqueNames.add("Rahul");
        uniqueNames.add("Ganesh");
        uniqueNames.add("David");

        System.out.println("Set Elements (Unique Names): " + uniqueNames);


        Map<Integer, String> idToNameMap = new HashMap<>();
        idToNameMap.put(101, "David");
        idToNameMap.put(102, "Rahul");
        idToNameMap.put(103, "Ganesh");
        idToNameMap.put(101, "Vivek");

        System.out.println("\nMap Elements (ID to Name Mapping):");
        for (Map.Entry<Integer, String> entry : idToNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        int searchKey = 102;
        if (idToNameMap.containsKey(searchKey)) {
            System.out.println("\nID " + searchKey + " exists with Name: " + idToNameMap.get(searchKey));
        }


        String searchName = "Ganesh";
        if (idToNameMap.containsValue(searchName)) {
            System.out.println("Name " + searchName + " exists in the map.");
        }
    }
}
