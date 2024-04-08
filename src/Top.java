import java.io.*;
import java.util.*;
import java.util.Collections;

public class Top implements Sequence {
    ArrayList<String> array1;
    Top() {
        this.array1 = new ArrayList<String>();
    }

    public void push(String st) {
        if (this.array1.size() < 4) {
            if (!this.array1.contains(st)) {
                this.array1.add(st);
            }
        }
        Collections.sort(this.array1);
        if (this.array1.size() > 3) {
            if (!this.array1.contains(st)) {
                if (st.compareTo(this.array1.get(2)) < 0) {
                    this.array1.remove(this.array1.get(2));
                    this.array1.add(st);
                }
            }
        }
    }

    public void reset() {
        array1.clear();
    }

    public ArrayList<String> getTopThree() {
        ArrayList<String> ans = new ArrayList<String>();
        Collections.sort(this.array1);
        if (array1.size() <= 3) {
            ans = array1;
            return ans;
        } else {
            for (int i = 0; i <= 2; i++)  {
                ans.add(array1.get(i));
            }
        }
        return ans;
    }
}