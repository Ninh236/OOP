import oop.JUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {

        @Test
        public void testMax2Int1() {
                int test = JUnit.max2Int(15, 20);
                assertEquals(20, test);
        }

        @Test
        public void testMax2Int2() {
                int test = JUnit.max2Int(30, 55);
                assertEquals(55, test);
        }

        @Test
        public void testMax2Int3() {
                int test = JUnit.max2Int(12, 144);
                assertEquals(144, test);
        }

        @Test
        public void testMax2Int4() {
                int test = JUnit.max2Int(-15, -90);
                assertEquals(-15, test);
        }

        @Test
        public void testMax2Int5() {
                int test = JUnit.max2Int(37, 9821);
                assertEquals(9821, test);
        }

        @Test
        public void testMinArray1() {
                int[] testArray = {0, 1, 2, 3};
                int test = JUnit.minArray(testArray);
                assertEquals(0, test);
        }

        @Test
        public void testMinArray2() {
                int[] testArray = {2, 4, 6, 8, 10};
                int test = JUnit.minArray(testArray);
                assertEquals(2, test);
        }

        @Test
        public void testMinArray3() {
                int[] testArray = {-10, -5, 0, 5, 10};
                int test = JUnit.minArray(testArray);
                assertEquals(-10, test);
        }

        @Test
        public void testMinArray4() {
                int[] testArray = {-1234, -123, -12, 1, 12, 123, 1234};
                int test = JUnit.minArray(testArray);
                assertEquals(-1234, test);
        }

        @Test
        public void testMinArray5() {
                int[] testArray = {9876, 4321, 1234, 98765, 432};
                int test = JUnit.minArray(testArray);
                assertEquals(432, test);
        }

        @Test
        public void testCalculateBMI1() {
                double testWeight = 65;
                double testHeight = 1.72;
                String test = JUnit.calculateBMI(testWeight, testHeight);
                assertEquals("Bình thường", test);
        }

        @Test
        public void testCalculateBMI2() {
                double testWeight = 42;
                double testHeight = 1.5;
                String test = JUnit.calculateBMI(testWeight, testHeight);
                assertEquals("Bình thường", test);
        }

        @Test
        public void testCalculateBMI3() {
                double testWeight = 45;
                double testHeight = 1.6;
                String test = JUnit.calculateBMI(testWeight, testHeight);
                assertEquals("Thiếu cân", test);
        }

        @Test
        public void testCalculateBMI4() {
                double testWeight = 80;
                double testHeight = 1.75;
                String test = JUnit.calculateBMI(testWeight, testHeight);
                assertEquals("Béo phì", test);
        }

        @Test
        public void testCalculateBMI5() {
                double testWeight = 75;
                double testHeight = 1.75;
                String test = JUnit.calculateBMI(testWeight, testHeight);
                assertEquals("Thừa cân", test);
        }
}
