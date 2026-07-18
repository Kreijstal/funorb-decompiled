/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class t implements io {
    private int field_a;
    private int field_l;
    private rb field_g;
    static fi field_m;
    static fi field_i;
    private int field_f;
    private int field_j;
    private int field_k;
    private int field_e;
    static int field_b;
    private int field_d;
    static int field_h;
    static int field_c;

    final static df a(boolean param0, int param1) {
        df var2 = null;
        RuntimeException var2_ref = null;
        df stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                df discarded$2 = t.a(false, 81);
                break L1;
              }
            }
            var2 = new df();
            jj.field_D.a(0, (le) (Object) var2);
            p.a(0, param1);
            stackOut_3_0 = (df) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2_ref, "t.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1 > 65) {
              L1: {
                L2: {
                  param2 = ic.a("", 0, param2, '_');
                  var3 = am.a(param2, 1);
                  if (param0.indexOf(param2) != -1) {
                    break L2;
                  } else {
                    if (param0.indexOf(var3) == -1) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("t.D(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 27803) {
                break L1;
              } else {
                field_b = -70;
                break L1;
              }
            }
            field_i = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "t.E(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            if (null == ce.field_r) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 1) {
                stackOut_8_0 = ce.field_r;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "t.B(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        fp var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ga stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ga stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof fp)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (ga) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = (ga) param3;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_ref = (fp) (Object) stackIn_4_0;
              bi.b(param3.field_k + param4, param3.field_j + param2, param3.field_i, param3.field_n, ((t) this).field_a);
              if (param0 == 16777215) {
                break L2;
              } else {
                ((t) this).field_g = null;
                break L2;
              }
            }
            L3: {
              if (null == var6_ref) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = var6_ref.field_K + (param4 + param3.field_k);
              var8 = var6_ref.field_G + param3.field_j + param2;
              bi.g(var7, var8, var6_ref.field_I, ((t) this).field_j);
              if (-1 == var6_ref.field_E) {
                break L4;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var6_ref.field_E) / (double)var6_ref.field_L;
                var11 = (int)(-Math.sin(var9) * (double)var6_ref.field_I);
                var12 = (int)(Math.cos(var9) * (double)var6_ref.field_I);
                bi.g(var11 + var7, var8 + var12, 1, ((t) this).field_d);
                break L4;
              }
            }
            L5: {
              bi.g(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var6_ref.field_J * 3.141592653589793) / (double)var6_ref.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var6_ref.field_I);
              var12 = (int)(Math.cos(var9) * (double)var6_ref.field_I);
              bi.e(var7, var8, var7 + var11, var8 - -var12, 1);
              if (null == ((t) this).field_g) {
                break L5;
              } else {
                var13 = ((t) this).field_e + (var6_ref.field_I + var6_ref.field_K);
                int discarded$1 = ((t) this).field_g.a(param3.field_o, var13 + param4 + param3.field_k, ((t) this).field_k + param3.field_j + param2, -((t) this).field_e - (var13 - param3.field_i), param3.field_n - (((t) this).field_e << -1077052639), ((t) this).field_l, ((t) this).field_f, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("t.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param4 + ')');
        }
    }

    t(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((t) this).field_g = param0;
            ((t) this).field_j = param5;
            ((t) this).field_k = param2;
            ((t) this).field_l = param3;
            ((t) this).field_d = param6;
            ((t) this).field_e = param1;
            ((t) this).field_f = param4;
            ((t) this).field_a = param7;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("t.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1 + (int)(9.0 * Math.sqrt(2.0));
    }
}
