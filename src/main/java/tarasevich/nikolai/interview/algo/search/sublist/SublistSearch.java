package tarasevich.nikolai.interview.algo.search.sublist;

import tarasevich.nikolai.interview.algo.search.util.SearchHelper;

import java.util.LinkedList;
import java.util.List;

public class SublistSearch {

    public static int search(List<Integer> list, List<Integer> sublist) {

        x: for (int i = 0; i < list.size(); i++) {

            int temp = i;
            for (Integer lookingFor: sublist) {
                if (lookingFor != list.get(temp) || temp > list.size()) {
                    continue x;
                }
                temp++;
            }

            return i;
        }

        return -1;
    }
    
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        LinkedList<Integer> list = (LinkedList<Integer>) SearchHelper.generateIntList(LinkedList.class);
        List<Integer> sublist = list.subList(6, 7);
        int result = search(list, sublist);
        System.out.println(result);
    }
}