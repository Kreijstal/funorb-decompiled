/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kgb implements dja {
    static int field_a;
    static int[] field_b;

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new hg[param1]);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          kgb.a(-84);
        }
    }

    public final SerializableGameState a(byte param0) {
        int var2 = 108 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new hg());
    }

    static {
        field_a = 0;
        field_b = new int[8192];
    }
}
