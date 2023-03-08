package level0.약수구하기;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("24 => [1, 2, 3, 4, 6, 8, 12, 24]")
    void t1(){
        int[] a = {1, 2, 3, 4, 6, 8, 12, 24};
        assertThat(new Solution().solution(24)).isEqualTo(a);
    }

    @Test
    @DisplayName("29 => \t[1, 29]")
    void t2(){
        int[] a = {1, 29};
        assertThat(new Solution().solution(29)).isEqualTo(a);
    }
}

