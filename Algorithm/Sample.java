package Algorithm;

import java.util.ArrayList;

public class Sample {
    private int a;
    private int b;

    private int findCMD(int a, int b) {
        int r;
        int n = a;
        int m = b;
        r = n % m;
        while (r!=0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }

    public void setNum(int n, int m) {
        if (n <= m)
            throw new IllegalArgumentException();
        a = n;
        b = m;
    }

    public void printFractions() {
        ArrayList<String> irreducible = new ArrayList<String>();
        ArrayList<String> reducible = new ArrayList<String>();
        for (int p = b ; p<=a; p++)
            for (int q = 1 ; q<b; q++){
                if (this.findCMD(p, q)==1)
                    irreducible.add(q + "/" + p);
                else
                    reducible.add(q + "/" + p);
            }

        System.out.append("Irreducible: ");
        for(String i:irreducible)
            System.out.append(i + " ");
        System.out.append("\n");
        System.out.append("Reducible: ");
        for(String i:reducible)
            System.out.append(i + " ");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Sample fif = new Sample();
        fif.setNum(500, 100);
        fif.printFractions();
    }
}
