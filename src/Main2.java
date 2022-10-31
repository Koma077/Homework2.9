import java.util.*;

public class Main2{
    private static final Map<String, List<Integer>> mapp = new HashMap<>(5);
    private static final Map<String, Integer> map = new HashMap<>(5);

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listOne.add((int) random);
        }

        List<Integer> listTwo = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listTwo.add((int) random);
        }

        List<Integer> listThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            double random = Math.random() * 1000;
            listThree.add((int) random);
        }
        mapp.put("List 1", listOne);
        mapp.put("List 2", listTwo);
        mapp.put("List 3", listThree);

        System.out.println(mapp);


        for (var entry : mapp.entrySet()) {
            Integer sum = 0;
            List<Integer> tempList = entry.getValue();
            for (Integer integerSum : tempList) {
                sum += integerSum;
            }
            mapp.put(entry.getKey(), Collections.singletonList(sum));
        }
        System.out.println(mapp);
    }
}


