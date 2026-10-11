/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends am {
    static String[] field_u;
    private int field_w;
    static int field_y;
    private int field_t;
    static int field_s;
    private int field_z;
    static qc field_x;
    private int field_v;

    final static da a(boolean param0) {
        if (param0) {
          hb.b(48);
        }
        String var1 = ki.i(20);
        if (var1 != null &&
          0 <= var1.indexOf('@')) {
          var1 = "";
        }
        return new da(ki.i(20), dc.b(true));
    }

    final static void a(int param0, boolean param1, t param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        t var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = Torquing.field_u;
        try {
          if (ph.field_k > param0) {
            param4 = param4 - (ph.field_k - param0);
            param0 = ph.field_k;
          }
          if (param0 + param4 > ph.field_a) {
            param4 = ph.field_a - param0;
          }
          if (param6 < ph.field_c) {
            param3 = param3 - (-param6 + ph.field_c);
            param6 = ph.field_c;
          }
          if (ph.field_h < param3 + param6) {
            param3 = -param6 + ph.field_h;
          }
          if (param4 > 0 &&
            param3 > 0) {
            var21 = param2.c();
            var30 = ph.field_e;
            var10 = ph.field_j;
            var11 = ph.field_d;
            var29 = new int[4];
            ph.b(var29);
            param2.e();
            if (param1) {
              hb.b(-75);
            }
            ph.f(var29[0], var29[1], var29[2], var29[3]);
            var13 = param2.field_s * param6 + param0;
            var14 = param2.field_s - param4;
            var25 = var21.field_y;
            var22 = var25;
            var15 = var22;
            for (var16 = param6; var16 < param6 + param3; var16++) {
              for (var17 = param0; param0 + param4 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (var17 > 0 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  var15[-param2.field_s + var13] == 0 ||
                  var17 < -1 + param2.field_s &&
                  var15[1 + var13] == 0 ||
                  !(-1 + param2.field_t <= var16) &&
                  0 == var15[var13 + param2.field_s])) {
                  ph.d(var17, var16, param7, param5);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.d(-param2.field_v, -param2.field_r);
            ph.a(var30, var10, var11);
            ph.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public hb() {
        super(0, true);
        this.field_t = 0;
        this.field_w = 20;
        this.field_z = 1365;
        this.field_v = 0;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        uk.field_a[vg.field_o] = param5;
        lp.field_g[vg.field_o] = vg.field_o;
        il.field_o[vg.field_o] = param0;
        if (param0 > mc.field_l) {
          qd.field_g = param0;
        }
        if (param0 < ga.field_c) {
          lj.field_d = param0;
        }
        wh.field_y[vg.field_o] = param1;
        vo.field_d[vg.field_o] = param4;
        vp.field_F[vg.field_o] = param3;
        int var6 = param1 + param4 + param3;
        int var7 = var6 != 0 ? 1000 * param1 / var6 : 0;
        ji.field_a[vg.field_o] = var7;
        if (param2) {
          field_s = 26;
        }
        if (!(var7 <= qd.field_g)) {
          qd.field_g = var7;
        }
        if (var7 < lj.field_d) {
          lj.field_d = var7;
        }
        vg.field_o = vg.field_o + 1;
    }

    public static void b(int param0) {
        if (param0 != -799778388) {
          return;
        }
        field_x = null;
        field_u = null;
    }

    final int[] a(byte param0, int param1) {
        int var4 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        var14 = Torquing.field_u;
        var15 = this.field_l.a(param1, 25657);
        var3 = var15;
        if (param0 <= 86) {
          field_s = 59;
        }
        if (this.field_l.field_b) {
          for (var4 = 0; ci.field_c > var4; var4++) {
            var5 = (q.field_b[var4] << 12) / this.field_z + this.field_v;
            var6 = (dp.field_a[param1] << 12) / this.field_z + this.field_t;
            var7 = var5;
            var8 = var6;
            var9 = var5;
            var10 = var6;
            var11 = var5 * var5 >> 12;
            var12 = var6 * var6 >> 12;
            var13 = 0;
            while (var11 + var12 < 16384) {
              if (this.field_w > var13) {
                var10 = var8 + 2 * (var9 * var10 >> 12);
                var9 = var11 - var12 + var7;
                var12 = var10 * var10 >> 12;
                var11 = var9 * var9 >> 12;
                var13++;
                continue;
              }
              break;
            }
            stackIn_11_0 = var15;
            stackIn_11_1 = var4;
            if (-1 + this.field_w > var13) {
              stackIn_12_2 = (var13 << 12) / this.field_w;
            } else {
              stackIn_12_2 = 0;
            }
            stackIn_11_0[stackIn_11_1] = stackIn_12_2;
          }
        }
        return var15;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            field_x = (qc) null;
          }
          var4_int = param2;
          if (0 == var4_int) {
            this.field_z = param0.i(7088);
          } else {
            if (var4_int == 1) {
              this.field_w = param0.i(param1 ^ 7059);
            } else {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.field_t = param0.i(7088);
                }
              } else {
                this.field_v = param0.i(7088);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("hb.H(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_u = new String[25];
        field_y = 0;
    }
}
