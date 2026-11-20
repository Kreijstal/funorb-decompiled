/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DebugMessageFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          this.create((byte) -121);
          return (SerializableGameState[]) ((Object) new DebugMessage[param1]);
        }
        return (SerializableGameState[]) ((Object) new DebugMessage[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 70 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new DebugMessage());
    }

    static {
    }
}
