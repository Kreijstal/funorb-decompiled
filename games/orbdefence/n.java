/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static long field_b;
    static int field_a;
    static int[] field_c;

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        if (param1 < 81) {
          n.c((byte) -124);
          var2 = param0.length;
          var3 = new byte[var2];
          mk.a(param0, 0, var3, 0, var2);
          return var3;
        } else {
          var2 = param0.length;
          var3 = new byte[var2];
          mk.a(param0, 0, var3, 0, var2);
          return var3;
        }
    }

    final static void a(byte param0) {
        if (!d.field_k) {
          throw new IllegalStateException();
        } else {
          pa.field_b = true;
          qd.a(88, false);
          hi.field_k = 0;
          if (param0 != -110) {
            field_c = null;
            return;
          } else {
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 > -28) {
            n.a((byte) 86);
        }
    }

    final static boolean b(byte param0) {
        int var1 = 111 / ((param0 - -18) / 48);
        return d.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
