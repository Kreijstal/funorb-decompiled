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
        var2 = ((ja) this).field_o - 320.0f;
        var3 = ((ja) this).field_v - 240.0f;
        var4 = (int)((double)var2 * Math.cos((double)el.field_o.field_J) - (double)var3 * Math.sin((double)el.field_o.field_J) + 320.0);
        if (param0 == -16096) {
          L0: {
            L1: {
              var5 = (int)(Math.sin((double)el.field_o.field_J) * (double)var2 + (double)var3 * Math.cos((double)el.field_o.field_J) + 240.0);
              if (((ja) this).field_z == 2) {
                break L1;
              } else {
                if (1 == ((ja) this).field_z) {
                  break L1;
                } else {
                  vf.field_L.e();
                  vb.c();
                  ((ja) this).field_J.c(-((ja) this).field_J.field_s + vf.field_L.field_s >> 1, vf.field_L.field_o + -((ja) this).field_J.field_o >> 1);
                  k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                  sh.field_y.a(param0 + 16351);
                  vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, var4 << 4, var5 << 4, (int)(65535.0 * ((double)(-el.field_o.field_J + ((ja) this).field_u) / 6.283185307179586)), 4096);
                  break L0;
                }
              }
            }
            if (1 == ((ja) this).field_z) {
              vf.field_L.e();
              vb.c();
              ((ja) this).field_J.b(-((ja) this).field_J.field_s + vf.field_L.field_s >> 1, vf.field_L.field_o - ((ja) this).field_J.field_o >> 1, ((ja) this).field_q);
              k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
              sh.field_y.a(param0 + 16351);
              vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, var4 << 4, var5 << 4, (int)(65535.0 * ((double)(-el.field_o.field_J + ((ja) this).field_u) / 6.283185307179586)), 4096);
              break L0;
            } else {
              ((ja) this).field_J.b(-(((ja) this).field_J.field_s >> 1) + var4, var5 + -(((ja) this).field_J.field_o >> 1));
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
        ((ja) this).field_J.a(((ja) this).field_J.field_s << 3, ((ja) this).field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * ((double)((ja) this).field_u / 6.283185307179586)), 4096);
        bk.field_a.e();
        vf.field_L.a(-(vf.field_L.field_s / 2) + (int)((ja) this).field_o, (int)((ja) this).field_v + -(vf.field_L.field_o / param0), ((ja) this).field_H - -1);
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
            var2 = ((ja) this).field_o - 320.0f;
            var3 = ((ja) this).field_v - 240.0f;
            var4 = el.field_o.field_J;
            var5 = (int)(320.0 + ((double)var2 * Math.cos((double)var4) - Math.sin((double)var4) * (double)var3));
            var6 = (int)(240.0 + ((double)var2 * Math.sin((double)var4) + Math.cos((double)var4) * (double)var3));
            if (((ja) this).field_z == 1) {
              break L1;
            } else {
              if (2 == ((ja) this).field_z) {
                break L1;
              } else {
                vf.field_L.e();
                vb.c();
                ((ja) this).field_J.a(((ja) this).field_J.field_s << 3, ((ja) this).field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(((double)((ja) this).field_u - (double)var4 / 6.283185307179586) * 65535.0), 4096);
                break L0;
              }
            }
          }
          if (((ja) this).field_z != 1) {
            vf.field_L.e();
            vb.c();
            ((ja) this).field_J.b(-(((ja) this).field_J.field_s >> 1) + (vf.field_L.field_s >> 1), (vf.field_L.field_o >> 1) - (((ja) this).field_J.field_o >> 1));
            break L0;
          } else {
            wl.field_a.e();
            vb.c();
            ((ja) this).field_J.b(-((ja) this).field_J.field_s + wl.field_a.field_s >> 1, -((ja) this).field_J.field_o + wl.field_a.field_o >> 1, ((ja) this).field_q);
            vf.field_L.e();
            vb.c();
            wl.field_a.a(wl.field_a.field_s << 3, wl.field_a.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)(65535.0 * (-((double)var4 / 6.283185307179586) + (double)((ja) this).field_u)), 4096);
            break L0;
          }
        }
        L2: {
          var7 = 2 % ((-23 - param0) / 60);
          sh.field_y.a(255);
          var8 = var5 + -(vf.field_L.field_s >> 1);
          var9 = var6 - (vf.field_L.field_o >> 1);
          var10 = (int)(0.5 + Math.sin((double)(((ja) this).field_r + -((ja) this).field_p + ((ja) this).field_p >> 4)) * (double)(100 * (((ja) this).field_p - ((ja) this).field_r)) / (double)((ja) this).field_p) - (-(100 * (((ja) this).field_p - ((ja) this).field_r) / ((ja) this).field_p) - 56);
          if (var10 > 256) {
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

    final static void h() {
        af.field_c = 0;
        ul.field_a = null;
        gg.field_b = 0;
        g.field_j = 0;
        pa.field_g = 0;
        jf.field_j = 0;
        uf.field_b = 0;
        ha.field_g = 0;
        rj.field_c = 5167632;
        ka.field_h = 0;
        gi.field_e = 0;
        nd.field_a = 0;
        wa.field_a = 0;
    }

    public static void e() {
        field_A = null;
        field_D = null;
        int var1 = 0;
    }

    private final void m(int param0) {
        int var2 = -121 % ((-63 - param0) / 39);
        ((ja) this).field_s = -(jg.field_h[c.field_ab][((ja) this).field_G] >> 16 & 255) + (255 & jg.field_h[c.field_ab][(((ja) this).field_G + 1) % 7] >> 16);
        ((ja) this).field_x = -(jg.field_h[c.field_ab][((ja) this).field_G] >> 8 & 255) + ((jg.field_h[c.field_ab][(1 + ((ja) this).field_G) % 7] & 65448) >> 8);
        ((ja) this).field_y = -(jg.field_h[c.field_ab][((ja) this).field_G] & 255) + (jg.field_h[c.field_ab][(1 + ((ja) this).field_G) % 7] & 255);
    }

    final void f(int param0) {
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
          var2 = (int)((ja) this).field_o - ((vf.field_L.field_s >> 1) - -4);
          var3 = -4 + -(vf.field_L.field_o >> 1) + (int)((ja) this).field_v;
          var4 = 8 + vf.field_L.field_s;
          var5 = 8 + vf.field_L.field_o;
          if (var2 >= 0) {
            break L0;
          } else {
            var4 = var4 + var2;
            var2 = 0;
            break L0;
          }
        }
        L1: {
          if (var3 >= 0) {
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
            int incrementValue$1 = var5;
            var5--;
            if (incrementValue$1 <= 0) {
              return;
            } else {
              var9 = -var4;
              L5: while (true) {
                if (var9 >= 0) {
                  var6 = var6 + var7;
                  continue L4;
                } else {
                  if (var14[var6] == ((ja) this).field_H - -1) {
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
            ((ja) this).a(0.2609390318393707f, 75);
            break L0;
          }
        }
        L1: {
          var3 = ((ja) this).field_o - 320.0f;
          var4 = ((ja) this).field_v - 240.0f;
          ((ja) this).field_o = (float)((double)var3 * Math.cos((double)param0) - Math.sin((double)param0) * (double)var4) + 320.0f;
          ((ja) this).field_v = (float)(Math.sin((double)param0) * (double)var3 + (double)var4 * Math.cos((double)param0)) + 240.0f;
          ((ja) this).field_F = 240.0f - ((ja) this).field_v;
          ((ja) this).field_w = 320.0f - ((ja) this).field_o;
          if (((ja) this).field_w * ((ja) this).field_w + ((ja) this).field_F * ((ja) this).field_F <= og.field_r * og.field_r) {
            break L1;
          } else {
            var5 = (double)og.field_r / Math.sqrt((double)(((ja) this).field_w * ((ja) this).field_w + ((ja) this).field_F * ((ja) this).field_F));
            ((ja) this).field_w = (float)((double)((ja) this).field_w * var5);
            ((ja) this).field_F = (float)((double)((ja) this).field_F * var5);
            break L1;
          }
        }
        L2: {
          if (((ja) this).field_z != 2) {
            ((ja) this).field_u = ((ja) this).field_u - param0;
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
            ((ja) this).g(18);
            break L0;
          }
        }
        L1: {
          if (0 == ((ja) this).field_z) {
            ((ja) this).field_J = ke.field_a[c.field_ab][((ja) this).field_C][((ja) this).field_M];
            break L1;
          } else {
            if (((ja) this).field_z == 4) {
              ((ja) this).field_M = -1;
              ((ja) this).field_J = fc.field_g[0];
              ((ja) this).field_C = -1;
              break L1;
            } else {
              if (((ja) this).field_z == 3) {
                ((ja) this).field_C = -1;
                ((ja) this).field_M = -1;
                ((ja) this).field_J = hb.field_d[0];
                break L1;
              } else {
                if (1 == ((ja) this).field_z) {
                  ((ja) this).field_J = s.field_G[c.field_ab][((ja) this).field_C];
                  ((ja) this).field_M = -1;
                  ((ja) this).field_q = jg.field_h[c.field_ab][((ja) this).field_G];
                  this.m(53);
                  break L1;
                } else {
                  if (2 != ((ja) this).field_z) {
                    if (8 == ((ja) this).field_z) {
                      ((ja) this).field_J = ej.field_a[((ja) this).field_G];
                      ((ja) this).field_C = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((ja) this).field_J = ka.field_m[c.field_ab][((ja) this).field_M][((ja) this).field_G];
                    ((ja) this).field_C = -1;
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
        ((ja) this).field_J.a(((ja) this).field_J.field_s << 3, ((ja) this).field_J.field_o << 3, vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)((double)(((ja) this).field_u - el.field_o.field_J) / 6.283185307179586 * 65535.0), 4096);
        if (param0 <= 46) {
            ((ja) this).field_y = 17;
        }
        vf.field_L.g(((ja) this).field_H - -1);
        wd.field_b.e();
        vf.field_L.a(-wd.field_a + -(vf.field_L.field_s >> 1) + ng.field_G, -(vf.field_L.field_o >> 1) + (td.field_E + -wd.field_d), 1 + ((ja) this).field_H);
        sh.field_y.a(255);
    }

    final void f(byte param0) {
        ((ja) this).field_o = ((ja) this).field_o + ((ja) this).field_w;
        ((ja) this).field_v = ((ja) this).field_v + ((ja) this).field_F;
        if (param0 != -59) {
            ((ja) this).field_m = -29;
        }
    }

    private final void i(int param0) {
        ((ja) this).field_K = null;
        ((ja) this).field_I = 0;
        ((ja) this).field_t = false;
        ((ja) this).field_G = 0;
        this.g((byte) 99);
        ((ja) this).field_B = false;
        ((ja) this).field_E = 0;
        int var2 = 62 % ((param0 - 67) / 32);
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (!((param1 & 7) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void b(boolean param0) {
        float var2 = 0.0f;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          ((ja) this).field_I = ((ja) this).field_I + 1;
          ((ja) this).field_r = ((ja) this).field_r - 1;
          if (param0) {
            break L0;
          } else {
            ((ja) this).field_v = -0.09870309382677078f;
            break L0;
          }
        }
        L1: {
          if (((ja) this).field_z != 5) {
            if (((ja) this).field_z != 1) {
              if (((ja) this).field_z == 2) {
                if (((ja) this).field_I % 24 != 0) {
                  break L1;
                } else {
                  int fieldTemp$7 = ((ja) this).field_G;
                  ((ja) this).field_G = ((ja) this).field_G + 1;
                  ((ja) this).field_J = ka.field_m[c.field_ab][((ja) this).field_M][fieldTemp$7];
                  ((ja) this).field_G = ((ja) this).field_G % 4;
                  break L1;
                }
              } else {
                if (8 != ((ja) this).field_z) {
                  break L1;
                } else {
                  if (((ja) this).field_I % 24 == 0) {
                    int fieldTemp$8 = ((ja) this).field_G;
                    ((ja) this).field_G = ((ja) this).field_G + 1;
                    ((ja) this).field_J = ej.field_a[fieldTemp$8];
                    ((ja) this).field_G = ((ja) this).field_G % 4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              var2 = 0.019999999552965164f * (float)(((ja) this).field_I % 50);
              ((ja) this).field_q = (int)((float)((ja) this).field_y * var2) + jg.field_h[c.field_ab][((ja) this).field_G] + (((int)(var2 * (float)((ja) this).field_s) << 16) + ((int)((float)((ja) this).field_x * var2) << 8));
              if (((ja) this).field_I % 50 != 49) {
                break L1;
              } else {
                ((ja) this).field_G = ((ja) this).field_G + 1;
                ((ja) this).field_G = ((ja) this).field_G % 7;
                this.m(-107);
                break L1;
              }
            }
          } else {
            if (((ja) this).field_I % 20 == 0) {
              int fieldTemp$9 = ((ja) this).field_G;
              ((ja) this).field_G = ((ja) this).field_G + 1;
              ((ja) this).field_J = mi.field_B[fieldTemp$9];
              ((ja) this).field_G = ((ja) this).field_G % 4;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((ja) this).field_z != 4) {
            if (7 != ((ja) this).field_z) {
              if (((ja) this).field_z != 3) {
                if (((ja) this).field_z == 6) {
                  ((ja) this).field_r = ((ja) this).field_r - 1;
                  if (((ja) this).field_r >= 0) {
                    break L2;
                  } else {
                    if (((ja) this).field_I % 24 != 0) {
                      break L2;
                    } else {
                      if (4 > ((ja) this).field_G) {
                        int fieldTemp$10 = ((ja) this).field_G;
                        ((ja) this).field_G = ((ja) this).field_G + 1;
                        ((ja) this).field_J = vj.field_a[fieldTemp$10];
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
                if ((((ja) this).field_I & 255) >= 49) {
                  ((ja) this).field_G = 0;
                  break L2;
                } else {
                  if ((((ja) this).field_I & 15) == 0) {
                    int fieldTemp$11 = ((ja) this).field_G;
                    ((ja) this).field_G = ((ja) this).field_G + 1;
                    ((ja) this).field_J = hb.field_d[fieldTemp$11];
                    if (((ja) this).field_G == 4) {
                      ((ja) this).field_G = 0;
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
              if (((ja) this).field_I % 20 == 0) {
                int fieldTemp$12 = ((ja) this).field_G;
                ((ja) this).field_G = ((ja) this).field_G + 1;
                ((ja) this).field_J = hg.field_b[fieldTemp$12];
                ((ja) this).field_G = ((ja) this).field_G % 4;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            if ((255 & ((ja) this).field_I) < 49) {
              if ((15 & ((ja) this).field_I) != 0) {
                break L2;
              } else {
                int fieldTemp$13 = ((ja) this).field_G;
                ((ja) this).field_G = ((ja) this).field_G + 1;
                ((ja) this).field_J = fc.field_g[fieldTemp$13];
                if (((ja) this).field_G != 4) {
                  break L2;
                } else {
                  ((ja) this).field_G = 0;
                  break L2;
                }
              }
            } else {
              ((ja) this).field_G = 0;
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
                if (var3_int >= ((ja) this).field_L) {
                  break L2;
                } else {
                  if (((ja) this).field_n[var3_int] == param0) {
                    L3: {
                      ((ja) this).field_n[var3_int] = null;
                      if (((ja) this).field_M == param0.field_M) {
                        ((ja) this).field_m = ((ja) this).field_m - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      ((ja) this).field_L = ((ja) this).field_L - 1;
                      if (param0.field_C == ((ja) this).field_C) {
                        ((ja) this).field_N = ((ja) this).field_N - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (5 > var3_int) {
                        sf.a((Object[]) (Object) ((ja) this).field_n, 1 + var3_int, (Object[]) (Object) ((ja) this).field_n, var3_int, ((ja) this).field_L + -var3_int);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((ja) this).field_n[((ja) this).field_L] = null;
                    break L2;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (((ja) this).field_m > ((ja) this).field_L) {
                  break L6;
                } else {
                  if (((ja) this).field_L < ((ja) this).field_N) {
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
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ja.HA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
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
          var2 = -320.0f + ((ja) this).field_o;
          var3 = -240.0f + ((ja) this).field_v;
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
            ((ja) this).field_C = -47;
            break L4;
          }
        }
        var11 = -var8 + wd.field_b.field_r;
        var18 = wd.field_b.field_v;
        L5: while (true) {
          int incrementValue$1 = var9;
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
                if (((ja) this).field_H - -1 == var18[var10]) {
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
            ((ja) this).field_u = -1.9950387477874756f;
        }
        if (!(((ja) this).field_z != 2)) {
            ((ja) this).field_E = 60;
        }
        ((ja) this).field_M = param2;
        ((ja) this).field_z = param3;
        ((ja) this).field_C = param1;
        this.g((byte) 84);
    }

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, float param8, int param9, float param10) {
        ((ja) this).field_r = param5;
        ((ja) this).field_p = param5;
        ((ja) this).field_o = param1;
        ((ja) this).field_C = param9;
        ((ja) this).field_v = param7;
        ((ja) this).field_M = param4;
        ((ja) this).field_F = param8;
        ((ja) this).field_z = param2;
        ((ja) this).field_w = param3;
        double var12 = (double)og.field_r / Math.sqrt((double)(param3 * param3 + param8 * param8));
        ((ja) this).field_w = (float)((double)((ja) this).field_w * var12);
        ((ja) this).field_F = (float)((double)((ja) this).field_F * var12);
        int var14 = -96 / ((param0 - -19) / 53);
        ((ja) this).field_u = 0.0f;
        ((ja) this).field_N = 0;
        ((ja) this).field_m = 0;
        ((ja) this).field_L = 0;
        this.i(103);
    }

    final static void a(boolean param0, kl param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            qa.field_f.a(-74, (hf) (Object) new je(param1, (hf) (Object) param1));
            ge.field_d.a((ia) (Object) param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ja.FA(").append(false).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final void e(int param0) {
        if (param0 != 1643839728) {
            ((ja) this).field_H = -123;
        }
        if (((ja) this).field_z == 1) {
            vf.field_L.e();
            vb.c();
            ((ja) this).field_J.b(vf.field_L.field_s + -((ja) this).field_J.field_s >> 1, -((ja) this).field_J.field_o + vf.field_L.field_o >> 1, ((ja) this).field_q);
            oc.field_d.e();
            vf.field_L.a(vf.field_L.field_s << 3, vf.field_L.field_o << 3, (int)((ja) this).field_o << 4, (int)((ja) this).field_v << 4, (int)((double)((ja) this).field_u / 6.283185307179586 * 65535.0), 4096);
        } else {
            oc.field_d.e();
            ((ja) this).field_J.a(((ja) this).field_J.field_s << 3, ((ja) this).field_J.field_o << 3, (int)((ja) this).field_o << 4, (int)((ja) this).field_v << 4, (int)((double)((ja) this).field_u / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void l(int param0) {
        if (param0 != 1915952803) {
            Object var3 = null;
            ((ja) this).a((ja) null, -128);
        }
        ((ja) this).field_J.a(((ja) this).field_J.field_s << 3, ((ja) this).field_J.field_o << 3, (int)((ja) this).field_o << 4, (int)((ja) this).field_v << 4, (int)((double)((ja) this).field_u / 6.283185307179586 * 65535.0), 4096);
    }

    ja(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        ((ja) this).field_n = new ja[6];
        ((ja) this).field_q = 0;
        ((ja) this).field_L = 0;
        ((ja) this).field_K = null;
        ((ja) this).field_I = 0;
        ((ja) this).field_m = 0;
        ((ja) this).field_u = 0.0f;
        ((ja) this).field_G = 0;
        ((ja) this).field_N = 0;
        ((ja) this).field_v = param4;
        ((ja) this).field_H = param9;
        ((ja) this).field_w = param5;
        ((ja) this).field_M = param0;
        ((ja) this).field_F = param6;
        ((ja) this).field_C = param1;
        ((ja) this).field_z = param2;
        ((ja) this).field_o = param3;
        this.i(99);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new tf();
    }
}
