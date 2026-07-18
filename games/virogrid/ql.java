/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class ql implements ol {
    private int field_c;
    static String field_e;
    private int field_l;
    static String field_o;
    static int field_t;
    static boolean field_d;
    static String field_i;
    static String field_j;
    private int field_b;
    static String field_f;
    private int field_a;
    static String field_k;
    static String field_p;
    static String field_s;
    private int field_h;
    private int field_n;
    private int field_r;
    static ha field_q;
    static eh field_m;
    private e field_g;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 <= 74) {
            field_o = null;
        }
        cm.field_h.a(param1, param5, param2, (byte) -105, param4);
        if (null != dk.field_v) {
            dk.field_v.a(param6, param3, param3 - bf.field_o, param5, param5, 0);
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            var3_int = gg.a(var10, param2, 16);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param0.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param0.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ql.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + -123 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (!jd.a(-685, param2)) {
              if (!al.a(param2, 125)) {
                if (!we.a((byte) 12, param2)) {
                  if (param1.length() != 0) {
                    if (!mj.a(param2, param1, (byte) 113)) {
                      if (me.a(param2, param1, true)) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      } else {
                        if (w.a(param2, param1, false)) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("ql.C(").append(-95).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L1;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L1;
            }
          }
          L2: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L2;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final static java.awt.Frame a(int param0, int param1, pd param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        ch[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ch[] var11 = null;
        un var12 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.b(121)) {
              L1: {
                if (param4 == 0) {
                  var11 = eh.a(105, param2);
                  var6_array = var11;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var11.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (var11[var8].field_c != param3) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var10 = null;
              String[] discarded$1 = ql.a((String) null, (byte) 7, '￞');
              var12 = param2.a(0, param4, param3, 1289287280, param1);
              L4: while (true) {
                if (var12.field_a != 0) {
                  var7 = (java.awt.Frame) var12.field_f;
                  if (var7 != null) {
                    if (2 != var12.field_a) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      ah.a((byte) 71, param2, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (java.awt.Frame) (Object) stackIn_22_0;
                  }
                } else {
                  mm.a(-25, 10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ql.F(").append(0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ',' + param4 + ',' + false + ')');
        }
        return stackIn_27_0;
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qn var14 = null;
        fi stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        fi stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof qn)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (fi) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (fi) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (qn) (Object) stackIn_3_0;
              df.b(param0 + param1.field_l, param3 - -param1.field_u, param1.field_g, param1.field_m, ((ql) this).field_h);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var14.field_M + (param0 + param1.field_l);
              var8 = var14.field_N + (param3 - -param1.field_u);
              df.c(var7, var8, var14.field_F, ((ql) this).field_c);
              if (-1 == var14.field_O) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var14.field_O * 3.141592653589793) / (double)var14.field_Q;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
                var12 = (int)(Math.cos(var9) * (double)var14.field_F);
                df.c(var11 + var7, var12 + var8, 1, ((ql) this).field_r);
                break L3;
              }
            }
            L4: {
              if (param4 == -23294) {
                break L4;
              } else {
                ql.a((byte) -39, -110, 72, -97, -121, -28, 103);
                break L4;
              }
            }
            L5: {
              df.c(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_G * 2.0 / (double)var14.field_Q;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
              var12 = (int)(Math.cos(var9) * (double)var14.field_F);
              df.a(var7, var8, var11 + var7, var8 - -var12, 1);
              if (null == ((ql) this).field_g) {
                break L5;
              } else {
                var13 = var14.field_F + var14.field_M + ((ql) this).field_b;
                int discarded$1 = ((ql) this).field_g.a(param1.field_n, var13 + (param1.field_l + param0), param1.field_u + param3 + ((ql) this).field_n, -var13 + (-((ql) this).field_b + param1.field_g), param1.field_m - (((ql) this).field_b << 1), ((ql) this).field_l, ((ql) this).field_a, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ql.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_m = null;
        field_k = null;
        field_e = null;
        field_p = null;
        field_q = null;
        field_s = null;
        field_j = null;
        field_o = null;
        field_f = null;
    }

    ql(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ql) this).field_a = param4;
            ((ql) this).field_b = param1;
            ((ql) this).field_c = param5;
            ((ql) this).field_r = param6;
            ((ql) this).field_n = param2;
            ((ql) this).field_l = param3;
            ((ql) this).field_h = param7;
            ((ql) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Advertising websites";
        field_i = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = "Go Back";
        field_d = true;
        field_f = "Show private chat from my friends and opponents";
        field_k = "You cannot add yourself!";
        field_s = "Lost";
        field_j = "Options Menu";
        field_t = 200;
        field_p = "Show lobby chat from my friends";
    }
}
