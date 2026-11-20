/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerActionFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = 95 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new PlayerAction());
    }

    final static void drawToolkitSprite(int param0, int param1, byte param2, int param3) {
        if (OpenGlTexture1D.field_i) {
          OpenGlVertexNormal.field_d[param0].draw(param1, param3);
          if (param2 <= 82) {
            PlayerActionFactory.drawToolkitSprite(-67, -4, (byte) 25, 43);
            return;
          }
          return;
        }
        if (param2 > 82) {
          return;
        }
        PlayerActionFactory.drawToolkitSprite(-67, -4, (byte) 25, 43);
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) 20);
          return (SerializableGameState[]) ((Object) new PlayerAction[param1]);
        }
        return (SerializableGameState[]) ((Object) new PlayerAction[param1]);
    }

    static {
        field_a = 128;
        CarouselEventFactory discarded$0 = new CarouselEventFactory();
    }
}
