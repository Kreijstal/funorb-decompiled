/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek implements dh {
    private int field_k;
    private int field_e;
    static String field_q;
    private int field_g;
    static int field_o;
    static String field_u;
    private qi field_h;
    private int field_t;
    private int field_r;
    private int field_s;
    static String field_w;
    private int field_p;
    static int field_x;
    static String field_d;
    static hj field_m;
    static int field_l;
    private int field_f;
    static int[] field_n;
    private int field_i;
    static int field_j;
    private int field_b;
    static float[] field_c;
    private int field_a;
    static String field_v;

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj var11 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 instanceof sj) {
            stackIn_3_0 = (n) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (sj) (stackIn_3_0);
          if (var11 != null) {
            param0 = param0 & var11.field_D;
          }
          var7 = 5592405;
          if (param0) {
            var7 = 16777215;
          }
          if (param2 >= -48) {
            return;
          }
          tc.f(param1 + param3.field_k, param3.field_o + param4, param3.field_x, param3.field_u, this.field_k);
          var8 = this.field_t + (param3.field_k + param1);
          var9 = param3.field_o + param4 + this.field_g;
          tc.e(var8, var9, this.field_s, this.field_i, 5592405);
          tc.f(var8, var9, this.field_s, this.field_i, var7);
          if (var11.field_B) {
            tc.d(var8, var9, var8 + this.field_s, this.field_i + var9, 1);
            tc.d(this.field_s + var8, var9, var8, this.field_i + var9, 1);
          }
          if (this.field_h == null) {
            return;
          }
          var10 = this.field_r + this.field_s + this.field_t;
          this.field_h.a(param3.field_q, param1 - (-param3.field_k - var10), this.field_f + param3.field_o + param4, param3.field_x + (-var10 - this.field_r), -(this.field_r << 1) + param3.field_u, this.field_a, this.field_p, this.field_e, this.field_b, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ek.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_c = null;
        field_u = null;
        field_q = null;
        field_v = null;
        field_w = null;
        if (param0) {
          field_d = null;
          field_m = null;
          return;
        }
        field_w = (String) null;
        field_d = null;
        field_m = null;
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var8Lifetime1;
        var12 = HoldTheLine.field_D;
        try {
          if (param1 == 1024) {
            dd.a(param0 + 7091, param5, param2, param3, param4);
            return;
          }
          param5 = param5 - ((-1024 + param1) * param2.field_y >> 11);
          param3 = param3 - (param2.field_s * (-1024 + param1) >> 11);
          var6_int = param0 + tc.field_j * param5 + param3;
          var8 = 0;
          var9 = 0;
          for (var10 = param1 * param2.field_y >> 10; var10 > 0; var10--) {
            var8Lifetime1 = param2.field_s * (var9 >> 10) << 10;
            var7 = var6_int - 1;
            for (var11 = param1 * param2.field_s >> 10; 0 < var11; var11--) {
              if (param2.field_z[var8Lifetime1 >> 10] != 0) {
                if (16777215 == param2.field_z[var8Lifetime1 >> 10]) {
                  var7++;
                  tc.field_b[var7] = param4;
                } else {
                  var7++;
                  tc.field_b[var7] = param2.field_z[var8Lifetime1 >> 10];
                }
              } else {
                var7++;
              }
              var8Lifetime1 = var8Lifetime1 + 1048576 / param1;
            }
            var9 = var9 + 1048576 / param1;
            var6_int = var6_int + tc.field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("ek.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ek(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_b = 1;
        try {
          this.field_h = param0;
          this.field_t = param5;
          this.field_i = param7;
          this.field_s = param8;
          this.field_g = param6;
          this.field_p = param4;
          this.field_f = param2;
          this.field_r = param1;
          this.field_k = param9;
          this.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_u = "To server list";
        field_q = "Loading";
        field_d = "From only <%0>/month";
        field_j = 500;
        field_w = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = new float[]{1.0f, 4.0f, 10.0f, 50.0f};
        field_v = "Create";
    }
}
