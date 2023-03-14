package level0.two차원으로만들기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7, 8], 2 => [[1, 2], [3, 4], [5, 6], [7, 8]]")
    void t1(){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertThat(new Solution().solution(a, 2)).isEqualTo(b);
    }

    @Test
    @DisplayName("[100, 95, 2, 4, 5, 6, 18, 33, 948], 2 => [[100, 95, 2], [4, 5, 6], [18, 33, 948]]")
    void t2(){
        int[] a = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] b = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        assertThat(new Solution().solution(a, 3)).isEqualTo(b);
    }
}
