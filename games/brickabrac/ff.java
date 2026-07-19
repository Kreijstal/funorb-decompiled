/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static String field_g;
    static int[] field_f;
    static String field_j;
    static String[][] field_i;
    static w field_c;
    static long field_b;
    static String field_a;
    static int[] field_h;
    static vl field_d;
    static String field_e;

    abstract void a(int param0, wq param1);

    final static wg a(int param0, int param1, int param2, int param3, boolean param4, tg param5) {
        java.awt.Component discarded$9 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        wg var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        wg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = eh.a(param0, param5, param3, 119, param1, param2);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new wg();
                var7.field_a = var8;
                discarded$9 = var7.field_a.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param2, param3);
                var7.addFocusListener(var7);
                if (param4) {
                  break L1;
                } else {
                  ff.a((byte) 7, -111);
                  break L1;
                }
              }
              var7.requestFocus();
              stackOut_5_0 = (wg) (var7);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wg) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    abstract cd a(int param0);

    public static void a(byte param0) {
        field_h = null;
        field_i = (String[][]) null;
        field_d = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_g = null;
        field_e = null;
        int var1 = -5 % ((param0 - 66) / 48);
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        sp var4 = null;
        eg var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = (sp) ((Object) tm.field_f.d(-84));
            L1: while (true) {
              if (var4 == null) {
                if (param0 <= -34) {
                  var5 = (eg) ((Object) qc.field_n.d(-71));
                  L2: while (true) {
                    if (var5 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      uo.a(var5, param1, (byte) 68);
                      var5 = (eg) ((Object) qc.field_n.a((byte) 116));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                ke.a(param1, var4, 14989);
                var4 = (sp) ((Object) tm.field_f.a((byte) 116));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ff.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new int[8192];
        field_h = new int[]{13, 12};
        field_e = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = "Cancel rematch";
    }
}
