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
        na stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        re var11 = null;
        try {
          if (param0 instanceof re) {
            stackIn_3_0 = (na) (param0);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (re) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_K;
          }
          if (!param3) {
            field_f = 95;
          }
          var7 = 5592405;
          ra.c(param1 + param0.field_t, param0.field_w + param2, param0.field_F, param0.field_u, this.field_q);
          if (param4) {
            var7 = 16777215;
          }
          var8 = this.field_g + (param1 + param0.field_t);
          var9 = param2 + param0.field_w + this.field_a;
          ra.a(var8, var9, this.field_l, this.field_e, 5592405);
          ra.c(var8, var9, this.field_l, this.field_e, var7);
          if (var11.field_N) {
            ra.d(var8, var9, this.field_l + var8, this.field_e + var9, 1);
            ra.d(this.field_l + var8, var9, var8, var9 + this.field_e, 1);
          }
          if (this.field_k == null) {
            return;
          }
          var10 = this.field_g + this.field_l + this.field_n;
          this.field_k.a(param0.field_A, var10 + (param0.field_t + param1), param2 + param0.field_w + this.field_c, -var10 - this.field_n + param0.field_F, param0.field_u - (this.field_n << 1), this.field_b, this.field_p, this.field_m, this.field_d, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("og.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
