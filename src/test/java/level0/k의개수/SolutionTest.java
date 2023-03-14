package level0.k의개수;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {

    @Test
    @DisplayName("1, 13 ,1 => 6")
    void t1(){

        assertThat(new Solution().solution(1, 13, 1)).isEqualTo(6);
    }

    @Test
    @DisplayName("10, 50 ,5 => 5")
    void t2(){

        assertThat(new Solution().solution(10, 50, 5)).isEqualTo(5);
    }

    @Test
    @DisplayName("1, 13 ,1 => 6")
    void t3(){

        assertThat(new Solution().solution(3, 10, 2)).isEqualTo(0);
    }
}
