package br.pro.hashi.ensino.desagil.oficina;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngineTest {
    @Test
    public void Search_ReceivingArbitraryArrayAndRightmostElement_Works() {
        Engine engine = new Engine();
        int[] v = new int[]{2, 3, 5, 8, 13, 21, 34, 55};
        Assertions.assertEquals(7, engine.search(v, 55));
    }
}
