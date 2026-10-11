/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk implements gl {
    private int field_f;
    private int field_j;
    private int field_o;
    static int field_k;
    static String field_i;
    static int field_n;
    private int field_d;
    static um field_p;
    private int field_a;
    private int field_r;
    private int field_g;
    private int field_s;
    static int field_e;
    private mm field_h;
    private int field_c;
    private int field_m;
    private int field_b;
    static String field_q;
    static byte[] field_l;

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param3) {
          var4 = 0;
          if (param2) {
            var4 += 4;
          }
          if (param0) {
            var4 += 2;
          }
          if (param1) {
            var4++;
          }
          return qk.field_e[var4];
        }
        field_p = (um) null;
        var4Lifetime1 = 0;
        if (param2) {
          var4Lifetime1 += 4;
        }
        if (param0) {
          var4Lifetime1 += 2;
        }
        if (param1) {
          var4Lifetime1++;
        }
        return qk.field_e[var4Lifetime1];
    }

    final static void a(int param0, int param1, ki param2) {
        uf var5 = we.field_b;
        var5.f(param0, -4);
        var5.field_n = var5.field_n + 1;
        int var4 = var5.field_n;
        var5.a(true, 1);
        var5.a(true, param2.field_v);
        if (param1 != -15016) {
          return;
        }
        try {
          var5.a(true, param2.field_p);
          var5.a(param2.field_s, false);
          var5.a(param2.field_r, false);
          var5.a(param2.field_o, false);
          var5.a(param2.field_q, false);
          var5.a((byte) -15, var4);
          var5.b(var5.field_n - var4, true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "kk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= -54) {
          field_l = null;
          field_i = null;
          field_q = null;
          field_p = null;
          return;
        }
        field_q = (String) null;
        field_l = null;
        field_i = null;
        field_q = null;
        field_p = null;
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        ce stackIn_5_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var11 = null;
        try {
          if (param3 > -60) {
            kk.a((byte) -80);
          }
          if (!(param4 instanceof dl)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (ce) (param4);
          }
          var11 = (dl) (stackIn_5_0);
          if (var11 != null) {
            param0 = param0 & var11.field_I;
          }
          var7 = 5592405;
          hk.a(param1 + param4.field_u, param2 + param4.field_D, param4.field_t, param4.field_y, this.field_o);
          if (param0) {
            var7 = 16777215;
          }
          var8 = param1 + param4.field_u + this.field_s;
          var9 = param4.field_D + param2 + this.field_j;
          hk.d(var8, var9, this.field_m, this.field_f, 5592405);
          hk.a(var8, var9, this.field_m, this.field_f, var7);
          if (var11.field_H) {
            hk.b(var8, var9, this.field_m + var8, var9 + this.field_f, 1);
            hk.b(var8 + this.field_m, var9, var8, this.field_f + var9, 1);
          }
          if (this.field_h == null) {
            return;
          }
          var10 = this.field_m + this.field_s + this.field_g;
          this.field_h.a(param4.field_E, param1 + param4.field_u + var10, this.field_r + param2 + param4.field_D, param4.field_t - (this.field_g + var10), -(this.field_g << 1) + param4.field_y, this.field_d, this.field_b, this.field_c, this.field_a, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("kk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    kk(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_c = 1;
        this.field_a = 1;
        try {
          this.field_j = param6;
          this.field_g = param1;
          this.field_m = param8;
          this.field_b = param4;
          this.field_d = param3;
          this.field_r = param2;
          this.field_o = param9;
          this.field_f = param7;
          this.field_h = param0;
          this.field_s = param5;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_i = "Hide chat";
        field_q = "<%0>: ";
        field_p = new um();
    }
}
