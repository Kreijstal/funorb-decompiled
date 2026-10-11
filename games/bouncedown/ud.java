/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int field_a;
    int field_p;
    double field_o;
    int field_n;
    int field_f;
    int field_t;
    double field_c;
    static bc field_k;
    int field_h;
    private int field_s;
    double field_d;
    int field_i;
    static String field_b;
    int field_l;
    private int field_m;
    double field_e;
    double field_u;
    private pi field_r;
    double field_j;
    private pi field_g;
    double field_q;

    final void a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6_int;
        int var10;
        tg var6;
        int var8;
        int var9;
        tg var12;
        tg var13;
        tg var14;
        tg var15;
        tg var16;
        tg var17;
        int var6_intLifetime1;
        int var6_intLifetime1Lifetime1;
        var10 = Bounce.field_N;
        var4 = 0;
        if (param1) {
          this.a((dg[]) null, (rb) null, 62, (ue[]) null, -0.16860739722231136, (byte) 54);
        }
        na.d();
        var5 = 0;
        if (u.field_g ||
          ka.field_o != null &&
          ka.field_o.field_d) {
          if (0 == param0) {
            var5 = 32 + param2 / 2;
            var4 = param2 / 2;
            na.e(2, -32 + (2 + var5), -4 + param2, 156, 0);
            ve.a(160, var5 - 32, cl.field_p, (byte) -99, param2, 0);
            gk.field_e.a(u.field_f, var4, var5 + 64, 16777215, -1);
            jh.field_s.a(gd.field_b[nj.field_m] + "<lt> <gt>" + gd.field_b[ee.field_a], var4, 24 + var5 + 64, 11579647, -1);
          }
          if (param0 == 1) {
            var4 = -1 + (-(param2 / 2) + 640);
            var5 = param2 / 2 + 32;
            na.e(640 - param2 + 2, var5 - 30, param2 - 4, 156, 0);
            ve.a(160, -32 + var5, cl.field_p, (byte) -116, param2, 640 - param2);
            gk.field_e.a(c.field_a, var4, var5 + 64, 16777215, -1);
            if (2 != field_a) {
              jh.field_s.a(wa.field_a, var4, var5 + 64 + 24, 16744576, -1);
              jh.field_s.a(ka.field_k, var4, 20 + var5 + 64 + 24, 16744576, -1);
            } else {
              gk.field_e.a(wa.field_a, var4, 18 + (var5 + 64), 16744576, -1);
              gk.field_e.a(ka.field_k, var4, 14 + (var5 + 64) + 18, 16744576, -1);
            }
          }
          if (param0 == 2) {
            var5 = 32 + (param2 / 2 + 240);
            var4 = param2 / 2;
            na.e(2, 2 + (var5 - 32), param2 - 4, 156, 0);
            ve.a(160, -32 + var5, cl.field_p, (byte) -112, param2, 0);
            gk.field_e.a(bk.field_b, var4, var5 + 64, 16777215, -1);
            jh.field_s.a(gd.field_b[nb.field_g] + "<lt> <gt>" + gd.field_b[db.field_S], var4, var5 + 64 + 24, 8454016, -1);
          }
        }
        na.e(param2, 0, 512 + param2, 446);
        if (this.field_p == 0) {
          var6 = new tg(100, 100);
          var8 = (int)((double)param2 + this.field_u) - 50;
          var9 = -50 + (int)(this.field_j - this.field_e / 2.0);
          var6.d();
          dg.field_a[param0].b(50, 0, -741572379, (int)this.field_o, 50);
          wj.field_d[param0].b((int)(-(1.3 * this.field_c) + (50.0 + this.field_e / 20.0)), 0, -741572379, (int)this.field_o, (int)(50.0 + this.field_e / 4.0 - 0.5 * this.field_q));
          if (this.field_d > 0.0) {
            se.field_A.b((int)(0.8 * this.field_c + 50.0), 0, -741572379, (int)this.field_o + 10, (int)(-(1.0 * this.field_e / 4.0) + 50.0 + this.field_q * 0.6));
          }
          if (2 == param0) {
            var16 = new tg(100, 100);
            var16.d();
            ge.field_b.b((int)(50.0 - this.field_e / 6.0 + 0.8 * this.field_c), 0, -741572379, 96, (int)(this.field_q * 0.6 + (50.0 - 1.0 * this.field_e / 4.0)));
            ge.field_b.b((int)(50.0 + 0.8 * this.field_c), 0, -741572379, 128, (int)(50.0 - 1.0 * this.field_e / 4.0 + this.field_q * 0.6));
            ge.field_b.b((int)(this.field_c * 0.8 + (this.field_e / 5.0 + 50.0)), 0, -741572379, 85, (int)(50.0 - this.field_e * 1.0 / 4.0 + this.field_q * 0.6));
            var6.d();
            var16.c(-1, 0, 0);
            var16.c(1, 0, 0);
            var16.c(0, -1, 0);
            var16.c(0, 1, 0);
            var16.a(0, 0);
            var12 = new tg(100, 100);
            var17 = var12;
            var12.d();
            hd.field_a[param0].b((int)(50.0 - this.field_e / 6.0 + this.field_c * 1.2), 0, -741572379, 96, (int)(this.field_q + (50.0 - this.field_e * 1.0 / 4.0)));
            hd.field_a[param0].b((int)(1.2 * this.field_c + 50.0), 0, -741572379, 128, (int)(50.0 - 1.0 * this.field_e / 4.0 + this.field_q));
            hd.field_a[param0].b((int)(this.field_c * 1.2 + (50.0 + this.field_e / 5.0)), 0, -741572379, 85, (int)(this.field_q + (50.0 - 1.0 * this.field_e / 4.0)));
            var6.d();
            var17.c(-1, 0, 0);
            var17.c(1, 0, 0);
            var17.c(0, -1, 0);
            var17.c(0, 1, 0);
            var17.a(0, 0);
          } else {
            var14 = new tg(100, 100);
            var14.d();
            ge.field_b.b((int)(-(this.field_e / 10.0) + 50.0 + this.field_c * 0.8), 0, -741572379, 128, (int)(50.0 - this.field_e * 1.0 / 4.0 + this.field_q * 0.6));
            ge.field_b.b((int)(0.8 * this.field_c + (this.field_e / 10.0 + 50.0)), 0, -741572379, 128, (int)(this.field_q * 0.6 + (50.0 - this.field_e * 1.0 / 4.0)));
            var6.d();
            var14.c(-1, 0, 0);
            var14.c(1, 0, 0);
            var14.c(0, -1, 0);
            var14.c(0, 1, 0);
            var14.a(0, 0);
            var13 = new tg(100, 100);
            var15 = var13;
            var15.d();
            hd.field_a[param0].b((int)(50.0 - this.field_e / 10.0 + this.field_c * 1.2), 0, -741572379, 128, (int)(this.field_q + (-(1.0 * this.field_e / 4.0) + 50.0)));
            hd.field_a[param0].b((int)(this.field_e / 10.0 + 50.0 + this.field_c * 1.2), 0, -741572379, 128, (int)(-(this.field_e * 1.0 / 4.0) + 50.0 + this.field_q));
            var6.d();
            var15.c(-1, 0, 0);
            var15.c(1, 0, 0);
            var15.c(0, -1, 0);
            var15.c(0, 1, 0);
            var15.a(0, 0);
          }
          ca.field_d.c(64);
          var4 = var4 - var6.field_s / 2;
          var5 -= 32;
          var6.e();
          if ((u.field_g ||
            ka.field_o != null &&
            ka.field_o.field_d) && 0 < this.field_n) {
            var6.a(var4, var5);
          }
          na.e(param2, 0, 512 + param2, 446);
          if (this.field_i / 5 % 2 == 0 &&
            this.field_n > 0) {
            var6.c(-1 + var8, var9, 0);
            var6.c(1 + var8, var9, 0);
            var6.c(var8, var9 - 1, 0);
            var6.c(var8, var9 + 1, 0);
            var6.a(var8, var9);
          }
        } else {
          if (this.field_p == 1) {
            var6_int = 8 * param0 + (-(8 * this.field_f) + 400) / 50 % 8;
            if ((param0 + 1) * 8 > var6_int) {
              w.field_c[var6_int].b((int)((double)param2 + this.field_u), 0, -741572379, (int)this.field_o, (int)(-34.0 + (480.0 - this.field_e)));
            }
            if (u.field_g ||
              null != ka.field_o &&
              ka.field_o.field_d) {
              var5 += 18;
              na.d();
              w.field_c[8 * param0 + 7].a(var4 - 25, var5 - 75);
              na.e(param2, 0, 512 + param2, 446);
            }
          }
          if (this.field_p == 2) {
            var6_intLifetime1 = 0;
            if (50 >= this.field_f) {
              var6_intLifetime1Lifetime1 = 3 * param0 + 2;
            } else {
              var6_intLifetime1Lifetime1 = 3 * param0 + (100 - this.field_f) * 3 / 50;
            }
            if (var6_intLifetime1Lifetime1 < 3 * param0 + 3) {
              vb.field_m[var6_intLifetime1Lifetime1].b((int)(this.field_u + (double)param2), 0, -741572379, (int)this.field_o, (int)(-(this.field_e / 2.0) + this.field_j));
            }
            if (u.field_g ||
              ka.field_o != null &&
              ka.field_o.field_d) {
              var5 += 18;
              na.d();
              vb.field_m[2 + param0 * 3].b(var4, 0, -741572379, (int)this.field_o, var5);
              na.e(param2, 0, 512 + param2, 446);
            }
          }
          if (this.field_p == 3) {
            ci.field_G[param0].b((int)((double)param2 + this.field_u), 0, -741572379, 100 + ((int)this.field_o - 4 * this.field_f), (int)(this.field_j - this.field_e / 2.0));
            if (u.field_g ||
              ka.field_o != null &&
              ka.field_o.field_d) {
              na.d();
              var5 += 18;
              ci.field_G[param0].b(var4, 0, -741572379, (int)this.field_o, var5);
              na.e(param2, 0, 512 + param2, 446);
            }
          }
        }
    }

    final void a(dg[] param0, rb param1, int param2, ue[] param3, double param4, byte param5) {
        RuntimeException stackIn_249_0 = null;
        StringBuilder stackIn_249_1 = null;
        String stackIn_250_2 = null;
        StringBuilder stackIn_252_1 = null;
        String stackIn_253_2 = null;
        StringBuilder stackIn_255_1 = null;
        String stackIn_256_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        try {
          this.field_e = this.field_o * 50.0 / 128.0;
          if (96.0 > this.field_o) {
            this.field_o = this.field_o + 0.05;
            if (this.field_o > 96.0) {
              this.field_o = 96.0;
            }
          }
          if (param5 != 90) {
            return;
          }
          if (96.0 < this.field_o) {
            this.field_o = this.field_o - 0.05;
            if (96.0 > this.field_o) {
              this.field_o = 96.0;
            }
          }
          if (this.field_p == 0 ||
            this.field_p == 2) {
            var8_int = 0;
            if (this.field_d > 0.0) {
              this.field_d = this.field_d - 0.1;
            }
            var9 = 0;
            if (this.field_p > 0) {
              this.field_c = 0.99 * this.field_c;
            }
            if (this.field_i > 0) {
              this.field_i = this.field_i - 1;
            }
            if (this.field_c < -4.0) {
              this.field_c = -4.0;
            }
            if (4.0 < this.field_c) {
              this.field_c = 4.0;
            }
            if (this.field_c < 0.0) {
              this.field_u = this.field_u - (-this.field_c + 0.0) * 128.0 / this.field_o;
              this.field_c = this.field_c + 0.1;
              if (this.field_c > 0.0) {
                this.field_c = 0.0;
              }
            }
            if (this.field_q != 0.0) {
              this.field_t = -1;
            }
            if (this.field_c > 0.0) {
              this.field_u = this.field_u + this.field_c * 128.0 / this.field_o;
              this.field_c = this.field_c - 0.1;
              if (0.0 > this.field_c) {
                this.field_c = 0.0;
              }
            }
            if (this.field_t <= -1) {
              if (0.0 < this.field_q) {
                for (var10 = 0; param2 > var10; var10++) {
                  if (this.field_u > -(this.field_e / 2.0) + (param0[var10].field_c - 64.0) &&
                    param0[var10].field_c + 64.0 + this.field_e / 2.0 > this.field_u &&
                    6 != param0[var10].field_d &&
                    param0[var10].field_j > this.field_j &&
                    param0[var10].field_j < 1.0 + (this.field_q + this.field_j + param4)) {
                    this.field_t = var10;
                    if (wd.field_x) {
                      param1.a(param3[7], 100, md.field_w * 48 / 256);
                    }
                    this.field_j = param0[this.field_t].field_j;
                    this.field_q = 0.0;
                  }
                  if (this.field_u > -(this.field_e / 2.0) + (param0[var10].field_c - (double)param0[var10].field_b) &&
                    param0[var10].field_c + (double)param0[var10].field_b + this.field_e / 2.0 > this.field_u &&
                    6 == param0[var10].field_d &&
                    param0[var10].field_j > this.field_j &&
                    this.field_j + this.field_q + param4 + 1.0 > param0[var10].field_j) {
                    this.field_t = var10;
                    if (wd.field_x) {
                      param1.a(param3[14], 100, 96 * md.field_w / 256);
                    }
                    this.field_j = param0[this.field_t].field_j;
                    this.field_q = 0.0;
                  }
                }
              }
              if (this.field_t == -1) {
                this.field_j = this.field_j + this.field_q;
                this.field_q = this.field_q + 0.2;
              } else {
                this.field_q = 0.0;
              }
            } else {
              if (param0[this.field_t].field_d == 1 &&
                1 >= param0[this.field_t].field_b) {
                param0[this.field_t].field_b = 1;
                this.field_j = this.field_j - 6.0;
                this.field_q = -(403.20000000000005 / this.field_o) - ta.field_c;
                this.field_t = -1;
                if (wd.field_x &&
                  91.0 > this.field_o) {
                  param1.a(param3[5], 100, 96 * md.field_w / 256);
                }
                if (wd.field_x &&
                  91.0 <= this.field_o &&
                  this.field_o <= 101.0) {
                  param1.a(param3[4], 100, md.field_w * 96 / 256);
                }
                if (wd.field_x &&
                  this.field_o > 101.0) {
                  param1.a(param3[6], 100, 96 * md.field_w / 256);
                }
                if (vk.field_b == 1 &&
                  null == ka.field_o) {
                  if (nb.field_e < 6) {
                    nb.field_e = nb.field_e + 1;
                    qf.field_c = qf.field_c + 10000;
                  }
                  if (nb.field_e == 5) {
                    dk.a(false, 3, 252);
                  }
                }
              }
              if (-1 < this.field_t &&
                param0[this.field_t].field_d != 1) {
                qf.field_c = qf.field_c - nb.field_e * 10000;
                nb.field_e = 0;
              }
              if (this.field_t > -1 &&
                param0[this.field_t].field_d == 2 &&
                0 == param0[this.field_t].field_b &&
                91.0 < this.field_o) {
                param0[this.field_t].field_b = 1;
                if (wd.field_x) {
                  param1.a(param3[0], 100, 96 * md.field_w / 256);
                }
                if (vk.field_b == 1 &&
                  ka.field_o == null) {
                  if (k.field_C < 6) {
                    k.field_C = k.field_C + 1;
                    qf.field_c = qf.field_c + 100000;
                  }
                  if (5 == k.field_C) {
                    dk.a(false, 4, 251);
                  }
                }
              }
              if (this.field_t > -1 &&
                param0[this.field_t].field_d != 2) {
                qf.field_c = qf.field_c - 100000 * k.field_C;
                k.field_C = 0;
              }
              if (this.field_t > -1 &&
                param0[this.field_t].field_d == 2 &&
                16 < param0[this.field_t].field_b) {
                this.field_t = -1;
              }
              if (this.field_t > -1 &&
                3 == param0[this.field_t].field_d) {
                this.field_c = this.field_c + 0.2;
              }
              if (this.field_t > -1 &&
                4 == param0[this.field_t].field_d) {
                this.field_c = this.field_c - 0.2;
              }
              if (-1 < this.field_t &&
                param0[this.field_t].field_d == 5 &&
                param0[this.field_t].field_b == 0 &&
                this.field_o > 64.0) {
                if (wd.field_x) {
                  if (null == this.field_r) {
                    if (64.0 < this.field_o) {
                      this.field_r = pi.a(param3[8], 100, 0);
                      var10 = (int)(128.0 - this.field_o);
                      if (var10 < 0) {
                        var10 = 0;
                      }
                      this.field_r.d(var10 * param3[8].field_k / 50);
                      this.field_s = 10;
                      this.field_r.c(param3[8].field_k / 50, 10);
                      if (wd.field_x) {
                        param1.a(this.field_r);
                      }
                    }
                  } else {
                    if (160 > this.field_s) {
                      this.field_s = this.field_s + 10;
                      this.field_r.c(param3[8].field_k / 50, md.field_w * this.field_s / 256);
                    }
                  }
                  var8_int = 1;
                }
                this.field_o = this.field_o - 1.0;
              }
              if (-1 < this.field_t &&
                param0[this.field_t].field_d == 5 &&
                param0[this.field_t].field_b == 1 &&
                this.field_o < 128.0) {
                if (wd.field_x) {
                  if (this.field_g != null) {
                    if (this.field_m < 160) {
                      this.field_m = this.field_m + 10;
                      this.field_g.c(param3[3].field_k / 50, md.field_w * this.field_m / 256);
                    }
                  } else {
                    if (126.0 > this.field_o) {
                      this.field_g = pi.a(param3[3], 100, 0);
                      var10 = (int)(-32.0 + this.field_o);
                      if (var10 < 0) {
                        var10 = 0;
                      }
                      this.field_g.d(var10 * param3[3].field_k / 50);
                      this.field_m = 10;
                      this.field_g.c(param3[3].field_k / 50, 10);
                      if (wd.field_x) {
                        param1.a(this.field_g);
                      }
                    }
                  }
                  var9 = 1;
                }
                this.field_o = this.field_o + 1.0;
              }
              if (this.field_t > -1 &&
                param0[this.field_t].field_d == 5 &&
                2 == param0[this.field_t].field_b &&
                this.field_d < 50.0) {
                if (wd.field_x &&
                  this.field_d <= 0.0) {
                  param1.a(param3[13], 100, 96 * md.field_w / 256);
                }
                this.field_d = this.field_d + 1.0;
                var10 = 0;
                if (this.field_u - this.field_e / 2.0 < 5.0 + param0[this.field_t].field_c &&
                  this.field_e / 2.0 + this.field_u > -5.0 + param0[this.field_t].field_c) {
                  var10 = 1;
                }
                if (var10 != 0) {
                  this.field_l = -1;
                  this.field_q = -(576.0 / this.field_o);
                  if (this.field_i > 0) {
                    if (wd.field_x) {
                      param1.a(param3[14], 100, 96 * md.field_w / 256);
                    }
                  } else {
                    if (wd.field_x) {
                      param1.a(param3[15], 100, md.field_w * 96 / 256);
                    }
                    this.field_p = 3;
                    this.field_f = 10;
                  }
                }
              }
              if (this.field_t > -1 &&
                -10.0 + this.field_j > param0[this.field_t].field_h) {
                this.field_t = -1;
              }
              if (this.field_t > -1 && (-64.0 + param0[this.field_t].field_c - this.field_e / 2.0 > this.field_u ||
                this.field_u > param0[this.field_t].field_c + 64.0 + this.field_e / 2.0)) {
                this.field_t = -1;
              }
              if (this.field_t > -1 &&
                param0[this.field_t].field_d == 6 && (this.field_u < param0[this.field_t].field_c - (double)param0[this.field_t].field_b - this.field_e / 2.0 ||
                this.field_u > this.field_e / 2.0 + ((double)param0[this.field_t].field_b + param0[this.field_t].field_c))) {
                this.field_t = -1;
              }
              if (this.field_t > -1) {
                this.field_j = param0[this.field_t].field_j;
              }
            }
            if (this.field_u < this.field_e / 2.0) {
              this.field_u = this.field_e / 2.0;
            }
            if (-(this.field_e / 2.0) + 512.0 < this.field_u) {
              this.field_u = 512.0 - this.field_e / 2.0;
            }
            if (25.0 + ((double)eg.field_n + this.field_e) > this.field_j) {
              this.field_q = 1.0;
              this.field_l = -1;
              this.field_j = this.field_e + (double)eg.field_n + 30.0;
              if (this.field_i > 0) {
                if (wd.field_x) {
                  param1.a(param3[14], 100, 96 * md.field_w / 256);
                }
              } else {
                if (wd.field_x) {
                  param1.a(param3[15], 100, 96 * md.field_w / 256);
                }
                this.field_p = 3;
                this.field_f = 10;
              }
            }
            if (446.0 < this.field_j) {
              this.field_q = 0.0;
              this.field_l = -1;
              this.field_j = -10.0;
              if (this.field_i <= 0) {
                if (wd.field_x) {
                  param1.a(param3[12], 100, md.field_w * 96 / 256);
                }
                this.field_f = 50;
                this.field_p = 1;
              } else {
                if (wd.field_x) {
                  param1.a(param3[14], 100, md.field_w * 96 / 256);
                }
                this.field_p = 0;
              }
            }
            if (var9 == 0) {
              this.a(param3, false);
            }
            if (var8_int == 0) {
              this.a(param3, (byte) 106);
            }
          }
          if (this.field_p > 0) {
            this.field_c = 0.0;
            this.field_f = this.field_f - 1;
            if (this.field_f <= 0) {
              if (2 != this.field_p) {
                this.field_o = 96.0;
                this.field_d = 0.0;
              }
              this.field_p = 0;
              this.field_f = 0;
            }
          }
          if (this.field_p == 0) {
            this.field_f = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_249_0 = var8;
          stackIn_249_1 = new StringBuilder().append("ud.I(");
          if (param0 == null) {
            stackIn_250_2 = "null";
          } else {
            stackIn_250_2 = "{...}";
          }
          stackIn_252_1 = ((StringBuilder) (Object) stackIn_249_1).append(stackIn_250_2).append(',');
          if (param1 == null) {
            stackIn_253_2 = "null";
          } else {
            stackIn_253_2 = "{...}";
          }
          stackIn_255_1 = ((StringBuilder) (Object) stackIn_252_1).append(stackIn_253_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_256_2 = "null";
          } else {
            stackIn_256_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_249_0), ((StringBuilder) (Object) stackIn_255_1).append(stackIn_256_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(boolean param0) {
        this.field_c = 0.0;
        this.field_o = 96.0;
        this.field_d = 0.0;
        this.field_j = 128.0;
        this.field_e = 32.0;
        if (!param0) {
          this.field_p = -117;
        }
        this.field_u = 256.0;
        this.field_t = -1;
        this.field_i = 160;
        this.field_n = 3;
        this.field_l = 0;
        this.field_q = 0.0;
        this.field_h = (int)(2.0 * Math.random());
        this.field_p = 0;
        this.field_f = 0;
    }

    final void a(ue[] param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          if (this.field_g != null) {
            if (wd.field_x) {
              this.field_g.i(param0[3].field_k * this.field_m / 1000);
            }
            this.field_g = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ud.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int var1 = 28 / ((73 - param0) / 37);
    }

    public static void a(int param0) {
        field_k = null;
        field_b = null;
        if (param0 != 100) {
          field_k = (bc) null;
        }
    }

    final void a(ue[] param0, byte param1) {
        try {
          if (param1 != 106) {
            this.a((dg[]) null, (rb) null, -3, (ue[]) null, -0.052863935081619066, (byte) 41);
          }
          if (this.field_r != null) {
            if (wd.field_x) {
              this.field_r.i(param0[8].field_k * this.field_s / 1000);
            }
            this.field_r = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ud.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ud() {
        this.a(true);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Bounce.field_N;
        if (param13 < param9) {
          if (param9 < param10) {
            ek.a(param4, na.field_d, param11, param15, param6, param12, param1, param9, param5, false, param14, param0, param10, param13, param2, param8, param3);
          } else {
            if (param13 >= param10) {
              ek.a(param6, na.field_d, param1, param14, param8, param3, param2, param13, param12, false, param0, param15, param9, param10, param11, param4, param5);
            } else {
              ek.a(param8, na.field_d, param2, param14, param6, param3, param1, param10, param5, false, param15, param0, param9, param13, param11, param4, param12);
            }
          }
        } else {
          if (param13 < param10) {
            ek.a(param6, na.field_d, param1, param15, param4, param12, param11, param13, param3, false, param0, param14, param10, param9, param2, param8, param5);
          } else {
            if (param10 > param9) {
              ek.a(param8, na.field_d, param2, param0, param4, param5, param11, param10, param3, false, param15, param14, param13, param9, param1, param6, param12);
            } else {
              ek.a(param4, na.field_d, param11, param0, param8, param5, param2, param9, param12, false, param14, param15, param13, param10, param1, param6, param3);
            }
          }
        }
        if (param7 != 100000) {
          field_k = (bc) null;
        }
    }

    static {
        field_b = "Open in popup window";
        field_k = new bc();
    }
}
