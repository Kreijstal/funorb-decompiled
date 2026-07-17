/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (param0) {
          df discarded$2 = t.a(false, 81);
          var2 = new df();
          jj.field_D.a(0, (le) (Object) var2);
          p.a(0, param1);
          return var2;
        } else {
          var2 = new df();
          jj.field_D.a(0, (le) (Object) var2);
          p.a(0, param1);
          return var2;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
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
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("t.D(");
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
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    public static void b(int param0) {
        field_i = null;
        field_m = null;
    }

    final static String a(int param0) {
        if (!(null != ce.field_r)) {
            return "";
        }
        return ce.field_r;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fp var14 = null;
        ga stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ga stackOut_1_0 = null;
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
              if (!(param3 instanceof fp)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ga) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ga) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (fp) (Object) stackIn_3_0;
              bi.b(param3.field_k + param4, param3.field_j + param2, param3.field_i, param3.field_n, ((t) this).field_a);
              if (param0 == 16777215) {
                break L2;
              } else {
                ((t) this).field_g = null;
                break L2;
              }
            }
            L3: {
              if (var14 == null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = var14.field_K + (param4 + param3.field_k);
              var8 = var14.field_G + param3.field_j + param2;
              bi.g(var7, var8, var14.field_I, ((t) this).field_j);
              if (-1 == var14.field_E) {
                break L4;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_E) / (double)var14.field_L;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                bi.g(var11 + var7, var8 + var12, 1, ((t) this).field_d);
                break L4;
              }
            }
            L5: {
              bi.g(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var14.field_J * 3.141592653589793) / (double)var14.field_L;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              bi.e(var7, var8, var7 + var11, var8 - -var12, 1);
              if (null == ((t) this).field_g) {
                break L5;
              } else {
                var13 = ((t) this).field_e + (var14.field_I + var14.field_K);
                int discarded$1 = ((t) this).field_g.a(param3.field_o, var13 + param4 + param3.field_k, ((t) this).field_k + param3.field_j + param2, -((t) this).field_e - (var13 - param3.field_i), param3.field_n - (((t) this).field_e << 1), ((t) this).field_l, ((t) this).field_f, 1, 1, 0);
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
            stackOut_11_1 = new StringBuilder().append("t.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    t(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((t) this).field_g = param0;
            ((t) this).field_j = param5;
            ((t) this).field_k = param2;
            ((t) this).field_l = param3;
            ((t) this).field_d = param6;
            ((t) this).field_e = param1;
            ((t) this).field_f = param4;
            ((t) this).field_a = param7;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "t.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1 + (int)(9.0 * Math.sqrt(2.0));
    }
}
