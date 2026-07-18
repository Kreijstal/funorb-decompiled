/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd implements jm {
    private int field_f;
    private int field_e;
    private lh field_m;
    private int field_a;
    private int field_d;
    static jc field_h;
    private int field_n;
    private int field_g;
    private int field_j;
    private int field_i;
    private int field_k;
    private int field_c;
    static String field_b;
    static volatile int field_l;
    private int field_o;

    public static void a() {
        field_b = null;
        int var1 = 0;
        field_h = null;
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ki var11 = null;
        mf stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        mf stackOut_1_0 = null;
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
            L1: {
              if (!(param4 instanceof ki)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (mf) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (mf) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ki) (Object) stackIn_3_0;
              if (var11 != null) {
                param3 = param3 & var11.field_H;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param3) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 >= 58) {
              L4: {
                wb.f(param4.field_u + param1, param4.field_r + param2, param4.field_y, param4.field_C, ((nd) this).field_k);
                var8 = ((nd) this).field_c + param4.field_u + param1;
                var9 = param2 + (param4.field_r - -((nd) this).field_d);
                wb.c(var8, var9, ((nd) this).field_f, ((nd) this).field_a, 5592405);
                wb.f(var8, var9, ((nd) this).field_f, ((nd) this).field_a, var7);
                if (var11.field_I) {
                  wb.b(var8, var9, ((nd) this).field_f + var8, var9 - -((nd) this).field_a, 1);
                  wb.b(((nd) this).field_f + var8, var9, var8, ((nd) this).field_a + var9, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((nd) this).field_m != null) {
                var10 = ((nd) this).field_o + (((nd) this).field_c + ((nd) this).field_f);
                int discarded$1 = ((nd) this).field_m.a(param4.field_v, var10 + (param4.field_u + param1), ((nd) this).field_e + param4.field_r + param2, param4.field_y + (-var10 - ((nd) this).field_o), -(((nd) this).field_o << 1) + param4.field_C, ((nd) this).field_g, ((nd) this).field_i, ((nd) this).field_j, ((nd) this).field_n, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("nd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    nd(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((nd) this).field_j = 1;
        ((nd) this).field_n = 1;
        try {
            ((nd) this).field_f = param8;
            ((nd) this).field_o = param1;
            ((nd) this).field_m = param0;
            ((nd) this).field_g = param3;
            ((nd) this).field_e = param2;
            ((nd) this).field_a = param7;
            ((nd) this).field_c = param5;
            ((nd) this).field_i = param4;
            ((nd) this).field_d = param6;
            ((nd) this).field_k = param9;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new jc();
        field_b = "Send private Quick Chat to <%0>";
        field_l = 0;
    }
}
