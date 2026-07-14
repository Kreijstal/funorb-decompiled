/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ug {
    int[] field_g;
    static int field_f;
    int field_e;

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        gl.a(param1, 0, var3, param0, var2);
        return var3;
    }

    final static a a(boolean param0) {
        Object var2 = null;
        if (jk.field_x != null) {
          if (!param0) {
            var2 = null;
            byte[] discarded$4 = bk.a(121, (byte[]) null);
            return jk.field_x;
          } else {
            return jk.field_x;
          }
        } else {
          jk.field_x = new a(pf.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, pf.field_c.field_C, -1, 2147483647, true);
          if (param0) {
            return jk.field_x;
          } else {
            var2 = null;
            byte[] discarded$5 = bk.a(121, (byte[]) null);
            return jk.field_x;
          }
        }
    }

    private bk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
    }
}
