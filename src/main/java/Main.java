import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         ReadXMLFile r = new ReadXMLFile();
         SortXMLFile s = new SortXMLFile();
        List<ProteinBar> list=  r.readFromXMLFile();

      // s.filterListByName(list);
      // s.sortByFett(list);
       //s.sortByProtein(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of fiber:");
        double number = Double.parseDouble(sc.nextLine());
        s.sortByChosenFiber(list,number);
    }
}
