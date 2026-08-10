/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends f {
    static String field_o;
    static ee field_n;
    static byte[] field_m;
    static long field_l;

    final static le b(int param0) {
        int var1;
        byte[] var2;
        int[] var3;
        int var4_int;
        le var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = ra.field_ab[0] * da.field_c[0];
        var2 = cb.field_b[0];
        var3 = new int[var1];
        if (param0 < 55) {
          return (le) null;
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
            field_o = (String) null;
            return wa.field_e;
        }
        return wa.field_e;
    }

    od(long param0, String param1) {
        super(param0, param1);
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(param1);
            if (param2 <= -22) {
              var5 = var4_int;
              L1: while (true) {
                if (param1 <= var5) {
                  stackIn_8_0 = (StringBuilder) (param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param0.setCharAt(var5, param3);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("od.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_o = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new byte[520];
    }
}
