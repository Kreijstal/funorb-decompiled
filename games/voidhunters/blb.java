/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class blb implements dja {
    public final SerializableGameState a(byte param0) {
        int var2 = 121 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new TimedSpecialOrderBehaviour());
    }

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new TimedSpecialOrderBehaviour[param1]);
    }

    static {
    }
}
