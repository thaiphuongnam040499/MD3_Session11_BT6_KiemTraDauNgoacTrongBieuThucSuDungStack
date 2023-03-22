import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        String str = "s * (s – a) * (s – b) * (s – c)";
        char sym;
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            sym = str.charAt(i);
            if (sym == '('){
                stack.push(sym);
            }
            if (sym == ')'){
                if (stack.isEmpty()){
                    check = false;
                }
                char left;
                left = (char) stack.pop();
                if (left!=sym){
                    check = false;
                }
            }
        }
        if (stack.isEmpty()){
            check = true;
            System.out.println("well");
        }
        else {
            check =false;
            System.out.println("sai");
        }
    }
}
