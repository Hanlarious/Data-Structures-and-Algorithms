import java.util.ArrayList;
import java.util.List;

public class Alternative {

    public List<String> nameDeduplication(String[] names) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < names.length; i++){
            String str = names[i].toLowerCase();
            if(!result.contains(str)){

                result.add(str);
            }

        }
        return result;
    }
}

