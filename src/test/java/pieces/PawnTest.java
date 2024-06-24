package pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PawnTest {

    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
    public void create() {
        Pawn pawn = new Pawn("white");
        assertThat(pawn.getColor()).isEqualTo("white");
    }

    @Test
    @DisplayName("검은색 폰이 생성되어야 한다.")
    public void createBlackPawn() {
        var pawn = new Pawn("black");
        assertThat(pawn.getColor()).isEqualTo("black");
    }

}