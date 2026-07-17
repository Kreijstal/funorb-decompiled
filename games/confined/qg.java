/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qg extends mf {
    private boolean field_j;
    private String field_i;
    static pm[] field_k;
    static int field_h;

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        in var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_1_0 = null;
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
            var5 = (CharSequence) (Object) param0;
            var3 = hc.a(-24682, var5);
            if (var3 == null) {
              L1: {
                if (!param0.equals((Object) (Object) ((qg) this).field_i)) {
                  var4 = c.a(param0, 78);
                  if (var4 != null) {
                    if (var4.field_f == null) {
                      ((qg) this).field_i = param0;
                      ((qg) this).field_j = var4.field_a;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (!((qg) this).field_j) {
                stackOut_13_0 = fh.field_c;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    ((qg) this).field_i = null;
                    break L2;
                  }
                }
                stackOut_17_0 = th.field_fb;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("qg.A(");
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
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    qg(ul param0) {
        super(param0);
        ((qg) this).field_j = false;
    }

    public static void f() {
        field_k = null;
    }

    final static void a(double param0, int param1, double[] param2, double param3, vg param4, dj param5, int param6) {
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        try {
            var9_double = param2[9] * param5.field_C + param5.field_E;
            var11 = param5.field_C * param2[10] + param5.field_t;
            var13 = param5.field_D + param5.field_C * param2[11];
            var15 = 0.4 * param3;
            pa.a(var9_double, var15, (byte) -11, param6, var13, var11, cd.field_o[(param1 & 15) >> 1], param0, param4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qg.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 41);
        }
    }

    final void e(int param0) {
        ((qg) this).field_i = null;
        if (param0 != 639775169) {
            Object var3 = null;
            qg.a(0.5264573121586292, 97, (double[]) null, -2.3170663679572066, (vg) null, (dj) null, -93);
        }
    }

    final fi a(byte param0, String param1) {
        in var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        CharSequence var5 = null;
        fi stackIn_4_0 = null;
        fi stackIn_11_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_10_0 = null;
        fi stackOut_15_0 = null;
        fi stackOut_14_0 = null;
        fi stackOut_3_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -44) {
                break L1;
              } else {
                var4 = null;
                qg.a(0.033002690553074567, -88, (double[]) null, 1.6640993038654757, (vg) null, (dj) null, -56);
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param1;
            int discarded$5 = 13684;
            if (lc.a(var5)) {
              L2: {
                if (!param1.equals((Object) (Object) ((qg) this).field_i)) {
                  L3: {
                    var3 = c.a(param1, 117);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_f == null) {
                        ((qg) this).field_j = var3.field_a;
                        ((qg) this).field_i = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = qh.field_x;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (((qg) this).field_j) {
                  stackOut_15_0 = nn.field_q;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = fb.field_e;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_3_0 = fb.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("qg.C(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pm[5];
    }
}
