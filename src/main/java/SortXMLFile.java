import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortXMLFile {
    public void filterListByName(List<ProteinBar> list){
        for(ProteinBar bar :list){
            System.out.println(bar.getName());
        }
    }
    public void sortByFett(List<ProteinBar> list){
        list.stream().sorted(Comparator.comparing(ProteinBar::getFett).reversed())
                .forEach(System.out::println);
    }
    public void sortByProtein(List<ProteinBar> list){
        list.stream().sorted(Comparator.comparing(ProteinBar::getProtein).reversed())
                .forEach(System.out::println);
    }
    public void sortByChosenFiber(List<ProteinBar> list,double fiber){
        List<ProteinBar> list2 = new LinkedList<>();
        for(ProteinBar bar : list){
            if (bar.getFiber() < fiber){
                list2.add(bar);
            }
        }
        list2.stream().sorted(Comparator.comparing(ProteinBar::getFiber).reversed())
                .forEach(System.out::println);

    }




}
