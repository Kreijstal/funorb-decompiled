/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

abstract class gf implements j {
    static int field_f;
    static int field_g;
    static String field_c;
    static fm field_e;
    static String field_d;
    static String field_b;
    private long field_i;
    static boolean field_h;
    static String field_a;
    static int field_j;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    public final String c(int param0) {
        if (!((gf) this).b(-3)) {
          if (((gf) this).field_i - -350L <= bl.a((byte) 64)) {
            if (param0 > -102) {
              return null;
            } else {
              return ((gf) this).e(-3);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(int param0) {
        if (param0 != -1306) {
            return;
        }
        ((gf) this).field_i = bl.a((byte) 114);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (ek.field_z.field_T == 0) {
                break L1;
              } else {
                if (nh.field_m) {
                  break L1;
                } else {
                  if (sh.field_L) {
                    q.a(13151);
                    break L1;
                  } else {
                    sq.field_N = true;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!sq.field_N) {
                break L2;
              } else {
                ce.a(param6, param5, 320, 20, (byte) 110, 180, param1, param6, param4);
                lj.field_v.a(-11838, param7);
                if (param7) {
                  L3: {
                    if (0 != dp.field_c.field_T) {
                      sq.field_N = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (jk.field_d.field_T == 0) {
                    break L2;
                  } else {
                    pf.a(-103);
                    sq.field_N = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("gf.U(").append(127).append(',').append(param1).append(',').append(180).append(',').append(320).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final re d(int param0) {
        if (param0 >= 38) {
          if (!((gf) this).b(-3)) {
            if (bl.a((byte) 40) < 350L + ((gf) this).field_i) {
              return h.field_H;
            } else {
              return ((gf) this).f(-3);
            }
          } else {
            return se.field_F;
          }
        } else {
          return null;
        }
    }

    abstract re f(int param0);

    abstract String e(int param0);

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (oe.field_c == null) {
                break L1;
              } else {
                if (oe.field_c.equals((Object) (Object) param0.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) oe.field_c;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (null == un.field_p) {
                break L2;
              } else {
                if (un.field_p.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) un.field_p;
                  break L2;
                }
              }
            }
            stackOut_6_0 = kf.a((String) var4, -1, (byte) 126, (String) var3, param2);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_8_0 = var3;
            stackOut_8_1 = new StringBuilder().append("gf.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(true).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "(Click or press 'SPACE' for more)";
        field_d = "Enter name of player to delete from list";
        field_a = "Just play";
        field_c = "Retreat to your laboratory. You have much to learn.";
    }
}
