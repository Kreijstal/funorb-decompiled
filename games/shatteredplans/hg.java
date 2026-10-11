/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ka {
    static boolean field_r;
    static int field_t;
    static char field_p;
    static ds field_u;
    static String field_s;
    static ap field_q;

    hg(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 6);
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        so.a(0, param8, 16777215, param9, param2, param6, param11, param5, param0, param4, param10, param1, param7, param3);
    }

    final int a(int param0, int param1, fs param2) {
        int var9 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        fs stackIn_17_0 = null;
        fs stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        ln var14 = null;
        int var15 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param2.field_x;
          if (this.field_n != param2 &&
            !this.field_n.field_h[var4_int]) {
            if ((1 << var4_int & this.field_g.field_w) != 0) {
              stackIn_9_0 = 0;
              return stackIn_9_0;
            }
            var5 = this.field_g.field_v[this.field_g.field_m[-1 + this.field_g.field_r]];
            if (param2 == var5) {
              stackIn_13_0 = 1;
              return stackIn_13_0;
            }
            var6 = param1;
            var7 = 0;
            var8_ref_ln__ = this.field_g.field_g.field_e;
            for (var9 = 0; var8_ref_ln__.length > var9; var9++) {
              var10 = var8_ref_ln__[var9];
              stackIn_17_0 = var10.field_y;
              stackIn_17_1 = this.field_n;
              if (stackIn_17_0 == stackIn_17_1) {
                var11 = 0;
                var12 = var10.field_D;
                for (var13 = 0; var13 < var12.length; var13++) {
                  var14 = var12[var13];
                  if (var14.field_y == param2) {
                    var11 = 1;
                    var6 = var6 + var14.field_x;
                  }
                }
                if (var11 != 0) {
                  var7 = var7 + var10.field_x;
                }
              }
            }
            if (var7 * 2 < var6) {
              stackIn_33_0 = -1;
              return stackIn_33_0;
            }
            var8 = lc.a(param1 + 12330, (1 << this.field_g.field_r) - 1 ^ this.field_g.field_w);
            if (var8 * var6 < var7 &&
              this.field_g.field_D[this.field_n.field_x] > this.field_g.field_D[var4_int] * var8) {
              stackIn_38_0 = 4;
              return stackIn_38_0;
            }
            stackIn_42_0 = (var5 != this.field_n) ? -2 : -3;
            return stackIn_42_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("hg.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; this.field_g.field_r > var2; var2++) {
          this.field_b[var2] = this.a(0, 0, this.field_g.field_v[var2]);
        }
        if (param0 != -18484) {
          hg.a(-92, true, -31, false, 87, 112, -41, 4, true, false, 96, false);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_u = null;
        field_q = null;
        field_s = null;
    }

    final int[] b(int param0) {
        int var2 = -114 % ((-48 - param0) / 61);
        return new int[]{17, 18};
    }

    final static String a(boolean param0, nf param1) {
        String stackIn_3_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2 = null;
          if (param1.field_d != null) {
            var5 = param1.field_d;
            var2 = var5;
            var2 = var5;
            var2 = var5;
            if (param1.field_c == 1) {
              var2 = "<img=0>" + var5;
            }
            if (param1.field_c == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (param1.field_n == 2) {
            if (!param1.field_h) {
              if (param1.field_l == 0 &&
                param1.field_e == 0) {
                var3 = re.a(fj.field_q, 4371, new String[]{(String) (var2)});
              } else {
                var3 = re.a(cf.field_M, 4371, new String[]{(String) (var2)});
              }
            }
          } else {
            if (param1.field_n == 0 &&
              je.field_e) {
              var3 = "[" + ds.field_a + "] ";
            }
            if (param1.field_n == 1) {
              var3 = "[" + re.a(he.field_q, 4371, new String[]{param1.field_o}) + "] ";
            }
            if (param1.field_n == 4 &&
              wf.field_m != null) {
              var3 = "[" + wf.field_m + "] ";
            }
            if (param1.field_n == 3) {
              var3 = "[#" + param1.field_o + "] ";
            }
            if (!param1.field_h) {
              var3 = var3 + (String) (var2) + ": ";
            }
          }
          stackIn_34_0 = var3;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("hg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        fs var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_g.field_o.field_i) {
          if (this.field_n.field_m.e(27650)) {
            this.a(false, param0 ^ 6898);
          }
        } else {
          if (this.field_n.field_i.g(param0 ^ 80)) {
            this.a(false, -6861);
          }
        }
        var2 = this.field_g.field_m[this.field_g.field_r - 1];
        if (param0 != -63) {
          field_q = (ap) null;
        }
        var3 = this.field_g.field_D[var2];
        for (var4 = 0; var4 < this.field_g.field_r; var4++) {
          this.field_c[var4] = this.field_c[var4] - 1;
          if (~var2 != ~var4) {
            if (this.field_g.field_D[var4] * 2 < var3) {
              this.field_i[var4] = 0;
            } else {
              this.field_i[var4] = this.field_i[var4] - 1;
            }
          } else {
            this.field_i[var4] = 3;
          }
        }
        if (this.c((byte) -116)) {
          this.g(-18484);
          for (var4Lifetime1 = 0; this.field_g.field_r > var4Lifetime1; var4Lifetime1++) {
            if (this.field_b[var4Lifetime1] < 0) {
              var5 = this.field_g.field_v[var4Lifetime1];
              if (this.field_c[var4Lifetime1] <= 0) {
                var9 = this.field_b[var4Lifetime1];
                if (var9 == -1) {
                  var6 = 7;
                } else {
                  if (var9 != -2) {
                    if (var9 != -3) {
                      var6 = -1;
                    } else {
                      var7 = this.field_g.field_m[-1 + this.field_g.field_r];
                      var6 = 9;
                      var8 = this.field_g.field_m[-2 + this.field_g.field_r];
                      if (var7 != this.field_n.field_x &&
                        var7 != var4Lifetime1 &&
                        this.field_g.field_D[var7] * 2 > this.field_g.field_D[var8] * 3) {
                        var6 = 8;
                      }
                    }
                  } else {
                    var6 = 8;
                  }
                }
                if (var6 != -1) {
                  this.field_j.a(0, (byte) -118, var5, this.field_n, var6);
                  this.field_c[var4Lifetime1] = rg.a(6, 3, (byte) 118);
                }
              }
              this.field_j.a((byte) -63, this.field_n, var5);
            }
          }
        }
    }

    static {
        field_p = '/';
        field_u = new ds(3);
        field_s = "<%0> points per turn";
    }
}
