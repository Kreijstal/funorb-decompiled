/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_c;
    im field_h;
    int field_t;
    kd field_f;
    int field_m;
    int field_g;
    boolean field_k;
    int field_u;
    im field_o;
    int field_s;
    im field_r;
    int field_x;
    boolean field_a;
    private int field_d;
    int field_y;
    private int field_q;
    static hj[] field_w;
    int field_p;
    lb[] field_e;
    im field_b;
    int field_i;
    private boolean field_n;
    int field_l;
    private int field_v;
    static boolean field_j;

    final void a(int param0, int param1, byte param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -38) {
            this.field_u = -105;
          }
          var5_int = param1 - param0;
          L1: while (true) {
            stackIn_6_0 = ~var5_int;
            stackIn_6_1 = ~(param0 + param1);
            if (stackIn_6_0 >= stackIn_6_1) {
              if (var7 != 0) {
                return;
              }
              var6 = param3 - param0;
              while ((param0 + param3) >= var6) {
                stackIn_6_0 = 0;
                stackIn_6_1 = var5_int;
                if (stackIn_6_0 <= stackIn_6_1 &&
                  var5_int < this.field_f.field_c &&
                  var6 >= 0 &&
                  var6 < this.field_f.field_t) {
                  this.field_h.a(-81, new me((double)param1, (double)param3, (double)(-param1 + var5_int) * 0.05, (double)(var6 - param3) * 0.05, 1));
                }
                var6++;
              }
              var5_int++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var5), "f.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        try {
          this.field_k = true;
          if (param0) {
            f.a(-16, (ha) null, (byte) 46);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "f.O(" + param0 + ',' + param1 + ')');
        }
    }

    final static int c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8) {
            f.a((java.applet.Applet) null, (java.net.URL) null, 96);
          }
          stackIn_4_0 = ji.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "f.A(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        lb dupTemp$0 = null;
        lb dupTemp$1 = null;
        lb dupTemp$2 = null;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        ca stackIn_399_0 = null;
        ca stackIn_399_1 = null;
        ca stackIn_421_0 = null;
        int stackIn_457_0 = 0;
        int stackIn_476_0 = 0;
        int stackIn_476_1 = 0;
        int stackIn_491_0 = 0;
        int stackIn_491_1 = 0;
        pd stackIn_497_0 = null;
        int stackIn_507_0 = 0;
        int stackIn_507_1 = 0;
        Object stackIn_527_0 = null;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_496_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ca var3_ref_ca = null;
        oj var3_ref_oj = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5_int = 0;
        pd var5 = null;
        kb var5_ref = null;
        oj var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        pd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pd var11 = null;
        int var12 = 0;
        pd var4_ref_pdLifetime1;
        pd var5Lifetime1;
        pd var7Lifetime1;
        int stackIn_457_0Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var2_intLifetime2;
        int var3Lifetime2;
        int var6Lifetime3Lifetime1;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_k) {
            return;
          }
          if (this.field_f.field_k == 0) {
            this.a(false, -1);
          }
          this.field_i = this.field_i + 1;
          if (this.field_x % 11 == 0 &&
            !this.field_r.c(-3088) &&
            this.field_x > 0) {
            this.field_g = this.field_i + 500;
          }
          if (this.field_y > 0) {
            this.field_y = this.field_y - 1;
          }
          if (this.field_f.field_n < 0) {
            this.field_f.field_n = 0;
          }
          if (!this.field_k &&
            99 == this.field_x &&
            this.field_r.c(-3088)) {
            if (0 < this.field_e[0].field_f &&
              this.field_m == 0) {
              this.field_d = this.field_d + 1;
              if (1 == this.field_d) {
                f.a(13, 242, (byte) -25);
              }
              if (this.field_d == 3) {
                f.a(14, 241, (byte) -25);
              }
              if (this.field_d == 9) {
                f.a(15, 240, (byte) -25);
              }
            }
            nh.field_b = nh.field_b + this.field_e[0].field_f;
            dupTemp$0 = this.field_e[0];
            dupTemp$0.field_d = dupTemp$0.field_d + this.field_e[0].field_f;
            this.field_e[0].field_f = 0;
            this.a(false, 0);
            return;
          }
          if ((this.field_m == 1 ||
            2 == this.field_m) &&
            this.field_e[0].field_d >= 1000000) {
            f.a(3, 252, (byte) -25);
          }
          if ((this.field_m == 4 ||
            this.field_m == 5) &&
            this.field_e[0].field_d >= 1000000) {
            f.a(21, 234, (byte) -25);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          this.field_f.a((byte) 100);
          if (!this.field_f.field_r.b(0)) {
            var2_int = 0;
            while (!(this.field_f.field_r.field_e <= var2_int)) {
              var3 = this.field_f.field_r.field_g[var2_int].field_a;
              this.field_f.field_a[var3] = 25;
              var2_int++;
              if (var12 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) && (!this.field_k &&
            this.field_i >= this.field_g &&
            99 > this.field_x && (this.field_x % 11 != 0 ||
            this.field_r.c(param0 - 3186)))) {
            this.field_v = (this.field_f.field_k * 2 + 200) * (this.field_x + 1) / 99;
            if (3 == this.field_m ||
              this.field_m == 5) {
              this.field_v = (1 + this.field_x) * 500 / 99;
            }
            this.field_c = 50;
            if (this.field_x == 0) {
              this.field_c = 20;
            }
            if (1 == this.field_x) {
              this.field_c = 30;
            }
            if (this.field_x == 2) {
              this.field_c = 40;
            }
            if (this.field_x == 3) {
              this.field_c = 45;
            }
            this.field_c = this.field_c + this.field_x / 11 * 2;
            if (this.field_m == 1 ||
              this.field_m == 2) {
              this.field_c = this.field_c - 10;
            }
            if (this.field_m == 3) {
              this.field_c = this.field_c * 2;
            }
            var2_intLifetime2 = this.field_c;
            var3Lifetime2 = 0;
            var4 = 0;
            var3Lifetime2 = jc.field_f[this.field_m][this.field_x];
            if (1 == var3Lifetime2) {
              var2_intLifetime2 = var2_intLifetime2 * 3;
            }
            if (2 == var3Lifetime2) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (var3Lifetime2 == 3) {
              var2_intLifetime2 = 2 * var2_intLifetime2 / 3;
            }
            if (var3Lifetime2 == 4) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (var3Lifetime2 == 5) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (6 == var3Lifetime2) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (7 == var3Lifetime2) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (var3Lifetime2 == 9) {
              var2_intLifetime2 = var2_intLifetime2 * 2 / 3;
            }
            if (10 == var3Lifetime2) {
              var2_intLifetime2 = var2_intLifetime2 / 8;
            }
            if (this.field_x % 11 == 10 &&
              0 < this.field_x) {
              var2_intLifetime2 = 1;
              var4 = 1;
              gk.a(mh.field_a[var3Lifetime2 + 31], (byte) -11);
              if (var3Lifetime2 == 1) {
                var2_intLifetime2 = 4;
              }
            }
            if (0 == this.field_x % 11 &&
              this.field_x > 0) {
              if (this.field_e[0].field_f > 0 &&
                this.field_m == 0) {
                this.field_d = this.field_d + 1;
                if (this.field_d == 1) {
                  f.a(13, 242, (byte) -25);
                }
                if (3 == this.field_d) {
                  f.a(14, 241, (byte) -25);
                }
              }
              if (ok.a(0, false) &&
                this.field_e[0].field_f > 0 &&
                jc.field_f[this.field_m][-1 + this.field_x] == 7) {
                f.a(23, 232, (byte) -25);
              }
              df.field_g = df.field_g + this.field_e[0].field_f * 2;
              nh.field_b = nh.field_b + this.field_e[0].field_f;
              dupTemp$1 = this.field_e[0];
              dupTemp$1.field_d = dupTemp$1.field_d + this.field_e[0].field_f;
              this.field_e[0].field_f = 0;
            }
            if (1 == this.field_x) {
              this.field_v = this.field_v + 4;
            }
            if (2 == this.field_x) {
              this.field_v = this.field_v + 4;
            }
            if (3 == this.field_x) {
              this.field_v = this.field_v + 4;
            }
            if (this.field_x == 33 &&
              this.field_f.field_k == 25) {
              this.field_n = true;
            }
            if (this.field_x == 33 &&
              this.field_f.field_k == 125) {
              this.field_a = true;
            }
            if (this.field_x == 33 &&
              this.field_m == 0) {
              f.a(1, 254, (byte) -25);
            }
            if (66 == this.field_x &&
              this.field_m == 0) {
              f.a(2, 253, (byte) -25);
            }
            if (66 == this.field_x && (1 == this.field_m ||
              this.field_m == 2)) {
              f.a(22, 233, (byte) -25);
            }
            if (this.field_x == 66 &&
              75 <= this.field_f.field_k &&
              this.field_m == 0) {
              f.a(4, 251, (byte) -25);
            }
            if (this.field_x == 66 &&
              this.field_f.field_k >= 125 &&
              0 == this.field_m) {
              f.a(5, 250, (byte) -25);
            }
            if (66 == this.field_x &&
              this.field_n &&
              this.field_m == 0) {
              f.a(0, 255, (byte) -25);
            }
            this.field_x = this.field_x + 1;
            this.field_y = 50;
            if (this.field_x >= 22) {
              this.field_v = this.field_v + 2;
              if (var12 != 0) {
                this.field_v = this.field_v + (1 + this.field_x / 11);
              }
            } else {
              this.field_v = this.field_v + (1 + this.field_x / 11);
            }
            boolean decompiledFrameCompleted0 = true;
            this.field_f.field_n = 1;
            if (this.field_x % 25 == 24) {
              var5_int = 0;
              while (!(this.field_f.field_i <= var5_int)) {
                this.field_f.field_v[var5_int] = 0;
                var5_int++;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var5_int = this.field_f.field_s.length;
            }
            var6 = 0;
            var7_int = 0;
            while (true) {
              if (var2_intLifetime2 > var7_int) {
                var6++;
                stackIn_354_0 = ~var6;
                stackIn_354_1 = ~this.field_q;
                if (var12 == 0) {
                  if (stackIn_354_0 <= stackIn_354_1 &&
                    var3Lifetime2 != 1 ||
                    var6 >= 2 &&
                    var4 == 0) {
                    var6 = 0;
                  }
                  var8 = this.field_f.field_s[(this.field_x + var6 - 1) % var5_int];
                  var9 = var8 % this.field_f.field_c;
                  if (var4 != 0 &&
                    var3Lifetime2 == 10) {
                    this.field_v = this.field_v / 4;
                  }
                  var10 = var8 / this.field_f.field_c;
                  var11 = new pd(var9, var10, this, var3Lifetime2, this.field_v);
                  this.field_r.a(param0 ^ -22, var11);
                  var11.field_m = 9 * var7_int;
                  var11.field_n = var4 != 0;
                  if (0 == this.field_x) {
                    var11.field_m = 20 * var7_int;
                  }
                  if (this.field_x == 1) {
                    var11.field_m = var7_int * 19;
                  }
                  if (2 == this.field_x) {
                    var11.field_m = 18 * var7_int;
                  }
                  if (this.field_x == 3) {
                    var11.field_m = 17 * var7_int;
                  }
                  if (this.field_x == 4) {
                    var11.field_m = 16 * var7_int;
                  }
                  if (this.field_x == 5) {
                    var11.field_m = var7_int * 15;
                  }
                  if (this.field_x == 6) {
                    var11.field_m = var7_int * 14;
                  }
                  if (this.field_x == 7) {
                    var11.field_m = 13 * var7_int;
                  }
                  if (8 == this.field_x) {
                    var11.field_m = 12 * var7_int;
                  }
                  if (this.field_x == 9) {
                    var11.field_m = 11 * var7_int;
                  }
                  if (this.field_x == 10) {
                    var11.field_m = var7_int * 10;
                  }
                  if (var11.field_y == 1) {
                    var11.field_m = var11.field_m / 2;
                  }
                  if (var4 != 0) {
                    var11.field_o = var11.field_o * this.field_c;
                    var11.field_l = var11.field_o;
                    dupTemp$2 = this.field_e[0];
                    dupTemp$2.field_f = dupTemp$2.field_f + (1000 + this.field_x / 11 * 1000) / var2_intLifetime2;
                  } else {
                    if (25 < this.field_x) {
                      var11.field_o = this.field_x * var11.field_o / 25;
                      var11.field_l = var11.field_o;
                    }
                  }
                  if (var11.field_y == 10) {
                    var11.field_m = var11.field_m * 4;
                  }
                  var7_int++;
                  continue;
                }
              } else {
                this.field_c = this.field_c + 10;
                var2_intLifetime2 = 1500;
                stackIn_354_0 = this.field_x;
                stackIn_354_1 = 11;
              }
              break;
            }
            if (stackIn_354_0 > stackIn_354_1) {
              var2_intLifetime2 = 1450;
            }
            if (this.field_x > 22) {
              var2_intLifetime2 = 1400;
            }
            if (33 < this.field_x) {
              var2_intLifetime2 = 1350;
            }
            if (44 < this.field_x) {
              var2_intLifetime2 = 1300;
            }
            if (this.field_x > 55) {
              var2_intLifetime2 = 1250;
            }
            if (this.field_x > 66) {
              var2_intLifetime2 = 1200;
            }
            if (this.field_x > 88) {
              var2_intLifetime2 = 1150;
            }
            if (this.field_x < 99 &&
              jc.field_f[this.field_m][this.field_x] == 0 &&
              this.field_x > 11) {
              var2_intLifetime2 = var2_intLifetime2 / 2;
            }
            if (this.field_m == 1 ||
              this.field_m == 2) {
              var2_intLifetime2 = var2_intLifetime2 * 2;
            }
            this.field_g = this.field_g + var2_intLifetime2;
            decompiledFrameRemainder0 = (var12 != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_g < this.field_i)) {
            this.field_g = this.field_g + 3000;
          }
          var2_intLifetime1 = 0;
          L90: while (true) {
            if (var2_intLifetime1 == 0) {
              var2_intLifetime1 = 1;
              stackIn_421_0 = this.field_r.field_d.field_e;
              if (var12 != 0) {
                break L90;
              }
              var3_ref_ca = stackIn_421_0;
              L92: while (true) {
                stackIn_399_0 = this.field_r.field_d;
                stackIn_399_1 = var3_ref_ca;
                while (stackIn_399_0 != stackIn_399_1) {
                  stackIn_399_0 = this.field_r.field_d;
                  stackIn_399_1 = var3_ref_ca.field_e;
                  if (stackIn_399_0 != stackIn_399_1) {
                    var4_ref_pd = (pd) (var3_ref_ca.field_e);
                    var5 = (pd) (var3_ref_ca);
                    if ((!(var5.field_z <= var4_ref_pd.field_z) ||
                      !(var5.field_u <= var4_ref_pd.field_u) &&
                      var4_ref_pd.field_z == var5.field_z) &&
                      (var5.field_y == 4 ||
                      var4_ref_pd.field_y != 4)) {
                      var5.field_e = var4_ref_pd.field_e;
                      var4_ref_pd.field_c = var5.field_c;
                      var4_ref_pd.field_e = (ca) ((Object) var5);
                      var5.field_c = (ca) ((Object) var4_ref_pd);
                      var5.field_e.field_c = (ca) ((Object) var5);
                      var4_ref_pd.field_c.field_e = (ca) ((Object) var4_ref_pd);
                      var2_intLifetime1 = 0;
                    }
                    var3_ref_ca = var3_ref_ca.field_e;
                    continue L92;
                  }
                  break;
                }
                break;
              }
              continue;
            }
            stackIn_421_0 = this.field_b.b((byte) -112);
            break;
          }
          var3_ref_oj = (oj) (stackIn_421_0);
          do {
            if (var3_ref_oj == null) {
              gd.field_c = 0;
              break;
            }
            var3_ref_oj.a((byte) 44);
            var3_ref_oj = (oj) (this.field_b.d(853));
          } while (var12 == 0);
          var3Lifetime1 = 0;
          var4_ref_pdLifetime1 = (pd) (this.field_r.b((byte) 114));
          L102: while (true) {
            if (var4_ref_pdLifetime1 != null) {
              var4_ref_pdLifetime1.c(1);
              stackIn_476_0 = ~var4_ref_pdLifetime1.field_m;
              stackIn_476_1 = 11999;
              if (var12 == 0) {
                if (stackIn_476_0 > stackIn_476_1) {
                  f.a(20, 235, (byte) -25);
                }
                if (this.field_f.field_o[var4_ref_pdLifetime1.field_t] == 6) {
                  if (!ob.field_F ||
                    !(2 <= va.field_d)) {
                    var5_intLifetime1 = this.field_f.field_j[var4_ref_pdLifetime1.field_t];
                    var6Lifetime1 = var5_intLifetime1 % 8;
                    var7_intLifetime1 = (var5_intLifetime1 - var6Lifetime1) / 8;
                    var7_intLifetime1 -= 6;
                    var6Lifetime1 -= 3;
                    this.field_f.a((byte) -117, this.field_f.field_c * (-var7_intLifetime1 + 2) + 2 + (-var6Lifetime1 + var4_ref_pdLifetime1.field_t));
                    var8Lifetime1 = 0;
                    while (var8Lifetime1 < 5) {
                      stackIn_457_0 = 0;
                      var9Lifetime1 = stackIn_457_0;
                      while (var9Lifetime1 < 5) {
                        var10Lifetime1 = (var9Lifetime1 - var7_intLifetime1) * this.field_f.field_c + (var4_ref_pdLifetime1.field_t + var8Lifetime1) - var6Lifetime1;
                        this.field_f.field_o[var10Lifetime1] = 10;
                        this.field_f.field_j[var10Lifetime1] = this.field_f.field_j[var10Lifetime1] + 40;
                        this.field_h.a(-83, new me((double)(var10Lifetime1 % this.field_f.field_c), (double)(var10Lifetime1 / this.field_f.field_c), 1));
                        var9Lifetime1++;
                      }
                      var8Lifetime1++;
                    }
                    stackIn_457_0Lifetime1 = ~var4_ref_pdLifetime1.field_y;
                    if (stackIn_457_0Lifetime1 != -9) {
                      this.field_e[0].field_f = 0;
                    }
                  }
                  if (var4_ref_pdLifetime1.field_y != 8) {
                    var4_ref_pdLifetime1.field_o = 0;
                  }
                  gk.a(mh.field_a[55], (byte) -11);
                  hd.field_j = fd.field_d;
                  wl.field_a = 320;
                  md.field_f = 240;
                  var3Lifetime1 = 1;
                }
                var4_ref_pdLifetime1 = (pd) (this.field_r.d(853));
                continue;
              }
            } else {
              if (var3Lifetime1 != 0) {
                var4_ref_pdLifetime1 = (pd) (this.field_r.b((byte) 115));
                while (null != var4_ref_pdLifetime1) {
                  stackIn_476_0 = ~var4_ref_pdLifetime1.field_m;
                  stackIn_476_1 = -1;
                  if (var12 != 0) {
                    break L102;
                  }
                  if (stackIn_476_0 > stackIn_476_1) {
                    var4_ref_pdLifetime1.field_m = 0;
                  }
                  var4_ref_pdLifetime1 = (pd) (this.field_r.d(853));
                }
              }
              stackIn_476_0 = gd.field_c;
              stackIn_476_1 = 30;
            }
            break;
          }
          if (stackIn_476_0 >= stackIn_476_1) {
            f.a(19, 236, (byte) -25);
          }
          this.field_e[0].a(param0 ^ 98);
          if (param0 != 98) {
            this.field_c = 91;
          }
          var4Lifetime1 = 0;
          var5_ref = (kb) (this.field_o.b((byte) -96));
          while (true) {
            if (var5_ref == null) {
              stackIn_491_0 = var4Lifetime1;
              stackIn_491_1 = 250;
              break;
            }
            var5_ref.a((byte) 89);
            stackIn_491_0 = var5_ref.field_C;
            stackIn_491_1 = 5;
            if (var12 == 0) {
              if (stackIn_491_0 == stackIn_491_1) {
                var6Lifetime2 = var5_ref.f(param0 ^ 52);
                var4Lifetime1 = var4Lifetime1 + var6Lifetime2;
              }
              var5_ref = (kb) (this.field_o.d(param0 + 755));
              continue;
            }
            break;
          }
          if (stackIn_491_0 >= stackIn_491_1) {
            f.a(18, 237, (byte) -25);
          }
          this.a(-1);
          var5Lifetime1 = (pd) (this.field_r.d((byte) -122));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5Lifetime1))) {
            stackOut_496_0 = var5Lifetime1;
            stackIn_527_0 = stackOut_496_0;
            stackIn_497_0 = stackOut_496_0;
            if (var12 == 0) {
              if (stackIn_497_0.field_o <= 0) {
                var5Lifetime1.field_o = 0;
                if (this.field_f.field_m[var5Lifetime1.field_t]) {
                  this.field_f.field_m[var5Lifetime1.field_t] = false;
                }
                var5Lifetime1.b(57);
                stackIn_507_0 = ~var5Lifetime1.field_y;
                stackIn_507_1 = -11;
                while (true) {
                  if (stackIn_507_0 == stackIn_507_1) {
                    this.field_f.field_m[var5Lifetime1.field_t] = true;
                    var6Lifetime3 = 0;
                    while (var6Lifetime3 < 4) {
                      var7 = new pd(var5Lifetime1.field_u, var5Lifetime1.field_z, this, 11, 10);
                      var7.field_l = var5Lifetime1.field_l / 4;
                      var7.field_o = var7.field_l;
                      this.field_r.a(param0 - 212, var7);
                      var6Lifetime3++;
                    }
                  }
                  if (var5Lifetime1.field_y != 11) {
                    break;
                  }
                  this.field_f.field_m[var5Lifetime1.field_t] = true;
                  var6Lifetime3Lifetime1 = 0;
                  while (var6Lifetime3Lifetime1 < 4) {
                    var7Lifetime1 = new pd(var5Lifetime1.field_u, var5Lifetime1.field_z, this, 1, 10);
                    var7Lifetime1.field_l = var5Lifetime1.field_l / 4;
                    stackIn_507_0 = -1;
                    stackIn_507_1 = ~var7Lifetime1.field_l;
                    if (stackIn_507_0 == stackIn_507_1) {
                      var7Lifetime1.field_l = 1;
                    }
                    var7Lifetime1.field_o = var7Lifetime1.field_l;
                    this.field_r.a(-104, var7Lifetime1);
                    var6Lifetime3Lifetime1++;
                  }
                  break;
                }
              }
              var5Lifetime1 = (pd) (this.field_r.b(param0 + 10610));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_527_0 = this.field_b.d((byte) -122);
          }
          var5_ref2 = (oj) (stackIn_527_0);
          while (var5_ref2 != null) {
            if (var12 != 0) {
              return;
            }
            if (200 <= var5_ref2.field_g) {
              var5_ref2.b(57);
            }
            var5_ref2 = (oj) (this.field_b.b(10708));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "f.L(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
          if (param0 != -4) {
            this.field_x = 36;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "f.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 1 << param0;
          if ((lb.field_g & var3_int) != 0) {
            return;
          }
          dm.field_f = dm.field_f | var3_int;
          if (param2 != -25) {
            return;
          }
          lb.field_g = lb.field_g | var3_int;
          oj.field_r.a(-74, new kg(param0));
          if (!fc.field_d) {
            pe.field_b.a(-105, new ha(param0, param1, bc.field_r, mm.field_C, a.field_r, nh.field_b - wf.field_c.field_e[0].field_d));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "f.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -28) {
            field_j = true;
          }
          field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "f.F(" + param0 + ')');
        }
    }

    final void a(int param0) {
        kb stackIn_15_0 = null;
        kb stackIn_15_1 = null;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException decompiledCaughtException = null;
        kb var2 = null;
        RuntimeException var2_ref = null;
        km var3_ref_km = null;
        int var3 = 0;
        kb var4_ref_kb = null;
        int var4 = 0;
        kb var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        km var3_ref_kmLifetime1;
        int stackIn_53_0Lifetime1;
        int stackIn_53_1Lifetime1;
        int stackIn_65_0Lifetime1;
        int var3Lifetime1;
        int stackIn_65_0Lifetime1Lifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var2 = (kb) (this.field_o.b((byte) 127));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2 == null))) {
            stackIn_66_0 = ~this.field_f.field_o[var2.field_h * this.field_f.field_c + var2.field_g];
            stackIn_66_1 = -8;
            if (var7 == 0) {
              L4: {
                boolean decompiledFrameCompleted0 = true;
                if (stackIn_66_0 != stackIn_66_1 ||
                  -1 == var2.field_C) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var2.field_F <= 0) {
                    if (null == var2.field_s) {
                      var3_ref_km = new km(this.field_o);
                      var4_ref_kb = (kb) (var3_ref_km.d(27935));
                      while (var4_ref_kb != null) {
                        stackIn_15_0 = var2;
                        stackIn_15_1 = var4_ref_kb;
                        if (stackIn_15_0 != stackIn_15_1 &&
                          var2 == var4_ref_kb.field_s) {
                          var4_ref_kb.d(param0 ^ -10);
                          var4_ref_kb.field_C = -1;
                        }
                        var4_ref_kb = (kb) (var3_ref_km.b(true));
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var3_ref_kmLifetime1 = new km(this.field_o);
                      var4 = 0;
                      var5 = (kb) (var3_ref_kmLifetime1.d(27935));
                      while (var5 != null) {
                        stackIn_15_0 = var5;
                        stackIn_15_1 = var2;
                        if (stackIn_15_0 != stackIn_15_1 &&
                          var2.field_s == var5.field_s) {
                          var4 = 1;
                          break;
                        }
                        var5 = (kb) (var3_ref_kmLifetime1.b(true));
                      }
                    }
                  } else {
                    stackIn_15_0 = var2;
                    stackIn_15_1 = var2;
                    while (true) {
                      stackIn_15_0.field_F = stackIn_15_1.field_F - 1;
                      var3 = oj.a((byte) 47, var2.field_C);
                      var4 = 0;
                      while (var4 < var3) {
                        stackIn_65_0Lifetime1 = 0;
                        var5_int = stackIn_65_0Lifetime1;
                        while (var3 > var5_int) {
                          var6 = this.field_f.field_c * (var2.field_h + var5_int) + var2.field_g + var4;
                          this.field_f.field_o[var6] = 7;
                          this.field_f.field_j[var6] = 29;
                          var5_int++;
                        }
                        var4++;
                      }
                      var2.b(0, var2.field_h, var2.field_g);
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted0) &&
                    (var4 == 0)) {
                    var2.field_s.d(param0 ^ -10);
                    var2.field_s.field_C = -1;
                  }
                  if (decompiledFrameCompleted0) {
                    var2.c(1);
                    var2.field_C = -1;
                    var2.b(57);
                    var3Lifetime1 = -1 + var2.field_g;
                    while (true) {
                      stackIn_53_0 = ~var3Lifetime1;
                      stackIn_53_1 = ~(1 + var2.field_g);
                      if (stackIn_53_0 < stackIn_53_1) {
                        break;
                      }
                      stackIn_65_0Lifetime1Lifetime1 = -1 + var2.field_h;
                      var4 = stackIn_65_0Lifetime1Lifetime1;
                      while (var4 <= (var2.field_h + 1)) {
                        stackIn_53_0Lifetime1 = ~this.field_f.field_o[this.field_f.field_c * var4 + var3Lifetime1];
                        stackIn_53_1Lifetime1 = -2;
                        if (stackIn_53_0Lifetime1 == stackIn_53_1Lifetime1) {
                          this.field_f.field_j[var4 * this.field_f.field_c + var3Lifetime1] = 0;
                        }
                        var4++;
                      }
                      var3Lifetime1++;
                    }
                  }
                }
              }
              var2 = (kb) (this.field_o.d(853));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_65_0 = param0;
            stackIn_66_0 = stackIn_65_0;
            stackIn_66_1 = -1;
          }
          if (stackIn_66_0 != stackIn_66_1) {
            this.field_e = (lb[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "f.B(" + param0 + ')');
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException runtimeException = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new hj(param0.a("", 1, "final_frame.jpg"), (java.awt.Component) ((Object) tf.field_f));
          if (param1 != -17763) {
            return;
          }
          var3 = var2.field_o;
          var4 = var2.field_k;
          h.k(122);
          t.field_j = new hj(var3, var4 * 3 / 4);
          t.field_j.d();
          var2.b(0, 0);
          fd.field_a = new hj(var3, -t.field_j.field_k + var4);
          fd.field_a.d();
          var2.b(0, -t.field_j.field_k);
          fd.field_a.field_u = t.field_j.field_k;
          oc.g((byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("f.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static wd a(se param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        wd stackIn_32_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param0.h(8, 8);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = eg.a(param0, 26678) ? 1 : 0;
          var4 = eg.a(param0, param1 + 26662) ? 1 : 0;
          var5 = new wd();
          var5.field_c = (short)param0.h(16, param1 ^ 24);
          var5.field_R = ca.a(var5.field_R, 16, false, param0);
          var5.field_x = ca.a(var5.field_x, 16, false, param0);
          var5.field_Q = ca.a(var5.field_Q, 16, false, param0);
          var5.field_u = (short)param0.h(16, 8);
          var5.field_M = ca.a(var5.field_M, 16, false, param0);
          var5.field_e = ca.a(var5.field_e, 16, false, param0);
          var5.field_l = ca.a(var5.field_l, param1, false, param0);
          if (var3 != 0) {
            var5.field_w = (short)param0.h(16, param1 - 8);
            var5.field_K = ca.a(var5.field_K, 16, false, param0);
            var5.field_H = ca.a(var5.field_H, 16, false, param0);
            var5.field_G = ca.a(var5.field_G, 16, false, param0);
            var5.field_q = ca.a(var5.field_q, 16, false, param0);
            var5.field_y = ca.a(var5.field_y, 16, false, param0);
            var5.field_i = ca.a(var5.field_i, 16, false, param0);
          }
          if (var4 != 0) {
            param0.h(16, param1 ^ 24);
            var5.field_n = ca.a(var5.field_n, 16, false, param0);
            var5.field_B = ca.a(var5.field_B, 16, false, param0);
            var5.field_h = ca.a(var5.field_h, 16, false, param0);
            var5.field_s = ca.a(var5.field_s, 16, false, param0);
            var5.field_a = ca.a(var5.field_a, 16, false, param0);
          }
          if (eg.a(param0, 26678)) {
            var5.field_N = ca.a(var5.field_N, 16, false, param0);
          }
          if (eg.a(param0, param1 ^ 26662)) {
            var5.field_t = aa.a(param0, var5.field_t, 16, 20783);
            var6 = 0;
            var7 = 0;
            while (true) {
              if (var5.field_t.length > var7) {
                stackIn_25_0 = ~var6;
                stackIn_25_1 = ~(var5.field_t[var7] & 255);
                if (var8 == 0) {
                  if (stackIn_25_0 > stackIn_25_1) {
                    var6 = var5.field_t[var7] & 255;
                  }
                  var7++;
                  continue;
                }
              } else {
                stackIn_25_0 = 0;
                stackIn_25_1 = var6;
              }
              if (stackIn_25_0 == stackIn_25_1) {
                var5.field_t = null;
                if (var8 == 0) {
                  break;
                }
              }
              var5.field_m = (byte)(var6 + 1);
              break;
            }
          }
          stackIn_32_0 = var5;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("f.D(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        kb var2 = null;
        me var2_ref = null;
        me var3 = null;
        int var4 = 0;
        me stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = 0;
          while (true) {
            if (this.field_q > var2_int) {
              this.field_e[var2_int].b((byte) 85);
              var2_int++;
              if (var4 == 0) {
                continue;
              }
            } else {
              var2 = (kb) (this.field_o.b((byte) 127));
              while (null != var2) {
                var2.e(123);
                var2 = (kb) (this.field_o.d(853));
                if (var4 == 0) {
                  continue;
                }
                break;
              }
              var2_int = -34 / ((param0 - 40) / 60);
            }
            break;
          }
          var3 = (me) (this.field_h.b((byte) 126));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            var3.a((byte) 32);
            stackIn_16_0 = (me) (this.field_h.d(853));
            if (var4 == 0) {
              var3 = stackIn_16_0;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = (me) (this.field_h.b((byte) -96));
          }
          var2_ref = stackIn_16_0;
          while (var2_ref != null) {
            if (var4 != 0) {
              return;
            }
            if (var2_ref.field_m == -1) {
              var2_ref.b(57);
            }
            var2_ref = (me) (this.field_h.d(853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ')');
        }
    }

    final kb a(int param0, int param1) {
        kb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        kb stackIn_16_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackIn_8_0Lifetime1;
        int stackIn_8_1Lifetime1;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var3 = (kb) (this.field_o.b((byte) 119));
          var4 = -127 % ((-2 - param1) / 44);
          while (true) {
            if (null != var3) {
              var5 = oj.a((byte) 47, var3.field_C);
              stackIn_4_0 = ~var3.field_C;
              L2: while (true) {
                if (stackIn_4_0 != 0) {
                  var6 = 0;
                  while (true) {
                    stackIn_8_0 = var6;
                    stackIn_8_1 = var5;
                    if (stackIn_8_0 >= stackIn_8_1) {
                      break L2;
                    }
                    stackIn_4_0 = 0;
                    if (var8 != 0) {
                      continue L2;
                    }
                    var7 = stackIn_4_0;
                    while (var5 > var7) {
                      stackIn_8_0Lifetime1 = ~(var7 * this.field_f.field_c + var6 + var3.field_w);
                      stackIn_8_1Lifetime1 = ~param0;
                      if (stackIn_8_0Lifetime1 == stackIn_8_1Lifetime1) {
                        stackIn_16_0 = var3;
                        return stackIn_16_0;
                      }
                      var7++;
                    }
                    var6++;
                  }
                }
                break;
              }
              var3 = (kb) (this.field_o.d(853));
              if (var8 == 0) {
                continue;
              }
            }
            break;
          }
          stackIn_21_0 = null;
          return (kb) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref), "f.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static sh a(boolean param0, long param1, String param2, int param3, String param4) {
        RuntimeException var6 = null;
        sh stackIn_2_0 = null;
        hh stackIn_8_0 = null;
        ic stackIn_13_0 = null;
        ii stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 17470) {
            stackIn_2_0 = (sh) null;
            return stackIn_2_0;
          }
          if (param1 == 0L &&
            param2 != null) {
            stackIn_8_0 = new hh(param2, param4);
            return (sh) ((Object) stackIn_8_0);
          }
          if (param0) {
            stackIn_13_0 = new ic(param1, param4);
            return (sh) ((Object) stackIn_13_0);
          }
          stackIn_15_0 = new ii(param1, param4);
          return (sh) ((Object) stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("f.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var5 = -69 % ((param2 - 42) / 59);
          if (ld.field_e != null &&
            !ld.field_e.equals(param0.getParameter("settings"))) {
            var3 = ld.field_e;
          }
          var4 = null;
          if (pc.field_ab != null &&
            !pc.field_ab.equals(param0.getParameter("session"))) {
            var4 = pc.field_ab;
          }
          stackIn_13_0 = lj.a((String) (var3), param1, -1, (String) (var4), (byte) 72);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("f.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) (stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, ha param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oa.field_d.a(-114, param1);
          tl.a(-127, param1, param0);
          var3_int = 75 / ((param2 - 30) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("f.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    f(int param0) {
        lb dupTemp$0 = null;
        lb dupTemp$1 = null;
        lb dupTemp$2 = null;
        lb dupTemp$3 = null;
        lb dupTemp$4 = null;
        lb dupTemp$5 = null;
        lb dupTemp$6 = null;
        lb dupTemp$7 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        this.field_t = 0;
        this.field_u = 0;
        this.field_d = 0;
        this.field_a = false;
        this.field_p = 0;
        this.field_y = 0;
        this.field_n = false;
        this.field_l = 0;
        this.field_s = 0;
        this.field_v = 4;
        try {
          this.field_m = param0;
          this.field_f = new kd(am.field_d[param0]);
          this.field_r = new im();
          this.field_o = new im();
          this.field_h = new im();
          this.field_b = new im();
          this.field_q = 1;
          this.field_e = new lb[this.field_q];
          var2_int = 0;
          while (this.field_q > var2_int) {
            this.field_e[var2_int] = new lb(this, var2_int);
            this.field_e[var2_int].field_j = this.field_f.field_c / 2;
            this.field_e[var2_int].field_c = this.field_f.field_t / 2;
            if (var3 != 0) {
              return;
            }
            if (var2_int == 0) {
              dupTemp$0 = this.field_e[var2_int];
              dupTemp$0.field_j = dupTemp$0.field_j - 4;
              dupTemp$1 = this.field_e[var2_int];
              dupTemp$1.field_c = dupTemp$1.field_c - 2;
            }
            if (1 == var2_int) {
              dupTemp$2 = this.field_e[var2_int];
              dupTemp$2.field_j = dupTemp$2.field_j + 2;
              dupTemp$3 = this.field_e[var2_int];
              dupTemp$3.field_c = dupTemp$3.field_c - 2;
            }
            if (var2_int == 2) {
              dupTemp$4 = this.field_e[var2_int];
              dupTemp$4.field_j = dupTemp$4.field_j - 2;
              dupTemp$5 = this.field_e[var2_int];
              dupTemp$5.field_c = dupTemp$5.field_c + 2;
            }
            if (3 == var2_int) {
              dupTemp$6 = this.field_e[var2_int];
              dupTemp$6.field_j = dupTemp$6.field_j + 2;
              dupTemp$7 = this.field_e[var2_int];
              dupTemp$7.field_c = dupTemp$7.field_c + 2;
            }
            var2_int++;
          }
          this.field_g = 3000;
          this.field_x = 0;
          this.field_i = 0;
          this.field_c = 100;
          this.field_f.field_n = 0;
          this.field_f.a((byte) 100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "f.<init>(" + param0 + ')');
        }
    }

    static {
    }
}
