package level0.진료순서정하기;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("[3, 76, 24]  => [3, 1, 2]")
    void t1(){

        assertThat(new Solution().solution(new int[]{3, 76, 24})).isEqualTo(new int[]{3, 1, 2});
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7] => [7, 6, 5, 4, 3, 2, 1]")
    void t2(){

        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7})).isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
    }

    @Test
    @DisplayName("[30, 10, 23, 6, 100] => [2, 4, 3, 5, 1]")
    void t3(){

        assertThat(new Solution().solution(new int[]{30, 10, 23, 6, 100})).isEqualTo(new int[]{2, 4, 3, 5, 1});
    }
}
