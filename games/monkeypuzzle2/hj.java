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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = -param1 + this.field_d;
              if (-51 >= (var5 ^ -1)) {
                var6 = (-(60 * (-50 + var5)) + 6000) / 100;
                if (var6 > 5) {
                  var4_int = hc.field_h[param2][1] - Math.abs((int)((float)var6 * ia.a(true, 0.10000000149011612f * (float)(var5 + -50))));
                  break L1;
                } else {
                  var4_int = hc.field_h[param2][1];
                  break L1;
                }
              } else {
                var4_int = 2 * ((hc.field_h[param2][1] + (480 + -hc.field_h[param2][1])) * var5) / 100 + (-480 + hc.field_h[param2][1]);
                break L1;
              }
            }
            var6 = 86 % ((param0 - 30) / 41);
            stackIn_7_0 = var4_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var4), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    private final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_g = this.field_g + (-4000 + pf.a((byte) 111, 8000));
              if (0 <= this.field_g) {
                if (-65536 > (this.field_g ^ -1)) {
                  this.field_g = this.field_g - 65536;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_g = 65535 - this.field_g;
                break L1;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.I(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
            int var2_int = 6 / ((param0 - -69) / 45);
            this.field_jb = 13;
            if (!ok.a(false)) {
                this.c((byte) 25);
            }
            this.field_u = 5;
            this.field_Y = 0;
            this.field_nb = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hj.B(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        int var2_int = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = -this.field_W + (this.field_O - 90);
              if ((var2_int ^ -1) > -1) {
                var2_int = -var2_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-201 > (var2_int ^ -1)) {
                var2_int = 200;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_int -= 40;
              if (var2_int < 0) {
                var2_int = 0;
                break L3;
              } else {
                break L3;
              }
            }
            var3 = var2_int * 256 / 100;
            var4 = -var3 + 256;
            this.field_v = var4;
            var5 = 0;
            var6 = 15 / ((param0 - 63) / 32);
            L4: while (true) {
              if (this.field_fb.length <= var5) {
                break L0;
              } else {
                var7 = ua.field_w[var5];
                var8 = ad.field_g[var5];
                this.field_fb[var5] = ch.a(ch.a(65280, var8) * var4 + var3 * ch.a(var7, 65280), 16711680) + ch.a(var4 * ch.a(var8, 16711935) + ch.a(var7, 16711935) * var3, -16711936) >> 1365668616;
                var5++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.G(" + param0 + ')');
        }
    }

    final void a(int param0) {
        StringBuilder discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (0 > this.field_A) {
                this.field_A = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_j.setLength(0);
              discarded$0 = this.field_j.append(Integer.toString(this.field_A));
              if (param0 == -19921) {
                break L2;
              } else {
                this.i(-97);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.N(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 30717) {
                break L1;
              } else {
                this.b((byte) 65);
                break L1;
              }
            }
            L2: {
              L3: {
                var7_int = param3 + this.field_O;
                if (param1 + param2 < var7_int) {
                  break L3;
                } else {
                  if (var7_int - -param5 > param1) {
                    L4: {
                      if (param5 < -var7_int + param1) {
                        param4 = param4 + (-var7_int + param1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var8 = param1 - var7_int + param2;
                      if (var8 <= param5) {
                        break L5;
                      } else {
                        param4 = param4 + (-param5 + var8);
                        var8 = param5;
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_O > param4 + var8) {
                        break L6;
                      } else {
                        var8 = this.field_O - param4;
                        break L6;
                      }
                    }
                    ge.d(-1 + param1, param4, var8, 5592405);
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var7), "hj.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(byte param0) {
        try {
            if (param0 >= -36) {
                this.i(34);
            }
            ie.a(aa.field_a, 112);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hj.P(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_T ^ -1) <= -1) {
                break L1;
              } else {
                if (0 == this.field_U) {
                  this.field_T = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 > 30) {
              L2: {
                L3: {
                  if (3 > this.field_U) {
                    break L3;
                  } else {
                    if (0 > this.field_T) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_U = this.field_U + this.field_T;
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 13816) {
                break L1;
              } else {
                this.c((byte) -114);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= 5) {
                break L0;
              } else {
                this.field_gb[var2_int] = false;
                this.field_cb[var2_int] = 10 + 10 * var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.D(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        try {
            if (this.field_A > 0 && !this.field_o && null == pg.field_b) {
                pg.field_b = di.a(rk.field_d, 65494, h.field_a, nj.field_b, new int[]{this.field_A}, 41, cl.field_d, 3, (byte) 100);
            }
            int var2_int = -67 / ((param0 - -63) / 42);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hj.E(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        int dupTemp$13 = 0;
        int dupTemp$14 = 0;
        int var2_int = 0;
        int var3 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -6) {
                break L0;
              } else {
                L2: {
                  if (this.field_gb[var2_int]) {
                    dupTemp$13 = this.field_cb[var2_int];
                    this.field_cb[var2_int] = dupTemp$13 + 1;
                    if ((dupTemp$13 ^ -1) < -11) {
                      this.field_cb[var2_int] = 10;
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  } else {
                    dupTemp$14 = this.field_cb[var2_int];
                    this.field_cb[var2_int] = dupTemp$14 - 1;
                    if (0 > dupTemp$14) {
                      L3: {
                        stackIn_10_0 = this.field_gb;

                        stackIn_10_1 = var2_int;

                        if (var2_int >= -1 + wd.field_h.b(-81)) {
                          stackIn_11_0 = (boolean[]) ((Object) stackIn_10_0);
                          stackIn_11_1 = stackIn_10_1;
                          stackIn_11_2 = 0;
                          break L3;
                        } else {
                          stackIn_11_0 = (boolean[]) ((Object) stackIn_10_0);
                          stackIn_11_1 = stackIn_10_1;
                          stackIn_11_2 = 1;
                          break L3;
                        }
                      }
                      stackIn_11_0[stackIn_11_1] = stackIn_11_2 != 0;
                      if (this.field_gb[var2_int]) {
                        if (var2_int > 0) {
                          this.field_cb[var2_int] = this.field_cb[-1 + var2_int] - 10;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var2_int++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.H(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            if (param0 != 1903697041) {
                hj.a((byte) -29, false);
            }
            field_D = null;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hj.M(" + param0 + ')');
        }
    }

    final static cj a(byte param0, boolean param1) {
        cj var2 = null;
        RuntimeException var2_ref = null;
        cj stackIn_4_0 = null;
        cj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cj stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -89) {
                break L1;
              } else {
                field_db = 6L;
                break L1;
              }
            }
            L2: {
              var2 = new cj(true);
              stackIn_4_0 = (cj) (var2);

              if (!param1) {
                stackIn_5_0 = (cj) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = (cj) ((Object) stackIn_4_0);
                stackIn_5_1 = 1;
                break L2;
              }
            }
            stackIn_5_0.field_f = stackIn_5_1 != 0;
            stackIn_6_0 = (cj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "hj.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    private final void h(int param0) {
        float var2_float = 0.0f;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_eb = this.field_eb + 1;
              if (-1 != (this.field_eb & 3 ^ -1)) {
                break L1;
              } else {
                this.field_p = this.field_p + 1;
                if ((this.field_p ^ -1) > -5) {
                  break L1;
                } else {
                  this.field_p = 0;
                  break L1;
                }
              }
            }
            L2: {
              var2_float = (float)this.field_eb / 200.0f;
              if (param0 == 340) {
                break L2;
              } else {
                this.c((byte) 81);
                break L2;
              }
            }
            L3: {
              if (var2_float < 1.0f) {
                break L3;
              } else {
                L4: {
                  this.field_eb = 0;
                  this.field_Q = 80 + pf.a((byte) 25, 480);
                  this.field_kb = pf.a((byte) 45, 200) + 100;
                  stackIn_9_0 = this;

                  if (Math.random() <= 0.5) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 660 + pf.a((byte) 41, 50);
                    break L4;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = -20 + -pf.a((byte) -109, 50);
                    break L4;
                  }
                }
                ((hj) (this)).field_e = stackIn_10_1;
                this.field_b = -20 + -pf.a((byte) -91, 50);
                break L3;
              }
            }
            this.field_bb = (int)(var2_float * (float)j.field_f[0].field_n);
            this.field_ob = (int)((float)(this.field_b + -this.field_kb) * var2_float) + this.field_kb;
            this.field_a = this.field_Q + (int)(var2_float * (float)(-this.field_Q + this.field_e));
            this.field_i = (int)((float)j.field_f[0].field_m * var2_float);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.A(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ok.a(param0)) {
                L2: {
                  if ((this.field_A ^ -1) < -1) {
                    break L2;
                  } else {
                    if (-1 > (fg.field_b ^ -1)) {
                      break L2;
                    } else {
                      l.field_f = 0;
                      break L1;
                    }
                  }
                }
                l.field_f = 7;
                break L1;
              } else {
                if (fg.field_b <= 0) {
                  l.field_f = 2;
                  break L1;
                } else {
                  if (0 < this.field_A) {
                    l.field_f = 6;
                    break L1;
                  } else {
                    l.field_f = 10;
                    break L1;
                  }
                }
              }
            }
            bl.a(50, uh.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.K(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            int stackIn_2_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_29_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            IOException var2 = null;
            RuntimeException var2_ref = null;
            try {
              L0: {
                if (param0 > MonkeyPuzzle2.field_D.field_h) {
                  if (ol.field_g == null) {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    try {
                      L1: {
                        L2: {
                          if (param1) {
                            break L2;
                          } else {
                            field_D = (ch) null;
                            break L2;
                          }
                        }
                        var2_int = ol.field_g.c(-110);
                        if ((var2_int ^ -1) < -1) {
                          L3: {
                            if (var2_int <= param0 + -MonkeyPuzzle2.field_D.field_h) {
                              break L3;
                            } else {
                              var2_int = param0 + -MonkeyPuzzle2.field_D.field_h;
                              break L3;
                            }
                          }
                          ol.field_g.a(var2_int, param1, MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h);
                          d.field_k = pf.a(0);
                          MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + var2_int;
                          if (param0 <= MonkeyPuzzle2.field_D.field_h) {
                            MonkeyPuzzle2.field_D.field_h = 0;
                            stackIn_19_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            stackIn_17_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L1;
                          }
                        } else {
                          L4: {
                            if (var2_int < 0) {
                              break L4;
                            } else {
                              if ((wf.a(55) ^ -1L) < -30001L) {
                                break L4;
                              } else {
                                return false;
                              }
                            }
                          }
                          gk.a(-1);
                          decompiledRegionSelector0 = 2;
                          break L1;
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        gk.a(-1);
                        decompiledRegionSelector0 = 2;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 4;
                        break L0;
                      } else {
                        stackIn_29_0 = 0;
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_2_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw la.a((Throwable) ((Object) var2_ref), "hj.L(" + param0 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_7_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_17_0 != 0;
                  } else {
                    return stackIn_19_0 != 0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (Math.random() > 0.9) {
                this.field_hb = pf.a((byte) 54, 2);
                this.f(120);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_V = false;
              if (param0 == 56) {
                break L2;
              } else {
                this.a(true);
                break L2;
              }
            }
            L3: {
              if (this.field_hb == 0) {
                break L3;
              } else {
                var2_float = 3.1415927410125732f;
                var3 = 0.75f * var2_float + (float)(-this.field_g) / 65535.0f * var2_float * 2.0f;
                this.field_B = this.field_B + ha.a((byte) 51, var3);
                this.field_Z = this.field_Z + ia.a(true, var3);
                this.field_V = true;
                break L3;
              }
            }
            L4: {
              if (69.0f < this.field_B) {
                this.field_B = 69.0f;
                this.field_V = false;
                this.f(120);
                break L4;
              } else {
                if (this.field_B >= 0.0f) {
                  break L4;
                } else {
                  this.field_B = 0.0f;
                  this.field_V = false;
                  this.f(120);
                  break L4;
                }
              }
            }
            L5: {
              if (this.field_Z < 0.0f) {
                this.field_V = false;
                this.field_Z = 0.0f;
                this.f(120);
                break L5;
              } else {
                if (480.0f >= this.field_Z) {
                  break L5;
                } else {
                  this.field_V = false;
                  this.field_Z = 480.0f;
                  this.f(120);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.R(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int dupTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int stackIn_124_0 = 0;
        Object stackIn_133_0 = null;
        Object stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        Object stackIn_199_0 = null;
        Object stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        Object stackIn_416_0 = null;
        Object stackIn_417_0 = null;
        int stackIn_417_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == kc.field_d) {
                break L1;
              } else {
                if (13 == this.field_jb) {
                  this.a(false);
                  pg.field_d[l.field_f].c((byte) -87);
                  ej.field_b = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (dl.field_c[96]) {
                  break L3;
                } else {
                  if (dl.field_c[97]) {
                    break L3;
                  } else {
                    this.field_w = 0;
                    break L2;
                  }
                }
              }
              this.field_w = this.field_w + 1;
              break L2;
            }
            L4: {
              var2_int = 2 + 2 * (this.field_w / 5);
              if (10 < var2_int) {
                var2_int = 10;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!dl.field_c[96]) {
                break L5;
              } else {
                this.field_z = this.field_z - 50 * var2_int;
                break L5;
              }
            }
            L6: {
              if (dl.field_c[97]) {
                this.field_z = this.field_z + var2_int * 50;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-33678 < (this.field_z ^ -1)) {
                this.field_z = 33677;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-64624 > (this.field_z ^ -1)) {
                this.field_z = 64623;
                break L8;
              } else {
                break L8;
              }
            }
            var3 = 0;
            L9: while (true) {
              if (!ba.a(-1)) {
                L10: {
                  if (ec.field_d < 2) {
                    break L10;
                  } else {
                    if (!dl.field_c[48]) {
                      break L10;
                    } else {
                      this.field_o = true;
                      e.a(255, (byte) 40, 0);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (-3 < (ec.field_d ^ -1)) {
                    break L11;
                  } else {
                    if (dl.field_c[68]) {
                      this.field_o = true;
                      e.a(254, (byte) 40, 1);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  mk.f(126);
                  this.field_H = this.field_H + 1;
                  var7 = this.field_jb;
                  if (var7 != 0) {
                    if (var7 != 6) {
                      if (var7 == 4) {
                        if (850 < this.field_d) {
                          this.field_d = 0;
                          this.field_jb = 3;
                          break L12;
                        } else {
                          L13: {
                            if (0 != (15 & this.field_d)) {
                              break L13;
                            } else {
                              if (-201 <= (this.field_d ^ -1)) {
                                break L13;
                              } else {
                                fieldTemp$0 = this.field_Y + 1;
                                this.field_Y = this.field_Y + 1;
                                if (fieldTemp$0 != cm.field_F.length) {
                                  break L13;
                                } else {
                                  this.field_Y = 0;
                                  break L13;
                                }
                              }
                            }
                          }
                          L14: {
                            if ((this.field_d ^ -1) >= -451) {
                              break L14;
                            } else {
                              if (-4 == (aa.field_a ^ -1)) {
                                this.field_jb = 3;
                                this.field_d = 0;
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (450 >= this.field_d) {
                              break L15;
                            } else {
                              ie.a(aa.field_a + 1, -28);
                              break L15;
                            }
                          }
                          this.field_d = this.field_d + 2;
                          break L12;
                        }
                      } else {
                        if (13 == var7) {
                          L16: {
                            if (this.field_nb == 0) {
                              bl.a(50, bl.field_g);
                              al.c((byte) -84);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            this.field_nb = this.field_nb + 4;
                            if (-2121 > (this.field_nb ^ -1)) {
                              L18: {
                                bl.a(50, uh.field_e);
                                if (ok.a(false)) {
                                  L19: {
                                    if (0 < this.field_P) {
                                      break L19;
                                    } else {
                                      if ((this.field_A ^ -1) >= -1) {
                                        l.field_f = 0;
                                        bl.a(50, uh.field_e);
                                        break L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  l.field_f = 7;
                                  break L18;
                                } else {
                                  if (0 >= this.field_P) {
                                    l.field_f = 2;
                                    break L18;
                                  } else {
                                    l.field_f = 6;
                                    break L18;
                                  }
                                }
                              }
                              pg.field_d[l.field_f].c((byte) -98);
                              ej.field_b = 0;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L20: {
                            if ((this.field_d & 15) == 0) {
                              var7 = ba.field_a[this.field_u].length;
                              this.a((byte) 115);
                              fieldTemp$1 = this.field_Y + 1;
                              this.field_Y = this.field_Y + 1;
                              if (fieldTemp$1 != var7) {
                                break L20;
                              } else {
                                this.field_Y = 3;
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                          this.field_d = this.field_d + 2;
                          break L12;
                        } else {
                          if (var7 != 1) {
                            if (-3 == (var7 ^ -1)) {
                              if (-101 <= (this.field_d ^ -1)) {
                                this.field_d = this.field_d + 2;
                                break L12;
                              } else {
                                this.field_jb = 3;
                                this.field_d = 0;
                                break L12;
                              }
                            } else {
                              if (var7 == 3) {
                                L21: {
                                  if (0 == this.field_d) {
                                    L22: {
                                      this.field_A = this.field_A + (10000 - -this.field_I);
                                      var7 = this.field_I + 10000;
                                      var8 = ej.field_b % 3;
                                      if (0 != var8) {
                                        if (var8 != 1) {
                                          var9 = var7 / 3;
                                          cl.field_d = cl.field_d + var9;
                                          nj.field_b = nj.field_b - (var7 - var9);
                                          break L22;
                                        } else {
                                          nj.field_b = nj.field_b - var7;
                                          break L22;
                                        }
                                      } else {
                                        cl.field_d = cl.field_d + var7;
                                        break L22;
                                      }
                                    }
                                    L23: {
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
                                      dupTemp$2 = jf.a(-2147483648);
                                      this.field_W = dupTemp$2;
                                      this.field_J = dupTemp$2;
                                      this.e(102);
                                      this.field_u = 0;
                                      fl.b(124);
                                      this.a(-19921);
                                      if (-1 != (aa.field_a ^ -1)) {
                                        if (3 != aa.field_a) {
                                          break L23;
                                        } else {
                                          this.field_ib = 11;
                                          break L23;
                                        }
                                      } else {
                                        this.field_ib = 95;
                                        break L23;
                                      }
                                    }
                                    if (20 != dc.field_c) {
                                      break L21;
                                    } else {
                                      this.field_u = 4;
                                      this.field_jb = 5;
                                      break L12;
                                    }
                                  } else {
                                    break L21;
                                  }
                                }
                                L24: {
                                  if ((this.field_d ^ -1) < -101) {
                                    this.field_jb = 0;
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                this.field_d = this.field_d + 2;
                                break L12;
                              } else {
                                if ((var7 ^ -1) != -6) {
                                  break L12;
                                } else {
                                  L25: {
                                    if (-1051 <= (this.field_d ^ -1)) {
                                      break L25;
                                    } else {
                                      L26: {
                                        if (!ok.a(false)) {
                                          if (0 < this.field_P) {
                                            l.field_f = 6;
                                            this.c((byte) -109);
                                            break L26;
                                          } else {
                                            l.field_f = 2;
                                            this.c((byte) -115);
                                            break L26;
                                          }
                                        } else {
                                          l.field_f = 7;
                                          break L26;
                                        }
                                      }
                                      pg.field_d[l.field_f].c((byte) 93);
                                      this.field_nb = 0;
                                      ej.field_b = 0;
                                      this.field_d = 0;
                                      bl.a(50, uh.field_e);
                                      break L25;
                                    }
                                  }
                                  L27: {
                                    if (-1 != (this.field_d & 15 ^ -1)) {
                                      break L27;
                                    } else {
                                      var7 = ba.field_a[this.field_u].length;
                                      fieldTemp$3 = this.field_Y + 1;
                                      this.field_Y = this.field_Y + 1;
                                      if (fieldTemp$3 != var7) {
                                        break L27;
                                      } else {
                                        this.field_Y = 0;
                                        break L27;
                                      }
                                    }
                                  }
                                  this.field_d = this.field_d + 2;
                                  break L12;
                                }
                              }
                            }
                          } else {
                            L28: {
                              if (this.field_d != 0) {
                                break L28;
                              } else {
                                L29: {
                                  this.field_I = (4800000 - (-this.field_O + 480) * 30000) / 480;
                                  if (0 <= this.field_I) {
                                    break L29;
                                  } else {
                                    this.field_I = 0;
                                    break L29;
                                  }
                                }
                                L30: {
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
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                                this.field_mb = 0.0f;
                                this.field_s = 1 + (-13 + this.field_k - ba.field_a[0][0].field_n) / 30;
                                cj.a((byte) -33, ke.field_h[18]);
                                break L28;
                              }
                            }
                            L31: {
                              if (0 != (this.field_d & 15)) {
                                break L31;
                              } else {
                                var7 = ba.field_a[this.field_u].length;
                                this.a((byte) 75);
                                fieldTemp$4 = this.field_Y + 1;
                                this.field_Y = this.field_Y + 1;
                                if (fieldTemp$4 == var7) {
                                  if (this.field_u == 2) {
                                    this.field_Y = 2;
                                    break L31;
                                  } else {
                                    this.field_Y = 0;
                                    break L31;
                                  }
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              nh.b((byte) 107);
                              ff.a(this.field_O, -6961);
                              hh.f(8500);
                              this.d((byte) 56);
                              if (this.field_u == 2) {
                                break L32;
                              } else {
                                if ((hl.a(1, -ba.field_a[0][0].field_n + (-13 + this.field_k), this.field_M + -100) ^ -1) > -101) {
                                  this.field_u = 2;
                                  cj.a((byte) -116, ke.field_h[19]);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            L33: {
                              rc.a(this.field_mb, this.field_s, (byte) -111);
                              if (0 <= mh.field_D) {
                                break L33;
                              } else {
                                if (-3 != (this.field_u ^ -1)) {
                                  break L33;
                                } else {
                                  if (vj.a(dc.field_c, 1) != aa.field_a) {
                                    this.field_jb = 4;
                                    this.field_d = 0;
                                    if ((dc.field_c ^ -1) != -20) {
                                      bl.a(50, b.field_l);
                                      break L12;
                                    } else {
                                      bl.a(50, wf.field_h);
                                      break L12;
                                    }
                                  } else {
                                    ie.a(aa.field_a, 119);
                                    this.field_jb = 2;
                                    this.field_d = 0;
                                    break L12;
                                  }
                                }
                              }
                            }
                            L34: {
                              if (2 != this.field_u) {
                                break L34;
                              } else {
                                this.field_mb = this.field_mb + 0.10000000149011612f;
                                if (1.0f < this.field_mb) {
                                  this.field_mb = 0.0f;
                                  this.field_s = this.field_s - 1;
                                  nf.n(-48);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            this.field_d = this.field_d + 2;
                            break L12;
                          }
                        }
                      }
                    } else {
                      L35: {
                        if ((this.field_d & 15) == 0) {
                          fieldTemp$5 = this.field_Y + 1;
                          this.field_Y = this.field_Y + 1;
                          if (fieldTemp$5 == cm.field_F.length) {
                            this.field_Y = 0;
                            break L35;
                          } else {
                            break L35;
                          }
                        } else {
                          break L35;
                        }
                      }
                      if (this.field_d <= 450) {
                        this.field_d = this.field_d + 2;
                        break L12;
                      } else {
                        this.field_jb = 0;
                        this.field_d = 0;
                        break L12;
                      }
                    }
                  } else {
                    L36: {
                      this.i(0);
                      hh.f(8500);
                      eb.d((byte) -93);
                      ff.a(this.field_O, -6961);
                      if (!ub.field_a) {
                        break L36;
                      } else {
                        this.field_J = jf.a(-2147483648);
                        break L36;
                      }
                    }
                    L37: {
                      if (gb.field_o != this.field_r) {
                        break L37;
                      } else {
                        if (this.field_t <= 500) {
                          break L37;
                        } else {
                          if (ok.field_d) {
                            break L37;
                          } else {
                            if (!hd.field_u.e(11253)) {
                              break L37;
                            } else {
                              al.c((byte) -103);
                              this.field_t = 0;
                              this.field_r = -1;
                              break L37;
                            }
                          }
                        }
                      }
                    }
                    L38: {
                      this.field_t = this.field_t + 1;
                      if (this.field_d % 800 != 2) {
                        break L38;
                      } else {
                        if (500 < this.field_t) {
                          a.b(92);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      this.d((byte) 56);
                      if (0 != (15 & this.field_d)) {
                        break L39;
                      } else {
                        if (!this.field_V) {
                          break L39;
                        } else {
                          fieldTemp$6 = this.field_ab + 1;
                          this.field_ab = this.field_ab + 1;
                          if ((fieldTemp$6 ^ -1) != -5) {
                            break L39;
                          } else {
                            this.field_ab = 0;
                            break L39;
                          }
                        }
                      }
                    }
                    L40: {
                      if (13 <= (127 & this.field_d)) {
                        break L40;
                      } else {
                        if ((3 & this.field_d) != 0) {
                          break L40;
                        } else {
                          fieldTemp$7 = this.field_x + 1;
                          this.field_x = this.field_x + 1;
                          if (fieldTemp$7 != 4) {
                            break L40;
                          } else {
                            this.field_x = 0;
                            break L40;
                          }
                        }
                      }
                    }
                    L41: {
                      fieldTemp$8 = this.field_G;
                      this.field_G = this.field_G - 1;
                      if (-1 != (fieldTemp$8 ^ -1)) {
                        break L41;
                      } else {
                        L42: {
                          stackIn_199_0 = this;

                          if (Math.random() <= 0.9) {
                            stackIn_200_0 = this;
                            stackIn_200_1 = 0;
                            break L42;
                          } else {
                            stackIn_200_0 = this;
                            stackIn_200_1 = 1;
                            break L42;
                          }
                        }
                        ((hj) (this)).field_C = stackIn_200_1 != 0;
                        this.field_G = 25;
                        this.field_X = 172 + pf.a((byte) -115, 232);
                        this.field_h = pf.a((byte) 76, 64);
                        break L41;
                      }
                    }
                    L43: {
                      kj.a(var3 != 0, -1);
                      if (!qb.field_b) {
                        break L43;
                      } else {
                        if ((ck.field_b ^ -1) > -1) {
                          break L43;
                        } else {
                          this.field_d = this.field_d + 2;
                          break L12;
                        }
                      }
                    }
                    L44: {
                      this.a(-19921);
                      var4 = 15;
                      if (1 != this.field_u) {
                        break L44;
                      } else {
                        var4 = 3;
                        break L44;
                      }
                    }
                    L45: {
                      if (0 != (this.field_d & var4)) {
                        break L45;
                      } else {
                        var7 = ba.field_a[this.field_u].length;
                        this.a((byte) 82);
                        fieldTemp$9 = this.field_Y + 1;
                        this.field_Y = this.field_Y + 1;
                        if (var7 == fieldTemp$9) {
                          L46: {
                            if (1 == this.field_u) {
                              var8 = 0;
                              var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                              L47: while (true) {
                                L48: {
                                  if (var9_ref_ki == null) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (0 != var8) {
                                        this.field_lb[-1 + var8] = var9_ref_ki.field_l;
                                        var8++;
                                        if (-7 == (var8 ^ -1)) {
                                          break L48;
                                        } else {
                                          break L49;
                                        }
                                      } else {
                                        var8++;
                                        break L49;
                                      }
                                    }
                                    var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                                    continue L47;
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
                                break L46;
                              }
                            } else {
                              break L46;
                            }
                          }
                          this.field_Y = 0;
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                    }
                    L50: {
                      if (gb.field_o == 0) {
                        this.field_jb = 1;
                        this.field_d = 0;
                        cj.a((byte) 112, ke.field_h[31]);
                        break L50;
                      } else {
                        this.field_d = this.field_d + 2;
                        break L50;
                      }
                    }
                    var5 = pf.a((byte) -119, 480);
                    var6 = 2147483647;
                    var7 = var5 - 3;
                    L51: while (true) {
                      if (var5 + 3 <= var7) {
                        var7 = 0;
                        L52: while (true) {
                          if (480 <= var7) {
                            L53: {
                              if ((var6 >> 1640774308 ^ -1) < -1) {
                                var7 = 0;
                                L54: while (true) {
                                  if ((var7 ^ -1) <= -481) {
                                    this.field_O = this.field_O - (var6 >> 1590750532);
                                    this.field_k = this.field_O - -14;
                                    this.e(125);
                                    break L53;
                                  } else {
                                    this.field_F[var7] = this.field_F[var7] - var6;
                                    var7++;
                                    continue L54;
                                  }
                                }
                              } else {
                                break L53;
                              }
                            }
                            L55: {
                              if (this.field_u != 0) {
                                break L55;
                              } else {
                                if (50 > -90 + this.field_O - this.field_W) {
                                  this.field_u = 6;
                                  ve.a(125, 8, 0, je.field_i);
                                  break L12;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            if ((this.field_u ^ -1) != -7) {
                              break L12;
                            } else {
                              if (-90 + this.field_O + -this.field_W > 50) {
                                this.field_u = 0;
                                nf.a(aa.field_a, (byte) 115, 8, 1);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          } else {
                            if (var6 > this.field_F[var7]) {
                              var6 = this.field_F[var7];
                              var7++;
                              continue L52;
                            } else {
                              var7++;
                              continue L52;
                            }
                          }
                        }
                      } else {
                        if (0 < var7) {
                          L56: {
                            if ((var7 ^ -1) > -481) {
                              this.field_F[var7] = this.field_F[var7] + this.field_n;
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                          var7++;
                          continue L51;
                        } else {
                          var7++;
                          continue L51;
                        }
                      }
                    }
                  }
                }
                L57: {
                  if (!this.field_l) {
                    var4 = this.field_d % 480;
                    var5 = 0;
                    L58: while (true) {
                      if (480 <= var5) {
                        break L57;
                      } else {
                        L59: {
                          var6 = 1 + var4;
                          var7 = var4;
                          if (-481 >= (var6 ^ -1)) {
                            var6 = -480 + var6;
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if (480 > var7) {
                            break L60;
                          } else {
                            var7 = var7 + -480;
                            break L60;
                          }
                        }
                        var8 = this.field_F[var6];
                        var9 = this.field_F[var7];
                        if (var8 <= var9) {
                          var10 = var9 + var8 >> 1049476001;
                          var9 = var10;
                          var8 = var10;
                          this.field_F[var6] = var8;
                          this.field_F[var7] = var9;
                          var4++;
                          var5++;
                          continue L58;
                        } else {
                          var4++;
                          var5++;
                          continue L58;
                        }
                      }
                    }
                  } else {
                    var4 = this.field_d % 480;
                    var5 = 0;
                    L61: while (true) {
                      if (var5 >= 480) {
                        break L57;
                      } else {
                        L62: {
                          var6 = var4 - 1;
                          var7 = var4;
                          if (var6 >= 0) {
                            break L62;
                          } else {
                            var6 = var6 + 480;
                            break L62;
                          }
                        }
                        L63: {
                          if ((var7 ^ -1) > -1) {
                            var7 = 480 + var7;
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        var8 = this.field_F[var6];
                        var9 = this.field_F[var7];
                        if (var8 <= var9) {
                          var10 = var8 + var9 >> -890035327;
                          var8 = var10;
                          var9 = var10;
                          this.field_F[var6] = var8;
                          this.field_F[var7] = var9;
                          var5++;
                          var4--;
                          continue L61;
                        } else {
                          var5++;
                          var4--;
                          continue L61;
                        }
                      }
                    }
                  }
                }
                L64: {
                  stackIn_416_0 = this;

                  if (this.field_l) {
                    stackIn_417_0 = this;
                    stackIn_417_1 = 0;
                    break L64;
                  } else {
                    stackIn_417_0 = this;
                    stackIn_417_1 = 1;
                    break L64;
                  }
                }
                L65: {
                  ((hj) (this)).field_l = stackIn_417_1 != 0;
                  if (aa.field_a == 0) {
                    L66: {
                      if (0 == (this.field_d & 127)) {
                        this.field_ib = this.field_ib - 1;
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    L67: {
                      if (95 >= this.field_ib) {
                        if (-31 >= (this.field_ib ^ -1)) {
                          break L67;
                        } else {
                          this.field_ib = 30;
                          break L67;
                        }
                      } else {
                        this.field_ib = 95;
                        break L67;
                      }
                    }
                    this.h(340);
                    break L65;
                  } else {
                    if (-4 != (aa.field_a ^ -1)) {
                      break L65;
                    } else {
                      L68: {
                        if ((31 & this.field_d) != 0) {
                          break L68;
                        } else {
                          this.field_ib = this.field_ib + 1;
                          break L68;
                        }
                      }
                      if (this.field_ib >= 11) {
                        if (317 < this.field_ib) {
                          this.field_ib = 317;
                          break L65;
                        } else {
                          break L65;
                        }
                      } else {
                        this.field_ib = 11;
                        break L65;
                      }
                    }
                  }
                }
                L69: {
                  this.field_y = this.field_y + 1;
                  if ((7 & this.field_d) != 0) {
                    break L69;
                  } else {
                    L70: {
                      this.field_c = this.field_c + 1;
                      i.field_n = i.field_n + 1;
                      if (-5 == (this.field_c ^ -1)) {
                        this.field_c = 0;
                        break L70;
                      } else {
                        break L70;
                      }
                    }
                    if (i.field_n != 6) {
                      break L69;
                    } else {
                      i.field_n = 0;
                      break L69;
                    }
                  }
                }
                L71: {
                  if (-1 == (this.field_d & 15 ^ -1)) {
                    sk.field_G = sk.field_G + 1;
                    if (-7 == (sk.field_G ^ -1)) {
                      sk.field_G = 0;
                      break L71;
                    } else {
                      break L71;
                    }
                  } else {
                    break L71;
                  }
                }
                L72: {
                  if (this.field_y == m.field_i[0].field_n) {
                    this.field_y = 0;
                    break L72;
                  } else {
                    break L72;
                  }
                }
                L73: {
                  if (param0 > 64) {
                    break L73;
                  } else {
                    this.field_W = -2;
                    break L73;
                  }
                }
                var4 = 0;
                L74: while (true) {
                  if (-11 >= (var4 ^ -1)) {
                    L75: {
                      if (this.field_J == this.field_W) {
                        break L75;
                      } else {
                        L76: {
                          if (this.field_W >= this.field_J) {
                            this.field_W = this.field_W - 1;
                            break L76;
                          } else {
                            this.field_W = this.field_W + 1;
                            break L76;
                          }
                        }
                        L77: {
                          if (5 > Math.abs(-this.field_J + this.field_W)) {
                            this.field_W = this.field_J;
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        this.e(-21);
                        break L75;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L78: {
                      lb.field_D[var4] = lb.field_D[var4] + pf.a((byte) 23, 3);
                      if (lb.field_D[var4] > 100) {
                        lb.field_D[var4] = 0;
                        break L78;
                      } else {
                        break L78;
                      }
                    }
                    var4++;
                    continue L74;
                  }
                }
              } else {
                L79: {
                  if (hf.field_f.field_o) {
                    break L79;
                  } else {
                    L80: {
                      var4 = (oa.field_H ^ hf.field_f.field_d) % 8;
                      if (0 != var4) {
                        if (-2 == (var4 ^ -1)) {
                          rk.field_d = rk.field_d - 1;
                          cl.field_d = cl.field_d + h.field_a;
                          break L80;
                        } else {
                          if ((var4 ^ -1) == -3) {
                            h.field_a = h.field_a + 1;
                            cl.field_d = cl.field_d - rk.field_d;
                            break L80;
                          } else {
                            if (var4 == 3) {
                              rk.field_d = rk.field_d + 1;
                              cl.field_d = cl.field_d - h.field_a;
                              break L80;
                            } else {
                              if (var4 == 4) {
                                h.field_a = h.field_a + 1;
                                nj.field_b = nj.field_b + rk.field_d;
                                break L80;
                              } else {
                                if (-6 == (var4 ^ -1)) {
                                  rk.field_d = rk.field_d + 1;
                                  nj.field_b = nj.field_b + h.field_a;
                                  break L80;
                                } else {
                                  if (6 == var4) {
                                    nj.field_b = nj.field_b - rk.field_d;
                                    h.field_a = h.field_a - 1;
                                    break L80;
                                  } else {
                                    if (-8 == (var4 ^ -1)) {
                                      nj.field_b = nj.field_b - h.field_a;
                                      rk.field_d = rk.field_d - 1;
                                      break L80;
                                    } else {
                                      break L80;
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
                        break L80;
                      }
                    }
                    var4 = (hf.field_f.field_d ^ oa.field_H - -hf.field_f.field_A) % 5;
                    if (0 == var4) {
                      bh.field_g = bh.field_g | jc.field_e + b.field_m << 1903697041;
                      break L79;
                    } else {
                      if ((var4 ^ -1) == -2) {
                        b.field_m = b.field_m + sd.field_e;
                        jc.field_e = jc.field_e + 1;
                        break L79;
                      } else {
                        if (var4 == 2) {
                          jc.field_e = jc.field_e - 1;
                          b.field_m = b.field_m - sd.field_e;
                          break L79;
                        } else {
                          if (-4 != (var4 ^ -1)) {
                            if ((var4 ^ -1) == -5) {
                              b.field_m = b.field_m - jc.field_e;
                              sd.field_e = sd.field_e - 1;
                              break L79;
                            } else {
                              break L79;
                            }
                          } else {
                            b.field_m = b.field_m + jc.field_e;
                            sd.field_e = sd.field_e + 1;
                            break L79;
                          }
                        }
                      }
                    }
                  }
                }
                if (oa.field_H != 13) {
                  L81: {
                    if ((ec.field_d ^ -1) <= -3) {
                      L82: {
                        if (oa.field_H == 99) {
                          this.field_o = true;
                          if (!dl.field_c[82]) {
                            this.field_O = this.field_O + 1;
                            break L82;
                          } else {
                            this.field_ib = this.field_ib - 1;
                            break L82;
                          }
                        } else {
                          break L82;
                        }
                      }
                      if (98 != oa.field_H) {
                        break L81;
                      } else {
                        L83: {
                          if (dl.field_c[82]) {
                            this.field_ib = this.field_ib + 1;
                            break L83;
                          } else {
                            this.field_O = this.field_O - 1;
                            break L83;
                          }
                        }
                        this.field_o = true;
                        break L81;
                      }
                    } else {
                      break L81;
                    }
                  }
                  L84: {
                    L85: {
                      if (this.field_u == 0) {
                        break L85;
                      } else {
                        if ((this.field_u ^ -1) != -7) {
                          break L84;
                        } else {
                          break L85;
                        }
                      }
                    }
                    L86: {
                      if (oa.field_H == 83) {
                        break L86;
                      } else {
                        if ((oa.field_H ^ -1) == -83) {
                          break L86;
                        } else {
                          break L84;
                        }
                      }
                    }
                    if (!jj.b(true)) {
                      break L84;
                    } else {
                      if (-1 != (this.field_jb ^ -1)) {
                        break L84;
                      } else {
                        L87: {
                          if (!qb.field_b) {
                            break L87;
                          } else {
                            if (-1 < (ck.field_b ^ -1)) {
                              break L87;
                            } else {
                              break L84;
                            }
                          }
                        }
                        this.field_u = 1;
                        this.field_Y = 0;
                        this.field_T = 1;
                        cj.a((byte) -18, ke.field_h[1]);
                        break L84;
                      }
                    }
                  }
                  L88: {
                    if (-3 >= (ec.field_d ^ -1)) {
                      L89: {
                        if (oa.field_H != 26) {
                          break L89;
                        } else {
                          if (dc.field_c <= 0) {
                            break L89;
                          } else {
                            this.field_M = 320;
                            this.field_k = 480;
                            this.field_O = -14 + this.field_k;
                            uj.b(0);
                            dc.field_c = dc.field_c - 1;
                            rb.a(dc.field_c, (byte) -58);
                            this.field_o = true;
                            break L89;
                          }
                        }
                      }
                      L90: {
                        if (oa.field_H != 36) {
                          break L90;
                        } else {
                          this.field_jb = 1;
                          this.field_o = true;
                          this.field_d = 0;
                          cj.a((byte) 124, ke.field_h[31]);
                          break L90;
                        }
                      }
                      L91: {
                        if (oa.field_H == 39) {
                          L92: {
                            if (ok.field_e) {
                              stackIn_124_0 = 0;
                              break L92;
                            } else {
                              stackIn_124_0 = 1;
                              break L92;
                            }
                          }
                          ok.field_e = stackIn_124_0 != 0;
                          break L91;
                        } else {
                          break L91;
                        }
                      }
                      L93: {
                        if (-28 != (oa.field_H ^ -1)) {
                          break L93;
                        } else {
                          this.field_M = 320;
                          this.field_k = 480;
                          this.field_O = -14 + this.field_k;
                          uj.b(0);
                          dc.field_c = dc.field_c + 1;
                          rb.a(dc.field_c, (byte) -58);
                          this.field_o = true;
                          break L93;
                        }
                      }
                      L94: {
                        if (oa.field_H == 33) {
                          L95: {
                            stackIn_133_0 = this;

                            if (this.field_S) {
                              stackIn_134_0 = this;
                              stackIn_134_1 = 0;
                              break L95;
                            } else {
                              stackIn_134_0 = this;
                              stackIn_134_1 = 1;
                              break L95;
                            }
                          }
                          ((hj) (this)).field_S = stackIn_134_1 != 0;
                          break L94;
                        } else {
                          break L94;
                        }
                      }
                      L96: {
                        if (-10 == (oa.field_H ^ -1)) {
                          this.field_o = true;
                          el.a(true, 0);
                          break L96;
                        } else {
                          break L96;
                        }
                      }
                      L97: {
                        if ((oa.field_H ^ -1) != -11) {
                          break L97;
                        } else {
                          this.field_o = true;
                          el.a(true, 1);
                          break L97;
                        }
                      }
                      L98: {
                        if (oa.field_H != 11) {
                          break L98;
                        } else {
                          this.field_o = true;
                          el.a(true, 2);
                          break L98;
                        }
                      }
                      if ((oa.field_H ^ -1) == -13) {
                        this.field_o = true;
                        el.a(true, 3);
                        break L88;
                      } else {
                        break L88;
                      }
                    } else {
                      break L88;
                    }
                  }
                  if ((oa.field_H ^ -1) == -85) {
                    var3 = 1;
                    continue L9;
                  } else {
                    continue L9;
                  }
                } else {
                  L99: {
                    if (13 != this.field_jb) {
                      l.field_f = 1;
                      break L99;
                    } else {
                      this.a(false);
                      break L99;
                    }
                  }
                  pg.field_d[l.field_f].c((byte) 73);
                  pg.field_d[l.field_f].a(false, false);
                  ej.field_b = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        int incrementValue$0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_289_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        le var7 = null;
        int var8 = 0;
        Object var9_ref = null;
        int var9 = 0;
        ki var9_ref_ki = null;
        le var9_ref_le = null;
        int var10 = 0;
        le var10_ref_le = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var13_int = 0;
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
        var22 = null;
        var23 = null;
        var9_ref = null;
        var20 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (aa.field_a == 2) {
                var2_int = -(2 * m.field_i[0].field_n) + this.field_y;
                var3 = 0;
                L2: while (true) {
                  if (m.field_i[0].field_n * 2 + this.field_y <= var2_int) {
                    break L1;
                  } else {
                    incrementValue$0 = var3;
                    var3++;
                    var4 = incrementValue$0 + this.field_c;
                    var4 = var4 % 4;
                    var5 = 0;
                    L3: while (true) {
                      if (-641 >= (var5 ^ -1)) {
                        var2_int = var2_int + m.field_i[0].field_n;
                        continue L2;
                      } else {
                        m.field_i[var4].a(var5, var2_int);
                        var5 = var5 + m.field_i[0].field_m;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                if (aa.field_a != 3) {
                  if (aa.field_a == 0) {
                    var2_int = -((-30 + this.field_ib) * 255 / 65) + 255;
                    fi.field_a[fi.field_a.length + -1].a(0, 0, var2_int, 15387868);
                    hf.field_d.e(-(hf.field_d.field_m >> -294507870) + 320, this.field_ib);
                    ge.h(0, 0, 640, 70);
                    ge.a(5120, (hf.field_d.field_m >> 2126480610) + this.field_ib << 632372036, hf.field_d.field_m << 1586773603, 50, cf.field_a);
                    ge.h(0, 0, 640, 480);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var2_int = -100 + this.field_ib;
                  if ((this.field_ib ^ -1) <= -241) {
                    ge.a(77, 0, 486, 150, 265542, 5383094);
                    break L1;
                  } else {
                    L4: {
                      ge.h(77, 0, 563, 146);
                      if (0 < var2_int) {
                        ge.a(77, var2_int - 145, 486, 145, 265542, 5383094);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((var2_int ^ -1) <= -146) {
                        break L5;
                      } else {
                        ge.a(77, var2_int, 486, 145, 5383094, 8374005);
                        break L5;
                      }
                    }
                    ge.d(77, var2_int - -145, 486, 145, 8374005);
                    ge.h(0, 0, 640, 480);
                    hf.field_d.c(320 + -(hf.field_d.field_m >> -1337206303), this.field_ib);
                    break L1;
                  }
                }
              }
            }
            L6: {
              if (aa.field_a != 0) {
                al.a(this.field_H, (byte) -126);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (aa.field_a == 3) {
                L8: {
                  if (-171 >= (this.field_ib ^ -1)) {
                    stackIn_43_0 = 1;
                    break L8;
                  } else {
                    stackIn_43_0 = 0;
                    break L8;
                  }
                }
                L9: {
                  var2_int = stackIn_43_0;
                  var3 = -qa.field_i.field_n + (this.field_ib + -220);
                  fe.field_f[this.field_c].b(0, 0, 100);
                  var4 = 255 * (-11 + this.field_ib) / 306;
                  if (-101 <= (var4 ^ -1)) {
                    break L9;
                  } else {
                    var4 = 100;
                    break L9;
                  }
                }
                L10: {
                  ge.c(70, 0, 500, 480, 265542, var4);
                  var5 = this.field_ib + -100;
                  var6 = 0;
                  if (this.field_ib > 100) {
                    if (180 <= this.field_ib) {
                      var6 = 50;
                      break L10;
                    } else {
                      var6 = 50 - (9000 + -(this.field_ib * 50)) / 80;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L11: {
                  ge.h(0, 0, 640, 145);
                  if (this.field_ib >= 250) {
                    break L11;
                  } else {
                    ge.a(5120, (hf.field_d.field_m >> -284282911) + this.field_ib << 1156533284, hf.field_d.field_m << -1357943932, -var6 + 50, cf.field_a);
                    break L11;
                  }
                }
                L12: {
                  if (var2_int == 0) {
                    break L12;
                  } else {
                    ge.a(320 - qa.field_i.field_m << 1947285252, var3 - (-(qa.field_i.field_n >> 1644914081) + 8) << -361708060, qa.field_i.field_m << -1062887580, 50, sk.field_D);
                    break L12;
                  }
                }
                L13: {
                  if (var6 >= 50) {
                    break L13;
                  } else {
                    var7_int = 145;
                    var8 = 0;
                    L14: while (true) {
                      if ((var7_int ^ -1) <= -291) {
                        break L13;
                      } else {
                        ge.h(0, var7_int, 640, 2 + var7_int);
                        ge.a(5120, -(4 * var8) + this.field_ib + (hf.field_d.field_m >> -1127253663) << 235989604, hf.field_d.field_m << -57743068, 50 + -var6, cf.field_a);
                        var8 += 2;
                        var7_int += 2;
                        continue L14;
                      }
                    }
                  }
                }
                L15: {
                  if ((var5 ^ -1) < 89) {
                    L16: {
                      var7_int = var5 - -90;
                      if (-101 <= (var7_int ^ -1)) {
                        break L16;
                      } else {
                        var7_int = 100;
                        break L16;
                      }
                    }
                    L17: {
                      ge.h(0, 0, 640, var7_int);
                      var8 = 256 * var7_int / 100;
                      if (256 >= var8) {
                        break L17;
                      } else {
                        var8 = 256;
                        break L17;
                      }
                    }
                    ma.a(this.field_m.field_s, 80, 0, this.field_m.field_m, var7_int, var8, 0);
                    ac.field_a.a((byte) 110);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (var2_int != 0) {
                  qa.field_i.c(-qa.field_i.field_m + 320 - (qa.field_i.field_m >> -1398397183), var3);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                if (aa.field_a != 0) {
                  break L7;
                } else {
                  ge.h(0, 0, 640, 480);
                  fi.field_a[0].c(0, 0);
                  j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                  var2_int = 80;
                  var3 = 0;
                  var4 = 95999;
                  L18: while (true) {
                    if ((var4 ^ -1) > -1) {
                      this.field_N.c();
                      ge.a(this.field_N.field_s, this.field_N.field_k, this.field_N.field_j);
                      kl.a(100, 5, this.field_d, 0, 0, this.field_N.field_k, this.field_N.field_j);
                      this.field_q.e();
                      this.field_N.a(this.field_N.field_m << 103940579, this.field_N.field_n << -2061765117, 3200, 1600, 63535, 4096);
                      ac.field_a.a((byte) 116);
                      ge.h(80, 0, 560, 480);
                      fi.field_a[1].c(0, 0);
                      this.field_q.b(80, 317, 580, 200, 100);
                      ge.h(80, 316, 560, 371);
                      var3 = 70;
                      fi.field_a[0].c(0, 0);
                      var4 = 0;
                      L19: while (true) {
                        if ((var3 ^ -1) <= -291) {
                          ge.h(80, 0, 560, 480);
                          j.field_f[this.field_p].b(this.field_a, this.field_ob, this.field_i, this.field_bb);
                          ge.b();
                          break L7;
                        } else {
                          ge.h(0, var3, 640, var3 + 2);
                          ge.a(5120, (hf.field_d.field_m >> -786972350) + (this.field_ib - 2 * var4) << -469576252, hf.field_d.field_m << 912471971, 50, cf.field_a);
                          var3 += 2;
                          var4 += 2;
                          continue L19;
                        }
                      }
                    } else {
                      this.field_N.field_s[var4] = ac.field_a.field_e[var3 + var2_int];
                      var2_int++;
                      if ((var2_int ^ -1) == -561) {
                        var3 = var3 + ac.field_a.field_g;
                        var2_int = 80;
                        var4--;
                        continue L18;
                      } else {
                        var4--;
                        continue L18;
                      }
                    }
                  }
                }
              }
            }
            L20: {
              if (!this.field_C) {
                break L20;
              } else {
                if (-2 != (aa.field_a ^ -1)) {
                  break L20;
                } else {
                  pc.field_U[this.field_x].c(this.field_X, this.field_h);
                  break L20;
                }
              }
            }
            var2_int = 0;
            L21: while (true) {
              if (var2_int >= ib.field_c) {
                L22: {
                  ll.a(24733);
                  ci.a(-2865);
                  ck.field_a[1].c(20 + this.field_M, -wl.field_f[0].field_n + (this.field_k + -13));
                  if (wd.field_h.e(11253)) {
                    break L22;
                  } else {
                    var22_ref = (ki) ((Object) wd.field_h.a((byte) -117));
                    if (var22_ref != null) {
                      L23: {
                        var22_ref.field_B = (float)this.field_M;
                        var22_ref.field_q = (float)(-48 + this.field_k);
                        if (jj.b(true)) {
                          var22_ref.a((byte) -74);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      var3 = 1;
                      L24: while (true) {
                        if ((var3 ^ -1) <= -5) {
                          break L22;
                        } else {
                          var23_ref = (ki) ((Object) wd.field_h.d((byte) 63));
                          if (var23_ref != null) {
                            L25: {
                              var4 = var3;
                              if (-2 == (var4 ^ -1)) {
                                var23_ref.field_B = 360.0f;
                                var23_ref.field_q = (float)(this.field_k + -48);
                                break L25;
                              } else {
                                if (var4 != 2) {
                                  if (-4 != (var4 ^ -1)) {
                                    break L25;
                                  } else {
                                    var23_ref.field_B = 370.0f;
                                    var23_ref.field_q = (float)(-28 + this.field_k);
                                    break L25;
                                  }
                                } else {
                                  var23_ref.field_q = (float)(this.field_k + -38);
                                  var23_ref.field_B = 385.0f;
                                  break L25;
                                }
                              }
                            }
                            var23_ref.a((byte) -60);
                            var23_ref.field_q = (float)(148 + (var3 - 1) * 59);
                            var23_ref.field_B = 602.0f;
                            var3++;
                            continue L24;
                          } else {
                            break L22;
                          }
                        }
                      }
                    } else {
                      break L22;
                    }
                  }
                }
                df.f(18180);
                var2_int = (int)(ia.a(true, (float)this.field_H * 0.00800000037997961f) * 50.0f);
                var3 = 727655;
                ge.c(80, this.field_O, 480, 480, var3, 120);
                var4 = 0;
                ge.h(80, 0, 560, 480);
                var5 = 0;
                var6 = 0;
                var7_int = this.field_d / 2 % 480;
                var8 = 0;
                L26: while (true) {
                  if (-481 >= (var8 ^ -1)) {
                    var7_int = this.field_O;
                    L27: while (true) {
                      L28: {
                        if (var7_int >= 480) {
                          break L28;
                        } else {
                          var8 = -this.field_O + var7_int;
                          if (-86 <= (var8 ^ -1)) {
                            var9 = var8 | (var8 << 1851021640 | var8 << -545280880);
                            ge.i(var7_int - -var2_int, var7_int, 5, -var9 + 5592405);
                            ge.i(var7_int - (50 + -var2_int), var7_int, 30, -var9 + 5592405);
                            ge.i(var2_int + (-60 + var7_int), var7_int, 30, -var9 + 5592405);
                            ge.i(var7_int + (-80 + var2_int), var7_int, 5, 5592405 + -var9);
                            var7_int++;
                            continue L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (this.field_S) {
                          ge.b(1, 1, 80, this.field_O, 480, 4);
                          ge.b(2, 2, 80, this.field_O + 4, 480, 476 - this.field_O);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        L31: {
                          if (this.field_jb == 0) {
                            break L31;
                          } else {
                            if (this.field_jb == 13) {
                              break L31;
                            } else {
                              if (-2 == (this.field_jb ^ -1)) {
                                break L31;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                        L32: {
                          L33: {
                            if ((this.field_jb ^ -1) == -14) {
                              break L33;
                            } else {
                              if (this.field_jb != 1) {
                                var7_int = this.field_d;
                                if (-5 <= (var7_int ^ -1)) {
                                  break L32;
                                } else {
                                  var7_int = 4;
                                  break L32;
                                }
                              } else {
                                break L33;
                              }
                            }
                          }
                          var7_int = -this.field_d + 4;
                          break L32;
                        }
                        if (var7_int <= 0) {
                          break L30;
                        } else {
                          L34: {
                            var8 = this.field_v - -(int)(ia.a(true, (float)this.field_d * 0.10000000149011612f) * 20.0f);
                            if (-1 < (var8 ^ -1)) {
                              var8 = 0;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (-256 > (var8 ^ -1)) {
                              var8 = 255;
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          var9 = 0;
                          L36: while (true) {
                            if (-11 >= (var9 ^ -1)) {
                              uc.a(78, -90 + this.field_k, 558, this.field_k + -90, 3, var8, var7_int, this.field_fb);
                              break L30;
                            } else {
                              ge.a((var9 * lb.field_D[var9] + this.field_d) % 480 + 80 << 23307844, -90 + this.field_k + (int)(4.0f * ia.a(true, (float)(var9 * lb.field_D[var9] + this.field_d) * 0.10000000149011612f)) << -366411164, ll.field_c[var9] << 435665412, jf.field_f[var9], cf.field_a);
                              var9++;
                              continue L36;
                            }
                          }
                        }
                      }
                      ge.h(0, 0, 640, 480);
                      ge.c(70, var5, 10, -var5 + 480, var3, 120);
                      ge.c(560, var6, 10, -var6 + 480, var3, 120);
                      ka.b(0);
                      var7 = qh.field_a[this.field_ab];
                      var7.b(var7.field_m << -600862045, var7.field_n << 2020967139, (int)this.field_B << -18135196, (int)this.field_Z << 1934953316, this.field_g, 4096);
                      lb.field_E[0].c(0, 0);
                      lb.field_E[1].c(640 - lb.field_E[1].field_m, 0);
                      var8 = 0;
                      var9_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
                      L37: while (true) {
                        if (var9_ref_ki == null) {
                          L38: {
                            if ((var8 ^ -1) != -6) {
                              break L38;
                            } else {
                              L39: {
                                if (this.field_lb[-1 + var8] < 0) {
                                  var9_ref_le = tl.field_b;
                                  break L39;
                                } else {
                                  var9_ref_le = ak.field_t[this.field_lb[var8 + -1]];
                                  break L39;
                                }
                              }
                              var10 = 148 + 59 * var8 + -59;
                              if (this.field_cb[-1 + var8] < 10) {
                                var11 = var9_ref_le.field_m * this.field_cb[var8 - 1] / 10;
                                var9_ref_le.d(-(var9_ref_le.field_m / 2) + (-var11 + var9_ref_le.field_m) / 2 + 602, var10 + -(var9_ref_le.field_m / 2) + (var9_ref_le.field_m + -var11) / 2, var11, var11);
                                break L38;
                              } else {
                                var9_ref_le.c(602 + -(var9_ref_le.field_m / 2), -(var9_ref_le.field_m / 2) + var10);
                                break L38;
                              }
                            }
                          }
                          L40: {
                            var9 = (23040 + -(144 * (480 - this.field_O))) / 480;
                            if ((var9 ^ -1) < -1) {
                              ge.c(25, 48 - var9 + 412, 28, var9, 1203134, 120);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          L41: {
                            L42: {
                              ge.c(37, 460, 4, 20, 1203134, 120);
                              j.field_g.c(-(j.field_g.field_m >> -1739532991) + this.field_M + -20, -j.field_g.field_n + this.field_k);
                              if (2 != this.field_u) {
                                break L42;
                              } else {
                                L43: {
                                  if (2 <= this.field_Y) {
                                    break L43;
                                  } else {
                                    if (4 != this.field_jb) {
                                      break L42;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                L44: {
                                  var24 = ba.field_a[2][this.field_Y];
                                  var10_ref_le = var24;
                                  var11 = (bl.field_f - (var24.field_m >> -1597311775) - (-100 + this.field_M)) * 150;
                                  if (-1 >= (var11 ^ -1)) {
                                    if (-65536 <= (var11 ^ -1)) {
                                      break L44;
                                    } else {
                                      var11 = var11 - 65535;
                                      break L44;
                                    }
                                  } else {
                                    var11 = -var11 + 65535;
                                    break L44;
                                  }
                                }
                                var10_ref_le.b(var24.field_m << 1123805987, 160, bl.field_f << 2123968420, mh.field_D << 1186612868, var11, 4096);
                                break L41;
                              }
                            }
                            var25 = ba.field_a[this.field_u][this.field_Y];
                            var10_ref_le = var25;
                            var10_ref_le.c(-100 + this.field_M, -var25.field_n + this.field_k - 13);
                            break L41;
                          }
                          L45: {
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
                              if (-2 == (this.field_jb ^ -1)) {
                                L46: {
                                  var12 = this.field_d * 40 / 50;
                                  if (var12 <= 40) {
                                    break L46;
                                  } else {
                                    var12 = 40;
                                    break L46;
                                  }
                                }
                                this.field_R.b(150, 260 - -((-var12 + 40) / 2), 340, var12);
                                this.field_f.b(150, (-var12 + 40) / 2 + 340, 340, var12);
                                break L45;
                              } else {
                                if (-3 != (this.field_jb ^ -1)) {
                                  if (3 != this.field_jb) {
                                    if (this.field_jb != 4) {
                                      if (this.field_jb != 6) {
                                        if ((this.field_jb ^ -1) != -6) {
                                          pd.a(true);
                                          break L45;
                                        } else {
                                          L47: {
                                            if (-33 < (this.field_d ^ -1)) {
                                              f.a(this.field_d, (byte) 117);
                                              break L47;
                                            } else {
                                              break L47;
                                            }
                                          }
                                          ph.field_d.a(0, 0);
                                          var12 = 0;
                                          L48: while (true) {
                                            if (var12 >= ni.field_c.length) {
                                              L49: {
                                                if (-256 < (this.field_d / 2 ^ -1)) {
                                                  stackIn_289_0 = this.field_d / 2;
                                                  break L49;
                                                } else {
                                                  stackIn_289_0 = 255;
                                                  break L49;
                                                }
                                              }
                                              var12 = stackIn_289_0;
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
                                              var21 = 0;
                                              var14 = var21;
                                              L50: while (true) {
                                                if (var21 >= 5) {
                                                  L51: {
                                                    f.a(64 + -this.field_d, (byte) 111);
                                                    if (600 >= this.field_d) {
                                                      break L51;
                                                    } else {
                                                      l.field_D[4].c(0, 0, this.field_d + -600, -700 + this.field_d);
                                                      break L51;
                                                    }
                                                  }
                                                  if (this.field_d <= 1000) {
                                                    break L45;
                                                  } else {
                                                    f.a(this.field_d - 1000, (byte) 118);
                                                    break L45;
                                                  }
                                                } else {
                                                  nh.field_f[0][var21][this.field_Y].c(-16 + (320 - 60 * var21 - -120), -(Math.abs(var21 + -2) * 10) + 360);
                                                  var21++;
                                                  continue L50;
                                                }
                                              }
                                            } else {
                                              ni.field_c[var12].b(el.field_b[var12][0], el.field_b[var12][1]);
                                              var12++;
                                              continue L48;
                                            }
                                          }
                                        }
                                      } else {
                                        L52: {
                                          if ((this.field_d ^ -1) <= -401) {
                                            break L52;
                                          } else {
                                            ph.field_d.a(0, 0);
                                            ni.field_c[0].b(el.field_b[0][0], el.field_b[0][1]);
                                            cm.field_F[this.field_Y].c(hc.field_h[aa.field_a][0], this.a(-97, 0, aa.field_a));
                                            break L52;
                                          }
                                        }
                                        L53: {
                                          if (this.field_d <= 350) {
                                            break L53;
                                          } else {
                                            if (400 > this.field_d) {
                                              f.a(this.field_d + -350, (byte) 70);
                                              break L45;
                                            } else {
                                              break L53;
                                            }
                                          }
                                        }
                                        if (this.field_d < 400) {
                                          break L45;
                                        } else {
                                          if ((this.field_d ^ -1) <= -451) {
                                            break L45;
                                          } else {
                                            f.a(400 + -this.field_d + 50, (byte) 78);
                                            break L45;
                                          }
                                        }
                                      }
                                    } else {
                                      L54: {
                                        var12 = this.field_d;
                                        if (0 < var12) {
                                          var13_int = var12 - 100;
                                          if ((var13_int ^ -1) >= -256) {
                                            L55: {
                                              if (var12 <= 255) {
                                                break L55;
                                              } else {
                                                var12 = 255;
                                                break L55;
                                              }
                                            }
                                            ma.a(l.field_D[aa.field_a], 0, 0, 640, var12, var13_int);
                                            break L54;
                                          } else {
                                            l.field_D[aa.field_a].a(0, 0);
                                            break L54;
                                          }
                                        } else {
                                          break L54;
                                        }
                                      }
                                      L56: {
                                        L57: {
                                          if (450 >= this.field_d) {
                                            break L57;
                                          } else {
                                            if (3 <= aa.field_a) {
                                              break L57;
                                            } else {
                                              ph.field_d.a(0, 0);
                                              var13_int = 0;
                                              L58: while (true) {
                                                if (var13_int > aa.field_a + 1) {
                                                  var13_int = hc.field_h[1 + aa.field_a][0] - -((cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2);
                                                  var14 = (-qc.field_L[this.field_Y].field_n + cm.field_F[this.field_Y].field_n) / 2 + hc.field_h[1 + aa.field_a][1];
                                                  if (this.field_d >= 650) {
                                                    L59: {
                                                      if (-701 >= (this.field_d ^ -1)) {
                                                        break L59;
                                                      } else {
                                                        if (aa.field_a != 2) {
                                                          qc.field_L[this.field_Y].c(var13_int, var14);
                                                          break L59;
                                                        } else {
                                                          qc.field_L[this.field_Y].f(var13_int, var14);
                                                          break L59;
                                                        }
                                                      }
                                                    }
                                                    cm.field_F[this.field_Y].c(hc.field_h[aa.field_a - -1][0], this.a(89, 650, aa.field_a + 1));
                                                    break L56;
                                                  } else {
                                                    var15 = -400 + this.field_d - 50;
                                                    var16 = hc.field_h[aa.field_a][0] + (cm.field_F[this.field_Y].field_m - qc.field_L[this.field_Y].field_m) / 2;
                                                    var17 = (cm.field_F[this.field_Y].field_n - qc.field_L[this.field_Y].field_n) / 2 + hc.field_h[aa.field_a][1];
                                                    var18 = var16 + (-var16 + var13_int) * var15 / 200;
                                                    var19 = (var14 + -var17) * var15 / 200 + var17;
                                                    if (aa.field_a == 2) {
                                                      qc.field_L[this.field_Y].f(var18, var19);
                                                      break L56;
                                                    } else {
                                                      qc.field_L[this.field_Y].c(var18, var19);
                                                      break L56;
                                                    }
                                                  }
                                                } else {
                                                  ni.field_c[var13_int].b(el.field_b[var13_int][0], el.field_b[var13_int][1]);
                                                  var13_int++;
                                                  continue L58;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (this.field_d > 450) {
                                          ke.field_i.a(0, 0);
                                          break L56;
                                        } else {
                                          break L56;
                                        }
                                      }
                                      L60: {
                                        if (this.field_d <= 400) {
                                          break L60;
                                        } else {
                                          if (this.field_d < 450) {
                                            f.a(this.field_d + -400, (byte) 126);
                                            break L45;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      L61: {
                                        if (this.field_d < 450) {
                                          break L61;
                                        } else {
                                          if (this.field_d < 500) {
                                            f.a(450 + (-this.field_d - -50), (byte) 111);
                                            break L45;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      if ((this.field_d ^ -1) >= -801) {
                                        break L45;
                                      } else {
                                        f.a(-800 + this.field_d, (byte) 123);
                                        break L45;
                                      }
                                    }
                                  } else {
                                    f.a(50 + -this.field_d, (byte) 97);
                                    break L45;
                                  }
                                } else {
                                  this.field_R.c(150, 260);
                                  this.field_f.c(150, 340);
                                  f.a(this.field_d, (byte) 110);
                                  break L45;
                                }
                              }
                            } else {
                              var12 = -600 + this.field_nb;
                              if ((var12 ^ -1) < -1) {
                                var13_int = var12 + -100;
                                if (-256 <= (var13_int ^ -1)) {
                                  L62: {
                                    if (255 < var12) {
                                      var12 = 255;
                                      break L62;
                                    } else {
                                      break L62;
                                    }
                                  }
                                  ma.a(ib.field_d, 0, 0, 480, var12, var13_int);
                                  break L45;
                                } else {
                                  ib.field_d.a(0, 0);
                                  break L45;
                                }
                              } else {
                                break L45;
                              }
                            }
                          }
                          L63: {
                            if (!ok.field_e) {
                              break L63;
                            } else {
                              pe.a(-112);
                              break L63;
                            }
                          }
                          break L0;
                        } else {
                          L64: {
                            if (var8 != 0) {
                              L65: {
                                var9_ref_ki.field_q = (float)((-1 + var8) * 59 + 148);
                                var9_ref_ki.field_B = 602.0f;
                                if (!this.field_gb[var8 + -1]) {
                                  L66: {
                                    if (this.field_lb[var8 + -1] < 0) {
                                      var10_ref_le = tl.field_b;
                                      break L66;
                                    } else {
                                      var10_ref_le = ak.field_t[this.field_lb[-1 + var8]];
                                      break L66;
                                    }
                                  }
                                  if ((this.field_cb[var8 - 1] ^ -1) <= -11) {
                                    var10_ref_le.c((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B), (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y));
                                    break L65;
                                  } else {
                                    var11 = var10_ref_le.field_m * this.field_cb[var8 + -1] / 10;
                                    var10_ref_le.d((int)((float)var9_ref_ki.field_G + var9_ref_ki.field_B) + (-var11 + var10_ref_le.field_m) / 2, (var10_ref_le.field_m - var11) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var11, var11);
                                    break L65;
                                  }
                                } else {
                                  if ((this.field_cb[var8 + -1] ^ -1) <= -11) {
                                    var9_ref_ki.a((byte) -97);
                                    break L65;
                                  } else {
                                    var10 = var9_ref_ki.field_I.field_m * this.field_cb[-1 + var8] / 10;
                                    var9_ref_ki.field_I.d((-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_B + (float)var9_ref_ki.field_G), (-var10 + var9_ref_ki.field_I.field_m) / 2 + (int)(var9_ref_ki.field_q + (float)var9_ref_ki.field_y), var10, var10);
                                    break L65;
                                  }
                                }
                              }
                              var8++;
                              break L64;
                            } else {
                              var8++;
                              break L64;
                            }
                          }
                          var9_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                          continue L37;
                        }
                      }
                    }
                  } else {
                    L67: {
                      if (var7_int >= 480) {
                        var7_int = 0;
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                    L68: {
                      var9 = this.field_F[var7_int] >> -2130373532;
                      var10 = 80 + var8;
                      var11 = -var9 + this.field_O;
                      if (80 != var10) {
                        if (-560 == (var10 ^ -1)) {
                          var6 = var11;
                          break L68;
                        } else {
                          break L68;
                        }
                      } else {
                        var5 = var11;
                        break L68;
                      }
                    }
                    L69: {
                      ge.g(var10, var11, var9, var3, 120);
                      this.a(30717, var10, var9, var2_int, var11, 5);
                      this.a(30717, var10, var9, -50 - -var2_int, var11, 30);
                      this.a(30717, var10, var9, var2_int + -60, var11, 30);
                      this.a(30717, var10, var9, -80 + var2_int, var11, 5);
                      if (var9 > var4) {
                        var4 = var9;
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                    var8++;
                    var7_int++;
                    continue L26;
                  }
                }
              } else {
                var3 = pd.field_f[var2_int] - (dj.field_a[0].field_m >> -146205343);
                var4 = 0;
                var5 = 0;
                L70: while (true) {
                  if (var5 < mc.field_e[var2_int].length) {
                    dj.field_a[mc.field_e[var2_int][var5]].c(var3, var4);
                    var4 = var4 + (dj.field_a[var5].field_n + -1);
                    var5++;
                    continue L70;
                  } else {
                    var2_int++;
                    continue L21;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "hj.Q(" + param0 + ')');
        }
    }

    hj() {
        int dupTemp$0 = 0;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        try {
          L0: {
            L1: {
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
              if (aa.field_a != 0) {
                if (3 != aa.field_a) {
                  break L1;
                } else {
                  this.field_ib = 11;
                  break L1;
                }
              } else {
                this.field_ib = 95;
                break L1;
              }
            }
            this.field_r = 1;
            vi.a(true);
            fl.b(-114);
            this.field_m.e();
            var1_int = 0;
            L2: while (true) {
              if ((var1_int ^ -1) <= -135) {
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
                var1_int = 0;
                L3: while (true) {
                  if (var1_int >= 10) {
                    this.field_fb = new int[ua.field_w.length];
                    gl.a(ua.field_w, 0, this.field_fb, 0, this.field_fb.length);
                    ch.b(-112);
                    pg.field_b = null;
                    dupTemp$0 = jf.a(-2147483648);
                    this.field_W = dupTemp$0;
                    this.field_J = dupTemp$0;
                    this.field_cb = new int[5];
                    this.field_S = true;
                    var1_int = 0;
                    L4: while (true) {
                      if (this.field_cb.length <= var1_int) {
                        this.field_gb = new boolean[5];
                        var1_int = 0;
                        L5: while (true) {
                          if (this.field_gb.length <= var1_int) {
                            this.field_lb = new int[5];
                            break L0;
                          } else {
                            this.field_gb[var1_int] = true;
                            var1_int++;
                            continue L5;
                          }
                        }
                      } else {
                        this.field_cb[var1_int] = this.field_cb[var1_int] - var1_int * 10;
                        var1_int++;
                        continue L4;
                      }
                    }
                  } else {
                    jf.field_f[var1_int] = 55 + (pf.a((byte) 119, 12) + -6);
                    ll.field_c[var1_int] = pf.a((byte) -91, 4) + 2;
                    lb.field_D[var1_int] = pf.a((byte) -101, 20);
                    var1_int++;
                    continue L3;
                  }
                }
              } else {
                ge.b(pf.a((byte) 109, 480), pf.a((byte) -100, 100), 16777215);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "hj.<init>()");
        }
    }

    static {
        field_db = 0L;
    }
}
