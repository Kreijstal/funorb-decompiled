/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ui {
    private int field_a;
    private int field_l;
    private int field_c;
    static int[] field_d;
    private kg field_i;
    private int field_o;
    static ci field_e;
    static boolean field_p;
    private int field_b;
    private int field_g;
    private int field_n;
    static fa field_f;
    private int field_j;
    private int field_m;
    static long field_q;
    private int field_k;
    private int field_h;

    final static int b(int param0) {
        if (param0 >= -5) {
            int discarded$0 = wi.b(35);
            return (int)(1000000000L / fg.field_j);
        }
        return (int)(1000000000L / fg.field_j);
    }

    public static void a() {
        field_d = null;
        field_e = null;
        int var1 = 0;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bf var12 = null;
        qg stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
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
              if (!(param4 instanceof bf)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qg) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (qg) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (bf) (Object) stackIn_3_0;
              if (var12 != null) {
                param2 = param2 & var12.field_t;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              sb.a(param4.field_p + param0, param4.field_n + param1, param4.field_l, param4.field_h, ((wi) this).field_k);
              var8 = param0 - (-param4.field_p + -((wi) this).field_b);
              var9 = param4.field_n + param1 + ((wi) this).field_g;
              sb.c(var8, var9, ((wi) this).field_n, ((wi) this).field_c, 5592405);
              sb.a(var8, var9, ((wi) this).field_n, ((wi) this).field_c, var7);
              if (!var12.field_y) {
                break L4;
              } else {
                sb.e(var8, var9, var8 - -((wi) this).field_n, ((wi) this).field_c + var9, 1);
                sb.e(var8 - -((wi) this).field_n, var9, var8, var9 + ((wi) this).field_c, 1);
                break L4;
              }
            }
            var10 = -41 % ((51 - param3) / 47);
            if (null != ((wi) this).field_i) {
              var11 = ((wi) this).field_a + (((wi) this).field_n - -((wi) this).field_b);
              int discarded$1 = ((wi) this).field_i.a(param4.field_k, param4.field_p + (param0 + var11), ((wi) this).field_h + param1 + param4.field_n, param4.field_l + -((wi) this).field_a + -var11, param4.field_h - (((wi) this).field_a << 1), ((wi) this).field_j, ((wi) this).field_l, ((wi) this).field_o, ((wi) this).field_m, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("wi.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    wi(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((wi) this).field_o = 1;
        ((wi) this).field_m = 1;
        try {
            ((wi) this).field_l = param4;
            ((wi) this).field_c = param7;
            ((wi) this).field_n = param8;
            ((wi) this).field_g = param6;
            ((wi) this).field_k = param9;
            ((wi) this).field_j = param3;
            ((wi) this).field_h = param2;
            ((wi) this).field_i = param0;
            ((wi) this).field_a = param1;
            ((wi) this).field_b = param5;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "wi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_f = null;
    }
}
