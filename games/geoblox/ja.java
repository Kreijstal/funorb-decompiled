/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends rc {
    int field_C;
    private int field_q;
    private int field_x;
    ja[] field_n;
    float field_o;
    boolean field_B;
    int field_L;
    float field_u;
    int field_r;
    tf field_K;
    int field_H;
    private int field_s;
    int field_M;
    int field_p;
    private int field_I;
    int field_z;
    boolean field_t;
    int field_m;
    int field_E;
    static tf field_A;
    dm field_J;
    int field_G;
    float field_F;
    float field_v;
    private int field_y;
    static d field_D;
    float field_w;
    int field_N;

    final void g(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Geoblox.field_C;
        var2 = this.field_o - 320.0f;
        var3 = this.field_v - 240.0f;
        var4 = (int)((double)var2 * Math.cos((double)el.field_o.field_J) - (double)var3 * Math.sin((double)el.field_o.field_J) + 320.0);
        if (param0 == -16096) {
          L0: {
            L1: {
              var5 = (int)(Math.sin((double)el.field_o.field_J) * (double)var2 + (double)var3 * Math.cos((double)el.field_o.field_J) + 240.0);
              if (this.field_z == 2) {
                break L1;
              } else {
                if (1 == this.field_z) {
                  break L1;
                } else {
                  vf.field_L.e();
                  vb.c();
                  this.field_J.c(-this.field_J.field_s + vf.field_L.field_s >> 215276737, vf.field_L.field_o + -this.field_J.field_o >> 930476833);
                  k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                  sh.field_y.a(param0 + 16351);
                  vf.field_L.a(vf.field_L.field_s << -24802045, vf.field_L.field_o << 1089501283, var4 << 1543501028, var5 << -2087203164, (int)(65535.0 * ((double)(-el.field_o.field_J + this.field_u) / 6.283185307179586)), 4096);
                  break L0;
                }
              }
            }
            if (1 == this.field_z) {
              vf.field_L.e();
              vb.c();
              this.field_J.b(-this.field_J.field_s + vf.field_L.field_s >> -1223154047, vf.field_L.field_o - this.field_J.field_o >> -1804143071, this.field_q);
              k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
              sh.field_y.a(param0 + 16351);
              vf.field_L.a(vf.field_L.field_s << -1881785341, vf.field_L.field_o << 794425251, var4 << 1750603908, var5 << -1690760316, (int)(65535.0 * ((double)(-el.field_o.field_J + this.field_u) / 6.283185307179586)), 4096);
              break L0;
            } else {
              this.field_J.b(-(this.field_J.field_s >> 2075460897) + var4, var5 + -(this.field_J.field_o >> 2079278081));
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void k(int param0) {
        vf.field_L.e();
        vb.c();
        this.field_J.a(this.field_J.field_s << 1057923171, this.field_J.field_o << -1595923197, vf.field_L.field_s << -694542845, vf.field_L.field_o << 1500789091, (int)(65535.0 * ((double)this.field_u / 6.283185307179586)), 4096);
        bk.field_a.e();
        vf.field_L.a(-(vf.field_L.field_s / 2) + (int)this.field_o, (int)this.field_v + -(vf.field_L.field_o / param0), this.field_H - -1);
        sh.field_y.a(255);
        bk.field_a.e();
        i.field_a.a(320 + el.field_o.field_w, 240 - -el.field_o.field_u, 16777215);
        sh.field_y.a(param0 + 253);
    }

    final void n(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          L1: {
            var11 = Geoblox.field_C;
            var2 = this.field_o - 320.0f;
            var3 = this.field_v - 240.0f;
            var4 = el.field_o.field_J;
            var5 = (int)(320.0 + ((double)var2 * Math.cos((double)var4) - Math.sin((double)var4) * (double)var3));
            var6 = (int)(240.0 + ((double)var2 * Math.sin((double)var4) + Math.cos((double)var4) * (double)var3));
            if (-2 == (this.field_z ^ -1)) {
              break L1;
            } else {
              if (2 == this.field_z) {
                break L1;
              } else {
                vf.field_L.e();
                vb.c();
                this.field_J.a(this.field_J.field_s << -575346205, this.field_J.field_o << 1794565923, vf.field_L.field_s << 776884707, vf.field_L.field_o << -188441693, (int)(((double)this.field_u - (double)var4 / 6.283185307179586) * 65535.0), 4096);
                break L0;
              }
            }
          }
          if (this.field_z != 1) {
            vf.field_L.e();
            vb.c();
            this.field_J.b(-(this.field_J.field_s >> -1792337183) + (vf.field_L.field_s >> 339525793), (vf.field_L.field_o >> -1789028991) - (this.field_J.field_o >> -1848667231));
            break L0;
          } else {
            wl.field_a.e();
            vb.c();
            this.field_J.b(-this.field_J.field_s + wl.field_a.field_s >> -1143695199, -this.field_J.field_o + wl.field_a.field_o >> -1986067391, this.field_q);
            vf.field_L.e();
            vb.c();
            wl.field_a.a(wl.field_a.field_s << 992968611, wl.field_a.field_o << 1388040003, vf.field_L.field_s << -967057565, vf.field_L.field_o << 1628733635, (int)(65535.0 * (-((double)var4 / 6.283185307179586) + (double)this.field_u)), 4096);
            break L0;
          }
        }
        L2: {
          var7 = 2 % ((-23 - param0) / 60);
          sh.field_y.a(255);
          var8 = var5 + -(vf.field_L.field_s >> -2050048063);
          var9 = var6 - (vf.field_L.field_o >> -2142432031);
          var10 = (int)(0.5 + Math.sin((double)(this.field_r + -this.field_p + this.field_p >> 1305235300)) * (double)(100 * (this.field_p - this.field_r)) / (double)this.field_p) - (-(100 * (this.field_p - this.field_r) / this.field_p) - 56);
          if (-257 > (var10 ^ -1)) {
            var10 = 256;
            break L2;
          } else {
            if (var10 >= 0) {
              break L2;
            } else {
              var10 = 0;
              break L2;
            }
          }
        }
        vf.field_L.d(var8, var9, var10);
    }

    final static void h(int param0) {
        af.field_c = 0;
        ul.field_a = null;
        gg.field_b = 0;
        g.field_j = 0;
        pa.field_g = 0;
        jf.field_j = 0;
        uf.field_b = param0;
        ha.field_g = 0;
        rj.field_c = 5167632;
        ka.field_h = 0;
        gi.field_e = 0;
        nd.field_a = 0;
        wa.field_a = 0;
    }

    public static void e(byte param0) {
        field_A = null;
        field_D = null;
        int var1 = 106 % ((33 - param0) / 39);
    }

    private final void m(int param0) {
        int var2 = -121 % ((-63 - param0) / 39);
        this.field_s = -(jg.field_h[c.field_ab][this.field_G] >> 1643839728 & 255) + (255 & jg.field_h[c.field_ab][(this.field_G + 1) % 7] >> 2056894992);
        this.field_x = -(jg.field_h[c.field_ab][this.field_G] >> -1693987608 & 255) + ((jg.field_h[c.field_ab][(1 + this.field_G) % 7] & 65448) >> -742490392);
        this.field_y = -(jg.field_h[c.field_ab][this.field_G] & 255) + (jg.field_h[c.field_ab][(1 + this.field_G) % 7] & 255);
    }

    final void f(int param0) {
        int incrementValue$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        L0: {
          var10 = Geoblox.field_C;
          var2 = (int)this.field_o - ((vf.field_L.field_s >> -659585983) - -4);
          var3 = -4 + -(vf.field_L.field_o >> -1594034399) + (int)this.field_v;
          var4 = 8 + vf.field_L.field_s;
          var5 = 8 + vf.field_L.field_o;
          if (-1 >= (var2 ^ -1)) {
            break L0;
          } else {
            var4 = var4 + var2;
            var2 = 0;
            break L0;
          }
        }
        L1: {
          if ((var3 ^ -1) <= -1) {
            break L1;
          } else {
            var5 = var5 + var3;
            var3 = 0;
            break L1;
          }
        }
        L2: {
          if (bk.field_a.field_r < var4 + var2) {
            var4 = -var2 + bk.field_a.field_r;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var5 + var3 > bk.field_a.field_m) {
            var5 = bk.field_a.field_m - var3;
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 >= 78) {
          var6 = var2 + bk.field_a.field_r * var3;
          var7 = -var4 + bk.field_a.field_r;
          var14 = bk.field_a.field_v;
          L4: while (true) {
            incrementValue$1 = var5;
            var5--;
            if (-1 <= (incrementValue$1 ^ -1)) {
              return;
            } else {
              var9 = -var4;
              L5: while (true) {
                if ((var9 ^ -1) <= -1) {
                  var6 = var6 + var7;
                  continue L4;
                } else {
                  if (var14[var6] == this.field_H - -1) {
                    var14[var6] = 0;
                    var6++;
                    var9++;
                    continue L5;
                  } else {
                    var6++;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(float param0, int param1) {
        float var3 = 0.0f;
        float var4 = 0.0f;
        double var5 = 0.0;
        L0: {
          if (param1 <= -79) {
            break L0;
          } else {
            this.a(0.2609390318393707f, 75);
            break L0;
          }
        }
        L1: {
          var3 = this.field_o - 320.0f;
          var4 = this.field_v - 240.0f;
          this.field_o = (float)((double)var3 * Math.cos((double)param0) - Math.sin((double)param0) * (double)var4) + 320.0f;
          this.field_v = (float)(Math.sin((double)param0) * (double)var3 + (double)var4 * Math.cos((double)param0)) + 240.0f;
          this.field_F = 240.0f - this.field_v;
          this.field_w = 320.0f - this.field_o;
          if (this.field_w * this.field_w + this.field_F * this.field_F <= og.field_r * og.field_r) {
            break L1;
          } else {
            var5 = (double)og.field_r / Math.sqrt((double)(this.field_w * this.field_w + this.field_F * this.field_F));
            this.field_w = (float)((double)this.field_w * var5);
            this.field_F = (float)((double)this.field_F * var5);
            break L1;
          }
        }
        L2: {
          if ((this.field_z ^ -1) != -3) {
            this.field_u = this.field_u - param0;
            break L2;
          } else {
            break L2;
          }
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 >= 83) {
            break L0;
          } else {
            this.g(18);
            break L0;
          }
        }
        L1: {
          if (0 == this.field_z) {
            this.field_J = ke.field_a[c.field_ab][this.field_C][this.field_M];
            break L1;
          } else {
            if (-5 == (this.field_z ^ -1)) {
              this.field_M = -1;
              this.field_J = fc.field_g[0];
              this.field_C = -1;
              break L1;
            } else {
              if (this.field_z == 3) {
                this.field_C = -1;
                this.field_M = -1;
                this.field_J = hb.field_d[0];
                break L1;
              } else {
                if (1 == this.field_z) {
                  this.field_J = s.field_G[c.field_ab][this.field_C];
                  this.field_M = -1;
                  this.field_q = jg.field_h[c.field_ab][this.field_G];
                  this.m(53);
                  break L1;
                } else {
                  if (2 != this.field_z) {
                    if (8 == this.field_z) {
                      this.field_J = ej.field_a[this.field_G];
                      this.field_C = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_J = ka.field_m[c.field_ab][this.field_M][this.field_G];
                    this.field_C = -1;
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final void h(byte param0) {
        vf.field_L.e();
        vb.c();
        this.field_J.a(this.field_J.field_s << 704850723, this.field_J.field_o << -2106424349, vf.field_L.field_s << -1535551901, vf.field_L.field_o << 2122077027, (int)((double)(this.field_u - el.field_o.field_J) / 6.283185307179586 * 65535.0), 4096);
        if (param0 <= 46) {
            this.field_y = 17;
        }
        vf.field_L.g(this.field_H - -1);
        wd.field_b.e();
        vf.field_L.a(-wd.field_a + -(vf.field_L.field_s >> 811012289) + ng.field_G, -(vf.field_L.field_o >> 2111671105) + (td.field_E + -wd.field_d), 1 + this.field_H);
        sh.field_y.a(255);
    }

    final void f(byte param0) {
        this.field_o = this.field_o + this.field_w;
        this.field_v = this.field_v + this.field_F;
        if (param0 != -59) {
            this.field_m = -29;
        }
    }

    private final void i(int param0) {
        this.field_K = null;
        this.field_I = 0;
        this.field_t = false;
        this.field_G = 0;
        this.g((byte) 99);
        this.field_B = false;
        this.field_E = 0;
        int var2 = 62 % ((param0 - 67) / 32);
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (!((param1 & 7) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        if (param0 != 1221916132) {
            return 89;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void b(boolean param0) {
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        float var2 = 0.0f;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          this.field_I = this.field_I + 1;
          this.field_r = this.field_r - 1;
          if (param0) {
            break L0;
          } else {
            this.field_v = -0.09870309382677078f;
            break L0;
          }
        }
        L1: {
          if ((this.field_z ^ -1) != -6) {
            if (this.field_z != 1) {
              if (this.field_z == 2) {
                if (this.field_I % 24 != 0) {
                  break L1;
                } else {
                  fieldTemp$7 = this.field_G;
                  this.field_G = this.field_G + 1;
                  this.field_J = ka.field_m[c.field_ab][this.field_M][fieldTemp$7];
                  this.field_G = this.field_G % 4;
                  break L1;
                }
              } else {
                if (8 != this.field_z) {
                  break L1;
                } else {
                  if (this.field_I % 24 == 0) {
                    fieldTemp$8 = this.field_G;
                    this.field_G = this.field_G + 1;
                    this.field_J = ej.field_a[fieldTemp$8];
                    this.field_G = this.field_G % 4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              var2 = 0.019999999552965164f * (float)(this.field_I % 50);
              this.field_q = (int)((float)this.field_y * var2) + jg.field_h[c.field_ab][this.field_G] + (((int)(var2 * (float)this.field_s) << 1248854992) + ((int)((float)this.field_x * var2) << 461902984));
              if (-50 != (this.field_I % 50 ^ -1)) {
                break L1;
              } else {
                this.field_G = this.field_G + 1;
                this.field_G = this.field_G % 7;
                this.m(-107);
                break L1;
              }
            }
          } else {
            if (this.field_I % 20 == 0) {
              fieldTemp$9 = this.field_G;
              this.field_G = this.field_G + 1;
              this.field_J = mi.field_B[fieldTemp$9];
              this.field_G = this.field_G % 4;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((this.field_z ^ -1) != -5) {
            if (7 != this.field_z) {
              if ((this.field_z ^ -1) != -4) {
                if (-7 == (this.field_z ^ -1)) {
                  this.field_r = this.field_r - 1;
                  if ((this.field_r ^ -1) <= -1) {
                    break L2;
                  } else {
                    if (-1 != (this.field_I % 24 ^ -1)) {
                      break L2;
                    } else {
                      if (4 > this.field_G) {
                        fieldTemp$10 = this.field_G;
                        this.field_G = this.field_G + 1;
                        this.field_J = vj.field_a[fieldTemp$10];
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                if ((this.field_I & 255 ^ -1) <= -50) {
                  this.field_G = 0;
                  break L2;
                } else {
                  if ((this.field_I & 15) == 0) {
                    fieldTemp$11 = this.field_G;
                    this.field_G = this.field_G + 1;
                    this.field_J = hb.field_d[fieldTemp$11];
                    if (-5 == (this.field_G ^ -1)) {
                      this.field_G = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              if (this.field_I % 20 == 0) {
                fieldTemp$12 = this.field_G;
                this.field_G = this.field_G + 1;
                this.field_J = hg.field_b[fieldTemp$12];
                this.field_G = this.field_G % 4;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            if ((255 & this.field_I) < 49) {
              if ((15 & this.field_I) != 0) {
                break L2;
              } else {
                fieldTemp$13 = this.field_G;
                this.field_G = this.field_G + 1;
                this.field_J = fc.field_g[fieldTemp$13];
                if ((this.field_G ^ -1) != -5) {
                  break L2;
                } else {
                  this.field_G = 0;
                  break L2;
                }
              }
            } else {
              this.field_G = 0;
              break L2;
            }
          }
        }
    }

    final void a(ja param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              L2: {
                if (var3_int >= this.field_L) {
                  break L2;
                } else {
                  if (this.field_n[var3_int] == param0) {
                    L3: {
                      this.field_n[var3_int] = null;
                      if (this.field_M == param0.field_M) {
                        this.field_m = this.field_m - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      this.field_L = this.field_L - 1;
                      if (param0.field_C == this.field_C) {
                        this.field_N = this.field_N - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (5 > var3_int) {
                        sf.a(this.field_n, 1 + var3_int, this.field_n, var3_int, this.field_L + -var3_int);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_n[this.field_L] = null;
                    break L2;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (this.field_m > this.field_L) {
                  break L6;
                } else {
                  if (this.field_L < this.field_N) {
                    break L6;
                  } else {
                    break L0;
                  }
                }
              }
              throw new IllegalStateException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("ja.HA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        int incrementValue$1 = 0;
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var18 = null;
        L0: {
          var14 = Geoblox.field_C;
          var2 = -320.0f + this.field_o;
          var3 = -240.0f + this.field_v;
          var4 = (int)(Math.cos((double)el.field_o.field_J) * (double)var2 - (double)var3 * Math.sin((double)el.field_o.field_J) + 320.0);
          var5 = (int)((double)var2 * Math.sin((double)el.field_o.field_J) + Math.cos((double)el.field_o.field_J) * (double)var3 + 240.0);
          var6 = -(vf.field_L.field_s / 2) + (var4 - 4 + -wd.field_a);
          var7 = -wd.field_d + -4 + (var5 - vf.field_L.field_o / 2);
          var8 = vf.field_L.field_s - -8;
          if (var6 < 0) {
            var8 = var8 + var6;
            var6 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var9 = 8 + vf.field_L.field_o;
          if (wd.field_b.field_r >= var6 + var8) {
            break L1;
          } else {
            var8 = -var6 + wd.field_b.field_r;
            break L1;
          }
        }
        L2: {
          if (var7 < 0) {
            var9 = var9 + var7;
            var7 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 + var9 <= wd.field_b.field_m) {
            break L3;
          } else {
            var9 = wd.field_b.field_m - var7;
            break L3;
          }
        }
        L4: {
          var10 = wd.field_b.field_r * var7 + var6;
          if (param0 == 30383) {
            break L4;
          } else {
            this.field_C = -47;
            break L4;
          }
        }
        var11 = -var8 + wd.field_b.field_r;
        var18 = wd.field_b.field_v;
        L5: while (true) {
          incrementValue$1 = var9;
          var9--;
          if (0 >= incrementValue$1) {
            return;
          } else {
            var13 = -var8;
            L6: while (true) {
              if (0 <= var13) {
                var10 = var10 + var11;
                continue L5;
              } else {
                if (this.field_H - -1 == var18[var10]) {
                  var18[var10] = 0;
                  var10++;
                  var13++;
                  continue L6;
                } else {
                  var10++;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 320) {
            this.field_u = -1.9950387477874756f;
        }
        if (!((this.field_z ^ -1) != -3)) {
            this.field_E = 60;
        }
        this.field_M = param2;
        this.field_z = param3;
        this.field_C = param1;
        this.g((byte) 84);
    }

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, float param8, int param9, float param10) {
        this.field_r = param5;
        this.field_p = param5;
        this.field_o = param1;
        this.field_C = param9;
        this.field_v = param7;
        this.field_M = param4;
        this.field_F = param8;
        this.field_z = param2;
        this.field_w = param3;
        double var12 = (double)og.field_r / Math.sqrt((double)(param3 * param3 + param8 * param8));
        this.field_w = (float)((double)this.field_w * var12);
        this.field_F = (float)((double)this.field_F * var12);
        int var14 = -96 / ((param0 - -19) / 53);
        this.field_u = 0.0f;
        this.field_N = 0;
        this.field_m = 0;
        this.field_L = 0;
        this.i(103);
    }

    final static void a(boolean param0, kl param1) {
        RuntimeException runtimeException = null;
        kl var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              qa.field_f.a(-74, new je(param1, param1));
              ge.field_d.a(param1);
              if (!param0) {
                break L1;
              } else {
                var3 = (kl) null;
                ja.a(false, (kl) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ja.FA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void e(int param0) {
        if (param0 != 1643839728) {
            this.field_H = -123;
        }
        if (this.field_z == 1) {
            vf.field_L.e();
            vb.c();
            this.field_J.b(vf.field_L.field_s + -this.field_J.field_s >> -936547679, -this.field_J.field_o + vf.field_L.field_o >> 1499284289, this.field_q);
            oc.field_d.e();
            vf.field_L.a(vf.field_L.field_s << 286727555, vf.field_L.field_o << 1802933699, (int)this.field_o << 1890832772, (int)this.field_v << -1798453980, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
        } else {
            oc.field_d.e();
            this.field_J.a(this.field_J.field_s << 110214051, this.field_J.field_o << 1713102179, (int)this.field_o << 1221916132, (int)this.field_v << 1904089668, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void l(int param0) {
        if (param0 != 1915952803) {
            ja var3 = (ja) null;
            this.a((ja) null, -128);
        }
        this.field_J.a(this.field_J.field_s << 1915952803, this.field_J.field_o << -752445533, (int)this.field_o << -1251278300, (int)this.field_v << 67106404, (int)((double)this.field_u / 6.283185307179586 * 65535.0), 4096);
    }

    ja(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        this.field_n = new ja[6];
        this.field_q = 0;
        this.field_L = 0;
        this.field_K = null;
        this.field_I = 0;
        this.field_m = 0;
        this.field_u = 0.0f;
        this.field_G = 0;
        this.field_N = 0;
        this.field_v = param4;
        this.field_H = param9;
        this.field_w = param5;
        this.field_M = param0;
        this.field_F = param6;
        this.field_C = param1;
        this.field_z = param2;
        this.field_o = param3;
        this.i(99);
    }

    static {
        field_A = new tf();
    }
}
