/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    private int field_k;
    static String[] field_a;
    private int field_o;
    private int field_j;
    int field_i;
    private int field_m;
    private int field_f;
    int field_g;
    private int field_c;
    int field_p;
    int field_h;
    int field_b;
    private boolean field_e;
    private int field_l;
    int field_n;

    final void b(boolean param0) {
        int var8 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var9 = MinerDisturbance.field_ab;
        try {
          if (param0) {
            this.field_m = -58;
          }
          var2_int = 16 + (this.field_k / 10 + this.field_n * 32) - li.field_c;
          var3 = 16 + (this.field_f / 10 + this.field_p * 32) - db.field_d;
          var4 = q.field_b[this.field_n][this.field_p].field_i;
          if (var4 < 1) {
            var4 = 1;
          }
          if (255 < var4) {
            var4 = 255;
          }
          if (this.field_d < var4) {
            this.field_d = this.field_d + 1;
          }
          if (var4 < this.field_d) {
            this.field_d = this.field_d - 1;
          }
          var5 = this.field_k / 10 + (32 * this.field_n - 32 * ca.field_k) - sk.field_d / 10;
          var6 = -(hf.field_t * 32) - (mf.field_i / 10 - this.field_p * 32 - this.field_f / 10);
          var7 = (int)Math.sqrt((double)(var6 * var6 + var5 * var5)) / this.field_d;
          var2_int = (int)((double)var2_int + (double)var7 * Math.sin((double)pa.field_d * 3.14 / 16384.0) / 3.0);
          var3 = (int)((double)var3 + Math.cos((double)pa.field_d * 3.14 / 16384.0) * (double)var7 / 3.0);
          for (var8 = 0; var8 < 4; var8++) {
            eh.f(var2_int, var3, -(var8 * 8) + 64, 16777215, 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.H(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int var12 = 0;
        int var14 = 0;
        int stackIn_18_0 = 0;
        ea stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ea var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var15 = 0;
        ea var16 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var7Lifetime1;
        int var10Lifetime1;
        var15 = MinerDisturbance.field_ab;
        try {
          if (this.field_h != 19 &&
            this.field_h != 9) {
            return;
          }
          if (q.field_b[this.field_n][this.field_p].field_V) {
            if (!je.field_O.f(this.field_p, 2, this.field_n) &&
              !q.field_b[this.field_n][this.field_p].field_A) {
              return;
            }
            if (this.field_d > 0) {
              var2_int = 32 * this.field_n + (this.field_k / 10 - sk.field_d / 10 - 32 * ca.field_k);
              var3 = this.field_f / 10 + (32 * this.field_p + (-(mf.field_i / 10) - 32 * hf.field_t));
              var4 = (int)Math.sqrt((double)(var2_int * var2_int + var3 * var3)) / this.field_d;
              if (var4 > 100) {
                return;
              }
            }
            var2_intLifetime1 = -li.field_c + 32 * this.field_n + this.field_k / 10;
            var3Lifetime1 = -db.field_d + (this.field_p * 32 + this.field_f / 10);
            stackIn_18_0 = (!je.c(this.field_n, this.field_p, 1, 1)) ? 0 : 1;
            var4Lifetime1 = stackIn_18_0;
            var5 = (this.field_c & 63) / 16;
            if (this.field_i == 0) {
              var5 = 0;
            }
            if (19 != this.field_h) {
              var7 = 91 + this.field_j / 10 % 5;
              if (0 > this.field_m) {
                var7 = 59;
              }
              if (this.field_m > 0) {
                var7 = 60;
              }
              if (this.field_m > 10) {
                var7 = 61;
              }
              var6 = pk.field_h[var7];
            } else {
              if (var4Lifetime1 != 0) {
                stackIn_27_0 = vc.field_o[var5 + 4];
              } else {
                stackIn_27_0 = vc.field_o[var5 + 0];
              }
              var16 = stackIn_27_0;
              var6 = var16;
              var3Lifetime1 = var3Lifetime1 + (-var16.field_A + 32);
            }
            if (q.field_b[this.field_n][this.field_p].field_A) {
              var3Lifetime1 += 8;
              if (this.field_i < 0) {
                var6.e().a(var2_intLifetime1, 32 + var3Lifetime1 - var6.field_A, 9348351);
              } else {
                var6.a(var2_intLifetime1, 32 + var3Lifetime1 - var6.field_A, 9348351);
              }
              var3Lifetime1 -= 8;
            }
            var7Lifetime1 = 4 * this.field_n - (-(this.field_k / 80) + 1);
            var8 = -1 + (this.field_f / 80 + this.field_p * 4);
            var11 = -68 % ((-35 - param0) / 44);
            var9 = -li.field_c + var7Lifetime1 * 8;
            var10 = var8 * 8 - db.field_d;
            for (var12 = 0; var12 <= 6; var12++) {
              var10Lifetime1 = -db.field_d + 8 * var8;
              var13 = var8;
              for (var14 = 0; var14 <= 5; var14++) {
                if (je.field_O.a(var7Lifetime1, var13, (byte) 61)) {
                  eh.a(var9, var10Lifetime1, var9 + 8, var10Lifetime1 + 8);
                  if (this.field_i >= 0) {
                    var6.f(var2_intLifetime1, var3Lifetime1);
                  } else {
                    var6.h(var2_intLifetime1, var3Lifetime1);
                  }
                }
                var13++;
                var10Lifetime1 += 8;
              }
              var9 += 8;
              var7Lifetime1++;
            }
            eh.a();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.C(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_51_0 = 0;
        ea stackIn_55_0 = null;
        int stackIn_81_0 = 0;
        ea stackIn_87_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ea var5_ref_ea = null;
        ea var6 = null;
        int var7 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var7 = MinerDisturbance.field_ab;
        try {
          var2_int = this.field_k / 10 + (this.field_n * 32 - li.field_c);
          var3 = -db.field_d + (32 * this.field_p + this.field_f / 10);
          if (this.a((byte) 103)) {
            mb.field_d[this.field_h].f(var2_int, var3);
          }
          if (param0 != -12) {
            this.b(false);
          }
          if (17 == this.field_h) {
            te.field_d[0].c(-16 + var2_int, var3, 128);
          } else {
            if (6 != this.field_h) {
              if (this.field_h != 7 &&
                this.field_h != 15 &&
                this.field_h != 18 &&
                this.field_h != 22) {
                if (20 == this.field_h) {
                  if (this.field_g == 0) {
                    if (this.field_b >= 250) {
                      g.field_j[4].f(var2_int, var3);
                      return;
                    }
                    g.field_j[5 * this.field_b / 250].f(var2_int, var3);
                    return;
                  }
                  if (5 > this.field_g) {
                    hk.field_a[this.field_g].f(-16 + var2_int, var3);
                    return;
                  }
                } else {
                  if (this.field_h == 8) {
                    wj.field_k[this.field_g].f(-16 + var2_int, var3 - 48);
                    return;
                  }
                  if (9 == this.field_h) {
                    var4 = 91 + this.field_j / 10 % 5;
                    if (this.field_m < 0) {
                      var4 = 59;
                    }
                    if (0 < this.field_m) {
                      var4 = 60;
                    }
                    if (this.field_m > 10) {
                      var4 = 61;
                    }
                    if (0 <= this.field_i) {
                      a.field_a[var4].f(var2_int, var3);
                      return;
                    }
                    a.field_a[var4].h(var2_int, var3);
                    return;
                  }
                  if (21 == this.field_h) {
                    stackIn_51_0 = (!je.c(this.field_n, this.field_p, 1, 1)) ? 0 : 1;
                    var4Lifetime1 = stackIn_51_0;
                    if (var4Lifetime1 == 0) {
                      stackIn_55_0 = fi.field_b[0];
                    } else {
                      stackIn_55_0 = fi.field_b[1];
                    }
                    var5_ref_ea = stackIn_55_0;
                    if (0 > this.field_i) {
                      var5_ref_ea.h(var2_int, -var5_ref_ea.field_A + (32 + var3));
                      return;
                    }
                    var5_ref_ea.f(var2_int, var3 + (32 - var5_ref_ea.field_A));
                    return;
                  }
                  if (this.field_h == 19) {
                    stackIn_81_0 = (!je.c(this.field_n, this.field_p, 1, 1)) ? 0 : 1;
                    var4Lifetime2 = stackIn_81_0;
                    var5 = (this.field_c & 63) / 16;
                    if (this.field_i == 0) {
                      var5 = 0;
                    }
                    if (var4Lifetime2 != 0) {
                      stackIn_87_0 = ph.field_e[var5 + 4];
                    } else {
                      stackIn_87_0 = ph.field_e[var5 + 0];
                    }
                    var6 = stackIn_87_0;
                    if (this.field_i < 0) {
                      var6.h(var2_int, -var6.field_A + 32 + var3);
                      return;
                    }
                    var6.f(var2_int, 32 + (var3 - var6.field_A));
                    return;
                  }
                  if (10 != this.field_h) {
                    if (12 <= this.field_h &&
                      this.field_h < 16) {
                      var4Lifetime3 = q.field_b[this.field_n][this.field_p].field_i;
                      if (0 > var4Lifetime3) {
                        var4Lifetime3 = 0;
                      }
                      if (var4Lifetime3 > 255) {
                        var4Lifetime3 = 255;
                      }
                      a.field_a[-12 + (this.field_h + 37)].c(var2_int, var3, var4Lifetime3);
                      return;
                    }
                  } else {
                    if (q.field_b[this.field_n][this.field_p].field_i == 0) {
                      if (this.field_g != 1 &&
                        this.field_b / 25 % 2 != 0) {
                        return;
                      }
                      if (!q.field_b[this.field_n][this.field_p].field_V) {
                        a.field_a[62].f(var2_int, var3);
                        return;
                      }
                    }
                  }
                }
                return;
              }
              if (0 != this.field_g) {
                te.field_d[4 + this.field_g].f(-16 + var2_int, var3);
              } else {
                if (this.field_b < 250) {
                  ne.field_O[this.field_b * 5 / 250].f(var2_int, var3);
                } else {
                  ne.field_O[4].f(var2_int, var3);
                }
              }
            } else {
              if (this.field_g != 0) {
                te.field_d[4 + this.field_g].f(-16 + var2_int, var3);
              } else {
                if (!je.c(this.field_n, this.field_p, 3, 3)) {
                  if (this.field_b >= 240) {
                    te.field_d[1].f(-16 + var2_int, var3);
                  } else {
                    te.field_d[0].f(-16 + var2_int, var3);
                    te.field_d[this.field_b / 10 % 3 + 2].f(-16 + var2_int - 3 * this.field_b / 250, this.field_b * 3 / 250 + var3);
                  }
                } else {
                  te.field_d[0].c(var2_int - 16, var3, 128);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.F(" + param0 + ')');
        }
    }

    final boolean a(boolean param0) {
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_10_0 = (this.field_h == 9) || (19 == this.field_h) || (this.field_h == 21);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.A(" + param0 + ')');
        }
    }

    private final boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 92) {
            this.field_f = -74;
          }
          stackIn_6_0 = !(this.field_h >= 6);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.I(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          this.field_j = this.field_j + 1;
          if (this.field_j > 100) {
            this.field_j = this.field_j - 100;
          }
          if (je.c(this.field_n, this.field_p, 1, 1)) {
            if (q.field_b[this.field_n][this.field_p + 1].g()) {
              this.field_m = this.field_m - 40;
            } else {
              this.field_m = this.field_m - 20;
            }
          }
          if (q.field_b[1 + this.field_n][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 250) {
              if (100.0 * Math.random() < 50.0) {
                stackIn_14_0 = 1;
                if (q.field_b[1 + this.field_n][1 + this.field_p].field_b) {
                  stackIn_15_1 = 0;
                } else {
                  stackIn_15_1 = 1;
                }
                if (stackIn_14_0 == stackIn_15_1) {
                  q.field_b[this.field_n + 1][1 + this.field_p].field_a = false;
                  uf.field_p[jf.b((byte) 97)] = new gf(this.field_n + 1, this.field_p + 1, 8);
                }
              }
              if (100.0 * Math.random() < 50.0 &&
                !q.field_b[1 + this.field_n][this.field_p - 1].field_b) {
                q.field_b[1 + this.field_n][-1 + this.field_p].field_a = false;
                uf.field_p[jf.b((byte) 59)] = new gf(this.field_n + 1, this.field_p - 1, 8);
              }
              if (100.0 * Math.random() < 50.0 &&
                this.field_n < 30) {
                stackIn_29_0 = 0;
                if (q.field_b[this.field_n + 1][this.field_p].field_b) {
                  stackIn_30_1 = 0;
                } else {
                  stackIn_30_1 = 1;
                }
                if (stackIn_29_0 == stackIn_30_1) {
                  this.field_m = -40;
                } else {
                  q.field_b[1 + this.field_n][this.field_p].field_a = false;
                  uf.field_p[jf.b((byte) 95)] = new gf(this.field_n + 1, this.field_p, 8);
                }
              }
            }
          }
          if (q.field_b[this.field_n - 1][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 250) {
              if (50.0 > 100.0 * Math.random() &&
                !q.field_b[-1 + this.field_n][this.field_p + 1].field_b) {
                q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                uf.field_p[jf.b((byte) 114)] = new gf(this.field_n + 1, this.field_p + 1, 8);
              }
              if (50.0 > Math.random() * 100.0 &&
                !q.field_b[this.field_n - 1][this.field_p - 1].field_b) {
                q.field_b[this.field_n - 1][this.field_p - 1].field_a = false;
                uf.field_p[jf.b((byte) 76)] = new gf(1 + this.field_n, this.field_p - 1, 8);
              }
              if (50.0 > 100.0 * Math.random() &&
                this.field_n > 1) {
                if (q.field_b[this.field_n - 1][this.field_p].field_b) {
                  this.field_m = -40;
                } else {
                  q.field_b[-1 + this.field_n][this.field_p].field_a = false;
                  uf.field_p[jf.b((byte) 64)] = new gf(this.field_n - 1, this.field_p, 8);
                }
              }
            }
          }
          if (this.field_b > 250) {
            if (!q.field_b[this.field_n][this.field_p + 1].field_a) {
              if (this.field_k > 20) {
                this.field_k = this.field_k - 10;
              } else {
                if (this.field_k < -20) {
                  this.field_k = this.field_k + 10;
                }
              }
            }
            this.field_b = this.field_b - 250;
          }
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          if (600 < fieldTemp$0 &&
            q.field_b[this.field_n][this.field_p].field_i < 120) {
            var3_int = 0;
            var4 = 0;
            L14: while (true) {
              if (var4 < uf.field_p.length) {
                if (null != uf.field_p[var4] &&
                  uf.field_p[var4].field_h == 10) {
                  var5 = -this.field_n + uf.field_p[var4].field_n;
                  var6 = uf.field_p[var4].field_p - this.field_p;
                  if (var5 * var5 + var6 * var6 < 36) {
                    uf.field_p[var4].field_n = this.field_n;
                    uf.field_p[var4].field_p = this.field_p;
                    var3_int = 1;
                    break L14;
                  }
                }
                var4++;
                continue;
              }
              break;
            }
            if (var3_int == 0) {
              uf.field_p[jf.b((byte) 117)] = new gf(this.field_n, this.field_p, 10);
            }
            this.field_o = 0;
          }
          if (q.field_b[this.field_n][this.field_p].field_i > 120) {
            if (ca.field_k > this.field_n &&
              this.field_i < 40) {
              this.field_i = this.field_i + 2;
            }
            if (hf.field_t < this.field_p &&
              param1) {
              this.field_m = -40;
            }
            if (this.field_n > ca.field_k &&
              this.field_i > -40) {
              this.field_i = this.field_i - 2;
            }
            if (sc.field_b &&
              q.field_b[this.field_n][this.field_p].field_V) {
              ag.a(true, 1, 32 * this.field_p, 32 * this.field_n);
            }
            if (ca.field_k == this.field_n &&
              this.field_p == hf.field_t &&
              !il.e(param0 ^ -10296)) {
              rj.a((byte) -38, 7);
            }
          } else {
            if (this.field_g != 0) {
              if (-10 < this.field_i) {
                this.field_i = this.field_i - 2;
              }
              if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
                this.field_g = 0;
              }
            } else {
              if (10 > this.field_i) {
                this.field_i = this.field_i + 2;
              }
              if (q.field_b[1 + this.field_n][this.field_p].field_a) {
                this.field_g = 1;
              }
            }
          }
          if (param0 != 21161) {
            return;
          }
          if (!q.field_b[this.field_n][this.field_p].field_a &&
            !je.field_O.b(this.field_n, this.field_p, (byte) 50)) {
            if (!(je.e(this.field_n, this.field_p, 1, 1) <= 0)) {
              this.field_b = 0;
              this.field_h = 8;
              this.field_g = 0;
            }
          } else {
            this.field_b = 250;
            this.field_h = 16;
            this.field_g = 0;
          }
          if (this.field_m < -40) {
            this.field_m = -40;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "gf.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_23_1 = false;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_129_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var11 = MinerDisturbance.field_ab;
        try {
          this.field_c = this.field_c + 1;
          if (sc.field_b &&
            q.field_b[this.field_n][this.field_p].field_V) {
            ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
          }
          stackIn_10_0 = (120 >= q.field_b[this.field_n][this.field_p].field_i) ? 0 : 1;
          var2_int = stackIn_10_0;
          if (this.field_l > 32) {
            if (var2_int != 0 &&
              !this.field_e) {
              ne.a(44, 58);
            } else {
              if (var2_int == 0 &&
                this.field_e) {
                ne.a(45, 69);
              }
            }
            this.field_l = 0;
          }
          stackIn_23_1 = (var2_int != 0);
          this.field_e = stackIn_23_1;
          if (var2_int != 0) {
            stackIn_29_0 = (this.field_p < hf.field_t) ? 1 : 0;
          } else {
            stackIn_29_0 = 0;
          }
          var3 = stackIn_29_0;
          if (q.field_b[this.field_n + 1][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 150 &&
              50.0 > Math.random() * 100.0 &&
              this.field_n < 30 &&
              !q.field_b[1 + this.field_n][this.field_p].field_b) {
              q.field_b[1 + this.field_n][this.field_p].field_a = false;
              uf.field_p[jf.b((byte) 71)] = new gf(this.field_n + 1, this.field_p, 8);
            }
          } else {
            if (var3 != 0 &&
              q.field_b[this.field_n + 1][1 + this.field_p].field_a) {
              this.field_b = this.field_b + 1;
              if (150 < this.field_b &&
                50.0 > Math.random() * 100.0 &&
                this.field_n < 30) {
                stackIn_40_0 = 1;
                if (q.field_b[this.field_n + 1][1 + this.field_p].field_b) {
                  stackIn_41_1 = 0;
                } else {
                  stackIn_41_1 = 1;
                }
                if (stackIn_40_0 == stackIn_41_1) {
                  q.field_b[1 + this.field_n][this.field_p + 1].field_a = false;
                  uf.field_p[jf.b((byte) 95)] = new gf(this.field_n + 1, this.field_p + 1, 8);
                }
              }
            }
          }
          if (q.field_b[-1 + this.field_n][this.field_p].field_a) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 150 &&
              50.0 > Math.random() * 100.0 &&
              this.field_n > 1 &&
              !q.field_b[-1 + this.field_n][this.field_p].field_b) {
              q.field_b[-1 + this.field_n][this.field_p].field_a = false;
              uf.field_p[jf.b((byte) 63)] = new gf(this.field_n - 1, this.field_p, 8);
            }
          } else {
            if (var3 != 0 &&
              q.field_b[this.field_n - 1][this.field_p + 1].field_a) {
              this.field_b = this.field_b + 1;
              if (150 < this.field_b &&
                50.0 > Math.random() * 100.0 &&
                this.field_n < 30 &&
                !q.field_b[this.field_n - 1][1 + this.field_p].field_b) {
                q.field_b[this.field_n - 1][1 + this.field_p].field_a = false;
                uf.field_p[jf.b((byte) 111)] = new gf(-1 + this.field_n, 1 + this.field_p, 8);
              }
            }
          }
          if (this.field_b > 150) {
            if (!q.field_b[this.field_n][this.field_p + 1].field_a) {
              if (this.field_k > 20) {
                this.field_k = this.field_k - 10;
              } else {
                if (this.field_k < -20) {
                  this.field_k = this.field_k + 10;
                }
              }
            }
            this.field_b = this.field_b - 150;
          }
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          if (fieldTemp$0 > 600 &&
            q.field_b[this.field_n][this.field_p].field_i < 120) {
            var4 = 0;
            var5 = 0;
            L14: while (true) {
              if (var5 < uf.field_p.length) {
                if (null != uf.field_p[var5] &&
                  10 == uf.field_p[var5].field_h) {
                  var6 = uf.field_p[var5].field_n - this.field_n;
                  var7 = uf.field_p[var5].field_p - this.field_p;
                  if (var6 * var6 + var7 * var7 < 36) {
                    uf.field_p[var5].field_n = this.field_n;
                    var4 = 1;
                    uf.field_p[var5].field_p = this.field_p;
                    break L14;
                  }
                }
                var5++;
                continue;
              }
              break;
            }
            if (var4 == 0) {
              uf.field_p[jf.b((byte) 93)] = new gf(this.field_n, this.field_p, 10);
            }
            this.field_o = 0;
          }
          var4Lifetime1 = 40;
          var5Lifetime1 = 2;
          stackIn_106_0 = (!je.c(this.field_n, this.field_p, 1, 2)) ? 0 : 1;
          var6Lifetime1 = stackIn_106_0;
          if (var6Lifetime1 == 0) {
            var4Lifetime1 = 6;
          }
          stackIn_113_0 = (!je.c(this.field_n, this.field_p - 1, 1, 1)) ? 0 : 1;
          var7Lifetime1 = stackIn_113_0;
          if (!param0) {
            return;
          }
          if (var2_int == 0) {
            if (0 == this.field_g) {
              if (this.field_i < 10) {
                this.field_i = this.field_i + var5Lifetime1;
              }
              if (q.field_b[this.field_n + 1][this.field_p].field_a ||
                q.field_b[1 + this.field_n][this.field_p].field_b) {
                this.field_g = 1;
              }
            } else {
              if (-10 < this.field_i) {
                this.field_i = this.field_i - var5Lifetime1;
              }
              if (q.field_b[-1 + this.field_n][this.field_p].field_a ||
                q.field_b[this.field_n - 1][this.field_p].field_b) {
                this.field_g = 0;
              }
            }
            if (var6Lifetime1 != 0) {
              var8 = Math.sin((double)(100 * this.field_c));
              if (0.0 < var8) {
                if (-var4Lifetime1 < this.field_m) {
                  this.field_m = this.field_m - 1;
                }
                if (var7Lifetime1 == 0) {
                  this.field_m = 0;
                }
              } else {
                if (var4Lifetime1 > this.field_m) {
                  this.field_m = this.field_m + 1;
                }
              }
            }
          } else {
            if (-1 + this.field_p > hf.field_t &&
              var6Lifetime1 == 0) {
              stackIn_121_0 = 1;
            } else {
              stackIn_121_0 = 0;
            }
            var8_int = stackIn_121_0;
            stackIn_125_0 = (3 <= Math.abs(ca.field_k - this.field_n)) ? 0 : 1;
            var9 = stackIn_125_0;
            stackIn_129_0 = (Math.abs(ca.field_k - this.field_n) < 5) ? 0 : 1;
            var10 = stackIn_129_0;
            if (ca.field_k > this.field_n &&
              this.field_i < var4Lifetime1) {
              if (var8_int == 0) {
                this.field_i = this.field_i + var5Lifetime1;
              } else {
                if (var9 != 0) {
                  this.field_i = this.field_i - var5Lifetime1;
                }
              }
            }
            if (this.field_n > ca.field_k &&
              this.field_i > -var4Lifetime1) {
              if (var8_int != 0) {
                if (var9 != 0) {
                  this.field_i = this.field_i + var5Lifetime1;
                }
              } else {
                this.field_i = this.field_i - var5Lifetime1;
              }
            }
            if (var8_int != 0 &&
              this.field_i == 0) {
              if (var10 != 0) {
                if (this.field_n > ca.field_k &&
                  -var4Lifetime1 < this.field_i) {
                  this.field_i = this.field_i - var5Lifetime1;
                }
                if (ca.field_k > this.field_n &&
                  this.field_i < var4Lifetime1) {
                  this.field_i = this.field_i + var5Lifetime1;
                }
              }
              if (var9 != 0) {
                if (ca.field_k < this.field_n &&
                  this.field_i < var4Lifetime1) {
                  this.field_i = this.field_i + var5Lifetime1;
                }
                if (this.field_n < ca.field_k &&
                  -var4Lifetime1 < this.field_i) {
                  this.field_i = this.field_i - var5Lifetime1;
                }
              }
            }
            if (-var4Lifetime1 > this.field_i) {
              this.field_i = -var4Lifetime1;
            }
            if (var4Lifetime1 < this.field_i) {
              this.field_i = var4Lifetime1;
            }
            if (hf.field_t < this.field_p &&
              var6Lifetime1 != 0 &&
              this.field_m > -var4Lifetime1) {
              this.field_m = this.field_m - 1;
              if (var7Lifetime1 == 0) {
                if (-hf.field_t + this.field_p <= 2 &&
                  Math.abs(ca.field_k - this.field_n) <= 3) {
                  this.field_m = 3 * -var4Lifetime1 / 2;
                } else {
                  this.field_m = 0;
                }
              }
            }
            if (this.field_m < -var4Lifetime1 * 4) {
              this.field_m = 4 * -var4Lifetime1;
            }
            if (hf.field_t > this.field_p &&
              var6Lifetime1 != 0 &&
              var4Lifetime1 > this.field_m) {
              this.field_m = this.field_m + 1;
            }
            if (sc.field_b &&
              q.field_b[this.field_n][this.field_p].field_V) {
              ag.a(true, 32, this.field_p * 32, 32 * this.field_n);
            }
            if (this.field_n == ca.field_k &&
              hf.field_t == this.field_p &&
              !il.e(-31391)) {
              rj.a((byte) -38, 10);
            }
          }
          if (!q.field_b[this.field_n][this.field_p].field_a &&
            !je.field_O.b(this.field_n, this.field_p, (byte) 120)) {
            return;
          }
          hn.field_c = true;
          this.field_h = 16;
          this.field_b = 250;
          this.field_g = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -90) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gf.E(" + param0 + ')');
        }
    }

    final gf d(boolean param0) {
        boolean discarded$0 = false;
        gf stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        int stackIn_196_0 = 0;
        Object stackIn_220_0 = null;
        Object stackIn_225_0 = null;
        int stackIn_246_0 = 0;
        boolean stackIn_257_1 = false;
        int stackIn_260_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_271_0 = 0;
        int stackIn_275_0 = 0;
        Object stackIn_320_0 = null;
        Object stackIn_354_0 = null;
        Object stackIn_377_0 = null;
        je stackIn_513_0 = null;
        boolean stackIn_514_1 = false;
        Object stackIn_620_0 = null;
        Object stackIn_650_0 = null;
        gf stackIn_675_0 = null;
        boolean stackIn_676_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gf var8_ref_gf = null;
        int var9 = 0;
        je var9_ref_je = null;
        int var10 = 0;
        double var11_double = 0.0;
        int var11_int = 0;
        je var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        int var4Lifetime8;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11_intLifetime1;
        int var5Lifetime8;
        int var4Lifetime1Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime7Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime6Lifetime1;
        int var6Lifetime2Lifetime1;
        int var7Lifetime2Lifetime1;
        int var7Lifetime6Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        var16 = MinerDisturbance.field_ab;
        try {
          if (this.field_n < 1) {
            return null;
          }
          if (31 <= this.field_n) {
            return null;
          }
          if (this.field_p < 1) {
            return null;
          }
          if (je.field_t - 1 <= this.field_p) {
            return null;
          }
          this.field_l = this.field_l + 1;
          this.field_c = this.field_c + 1;
          var2_int = 0;
          if (8 == this.field_h) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 5) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (3 < this.field_g) {
                return null;
              }
            }
          }
          if (this.field_h == 11) {
            this.field_b = 0;
            var3 = 0;
            {
              while ((var3 == 0)) {
                this.field_n = this.field_n + this.field_i;
                this.field_b = this.field_b + 1;
                if (this.field_n <= 0 ||
                  this.field_n >= 31) {
                  var3 = 1;
                }
                if (je.field_I[this.field_n][this.field_p].field_a) {
                  var3 = 1;
                }
                if (this.field_b > 6) {
                  var3 = 1;
                }
                if (0 > this.field_g) {
                  continue;
                }
                for (var4 = 0; var4 < 1000; var4++) {
                  if (null != uf.field_p[var4]) {
                    stackIn_42_0 = uf.field_p[var4];
                    stackIn_43_1 = !(param0);
                    if (((gf) (Object) stackIn_42_0).a(stackIn_43_1) &&
                      uf.field_p[var4].field_n >= this.field_n - 1 &&
                      this.field_p - 1 <= uf.field_p[var4].field_p &&
                      uf.field_p[var4].field_n <= 1 + this.field_n &&
                      this.field_p + 1 >= uf.field_p[var4].field_p) {
                      var3 = 1;
                      if (uf.field_p[var4].field_h == 19) {
                        hn.field_c = true;
                      }
                      uf.field_p[var4].field_h = 6;
                      uf.field_p[var4].field_b = 250;
                    }
                  }
                }
              }
              {
                if (0 <= this.field_g) {
                  this.field_h = 6;
                  this.field_b = 250;
                } else {
                  this.field_b = 0;
                  this.field_h = 8;
                }
                this.field_g = 0;
              }
            }
          }
          if (this.field_f >= 0 &&
            this.field_m >= 0) {
            if (q.field_b[this.field_n][this.field_p + 1].g()) {
              var2_int = 1;
            }
            if (-80 > this.field_k &&
              q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
              var2_int = 1;
            }
            if (this.field_k > 80 &&
              q.field_b[this.field_n + 1][this.field_p + 1].g()) {
              var2_int = 1;
            }
          }
          var3Lifetime1 = ne.a(false);
          if ((this.a((byte) 122) ||
            this.field_h >= 12) && this.field_h < 15) {
            if (12 <= this.field_h &&
              15 != this.field_h &&
              !ni.a(13, 11764)) {
              var4Lifetime1 = -this.field_n + ca.field_k;
              var5 = -this.field_p + hf.field_t;
              if (var4Lifetime1 * var4Lifetime1 + var5 * var5 < 25) {
                ag.a(true, 13, 32 * this.field_p, this.field_n * 32);
              }
            }
            if (this.field_n == ca.field_k &&
              hf.field_t == this.field_p) {
              cl.field_I = 0;
              if (!this.a((byte) 125)) {
                qf.field_p = qf.field_p + 1;
                if (ke.field_V &&
                  qf.field_p == 5) {
                  fn.a(9, 246, 3);
                }
                this.field_h = 4;
                stackIn_196_0 = (cm.field_o != 1) ? 0 : 1;
                var4Lifetime1Lifetime1 = stackIn_196_0;
                for (var5Lifetime8 = 0; var5Lifetime8 < 21; var5Lifetime8++) {
                  if ((var4Lifetime1Lifetime1 != 0 ||
                    !fd.field_mb[var5Lifetime8]) && (var5Lifetime8 != 10 &&
                    12 != var5Lifetime8 &&
                    var5Lifetime8 != 13) && (var5Lifetime8 != 1 ||
                    qe.field_b[0]) && (var5Lifetime8 != 19 ||
                    qe.field_b[2]) && (var5Lifetime8 != 0 ||
                    !qe.field_b[1]) && (var5Lifetime8 != 2 ||
                    !qe.field_b[19]) && (!qe.field_b[var5Lifetime8] &&
                    100.0 * Math.random() < 25.0)) {
                    qe.field_b[var5Lifetime8] = true;
                    bf.field_d = 0;
                    ch.field_h = -var5Lifetime8 * 3 - 3;
                    pa.field_c = var5Lifetime8;
                    stackIn_220_0 = null;
                    return (gf) (stackIn_220_0);
                  }
                }
                return this;
              }
              if (ch.field_h >= -1) {
                ch.field_h = this.field_h;
              }
              var4Lifetime1Lifetime1 = 0;
              if (0 == this.field_h) {
                ne.a(12, 91);
                var4Lifetime1Lifetime1 = var3Lifetime1 * 100;
              }
              if (this.field_h == 1) {
                var4Lifetime1Lifetime1 = 250 * var3Lifetime1;
                ne.a(13, -124);
              }
              if (2 == this.field_h) {
                var4Lifetime1Lifetime1 = 500 * var3Lifetime1;
                ne.a(14, -77);
              }
              if (this.field_h == 3) {
                ne.a(15, 98);
                var4Lifetime1Lifetime1 = var3Lifetime1 * 750;
              }
              if (this.field_h == 4) {
                var4Lifetime1Lifetime1 = var3Lifetime1 * 2500;
                ne.a(16, -69);
              }
              if (this.field_h == 5) {
                ne.a(61, -69);
                var4Lifetime1Lifetime1 = var3Lifetime1 * 1000;
              }
              if (ke.field_V) {
                if (tc.field_s > 0) {
                  eb.field_b = eb.field_b + var4Lifetime1Lifetime1;
                  if (eb.field_b > 100000 &&
                    cm.field_o == 1) {
                    fn.a(19, 236, 3);
                  }
                }
                if (!hn.field_c) {
                  eb.field_e = eb.field_e + var4Lifetime1Lifetime1;
                  if (eb.field_e > 100000 &&
                    1 == cm.field_o) {
                    fn.a(21, 234, 3);
                  }
                }
                a.field_c = a.field_c + var4Lifetime1Lifetime1;
                if (6 == var3Lifetime1 ||
                  3 == var3Lifetime1 ||
                  var3Lifetime1 == 2 ||
                  1 == var3Lifetime1) {
                  var5Lifetime8 = var4Lifetime1Lifetime1;
                  var6 = rg.field_sb % 3;
                  if (var6 != 0) {
                    if (1 == var6) {
                      vh.field_g = vh.field_g - var5Lifetime8;
                    } else {
                      var7 = var5Lifetime8 / 3;
                      di.field_X = di.field_X + var7;
                      vh.field_g = vh.field_g - (var5Lifetime8 - var7);
                    }
                  } else {
                    di.field_X = di.field_X + var5Lifetime8;
                  }
                }
              }
              if (this.field_h >= 0 &&
                5 >= this.field_h) {
                if (ke.field_V) {
                  nm.field_g[this.field_h] = nm.field_g[this.field_h] + 1;
                }
                if (je.c(this.field_n, this.field_p, 1, 1)) {
                  vi.field_q = vi.field_q + 1;
                  if (vi.field_q == 25 &&
                    ke.field_V) {
                    fn.a(11, 244, 3);
                  }
                }
                if (ke.field_V &&
                  25 == nm.field_g[this.field_h] &&
                  0 == this.field_h) {
                  fn.a(4, 251, 3);
                }
                if (ke.field_V &&
                  nm.field_g[this.field_h] == 25 &&
                  this.field_h == 1) {
                  fn.a(5, 250, 3);
                }
                if (ke.field_V &&
                  nm.field_g[this.field_h] == 25 &&
                  this.field_h == 2) {
                  fn.a(6, 249, 3);
                }
                if (ke.field_V &&
                  nm.field_g[this.field_h] == 25 &&
                  3 == this.field_h) {
                  fn.a(7, 248, 3);
                }
                if (ke.field_V &&
                  nm.field_g[this.field_h] == 25 &&
                  this.field_h == 5) {
                  fn.a(18, 237, 3);
                }
                if (ke.field_V &&
                  10 == nm.field_g[this.field_h] &&
                  this.field_h == 4) {
                  fn.a(8, 247, 3);
                }
              }
              stackIn_225_0 = null;
              return (gf) (stackIn_225_0);
            }
          }
          if (!param0) {
            discarded$0 = this.a((byte) -116);
          }
          if (var2_int != 0) {
            if (this.field_i > 0) {
              this.field_i = this.field_i - 1;
            }
            if (this.field_i < 0) {
              this.field_i = this.field_i + 1;
            }
          }
          if (this.field_h == 9) {
            this.a(21161, var2_int != 0);
          } else {
            if (this.field_h == 19) {
              this.c(true);
            } else {
              if (this.field_h == 21) {
                var4Lifetime2 = (hf.field_t - this.field_p) * (hf.field_t - this.field_p) + (-this.field_n + ca.field_k) * (ca.field_k - this.field_n);
                if (120 < q.field_b[this.field_n][this.field_p].field_i) {
                  stackIn_246_0 = (25 > var4Lifetime2) ? 1 : 0;
                } else {
                  stackIn_246_0 = 0;
                }
                var5Lifetime1 = stackIn_246_0;
                if (this.field_l > 32) {
                  if (var5Lifetime1 != 0) {
                    ne.a(ll.a((byte) -73, 4) + 37, -96);
                  }
                  this.field_l = -10;
                }
                stackIn_257_1 = (var5Lifetime1 != 0);
                this.field_e = stackIn_257_1;
                var6Lifetime1 = 40;
                var7Lifetime1 = 4;
                stackIn_260_0 = (!je.c(this.field_n, this.field_p, 1, 2)) ? 0 : 1;
                var8 = stackIn_260_0;
                stackIn_263_0 = (!je.c(this.field_n, this.field_p - 1, 1, 1)) ? 0 : 1;
                var9 = stackIn_263_0;
                if (var8 == 0) {
                  var6Lifetime1 = 6;
                }
                if (var5Lifetime1 == 0) {
                  var10 = 4 * (this.field_k + 160) / 320 + (this.field_n << 2);
                  if (this.field_g != 0) {
                    if (!je.i(var10, this.field_p << 2)) {
                      if (-10 < this.field_i) {
                        this.field_i = this.field_i - var7Lifetime1;
                      }
                    } else {
                      this.field_g = 0;
                    }
                  } else {
                    if (je.i(var10, this.field_p << 2)) {
                      this.field_g = 1;
                    } else {
                      if (this.field_i < 10) {
                        this.field_i = this.field_i + var7Lifetime1;
                      }
                    }
                  }
                  if (var8 != 0) {
                    var11_double = Math.sin((double)(100 * this.field_c));
                    if (!(0.0 < var11_double)) {
                      if (this.field_m < var6Lifetime1) {
                        this.field_m = this.field_m + 1;
                      }
                    } else {
                      if (-var6Lifetime1 < this.field_m) {
                        this.field_m = this.field_m - 1;
                      }
                      if (var9 == 0) {
                        this.field_m = 0;
                      }
                    }
                  }
                } else {
                  if (-1 + this.field_p > hf.field_t &&
                    var8 == 0) {
                    stackIn_271_0 = 1;
                  } else {
                    stackIn_271_0 = 0;
                  }
                  var10 = stackIn_271_0;
                  stackIn_275_0 = (Math.abs(ca.field_k - this.field_n) > 4) ? 0 : 1;
                  var11_int = stackIn_275_0;
                  if (this.field_n < ca.field_k &&
                    this.field_i < var6Lifetime1 && (var10 != 0 ||
                    var11_int != 0)) {
                    this.field_i = this.field_i - var7Lifetime1;
                  }
                  if (ca.field_k < this.field_n &&
                    -var6Lifetime1 < this.field_i && (var10 != 0 ||
                    var11_int != 0)) {
                    this.field_i = this.field_i + var7Lifetime1;
                  }
                  if (this.field_i < -var6Lifetime1) {
                    this.field_i = -var6Lifetime1;
                  }
                  if (var6Lifetime1 < this.field_i) {
                    this.field_i = var6Lifetime1;
                  }
                  if (this.field_p > hf.field_t &&
                    var8 != 0 &&
                    this.field_m < var6Lifetime1) {
                    this.field_m = this.field_m + 1;
                  } else {
                    if (this.field_p < hf.field_t &&
                      var8 != 0 &&
                      this.field_m > -var6Lifetime1) {
                      this.field_m = this.field_m - 1;
                    }
                  }
                  if (-var6Lifetime1 * 4 > this.field_m) {
                    this.field_m = 4 * -var6Lifetime1;
                  }
                  if (ca.field_k == this.field_n &&
                    this.field_p == hf.field_t) {
                    fn.a(23, 232, 3);
                    var12 = 1000 * var3Lifetime1;
                    a.field_c = a.field_c + var12;
                    var13 = var12;
                    var14 = rg.field_sb % 3;
                    if (0 == var14) {
                      di.field_X = di.field_X + var13;
                    } else {
                      if (var14 == 1) {
                        vh.field_g = vh.field_g - var13;
                      } else {
                        var15 = var13 / 3;
                        vh.field_g = vh.field_g - (var13 - var15);
                        di.field_X = di.field_X + var15;
                      }
                    }
                    ne.a(ll.a((byte) -73, 4) + 37, 122);
                    stackIn_320_0 = null;
                    return (gf) (stackIn_320_0);
                  }
                }
                if (q.field_b[this.field_n][this.field_p].field_a) {
                  return null;
                }
                if (je.field_O.b(this.field_n, this.field_p, (byte) 15)) {
                  stackIn_354_0 = null;
                  return (gf) (stackIn_354_0);
                }
              }
            }
          }
          if (this.field_h == 17) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 250) {
              this.field_g = 0;
              this.field_h = 8;
              this.field_b = 0;
              if (sc.field_b) {
                ag.a(true, 11, this.field_p * 32, 32 * this.field_n);
              }
              return this;
            }
            if (this.field_g >= 1 &&
              this.field_b > 5) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (this.field_g > 5) {
                stackIn_377_0 = null;
                return (gf) (stackIn_377_0);
              }
            }
          }
          if (6 == this.field_h ||
            7 == this.field_h ||
            this.field_h == 16) {
            this.field_b = this.field_b + 1;
            if (je.c(this.field_n, this.field_p, 1, 3) && (this.field_h == 6 ||
              this.field_h == 17) && 250 < this.field_b) {
              this.field_g = 0;
              this.field_h = 8;
              this.field_b = 0;
              return this;
            }
            if (this.field_g == 0 &&
              this.field_h == 6 &&
              je.c(this.field_n, this.field_p, 3, 3) &&
              this.field_b < 250) {
              this.field_h = 17;
              for (var4Lifetime3 = 0; var4Lifetime3 < 1000; var4Lifetime3++) {
                if (null != uf.field_p[var4Lifetime3] &&
                  uf.field_p[var4Lifetime3] == this) {
                  ge.a(var4Lifetime3, (byte) 85, true);
                  break;
                }
              }
            }
            if (this.field_b < 250 &&
              je.field_O.b(this.field_n, this.field_p, (byte) 80)) {
              this.field_b = 251;
            }
            if (0 == this.field_g &&
              this.field_b > 250) {
              ne.a(8, -74);
              oe.field_b = true;
              if (this.field_h == 16) {
                this.field_h = 6;
              }
              lj.field_r = lj.field_r + 25;
              this.field_b = 0;
              this.field_g = 1;
              rg.field_sb = rg.field_sb - 40;
              for (var4Lifetime3Lifetime1 = 0; var4Lifetime3Lifetime1 < 1000; var4Lifetime3Lifetime1++) {
                if (null != uf.field_p[var4Lifetime3Lifetime1]) {
                  if (uf.field_p[var4Lifetime3Lifetime1].a(false)) {
                    if (-1 + this.field_n <= uf.field_p[var4Lifetime3Lifetime1].field_n &&
                      this.field_p - 1 <= uf.field_p[var4Lifetime3Lifetime1].field_p &&
                      uf.field_p[var4Lifetime3Lifetime1].field_n <= this.field_n + 1 &&
                      uf.field_p[var4Lifetime3Lifetime1].field_p <= this.field_p + 1) {
                      if (19 == uf.field_p[var4Lifetime3Lifetime1].field_h) {
                        hn.field_c = true;
                      }
                      uf.field_p[var4Lifetime3Lifetime1].field_h = 16;
                      uf.field_p[var4Lifetime3Lifetime1].field_b = 250;
                    }
                  } else {
                    if (7 == uf.field_p[var4Lifetime3Lifetime1].field_h) {
                      if (uf.field_p[var4Lifetime3Lifetime1].field_n >= this.field_n - 1 &&
                        uf.field_p[var4Lifetime3Lifetime1].field_p >= -1 + this.field_p &&
                        uf.field_p[var4Lifetime3Lifetime1].field_n <= this.field_n + 1 &&
                        this.field_p + 1 >= uf.field_p[var4Lifetime3Lifetime1].field_p) {
                        uf.field_p[var4Lifetime3Lifetime1].field_b = 250;
                        ge.a(var4Lifetime3Lifetime1, (byte) 85, false);
                      }
                    } else {
                      if (uf.field_p[var4Lifetime3Lifetime1].field_h == 6) {
                        if (uf.field_p[var4Lifetime3Lifetime1].field_n >= -1 + this.field_n &&
                          uf.field_p[var4Lifetime3Lifetime1].field_p >= this.field_p - 1 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_n <= this.field_n + 1 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_p <= this.field_p + 1) {
                          uf.field_p[var4Lifetime3Lifetime1].field_b = 250;
                          ge.a(var4Lifetime3Lifetime1, (byte) 85, true);
                        }
                      } else {
                        if (uf.field_p[var4Lifetime3Lifetime1].field_h == 17 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_n >= this.field_n - 1 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_p >= this.field_p - 1 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_n <= this.field_n + 1 &&
                          uf.field_p[var4Lifetime3Lifetime1].field_p <= 1 + this.field_p) {
                          uf.field_p[var4Lifetime3Lifetime1].field_h = 6;
                          uf.field_p[var4Lifetime3Lifetime1].field_b = 250;
                        }
                      }
                    }
                  }
                }
              }
              var4Lifetime3Lifetime1 = 1;
              if (an.field_d) {
                var4Lifetime3Lifetime1 = 2;
              }
              for (var5Lifetime2 = -var4Lifetime3Lifetime1 + this.field_n; var5Lifetime2 <= this.field_n + var4Lifetime3Lifetime1; var5Lifetime2++) {
                for (var6Lifetime2 = this.field_p - var4Lifetime3Lifetime1; var4Lifetime3Lifetime1 + this.field_p >= var6Lifetime2; var6Lifetime2++) {
                  if (~var5Lifetime2 == ~ca.field_k &&
                    hf.field_t == var6Lifetime2 &&
                    !il.e(-31391)) {
                    if (rf.a(13) &&
                      ca.c(-2302)) {
                      rj.a((byte) -38, 13);
                    } else {
                      rj.a((byte) -38, 5);
                    }
                  }
                  var7Lifetime2 = -16 + var5Lifetime2;
                  if (var7Lifetime2 < 0) {
                    var7Lifetime2 = -var7Lifetime2;
                  }
                  if (var6Lifetime2 > 0 &&
                    0 < var5Lifetime2 &&
                    var5Lifetime2 < 31 &&
                    -1 + je.field_t > var6Lifetime2 &&
                    var6Lifetime2 > var7Lifetime2 / 2) {
                    if (q.field_b[var5Lifetime2][var6Lifetime2].field_a) {
                      var8Lifetime1 = 1;
                      if (!q.field_b[var5Lifetime2][var6Lifetime2].field_b) {
                        if (q.field_b[var5Lifetime2][var6Lifetime2].field_S) {
                          q.field_b[var5Lifetime2][var6Lifetime2].field_a = false;
                        }
                      } else {
                        var8Lifetime1 = 0;
                        q.field_b[var5Lifetime2][var6Lifetime2].field_b = false;
                        if (q.field_b[var5Lifetime2][var6Lifetime2].field_U != -1) {
                          jc.field_H = jc.field_H + 1;
                        }
                      }
                      if (!q.field_b[var5Lifetime2][var6Lifetime2].field_E &&
                        !q.field_b[var5Lifetime2][var6Lifetime2].field_v) {
                        stackIn_513_0 = q.field_b[var5Lifetime2][var6Lifetime2];
                        stackIn_514_1 = (var8Lifetime1 != 0);
                        stackIn_513_0.field_S = stackIn_514_1;
                        q.field_b[var5Lifetime2][var6Lifetime2].field_r = 1000;
                      } else {
                        q.field_b[var5Lifetime2][var6Lifetime2].field_a = false;
                        q.field_b[var5Lifetime2][var6Lifetime2].field_E = false;
                        q.field_b[var5Lifetime2][var6Lifetime2].field_v = false;
                        je.field_O.h(var5Lifetime2, 4, var6Lifetime2);
                        if (sc.field_b) {
                          ag.a(param0, 25, 32 * var6Lifetime2, var5Lifetime2 * 32);
                        }
                      }
                    } else {
                      if (q.field_b[var5Lifetime2][var6Lifetime2].field_b) {
                        q.field_b[var5Lifetime2][var6Lifetime2].field_b = false;
                        if (q.field_b[var5Lifetime2][var6Lifetime2].field_U != -1) {
                          jc.field_H = jc.field_H + 1;
                        }
                      }
                    }
                  }
                }
              }
              var5Lifetime2Lifetime1 = -8 + 4 * this.field_n;
              if (var5Lifetime2Lifetime1 < 0) {
                var5Lifetime2Lifetime1 = 0;
              }
              var6Lifetime2Lifetime1 = 8 + (1 + this.field_n) * 4;
              if (var6Lifetime2Lifetime1 > 124) {
                var6Lifetime2Lifetime1 = 124;
              }
              var7Lifetime2Lifetime1 = -8 + 4 * this.field_p;
              var8Lifetime1Lifetime1 = 4 * this.field_p + 4 + 8;
              if (var7Lifetime2Lifetime1 < 0) {
                var7Lifetime2Lifetime1 = 0;
              }
              if (4 * je.field_t - 4 < var8Lifetime1Lifetime1) {
                var8Lifetime1Lifetime1 = 4 * (je.field_t - 1);
              }
              for (var9Lifetime1 = var5Lifetime2Lifetime1; var6Lifetime2Lifetime1 > var9Lifetime1; var9Lifetime1++) {
                for (var10Lifetime1 = var7Lifetime2Lifetime1; var10Lifetime1 < var8Lifetime1Lifetime1; var10Lifetime1++) {
                  if (je.field_O.i(-120, var9Lifetime1, var10Lifetime1) &&
                    !je.field_O.e(var9Lifetime1, var10Lifetime1, 2)) {
                    lj.field_r = lj.field_r + 25;
                    if ((3 & var9Lifetime1) == 1 &&
                      1 == (3 & var10Lifetime1)) {
                      rg.field_sb = rg.field_sb - 15;
                      var11_intLifetime1 = jf.b((byte) 114);
                      uf.field_p[var11_intLifetime1] = new gf(var9Lifetime1 / 4, var10Lifetime1 / 4, 16);
                      uf.field_p[var11_intLifetime1].field_g = 0;
                      uf.field_p[var11_intLifetime1].field_b = 244;
                    }
                    je.field_O.b(117, false, var9Lifetime1, var10Lifetime1);
                    je.field_O.a(-122, var10Lifetime1, 0, var9Lifetime1);
                  }
                }
              }
              if (1 == cm.field_o) {
                for (var9Lifetime1Lifetime1 = var5Lifetime2Lifetime1; var6Lifetime2Lifetime1 > var9Lifetime1Lifetime1; var9Lifetime1Lifetime1++) {
                  for (var10Lifetime1Lifetime1 = var7Lifetime2Lifetime1; var10Lifetime1Lifetime1 < var8Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                    if (!je.field_O.a(var9Lifetime1Lifetime1, var10Lifetime1Lifetime1, (byte) 61)) {
                      continue;
                    }
                    lj.field_r = lj.field_r + 10;
                    je.field_O.a(false, (byte) 63, var9Lifetime1Lifetime1 >> 2, var10Lifetime1Lifetime1 >> 2);
                    break;
                  }
                }
              }
            }
            if (this.field_g >= 1 &&
              this.field_b > 5) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (this.field_g > 5) {
                return null;
              }
            }
          }
          if (this.field_h == 15) {
            this.field_b = this.field_b + 1;
            if (this.field_g == 0 &&
              this.field_b > 250) {
              ne.a(8, 109);
              this.field_b = 0;
              this.field_g = 1;
              var4Lifetime4 = 2;
              for (var5Lifetime3 = this.field_n - var4Lifetime4; var5Lifetime3 <= var4Lifetime4 + this.field_n; var5Lifetime3++) {
                for (var6Lifetime3 = this.field_p - var4Lifetime4; var6Lifetime3 <= this.field_p + var4Lifetime4; var6Lifetime3++) {
                  var7Lifetime3 = -16 + var5Lifetime3;
                  if (var7Lifetime3 < 0) {
                    var7Lifetime3 = -var7Lifetime3;
                  }
                  if (var6Lifetime3 > 0 &&
                    var5Lifetime3 > 0 &&
                    31 > var5Lifetime3 &&
                    var6Lifetime3 < je.field_t - 1 &&
                    var6Lifetime3 > var7Lifetime3 / 2) {
                    je.field_O.h(var5Lifetime3, 4, var6Lifetime3);
                  }
                  q.field_b[var5Lifetime3][var6Lifetime3].field_b = false;
                  q.field_b[var5Lifetime3][var6Lifetime3].field_a = false;
                }
              }
            }
            if (this.field_g >= 1 &&
              this.field_b > 5) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (this.field_g > 5) {
                return null;
              }
            }
          }
          if (this.field_h == 18) {
            this.field_b = this.field_b + 1;
            if (0 == this.field_g &&
              this.field_b > 250) {
              ne.a(8, -115);
              this.field_g = 1;
              this.field_b = 0;
              var4Lifetime5 = 2;
              for (var5Lifetime4 = -var4Lifetime5 + this.field_n; var4Lifetime5 + this.field_n >= var5Lifetime4; var5Lifetime4++) {
                for (var6Lifetime4 = -var4Lifetime5 + this.field_p; var6Lifetime4 <= this.field_p + var4Lifetime5; var6Lifetime4++) {
                  var7Lifetime4 = var5Lifetime4 - 16;
                  if (var7Lifetime4 < 0) {
                    var7Lifetime4 = -var7Lifetime4;
                  }
                  if (0 < var6Lifetime4 &&
                    var5Lifetime4 > 0 &&
                    var5Lifetime4 < 31 &&
                    var6Lifetime4 < -1 + je.field_t &&
                    var7Lifetime4 / 2 < var6Lifetime4) {
                    je.field_O.c(var6Lifetime4, var5Lifetime4, (byte) -48);
                  }
                  q.field_b[var5Lifetime4][var6Lifetime4].field_b = false;
                  q.field_b[var5Lifetime4][var6Lifetime4].field_a = false;
                }
              }
            }
            if (this.field_g >= 1 &&
              5 < this.field_b) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (this.field_g > 5) {
                stackIn_620_0 = null;
                return (gf) (stackIn_620_0);
              }
            }
          }
          if (this.field_h == 22) {
            this.field_b = this.field_b + 1;
            if (this.field_g == 0 &&
              this.field_b > 250) {
              ne.a(8, 120);
              this.field_g = 1;
              this.field_b = 0;
              var4Lifetime6 = 2;
              for (var5Lifetime5 = -var4Lifetime6 + this.field_n; var5Lifetime5 <= var4Lifetime6 + this.field_n; var5Lifetime5++) {
                for (var6Lifetime5 = this.field_p - var4Lifetime6; this.field_p + var4Lifetime6 >= var6Lifetime5; var6Lifetime5++) {
                  var7Lifetime5 = var5Lifetime5 - 16;
                  if (var7Lifetime5 < 0) {
                    var7Lifetime5 = -var7Lifetime5;
                  }
                  if (var6Lifetime5 > 0 &&
                    0 < var5Lifetime5 &&
                    31 > var5Lifetime5 &&
                    je.field_t - 1 > var6Lifetime5 &&
                    var7Lifetime5 / 2 < var6Lifetime5) {
                    je.field_O.d(var6Lifetime5, var5Lifetime5, -5);
                  }
                  q.field_b[var5Lifetime5][var6Lifetime5].field_b = false;
                  q.field_b[var5Lifetime5][var6Lifetime5].field_a = false;
                }
              }
            }
            if (this.field_g >= 1 &&
              this.field_b > 5) {
              this.field_g = this.field_g + 1;
              this.field_b = 0;
              if (this.field_g > 5) {
                stackIn_650_0 = null;
                return (gf) (stackIn_650_0);
              }
            }
          }
          if (this.field_h == 20) {
            if (sc.field_b &&
              q.field_b[this.field_n][this.field_p].field_V) {
              ag.a(param0, 26, 32 * this.field_p, this.field_n * 32);
            }
            this.field_b = this.field_b + 1;
            if (this.field_g == 0 &&
              this.field_b > 250) {
              ne.a(33, -69);
              this.field_g = 1;
              this.field_b = 0;
              var4Lifetime7 = ca.field_k - this.field_n;
              var5Lifetime6 = -this.field_p + hf.field_t;
              if (var4Lifetime7 * var4Lifetime7 <= 1 &&
                1 >= var5Lifetime6 * var5Lifetime6 &&
                !il.e(-31391)) {
                rj.a((byte) -38, 9);
                q.field_b[ca.field_k][hf.field_t].field_a = true;
                q.field_b[ca.field_k][hf.field_t].field_E = true;
                q.field_b[ca.field_k][hf.field_t].field_q = -400;
              }
              var6Lifetime6 = 0;
              for (var7Lifetime6 = 0; var7Lifetime6 < 1000; var7Lifetime6++) {
                var8_ref_gf = uf.field_p[var7Lifetime6];
                if (null != var8_ref_gf) {
                  stackIn_675_0 = var8_ref_gf;
                  stackIn_676_1 = !(param0);
                  if (((gf) (Object) stackIn_675_0).a(stackIn_676_1)) {
                    var4Lifetime7Lifetime1 = var8_ref_gf.field_n - this.field_n;
                    if (var4Lifetime7Lifetime1 * var4Lifetime7Lifetime1 <= 1) {
                      var5Lifetime6Lifetime1 = var8_ref_gf.field_p - this.field_p;
                      if (var5Lifetime6Lifetime1 * var5Lifetime6Lifetime1 <= 1) {
                        var9_ref_je = mh.field_e[var8_ref_gf.field_n][var8_ref_gf.field_p];
                        if (19 == var8_ref_gf.field_h) {
                          hn.field_c = true;
                        }
                        var9_ref_je.field_a = true;
                        var9_ref_je.field_E = true;
                        uf.field_p[var7Lifetime6] = null;
                        re.field_d = re.field_d + 1;
                        var6Lifetime6++;
                      }
                    }
                  }
                }
              }
              if (3 <= var6Lifetime6) {
                fn.a(20, 235, 3);
              }
              for (var7Lifetime6Lifetime1 = -1 + this.field_n; 1 + this.field_n >= var7Lifetime6Lifetime1; var7Lifetime6Lifetime1++) {
                for (var8Lifetime2 = this.field_p - 1; var8Lifetime2 <= this.field_p + 1; var8Lifetime2++) {
                  var9Lifetime2 = var7Lifetime6Lifetime1 - 16;
                  if (0 > var9Lifetime2) {
                    var9Lifetime2 = -var9Lifetime2;
                  }
                  if (0 < var8Lifetime2 &&
                    0 < var7Lifetime6Lifetime1 &&
                    31 > var7Lifetime6Lifetime1 &&
                    var8Lifetime2 < je.field_t - 1 &&
                    var8Lifetime2 > var9Lifetime2 / 2) {
                    var10Lifetime2 = 0;
                    if (q.field_b[var7Lifetime6Lifetime1][var8Lifetime2].field_a) {
                      if (!q.field_b[var7Lifetime6Lifetime1][var8Lifetime2].field_E) {
                        re.field_d = re.field_d + 1;
                      }
                      q.field_b[var7Lifetime6Lifetime1][var8Lifetime2].field_E = true;
                      q.field_b[var7Lifetime6Lifetime1][var8Lifetime2].field_v = false;
                      q.field_b[var7Lifetime6Lifetime1][var8Lifetime2].field_q = -400;
                    } else {
                      if (je.field_O.a(var7Lifetime6Lifetime1, (byte) -87, var8Lifetime2)) {
                        je.field_O.b(122, var7Lifetime6Lifetime1, var8Lifetime2);
                        var10Lifetime2 = 1;
                      }
                      if (var10Lifetime2 != 0) {
                        var11 = mh.field_e[var7Lifetime6Lifetime1][var8Lifetime2];
                        var11.field_q = -400;
                        re.field_d = re.field_d + 1;
                        var11.field_E = true;
                        var11.field_a = true;
                      }
                    }
                  }
                }
              }
              if (!(re.field_d < 500)) {
                fn.a(28, 227, 3);
              }
            }
            if (1 <= this.field_g &&
              this.field_b > 5) {
              this.field_b = 0;
              this.field_g = this.field_g + 1;
              if (this.field_g > 5) {
                return null;
              }
            }
          }
          if (10 == this.field_h) {
            this.field_b = this.field_b + 1;
            if (this.field_b > 250) {
              this.field_b = (int)(200.0 * Math.random());
              this.field_g = this.field_g + 1;
            }
            if (3 == this.field_g) {
              this.field_g = 0;
            }
            if (sc.field_b &&
              q.field_b[this.field_n][this.field_p].field_i == 0) {
              var4Lifetime8 = ca.field_k - this.field_n;
              var5Lifetime7 = -this.field_p + hf.field_t;
              if (64 > var4Lifetime8 * var4Lifetime8 + var5Lifetime7 * var5Lifetime7) {
                ag.a(param0, 21, this.field_p * 32, this.field_n * 32);
              }
            }
          }
          if (this.field_h != 8 &&
            this.field_h != 10 &&
            19 != this.field_h &&
            21 != this.field_h) {
            if (!je.c(this.field_n, this.field_p, 1, 1)) {
              if (this.field_m < 40) {
                this.field_m = this.field_m + 1;
              }
            } else {
              if (this.field_m < (int)(Math.random() * 5.0 + 1.0)) {
                this.field_m = this.field_m + 1;
              }
              if (this.field_m > (int)(5.0 * Math.random() + 1.0)) {
                this.field_m = this.field_m - 1;
              }
              if (this.field_i < (int)(-2.0 + 5.0 * Math.random())) {
                this.field_i = this.field_i + 1;
              }
              if (this.field_i > (int)(-2.0 + Math.random() * 5.0)) {
                this.field_i = this.field_i - 1;
              }
            }
          } else if ((this.field_h == 19 ||
            this.field_h == 21) && (!je.c(this.field_n, this.field_p, 1, 1) &&
            this.field_m < 40)) {
            this.field_m = this.field_m + 1;
          }
          if (16 != this.field_h) {
            this.field_k = this.field_k + this.field_i;
            this.field_f = this.field_f + this.field_m;
            if (!(this.field_p <= -1 + je.field_t) ||
              0 < this.field_f &&
              q.field_b[this.field_n][1 + this.field_p].g()) {
              this.field_m = 0;
              this.field_f = 0;
            }
            if (this.field_f < 0 &&
              this.field_m < 0 &&
              q.field_b[this.field_n][-1 + this.field_p].g()) {
              this.field_m = 0;
              this.field_f = 0;
            }
            if (Math.abs(this.field_k) >= Math.abs(this.field_f)) {
              if (this.field_k > 80 &&
                this.field_f < 0 &&
                this.field_m <= 0 &&
                q.field_b[this.field_n + 1][-1 + this.field_p].g()) {
                this.field_m = 0;
                this.field_f = 0;
              }
              if (this.field_k < -80 &&
                this.field_f < 0 &&
                this.field_m <= 0 &&
                q.field_b[-1 + this.field_n][-1 + this.field_p].g()) {
                this.field_f = 0;
                this.field_m = 0;
              }
              if (this.field_k > 80 &&
                this.field_f > 0 &&
                this.field_m >= 0 &&
                q.field_b[this.field_n + 1][this.field_p + 1].g()) {
                this.field_m = 0;
                this.field_f = 0;
              }
              if (-80 > this.field_k &&
                0 < this.field_f &&
                this.field_m >= 0 &&
                q.field_b[-1 + this.field_n][this.field_p + 1].g()) {
                this.field_f = 0;
                this.field_m = 0;
              }
            } else {
              if (80 < this.field_k &&
                this.field_f < 0 &&
                0 <= this.field_i &&
                q.field_b[1 + this.field_n][-1 + this.field_p].g()) {
                this.field_k = 80;
                this.field_i = -this.field_i;
              }
              if (this.field_k < -80 &&
                this.field_f < 0 &&
                this.field_i <= 0 &&
                q.field_b[this.field_n - 1][-1 + this.field_p].g()) {
                this.field_i = -this.field_i;
                this.field_k = -80;
              }
              if (80 < this.field_k &&
                this.field_f > 0 &&
                this.field_i >= 0 &&
                q.field_b[1 + this.field_n][1 + this.field_p].g()) {
                this.field_k = 80;
                this.field_i = -this.field_i;
              }
              if (this.field_k < -80 &&
                this.field_f > 0 &&
                this.field_i <= 0 &&
                q.field_b[this.field_n - 1][1 + this.field_p].g()) {
                this.field_i = -this.field_i;
                this.field_k = -80;
              }
            }
            if (this.field_k > 40 &&
              q.field_b[this.field_n + 1][this.field_p].g()) {
              this.field_k = 40;
            }
            if (this.field_k < -40 &&
              q.field_b[-1 + this.field_n][this.field_p].g()) {
              this.field_k = -40;
            }
            if (this.field_k > 160) {
              this.field_k = this.field_k - 320;
              this.field_n = this.field_n + 1;
            }
            if (this.field_k < -160) {
              this.field_n = this.field_n - 1;
              this.field_k = this.field_k + 320;
            }
            if (this.field_f > 160) {
              this.field_f = this.field_f - 320;
              this.field_p = this.field_p + 1;
            }
            if (this.field_f < -160) {
              this.field_f = this.field_f + 320;
              this.field_p = this.field_p - 1;
            }
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gf.J(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 0L) {
            return;
          }
          if (param0 % 10L == 0L) {
            ng.a(-1L + param0, 1855635080);
            ng.a(1L, param1 + 1855645389);
          } else {
            ng.a(param0, 1855635080);
          }
          if (param1 != -10309) {
            field_a = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "gf.B(" + param0 + ',' + param1 + ')');
        }
    }

    gf(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_d = 0;
        try {
          this.field_i = 0;
          this.field_m = 0;
          this.field_k = 0;
          this.field_h = param2;
          this.field_n = param0;
          this.field_f = 0;
          this.field_b = 0;
          this.field_p = param1;
          this.field_o = 0;
          this.field_g = 0;
          if (param2 < 5) {
            this.field_i = (int)(Math.random() * 40.0 - 20.0);
            this.field_m = (int)(-25.0 + 20.0 * -Math.random());
          }
          if (this.a(false)) {
            this.field_i = 1;
            q.field_b[this.field_n][this.field_p].field_a = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "gf.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[11];
    }
}
