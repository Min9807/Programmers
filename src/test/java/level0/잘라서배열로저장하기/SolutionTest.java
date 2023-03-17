package level0.잘라서배열로저장하기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("abc1Addfggg4556b, 6  => [\"abc1Ad\", \"dfggg4\", \"556b\"]")
    void t1(){

        assertThat(new Solution().solution("abc1Addfggg4556b", 6)).isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
    }

    @Test
    @DisplayName("abcdef123, 3 => [\"abc\", \"def\", \"123\"]")
    void t2(){

        assertThat(new Solution().solution("abcdef123", 3)).isEqualTo(new String[]{"abc", "def", "123"});
    }
}
