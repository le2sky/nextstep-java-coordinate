package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @DisplayName("X, Y 좌표 모두 최대 24까지만 입력할 수 있다.")
    @Test
    void checkRange() {
        assertThatThrownBy(() -> Coordinate.of(25, 10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 최대 24까지만 입력할 수 있습니다.");

        assertThatThrownBy(() -> Coordinate.of(10, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 최대 24까지만 입력할 수 있습니다.");

        assertThatThrownBy(() -> Coordinate.of(25, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 최대 24까지만 입력할 수 있습니다.");
    }

    @DisplayName("X, Y 좌표 모두 음수가 될 수 없다.")
    @Test
    void checkNegative() {
        assertThatThrownBy(() -> Coordinate.of(0, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 음수가 될 수 없습니다.");

        assertThatThrownBy(() -> Coordinate.of(-1, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 음수가 될 수 없습니다.");

        assertThatThrownBy(() -> Coordinate.of(-1, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y좌표 모두 음수가 될 수 없습니다.");
    }

    @DisplayName("X, Y 좌표가 허용된 범위값으로 들어오면, 유효한 객체가 반환된다.")
    @Test
    void of() {
        Coordinate coordinate = Coordinate.of(0, 0);

        assertThat(coordinate).isNotNull();
        assertThat(coordinate).isEqualTo(Coordinate.of(0, 0));
    }
}
