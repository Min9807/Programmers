package level0.배열회전시키기;


import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("[4, 455, 6, 4, -1, 45, 6], left => [455, 6, 4, -1, 45, 6, 4]")
    void t1(){
        String left = "left";
        int[] a = {4, 455, 6, 4, -1, 45, 6};
        int[] b = {455, 6, 4, -1, 45, 6, 4};
        assertThat(new Solution().solution(a, left)).isEqualTo(b);
    }

    @Test
    @DisplayName("[1, 2, 3], right => [3, 1, 2]")
    void t2(){
        String right = "right";
        int[] a = {1,2,3};
        int[] b = {3, 1, 2};
        assertThat(new Solution().solution(a, right)).isEqualTo(b);
    }
}
