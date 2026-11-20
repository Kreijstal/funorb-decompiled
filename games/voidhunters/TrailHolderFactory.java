/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrailHolderFactory implements GameStateFactory {
    final static int b(byte param0) {
        int var1 = 41 % ((5 - param0) / 52);
        return rw.field_q;
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -43 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new TrailHolder());
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          TrailHolderFactory.b((byte) 55);
          return (SerializableGameState[]) ((Object) new TrailHolder[param1]);
        }
        return (SerializableGameState[]) ((Object) new TrailHolder[param1]);
    }

    static {
    }
}
