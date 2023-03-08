package level0.게임369;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("3 => 1")
    void t1(){

        assertThat(new Solution().solution(3)).isEqualTo(1);
    }

    @Test
    @DisplayName("29423 => 2")
    void t2(){

        assertThat(new Solution().solution(29423)).isEqualTo(2);
    }


}

