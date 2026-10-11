/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv implements wwa {
    private int field_c;
    private int field_m;
    private int field_l;
    private int field_n;
    private no field_j;
    private int field_e;
    private int field_k;
    private int field_b;
    private int field_d;
    private int field_i;
    static String field_f;
    static int[] field_a;
    private int field_g;
    private int field_h;

    final static int a(int param0, int param1) {
        int var2 = kba.field_a.a(param1, (byte) 121) - kba.field_a.field_d;
        int var3 = param0 + var2 / 4;
        if (var3 > 250) {
          var3 = 250;
          return var3;
        }
        if (var3 >= 6) {
          return var3;
        }
        var3 = 6;
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!li.field_i) {
          dma.b(param1, param3, param5, param2, param4);
          if (param0 < 106) {
            field_f = (String) null;
            return;
          }
          return;
        }
        if (!fua.field_o) {
          if (param0 < 106) {
            field_f = (String) null;
            return;
          }
          return;
        }
        og.field_r.a(-83, param3, param5, -16777216 | param4, param1, param2);
        if (param0 >= 106) {
          return;
        }
        field_f = (String) null;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        shb stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jla var12 = null;
        try {
          if (!(param1 instanceof jla)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (shb) (param1);
          }
          var12 = (jla) (stackIn_3_0);
          if (var12 != null) {
            param4 = param4 & var12.field_x;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          dma.d(param2 + param1.field_g, param3 + param1.field_r, param1.field_h, param1.field_f, this.field_k);
          var8 = this.field_d + (param2 + param1.field_g);
          var9 = param1.field_r + param3 + this.field_n;
          dma.c(var8, var9, this.field_l, this.field_i, 5592405);
          dma.d(var8, var9, this.field_l, this.field_i, var7);
          if (var12.field_u) {
            dma.a(var8, var9, var8 + this.field_l, this.field_i + var9, 1);
            dma.a(var8 + this.field_l, var9, var8, this.field_i + var9, 1);
          }
          var10 = 49 % ((param0 + 27) / 35);
          if (null == this.field_j) {
            return;
          }
          var11 = this.field_l + this.field_d + this.field_m;
          this.field_j.a(param1.field_j, var11 + (param2 + param1.field_g), this.field_c + param3 + param1.field_r, -this.field_m + (-var11 + param1.field_h), -(this.field_m << 1) + param1.field_f, this.field_g, this.field_h, this.field_b, this.field_e, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("uv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 22089) {
          field_f = (String) null;
        }
    }

    uv(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_b = 1;
        try {
          this.field_m = param1;
          this.field_n = param6;
          this.field_c = param2;
          this.field_l = param8;
          this.field_j = param0;
          this.field_h = param4;
          this.field_d = param5;
          this.field_g = param3;
          this.field_k = param9;
          this.field_i = param7;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Error connecting to server. Please try using a different server.";
        field_a = new int[8192];
    }
}
