import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExampleTest {

    Example array = new Example();

    @Test
    public void sortTest(){
        int [] arr = {1,3,5,1,6,7};
        int [] arr1 = array.sort(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.println(arr[i]);
        }
        assertArrayEquals(arr, array.sort(arr1));
        System.out.println("The test case passed ");

    }
}
