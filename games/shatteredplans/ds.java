/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static String field_a;
    static bi field_b;
    static a field_c;
    static String field_e;
    int field_d;

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static bi a(boolean param0, bc param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (!param0) {
          ds.a(false);
          var4 = param1.a(127, param2);
          var5 = param1.a(var4, (byte) 106, param3);
          return ch.a(param1, -114, var5, var4);
        } else {
          var4 = param1.a(127, param2);
          var5 = param1.a(var4, (byte) 106, param3);
          return ch.a(param1, -114, var5, var4);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ds(int param0) {
        ((ds) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Game options";
        field_a = "Lobby";
    }
}
