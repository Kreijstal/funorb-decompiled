/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab implements td {
    private int field_m;
    private int field_d;
    private int field_b;
    private kc field_k;
    private int field_c;
    private int field_a;
    private int field_i;
    static ml field_j;
    private int field_e;
    static im field_h;
    static hj[] field_g;
    static int field_f;
    static int field_l;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        bj var15 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var15 = param2 instanceof bj ? (bj) ((Object) param2) : null;
            ul.h(param2.field_s + param1, param0 - -param2.field_n, param2.field_m, param2.field_r, this.field_a);
            if (var15 == null) {
            }
            var7 = var15.field_H + param1 + param2.field_s;
            var8 = param2.field_n + param0 - -var15.field_K;
            ul.f(var7, var8, var15.field_G, this.field_d);
            if (var15.field_L != -1) {
                var9 = 2.0 * ((double)var15.field_L * 3.141592653589793) / (double)var15.field_I;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
                var12 = (int)(Math.cos(var9) * (double)var15.field_G);
                ul.f(var7 - -var11, var12 + var8, 1, this.field_i);
            }
            ul.f(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var15.field_J) / (double)var15.field_I;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
            if (param3 != -4394) {
                pj var14 = (pj) null;
                this.a(19, 76, (pj) null, 43, true);
            }
            var12 = (int)(Math.cos(var9) * (double)var15.field_G);
            ul.b(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null != this.field_k) {
                var13 = this.field_m + (var15.field_H + var15.field_G);
                this.field_k.a(param2.field_l, param2.field_s + (param1 + var13), param0 - -param2.field_n - -this.field_b, param2.field_m - (var13 - -this.field_m), param2.field_r - (this.field_m << -839238015), this.field_e, this.field_c, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ab.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            field_h = (im) null;
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var1_int = -43 % ((-78 - param0) / 46);
          var2 = ad.field_b;
          synchronized (var2) {
            L0: {
              L1: {
                md.field_g = pk.field_H;
                ji.field_c = ji.field_c + 1;
                if ((wg.field_p ^ -1) <= -1) {
                  L2: while (true) {
                    if (al.field_b == wg.field_p) {
                      break L1;
                    } else {
                      var3 = gl.field_i[al.field_b];
                      al.field_b = al.field_b + 1 & 127;
                      if (0 <= var3) {
                        ek.field_a[var3] = true;
                        continue L2;
                      } else {
                        ek.field_a[var3 ^ -1] = false;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  L3: while (true) {
                    if (112 <= var3) {
                      wg.field_p = al.field_b;
                      break L1;
                    } else {
                      ek.field_a[var3] = false;
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
              pk.field_H = uf.field_a;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ab.B(" + param0 + ')');
        }
    }

    ab(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_d = param5;
            this.field_c = param4;
            this.field_k = param0;
            this.field_b = param2;
            this.field_e = param3;
            this.field_m = param1;
            this.field_i = param6;
            this.field_a = param7;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_j = new ml(1);
        field_h = new im();
        field_l = -1;
    }
}
