/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ei extends ia {
    private String field_w;
    static String field_u;
    static int field_t;
    static gh field_n;
    static String field_x;
    static int field_q;
    static gh field_o;
    static gh field_p;
    private boolean field_s;
    static String field_v;
    static String field_r;

    ei(jf param0) {
        super(param0);
        ((ei) this).field_s = false;
    }

    public static void c() {
        field_n = null;
        field_x = null;
        field_v = null;
        field_r = null;
        field_p = null;
        field_u = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            pb.h(5, param1, 166, 8, 12105914);
            pb.e(6, param1 - -1, 164, 6, 16251129, 10461345);
            var6 = 42;
            var5_int = 64;
            var7 = 1;
            L1: while (true) {
              if (var7 > 6) {
                break L0;
              } else {
                pb.h(var7 + 5, var7 + param1, -(var7 * 2) + 166, -(var7 * 2) + 8, 16251129, var5_int);
                var5_int = var5_int >> 1;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ei.H(" + 5 + 44 + param1 + 44 + 166 + 44 + 8 + 44 + -96 + 41);
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        e var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param1;
            int discarded$2 = -1;
            var3 = va.a(var5);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((ei) this).field_w)) {
                  break L1;
                } else {
                  var4 = b.a(false, param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      ((ei) this).field_s = var4.field_d;
                      ((ei) this).field_w = param1;
                      break L1;
                    } else {
                      stackOut_8_0 = null;
                      stackIn_9_0 = stackOut_8_0;
                      return (String) (Object) stackIn_9_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param0 == 100) {
                if (!((ei) this).field_s) {
                  stackOut_16_0 = fg.field_Qb;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  return hf.field_d;
                }
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (String) (Object) stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ei.D(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final vd a(String param0, int param1) {
        e var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        vd stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        vd stackIn_13_0 = null;
        vd stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        vd stackOut_2_0 = null;
        vd stackOut_12_0 = null;
        vd stackOut_17_0 = null;
        vd stackOut_16_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            int discarded$9 = 127;
            if (!m.a(var4)) {
              stackOut_2_0 = fa.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((ei) this).field_w)) {
                    L2: {
                      var3 = b.a(false, param0);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null != var3.field_e) {
                          break L2;
                        } else {
                          ((ei) this).field_w = param0;
                          ((ei) this).field_s = var3.field_d;
                          break L1;
                        }
                      }
                    }
                    stackOut_12_0 = ma.field_Y;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (!((ei) this).field_s) {
                    stackOut_17_0 = fa.field_d;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = vf.field_b;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (vd) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("ei.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            ic.a(-128, "", param1);
            if (param0 != 0) {
                field_r = null;
            }
            pf.a(param1, 63);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ei.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void d(int param0) {
        if (param0 < 63) {
            return;
        }
        ((ei) this).field_w = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            var2 = sg.field_c;
        }
        if (!(param0 != 1)) {
            var2 = pm.field_Z;
        }
        if (!(param0 != 2)) {
            var2 = fi.field_y;
        }
        return var2;
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wk var3 = null;
        int var4 = 0;
        wk[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length <= var2_int) {
                stackOut_4_0 = (wk[]) param1;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = param1[var2_int];
                param1[var2_int].field_H = 0;
                var3.field_D = 0;
                param1[var2_int].field_z = param1[var2_int].field_A;
                param1[var2_int].field_B = param1[var2_int].field_F;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ei.J(").append(0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final static void a(int param0, byte param1, int param2) {
        kj var3 = mm.field_g;
        var3.a(param2, (byte) -117);
        var3.a((byte) 127, 3);
        var3.a((byte) 121, 10);
        var3.d(param0, 98);
    }

    final static int a(int param0, int param1, boolean param2) {
        if (!(null != bc.field_ub)) {
            return -1;
        }
        if (aj.field_s <= param1) {
            if (aj.field_s + bc.field_ub.field_A > param1) {
                if (mc.field_a <= param0) {
                    if (mc.field_a - -bc.field_ub.field_F > param0) {
                        return 0;
                    }
                }
            }
        }
        if (rn.field_u <= param1) {
            if (param1 < rn.field_u + bc.field_ub.field_A) {
                if (od.field_m <= param0) {
                    if (!(bc.field_ub.field_F + od.field_m <= param0)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Quick Chat lobby";
        field_x = "Invite only";
        field_t = 2;
        field_v = "Please select options in the following rows:  ";
        field_r = "Remove <%0> from friend list";
    }
}
