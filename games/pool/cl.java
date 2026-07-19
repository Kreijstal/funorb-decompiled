/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static vh field_d;
    static dd field_k;
    static int field_h;
    static dd field_m;
    static int field_g;
    static java.awt.Font field_c;
    static String field_i;
    static int field_e;
    static boolean field_f;
    static String field_l;
    static String field_a;
    static String field_b;
    static String field_j;
    static String field_n;

    final static boolean a(int param0, vh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.field_sb;
              if (param0 == 1) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = param1.field_ib;
                if (wn.field_i < var2_int) {
                  break L3;
                } else {
                  if (var2_int - -param1.field_gb <= wn.field_i) {
                    break L3;
                  } else {
                    if (var3 > gg.field_f) {
                      break L3;
                    } else {
                      if (var3 + param1.field_Db <= gg.field_f) {
                        break L3;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        field_a = null;
        field_n = null;
        field_l = null;
        if (param0 > -43) {
          return;
        } else {
          field_b = null;
          field_m = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static wl a(byte[] param0, boolean param1) {
        wl var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        wl stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_5_0 = null;
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
            if (param0 != null) {
              L1: {
                var2 = new wl(param0, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
                sh.h(-1);
                if (param1) {
                  break L1;
                } else {
                  field_j = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = (wl) (var2);
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
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("cl.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wl) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0) {
        td.field_c.setLength(0);
        hn.field_b = 0;
        if (param0 != 14851) {
            field_n = (String) null;
        }
    }

    final static void a(int param0, int param1, int[] param2, float[] param3, float[] param4) {
        if (!(am.a((byte) 107, param2, param3))) {
            return;
        }
        if (!(am.a((byte) 127, param2, param4))) {
            return;
        }
        try {
            qh.d((int)param3[0], (int)param3[param1], (int)param4[0], (int)param4[1], param0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_l = "Public chat is unavailable while setting up a rated game.";
        field_b = "Click";
        field_a = "Only show lobby chat from my friends";
        field_j = "Please wait...";
        field_i = "Friends";
        field_n = "Members only";
    }
}
