/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static int[] field_c;
    static int field_d;
    static ue field_b;
    int field_e;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21367) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        try {
            lj.field_c = param0;
            if (param1 != 8192) {
                field_d = -99;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static mj a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mj[] var3 = null;
        int var4 = 0;
        mj var5 = null;
        java.applet.Applet var6 = null;
        mj stackIn_2_0 = null;
        mj stackIn_9_0 = null;
        mj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = fh.a("jagex-last-login-method", param0, (byte) 120);
            if (var2 != null) {
              L1: {
                if (param1 == 84) {
                  break L1;
                } else {
                  var6 = (java.applet.Applet) null;
                  kl.a((java.applet.Applet) null, (byte) -97);
                  break L1;
                }
              }
              var3 = ge.b((byte) 35);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackIn_12_0 = ih.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a(var2, -124)) {
                    var4++;
                    continue L2;
                  } else {
                    stackIn_9_0 = (mj) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = ih.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2_ref);

            stackIn_15_1 = new StringBuilder().append("kl.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
        field_c = new int[8192];
    }
}
