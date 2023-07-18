import java.util.*;

public class Filter {
    public static List filter(Set<NoteBook> set, Map<Integer, String> filters){
        List filteredNotebooks = new ArrayList();
        for (NoteBook notebook : set){
            boolean allFiltersOk = true;
            for(Object filterKey : filters.keySet()){
                Object filterValue = filters.get(filterKey);
                switch (filterKey){
                    case "ram":
                        if(notebook.getRam() != (int) filterValue){
                            allFiltersOk = false;
                        }
                        break;
                    case "hdd":
                        if(notebook.getHDD() != (int) filterValue){
                            allFiltersOk = false;
                        }
                        break;
                    case "os":
                        if(!notebook.getOs().equals(filterValue)){
                            allFiltersOk = false;
                        }
                        break;
                    case "color":
                        if(!notebook.getColor().equals(filterValue)){
                            allFiltersOk = false;
                        }
                        break;
                }
            }
        }
        List filteredNotebook = Filter.filter(set, filters);{
            for(NoteBook notebook : filteredNotebook){
                if(filteredNotebook.size() == 0) {
                    System.out.println("Упс! По данному запросу ничего не найдено");
                }
                else {
                    System.out.println(notebook.getRam() + "" + notebook.getHDD() + "" + notebook.getOs() + "" + notebook.getColor());
                }
            }
        } return(filteredNotebook);

    }
}
