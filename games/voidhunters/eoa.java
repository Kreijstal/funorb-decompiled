/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eoa implements dja {
    static lta field_a;

    public final SerializableGameState a(byte param0) {
        int var2 = 45 / ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new ShipCondition());
    }

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          this.a((byte) 27);
          return (SerializableGameState[]) ((Object) new ShipCondition[param1]);
        }
        return (SerializableGameState[]) ((Object) new ShipCondition[param1]);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -18593) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
