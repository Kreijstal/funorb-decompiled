/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of implements pf {
    private int field_g;
    private int field_i;
    private dj field_d;
    private int field_f;
    private int field_h;
    static ql field_n;
    private int field_o;
    static String field_l;
    static long field_j;
    static String field_c;
    static String[] field_e;
    private int field_b;
    static kc field_a;
    private int field_m;
    static String field_k;

    final static void b(int param0, int param1) {
        int var3 = 0;
        nk var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != 16) {
            return;
          }
          var4 = (nk) (pe.field_Lb.b(12623));
          while (var4 != null) {
            fj.a(-26971, var4, param0);
            var4 = (nk) (pe.field_Lb.a(param1 - 16));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "of.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        qb var21 = null;
        qb var20 = null;
        int[] var19 = de.field_l;
        int[] var18 = var19;
        int[] var16 = var18;
        int[] var6 = var16;
        int var7 = de.field_e;
        int var8 = de.field_j;
        qb var9 = new qb(param0, -(2 * param0) + param1);
        var9.a();
        de.c(0, 0, param0, -(2 * param0) + param1, param4, param5);
        qb var10 = new qb(param0, param0);
        var10.a();
        de.d(0, 0, param0, param0, param4);
        qb var11 = new qb(16, param0);
        var11.a();
        de.d(0, 0, 16, param0, param4);
        qb var12 = new qb(param0, param0);
        var12.a();
        de.d(0, 0, param0, param0, param5);
        qb var13 = new qb(16, param0);
        var13.a();
        de.d(0, 0, 16, param0, param5);
        Object var14 = null;
        if (param2 == 1) {
          if (param3 > 0) {
            var21 = new qb(16, 16);
            var14 = var21;
            var21.a();
            de.d(0, 0, 16, 16, param3);
          }
          de.a(var19, var7, var8);
          return new qb[]{var10, var11, var10, var9, (qb) (var14), var9, var12, var13, var12};
        }
        eg var15 = (eg) null;
        of.a(90, (byte) 7, (eg) null, 120);
        if (param3 > 0) {
          var20 = new qb(16, 16);
          var14 = var20;
          var20.a();
          de.d(0, 0, 16, 16, param3);
        }
        de.a(var19, var7, var8);
        return new qb[]{var10, var11, var10, var9, (qb) (var14), var9, var12, var13, var12};
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        int var2 = -32 / ((63 - param0) / 50);
        if (4096 > param1) {
          return param1 < 2048 ? ge.field_l[param1] : ge.field_l[4096 - param1];
        }
        return param1 >= 6144 ? -ge.field_l[-param1 + 8192] : -ge.field_l[-4096 + param1];
    }

    final static qb[] a(int param0, byte param1, eg param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -94 % ((param1 + 80) / 35);
          if (fc.a(-125, param2, param0, param3)) {
            stackIn_4_0 = pk.a((byte) -116);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (qb[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("of.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rk var14 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (!(param0 instanceof rk)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (qm) (param0);
          }
          var14 = (rk) (stackIn_3_0);
          if (param1 != 5592405) {
            return;
          }
          if (var14 != null) {
          }
          de.d(param2 + param0.field_n, param3 + param0.field_j, param0.field_v, param0.field_k, this.field_b);
          var7 = param0.field_n + (param2 + var14.field_T);
          var8 = var14.field_U + (param3 + param0.field_j);
          de.i(var7, var8, var14.field_V, this.field_m);
          if (var14.field_M != -1) {
            var9 = 3.141592653589793 * (double)var14.field_M * 2.0 / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
            var12 = (int)(Math.cos(var9) * (double)var14.field_V);
            de.i(var11 + var7, var8 + var12, 1, this.field_o);
          }
          de.i(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_P;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_V);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_V);
          de.b(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (null == this.field_d) {
            return;
          }
          var13 = this.field_g + (var14.field_V + var14.field_T);
          this.field_d.a(param0.field_g, var13 + (param2 + param0.field_n), this.field_i + (param3 + param0.field_j), -var13 - this.field_g + param0.field_v, -(this.field_g << 1) + param0.field_k, this.field_h, this.field_f, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("of.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -4) {
          return;
        }
        field_k = null;
        field_c = null;
        field_l = null;
        field_n = null;
        field_e = null;
        field_a = null;
    }

    of(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_f = param4;
          this.field_g = param1;
          this.field_i = param2;
          this.field_o = param6;
          this.field_h = param3;
          this.field_d = param0;
          this.field_m = param5;
          this.field_b = param7;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_n = new ql("usename");
        field_k = "Status";
        field_e = new String[16];
        field_l = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
