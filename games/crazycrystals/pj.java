/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends bo implements Cloneable {
    static int field_v;
    static java.applet.Applet field_w;
    static int field_x;
    private int field_u;
    static float field_p;
    static int[] field_r;
    private int field_s;
    private int field_t;
    static int field_q;

    pj(int param0, int param1) {
        this(param0, param1, new kp(param0));
    }

    final int a(byte param0) {
        if (param0 > -34) {
          return 118;
        }
        return this.field_u;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = CrazyCrystals.field_B;
        try {
          if (param6 >= param1) {
            return;
          }
          if (param2 <= param6 + 1) {
            return;
          }
          if (param2 > 5 + param6 &&
            param4 != param0) {
            var7_int = (param4 >> 1) + ((param0 >> 1) + (1 & (param4 & param0)));
            var8 = param6;
            var9 = param4;
            var10 = param0;
            for (var11 = param6; var11 < param2; var11++) {
              var12 = wp.field_d[var11];
              if (!param3) {
                stackIn_23_0 = jk.field_g[var12];
              } else {
                stackIn_23_0 = mh.field_l[var12];
              }
              var13 = stackIn_23_0;
              if (var13 <= var7_int) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                wp.field_d[var11] = wp.field_d[var8];
                incrementValue$0 = var8;
                var8++;
                wp.field_d[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            pj.a(var9, param1, var8, param3, param4, param5, param6);
            pj.a(param0, param1, param2, param3, var10, (byte) 119, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = wp.field_d[var8Lifetime1];
              var10Lifetime1 = wp.field_d[var8Lifetime1 + 1];
              if (da.a(var9Lifetime1, (byte) 52, param3, var10Lifetime1)) {
                wp.field_d[var8Lifetime1] = var10Lifetime1;
                wp.field_d[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var7), "pj.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        int var7Lifetime1;
        if (this.field_u >= 0) {
          var7 = this.field_t;
          if (0 > var7 ||
            !jm.field_j) {
            var7 = this.field_s;
          }
          if (24 == param1 &&
            param2 == 24) {
            le.field_g[this.field_u][var7].a(param4, param5 - param2);
          } else {
            le.field_g[this.field_u][var7].b(param4, param5 - param2, param1 * 2, 3 * param2);
          }
        }
        var7Lifetime1 = 74 / ((param0 - 74) / 41);
    }

    public static void g(int param0) {
        field_w = null;
        field_r = null;
        if (param0 >= -78) {
          field_q = 27;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          return 97;
        }
        return cd.field_v[this.field_s];
    }

    pj(int param0) {
        this(0, param0);
    }

    pj(int param0, int param1, f param2) {
        super(param2);
        this.field_t = -1;
        try {
          this.field_s = param1;
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_u = param0;
        if (param1 < 61) {
          this.c(false, false);
        }
    }

    final void c(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        if (!param0) {
          return;
        }
        if (this.field_u >= 0 && this.field_u < 4 &&
          this.field_s == 0) {
          var3 = le.field_g[this.field_u].length - 10;
          var4 = (int)(3.0 * ((double)var3 * Math.random()));
          if (var4 >= 0 &&
            var4 < var3) {
            this.field_t = 10 + var4;
          }
        }
    }

    static {
        field_v = 0;
        field_r = new int[4];
    }
}
