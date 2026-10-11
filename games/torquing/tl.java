/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends eh {
    static ui field_l;
    int field_r;
    private int field_o;
    private int field_j;
    private lm field_q;
    static ei field_p;
    tl field_t;
    private int field_k;
    static String field_s;
    static int field_n;
    private int field_m;
    static int field_u;

    final static ak a(fj param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ak stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -118 / ((12 - param1) / 49);
          stackIn_1_0 = new ak(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.i((byte) -101));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("tl.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    tl(int param0, int param1, int param2, int param3, int param4) {
        super((double)param0, (double)param1, (double)param2);
        this.field_j = param2;
        this.field_r = param3;
        this.field_o = param1;
        this.field_m = param0;
        this.field_k = param4;
    }

    final boolean f(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 25468) {
          return false;
        }
        stackIn_6_0 = (7 == this.field_r) && (0 != this.field_k);
        return stackIn_6_0;
    }

    public static void d(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 >= -95) {
          field_u = -20;
        }
        field_p = null;
    }

    final lm a(byte param0) {
        if (param0 > -24) {
          this.field_t = (tl) null;
        }
        return (lm) ((Object) new ej(this.field_g[0], this.field_g[1], this.field_g[2], (double)this.e(-109)));
    }

    final kh d(int param0) {
        int var5 = 0;
        kh var2;
        int var3;
        int var4;
        int var6;
        kh var7;
        kh var8;
        kh var9;
        kh var10;
        int var3Lifetime1;
        int var4Lifetime1;
        kh var2Lifetime1;
        var6 = Torquing.field_u;
        if (this.field_r != 2) {
          if (this.field_r != 1) {
            if (param0 != -2) {
              return (kh) null;
            }
            return vc.field_c[this.field_r];
          }
          var2 = (kh) (on.field_e.a((long)this.field_k, (byte) 94));
          if (var2 == null) {
            var8 = new kh(vc.field_c[this.field_r], true, false, true, true);
            var10 = var8;
            var2 = var10;
            if (this.field_k > 100) {
              if (this.field_k > 250) {
                if (this.field_k <= 500) {
                  var3 = 107;
                } else {
                  var3 = 12256;
                }
              } else {
                var3 = 3800;
              }
            } else {
              var3 = 127;
            }
            for (var4 = var10.field_l.field_g - 1; var4 >= 0; var4--) {
              if (var8.field_l.field_m[var4] == 127) {
                var8.field_l.field_m[var4] = (short)var3;
              }
            }
            on.field_e.a(false, (long)this.field_k, var10);
          }
          return var2;
        }
        var2Lifetime1 = (kh) (og.field_k.a((long)this.field_k, (byte) 117));
        if (var2Lifetime1 == null) {
          var7 = new kh(vc.field_c[this.field_r], true, false, true, true);
          var9 = var7;
          var2Lifetime1 = var9;
          if (this.field_k > 5) {
            if (this.field_k > 10) {
              if (this.field_k > 15) {
                if (this.field_k <= 20) {
                  var4Lifetime1 = 1023;
                  var3Lifetime1 = 0;
                } else {
                  if (25 >= this.field_k) {
                    var3Lifetime1 = 44032;
                    var4Lifetime1 = 1023;
                  } else {
                    if (this.field_k <= 30) {
                      var3Lifetime1 = 21504;
                      var4Lifetime1 = 1023;
                    } else {
                      var4Lifetime1 = 1023;
                      var3Lifetime1 = 11264;
                    }
                  }
                }
              } else {
                var3Lifetime1 = 5120;
                var4Lifetime1 = 1023;
              }
            } else {
              var3Lifetime1 = 96;
              var4Lifetime1 = 0;
            }
          } else {
            var4Lifetime1 = 0;
            var3Lifetime1 = 32;
          }
          for (var5 = var9.field_l.field_g - 1; var5 >= 0; var5--) {
            if (var7.field_l.field_m[var5] != 127) {
              var9.field_l.field_m[var5] = (short)gm.a(ie.a((int) var7.field_l.field_m[var5], var4Lifetime1), var3Lifetime1);
            }
          }
          og.field_k.a(false, (long)this.field_k, var9);
        }
        return var2Lifetime1;
    }

    final static h a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          tl.a(44, -118, 22, -115);
        }
        h var4 = new h();
        var4.field_k = new int[param2];
        var4.field_m = param1;
        to.field_s.a((byte) 54, var4);
        va.a(var4, (byte) 119, param0);
        return var4;
    }

    final void a(bi param0, int param1) {
        ei stackIn_43_0;
        int stackIn_43_1;
        sb stackIn_43_2;
        sb stackIn_43_3;
        String stackIn_43_4;
        int stackIn_43_5;
        int stackIn_43_6;
        sb stackIn_44_2;
        sb stackIn_44_3;
        int stackIn_44_7;
        ei stackIn_47_0;
        int stackIn_47_1;
        sb stackIn_47_2;
        sb stackIn_47_3;
        String stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        sb stackIn_48_2;
        sb stackIn_48_3;
        int stackIn_48_7;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Torquing.field_u;
        try {
          if (param1 != 19) {
            return;
          }
          var13 = gj.field_i;
          var12 = var13;
          var11 = var12;
          var3 = var11;
          var4 = (-var13[2] + this.field_j) * var13[5] + var13[3] * (-var13[0] + this.field_m) + (-var13[1] + this.field_o) * var13[4] >> 16;
          var5 = (this.field_j - var13[2]) * var13[8] + ((-var13[1] + this.field_o) * var13[7] + var13[6] * (this.field_m - var13[0])) >> 16;
          var6 = var13[9] * (-var13[0] + this.field_m) + var13[10] * (this.field_o - var13[1]) + var13[11] * (this.field_j - var13[2]) >> 16;
          var7 = (var4 << 9) / var6 + be.field_g;
          var8 = (var5 << 9) / var6 + be.field_b;
          var9 = this.field_r;
          if (0 == var9) {
            param0.g(param1 ^ 111);
            th.a(100, th.field_F[18]);
            la.field_k[11].a(false);
            jh.a(la.field_k[11], 0);
          } else {
            if (var9 != 1) {
              if (var9 == 2) {
                param0.b((byte) 122, 1000 * this.field_k);
                stackIn_47_0 = param0.field_e;
                stackIn_47_1 = 54;
                stackIn_47_2 = null;
                stackIn_47_3 = null;
                stackIn_47_4 = wh.a(this.field_k * 1000, (byte) 21);
                stackIn_47_5 = var7;
                stackIn_47_6 = var8;
                if (this.field_k >= 30) {
                  stackIn_48_2 = null;
                  stackIn_48_3 = null;
                  stackIn_48_7 = 2;
                } else {
                  stackIn_48_2 = null;
                  stackIn_48_3 = null;
                  stackIn_48_7 = 3;
                }
                ((ei) (Object) stackIn_47_0).a((byte) stackIn_47_1, new sb(stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_48_7));
                th.a(100, th.field_F[7]);
              } else {
                if (var9 == 4) {
                  param0.c((byte) 122);
                  param0.field_e.a((byte) 54, new sb(gi.field_b, var7, var8, 3));
                  th.a(100, th.field_F[9]);
                } else {
                  if (var9 == 5) {
                    param0.a((byte) 121);
                    th.a(100, th.field_F[8]);
                    th.a(100, th.field_F[27]);
                  } else {
                    if (var9 != 7) {
                      if (var9 != 6) {
                        if (var9 == 8) {
                          param0.a(0);
                          param0.field_e.a((byte) 54, new sb(je.field_i, var7, var8, 3));
                          th.a(param1 + 81, th.field_F[18]);
                        } else {
                          if (9 != var9 &&
                            var9 != 10 &&
                            var9 != 11 &&
                            var9 != 12 &&
                            var9 != 13 &&
                            var9 != 14 &&
                            var9 != 15) {
                            if (var9 == 16) {
                              param0.field_e.a((byte) 54, new sb(Integer.toString(1000), var7, var8, 2));
                              param0.a((byte) 124, 1000);
                              param0.a(-9 + this.field_r, -73);
                              return;
                            }
                            if (var9 != 17 &&
                              18 != var9 &&
                              var9 != 19 &&
                              var9 != 21 &&
                              var9 != 20 &&
                              var9 != 22 &&
                              var9 != 23 &&
                              var9 != 24) {
                              return;
                            }
                            param0.a((byte) 113, 1000);
                            param0.field_e.a((byte) 54, new sb(nc.field_c, var7, var8, 3));
                            param0.a((byte) -68, vc.field_c[this.field_r], 1092, 72);
                            param0.field_i = vc.field_c[this.field_r];
                            param0.field_z = param0.field_z | 1 << param0.field_d.field_s;
                            la.field_k[10].g();
                            jh.a(la.field_k[10], 0);
                            return;
                          }
                          param0.field_e.a((byte) 54, new sb(Integer.toString(1000), var7, var8, 2));
                          param0.a((byte) 124, 1000);
                          param0.a(-9 + this.field_r, -73);
                        }
                      } else {
                        param0.e(-7045);
                        param0.field_e.a((byte) 54, new sb(ea.field_u, var7, var8, 3));
                        th.a(param1 ^ 119, th.field_F[19]);
                        th.a(100, th.field_F[10]);
                      }
                    } else {
                      param0.a(this.field_c, this.field_g[1], this.field_g[0], this.field_h, this.field_g[2], 0);
                      th.a(param1 + 81, th.field_F[13]);
                    }
                  }
                }
              }
            } else {
              param0.a((byte) 98, this.field_k);
              stackIn_43_0 = param0.field_e;
              stackIn_43_1 = 54;
              stackIn_43_2 = null;
              stackIn_43_3 = null;
              stackIn_43_4 = Integer.toString(this.field_k);
              stackIn_43_5 = var7;
              stackIn_43_6 = var8;
              if (this.field_k < 500) {
                stackIn_44_2 = null;
                stackIn_44_3 = null;
                stackIn_44_7 = 3;
              } else {
                stackIn_44_2 = null;
                stackIn_44_3 = null;
                stackIn_44_7 = 2;
              }
              ((ei) (Object) stackIn_43_0).a((byte) stackIn_43_1, new sb(stackIn_43_4, stackIn_43_5, stackIn_43_6, stackIn_44_7));
              th.a(param1 + 81, th.field_F[19]);
              th.a(100, th.field_F[6]);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_59_0 = var3_ref;
          stackIn_59_1 = new StringBuilder().append("tl.F(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, double[] param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_double = ap.b(param1, param0, this.field_g, 0) - 30.0;
          stackIn_3_0 = !(!((double)this.e(param0 ^ -127) > var3_double));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int e(int param0) {
        int var5 = 0;
        int var2;
        rm var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Torquing.field_u;
        var2 = -108 % ((-61 - param0) / 36);
        if (0 == al.field_e[this.field_r]) {
          var3 = this.d(-2).field_l;
          var4 = 0;
          for (var5 = 0; var3.field_f > var5; var5++) {
            var6 = var3.field_M[var5];
            var7 = var3.field_E[var5];
            var8 = var7 * var7 + var6 * var6;
            if (var4 < var8) {
              var4 = var8;
            }
          }
          al.field_e[this.field_r] = (int)(0.99 + Math.sqrt((double)var4));
        }
        return al.field_e[this.field_r];
    }

    final double a(int param0, double param1) {
        if (param0 != 0) {
          this.d(-97);
        }
        if (this.f(25468)) {
          this.field_g = hl.a(param1, qd.field_h, false, param0 - 6076, false, false, 30.0, 0.0, this.field_a, this.field_g, qd.field_h);
          this.c(0);
          this.field_h.a(this.d(-2), this.field_f);
        }
        return ap.a(this.field_g, 0, re.field_d, 0);
    }

    final void e(byte param0) {
        this.field_g = new double[13];
        this.field_g[2] = (double)this.field_j;
        this.field_g[1] = (double)this.field_o;
        this.field_g[6] = 1.0;
        this.field_g[0] = (double)this.field_m;
        if (param0 >= -77) {
          return;
        }
        if (3 != this.field_r && (this.field_r < 25 ||
          this.field_r > 31)) {
          he.a(this.field_a, 0.08, this.field_g, 16777215, 30.0);
        }
        this.c(0);
        this.field_d = null;
        if (null != this.field_q) {
          this.field_d = this.field_q;
        } else {
          this.b(1);
          this.field_q = this.field_d;
        }
    }

    static {
        field_l = new ui(0, 0);
        field_s = "Orb points: <%0>";
        field_p = new ei();
    }
}
