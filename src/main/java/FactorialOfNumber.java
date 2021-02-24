public class FactorialOfNumber {
    private int number;

    public FactorialOfNumber(int number) {
        this.number = number;
    }

    public int fact() {
        if(number==0)
            return 1;
        if(number<0)
            return -1;
        int result=1;
        for(int i=1;i<=number;i++)
            result*=i;
        return result;
    }
}
