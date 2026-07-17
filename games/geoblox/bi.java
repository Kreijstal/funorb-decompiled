/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements dh {
    private int field_f;
    private int field_k;
    private int field_i;
    private int field_l;
    private int field_m;
    private int field_d;
    private m field_b;
    private int field_e;
    private int field_j;
    private int field_n;
    private int field_a;
    static int field_g;
    private int field_h;
    static String[] field_c;

    final static boolean a(boolean param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            int discarded$6 = 118;
            if (kk.a(false, param1)) {
              var3_int = 0;
              L1: while (true) {
                if (param1.length() <= var3_int) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (q.a(param1.charAt(var3_int), (byte) 118)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("bi.B(").append(0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -121 + 41);
        }
        return stackIn_12_0 != 0;
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vi var11 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof vi) {
                stackOut_2_0 = (el) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (el) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (vi) (Object) stackIn_3_0;
              if (var11 != null) {
                param3 = param3 & var11.field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 <= -5) {
                break L3;
              } else {
                ((bi) this).field_a = -3;
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              vb.a(param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, ((bi) this).field_d);
              if (!param3) {
                break L4;
              } else {
                var7 = 16777215;
                break L4;
              }
            }
            L5: {
              var8 = ((bi) this).field_k + (param0 + param4.field_v);
              var9 = ((bi) this).field_j + (param4.field_m + param2);
              vb.f(var8, var9, ((bi) this).field_n, ((bi) this).field_h, 5592405);
              vb.a(var8, var9, ((bi) this).field_n, ((bi) this).field_h, var7);
              if (!var11.field_y) {
                break L5;
              } else {
                vb.g(var8, var9, ((bi) this).field_n + var8, var9 + ((bi) this).field_h, 1);
                vb.g(var8 + ((bi) this).field_n, var9, var8, ((bi) this).field_h + var9, 1);
                break L5;
              }
            }
            L6: {
              if (null == ((bi) this).field_b) {
                break L6;
              } else {
                var10 = ((bi) this).field_m + ((bi) this).field_n + ((bi) this).field_k;
                int discarded$1 = ((bi) this).field_b.a(param4.field_s, var10 + param4.field_v + param0, param4.field_m + param2 - -((bi) this).field_i, param4.field_r + (-((bi) this).field_m + -var10), -(((bi) this).field_m << 1) + param4.field_h, ((bi) this).field_e, ((bi) this).field_f, ((bi) this).field_a, ((bi) this).field_l, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("bi.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    public static void a() {
        field_c = null;
    }

    bi(m param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((bi) this).field_a = 1;
        ((bi) this).field_l = 1;
        try {
            ((bi) this).field_f = param4;
            ((bi) this).field_m = param1;
            ((bi) this).field_b = param0;
            ((bi) this).field_n = param8;
            ((bi) this).field_h = param7;
            ((bi) this).field_e = param3;
            ((bi) this).field_i = param2;
            ((bi) this).field_k = param5;
            ((bi) this).field_d = param9;
            ((bi) this).field_j = param6;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
