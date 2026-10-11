/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg implements cg {
    private rf field_d;
    static int field_i;
    private int field_c;
    private int field_l;
    private int field_h;
    static int[] field_a;
    static boolean field_g;
    private int field_e;
    private int field_b;
    private int field_j;
    static int field_f;
    private int field_k;

    public static void a(byte param0) {
        if (param0 > -84) {
          field_i = 80;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!fa.d(0)) {
            if (null != df.field_l &&
              df.field_l.field_h) {
              af.b(6);
              hg.field_S.a((byte) -115, (vg) (new ae(hg.field_S, uf.field_a)));
            }
            return;
          }
          hg.field_S.a(jd.field_P, fl.field_f, true, 0);
          hg.field_S.b(false);
          while (th.a(-109)) {
            hg.field_S.a(di.field_c, sj.field_g, 121);
          }
          if (param0 == 2) {
            return;
          }
          field_f = -12;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "lg.B(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 == 2) {
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        return -71;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nd var14 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param2 instanceof nd) {
            stackIn_3_0 = (vg) (param2);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (nd) (stackIn_3_0);
          if (var14 != null) {
          }
          wj.f(param4 + param2.field_o, param3 + param2.field_m, param2.field_w, param2.field_k, this.field_e);
          var7 = var14.field_O + (param4 + param2.field_o);
          var8 = var14.field_S + param3 + param2.field_m;
          wj.b(var7, var8, var14.field_J, this.field_k);
          if (param1 < 94) {
            return;
          }
          if (var14.field_I != -1) {
            var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_T;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            wj.b(var7 + var11, var12 + var8, 1, this.field_c);
          }
          wj.b(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_N * 2.0 / (double)var14.field_T;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_J);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_J);
          wj.g(var7, var8, var7 + var11Lifetime1, var8 + var12Lifetime1, 1);
          if (null == this.field_d) {
            return;
          }
          var13 = var14.field_J + (var14.field_O + this.field_j);
          this.field_d.a(param2.field_p, var13 + param2.field_o + param4, this.field_l + (param3 + param2.field_m), param2.field_w - this.field_j - var13, -(this.field_j << 1) + param2.field_k, this.field_b, this.field_h, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("lg.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    lg(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_e = param7;
          this.field_h = param4;
          this.field_j = param1;
          this.field_l = param2;
          this.field_k = param5;
          this.field_b = param3;
          this.field_c = param6;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_g = false;
    }
}
