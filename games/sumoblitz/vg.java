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
        pk stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wr var11 = null;
        try {
          if (!(param0 instanceof wr)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (pk) (param0);
          }
          var11 = (wr) (stackIn_3_0);
          if (var11 != null) {
            param3 = param3 & var11.field_x;
          }
          var7 = 5592405;
          if (param3) {
            var7 = 16777215;
          }
          lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, this.field_e);
          var8 = this.field_h + param4 + param0.field_r;
          var9 = this.field_g + param0.field_v + param1;
          lk.f(var8, var9, this.field_c, this.field_j, param2);
          lk.d(var8, var9, this.field_c, this.field_j, var7);
          if (var11.field_C) {
            lk.e(var8, var9, var8 + this.field_c, var9 + this.field_j, 1);
            lk.e(this.field_c + var8, var9, var8, this.field_j + var9, 1);
          }
          if (null != this.field_m) {
            var10 = this.field_c - (-this.field_h - this.field_l);
            this.field_m.a(param0.field_m, param4 - (-param0.field_r - var10), this.field_i + param0.field_v + param1, -var10 - this.field_l + param0.field_q, -(this.field_l << 1) + param0.field_p, this.field_a, this.field_f, this.field_d, this.field_b, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vg.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
          vg.a(false);
        }
    }

    vg(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_b = 1;
        this.field_d = 1;
        try {
          this.field_h = param5;
          this.field_i = param2;
          this.field_g = param6;
          this.field_m = param0;
          this.field_e = param9;
          this.field_c = param8;
          this.field_f = param4;
          this.field_l = param1;
          this.field_a = param3;
          this.field_j = param7;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
    }
}
