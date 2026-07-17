/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jj extends ln {
    static e field_p;
    int field_o;

    final static void a(int param0, String param1, float param2) {
        aa.field_m = param1;
        if (param0 < 79) {
            return;
        }
        try {
            nj.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "jj.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void f() {
        field_p = null;
        int var1 = -28;
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 0;
            stackOut_0_0 = ae.a(param1, (byte) -44, param1.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jj.F(").append(-54).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final static mf a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mf[] var3 = null;
        int var4 = 0;
        mf var5 = null;
        int var6 = 0;
        mf stackIn_4_0 = null;
        mf stackIn_10_0 = null;
        mf stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_3_0 = null;
        mf stackOut_12_0 = null;
        mf stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = ph.a("jagex-last-login-method", (byte) 30, param0);
            if (var2 == null) {
              stackOut_3_0 = ho.field_n;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              int discarded$2 = 84;
              var3 = ko.a();
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  stackOut_12_0 = ho.field_n;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(89, var2)) {
                    stackOut_9_0 = (mf) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("jj.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 124 + 41);
        }
        return stackIn_13_0;
    }

    abstract boolean g(int param0);

    abstract Object b(byte param0);

    jj(int param0) {
        ((jj) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new e(2, 4, 4, 0);
    }
}
