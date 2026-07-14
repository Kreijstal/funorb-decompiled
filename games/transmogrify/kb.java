/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kb extends ri {
    static java.math.BigInteger field_p;
    static volatile boolean field_l;
    static String field_o;
    static tf field_q;
    static int[] field_m;
    static oh field_n;

    final static tf a(int param0, boolean param1) {
        tf[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        tf[] var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        var5 = rh.d(-26481);
        var2 = var5;
        if (param1) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (var5[var3].field_c != param0) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 <= 104) {
            kb.b(true);
            return pi.field_g.a(param0, (byte) 118, "");
        }
        return pi.field_g.a(param0, (byte) 118, "");
    }

    public static void b(boolean param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0) {
            field_o = null;
        }
    }

    kb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
        field_p = new java.math.BigInteger("65537");
        field_m = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new tf(13, 0, 1, 0);
        field_n = null;
    }
}
