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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = MonkeyPuzzle2.field_F ? 1 : 0;
            var5 = -param1 + this.field_d;
            if (-51 >= (var5 ^ -1)) {
              break L1;
            } else {
              var4 = 2 * ((hc.field_h[param2][1] + (480 + -hc.field_h[param2][1])) * var5) / 100 + (-480 + hc.field_h[param2][1]);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = (-(60 * (-50 + var5)) + 6000) / 100;
            if (var6 > 5) {
              break L2;
            } else {
              var4 = hc.field_h[param2][1];
              if (var7 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          var4 = hc.field_h[param2][1] - Math.abs((int)((float)var6 * ia.a(true, 0.10000000149011612f * (float)(var5 + -50))));
          break L0;
        }
        var6 = 86 % ((param0 - 30) / 41);
        return var4;
    }

    private final void f(int param0) {
        L0: {
          L1: {
            this.field_g = this.field_g + (-4000 + pf.a((byte) 111, 8000));
            if (0 <= this.field_g) {
              break L1;
            } else {
              this.field_g = 65535 - this.field_g;
              if (!MonkeyPuzzle2.field_F) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (-65536 > (this.field_g ^ -1)) {
            this.field_g = this.field_g - 65536;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 120) {
            break L2;
          } else {
            this.field_q = (le) null;
            break L2;
          }
        }
    }

    final void d(int param0) {
        int var2 = 6 / ((param0 - -69) / 45);
        this.field_jb = 13;
        if (!ok.a(false)) {
            this.c((byte) 25);
        }
        this.field_u = 5;
        this.field_Y = 0;
        this.field_nb = 0;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = -this.field_W + (this.field_O - 90);
          if ((var2 ^ -1) > -1) {
            var2 = -var2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-201 > (var2 ^ -1)) {
            var2 = 200;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 -= 40;
          if (var2 < 0) {
            var2 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        var3 = var2 * 256 / 100;
        var4 = -var3 + 256;
        this.field_v = var4;
        var5 = 0;
        var6 = 15 / ((param0 - 63) / 32);
        L3: while (true) {
          L4: {
            if ((this.field_fb.length ^ -1) >= (var5 ^ -1)) {
              break L4;
            } else {
              var7 = ua.field_w[var5];
              var8 = ad.field_g[var5];
              this.field_fb[var5] = ch.a(ch.a(65280, var8) * var4 + var3 * ch.a(var7, 65280), 16711680) + ch.a(var4 * ch.a(var8, 16711935) + ch.a(var7, 16711935) * var3, -16711936) >> 1365668616;
              var5++;
              if (var9 != 0) {
                break L4;
              } else {
                if (var9 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0) {
        if (!(0 <= this.field_A)) {
            this.field_A = 0;
        }
        this.field_j.setLength(0);
        StringBuilder discarded$13 = this.field_j.append(Integer.toString(this.field_A));
        if (param0 != -19921) {
            this.i(-97);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        if (param0 != 30717) {
            this.b((byte) 65);
        }
        int var7 = param3 + this.field_O;
        if (param1 + param2 >= var7) {
            if (!(var7 - -param5 <= param1)) {
                if (!((param5 ^ -1) <= (-var7 + param1 ^ -1))) {
                    param4 = param4 + (-var7 + param1);
                }
                var8 = param1 - var7 + param2;
                if ((var8 ^ -1) < (param5 ^ -1)) {
                    param4 = param4 + (-param5 + var8);
                    var8 = param5;
                }
                if ((this.field_O ^ -1) >= (param4 + var8 ^ -1)) {
                    var8 = this.field_O - param4;
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
        L0: {
          if ((this.field_T ^ -1) <= -1) {
            break L0;
          } else {
            if (0 == this.field_U) {
              this.field_T = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param0 > 30) {
          L1: {
            L2: {
              if (3 > this.field_U) {
                break L2;
              } else {
                if (0 > this.field_T) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            this.field_U = this.field_U + this.field_T;
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 13816) {
            break L0;
          } else {
            this.c((byte) -114);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (var2 >= 5) {
              break L2;
            } else {
              this.field_gb[var2] = false;
              this.field_cb[var2] = 10 + 10 * var2;
              var2++;
              if (var3 != 0) {
                break L2;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        if (this.field_A > 0) {
            if (!this.field_o) {
                if (null == pg.field_b) {
                    pg.field_b = di.a(rk.field_d, 65494, h.field_a, nj.field_b, new int[]{this.field_A}, 41, cl.field_d, 3, (byte) 100);
                }
            }
        }
        int var2 = -67 / ((param0 - -63) / 42);
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) <= -6) {
                break L2;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (this.field_gb[var2]) {
                        break L4;
                      } else {
                        this.field_cb[var2] = this.field_cb[var2] - 1;
                        if (0 > this.field_cb[var2]) {
                          L5: {
                            stackOut_6_0 = this.field_gb;
                            stackOut_6_1 = var2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var2 >= -1 + wd.field_h.b(-81)) {
                              stackOut_8_0 = (boolean[]) ((Object) stackIn_8_0);
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = 0;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              stackIn_9_2 = stackOut_8_2;
                              break L5;
                            } else {
                              stackOut_7_0 = (boolean[]) ((Object) stackIn_7_0);
                              stackOut_7_1 = stackIn_7_1;
                              stackOut_7_2 = 1;
                              stackIn_9_0 = stackOut_7_0;
                              stackIn_9_1 = stackOut_7_1;
                              stackIn_9_2 = stackOut_7_2;
                              break L5;
                            }
                          }
                          stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                          if (!this.field_gb[var2]) {
                            break L3;
                          } else {
                            if (var2 > 0) {
                              this.field_cb[var2] = this.field_cb[-1 + var2] - 10;
                              if (var3 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.field_cb[var2] = this.field_cb[var2] + 1;
                    if ((this.field_cb[var2] ^ -1) >= -11) {
                      break L3;
                    } else {
                      this.field_cb[var2] = 10;
                      break L3;
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L1;
          }
          return;
        }
    }

    public static void c(int param0) {
        cj discarded$0 = null;
        if (param0 != 1903697041) {
            discarded$0 = hj.a((byte) -29, false);
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
          this.field_eb = this.field_eb + 1;
          if (-1 != (this.field_eb & 3 ^ -1)) {
            break L0;
          } else {
            this.field_p = this.field_p + 1;
            if ((this.field_p ^ -1) > -5) {
              break L0;
            } else {
              this.field_p = 0;
              break L0;
            }
          }
        }
        L1: {
          var2 = (float)this.field_eb / 200.0f;
          if (param0 == 340) {
            break L1;
          } else {
            this.c((byte) 81);
            break L1;
          }
        }
        L2: {
          if (var2 < 1.0f) {
            break L2;
          } else {
            L3: {
              this.field_eb = 0;
              this.field_Q = 80 + pf.a((byte) 25, 480);
              this.field_kb = pf.a((byte) 45, 200) + 100;
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
            ((hj) (this)).field_e = stackIn_9_1;
            this.field_b = -20 + -pf.a((byte) -91, 50);
            break L2;
          }
        }
        this.field_bb = (int)(var2 * (float)j.field_f[0].field_n);
        this.field_ob = (int)((float)(this.field_b + -this.field_kb) * var2) + this.field_kb;
        this.field_a = this.field_Q + (int)(var2 * (float)(-this.field_Q + this.field_e));
        this.field_i = (int)((float)j.field_f[0].field_m * var2);
    }

    private final void a(boolean param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = MonkeyPuzzle2.field_F ? 1 : 0;
            if (ok.a(param0)) {
              break L1;
            } else {
              L2: {
                if (fg.field_b <= 0) {
                  break L2;
                } else {
                  L3: {
                    if (0 < this.field_A) {
                      break L3;
                    } else {
                      l.field_f = 10;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  l.field_f = 6;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              l.field_f = 2;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if ((this.field_A ^ -1) < -1) {
              break L4;
            } else {
              if (-1 > (fg.field_b ^ -1)) {
                break L4;
              } else {
                l.field_f = 0;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L4;
                }
              }
            }
          }
          l.field_f = 7;
          break L0;
        }
        bl.a(50, uh.field_e);
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if ((param0 ^ -1) >= (MonkeyPuzzle2.field_D.field_h ^ -1)) {
                return true;
            }
            if (!(ol.field_g != null)) {
                return false;
            }
            if (!param1) {
                field_D = (ch) null;
            }
            int var2_int = ol.field_g.c(-110);
            if (!((var2_int ^ -1) >= -1)) {
                if (var2_int > param0 + -MonkeyPuzzle2.field_D.field_h) {
                    var2_int = param0 + -MonkeyPuzzle2.field_D.field_h;
                }
                ol.field_g.a(var2_int, param1, MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h);
                d.field_k = pf.a(0);
                MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + var2_int;
                if ((param0 ^ -1) < (MonkeyPuzzle2.field_D.field_h ^ -1)) {
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
        int var4 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (Math.random() > 0.9) {
            this.field_hb = pf.a((byte) 54, 2);
            this.f(120);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_V = false;
          if (param0 == 56) {
            break L1;
          } else {
            this.a(true);
            break L1;
          }
        }
        L2: {
          if ((this.field_hb ^ -1) == -1) {
            break L2;
          } else {
            var2 = 3.1415927410125732f;
            var3 = 0.75f * var2 + (float)(-this.field_g) / 65535.0f * var2 * 2.0f;
            this.field_B = this.field_B + ha.a((byte) 51, var3);
            this.field_Z = this.field_Z + ia.a(true, var3);
            this.field_V = true;
            break L2;
          }
        }
        L3: {
          L4: {
            if (69.0f < this.field_B) {
              break L4;
            } else {
              if (this.field_B >= 0.0f) {
                break L3;
              } else {
                this.field_B = 0.0f;
                this.field_V = false;
                this.f(120);
                if (var4 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
          }
          this.field_B = 69.0f;
          this.field_V = false;
          this.f(120);
          break L3;
        }
        L5: {
          L6: {
            if (this.field_Z < 0.0f) {
              break L6;
            } else {
              if (480.0f >= this.field_Z) {
                break L5;
              } else {
                this.field_V = false;
                this.field_Z = 480.0f;
                this.f(120);
                if (var4 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
          }
          this.field_V = false;
          this.field_Z = 0.0f;
          this.f(120);
          break L5;
        }
    }

    final void e(byte param0) {
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int dupTemp$18 = 0;
        int fieldTemp$19 = 0;
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
        boolean stackIn_26_0 = false;
        int stackIn_108_0 = 0;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int stackIn_131_0 = 0;
        Object stackIn_175_0 = null;
        Object stackIn_176_0 = null;
        Object stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_216_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_220_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_375_0 = 0;
        int stackIn_375_1 = 0;
        int stackIn_386_0 = 0;
        int stackIn_386_1 = 0;
        Object stackIn_395_0 = null;
        Object stackIn_396_0 = null;
        Object stackIn_397_0 = null;
        int stackIn_397_1 = 0;
        int stackIn_398_0 = 0;
        int stackIn_409_0 = 0;
        int stackIn_409_1 = 0;
        int stackIn_437_0 = 0;
        int stackIn_437_1 = 0;
        int stackIn_442_0 = 0;
        int stackIn_442_1 = 0;
        int stackIn_455_0 = 0;
        int stackIn_455_1 = 0;
        int stackIn_458_0 = 0;
        int stackIn_458_1 = 0;
        int stackIn_459_0 = 0;
        int stackIn_459_1 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        Object stackOut_113_0 = null;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_130_0 = 0;
        Object stackOut_174_0 = null;
        Object stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        Object stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        int stackOut_457_0 = 0;
        int stackOut_457_1 = 0;
        int stackOut_458_0 = 0;
        int stackOut_458_1 = 0;
        int stackOut_461_0 = 0;
        int stackOut_461_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_215_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_219_1 = 0;
        int stackOut_374_0 = 0;
        int stackOut_374_1 = 0;
        int stackOut_361_0 = 0;
        int stackOut_385_0 = 0;
        int stackOut_385_1 = 0;
        Object stackOut_394_0 = null;
        Object stackOut_396_0 = null;
        int stackOut_396_1 = 0;
        Object stackOut_395_0 = null;
        int stackOut_395_1 = 0;
        int stackOut_397_0 = 0;
        int stackOut_408_0 = 0;
        int stackOut_408_1 = 0;
        int stackOut_436_0 = 0;
        int stackOut_436_1 = 0;
        int stackOut_441_0 = 0;
        int stackOut_441_1 = 0;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (0 == kc.field_d) {
            break L0;
          } else {
            if (13 == this.field_jb) {
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
                this.field_w = 0;
                if (var13 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          this.field_w = this.field_w + 1;
          break L1;
        }
        L3: {
          var2 = 2 + 2 * (this.field_w / 5);
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
            this.field_z = this.field_z - 50 * var2;
            break L4;
          }
        }
        L5: {
          if (dl.field_c[97]) {
            this.field_z = this.field_z + var2 * 50;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-33678 < (this.field_z ^ -1)) {
            this.field_z = 33677;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (-64624 > (this.field_z ^ -1)) {
            this.field_z = 64623;
            break L7;
          } else {
            break L7;
          }
        }
        var3 = 0;
        L8: while (true) {
          L9: {
            L10: {
              if (!ba.a(-1)) {
                break L10;
              } else {
                stackOut_25_0 = hf.field_f.field_o;
                stackIn_131_0 = stackOut_25_0 ? 1 : 0;
                stackIn_26_0 = stackOut_25_0;
                if (var13 != 0) {
                  break L9;
                } else {
                  L11: {
                    if (stackIn_26_0) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          var4 = (oa.field_H ^ hf.field_f.field_d) % 8;
                          if (0 != var4) {
                            break L13;
                          } else {
                            cl.field_d = cl.field_d + rk.field_d;
                            h.field_a = h.field_a - 1;
                            if (var13 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (-2 == (var4 ^ -1)) {
                            break L14;
                          } else {
                            L15: {
                              if ((var4 ^ -1) == -3) {
                                break L15;
                              } else {
                                L16: {
                                  if (var4 == 3) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (var4 == 4) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (-6 == (var4 ^ -1)) {
                                            break L18;
                                          } else {
                                            L19: {
                                              if (6 == var4) {
                                                break L19;
                                              } else {
                                                if (-8 == (var4 ^ -1)) {
                                                  nj.field_b = nj.field_b - h.field_a;
                                                  rk.field_d = rk.field_d - 1;
                                                  if (var13 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L19;
                                                  }
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            nj.field_b = nj.field_b - rk.field_d;
                                            h.field_a = h.field_a - 1;
                                            if (var13 == 0) {
                                              break L12;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        rk.field_d = rk.field_d + 1;
                                        nj.field_b = nj.field_b + h.field_a;
                                        if (var13 == 0) {
                                          break L12;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    h.field_a = h.field_a + 1;
                                    nj.field_b = nj.field_b + rk.field_d;
                                    if (var13 == 0) {
                                      break L12;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                rk.field_d = rk.field_d + 1;
                                cl.field_d = cl.field_d - h.field_a;
                                if (var13 == 0) {
                                  break L12;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            h.field_a = h.field_a + 1;
                            cl.field_d = cl.field_d - rk.field_d;
                            if (var13 == 0) {
                              break L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                        rk.field_d = rk.field_d - 1;
                        cl.field_d = cl.field_d + h.field_a;
                        break L12;
                      }
                      L20: {
                        var4 = (hf.field_f.field_d ^ oa.field_H - -hf.field_f.field_A) % 5;
                        if (0 == var4) {
                          break L20;
                        } else {
                          L21: {
                            if ((var4 ^ -1) == -2) {
                              break L21;
                            } else {
                              L22: {
                                if (var4 == 2) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (-4 != (var4 ^ -1)) {
                                      break L23;
                                    } else {
                                      b.field_m = b.field_m + jc.field_e;
                                      sd.field_e = sd.field_e + 1;
                                      if (var13 == 0) {
                                        break L11;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  if ((var4 ^ -1) == -5) {
                                    b.field_m = b.field_m - jc.field_e;
                                    sd.field_e = sd.field_e - 1;
                                    if (var13 == 0) {
                                      break L11;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              jc.field_e = jc.field_e - 1;
                              b.field_m = b.field_m - sd.field_e;
                              if (var13 == 0) {
                                break L11;
                              } else {
                                break L21;
                              }
                            }
                          }
                          b.field_m = b.field_m + sd.field_e;
                          jc.field_e = jc.field_e + 1;
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L20;
                          }
                        }
                      }
                      bh.field_g = bh.field_g | jc.field_e + b.field_m << 1903697041;
                      break L11;
                    }
                  }
                  if (oa.field_H != 13) {
                    L24: {
                      if ((ec.field_d ^ -1) <= -3) {
                        L25: {
                          if (oa.field_H == 99) {
                            L26: {
                              this.field_o = true;
                              if (!dl.field_c[82]) {
                                break L26;
                              } else {
                                this.field_ib = this.field_ib - 1;
                                if (var13 == 0) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            this.field_O = this.field_O + 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        if (98 != oa.field_H) {
                          break L24;
                        } else {
                          L27: {
                            L28: {
                              if (dl.field_c[82]) {
                                break L28;
                              } else {
                                this.field_O = this.field_O - 1;
                                if (var13 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            this.field_ib = this.field_ib + 1;
                            break L27;
                          }
                          this.field_o = true;
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L29: {
                      L30: {
                        if (this.field_u == 0) {
                          break L30;
                        } else {
                          if ((this.field_u ^ -1) != -7) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        if (oa.field_H == 83) {
                          break L31;
                        } else {
                          if ((oa.field_H ^ -1) == -83) {
                            break L31;
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (!jj.b(true)) {
                        break L29;
                      } else {
                        if (-1 != (this.field_jb ^ -1)) {
                          break L29;
                        } else {
                          L32: {
                            if (!qb.field_b) {
                              break L32;
                            } else {
                              if (-1 < (ck.field_b ^ -1)) {
                                break L32;
                              } else {
                                break L29;
                              }
                            }
                          }
                          this.field_u = 1;
                          this.field_Y = 0;
                          this.field_T = 1;
                          cj.a((byte) -18, ke.field_h[1]);
                          break L29;
                        }
                      }
                    }
                    L33: {
                      if (-3 >= (ec.field_d ^ -1)) {
                        L34: {
                          if (oa.field_H != 26) {
                            break L34;
                          } else {
                            if (dc.field_c <= 0) {
                              break L34;
                            } else {
                              this.field_M = 320;
                              this.field_k = 480;
                              this.field_O = -14 + this.field_k;
                              uj.b(0);
                              dc.field_c = dc.field_c - 1;
                              rb.a(dc.field_c, (byte) -58);
                              this.field_o = true;
                              break L34;
                            }
                          }
                        }
                        L35: {
                          if (oa.field_H != 36) {
                            break L35;
                          } else {
                            this.field_jb = 1;
                            this.field_o = true;
                            this.field_d = 0;
                            cj.a((byte) 124, ke.field_h[31]);
                            break L35;
                          }
                        }
                        L36: {
                          if (oa.field_H == 39) {
                            L37: {
                              if (ok.field_e) {
                                stackOut_107_0 = 0;
                                stackIn_108_0 = stackOut_107_0;
                                break L37;
                              } else {
                                stackOut_106_0 = 1;
                                stackIn_108_0 = stackOut_106_0;
                                break L37;
                              }
                            }
                            ok.field_e = stackIn_108_0 != 0;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        L38: {
                          if (-28 != (oa.field_H ^ -1)) {
                            break L38;
                          } else {
                            this.field_M = 320;
                            this.field_k = 480;
                            this.field_O = -14 + this.field_k;
                            uj.b(0);
                            dc.field_c = dc.field_c + 1;
                            rb.a(dc.field_c, (byte) -58);
                            this.field_o = true;
                            break L38;
                          }
                        }
                        L39: {
                          if (oa.field_H == 33) {
                            L40: {
                              stackOut_113_0 = this;
                              stackIn_115_0 = stackOut_113_0;
                              stackIn_114_0 = stackOut_113_0;
                              if (this.field_S) {
                                stackOut_115_0 = this;
                                stackOut_115_1 = 0;
                                stackIn_116_0 = stackOut_115_0;
                                stackIn_116_1 = stackOut_115_1;
                                break L40;
                              } else {
                                stackOut_114_0 = this;
                                stackOut_114_1 = 1;
                                stackIn_116_0 = stackOut_114_0;
                                stackIn_116_1 = stackOut_114_1;
                                break L40;
                              }
                            }
                            ((hj) (this)).field_S = stackIn_116_1 != 0;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        L41: {
                          if (-10 == (oa.field_H ^ -1)) {
                            this.field_o = true;
                            el.a(true, 0);
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        L42: {
                          if ((oa.field_H ^ -1) != -11) {
                            break L42;
                          } else {
                            this.field_o = true;
                            el.a(true, 1);
                            break L42;
                          }
                        }
                        L43: {
                          if (oa.field_H != 11) {
                            break L43;
                          } else {
                            this.field_o = true;
                            el.a(true, 2);
                            break L43;
                          }
                        }
                        if ((oa.field_H ^ -1) == -13) {
                          this.field_o = true;
                          el.a(true, 3);
                          break L33;
                        } else {
                          break L33;
                        }
                      } else {
                        break L33;
                      }
                    }
                    if ((oa.field_H ^ -1) == -85) {
                      var3 = 1;
                      if (var13 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    } else {
                      continue L8;
                    }
                  } else {
                    L44: {
                      L45: {
                        if (13 == this.field_jb) {
                          break L45;
                        } else {
                          l.field_f = 1;
                          if (var13 == 0) {
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                      this.a(false);
                      break L44;
                    }
                    pg.field_d[l.field_f].c((byte) 73);
                    pg.field_d[l.field_f].a(false, false);
                    ej.field_b = 0;
                    return;
                  }
                }
              }
            }
            stackOut_130_0 = ec.field_d;
            stackIn_131_0 = stackOut_130_0;
            break L9;
          }
          L46: {
            if (stackIn_131_0 < 2) {
              break L46;
            } else {
              if (!dl.field_c[48]) {
                break L46;
              } else {
                this.field_o = true;
                e.a(255, (byte) 40, 0);
                break L46;
              }
            }
          }
          L47: {
            if (-3 < (ec.field_d ^ -1)) {
              break L47;
            } else {
              if (dl.field_c[68]) {
                this.field_o = true;
                e.a(254, (byte) 40, 1);
                break L47;
              } else {
                break L47;
              }
            }
          }
          L48: {
            L49: {
              L50: {
                L51: {
                  L52: {
                    L53: {
                      L54: {
                        L55: {
                          L56: {
                            L57: {
                              mk.f(126);
                              this.field_H = this.field_H + 1;
                              var7 = this.field_jb;
                              if ((var7 ^ -1) != -1) {
                                break L57;
                              } else {
                                if (var13 == 0) {
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            L58: {
                              if (var7 != 6) {
                                break L58;
                              } else {
                                if (var13 == 0) {
                                  break L55;
                                } else {
                                  break L58;
                                }
                              }
                            }
                            if (var7 == 4) {
                              break L54;
                            } else {
                              if (13 == var7) {
                                break L53;
                              } else {
                                L59: {
                                  if (var7 != 1) {
                                    break L59;
                                  } else {
                                    if (var13 == 0) {
                                      break L52;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                                if (-3 == (var7 ^ -1)) {
                                  break L51;
                                } else {
                                  if (var7 == 3) {
                                    break L50;
                                  } else {
                                    if ((var7 ^ -1) != -6) {
                                      break L48;
                                    } else {
                                      if (var13 == 0) {
                                        break L49;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L60: {
                            this.i(0);
                            hh.f(8500);
                            eb.d((byte) -93);
                            ff.a(this.field_O, -6961);
                            if (!ub.field_a) {
                              break L60;
                            } else {
                              this.field_J = jf.a(-2147483648);
                              break L60;
                            }
                          }
                          L61: {
                            if ((gb.field_o ^ -1) != (this.field_r ^ -1)) {
                              break L61;
                            } else {
                              if (this.field_t <= 500) {
                                break L61;
                              } else {
                                if (ok.field_d) {
                                  break L61;
                                } else {
                                  if (!hd.field_u.e(11253)) {
                                    break L61;
                                  } else {
                                    al.c((byte) -103);
                                    this.field_t = 0;
                                    this.field_r = -1;
                                    break L61;
                                  }
                                }
                              }
                            }
                          }
                          L62: {
                            this.field_t = this.field_t + 1;
                            if (this.field_d % 800 != 2) {
                              break L62;
                            } else {
                              if (500 < this.field_t) {
                                a.b(92);
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                          }
                          L63: {
                            this.d((byte) 56);
                            if (0 != (15 & this.field_d)) {
                              break L63;
                            } else {
                              if (!this.field_V) {
                                break L63;
                              } else {
                                fieldTemp$10 = this.field_ab + 1;
                                this.field_ab = this.field_ab + 1;
                                if ((fieldTemp$10 ^ -1) != -5) {
                                  break L63;
                                } else {
                                  this.field_ab = 0;
                                  break L63;
                                }
                              }
                            }
                          }
                          L64: {
                            if (13 <= (127 & this.field_d)) {
                              break L64;
                            } else {
                              if ((3 & this.field_d) != 0) {
                                break L64;
                              } else {
                                fieldTemp$11 = this.field_x + 1;
                                this.field_x = this.field_x + 1;
                                if (fieldTemp$11 != 4) {
                                  break L64;
                                } else {
                                  this.field_x = 0;
                                  break L64;
                                }
                              }
                            }
                          }
                          L65: {
                            fieldTemp$12 = this.field_G;
                            this.field_G = this.field_G - 1;
                            if (-1 != (fieldTemp$12 ^ -1)) {
                              break L65;
                            } else {
                              L66: {
                                stackOut_174_0 = this;
                                stackIn_176_0 = stackOut_174_0;
                                stackIn_175_0 = stackOut_174_0;
                                if (Math.random() <= 0.9) {
                                  stackOut_176_0 = this;
                                  stackOut_176_1 = 0;
                                  stackIn_177_0 = stackOut_176_0;
                                  stackIn_177_1 = stackOut_176_1;
                                  break L66;
                                } else {
                                  stackOut_175_0 = this;
                                  stackOut_175_1 = 1;
                                  stackIn_177_0 = stackOut_175_0;
                                  stackIn_177_1 = stackOut_175_1;
                                  break L66;
                                }
                              }
                              ((hj) (this)).field_C = stackIn_177_1 != 0;
                              this.field_G = 25;
                              this.field_X = 172 + pf.a((byte) -115, 232);
                              this.field_h = pf.a((byte) 76, 64);
                              break L65;
                            }
                          }
                          L67: {
                            kj.a(var3 != 0, -1);
                            if (!qb.field_b) {
                              break L67;
                            } else {
                              if ((ck.field_b ^ -1) > -1) {
                                break L67;
                              } else {
                                this.field_d = this.field_d + 2;
                                if (var13 == 0) {
                                  break L48;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          L68: {
                            this.a(-19921);
                            var4 = 15;
                            if (1 != this.field_u) {
                              break L68;
                            } else {
                              var4 = 3;
                              break L68;
                            }
                          }
                          L69: {
                            L70: {
                              if (0 != (this.field_d & var4)) {
                                break L70;
                              } else {
                                var7 = ba.field_a[this.field_u].length;
                                this.a((byte) 82);
                                fieldTemp$13 = this.field_Y + 1;
                                this.field_Y = this.field_Y + 1;
                                if (var7 == fieldTemp$13) {
                                  L71: {
                                    if (1 == this.field_u) {
                                      var8 = 0;
                                      var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                                      L72: while (true) {
                                        L73: {
                                          if (var9_ref_ki == null) {
                                            break L73;
                                          } else {
                                            stackOut_191_0 = 0;
                                            stackOut_191_1 = var8;
                                            stackIn_201_0 = stackOut_191_0;
                                            stackIn_201_1 = stackOut_191_1;
                                            stackIn_192_0 = stackOut_191_0;
                                            stackIn_192_1 = stackOut_191_1;
                                            if (var13 != 0) {
                                              break L69;
                                            } else {
                                              L74: {
                                                L75: {
                                                  if (stackIn_192_0 == stackIn_192_1) {
                                                    var8++;
                                                    if (var13 == 0) {
                                                      break L74;
                                                    } else {
                                                      break L75;
                                                    }
                                                  } else {
                                                    break L75;
                                                  }
                                                }
                                                this.field_lb[-1 + var8] = var9_ref_ki.field_l;
                                                var8++;
                                                if (-7 == (var8 ^ -1)) {
                                                  break L73;
                                                } else {
                                                  break L74;
                                                }
                                              }
                                              var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                                              if (var13 == 0) {
                                                continue L72;
                                              } else {
                                                break L73;
                                              }
                                            }
                                          }
                                        }
                                        this.field_r = gb.field_o;
                                        var9_double = (double)this.field_z * 6.283185307179586 / 65535.0;
                                        var11 = (int)(10000.0 * Math.cos(var9_double));
                                        var12 = (int)(Math.sin(var9_double) * 10000.0);
                                        n.a(var12, var11, this.field_M, this.field_k, -301);
                                        this.field_T = -1;
                                        this.field_u = 0;
                                        this.g(13816);
                                        break L71;
                                      }
                                    } else {
                                      break L71;
                                    }
                                  }
                                  this.field_Y = 0;
                                  break L70;
                                } else {
                                  break L70;
                                }
                              }
                            }
                            stackOut_200_0 = gb.field_o ^ -1;
                            stackOut_200_1 = -1;
                            stackIn_201_0 = stackOut_200_0;
                            stackIn_201_1 = stackOut_200_1;
                            break L69;
                          }
                          L76: {
                            L77: {
                              if (stackIn_201_0 == stackIn_201_1) {
                                break L77;
                              } else {
                                this.field_d = this.field_d + 2;
                                if (var13 == 0) {
                                  break L76;
                                } else {
                                  break L77;
                                }
                              }
                            }
                            this.field_jb = 1;
                            this.field_d = 0;
                            cj.a((byte) 112, ke.field_h[31]);
                            break L76;
                          }
                          var5 = pf.a((byte) -119, 480);
                          var6 = 2147483647;
                          var7 = var5 - 3;
                          L78: while (true) {
                            L79: {
                              L80: {
                                L81: {
                                  if (var5 + 3 <= var7) {
                                    break L81;
                                  } else {
                                    stackOut_207_0 = 0;
                                    stackOut_207_1 = var7;
                                    stackIn_459_0 = stackOut_207_0;
                                    stackIn_459_1 = stackOut_207_1;
                                    stackIn_208_0 = stackOut_207_0;
                                    stackIn_208_1 = stackOut_207_1;
                                    if (var13 != 0) {
                                      L82: while (true) {
                                        if (stackIn_459_0 <= stackIn_459_1) {
                                          break L80;
                                        } else {
                                          stackOut_457_0 = var6;
                                          stackOut_457_1 = this.field_F[var7];
                                          stackIn_220_0 = stackOut_457_0;
                                          stackIn_220_1 = stackOut_457_1;
                                          stackIn_458_0 = stackOut_457_0;
                                          stackIn_458_1 = stackOut_457_1;
                                          if (var13 != 0) {
                                            break L79;
                                          } else {
                                            stackOut_458_0 = stackIn_458_0;
                                            stackOut_458_1 = stackIn_458_1;
                                            stackIn_455_0 = stackOut_458_0;
                                            stackIn_455_1 = stackOut_458_1;
                                            L83: {
                                              if (stackIn_455_0 <= stackIn_455_1) {
                                                break L83;
                                              } else {
                                                var6 = this.field_F[var7];
                                                break L83;
                                              }
                                            }
                                            var7++;
                                            if (var13 == 0) {
                                              stackOut_461_0 = 480;
                                              stackOut_461_1 = var7;
                                              stackIn_459_0 = stackOut_461_0;
                                              stackIn_459_1 = stackOut_461_1;
                                              continue L82;
                                            } else {
                                              break L80;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L84: {
                                        if (stackIn_208_0 >= stackIn_208_1) {
                                          break L84;
                                        } else {
                                          if ((var7 ^ -1) > -481) {
                                            this.field_F[var7] = this.field_F[var7] + this.field_n;
                                            break L84;
                                          } else {
                                            break L84;
                                          }
                                        }
                                      }
                                      var7++;
                                      if (var13 == 0) {
                                        continue L78;
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                }
                                var7 = 0;
                                L85: while (true) {
                                  if (480 <= var7) {
                                    break L80;
                                  } else {
                                    stackOut_215_0 = var6;
                                    stackOut_215_1 = this.field_F[var7];
                                    stackIn_220_0 = stackOut_215_0;
                                    stackIn_220_1 = stackOut_215_1;
                                    stackIn_216_0 = stackOut_215_0;
                                    stackIn_216_1 = stackOut_215_1;
                                    if (var13 != 0) {
                                      break L79;
                                    } else {
                                      L86: {
                                        if (stackIn_216_0 <= stackIn_216_1) {
                                          break L86;
                                        } else {
                                          var6 = this.field_F[var7];
                                          break L86;
                                        }
                                      }
                                      var7++;
                                      if (var13 == 0) {
                                        continue L85;
                                      } else {
                                        break L80;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_219_0 = var6 >> 1640774308 ^ -1;
                              stackOut_219_1 = -1;
                              stackIn_220_0 = stackOut_219_0;
                              stackIn_220_1 = stackOut_219_1;
                              break L79;
                            }
                            L87: {
                              if (stackIn_220_0 < stackIn_220_1) {
                                var7 = 0;
                                L88: while (true) {
                                  L89: {
                                    L90: {
                                      if ((var7 ^ -1) <= -481) {
                                        break L90;
                                      } else {
                                        this.field_F[var7] = this.field_F[var7] - var6;
                                        var7++;
                                        if (var13 != 0) {
                                          break L89;
                                        } else {
                                          if (var13 == 0) {
                                            continue L88;
                                          } else {
                                            break L90;
                                          }
                                        }
                                      }
                                    }
                                    this.field_O = this.field_O - (var6 >> 1590750532);
                                    this.field_k = this.field_O - -14;
                                    break L89;
                                  }
                                  this.e(125);
                                  break L87;
                                }
                              } else {
                                break L87;
                              }
                            }
                            L91: {
                              L92: {
                                if (this.field_u != 0) {
                                  break L92;
                                } else {
                                  if (50 > -90 + this.field_O - this.field_W) {
                                    break L91;
                                  } else {
                                    break L92;
                                  }
                                }
                              }
                              if ((this.field_u ^ -1) != -7) {
                                break L48;
                              } else {
                                if (-90 + this.field_O + -this.field_W > 50) {
                                  this.field_u = 0;
                                  nf.a(aa.field_a, (byte) 115, 8, 1);
                                  if (var13 == 0) {
                                    break L48;
                                  } else {
                                    break L91;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            this.field_u = 6;
                            ve.a(125, 8, 0, je.field_i);
                            if (var13 == 0) {
                              break L48;
                            } else {
                              break L55;
                            }
                          }
                        }
                        L93: {
                          if ((this.field_d & 15) == 0) {
                            fieldTemp$14 = this.field_Y + 1;
                            this.field_Y = this.field_Y + 1;
                            if (fieldTemp$14 == cm.field_F.length) {
                              this.field_Y = 0;
                              break L93;
                            } else {
                              break L93;
                            }
                          } else {
                            break L93;
                          }
                        }
                        L94: {
                          if (this.field_d <= 450) {
                            break L94;
                          } else {
                            this.field_jb = 0;
                            this.field_d = 0;
                            if (var13 == 0) {
                              break L48;
                            } else {
                              break L94;
                            }
                          }
                        }
                        this.field_d = this.field_d + 2;
                        if (var13 == 0) {
                          break L48;
                        } else {
                          break L54;
                        }
                      }
                      L95: {
                        if (850 < this.field_d) {
                          break L95;
                        } else {
                          L96: {
                            if (0 != (15 & this.field_d)) {
                              break L96;
                            } else {
                              if (-201 <= (this.field_d ^ -1)) {
                                break L96;
                              } else {
                                fieldTemp$15 = this.field_Y + 1;
                                this.field_Y = this.field_Y + 1;
                                if ((fieldTemp$15 ^ -1) != (cm.field_F.length ^ -1)) {
                                  break L96;
                                } else {
                                  this.field_Y = 0;
                                  break L96;
                                }
                              }
                            }
                          }
                          L97: {
                            L98: {
                              if ((this.field_d ^ -1) >= -451) {
                                break L98;
                              } else {
                                if (-4 == (aa.field_a ^ -1)) {
                                  break L97;
                                } else {
                                  break L98;
                                }
                              }
                            }
                            L99: {
                              if (450 >= this.field_d) {
                                break L99;
                              } else {
                                ie.a(aa.field_a + 1, -28);
                                break L99;
                              }
                            }
                            this.field_d = this.field_d + 2;
                            if (var13 == 0) {
                              break L48;
                            } else {
                              break L97;
                            }
                          }
                          this.field_jb = 3;
                          this.field_d = 0;
                          if (var13 == 0) {
                            break L48;
                          } else {
                            break L95;
                          }
                        }
                      }
                      this.field_d = 0;
                      this.field_jb = 3;
                      if (var13 == 0) {
                        break L48;
                      } else {
                        break L53;
                      }
                    }
                    L100: {
                      if (this.field_nb == 0) {
                        bl.a(50, bl.field_g);
                        al.c((byte) -84);
                        break L100;
                      } else {
                        break L100;
                      }
                    }
                    L101: {
                      this.field_nb = this.field_nb + 4;
                      if (-2121 > (this.field_nb ^ -1)) {
                        L102: {
                          L103: {
                            bl.a(50, uh.field_e);
                            if (ok.a(false)) {
                              break L103;
                            } else {
                              L104: {
                                if (0 >= this.field_P) {
                                  break L104;
                                } else {
                                  l.field_f = 6;
                                  if (var13 == 0) {
                                    break L102;
                                  } else {
                                    break L104;
                                  }
                                }
                              }
                              l.field_f = 2;
                              if (var13 == 0) {
                                break L102;
                              } else {
                                break L103;
                              }
                            }
                          }
                          L105: {
                            L106: {
                              if (0 < this.field_P) {
                                break L106;
                              } else {
                                if ((this.field_A ^ -1) >= -1) {
                                  break L105;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            l.field_f = 7;
                            if (var13 == 0) {
                              break L102;
                            } else {
                              break L105;
                            }
                          }
                          l.field_f = 0;
                          bl.a(50, uh.field_e);
                          break L102;
                        }
                        pg.field_d[l.field_f].c((byte) -98);
                        ej.field_b = 0;
                        break L101;
                      } else {
                        break L101;
                      }
                    }
                    L107: {
                      if ((this.field_d & 15) == 0) {
                        var7 = ba.field_a[this.field_u].length;
                        this.a((byte) 115);
                        fieldTemp$16 = this.field_Y + 1;
                        this.field_Y = this.field_Y + 1;
                        if ((fieldTemp$16 ^ -1) != (var7 ^ -1)) {
                          break L107;
                        } else {
                          this.field_Y = 3;
                          break L107;
                        }
                      } else {
                        break L107;
                      }
                    }
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                      break L48;
                    } else {
                      break L52;
                    }
                  }
                  L108: {
                    if (this.field_d != 0) {
                      break L108;
                    } else {
                      L109: {
                        this.field_I = (4800000 - (-this.field_O + 480) * 30000) / 480;
                        if (0 <= this.field_I) {
                          break L109;
                        } else {
                          this.field_I = 0;
                          break L109;
                        }
                      }
                      L110: {
                        this.field_Y = 0;
                        bl.a(50, kb.field_d);
                        this.field_R.e();
                        lb.a(0, 340, (byte) 24, wc.field_e, 0, 40);
                        sb.field_r.a(gg.a(new String[]{Integer.toString(10000)}, sc.field_d, true), 170, sb.field_r.field_C, 1, -1);
                        this.field_f.e();
                        lb.a(0, 340, (byte) -14, wc.field_e, 0, 40);
                        sb.field_r.a(gg.a(new String[]{Integer.toString(this.field_I)}, ff.field_a, true), 170, sb.field_r.field_C, 1, -1);
                        ac.field_a.a((byte) 119);
                        if (dc.field_c == 19) {
                          e.a(254, (byte) 40, 1);
                          break L110;
                        } else {
                          break L110;
                        }
                      }
                      this.field_mb = 0.0f;
                      this.field_s = 1 + (-13 + this.field_k - ba.field_a[0][0].field_n) / 30;
                      cj.a((byte) -33, ke.field_h[18]);
                      break L108;
                    }
                  }
                  L111: {
                    if (0 != (this.field_d & 15)) {
                      break L111;
                    } else {
                      var7 = ba.field_a[this.field_u].length;
                      this.a((byte) 75);
                      fieldTemp$17 = this.field_Y + 1;
                      this.field_Y = this.field_Y + 1;
                      if (fieldTemp$17 == var7) {
                        L112: {
                          if (this.field_u == 2) {
                            break L112;
                          } else {
                            this.field_Y = 0;
                            if (var13 == 0) {
                              break L111;
                            } else {
                              break L112;
                            }
                          }
                        }
                        this.field_Y = 2;
                        break L111;
                      } else {
                        break L111;
                      }
                    }
                  }
                  L113: {
                    nh.b((byte) 107);
                    ff.a(this.field_O, -6961);
                    hh.f(8500);
                    this.d((byte) 56);
                    if (this.field_u == 2) {
                      break L113;
                    } else {
                      if ((hl.a(1, -ba.field_a[0][0].field_n + (-13 + this.field_k), this.field_M + -100) ^ -1) > -101) {
                        this.field_u = 2;
                        cj.a((byte) -116, ke.field_h[19]);
                        break L113;
                      } else {
                        break L113;
                      }
                    }
                  }
                  L114: {
                    rc.a(this.field_mb, this.field_s, (byte) -111);
                    if (0 <= mh.field_D) {
                      break L114;
                    } else {
                      if (-3 != (this.field_u ^ -1)) {
                        break L114;
                      } else {
                        L115: {
                          if ((vj.a(dc.field_c, 1) ^ -1) != (aa.field_a ^ -1)) {
                            break L115;
                          } else {
                            ie.a(aa.field_a, 119);
                            this.field_jb = 2;
                            this.field_d = 0;
                            if (var13 == 0) {
                              break L48;
                            } else {
                              break L115;
                            }
                          }
                        }
                        L116: {
                          this.field_jb = 4;
                          this.field_d = 0;
                          if ((dc.field_c ^ -1) != -20) {
                            break L116;
                          } else {
                            bl.a(50, wf.field_h);
                            if (var13 == 0) {
                              break L48;
                            } else {
                              break L116;
                            }
                          }
                        }
                        bl.a(50, b.field_l);
                        if (var13 == 0) {
                          break L48;
                        } else {
                          break L114;
                        }
                      }
                    }
                  }
                  L117: {
                    if (2 != this.field_u) {
                      break L117;
                    } else {
                      this.field_mb = this.field_mb + 0.10000000149011612f;
                      if (1.0f < this.field_mb) {
                        this.field_mb = 0.0f;
                        this.field_s = this.field_s - 1;
                        nf.n(-48);
                        break L117;
                      } else {
                        break L117;
                      }
                    }
                  }
                  this.field_d = this.field_d + 2;
                  if (var13 == 0) {
                    break L48;
                  } else {
                    break L51;
                  }
                }
                L118: {
                  if (-101 <= (this.field_d ^ -1)) {
                    break L118;
                  } else {
                    this.field_jb = 3;
                    this.field_d = 0;
                    if (var13 == 0) {
                      break L48;
                    } else {
                      break L118;
                    }
                  }
                }
                this.field_d = this.field_d + 2;
                if (var13 == 0) {
                  break L48;
                } else {
                  break L50;
                }
              }
              L119: {
                if (0 == this.field_d) {
                  L120: {
                    L121: {
                      this.field_A = this.field_A + (10000 - -this.field_I);
                      var7 = this.field_I + 10000;
                      var8 = ej.field_b % 3;
                      if (0 != var8) {
                        break L121;
                      } else {
                        cl.field_d = cl.field_d + var7;
                        if (var13 == 0) {
                          break L120;
                        } else {
                          break L121;
                        }
                      }
                    }
                    L122: {
                      if (var8 != 1) {
                        break L122;
                      } else {
                        nj.field_b = nj.field_b - var7;
                        if (var13 == 0) {
                          break L120;
                        } else {
                          break L122;
                        }
                      }
                    }
                    var9 = var7 / 3;
                    cl.field_d = cl.field_d + var9;
                    nj.field_b = nj.field_b - (var7 - var9);
                    break L120;
                  }
                  L123: {
                    L124: {
                      this.a(-19921);
                      this.field_k = 480;
                      this.field_M = 320;
                      this.field_I = -1;
                      this.field_O = -14 + this.field_k;
                      uj.b(0);
                      vi.a(true);
                      dc.field_c = dc.field_c + 1;
                      rb.a(dc.field_c, (byte) -58);
                      this.field_r = 1;
                      this.field_t = 0;
                      dupTemp$18 = jf.a(-2147483648);
                      this.field_W = dupTemp$18;
                      this.field_J = dupTemp$18;
                      this.e(102);
                      this.field_u = 0;
                      fl.b(124);
                      this.a(-19921);
                      if (-1 != (aa.field_a ^ -1)) {
                        break L124;
                      } else {
                        this.field_ib = 95;
                        if (var13 == 0) {
                          break L123;
                        } else {
                          break L124;
                        }
                      }
                    }
                    if (3 != aa.field_a) {
                      break L123;
                    } else {
                      this.field_ib = 11;
                      break L123;
                    }
                  }
                  if (20 != dc.field_c) {
                    break L119;
                  } else {
                    this.field_u = 4;
                    this.field_jb = 5;
                    if (var13 == 0) {
                      break L48;
                    } else {
                      break L119;
                    }
                  }
                } else {
                  break L119;
                }
              }
              L125: {
                if ((this.field_d ^ -1) < -101) {
                  this.field_jb = 0;
                  break L125;
                } else {
                  break L125;
                }
              }
              this.field_d = this.field_d + 2;
              if (var13 == 0) {
                break L48;
              } else {
                break L49;
              }
            }
            L126: {
              if (-1051 <= (this.field_d ^ -1)) {
                break L126;
              } else {
                L127: {
                  L128: {
                    if (!ok.a(false)) {
                      break L128;
                    } else {
                      l.field_f = 7;
                      if (var13 == 0) {
                        break L127;
                      } else {
                        break L128;
                      }
                    }
                  }
                  L129: {
                    if (0 < this.field_P) {
                      break L129;
                    } else {
                      l.field_f = 2;
                      this.c((byte) -115);
                      if (var13 == 0) {
                        break L127;
                      } else {
                        break L129;
                      }
                    }
                  }
                  l.field_f = 6;
                  this.c((byte) -109);
                  break L127;
                }
                pg.field_d[l.field_f].c((byte) 93);
                this.field_nb = 0;
                ej.field_b = 0;
                this.field_d = 0;
                bl.a(50, uh.field_e);
                break L126;
              }
            }
            L130: {
              if (-1 != (this.field_d & 15 ^ -1)) {
                break L130;
              } else {
                var7 = ba.field_a[this.field_u].length;
                fieldTemp$19 = this.field_Y + 1;
                this.field_Y = this.field_Y + 1;
                if ((fieldTemp$19 ^ -1) != (var7 ^ -1)) {
                  break L130;
                } else {
                  this.field_Y = 0;
                  break L130;
                }
              }
            }
            this.field_d = this.field_d + 2;
            break L48;
          }
          L131: {
            L132: {
              L133: {
                L134: {
                  L135: {
                    if (!this.field_l) {
                      var4 = this.field_d % 480;
                      var5 = 0;
                      L136: while (true) {
                        if (480 <= var5) {
                          break L134;
                        } else {
                          var6 = 1 + var4;
                          var7 = var4;
                          stackOut_374_0 = -481;
                          stackOut_374_1 = var6 ^ -1;
                          stackIn_409_0 = stackOut_374_0;
                          stackIn_409_1 = stackOut_374_1;
                          stackIn_375_0 = stackOut_374_0;
                          stackIn_375_1 = stackOut_374_1;
                          if (var13 != 0) {
                            break L132;
                          } else {
                            L137: {
                              if (stackIn_375_0 >= stackIn_375_1) {
                                var6 = -480 + var6;
                                break L137;
                              } else {
                                break L137;
                              }
                            }
                            L138: {
                              if (480 > var7) {
                                break L138;
                              } else {
                                var7 = var7 + -480;
                                break L138;
                              }
                            }
                            L139: {
                              var8 = this.field_F[var6];
                              var9 = this.field_F[var7];
                              if ((var8 ^ -1) < (var9 ^ -1)) {
                                break L139;
                              } else {
                                var10 = var9 + var8 >> 1049476001;
                                var9 = var10;
                                var8 = var10;
                                this.field_F[var6] = var8;
                                this.field_F[var7] = var9;
                                break L139;
                              }
                            }
                            var4++;
                            var5++;
                            if (var13 == 0) {
                              continue L136;
                            } else {
                              break L135;
                            }
                          }
                        }
                      }
                    } else {
                      var4 = this.field_d % 480;
                      var5 = 0;
                      L140: while (true) {
                        L141: {
                          if (var5 >= 480) {
                            break L141;
                          } else {
                            var6 = var4 - 1;
                            var7 = var4;
                            stackOut_361_0 = var6;
                            stackIn_398_0 = stackOut_361_0;
                            stackIn_362_0 = stackOut_361_0;
                            if (var13 != 0) {
                              break L133;
                            } else {
                              L142: {
                                if (stackIn_362_0 >= 0) {
                                  break L142;
                                } else {
                                  var6 = var6 + 480;
                                  break L142;
                                }
                              }
                              L143: {
                                if ((var7 ^ -1) > -1) {
                                  var7 = 480 + var7;
                                  break L143;
                                } else {
                                  break L143;
                                }
                              }
                              L144: {
                                var8 = this.field_F[var6];
                                var9 = this.field_F[var7];
                                if ((var8 ^ -1) < (var9 ^ -1)) {
                                  break L144;
                                } else {
                                  var10 = var8 + var9 >> -890035327;
                                  var8 = var10;
                                  var9 = var10;
                                  this.field_F[var6] = var8;
                                  this.field_F[var7] = var9;
                                  break L144;
                                }
                              }
                              var5++;
                              var4--;
                              if (var13 == 0) {
                                continue L140;
                              } else {
                                break L141;
                              }
                            }
                          }
                        }
                        if (var13 == 0) {
                          break L134;
                        } else {
                          break L135;
                        }
                      }
                    }
                  }
                  var4 = this.field_d % 480;
                  var5 = 0;
                  L145: while (true) {
                    if (480 <= var5) {
                      break L134;
                    } else {
                      var6 = 1 + var4;
                      var7 = var4;
                      stackOut_385_0 = -481;
                      stackOut_385_1 = var6 ^ -1;
                      stackIn_409_0 = stackOut_385_0;
                      stackIn_409_1 = stackOut_385_1;
                      stackIn_386_0 = stackOut_385_0;
                      stackIn_386_1 = stackOut_385_1;
                      if (var13 != 0) {
                        break L132;
                      } else {
                        L146: {
                          if (stackIn_386_0 >= stackIn_386_1) {
                            var6 = -480 + var6;
                            break L146;
                          } else {
                            break L146;
                          }
                        }
                        L147: {
                          if (480 > var7) {
                            break L147;
                          } else {
                            var7 = var7 + -480;
                            break L147;
                          }
                        }
                        L148: {
                          var8 = this.field_F[var6];
                          var9 = this.field_F[var7];
                          if ((var8 ^ -1) < (var9 ^ -1)) {
                            break L148;
                          } else {
                            var10 = var9 + var8 >> 1049476001;
                            var9 = var10;
                            var8 = var10;
                            this.field_F[var6] = var8;
                            this.field_F[var7] = var9;
                            break L148;
                          }
                        }
                        var4++;
                        var5++;
                        if (var13 == 0) {
                          continue L145;
                        } else {
                          break L134;
                        }
                      }
                    }
                  }
                }
                L149: {
                  stackOut_394_0 = this;
                  stackIn_396_0 = stackOut_394_0;
                  stackIn_395_0 = stackOut_394_0;
                  if (this.field_l) {
                    stackOut_396_0 = this;
                    stackOut_396_1 = 0;
                    stackIn_397_0 = stackOut_396_0;
                    stackIn_397_1 = stackOut_396_1;
                    break L149;
                  } else {
                    stackOut_395_0 = this;
                    stackOut_395_1 = 1;
                    stackIn_397_0 = stackOut_395_0;
                    stackIn_397_1 = stackOut_395_1;
                    break L149;
                  }
                }
                ((hj) (this)).field_l = stackIn_397_1 != 0;
                stackOut_397_0 = aa.field_a;
                stackIn_398_0 = stackOut_397_0;
                break L133;
              }
              L150: {
                if (stackIn_398_0 == 0) {
                  break L150;
                } else {
                  if (-4 != (aa.field_a ^ -1)) {
                    break L131;
                  } else {
                    L151: {
                      if ((31 & this.field_d ^ -1) != -1) {
                        break L151;
                      } else {
                        this.field_ib = this.field_ib + 1;
                        break L151;
                      }
                    }
                    L152: {
                      if (this.field_ib >= 11) {
                        break L152;
                      } else {
                        this.field_ib = 11;
                        if (var13 == 0) {
                          break L131;
                        } else {
                          break L152;
                        }
                      }
                    }
                    if (317 < this.field_ib) {
                      this.field_ib = 317;
                      if (var13 == 0) {
                        break L131;
                      } else {
                        break L150;
                      }
                    } else {
                      break L131;
                    }
                  }
                }
              }
              stackOut_408_0 = 0;
              stackOut_408_1 = this.field_d & 127;
              stackIn_409_0 = stackOut_408_0;
              stackIn_409_1 = stackOut_408_1;
              break L132;
            }
            L153: {
              if (stackIn_409_0 == stackIn_409_1) {
                this.field_ib = this.field_ib - 1;
                break L153;
              } else {
                break L153;
              }
            }
            L154: {
              L155: {
                if (95 >= this.field_ib) {
                  break L155;
                } else {
                  this.field_ib = 95;
                  if (var13 == 0) {
                    break L154;
                  } else {
                    break L155;
                  }
                }
              }
              if (-31 >= (this.field_ib ^ -1)) {
                break L154;
              } else {
                this.field_ib = 30;
                break L154;
              }
            }
            this.h(340);
            break L131;
          }
          L156: {
            this.field_y = this.field_y + 1;
            if ((7 & this.field_d ^ -1) != -1) {
              break L156;
            } else {
              L157: {
                this.field_c = this.field_c + 1;
                i.field_n = i.field_n + 1;
                if (-5 == (this.field_c ^ -1)) {
                  this.field_c = 0;
                  break L157;
                } else {
                  break L157;
                }
              }
              if (i.field_n != 6) {
                break L156;
              } else {
                i.field_n = 0;
                break L156;
              }
            }
          }
          L158: {
            if (-1 == (this.field_d & 15 ^ -1)) {
              sk.field_G = sk.field_G + 1;
              if (-7 == (sk.field_G ^ -1)) {
                sk.field_G = 0;
                break L158;
              } else {
                break L158;
              }
            } else {
              break L158;
            }
          }
          L159: {
            if (this.field_y == m.field_i[0].field_n) {
              this.field_y = 0;
              break L159;
            } else {
              break L159;
            }
          }
          L160: {
            if (param0 > 64) {
              break L160;
            } else {
              this.field_W = -2;
              break L160;
            }
          }
          var4 = 0;
          L161: while (true) {
            L162: {
              L163: {
                if (-11 >= (var4 ^ -1)) {
                  break L163;
                } else {
                  lb.field_D[var4] = lb.field_D[var4] + pf.a((byte) 23, 3);
                  stackOut_436_0 = lb.field_D[var4];
                  stackOut_436_1 = 100;
                  stackIn_442_0 = stackOut_436_0;
                  stackIn_442_1 = stackOut_436_1;
                  stackIn_437_0 = stackOut_436_0;
                  stackIn_437_1 = stackOut_436_1;
                  if (var13 != 0) {
                    break L162;
                  } else {
                    L164: {
                      if (stackIn_437_0 > stackIn_437_1) {
                        lb.field_D[var4] = 0;
                        break L164;
                      } else {
                        break L164;
                      }
                    }
                    var4++;
                    if (var13 == 0) {
                      continue L161;
                    } else {
                      break L163;
                    }
                  }
                }
              }
              stackOut_441_0 = this.field_J;
              stackOut_441_1 = this.field_W;
              stackIn_442_0 = stackOut_441_0;
              stackIn_442_1 = stackOut_441_1;
              break L162;
            }
            L165: {
              if (stackIn_442_0 == stackIn_442_1) {
                break L165;
              } else {
                L166: {
                  L167: {
                    if (this.field_W >= this.field_J) {
                      break L167;
                    } else {
                      this.field_W = this.field_W + 1;
                      if (var13 == 0) {
                        break L166;
                      } else {
                        break L167;
                      }
                    }
                  }
                  this.field_W = this.field_W - 1;
                  break L166;
                }
                L168: {
                  if (5 > Math.abs(-this.field_J + this.field_W)) {
                    this.field_W = this.field_J;
                    break L168;
                  } else {
                    break L168;
                  }
                }
                this.e(-21);
                break L165;
              }
            }
            return;
          }
        }
    }

    final void b(int param0) {
        int incrementValue$1 = 0;
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
        le var9_ref_le = null;
        int var10 = 0;
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
        Object var21 = null;
        ki var21_ref = null;
        Object var22 = null;
        ki var22_ref = null;
        le var23 = null;
        le var24 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        int stackIn_321_0 = 0;
        int stackIn_321_1 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_80_0 = 0;
        boolean stackOut_88_0 = false;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_320_0 = 0;
        int stackOut_320_1 = 0;
        int stackOut_321_0 = 0;
        int stackOut_321_1 = 0;
        int stackOut_324_0 = 0;
        int stackOut_324_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_292_0 = 0;
        int stackOut_293_0 = 0;
        L0: {
          L1: {
            L2: {
              var21 = null;
              var22 = null;
              var20 = MonkeyPuzzle2.field_F ? 1 : 0;
              if (aa.field_a == 2) {
                break L2;
              } else {
                L3: {
                  if (aa.field_a != 3) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        var2 = -100 + this.field_ib;
                        if ((this.field_ib ^ -1) <= -241) {
                          break L5;
                        } else {
                          L6: {
                            ge.h(77, 0, 563, 146);
                            if (0 < var2) {
                              ge.a(77, var2 - 145, 486, 145, 265542, 5383094);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if ((var2 ^ -1) <= -146) {
                              break L7;
                            } else {
                              ge.a(77, var2, 486, 145, 5383094, 8374005);
                              break L7;
                            }
                          }
                          ge.d(77, var2 - -145, 486, 145, 8374005);
                          ge.h(0, 0, 640, 480);
                          hf.field_d.c(320 + -(hf.field_d.field_m >> -1337206303), this.field_ib);
                          if (var20 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ge.a(77, 0, 486, 150, 265542, 5383094);
                      break L4;
                    }
                    if (var20 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((aa.field_a ^ -1) == -1) {
                  var2 = -((-30 + this.field_ib) * 255 / 65) + 255;
                  fi.field_a[fi.field_a.length + -1].a(0, 0, var2, 15387868);
                  hf.field_d.e(-(hf.field_d.field_m >> -294507870) + 320, this.field_ib);
                  ge.h(0, 0, 640, 70);
                  ge.a(5120, (hf.field_d.field_m >> 2126480610) + this.field_ib << 632372036, hf.field_d.field_m << 1586773603, 50, cf.field_a);
                  ge.h(0, 0, 640, 480);
                  if (var20 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            var2 = -(2 * m.field_i[0].field_n) + this.field_y;
            var3 = 0;
            L8: while (true) {
              if ((m.field_i[0].field_n * 2 + this.field_y ^ -1) >= (var2 ^ -1)) {
                break L1;
              } else {
                incrementValue$1 = var3;
                var3++;
                var4 = incrementValue$1 + this.field_c;
                var4 = var4 % 4;
                stackOut_16_0 = 0;
                stackIn_25_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var20 != 0) {
                  break L0;
                } else {
                  var5 = stackIn_17_0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (-641 >= (var5 ^ -1)) {
                          break L11;
                        } else {
                          m.field_i[var4].a(var5, var2);
                          var5 = var5 + m.field_i[0].field_m;
                          if (var20 != 0) {
                            break L10;
                          } else {
                            if (var20 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      var2 = var2 + m.field_i[0].field_n;
                      break L10;
                    }
                    if (var20 == 0) {
                      continue L8;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_24_0 = aa.field_a;
          stackIn_25_0 = stackOut_24_0;
          break L0;
        }
        L12: {
          if (stackIn_25_0 != 0) {
            al.a(this.field_H, (byte) -126);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          L14: {
            if (aa.field_a == 3) {
              break L14;
            } else {
              if ((aa.field_a ^ -1) != -1) {
                break L13;
              } else {
                ge.h(0, 0, 640, 480);
                fi.field_a[0].c(0, 0);
                j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                var2 = 80;
                var3 = 0;
                var4 = 95999;
                L15: while (true) {
                  L16: {
                    L17: {
                      if ((var4 ^ -1) > -1) {
                        break L17;
                      } else {
                        this.field_N.field_s[var4] = ac.field_a.field_e[var3 + var2];
                        var2++;
                        stackOut_32_0 = var2 ^ -1;
                        stackOut_32_1 = -561;
                        stackIn_37_0 = stackOut_32_0;
                        stackIn_37_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (var20 != 0) {
                          break L16;
                        } else {
                          L18: {
                            if (stackIn_33_0 != stackIn_33_1) {
                              break L18;
                            } else {
                              var3 = var3 + ac.field_a.field_g;
                              var2 = 80;
                              break L18;
                            }
                          }
                          var4--;
                          if (var20 == 0) {
                            continue L15;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    this.field_N.c();
                    ge.a(this.field_N.field_s, this.field_N.field_k, this.field_N.field_j);
                    kl.a(100, 5, this.field_d, 0, 0, this.field_N.field_k, this.field_N.field_j);
                    this.field_q.e();
                    this.field_N.a(this.field_N.field_m << 103940579, this.field_N.field_n << -2061765117, 3200, 1600, 63535, 4096);
                    ac.field_a.a((byte) 116);
                    ge.h(80, 0, 560, 480);
                    fi.field_a[1].c(0, 0);
                    this.field_q.b(80, 317, 580, 200, 100);
                    stackOut_36_0 = 80;
                    stackOut_36_1 = 316;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L16;
                  }
                  ge.h(stackIn_37_0, stackIn_37_1, 560, 371);
                  var3 = 70;
                  fi.field_a[0].c(0, 0);
                  var4 = 0;
                  L19: while (true) {
                    L20: {
                      L21: {
                        if ((var3 ^ -1) <= -291) {
                          break L21;
                        } else {
                          ge.h(0, var3, 640, var3 + 2);
                          ge.a(5120, (hf.field_d.field_m >> -786972350) + (this.field_ib - 2 * var4) << -469576252, hf.field_d.field_m << 912471971, 50, cf.field_a);
                          var3 += 2;
                          var4 += 2;
                          if (var20 != 0) {
                            break L20;
                          } else {
                            if (var20 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      ge.h(80, 0, 560, 480);
                      j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                      ge.b();
                      break L20;
                    }
                    if (var20 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
              }
            }
          }
          L22: {
            if (-171 < (this.field_ib ^ -1)) {
              stackOut_46_0 = 0;
              stackIn_47_0 = stackOut_46_0;
              break L22;
            } else {
              stackOut_45_0 = 1;
              stackIn_47_0 = stackOut_45_0;
              break L22;
            }
          }
          L23: {
            var2 = stackIn_47_0;
            var3 = -qa.field_i.field_n + (this.field_ib + -220);
            fe.field_f[this.field_c].b(0, 0, 100);
            var4 = 255 * (-11 + this.field_ib) / 306;
            if (-101 <= (var4 ^ -1)) {
              break L23;
            } else {
              var4 = 100;
              break L23;
            }
          }
          L24: {
            ge.c(70, 0, 500, 480, 265542, var4);
            var5 = this.field_ib + -100;
            var6 = 0;
            if (this.field_ib > 100) {
              L25: {
                if (180 <= this.field_ib) {
                  break L25;
                } else {
                  var6 = 50 - (9000 + -(this.field_ib * 50)) / 80;
                  if (var20 == 0) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              var6 = 50;
              break L24;
            } else {
              break L24;
            }
          }
          L26: {
            ge.h(0, 0, 640, 145);
            if (this.field_ib >= 250) {
              break L26;
            } else {
              ge.a(5120, (hf.field_d.field_m >> -284282911) + this.field_ib << 1156533284, hf.field_d.field_m << -1357943932, -var6 + 50, cf.field_a);
              break L26;
            }
          }
          L27: {
            if (var2 == 0) {
              break L27;
            } else {
              ge.a(320 - qa.field_i.field_m << 1947285252, var3 - (-(qa.field_i.field_n >> 1644914081) + 8) << -361708060, qa.field_i.field_m << -1062887580, 50, sk.field_D);
              break L27;
            }
          }
          L28: {
            L29: {
              L30: {
                if (var6 >= 50) {
                  break L30;
                } else {
                  var7_int = 145;
                  var8 = 0;
                  L31: while (true) {
                    if ((var7_int ^ -1) <= -291) {
                      break L30;
                    } else {
                      ge.h(0, var7_int, 640, 2 + var7_int);
                      ge.a(5120, -(4 * var8) + this.field_ib + (hf.field_d.field_m >> -1127253663) << 235989604, hf.field_d.field_m << -57743068, 50 + -var6, cf.field_a);
                      var8 += 2;
                      var7_int += 2;
                      if (var20 != 0) {
                        break L29;
                      } else {
                        if (var20 == 0) {
                          continue L31;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                }
              }
              if ((var5 ^ -1) < 89) {
                var7_int = var5 - -90;
                break L29;
              } else {
                break L28;
              }
            }
            L32: {
              if (-101 <= (var7_int ^ -1)) {
                break L32;
              } else {
                var7_int = 100;
                break L32;
              }
            }
            L33: {
              ge.h(0, 0, 640, var7_int);
              var8 = 256 * var7_int / 100;
              if (256 >= var8) {
                break L33;
              } else {
                var8 = 256;
                break L33;
              }
            }
            ma.a(this.field_m.field_s, 80, 0, this.field_m.field_m, var7_int, var8, 0);
            ac.field_a.a((byte) 110);
            break L28;
          }
          if (var2 != 0) {
            qa.field_i.c(-qa.field_i.field_m + 320 - (qa.field_i.field_m >> -1398397183), var3);
            break L13;
          } else {
            break L13;
          }
        }
        L34: {
          if (!this.field_C) {
            break L34;
          } else {
            if (-2 != (aa.field_a ^ -1)) {
              break L34;
            } else {
              pc.field_U[this.field_x].c(this.field_X, this.field_h);
              break L34;
            }
          }
        }
        var2 = 0;
        L35: while (true) {
          L36: {
            L37: {
              if ((var2 ^ -1) <= (ib.field_c ^ -1)) {
                break L37;
              } else {
                var3 = pd.field_f[var2] - (dj.field_a[0].field_m >> -146205343);
                var4 = 0;
                stackOut_80_0 = 0;
                stackIn_89_0 = stackOut_80_0;
                stackIn_81_0 = stackOut_80_0;
                if (var20 != 0) {
                  break L36;
                } else {
                  var5 = stackIn_81_0;
                  L38: while (true) {
                    L39: {
                      L40: {
                        if ((var5 ^ -1) <= (mc.field_e[var2].length ^ -1)) {
                          break L40;
                        } else {
                          dj.field_a[mc.field_e[var2][var5]].c(var3, var4);
                          var4 = var4 + (dj.field_a[var5].field_n + -1);
                          var5++;
                          if (var20 != 0) {
                            break L39;
                          } else {
                            if (var20 == 0) {
                              continue L38;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      var2++;
                      break L39;
                    }
                    if (var20 == 0) {
                      continue L35;
                    } else {
                      break L37;
                    }
                  }
                }
              }
            }
            ll.a(24733);
            ci.a(-2865);
            ck.field_a[1].c(20 + this.field_M, -wl.field_f[0].field_n + (this.field_k + -13));
            stackOut_88_0 = wd.field_h.e(11253);
            stackIn_89_0 = stackOut_88_0 ? 1 : 0;
            break L36;
          }
          L41: {
            L42: {
              if (stackIn_89_0 != 0) {
                break L42;
              } else {
                var21_ref = (ki) ((Object) wd.field_h.a((byte) -117));
                if (var21_ref != null) {
                  L43: {
                    var21_ref.field_B = (float)this.field_M;
                    var21_ref.field_q = (float)(-48 + this.field_k);
                    if (jj.b(true)) {
                      var21_ref.a((byte) -74);
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  var3 = 1;
                  L44: while (true) {
                    if ((var3 ^ -1) <= -5) {
                      break L42;
                    } else {
                      var22_ref = (ki) ((Object) wd.field_h.d((byte) 63));
                      if (var20 != 0) {
                        break L41;
                      } else {
                        L45: {
                          if (var22_ref != null) {
                            break L45;
                          } else {
                            if (var20 == 0) {
                              break L42;
                            } else {
                              break L45;
                            }
                          }
                        }
                        L46: {
                          L47: {
                            L48: {
                              L49: {
                                var4 = var3;
                                if (-2 == (var4 ^ -1)) {
                                  break L49;
                                } else {
                                  L50: {
                                    if (var4 != 2) {
                                      break L50;
                                    } else {
                                      if (var20 == 0) {
                                        break L48;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  if (-4 != (var4 ^ -1)) {
                                    break L46;
                                  } else {
                                    if (var20 == 0) {
                                      break L47;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                              }
                              var22_ref.field_B = 360.0f;
                              var22_ref.field_q = (float)(this.field_k + -48);
                              if (var20 == 0) {
                                break L46;
                              } else {
                                break L48;
                              }
                            }
                            var22_ref.field_q = (float)(this.field_k + -38);
                            var22_ref.field_B = 385.0f;
                            if (var20 == 0) {
                              break L46;
                            } else {
                              break L47;
                            }
                          }
                          var22_ref.field_B = 370.0f;
                          var22_ref.field_q = (float)(-28 + this.field_k);
                          break L46;
                        }
                        var22_ref.a((byte) -60);
                        var22_ref.field_q = (float)(148 + (var3 - 1) * 59);
                        var22_ref.field_B = 602.0f;
                        var3++;
                        if (var20 == 0) {
                          continue L44;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                } else {
                  break L42;
                }
              }
            }
            df.f(18180);
            break L41;
          }
          var2 = (int)(ia.a(true, (float)this.field_H * 0.00800000037997961f) * 50.0f);
          var3 = 727655;
          ge.c(80, this.field_O, 480, 480, var3, 120);
          var4 = 0;
          ge.h(80, 0, 560, 480);
          var5 = 0;
          var6 = 0;
          var7_int = this.field_d / 2 % 480;
          var8 = 0;
          L51: while (true) {
            L52: {
              L53: {
                L54: {
                  L55: {
                    if (-481 >= (var8 ^ -1)) {
                      break L55;
                    } else {
                      stackOut_117_0 = var7_int;
                      stackOut_117_1 = 480;
                      stackIn_322_0 = stackOut_117_0;
                      stackIn_322_1 = stackOut_117_1;
                      stackIn_118_0 = stackOut_117_0;
                      stackIn_118_1 = stackOut_117_1;
                      if (var20 != 0) {
                        L56: while (true) {
                          if (stackIn_322_0 >= stackIn_322_1) {
                            break L54;
                          } else {
                            var8 = -this.field_O + var7_int;
                            stackOut_320_0 = -86;
                            stackOut_320_1 = var8 ^ -1;
                            stackIn_140_0 = stackOut_320_0;
                            stackIn_140_1 = stackOut_320_1;
                            stackIn_321_0 = stackOut_320_0;
                            stackIn_321_1 = stackOut_320_1;
                            if (var20 != 0) {
                              break L53;
                            } else {
                              stackOut_321_0 = stackIn_321_0;
                              stackOut_321_1 = stackIn_321_1;
                              stackIn_318_0 = stackOut_321_0;
                              stackIn_318_1 = stackOut_321_1;
                              L57: {
                                if (stackIn_318_0 <= stackIn_318_1) {
                                  break L57;
                                } else {
                                  if (var20 == 0) {
                                    break L54;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                              ge.i(var7_int - -var2, var7_int, 5, -var9 + 5592405);
                              ge.i(var7_int - (50 + -var2), var7_int, 30, -var9 + 5592405);
                              ge.i(var2 + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                              ge.i(var7_int + (-80 + var2), var7_int, 5, 5592405 + -var9);
                              var7_int++;
                              if (var20 == 0) {
                                stackOut_324_0 = var7_int;
                                stackOut_324_1 = 480;
                                stackIn_322_0 = stackOut_324_0;
                                stackIn_322_1 = stackOut_324_1;
                                continue L56;
                              } else {
                                break L54;
                              }
                            }
                          }
                        }
                      } else {
                        L58: {
                          if (stackIn_118_0 >= stackIn_118_1) {
                            var7_int = 0;
                            break L58;
                          } else {
                            break L58;
                          }
                        }
                        L59: {
                          L60: {
                            var9 = this.field_F[var7_int] >> -2130373532;
                            var10 = 80 + var8;
                            var11 = -var9 + this.field_O;
                            if (80 != var10) {
                              break L60;
                            } else {
                              var5 = var11;
                              if (var20 == 0) {
                                break L59;
                              } else {
                                break L60;
                              }
                            }
                          }
                          if (-560 == (var10 ^ -1)) {
                            var6 = var11;
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L61: {
                          ge.g(var10, var11, var9, var3, 120);
                          this.a(30717, var10, var9, var2, var11, 5);
                          this.a(30717, var10, var9, -50 - -var2, var11, 30);
                          this.a(30717, var10, var9, var2 + -60, var11, 30);
                          this.a(30717, var10, var9, -80 + var2, var11, 5);
                          if (var9 > var4) {
                            var4 = var9;
                            break L61;
                          } else {
                            break L61;
                          }
                        }
                        var8++;
                        var7_int++;
                        if (var20 == 0) {
                          continue L51;
                        } else {
                          break L55;
                        }
                      }
                    }
                  }
                  var7_int = this.field_O;
                  L62: while (true) {
                    if (var7_int >= 480) {
                      break L54;
                    } else {
                      var8 = -this.field_O + var7_int;
                      stackOut_132_0 = -86;
                      stackOut_132_1 = var8 ^ -1;
                      stackIn_140_0 = stackOut_132_0;
                      stackIn_140_1 = stackOut_132_1;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      if (var20 != 0) {
                        break L53;
                      } else {
                        L63: {
                          if (stackIn_133_0 <= stackIn_133_1) {
                            break L63;
                          } else {
                            if (var20 == 0) {
                              break L54;
                            } else {
                              break L63;
                            }
                          }
                        }
                        var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                        ge.i(var7_int - -var2, var7_int, 5, -var9 + 5592405);
                        ge.i(var7_int - (50 + -var2), var7_int, 30, -var9 + 5592405);
                        ge.i(var2 + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                        ge.i(var7_int + (-80 + var2), var7_int, 5, 5592405 + -var9);
                        var7_int++;
                        if (var20 == 0) {
                          continue L62;
                        } else {
                          break L54;
                        }
                      }
                    }
                  }
                }
                if (this.field_S) {
                  ge.b(1, 1, 80, this.field_O, 480, 4);
                  stackOut_139_0 = 2;
                  stackOut_139_1 = 2;
                  stackIn_140_0 = stackOut_139_0;
                  stackIn_140_1 = stackOut_139_1;
                  break L53;
                } else {
                  break L52;
                }
              }
              ge.b(stackIn_140_0, stackIn_140_1, 80, this.field_O + 4, 480, 476 - this.field_O);
              break L52;
            }
            L64: {
              L65: {
                L66: {
                  if ((this.field_jb ^ -1) == -1) {
                    break L66;
                  } else {
                    if (this.field_jb == 13) {
                      break L66;
                    } else {
                      if (-2 == (this.field_jb ^ -1)) {
                        break L66;
                      } else {
                        break L65;
                      }
                    }
                  }
                }
                L67: {
                  L68: {
                    L69: {
                      if ((this.field_jb ^ -1) == -14) {
                        break L69;
                      } else {
                        if (this.field_jb != 1) {
                          break L68;
                        } else {
                          break L69;
                        }
                      }
                    }
                    var7_int = -this.field_d + 4;
                    if (var20 == 0) {
                      break L67;
                    } else {
                      break L68;
                    }
                  }
                  var7_int = this.field_d;
                  if (-5 <= (var7_int ^ -1)) {
                    break L67;
                  } else {
                    var7_int = 4;
                    break L67;
                  }
                }
                if (var7_int <= 0) {
                  break L65;
                } else {
                  L70: {
                    var8 = this.field_v - -(int)(ia.a(true, (float)this.field_d * 0.10000000149011612f) * 20.0f);
                    if (-1 < (var8 ^ -1)) {
                      var8 = 0;
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L71: {
                    if (-256 > (var8 ^ -1)) {
                      var8 = 255;
                      break L71;
                    } else {
                      break L71;
                    }
                  }
                  var9 = 0;
                  L72: while (true) {
                    L73: {
                      if (-11 >= (var9 ^ -1)) {
                        break L73;
                      } else {
                        ge.a((var9 * lb.field_D[var9] + this.field_d) % 480 + 80 << 23307844, -90 + this.field_k + (int)(4.0f * ia.a(true, (float)(var9 * lb.field_D[var9] + this.field_d) * 0.10000000149011612f)) << -366411164, ll.field_c[var9] << 435665412, jf.field_f[var9], cf.field_a);
                        var9++;
                        if (var20 != 0) {
                          break L64;
                        } else {
                          if (var20 == 0) {
                            continue L72;
                          } else {
                            break L73;
                          }
                        }
                      }
                    }
                    uc.a(78, -90 + this.field_k, 558, this.field_k + -90, 3, var8, var7_int, this.field_fb);
                    break L65;
                  }
                }
              }
              ge.h(0, 0, 640, 480);
              ge.c(70, var5, 10, -var5 + 480, var3, 120);
              ge.c(560, var6, 10, -var6 + 480, var3, 120);
              ka.b(0);
              break L64;
            }
            var7 = qh.field_a[this.field_ab];
            var7.b(var7.field_m << -600862045, var7.field_n << 2020967139, (int)this.field_B << -18135196, (int)this.field_Z << 1934953316, this.field_g, 4096);
            lb.field_E[0].c(0, 0);
            lb.field_E[1].c(640 - lb.field_E[1].field_m, 0);
            var8 = 0;
            var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
            L74: while (true) {
              L75: {
                L76: {
                  if (var9_ref_ki == null) {
                    break L76;
                  } else {
                    stackOut_167_0 = var8;
                    stackIn_185_0 = stackOut_167_0;
                    stackIn_168_0 = stackOut_167_0;
                    if (var20 != 0) {
                      break L75;
                    } else {
                      L77: {
                        L78: {
                          if (stackIn_168_0 == 0) {
                            var8++;
                            if (var20 == 0) {
                              break L77;
                            } else {
                              break L78;
                            }
                          } else {
                            break L78;
                          }
                        }
                        L79: {
                          L80: {
                            var9_ref_ki.field_q = (float)((-1 + var8) * 59 + 148);
                            var9_ref_ki.field_B = 602.0f;
                            if (!this.field_gb[var8 + -1]) {
                              break L80;
                            } else {
                              L81: {
                                if ((this.field_cb[var8 + -1] ^ -1) <= -11) {
                                  break L81;
                                } else {
                                  var10 = var9_ref_ki.field_I.field_m * this.field_cb[-1 + var8] / 10;
                                  var9_ref_ki.field_I.d((-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_B + (float)var9_ref_ki.field_G), (-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var10, var10);
                                  if (var20 == 0) {
                                    break L79;
                                  } else {
                                    break L81;
                                  }
                                }
                              }
                              var9_ref_ki.a((byte) -97);
                              if (var20 == 0) {
                                break L79;
                              } else {
                                break L80;
                              }
                            }
                          }
                          L82: {
                            L83: {
                              if (this.field_lb[var8 + -1] < 0) {
                                break L83;
                              } else {
                                var10_ref_le = ak.field_t[this.field_lb[-1 + var8]];
                                if (var20 == 0) {
                                  break L82;
                                } else {
                                  break L83;
                                }
                              }
                            }
                            var10_ref_le = tl.field_b;
                            break L82;
                          }
                          L84: {
                            if ((this.field_cb[var8 - 1] ^ -1) <= -11) {
                              break L84;
                            } else {
                              var11 = var10_ref_le.field_m * this.field_cb[var8 + -1] / 10;
                              var10_ref_le.d((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B) + (-var11 + var10_ref_le.field_m) / 2, (var10_ref_le.field_m - var11) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var11, var11);
                              if (var20 == 0) {
                                break L79;
                              } else {
                                break L84;
                              }
                            }
                          }
                          var10_ref_le.c((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B), (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y));
                          break L79;
                        }
                        var8++;
                        break L77;
                      }
                      var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                      if (var20 == 0) {
                        continue L74;
                      } else {
                        break L76;
                      }
                    }
                  }
                }
                stackOut_184_0 = var8 ^ -1;
                stackIn_185_0 = stackOut_184_0;
                break L75;
              }
              L85: {
                if (stackIn_185_0 != -6) {
                  break L85;
                } else {
                  L86: {
                    if (this.field_lb[-1 + var8] < 0) {
                      var9_ref_le = tl.field_b;
                      break L86;
                    } else {
                      var9_ref_le = ak.field_t[this.field_lb[var8 + -1]];
                      break L86;
                    }
                  }
                  L87: {
                    var10 = 148 + 59 * var8 + -59;
                    if (this.field_cb[-1 + var8] < 10) {
                      break L87;
                    } else {
                      var9_ref_le.c(602 + -(var9_ref_le.field_m / 2), -(var9_ref_le.field_m / 2) + var10);
                      if (var20 == 0) {
                        break L85;
                      } else {
                        break L87;
                      }
                    }
                  }
                  var11 = var9_ref_le.field_m * this.field_cb[var8 - 1] / 10;
                  var9_ref_le.d(-(var9_ref_le.field_m / 2) + (-var11 + var9_ref_le.field_m) / 2 + 602, var10 + -(var9_ref_le.field_m / 2) + (var9_ref_le.field_m + -var11) / 2, var11, var11);
                  break L85;
                }
              }
              L88: {
                var9 = (23040 + -(144 * (480 - this.field_O))) / 480;
                if ((var9 ^ -1) < -1) {
                  ge.c(25, 48 - var9 + 412, 28, var9, 1203134, 120);
                  break L88;
                } else {
                  break L88;
                }
              }
              L89: {
                L90: {
                  ge.c(37, 460, 4, 20, 1203134, 120);
                  j.field_g.c(-(j.field_g.field_m >> -1739532991) + this.field_M + -20, -j.field_g.field_n + this.field_k);
                  if (2 != this.field_u) {
                    break L90;
                  } else {
                    L91: {
                      if (2 <= this.field_Y) {
                        break L91;
                      } else {
                        if (4 != this.field_jb) {
                          break L90;
                        } else {
                          break L91;
                        }
                      }
                    }
                    L92: {
                      L93: {
                        var23 = ba.field_a[2][this.field_Y];
                        var10_ref_le = var23;
                        var11 = (bl.field_f - (var23.field_m >> -1597311775) - (-100 + this.field_M)) * 150;
                        if (-1 >= (var11 ^ -1)) {
                          break L93;
                        } else {
                          var11 = -var11 + 65535;
                          if (var20 == 0) {
                            break L92;
                          } else {
                            break L93;
                          }
                        }
                      }
                      if (-65536 <= (var11 ^ -1)) {
                        break L92;
                      } else {
                        var11 = var11 - 65535;
                        break L92;
                      }
                    }
                    var10_ref_le.b(var23.field_m << 1123805987, 160, bl.field_f << 2123968420, mh.field_D << 1186612868, var11, 4096);
                    if (var20 == 0) {
                      break L89;
                    } else {
                      break L90;
                    }
                  }
                }
                var24 = ba.field_a[this.field_u][this.field_Y];
                var10_ref_le = var24;
                var10_ref_le.c(-100 + this.field_M, -var24.field_n + this.field_k - 13);
                break L89;
              }
              L94: {
                L95: {
                  wl.field_f[this.field_U].c(-70 + this.field_M, this.field_k + (-13 + -wl.field_f[0].field_n));
                  var10 = -this.field_z;
                  ci.field_d.a(0, ci.field_d.field_n << -1379118845, this.field_M << 315763236, this.field_k - 48 << -961937372, var10, 4096);
                  ck.field_a[0].c(20 + this.field_M, this.field_k + -13 + -wl.field_f[0].field_n);
                  fa.f(1);
                  pl.field_e.a(this.field_j.toString(), 40, 124, 16777215, -1);
                  pl.field_e.a(Integer.toString(1 + dc.field_c % 5), 40, 208, 16777215, -1);
                  var11 = -48 / ((param0 - 56) / 43);
                  pl.field_e.a(Integer.toString(1 + aa.field_a), 40, 288, 16777215, -1);
                  if (13 != this.field_jb) {
                    break L95;
                  } else {
                    L96: {
                      var12 = -600 + this.field_nb;
                      if ((var12 ^ -1) < -1) {
                        L97: {
                          var13_int = var12 + -100;
                          if (-256 <= (var13_int ^ -1)) {
                            break L97;
                          } else {
                            ib.field_d.a(0, 0);
                            if (var20 == 0) {
                              break L96;
                            } else {
                              break L97;
                            }
                          }
                        }
                        L98: {
                          if (255 < var12) {
                            var12 = 255;
                            break L98;
                          } else {
                            break L98;
                          }
                        }
                        ma.a(ib.field_d, 0, 0, 480, var12, var13_int);
                        break L96;
                      } else {
                        break L96;
                      }
                    }
                    if (var20 == 0) {
                      break L94;
                    } else {
                      break L95;
                    }
                  }
                }
                L99: {
                  if (-2 == (this.field_jb ^ -1)) {
                    break L99;
                  } else {
                    L100: {
                      if (-3 != (this.field_jb ^ -1)) {
                        break L100;
                      } else {
                        this.field_R.c(150, 260);
                        this.field_f.c(150, 340);
                        f.a(this.field_d, (byte) 110);
                        if (var20 == 0) {
                          break L94;
                        } else {
                          break L100;
                        }
                      }
                    }
                    L101: {
                      if (3 != this.field_jb) {
                        break L101;
                      } else {
                        f.a(50 + -this.field_d, (byte) 97);
                        if (var20 == 0) {
                          break L94;
                        } else {
                          break L101;
                        }
                      }
                    }
                    L102: {
                      if (this.field_jb != 4) {
                        break L102;
                      } else {
                        L103: {
                          var12 = this.field_d;
                          if (0 < var12) {
                            L104: {
                              var13_int = var12 - 100;
                              if ((var13_int ^ -1) >= -256) {
                                break L104;
                              } else {
                                l.field_D[aa.field_a].a(0, 0);
                                if (var20 == 0) {
                                  break L103;
                                } else {
                                  break L104;
                                }
                              }
                            }
                            L105: {
                              if (var12 <= 255) {
                                break L105;
                              } else {
                                var12 = 255;
                                break L105;
                              }
                            }
                            ma.a(l.field_D[aa.field_a], 0, 0, 640, var12, var13_int);
                            break L103;
                          } else {
                            break L103;
                          }
                        }
                        L106: {
                          L107: {
                            if (450 >= this.field_d) {
                              break L107;
                            } else {
                              if (3 <= aa.field_a) {
                                break L107;
                              } else {
                                ph.field_d.a(0, 0);
                                var13_int = 0;
                                L108: while (true) {
                                  L109: {
                                    L110: {
                                      if ((var13_int ^ -1) < (aa.field_a + 1 ^ -1)) {
                                        break L110;
                                      } else {
                                        ni.field_c[var13_int].b(el.field_b[var13_int][0], el.field_b[var13_int][1]);
                                        var13_int++;
                                        if (var20 != 0) {
                                          break L109;
                                        } else {
                                          if (var20 == 0) {
                                            continue L108;
                                          } else {
                                            break L110;
                                          }
                                        }
                                      }
                                    }
                                    var13_int = hc.field_h[1 + aa.field_a][0] - -((cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2);
                                    break L109;
                                  }
                                  L111: {
                                    L112: {
                                      var14 = (-qc.field_L[this.field_Y].field_n + cm.field_F[this.field_Y].field_n) / 2 + hc.field_h[1 + aa.field_a][1];
                                      if (this.field_d >= 650) {
                                        break L112;
                                      } else {
                                        L113: {
                                          L114: {
                                            var15 = -400 + this.field_d - 50;
                                            var16 = hc.field_h[aa.field_a][0] + (cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2;
                                            var17 = (cm.field_F[this.field_Y].field_n - qc.field_L[this.field_Y].field_n) / 2 + hc.field_h[aa.field_a][1];
                                            var18 = var16 + (-var16 + var13_int) * var15 / 200;
                                            var19 = (var14 + -var17) * var15 / 200 + var17;
                                            if (aa.field_a == 2) {
                                              break L114;
                                            } else {
                                              qc.field_L[this.field_Y].c(var18, var19);
                                              if (var20 == 0) {
                                                break L113;
                                              } else {
                                                break L114;
                                              }
                                            }
                                          }
                                          qc.field_L[this.field_Y].f(var18, var19);
                                          break L113;
                                        }
                                        if (var20 == 0) {
                                          break L111;
                                        } else {
                                          break L112;
                                        }
                                      }
                                    }
                                    L115: {
                                      if (-701 >= (this.field_d ^ -1)) {
                                        break L115;
                                      } else {
                                        L116: {
                                          if (aa.field_a != 2) {
                                            break L116;
                                          } else {
                                            qc.field_L[this.field_Y].f(var13_int, var14);
                                            if (var20 == 0) {
                                              break L115;
                                            } else {
                                              break L116;
                                            }
                                          }
                                        }
                                        qc.field_L[this.field_Y].c(var13_int, var14);
                                        break L115;
                                      }
                                    }
                                    cm.field_F[this.field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                                    break L111;
                                  }
                                  if (var20 == 0) {
                                    break L106;
                                  } else {
                                    break L107;
                                  }
                                }
                              }
                            }
                          }
                          if (this.field_d > 450) {
                            ke.field_i.a(0, 0);
                            break L106;
                          } else {
                            break L106;
                          }
                        }
                        L117: {
                          L118: {
                            L119: {
                              if (this.field_d <= 400) {
                                break L119;
                              } else {
                                if (this.field_d < 450) {
                                  break L118;
                                } else {
                                  break L119;
                                }
                              }
                            }
                            L120: {
                              L121: {
                                if (this.field_d < 450) {
                                  break L121;
                                } else {
                                  if (this.field_d < 500) {
                                    break L120;
                                  } else {
                                    break L121;
                                  }
                                }
                              }
                              if ((this.field_d ^ -1) >= -801) {
                                break L117;
                              } else {
                                f.a(-800 + this.field_d, (byte) 123);
                                if (var20 == 0) {
                                  break L117;
                                } else {
                                  break L120;
                                }
                              }
                            }
                            f.a(450 + (-this.field_d - -50), (byte) 111);
                            if (var20 == 0) {
                              break L117;
                            } else {
                              break L118;
                            }
                          }
                          f.a(this.field_d + -400, (byte) 126);
                          break L117;
                        }
                        if (var20 == 0) {
                          break L94;
                        } else {
                          break L102;
                        }
                      }
                    }
                    L122: {
                      if (this.field_jb != 6) {
                        break L122;
                      } else {
                        L123: {
                          if ((this.field_d ^ -1) <= -401) {
                            break L123;
                          } else {
                            ph.field_d.a(0, 0);
                            ni.field_c[0].b(el.field_b[0][0], el.field_b[0][1]);
                            cm.field_F[this.field_Y].c(hc.field_h[aa.field_a][0], this.a(-97, 0, aa.field_a));
                            break L123;
                          }
                        }
                        L124: {
                          L125: {
                            if (this.field_d <= 350) {
                              break L125;
                            } else {
                              if (400 > this.field_d) {
                                break L124;
                              } else {
                                break L125;
                              }
                            }
                          }
                          if (this.field_d < 400) {
                            break L94;
                          } else {
                            if ((this.field_d ^ -1) <= -451) {
                              break L94;
                            } else {
                              f.a(400 + -this.field_d + 50, (byte) 78);
                              if (var20 == 0) {
                                break L94;
                              } else {
                                break L124;
                              }
                            }
                          }
                        }
                        f.a(this.field_d + -350, (byte) 70);
                        if (var20 == 0) {
                          break L94;
                        } else {
                          break L122;
                        }
                      }
                    }
                    L126: {
                      if ((this.field_jb ^ -1) != -6) {
                        break L126;
                      } else {
                        L127: {
                          if (-33 < (this.field_d ^ -1)) {
                            f.a(this.field_d, (byte) 117);
                            break L127;
                          } else {
                            break L127;
                          }
                        }
                        ph.field_d.a(0, 0);
                        var12 = 0;
                        L128: while (true) {
                          L129: {
                            L130: {
                              L131: {
                                if (var12 >= ni.field_c.length) {
                                  break L131;
                                } else {
                                  ni.field_c[var12].b(el.field_b[var12][0], el.field_b[var12][1]);
                                  var12++;
                                  if (var20 != 0) {
                                    break L130;
                                  } else {
                                    if (var20 == 0) {
                                      continue L128;
                                    } else {
                                      break L131;
                                    }
                                  }
                                }
                              }
                              if (-256 < (this.field_d / 2 ^ -1)) {
                                break L130;
                              } else {
                                stackOut_292_0 = 255;
                                stackIn_294_0 = stackOut_292_0;
                                break L129;
                              }
                            }
                            stackOut_293_0 = this.field_d / 2;
                            stackIn_294_0 = stackOut_293_0;
                            break L129;
                          }
                          var12 = stackIn_294_0;
                          kl.a(0, 0, 640, 480, 12163403, var12);
                          sb.field_r.a(wj.field_h, 321, 170, 6776679, -1);
                          sb.field_r.a(wj.field_h, 319, 170, 6776679, -1);
                          sb.field_r.a(wj.field_h, 320, 171, 6776679, -1);
                          sb.field_r.a(wj.field_h, 320, 169, 6776679, -1);
                          sb.field_r.a(wj.field_h, 320, 170, 16724736, -1);
                          sb.field_r.a(wj.field_h, 330, 180, 6776679, -1, 50);
                          var13 = gg.a(new String[]{this.field_j.toString()}, cl.field_b, true);
                          sb.field_r.a(var13, 321, 320, 6776679, -1);
                          sb.field_r.a(var13, 319, 320, 6776679, -1);
                          sb.field_r.a(var13, 320, 321, 6776679, -1);
                          sb.field_r.a(var13, 320, 319, 6776679, -1);
                          sb.field_r.a(var13, 320, 320, 16724736, -1);
                          sb.field_r.a(var13, 330, 330, 6776679, -1, 50);
                          ba.field_a[this.field_u][this.field_Y].c(-(ba.field_a[this.field_u][this.field_Y].field_k / 2) + 320, 240 + -(ba.field_a[this.field_u][this.field_Y].field_j / 2));
                          var14 = 0;
                          L132: while (true) {
                            L133: {
                              L134: {
                                if (var14 >= 5) {
                                  break L134;
                                } else {
                                  nh.field_f[0][var14][this.field_Y].c(-16 + (320 - 60 * var14 - -120), -(Math.abs(var14 + -2) * 10) + 360);
                                  var14++;
                                  if (var20 != 0) {
                                    break L133;
                                  } else {
                                    if (var20 == 0) {
                                      continue L132;
                                    } else {
                                      break L134;
                                    }
                                  }
                                }
                              }
                              f.a(64 + -this.field_d, (byte) 111);
                              break L133;
                            }
                            L135: {
                              if (600 >= this.field_d) {
                                break L135;
                              } else {
                                l.field_D[4].c(0, 0, this.field_d + -600, -700 + this.field_d);
                                break L135;
                              }
                            }
                            L136: {
                              if (this.field_d <= 1000) {
                                break L136;
                              } else {
                                f.a(this.field_d - 1000, (byte) 118);
                                break L136;
                              }
                            }
                            if (var20 == 0) {
                              break L94;
                            } else {
                              break L126;
                            }
                          }
                        }
                      }
                    }
                    pd.a(true);
                    if (var20 == 0) {
                      break L94;
                    } else {
                      break L99;
                    }
                  }
                }
                L137: {
                  var12 = this.field_d * 40 / 50;
                  if (var12 <= 40) {
                    break L137;
                  } else {
                    var12 = 40;
                    break L137;
                  }
                }
                this.field_R.b(150, 260 - -((-var12 + 40) / 2), 340, var12);
                this.field_f.b(150, (-var12 + 40) / 2 + 340, 340, var12);
                break L94;
              }
              L138: {
                if (!ok.field_e) {
                  break L138;
                } else {
                  pe.a(-112);
                  break L138;
                }
              }
              return;
            }
          }
        }
    }

    hj() {
        int dupTemp$2 = 0;
        int var1 = 0;
        int var2 = 0;
        L0: {
          L1: {
            var2 = MonkeyPuzzle2.field_F ? 1 : 0;
            this.field_o = false;
            this.field_H = 0;
            this.field_A = 0;
            this.field_n = 32;
            this.field_I = 0;
            this.field_m = new le(480, 100);
            this.field_F = new int[480];
            this.field_ib = -40;
            this.field_p = 1;
            this.field_w = 0;
            this.field_C = false;
            this.field_x = 1;
            rk.field_d = 5180;
            b.field_m = 212;
            h.field_a = 9170;
            sd.field_e = 4180;
            bh.field_g = 0;
            cl.field_d = 8768;
            jc.field_e = 9419;
            nj.field_b = 617;
            this.field_M = 320;
            this.field_jb = 6;
            this.field_k = 480;
            this.field_nb = 0;
            this.field_O = this.field_k - 14;
            uj.b(0);
            dc.field_c = 0;
            rb.a(dc.field_c, (byte) -58);
            if ((aa.field_a ^ -1) != -1) {
              break L1;
            } else {
              this.field_ib = 95;
              if (var2 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (3 != aa.field_a) {
            break L0;
          } else {
            this.field_ib = 11;
            break L0;
          }
        }
        this.field_r = 1;
        vi.a(true);
        fl.b(-114);
        this.field_m.e();
        var1 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if ((var1 ^ -1) <= -135) {
                break L4;
              } else {
                ge.b(pf.a((byte) 109, 480), pf.a((byte) -100, 100), 16777215);
                var1++;
                if (var2 != 0) {
                  break L3;
                } else {
                  if (var2 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ac.field_a.a((byte) 111);
            this.field_N = new le(480, 200);
            this.field_q = new le(480, 200);
            this.field_A = 0;
            this.field_I = 0;
            this.field_j = new StringBuilder(7);
            this.a(-19921);
            this.b((byte) -43);
            this.field_z = 49150;
            h.a(0, true);
            this.field_R = new le(340, 40);
            this.field_f = new le(340, 40);
            break L3;
          }
          var1 = 0;
          L5: while (true) {
            L6: {
              L7: {
                if (var1 >= 10) {
                  break L7;
                } else {
                  jf.field_f[var1] = 55 + (pf.a((byte) 119, 12) + -6);
                  ll.field_c[var1] = pf.a((byte) -91, 4) + 2;
                  lb.field_D[var1] = pf.a((byte) -101, 20);
                  var1++;
                  if (var2 != 0) {
                    break L6;
                  } else {
                    if (var2 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_fb = new int[ua.field_w.length];
              gl.a(ua.field_w, 0, this.field_fb, 0, this.field_fb.length);
              ch.b(-112);
              pg.field_b = null;
              dupTemp$2 = jf.a(-2147483648);
              this.field_W = dupTemp$2;
              this.field_J = dupTemp$2;
              this.field_cb = new int[5];
              this.field_S = true;
              break L6;
            }
            var1 = 0;
            L8: while (true) {
              L9: {
                L10: {
                  if ((this.field_cb.length ^ -1) >= (var1 ^ -1)) {
                    break L10;
                  } else {
                    this.field_cb[var1] = this.field_cb[var1] - var1 * 10;
                    var1++;
                    if (var2 != 0) {
                      break L9;
                    } else {
                      if (var2 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                this.field_gb = new boolean[5];
                break L9;
              }
              var1 = 0;
              L11: while (true) {
                L12: {
                  L13: {
                    if (this.field_gb.length <= var1) {
                      break L13;
                    } else {
                      this.field_gb[var1] = true;
                      var1++;
                      if (var2 != 0) {
                        break L12;
                      } else {
                        if (var2 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  this.field_lb = new int[5];
                  break L12;
                }
                return;
              }
            }
          }
        }
    }

    static {
        field_db = 0L;
    }
}
