/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_c;
    static ea[] field_f;
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;

    final static int a(byte param0) {
        if (param0 >= -108) {
            return -112;
        }
        return da.field_o;
    }

    final static void a(int param0, nk param1, int param2) {
        la var3 = null;
        try {
            var3 = ra.field_C;
            var3.c(param2, 7);
            var3.a(param0, (byte) -93);
            var3.a(0, (byte) -69);
            var3.a(param1.field_i, (byte) -120);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "gj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static bl a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        bl[] var3 = null;
        int var4 = 0;
        bl var5 = null;
        int var6 = 0;
        bl stackIn_4_0 = null;
        bl stackIn_10_0 = null;
        bl stackIn_14_0 = null;
        bl stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bl stackOut_3_0 = null;
        bl stackOut_15_0 = null;
        bl stackOut_13_0 = null;
        bl stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2 = kh.a("jagex-last-login-method", 66, param1);
            if (var2 == null) {
              stackOut_3_0 = oi.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = qi.c(19664);
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  if (param0 >= 96) {
                    stackOut_15_0 = oi.field_a;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackOut_13_0 = (bl) null;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, false)) {
                    stackOut_9_0 = (bl) (var5);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
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
            stackOut_17_0 = (RuntimeException) (var2_ref);
            stackOut_17_1 = new StringBuilder().append("gj.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 67 / ((param0 - 10) / 44);
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        bl discarded$0 = null;
        int var3 = param2 >> -133681633 & -1 + param1;
        if (param0 != 2) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            discarded$0 = gj.a(107, (java.applet.Applet) null);
        }
        return var3 + (param2 - -(param2 >>> -270751457)) % param1;
    }

    static {
        field_b = new String[]{"Complete level 5", "Complete level 10", "Complete level 20", "Complete level 30", "Get 5 levels in a row right first time", "Get 10 levels in a row right first time", "Get 20 levels in a row right first time", "Get 30 levels in a row right first time", "Score 10000 points", "Score 25000 points", "Score 50000 points", "Score 100000 points", "Complete 20 levels in a row with the Zombie Controller during Hallowe'en"};
        field_a = "Loading...";
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_e = "Loading graphics";
    }
}
