package level0.두수의곱;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("3, 4 => 12")
    void t1(){
        assertThat(new Solution().solution(3, 4)).isEqualTo(12);
    }

    @Test
    @DisplayName("27, 19 => 513")
    void t2(){
        assertThat(new Solution().solution(27, 19)).isEqualTo(513);
    }
}
