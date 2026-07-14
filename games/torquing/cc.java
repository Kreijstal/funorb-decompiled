/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_b;
    static k field_a;
    static int field_c;
    static cb field_d;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 20 / ((param0 - -5) / 58);
        field_b = null;
        field_a = null;
    }

    final static byte[] a(int param0, byte param1, byte[] param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param1 <= 1) {
          field_d = null;
          var4 = new byte[param0];
          var3 = var4;
          dk.a(param2, 0, var4, 0, param0);
          return var4;
        } else {
          var4 = new byte[param0];
          var3 = var4;
          dk.a(param2, 0, var4, 0, param0);
          return var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names cannot start or end with space or underscore";
        field_a = new k(2, 4, 4, 0);
    }
}
