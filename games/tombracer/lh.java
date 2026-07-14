/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static nh field_b;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 82) {
            Object var2 = null;
            byte[] discarded$0 = lh.a((byte[]) null, 101);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        if (param1 != 6711) {
          return null;
        } else {
          var2 = param0.length;
          var3 = new byte[var2];
          lua.a(param0, 0, var3, 0, var2);
          return var3;
        }
    }

    static {
    }
}
