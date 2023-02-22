package level0.나머지구하기;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("3, 2 => 1")
    void t1(){
        assertThat(new Solution().solution(3, 2)).isEqualTo(1);
    }

    @Test
    @DisplayName("10, 5 => -1")
    void t2(){
        assertThat(new Solution().solution(10, 5)).isEqualTo(0);
    }
}
