/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class osb implements dja {
    static int field_b;
    static String field_a;

    public final SerializableGameState[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (SerializableGameState[]) null;
        }
        return (SerializableGameState[]) ((Object) new BodyCondition[param1]);
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_b = -17;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final SerializableGameState a(byte param0) {
        int var2 = -16 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new BodyCondition());
    }

    static {
        field_b = 1;
        field_a = "Searching for opponents";
    }
}
