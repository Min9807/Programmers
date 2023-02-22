package level0.나머지구하기;

import level0.몫구하기.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("2, 3 => -1")
    void t1(){
        assertThat(new level0.몫구하기.Solution().solution(10, 5)).isEqualTo(2);
    }

    @Test
    @DisplayName("2, 3 => -1")
    void t2(){
        assertThat(new Solution().solution(7, 2)).isEqualTo(3);
    }
}
