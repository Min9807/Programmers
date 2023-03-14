package level0.가까운수;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("[3, 10, 28], 20 => 28")
    void t1(){
        int[] a = {3, 10, 28};
        assertThat(new Solution().solution(a, 20)).isEqualTo(28);
    }

    @Test
    @DisplayName("[10, 11, 12], 13 => 12")
    void t2(){
        int[] a = {10, 11, 12};
        assertThat(new Solution().solution(a, 13)).isEqualTo(12);
    }
}
