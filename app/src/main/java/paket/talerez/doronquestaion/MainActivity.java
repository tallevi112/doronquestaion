package paket.talerez.doronquestaion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    int[] arr = {1, 4, 6, 8, 9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean t = sumExist(arr, 5);
        Toast.makeText(this, "" + t, Toast.LENGTH_SHORT).show();
    }

    public boolean sumExist(int[] arr, int value) {
        boolean result = false;

        HashSet<Integer> list = convertingToList(arr);

        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int num : list) {
            //contains() of HashSet runs in O(1) time
            result = list.contains(value - num) ? true : false;
            if (result == true) {
                return result;
            }
        }
        return result;
    }

    public HashSet<Integer> convertingToList(int[] arr) {
        HashSet<Integer> arrayList = new HashSet<>();
        for (int index : arr) {
            arrayList.add(index);
        }
        return arrayList;
    }
}
