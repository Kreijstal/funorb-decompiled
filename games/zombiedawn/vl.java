/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vl implements io {
    private int field_l;
    private int field_i;
    private int field_q;
    private int field_h;
    static vk field_m;
    private int field_j;
    static String[] field_p;
    private rb field_d;
    private int field_n;
    private int field_g;
    static int field_r;
    private int field_e;
    static hi field_b;
    private int field_a;
    static String field_k;
    private int field_c;
    private int field_o;
    static String field_f;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fm var11 = null;
        ga stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param3 instanceof fm) {
                stackOut_2_0 = (ga) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ga) (Object) stackOut_1_0;
                break L1;
              }
            }
            var11 = (fm) (Object) stackIn_3_0;
            if (param0 == 16777215) {
              L2: {
                if (var11 == null) {
                  break L2;
                } else {
                  param1 = param1 & var11.field_C;
                  break L2;
                }
              }
              L3: {
                var7 = 5592405;
                if (!param1) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                bi.b(param3.field_k + param4, param2 - -param3.field_j, param3.field_i, param3.field_n, ((vl) this).field_e);
                var8 = ((vl) this).field_h + param4 + param3.field_k;
                var9 = param2 - (-param3.field_j - ((vl) this).field_c);
                bi.f(var8, var9, ((vl) this).field_l, ((vl) this).field_n, 5592405);
                bi.b(var8, var9, ((vl) this).field_l, ((vl) this).field_n, var7);
                if (!var11.field_x) {
                  break L4;
                } else {
                  bi.e(var8, var9, ((vl) this).field_l + var8, ((vl) this).field_n + var9, 1);
                  bi.e(((vl) this).field_l + var8, var9, var8, var9 - -((vl) this).field_n, 1);
                  break L4;
                }
              }
              L5: {
                if (null == ((vl) this).field_d) {
                  break L5;
                } else {
                  var10 = ((vl) this).field_l + ((vl) this).field_h + ((vl) this).field_q;
                  int discarded$1 = ((vl) this).field_d.a(param3.field_o, param3.field_k + param4 + var10, param2 - -param3.field_j - -((vl) this).field_j, param3.field_i - (((vl) this).field_q + var10), param3.field_n + -(((vl) this).field_q << 1), ((vl) this).field_i, ((vl) this).field_g, ((vl) this).field_o, ((vl) this).field_a, 0);
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("vl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (sn.field_c == null) {
                break L0;
              } else {
                L1: {
                  if (-1 >= param1) {
                    if (df.field_j != ic.field_T) {
                      break L0;
                    } else {
                      if (dp.field_e.field_j != 0) {
                        break L1;
                      } else {
                        if (~pd.a(-22826) >= ~(10000L + hm.field_N)) {
                          break L1;
                        } else {
                          dp.field_e.j(11, param1);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (-1 != dp.field_e.field_j) {
                      break L1;
                    } else {
                      if (~pd.a(-22826) >= ~(10000L + hm.field_N)) {
                        break L1;
                      } else {
                        dp.field_e.j(11, param1);
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (0 < dp.field_e.field_j) {
                    {
                      L3: {
                        sn.field_c.a(dp.field_e.field_j, true, 0, dp.field_e.field_h);
                        hm.field_N = pd.a(-22826);
                        break L3;
                      }
                    }
                    dp.field_e.field_j = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            }
            dp.field_e.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_m = null;
        field_p = null;
        field_b = null;
        field_k = null;
        field_f = null;
    }

    final static void a(wk param0, ub param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            ac.field_m = ac.field_m + 1;
            var3_int = sh.field_e;
            if (var3_int == 0) {
              s.a((byte) 80, param0, param1);
              return;
            } else {
              if (var3_int != 1) {
                break L0;
              } else {
                pn.a(param0, 152, param1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vl.C(");
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + -91 + ')');
        }
    }

    vl(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vl) this).field_a = 1;
        ((vl) this).field_o = 1;
        try {
            ((vl) this).field_e = param9;
            ((vl) this).field_h = param5;
            ((vl) this).field_c = param6;
            ((vl) this).field_g = param4;
            ((vl) this).field_n = param7;
            ((vl) this).field_d = param0;
            ((vl) this).field_q = param1;
            ((vl) this).field_l = param8;
            ((vl) this).field_j = param2;
            ((vl) this).field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = new vk();
        field_k = "Achievements This Game";
        field_f = "Go Back";
    }
}
