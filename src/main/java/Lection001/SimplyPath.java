package Lection001;

public class SimplyPath {
    public static void main(String[] args) {
        String input = "/home/../foo/win/temp/exit/..";
        String result = simplifyPath(input);
        System.out.println(result);
    }
    public static String simplifyPath(String path) {
        String[] dir = path.split("/");
        StringBuilder result = new StringBuilder();
        String[] stack = new String[dir.length];
        int dirMove = 0;
        for (int i = 0; i < dir.length; i++) {
            if (dir[i].equals(".") || dir[i].equals("")) {
             }
            else if (dir[i].equals("..")) {
                if (dirMove > 0) dirMove--;
            } else {
                stack[i] = dir[i];
                dirMove++;
            }
        }
        for (int i = 1; i < dir.length; i++) {
            if (stack[i] != null) {
                result.append("/");
                result.append(stack[i]);
            }

        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
