/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka implements uj {
    int field_o;
    static String field_m;
    int field_k;
    fs field_n;
    static bc field_e;
    static boolean field_a;
    static String field_f;
    int[] field_b;
    private boolean field_l;
    mn field_j;
    int[] field_i;
    private int[] field_d;
    int field_h;
    dc field_g;
    int[] field_c;

    private final int a(byte param0, int param1, int param2, int[] param3) {
        fs stackIn_30_0 = null;
        fs stackIn_30_1 = null;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ln var9 = null;
        int var10_int = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        ln[] var15 = null;
        ln var9Lifetime1;
        ln[] var10Lifetime1;
        ln var12Lifetime1;
        int var8Lifetime1;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var7 = 82 % ((-17 - param0) / 43);
          var6 = param2;
          for (var8 = this.field_o - 1; var8 >= 0; var8--) {
            if (param2 != 0) {
              var9_int = param3[var8];
              if (0 != u.field_d[var9_int]) {
                if (0 != ol.field_a[var9_int]) {
                  var10_int = ol.field_a[var9_int] * var6 / param1;
                  if (0 != var10_int) {
                    if (var10_int > param2) {
                      var10_int = param2;
                    }
                    this.c(param2, cq.field_E, -1);
                    var11 = this.a(0, true, var10_int, this.field_g.field_g.field_e[var9_int]);
                    if (var10_int < var11) {
                      throw new RuntimeException();
                    }
                    if (var11 < var10_int) {
                      u.field_c[var9_int] = u.field_c[var9_int] + (-var11 + var10_int);
                    }
                    var5_int = var5_int + var10_int;
                    param2 = param2 - var10_int;
                    ig.field_c[var9_int] = ig.field_c[var9_int] + var11;
                    this.c(param2, cq.field_E, -1);
                  }
                }
                continue;
              }
            }
            break;
          }
          if (param2 > 0) {
            var8Lifetime1 = 0;
            var9 = mj.field_yb.j(18229);
            while (var9 != null) {
              var15 = var9.field_D;
              var10 = var15;
              for (var11Lifetime1 = 0; var11Lifetime1 < var15.length; var11Lifetime1++) {
                var12 = var15[var11Lifetime1];
                stackIn_30_0 = var12.field_y;
                stackIn_30_1 = this.field_n;
                if (stackIn_30_0 == stackIn_30_1) {
                  continue;
                }
                var8Lifetime1++;
                break;
              }
              var9 = mj.field_yb.h(-23410);
            }
            if (0 < var8Lifetime1) {
              var9Lifetime1 = mj.field_yb.j(18229);
              while (var9Lifetime1 != null) {
                var10Lifetime1 = var9Lifetime1.field_D;
                for (var11Lifetime1Lifetime1 = 0; var10Lifetime1.length > var11Lifetime1Lifetime1; var11Lifetime1Lifetime1++) {
                  var12Lifetime1 = var10Lifetime1[var11Lifetime1Lifetime1];
                  if (this.field_n == var12Lifetime1.field_y) {
                    continue;
                  }
                  var13 = param2 / var8Lifetime1;
                  this.a(var13, -111, var9Lifetime1);
                  param2 = param2 - var13;
                  var5_int = var5_int + var13;
                  var8Lifetime1--;
                  break;
                }
                var9Lifetime1 = mj.field_yb.h(-23410);
              }
            }
          }
          stackIn_46_0 = var5_int;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_49_0 = var5;
          stackIn_49_1 = new StringBuilder().append("ka.QA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final int a(int param0, ln param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        ln var6 = null;
        mg var7 = null;
        int var8 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.field_D;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6.field_y != this.field_n) {
              var7 = (mg) (lh.field_v.d(0));
              while (var7 != null) {
                if (var7.field_B != var6) {
                  var7 = (mg) (lh.field_v.a((byte) -71));
                  continue;
                }
                break;
              }
              if (var7 == null) {
                var3_int++;
              }
            }
          }
          if (this.field_g.field_o.field_l &&
            var3_int > 1) {
            var3_int = 1;
          }
          if (param0 != -5) {
            this.field_n = (fs) null;
          }
          stackIn_18_0 = var3_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ka.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(sd param0, int[] param1, int param2) {
        int var5 = 0;
        ln[] var4 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!this.field_g.field_o.field_i) {
            this.c(param2 ^ 0, param0);
          } else {
            this.c(0, this.field_n.field_m);
          }
          var11 = this.field_g.field_g.field_e;
          var4 = var11;
          for (var5 = param2; var5 < param1.length; var5++) {
            var6 = param1[var5];
            var7 = var11[var6];
            var8 = this.c(var7, -5);
            var9 = this.a(var7, (byte) -127);
            cb.field_o[var6] = var8;
            hs.field_i[var6] = var9;
            ei.field_d[var6] = this.d(var7, 2);
            u.field_d[var6] = (var8 << 16) / var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ka.AB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, int param2, ln param3) {
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ln[] var6_ref_ln__ = null;
        int var6 = 0;
        int var7_int = 0;
        ln[] var7 = null;
        int var8 = 0;
        ln var8_ref_ln = null;
        ln var9 = null;
        int var9_int = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = param2;
          var6_ref_ln__ = param3.field_D;
          var7_int = param0;
          while (true) {
            if (var6_ref_ln__.length <= var7_int) {
              if (var5_int != 0 &&
                param1 &&
                cq.field_E > 0) {
                if (var5_int < cq.field_E) {
                  stackIn_30_0 = var5_int;
                } else {
                  stackIn_30_0 = cq.field_E;
                }
                var6 = stackIn_30_0;
                var5_int = var5_int - var6;
                var7 = param3.field_D;
                var8 = 0;
                while (var7.length > var8) {
                  var9 = var7[var8];
                  if (var9.field_R != mj.field_yb) {
                    var8++;
                    continue;
                  }
                  this.a((byte) -67, var6, var9);
                  this.a(param3, var9, var6, ~param0);
                  break;
                }
              }
            } else {
              var8_ref_ln = var6_ref_ln__[var7_int];
              var9_int = var8_ref_ln.field_p;
              if (ja.field_i[var9_int] >= var5_int) {
                this.a(param3, var8_ref_ln, var5_int, ~param0);
                ja.field_i[var9_int] = ja.field_i[var9_int] - var5_int;
                stackIn_5_0 = param2;
                return stackIn_5_0;
              }
              if (ja.field_i[var9_int] != 0) {
                this.a(param3, var8_ref_ln, ja.field_i[var9_int], -1);
                var5_int = var5_int - ja.field_i[var9_int];
                ja.field_i[var9_int] = 0;
              }
              if (var5_int != 0) {
                var7_int++;
                continue;
              }
              if (var5_int != 0 &&
                param1 &&
                cq.field_E > 0) {
                if (var5_int < cq.field_E) {
                  stackIn_16_0 = var5_int;
                } else {
                  stackIn_16_0 = cq.field_E;
                }
                var6 = stackIn_16_0;
                var5_int = var5_int - var6;
                var7 = param3.field_D;
                var8 = 0;
                while (var7.length > var8) {
                  var9 = var7[var8];
                  if (var9.field_R != mj.field_yb) {
                    var8++;
                    continue;
                  }
                  this.a((byte) -67, var6, var9);
                  this.a(param3, var9, var6, ~param0);
                  break;
                }
              }
            }
            break;
          }
          stackIn_37_0 = param2 - var5_int;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("ka.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            this.field_j = (mn) null;
          }
          var3_int = this.a(-5, param0);
          stackIn_5_0 = (var3_int != 0) ? var3_int : 1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ka.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, sd param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = param0; var3_int < 4; var3_int++) {
            lh.field_y[var3_int] = param1.field_u[param1.field_w[0]] + (-param1.field_u[var3_int] + 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ka.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int e(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ln var2 = mj.field_yb.j(18229);
        int var3 = param0;
        while (var2 != null) {
          var4 = var2.field_p;
          var5 = this.b((byte) 89, var2);
          var3 = var3 + var5;
          ue.field_e[var4] = var5;
          var2 = mj.field_yb.h(-23410);
        }
        return var3;
    }

    int a(int param0, int param1, fs param2) {
        int var14 = 0;
        int[] dupTemp$0 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        fs stackIn_23_0 = null;
        fs stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9 = null;
        int[] var9_array = null;
        int var10 = 0;
        ln var11_ref_ln = null;
        int var12 = 0;
        ln[] var13 = null;
        ln var15 = null;
        int var16 = 0;
        int[] var17 = null;
        int var10Lifetime1;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = param2.field_x;
          if (this.field_n != param2 &&
            !this.field_n.field_h[var4_int]) {
            if ((this.field_g.field_w & 1 << var4_int) != 0) {
              stackIn_9_0 = 0;
              return stackIn_9_0;
            }
            var5 = this.field_g.field_v[this.field_g.field_m[this.field_g.field_r - 1]];
            var6 = this.field_g.field_v[this.field_g.field_m[-2 + this.field_g.field_r]];
            if (var5 == param2) {
              stackIn_12_0 = 1;
              return stackIn_12_0;
            }
            var7 = 0;
            var8 = param1;
            var9 = this.field_g.field_g.field_e;
            var10 = 0;
            while (var9.length > var10) {
              var11_ref_ln = var9[var10];
              if (var11_ref_ln.field_y == this.field_n) {
                var12 = 0;
                var13 = var11_ref_ln.field_D;
                for (var14 = 0; var13.length > var14; var14++) {
                  var15 = var13[var14];
                  stackIn_23_0 = var15.field_y;
                  stackIn_23_1 = (fs) (param2);
                  if (stackIn_23_0 == stackIn_23_1) {
                    var12 = 1;
                    var7 = var7 + var15.field_x;
                  }
                }
                if (var12 != 0) {
                  var8 = var8 + var11_ref_ln.field_x;
                }
              }
              var10++;
            }
            if (var7 > var8 * 2) {
              stackIn_34_0 = -1;
              return stackIn_34_0;
            }
            if (var5.field_h[var4_int]) {
              stackIn_37_0 = 2;
              return stackIn_37_0;
            }
            if (var5.field_h[var4_int]) {
              stackIn_41_0 = 5;
              return stackIn_41_0;
            }
            if (var6 != param2) {
              if (var7 < var8 &&
                2 * this.field_g.field_D[this.field_n.field_x] > this.field_g.field_D[var4_int] * 3) {
                stackIn_51_0 = 3;
                return stackIn_51_0;
              }
              dupTemp$0 = ff.field_x[this.field_n.field_x];
              var17 = dupTemp$0;
              var9_array = dupTemp$0;
              var10Lifetime1 = param0;
              for (var11 = 0; var11 < this.field_o; var11++) {
                if (ac.field_q[var11] &&
                  ff.field_x[var4_int][var11] <= var17[var11]) {
                  var10Lifetime1--;
                }
              }
              if (var10Lifetime1 < 5 &&
                var10Lifetime1 < param0) {
                stackIn_62_0 = 4;
                return stackIn_62_0;
              }
              stackIn_64_0 = -3;
              return stackIn_64_0;
            }
            stackIn_47_0 = (var5 == this.field_n) ? -3 : -2;
            return stackIn_47_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("ka.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
        }
    }

    public final void b(byte param0) {
        int discarded$0 = 0;
        sd var2;
        int var3;
        int var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_n.field_i.g(59)) {
          return;
        }
        this.d(-1);
        lh.field_D.a(0);
        lh.field_G.a(0);
        lh.field_v.a(0);
        if (param0 >= -3) {
          discarded$0 = this.a(-67, 25, -122);
        }
        var2 = (sd) (this.field_n.field_i.d(0));
        var3 = 1;
        while (var2 != null) {
          if (this.field_g.field_o.field_i) {
            var4 = this.field_n.field_m.field_r / this.field_n.field_i.e(0);
            if (0 != this.field_n.field_m.field_r % this.field_n.field_i.e(0) &&
              var3 != 0) {
              var4++;
              var3 = 0;
            }
            if (0 > var4) {
              var4 = 0;
            }
            this.a(var4, var2, (byte) -54);
          } else {
            this.a(var2.field_x, var2, (byte) -54);
          }
          var2 = (sd) (this.field_n.field_i.a((byte) -71));
        }
        if (this.field_g.field_o.field_h) {
          if (this.field_n.field_u[0] >= 5) {
            this.h(99);
          }
          if (this.field_n.field_u[1] >= 5) {
            this.f(26539);
          }
          if (this.field_n.field_u[2] >= 5) {
            this.b(true);
          }
          if (this.field_n.field_u[3] >= 5) {
            this.e((byte) 101);
          }
        }
        if (!this.field_g.a(lh.field_v, this.field_n, -6, lh.field_D, lh.field_G)) {
        }
        this.field_g.a(lh.field_v, 0, lh.field_D, lh.field_G);
        return;
    }

    public final void a(fs param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -42) {
            this.d((ln) null, 1);
          }
          var3_int = this.field_b[param0.field_x];
          var7 = var3_int;
          if (var7 == -1) {
            var4 = 10;
          } else {
            if (var7 == -2) {
              var4 = 11;
            } else {
              if (var7 == -3) {
                var4 = 12;
                var6 = this.field_g.field_m[-2 + this.field_g.field_r];
                var5 = this.field_g.field_m[this.field_g.field_r - 1];
                if (this.field_n.field_x != var5 &&
                  this.field_k != var5 &&
                  this.field_g.field_D[var5] * 2 > 3 * this.field_g.field_D[var6]) {
                  var4 = 11;
                }
              } else {
                var4 = -1;
              }
            }
          }
          if (-1 != var4) {
            this.field_j.a(0, (byte) 12, param0, this.field_n, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ka.LA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        ln var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = 0;
        if (param2 <= param0) {
          var4 = mj.field_yb.j(18229);
          while (var4 != null) {
            var6 = var4.field_p;
            var7 = ue.field_e[var6];
            wb.field_b[var6] = wb.field_b[var6] + var7;
            oe.field_i[var6] = oe.field_i[var6] + var7;
            var4 = mj.field_yb.h(-23410);
          }
          var5 = var5 + param2;
          param0 = param0 - param2;
        } else {
          var4 = mj.field_yb.j(18229);
          while (var4 != null) {
            var6 = var4.field_p;
            var7 = ue.field_e[var6] * param0 / param2;
            oe.field_i[var6] = oe.field_i[var6] + var7;
            param0 = param0 - var7;
            wb.field_b[var6] = wb.field_b[var6] + var7;
            var5 = var5 + var7;
            var4 = mj.field_yb.h(-23410);
          }
        }
        if (param1 != -1814) {
          return 86;
        }
        this.c(param0, cq.field_E, -1);
        return var5;
    }

    int c(ln param0, int param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = cb.field_o[param0.field_p];
          for (var4 = 0; var4 < 4; var4++) {
            var3_int = var3_int + param0.field_G[var4] * lh.field_y[var4];
          }
          if (param1 != -5) {
            this.field_h = 120;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ka.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void h(int param0) {
        int var5 = 0;
        Object var2;
        int var3;
        int var4_int;
        ln var6;
        int var9;
        qm var4;
        int var7;
        int var8;
        int var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 42 / ((11 - param0) / 61);
        for (var5 = 0; var5 < this.field_o; var5++) {
          var6 = this.field_g.field_g.field_e[var5];
          if (var6.field_y == this.field_n &&
            !var6.field_u) {
            var7 = 0;
            for (var8 = 0; 4 > var8; var8++) {
              var7 = var7 + var6.field_G[var8];
            }
            var8Lifetime1 = (oe.field_i[var5] * 10 + 1) * var7;
            if (var3 < var8Lifetime1) {
              var3 = var8Lifetime1;
              var2 = var6;
            }
          }
        }
        if (var2 != null) {
          var4 = new qm(0, this.field_n, (ln) (var2));
          lh.field_G.a((byte) -113, var4);
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        ln var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 < ~param1) {
          throw new RuntimeException();
        }
        if (param0 < 0) {
          throw new RuntimeException();
        }
        var4 = param1;
        for (var5 = 0; var5 < this.field_o; var5++) {
          var6 = this.field_g.field_g.field_e[var5];
          var4 = var4 + ja.field_i[var5];
          var4 = var4 - wb.field_b[var5];
          var4 = var4 - u.field_c[var5];
          if (ja.field_i[var5] > var6.field_J) {
            throw new RuntimeException();
          }
        }
        if (var4 != param0) {
          throw new RuntimeException();
        }
    }

    final int[] a(byte param0, fs param1) {
        int var11 = 0;
        int stackIn_6_0 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        boolean[] var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var15 = new int[this.field_o];
          var3 = var15;
          var4 = new boolean[this.field_o];
          var5 = this.field_g.field_g.field_e;
          for (var6 = 0; var6 < this.field_o; var6++) {
            stackIn_6_0 = (param1 != var5[var6].field_y) ? 0 : 1;
            var7 = stackIn_6_0;
            var4[var6] = var7 != 0;
            stackIn_8_0 = var15;
            stackIn_8_1 = var6;
            if (var7 == 0) {
              stackIn_9_2 = 2147483647;
            } else {
              stackIn_9_2 = 0;
            }
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
          }
          var6Lifetime1 = 1;
          if (param0 > -16) {
            this.a((byte) -4, 36);
          }
          while (var6Lifetime1 != 0) {
            var6Lifetime1 = 0;
            for (var7Lifetime1 = 0; this.field_o > var7Lifetime1; var7Lifetime1++) {
              if (var4[var7Lifetime1]) {
                var4[var7Lifetime1] = false;
                var8 = var5[var7Lifetime1];
                var9 = var3[var7Lifetime1] + 1;
                var10 = var8.field_D;
                for (var11 = 0; var10.length > var11; var11++) {
                  var12 = var10[var11];
                  var13 = var12.field_p;
                  if (var3[var13] > var9) {
                    var3[var13] = var9;
                    var4[var13] = true;
                    var6Lifetime1 = 1;
                  }
                }
              }
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("ka.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    void a(int param0, sd param1, byte param2) {
        int var10 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        ln var5 = null;
        ln var6_ref_ln = null;
        int var6 = 0;
        int var7_int = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        ln var12 = null;
        int[] var13 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var8Lifetime2;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          cq.field_E = param0;
          mj.field_yb = param1;
          this.c(-17286);
          if (!this.field_g.field_o.field_i) {
            this.c(0, param1);
          } else {
            this.c(0, this.field_n.field_m);
          }
          var13 = this.b(127, param1);
          var4 = var13;
          this.a(param1, var13, 0);
          this.c(param0, cq.field_E, -1);
          param0 = param0 - this.a((byte) -106, param0);
          if (param0 < 0) {
            var5 = param1.j(18229);
            var12 = var5;
            var6_ref_ln = var12;
            var7_int = 0;
            for (var8 = 0; 4 > var8; var8++) {
              var7_int = var7_int + var12.field_G[var8];
            }
            while (var5 != null) {
              var8Lifetime2 = var5.field_p;
              param0 = param0 + wb.field_b[var8Lifetime2];
              wb.field_b[var8Lifetime2] = 0;
              var9 = 0;
              for (var10 = 0; var10 < 4; var10++) {
                var9 = var9 + var5.field_G[var10];
              }
              if (var9 > var7_int) {
                var7_int = var9;
                var6_ref_ln = var5;
              }
              var5 = param1.h(param2 ^ 23364);
            }
            wb.field_b[var6_ref_ln.field_p] = param0;
            param0 = 0;
            this.a(118, param1);
            return;
          }
          this.c(param0, cq.field_E, -1);
          if (!this.field_g.field_o.field_l &&
            !this.field_g.field_o.field_k) {
            param0 = param0 - this.b(param0, param2 - 1745);
          }
          this.c(param0, cq.field_E, param2 + 53);
          if (param0 == 0) {
            this.a(param2 ^ 30, param1);
            return;
          }
          var6 = this.e(param2 ^ -54);
          var7 = null;
          if (param2 != -54) {
            this.field_l = true;
          }
          var8Lifetime1 = 0;
          if (this.field_l) {
            var9Lifetime1 = this.a(param0, (byte) -58);
            var7 = ik.a(u.field_d, this.field_o, (byte) 49);
            if (var9Lifetime1 > var6) {
              var9Lifetime1 = var6;
            }
            this.c(param0, cq.field_E, -1);
            param0 = param0 - var9Lifetime1;
            var8Lifetime1 = this.a(var9Lifetime1, param0, var13, (int[]) (var7), -1);
            param0 = param0 - var8Lifetime1;
            param0 = param0 + var9Lifetime1;
            this.c(param0, cq.field_E, -1);
          }
          param0 = param0 - this.a(param0, -1814, var6);
          this.c(param0, cq.field_E, param2 + 53);
          if (this.field_l &&
            param0 > 0) {
            param0 = param0 - this.a((byte) 92, var8Lifetime1, param0, (int[]) (var7));
          }
          if (param0 != 0) {
            this.a(param0, param2 - 70, param1.field_q);
          }
          this.a(-46, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_42_0 = var4_ref;
          stackIn_42_1 = new StringBuilder().append("ka.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 7321) {
          field_e = (bc) null;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; var2 < this.field_o; var2++) {
          ol.field_a[var2] = 0;
          ue.field_e[var2] = 0;
          wb.field_b[var2] = 0;
          ja.field_i[var2] = 0;
          u.field_c[var2] = 0;
          rl.field_b[var2] = false;
        }
        if (param0 != -17286) {
          this.a((byte) -58, (ln) null);
        }
    }

    public final void a(int param0) {
        int[] var2;
        fs[] var3;
        int var4;
        fs var5;
        int var7;
        int[] var8;
        int var6;
        int var4Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = this.b(-128);
        var2 = var8;
        if (var8 == null) {
          return;
        }
        if (var8.length == 0) {
          return;
        }
        var3 = this.field_g.field_v;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != this.field_n) {
            var6 = var8[vc.a((byte) -39, var8.length)];
            this.field_j.a(0, (byte) -110, var5, this.field_n, var6);
          }
        }
        var4Lifetime1 = -49 / ((-36 - param0) / 38);
    }

    int a(byte param0, int param1) {
        int var8 = 0;
        int var3;
        ln var4;
        int var5;
        int var6;
        ln[] var7_ref_ln__;
        ln var9;
        int var10;
        int var7;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        while (var4 != null) {
          var5 = var4.field_p;
          var6 = 0;
          if (!this.field_g.field_o.field_l) {
            var7_ref_ln__ = var4.field_D;
            for (var8 = 0; var8 < var7_ref_ln__.length; var8++) {
              var9 = var7_ref_ln__[var8];
              if (this.field_n != var9.field_y) {
                var6++;
              }
            }
          } else {
            var6 = 1;
          }
          ja.field_i[var5] = ja.field_i[var5] + var4.field_x;
          wb.field_b[var5] = var6;
          var7 = -var4.field_x + var6;
          var4 = mj.field_yb.h(-23410);
          var3 = var3 + var7;
        }
        if (param0 < -29) {
          return var3;
        }
        return 9;
    }

    int a(int param0, byte param1) {
        if (param1 >= -25) {
          field_m = (String) null;
        }
        return 3 * param0 >> 2;
    }

    int[] b(int param0) {
        int var2 = 81 % ((-48 - param0) / 61);
        return new int[]{14, 15};
    }

    private final void a(ln param0, ln param1, int param2, int param3) {
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        mg var5Lifetime1;
        mg var5Lifetime2;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != null &&
            param0 != null) {
            if (~param2 >= param3) {
              throw new RuntimeException();
            }
            if (param1.field_y != this.field_n) {
              throw new RuntimeException();
            }
            if (param0.field_R != param1.field_R &&
              !param1.b(param0, (byte) 10)) {
              throw new RuntimeException();
            }
            var5 = (mg) (param1.field_s.c(-128));
            while (var5 != null) {
              if (var5.field_G != this.field_n ||
                param0 != var5.field_y) {
                var5 = (mg) (param1.field_s.b(32));
                continue;
              }
              break;
            }
            if (var5 != null) {
              if (var5.field_z > param2) {
                var5.field_z = var5.field_z - param2;
                var5.field_y.field_J = var5.field_y.field_J + param2;
                return;
              }
              var5.b((byte) -93);
              var5.a(16);
              var5.d(true);
              var5.field_y.field_J = var5.field_y.field_J + var5.field_z;
              param2 = param2 - var5.field_z;
            }
            if (0 == param2) {
              return;
            }
            if (param2 > param1.field_J) {
              throw new RuntimeException();
            }
            param1.field_J = param1.field_J - param2;
            var5Lifetime1 = (mg) (lh.field_v.d(0));
            while (var5Lifetime1 != null) {
              if (var5Lifetime1.field_G != this.field_n ||
                param1 != var5Lifetime1.field_y ||
                param0 != var5Lifetime1.field_B) {
                var5Lifetime1 = (mg) (lh.field_v.a((byte) -71));
                continue;
              }
              break;
            }
            if (var5Lifetime1 != null) {
              var5Lifetime1.field_z = var5Lifetime1.field_z + param2;
              return;
            }
            var5Lifetime2 = new mg(param1, param0, param2);
            lh.field_v.a((byte) -113, var5Lifetime2);
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_48_0 = var5_ref;
          stackIn_48_1 = new StringBuilder().append("ka.W(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, sd param1) {
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ln var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        Object var6 = null;
        ln[] var7 = null;
        ln var9 = null;
        int var10 = 0;
        int var4Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.c(0, cq.field_E, -1);
          var3_int = 0;
          var4 = -58 % ((param0 - 53) / 47);
          while (this.field_o > var3_int) {
            if (0 != u.field_c[var3_int]) {
              var5_ref_ln = this.field_g.field_g.field_e[var3_int];
              var6 = null;
              var7 = var5_ref_ln.field_D;
              for (var8 = 0; var7.length > var8; var8++) {
                var9 = var7[var8];
                if (param1 == var9.field_R && (var6 == null ||
                  !(((ln) (var6)).field_J >= var9.field_J))) {
                  var6 = var9;
                }
              }
              this.a(u.field_c[var3_int], 86, (ln) (var6));
              u.field_c[var3_int] = 0;
              this.c(0, cq.field_E, -1);
            }
            var3_int++;
          }
          var3 = param1.j(18229);
          while (var3 != null) {
            var4Lifetime1 = var3.field_p;
            var5 = wb.field_b[var4Lifetime1];
            if (var5 != 0) {
              this.a(var5, 94, var3);
            }
            wb.field_b[var4Lifetime1] = 0;
            this.c(0, cq.field_E, -1);
            var3 = param1.h(-23410);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("ka.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        Object var2;
        int var3;
        int var4;
        lo var5;
        sd var5_ref;
        qm var5_ref2;
        ln var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 26539) {
          return;
        }
        var2 = null;
        var3 = 0;
        var4 = 0;
        if (this.field_g.field_o.field_i) {
          var5 = this.field_n.field_m;
          var6 = var5.j(18229);
          while (var6 != null) {
            var7 = 0;
            var8 = 0;
            for (var9 = 0; var9 < 4; var9++) {
              var8 = var8 + var6.field_G[var9];
              if (var5.field_u[var9] >= var6.field_G[var9]) {
                continue;
              }
              var7 = 1;
              break;
            }
            if (var7 == 0) {
              var9 = this.a((byte) -22, var6);
              if (var2 == null ||
                var8 < var3 ||
                var8 == var3 &&
                var4 > var9) {
                var3 = var8;
                var4 = var9;
                var2 = var6;
              }
            }
            var6 = var5.h(param0 - 49949);
          }
        } else {
          var5_ref = (sd) (this.field_n.field_i.d(0));
          while (var5_ref != null) {
            var6 = var5_ref.j(18229);
            while (var6 != null) {
              var7 = 0;
              var8 = 0;
              for (var9 = 0; var9 < 4; var9++) {
                var8 = var8 + var6.field_G[var9];
                if (var5_ref.field_u[var9] >= var6.field_G[var9]) {
                  continue;
                }
                var7 = 1;
                break;
              }
              if (var7 != 0) {
                var6 = var5_ref.h(-23410);
                continue;
              }
              var9 = this.a((byte) -34, var6);
              if (var2 == null ||
                var8 < var3 ||
                var8 == var3 &&
                var9 < var4) {
                var4 = var9;
                var3 = var8;
                var2 = var6;
              }
              var6 = var5_ref.h(-23410);
            }
            var5_ref = (sd) (this.field_n.field_i.a((byte) -71));
          }
        }
        if (var2 != null) {
          var5_ref2 = new qm(1, this.field_n, (ln) (var2));
          lh.field_G.a((byte) -113, var5_ref2);
        }
    }

    private final int a(int param0, int param1, int[] param2, int[] param3, int param4) {
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6_int = 0;
          var7 = param4 + this.field_o;
          L1: while (true) {
            if (var7 >= 0) {
              var8 = param3[var7];
              var9 = this.field_g.field_g.field_e[var8];
              for (var10 = 0; var10 < param2.length; var10++) {
                if (param2[var10] != var8) {
                  continue;
                }
                break;
              }
              if (var10 != param2.length) {
                this.c(param0 + param1, cq.field_E, -1);
                if (0 == u.field_d[var8]) {
                  break L1;
                }
                if (ei.field_d[var8] <= param1) {
                  var11 = this.a(var9, param1, (byte) 30);
                  param1 = param1 - var11;
                  var6_int = var6_int + var11;
                  this.c(param0 + param1, cq.field_E, -1);
                  if (param1 == 0) {
                    break L1;
                  }
                }
              }
              var7--;
              continue;
            }
            break;
          }
          if (param1 > 0) {
            param1 = param1 - this.b(param1, -126, param0);
          }
          stackIn_22_0 = var6_int;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    int b(int param0, int param1) {
        fs stackIn_10_0 = null;
        fs stackIn_10_1 = null;
        int var3;
        ln var4;
        int var5;
        ln[] var6;
        int var7;
        ln var8;
        int var9;
        ln[] var10;
        ln var11;
        int var12;
        int var7Lifetime1;
        ln[] var6Lifetime1;
        ln var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -1799) {
          this.b(114, -80);
        }
        var3 = 0;
        var4 = mj.field_yb.j(param1 ^ -16436);
        while (true) {
          if (var4 == null) {
            return var3;
          }
          var5 = 0;
          var6 = var4.field_D;
          var7 = 0;
          L3: while (true) {
            if (var6.length > var7) {
              var8 = var6[var7];
              if (null != var8.field_y) {
                stackIn_10_0 = this.field_n;
                stackIn_10_1 = var8.field_y;
                if (stackIn_10_0 != stackIn_10_1 &&
                  !this.field_n.field_h[var8.field_y.field_x]) {
                  var5 = 1;
                  break L3;
                }
              }
              var7++;
              continue;
            }
            break;
          }
          if (var5 != 0) {
            var10 = var4.field_D;
            var6Lifetime1 = var4.field_D;
            var12 = 0;
            var7Lifetime1 = var12;
            while (var10.length > var12) {
              var11 = var10[var12];
              var8Lifetime1 = var11;
              if (this.field_n == var8Lifetime1.field_y) {
                if (param0 == 0) {
                  return var3;
                }
                param0--;
                wb.field_b[var11.field_p] = wb.field_b[var11.field_p] + 1;
                var3++;
              }
              var12++;
            }
          }
          var4 = mj.field_yb.h(-23410);
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 7686) {
            return;
          }
          if (2 == this.field_h) {
            this.field_j.a((byte) -63, this.field_n, param0);
          }
          var3_int = this.field_b[param0.field_x];
          var7 = var3_int;
          if (var7 != 1) {
            if (2 != var7) {
              if (var7 == 3) {
                var4 = 2;
              } else {
                if (var7 != 4) {
                  if (var7 != 5) {
                    if (-1 == var7) {
                      var4 = 4;
                    } else {
                      if (var7 != -2) {
                        if (var7 != -3) {
                          var4 = -1;
                        } else {
                          var5 = this.field_g.field_m[-1 + this.field_g.field_r];
                          var6 = this.field_g.field_m[-2 + this.field_g.field_r];
                          var4 = 6;
                          if (this.field_n.field_x != var5 &&
                            ~this.field_k != ~var5 &&
                            2 * this.field_g.field_D[var5] > 3 * this.field_g.field_D[var6]) {
                            var4 = 5;
                          }
                        }
                      } else {
                        var4 = 5;
                      }
                    }
                  } else {
                    var4 = 13;
                  }
                } else {
                  var4 = 3;
                }
              }
            } else {
              var4 = 1;
            }
          } else {
            var4 = 0;
          }
          if (-1 != var4) {
            this.field_j.a(0, (byte) 6, param0, this.field_n, var4);
          }
          if (this.field_l &&
            !this.field_n.field_h[param0.field_x]) {
            if (var3_int >= 0) {
              return;
            }
            this.field_j.a((byte) -63, this.field_n, param0);
            if (this.field_h != 3) {
              return;
            }
            this.g(param1 - 26170);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("ka.SA(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int[] b(int param0, sd param1) {
        int[] stackIn_19_0 = null;
        int[] stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln var4 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        ln[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var6Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.j(18229);
          while (var4 != null) {
            var9 = var4.field_D;
            for (var6 = 0; var6 < var9.length; var6++) {
              var7 = var9[var6];
              if (this.field_n != var7.field_y && (null == var7.field_y ||
                !this.field_n.field_h[var7.field_y.field_x]) && !rl.field_b[var7.field_p]) {
                rl.field_b[var7.field_p] = true;
                var3_int++;
              }
            }
            var4 = param1.h(-23410);
          }
          if (param0 < 66) {
            stackIn_19_0 = (int[]) null;
            return stackIn_19_0;
          }
          var10 = new int[var3_int];
          var11 = 0;
          var6Lifetime1 = var11;
          while (this.field_o > var11) {
            if (rl.field_b[var11]) {
              var3_int--;
              var10[var3_int] = var11;
            }
            var11++;
          }
          stackIn_27_0 = var10;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ka.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    void b(boolean param0) {
        int var4_int = 0;
        Object var2;
        int var3;
        int var5;
        int var8;
        qm var4;
        int var6;
        int var7;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          return;
        }
        var2 = null;
        var3 = 0;
        for (var4_int = 0; this.field_o > var4_int; var4_int++) {
          var5 = hs.field_i[var4_int];
          if (var5 >= 6) {
            var6 = cb.field_o[var4_int];
            var7 = var5 * var6 * var6;
            if (var3 < var7) {
              var3 = var7;
              var2 = this.field_g.field_g.field_e[var4_int];
            }
          }
        }
        if (var2 != null) {
          var4 = new qm(2, this.field_n, (ln) (var2));
          lh.field_G.a((byte) -113, var4);
        }
    }

    void e(byte param0) {
        int var4_int = 0;
        int var7_int = 0;
        sd stackIn_23_0 = null;
        sd stackIn_23_1 = null;
        Object var2;
        int var3;
        sd var4;
        Object var5;
        int var6;
        qm var7;
        ln var8;
        int var9;
        ln[] var10_ref_ln__;
        int var10;
        int var11;
        ln var12_ref_ln;
        int var12;
        int var13;
        int var14;
        int var6Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        Object var5Lifetime1;
        int var11Lifetime1Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        for (var4_int = 0; var4_int < this.field_o; var4_int++) {
          var5 = this.field_g.field_g.field_e[var4_int];
          if (((ln) (var5)).field_y == this.field_n) {
            var6 = oe.field_i[var4_int];
            if (((ln) (var5)).field_u) {
              var6 = 2 * var6 + 5;
            }
            if (var3 < var6) {
              var2 = var5;
              var3 = var6;
            }
          }
        }
        if (var2 == null) {
          return;
        }
        var4 = ((ln) (var2)).field_R;
        if (var4 == null) {
          return;
        }
        var5Lifetime1 = null;
        var6Lifetime1 = 0;
        if (param0 != 101) {
          field_a = false;
        }
        for (var7_int = 0; this.field_o > var7_int; var7_int++) {
          var8 = this.field_g.field_g.field_e[var7_int];
          stackIn_23_0 = var8.field_R;
          stackIn_23_1 = ((ln) (var2)).field_R;
          if (stackIn_23_0 != stackIn_23_1 && (var8.field_y == this.field_n ||
            var8.field_y == null ||
            !this.field_n.field_h[var8.field_y.field_x])) {
            var9 = 0;
            var10_ref_ln__ = var8.field_D;
            for (var11 = 0; var11 < var10_ref_ln__.length; var11++) {
              var12_ref_ln = var10_ref_ln__[var11];
              if (var12_ref_ln.field_R != ((ln) (var2)).field_R) {
                continue;
              }
              var9 = 1;
              break;
            }
            if (var9 == 0) {
              var10 = 0;
              for (var12 = 0; var12 < 4; var12++) {
                var10 = var10 + (1 + (var4.field_u[var12] - var4.field_w[0])) * var8.field_G[var12];
              }
              var11Lifetime1 = 0;
              var11Lifetime1Lifetime1 = var8.field_x;
              if (var8.field_u) {
                var11Lifetime1Lifetime1 = 5 + 2 * var11Lifetime1Lifetime1;
              }
              var12Lifetime1 = this.a(-5, var8);
              var11Lifetime1Lifetime1 = var11Lifetime1Lifetime1 + var12Lifetime1;
              var11Lifetime1Lifetime1 = var11Lifetime1Lifetime1 + this.a((byte) -113, var8);
              if (var11Lifetime1Lifetime1 < 1) {
                var11Lifetime1Lifetime1 = 1;
              }
              var13 = (var10 << 16) / var11Lifetime1Lifetime1;
              if (var6Lifetime1 < var13) {
                var5Lifetime1 = var8;
                var6Lifetime1 = var13;
              }
            }
          }
        }
        if (var5Lifetime1 != null) {
          var7 = new qm(3, this.field_n, (ln) (var2), (ln) (var5Lifetime1));
          lh.field_G.a((byte) -113, var7);
        }
        return;
    }

    int a(byte param0, ln param1) {
        int var5 = 0;
        int var3_int = 0;
        ln[] var4 = null;
        ln var6 = null;
        int var7 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 >= -14) {
            field_m = (String) null;
          }
          var3_int = 0;
          var4 = param1.field_D;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6.field_y != null &&
              this.field_n != var6.field_y &&
              !this.field_n.field_h[var6.field_y.field_x]) {
              var3_int = var3_int + var6.field_x;
            }
          }
          stackIn_17_0 = var3_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ka.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int a(ln param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        ln var6 = null;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.field_D;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var3_int = var3_int + ja.field_i[var6.field_p];
          }
          if (param1 != -5942) {
            field_a = true;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ka.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ln param2) {
        int var7 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 0) {
            throw new RuntimeException();
          }
          if (param0 == 0) {
            return;
          }
          var4 = this.field_g.field_g.field_c[param2.field_p];
          var5 = 27 / ((param1 + 41) / 58);
          var6 = nf.a(var4, 3718);
          for (var7 = 0; this.field_o > var7; var7++) {
            if (var6[var7] != -1) {
              var8 = var6[var7];
              var9 = this.field_g.field_g.field_e[var8];
              var10 = ja.field_i[var8];
              if (param0 <= var10) {
                if (param2 != var9) {
                  this.a(param2, var9, param0, -1);
                }
                ja.field_i[var8] = var10 - param0;
                return;
              }
              if (0 != var10) {
                if (var9 != param2) {
                  this.a(param2, var9, var10, -1);
                }
                param0 = param0 - var10;
                ja.field_i[var8] = 0;
              }
            }
          }
          if (param0 != 0) {
            if (cq.field_E < param0) {
              throw new RuntimeException();
            }
            this.a((byte) -113, param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("ka.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -18 % ((-44 - param0) / 62);
          var4 = this.a((byte) -56, param1);
          if (param1.field_u) {
            var4 = var4 >> 1;
          }
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ka.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_f = null;
        int var1 = -25 / ((2 - param0) / 56);
        field_e = null;
        field_m = null;
    }

    private final int a(ln param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.field_p;
          var5 = this.b(param0, param2 ^ 33);
          if (var5 > param1) {
            var5 = param1;
          }
          if (this.a(param0, param2 ^ -5932) >= ei.field_d[var4_int]) {
            ol.field_a[var4_int] = var5;
            var6 = this.a(0, false, var5, param0);
            if (var5 < var6) {
              throw new RuntimeException();
            }
            if (var6 < var5) {
              u.field_c[var4_int] = var5 - var6;
            }
            ig.field_c[var4_int] = ig.field_c[var4_int] + var6;
          } else {
            u.field_c[var4_int] = var5;
          }
          if (param2 == 30) {
            stackIn_16_0 = var5;
            return stackIn_16_0;
          }
          stackIn_14_0 = 15;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ka.P(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    int a(ln param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -49) {
            this.field_b = (int[]) null;
          }
          var3_int = param0.field_x;
          if (param0.field_u) {
            var3_int = 2 * (var3_int + 5);
          }
          var3_int = var3_int + this.a(-5, param0);
          var3_int = var3_int + this.a((byte) -23, param0);
          if (1 > var3_int) {
            var3_int = 1;
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ka.GA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 != -1) {
          this.field_c = (int[]) null;
        }
        while (var2 < this.field_o) {
          cb.field_o[var2] = 0;
          hs.field_i[var2] = 0;
          ei.field_d[var2] = 0;
          u.field_d[var2] = 0;
          oe.field_i[var2] = 0;
          ig.field_c[var2] = 0;
          var2++;
        }
    }

    public final void a(boolean param0, int param1) {
        this.field_l = param0 ? true : false;
        if (param1 != -6861) {
          field_e = (bc) null;
        }
    }

    public final int a(boolean param0) {
        if (param0) {
          this.a(-105, (ln) null);
        }
        return this.field_h;
    }

    public void a(byte param0) {
        int var4_int = 0;
        int var2;
        int var3;
        fs var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_n.field_i.g(-116)) {
          this.field_l = false;
        }
        var2 = this.field_g.field_m[this.field_g.field_r - 1];
        var3 = this.field_g.field_D[var2];
        for (var4_int = 0; var4_int < this.field_g.field_r; var4_int++) {
          this.field_c[var4_int] = this.field_c[var4_int] - 1;
          this.field_d[var4_int] = this.field_d[var4_int] - 1;
          if (~var4_int == ~var2) {
            this.field_i[var4_int] = 3;
          } else {
            if (this.field_g.field_D[var4_int] * 2 >= var3) {
              this.field_i[var4_int] = this.field_i[var4_int] - 1;
            } else {
              this.field_i[var4_int] = 0;
            }
          }
        }
        if (param0 != -63) {
          this.a(113, 108, (fs) null);
        }
        if (this.field_l &&
          this.field_g.field_o.field_j) {
          this.g(-18484);
          if (-1 != this.field_k) {
            var4 = this.field_g.field_v[this.field_k];
            if (0 >= this.field_c[this.field_k]) {
              var8 = this.field_b[this.field_k];
              if (var8 == -1) {
                var5 = 7;
              } else {
                if (var8 != -2) {
                  if (var8 == -3) {
                    var5 = 9;
                    var7 = this.field_g.field_m[this.field_g.field_r - 2];
                    var6 = this.field_g.field_m[this.field_g.field_r - 1];
                    if (this.field_n.field_x != var6 &&
                      var6 != this.field_k &&
                      2 * this.field_g.field_D[var6] > this.field_g.field_D[var7] * 3) {
                      var5 = 8;
                    }
                  } else {
                    var5 = -1;
                  }
                } else {
                  var5 = 8;
                }
              }
              if (var5 != -1) {
                this.field_j.a(0, (byte) 93, var4, this.field_n, var5);
                this.field_c[this.field_k] = rg.a(6, 3, (byte) 121);
              }
            }
            this.field_j.a((byte) -63, this.field_n, var4);
          }
        }
    }

    int b(ln param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 41) {
            this.f(28);
          }
          stackIn_3_0 = hs.field_i[param0.field_p];
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ka.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int[] var5;
        int var7;
        int var8;
        ln var9;
        mg var10;
        int var11;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 >= -124) {
          this.a((fs) null, (byte) -78);
        }
        var4 = 0;
        var5 = ik.a(u.field_c, this.field_o, (byte) 49);
        for (var6 = 0; var6 < this.field_o; var6++) {
          var7 = var5[-var6 - 1 + this.field_o];
          var8 = u.field_c[var7];
          if (0 != param0 &&
            0 != cq.field_E &&
            var8 != 0) {
            if (cq.field_E >= var8 &&
              var8 <= param0 &&
              ol.field_a[var7] != 0) {
              var9 = this.field_g.field_g.field_e[var7];
              var10 = (mg) (var9.field_s.c(-128));
              while (var10 != null) {
                if (var10.field_y.field_R != mj.field_yb) {
                  var10 = (mg) (var9.field_s.b(32));
                  continue;
                }
                break;
              }
              if (var10 != null) {
                var4 = var4 + var8;
                this.a((byte) -68, var8, var10.field_y);
                var10.field_z = var10.field_z + var8;
                param0 = param0 - var8;
                var10.field_y.field_J = var10.field_y.field_J - var8;
                ig.field_c[var7] = ig.field_c[var7] + var8;
              }
            }
            continue;
          }
          break;
        }
        this.c(param2 + param0, cq.field_E, -1);
        return var4;
    }

    void g(int param0) {
        int var3_int = 0;
        int var2;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_g.field_r;
        ff.field_x = new int[var2][];
        this.field_k = -1;
        ac.field_q = new boolean[this.field_o];
        for (var3_int = 0; var3_int < var2; var3_int++) {
          ff.field_x[var3_int] = this.a((byte) -64, this.field_g.field_v[var3_int]);
        }
        var3 = ff.field_x[this.field_n.field_x];
        var4 = 0;
        for (var5 = 0; var5 < this.field_o; var5++) {
          L6: {
            if (this.field_g.field_g.field_e[var5].field_y != this.field_n) {
              var6 = 1;
              var7 = 0;
              while (var7 < var2) {
                if (~var7 != ~this.field_n.field_x &&
                  this.field_n.field_h[var7] &&
                  var3[var5] >= ff.field_x[var7][var5]) {
                  var6 = 0;
                } else {
                  var7++;
                  continue;
                }
                break;
              }
              if (var6 != 0) {
                var4++;
              }
              ac.field_q[var5] = var6 != 0;
              break L6;
            }
            ac.field_q[var5] = false;
          }
        }
        if (param0 != -18484) {
          this.d(-52);
        }
        for (var5Lifetime1 = 0; var2 > var5Lifetime1; var5Lifetime1++) {
          this.field_b[var5Lifetime1] = this.a(var4, nc.a(param0, -18484), this.field_g.field_v[var5Lifetime1]);
        }
        for (var5Lifetime2 = 0; var2 > var5Lifetime2; var5Lifetime2++) {
          var6Lifetime1 = this.field_g.field_m[var5Lifetime2];
          if (this.field_b[var6Lifetime1] < 0) {
            this.field_k = var6Lifetime1;
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 >= -19) {
          this.b(102, -64);
        }
        return this.field_l;
    }

    private final void a(byte param0, int param1, ln param2) {
        qa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 >= -37) {
            return;
          }
          param2.field_J = param2.field_J + param1;
          cq.field_E = cq.field_E - param1;
          var4 = (qa) (lh.field_D.d(0));
          while (true) {
            if (var4 == null) {
              var4 = new qa(param2, param1);
              lh.field_D.a((byte) -113, var4);
              return;
            }
            if (var4.field_u != param2) {
              var4 = (qa) (lh.field_D.a((byte) -71));
              continue;
            }
            break;
          }
          var4.field_v = var4.field_v + param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("ka.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ka(dc param0, fs param1, mn param2, int param3) {
        try {
          this.field_l = true;
          this.field_g = param0;
          this.field_j = param2;
          this.field_h = param3;
          this.field_n = param1;
          this.field_o = this.field_g.field_g.field_e.length;
          this.field_i = new int[this.field_g.field_r];
          this.field_d = new int[this.field_g.field_r];
          this.field_b = new int[this.field_g.field_r];
          this.field_c = new int[this.field_g.field_r];
          this.field_k = -1;
          kd.a(23299, this.field_o);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_m = "Victory in <%0>";
        field_f = "Unable to delete friend - system busy";
    }
}
