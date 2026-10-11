/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ql implements pa {
    private int field_i;
    static Calendar field_c;
    private int[] field_q;
    private boolean field_a;
    private vb field_b;
    private v field_k;
    private int[][] field_t;
    private ne[] field_g;
    private int field_s;
    static String field_e;
    private int field_m;
    static String field_p;
    private int field_n;
    static kl field_j;
    private int field_h;
    static String field_l;
    private int field_r;
    private ha field_o;
    private jd field_d;
    private int field_f;

    private final void f(int param0) {
        this.a(param0 - 131, this.field_r, this.field_f);
        if (param0 != 3) {
          field_l = (String) null;
        }
    }

    public final void a(int param0) {
        if (param0 <= 94) {
          this.field_o = (ha) null;
        }
    }

    public final void a(byte param0) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = this.field_n;
        if (0 == var2) {
          this.c(param0 + 55);
        } else {
          if (var2 == 3) {
            this.c(3);
          } else {
            if (4 == var2) {
              this.c(param0 ^ -49);
            }
          }
        }
        if (param0 != -52) {
          this.field_g = (ne[]) null;
        }
    }

    public final void b(oj param0, byte param1) {
        int var4 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_k.field_c[0] = this.field_b.field_x % this.field_s;
          this.field_k.field_c[1] = this.field_b.field_x / this.field_s;
          this.field_k.f(-48);
          this.field_k.i(0);
          this.field_q[1] = this.field_k.field_e[1];
          this.field_q[0] = this.field_k.field_e[0];
          this.field_b.field_m = this.field_q[0];
          var3_int = -44 / ((param1 + 26) / 48);
          this.field_h = this.field_h + 1;
          this.field_b.field_v = this.field_q[1];
          if (this.field_h == 20) {
            if (this.field_n != 7 &&
              this.field_n != 8 &&
              this.field_n != 10 &&
              this.field_n != 11 &&
              12 != this.field_n) {
              return;
            }
            this.field_t = new int[10][2];
            for (var4 = 0; var4 < 10; var4++) {
              stackIn_13_0 = this.field_t[var4];
              stackIn_13_1 = 0;
              stackIn_13_2 = ns.a(false, 20, li.field_n) + 20;
              if (10 >= ns.a(false, 20, li.field_n)) {
                stackIn_14_3 = -1;
              } else {
                stackIn_14_3 = 1;
              }
              stackIn_13_0[stackIn_13_1] = stackIn_13_2 * stackIn_14_3;
              this.field_t[var4][1] = -60 + -1 * ns.a(false, 40, li.field_n);
            }
            param0.a(this.field_o, -26661);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ql.Q(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_h < 40 &&
          this.field_h < 20) {
          hh.field_d.d(-40 + param2, param1 - 40, 80, 80, 255 * this.field_h / 20);
          hh.field_d.d(param2 - 40, param1 - 40, 80, 80, this.field_h * 255 / 20);
        }
        if (param0 > -124) {
          this.field_d = (jd) null;
        }
        if (null != this.field_t) {
          for (var4 = 0; this.field_t.length > var4; var4++) {
            var5 = (this.field_h - 20) * this.field_t[var4][0] / 20 + param2;
            var6 = this.field_t[var4][1] * (this.field_h - 20) / 20 + param1;
            hh.field_d.d(var5 - 10, var6 + (this.field_h - 20) * (-20 + this.field_h) / 10 - 10, 20, 20, 255 * (-this.field_h + 60) / 40);
          }
        }
    }

    final boolean a(int param0, int param1, int param2, oj param3) {
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        wa var7 = null;
        wa var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_h = 0;
          this.field_b.field_x = param2 + this.field_s * param1;
          if (param3.field_m == 12) {
            this.field_n = 1;
            this.field_d = this.field_o.c(param1, true, param2);
            if (null != this.field_d &&
              this.field_d.field_O == ((qq) (param3)).field_G &&
              this.field_d.field_Y < this.field_d.field_t) {
              this.field_i = 16711935;
              this.field_m = 1;
            } else {
              this.field_h = 50;
              this.field_n = -1;
              return false;
            }
          }
          if (param3.field_m == 14) {
            this.field_n = 2;
            this.field_d = this.field_o.c(param1, true, param2);
            this.field_f = ns.a(false, 21, li.field_n) - 10;
            this.field_r = ns.a(false, 21, li.field_n) - 10;
            if (this.field_d != null &&
              this.field_d.field_O == ((qq) (param3)).field_G &&
              this.field_d.field_A != 5) {
              this.field_i = 16711935;
              this.field_m = -this.field_d.field_A + 5;
            } else {
              this.field_n = -1;
              this.field_h = 50;
              return false;
            }
          }
          if (16 == param3.field_m) {
            this.field_n = 1;
            this.field_d = this.field_o.c(param1, true, param2);
            this.field_f = ns.a(false, 21, li.field_n) - 10;
            this.field_r = -10 + ns.a(false, 21, li.field_n);
            if ((!this.field_g[param2 + this.field_s * param1].c(92) ||
              null != this.field_d) && (this.field_d == null ||
              !this.field_d.a(23072) ||
              this.field_d.field_O != ((qq) (param3)).field_G ||
              this.field_d.field_t == this.field_d.field_Y)) {
              this.field_h = 50;
              this.field_n = -1;
              return false;
            }
            if (null == this.field_d) {
              this.field_m = 5;
            } else {
              this.field_m = -this.field_d.field_Y + this.field_d.field_t;
            }
            if (this.field_m > 5) {
              this.field_m = 5;
            }
          }
          if (param0 > -68) {
            this.field_g = (ne[]) null;
          }
          if (param3.field_m == 25) {
            this.field_n = 7;
            hs.b(-55, 46);
          } else {
            if (param3.field_m == 26) {
              this.field_n = 7;
            }
          }
          if (param3.field_m != 24) {
            this.b(param3, (byte) 102);
            this.field_b.field_x = param2 + param1 * this.field_s;
            return true;
          }
          this.field_n = 7;
          var7 = (wa) (((pj) (param3)).field_B);
          var8 = var7;
          if (6 == uc.field_d[var7.field_c][4]) {
            this.field_n = 10;
          }
          if (uc.field_d[var7.field_c][4] == 4 &&
            uc.field_d[var7.field_c][5] != 64 &&
            uc.field_d[var7.field_c][5] != 0) {
            if (uc.field_d[var7.field_c][6] >= 0) {
              if (uc.field_d[var8.field_c][7] <= 0) {
                this.field_n = 12;
              } else {
                this.field_n = 11;
              }
            } else {
              if (uc.field_d[var7.field_c][7] > 0) {
                this.field_n = 14;
              } else {
                this.field_n = 13;
              }
            }
          }
          this.b(param3, (byte) 102);
          this.field_b.field_x = param2 + param1 * this.field_s;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("ql.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (40 > this.field_h) {
          var2 = 0;
          var3 = 0;
          for (var4 = 0; var4 < 30; var4++) {
            if (var4 >= this.field_h) {
              break;
            }
            stackIn_6_0 = var2;
            if (ns.a(false, 100, li.field_n) > 50) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = ns.a(false, 100, li.field_n) - 50 >> 4;
            }
            var2 = stackIn_6_0 + stackIn_7_1;
            stackIn_9_0 = var3;
            if (ns.a(false, 100, li.field_n) <= 50) {
              stackIn_10_1 = -50 + ns.a(false, 100, li.field_n) >> 4;
            } else {
              stackIn_10_1 = 0;
            }
            var3 = stackIn_9_0 + stackIn_10_1;
            hh.field_d.d(this.field_b.field_m + 35 + var2, var3 + (this.field_b.field_v + var4 * 4) - 120, 10, 10, var4 * 8);
          }
        }
        if (param0 != 10) {
          this.e((byte) -128);
        }
        if (null != this.field_t) {
          for (var2Lifetime1 = 0; this.field_t.length > var2Lifetime1; var2Lifetime1++) {
            var3Lifetime1 = this.field_b.field_m + (this.field_t[var2Lifetime1][0] * (this.field_h - 20) / 20 + 30);
            var4Lifetime1 = -20 + this.field_t[var2Lifetime1][1] * (this.field_h - 20) / 20 + this.field_b.field_v;
            hh.field_d.d(var3Lifetime1, var4Lifetime1 + (this.field_h - 20) * (this.field_h - 20) / 10, 20, 20, 255 * (-this.field_h + 60) / 40);
          }
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        wk stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_5_5;
        int var3;
        int var4;
        int var5;
        oj var6;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_h < 20) {
          stackIn_4_0 = hs.field_F[ns.a(false, hs.field_F.length, li.field_n)];
          stackIn_4_1 = this.field_b.field_m + 30;
          stackIn_4_2 = -90 + (this.field_b.field_v + this.field_h * 4);
          stackIn_4_3 = 20;
          stackIn_4_4 = 20;
          if (this.field_h <= 10) {
            stackIn_5_5 = this.field_h * 255 / 10;
          } else {
            stackIn_5_5 = 255;
          }
          ((wk) (Object) stackIn_4_0).d(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_5_5);
        }
        if (null != this.field_t) {
          for (var2 = 0; var2 < this.field_t.length; var2++) {
            var3 = this.field_b.field_m + (this.field_t[var2][0] * (this.field_h - 20) / 20 + 35);
            var4 = -10 + this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
            hs.field_F[ns.a(false, hs.field_F.length, li.field_n)].d(-((-20 + this.field_h) / 4) + var3, -((-40 + this.field_h) / 4) + (this.field_h - 20) * (this.field_h - 20) / 10 + var4, (-20 + this.field_h) / 2 + 10, (-20 + this.field_h) / 2 + 10, (-this.field_h + 60) * 255 / 40);
          }
        }
        if (param0 != -117) {
          var6 = (oj) null;
          this.a((oj) null, (byte) -72);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_h < 40 &&
          this.field_h < 20) {
          hh.field_d.d(this.field_b.field_m - 10, this.field_b.field_v - 30, 100, 50, this.field_h * 255 / 20);
          hh.field_d.d(-10 + this.field_b.field_m, this.field_b.field_v - 30, 100, 50, 255 * this.field_h / 20);
        }
        if (this.field_t != null) {
          for (var2 = 0; this.field_t.length > var2; var2++) {
            var3 = this.field_b.field_m + (-20 + this.field_h) * this.field_t[var2][0] / 20 + 30;
            var4 = -20 + (this.field_b.field_v + (this.field_h - 20) * this.field_t[var2][1] / 20);
            hh.field_d.d(var3, (this.field_h - 20) * (this.field_h - 20) / 10 + var4, 20, 20, (15300 - this.field_h * 255) / 40);
          }
        }
        if (param0 >= -108) {
          this.field_a = false;
        }
    }

    public final void c(byte param0) {
        int stackIn_25_1 = 0;
        int var2;
        int var3;
        oj var4;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= -119) {
          var4 = (oj) null;
          this.a(116, -87, 41, (oj) null);
        }
        var2 = this.field_n;
        if (var2 == 1) {
          this.a(0, (byte) 117);
        } else {
          if (var2 != 5) {
            if (var2 != 9) {
              if (2 != var2) {
                if (var2 != 6) {
                  if (var2 == 7) {
                    this.d(20);
                  } else {
                    if (var2 == 14) {
                      this.a(false);
                    } else {
                      if (var2 == 13) {
                        this.g(10);
                      } else {
                        if (var2 == 12) {
                          this.i(10);
                        } else {
                          if (11 == var2) {
                            this.e((byte) -117);
                          } else {
                            if (var2 == 10) {
                              this.e(-111);
                            } else {
                              if (8 == var2) {
                                this.f(3);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(7, (byte) 122);
                }
              } else {
                if (this.field_m >= 0) {
                  stackIn_25_1 = 4;
                } else {
                  stackIn_25_1 = 5;
                }
                this.a(stackIn_25_1, (byte) 88);
              }
            } else {
              this.a(3, (byte) 101);
            }
          } else {
            this.a(2, (byte) 121);
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        if (param0 <= 45) {
          ql.d((byte) 124);
        }
        field_j = null;
        field_c = null;
        field_e = null;
        field_l = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 20) {
          return;
        }
        if (40 > this.field_h &&
          20 > this.field_h) {
          hh.field_d.d(this.field_b.field_m, -70 + this.field_b.field_v, 80, 100, this.field_h * 255 / 20);
          hh.field_d.d(this.field_b.field_m, -70 + this.field_b.field_v, 80, 100, 255 * this.field_h / 20);
        }
        if (null != this.field_t) {
          for (var2 = 0; this.field_t.length > var2; var2++) {
            var3 = 30 + (this.field_h - 20) * this.field_t[var2][0] / 20 + this.field_b.field_m;
            var4 = this.field_b.field_v + (-20 + this.field_h) * this.field_t[var2][1] / 20;
            hh.field_d.d(var3, (-20 + this.field_h) * (-20 + this.field_h) / 10 + var4, 20, 20, (15300 - this.field_h * 255) / 40);
          }
        }
    }

    public final boolean b(int param0) {
        if (param0 != 8865) {
          return false;
        }
        if (null != this.field_t) {
          return 60 <= this.field_h ? true : false;
        }
        return this.field_h >= 40 ? true : false;
    }

    public final boolean b(byte param0) {
        if (param0 >= -25) {
          return true;
        }
        return false;
    }

    private final void a(boolean param0) {
        if (param0) {
          this.field_b = (vb) null;
        }
        if (40 > this.field_h) {
          if (this.field_h >= 20) {
            hh.field_d.d(-this.field_h + this.field_b.field_m + 20, -this.field_h - 70 + this.field_b.field_v, (-20 + this.field_h) * 2 + 80, 100, (10200 - 255 * this.field_h) / 20);
          } else {
            hh.field_d.d(this.field_b.field_m, -this.field_h + (this.field_b.field_v - 70), 80, 100, 255 * this.field_h / 20);
          }
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 < 83) {
          return;
        }
        int var3 = this.field_m > 0 ? this.field_m : -this.field_m;
        if (var3 != 1) {
          od.field_d[param0].c(this.field_f + (40 + (this.field_b.field_m - var3 * 5)), this.field_r + (this.field_b.field_v + (-20 - var3 * 5) - this.field_h), this.field_m * 10, var3 * 10, 40 - this.field_h << 2);
        } else {
          od.field_d[param0].e(this.field_f + 35 + this.field_b.field_m, -this.field_h + (this.field_b.field_v - 25) + this.field_r, -this.field_h + 40 << 2);
        }
    }

    private final void c(int param0) {
        qn.a(this.field_b.field_m + 40, -20 + this.field_b.field_v, 10, this.field_i);
        mv.field_a[this.field_a ? 1 : 0].g(20 + this.field_b.field_m, this.field_b.field_v - 35);
        if (param0 != 3) {
          this.c((byte) -24);
        }
        en.field_E.c(Integer.toString(this.field_m), this.field_b.field_m + 40, this.field_b.field_v - 15, 16777215, 0);
    }

    private final void g(int param0) {
        wk stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        wk stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 10) {
          return;
        }
        if (this.field_h < 40) {
          if (this.field_h >= 20) {
            if (this.field_h >= 30) {
              hh.field_d.d(this.field_b.field_m - 10, -30 + this.field_b.field_v, 100, 50, (-(255 * this.field_h) + 10200) / 10);
              hh.field_d.d(-10 + this.field_b.field_m, -30 + this.field_b.field_v, 100, 50, (-this.field_h + 40) * 255 / 10);
            } else {
              hh.field_d.d(15 + (this.field_b.field_m - (5 * this.field_h - 100) / 2), this.field_b.field_v - 120 + 3 * this.field_h, -50 + this.field_h * 5, 50, 255);
              hh.field_d.d(this.field_b.field_m + 15 - (this.field_h - 20) * 5 / 2, this.field_b.field_v - (120 - this.field_h * 3), this.field_h * 5 - 100 + 50, 50, 255);
            }
          } else {
            stackIn_6_0 = hh.field_d;
            stackIn_6_1 = 15 + this.field_b.field_m;
            stackIn_6_2 = -120 + this.field_b.field_v + this.field_h * 3;
            stackIn_6_3 = 50;
            stackIn_6_4 = 50;
            if (this.field_h > 10) {
              stackIn_7_5 = 255;
            } else {
              stackIn_7_5 = 255 * this.field_h / 10;
            }
            ((wk) (Object) stackIn_6_0).d(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
            stackIn_9_0 = hh.field_d;
            stackIn_9_1 = this.field_b.field_m + 15;
            stackIn_9_2 = this.field_b.field_v - 120 + this.field_h * 3;
            stackIn_9_3 = 50;
            stackIn_9_4 = 50;
            if (this.field_h > 10) {
              stackIn_10_5 = 255;
            } else {
              stackIn_10_5 = 255 * this.field_h / 10;
            }
            ((wk) (Object) stackIn_9_0).d(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5);
          }
        }
    }

    final static boolean h(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 31337) {
          ql.h(-19);
        }
        boolean decompiledFrameRemainder0 = true;
        if (f.field_E >= 20 &&
          wd.a((byte) 28) && (!(vt.field_n > 0) ||
          du.c(10))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public final boolean a(oj param0, byte param1) {
        int stackIn_8_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        mb var6 = null;
        ec var7 = null;
        pj var8 = null;
        as var9 = null;
        qj var10 = null;
        st var11 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_h = 0;
          if (param0.field_m != 15) {
            if (19 == param0.field_m) {
              this.field_m = 1;
              var11 = (st) (param0);
              var4 = var11.field_D;
              if (var4 != 5) {
                if (var4 == 1) {
                  this.field_n = 1;
                } else {
                  if (var4 == 3) {
                    this.field_n = 3;
                  } else {
                    if (var4 == 4) {
                      this.field_n = 5;
                    } else {
                      if (6 == var4) {
                        this.field_n = 9;
                      } else {
                        if (2 == var4) {
                          this.field_a = true;
                          this.field_n = 4;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_n = 2;
                this.field_m = -1;
              }
              this.field_f = ns.a(false, 21, li.field_n) - 10;
              this.field_r = ns.a(false, 21, li.field_n) - 10;
              if (param0.field_w == null) {
                return false;
              }
              if (param0.field_w.field_S) {
                return false;
              }
              this.field_b.field_x = this.field_s * param0.field_w.field_w + param0.field_w.field_J;
            } else {
              if (20 == param0.field_m) {
                this.field_m = 3;
                this.field_n = 6;
                var10 = (qj) (param0);
                this.field_f = ns.a(false, 21, li.field_n) - 10;
                this.field_r = ns.a(false, 21, li.field_n) - 10;
                this.field_b.field_x = var10.field_y * this.field_s + var10.field_D;
              } else {
                if (param0.field_m != 2) {
                  if (param0.field_m == 23) {
                    this.field_n = 7;
                    var9 = (as) (param0);
                    this.field_b.field_x = var9.field_w.field_J + var9.field_w.field_w * this.field_s;
                  } else {
                    if (param0.field_m == 24) {
                      var8 = (pj) (param0);
                      this.field_n = 8;
                      if (var8.field_y >= 0) {
                        this.field_f = (int)(64.0 * Math.sin((double)var8.field_y * 3.141592653589793 / 4.0)) + 130;
                        this.field_r = -95 + (int)(Math.cos(3.141592653589793 * (double)var8.field_y / 4.0) * -64.0) + ag.field_I.field_D;
                      } else {
                        this.field_f = 130;
                        this.field_r = -95 + ag.field_I.field_D;
                      }
                    } else {
                      if (param0.field_m == 26) {
                        var7 = (ec) (param0);
                        var7.field_w = this.field_o.c(var7.field_B, true, var7.field_A);
                        if (var7.field_w.field_bb) {
                          var7.field_w = var7.field_w.b(false);
                        }
                        this.field_n = 7;
                        this.field_b.field_x = this.field_s * var7.field_w.field_w + var7.field_w.field_J;
                      }
                    }
                  }
                } else {
                  var6 = (mb) (param0);
                  this.field_n = 7;
                  this.field_b.field_x = var6.field_z + this.field_s * var6.field_H;
                }
              }
            }
          } else {
            this.field_a = ((nw) (param0)).field_A;
            this.field_n = 0;
            if (null == param0.field_w) {
              return false;
            }
            this.field_b.field_x = this.field_s * param0.field_w.field_w + param0.field_w.field_J;
            this.field_m = ((nw) (param0)).field_D;
            if (!((nw) (param0)).field_A) {
              stackIn_8_1 = 16711680;
            } else {
              stackIn_8_1 = 65280;
            }
            this.field_i = stackIn_8_1;
            if (1 > this.field_m) {
              this.field_h = 40;
              this.field_n = -1;
              return false;
            }
          }
          this.b(param0, (byte) -106);
          if (param1 != 57) {
            this.field_t = (int[][]) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("ql.E(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    ql(ha param0, v param1, vb param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_o = param0;
          this.field_s = param0.field_v;
          this.field_k = param1;
          this.field_b = param2;
          this.field_q = new int[2];
          this.field_g = param0.field_Eb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("ql.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_p = "Please remove <%0> from your friend list first.";
        field_l = "Unable to delete friend - system busy";
    }
}
