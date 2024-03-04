import java.util.HashSet;

public class ArrayIntersection {

    public static void main(String[] args) {
       
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

    
        int[] intersection = findIntersection(array1, array2);
        System.out.println("Intersection of the arrays: ");
        for (int element : intersection) {
            System.out.print(element + " ");
        }
    }

    
    public static int[] findIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

       
        for (int element : array1) {
            set1.add(element);
        }

        
        for (int element : array2) {
            if (set1.contains(element)) {
                resultSet.add(element);
            }
        }

        
        int[] intersection = new int[resultSet.size()];
        int index = 0;
        for (int element : resultSet) {
            intersection[index++] = element;
        }

        return intersection;
    }
}
