/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hj {
    static ch field_D;
    int field_k;
    int field_P;
    private int field_H;
    private int field_Y;
    private int[] field_cb;
    private int field_d;
    private int[] field_lb;
    private int field_jb;
    private int field_U;
    private boolean field_o;
    private le field_m;
    private int field_u;
    static boolean field_L;
    private int field_T;
    int field_O;
    int field_A;
    private boolean[] field_gb;
    static long field_db;
    private int field_n;
    int field_I;
    private int field_M;
    private StringBuilder field_j;
    private int field_nb;
    private boolean field_S;
    private int field_v;
    private int field_h;
    private int field_x;
    private int field_s;
    private int field_c;
    private int field_ob;
    private int field_G;
    private int[] field_fb;
    private boolean field_V;
    private int field_z;
    private le field_q;
    private int field_eb;
    private le field_N;
    private int field_i;
    private float field_B;
    private int field_hb;
    private int field_a;
    private int field_g;
    private int field_J;
    private le field_f;
    private int[] field_F;
    private int field_y;
    private int field_r;
    private int field_Q;
    private float field_mb;
    private int field_t;
    private int field_bb;
    private boolean field_C;
    private int field_W;
    private int field_e;
    private boolean field_l;
    private float field_Z;
    private int field_b;
    private int field_ib;
    private le field_R;
    private int field_w;
    private int field_p;
    private int field_ab;
    private int field_X;
    private int field_kb;

    private final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var4 = 0;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var5 = -param1 + ((hj) this).field_d;
        if (-51 < (var5 ^ -1)) {
            var4 = 2 * ((hc.field_h[param2][1] + (480 + -hc.field_h[param2][1])) * var5) / 100 + (-480 + hc.field_h[param2][1]);
        } else {
            var6 = (-(60 * (-50 + var5)) + 6000) / 100;
            if (var6 <= 5) {
                var4 = hc.field_h[param2][1];
            } else {
                var4 = hc.field_h[param2][1] - Math.abs((int)((float)var6 * ia.a(true, 0.10000000149011612f * (float)(var5 + -50))));
            }
        }
        var6 = 86 % ((param0 - 30) / 41);
        return var4;
    }

    private final void f(int param0) {
        ((hj) this).field_g = ((hj) this).field_g + (-4000 + pf.a((byte) 111, 8000));
        if (0 > ((hj) this).field_g) {
            ((hj) this).field_g = 65535 - ((hj) this).field_g;
        } else {
            if (!(-65536 <= (((hj) this).field_g ^ -1))) {
                ((hj) this).field_g = ((hj) this).field_g - 65536;
            }
        }
        if (param0 != 120) {
            ((hj) this).field_q = null;
        }
    }

    final void d(int param0) {
        int var2 = 6 / ((param0 - -69) / 45);
        ((hj) this).field_jb = 13;
        if (!ok.a(false)) {
            ((hj) this).c((byte) 25);
        }
        ((hj) this).field_u = 5;
        ((hj) this).field_Y = 0;
        ((hj) this).field_nb = 0;
    }

    private final void e(int param0) {
        int var7 = 0;
        int var8 = 0;
        int var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = -((hj) this).field_W + (((hj) this).field_O - 90);
        if (!(var2 <= -1)) {
            var2 = -var2;
        }
        if (!(-201 >= var2)) {
            var2 = 200;
        }
        var2 -= 40;
        if (!(var2 >= 0)) {
            var2 = 0;
        }
        int var3 = var2 * 256 / 100;
        int var4 = -var3 + 256;
        ((hj) this).field_v = var4;
        int var5 = 0;
        int var6 = 15 / ((param0 - 63) / 32);
        while (((hj) this).field_fb.length > var5) {
            var7 = ua.field_w[var5];
            var8 = ad.field_g[var5];
            ((hj) this).field_fb[var5] = ch.a(ch.a(65280, var8) * var4 + var3 * ch.a(var7, 65280), 16711680) + ch.a(var4 * ch.a(var8, 16711935) + ch.a(var7, 16711935) * var3, -16711936) >> 1365668616;
            var5++;
        }
    }

    final void a(int param0) {
        if (!(0 <= ((hj) this).field_A)) {
            ((hj) this).field_A = 0;
        }
        ((hj) this).field_j.setLength(0);
        StringBuilder discarded$13 = ((hj) this).field_j.append(Integer.toString(((hj) this).field_A));
        if (param0 != -19921) {
            this.i(-97);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        if (param0 != 30717) {
            this.b((byte) 65);
        }
        int var7 = param3 + ((hj) this).field_O;
        if (param1 + param2 >= var7) {
            if (!(var7 - -param5 <= param1)) {
                if (!(param5 >= -var7 + param1)) {
                    param4 = param4 + (-var7 + param1);
                }
                var8 = param1 - var7 + param2;
                if (var8 > param5) {
                    param4 = param4 + (-param5 + var8);
                    var8 = param5;
                }
                if (((hj) this).field_O <= param4 + var8) {
                    var8 = ((hj) this).field_O - param4;
                }
                ge.d(-1 + param1, param4, var8, 5592405);
            }
        }
    }

    private final void b(byte param0) {
        if (param0 >= -36) {
            this.i(34);
        }
        ie.a(aa.field_a, 112);
    }

    private final void a(byte param0) {
        if ((((hj) this).field_T ^ -1) > -1) {
            if (!(0 != ((hj) this).field_U)) {
                ((hj) this).field_T = 0;
            }
        }
        if (param0 <= 30) {
            return;
        }
        if (3 <= ((hj) this).field_U) {
            // if_icmpgt L52
        } else {
            ((hj) this).field_U = ((hj) this).field_U + ((hj) this).field_T;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 13816) {
            ((hj) this).c((byte) -114);
        }
        for (var2 = 0; var2 < 5; var2++) {
            ((hj) this).field_gb[var2] = false;
            ((hj) this).field_cb[var2] = 10 + 10 * var2;
        }
    }

    final void c(byte param0) {
        if (((hj) this).field_A > 0) {
            if (!((hj) this).field_o) {
                if (null == pg.field_b) {
                    pg.field_b = di.a(rk.field_d, 65494, h.field_a, nj.field_b, new int[1], 41, cl.field_d, 3, (byte) 100);
                }
            }
        }
        int var2 = -67 / ((param0 - -63) / 42);
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if ((var2 ^ -1) <= -6) {
            return;
          } else {
            if (((hj) this).field_gb[var2]) {
              ((hj) this).field_cb[var2] = ((hj) this).field_cb[var2] + 1;
              if ((((hj) this).field_cb[var2] ^ -1) < -11) {
                ((hj) this).field_cb[var2] = 10;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              ((hj) this).field_cb[var2] = ((hj) this).field_cb[var2] - 1;
              if (0 > ((hj) this).field_cb[var2]) {
                L1: {
                  stackOut_5_0 = ((hj) this).field_gb;
                  stackOut_5_1 = var2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var2 >= -1 + wd.field_h.b(-81)) {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L1;
                  } else {
                    stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L1;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                if (((hj) this).field_gb[var2]) {
                  if (var2 > 0) {
                    ((hj) this).field_cb[var2] = ((hj) this).field_cb[-1 + var2] - 10;
                    var2++;
                    continue L0;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 1903697041) {
            cj discarded$0 = hj.a((byte) -29, false);
        }
        field_D = null;
    }

    final static cj a(byte param0, boolean param1) {
        if (param0 != -89) {
            field_db = 6L;
        }
        cj var2 = new cj(true);
        var2.field_f = param1 ? true : false;
        return var2;
    }

    private final void h(int param0) {
        float var2 = 0.0f;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          ((hj) this).field_eb = ((hj) this).field_eb + 1;
          if (-1 != (((hj) this).field_eb & 3 ^ -1)) {
            break L0;
          } else {
            ((hj) this).field_p = ((hj) this).field_p + 1;
            if ((((hj) this).field_p ^ -1) > -5) {
              break L0;
            } else {
              ((hj) this).field_p = 0;
              break L0;
            }
          }
        }
        L1: {
          var2 = (float)((hj) this).field_eb / 200.0f;
          if (param0 == 340) {
            break L1;
          } else {
            ((hj) this).c((byte) 81);
            break L1;
          }
        }
        L2: {
          if (var2 < 1.0f) {
            break L2;
          } else {
            L3: {
              ((hj) this).field_eb = 0;
              ((hj) this).field_Q = 80 + pf.a((byte) 25, 480);
              ((hj) this).field_kb = pf.a((byte) 45, 200) + 100;
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (Math.random() <= 0.5) {
                stackOut_8_0 = this;
                stackOut_8_1 = 660 + pf.a((byte) 41, 50);
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = -20 + -pf.a((byte) -109, 50);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((hj) this).field_e = stackIn_9_1;
            ((hj) this).field_b = -20 + -pf.a((byte) -91, 50);
            break L2;
          }
        }
        ((hj) this).field_bb = (int)(var2 * (float)j.field_f[0].field_n);
        ((hj) this).field_ob = (int)((float)(((hj) this).field_b + -((hj) this).field_kb) * var2) + ((hj) this).field_kb;
        ((hj) this).field_a = ((hj) this).field_Q + (int)(var2 * (float)(-((hj) this).field_Q + ((hj) this).field_e));
        ((hj) this).field_i = (int)((float)j.field_f[0].field_m * var2);
    }

    private final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (ok.a(param0)) {
            if (((hj) this).field_A >= -1) {
              if (-1 >= fg.field_b) {
                l.field_f = 0;
                break L0;
              } else {
                l.field_f = 7;
                break L0;
              }
            } else {
              l.field_f = 7;
              break L0;
            }
          } else {
            if (fg.field_b <= 0) {
              l.field_f = 2;
              break L0;
            } else {
              if (0 < ((hj) this).field_A) {
                l.field_f = 6;
                break L0;
              } else {
                l.field_f = 10;
                break L0;
              }
            }
          }
        }
        bl.a(50, uh.field_e);
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (param0 <= MonkeyPuzzle2.field_D.field_h) {
                return true;
            }
            if (!(ol.field_g != null)) {
                return false;
            }
            if (!param1) {
                field_D = null;
            }
            int var2_int = ol.field_g.c(-110);
            if (!((var2_int ^ -1) >= -1)) {
                if (var2_int > param0 + -MonkeyPuzzle2.field_D.field_h) {
                    var2_int = param0 + -MonkeyPuzzle2.field_D.field_h;
                }
                ol.field_g.a(var2_int, param1, MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h);
                d.field_k = pf.a(0);
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + var2_int;
                if (param0 > MonkeyPuzzle2.field_D.field_h) {
                    return false;
                }
                MonkeyPuzzle2.field_D.field_h = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (var2_int >= 0) {
                    if ((wf.a(55) ^ -1L) >= -30001L) {
                        return false;
                    }
                }
                gk.a(-1);
            } catch (IOException iOException) {
                gk.a(-1);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(Math.random() <= 0.9)) {
            ((hj) this).field_hb = pf.a((byte) 54, 2);
            this.f(120);
        }
        ((hj) this).field_V = false;
        if (param0 != 56) {
            this.a(true);
        }
        if (((hj) this).field_hb != 0) {
            var2 = 3.1415927410125732f;
            var3 = 0.75f * var2 + (float)(-((hj) this).field_g) / 65535.0f * var2 * 2.0f;
            ((hj) this).field_B = ((hj) this).field_B + ha.a((byte) 51, var3);
            ((hj) this).field_Z = ((hj) this).field_Z + ia.a(true, var3);
            ((hj) this).field_V = true;
        }
        if (69.0f >= ((hj) this).field_B) {
            // ifge L179
            ((hj) this).field_B = 0.0f;
            ((hj) this).field_V = false;
            this.f(120);
        } else {
            ((hj) this).field_B = 69.0f;
            ((hj) this).field_V = false;
            this.f(120);
        }
        if (((hj) this).field_Z >= 0.0f) {
            // ifge L239
            ((hj) this).field_V = false;
            ((hj) this).field_Z = 480.0f;
            this.f(120);
        } else {
            ((hj) this).field_V = false;
            ((hj) this).field_Z = 0.0f;
            this.f(120);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ki var9_ref_ki = null;
        double var9_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_94_0 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_101_0 = null;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_158_0 = null;
        Object stackIn_159_0 = null;
        Object stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        Object stackIn_336_0 = null;
        Object stackIn_337_0 = null;
        Object stackIn_338_0 = null;
        int stackIn_338_1 = 0;
        Object stackOut_157_0 = null;
        Object stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        Object stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        Object stackOut_335_0 = null;
        Object stackOut_337_0 = null;
        int stackOut_337_1 = 0;
        Object stackOut_336_0 = null;
        int stackOut_336_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (0 == kc.field_d) {
            break L0;
          } else {
            if (13 == ((hj) this).field_jb) {
              this.a(false);
              pg.field_d[l.field_f].c((byte) -87);
              ej.field_b = 0;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (dl.field_c[96]) {
              break L2;
            } else {
              if (dl.field_c[97]) {
                break L2;
              } else {
                ((hj) this).field_w = 0;
                break L1;
              }
            }
          }
          ((hj) this).field_w = ((hj) this).field_w + 1;
          break L1;
        }
        L3: {
          var2 = 2 + 2 * (((hj) this).field_w / 5);
          if (10 < var2) {
            var2 = 10;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!dl.field_c[96]) {
            break L4;
          } else {
            ((hj) this).field_z = ((hj) this).field_z - 50 * var2;
            break L4;
          }
        }
        L5: {
          if (dl.field_c[97]) {
            ((hj) this).field_z = ((hj) this).field_z + var2 * 50;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-33678 < ((hj) this).field_z) {
            ((hj) this).field_z = 33677;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (-64624 < ((hj) this).field_z) {
            ((hj) this).field_z = 64623;
            break L7;
          } else {
            break L7;
          }
        }
        var3 = 0;
        L8: while (true) {
          if (!ba.a(-1)) {
            L9: {
              if (ec.field_d < 2) {
                break L9;
              } else {
                if (!dl.field_c[48]) {
                  break L9;
                } else {
                  ((hj) this).field_o = true;
                  e.a(255, (byte) 40, 0);
                  break L9;
                }
              }
            }
            L10: {
              if (-3 < (ec.field_d ^ -1)) {
                break L10;
              } else {
                if (dl.field_c[68]) {
                  ((hj) this).field_o = true;
                  e.a(254, (byte) 40, 1);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              mk.f(126);
              ((hj) this).field_H = ((hj) this).field_H + 1;
              var7 = ((hj) this).field_jb;
              if (var7 != 0) {
                if (var7 != 6) {
                  if (var7 == 4) {
                    if (850 < ((hj) this).field_d) {
                      ((hj) this).field_d = 0;
                      ((hj) this).field_jb = 3;
                      break L11;
                    } else {
                      L12: {
                        if (0 != (15 & ((hj) this).field_d)) {
                          break L12;
                        } else {
                          if (-201 <= (((hj) this).field_d ^ -1)) {
                            break L12;
                          } else {
                            ((hj) this).field_Y = ((hj) this).field_Y + 1;
                            if (((hj) this).field_Y + 1 != cm.field_F.length) {
                              break L12;
                            } else {
                              ((hj) this).field_Y = 0;
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        if (((hj) this).field_d >= -451) {
                          break L13;
                        } else {
                          if (-4 == aa.field_a) {
                            ((hj) this).field_jb = 3;
                            ((hj) this).field_d = 0;
                            break L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (450 >= ((hj) this).field_d) {
                          break L14;
                        } else {
                          ie.a(aa.field_a + 1, -28);
                          break L14;
                        }
                      }
                      ((hj) this).field_d = ((hj) this).field_d + 2;
                      break L11;
                    }
                  } else {
                    if (13 == var7) {
                      L15: {
                        if (((hj) this).field_nb == 0) {
                          bl.a(50, bl.field_g);
                          al.c((byte) -84);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        ((hj) this).field_nb = ((hj) this).field_nb + 4;
                        if (-2121 > (((hj) this).field_nb ^ -1)) {
                          L17: {
                            bl.a(50, uh.field_e);
                            if (ok.a(false)) {
                              L18: {
                                if (0 < ((hj) this).field_P) {
                                  break L18;
                                } else {
                                  if ((((hj) this).field_A ^ -1) >= -1) {
                                    l.field_f = 0;
                                    bl.a(50, uh.field_e);
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              l.field_f = 7;
                              break L17;
                            } else {
                              if (0 >= ((hj) this).field_P) {
                                l.field_f = 2;
                                break L17;
                              } else {
                                l.field_f = 6;
                                break L17;
                              }
                            }
                          }
                          pg.field_d[l.field_f].c((byte) -98);
                          ej.field_b = 0;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L19: {
                        if ((((hj) this).field_d & 15) == 0) {
                          var7 = ba.field_a[((hj) this).field_u].length;
                          this.a((byte) 115);
                          ((hj) this).field_Y = ((hj) this).field_Y + 1;
                          if (((hj) this).field_Y + 1 != var7) {
                            break L19;
                          } else {
                            ((hj) this).field_Y = 3;
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                      ((hj) this).field_d = ((hj) this).field_d + 2;
                      break L11;
                    } else {
                      if (var7 != 1) {
                        if (-3 == (var7 ^ -1)) {
                          if (-101 <= (((hj) this).field_d ^ -1)) {
                            ((hj) this).field_d = ((hj) this).field_d + 2;
                            break L11;
                          } else {
                            ((hj) this).field_jb = 3;
                            ((hj) this).field_d = 0;
                            break L11;
                          }
                        } else {
                          if (var7 == 3) {
                            if (0 == ((hj) this).field_d) {
                              L20: {
                                ((hj) this).field_A = ((hj) this).field_A + (10000 - -((hj) this).field_I);
                                var7 = ((hj) this).field_I + 10000;
                                var8 = ej.field_b % 3;
                                if (0 != var8) {
                                  if (var8 != 1) {
                                    var9 = var7 / 3;
                                    cl.field_d = cl.field_d + var9;
                                    nj.field_b = nj.field_b - (var7 - var9);
                                    break L20;
                                  } else {
                                    nj.field_b = nj.field_b - var7;
                                    break L20;
                                  }
                                } else {
                                  cl.field_d = cl.field_d + var7;
                                  break L20;
                                }
                              }
                              L21: {
                                ((hj) this).a(-19921);
                                ((hj) this).field_k = 480;
                                ((hj) this).field_M = 320;
                                ((hj) this).field_I = -1;
                                ((hj) this).field_O = -14 + ((hj) this).field_k;
                                uj.b(0);
                                vi.a(true);
                                dc.field_c = dc.field_c + 1;
                                rb.a(dc.field_c, (byte) -58);
                                ((hj) this).field_r = 1;
                                ((hj) this).field_t = 0;
                                ((hj) this).field_W = jf.a(-2147483648);
                                ((hj) this).field_J = jf.a(-2147483648);
                                this.e(102);
                                ((hj) this).field_u = 0;
                                fl.b(124);
                                ((hj) this).a(-19921);
                                if (-1 != (aa.field_a ^ -1)) {
                                  if (3 != aa.field_a) {
                                    break L21;
                                  } else {
                                    ((hj) this).field_ib = 11;
                                    break L21;
                                  }
                                } else {
                                  ((hj) this).field_ib = 95;
                                  break L21;
                                }
                              }
                              if (20 != dc.field_c) {
                                L22: {
                                  if (((hj) this).field_d < -101) {
                                    ((hj) this).field_jb = 0;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                ((hj) this).field_d = ((hj) this).field_d + 2;
                                break L11;
                              } else {
                                ((hj) this).field_u = 4;
                                ((hj) this).field_jb = 5;
                                break L11;
                              }
                            } else {
                              L23: {
                                if (((hj) this).field_d < -101) {
                                  ((hj) this).field_jb = 0;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              ((hj) this).field_d = ((hj) this).field_d + 2;
                              break L11;
                            }
                          } else {
                            if ((var7 ^ -1) != -6) {
                              break L11;
                            } else {
                              L24: {
                                if (-1051 >= ((hj) this).field_d) {
                                  break L24;
                                } else {
                                  L25: {
                                    if (!ok.a(false)) {
                                      if (0 < ((hj) this).field_P) {
                                        l.field_f = 6;
                                        ((hj) this).c((byte) -109);
                                        break L25;
                                      } else {
                                        l.field_f = 2;
                                        ((hj) this).c((byte) -115);
                                        break L25;
                                      }
                                    } else {
                                      l.field_f = 7;
                                      break L25;
                                    }
                                  }
                                  pg.field_d[l.field_f].c((byte) 93);
                                  ((hj) this).field_nb = 0;
                                  ej.field_b = 0;
                                  ((hj) this).field_d = 0;
                                  bl.a(50, uh.field_e);
                                  break L24;
                                }
                              }
                              L26: {
                                if (-1 != (((hj) this).field_d & 15 ^ -1)) {
                                  break L26;
                                } else {
                                  var7 = ba.field_a[((hj) this).field_u].length;
                                  ((hj) this).field_Y = ((hj) this).field_Y + 1;
                                  if (((hj) this).field_Y + 1 != var7) {
                                    break L26;
                                  } else {
                                    ((hj) this).field_Y = 0;
                                    break L26;
                                  }
                                }
                              }
                              ((hj) this).field_d = ((hj) this).field_d + 2;
                              break L11;
                            }
                          }
                        }
                      } else {
                        L27: {
                          if (((hj) this).field_d != 0) {
                            break L27;
                          } else {
                            L28: {
                              ((hj) this).field_I = (4800000 - (-((hj) this).field_O + 480) * 30000) / 480;
                              if (0 <= ((hj) this).field_I) {
                                break L28;
                              } else {
                                ((hj) this).field_I = 0;
                                break L28;
                              }
                            }
                            L29: {
                              ((hj) this).field_Y = 0;
                              bl.a(50, kb.field_d);
                              ((hj) this).field_R.e();
                              lb.a(0, 340, (byte) 24, wc.field_e, 0, 40);
                              sb.field_r.a(gg.a(new String[1], sc.field_d, true), 170, sb.field_r.field_C, 1, -1);
                              ((hj) this).field_f.e();
                              lb.a(0, 340, (byte) -14, wc.field_e, 0, 40);
                              sb.field_r.a(gg.a(new String[1], ff.field_a, true), 170, sb.field_r.field_C, 1, -1);
                              ac.field_a.a((byte) 119);
                              if (dc.field_c == 19) {
                                e.a(254, (byte) 40, 1);
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            ((hj) this).field_mb = 0.0f;
                            ((hj) this).field_s = 1 + (-13 + ((hj) this).field_k - ba.field_a[0][0].field_n) / 30;
                            cj.a((byte) -33, ke.field_h[18]);
                            break L27;
                          }
                        }
                        L30: {
                          if (0 != (((hj) this).field_d & 15)) {
                            break L30;
                          } else {
                            var7 = ba.field_a[((hj) this).field_u].length;
                            this.a((byte) 75);
                            ((hj) this).field_Y = ((hj) this).field_Y + 1;
                            if (((hj) this).field_Y + 1 == var7) {
                              if (((hj) this).field_u == 2) {
                                ((hj) this).field_Y = 2;
                                break L30;
                              } else {
                                ((hj) this).field_Y = 0;
                                break L30;
                              }
                            } else {
                              break L30;
                            }
                          }
                        }
                        L31: {
                          nh.b((byte) 107);
                          ff.a(((hj) this).field_O, -6961);
                          hh.f(8500);
                          this.d((byte) 56);
                          if (((hj) this).field_u == 2) {
                            break L31;
                          } else {
                            if ((hl.a(1, -ba.field_a[0][0].field_n + (-13 + ((hj) this).field_k), ((hj) this).field_M + -100) ^ -1) > -101) {
                              ((hj) this).field_u = 2;
                              cj.a((byte) -116, ke.field_h[19]);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          rc.a(((hj) this).field_mb, ((hj) this).field_s, (byte) -111);
                          if (0 <= mh.field_D) {
                            break L32;
                          } else {
                            if (-3 != (((hj) this).field_u ^ -1)) {
                              break L32;
                            } else {
                              if (vj.a(dc.field_c, 1) != aa.field_a) {
                                ((hj) this).field_jb = 4;
                                ((hj) this).field_d = 0;
                                if ((dc.field_c ^ -1) != -20) {
                                  bl.a(50, b.field_l);
                                  break L11;
                                } else {
                                  bl.a(50, wf.field_h);
                                  break L11;
                                }
                              } else {
                                ie.a(aa.field_a, 119);
                                ((hj) this).field_jb = 2;
                                ((hj) this).field_d = 0;
                                break L11;
                              }
                            }
                          }
                        }
                        L33: {
                          if (2 != ((hj) this).field_u) {
                            break L33;
                          } else {
                            ((hj) this).field_mb = ((hj) this).field_mb + 0.10000000149011612f;
                            if (1.0f < ((hj) this).field_mb) {
                              ((hj) this).field_mb = 0.0f;
                              ((hj) this).field_s = ((hj) this).field_s - 1;
                              nf.n(-48);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        }
                        ((hj) this).field_d = ((hj) this).field_d + 2;
                        break L11;
                      }
                    }
                  }
                } else {
                  L34: {
                    if ((((hj) this).field_d & 15) == 0) {
                      ((hj) this).field_Y = ((hj) this).field_Y + 1;
                      if (((hj) this).field_Y + 1 == cm.field_F.length) {
                        ((hj) this).field_Y = 0;
                        break L34;
                      } else {
                        break L34;
                      }
                    } else {
                      break L34;
                    }
                  }
                  if (((hj) this).field_d <= 450) {
                    ((hj) this).field_d = ((hj) this).field_d + 2;
                    break L11;
                  } else {
                    ((hj) this).field_jb = 0;
                    ((hj) this).field_d = 0;
                    break L11;
                  }
                }
              } else {
                L35: {
                  this.i(0);
                  hh.f(8500);
                  eb.d((byte) -93);
                  ff.a(((hj) this).field_O, -6961);
                  if (!ub.field_a) {
                    break L35;
                  } else {
                    ((hj) this).field_J = jf.a(-2147483648);
                    break L35;
                  }
                }
                L36: {
                  if (gb.field_o != ((hj) this).field_r) {
                    break L36;
                  } else {
                    if (((hj) this).field_t <= 500) {
                      break L36;
                    } else {
                      if (ok.field_d) {
                        break L36;
                      } else {
                        if (!hd.field_u.e(11253)) {
                          break L36;
                        } else {
                          al.c((byte) -103);
                          ((hj) this).field_t = 0;
                          ((hj) this).field_r = -1;
                          break L36;
                        }
                      }
                    }
                  }
                }
                L37: {
                  ((hj) this).field_t = ((hj) this).field_t + 1;
                  if (((hj) this).field_d % 800 != 2) {
                    this.d((byte) 56);
                    if (0 != (15 & ((hj) this).field_d)) {
                      break L37;
                    } else {
                      if (!((hj) this).field_V) {
                        break L37;
                      } else {
                        ((hj) this).field_ab = ((hj) this).field_ab + 1;
                        if ((((hj) this).field_ab + 1 ^ -1) != -5) {
                          break L37;
                        } else {
                          ((hj) this).field_ab = 0;
                          break L37;
                        }
                      }
                    }
                  } else {
                    this.d((byte) 56);
                    if (0 != (15 & ((hj) this).field_d)) {
                      break L37;
                    } else {
                      if (!((hj) this).field_V) {
                        break L37;
                      } else {
                        ((hj) this).field_ab = ((hj) this).field_ab + 1;
                        if ((((hj) this).field_ab + 1 ^ -1) != -5) {
                          break L37;
                        } else {
                          ((hj) this).field_ab = 0;
                          break L37;
                        }
                      }
                    }
                  }
                }
                L38: {
                  if (13 <= (127 & ((hj) this).field_d)) {
                    break L38;
                  } else {
                    if ((3 & ((hj) this).field_d) != 0) {
                      break L38;
                    } else {
                      ((hj) this).field_x = ((hj) this).field_x + 1;
                      if (((hj) this).field_x + 1 != 4) {
                        break L38;
                      } else {
                        ((hj) this).field_x = 0;
                        break L38;
                      }
                    }
                  }
                }
                L39: {
                  ((hj) this).field_G = ((hj) this).field_G - 1;
                  if (-1 != (((hj) this).field_G ^ -1)) {
                    break L39;
                  } else {
                    L40: {
                      stackOut_157_0 = this;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_158_0 = stackOut_157_0;
                      if (Math.random() <= 0.9) {
                        stackOut_159_0 = this;
                        stackOut_159_1 = 0;
                        stackIn_160_0 = stackOut_159_0;
                        stackIn_160_1 = stackOut_159_1;
                        break L40;
                      } else {
                        stackOut_158_0 = this;
                        stackOut_158_1 = 1;
                        stackIn_160_0 = stackOut_158_0;
                        stackIn_160_1 = stackOut_158_1;
                        break L40;
                      }
                    }
                    ((hj) this).field_C = stackIn_160_1 != 0;
                    ((hj) this).field_G = 25;
                    ((hj) this).field_X = 172 + pf.a((byte) -115, 232);
                    ((hj) this).field_h = pf.a((byte) 76, 64);
                    break L39;
                  }
                }
                L41: {
                  kj.a(var3 != 0, -1);
                  if (!qb.field_b) {
                    break L41;
                  } else {
                    if ((ck.field_b ^ -1) > -1) {
                      break L41;
                    } else {
                      ((hj) this).field_d = ((hj) this).field_d + 2;
                      break L11;
                    }
                  }
                }
                L42: {
                  ((hj) this).a(-19921);
                  var4 = 15;
                  if (1 != ((hj) this).field_u) {
                    break L42;
                  } else {
                    var4 = 3;
                    break L42;
                  }
                }
                L43: {
                  if (0 != (((hj) this).field_d & var4)) {
                    break L43;
                  } else {
                    var7 = ba.field_a[((hj) this).field_u].length;
                    this.a((byte) 82);
                    ((hj) this).field_Y = ((hj) this).field_Y + 1;
                    if (var7 == ((hj) this).field_Y + 1) {
                      L44: {
                        if (1 == ((hj) this).field_u) {
                          var8 = 0;
                          var9_ref_ki = (ki) (Object) wd.field_h.a((byte) -117);
                          L45: while (true) {
                            L46: {
                              if (var9_ref_ki == null) {
                                break L46;
                              } else {
                                L47: {
                                  if (0 == var8) {
                                    var8++;
                                    break L47;
                                  } else {
                                    ((hj) this).field_lb[-1 + var8] = var9_ref_ki.field_l;
                                    var8++;
                                    if (-7 == (var8 ^ -1)) {
                                      break L46;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                var9_ref_ki = (ki) (Object) wd.field_h.d((byte) 63);
                                continue L45;
                              }
                            }
                            ((hj) this).field_r = gb.field_o;
                            var9_double = (double)((hj) this).field_z * 6.283185307179586 / 65535.0;
                            var11 = (int)(10000.0 * Math.cos(var9_double));
                            var12 = (int)(Math.sin(var9_double) * 10000.0);
                            n.a(var12, var11, ((hj) this).field_M, ((hj) this).field_k, -301);
                            ((hj) this).field_T = -1;
                            ((hj) this).field_u = 0;
                            this.g(13816);
                            break L44;
                          }
                        } else {
                          break L44;
                        }
                      }
                      ((hj) this).field_Y = 0;
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                }
                L48: {
                  if (gb.field_o == 0) {
                    ((hj) this).field_jb = 1;
                    ((hj) this).field_d = 0;
                    cj.a((byte) 112, ke.field_h[31]);
                    break L48;
                  } else {
                    ((hj) this).field_d = ((hj) this).field_d + 2;
                    break L48;
                  }
                }
                var5 = pf.a((byte) -119, 480);
                var6 = 2147483647;
                var7 = var5 - 3;
                L49: while (true) {
                  if (var5 + 3 <= var7) {
                    var7 = 0;
                    L50: while (true) {
                      if (480 <= var7) {
                        L51: {
                          if ((var6 >> 1640774308 ^ -1) < -1) {
                            var7 = 0;
                            L52: while (true) {
                              if ((var7 ^ -1) <= -481) {
                                ((hj) this).field_O = ((hj) this).field_O - (var6 >> 1590750532);
                                ((hj) this).field_k = ((hj) this).field_O - -14;
                                this.e(125);
                                break L51;
                              } else {
                                ((hj) this).field_F[var7] = ((hj) this).field_F[var7] - var6;
                                var7++;
                                continue L52;
                              }
                            }
                          } else {
                            break L51;
                          }
                        }
                        L53: {
                          if (((hj) this).field_u != 0) {
                            break L53;
                          } else {
                            if (50 > -90 + ((hj) this).field_O - ((hj) this).field_W) {
                              ((hj) this).field_u = 6;
                              ve.a(125, 8, 0, je.field_i);
                              break L11;
                            } else {
                              break L53;
                            }
                          }
                        }
                        if ((((hj) this).field_u ^ -1) != -7) {
                          break L11;
                        } else {
                          if (-90 + ((hj) this).field_O + -((hj) this).field_W > 50) {
                            ((hj) this).field_u = 0;
                            nf.a(aa.field_a, (byte) 115, 8, 1);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      } else {
                        if (var6 > ((hj) this).field_F[var7]) {
                          var6 = ((hj) this).field_F[var7];
                          var7++;
                          continue L50;
                        } else {
                          var7++;
                          continue L50;
                        }
                      }
                    }
                  } else {
                    if (0 < var7) {
                      if ((var7 ^ -1) > -481) {
                        ((hj) this).field_F[var7] = ((hj) this).field_F[var7] + ((hj) this).field_n;
                        var7++;
                        continue L49;
                      } else {
                        var7++;
                        continue L49;
                      }
                    } else {
                      var7++;
                      continue L49;
                    }
                  }
                }
              }
            }
            L54: {
              if (!((hj) this).field_l) {
                var4 = ((hj) this).field_d % 480;
                var5 = 0;
                L55: while (true) {
                  if (480 <= var5) {
                    break L54;
                  } else {
                    L56: {
                      var6 = 1 + var4;
                      var7 = var4;
                      if (-481 >= (var6 ^ -1)) {
                        var6 = -480 + var6;
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      if (480 > var7) {
                        break L57;
                      } else {
                        var7 = var7 + -480;
                        break L57;
                      }
                    }
                    var8 = ((hj) this).field_F[var6];
                    var9 = ((hj) this).field_F[var7];
                    if (var8 <= var9) {
                      var10 = var9 + var8 >> 1049476001;
                      var9 = var10;
                      var8 = var10;
                      ((hj) this).field_F[var6] = var8;
                      ((hj) this).field_F[var7] = var9;
                      var4++;
                      var5++;
                      continue L55;
                    } else {
                      var4++;
                      var5++;
                      continue L55;
                    }
                  }
                }
              } else {
                var4 = ((hj) this).field_d % 480;
                var5 = 0;
                L58: while (true) {
                  if (var5 >= 480) {
                    break L54;
                  } else {
                    L59: {
                      var6 = var4 - 1;
                      var7 = var4;
                      if (var6 >= 0) {
                        break L59;
                      } else {
                        var6 = var6 + 480;
                        break L59;
                      }
                    }
                    L60: {
                      if ((var7 ^ -1) > -1) {
                        var7 = 480 + var7;
                        break L60;
                      } else {
                        break L60;
                      }
                    }
                    var8 = ((hj) this).field_F[var6];
                    var9 = ((hj) this).field_F[var7];
                    if (var8 <= var9) {
                      var10 = var8 + var9 >> -890035327;
                      var8 = var10;
                      var9 = var10;
                      ((hj) this).field_F[var6] = var8;
                      ((hj) this).field_F[var7] = var9;
                      var5++;
                      var4--;
                      continue L58;
                    } else {
                      var5++;
                      var4--;
                      continue L58;
                    }
                  }
                }
              }
            }
            L61: {
              stackOut_335_0 = this;
              stackIn_337_0 = stackOut_335_0;
              stackIn_336_0 = stackOut_335_0;
              if (((hj) this).field_l) {
                stackOut_337_0 = this;
                stackOut_337_1 = 0;
                stackIn_338_0 = stackOut_337_0;
                stackIn_338_1 = stackOut_337_1;
                break L61;
              } else {
                stackOut_336_0 = this;
                stackOut_336_1 = 1;
                stackIn_338_0 = stackOut_336_0;
                stackIn_338_1 = stackOut_336_1;
                break L61;
              }
            }
            L62: {
              ((hj) this).field_l = stackIn_338_1 != 0;
              if (aa.field_a == 0) {
                L63: {
                  if (0 == (((hj) this).field_d & 127)) {
                    ((hj) this).field_ib = ((hj) this).field_ib - 1;
                    break L63;
                  } else {
                    break L63;
                  }
                }
                L64: {
                  if (95 >= ((hj) this).field_ib) {
                    if (-31 >= (((hj) this).field_ib ^ -1)) {
                      break L64;
                    } else {
                      ((hj) this).field_ib = 30;
                      break L64;
                    }
                  } else {
                    ((hj) this).field_ib = 95;
                    break L64;
                  }
                }
                this.h(340);
                break L62;
              } else {
                if (-4 != (aa.field_a ^ -1)) {
                  break L62;
                } else {
                  L65: {
                    if ((31 & ((hj) this).field_d) != 0) {
                      break L65;
                    } else {
                      ((hj) this).field_ib = ((hj) this).field_ib + 1;
                      break L65;
                    }
                  }
                  if (((hj) this).field_ib >= 11) {
                    if (317 < ((hj) this).field_ib) {
                      ((hj) this).field_ib = 317;
                      break L62;
                    } else {
                      break L62;
                    }
                  } else {
                    ((hj) this).field_ib = 11;
                    break L62;
                  }
                }
              }
            }
            L66: {
              ((hj) this).field_y = ((hj) this).field_y + 1;
              if ((7 & ((hj) this).field_d) != -1) {
                break L66;
              } else {
                L67: {
                  ((hj) this).field_c = ((hj) this).field_c + 1;
                  i.field_n = i.field_n + 1;
                  if (-5 == ((hj) this).field_c) {
                    ((hj) this).field_c = 0;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                if (i.field_n != 6) {
                  break L66;
                } else {
                  i.field_n = 0;
                  break L66;
                }
              }
            }
            L68: {
              if (-1 == (((hj) this).field_d & 15)) {
                sk.field_G = sk.field_G + 1;
                if (-7 == sk.field_G) {
                  sk.field_G = 0;
                  break L68;
                } else {
                  break L68;
                }
              } else {
                break L68;
              }
            }
            L69: {
              if (((hj) this).field_y == m.field_i[0].field_n) {
                ((hj) this).field_y = 0;
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              if (param0 > 64) {
                break L70;
              } else {
                ((hj) this).field_W = -2;
                break L70;
              }
            }
            var4 = 0;
            L71: while (true) {
              if (-11 >= (var4 ^ -1)) {
                L72: {
                  if (((hj) this).field_J == ((hj) this).field_W) {
                    break L72;
                  } else {
                    L73: {
                      if (((hj) this).field_W >= ((hj) this).field_J) {
                        ((hj) this).field_W = ((hj) this).field_W - 1;
                        break L73;
                      } else {
                        ((hj) this).field_W = ((hj) this).field_W + 1;
                        break L73;
                      }
                    }
                    L74: {
                      if (5 > Math.abs(-((hj) this).field_J + ((hj) this).field_W)) {
                        ((hj) this).field_W = ((hj) this).field_J;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    this.e(-21);
                    break L72;
                  }
                }
                return;
              } else {
                lb.field_D[var4] = lb.field_D[var4] + pf.a((byte) 23, 3);
                if (lb.field_D[var4] > 100) {
                  lb.field_D[var4] = 0;
                  var4++;
                  continue L71;
                } else {
                  var4++;
                  continue L71;
                }
              }
            }
          } else {
            L75: {
              if (hf.field_f.field_o) {
                break L75;
              } else {
                L76: {
                  var4 = (oa.field_H ^ hf.field_f.field_d) % 8;
                  if (0 != var4) {
                    if (-2 == (var4 ^ -1)) {
                      rk.field_d = rk.field_d - 1;
                      cl.field_d = cl.field_d + h.field_a;
                      break L76;
                    } else {
                      if (var4 == -3) {
                        h.field_a = h.field_a + 1;
                        cl.field_d = cl.field_d - rk.field_d;
                        break L76;
                      } else {
                        if (var4 == 3) {
                          rk.field_d = rk.field_d + 1;
                          cl.field_d = cl.field_d - h.field_a;
                          break L76;
                        } else {
                          if (var4 == 4) {
                            h.field_a = h.field_a + 1;
                            nj.field_b = nj.field_b + rk.field_d;
                            break L76;
                          } else {
                            if (-6 == var4) {
                              rk.field_d = rk.field_d + 1;
                              nj.field_b = nj.field_b + h.field_a;
                              break L76;
                            } else {
                              if (6 == var4) {
                                nj.field_b = nj.field_b - rk.field_d;
                                h.field_a = h.field_a - 1;
                                break L76;
                              } else {
                                if (-8 == (var4 ^ -1)) {
                                  nj.field_b = nj.field_b - h.field_a;
                                  rk.field_d = rk.field_d - 1;
                                  break L76;
                                } else {
                                  break L76;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    cl.field_d = cl.field_d + rk.field_d;
                    h.field_a = h.field_a - 1;
                    break L76;
                  }
                }
                var4 = (hf.field_f.field_d ^ oa.field_H - -hf.field_f.field_A) % 5;
                if (0 == var4) {
                  bh.field_g = bh.field_g | jc.field_e + b.field_m << 1903697041;
                  break L75;
                } else {
                  if (var4 == -2) {
                    b.field_m = b.field_m + sd.field_e;
                    jc.field_e = jc.field_e + 1;
                    break L75;
                  } else {
                    if (var4 == 2) {
                      jc.field_e = jc.field_e - 1;
                      b.field_m = b.field_m - sd.field_e;
                      break L75;
                    } else {
                      if (-4 != var4) {
                        if ((var4 ^ -1) == -5) {
                          b.field_m = b.field_m - jc.field_e;
                          sd.field_e = sd.field_e - 1;
                          break L75;
                        } else {
                          break L75;
                        }
                      } else {
                        b.field_m = b.field_m + jc.field_e;
                        sd.field_e = sd.field_e + 1;
                        break L75;
                      }
                    }
                  }
                }
              }
            }
            if (oa.field_H != 13) {
              L77: {
                if ((ec.field_d ^ -1) <= -3) {
                  L78: {
                    if (oa.field_H == 99) {
                      ((hj) this).field_o = true;
                      if (!dl.field_c[82]) {
                        ((hj) this).field_O = ((hj) this).field_O + 1;
                        break L78;
                      } else {
                        ((hj) this).field_ib = ((hj) this).field_ib - 1;
                        break L78;
                      }
                    } else {
                      break L78;
                    }
                  }
                  if (98 != oa.field_H) {
                    break L77;
                  } else {
                    L79: {
                      if (dl.field_c[82]) {
                        ((hj) this).field_ib = ((hj) this).field_ib + 1;
                        break L79;
                      } else {
                        ((hj) this).field_O = ((hj) this).field_O - 1;
                        break L79;
                      }
                    }
                    ((hj) this).field_o = true;
                    break L77;
                  }
                } else {
                  break L77;
                }
              }
              L80: {
                L81: {
                  if (((hj) this).field_u == 0) {
                    break L81;
                  } else {
                    if ((((hj) this).field_u ^ -1) != -7) {
                      break L80;
                    } else {
                      break L81;
                    }
                  }
                }
                L82: {
                  if (oa.field_H == 83) {
                    break L82;
                  } else {
                    if (oa.field_H == -83) {
                      break L82;
                    } else {
                      break L80;
                    }
                  }
                }
                if (!jj.b(true)) {
                  break L80;
                } else {
                  if (-1 != ((hj) this).field_jb) {
                    break L80;
                  } else {
                    L83: {
                      if (!qb.field_b) {
                        break L83;
                      } else {
                        if (-1 < (ck.field_b ^ -1)) {
                          break L83;
                        } else {
                          break L80;
                        }
                      }
                    }
                    ((hj) this).field_u = 1;
                    ((hj) this).field_Y = 0;
                    ((hj) this).field_T = 1;
                    cj.a((byte) -18, ke.field_h[1]);
                    break L80;
                  }
                }
              }
              L84: {
                if (-3 >= (ec.field_d ^ -1)) {
                  L85: {
                    if (oa.field_H != 26) {
                      break L85;
                    } else {
                      if (dc.field_c <= 0) {
                        break L85;
                      } else {
                        ((hj) this).field_M = 320;
                        ((hj) this).field_k = 480;
                        ((hj) this).field_O = -14 + ((hj) this).field_k;
                        uj.b(0);
                        dc.field_c = dc.field_c - 1;
                        rb.a(dc.field_c, (byte) -58);
                        ((hj) this).field_o = true;
                        break L85;
                      }
                    }
                  }
                  L86: {
                    if (oa.field_H != 36) {
                      break L86;
                    } else {
                      ((hj) this).field_jb = 1;
                      ((hj) this).field_o = true;
                      ((hj) this).field_d = 0;
                      cj.a((byte) 124, ke.field_h[31]);
                      break L86;
                    }
                  }
                  L87: {
                    if (oa.field_H == 39) {
                      L88: {
                        if (ok.field_e) {
                          stackOut_93_0 = 0;
                          stackIn_94_0 = stackOut_93_0;
                          break L88;
                        } else {
                          stackOut_92_0 = 1;
                          stackIn_94_0 = stackOut_92_0;
                          break L88;
                        }
                      }
                      ok.field_e = stackIn_94_0 != 0;
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  L89: {
                    if (-28 != (oa.field_H ^ -1)) {
                      break L89;
                    } else {
                      ((hj) this).field_M = 320;
                      ((hj) this).field_k = 480;
                      ((hj) this).field_O = -14 + ((hj) this).field_k;
                      uj.b(0);
                      dc.field_c = dc.field_c + 1;
                      rb.a(dc.field_c, (byte) -58);
                      ((hj) this).field_o = true;
                      break L89;
                    }
                  }
                  L90: {
                    if (oa.field_H == 33) {
                      L91: {
                        stackOut_99_0 = this;
                        stackIn_101_0 = stackOut_99_0;
                        stackIn_100_0 = stackOut_99_0;
                        if (((hj) this).field_S) {
                          stackOut_101_0 = this;
                          stackOut_101_1 = 0;
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          break L91;
                        } else {
                          stackOut_100_0 = this;
                          stackOut_100_1 = 1;
                          stackIn_102_0 = stackOut_100_0;
                          stackIn_102_1 = stackOut_100_1;
                          break L91;
                        }
                      }
                      ((hj) this).field_S = stackIn_102_1 != 0;
                      break L90;
                    } else {
                      break L90;
                    }
                  }
                  L92: {
                    if (-10 == (oa.field_H ^ -1)) {
                      ((hj) this).field_o = true;
                      el.a(true, 0);
                      break L92;
                    } else {
                      break L92;
                    }
                  }
                  L93: {
                    if ((oa.field_H ^ -1) != -11) {
                      break L93;
                    } else {
                      ((hj) this).field_o = true;
                      el.a(true, 1);
                      break L93;
                    }
                  }
                  L94: {
                    if (oa.field_H != 11) {
                      break L94;
                    } else {
                      ((hj) this).field_o = true;
                      el.a(true, 2);
                      break L94;
                    }
                  }
                  if ((oa.field_H ^ -1) == -13) {
                    ((hj) this).field_o = true;
                    el.a(true, 3);
                    break L84;
                  } else {
                    break L84;
                  }
                } else {
                  break L84;
                }
              }
              if ((oa.field_H ^ -1) == -85) {
                var3 = 1;
                continue L8;
              } else {
                continue L8;
              }
            } else {
              L95: {
                if (13 == ((hj) this).field_jb) {
                  this.a(false);
                  break L95;
                } else {
                  l.field_f = 1;
                  break L95;
                }
              }
              pg.field_d[l.field_f].c((byte) 73);
              pg.field_d[l.field_f].a(false, false);
              ej.field_b = 0;
              return;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        le var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var9_ref_ki = null;
        le var9_ref = null;
        le var9_ref_le = null;
        int var10 = 0;
        le var10_ref = null;
        le var10_ref_le = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        ki var22_ref = null;
        Object var23 = null;
        ki var23_ref = null;
        le var24 = null;
        le var25 = null;
        int stackIn_34_0 = 0;
        int stackIn_239_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_237_0 = 0;
        L0: {
          var22 = null;
          var23 = null;
          var20 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (aa.field_a == 2) {
            var2 = -(2 * m.field_i[0].field_n) + ((hj) this).field_y;
            var3 = 0;
            L1: while (true) {
              if (m.field_i[0].field_n * 2 + ((hj) this).field_y <= var2) {
                break L0;
              } else {
                var3++;
                var4 = var3 + ((hj) this).field_c;
                var4 = var4 % 4;
                var5 = 0;
                L2: while (true) {
                  if (-641 >= (var5 ^ -1)) {
                    var2 = var2 + m.field_i[0].field_n;
                    continue L1;
                  } else {
                    m.field_i[var4].a(var5, var2);
                    var5 = var5 + m.field_i[0].field_m;
                    continue L2;
                  }
                }
              }
            }
          } else {
            if (aa.field_a != 3) {
              if (aa.field_a == 0) {
                var2 = -((-30 + ((hj) this).field_ib) * 255 / 65) + 255;
                fi.field_a[fi.field_a.length + -1].a(0, 0, var2, 15387868);
                hf.field_d.e(-(hf.field_d.field_m >> -294507870) + 320, ((hj) this).field_ib);
                ge.h(0, 0, 640, 70);
                ge.a(5120, (hf.field_d.field_m >> 2126480610) + ((hj) this).field_ib << 632372036, hf.field_d.field_m << 1586773603, 50, cf.field_a);
                ge.h(0, 0, 640, 480);
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = -100 + ((hj) this).field_ib;
              if ((((hj) this).field_ib ^ -1) <= -241) {
                ge.a(77, 0, 486, 150, 265542, 5383094);
                break L0;
              } else {
                L3: {
                  ge.h(77, 0, 563, 146);
                  if (0 < var2) {
                    ge.a(77, var2 - 145, 486, 145, 265542, 5383094);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var2 ^ -1) <= -146) {
                    break L4;
                  } else {
                    ge.a(77, var2, 486, 145, 5383094, 8374005);
                    break L4;
                  }
                }
                ge.d(77, var2 - -145, 486, 145, 8374005);
                ge.h(0, 0, 640, 480);
                hf.field_d.c(320 + -(hf.field_d.field_m >> -1337206303), ((hj) this).field_ib);
                break L0;
              }
            }
          }
        }
        L5: {
          if (aa.field_a != 0) {
            al.a(((hj) this).field_H, (byte) -126);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (aa.field_a == 3) {
            L7: {
              if (-171 < (((hj) this).field_ib ^ -1)) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L7;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L7;
              }
            }
            L8: {
              var2 = stackIn_34_0;
              var3 = -qa.field_i.field_n + (((hj) this).field_ib + -220);
              fe.field_f[((hj) this).field_c].b(0, 0, 100);
              var4 = 255 * (-11 + ((hj) this).field_ib) / 306;
              if (-101 <= (var4 ^ -1)) {
                break L8;
              } else {
                var4 = 100;
                break L8;
              }
            }
            L9: {
              ge.c(70, 0, 500, 480, 265542, var4);
              var5 = ((hj) this).field_ib + -100;
              var6 = 0;
              if (((hj) this).field_ib > 100) {
                if (180 <= ((hj) this).field_ib) {
                  var6 = 50;
                  break L9;
                } else {
                  var6 = 50 - (9000 + -(((hj) this).field_ib * 50)) / 80;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              ge.h(0, 0, 640, 145);
              if (((hj) this).field_ib >= 250) {
                break L10;
              } else {
                ge.a(5120, (hf.field_d.field_m >> -284282911) + ((hj) this).field_ib << 1156533284, hf.field_d.field_m << -1357943932, -var6 + 50, cf.field_a);
                break L10;
              }
            }
            L11: {
              if (var2 == 0) {
                break L11;
              } else {
                ge.a(320 - qa.field_i.field_m << 1947285252, var3 - (-(qa.field_i.field_n >> 1644914081) + 8) << -361708060, qa.field_i.field_m << -1062887580, 50, sk.field_D);
                break L11;
              }
            }
            L12: {
              if (var6 >= 50) {
                break L12;
              } else {
                var7_int = 145;
                var8 = 0;
                L13: while (true) {
                  if ((var7_int ^ -1) <= -291) {
                    break L12;
                  } else {
                    ge.h(0, var7_int, 640, 2 + var7_int);
                    ge.a(5120, -(4 * var8) + ((hj) this).field_ib + (hf.field_d.field_m >> -1127253663) << 235989604, hf.field_d.field_m << -57743068, 50 + -var6, cf.field_a);
                    var8 += 2;
                    var7_int += 2;
                    continue L13;
                  }
                }
              }
            }
            L14: {
              if (var5 < 89) {
                var7_int = var5 - -90;
                if (-101 < var7_int) {
                  L15: {
                    var7_int = 100;
                    ge.h(0, 0, 640, var7_int);
                    var8 = 256 * var7_int / 100;
                    if (256 >= var8) {
                      break L15;
                    } else {
                      var8 = 256;
                      break L15;
                    }
                  }
                  ma.a(((hj) this).field_m.field_s, 80, 0, ((hj) this).field_m.field_m, var7_int, var8, 0);
                  ac.field_a.a((byte) 110);
                  break L14;
                } else {
                  if (!((hj) this).field_C) {
                    break L6;
                  } else {
                    if (-2 != (aa.field_a ^ -1)) {
                      break L6;
                    } else {
                      pc.field_U[((hj) this).field_x].c(((hj) this).field_X, ((hj) this).field_h);
                      break L6;
                    }
                  }
                }
              } else {
                break L14;
              }
            }
            L16: {
              if (var2 != 0) {
                qa.field_i.c(-qa.field_i.field_m + 320 - (qa.field_i.field_m >> -1398397183), var3);
                break L16;
              } else {
                break L16;
              }
            }
            if (!((hj) this).field_C) {
              break L6;
            } else {
              if (-2 != (aa.field_a ^ -1)) {
                break L6;
              } else {
                pc.field_U[((hj) this).field_x].c(((hj) this).field_X, ((hj) this).field_h);
                break L6;
              }
            }
          } else {
            if (aa.field_a == -1) {
              if (!((hj) this).field_C) {
                break L6;
              } else {
                if (-2 != aa.field_a) {
                  break L6;
                } else {
                  pc.field_U[((hj) this).field_x].c(((hj) this).field_X, ((hj) this).field_h);
                  break L6;
                }
              }
            } else {
              if (!((hj) this).field_C) {
                break L6;
              } else {
                if (-2 != aa.field_a) {
                  break L6;
                } else {
                  pc.field_U[((hj) this).field_x].c(((hj) this).field_X, ((hj) this).field_h);
                  break L6;
                }
              }
            }
          }
        }
        var2 = 0;
        L17: while (true) {
          if (var2 >= ib.field_c) {
            L18: {
              ll.a(24733);
              ci.a(-2865);
              ck.field_a[1].c(20 + ((hj) this).field_M, -wl.field_f[0].field_n + (((hj) this).field_k + -13));
              if (wd.field_h.e(11253)) {
                break L18;
              } else {
                var22_ref = (ki) (Object) wd.field_h.a((byte) -117);
                if (var22_ref != null) {
                  L19: {
                    var22_ref.field_B = (float)((hj) this).field_M;
                    var22_ref.field_q = (float)(-48 + ((hj) this).field_k);
                    if (jj.b(true)) {
                      var22_ref.a((byte) -74);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var3 = 1;
                  L20: while (true) {
                    if (var3 <= -5) {
                      break L18;
                    } else {
                      var23_ref = (ki) (Object) wd.field_h.d((byte) 63);
                      if (var23_ref != null) {
                        L21: {
                          var4 = var3;
                          if (-2 == var4) {
                            var23_ref.field_B = 360.0f;
                            var23_ref.field_q = (float)(((hj) this).field_k + -48);
                            break L21;
                          } else {
                            if (var4 != 2) {
                              if (-4 != (var4 ^ -1)) {
                                break L21;
                              } else {
                                var23_ref.field_B = 370.0f;
                                var23_ref.field_q = (float)(-28 + ((hj) this).field_k);
                                break L21;
                              }
                            } else {
                              var23_ref.field_q = (float)(((hj) this).field_k + -38);
                              var23_ref.field_B = 385.0f;
                              break L21;
                            }
                          }
                        }
                        var23_ref.a((byte) -60);
                        var23_ref.field_q = (float)(148 + (var3 - 1) * 59);
                        var23_ref.field_B = 602.0f;
                        var3++;
                        continue L20;
                      } else {
                        break L18;
                      }
                    }
                  }
                } else {
                  break L18;
                }
              }
            }
            df.f(18180);
            var2 = (int)(ia.a(true, (float)((hj) this).field_H * 0.00800000037997961f) * 50.0f);
            var3 = 727655;
            ge.c(80, ((hj) this).field_O, 480, 480, var3, 120);
            var4 = 0;
            ge.h(80, 0, 560, 480);
            var5 = 0;
            var6 = 0;
            var7_int = ((hj) this).field_d / 2 % 480;
            var8 = 0;
            L22: while (true) {
              if (-481 >= (var8 ^ -1)) {
                var7_int = ((hj) this).field_O;
                L23: while (true) {
                  L24: {
                    if (var7_int >= 480) {
                      break L24;
                    } else {
                      var8 = -((hj) this).field_O + var7_int;
                      if (-86 <= (var8 ^ -1)) {
                        var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                        ge.i(var7_int - -var2, var7_int, 5, -var9 + 5592405);
                        ge.i(var7_int - (50 + -var2), var7_int, 30, -var9 + 5592405);
                        ge.i(var2 + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                        ge.i(var7_int + (-80 + var2), var7_int, 5, 5592405 + -var9);
                        var7_int++;
                        continue L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (((hj) this).field_S) {
                      ge.b(1, 1, 80, ((hj) this).field_O, 480, 4);
                      ge.b(2, 2, 80, ((hj) this).field_O + 4, 480, 476 - ((hj) this).field_O);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      if (((hj) this).field_jb == -1) {
                        break L27;
                      } else {
                        if (((hj) this).field_jb == 13) {
                          break L27;
                        } else {
                          if (-2 == ((hj) this).field_jb) {
                            break L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L28: {
                      L29: {
                        if ((((hj) this).field_jb ^ -1) == -14) {
                          break L29;
                        } else {
                          if (((hj) this).field_jb != 1) {
                            var7_int = ((hj) this).field_d;
                            if (-5 <= (var7_int ^ -1)) {
                              break L28;
                            } else {
                              var7_int = 4;
                              break L28;
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                      var7_int = -((hj) this).field_d + 4;
                      break L28;
                    }
                    if (var7_int <= 0) {
                      break L26;
                    } else {
                      L30: {
                        var8 = ((hj) this).field_v - -(int)(ia.a(true, (float)((hj) this).field_d * 0.10000000149011612f) * 20.0f);
                        if (-1 < var8) {
                          var8 = 0;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (-256 < var8) {
                          var8 = 255;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      var9 = 0;
                      L32: while (true) {
                        if (-11 >= (var9 ^ -1)) {
                          uc.a(78, -90 + ((hj) this).field_k, 558, ((hj) this).field_k + -90, 3, var8, var7_int, ((hj) this).field_fb);
                          break L26;
                        } else {
                          ge.a((var9 * lb.field_D[var9] + ((hj) this).field_d) % 480 + 80 << 23307844, -90 + ((hj) this).field_k + (int)(4.0f * ia.a(true, (float)(var9 * lb.field_D[var9] + ((hj) this).field_d) * 0.10000000149011612f)) << -366411164, ll.field_c[var9] << 435665412, jf.field_f[var9], cf.field_a);
                          var9++;
                          continue L32;
                        }
                      }
                    }
                  }
                  ge.h(0, 0, 640, 480);
                  ge.c(70, var5, 10, -var5 + 480, var3, 120);
                  ge.c(560, var6, 10, -var6 + 480, var3, 120);
                  ka.b(0);
                  var7 = qh.field_a[((hj) this).field_ab];
                  var7.b(var7.field_m << -600862045, var7.field_n << 2020967139, (int)((hj) this).field_B << -18135196, (int)((hj) this).field_Z << 1934953316, ((hj) this).field_g, 4096);
                  lb.field_E[0].c(0, 0);
                  lb.field_E[1].c(640 - lb.field_E[1].field_m, 0);
                  var8 = 0;
                  var9_ref_ki = (ki) (Object) wd.field_h.a((byte) -117);
                  L33: while (true) {
                    if (var9_ref_ki == null) {
                      L34: {
                        if ((var8 ^ -1) != -6) {
                          break L34;
                        } else {
                          L35: {
                            if (((hj) this).field_lb[-1 + var8] < 0) {
                              var9_ref = tl.field_b;
                              break L35;
                            } else {
                              var9_ref_le = ak.field_t[((hj) this).field_lb[var8 + -1]];
                              break L35;
                            }
                          }
                          var10 = 148 + 59 * var8 + -59;
                          if (((hj) this).field_cb[-1 + var8] < 10) {
                            var11 = var9_ref.field_m * ((hj) this).field_cb[var8 - 1] / 10;
                            var9_ref.d(-(var9_ref.field_m / 2) + (-var11 + var9_ref.field_m) / 2 + 602, var10 + -(var9_ref.field_m / 2) + (var9_ref.field_m + -var11) / 2, var11, var11);
                            break L34;
                          } else {
                            var9_ref.c(602 + -(var9_ref.field_m / 2), -(var9_ref.field_m / 2) + var10);
                            break L34;
                          }
                        }
                      }
                      L36: {
                        var9 = (23040 + -(144 * (480 - ((hj) this).field_O))) / 480;
                        if ((var9 ^ -1) < -1) {
                          ge.c(25, 48 - var9 + 412, 28, var9, 1203134, 120);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      L37: {
                        L38: {
                          ge.c(37, 460, 4, 20, 1203134, 120);
                          j.field_g.c(-(j.field_g.field_m >> -1739532991) + ((hj) this).field_M + -20, -j.field_g.field_n + ((hj) this).field_k);
                          if (2 != ((hj) this).field_u) {
                            break L38;
                          } else {
                            L39: {
                              if (2 <= ((hj) this).field_Y) {
                                break L39;
                              } else {
                                if (4 != ((hj) this).field_jb) {
                                  break L38;
                                } else {
                                  break L39;
                                }
                              }
                            }
                            L40: {
                              var24 = ba.field_a[2][((hj) this).field_Y];
                              var10_ref = var24;
                              var11 = (bl.field_f - (var24.field_m >> -1597311775) - (-100 + ((hj) this).field_M)) * 150;
                              if (-1 >= var11) {
                                if (-65536 >= var11) {
                                  break L40;
                                } else {
                                  var11 = var11 - 65535;
                                  break L40;
                                }
                              } else {
                                var11 = -var11 + 65535;
                                break L40;
                              }
                            }
                            var10_ref.b(var24.field_m << 1123805987, 160, bl.field_f << 2123968420, mh.field_D << 1186612868, var11, 4096);
                            break L37;
                          }
                        }
                        var25 = ba.field_a[((hj) this).field_u][((hj) this).field_Y];
                        var10_ref = var25;
                        var10_ref.c(-100 + ((hj) this).field_M, -var25.field_n + ((hj) this).field_k - 13);
                        break L37;
                      }
                      L41: {
                        wl.field_f[((hj) this).field_U].c(-70 + ((hj) this).field_M, ((hj) this).field_k + (-13 + -wl.field_f[0].field_n));
                        var10 = -((hj) this).field_z;
                        ci.field_d.a(0, ci.field_d.field_n << -1379118845, ((hj) this).field_M << 315763236, ((hj) this).field_k - 48 << -961937372, var10, 4096);
                        ck.field_a[0].c(20 + ((hj) this).field_M, ((hj) this).field_k + -13 + -wl.field_f[0].field_n);
                        fa.f(1);
                        pl.field_e.a(((hj) this).field_j.toString(), 40, 124, 16777215, -1);
                        pl.field_e.a(Integer.toString(1 + dc.field_c % 5), 40, 208, 16777215, -1);
                        var11 = -48 / ((param0 - 56) / 43);
                        pl.field_e.a(Integer.toString(1 + aa.field_a), 40, 288, 16777215, -1);
                        if (13 != ((hj) this).field_jb) {
                          if (-2 == ((hj) this).field_jb) {
                            L42: {
                              var12 = ((hj) this).field_d * 40 / 50;
                              if (var12 <= 40) {
                                break L42;
                              } else {
                                var12 = 40;
                                break L42;
                              }
                            }
                            ((hj) this).field_R.b(150, 260 - -((-var12 + 40) / 2), 340, var12);
                            ((hj) this).field_f.b(150, (-var12 + 40) / 2 + 340, 340, var12);
                            break L41;
                          } else {
                            if (-3 != ((hj) this).field_jb) {
                              if (3 != ((hj) this).field_jb) {
                                if (((hj) this).field_jb != 4) {
                                  if (((hj) this).field_jb != 6) {
                                    if (((hj) this).field_jb != -6) {
                                      pd.a(true);
                                      break L41;
                                    } else {
                                      L43: {
                                        if (-33 > ((hj) this).field_d) {
                                          f.a(((hj) this).field_d, (byte) 117);
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                      ph.field_d.a(0, 0);
                                      var12 = 0;
                                      L44: while (true) {
                                        if (var12 >= ni.field_c.length) {
                                          L45: {
                                            if (-256 < (((hj) this).field_d / 2 ^ -1)) {
                                              stackOut_238_0 = ((hj) this).field_d / 2;
                                              stackIn_239_0 = stackOut_238_0;
                                              break L45;
                                            } else {
                                              stackOut_237_0 = 255;
                                              stackIn_239_0 = stackOut_237_0;
                                              break L45;
                                            }
                                          }
                                          var12 = stackIn_239_0;
                                          kl.a(0, 0, 640, 480, 12163403, var12);
                                          sb.field_r.a(wj.field_h, 321, 170, 6776679, -1);
                                          sb.field_r.a(wj.field_h, 319, 170, 6776679, -1);
                                          sb.field_r.a(wj.field_h, 320, 171, 6776679, -1);
                                          sb.field_r.a(wj.field_h, 320, 169, 6776679, -1);
                                          sb.field_r.a(wj.field_h, 320, 170, 16724736, -1);
                                          sb.field_r.a(wj.field_h, 330, 180, 6776679, -1, 50);
                                          var13 = gg.a(new String[1], cl.field_b, true);
                                          sb.field_r.a(var13, 321, 320, 6776679, -1);
                                          sb.field_r.a(var13, 319, 320, 6776679, -1);
                                          sb.field_r.a(var13, 320, 321, 6776679, -1);
                                          sb.field_r.a(var13, 320, 319, 6776679, -1);
                                          sb.field_r.a(var13, 320, 320, 16724736, -1);
                                          sb.field_r.a(var13, 330, 330, 6776679, -1, 50);
                                          ba.field_a[((hj) this).field_u][((hj) this).field_Y].c(-(ba.field_a[((hj) this).field_u][((hj) this).field_Y].field_k / 2) + 320, 240 + -(ba.field_a[((hj) this).field_u][((hj) this).field_Y].field_j / 2));
                                          var21 = 0;
                                          var14 = var21;
                                          L46: while (true) {
                                            if (var21 >= 5) {
                                              L47: {
                                                f.a(64 + -((hj) this).field_d, (byte) 111);
                                                if (600 >= ((hj) this).field_d) {
                                                  break L47;
                                                } else {
                                                  l.field_D[4].c(0, 0, ((hj) this).field_d + -600, -700 + ((hj) this).field_d);
                                                  break L47;
                                                }
                                              }
                                              if (((hj) this).field_d <= 1000) {
                                                break L41;
                                              } else {
                                                f.a(((hj) this).field_d - 1000, (byte) 118);
                                                break L41;
                                              }
                                            } else {
                                              nh.field_f[0][var21][((hj) this).field_Y].c(-16 + (320 - 60 * var21 - -120), -(Math.abs(var21 + -2) * 10) + 360);
                                              var21++;
                                              continue L46;
                                            }
                                          }
                                        } else {
                                          ni.field_c[var12].b(el.field_b[var12][0], el.field_b[var12][1]);
                                          var12++;
                                          continue L44;
                                        }
                                      }
                                    }
                                  } else {
                                    L48: {
                                      if ((((hj) this).field_d ^ -1) <= -401) {
                                        break L48;
                                      } else {
                                        ph.field_d.a(0, 0);
                                        ni.field_c[0].b(el.field_b[0][0], el.field_b[0][1]);
                                        cm.field_F[((hj) this).field_Y].c(hc.field_h[aa.field_a][0], this.a(-97, 0, aa.field_a));
                                        break L48;
                                      }
                                    }
                                    L49: {
                                      if (((hj) this).field_d <= 350) {
                                        break L49;
                                      } else {
                                        if (400 > ((hj) this).field_d) {
                                          f.a(((hj) this).field_d + -350, (byte) 70);
                                          break L41;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                    if (((hj) this).field_d < 400) {
                                      break L41;
                                    } else {
                                      if ((((hj) this).field_d ^ -1) <= -451) {
                                        break L41;
                                      } else {
                                        f.a(400 + -((hj) this).field_d + 50, (byte) 78);
                                        break L41;
                                      }
                                    }
                                  }
                                } else {
                                  L50: {
                                    var12 = ((hj) this).field_d;
                                    if (0 < var12) {
                                      var13_int = var12 - 100;
                                      if ((var13_int ^ -1) >= -256) {
                                        L51: {
                                          if (var12 <= 255) {
                                            break L51;
                                          } else {
                                            var12 = 255;
                                            break L51;
                                          }
                                        }
                                        ma.a(l.field_D[aa.field_a], 0, 0, 640, var12, var13_int);
                                        break L50;
                                      } else {
                                        l.field_D[aa.field_a].a(0, 0);
                                        break L50;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L52: {
                                    L53: {
                                      if (450 >= ((hj) this).field_d) {
                                        break L53;
                                      } else {
                                        if (3 <= aa.field_a) {
                                          break L53;
                                        } else {
                                          ph.field_d.a(0, 0);
                                          var13_int = 0;
                                          L54: while (true) {
                                            if (var13_int > aa.field_a + 1) {
                                              var13_int = hc.field_h[1 + aa.field_a][0] - -((cm.field_F[((hj) this).field_Y].field_m - qc.field_L[((hj) this).field_Y].field_m) / 2);
                                              var14 = (-qc.field_L[((hj) this).field_Y].field_n + cm.field_F[((hj) this).field_Y].field_n) / 2 + hc.field_h[1 + aa.field_a][1];
                                              if (((hj) this).field_d >= 650) {
                                                if (-701 >= (((hj) this).field_d ^ -1)) {
                                                  cm.field_F[((hj) this).field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                                                  break L52;
                                                } else {
                                                  if (aa.field_a != 2) {
                                                    qc.field_L[((hj) this).field_Y].c(var13_int, var14);
                                                    cm.field_F[((hj) this).field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                                                    break L52;
                                                  } else {
                                                    qc.field_L[((hj) this).field_Y].f(var13_int, var14);
                                                    cm.field_F[((hj) this).field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                                                    break L52;
                                                  }
                                                }
                                              } else {
                                                var15 = -400 + ((hj) this).field_d - 50;
                                                var16 = hc.field_h[aa.field_a][0] + (cm.field_F[((hj) this).field_Y].field_m - qc.field_L[((hj) this).field_Y].field_m) / 2;
                                                var17 = (cm.field_F[((hj) this).field_Y].field_n - qc.field_L[((hj) this).field_Y].field_n) / 2 + hc.field_h[aa.field_a][1];
                                                var18 = var16 + (-var16 + var13_int) * var15 / 200;
                                                var19 = (var14 + -var17) * var15 / 200 + var17;
                                                if (aa.field_a == 2) {
                                                  qc.field_L[((hj) this).field_Y].f(var18, var19);
                                                  break L52;
                                                } else {
                                                  qc.field_L[((hj) this).field_Y].c(var18, var19);
                                                  break L52;
                                                }
                                              }
                                            } else {
                                              ni.field_c[var13_int].b(el.field_b[var13_int][0], el.field_b[var13_int][1]);
                                              var13_int++;
                                              continue L54;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (((hj) this).field_d > 450) {
                                      ke.field_i.a(0, 0);
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                  L55: {
                                    if (((hj) this).field_d <= 400) {
                                      break L55;
                                    } else {
                                      if (((hj) this).field_d < 450) {
                                        f.a(((hj) this).field_d + -400, (byte) 126);
                                        break L41;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                  L56: {
                                    if (((hj) this).field_d < 450) {
                                      break L56;
                                    } else {
                                      if (((hj) this).field_d < 500) {
                                        f.a(450 + (-((hj) this).field_d - -50), (byte) 111);
                                        break L41;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  if ((((hj) this).field_d ^ -1) >= -801) {
                                    break L41;
                                  } else {
                                    f.a(-800 + ((hj) this).field_d, (byte) 123);
                                    break L41;
                                  }
                                }
                              } else {
                                f.a(50 + -((hj) this).field_d, (byte) 97);
                                break L41;
                              }
                            } else {
                              ((hj) this).field_R.c(150, 260);
                              ((hj) this).field_f.c(150, 340);
                              f.a(((hj) this).field_d, (byte) 110);
                              break L41;
                            }
                          }
                        } else {
                          var12 = -600 + ((hj) this).field_nb;
                          if (var12 < -1) {
                            var13_int = var12 + -100;
                            if (-256 >= var13_int) {
                              L57: {
                                if (255 < var12) {
                                  var12 = 255;
                                  break L57;
                                } else {
                                  break L57;
                                }
                              }
                              ma.a(ib.field_d, 0, 0, 480, var12, var13_int);
                              break L41;
                            } else {
                              ib.field_d.a(0, 0);
                              break L41;
                            }
                          } else {
                            break L41;
                          }
                        }
                      }
                      L58: {
                        if (!ok.field_e) {
                          break L58;
                        } else {
                          pe.a(-112);
                          break L58;
                        }
                      }
                      return;
                    } else {
                      L59: {
                        if (var8 == 0) {
                          var8++;
                          break L59;
                        } else {
                          L60: {
                            var9_ref_ki.field_q = (float)((-1 + var8) * 59 + 148);
                            var9_ref_ki.field_B = 602.0f;
                            if (!((hj) this).field_gb[var8 + -1]) {
                              L61: {
                                if (((hj) this).field_lb[var8 + -1] < 0) {
                                  var10_ref = tl.field_b;
                                  break L61;
                                } else {
                                  var10_ref_le = ak.field_t[((hj) this).field_lb[-1 + var8]];
                                  break L61;
                                }
                              }
                              if ((((hj) this).field_cb[var8 - 1] ^ -1) <= -11) {
                                var10_ref.c((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B), (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y));
                                break L60;
                              } else {
                                var11 = var10_ref.field_m * ((hj) this).field_cb[var8 + -1] / 10;
                                var10_ref.d((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B) + (-var11 + var10_ref.field_m) / 2, (var10_ref.field_m - var11) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var11, var11);
                                break L60;
                              }
                            } else {
                              if ((((hj) this).field_cb[var8 + -1] ^ -1) <= -11) {
                                var9_ref_ki.a((byte) -97);
                                break L60;
                              } else {
                                var10 = var9_ref_ki.field_I.field_m * ((hj) this).field_cb[-1 + var8] / 10;
                                var9_ref_ki.field_I.d((-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_B + (float)var9_ref_ki.field_G), (-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var10, var10);
                                break L60;
                              }
                            }
                          }
                          var8++;
                          break L59;
                        }
                      }
                      var9_ref_ki = (ki) (Object) wd.field_h.d((byte) 63);
                      continue L33;
                    }
                  }
                }
              } else {
                L62: {
                  if (var7_int >= 480) {
                    var7_int = 0;
                    break L62;
                  } else {
                    break L62;
                  }
                }
                L63: {
                  var9 = ((hj) this).field_F[var7_int] >> -2130373532;
                  var10 = 80 + var8;
                  var11 = -var9 + ((hj) this).field_O;
                  if (80 != var10) {
                    if (-560 == (var10 ^ -1)) {
                      var6 = var11;
                      break L63;
                    } else {
                      break L63;
                    }
                  } else {
                    var5 = var11;
                    break L63;
                  }
                }
                ge.g(var10, var11, var9, var3, 120);
                this.a(30717, var10, var9, var2, var11, 5);
                this.a(30717, var10, var9, -50 - -var2, var11, 30);
                this.a(30717, var10, var9, var2 + -60, var11, 30);
                this.a(30717, var10, var9, -80 + var2, var11, 5);
                if (var9 > var4) {
                  var4 = var9;
                  var8++;
                  var7_int++;
                  continue L22;
                } else {
                  var8++;
                  var7_int++;
                  continue L22;
                }
              }
            }
          } else {
            var3 = pd.field_f[var2] - (dj.field_a[0].field_m >> -146205343);
            var4 = 0;
            var5 = 0;
            L64: while (true) {
              if (var5 >= mc.field_e[var2].length) {
                var2++;
                continue L17;
              } else {
                dj.field_a[mc.field_e[var2][var5]].c(var3, var4);
                var4 = var4 + (dj.field_a[var5].field_n + -1);
                var5++;
                continue L64;
              }
            }
          }
        }
    }

    hj() {
        int var1 = 0;
        ((hj) this).field_o = false;
        ((hj) this).field_H = 0;
        ((hj) this).field_A = 0;
        ((hj) this).field_n = 32;
        ((hj) this).field_I = 0;
        ((hj) this).field_m = new le(480, 100);
        ((hj) this).field_F = new int[480];
        ((hj) this).field_ib = -40;
        ((hj) this).field_p = 1;
        ((hj) this).field_w = 0;
        ((hj) this).field_C = false;
        ((hj) this).field_x = 1;
        rk.field_d = 5180;
        b.field_m = 212;
        h.field_a = 9170;
        sd.field_e = 4180;
        bh.field_g = 0;
        cl.field_d = 8768;
        jc.field_e = 9419;
        nj.field_b = 617;
        ((hj) this).field_M = 320;
        ((hj) this).field_jb = 6;
        ((hj) this).field_k = 480;
        ((hj) this).field_nb = 0;
        ((hj) this).field_O = ((hj) this).field_k - 14;
        uj.b(0);
        dc.field_c = 0;
        rb.a(dc.field_c, (byte) -58);
        if (aa.field_a == 0) {
            ((hj) this).field_ib = 95;
        } else {
            if (3 == aa.field_a) {
                ((hj) this).field_ib = 11;
            }
        }
        ((hj) this).field_r = 1;
        vi.a(true);
        fl.b(-114);
        ((hj) this).field_m.e();
        for (var1 = 0; (var1 ^ -1) > -135; var1++) {
            ge.b(pf.a((byte) 109, 480), pf.a((byte) -100, 100), 16777215);
        }
        ac.field_a.a((byte) 111);
        ((hj) this).field_N = new le(480, 200);
        ((hj) this).field_q = new le(480, 200);
        ((hj) this).field_A = 0;
        ((hj) this).field_I = 0;
        ((hj) this).field_j = new StringBuilder(7);
        ((hj) this).a(-19921);
        this.b((byte) -43);
        ((hj) this).field_z = 49150;
        h.a(0, true);
        ((hj) this).field_R = new le(340, 40);
        ((hj) this).field_f = new le(340, 40);
        for (var1 = 0; var1 < 10; var1++) {
            jf.field_f[var1] = 55 + (pf.a((byte) 119, 12) + -6);
            ll.field_c[var1] = pf.a((byte) -91, 4) + 2;
            lb.field_D[var1] = pf.a((byte) -101, 20);
        }
        ((hj) this).field_fb = new int[ua.field_w.length];
        gl.a(ua.field_w, 0, ((hj) this).field_fb, 0, ((hj) this).field_fb.length);
        ch.b(-112);
        pg.field_b = null;
        ((hj) this).field_W = jf.a(-2147483648);
        ((hj) this).field_J = jf.a(-2147483648);
        ((hj) this).field_cb = new int[5];
        ((hj) this).field_S = true;
        for (var1 = 0; ((hj) this).field_cb.length > var1; var1++) {
            ((hj) this).field_cb[var1] = ((hj) this).field_cb[var1] - var1 * 10;
        }
        ((hj) this).field_gb = new boolean[5];
        for (var1 = 0; ((hj) this).field_gb.length > var1; var1++) {
            ((hj) this).field_gb[var1] = true;
        }
        ((hj) this).field_lb = new int[5];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = 0L;
    }
}
