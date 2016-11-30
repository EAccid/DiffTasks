package testsquizfull;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse {

    public static void main(String[] args) {
        revertChars();
        revertLinkedList();
    }

    private static void revertLinkedList() {

        System.out.println("revertLinkedList....");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        System.out.println(ll);
        ReverseList.reverse(ll);
        System.out.println(ll);

    }

    private static void revertChars() {
        System.out.println("revertChars....");

        String s = "abcde";
        char[] c = s.toCharArray();
        char mc;
        int length = c.length;
        for (int i = 0; i <= length / 2; i++) {
            mc = c[--length];
            c[length] = c[i];
            c[i] = mc;
        }

        System.out.println(s);
        System.out.println(c);
    }

    static class ReverseList {

        @Nullable
        static LinkedList reverse(@NotNull LinkedList ll) {
            ListIterator<String> iteratorNext = ll.listIterator();
            ListIterator<String> iteratorPrev = ll.listIterator(ll.size());
            int size = ll.size() / 2;
            while (size-- > 0) {
                String last = iteratorPrev.previous();
                String first = iteratorNext.next();
                iteratorNext.set(last);
                iteratorPrev.set(first);
            }
            return null;
        }
    }

}
