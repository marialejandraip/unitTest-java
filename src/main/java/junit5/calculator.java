package junit5;

public class calculator {

    private int result;

    public int add(int n1, int n2) {
        result = n1 + n2;
        return result;
    };

    public int subtract(int n1, int n2){
        result = n1 - n2;
        return result;
    };


}
