/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static qj field_a;
    static volatile long field_c;
    static ed[] field_d;
    static int field_b;

    public static void a(boolean param0) {
        java.math.BigInteger var2 = null;
        field_a = null;
        if (!param0) {
          var2 = (java.math.BigInteger) null;
          bn.a(-123, (n) null, (n) null, (java.math.BigInteger) null, (java.math.BigInteger) null);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void a(int param0, n param1, n param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            gb.a(param4, false, param3, param2.field_g, param1, param2.field_m, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ed[] param0, int param1) {
        ci[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ci var4 = null;
        int var5 = 0;
        ed var6 = null;
        int var7 = 0;
        ci[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (jb.field_l == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = jb.field_l;
              var2 = var8;
              var3 = param1;
              L1: while (true) {
                if (var8.length <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = var8[var3];
                  var5 = var4.field_b;
                  var6 = param0[var5];
                  var4.field_e = var6;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("bn.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = new qj(0, 0);
        field_c = 0L;
        field_b = 0;
    }
}
