package level0.가장큰수찾기;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("[1, 8, 3] => [8, 1]")
    void t1(){
        int[] a = {1, 8, 3};
        int[] b = {8, 1};
        assertThat(new Solution().solution(a)).isEqualTo(b);
    }

    @Test
    @DisplayName("[9, 10, 11, 8] => [11, 2]")
    void t2(){
        int[] a = {9, 10, 11, 8};
        int[] b = {11, 2};
        assertThat(new Solution().solution(a)).isEqualTo(b);
    }
}
