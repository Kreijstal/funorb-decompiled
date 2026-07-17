/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;

public final class Main extends c {
    uh field_cb;
    static int field_G;
    static String field_y;
    static le field_W;
    ad field_P;
    private bk field_X;
    private boolean field_L;
    int field_D;
    int field_C;
    private int field_B;
    private int field_ab;
    private int field_db;
    re[] field_E;
    private String field_Z;
    private int field_J;
    private int field_eb;
    private int field_O;
    static String field_M;
    private int field_bb;
    static te field_V;
    private int field_Q;
    private int field_U;
    private byte[] field_H;
    private int field_F;
    private long field_R;
    private int field_N;
    private int field_K;
    private long field_z;
    private kc[] field_I;
    private int field_Y;
    private long field_S;
    private int field_A;
    public static int field_T;

    private final void r(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object stackIn_2_0 = null;
        double stackIn_2_1 = 0.0;
        Object stackIn_4_0 = null;
        double stackIn_4_1 = 0.0;
        Object stackIn_6_0 = null;
        double stackIn_6_1 = 0.0;
        Object stackIn_7_0 = null;
        double stackIn_7_1 = 0.0;
        int stackIn_7_2 = 0;
        Object stackIn_12_0 = null;
        double stackIn_12_1 = 0.0;
        Object stackIn_14_0 = null;
        double stackIn_14_1 = 0.0;
        Object stackIn_16_0 = null;
        double stackIn_16_1 = 0.0;
        Object stackIn_17_0 = null;
        double stackIn_17_1 = 0.0;
        int stackIn_17_2 = 0;
        Object stackIn_19_0 = null;
        double stackIn_19_1 = 0.0;
        Object stackIn_21_0 = null;
        double stackIn_21_1 = 0.0;
        Object stackIn_22_0 = null;
        double stackIn_22_1 = 0.0;
        int stackIn_22_2 = 0;
        Object stackIn_23_0 = null;
        double stackIn_23_1 = 0.0;
        Object stackIn_25_0 = null;
        double stackIn_25_1 = 0.0;
        Object stackIn_26_0 = null;
        double stackIn_26_1 = 0.0;
        int stackIn_26_2 = 0;
        Object stackOut_18_0 = null;
        double stackOut_18_1 = 0.0;
        Object stackOut_21_0 = null;
        double stackOut_21_1 = 0.0;
        int stackOut_21_2 = 0;
        Object stackOut_19_0 = null;
        double stackOut_19_1 = 0.0;
        int stackOut_19_2 = 0;
        Object stackOut_22_0 = null;
        double stackOut_22_1 = 0.0;
        Object stackOut_25_0 = null;
        double stackOut_25_1 = 0.0;
        int stackOut_25_2 = 0;
        Object stackOut_23_0 = null;
        double stackOut_23_1 = 0.0;
        int stackOut_23_2 = 0;
        Object stackOut_11_0 = null;
        double stackOut_11_1 = 0.0;
        Object stackOut_16_0 = null;
        double stackOut_16_1 = 0.0;
        int stackOut_16_2 = 0;
        Object stackOut_12_0 = null;
        double stackOut_12_1 = 0.0;
        Object stackOut_14_0 = null;
        double stackOut_14_1 = 0.0;
        int stackOut_14_2 = 0;
        Object stackOut_1_0 = null;
        double stackOut_1_1 = 0.0;
        Object stackOut_6_0 = null;
        double stackOut_6_1 = 0.0;
        int stackOut_6_2 = 0;
        Object stackOut_2_0 = null;
        double stackOut_2_1 = 0.0;
        Object stackOut_4_0 = null;
        double stackOut_4_1 = 0.0;
        int stackOut_4_2 = 0;
        L0: {
          var18 = field_T;
          var2 = (double)(dh.field_m + -((Main) this).field_z) / (double)((Main) this).field_ab;
          var4 = this.q(param0 + -16777142) * 69 + 36;
          var5 = this.m(124) * 69 + 201;
          var6 = ((Main) this).field_H[this.s(param0 ^ -16751697)];
          var7 = 36 - -(this.m((byte) 45) * 69);
          var8 = this.j(0) * 69 + 201;
          var9 = ((Main) this).field_H[this.n(128)];
          if (-1 != var6) {
            if (var9 != -1) {
              L1: {
                var10 = 3.141592653589793 * var2;
                var12 = Math.sin(var10);
                var14 = Math.cos(var10);
                var16 = (var4 - -var7) / 2;
                var17 = (var8 + var5) / 2;
                stackOut_18_0 = this;
                stackOut_18_1 = (double)(var4 - var16) * var14 + (-(var12 * (double)(-var17 + var5)) + (double)var16);
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (!((Main) this).field_L) {
                  stackOut_21_0 = this;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L1;
                } else {
                  stackOut_19_0 = this;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = var6;
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L1;
                }
              }
              L2: {
                this.a(stackIn_22_1, stackIn_22_2, var12 * (double)(var4 - var16) + ((double)var17 + var14 * (double)(-var17 + var5)), 0);
                stackOut_22_0 = this;
                stackOut_22_1 = (double)var16 - var12 * (double)(-var17 + var8) + var14 * (double)(-var16 + var7);
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (!((Main) this).field_L) {
                  stackOut_25_0 = this;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L2;
                } else {
                  stackOut_23_0 = this;
                  stackOut_23_1 = stackIn_23_1;
                  stackOut_23_2 = var9;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_26_2 = stackOut_23_2;
                  break L2;
                }
              }
              this.a(stackIn_26_1, stackIn_26_2, (double)var17 + var14 * (double)(-var17 + var8) + var12 * (double)(-var16 + var7), 0);
              break L0;
            } else {
              L3: {
                stackOut_11_0 = this;
                stackOut_11_1 = (1.0 - var2) * (double)var4 + (double)var7 * var2;
                stackIn_16_0 = stackOut_11_0;
                stackIn_16_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (((Main) this).field_L) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = var6;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L3;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = stackIn_12_1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackOut_14_0 = this;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L3;
                }
              }
              this.a(stackIn_17_1, stackIn_17_2, (double)var8 * var2 + (1.0 - var2) * (double)var5, 0);
              break L0;
            }
          } else {
            L4: {
              stackOut_1_0 = this;
              stackOut_1_1 = (double)var7 * (1.0 - var2) + var2 * (double)var4;
              stackIn_6_0 = stackOut_1_0;
              stackIn_6_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((Main) this).field_L) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = var9;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L4;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackOut_4_0 = this;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_7_2 = stackOut_4_2;
                break L4;
              }
            }
            this.a(stackIn_7_1, stackIn_7_2, (double)var8 * (1.0 - var2) + (double)var5 * var2, param0 ^ 16777215);
            break L0;
          }
        }
        L5: {
          if (param0 == 16777215) {
            break L5;
          } else {
            ((Main) this).field_X = null;
            break L5;
          }
        }
    }

    private final int s(int param0) {
        if (param0 != -25520) {
            return 120;
        }
        return this.q(7) * 6 - -this.m(param0 ^ -25567);
    }

    final void l(int param0) {
        L0: {
          ((Main) this).field_cb = null;
          ((Main) this).field_P = null;
          sc.a((byte) 81, lc.field_a[1]);
          ai.field_m = 0;
          nb.field_e = 0;
          rj.field_p = af.field_ob - vf.field_b;
          ue.field_d = param0;
          dg.field_J = 0;
          if (ec.field_f >= 2) {
            jf.field_n = false;
            break L0;
          } else {
            break L0;
          }
        }
        q.field_i = 255;
        this.p((byte) 99);
    }

    private final void a(double param0, int param1, double param2, int param3) {
        L0: {
          ((Main) this).field_I[param1].b((int)(param2 + 0.5), (int)(param0 + 0.5));
          if (param3 == 0) {
            break L0;
          } else {
            ((Main) this).field_A = 77;
            break L0;
          }
        }
    }

    private final int n(int param0) {
        if (param0 != 128) {
            int discarded$0 = this.s(41);
        }
        return this.m((byte) 75) * 6 + this.j(0);
    }

    private final void n(byte param0) {
        if (null != ue.field_a) {
            qi.a((byte) -87, ue.field_a);
            ue.field_a = null;
            hj.b((byte) -20);
        }
        mh.field_c = aj.a(1, 1);
        id.field_a = aj.a(1, 5);
        sh.field_g = aj.a(1, 2);
        fb.field_a = aj.a(1, 3);
        ll.field_e = aj.a(1, 4);
    }

    private final void d(int param0, int param1) {
        int var3 = param0 / 60;
        param0 = param0 % 60;
        ((Main) this).field_Z = String.valueOf(var3) + 58 + String.valueOf(param0 / 10) + String.valueOf(param0 % param1);
    }

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = field_T;
        hb.field_d = hb.field_d + 1;
        vf.field_b = vf.field_b + (af.field_ob << 1);
        rj.field_p = rj.field_p - (af.field_ob << 1);
        L0: {
          L1: {
            tk.field_c = tk.field_c + 2;
            var2 = ff.field_b;
            if (var2 != 9) {
              if (var2 != 1) {
                if (2 == var2) {
                  if (hb.field_d != 32) {
                    break L1;
                  } else {
                    ff.field_b = -1;
                    dj.field_a = rk.field_X;
                    break L0;
                  }
                } else {
                  L2: {
                    if (var2 != 3) {
                      if (7 != var2) {
                        if (var2 != 8) {
                          if (4 == var2) {
                            if (32 != hb.field_d) {
                              break L1;
                            } else {
                              L3: {
                                ff.field_b = -1;
                                if (rk.field_X == 7) {
                                  this.p((byte) -101);
                                  break L3;
                                } else {
                                  if (((Main) this).field_U != 4) {
                                    break L3;
                                  } else {
                                    if (((Main) this).field_K <= 0) {
                                      break L3;
                                    } else {
                                      gh.a(ve.field_c, (byte) -78);
                                      break L3;
                                    }
                                  }
                                }
                              }
                              dj.field_a = -1;
                              break L0;
                            }
                          } else {
                            if (var2 == 5) {
                              if (hb.field_d == 32) {
                                ff.field_b = -1;
                                dj.field_a = rk.field_X;
                                break L0;
                              } else {
                                break L0;
                              }
                            } else {
                              if (6 != var2) {
                                break L0;
                              } else {
                                if (hb.field_d == 32) {
                                  ff.field_b = -1;
                                  var2 = dj.field_a;
                                  dj.field_a = rk.field_X;
                                  rk.field_X = var2;
                                  break L1;
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L4: {
                            if (hb.field_d == 1) {
                              L5: {
                                if (rk.field_X != 5) {
                                  break L5;
                                } else {
                                  if (!dl.d(0)) {
                                    ((Main) this).field_cb = il.a(8, 3, 25404, fb.field_c[((Main) this).field_C], 1);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              cd.field_h = dj.field_a;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (32 != hb.field_d) {
                            break L1;
                          } else {
                            ff.field_b = -1;
                            dj.field_a = rk.field_X;
                            break L0;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L6: {
                    if (hb.field_d != 1) {
                      break L6;
                    } else {
                      L7: {
                        if (5 != rk.field_X) {
                          break L7;
                        } else {
                          if (!dl.d(0)) {
                            ((Main) this).field_cb = il.a(8, 3, 25404, fb.field_c[((Main) this).field_C], 1);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (ff.field_b == 3) {
                        cd.field_h = -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (32 != hb.field_d) {
                    break L1;
                  } else {
                    ff.field_b = -1;
                    dj.field_a = rk.field_X;
                    break L0;
                  }
                }
              } else {
                if (hb.field_d != 32) {
                  break L1;
                } else {
                  ff.field_b = -1;
                  dj.field_a = -1;
                  break L0;
                }
              }
            } else {
              if ((1073741824 & rk.field_X) == 0) {
                if (hb.field_d != 32) {
                  break L1;
                } else {
                  L8: {
                    if (!eh.d(19314)) {
                      pf.b((byte) 127);
                      break L8;
                    } else {
                      we.b(-122);
                      break L8;
                    }
                  }
                  rk.field_X = rk.field_X | 1073741824;
                  break L0;
                }
              } else {
                hb.field_d = hb.field_d - 2;
                if (hb.field_d == 31) {
                  L9: {
                    if (dl.d(0)) {
                      dj.field_a = (byte)rk.field_X;
                      break L9;
                    } else {
                      L10: {
                        ra.field_d = sk.a(4, (byte) 125);
                        if (0 >= ai.field_m) {
                          break L10;
                        } else {
                          if (!jf.field_n) {
                            ((Main) this).field_P = pk.a(fb.field_c[((Main) this).field_C], new int[1], af.field_ob, vb.field_a[((Main) this).field_C], vf.field_b, rj.field_p, tk.field_c, (byte) 80, 3);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      dj.field_a = (byte)(rk.field_X >> 8);
                      break L9;
                    }
                  }
                  if (dj.field_a != -2) {
                    break L1;
                  } else {
                    dj.field_a = 0;
                    mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, (ee) (Object) qa.field_b);
                    break L0;
                  }
                } else {
                  if (0 != hb.field_d) {
                    break L1;
                  } else {
                    rk.field_X = 0;
                    ff.field_b = -1;
                    break L0;
                  }
                }
              }
            }
          }
          break L0;
        }
    }

    private final int j(int param0) {
        return ((Main) this).field_Y & 15;
    }

    final void f(int param0) {
        L0: {
          jl.b((byte) 22);
          if (null == gj.field_a) {
            break L0;
          } else {
            ga.a(true);
            break L0;
          }
        }
        L1: {
          ph.c(1);
          if (param0 < -36) {
            break L1;
          } else {
            this.d(53, -62);
            break L1;
          }
        }
    }

    private final void p(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var6 = field_T;
        jl.field_h = jl.field_h + ((bc.field_a << 1) + bc.field_a);
        tk.field_a = tk.field_a + 3;
        ol.field_W = ol.field_W + (tk.field_a << 1);
        nb.field_e = nb.field_e | ue.field_d;
        bc.field_a = bc.field_a + 2;
        q.field_i = q.field_i - 1;
        dg.field_J = dg.field_J + 1;
        ue.field_d = 0;
        rj.field_p = rj.field_p + 1;
        ((Main) this).field_Q = ((Main) this).field_H.length / 2;
        var2 = -88 % ((param0 - -29) / 55);
        var3 = ((Main) this).field_H.length + -1;
        var4 = 19;
        L0: while (true) {
          if (var3 < 0) {
            var3 = ((Main) this).field_H.length;
            L1: while (true) {
              if (var3 <= 0) {
                L2: {
                  stackOut_8_0 = this;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (dg.field_J >= 3) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 2 * ((-1 + dg.field_J) / 2);
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    break L2;
                  }
                }
                L3: {
                  ((Main) this).field_eb = stackIn_12_1;
                  ((Main) this).field_ab = Math.max(-(dg.field_J * 50) + 600, 100);
                  ((Main) this).field_J = Math.max(44 + -(4 * dg.field_J), 20);
                  var3 = Math.max(-(20000 * dg.field_J) + 200000, 40000);
                  ((Main) this).field_bb = ((Main) this).field_eb * ((20 + ((Main) this).field_J) * ((Main) this).field_ab) / 2 + var3;
                  var4 = ((Main) this).field_bb % 10000;
                  ((Main) this).field_bb = ((Main) this).field_bb - var4;
                  ((Main) this).field_N = -1;
                  ((Main) this).field_A = -1;
                  ((Main) this).field_O = 0;
                  if (var4 > 5000) {
                    ((Main) this).field_bb = ((Main) this).field_bb + 10000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((Main) this).field_F = 0;
                ((Main) this).c(-115, 1);
                ((Main) this).field_db = ((Main) this).field_bb;
                return;
              } else {
                int incrementValue$9 = var3;
                var3--;
                var4 = sj.a(10999, incrementValue$9, uh.field_l);
                var5 = ((Main) this).field_H[var3];
                ((Main) this).field_H[var3] = ((Main) this).field_H[var4];
                ((Main) this).field_H[var4] = (byte)var5;
                continue L1;
              }
            }
          } else {
            int incrementValue$10 = var3;
            var3--;
            ((Main) this).field_H[incrementValue$10] = (byte)var4;
            int incrementValue$11 = var3;
            var3--;
            ((Main) this).field_H[incrementValue$11] = (byte)var4;
            var4--;
            continue L0;
          }
        }
    }

    private final int m(int param0) {
        if (param0 <= 112) {
            return 70;
        }
        return (4020 & ((Main) this).field_Y) >> 8;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        dh var4 = null;
        int stackIn_10_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_74_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        Object stackOut_73_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_74_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        L0: {
          var3 = field_T;
          h.e((byte) -84);
          if (null == gj.field_a) {
            break L0;
          } else {
            if (!gj.field_a.field_b) {
              break L0;
            } else {
              L1: {
                if (param0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              ga.a(stackIn_10_0 != 0);
              g.k(4);
              break L0;
            }
          }
        }
        L2: {
          stackOut_11_0 = this;
          stackOut_11_1 = -71;
          stackIn_14_0 = stackOut_11_0;
          stackIn_14_1 = stackOut_11_1;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          if (gj.field_a == null) {
            stackOut_14_0 = this;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            break L2;
          } else {
            stackOut_12_0 = this;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = 1;
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_15_2 = stackOut_12_2;
            break L2;
          }
        }
        L3: {
          ((Main) this).a((byte) stackIn_15_1, stackIn_15_2 != 0);
          if (kj.field_P) {
            this.n((byte) 7);
            kj.field_P = false;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0) {
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
            break L4;
          } else {
            stackOut_20_0 = 1;
            stackIn_23_0 = stackOut_20_0;
            break L4;
          }
        }
        L5: {
          if (th.a(stackIn_23_0 == 0)) {
            if (!fg.field_k) {
              L6: {
                hj.a(2, eg.field_f);
                var2 = this.b(true, (byte) -51);
                if (2 == var2) {
                  bc.field_a = -2073859829;
                  ol.field_W = -2073859829;
                  ok.b(63);
                  this.v(256);
                  fg.field_k = true;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var2 == 2) {
                  break L7;
                } else {
                  if (var2 == 1) {
                    break L7;
                  } else {
                    break L5;
                  }
                }
              }
              hj.b((byte) -34);
              break L5;
            } else {
              if (null == ra.field_d) {
                if (eh.d(19314)) {
                  L8: {
                    if (ff.field_b == -1) {
                      L9: {
                        var2 = nl.a(true);
                        if (var2 == 2) {
                          ga.a(true);
                          break L9;
                        } else {
                          if (var2 != 3) {
                            if (4 == var2) {
                              ((Main) this).a(-2, false, -2, -112);
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, (ee) (Object) qa.field_b);
                            break L9;
                          }
                        }
                      }
                      if (eh.d(19314)) {
                        break L8;
                      } else {
                        ((Main) this).field_E[dj.field_a].a(-31102, true);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (ff.field_b != 9) {
                    break L5;
                  } else {
                    this.p(-97283608);
                    break L5;
                  }
                } else {
                  if (ag.b(-109)) {
                    L10: {
                      stackOut_73_0 = this;
                      stackIn_78_0 = stackOut_73_0;
                      stackIn_74_0 = stackOut_73_0;
                      if (null == gj.field_a) {
                        stackOut_78_0 = this;
                        stackOut_78_1 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        break L10;
                      } else {
                        stackOut_74_0 = this;
                        stackIn_76_0 = stackOut_74_0;
                        stackOut_76_0 = this;
                        stackOut_76_1 = 1;
                        stackIn_79_0 = stackOut_76_0;
                        stackIn_79_1 = stackOut_76_1;
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        var2 = ((Main) this).a(stackIn_79_1 != 0, (byte) 104);
                        if (var2 == 1) {
                          break L12;
                        } else {
                          if (var2 != 2) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (null == gj.field_a) {
                          break L13;
                        } else {
                          ga.a(true);
                          break L13;
                        }
                      }
                      if (2 != var2) {
                        break L11;
                      } else {
                        pb.a((byte) -124, mk.g(-124));
                        break L5;
                      }
                    }
                    break L5;
                  } else {
                    L14: {
                      dh.field_m = dh.field_m + 20L;
                      if (ff.field_b != -1) {
                        this.p(-97283608);
                        break L14;
                      } else {
                        if (dj.field_a == -1) {
                          this.o(1);
                          break L14;
                        } else {
                          ((Main) this).field_E[dj.field_a].a((byte) -114);
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (((Main) this).field_X.a((byte) 74) == null) {
                        break L15;
                      } else {
                        int fieldTemp$3 = ((Main) this).field_B + 1;
                        ((Main) this).field_B = ((Main) this).field_B + 1;
                        if (fieldTemp$3 == 335) {
                          ((Main) this).field_B = 0;
                          qb discarded$4 = ((Main) this).field_X.d(-89);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (0 != dl.field_h) {
                      var2 = eg.field_b * (640 ^ ij.field_e);
                      tk.field_c = tk.field_c + 8;
                      jl.field_h = jl.field_h + var2;
                      ol.field_W = ol.field_W - var2;
                      vf.field_b = vf.field_b + (af.field_ob << 3);
                      rj.field_p = rj.field_p - (af.field_ob << 3);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                if (!ra.field_d.field_j) {
                  break L5;
                } else {
                  rg.field_e = ra.field_d.field_h;
                  nb.field_e = nb.field_e & ~rg.field_e;
                  ue.field_d = ue.field_d & ~rg.field_e;
                  db.field_m = db.field_m | rg.field_e;
                  var4 = (dh) (Object) ij.field_h.a((byte) 74);
                  L16: while (true) {
                    if (var4 == null) {
                      L17: {
                        ra.field_d = null;
                        cf.a((Main) this, (byte) 45);
                        if (dj.field_a == 10) {
                          dj.field_a = 5;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      ok.b(55);
                      break L5;
                    } else {
                      ii.a(var4, 4, 8192);
                      var4 = (dh) (Object) ij.field_h.b((byte) -98);
                      continue L16;
                    }
                  }
                }
              }
            }
          } else {
            ((Main) this).k((byte) -100);
            if (ri.b((byte) 38)) {
              int discarded$5 = this.b(false, (byte) -59);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L18: while (true) {
          if (!Main.a((byte) 30, ad.field_t)) {
            L19: {
              if (!param0) {
                break L19;
              } else {
                ((Main) this).field_K = -119;
                break L19;
              }
            }
            L20: {
              fe.a((byte) -102, 0);
              if (!ie.b((byte) 34)) {
                break L20;
              } else {
                L21: {
                  L22: {
                    var2 = ((Main) this).c(false);
                    if (var2 == 0) {
                      break L22;
                    } else {
                      if (var2 != 1) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  pg.a(true, 3);
                  tb.a(4, 78);
                  break L21;
                }
                if (2 == var2) {
                  r.a(18, 6, -250, 320, qa.field_b.field_s * 3 >> 1, g.field_C, 2, (ee) (Object) qa.field_b, 6, tc.field_a, 240);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            return;
          } else {
            ((Main) this).f((byte) 99);
            continue L18;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param3 > -49) {
            ((Main) this).b((byte) 32);
        }
        ((Main) this).a(11246, ((255 & param2) << 8) + (param0 & 255), 9, param1);
    }

    private final void d(boolean param0) {
        short[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        var8 = field_T;
        var9 = new short[120];
        var2 = var9;
        var3 = 0;
        var4 = 5;
        L0: while (true) {
          if (var4 < 0) {
            var4 = 4;
            L1: while (true) {
              if (var4 < 0) {
                ((Main) this).field_Y = var9[sj.a(10999, var3, uh.field_l)];
                mi.a(118, jd.field_c[9], 100 * lg.field_I[9] / ((Main) this).field_ab, ca.field_c[9]);
                return;
              } else {
                var5 = 5;
                L2: while (true) {
                  if (var5 < 0) {
                    var4--;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        var6 = (short)(257 * var5 + (var4 * 4112 + 16));
                        var7 = var5 + 6 * var4;
                        if (-1 != ((Main) this).field_H[var7]) {
                          break L4;
                        } else {
                          if (((Main) this).field_H[6 + var7] != -1) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      int incrementValue$4 = var3;
                      var3++;
                      var9[incrementValue$4] = (short)var6;
                      break L3;
                    }
                    L5: {
                      if (-1 == ((Main) this).field_H[var7]) {
                        break L5;
                      } else {
                        if (((Main) this).field_H[6 + var7] == -1) {
                          break L5;
                        } else {
                          int incrementValue$5 = var3;
                          var3++;
                          var9[incrementValue$5] = (short)var6;
                          break L5;
                        }
                      }
                    }
                    var5--;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var5 = 4;
            L6: while (true) {
              if (0 > var5) {
                var4--;
                continue L0;
              } else {
                L7: {
                  L8: {
                    var6 = (short)(var4 * 4112 + (var5 * 257 - -1));
                    var7 = var5 + var4 * 6;
                    if (-1 != ((Main) this).field_H[var7]) {
                      break L8;
                    } else {
                      if (-1 != ((Main) this).field_H[var7 - -1]) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  int incrementValue$6 = var3;
                  var3++;
                  var9[incrementValue$6] = (short)var6;
                  break L7;
                }
                L9: {
                  if (((Main) this).field_H[var7] == -1) {
                    break L9;
                  } else {
                    if (((Main) this).field_H[var7 - -1] == -1) {
                      break L9;
                    } else {
                      int incrementValue$7 = var3;
                      var3++;
                      var9[incrementValue$7] = (short)var6;
                      break L9;
                    }
                  }
                }
                var5--;
                continue L6;
              }
            }
          }
        }
    }

    private final void t(int param0) {
        L0: {
          if (((Main) this).field_db < 0) {
            L1: {
              if (((Main) this).field_U == 1) {
                ((Main) this).c(85, 0);
                break L1;
              } else {
                break L1;
              }
            }
            ((Main) this).field_db = 0;
            break L0;
          } else {
            break L0;
          }
        }
        this.d((((Main) this).field_db - -999) / 1000, 10);
    }

    private final void a(byte param0, int param1, int param2, int param3, long param4, long param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = field_T;
          var10 = 106 % ((-71 - param0) / 36);
          var9 = 32 + (param1 + -320);
          var11 = -240 + (param3 + 32);
          var12 = (int)(dh.field_m + -param5);
          if (var12 >= 300) {
            if (dh.field_m < param4) {
              if (param4 + -300L < dh.field_m) {
                th.a(107, 0);
                var12 = 300 - -(int)(-param4 + dh.field_m);
                if (((Main) this).field_H[((Main) this).field_A] != ((Main) this).field_H[((Main) this).field_N]) {
                  sa.a(0, var11, 512, var9, 0, (var12 << 10) / 300 - -1024, 0, 0);
                  break L0;
                } else {
                  var13 = 512 - -(var12 * 1536 / 300);
                  sa.a(0, var11 * var13 >> 9, var13, var13 * var9 >> 9, 0, 0, 0, 2047 & (var12 << 10) / 300);
                  break L0;
                }
              } else {
                ((Main) this).field_I[param2].b(param1, param3);
                break L0;
              }
            } else {
              ((Main) this).field_I[0].b(param1, param3);
              break L0;
            }
          } else {
            sa.a(0, var11, 512, var9, 0, (var12 << 10) / 300, 0, 0);
            break L0;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param0 == -49) {
            break L0;
          } else {
            Main.u(-128);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 48) {
              break L2;
            } else {
              if (57 < param1) {
                break L2;
              } else {
                stackOut_7_0 = 1;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final void c(int param0) {
        ((Main) this).a(false, param0 ^ 4405030, false, true, false);
        ((Main) this).a(6, 0, 7, 9, 7, (byte) 115, false, 8);
        oa.a((java.awt.Component) (Object) tb.field_c, 22050, (byte) 103, jk.field_a, true);
        wg.field_a = param0;
        ca.field_b = 4086842;
        af.field_jb = 4473924;
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = field_T;
          var3 = 96 % ((param0 - -78) / 36);
          var4 = ((Main) this).field_U;
          if (4 == var4) {
            pb.a(ve.field_c, 13427);
            break L0;
          } else {
            if (var4 == 2) {
              ((Main) this).field_N = -1;
              ((Main) this).field_A = -1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          ((Main) this).field_U = param1;
          var5 = ((Main) this).field_U;
          if (4 == var5) {
            L2: {
              ((Main) this).field_K = (((Main) this).field_db + 999) / 1000;
              if (dg.field_J <= 0) {
                break L2;
              } else {
                if (dg.field_J >= 6) {
                  break L2;
                } else {
                  boolean discarded$8 = th.a(1 + q.field_i, 1, dg.field_J + -1);
                  break L2;
                }
              }
            }
            L3: {
              var4 = Math.max(-(4 * dg.field_J) + 44, 20) + -((Main) this).field_J;
              if (var4 <= 18) {
                boolean discarded$9 = th.a(250, 1, 5);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (12 >= var4) {
                boolean discarded$10 = th.a(249, 1, 6);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var4 <= 9) {
                boolean discarded$11 = th.a(248, 1, 7);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((Main) this).field_K >= 60) {
                boolean discarded$12 = th.a(247, 1, 8);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((Main) this).field_K < 90) {
                break L7;
              } else {
                boolean discarded$13 = th.a(246, 1, 9);
                break L7;
              }
            }
            L8: {
              if (((Main) this).field_K >= 120) {
                boolean discarded$14 = th.a(245, 1, 10);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((Main) this).field_K >= 150) {
                boolean discarded$15 = th.a(244, 1, 11);
                break L9;
              } else {
                break L9;
              }
            }
            if (ue.field_d == 0) {
              if (((Main) this).field_K > 0) {
                gh.a(ve.field_c, (byte) -87);
                break L1;
              } else {
                break L1;
              }
            } else {
              ((Main) this).a(11246, 8, 3, false);
              break L1;
            }
          } else {
            if (var5 != 0) {
              break L1;
            } else {
              L10: {
                if (ai.field_m <= 0) {
                  break L10;
                } else {
                  if (jf.field_n) {
                    break L10;
                  } else {
                    if (!dl.d(0)) {
                      ((Main) this).field_P = pk.a(fb.field_c[((Main) this).field_C], new int[1], af.field_ob, vb.field_a[((Main) this).field_C], vf.field_b, rj.field_p, tk.field_c, (byte) 70, 3);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              sc.a((byte) 53, lc.field_a[0]);
              ((Main) this).a(11246, 6, 3, false);
              break L1;
            }
          }
        }
    }

    public static void u(int param0) {
        field_M = null;
        field_W = null;
        field_V = null;
        if (param0 != -24711) {
            return;
        }
        field_y = null;
    }

    private final int m(byte param0) {
        if (param0 <= 33) {
            int discarded$0 = this.m(-92);
        }
        return ((Main) this).field_Y >> 4 & 15;
    }

    private final void k(int param0) {
        int var2 = this.s(-25520);
        int var3 = this.n(128);
        if (param0 <= 16) {
            ((Main) this).field_ab = 96;
        }
        int var4 = ((Main) this).field_H[var2];
        ((Main) this).field_H[var2] = ((Main) this).field_H[var3];
        ((Main) this).field_H[var3] = (byte)var4;
        vf.field_b = vf.field_b + af.field_ob;
        tk.field_c = tk.field_c + 1;
        rj.field_p = rj.field_p - af.field_ob;
    }

    final static void a(Object param0, le param1, byte param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = field_T;
        try {
          L0: {
            if (null != param1.field_e) {
              L1: {
                var3_int = 0;
                if (param2 > 101) {
                  break L1;
                } else {
                  field_G = -54;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if (var3_int >= 50) {
                    break L3;
                  } else {
                    if (null == param1.field_e.peekEvent()) {
                      break L3;
                    } else {
                      wk.a((byte) -107, 1L);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (null != param0) {
                        param1.field_e.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("Main.SA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 41);
        }
    }

    final void b(int param0, int param1) {
        String var3 = null;
        hh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        oh stackIn_1_0 = null;
        String stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        oh stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        oh stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        byte stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        byte stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        byte stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        long stackIn_96_5 = 0L;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        byte stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        long stackIn_97_5 = 0L;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        byte stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        long stackIn_99_5 = 0L;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        byte stackIn_100_3 = 0;
        int stackIn_100_4 = 0;
        long stackIn_100_5 = 0L;
        long stackIn_100_6 = 0L;
        int stackIn_107_0 = 0;
        oh stackOut_0_0 = null;
        String stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        oh stackOut_3_0 = null;
        String stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        oh stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        int stackOut_72_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        byte stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        byte stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        long stackOut_95_5 = 0L;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        byte stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        long stackOut_93_5 = 0L;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        byte stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        long stackOut_96_5 = 0L;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        byte stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        long stackOut_99_5 = 0L;
        long stackOut_99_6 = 0L;
        Object stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        byte stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        long stackOut_97_5 = 0L;
        long stackOut_97_6 = 0L;
        L0: {
          var14 = field_T;
          bd.field_H.b(0, 0);
          qa.field_b.c(Integer.toString(dg.field_J), 85, 80, 16777215, -1);
          stackOut_0_0 = qa.field_b;
          stackOut_0_1 = Integer.toString(-af.field_ob + rj.field_p + vf.field_b >> 8);
          stackOut_0_2 = 130;
          stackOut_0_3 = 238;
          stackIn_3_0 = stackOut_0_0;
          stackIn_3_1 = stackOut_0_1;
          stackIn_3_2 = stackOut_0_2;
          stackIn_3_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (jf.field_n) {
            stackOut_3_0 = (oh) (Object) stackIn_3_0;
            stackOut_3_1 = (String) (Object) stackIn_3_1;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = stackIn_3_3;
            stackOut_3_4 = 16776960;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            stackIn_4_2 = stackOut_3_2;
            stackIn_4_3 = stackOut_3_3;
            stackIn_4_4 = stackOut_3_4;
            break L0;
          } else {
            stackOut_1_0 = (oh) (Object) stackIn_1_0;
            stackOut_1_1 = (String) (Object) stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 16777215;
            stackIn_4_0 = stackOut_1_0;
            stackIn_4_1 = stackOut_1_1;
            stackIn_4_2 = stackOut_1_2;
            stackIn_4_3 = stackOut_1_3;
            stackIn_4_4 = stackOut_1_4;
            break L0;
          }
        }
        ((oh) (Object) stackIn_4_0).c(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, -1);
        if (param1 == 2) {
          L1: {
            var3 = "";
            if (((Main) this).field_J < 0) {
              if ((param0 & 16) >= 8) {
                break L1;
              } else {
                var3 = "0";
                break L1;
              }
            } else {
              var3 = Integer.toString(((Main) this).field_J);
              break L1;
            }
          }
          L2: {
            qa.field_b.c(var3, 148, 134, 16777215, -1);
            var4 = (hh) (Object) ((Main) this).field_X.a((byte) 74);
            if (null != var4) {
              L3: {
                var6 = ((Main) this).field_B;
                if (80 > var6) {
                  var5 = -32 + var6 / 2;
                  break L3;
                } else {
                  if (230 <= var6) {
                    var5 = -(var6 / 2) + 123;
                    break L3;
                  } else {
                    var5 = 8;
                    break L3;
                  }
                }
              }
              qk.field_a[var4.field_h].a(8, var5);
              qa.field_b.b(ge.field_b[var4.field_h], 45, var5 - -qa.field_b.field_s, 0, -1);
              break L2;
            } else {
              break L2;
            }
          }
          L4: {
            if (((Main) this).field_U != 4) {
              if (((Main) this).field_U == 0) {
                break L4;
              } else {
                if (-1 != dj.field_a) {
                  break L4;
                } else {
                  this.t(0);
                  break L4;
                }
              }
            } else {
              this.d(((Main) this).field_K, param1 ^ 8);
              break L4;
            }
          }
          L5: {
            L6: {
              if (((Main) this).field_db > 0) {
                break L6;
              } else {
                if ((param0 & 16) >= 8) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            qa.field_b.c(((Main) this).field_Z, 118, 286, 16777215, -1);
            break L5;
          }
          L7: {
            var5 = -1;
            var6 = -1;
            if (((Main) this).field_U != 3) {
              break L7;
            } else {
              L8: {
                if (~(-((Main) this).field_z + dh.field_m) >= ~(long)((Main) this).field_ab) {
                  break L8;
                } else {
                  ((Main) this).field_z = ((Main) this).field_z + (long)((Main) this).field_ab;
                  this.k(param1 ^ 17);
                  ((Main) this).field_F = ((Main) this).field_F - 2;
                  if (((Main) this).field_F >= 2) {
                    this.d(true);
                    break L8;
                  } else {
                    ((Main) this).c(param1 ^ 23, 1);
                    break L7;
                  }
                }
              }
              var5 = this.s(-25520);
              var6 = this.n(param1 + 126);
              break L7;
            }
          }
          var7 = 36;
          var8 = 0;
          var9 = 0;
          L9: while (true) {
            if (var9 >= 6) {
              L10: {
                if (((Main) this).field_U != 3) {
                  break L10;
                } else {
                  this.r(param1 + 16777213);
                  break L10;
                }
              }
              return;
            } else {
              var10 = 201;
              var11 = 0;
              L11: while (true) {
                if (6 <= var11) {
                  var7 += 69;
                  var9++;
                  continue L9;
                } else {
                  L12: {
                    if (((Main) this).field_H[var8] == -1) {
                      break L12;
                    } else {
                      if (~var8 == ~var5) {
                        break L12;
                      } else {
                        if (var8 == var6) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              if (((Main) this).field_U != 2) {
                                break L14;
                              } else {
                                L15: {
                                  if (~((Main) this).field_N == ~var8) {
                                    break L15;
                                  } else {
                                    if (((Main) this).field_A != var8) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                stackOut_72_0 = 1;
                                stackIn_75_0 = stackOut_72_0;
                                break L13;
                              }
                            }
                            stackOut_74_0 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            break L13;
                          }
                          L16: {
                            L17: {
                              var12 = stackIn_75_0;
                              stackOut_75_0 = var12;
                              stackIn_81_0 = stackOut_75_0;
                              stackIn_76_0 = stackOut_75_0;
                              if (1 != ((Main) this).field_C) {
                                break L17;
                              } else {
                                stackOut_76_0 = stackIn_76_0;
                                stackIn_81_0 = stackOut_76_0;
                                stackIn_77_0 = stackOut_76_0;
                                if (var8 != ((Main) this).field_N) {
                                  break L17;
                                } else {
                                  stackOut_77_0 = stackIn_77_0;
                                  stackIn_79_0 = stackOut_77_0;
                                  stackOut_79_0 = stackIn_79_0;
                                  stackOut_79_1 = 1;
                                  stackIn_82_0 = stackOut_79_0;
                                  stackIn_82_1 = stackOut_79_1;
                                  break L16;
                                }
                              }
                            }
                            stackOut_81_0 = stackIn_81_0;
                            stackOut_81_1 = 0;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            break L16;
                          }
                          var12 = stackIn_82_0 | stackIn_82_1;
                          var12 = var12 != 0 | ((Main) this).field_L ? 1 : 0;
                          if (var12 == 0) {
                            L18: {
                              if (~var8 != ~((Main) this).field_N) {
                                stackOut_106_0 = 0;
                                stackIn_107_0 = stackOut_106_0;
                                break L18;
                              } else {
                                stackOut_104_0 = 1;
                                stackIn_107_0 = stackOut_104_0;
                                break L18;
                              }
                            }
                            var13 = stackIn_107_0;
                            ((Main) this).field_I[var13].b(var10, var7);
                            break L12;
                          } else {
                            L19: {
                              L20: {
                                stackOut_83_0 = param1 + 118;
                                stackIn_91_0 = stackOut_83_0;
                                stackIn_84_0 = stackOut_83_0;
                                if (((Main) this).field_C != 0) {
                                  break L20;
                                } else {
                                  stackOut_84_0 = stackIn_84_0;
                                  stackIn_86_0 = stackOut_84_0;
                                  stackOut_86_0 = stackIn_86_0;
                                  stackIn_91_0 = stackOut_86_0;
                                  stackIn_87_0 = stackOut_86_0;
                                  if (var8 != ((Main) this).field_N) {
                                    break L20;
                                  } else {
                                    stackOut_87_0 = stackIn_87_0;
                                    stackIn_89_0 = stackOut_87_0;
                                    stackOut_89_0 = stackIn_89_0;
                                    stackOut_89_1 = 1;
                                    stackIn_92_0 = stackOut_89_0;
                                    stackIn_92_1 = stackOut_89_1;
                                    break L19;
                                  }
                                }
                              }
                              stackOut_91_0 = stackIn_91_0;
                              stackOut_91_1 = 0;
                              stackIn_92_0 = stackOut_91_0;
                              stackIn_92_1 = stackOut_91_1;
                              break L19;
                            }
                            L21: {
                              th.a(stackIn_92_0, stackIn_92_1);
                              ji.a((int) ((Main) this).field_H[var8], 24355);
                              stackOut_92_0 = this;
                              stackOut_92_1 = 10;
                              stackOut_92_2 = var10;
                              stackOut_92_3 = ((Main) this).field_H[var8];
                              stackOut_92_4 = var7;
                              stackIn_95_0 = stackOut_92_0;
                              stackIn_95_1 = stackOut_92_1;
                              stackIn_95_2 = stackOut_92_2;
                              stackIn_95_3 = stackOut_92_3;
                              stackIn_95_4 = stackOut_92_4;
                              stackIn_93_0 = stackOut_92_0;
                              stackIn_93_1 = stackOut_92_1;
                              stackIn_93_2 = stackOut_92_2;
                              stackIn_93_3 = stackOut_92_3;
                              stackIn_93_4 = stackOut_92_4;
                              if (((Main) this).field_A == -1) {
                                stackOut_95_0 = this;
                                stackOut_95_1 = stackIn_95_1;
                                stackOut_95_2 = stackIn_95_2;
                                stackOut_95_3 = stackIn_95_3;
                                stackOut_95_4 = stackIn_95_4;
                                stackOut_95_5 = 9223372036854775807L;
                                stackIn_96_0 = stackOut_95_0;
                                stackIn_96_1 = stackOut_95_1;
                                stackIn_96_2 = stackOut_95_2;
                                stackIn_96_3 = stackOut_95_3;
                                stackIn_96_4 = stackOut_95_4;
                                stackIn_96_5 = stackOut_95_5;
                                break L21;
                              } else {
                                stackOut_93_0 = this;
                                stackOut_93_1 = stackIn_93_1;
                                stackOut_93_2 = stackIn_93_2;
                                stackOut_93_3 = stackIn_93_3;
                                stackOut_93_4 = stackIn_93_4;
                                stackOut_93_5 = ((Main) this).field_S - -1000L;
                                stackIn_96_0 = stackOut_93_0;
                                stackIn_96_1 = stackOut_93_1;
                                stackIn_96_2 = stackOut_93_2;
                                stackIn_96_3 = stackOut_93_3;
                                stackIn_96_4 = stackOut_93_4;
                                stackIn_96_5 = stackOut_93_5;
                                break L21;
                              }
                            }
                            L22: {
                              stackOut_96_0 = this;
                              stackOut_96_1 = stackIn_96_1;
                              stackOut_96_2 = stackIn_96_2;
                              stackOut_96_3 = stackIn_96_3;
                              stackOut_96_4 = stackIn_96_4;
                              stackOut_96_5 = stackIn_96_5;
                              stackIn_99_0 = stackOut_96_0;
                              stackIn_99_1 = stackOut_96_1;
                              stackIn_99_2 = stackOut_96_2;
                              stackIn_99_3 = stackOut_96_3;
                              stackIn_99_4 = stackOut_96_4;
                              stackIn_99_5 = stackOut_96_5;
                              stackIn_97_0 = stackOut_96_0;
                              stackIn_97_1 = stackOut_96_1;
                              stackIn_97_2 = stackOut_96_2;
                              stackIn_97_3 = stackOut_96_3;
                              stackIn_97_4 = stackOut_96_4;
                              stackIn_97_5 = stackOut_96_5;
                              if (((Main) this).field_N == var8) {
                                stackOut_99_0 = this;
                                stackOut_99_1 = stackIn_99_1;
                                stackOut_99_2 = stackIn_99_2;
                                stackOut_99_3 = stackIn_99_3;
                                stackOut_99_4 = stackIn_99_4;
                                stackOut_99_5 = stackIn_99_5;
                                stackOut_99_6 = ((Main) this).field_R;
                                stackIn_100_0 = stackOut_99_0;
                                stackIn_100_1 = stackOut_99_1;
                                stackIn_100_2 = stackOut_99_2;
                                stackIn_100_3 = stackOut_99_3;
                                stackIn_100_4 = stackOut_99_4;
                                stackIn_100_5 = stackOut_99_5;
                                stackIn_100_6 = stackOut_99_6;
                                break L22;
                              } else {
                                stackOut_97_0 = this;
                                stackOut_97_1 = stackIn_97_1;
                                stackOut_97_2 = stackIn_97_2;
                                stackOut_97_3 = stackIn_97_3;
                                stackOut_97_4 = stackIn_97_4;
                                stackOut_97_5 = stackIn_97_5;
                                stackOut_97_6 = ((Main) this).field_S;
                                stackIn_100_0 = stackOut_97_0;
                                stackIn_100_1 = stackOut_97_1;
                                stackIn_100_2 = stackOut_97_2;
                                stackIn_100_3 = stackOut_97_3;
                                stackIn_100_4 = stackOut_97_4;
                                stackIn_100_5 = stackOut_97_5;
                                stackIn_100_6 = stackOut_97_6;
                                break L22;
                              }
                            }
                            this.a((byte) stackIn_100_1, stackIn_100_2, (int) stackIn_100_3, stackIn_100_4, stackIn_100_5, stackIn_100_6);
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  var8++;
                  var10 += 69;
                  var11++;
                  continue L11;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void v(int param0) {
        h.a(-17685, 50);
        L0: {
          mg.a(50, true);
          sc.a((byte) 42, lc.field_a[0]);
          if (dl.d(0)) {
            break L0;
          } else {
            ra.field_d = sk.a(4, (byte) 125);
            break L0;
          }
        }
    }

    private final int b(boolean param0, byte param1) {
        da var3_ref_da = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9_int = 0;
        hg var9 = null;
        int var10 = 0;
        kc var10_ref_kc = null;
        int var11_int = 0;
        kc var11 = null;
        int var12_int = 0;
        kc var12 = null;
        wb var13 = null;
        int var13_int = 0;
        int var14 = 0;
        kc var15 = null;
        int var15_int = 0;
        kc var16 = null;
        int var16_int = 0;
        kc var17 = null;
        int var17_int = 0;
        kc var18 = null;
        kc var19 = null;
        kc var20 = null;
        kc var21 = null;
        kc var22 = null;
        kc var23 = null;
        Object var24 = null;
        int var25 = 0;
        int var26 = 0;
        kc var27 = null;
        kc var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var32_int = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var46 = 0;
        ib var47 = null;
        ib var48 = null;
        ib var49 = null;
        wb[] var50 = null;
        wb var52 = null;
        kc[] var53 = null;
        int[] var54 = null;
        kc var55 = null;
        kc var56 = null;
        int[] var58 = null;
        int[] var60 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        var46 = field_T;
        hc.a(true);
        if (null != jd.field_c[0]) {
          if (null != ll.field_e) {
            ug.a(85.0f, 105, j.field_A);
            ((Main) this).b((byte) 59);
            var3_ref_da = new da(sh.field_g, fb.field_a);
            sh.field_g = null;
            fb.field_a = null;
            lc.field_a[0] = new uf(gg.a("music/36 Card Trick - Title Screen Music", var3_ref_da, ll.field_e, -16351, ""));
            lc.field_a[1] = new uf(gg.a("music/36 Card Trick - In-game Music", var3_ref_da, ll.field_e, -16351, ""));
            lc.field_a[2] = new uf(gg.a("music/36 Card Trick - Pause Screen", var3_ref_da, ll.field_e, -16351, ""));
            ll.field_e = null;
            var4 = 0;
            L0: while (true) {
              if (lc.field_a.length <= var4) {
                return 1;
              } else {
                lc.field_a[var4].a(48);
                var4++;
                continue L0;
              }
            }
          } else {
            if (hf.field_H == null) {
              if (null != mh.field_c) {
                ug.a(95.0f, 77, lb.field_f);
                ((Main) this).b((byte) 59);
                var61 = id.field_a.a((byte) 7, "font", "");
                var50 = lk.a("font", "", (byte) 49, mh.field_c);
                qa.field_b = ga.a(121, var50, var61);
                eb.field_c = kk.a(var50, var61, 1, 256, 16777215);
                var5 = qa.field_b.field_s + qa.field_b.field_x;
                sk.field_c = new kc(var5, var5);
                sk.field_c.c();
                qi.field_D.a(0, 0, var5, var5);
                qi.field_D = null;
                gf.field_e.a(200);
                ((Main) this).field_I = gl.a("tiles", mh.field_c, "", -13244);
                var52 = lh.a("canyonmask2", mh.field_c, "", 120);
                var7 = var52.field_c;
                var52.field_c = 0;
                var52.field_f = var52.field_b;
                td.field_c[0] = new kc(415, 415);
                td.field_c[0].c();
                vj.c(0, 0, 415, 415, 9351922);
                var52.field_j[1] = 8024722;
                var52.a(0, var7);
                vj.b(0, 261, 415, 154, 8090514, 11373689);
                lh.a("hs", mh.field_c, "", -89).a(0, 0);
                td.field_c[3] = new kc(415, 415);
                td.field_c[3].c();
                vj.c(0, 0, 415, 415, 10932727);
                var52.field_j[1] = 9675196;
                var52.a(0, var7);
                vj.b(0, 261, 415, 154, 9675196, 11645356);
                lh.a("atl", mh.field_c, "", -108).a(0, 0);
                td.field_c[5] = new kc(415, 415);
                td.field_c[5].c();
                vj.c(0, 0, 415, 415, 13869944);
                var52.field_j[1] = 11698531;
                var52.a(0, var7);
                vj.b(0, 261, 415, 154, 11698531, 13734228);
                lh.a("atg", mh.field_c, "", -21).a(0, 0);
                td.field_c[4] = new kc(415, 415);
                td.field_c[4].c();
                vj.c(0, 0, 415, 415, 10211583);
                var52.field_j[1] = 5081598;
                var52.a(0, var7);
                vj.b(0, 261, 415, 154, 5081598, 11974562);
                lh.a("ld", mh.field_c, "", -96).a(0, 0);
                td.field_c[2] = ce.a(-127, "lc", "", mh.field_c);
                td.field_c[1] = ce.a(-127, "go", "", mh.field_c);
                db.field_o = ce.a(-126, "gunsight", "", mh.field_c);
                qk.field_a = gl.a("achievements", mh.field_c, "", -13244);
                var53 = qk.field_a;
                var9_int = 0;
                L1: while (true) {
                  if (var53.length <= var9_int) {
                    ij.a(vb.field_k, (byte) 124);
                    mg.field_j = new kc[9];
                    kc dupTemp$3 = new kc(4, 4);
                    mg.field_j[8] = dupTemp$3;
                    mg.field_j[6] = dupTemp$3;
                    mg.field_j[2] = dupTemp$3;
                    mg.field_j[0] = dupTemp$3;
                    mg.field_j[0].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    kc dupTemp$4 = new kc(256, 4);
                    mg.field_j[7] = dupTemp$4;
                    mg.field_j[1] = dupTemp$4;
                    mg.field_j[1].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    kc dupTemp$5 = new kc(4, 256);
                    mg.field_j[5] = dupTemp$5;
                    mg.field_j[3] = dupTemp$5;
                    mg.field_j[3].c();
                    vj.c(0, 0, vj.field_l, vj.field_g, 6962948);
                    var62 = ce.a(-126, "woodpal", "", mh.field_c).field_r;
                    var60 = var62;
                    var58 = var60;
                    var54 = var58;
                    var8 = var54;
                    var9 = new hg(new int[8]);
                    mg.field_j[4] = new kc(640, 480);
                    mg.field_j[4].c();
                    var10 = var62.length >> 2;
                    var11_int = -1 + vj.field_j.length;
                    L2: while (true) {
                      if (var11_int < 0) {
                        var11 = new kc(1, 40);
                        var12_int = 0;
                        L3: while (true) {
                          if (var12_int >= vj.field_l) {
                            var12 = new kc(640, 480);
                            var12.c();
                            vj.b(0, 0, 640, 300, 21670, 39641);
                            var13 = lh.a("canyonmask", mh.field_c, "", 127);
                            var14 = var13.field_c;
                            var13.field_f = var13.field_b;
                            var13.field_c = 0;
                            di.a(var13, 4997716, 0, 5000797, 13449, var14);
                            vj.b(0, 316, 640, 164, 5066333, 9336387);
                            var15 = ce.a(-127, "cloud1mask", "", mh.field_c);
                            var16 = ce.a(-127, "cloud2mask", "", mh.field_c);
                            var17 = ce.a(-128, "cloud3mask", "", mh.field_c);
                            var18 = ce.a(-127, "cloud4mask", "", mh.field_c);
                            var19 = ce.a(-126, "cloud5mask", "", mh.field_c);
                            var20 = ce.a(-127, "cloud6mask", "", mh.field_c);
                            var21 = ce.a(-127, "cloud7mask", "", mh.field_c);
                            var22 = ce.a(-128, "menucactus", "", mh.field_c);
                            var23 = ce.a(-127, "logocactus", "", mh.field_c);
                            cg.field_i = ce.a(-128, "screw", "", mh.field_c);
                            d.field_u[0] = var12.b();
                            d.field_u[0].c();
                            re.a(16777215, 0, 0, (byte) 111, var16);
                            re.a(16777215, 0, 0, (byte) 118, var17);
                            re.a(16777215, 0, 0, (byte) 60, var18);
                            re.a(16777215, 0, 0, (byte) 102, var19);
                            var22.d(0, 0);
                            var23.d(0, 0);
                            ce.a(-128, "maintitle", "", mh.field_c).d(0, 0);
                            ce.a(-126, "mmextra1", "", mh.field_c).d(0, 0);
                            ce.a(-128, "mmextra2", "", mh.field_c).d(0, 0);
                            d.field_u[1] = var12.b();
                            d.field_u[1].c();
                            re.a(16777215, 0, 0, (byte) 71, var16);
                            re.a(16777215, 0, 0, (byte) 94, var17);
                            re.a(16777215, 0, 0, (byte) 118, var20);
                            var22.d(0, 0);
                            var23.d(0, 0);
                            ce.a(-128, "pausetitle", "", mh.field_c).d(0, 0);
                            ce.a(-126, "pmextra1", "", mh.field_c).d(0, 0);
                            ce.a(-128, "pmextra2", "", mh.field_c).d(0, 0);
                            d.field_u[2] = ce.a(-126, "titlescreen", "", mh.field_c);
                            d.field_u[3] = var12.b();
                            d.field_u[3].c();
                            vj.g(153, 105, 491, 397);
                            mg.field_j[4].b(0, 0);
                            vj.a();
                            vj.c(169, 121, 308, 261, 16777215);
                            ek.a((byte) 92, 11173684, 2955525, 5122825, 103, 8475405, 296, 151, 342);
                            cg.field_i.d(174, 128);
                            cg.field_i.d(461, 128);
                            cg.field_i.d(176, 363);
                            cg.field_i.d(461, 363);
                            var23.d(4, -38);
                            ce.a(-127, "insttitle", "", mh.field_c).d(0, 0);
                            ce.a(-126, "instextra1", "", mh.field_c).d(0, 0);
                            ce.a(-128, "instextra2", "", mh.field_c).d(0, 0);
                            ce.a(-126, "instextra3", "", mh.field_c).d(0, 0);
                            pc.field_d = new kc[9];
                            var55 = new kc(640, 480);
                            var55.c();
                            mg.field_j[4].b(0, 0);
                            vj.c(18, 18, 604, 444, 16777215);
                            ek.a((byte) 92, 11173684, 2955525, 5122825, 0, 8475405, 480, 0, 640);
                            cg.field_i.d(23, 25);
                            cg.field_i.d(-cg.field_i.field_p + 617, 25);
                            cg.field_i.d(23, 455 - cg.field_i.field_o);
                            cg.field_i.d(-cg.field_i.field_p + 617, -2 + (457 + -cg.field_i.field_o));
                            var25 = 1 + (23 - -cg.field_i.field_p);
                            var26 = 1 + (25 + cg.field_i.field_o);
                            pc.field_d[0] = new kc(var25, var26);
                            pc.field_d[2] = new kc(var25, var26);
                            pc.field_d[6] = new kc(var25, var26);
                            pc.field_d[8] = new kc(var25, var26);
                            pc.field_d[1] = new kc(640 + -(var25 * 2), var26);
                            pc.field_d[7] = new kc(-(2 * var25) + 640, var26);
                            pc.field_d[3] = new kc(var25, 480 - 2 * var26);
                            pc.field_d[5] = new kc(var25, 480 - 2 * var26);
                            pc.field_d[4] = new kc(-(var25 * 2) + 640, -(var26 * 2) + 480);
                            kc.a(var55, pc.field_d[0], 0, 0, 0, 0, var25, var26);
                            kc.a(var55, pc.field_d[2], 640 - var25, 0, 0, 0, var25, var26);
                            kc.a(var55, pc.field_d[6], 0, -var26 + 480, 0, 0, var25, var26);
                            kc.a(var55, pc.field_d[8], -var25 + 640, -var26 + 480, 0, 0, var25, var26);
                            kc.a(var55, pc.field_d[1], var25, 0, 0, 0, 640 - 2 * var25, var26);
                            kc.a(var55, pc.field_d[7], var25, 480 + -var26, 0, 0, 640 - 2 * var25, var26);
                            kc.a(var55, pc.field_d[3], 0, var26, 0, 0, var25, -(2 * var26) + 480);
                            kc.a(var55, pc.field_d[5], -var25 + 640, var26, 0, 0, var25, -(2 * var26) + 480);
                            kc.a(var55, pc.field_d[4], var25, var26, 0, 0, -(var25 * 2) + 640, 480 + -(var25 * 2));
                            var24 = null;
                            d.field_u[4] = var12.b();
                            d.field_u[4].c();
                            re.a(16777215, 0, 0, (byte) 83, var15);
                            re.a(16777215, 0, 0, (byte) 111, var16);
                            re.a(16777215, 0, 0, (byte) 118, var17);
                            re.a(16777215, 0, 0, (byte) 52, var18);
                            re.a(16777215, 0, 0, (byte) 78, var19);
                            re.a(16777215, 0, 0, (byte) 74, var20);
                            ce.a(-128, "achtitle", "", mh.field_c).d(0, 0);
                            var27 = ce.a(-127, "achextra2", "", mh.field_c);
                            var27.d(0, 0);
                            var23.d(0, -38);
                            vj.g(225, 93, 589, 407);
                            mg.field_j[4].b(0, 0);
                            vj.a();
                            vj.c(236, 103, 343, 291, 16777215);
                            ek.a((byte) 92, 11173684, 2955525, 5122825, 91, 8475405, 318, 223, 368);
                            cg.field_i.d(242, 109);
                            cg.field_i.d(562, 109);
                            cg.field_i.d(243, 374);
                            cg.field_i.d(562, 374);
                            bd.field_H = var12.b();
                            bd.field_H.c();
                            var23.d(0, 0);
                            re.a(16777215, 0, 0, (byte) 71, var15);
                            re.a(16777215, 0, 0, (byte) 94, var16);
                            re.a(16777215, 0, 0, (byte) 59, var17);
                            re.a(16777215, 0, 0, (byte) 65, var18);
                            re.a(16777215, 0, 0, (byte) 103, var20);
                            re.a(16777215, 0, 0, (byte) 100, var21);
                            ce.a(-128, "ropeout", "", mh.field_c).d(0, 0);
                            ce.a(-128, "ropein", "", mh.field_c).e(0, 0, 116);
                            vj.c(198, 33, 415, 415, 1);
                            ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
                            a.a(16777215, vk.field_j, -1, 39, 6697779, 113);
                            a.a(16777215, tj.field_D, -1, 98, 6697779, 162);
                            a.a(16777215, ti.field_b, -1, 15, 6697779, 262);
                            a.a(16777215, uc.field_o, -1, 36, 6697779, 313);
                            f.field_a = var12.b();
                            f.field_a.c();
                            re.a(16777215, 0, 0, (byte) 100, var15);
                            re.a(16777215, 0, 0, (byte) 90, var16);
                            re.a(16777215, 0, 0, (byte) 106, var17);
                            re.a(16777215, 0, 0, (byte) 57, var18);
                            re.a(16777215, 0, 0, (byte) 116, var20);
                            var23.d(0, -38);
                            var27.d(-5, 0);
                            vj.c(198, 33, 415, 415, 1);
                            ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
                            gf.field_e.a(200);
                            tc.field_a = new kc[9];
                            var28 = new kc(2, 2);
                            var29 = var28.field_r;
                            var30 = var28.field_r;
                            var28.field_r[3] = 7750664;
                            var31 = var28.field_r;
                            var31[2] = 7750664;
                            var29[0] = 7750664;
                            var30[1] = 7750664;
                            var32_int = 0;
                            L4: while (true) {
                              if (var32_int >= 9) {
                                tc.field_a[4] = null;
                                g.field_C = new kc[9];
                                g.field_C[0] = new kc(2, 2);
                                var32 = g.field_C[0].field_r;
                                g.field_C[0].field_r[2] = 12217600;
                                var33 = g.field_C[0].field_r;
                                var33[1] = 12217600;
                                var32[0] = 12217600;
                                g.field_C[0].field_r[3] = 7619584;
                                g.field_C[1] = new kc(2, 2);
                                g.field_C[1].field_r[1] = 12217600;
                                var34 = g.field_C[1].field_r;
                                var34[0] = 12217600;
                                g.field_C[1].field_r[3] = 7619584;
                                var35 = g.field_C[1].field_r;
                                var35[2] = 7619584;
                                g.field_C[2] = new kc(2, 2);
                                g.field_C[2].field_r[1] = 12217600;
                                var36 = g.field_C[2].field_r;
                                var36[0] = 12217600;
                                g.field_C[2].field_r[2] = 7619584;
                                g.field_C[2].field_r[3] = 3548426;
                                g.field_C[3] = new kc(2, 2);
                                g.field_C[3].field_r[2] = 12217600;
                                var37 = g.field_C[3].field_r;
                                var37[0] = 12217600;
                                g.field_C[3].field_r[3] = 7619584;
                                var38 = g.field_C[3].field_r;
                                var38[1] = 7619584;
                                g.field_C[5] = new kc(2, 2);
                                g.field_C[5].field_r[2] = 5059597;
                                var39 = g.field_C[5].field_r;
                                var39[0] = 5059597;
                                var40 = g.field_C[5].field_r;
                                g.field_C[5].field_r[3] = 3548426;
                                var40[1] = 3548426;
                                g.field_C[6] = new kc(2, 2);
                                g.field_C[6].field_r[2] = 12217600;
                                var41 = g.field_C[6].field_r;
                                g.field_C[6].field_r[1] = 7619584;
                                var41[0] = 12217600;
                                g.field_C[6].field_r[3] = 3548426;
                                g.field_C[7] = new kc(2, 2);
                                var42 = g.field_C[7].field_r;
                                g.field_C[7].field_r[1] = 5059597;
                                var42[0] = 5059597;
                                var43 = g.field_C[7].field_r;
                                g.field_C[7].field_r[3] = 3548426;
                                var43[2] = 3548426;
                                g.field_C[8] = new kc(2, 2);
                                g.field_C[8].field_r[0] = 5059597;
                                var44 = g.field_C[8].field_r;
                                g.field_C[8].field_r[3] = 3548426;
                                var45 = g.field_C[8].field_r;
                                var45[2] = 3548426;
                                mh.field_c = null;
                                var44[1] = 3548426;
                                return 1;
                              } else {
                                tc.field_a[var32_int] = var28;
                                var32_int++;
                                continue L4;
                              }
                            }
                          } else {
                            var13_int = 0;
                            L5: while (true) {
                              if (10 <= var13_int) {
                                var12_int++;
                                continue L3;
                              } else {
                                var14 = bg.a(vj.field_g, -2147483648, var9);
                                var15_int = 5 + bg.a(12, -2147483648, var9);
                                var16_int = var8[(var62.length >> 1) - -bg.a(var62.length >> 1, -2147483648, var9)];
                                var17_int = var62[var10];
                                var11.c();
                                vj.d();
                                vj.b(0, 20 + -var15_int, 1, var15_int, var16_int, var17_int);
                                vj.b(0, 20, 1, var15_int, var17_int, var16_int);
                                mg.field_j[4].c();
                                var11.e(var12_int, var14 + -20, bg.a(56, -2147483648, var9) + 200);
                                var13_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        vj.field_j[var11_int] = var8[var62.length + (-1 + -bg.a(var10, -2147483648, var9))];
                        var11_int--;
                        continue L2;
                      }
                    }
                  } else {
                    var10_ref_kc = var53[var9_int];
                    ij.a(var10_ref_kc, (byte) 123);
                    var9_int++;
                    continue L1;
                  }
                }
              } else {
                ji.a((byte) -119, ((Main) this).field_I);
                mg.c((byte) 96);
                ((Main) this).field_E = new re[11];
                var3 = 0;
                L6: while (true) {
                  if (var3 >= 11) {
                    ff.field_b = -1;
                    dj.field_a = 2;
                    var56 = ia.field_c[15];
                    la.field_k = new kc(var56.field_p, var56.field_o);
                    la.field_k.c();
                    var4 = 40 / ((param1 - 23) / 52);
                    var56.c(0, 0, 4405028);
                    gf.field_e.a(200);
                    return 2;
                  } else {
                    ((Main) this).field_E[var3] = new re((Main) this, var3);
                    var3++;
                    continue L6;
                  }
                }
              }
            } else {
              vb.field_k = ce.a(-126, "unachieved", "basic", hf.field_H);
              qi.field_D = ce.a(-128, "orbcoin", "basic", hf.field_H);
              hf.field_H = null;
              return 1;
            }
          }
        } else {
          L7: {
            if (!hf.field_H.b(4)) {
              break L7;
            } else {
              if (hf.field_H.b(4, "basic")) {
                L8: {
                  if (!sh.field_g.b(4)) {
                    break L8;
                  } else {
                    if (sh.field_g.a((byte) 46)) {
                      L9: {
                        if (!id.field_a.b(4)) {
                          break L9;
                        } else {
                          if (!id.field_a.a((byte) 34)) {
                            break L9;
                          } else {
                            L10: {
                              if (!fb.field_a.b(4)) {
                                break L10;
                              } else {
                                if (!fb.field_a.a((byte) 79)) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (!ll.field_e.b(4)) {
                                      break L11;
                                    } else {
                                      if (!ll.field_e.a((byte) 91)) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (!mh.field_c.b(4)) {
                                            break L12;
                                          } else {
                                            if (!mh.field_c.a((byte) 44)) {
                                              break L12;
                                            } else {
                                              if (param0) {
                                                ok.b(69);
                                                ug.a(80.0f, 122, sc.field_c);
                                                ((Main) this).b((byte) 59);
                                                jd.field_c[0] = uj.a(sh.field_g, "", "turnover_card").a();
                                                jd.field_c[1] = uj.a(sh.field_g, "", "revolver_cocking").a();
                                                jd.field_c[2] = uj.a(sh.field_g, "", "revolver_decocking").a();
                                                jd.field_c[3] = ig.a(fb.field_a, "", "gunshot").c();
                                                jd.field_c[4] = ig.a(fb.field_a, "", "crow").c();
                                                jd.field_c[5] = ig.a(fb.field_a, "", "pesky varment").c();
                                                jd.field_c[6] = ig.a(fb.field_a, "", "feelin lucky").c();
                                                ca.field_c[6] = 112;
                                                jd.field_c[7] = ig.a(fb.field_a, "", "dont try that again").c();
                                                jd.field_c[8] = ig.a(fb.field_a, "", "didnt see that one comin").c();
                                                jd.field_c[9] = uj.a(sh.field_g, "", "swap_cards").a();
                                                jd.field_c[10] = ig.a(fb.field_a, "", "yeeehaaa").c();
                                                jd.field_c[11] = ig.a(fb.field_a, "", "yeeehaaa2").c();
                                                jd.field_c[12] = ig.a(fb.field_a, "", "yeeehaaa3").c();
                                                jd.field_c[13] = ig.a(fb.field_a, "", "are you a mexican").c();
                                                ca.field_c[13] = 120;
                                                jd.field_c[14] = ig.a(fb.field_a, "", "chicken").c();
                                                jd.field_c[15] = uj.a(sh.field_g, "", "menu_click").a();
                                                var47 = uj.a(sh.field_g, "", "score-count").a();
                                                var47.field_k = var47.field_h.length;
                                                ve.field_c = li.a(var47, 100, 30);
                                                ve.field_c.e(-1);
                                                var48 = new ib(jd.field_c[15].field_l, jd.field_c[15].field_h.length + 1000);
                                                og.a(jd.field_c[15].field_h, 0, var48.field_h, 0, jd.field_c[15].field_h.length);
                                                lh.field_d = li.a(var48, 100, 96);
                                                lh.field_d.c(0, var48.field_h.length);
                                                lh.field_d.e(0);
                                                var5 = 0;
                                                L13: while (true) {
                                                  if (var5 >= 16) {
                                                    return 1;
                                                  } else {
                                                    L14: {
                                                      var49 = jd.field_c[var5];
                                                      stackOut_37_0 = lg.field_I;
                                                      stackOut_37_1 = var5;
                                                      stackIn_40_0 = stackOut_37_0;
                                                      stackIn_40_1 = stackOut_37_1;
                                                      stackIn_38_0 = stackOut_37_0;
                                                      stackIn_38_1 = stackOut_37_1;
                                                      if (var49 != null) {
                                                        stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                                                        stackOut_40_1 = stackIn_40_1;
                                                        stackOut_40_2 = 1000 * var49.field_h.length / var49.field_l;
                                                        stackIn_41_0 = stackOut_40_0;
                                                        stackIn_41_1 = stackOut_40_1;
                                                        stackIn_41_2 = stackOut_40_2;
                                                        break L14;
                                                      } else {
                                                        stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                                                        stackOut_38_1 = stackIn_38_1;
                                                        stackOut_38_2 = 0;
                                                        stackIn_41_0 = stackOut_38_0;
                                                        stackIn_41_1 = stackOut_38_1;
                                                        stackIn_41_2 = stackOut_38_2;
                                                        break L14;
                                                      }
                                                    }
                                                    L15: {
                                                      stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                                      if (ca.field_c[var5] == 0) {
                                                        ca.field_c[var5] = 96;
                                                        break L15;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                    var5++;
                                                    continue L13;
                                                  }
                                                }
                                              } else {
                                                return 1;
                                              }
                                            }
                                          }
                                        }
                                        ug.a(70.0f, 58, tg.a((byte) 87, "", kf.field_j, mh.field_c, bk.field_f));
                                        return 0;
                                      }
                                    }
                                  }
                                  ug.a(50.0f, 82, tg.a((byte) 87, "", ah.field_a, ll.field_e, dh.field_o));
                                  return 0;
                                }
                              }
                            }
                            ug.a(30.0f, 87, tg.a((byte) 87, "", eg.field_e, fb.field_a, wd.field_a));
                            return 0;
                          }
                        }
                      }
                      ug.a(29.0f, 104, tg.a((byte) 87, "", eg.field_e, id.field_a, wd.field_a));
                      return 0;
                    } else {
                      break L8;
                    }
                  }
                }
                ug.a(20.0f, 59, tg.a((byte) 87, "", eg.field_e, sh.field_g, wd.field_a));
                return 0;
              } else {
                break L7;
              }
            }
          }
          ug.a(3.0f, 73, tg.a((byte) 87, "basic", kf.field_j, hf.field_H, bk.field_f));
          return 0;
        }
    }

    final void a(int param0) {
        int var3 = 0;
        var3 = field_T;
        Main.u(-24711);
        hh.a(20364);
        bk.a(false);
        qk.c(124);
        fb.a(8);
        mh.a((byte) -41);
        pk.a(8450);
        ve.a(param0 + 8192);
        sh.a(4352);
        c.g((byte) 108);
        ac.a((byte) -118);
        fj.a((byte) -67);
        rf.b(param0 ^ -19749);
        ag.a((byte) 98);
        te.a(87);
        vj.c();
        ee.a();
        wh.b(120);
        ii.a(4308);
        pb.c((byte) 111);
        id.a(true);
        sd.a((byte) 39);
        kg.a((byte) 84);
        ll.a(0);
        mc.a(8192);
        hb.a(true);
        ia.a(-12765);
        bi.a(param0 ^ 121);
        lf.a(param0 + -10584);
        vk.a(1);
        gg.a(false);
        ij.a(3);
        bc.a(false);
        gk.c(0);
        kh.b(192);
        gf.a((byte) 103);
        oe.a((byte) 127);
        bj.a(-113);
        ah.a(param0 ^ -38);
        uf.e();
        re.a(-4);
        gj.a((byte) 14);
        eb.a(true);
        tk.a(~param0);
        jd.a((byte) 23);
        gi.a(1159353185);
        gd.a();
        oj.a((byte) -105);
        lh.a(7865);
        cj.b((byte) 110);
        vg.a((byte) -72);
        sb.a(false);
        d.a(true);
        ge.a((byte) -117);
        pe.a((byte) -72);
        wf.a(param0 ^ 3);
        al.a((byte) -70);
        hk.a(121);
        j.m(param0 + 46);
        bg.u(-2113);
        rk.e((byte) -30);
        kl.m(-23573);
        tj.l(0);
        ak.a(false);
        fh.m(200);
        jk.a((byte) -63);
        aj.a(83);
        th.b(true);
        hd.a();
        ig.b();
        df.a();
        da.a(-1703274388);
        vb.a(-1);
        rj.b(param0 ^ 72);
        me.a((byte) -128);
        tc.a((byte) -119);
        uk.a((byte) 96);
        ie.e(-11);
        sj.a(0);
        cf.a((byte) 72);
        ik.a();
        oa.a((byte) 109);
        nl.a(10000);
        od.a(-28178);
        fe.a(17449);
        w.h(106);
        i.b(62);
        sk.a(-12865);
        ke.a((byte) -124);
        vf.b(-118);
        ri.a(-2);
        dc.a();
        lg.a(param0 + 18002);
        a.d(param0 ^ -14282);
        cd.a((byte) 104);
        na.c(false);
        hc.b(true);
        ab.e(-78);
        uc.b(param0);
        ud.a(21316);
        la.b((byte) 103);
        kk.a(false);
        eg.a((byte) 38);
        ek.a((byte) 61);
        jb.c();
        ok.a(93);
        ha.a(-124);
        mg.b(40);
        sl.a(-3);
        wg.a((byte) 126);
        jh.a((byte) 51);
        nf.a(param0 ^ 17);
        mb.a(1024);
        ma.a(-47);
        kj.c((byte) 45);
        ph.b(param0 + 62);
        wd.a(true);
        fd.b((byte) 3);
        ti.a(true);
        db.a(0);
        tb.a(param0 + 128);
        mj.a((byte) 126);
        lk.e(0);
        hl.d((byte) -69);
        qg.a(80);
        jc.p(42);
        qf.n(param0 + 8736);
        g.b(true);
        qd.c(param0 ^ -2057);
        ji.a(-61);
        kb.a(480);
        vd.e(69);
        ra.a(250);
        ja.a((byte) -113);
        pg.a((byte) -85);
        ni.a((byte) -35);
        ue.a(4);
        f.a(-663255224);
        ca.a((byte) 127);
        tl.b(80);
        vc.a(param0);
        ec.d(param0 ^ 10);
        jf.d(param0 ^ -14143);
        hi.a(0);
        ga.b(true);
        dd.a(false);
        ck.d((byte) 41);
        hf.o(-31141);
        ta.e((byte) 116);
        ng.a(2);
        bd.l(-10790);
        dg.h(param0 ^ -74);
        gl.a(1);
        pa.f((byte) -78);
        ua.a(72);
        cg.f(1);
        s.a(30235);
        qe.e((byte) 73);
        se.a(param0 ^ 87);
        h.a(-26526);
        lj.a();
        pj.a(param0 ^ -18178);
        e.a(-560430640);
        dj.a(52);
        lc.b(param0 + 91);
        bf.a((byte) -121);
        ei.d(0);
        ub.d(-126);
        fl.a(param0 ^ 31237);
        qi.d((byte) 77);
        wc.i(param0 + -21693);
        de.a(false);
        ed.a(3663);
        tf.g(-1);
        q.c(0);
        pc.a(120);
        il.b((byte) 38);
        cb.a(-1962269296);
        nb.a(-98);
        r.b(19017);
        rl.c((byte) -98);
        n.d((byte) -89);
        uh.a(param0 ^ -12908);
        ad.d(95);
        bl.a((byte) 114);
        aa.d((byte) -49);
        t.a(0);
        rc.b((byte) 112);
        dh.b((byte) -36);
        sc.a(178313985);
        nk.a(2);
        lb.c(640);
        cc.a((byte) 107);
        kf.b((byte) 110);
        ui.l(-22742);
        qa.a((byte) -31);
        mi.c(-3731);
        rb.d(-107);
        jl.c((byte) 126);
        ml.a(param0 + 107);
        pf.e(param0 ^ -26);
        rh.b((byte) -109);
        dl.a(param0 + 8996);
        gh.a(256);
        oc.a(-41);
        di.a(-1);
        hj.h(param0);
        mk.b((byte) 110);
        rd.c(true);
        p.g(param0);
        ai.g(50);
        fg.c(true);
        td.b((byte) 53);
        fk.a(-30530);
        sg.a(511);
        nc.a(param0);
        ((Main) this).field_H = null;
        ((Main) this).field_P = null;
        ((Main) this).field_I = null;
        ((Main) this).field_cb = null;
        ((Main) this).field_Z = null;
        ((Main) this).field_E = null;
        ((Main) this).field_t = null;
        ((Main) this).field_X = null;
    }

    final void b(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_40_0 = 0;
        java.awt.Canvas stackOut_5_0 = null;
        oe stackOut_3_0 = null;
        boolean stackOut_39_0 = false;
        int stackOut_37_0 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        boolean stackOut_12_2 = false;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        var6 = field_T;
        if (param0 == 59) {
          L0: {
            if (null == gj.field_a) {
              stackOut_5_0 = tb.field_c;
              stackIn_6_0 = (Object) (Object) stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = gj.field_a;
              stackIn_6_0 = (Object) (Object) stackOut_3_0;
              break L0;
            }
          }
          var7 = stackIn_6_0;
          var2 = var7;
          if (!th.a(true)) {
            if (!fg.field_k) {
              nl.a((java.awt.Canvas) var7, param0 + -164);
              return;
            } else {
              if (null != ra.field_d) {
                ug.a(100.0f, 113, tb.field_e);
                nl.a((java.awt.Canvas) var7, param0 + 34);
                return;
              } else {
                L1: {
                  vj.d();
                  if (ff.field_b == -1) {
                    if (-1 != dj.field_a) {
                      ((Main) this).field_E[dj.field_a].a(0, param0 ^ 59, 0);
                      break L1;
                    } else {
                      ((Main) this).b(0, param0 + -57);
                      break L1;
                    }
                  } else {
                    this.q((byte) -111);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (eh.d(19314)) {
                      vj.a(0, 0, vj.field_l, vj.field_g);
                      tc.a(param0 ^ -17180, pc.field_d, 26 - -cg.field_i.field_o, 1 + (23 + cg.field_i.field_p));
                      if (ff.field_b == 9) {
                        var3 = hb.field_d << 3;
                        var4 = qf.m(-32749);
                        var5 = v.g((byte) -111);
                        if (0 < var3) {
                          vj.a((-var4 + 640 >> 1) + -10, (480 + -var5 >> 1) + -10, 20 + var4, 20 + var5, 0, var3);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        kg.b((byte) 93);
                        ll.a(0, (byte) 115, (java.awt.Canvas) var7, 0);
                        break L2;
                      }
                    } else {
                      if (!ag.b(-128)) {
                        break L3;
                      } else {
                        L4: {
                          if (null == gj.field_a) {
                            stackOut_39_0 = r.field_q;
                            stackIn_40_0 = stackOut_39_0 ? 1 : 0;
                            break L4;
                          } else {
                            stackOut_37_0 = 1;
                            stackIn_40_0 = stackOut_37_0;
                            break L4;
                          }
                        }
                        bf.a(stackIn_40_0 != 0, (byte) -8);
                        break L3;
                      }
                    }
                  }
                  kg.b((byte) 93);
                  ll.a(0, (byte) 115, (java.awt.Canvas) var7, 0);
                  break L2;
                }
                return;
              }
            }
          } else {
            L5: {
              stackOut_7_0 = var7;
              stackOut_7_1 = 0;
              stackIn_12_0 = stackOut_7_0;
              stackIn_12_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (gj.field_a == null) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = r.field_q;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2 ? 1 : 0;
                break L5;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_13_2 = stackOut_10_2;
                break L5;
              }
            }
            jf.a((java.awt.Canvas) (Object) stackIn_13_0, stackIn_13_1 != 0, stackIn_13_2 != 0);
            return;
          }
        } else {
          return;
        }
    }

    private final int o(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (dl.field_h != 1) {
            break L0;
          } else {
            var2 = -5 + (jc.field_N - 31);
            if (var2 <= 0) {
              break L0;
            } else {
              if (var2 % 69 < 64) {
                var3 = var2 / 69;
                if (var3 < 6) {
                  var4 = -5 + ag.field_a + -196;
                  if (var4 <= 0) {
                    break L0;
                  } else {
                    if (var4 % 69 >= 64) {
                      break L0;
                    } else {
                      var5 = var4 / 69;
                      if (6 > var5) {
                        var6 = var3 * 6 + var5;
                        if (((Main) this).field_H[var6] == -1) {
                          break L0;
                        } else {
                          return var6;
                        }
                      } else {
                        return -1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    private final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        kc var3_ref_kc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        kc var10 = null;
        L0: {
          var8 = field_T;
          var3 = ff.field_b;
          if (9 == var3) {
            L1: {
              if (-1 != dj.field_a) {
                ((Main) this).field_E[dj.field_a].a(0, 0, 0);
                break L1;
              } else {
                ((Main) this).b(0, 2);
                break L1;
              }
            }
            var2 = hb.field_d << 3;
            if (0 >= var2) {
              break L0;
            } else {
              vj.a(0, 0, vj.field_l, vj.field_g, 0, var2);
              break L0;
            }
          } else {
            if (var3 == 1) {
              ((Main) this).b(0, 2);
              ((Main) this).field_E[rk.field_X].a(hb.field_d, 0, 0);
              break L0;
            } else {
              if (var3 != 2) {
                if (var3 != 5) {
                  if (var3 != 3) {
                    if (var3 != 7) {
                      if (var3 != 4) {
                        if (6 == var3) {
                          var3 = 24 * hb.field_d;
                          vj.g(0, 0, 640, var3);
                          ((Main) this).field_E[rk.field_X].a(0, 0, 0);
                          vj.g(0, var3, 640, 480);
                          ((Main) this).field_E[dj.field_a].a(0, 0, var3);
                          vj.a();
                          break L0;
                        } else {
                          if (var3 != 8) {
                            break L0;
                          } else {
                            ((Main) this).field_E[rk.field_X].a(0, 0, 0);
                            ((Main) this).field_E[dj.field_a].a(hb.field_d, 0, 0);
                            break L0;
                          }
                        }
                      } else {
                        L2: {
                          ((Main) this).b(0, 2);
                          if (rk.field_X != 7) {
                            break L2;
                          } else {
                            var3 = -hb.field_d + 68;
                            var4 = hb.field_d * 2;
                            var5 = 0;
                            L3: while (true) {
                              if (var5 >= 6) {
                                break L2;
                              } else {
                                var6 = -hb.field_d + 233;
                                var7 = 0;
                                L4: while (true) {
                                  if (6 <= var7) {
                                    var3 += 69;
                                    var5++;
                                    continue L3;
                                  } else {
                                    ((Main) this).field_I[0].b(var6, var3, var4, var4);
                                    var6 += 69;
                                    var7++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var10 = td.field_c[-5 + rk.field_X];
                        var3_ref_kc = var10;
                        var3_ref_kc.b(198 + hb.field_d * var10.field_p / 64, 33 + var10.field_o * hb.field_d / 64, var10.field_p * (-hb.field_d + 32) / 32, (-hb.field_d + 32) * var10.field_o / 32);
                        la.field_k.b(198 + (-hb.field_d + 32) * (-var10.field_p + 298) / 64 - -(var10.field_p / 2), 33 + (32 + -hb.field_d) * (-var10.field_o + 736) / 64 - -(var10.field_o / 2), (32 + -hb.field_d) * la.field_k.field_p / 32, (32 - hb.field_d) * la.field_k.field_o / 32);
                        break L0;
                      }
                    } else {
                      ((Main) this).field_E[rk.field_X].a(0, 0, 0);
                      td.field_c[-5 + dj.field_a].e(198, 33, -hb.field_d + 32 << 3);
                      la.field_k.b(347, 401);
                      break L0;
                    }
                  } else {
                    ((Main) this).b(0, 2);
                    var9 = td.field_c[-5 + rk.field_X];
                    var3_ref_kc = var9;
                    var3_ref_kc.b(198 - -((32 - hb.field_d) * var9.field_p / 64), 33 - -(var9.field_o * (-hb.field_d + 32) / 64), hb.field_d * var9.field_p / 32, var9.field_o * hb.field_d / 32);
                    la.field_k.b(var9.field_p / 2 + (-var9.field_p + 298) * hb.field_d / 64 + 198, 33 + ((-var9.field_o + 736) * hb.field_d / 64 + var9.field_o / 2), hb.field_d * la.field_k.field_p / 32, hb.field_d * la.field_k.field_o / 32);
                    break L0;
                  }
                } else {
                  ((Main) this).field_E[dj.field_a].a(0, 0, 0);
                  ((Main) this).field_E[rk.field_X].a(32 + -hb.field_d, 0, 0);
                  break L0;
                }
              } else {
                ((Main) this).b(0, 2);
                ((Main) this).field_E[rk.field_X].a(-hb.field_d + 32, 0, 0);
                break L0;
              }
            }
          }
        }
    }

    final static void l(byte param0) {
        w var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = field_T;
        try {
          L0: {
            var1 = na.field_r;
            L1: while (true) {
              if (!gl.b(true)) {
                L2: {
                  if (param0 > 75) {
                    break L2;
                  } else {
                    var4 = null;
                    Main.a((Object) null, (le) null, (byte) 100);
                    break L2;
                  }
                }
                break L0;
              } else {
                var1.h(8, 0);
                int fieldTemp$9 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$9;
                fl.a(var1, false);
                na.field_r.f(-var2 + var1.field_i, 8049);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "Main.AA(" + param0 + 41);
        }
    }

    private final static boolean a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        Object var5_ref = null;
        kf var5_ref_kf = null;
        int var5 = 0;
        int var6_int = 0;
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var5_ref = null;
        var8 = field_T;
        try {
          L0: {
            if (ad.field_q != ra.field_b) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                L2: {
                  var2_int = -64 % ((-32 - param0) / 49);
                  var3 = id.a(96);
                  if (qf.field_G == 0) {
                    break L2;
                  } else {
                    if (vd.field_u < 0) {
                      L3: {
                        var5_ref_kf = (kf) (Object) jl.field_e.a((byte) 74);
                        if (var5_ref_kf == null) {
                          break L3;
                        } else {
                          if (~var3 < ~var5_ref_kf.field_g) {
                            var5_ref_kf.c(119);
                            al.field_a = var5_ref_kf.field_i.length;
                            rd.field_j.field_i = 0;
                            var6_int = 0;
                            L4: while (true) {
                              if (~var6_int <= ~al.field_a) {
                                ni.field_d = hc.field_f;
                                hc.field_f = sb.field_a;
                                sb.field_a = pd.field_l;
                                pd.field_l = var5_ref_kf.field_h;
                                stackOut_18_0 = 1;
                                stackIn_19_0 = stackOut_18_0;
                                return stackIn_19_0 != 0;
                              } else {
                                rd.field_j.field_g[var6_int] = var5_ref_kf.field_i[var6_int];
                                var6_int++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_22_0 = 0;
                      stackIn_25_0 = stackOut_22_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_25_0 = stackOut_20_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_25_0 <= vd.field_u) {
                    break L6;
                  } else {
                    rd.field_j.field_i = 0;
                    if (r.a(1, (byte) 126)) {
                      vd.field_u = rd.field_j.g((byte) -35);
                      rd.field_j.field_i = 0;
                      al.field_a = param1[vd.field_u];
                      break L6;
                    } else {
                      return false;
                    }
                  }
                }
                if (!gl.a(false)) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  return stackIn_33_0 != 0;
                } else {
                  if (qf.field_G == 0) {
                    ni.field_d = hc.field_f;
                    hc.field_f = sb.field_a;
                    sb.field_a = pd.field_l;
                    pd.field_l = vd.field_u;
                    vd.field_u = -1;
                    stackOut_47_0 = 1;
                    stackIn_48_0 = stackOut_47_0;
                    break L0;
                  } else {
                    L7: {
                      var5 = qf.field_G;
                      if (k.field_a != 0.0) {
                        var5 = (int)((double)var5 + pg.field_a.nextGaussian() * k.field_a);
                        if (var5 < 0) {
                          var5 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var6 = new kf(var3 - -(long)var5, vd.field_u, new byte[al.field_a]);
                    var7 = 0;
                    L8: while (true) {
                      if (~al.field_a >= ~var7) {
                        jl.field_e.a((qb) (Object) var6, 27362);
                        vd.field_u = -1;
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        continue L5;
                      } else {
                        var6.field_i[var7] = rd.field_j.field_g[var7];
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("Main.HB(").append(param0).append(44);
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
        return stackIn_48_0 != 0;
    }

    public final void init() {
        ((Main) this).a(480, "36cardtrick", 10);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 == 11246) {
          L0: {
            L1: {
              hb.field_d = 0;
              ff.field_b = param2;
              rk.field_X = param1;
              this.p(-97283608);
              if (2 == param2) {
                break L1;
              } else {
                if (6 == param2) {
                  break L1;
                } else {
                  if (5 == param2) {
                    break L1;
                  } else {
                    if (param2 == 8) {
                      break L1;
                    } else {
                      if (param2 == 3) {
                        break L1;
                      } else {
                        if (param2 == 7) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((Main) this).field_E[param1].a(-31102, param3);
            ((Main) this).field_E[param1].b(param0 + -11139);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final int q(int param0) {
        int var2 = 44 % ((param0 - -67) / 39);
        return ((Main) this).field_Y >> 12 & 15;
    }

    private final void o(int param0) {
        int var2 = 0;
        byte[] var2_ref_byte__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        byte[] stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        byte[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        byte[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        byte[] stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackOut_89_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        byte[] stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        byte[] stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        byte[] stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        byte[] stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        L0: {
          var5 = field_T;
          ((Main) this).field_db = ((Main) this).field_db - 20;
          var2 = ((Main) this).field_U;
          if (var2 != 2) {
            if (var2 != 4) {
              if (var2 != 3) {
                if (var2 == 0) {
                  break L0;
                } else {
                  if (var2 != 1) {
                    break L0;
                  } else {
                    L1: {
                      var2 = this.o((byte) 30);
                      if (-1 == var2) {
                        L2: while (true) {
                          if (!ge.b((byte) -114)) {
                            break L1;
                          } else {
                            if (tb.field_d != 13) {
                              continue L2;
                            } else {
                              ((Main) this).a(11246, 1, 2, false);
                              rk.a(false, lc.field_a[2], false);
                              continue L2;
                            }
                          }
                        }
                      } else {
                        tk.field_a = tk.field_a + 1;
                        jl.field_h = jl.field_h + bc.field_a;
                        if (((Main) this).field_N != -1) {
                          if (~((Main) this).field_N != ~var2) {
                            L3: {
                              ((Main) this).field_A = var2;
                              ((Main) this).c(-1, 2);
                              ((Main) this).field_S = dh.field_m;
                              if (((Main) this).field_C != 0) {
                                break L3;
                              } else {
                                ((Main) this).field_R = dh.field_m;
                                break L3;
                              }
                            }
                            rc.a((byte) 111, 0);
                            if (((Main) this).field_H[((Main) this).field_A] == ((Main) this).field_H[((Main) this).field_N]) {
                              hk.a((byte) 127, 3, -lg.field_I[3] + 1000);
                              if (((Main) this).field_Q == 1) {
                                var3 = 10 - -sj.a(10999, 3, uh.field_l);
                                hk.a((byte) 124, var3, 1000);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              L4: {
                                var3 = 4 + sj.a(10999, 4, uh.field_l);
                                if (var3 >= rb.field_g) {
                                  var3++;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              L5: {
                                rb.field_g = var3;
                                if (((Main) this).field_J > 0) {
                                  hk.a((byte) 125, var3, 300);
                                  break L5;
                                } else {
                                  L6: {
                                    stackOut_89_0 = 124;
                                    stackIn_94_0 = stackOut_89_0;
                                    stackIn_90_0 = stackOut_89_0;
                                    if (1 != dg.field_J) {
                                      stackOut_94_0 = stackIn_94_0;
                                      stackOut_94_1 = 14;
                                      stackIn_95_0 = stackOut_94_0;
                                      stackIn_95_1 = stackOut_94_1;
                                      break L6;
                                    } else {
                                      stackOut_90_0 = stackIn_90_0;
                                      stackIn_92_0 = stackOut_90_0;
                                      stackOut_92_0 = stackIn_92_0;
                                      stackOut_92_1 = 13;
                                      stackIn_95_0 = stackOut_92_0;
                                      stackIn_95_1 = stackOut_92_1;
                                      break L6;
                                    }
                                  }
                                  hk.a((byte) stackIn_95_0, stackIn_95_1, 300);
                                  break L5;
                                }
                              }
                              hk.a((byte) 125, 0, 700);
                              break L1;
                            }
                          } else {
                            if (((Main) this).field_C != 0) {
                              break L1;
                            } else {
                              ((Main) this).field_N = -1;
                              rc.a((byte) 111, 2);
                              break L1;
                            }
                          }
                        } else {
                          ((Main) this).field_N = var2;
                          ((Main) this).field_R = dh.field_m;
                          if (0 != ((Main) this).field_C) {
                            rc.a((byte) 111, 0);
                            break L1;
                          } else {
                            rc.a((byte) 111, 1);
                            break L1;
                          }
                        }
                      }
                    }
                    if (2 > ec.field_f) {
                      break L0;
                    } else {
                      L7: {
                        ((Main) this).field_L = ge.field_c[66];
                        jf.field_n = jf.field_n | ((Main) this).field_L;
                        if (!ge.field_c[25]) {
                          break L7;
                        } else {
                          ((Main) this).field_db = 1000;
                          break L7;
                        }
                      }
                      if (!ge.field_c[51]) {
                        break L0;
                      } else {
                        ((Main) this).field_Q = 1;
                        jf.field_n = true;
                        var3 = 0;
                        L8: while (true) {
                          if (var3 >= ((Main) this).field_H.length) {
                            break L0;
                          } else {
                            L9: {
                              stackOut_119_0 = ((Main) this).field_H;
                              stackOut_119_1 = var3;
                              stackIn_124_0 = stackOut_119_0;
                              stackIn_124_1 = stackOut_119_1;
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              if (1 < var3) {
                                stackOut_124_0 = (byte[]) (Object) stackIn_124_0;
                                stackOut_124_1 = stackIn_124_1;
                                stackOut_124_2 = -1;
                                stackIn_125_0 = stackOut_124_0;
                                stackIn_125_1 = stackOut_124_1;
                                stackIn_125_2 = stackOut_124_2;
                                break L9;
                              } else {
                                stackOut_120_0 = (byte[]) (Object) stackIn_120_0;
                                stackOut_120_1 = stackIn_120_1;
                                stackIn_122_0 = stackOut_120_0;
                                stackIn_122_1 = stackOut_120_1;
                                stackOut_122_0 = (byte[]) (Object) stackIn_122_0;
                                stackOut_122_1 = stackIn_122_1;
                                stackOut_122_2 = 2;
                                stackIn_125_0 = stackOut_122_0;
                                stackIn_125_1 = stackOut_122_1;
                                stackIn_125_2 = stackOut_122_2;
                                break L9;
                              }
                            }
                            stackIn_125_0[stackIn_125_1] = (byte) stackIn_125_2;
                            var3++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            } else {
              if (0 < ((Main) this).field_J) {
                vf.field_b = vf.field_b - (tk.field_c * dg.field_J << 7);
                ((Main) this).field_J = ((Main) this).field_J - 1;
                ai.field_m = ai.field_m + dg.field_J;
                rj.field_p = rj.field_p + ((tk.field_c - -1) * dg.field_J << 7);
                af.field_ob = af.field_ob - (dg.field_J << 7);
                break L0;
              } else {
                if (0 >= ((Main) this).field_K) {
                  pb.a(ve.field_c, 13427);
                  ((Main) this).a(11246, 7, 3, false);
                  break L0;
                } else {
                  ((Main) this).field_K = ((Main) this).field_K - 1;
                  af.field_ob = af.field_ob - 512;
                  ai.field_m = ai.field_m + 2;
                  vf.field_b = vf.field_b - (tk.field_c << 9);
                  rj.field_p = rj.field_p + (tk.field_c << 9);
                  break L0;
                }
              }
            }
          } else {
            if (dh.field_m + -((Main) this).field_S < 1000L) {
              return;
            } else {
              L10: {
                if (((Main) this).field_H[((Main) this).field_N] == ((Main) this).field_H[((Main) this).field_A]) {
                  var6 = ((Main) this).field_H;
                  var2_ref_byte__ = var6;
                  var3 = ((Main) this).field_N;
                  ((Main) this).field_H[((Main) this).field_A] = (byte) -1;
                  var6[var3] = (byte) -1;
                  var4 = 4 + dg.field_J;
                  ai.field_m = ai.field_m + var4;
                  af.field_ob = af.field_ob - (var4 << 7);
                  rj.field_p = rj.field_p + (var4 << 7);
                  var4 = var4 * tk.field_c << 7;
                  bc.field_a = bc.field_a + 1;
                  vf.field_b = vf.field_b - var4;
                  ol.field_W = ol.field_W + tk.field_a;
                  rj.field_p = rj.field_p + var4;
                  int fieldTemp$2 = ((Main) this).field_Q - 1;
                  ((Main) this).field_Q = ((Main) this).field_Q - 1;
                  if (fieldTemp$2 != 0) {
                    if (((Main) this).field_Q > 1) {
                      ((Main) this).field_O = ((Main) this).field_O + 1;
                      if (((Main) this).field_O < 3) {
                        break L10;
                      } else {
                        if (((Main) this).field_O > 5) {
                          break L10;
                        } else {
                          if (!th.a(246 - ((Main) this).field_O, 1, 9 + ((Main) this).field_O)) {
                            break L10;
                          } else {
                            ((Main) this).field_X.a((qb) (Object) new hh(9 + ((Main) this).field_O), 27362);
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    vf.field_b = vf.field_b - (tk.field_c * 50 << 7);
                    af.field_ob = af.field_ob - 6400;
                    ai.field_m = ai.field_m + 50;
                    rj.field_p = rj.field_p + 6400;
                    rj.field_p = rj.field_p + (tk.field_c * 50 << 7);
                    ((Main) this).c(-117, 4);
                    return;
                  }
                } else {
                  ((Main) this).field_O = 0;
                  int fieldTemp$3 = ((Main) this).field_J - 1;
                  ((Main) this).field_J = ((Main) this).field_J - 1;
                  if (0 > fieldTemp$3) {
                    ((Main) this).c(-35, 0);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              if (((Main) this).field_U != 2) {
                break L0;
              } else {
                L11: {
                  ((Main) this).field_F = ((Main) this).field_F + ((Main) this).field_eb;
                  if (1 == ((Main) this).field_Q) {
                    break L11;
                  } else {
                    if (2 > ((Main) this).field_F) {
                      break L11;
                    } else {
                      this.d(true);
                      ((Main) this).field_z = dh.field_m;
                      ((Main) this).c(-14, 3);
                      break L0;
                    }
                  }
                }
                ((Main) this).c(-119, 1);
                break L0;
              }
            }
          }
        }
    }

    public Main() {
        ((Main) this).field_cb = null;
        ((Main) this).field_P = null;
        ((Main) this).field_D = 0;
        ((Main) this).field_L = false;
        ((Main) this).field_X = new bk();
        ((Main) this).field_B = 0;
        ((Main) this).field_O = 0;
        ((Main) this).field_C = 1;
        ((Main) this).field_U = 0;
        ((Main) this).field_Z = new String("0:00");
        ((Main) this).field_R = -1000L + dh.field_m;
        ((Main) this).field_N = -1;
        ((Main) this).field_A = -1;
        ((Main) this).field_S = -1000L + dh.field_m;
        ((Main) this).field_H = new byte[36];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
        field_y = "";
        field_M = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
