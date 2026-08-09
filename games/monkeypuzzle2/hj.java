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
        int var4;
        int var5;
        int var6;
        int var7;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = -this.field_W + (this.field_O - 90);
                    if ((var2 ^ -1) > -1) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = -var2;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-201 > (var2 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = 200;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2 -= 40;
                    if (var2 < 0) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var2 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3 = var2 * 256 / 100;
                    var4 = -var3 + 256;
                    this.field_v = var4;
                    var5 = 0;
                    var6 = 15 / ((param0 - 63) / 32);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((this.field_fb.length ^ -1) >= (var5 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var7 = ua.field_w[var5];
                    var8 = ad.field_g[var5];
                    this.field_fb[var5] = ch.a(ch.a(65280, var8) * var4 + var3 * ch.a(var7, 65280), 16711680) + ch.a(var4 * ch.a(var8, 16711935) + ch.a(var7, 16711935) * var3, -16711936) >> 1365668616;
                    var5++;
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        if (!(0 <= this.field_A)) {
            this.field_A = 0;
        }
        this.field_j.setLength(0);
        StringBuilder discarded$24 = this.field_j.append(Integer.toString(this.field_A));
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 == 13816) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c((byte) -114);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= 5) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_gb[var2] = false;
                    this.field_cb[var2] = 10 + 10 * var2;
                    var2++;
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        if (this.field_A > 0 && !this.field_o && null == pg.field_b) {
            pg.field_b = di.a(rk.field_d, 65494, h.field_a, nj.field_b, new int[]{this.field_A}, 41, cl.field_d, 3, (byte) 100);
        }
        int var2 = -67 / ((param0 - -63) / 42);
    }

    private final void i(int param0) {
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int var2 = 0;
        int var3 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -6) {
                        statePc = 17;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var3 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_gb[var2]) {
                        statePc = 13;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    dupTemp$3 = this.field_cb[var2];
                    this.field_cb[var2] = dupTemp$3 - 1;
                    if (0 > dupTemp$3) {
                        statePc = 6;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_8_0 = this.field_gb;
                    stackIn_7_0 = stackIn_8_0;
                    stackIn_8_1 = var2;
                    stackIn_7_1 = stackIn_8_1;
                    if (var2 >= -1 + wd.field_h.b(-81)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = (boolean[]) ((Object) stackIn_7_0);
                    stackIn_9_1 = stackIn_7_1;
                    stackIn_9_2 = 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = (boolean[]) ((Object) stackIn_8_0);
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_9_0[stackIn_9_1] = stackIn_9_2 != 0;
                    if (!this.field_gb[var2]) {
                        statePc = 15;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var2 > 0) {
                        statePc = 12;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_cb[var2] = this.field_cb[-1 + var2] - 10;
                    if (var3 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    dupTemp$4 = this.field_cb[var2];
                    this.field_cb[var2] = dupTemp$4 + 1;
                    if ((dupTemp$4 ^ -1) >= -11) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_cb[var2] = 10;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var2++;
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        if (param0 != 1903697041) {
            hj.a((byte) -29, false);
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
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        float var2;
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
              stackIn_8_0 = this;

              if (Math.random() <= 0.5) {
                stackIn_9_0 = this;
                stackIn_9_1 = 660 + pf.a((byte) 41, 50);
                break L3;
              } else {
                stackIn_9_0 = this;
                stackIn_9_1 = -20 + -pf.a((byte) -109, 50);
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
        int var3;
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
                if (var2_int >= 0 && (wf.a(55) ^ -1L) >= -30001L) {
                    return false;
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
        float var2;
        float var3;
        int var4;
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        int fieldTemp$9 = 0;
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
        boolean stackOut_25_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ki var9_ref_ki = null;
        double var9_double = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (0 == kc.field_d) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (13 == this.field_jb) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(false);
                    pg.field_d[l.field_f].c((byte) -87);
                    ej.field_b = 0;
                    return;
                }
                case 4: {
                    if (dl.field_c[96]) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (dl.field_c[97]) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_w = 0;
                    if (var13 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_w = this.field_w + 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var2 = 2 + 2 * (this.field_w / 5);
                    if (10 < var2) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = 10;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (!dl.field_c[96]) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_z = this.field_z - 50 * var2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (dl.field_c[97]) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_z = this.field_z + var2 * 50;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (-33678 < (this.field_z ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_z = 33677;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-64624 > (this.field_z ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_z = 64623;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var3 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (!ba.a(-1)) {
                        statePc = 130;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = hf.field_f.field_o;
                    stackIn_131_0 = stackOut_25_0 ? 1 : 0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var13 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0) {
                        statePc = 64;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4 = (oa.field_H ^ hf.field_f.field_d) % 8;
                    if (0 != var4) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    cl.field_d = cl.field_d + rk.field_d;
                    h.field_a = h.field_a - 1;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-2 == (var4 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((var4 ^ -1) == -3) {
                        statePc = 47;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var4 == 3) {
                        statePc = 45;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var4 == 4) {
                        statePc = 43;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (-6 == (var4 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (6 == var4) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (-8 == (var4 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 38: {
                    nj.field_b = nj.field_b - h.field_a;
                    rk.field_d = rk.field_d - 1;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    nj.field_b = nj.field_b - rk.field_d;
                    h.field_a = h.field_a - 1;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    rk.field_d = rk.field_d + 1;
                    nj.field_b = nj.field_b + h.field_a;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    h.field_a = h.field_a + 1;
                    nj.field_b = nj.field_b + rk.field_d;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    rk.field_d = rk.field_d + 1;
                    cl.field_d = cl.field_d - h.field_a;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    h.field_a = h.field_a + 1;
                    cl.field_d = cl.field_d - rk.field_d;
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    rk.field_d = rk.field_d - 1;
                    cl.field_d = cl.field_d + h.field_a;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var4 = (hf.field_f.field_d ^ oa.field_H - -hf.field_f.field_A) % 5;
                    if (0 == var4) {
                        statePc = 63;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if ((var4 ^ -1) == -2) {
                        statePc = 61;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var4 == 2) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (-4 != (var4 ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    b.field_m = b.field_m + jc.field_e;
                    sd.field_e = sd.field_e + 1;
                    if (var13 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if ((var4 ^ -1) == -5) {
                        statePc = 58;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 58: {
                    b.field_m = b.field_m - jc.field_e;
                    sd.field_e = sd.field_e - 1;
                    if (var13 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    jc.field_e = jc.field_e - 1;
                    b.field_m = b.field_m - sd.field_e;
                    if (var13 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    b.field_m = b.field_m + sd.field_e;
                    jc.field_e = jc.field_e + 1;
                    if (var13 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    bh.field_g = bh.field_g | jc.field_e + b.field_m << 1903697041;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (oa.field_H != 13) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (13 == this.field_jb) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    l.field_f = 1;
                    if (var13 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.a(false);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    pg.field_d[l.field_f].c((byte) 73);
                    pg.field_d[l.field_f].a(false, false);
                    ej.field_b = 0;
                    return;
                }
                case 70: {
                    if ((ec.field_d ^ -1) <= -3) {
                        statePc = 72;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (oa.field_H == 99) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 74: {
                    this.field_o = true;
                    if (!dl.field_c[82]) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_ib = this.field_ib - 1;
                    if (var13 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    this.field_O = this.field_O + 1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (98 != oa.field_H) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (dl.field_c[82]) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.field_O = this.field_O - 1;
                    if (var13 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.field_ib = this.field_ib + 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    this.field_o = true;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (this.field_u == 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((this.field_u ^ -1) != -7) {
                        statePc = 96;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (oa.field_H == 83) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if ((oa.field_H ^ -1) == -83) {
                        statePc = 90;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (!jj.b(true)) {
                        statePc = 96;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (-1 != (this.field_jb ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (!qb.field_b) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (-1 < (ck.field_b ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.field_u = 1;
                    this.field_Y = 0;
                    this.field_T = 1;
                    cj.a((byte) -18, ke.field_h[1]);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (-3 >= (ec.field_d ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (oa.field_H != 26) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (dc.field_c <= 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_M = 320;
                    this.field_k = 480;
                    this.field_O = -14 + this.field_k;
                    uj.b(0);
                    dc.field_c = dc.field_c - 1;
                    rb.a(dc.field_c, (byte) -58);
                    this.field_o = true;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (oa.field_H != 36) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.field_jb = 1;
                    this.field_o = true;
                    this.field_d = 0;
                    cj.a((byte) 124, ke.field_h[31]);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (oa.field_H == 39) {
                        statePc = 105;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (ok.field_e) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = 1;
                    statePc = 108;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    ok.field_e = stackIn_108_0 != 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (-28 != (oa.field_H ^ -1)) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_M = 320;
                    this.field_k = 480;
                    this.field_O = -14 + this.field_k;
                    uj.b(0);
                    dc.field_c = dc.field_c + 1;
                    rb.a(dc.field_c, (byte) -58);
                    this.field_o = true;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (oa.field_H == 33) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = this;
                    stackIn_114_0 = stackIn_115_0;
                    if (this.field_S) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_116_0 = this;
                    stackIn_116_1 = 1;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = this;
                    stackIn_116_1 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    ((hj) (this)).field_S = stackIn_116_1 != 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (-10 == (oa.field_H ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_o = true;
                    el.a(true, 0);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if ((oa.field_H ^ -1) != -11) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    this.field_o = true;
                    el.a(true, 1);
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (oa.field_H != 11) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_o = true;
                    el.a(true, 2);
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((oa.field_H ^ -1) == -13) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_o = true;
                    el.a(true, 3);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if ((oa.field_H ^ -1) == -85) {
                        statePc = 129;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var3 = 1;
                    if (var13 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = ec.field_d;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 < 2) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (!dl.field_c[48]) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.field_o = true;
                    e.a(255, (byte) 40, 0);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (-3 < (ec.field_d ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (dl.field_c[68]) {
                        statePc = 137;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_o = true;
                    e.a(254, (byte) 40, 1);
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    mk.f(126);
                    this.field_H = this.field_H + 1;
                    var7 = this.field_jb;
                    if ((var7 ^ -1) != -1) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var13 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var7 != 6) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var13 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (var7 == 4) {
                        statePc = 248;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (13 == var7) {
                        statePc = 263;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var7 != 1) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var13 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (-3 == (var7 ^ -1)) {
                        statePc = 319;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (var7 == 3) {
                        statePc = 324;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if ((var7 ^ -1) != -6) {
                        statePc = 358;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var13 == 0) {
                        statePc = 345;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.i(0);
                    hh.f(8500);
                    eb.d((byte) -93);
                    ff.a(this.field_O, -6961);
                    if (!ub.field_a) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.field_J = jf.a(-2147483648);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if ((gb.field_o ^ -1) != (this.field_r ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (this.field_t <= 500) {
                        statePc = 161;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (ok.field_d) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (!hd.field_u.e(11253)) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    al.c((byte) -103);
                    this.field_t = 0;
                    this.field_r = -1;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    this.field_t = this.field_t + 1;
                    if (this.field_d % 800 != 2) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (500 < this.field_t) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    a.b(92);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    this.d((byte) 56);
                    if (0 != (15 & this.field_d)) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (!this.field_V) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    fieldTemp$0 = this.field_ab + 1;
                    this.field_ab = this.field_ab + 1;
                    if ((fieldTemp$0 ^ -1) != -5) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    this.field_ab = 0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (13 <= (127 & this.field_d)) {
                        statePc = 173;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((3 & this.field_d) != 0) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    fieldTemp$1 = this.field_x + 1;
                    this.field_x = this.field_x + 1;
                    if (fieldTemp$1 != 4) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    this.field_x = 0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    fieldTemp$2 = this.field_G;
                    this.field_G = this.field_G - 1;
                    if (-1 != (fieldTemp$2 ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_176_0 = this;
                    stackIn_175_0 = stackIn_176_0;
                    if (Math.random() <= 0.9) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackIn_177_0 = this;
                    stackIn_177_1 = 1;
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = this;
                    stackIn_177_1 = 0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    ((hj) (this)).field_C = stackIn_177_1 != 0;
                    this.field_G = 25;
                    this.field_X = 172 + pf.a((byte) -115, 232);
                    this.field_h = pf.a((byte) 76, 64);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    kj.a(var3 != 0, -1);
                    if (!qb.field_b) {
                        statePc = 182;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if ((ck.field_b ^ -1) > -1) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    this.a(-19921);
                    var4 = 15;
                    if (1 != this.field_u) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var4 = 3;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (0 != (this.field_d & var4)) {
                        statePc = 200;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var7 = ba.field_a[this.field_u].length;
                    this.a((byte) 82);
                    fieldTemp$3 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if (var7 == fieldTemp$3) {
                        statePc = 187;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (1 == this.field_u) {
                        statePc = 189;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var8 = 0;
                    var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (var9_ref_ki == null) {
                        statePc = 198;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackIn_201_0 = 0;
                    stackIn_192_0 = stackIn_201_0;
                    stackIn_201_1 = var8;
                    stackIn_192_1 = stackIn_201_1;
                    if (var13 != 0) {
                        statePc = 201;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (stackIn_192_0 == stackIn_192_1) {
                        statePc = 194;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var8++;
                    if (var13 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    this.field_lb[-1 + var8] = var9_ref_ki.field_l;
                    var8++;
                    if (-7 == (var8 ^ -1)) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                    if (var13 == 0) {
                        statePc = 190;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_r = gb.field_o;
                    var9_double = (double)this.field_z * 6.283185307179586 / 65535.0;
                    var11 = (int)(10000.0 * Math.cos(var9_double));
                    var12 = (int)(Math.sin(var9_double) * 10000.0);
                    n.a(var12, var11, this.field_M, this.field_k, -301);
                    this.field_T = -1;
                    this.field_u = 0;
                    this.g(13816);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    this.field_Y = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    stackIn_201_0 = gb.field_o ^ -1;
                    stackIn_201_1 = -1;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (stackIn_201_0 == stackIn_201_1) {
                        statePc = 204;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    this.field_jb = 1;
                    this.field_d = 0;
                    cj.a((byte) 112, ke.field_h[31]);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var5 = pf.a((byte) -119, 480);
                    var6 = 2147483647;
                    var7 = var5 - 3;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var5 + 3 <= var7) {
                        statePc = 213;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackIn_459_0 = 0;
                    stackIn_208_0 = stackIn_459_0;
                    stackIn_459_1 = var7;
                    stackIn_208_1 = stackIn_459_1;
                    if (var13 != 0) {
                        statePc = 459;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (stackIn_208_0 >= stackIn_208_1) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if ((var7 ^ -1) > -481) {
                        statePc = 211;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 211: {
                    this.field_F[var7] = this.field_F[var7] + this.field_n;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var7++;
                    if (var13 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var7 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (480 <= var7) {
                        statePc = 219;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    stackIn_220_0 = var6;
                    stackIn_216_0 = stackIn_220_0;
                    stackIn_220_1 = this.field_F[var7];
                    stackIn_216_1 = stackIn_220_1;
                    if (var13 != 0) {
                        statePc = 220;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (stackIn_216_0 <= stackIn_216_1) {
                        statePc = 218;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    var6 = this.field_F[var7];
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    var7++;
                    if (var13 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    stackIn_220_0 = var6 >> 1640774308 ^ -1;
                    stackIn_220_1 = -1;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (stackIn_220_0 < stackIn_220_1) {
                        statePc = 222;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var7 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if ((var7 ^ -1) <= -481) {
                        statePc = 227;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    this.field_F[var7] = this.field_F[var7] - var6;
                    var7++;
                    if (var13 != 0) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (var13 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    this.field_O = this.field_O - (var6 >> 1590750532);
                    this.field_k = this.field_O - -14;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    this.e(125);
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (this.field_u != 0) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (50 > -90 + this.field_O - this.field_W) {
                        statePc = 236;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if ((this.field_u ^ -1) != -7) {
                        statePc = 358;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (-90 + this.field_O + -this.field_W > 50) {
                        statePc = 235;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 235: {
                    this.field_u = 0;
                    nf.a(aa.field_a, (byte) 115, 8, 1);
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    this.field_u = 6;
                    ve.a(125, 8, 0, je.field_i);
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if ((this.field_d & 15) == 0) {
                        statePc = 240;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 240: {
                    fieldTemp$4 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if (fieldTemp$4 == cm.field_F.length) {
                        statePc = 242;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 242: {
                    this.field_Y = 0;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (this.field_d <= 450) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    this.field_jb = 0;
                    this.field_d = 0;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (850 < this.field_d) {
                        statePc = 261;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (0 != (15 & this.field_d)) {
                        statePc = 253;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (-201 <= (this.field_d ^ -1)) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    fieldTemp$5 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if ((fieldTemp$5 ^ -1) != (cm.field_F.length ^ -1)) {
                        statePc = 253;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    this.field_Y = 0;
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if ((this.field_d ^ -1) >= -451) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (-4 == (aa.field_a ^ -1)) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (450 >= this.field_d) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    ie.a(aa.field_a + 1, -28);
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    this.field_jb = 3;
                    this.field_d = 0;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    this.field_d = 0;
                    this.field_jb = 3;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (this.field_nb == 0) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    bl.a(50, bl.field_g);
                    al.c((byte) -84);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    this.field_nb = this.field_nb + 4;
                    if (-2121 > (this.field_nb ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 268: {
                    bl.a(50, uh.field_e);
                    if (ok.a(false)) {
                        statePc = 274;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (0 >= this.field_P) {
                        statePc = 272;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    l.field_f = 6;
                    if (var13 == 0) {
                        statePc = 280;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    l.field_f = 2;
                    if (var13 == 0) {
                        statePc = 280;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (0 < this.field_P) {
                        statePc = 277;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if ((this.field_A ^ -1) >= -1) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    l.field_f = 7;
                    if (var13 == 0) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    l.field_f = 0;
                    bl.a(50, uh.field_e);
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    pg.field_d[l.field_f].c((byte) -98);
                    ej.field_b = 0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if ((this.field_d & 15) == 0) {
                        statePc = 283;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var7 = ba.field_a[this.field_u].length;
                    this.a((byte) 115);
                    fieldTemp$6 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if ((fieldTemp$6 ^ -1) != (var7 ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    this.field_Y = 3;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (this.field_d != 0) {
                        statePc = 293;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    this.field_I = (4800000 - (-this.field_O + 480) * 30000) / 480;
                    if (0 <= this.field_I) {
                        statePc = 289;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    this.field_I = 0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
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
                        statePc = 291;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 291: {
                    e.a(254, (byte) 40, 1);
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    this.field_mb = 0.0f;
                    this.field_s = 1 + (-13 + this.field_k - ba.field_a[0][0].field_n) / 30;
                    cj.a((byte) -33, ke.field_h[18]);
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (0 != (this.field_d & 15)) {
                        statePc = 300;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var7 = ba.field_a[this.field_u].length;
                    this.a((byte) 75);
                    fieldTemp$7 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if (fieldTemp$7 == var7) {
                        statePc = 296;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (this.field_u == 2) {
                        statePc = 299;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    this.field_Y = 0;
                    if (var13 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    this.field_Y = 2;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    nh.b((byte) 107);
                    ff.a(this.field_O, -6961);
                    hh.f(8500);
                    this.d((byte) 56);
                    if (this.field_u == 2) {
                        statePc = 304;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if ((hl.a(1, -ba.field_a[0][0].field_n + (-13 + this.field_k), this.field_M + -100) ^ -1) > -101) {
                        statePc = 303;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 303: {
                    this.field_u = 2;
                    cj.a((byte) -116, ke.field_h[19]);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    rc.a(this.field_mb, this.field_s, (byte) -111);
                    if (0 <= mh.field_D) {
                        statePc = 314;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (-3 != (this.field_u ^ -1)) {
                        statePc = 314;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if ((vj.a(dc.field_c, 1) ^ -1) != (aa.field_a ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    ie.a(aa.field_a, 119);
                    this.field_jb = 2;
                    this.field_d = 0;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    this.field_jb = 4;
                    this.field_d = 0;
                    if ((dc.field_c ^ -1) != -20) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    bl.a(50, wf.field_h);
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    bl.a(50, b.field_l);
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (2 != this.field_u) {
                        statePc = 318;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    this.field_mb = this.field_mb + 0.10000000149011612f;
                    if (1.0f < this.field_mb) {
                        statePc = 317;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 317: {
                    this.field_mb = 0.0f;
                    this.field_s = this.field_s - 1;
                    nf.n(-48);
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (-101 <= (this.field_d ^ -1)) {
                        statePc = 322;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    this.field_jb = 3;
                    this.field_d = 0;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (0 == this.field_d) {
                        statePc = 326;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 326: {
                    this.field_A = this.field_A + (10000 - -this.field_I);
                    var7 = this.field_I + 10000;
                    var8 = ej.field_b % 3;
                    if (0 != var8) {
                        statePc = 329;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    cl.field_d = cl.field_d + var7;
                    if (var13 == 0) {
                        statePc = 333;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (var8 != 1) {
                        statePc = 332;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    nj.field_b = nj.field_b - var7;
                    if (var13 == 0) {
                        statePc = 333;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var9 = var7 / 3;
                    cl.field_d = cl.field_d + var9;
                    nj.field_b = nj.field_b - (var7 - var9);
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
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
                    dupTemp$8 = jf.a(-2147483648);
                    this.field_W = dupTemp$8;
                    this.field_J = dupTemp$8;
                    this.e(102);
                    this.field_u = 0;
                    fl.b(124);
                    this.a(-19921);
                    if (-1 != (aa.field_a ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    this.field_ib = 95;
                    if (var13 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if (3 != aa.field_a) {
                        statePc = 338;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.field_ib = 11;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (20 != dc.field_c) {
                        statePc = 341;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    this.field_u = 4;
                    this.field_jb = 5;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    if ((this.field_d ^ -1) < -101) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    this.field_jb = 0;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    this.field_d = this.field_d + 2;
                    if (var13 == 0) {
                        statePc = 358;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (-1051 <= (this.field_d ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    if (!ok.a(false)) {
                        statePc = 349;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    l.field_f = 7;
                    if (var13 == 0) {
                        statePc = 353;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (0 < this.field_P) {
                        statePc = 352;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    l.field_f = 2;
                    this.c((byte) -115);
                    if (var13 == 0) {
                        statePc = 353;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    l.field_f = 6;
                    this.c((byte) -109);
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    pg.field_d[l.field_f].c((byte) 93);
                    this.field_nb = 0;
                    ej.field_b = 0;
                    this.field_d = 0;
                    bl.a(50, uh.field_e);
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (-1 != (this.field_d & 15 ^ -1)) {
                        statePc = 357;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var7 = ba.field_a[this.field_u].length;
                    fieldTemp$9 = this.field_Y + 1;
                    this.field_Y = this.field_Y + 1;
                    if ((fieldTemp$9 ^ -1) != (var7 ^ -1)) {
                        statePc = 357;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 356: {
                    this.field_Y = 0;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    this.field_d = this.field_d + 2;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (!this.field_l) {
                        statePc = 372;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    var4 = this.field_d % 480;
                    var5 = 0;
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if (var5 >= 480) {
                        statePc = 370;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var6 = var4 - 1;
                    var7 = var4;
                    stackIn_398_0 = var6;
                    stackIn_362_0 = stackIn_398_0;
                    if (var13 != 0) {
                        statePc = 398;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (stackIn_362_0 >= 0) {
                        statePc = 364;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var6 = var6 + 480;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if ((var7 ^ -1) > -1) {
                        statePc = 366;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var7 = 480 + var7;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    var8 = this.field_F[var6];
                    var9 = this.field_F[var7];
                    if ((var8 ^ -1) < (var9 ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var10 = var8 + var9 >> -890035327;
                    var8 = var10;
                    var9 = var10;
                    this.field_F[var6] = var8;
                    this.field_F[var7] = var9;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    var5++;
                    var4--;
                    if (var13 == 0) {
                        statePc = 360;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (var13 == 0) {
                        statePc = 394;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 372: {
                    var4 = this.field_d % 480;
                    var5 = 0;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    if (480 <= var5) {
                        statePc = 394;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var6 = 1 + var4;
                    var7 = var4;
                    stackIn_409_0 = -481;
                    stackIn_375_0 = stackIn_409_0;
                    stackIn_409_1 = var6 ^ -1;
                    stackIn_375_1 = stackIn_409_1;
                    if (var13 != 0) {
                        statePc = 409;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (stackIn_375_0 >= stackIn_375_1) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    var6 = -480 + var6;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (480 > var7) {
                        statePc = 380;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var7 = var7 + -480;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    var8 = this.field_F[var6];
                    var9 = this.field_F[var7];
                    if ((var8 ^ -1) < (var9 ^ -1)) {
                        statePc = 382;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    var10 = var9 + var8 >> 1049476001;
                    var9 = var10;
                    var8 = var10;
                    this.field_F[var6] = var8;
                    this.field_F[var7] = var9;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    var4++;
                    var5++;
                    if (var13 == 0) {
                        statePc = 373;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var4 = this.field_d % 480;
                    var5 = 0;
                    statePc = 384;
                    continue stateLoop;
                }
                case 384: {
                    if (480 <= var5) {
                        statePc = 394;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var6 = 1 + var4;
                    var7 = var4;
                    stackIn_409_0 = -481;
                    stackIn_386_0 = stackIn_409_0;
                    stackIn_409_1 = var6 ^ -1;
                    stackIn_386_1 = stackIn_409_1;
                    if (var13 != 0) {
                        statePc = 409;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (stackIn_386_0 >= stackIn_386_1) {
                        statePc = 388;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 388: {
                    var6 = -480 + var6;
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    if (480 > var7) {
                        statePc = 391;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var7 = var7 + -480;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    var8 = this.field_F[var6];
                    var9 = this.field_F[var7];
                    if ((var8 ^ -1) < (var9 ^ -1)) {
                        statePc = 393;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    var10 = var9 + var8 >> 1049476001;
                    var9 = var10;
                    var8 = var10;
                    this.field_F[var6] = var8;
                    this.field_F[var7] = var9;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    var4++;
                    var5++;
                    if (var13 == 0) {
                        statePc = 384;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    stackIn_396_0 = this;
                    stackIn_395_0 = stackIn_396_0;
                    if (this.field_l) {
                        statePc = 396;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    stackIn_397_0 = this;
                    stackIn_397_1 = 1;
                    statePc = 397;
                    continue stateLoop;
                }
                case 396: {
                    stackIn_397_0 = this;
                    stackIn_397_1 = 0;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    ((hj) (this)).field_l = stackIn_397_1 != 0;
                    stackIn_398_0 = aa.field_a;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (stackIn_398_0 == 0) {
                        statePc = 408;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    if (-4 != (aa.field_a ^ -1)) {
                        statePc = 418;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if ((31 & this.field_d ^ -1) != -1) {
                        statePc = 402;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    this.field_ib = this.field_ib + 1;
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    if (this.field_ib >= 11) {
                        statePc = 405;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    this.field_ib = 11;
                    if (var13 == 0) {
                        statePc = 418;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (317 < this.field_ib) {
                        statePc = 407;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 407: {
                    this.field_ib = 317;
                    if (var13 == 0) {
                        statePc = 418;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    stackIn_409_0 = 0;
                    stackIn_409_1 = this.field_d & 127;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (stackIn_409_0 == stackIn_409_1) {
                        statePc = 411;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.field_ib = this.field_ib - 1;
                    statePc = 412;
                    continue stateLoop;
                }
                case 412: {
                    if (95 >= this.field_ib) {
                        statePc = 415;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    this.field_ib = 95;
                    if (var13 == 0) {
                        statePc = 417;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    if (-31 >= (this.field_ib ^ -1)) {
                        statePc = 417;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 416: {
                    this.field_ib = 30;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    this.h(340);
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    this.field_y = this.field_y + 1;
                    if ((7 & this.field_d ^ -1) != -1) {
                        statePc = 424;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    this.field_c = this.field_c + 1;
                    i.field_n = i.field_n + 1;
                    if (-5 == (this.field_c ^ -1)) {
                        statePc = 421;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 421: {
                    this.field_c = 0;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (i.field_n != 6) {
                        statePc = 424;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    i.field_n = 0;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if (-1 == (this.field_d & 15 ^ -1)) {
                        statePc = 426;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 426: {
                    sk.field_G = sk.field_G + 1;
                    if (-7 == (sk.field_G ^ -1)) {
                        statePc = 428;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 428: {
                    sk.field_G = 0;
                    statePc = 429;
                    continue stateLoop;
                }
                case 429: {
                    if (this.field_y == m.field_i[0].field_n) {
                        statePc = 431;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 431: {
                    this.field_y = 0;
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    if (param0 > 64) {
                        statePc = 434;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    this.field_W = -2;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    var4 = 0;
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    if (-11 >= (var4 ^ -1)) {
                        statePc = 441;
                    } else {
                        statePc = 436;
                    }
                    continue stateLoop;
                }
                case 436: {
                    lb.field_D[var4] = lb.field_D[var4] + pf.a((byte) 23, 3);
                    stackIn_442_0 = lb.field_D[var4];
                    stackIn_437_0 = stackIn_442_0;
                    stackIn_442_1 = 100;
                    stackIn_437_1 = stackIn_442_1;
                    if (var13 != 0) {
                        statePc = 442;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    if (stackIn_437_0 > stackIn_437_1) {
                        statePc = 439;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 439: {
                    lb.field_D[var4] = 0;
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    var4++;
                    if (var13 == 0) {
                        statePc = 435;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    stackIn_442_0 = this.field_J;
                    stackIn_442_1 = this.field_W;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if (stackIn_442_0 == stackIn_442_1) {
                        statePc = 451;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    if (this.field_W >= this.field_J) {
                        statePc = 446;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    this.field_W = this.field_W + 1;
                    if (var13 == 0) {
                        statePc = 447;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    this.field_W = this.field_W - 1;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if (5 > Math.abs(-this.field_J + this.field_W)) {
                        statePc = 449;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 449: {
                    this.field_W = this.field_J;
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    this.e(-21);
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    return;
                }
                case 452: {
                    var6 = this.field_F[var7];
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    var7++;
                    if (var13 == 0) {
                        statePc = 461;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if (stackIn_455_0 <= stackIn_455_1) {
                        statePc = 453;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 457: {
                    stackIn_220_0 = var6;
                    stackIn_458_0 = stackIn_220_0;
                    stackIn_220_1 = this.field_F[var7];
                    stackIn_458_1 = stackIn_220_1;
                    if (var13 != 0) {
                        statePc = 220;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    stackIn_455_0 = stackIn_458_0;
                    stackIn_455_1 = stackIn_458_1;
                    statePc = 455;
                    continue stateLoop;
                }
                case 459: {
                    if (stackIn_459_0 <= stackIn_459_1) {
                        statePc = 219;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 461: {
                    stackIn_459_0 = 480;
                    stackIn_459_1 = var7;
                    statePc = 459;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        int incrementValue$0 = 0;
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
        int statePc = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = null;
                    var22 = null;
                    var20 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (aa.field_a == 2) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (aa.field_a != 3) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var2 = -100 + this.field_ib;
                    if ((this.field_ib ^ -1) <= -241) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ge.h(77, 0, 563, 146);
                    if (0 < var2) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ge.a(77, var2 - 145, 486, 145, 265542, 5383094);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var2 ^ -1) <= -146) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ge.a(77, var2, 486, 145, 5383094, 8374005);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    ge.d(77, var2 - -145, 486, 145, 8374005);
                    ge.h(0, 0, 640, 480);
                    hf.field_d.c(320 + -(hf.field_d.field_m >> -1337206303), this.field_ib);
                    if (var20 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ge.a(77, 0, 486, 150, 265542, 5383094);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var20 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((aa.field_a ^ -1) == -1) {
                        statePc = 13;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = -((-30 + this.field_ib) * 255 / 65) + 255;
                    fi.field_a[fi.field_a.length + -1].a(0, 0, var2, 15387868);
                    hf.field_d.e(-(hf.field_d.field_m >> -294507870) + 320, this.field_ib);
                    ge.h(0, 0, 640, 70);
                    ge.a(5120, (hf.field_d.field_m >> 2126480610) + this.field_ib << 632372036, hf.field_d.field_m << 1586773603, 50, cf.field_a);
                    ge.h(0, 0, 640, 480);
                    if (var20 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2 = -(2 * m.field_i[0].field_n) + this.field_y;
                    var3 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((m.field_i[0].field_n * 2 + this.field_y ^ -1) >= (var2 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    incrementValue$0 = var3;
                    var3++;
                    var4 = incrementValue$0 + this.field_c;
                    var4 = var4 % 4;
                    stackIn_25_0 = 0;
                    stackIn_17_0 = stackIn_25_0;
                    if (var20 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = stackIn_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (-641 >= (var5 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    m.field_i[var4].a(var5, var2);
                    var5 = var5 + m.field_i[0].field_m;
                    if (var20 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var20 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var2 = var2 + m.field_i[0].field_n;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var20 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = aa.field_a;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    al.a(this.field_H, (byte) -126);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (aa.field_a == 3) {
                        statePc = 44;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((aa.field_a ^ -1) != -1) {
                        statePc = 75;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ge.h(0, 0, 640, 480);
                    fi.field_a[0].c(0, 0);
                    j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                    var2 = 80;
                    var3 = 0;
                    var4 = 95999;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var4 ^ -1) > -1) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_N.field_s[var4] = ac.field_a.field_e[var3 + var2];
                    var2++;
                    stackIn_37_0 = var2 ^ -1;
                    stackIn_33_0 = stackIn_37_0;
                    stackIn_37_1 = -561;
                    stackIn_33_1 = stackIn_37_1;
                    if (var20 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (stackIn_33_0 != stackIn_33_1) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var3 = var3 + ac.field_a.field_g;
                    var2 = 80;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var4--;
                    if (var20 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_N.c();
                    ge.a(this.field_N.field_s, this.field_N.field_k, this.field_N.field_j);
                    kl.a(100, 5, this.field_d, 0, 0, this.field_N.field_k, this.field_N.field_j);
                    this.field_q.e();
                    this.field_N.a(this.field_N.field_m << 103940579, this.field_N.field_n << -2061765117, 3200, 1600, 63535, 4096);
                    ac.field_a.a((byte) 116);
                    ge.h(80, 0, 560, 480);
                    fi.field_a[1].c(0, 0);
                    this.field_q.b(80, 317, 580, 200, 100);
                    stackIn_37_0 = 80;
                    stackIn_37_1 = 316;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    ge.h(stackIn_37_0, stackIn_37_1, 560, 371);
                    var3 = 70;
                    fi.field_a[0].c(0, 0);
                    var4 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var3 ^ -1) <= -291) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ge.h(0, var3, 640, var3 + 2);
                    ge.a(5120, (hf.field_d.field_m >> -786972350) + (this.field_ib - 2 * var4) << -469576252, hf.field_d.field_m << 912471971, 50, cf.field_a);
                    var3 += 2;
                    var4 += 2;
                    if (var20 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var20 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ge.h(80, 0, 560, 480);
                    j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                    ge.b();
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var20 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (-171 < (this.field_ib ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var2 = stackIn_47_0;
                    var3 = -qa.field_i.field_n + (this.field_ib + -220);
                    fe.field_f[this.field_c].b(0, 0, 100);
                    var4 = 255 * (-11 + this.field_ib) / 306;
                    if (-101 <= (var4 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var4 = 100;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    ge.c(70, 0, 500, 480, 265542, var4);
                    var5 = this.field_ib + -100;
                    var6 = 0;
                    if (this.field_ib > 100) {
                        statePc = 51;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (180 <= this.field_ib) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var6 = 50 - (9000 + -(this.field_ib * 50)) / 80;
                    if (var20 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var6 = 50;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ge.h(0, 0, 640, 145);
                    if (this.field_ib >= 250) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ge.a(5120, (hf.field_d.field_m >> -284282911) + this.field_ib << 1156533284, hf.field_d.field_m << -1357943932, -var6 + 50, cf.field_a);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var2 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ge.a(320 - qa.field_i.field_m << 1947285252, var3 - (-(qa.field_i.field_n >> 1644914081) + 8) << -361708060, qa.field_i.field_m << -1062887580, 50, sk.field_D);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var6 >= 50) {
                        statePc = 64;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var7_int = 145;
                    var8 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if ((var7_int ^ -1) <= -291) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    ge.h(0, var7_int, 640, 2 + var7_int);
                    ge.a(5120, -(4 * var8) + this.field_ib + (hf.field_d.field_m >> -1127253663) << 235989604, hf.field_d.field_m << -57743068, 50 + -var6, cf.field_a);
                    var8 += 2;
                    var7_int += 2;
                    if (var20 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var20 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var5 ^ -1) < 89) {
                        statePc = 66;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var7_int = var5 - -90;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (-101 <= (var7_int ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var7_int = 100;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    ge.h(0, 0, 640, var7_int);
                    var8 = 256 * var7_int / 100;
                    if (256 >= var8) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var8 = 256;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    ma.a(this.field_m.field_s, 80, 0, this.field_m.field_m, var7_int, var8, 0);
                    ac.field_a.a((byte) 110);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (var2 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    qa.field_i.c(-qa.field_i.field_m + 320 - (qa.field_i.field_m >> -1398397183), var3);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (!this.field_C) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (-2 != (aa.field_a ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    pc.field_U[this.field_x].c(this.field_X, this.field_h);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var2 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if ((var2 ^ -1) <= (ib.field_c ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var3 = pd.field_f[var2] - (dj.field_a[0].field_m >> -146205343);
                    var4 = 0;
                    stackIn_89_0 = 0;
                    stackIn_81_0 = stackIn_89_0;
                    if (var20 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var5 = stackIn_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if ((var5 ^ -1) <= (mc.field_e[var2].length ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    dj.field_a[mc.field_e[var2][var5]].c(var3, var4);
                    var4 = var4 + (dj.field_a[var5].field_n + -1);
                    var5++;
                    if (var20 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var20 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var2++;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (var20 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ll.a(24733);
                    ci.a(-2865);
                    ck.field_a[1].c(20 + this.field_M, -wl.field_f[0].field_n + (this.field_k + -13));
                    stackIn_89_0 = wd.field_h.e(11253) ? 1 : 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var21_ref = (ki) ((Object) wd.field_h.a((byte) -117));
                    if (var21_ref != null) {
                        statePc = 92;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var21_ref.field_B = (float)this.field_M;
                    var21_ref.field_q = (float)(-48 + this.field_k);
                    if (jj.b(true)) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var21_ref.a((byte) -74);
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var3 = 1;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if ((var3 ^ -1) <= -5) {
                        statePc = 114;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var22_ref = (ki) ((Object) wd.field_h.d((byte) 63));
                    if (var20 != 0) {
                        statePc = 115;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var22_ref != null) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var20 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var4 = var3;
                    if (-2 == (var4 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var4 != 2) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var20 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (-4 != (var4 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var20 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var22_ref.field_B = 360.0f;
                    var22_ref.field_q = (float)(this.field_k + -48);
                    if (var20 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var22_ref.field_q = (float)(this.field_k + -38);
                    var22_ref.field_B = 385.0f;
                    if (var20 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var22_ref.field_B = 370.0f;
                    var22_ref.field_q = (float)(-28 + this.field_k);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var22_ref.a((byte) -60);
                    var22_ref.field_q = (float)(148 + (var3 - 1) * 59);
                    var22_ref.field_B = 602.0f;
                    var3++;
                    if (var20 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    df.f(18180);
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var2 = (int)(ia.a(true, (float)this.field_H * 0.00800000037997961f) * 50.0f);
                    var3 = 727655;
                    ge.c(80, this.field_O, 480, 480, var3, 120);
                    var4 = 0;
                    ge.h(80, 0, 560, 480);
                    var5 = 0;
                    var6 = 0;
                    var7_int = this.field_d / 2 % 480;
                    var8 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (-481 >= (var8 ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_322_0 = var7_int;
                    stackIn_118_0 = stackIn_322_0;
                    stackIn_322_1 = 480;
                    stackIn_118_1 = stackIn_322_1;
                    if (var20 != 0) {
                        statePc = 322;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 >= stackIn_118_1) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var7_int = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var9 = this.field_F[var7_int] >> -2130373532;
                    var10 = 80 + var8;
                    var11 = -var9 + this.field_O;
                    if (80 != var10) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var5 = var11;
                    if (var20 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-560 == (var10 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var6 = var11;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    ge.g(var10, var11, var9, var3, 120);
                    this.a(30717, var10, var9, var2, var11, 5);
                    this.a(30717, var10, var9, -50 - -var2, var11, 30);
                    this.a(30717, var10, var9, var2 + -60, var11, 30);
                    this.a(30717, var10, var9, -80 + var2, var11, 5);
                    if (var9 > var4) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var4 = var9;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    var8++;
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var7_int = this.field_O;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (var7_int >= 480) {
                        statePc = 137;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var8 = -this.field_O + var7_int;
                    stackIn_140_0 = -86;
                    stackIn_133_0 = stackIn_140_0;
                    stackIn_140_1 = var8 ^ -1;
                    stackIn_133_1 = stackIn_140_1;
                    if (var20 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 <= stackIn_133_1) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var20 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                    ge.i(var7_int - -var2, var7_int, 5, -var9 + 5592405);
                    ge.i(var7_int - (50 + -var2), var7_int, 30, -var9 + 5592405);
                    ge.i(var2 + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                    ge.i(var7_int + (-80 + var2), var7_int, 5, 5592405 + -var9);
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 131;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (this.field_S) {
                        statePc = 139;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 139: {
                    ge.b(1, 1, 80, this.field_O, 480, 4);
                    stackIn_140_0 = 2;
                    stackIn_140_1 = 2;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    ge.b(stackIn_140_0, stackIn_140_1, 80, this.field_O + 4, 480, 476 - this.field_O);
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if ((this.field_jb ^ -1) == -1) {
                        statePc = 145;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (this.field_jb == 13) {
                        statePc = 145;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (-2 == (this.field_jb ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if ((this.field_jb ^ -1) == -14) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (this.field_jb != 1) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var7_int = -this.field_d + 4;
                    if (var20 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var7_int = this.field_d;
                    if (-5 <= (var7_int ^ -1)) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var7_int = 4;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var7_int <= 0) {
                        statePc = 164;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var8 = this.field_v - -(int)(ia.a(true, (float)this.field_d * 0.10000000149011612f) * 20.0f);
                    if (-1 < (var8 ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var8 = 0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (-256 > (var8 ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var8 = 255;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var9 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (-11 >= (var9 ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    ge.a((var9 * lb.field_D[var9] + this.field_d) % 480 + 80 << 23307844, -90 + this.field_k + (int)(4.0f * ia.a(true, (float)(var9 * lb.field_D[var9] + this.field_d) * 0.10000000149011612f)) << -366411164, ll.field_c[var9] << 435665412, jf.field_f[var9], cf.field_a);
                    var9++;
                    if (var20 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (var20 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    uc.a(78, -90 + this.field_k, 558, this.field_k + -90, 3, var8, var7_int, this.field_fb);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    ge.h(0, 0, 640, 480);
                    ge.c(70, var5, 10, -var5 + 480, var3, 120);
                    ge.c(560, var6, 10, -var6 + 480, var3, 120);
                    ka.b(0);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var7 = qh.field_a[this.field_ab];
                    var7.b(var7.field_m << -600862045, var7.field_n << 2020967139, (int)this.field_B << -18135196, (int)this.field_Z << 1934953316, this.field_g, 4096);
                    lb.field_E[0].c(0, 0);
                    lb.field_E[1].c(640 - lb.field_E[1].field_m, 0);
                    var8 = 0;
                    var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var9_ref_ki == null) {
                        statePc = 184;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackIn_185_0 = var8;
                    stackIn_168_0 = stackIn_185_0;
                    if (var20 != 0) {
                        statePc = 185;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (stackIn_168_0 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var9_ref_ki.field_q = (float)((-1 + var8) * 59 + 148);
                    var9_ref_ki.field_B = 602.0f;
                    if (!this.field_gb[var8 + -1]) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if ((this.field_cb[var8 + -1] ^ -1) <= -11) {
                        statePc = 174;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var10 = var9_ref_ki.field_I.field_m * this.field_cb[-1 + var8] / 10;
                    var9_ref_ki.field_I.d((-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_B + (float)var9_ref_ki.field_G), (-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var10, var10);
                    if (var20 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var9_ref_ki.a((byte) -97);
                    if (var20 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (this.field_lb[var8 + -1] < 0) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var10_ref_le = ak.field_t[this.field_lb[-1 + var8]];
                    if (var20 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var10_ref_le = tl.field_b;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((this.field_cb[var8 - 1] ^ -1) <= -11) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var11 = var10_ref_le.field_m * this.field_cb[var8 + -1] / 10;
                    var10_ref_le.d((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B) + (-var11 + var10_ref_le.field_m) / 2, (var10_ref_le.field_m - var11) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var11, var11);
                    if (var20 == 0) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var10_ref_le.c((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B), (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y));
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var8++;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                    if (var20 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_185_0 = var8 ^ -1;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (stackIn_185_0 != -6) {
                        statePc = 193;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (this.field_lb[-1 + var8] < 0) {
                        statePc = 188;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var9_ref_le = ak.field_t[this.field_lb[var8 + -1]];
                    statePc = 189;
                    continue stateLoop;
                }
                case 188: {
                    var9_ref_le = tl.field_b;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var10 = 148 + 59 * var8 + -59;
                    if (this.field_cb[-1 + var8] < 10) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var9_ref_le.c(602 + -(var9_ref_le.field_m / 2), -(var9_ref_le.field_m / 2) + var10);
                    if (var20 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var11 = var9_ref_le.field_m * this.field_cb[var8 - 1] / 10;
                    var9_ref_le.d(-(var9_ref_le.field_m / 2) + (-var11 + var9_ref_le.field_m) / 2 + 602, var10 + -(var9_ref_le.field_m / 2) + (var9_ref_le.field_m + -var11) / 2, var11, var11);
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    var9 = (23040 + -(144 * (480 - this.field_O))) / 480;
                    if ((var9 ^ -1) < -1) {
                        statePc = 195;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 195: {
                    ge.c(25, 48 - var9 + 412, 28, var9, 1203134, 120);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    ge.c(37, 460, 4, 20, 1203134, 120);
                    j.field_g.c(-(j.field_g.field_m >> -1739532991) + this.field_M + -20, -j.field_g.field_n + this.field_k);
                    if (2 != this.field_u) {
                        statePc = 205;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (2 <= this.field_Y) {
                        statePc = 200;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (4 != this.field_jb) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var23 = ba.field_a[2][this.field_Y];
                    var10_ref_le = var23;
                    var11 = (bl.field_f - (var23.field_m >> -1597311775) - (-100 + this.field_M)) * 150;
                    if (-1 >= (var11 ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var11 = -var11 + 65535;
                    if (var20 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (-65536 <= (var11 ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var11 = var11 - 65535;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    var10_ref_le.b(var23.field_m << 1123805987, 160, bl.field_f << 2123968420, mh.field_D << 1186612868, var11, 4096);
                    if (var20 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var24 = ba.field_a[this.field_u][this.field_Y];
                    var10_ref_le = var24;
                    var10_ref_le.c(-100 + this.field_M, -var24.field_n + this.field_k - 13);
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
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
                        statePc = 217;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var12 = -600 + this.field_nb;
                    if ((var12 ^ -1) < -1) {
                        statePc = 209;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var13_int = var12 + -100;
                    if (-256 <= (var13_int ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    ib.field_d.a(0, 0);
                    if (var20 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (255 < var12) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var12 = 255;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    ma.a(ib.field_d, 0, 0, 480, var12, var13_int);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (-2 == (this.field_jb ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (-3 != (this.field_jb ^ -1)) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    this.field_R.c(150, 260);
                    this.field_f.c(150, 340);
                    f.a(this.field_d, (byte) 110);
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (3 != this.field_jb) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    f.a(50 + -this.field_d, (byte) 97);
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (this.field_jb != 4) {
                        statePc = 270;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var12 = this.field_d;
                    if (0 < var12) {
                        statePc = 227;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var13_int = var12 - 100;
                    if ((var13_int ^ -1) >= -256) {
                        statePc = 230;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    l.field_D[aa.field_a].a(0, 0);
                    if (var20 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var12 <= 255) {
                        statePc = 232;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var12 = 255;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    ma.a(l.field_D[aa.field_a], 0, 0, 640, var12, var13_int);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (450 >= this.field_d) {
                        statePc = 254;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (3 <= aa.field_a) {
                        statePc = 254;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    ph.field_d.a(0, 0);
                    var13_int = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if ((var13_int ^ -1) < (aa.field_a + 1 ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    ni.field_c[var13_int].b(el.field_b[var13_int][0], el.field_b[var13_int][1]);
                    var13_int++;
                    if (var20 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var20 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var13_int = hc.field_h[1 + aa.field_a][0] - -((cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2);
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    var14 = (-qc.field_L[this.field_Y].field_n + cm.field_F[this.field_Y].field_n) / 2 + hc.field_h[1 + aa.field_a][1];
                    if (this.field_d >= 650) {
                        statePc = 247;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var15 = -400 + this.field_d - 50;
                    var16 = hc.field_h[aa.field_a][0] + (cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2;
                    var17 = (cm.field_F[this.field_Y].field_n - qc.field_L[this.field_Y].field_n) / 2 + hc.field_h[aa.field_a][1];
                    var18 = var16 + (-var16 + var13_int) * var15 / 200;
                    var19 = (var14 + -var17) * var15 / 200 + var17;
                    if (aa.field_a == 2) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    qc.field_L[this.field_Y].c(var18, var19);
                    if (var20 == 0) {
                        statePc = 246;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    qc.field_L[this.field_Y].f(var18, var19);
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (var20 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (-701 >= (this.field_d ^ -1)) {
                        statePc = 252;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (aa.field_a != 2) {
                        statePc = 251;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    qc.field_L[this.field_Y].f(var13_int, var14);
                    if (var20 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    qc.field_L[this.field_Y].c(var13_int, var14);
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    cm.field_F[this.field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (var20 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (this.field_d > 450) {
                        statePc = 256;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 256: {
                    ke.field_i.a(0, 0);
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (this.field_d <= 400) {
                        statePc = 260;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (this.field_d < 450) {
                        statePc = 268;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (this.field_d < 450) {
                        statePc = 263;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (this.field_d < 500) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if ((this.field_d ^ -1) >= -801) {
                        statePc = 269;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    f.a(-800 + this.field_d, (byte) 123);
                    if (var20 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    f.a(450 + (-this.field_d - -50), (byte) 111);
                    if (var20 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    f.a(this.field_d + -400, (byte) 126);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (this.field_jb != 6) {
                        statePc = 282;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if ((this.field_d ^ -1) <= -401) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    ph.field_d.a(0, 0);
                    ni.field_c[0].b(el.field_b[0][0], el.field_b[0][1]);
                    cm.field_F[this.field_Y].c(hc.field_h[aa.field_a][0], this.a(-97, 0, aa.field_a));
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    if (this.field_d <= 350) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (400 > this.field_d) {
                        statePc = 280;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (this.field_d < 400) {
                        statePc = 310;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if ((this.field_d ^ -1) <= -451) {
                        statePc = 310;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    f.a(400 + -this.field_d + 50, (byte) 78);
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    f.a(this.field_d + -350, (byte) 70);
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if ((this.field_jb ^ -1) != -6) {
                        statePc = 305;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (-33 < (this.field_d ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 285: {
                    f.a(this.field_d, (byte) 117);
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    ph.field_d.a(0, 0);
                    var12 = 0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (var12 >= ni.field_c.length) {
                        statePc = 291;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    ni.field_c[var12].b(el.field_b[var12][0], el.field_b[var12][1]);
                    var12++;
                    if (var20 != 0) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (var20 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (-256 < (this.field_d / 2 ^ -1)) {
                        statePc = 293;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    stackIn_294_0 = 255;
                    statePc = 294;
                    continue stateLoop;
                }
                case 293: {
                    stackIn_294_0 = this.field_d / 2;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
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
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (var14 >= 5) {
                        statePc = 299;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    nh.field_f[0][var14][this.field_Y].c(-16 + (320 - 60 * var14 - -120), -(Math.abs(var14 + -2) * 10) + 360);
                    var14++;
                    if (var20 != 0) {
                        statePc = 300;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (var20 == 0) {
                        statePc = 295;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    f.a(64 + -this.field_d, (byte) 111);
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if (600 >= this.field_d) {
                        statePc = 302;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    l.field_D[4].c(0, 0, this.field_d + -600, -700 + this.field_d);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (this.field_d <= 1000) {
                        statePc = 304;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    f.a(this.field_d - 1000, (byte) 118);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    pd.a(true);
                    if (var20 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var12 = this.field_d * 40 / 50;
                    if (var12 <= 40) {
                        statePc = 309;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var12 = 40;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    this.field_R.b(150, 260 - -((-var12 + 40) / 2), 340, var12);
                    this.field_f.b(150, (-var12 + 40) / 2 + 340, 340, var12);
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (!ok.field_e) {
                        statePc = 312;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    pe.a(-112);
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    return;
                }
                case 314: {
                    if (var20 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                    ge.i(var7_int - -var2, var7_int, 5, -var9 + 5592405);
                    ge.i(var7_int - (50 + -var2), var7_int, 30, -var9 + 5592405);
                    ge.i(var2 + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                    ge.i(var7_int + (-80 + var2), var7_int, 5, 5592405 + -var9);
                    var7_int++;
                    if (var20 == 0) {
                        statePc = 324;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0 <= stackIn_318_1) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var8 = -this.field_O + var7_int;
                    stackIn_140_0 = -86;
                    stackIn_321_0 = stackIn_140_0;
                    stackIn_140_1 = var8 ^ -1;
                    stackIn_321_1 = stackIn_140_1;
                    if (var20 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    stackIn_318_0 = stackIn_321_0;
                    stackIn_318_1 = stackIn_321_1;
                    statePc = 318;
                    continue stateLoop;
                }
                case 322: {
                    if (stackIn_322_0 >= stackIn_322_1) {
                        statePc = 137;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 324: {
                    stackIn_322_0 = var7_int;
                    stackIn_322_1 = 480;
                    statePc = 322;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hj() {
        int dupTemp$1 = 0;
        int var1 = 0;
        int var2 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
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
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_ib = 95;
                    if (var2 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (3 != aa.field_a) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_ib = 11;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    this.field_r = 1;
                    vi.a(true);
                    fl.b(-114);
                    this.field_m.e();
                    var1 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var1 ^ -1) <= -135) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ge.b(pf.a((byte) 109, 480), pf.a((byte) -100, 100), 16777215);
                    var1++;
                    if (var2 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var2 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
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
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var1 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var1 >= 10) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    jf.field_f[var1] = 55 + (pf.a((byte) 119, 12) + -6);
                    ll.field_c[var1] = pf.a((byte) -91, 4) + 2;
                    lb.field_D[var1] = pf.a((byte) -101, 20);
                    var1++;
                    if (var2 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var2 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_fb = new int[ua.field_w.length];
                    gl.a(ua.field_w, 0, this.field_fb, 0, this.field_fb.length);
                    ch.b(-112);
                    pg.field_b = null;
                    dupTemp$1 = jf.a(-2147483648);
                    this.field_W = dupTemp$1;
                    this.field_J = dupTemp$1;
                    this.field_cb = new int[5];
                    this.field_S = true;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var1 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((this.field_cb.length ^ -1) >= (var1 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_cb[var1] = this.field_cb[var1] - var1 * 10;
                    var1++;
                    if (var2 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var2 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_gb = new boolean[5];
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var1 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_gb.length <= var1) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_gb[var1] = true;
                    var1++;
                    if (var2 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var2 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_lb = new int[5];
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_db = 0L;
    }
}
