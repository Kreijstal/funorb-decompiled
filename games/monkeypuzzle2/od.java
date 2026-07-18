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
        int var1 = -24;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_6_0 = (StringBuilder) param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("od.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 0 + ',' + -118 + ',' + ' ' + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new byte[520];
    }
}
