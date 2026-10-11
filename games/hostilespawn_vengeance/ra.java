/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra implements nn {
    static nc field_e;
    static String field_f;
    private int field_m;
    private int field_k;
    static bd field_b;
    private int field_d;
    static int field_a;
    static int[] field_i;
    private int field_h;
    private vm field_l;
    private int field_g;
    private int field_j;
    private int field_c;

    public static void a(int param0) {
        field_i = null;
        if (param0 == 11129) {
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_i = (int[]) null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    final static void a(int param0, int[] param1, int param2, oj param3, int[] param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ha.field_t == 0) {
            param1[param2] = 0;
            param1[1 + param2] = 0;
            param4[param2] = 1;
            param4[1 + param2] = 1;
            param3.field_i = -1;
          } else {
            param1[param2] = 2;
            param1[param2 + 1] = 2;
            param4[param2] = 0;
            param4[1 + param2] = 0;
          }
          if (param0 == 1) {
            return;
          }
          ra.a(115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ra.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        ag stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param3 instanceof g) {
            stackIn_3_0 = (ag) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (g) (stackIn_3_0);
          if (var14 == null) {
          }
          si.c(param3.field_v + param1, param3.field_m + param0, param3.field_s, param3.field_x, this.field_h);
          var7 = var14.field_P + (param1 + param3.field_v);
          var8 = var14.field_Q + (param0 + param3.field_m);
          si.e(var7, var8, var14.field_J, this.field_g);
          if (var14.field_L != -1) {
            var9 = 3.141592653589793 * (double)var14.field_L * 2.0 / (double)var14.field_I;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            si.e(var11 + var7, var8 + var12, 1, this.field_j);
          }
          si.e(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_I;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_J);
          if (param2 != 15430) {
            return;
          }
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_J);
          si.g(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (this.field_l == null) {
            return;
          }
          var13 = this.field_c + var14.field_J + var14.field_P;
          this.field_l.a(param3.field_n, param1 + param3.field_v + var13, param0 + param3.field_m + this.field_k, param3.field_s - this.field_c - var13, param3.field_x - (this.field_c << 1), this.field_d, this.field_m, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ra.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    ra(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_k = param2;
          this.field_d = param3;
          this.field_l = param0;
          this.field_g = param5;
          this.field_h = param7;
          this.field_c = param1;
          this.field_j = param6;
          this.field_m = param4;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_f = "Something just hit the ship! I have a bad feeling about this.";
    }
}
