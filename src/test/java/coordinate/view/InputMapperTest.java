package coordinate.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import coordinate.domain.Point;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputMapperTest {

    @DisplayName("x, y를 발라낸다.")
    @Test
    void split() {
        String target = "(10,2)";

        List<Point> result = InputMapper.mapToPoints(target);

        assertThat(result).hasSize(1)
                .contains(Point.of(10, 2));
    }

    @DisplayName("2개 이상의 좌표 변환")
    @Test
    void mapToPoints() {
        String target = "(10,2)-(23,12)";

        List<Point> result = InputMapper.mapToPoints(target);

        assertThat(result).hasSize(2)
                .contains(
                        Point.of(10, 2),
                        Point.of(23, 12)
                );
    }

    @DisplayName("예외 케이스")
    @Test
    void exception() {
        assertThatThrownBy(() -> InputMapper.mapToPoints("10,2-3,10"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표의 형식은 (x,y) 입니다. 여러 좌표를 입력하시려면 - 를 구분자로 이용해주세요.");
    }
}
