/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_b;
    static int[] field_d;
    static cm field_f;
    static cm field_e;
    static boolean field_g;
    static int field_c;
    static int field_a;
    static String field_h;

    final static void a(int param0, pn param1, java.awt.Frame param2) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.awt.Frame var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param2, -1463474960);
              L2: while (true) {
                if (-1 != (var3.field_a ^ -1)) {
                  if ((var3.field_a ^ -1) == -2) {
                    param2.setVisible(false);
                    param2.dispose();
                    if (param0 == -1) {
                      break L0;
                    } else {
                      var5 = (java.awt.Frame) null;
                      ok.a(27, (pn) null, (java.awt.Frame) null);
                      return;
                    }
                  } else {
                    a.a((byte) 118, 100L);
                    continue L1;
                  }
                } else {
                  a.a((byte) 121, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("ok.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        nm.a((String) null, param0, param1, 12);
        int var3 = -36 % ((param2 - -22) / 36);
    }

    final static int a(int param0, byte param1) {
        int discarded$2 = 0;
        int var2 = 0;
        byte[] var3 = null;
        var2 = param0 >>> -449278847;
        var2 = var2 | var2 >>> 1699537281;
        var2 = var2 | var2 >>> 1630051138;
        var2 = var2 | var2 >>> -1304318812;
        var2 = var2 | var2 >>> 116530824;
        if (param1 <= 33) {
          var3 = (byte[]) null;
          discarded$2 = ok.a(-16, (byte[]) null, 9, (byte) -15);
          var2 = var2 | var2 >>> 683349808;
          return param0 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> 683349808;
          return param0 & (var2 ^ -1);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (!param0) {
          field_d = (int[]) null;
          field_b = null;
          field_h = null;
          return;
        } else {
          field_b = null;
          field_h = null;
          return;
        }
    }

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3 == 109) {
                break L1;
              } else {
                var7 = (byte[]) null;
                discarded$2 = ok.a(-97, (byte[]) null, -1, (byte) -92);
                break L1;
              }
            }
            var4_int = -1;
            var5 = param0;
            L2: while (true) {
              if (param2 <= var5) {
                var4_int = var4_int ^ -1;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 304932904 ^ kh.field_r[255 & (var4_int ^ param1[var5])];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ok.B(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_b = "Report abuse";
        field_h = "Invite";
    }
}
