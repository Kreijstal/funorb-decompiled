/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements kg {
    static hl[] field_o;
    private int field_q;
    static je field_j;
    private int field_e;
    private int field_b;
    private int field_n;
    static int field_f;
    static String[] field_h;
    private int field_c;
    static int field_i;
    private jb field_k;
    private int field_g;
    private int field_m;
    private int field_d;
    private int field_p;
    private int field_a;
    private int field_l;

    public static void a(int param0) {
        field_j = null;
        field_o = null;
        field_h = null;
        if (param0 != -17479) {
            og.a(-8);
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        re var11 = null;
        na stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param0 instanceof re) {
                stackOut_2_0 = (na) (param0);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (na) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (re) ((Object) stackIn_3_0);
              if (var11 != null) {
                param4 = param4 & var11.field_K;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3) {
                break L3;
              } else {
                field_f = 95;
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              ra.c(param1 - -param0.field_t, param0.field_w + param2, param0.field_F, param0.field_u, this.field_q);
              if (param4) {
                var7 = 16777215;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = this.field_g + (param1 - -param0.field_t);
              var9 = param2 - -param0.field_w - -this.field_a;
              ra.a(var8, var9, this.field_l, this.field_e, 5592405);
              ra.c(var8, var9, this.field_l, this.field_e, var7);
              if (!var11.field_N) {
                break L5;
              } else {
                ra.d(var8, var9, this.field_l + var8, this.field_e + var9, 1);
                ra.d(this.field_l + var8, var9, var8, var9 - -this.field_e, 1);
                break L5;
              }
            }
            if (this.field_k != null) {
              var10 = this.field_g + this.field_l - -this.field_n;
              discarded$1 = this.field_k.a(param0.field_A, var10 + (param0.field_t + param1), param2 - -param0.field_w - -this.field_c, -var10 + -this.field_n + param0.field_F, param0.field_u + -(this.field_n << 1887602177), this.field_b, this.field_p, this.field_m, this.field_d, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var6);
            stackOut_17_1 = new StringBuilder().append("og.L(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    og(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_m = 1;
        try {
            this.field_e = param7;
            this.field_a = param6;
            this.field_l = param8;
            this.field_q = param9;
            this.field_k = param0;
            this.field_b = param3;
            this.field_g = param5;
            this.field_c = param2;
            this.field_n = param1;
            this.field_p = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = 0;
    }
}
