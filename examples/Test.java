// --------
// Max.java
// --------

import java.util.Collections;

class A implements Comparable<A> {
    private int _i;

    public A (int i) {
        _i = i;}

    public int compareTo (A that) {
        return _i - that._i;}}

final class Test {
    private static <T extends Comparable<? super T>> T my_max (T x, T y) {
        if (x.compareTo(y) < 0)
            return y;
        return x;}

    public static void main (String[] args) {
        System.out.println("Max.java");

        {
        A x = new A(2);
        A y = new A(3);
        assert my_max(x, y) == y;
        }

        System.out.println("Done.");}}
