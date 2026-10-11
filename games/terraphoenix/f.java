/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f implements cj {
    private int field_c;
    private int field_j;
    private int field_b;
    private int field_f;
    private int field_d;
    private pk field_k;
    private int field_e;
    static int[] field_a;
    static bg[] field_i;
    private int field_l;
    static int field_g;
    static String field_h;

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        field_a = null;
        if (param0 != -108911807) {
          field_g = -119;
        }
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        gh var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param1 instanceof gh) ? null : (gh) (param1);
          l.f(param2 + param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, this.field_d);
          if (param3 != -24381) {
            this.field_b = 13;
          }
          if (var14 == null) {
          }
          var7 = var14.field_R + (param2 + param1.field_w);
          var8 = param0 + param1.field_u + var14.field_M;
          l.e(var7, var8, var14.field_Q, this.field_b);
          if (var14.field_P != -1) {
            var9 = 3.141592653589793 * (double)var14.field_P * 2.0 / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            l.e(var7 + var11, var8 + var12, 1, this.field_l);
          }
          l.e(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.field_N) / (double)var14.field_K;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_Q);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_Q);
          l.c(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (null != this.field_k) {
            var13 = var14.field_Q + (var14.field_R + this.field_c);
            this.field_k.a(param1.field_o, var13 + (param1.field_w + param2), this.field_j + param0 + param1.field_u, -this.field_c + (-var13 + param1.field_p), param1.field_n - (this.field_c << 1), this.field_e, this.field_f, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    f(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_f = param4;
          this.field_e = param3;
          this.field_d = param7;
          this.field_l = param6;
          this.field_b = param5;
          this.field_c = param1;
          this.field_j = param2;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -48) {
            return true;
          }
          if (param0 != null &&
            param0.length() >= na.field_Y) {
            if (param0.length() > sl.field_e) {
              return true;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("f.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_h = "    Allied soldier";
    }
}
