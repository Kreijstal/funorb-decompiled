/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends f {
    static String field_o;
    static ee field_n;
    static byte[] field_m;
    static long field_l;

    final static le b(int param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        le var4 = null;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = ra.field_ab[0] * da.field_c[0];
        var2 = cb.field_b[0];
        var3 = new int[var1];
        if (param0 < 55) {
          return null;
        } else {
          var4_int = 0;
          L0: while (true) {
            if (var1 <= var4_int) {
              var4 = new le(nj.field_d, qk.field_a, qc.field_P[0], mb.field_b[0], da.field_c[0], ra.field_ab[0], var3);
              gb.a(-112);
              return var4;
            } else {
              var3[var4_int] = fk.field_d[ch.a(255, (int) var2[var4_int])];
              var4_int++;
              continue L0;
            }
          }
        }
    }

    public static void c(byte param0) {
        int var1 = -74 / ((73 - param0) / 39);
        field_o = null;
        field_n = null;
        field_m = null;
    }

    final fk a(boolean param0) {
        if (param0) {
            field_o = null;
            return wa.field_e;
        }
        return wa.field_e;
    }

    od(long param0, String param1) {
        super(param0, param1);
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = param0.length();
        param0.setLength(param1);
        if (param2 > -22) {
          return null;
        } else {
          var5 = var4;
          L0: while (true) {
            if (param1 <= var5) {
              return param0;
            } else {
              param0.setCharAt(var5, param3);
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new byte[520];
    }
}
