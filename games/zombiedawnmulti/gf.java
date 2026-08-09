/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (!param0) {
            return;
        }
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    public final String c(int param0) {
        if (!this.b(-3)) {
          if (this.field_i - -350L <= bl.a((byte) 64)) {
            if (param0 > -102) {
              return (String) null;
            } else {
              return this.e(-3);
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
        this.field_i = bl.a((byte) 114);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, boolean param7) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
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
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      q.a(13151);
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param0 > 92) {
                break L2;
              } else {
                gf.a(true);
                break L2;
              }
            }
            L3: {
              if (!sq.field_N) {
                break L3;
              } else {
                ce.a(param6, param5, param3, 20, (byte) 110, param2, param1, param6, param4);
                lj.field_v.a(-11838, param7);
                if (param7) {
                  L4: {
                    if (0 != dp.field_c.field_T) {
                      sq.field_N = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (jk.field_d.field_T == 0) {
                    break L3;
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
          L5: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("gf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final re d(int param0) {
        if (param0 >= 38) {
          if (!this.b(-3)) {
            if (bl.a((byte) 40) < 350L + this.field_i) {
              return h.field_H;
            } else {
              return this.f(-3);
            }
          } else {
            return se.field_F;
          }
        } else {
          return (re) null;
        }
    }

    abstract re f(int param0);

    abstract String e(int param0);

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        String var5 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (param1) {
                break L1;
              } else {
                var5 = (String) null;
                gf.a(-46, 36, -74, -104, (String) null, 64, 13, true);
                break L1;
              }
            }
            L2: {
              if (oe.field_c == null) {
                break L2;
              } else {
                if (oe.field_c.equals(param0.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = oe.field_c;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                }
              }
            }
            L3: {
              if (null == un.field_p) {
                break L3;
              } else {
                if (un.field_p.equals(param0.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = un.field_p;
                  break L3;
                }
              }
            }
            stackIn_9_0 = kf.a((String) (var4), -1, (byte) 126, (String) (var3), param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("gf.T(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_b = "(Click or press 'SPACE' for more)";
        field_d = "Enter name of player to delete from list";
        field_a = "Just play";
        field_c = "Retreat to your laboratory. You have much to learn.";
    }
}
