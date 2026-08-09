/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends bd {
    static wk[] field_s;
    static String[] field_t;

    final static String b(int param0, int param1) {
        String var2;
        if (param0 >= param1) {
          if ((param1 ^ -1) > -1) {
            return "Please use a value from 0 to 256, inclusive.";
          } else {
            var2 = "old volume: " + gi.field_b;
            gi.field_b = param1;
            return var2;
          }
        } else {
          return "Please use a value from 0 to 256, inclusive.";
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 1223) {
            il.e(41);
        }
    }

    final void a(int param0, ha param1) {
        try {
            if (param0 != 64) {
                field_s = (wk[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "il.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static wd a(int param0, int param1, String param2) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              var3 = new wd(false);
              var3.field_d = param1;
              var3.field_i = param2;
              stackIn_4_0 = (wd) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("il.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    il(int param0, int param1, jd param2, ne param3) {
        try {
            if (null != param3.field_c) {
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "il.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            int var2_int = -78 / ((param1 - -46) / 57);
            param0.addMouseListener(lf.field_q);
            param0.addMouseMotionListener(lf.field_q);
            param0.addFocusListener(lf.field_q);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "il.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
