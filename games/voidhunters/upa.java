/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class upa implements dja {
    static boolean field_a;

    final static String a(int param0) {
        if (param0 != -8225) {
          upa.a(59);
          return "Lo!";
        }
        return "Lo!";
    }

    public final SerializableGameState a(byte param0) {
        int var2 = 29 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ShipComponent());
    }

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new ShipComponent[param1]);
    }

    static {
        field_a = false;
    }
}
