/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nma implements dja {
    static int field_a;
    static da[] field_b;

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          this.a((byte) -57);
          return (SerializableGameState[]) ((Object) new gtb[param1]);
        }
        return (SerializableGameState[]) ((Object) new gtb[param1]);
    }

    public final SerializableGameState a(byte param0) {
        int var2 = 20 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new gtb());
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -4) {
          field_a = 33;
        }
    }

    static {
        field_a = 0;
    }
}
