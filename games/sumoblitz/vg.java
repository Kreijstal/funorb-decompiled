/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg implements mh {
    private int field_i;
    private int field_f;
    private int field_d;
    private int field_b;
    private vn field_m;
    private int field_j;
    private int field_l;
    private int field_g;
    static int[] field_k;
    private int field_a;
    private int field_c;
    private int field_e;
    private int field_h;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wr var11 = null;
        pk stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof wr)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pk) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (pk) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (wr) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param3 = param3 & var11.field_x;
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
            L4: {
              lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, ((vg) this).field_e);
              var8 = ((vg) this).field_h + param4 - -param0.field_r;
              var9 = ((vg) this).field_g + param0.field_v + param1;
              lk.f(var8, var9, ((vg) this).field_c, ((vg) this).field_j, param2);
              lk.d(var8, var9, ((vg) this).field_c, ((vg) this).field_j, var7);
              if (!var11.field_C) {
                break L4;
              } else {
                lk.e(var8, var9, var8 - -((vg) this).field_c, var9 + ((vg) this).field_j, 1);
                lk.e(((vg) this).field_c + var8, var9, var8, ((vg) this).field_j + var9, 1);
                break L4;
              }
            }
            L5: {
              if (null == ((vg) this).field_m) {
                break L5;
              } else {
                var10 = ((vg) this).field_c - (-((vg) this).field_h - ((vg) this).field_l);
                int discarded$1 = ((vg) this).field_m.a(param0.field_m, param4 - (-param0.field_r - var10), ((vg) this).field_i + param0.field_v + param1, -var10 + -((vg) this).field_l + param0.field_q, -(((vg) this).field_l << 1) + param0.field_p, ((vg) this).field_a, ((vg) this).field_f, ((vg) this).field_d, ((vg) this).field_b, 0);
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
            stackOut_13_1 = new StringBuilder().append("vg.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        field_k = null;
    }

    vg(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vg) this).field_b = 1;
        ((vg) this).field_d = 1;
        try {
            ((vg) this).field_h = param5;
            ((vg) this).field_i = param2;
            ((vg) this).field_g = param6;
            ((vg) this).field_m = param0;
            ((vg) this).field_e = param9;
            ((vg) this).field_c = param8;
            ((vg) this).field_f = param4;
            ((vg) this).field_l = param1;
            ((vg) this).field_a = param3;
            ((vg) this).field_j = param7;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
    }
}
