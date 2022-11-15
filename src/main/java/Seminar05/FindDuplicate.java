package Seminar05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(findDuplicates(paths));
    }

    public static List<List<String>> findDuplicates(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        if (paths == null || paths.length == 0) {
            return result;
        }
        Map<String, List<String>> contents = new HashMap<>();

        for (String path : paths) {
            String[] pathFile = path.split(" ");

            for (int i = 1; i < pathFile.length; i++) {
                String[] fileContent = pathFile[i].split("\\(");
                String content = fileContent[1];

                if (!contents.containsKey(content)) {
                    contents.put(content, new ArrayList<>());
                }
                String FullPath = pathFile[0] + "/" + fileContent[0];
                contents.get(content).add(FullPath);
            }
        }

        for (Map.Entry<String, List<String>> entry : contents.entrySet()) {
            if (entry.getValue().size() > 1) {
                result.add(entry.getValue());
            }
        }
        return result;
    }
}
