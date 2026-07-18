/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    private boolean field_U;
    boolean field_F;
    static db field_V;
    static he[] field_db;
    static java.applet.Applet field_K;
    private boolean field_ab;
    private boolean field_W;
    static String field_Y;
    private vd field_I;
    static int field_ib;
    static int field_e;
    private int field_r;
    private int field_P;
    int field_gb;
    double field_c;
    private int field_o;
    int field_A;
    private gf[] field_v;
    private ag field_M;
    double field_j;
    int field_H;
    int field_q;
    private ib[] field_d;
    int field_T;
    private gf[] field_m;
    mk field_G;
    private bf[] field_n;
    private int field_x;
    private int field_p;
    private td[] field_hb;
    private int[] field_t;
    private Random field_l;
    private boolean field_O;
    private int field_u;
    int field_w;
    private int field_bb;
    private int field_Z;
    private int field_s;
    private int field_Q;
    private td[] field_B;
    int field_L;
    private boolean field_a;
    double field_D;
    private int field_E;
    double field_N;
    int field_R;
    private int field_S;
    private int field_g;
    private int field_b;
    private int[] field_cb;
    private int field_f;
    private ck[] field_k;
    private int field_C;
    private int field_i;
    int field_X;
    private ck[] field_h;
    private boolean field_eb;
    private ag field_z;
    int field_fb;
    private boolean field_y;
    int field_J;

    private final void G(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gg var11_ref_gg = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double stackIn_5_0 = 0.0;
        gg stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        gg stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        gg stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        double stackOut_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        gg stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        gg stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        gg stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == 0) {
          L0: {
            var5 = (double)((j) this).field_G.field_h.length;
            var7 = var5 - 640.0;
            if (var7 <= (double)((j) this).field_J) {
              stackOut_4_0 = var7;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (double)((j) this).field_J;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var9 = (int)stackIn_5_0;
            var11 = ((j) this).field_q;
            if (0 == var11) {
              L2: {
                v.field_O.a(0, 0);
                var3 = oi.field_f.field_d;
                if (sd.field_e != 2) {
                  break L2;
                } else {
                  this.b((byte) -51);
                  break L2;
                }
              }
              L3: {
                var4 = (int)((double)(-var9 * (var3 + -640)) / var7);
                if (sd.field_e == 0) {
                  break L3;
                } else {
                  this.b((byte) 51, var4);
                  break L3;
                }
              }
              this.a((byte) 0, var4);
              oi.field_f.d(var4, 0);
              var3 = 2 * nj.field_o.field_d;
              nj.field_o.d((int)((double)((var3 - 640) * -var9) / var7), 0);
              nj.field_o.d((int)(-((double)(var9 * (-640 + var3)) / var7) + (double)(var3 / 2)), 0);
              break L1;
            } else {
              if (var11 != 1) {
                if (2 != var11) {
                  if (3 == var11) {
                    nb.field_b.a(0, 0);
                    var3 = 2 * hc.field_K[0].field_z;
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 2) {
                        be.b(sh.field_b, (int)((double)((-640 + var3) * -var9) / var7), 0);
                        break L1;
                      } else {
                        hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (var11 == 4) {
                        nb.field_b.a(0, 0);
                        var3 = hc.field_K[0].field_z * 2;
                        var10 = (int)((double)((-640 + var3) * -var9) / var7);
                        var2 = 0;
                        L6: while (true) {
                          if (var2 >= 2) {
                            sh.field_b.d(var10, 0);
                            if (sd.field_e != 2) {
                              break L5;
                            } else {
                              var2 = 0;
                              L7: while (true) {
                                if (var2 >= 75) {
                                  si.field_F.a(var10 - -300, 200, 256);
                                  break L1;
                                } else {
                                  var11 = wi.field_f[var2];
                                  var12 = wa.field_Q[var2] - var9 / md.field_c[var2];
                                  var13 = we.field_e[var2];
                                  var14 = jf.field_ib[var2];
                                  var15 = hh.field_a[var2];
                                  kl.field_R[var11].a(5, var13, var15, var14, var12);
                                  var2++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            hc.field_K[var2].a(var10, 0, 450);
                            var2++;
                            continue L6;
                          }
                        }
                      } else {
                        if (var11 != 5) {
                          if (var11 == 6) {
                            wj.f(0, 0, 640, 430, 7091712, 131328);
                            var3 = vi.field_g.field_d;
                            vi.field_g.a((int)((double)(-var9 * (var3 - 640)) / var7), 0, 128);
                            var3 = cc.field_w.field_d * 2;
                            cc.field_w.d((int)((double)((-640 + var3) * -var9) / var7), 0);
                            cc.field_w.d((int)(-((double)((-640 + var3) * var9) / var7) + (double)(var3 / 2)), 0);
                            break L1;
                          } else {
                            if (var11 != 7) {
                              if (var11 == 8) {
                                wj.f(0, 0, 640, 430, 27648, 512);
                                var3 = ha.field_b.field_d;
                                ha.field_b.a((int)((double)((var3 + -640) * -var9) / var7), 0, 128);
                                var3 = 2 * nf.field_v.field_d;
                                nf.field_v.a((int)((double)((var3 - 640) * -var9) / var7), 0);
                                nf.field_v.c((int)((double)(var3 / 2) - (double)((-640 + var3) * var9) / var7), 0);
                                break L5;
                              } else {
                                break L1;
                              }
                            } else {
                              wj.f(0, 0, 640, 430, 27648, 512);
                              var3 = gb.field_e.field_d;
                              gb.field_e.a((int)((double)(-var9 * (-640 + var3)) / var7), 0, 128);
                              var3 = b.field_k.field_d * 2;
                              b.field_k.d((int)((double)(-var9 * (var3 - 640)) / var7), 0);
                              b.field_k.d((int)(-((double)((var3 - 640) * var9) / var7) + (double)(var3 / 2)), 0);
                              break L1;
                            }
                          }
                        } else {
                          nb.field_b.a(0, 0);
                          var3 = 2 * hc.field_K[0].field_z;
                          var2 = 0;
                          L8: while (true) {
                            if (2 <= var2) {
                              be.a(sh.field_b, (int)((double)(-var9 * (var3 + -640)) / var7), 0);
                              break L1;
                            } else {
                              hc.field_K[var2].a((int)((double)((var3 - 640) * -var9) / var7), 0, 450);
                              var2++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } else {
                  L9: {
                    wj.f(0, 0, 640, 430, 258, 13932);
                    if (sd.field_e == 0) {
                      break L9;
                    } else {
                      if (0 > DrPhlogistonSavesTheEarth.field_K) {
                        break L9;
                      } else {
                        L10: {
                          var11_ref_gg = new gg(ib.field_a, ch.field_y, 70, 0.0, 1.0, 1.0, 1, 1.5, 0.99, 1);
                          var11_ref_gg.field_o = var9 >> 3;
                          var12 = DrPhlogistonSavesTheEarth.field_K * 128;
                          var13 = 64 * DrPhlogistonSavesTheEarth.field_K;
                          var13 = var13 >> 8;
                          var14 = 255 * DrPhlogistonSavesTheEarth.field_K;
                          var12 = var12 >> 8;
                          var13 = var13 << 8;
                          var14 = var14 >> 8;
                          var12 = var12 << 16;
                          stackOut_31_0 = (gg) var11_ref_gg;
                          stackOut_31_1 = -1093327740;
                          stackOut_31_2 = 16777215;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          stackIn_33_2 = stackOut_31_2;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          stackIn_32_2 = stackOut_31_2;
                          if (sd.field_e != 2) {
                            stackOut_33_0 = (gg) (Object) stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = stackIn_33_2;
                            stackOut_33_3 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            stackIn_34_2 = stackOut_33_2;
                            stackIn_34_3 = stackOut_33_3;
                            break L10;
                          } else {
                            stackOut_32_0 = (gg) (Object) stackIn_32_0;
                            stackOut_32_1 = stackIn_32_1;
                            stackOut_32_2 = stackIn_32_2;
                            stackOut_32_3 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_34_1 = stackOut_32_1;
                            stackIn_34_2 = stackOut_32_2;
                            stackIn_34_3 = stackOut_32_3;
                            break L10;
                          }
                        }
                        ((gg) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3 != 0, var14 | (var13 | var12));
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var3 = uk.field_h.field_d;
                    var4 = (int)((double)((var3 + -640) * -var9) / var7);
                    if (sd.field_e == 0) {
                      break L11;
                    } else {
                      this.b((byte) -105, var4);
                      break L11;
                    }
                  }
                  this.a((byte) 0, var4);
                  uk.field_h.d(var4, 0);
                  var3 = 2 * nj.field_o.field_d;
                  nj.field_o.d((int)((double)((var3 + -640) * -var9) / var7), 0);
                  nj.field_o.d((int)((double)(var3 / 2) - (double)((var3 - 640) * var9) / var7), 0);
                  break L1;
                }
              } else {
                L12: {
                  wj.f(0, 0, 640, 430, 262656, 11754240);
                  var3 = sg.field_e.field_d;
                  var4 = (int)((double)((var3 - 640) * -var9) / var7);
                  if (sd.field_e != 2) {
                    break L12;
                  } else {
                    this.b((byte) -101);
                    break L12;
                  }
                }
                L13: {
                  if (sd.field_e == 0) {
                    break L13;
                  } else {
                    this.b((byte) -120, var4);
                    break L13;
                  }
                }
                this.a((byte) 0, var4);
                sg.field_e.d(var4, 0);
                var3 = nj.field_o.field_d * 2;
                nj.field_o.d((int)((double)(-var9 * (-640 + var3)) / var7), 0);
                nj.field_o.d((int)((double)(var3 / 2) - (double)(var9 * (var3 + -640)) / var7), 0);
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void E(int param0) {
        L0: {
          L1: {
            L2: {
              ((j) this).field_D = ((j) this).field_D + ((j) this).field_j;
              ((j) this).field_N = ((j) this).field_N + ((j) this).field_c;
              if (!((j) this).field_U) {
                break L2;
              } else {
                if (0 < ((j) this).field_w) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (((j) this).field_G.field_h.length > ((j) this).field_J - -640) {
              break L1;
            } else {
              if (((j) this).field_eb) {
                break L1;
              } else {
                L3: {
                  if (!((j) this).field_ab) {
                    break L3;
                  } else {
                    if (150 <= gm.field_J) {
                      break L3;
                    } else {
                      break L0;
                    }
                  }
                }
                ((j) this).field_c = 5.0;
                break L0;
              }
            }
          }
          L4: {
            if (((j) this).field_D < 0.0) {
              ((j) this).field_j = 0.0;
              ((j) this).field_D = 0.0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((double)ri.field_e + ((j) this).field_D <= 430.0) {
              break L5;
            } else {
              ((j) this).field_j = 0.0;
              ((j) this).field_D = (double)(430 - ri.field_e);
              break L5;
            }
          }
          L6: {
            if (0.0 <= ((j) this).field_N) {
              break L6;
            } else {
              ((j) this).field_N = 0.0;
              ((j) this).field_c = 0.0;
              break L6;
            }
          }
          L7: {
            if (((j) this).field_N + (double)am.field_l <= 640.0) {
              break L7;
            } else {
              ((j) this).field_c = 0.0;
              ((j) this).field_N = (double)(-am.field_l + 640);
              break L7;
            }
          }
          ((j) this).field_j = ((j) this).field_j - ((j) this).field_j / 20.0;
          ((j) this).field_c = ((j) this).field_c - ((j) this).field_c / 20.0;
          break L0;
        }
        L8: {
          ((j) this).field_M.l(e.a(125, (int)((j) this).field_N));
          ((j) this).field_z.l(e.a(119, (int)((j) this).field_N));
          if (param0 == -8499) {
            break L8;
          } else {
            this.k(-18);
            break L8;
          }
        }
        L9: {
          if (((j) this).field_z.m()) {
            if (((j) this).field_z.f() != ((vk) (Object) ((j) this).field_z.field_i).field_i.length) {
              break L9;
            } else {
              ((j) this).field_z.i(-1);
              th.a(-27610, 32, e.a(105, (int)((j) this).field_N), nl.field_r[8]);
              break L9;
            }
          } else {
            break L9;
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        tc.field_d = hb.field_g <= 0 ? 11 : 0;
        if (ej.field_h != 0) {
            ek.a(-76, false, 9);
        } else {
            if (0 == ((j) this).field_H) {
                ek.a(-109, false, 0);
            } else {
                ek.a(-106, false, 2);
            }
        }
        if (param0 <= 35) {
            this.E(-104);
        }
        if (((j) this).C(31578)) {
            r.field_d = 5;
        }
        if (!(oh.a(0))) {
            bf.field_h = ((j) this).j((byte) -68);
        }
        for (var2 = 0; ~((j) this).field_n.length < ~var2; var2++) {
            if (null != ((j) this).field_n[var2]) {
                ((j) this).field_n[var2].a(7769);
            }
        }
    }

    public static void h(int param0) {
        field_db = null;
        field_V = null;
        if (param0 != 24342) {
            j.h(-24);
        }
        field_Y = null;
        field_K = null;
    }

    private final void c(bf param0) {
        RuntimeException runtimeException = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_s) {
                  break L1;
                } else {
                  if (0 <= ((j) this).field_fb) {
                    break L1;
                  } else {
                    L2: {
                      var3_double = ((j) this).field_c - param0.field_l;
                      var5 = -param0.field_j + ((j) this).field_j;
                      if (cj.field_c[param0.field_Q]) {
                        ((j) this).field_c = param0.field_l - var3_double;
                        ((j) this).field_j = -var5 + param0.field_j;
                        break L2;
                      } else {
                        ((j) this).field_c = -(var3_double / 2.0) + param0.field_l;
                        ((j) this).field_j = param0.field_j - var5 / 2.0;
                        break L2;
                      }
                    }
                    ((j) this).field_N = ((j) this).field_N + ((j) this).field_c;
                    ((j) this).field_D = ((j) this).field_D + ((j) this).field_j;
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("j.OB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -128 + ')');
        }
    }

    final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        if (param0 > 79) {
          L0: while (true) {
            if (((j) this).field_m.length <= var2) {
              var2 = 0;
              L1: while (true) {
                if (((j) this).field_v.length <= var2) {
                  var2 = 0;
                  L2: while (true) {
                    if (((j) this).field_d.length <= var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (((j) this).field_n.length <= var2) {
                          var2 = 0;
                          L4: while (true) {
                            if (((j) this).field_B.length <= var2) {
                              bc.field_d.c();
                              wj.c();
                              lb.field_C.a(119);
                              fc.field_a = 0;
                              ((j) this).field_b = 0;
                              bc.field_f = 0;
                              bg.field_k = 0;
                              ((j) this).field_U = false;
                              nf.field_u = 0;
                              ((j) this).field_J = 0;
                              dg.field_c = 0;
                              lh.field_m = 0;
                              ((j) this).field_Z = 0;
                              ((j) this).field_ab = false;
                              ((j) this).field_u = 0;
                              gi.field_f = 0;
                              ((j) this).field_S = 0;
                              hl.field_d = false;
                              cj.field_b = 0;
                              return;
                            } else {
                              ((j) this).field_B[var2] = null;
                              var2++;
                              continue L4;
                            }
                          }
                        } else {
                          L5: {
                            if (null == ((j) this).field_n[var2]) {
                              break L5;
                            } else {
                              ((j) this).field_n[var2].a(7769);
                              break L5;
                            }
                          }
                          ((j) this).field_n[var2] = null;
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      ((j) this).field_d[var2] = null;
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  ((j) this).field_v[var2] = null;
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((j) this).field_m[var2] = null;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void w(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 >= 18) {
            break L0;
          } else {
            field_ib = -47;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 160) {
            return;
          } else {
            if (null != ((j) this).field_d[var2]) {
              bc.field_f = bc.field_f | 1 << ((j) this).field_q;
              if (((j) this).field_d[var2].a((byte) -127)) {
                ((j) this).field_d[var2] = null;
                nf.field_u = nf.field_u | 1 << ((j) this).field_q;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, bf param3) {
        int var6_int = 0;
        td var7 = null;
        try {
            var6_int = this.l((byte) 105);
            var7 = new td(param3.field_w, param0, param1, param2);
            if (!(!param3.h(-83))) {
                pe.field_e = var7;
            }
            ((j) this).field_B[var6_int] = var7;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "j.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + -111 + ')');
        }
    }

    private final void x() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3801) {
            L1: {
              var3 = 0;
              if (null != cj.field_e) {
                var5 = 0;
                var2 = var5;
                L2: while (true) {
                  if (ck.field_j.length <= var5) {
                    break L1;
                  } else {
                    if (null != ck.field_j[var5]) {
                      ck.field_j[var5].a(true);
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            if (null != ((j) this).field_B[var2]) {
              ((j) this).field_B[var2].a(true);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void b(bf param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ((j) this).field_cb[param0.field_Q] = ((j) this).field_cb[param0.field_Q] + 1;
                var3_int = param0.field_Q;
                if (2 != var3_int) {
                  if (var3_int != 39) {
                    if (var3_int != 47) {
                      if (var3_int == 4) {
                        if (15 != ((j) this).field_cb[param0.field_Q]) {
                          break L1;
                        } else {
                          this.a(1, 254, (byte) -83);
                          break L1;
                        }
                      } else {
                        L3: {
                          if (var3_int != 14) {
                            if (var3_int == 13) {
                              break L3;
                            } else {
                              L4: {
                                if (var3_int != 12) {
                                  if (var3_int != 36) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                              if (((j) this).field_cb[36] + ((j) this).field_cb[12] == 15) {
                                this.a(3, 252, (byte) -77);
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        if (((j) this).field_cb[14] - -((j) this).field_cb[13] == 15) {
                          this.a(2, 253, (byte) -127);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (((j) this).field_cb[47] + (((j) this).field_cb[2] + ((j) this).field_cb[39]) != 15) {
                break L1;
              } else {
                this.a(0, 255, (byte) -123);
                break L1;
              }
            }
            L5: {
              if (param1 >= 39) {
                break L5;
              } else {
                ((j) this).field_L = 106;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("j.SA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_24_1 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_20_0 = false;
        boolean stackOut_23_0 = false;
        int stackOut_23_1 = 0;
        boolean stackOut_21_0 = false;
        boolean stackOut_22_0 = false;
        int stackOut_22_1 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((j) this).field_eb) {
          L0: {
            ((j) this).field_w = ((j) this).field_w - 1;
            ((j) this).a(255, 0);
            gi.a(((j) this).field_M, 3408);
            if (((j) this).field_q >= 0) {
              fc.field_a = fc.field_a | 1 << ((j) this).field_q;
              gi.field_f = gi.field_f | 1 << ((j) this).field_q;
              break L0;
            } else {
              break L0;
            }
          }
          ((j) this).field_fb = 225;
          L1: while (true) {
            if (((j) this).field_L <= 1) {
              L2: while (true) {
                if (((j) this).field_A <= 1) {
                  L3: {
                    ((j) this).field_u = 0;
                    ((j) this).field_S = 0;
                    var2 = e.a(110, (int)((j) this).field_N);
                    if (((j) this).field_w > 0) {
                      this.a(9, ri.field_q + (int)((j) this).field_D, -1, (int)((j) this).field_N - -am.field_p, 27396);
                      ((j) this).field_z.j(64);
                      od.a(-1630758008, ((j) this).field_z);
                      break L3;
                    } else {
                      tc.field_i = false;
                      var3 = 0;
                      L4: while (true) {
                        if (var3 >= ((j) this).field_n.length) {
                          sc.a(-1, false, dm.field_x);
                          ((j) this).field_eb = true;
                          th.a(-27610, 64, var2, nl.field_r[9]);
                          this.o(126);
                          ((j) this).field_s = ((j) this).field_J;
                          break L3;
                        } else {
                          if (((j) this).field_n[var3] != null) {
                            if (!((j) this).field_n[var3].field_s) {
                              L5: {
                                L6: {
                                  var4 = ((j) this).field_n[var3].field_Q;
                                  stackOut_17_0 = tc.field_i;
                                  stackIn_22_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var4 == 5) {
                                    break L6;
                                  } else {
                                    stackOut_18_0 = stackIn_18_0;
                                    stackIn_22_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (var4 == 11) {
                                      break L6;
                                    } else {
                                      stackOut_19_0 = stackIn_19_0;
                                      stackIn_22_0 = stackOut_19_0;
                                      stackIn_20_0 = stackOut_19_0;
                                      if (var4 == 17) {
                                        break L6;
                                      } else {
                                        stackOut_20_0 = stackIn_20_0;
                                        stackIn_23_0 = stackOut_20_0;
                                        stackIn_21_0 = stackOut_20_0;
                                        if (var4 != 18) {
                                          stackOut_23_0 = stackIn_23_0;
                                          stackOut_23_1 = 0;
                                          stackIn_24_0 = stackOut_23_0;
                                          stackIn_24_1 = stackOut_23_1;
                                          break L5;
                                        } else {
                                          stackOut_21_0 = stackIn_21_0;
                                          stackIn_22_0 = stackOut_21_0;
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_22_0 = stackIn_22_0;
                                stackOut_22_1 = 1;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_24_1 = stackOut_22_1;
                                break L5;
                              }
                              tc.field_i = stackIn_24_0 | stackIn_24_1 != 0;
                              var3++;
                              continue L4;
                            } else {
                              var3++;
                              continue L4;
                            }
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((j) this).field_d[this.f(0)] = new ib(((j) this).field_N, ((j) this).field_D, 1, true, false);
                  ((j) this).field_A = ((j) this).field_A - 1;
                  continue L2;
                }
              }
            } else {
              ((j) this).field_d[this.f(qk.a(-6111, -6111))] = new ib(((j) this).field_N, ((j) this).field_D, 7, true, false);
              ((j) this).field_L = ((j) this).field_L - 1;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    private final void g(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11_int = 0;
        jb var11 = null;
        int var12_int = 0;
        nh var12 = null;
        double var13 = 0.0;
        int var13_int = 0;
        int var15_int = 0;
        Runtime var15 = null;
        int var16 = 0;
        int var17 = 0;
        he stackIn_14_0 = null;
        he stackIn_15_0 = null;
        he stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        he stackOut_13_0 = null;
        he stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        he stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ea.field_c.a(0, 0);
        var2 = (double)((j) this).field_gb / 256.0 * 3.141592653589793;
        var4 = 89;
        var5 = 464;
        var6 = var4 + -(int)(pj.a(var2, param0 + 35407) * 27.0);
        var7 = -(int)(27.0 * ji.a(65535, var2)) + var5;
        var8 = -1;
        L0: while (true) {
          if (var8 > 1) {
            wj.b(89, 464, 3, 16711680);
            var8 = ((j) this).field_H;
            var9 = -1;
            L1: while (true) {
              if (0 == var8) {
                L2: {
                  if (var9 >= 6) {
                    break L2;
                  } else {
                    var9 = 6;
                    break L2;
                  }
                }
                var10_int = 0;
                L3: while (true) {
                  if (var9 < var10_int) {
                    L4: {
                      pi.field_S[((j) this).field_L].e(161, 438);
                      if (((j) this).field_w >= 0) {
                        pi.field_S[((j) this).field_w].e(383, 438);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      dh.field_R[ah.field_J].a(408, 429);
                      wj.b(((j) this).field_t);
                      wj.f(400, 425, 515, 475);
                      if (((j) this).field_J - pa.field_c > 10) {
                        dh.field_R[ib.field_t].a(408, 429);
                        break L5;
                      } else {
                        dh.field_R[ib.field_t].a(408, -((-pa.field_c + ((j) this).field_J) * 5) + 479);
                        break L5;
                      }
                    }
                    L6: {
                      wj.a(((j) this).field_t);
                      var10 = "x" + ((j) this).field_A;
                      var11 = cb.field_b;
                      var12 = new nh(var11.b(var10), var11.field_x - -var11.field_S);
                      var12.c();
                      if (param0 == -2639) {
                        break L6;
                      } else {
                        ((j) this).field_T = -118;
                        break L6;
                      }
                    }
                    L7: {
                      var11.c(var10, 0, var11.field_x, 16777215, -1);
                      lb.field_C.a(116);
                      var12.b(-(var12.field_y / 2) + 503, var12.field_w / 2 + 443);
                      if (((j) this).field_Z > 0) {
                        L8: {
                          if (((j) this).field_Z % 20 < 10) {
                            stackOut_29_0 = 16711680;
                            stackIn_30_0 = stackOut_29_0;
                            break L8;
                          } else {
                            stackOut_28_0 = 0;
                            stackIn_30_0 = stackOut_28_0;
                            break L8;
                          }
                        }
                        var13_int = stackIn_30_0;
                        cb.field_b.a(na.field_b, 620, cb.field_b.field_x - -10, var13_int, 0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var4 = 551;
                    var5 = 464;
                    var13 = (double)((j) this).field_u / 200.0 * 3.141592653589793;
                    var6 = -(int)(27.0 * pj.a(var13, 32768)) + var4;
                    var7 = -(int)(ji.a(param0 + 68174, var13) * 27.0) + var5;
                    var15_int = -1;
                    L9: while (true) {
                      if (var15_int > 1) {
                        L10: {
                          wj.b(89, 464, 3, 16711680);
                          if (((j) this).field_F) {
                            ji.field_d.b("lvl: " + Integer.toString(((j) this).field_q) + "; fps: " + pc.field_a, 112, 32, 65280, 65280);
                            ji.field_d.a("Bonus: " + ((j) this).field_R, 630, 32, 16777215, 16777215);
                            var15 = Runtime.getRuntime();
                            var16 = (int)(var15.totalMemory() - var15.freeMemory()) >> 20;
                            ji.field_d.b(Integer.toString(var16), 330, 35, 16711680, 16711680);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      } else {
                        var16 = -1;
                        L11: while (true) {
                          if (var16 > 1) {
                            var15_int++;
                            continue L9;
                          } else {
                            wj.g(var4 - -var16, var5 - -var15_int, var6, var7, 16711680);
                            var16++;
                            continue L11;
                          }
                        }
                      }
                    }
                  } else {
                    L12: {
                      var11_int = (int)(Math.floor((double)((j) this).field_H / Math.pow(10.0, (double)(var10_int + 1))) * Math.pow(10.0, (double)(1 + var10_int)));
                      var12_int = (int)Math.floor((double)(-var11_int + ((j) this).field_H) / Math.pow(10.0, (double)var10_int));
                      stackOut_13_0 = pi.field_S[var12_int];
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var9 == 6) {
                        stackOut_15_0 = (he) (Object) stackIn_15_0;
                        stackOut_15_1 = 21;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L12;
                      } else {
                        stackOut_14_0 = (he) (Object) stackIn_14_0;
                        stackOut_14_1 = 18;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L12;
                      }
                    }
                    ((he) (Object) stackIn_16_0).e(-(stackIn_16_1 * var10_int) + 320, 438);
                    var10_int++;
                    continue L3;
                  }
                }
              } else {
                var9++;
                var8 = var8 / 10;
                continue L1;
              }
            }
          } else {
            var9 = -1;
            L13: while (true) {
              if (var9 > 1) {
                var8++;
                continue L0;
              } else {
                wj.g(var4 - -var9, var8 + var5, var6, var7, 16711680);
                var9++;
                continue L13;
              }
            }
          }
        }
    }

    private final void i(int param0) {
        if (!(sd.field_e == 2)) {
            return;
        }
        if (param0 != 215) {
            this.w(45);
        }
        if (!((((j) this).field_J & 1) != 0)) {
            return;
        }
        int discarded$0 = 1;
        bc.field_d = gm.a(bc.field_d, 65280, (-8096 + ((j) this).field_J) / 20, q.field_f, 16711680);
    }

    private final void p() {
        int var2_int = 0;
        gg var2 = null;
        int var3 = 0;
        gg stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        gg stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        gg stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        gg stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        gg stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        gg stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 1400) {
            L1: {
              if (!((j) this).field_a) {
                break L1;
              } else {
                L2: {
                  var2 = new gg((int)((double)am.field_p + ((j) this).field_N), (int)((double)ri.field_q + ((j) this).field_D), 15, 0.0, 6.283185307179586, 1.5707963267948966, 3, 1.9, 0.92, ((j) this).field_J >> 1);
                  stackOut_6_0 = (gg) var2;
                  stackOut_6_1 = -1093327740;
                  stackOut_6_2 = 16777215;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  if (sd.field_e != 2) {
                    stackOut_8_0 = (gg) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    break L2;
                  } else {
                    stackOut_7_0 = (gg) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    break L2;
                  }
                }
                ((gg) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0, 8405247);
                ((j) this).field_a = false;
                break L1;
              }
            }
            return;
          } else {
            if (((j) this).field_m[var2_int] != null) {
              ((j) this).field_m[var2_int].c((byte) 119);
              var2_int++;
              continue L0;
            } else {
              var2_int++;
              continue L0;
            }
          }
        }
    }

    private final void B() {
        he var2 = null;
        he[] var3_ref_he__ = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int[] stackIn_15_4 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int[] stackOut_14_4 = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int[] stackOut_13_4 = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (0 < ((j) this).field_fb) {
            var3_ref_he__ = ii.field_b;
            var2 = var3_ref_he__[(-1 + var3_ref_he__.length) * (225 - ((j) this).field_fb) / 225];
            wj.d(0, 0, 640, 430, 16777215, ((j) this).field_fb * 255 / 225);
            var2.a(-var2.field_a + (int)((j) this).field_N, -var2.field_f + (int)((j) this).field_D, (225 - ((j) this).field_fb) * 256 / 225);
            break L0;
          } else {
            var2 = kh.field_e;
            if (!((j) this).field_y) {
              var2.a(-var2.field_a + (int)((j) this).field_N, (int)((j) this).field_D + -var2.field_f);
              break L0;
            } else {
              var2.c(-var2.field_a + (int)((j) this).field_N, (int)((j) this).field_D + -var2.field_f, 128, ((j) this).field_r);
              ((j) this).field_y = false;
              break L0;
            }
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((j) this).field_h.length) {
            L2: {
              if (!((j) this).field_eb) {
                break L2;
              } else {
                if (null != ((j) this).field_k) {
                  var5 = 0;
                  var3 = var5;
                  L3: while (true) {
                    if (var5 >= ((j) this).field_k.length) {
                      break L2;
                    } else {
                      ((j) this).field_k[var5].c(-1);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            le.field_c = var2;
            return;
          } else {
            ((j) this).field_h[var3].c(-1);
            if (((j) this).field_u > 0) {
              L4: {
                stackOut_9_0 = (int)((double)am.field_l + ((j) this).field_N) << 4;
                stackOut_9_1 = (int)(((j) this).field_D + (double)ri.field_q) << 4;
                stackOut_9_2 = 256;
                stackOut_9_3 = ((j) this).field_u;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                if (50 < ((j) this).field_u) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = stackIn_11_3;
                  stackOut_11_4 = 2;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  stackIn_12_4 = stackOut_11_4;
                  break L4;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = stackIn_10_3;
                  stackOut_10_4 = 4;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_12_4 = stackOut_10_4;
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = stackIn_12_3 / stackIn_12_4;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                if (50 >= ((j) this).field_u) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = uh.field_j;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L5;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = uh.field_l;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  break L5;
                }
              }
              wj.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void q() {
        int var2 = 0;
        ib var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (200 > ((j) this).field_fb) {
              break L1;
            } else {
              if (gm.field_J <= 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((j) this).field_w <= 0) {
              break L2;
            } else {
              var2 = 0;
              L3: while (true) {
                if (160 <= var2) {
                  break L2;
                } else {
                  L4: {
                    var3 = ((j) this).field_d[var2];
                    if (var3 != null) {
                      if (!ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.field_n, (int)var3.field_d, (int)var3.field_k)) {
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            var4 = var3.field_g;
                            if (4 != var4) {
                              if (var4 != 5) {
                                if (var4 != 6) {
                                  if (7 == var4) {
                                    ((j) this).field_L = ((j) this).field_L + 1;
                                    break L5;
                                  } else {
                                    if (3 == var4) {
                                      ((j) this).field_w = ((j) this).field_w + 1;
                                      if (9 < ((j) this).field_w) {
                                        ((j) this).field_w = 9;
                                        break L5;
                                      } else {
                                        ((j) this).a(((j) this).field_gb, 0);
                                        ((j) this).field_d[var2] = null;
                                        bg.field_k = bg.field_k | 1 << ((j) this).field_q;
                                        int discarded$2 = -1321705304;
                                        ah.a(nl.field_r[70], e.a(118, (int)((j) this).field_N));
                                        var2++;
                                        continue L3;
                                      }
                                    } else {
                                      if (var4 != 2) {
                                        if (var4 != 1) {
                                          break L5;
                                        } else {
                                          ((j) this).field_A = ((j) this).field_A + 1;
                                          break L5;
                                        }
                                      } else {
                                        ((j) this).a(((j) this).field_gb - -64, 0);
                                        break L5;
                                      }
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          this.d((byte) -90, var3.field_m);
                          break L5;
                        }
                        ((j) this).a(((j) this).field_gb, 0);
                        ((j) this).field_d[var2] = null;
                        bg.field_k = bg.field_k | 1 << ((j) this).field_q;
                        int discarded$3 = -1321705304;
                        ah.a(nl.field_r[70], e.a(118, (int)((j) this).field_N));
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L3;
                }
              }
            }
          }
          break L0;
        }
    }

    final void r(int param0) {
        double var2 = 0.0;
        nh var2_ref_nh = null;
        int var2_int = 0;
        bf var2_ref_bf = null;
        bf var3 = null;
        int var4 = 0;
        bf var5 = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -67) {
            break L0;
          } else {
            this.a((byte) 58);
            break L0;
          }
        }
        L1: {
          if (qe.field_a == -150) {
            System.gc();
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (~ab.field_b == ~((j) this).field_q) {
            break L2;
          } else {
            int discarded$13 = 111;
            this.c();
            break L2;
          }
        }
        L3: {
          L4: {
            if (null == ((j) this).field_I.h(-11151)) {
              break L4;
            } else {
              int fieldTemp$14 = ((j) this).field_bb + 1;
              ((j) this).field_bb = ((j) this).field_bb + 1;
              if (fieldTemp$14 != 335) {
                break L4;
              } else {
                ((j) this).field_bb = 0;
                gi discarded$15 = ((j) this).field_I.d(180479896);
                break L3;
              }
            }
          }
          break L3;
        }
        L5: while (true) {
          if (!th.a(-114)) {
            L6: {
              L7: {
                this.E(-8499);
                int discarded$16 = -1;
                this.i();
                this.A(1052688);
                int discarded$17 = 0;
                this.I();
                if (qe.field_a <= 0) {
                  L8: {
                    if (qe.field_a == -150) {
                      this.b(116);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var2 = -((double)qe.field_a / -150.0) + 1.0;
                  qe.field_a = qe.field_a + 1;
                  ((j) this).field_N = (double)(-am.field_l) + (double)(275 - -am.field_l) * var2;
                  if (!ck.field_f[83]) {
                    break L7;
                  } else {
                    qe.field_a = qe.field_a + 10;
                    break L6;
                  }
                } else {
                  L9: {
                    int discarded$18 = 215;
                    this.z();
                    this.b(114);
                    this.a(true);
                    this.w(19);
                    this.k(0);
                    this.i(215);
                    int discarded$19 = 0;
                    this.a();
                    int discarded$20 = 114;
                    this.q();
                    if (gm.field_J == 0) {
                      this.c(-6718);
                      int discarded$21 = 1;
                      this.b();
                      if (((j) this).field_eb) {
                        break L9;
                      } else {
                        int discarded$22 = 123;
                        this.k();
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    int discarded$23 = -125;
                    this.F();
                    ((j) this).field_fb = ((j) this).field_fb - 1;
                    if (((j) this).field_fb > 0) {
                      this.a(11, (int)((j) this).field_D - -hi.a(ri.field_e, 4, ((j) this).field_l), -1, (int)((j) this).field_N - -hi.a(am.field_l, 4, ((j) this).field_l), 27396);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  ((j) this).field_Z = ((j) this).field_Z - 1;
                  if (!this.n(115)) {
                    L11: {
                      if (!((j) this).field_U) {
                        break L11;
                      } else {
                        if (!((j) this).field_ab) {
                          ((j) this).field_J = ((j) this).field_J + 1;
                          ((j) this).field_l.setSeed((long)(((j) this).field_J + (((j) this).field_q << 16)));
                          var2_int = ((j) this).field_q;
                          if (var2_int != 2) {
                            if (var2_int != 5) {
                              if (var2_int == 8) {
                                if (0 != ((j) this).field_J % vc.field_b[0].field_d) {
                                  break L7;
                                } else {
                                  var2_ref_bf = ((j) this).a(0, true, 31, ((j) this).field_J, 0, true);
                                  var2_ref_bf.field_N = (double)(430 + -var2_ref_bf.b((byte) 55).field_c);
                                  var2_ref_bf.field_o = 640.0;
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          } else {
                            if (((j) this).field_J % 298 != 0) {
                              break L7;
                            } else {
                              L12: {
                                var2_int = hi.a(9, 4, ((j) this).field_l) + 19;
                                if (var2_int >= 21) {
                                  var2_int += 2;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var3 = ((j) this).a(0, true, var2_int, ((j) this).field_J, 0, true);
                              var3.field_H = 1;
                              boolean discarded$24 = var3.a(2, 10);
                              var3.field_N = (double)(-var3.b((byte) 55).field_c + 430);
                              var3.field_o = 640.0;
                              break L6;
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var2_int = 0;
                    L13: while (true) {
                      if (var2_int >= 1600) {
                        int discarded$25 = 1;
                        this.H();
                        break L6;
                      } else {
                        L14: {
                          var5 = ((j) this).field_n[var2_int];
                          var3 = var5;
                          var3 = var5;
                          var3 = var5;
                          if (var3 == null) {
                            break L14;
                          } else {
                            L15: {
                              if (var3.a(false)) {
                                break L15;
                              } else {
                                if (wh.field_v[var5.field_Q]) {
                                  break L15;
                                } else {
                                  if (0 < var3.field_H) {
                                    this.a(119, (gf) null, var3);
                                    ((j) this).field_n[var2_int].a(7769);
                                    ((j) this).field_n[var2_int] = null;
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            if (!cj.field_c[var5.field_Q]) {
                              break L14;
                            } else {
                              var3.field_o = var3.field_o + 1.0;
                              break L14;
                            }
                          }
                        }
                        var2_int++;
                        continue L13;
                      }
                    }
                  } else {
                    ((j) this).field_J = ((j) this).field_J + 1;
                    ((j) this).field_l.setSeed((long)(((j) this).field_J + (((j) this).field_q << 16)));
                    break L6;
                  }
                }
              }
              break L6;
            }
            return;
          } else {
            L16: {
              if (150 >= gm.field_J) {
                break L16;
              } else {
                gm.field_J = 500;
                break L16;
              }
            }
            if (di.field_c == 13) {
              L17: {
                if (null == rh.field_b) {
                  rh.field_b = be.b();
                  break L17;
                } else {
                  var2_ref_nh = rh.field_b;
                  kg.a(wj.field_l, 0, var2_ref_nh.field_B, 0, var2_ref_nh.field_B.length);
                  break L17;
                }
              }
              rh.field_b.c();
              be.a(0, 0, 640, 480, 22070844, 255);
              lb.field_C.a(117);
              ek.a(-78, false, 1);
              return;
            } else {
              continue L5;
            }
          }
        }
    }

    private final void k() {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 1600) {
            var2 = 0;
            return;
          } else {
            var3 = ((j) this).field_n[var2];
            if (var3 != null) {
              if (var3.m(-117)) {
                L1: {
                  if (ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.b((byte) 55), (int)var3.field_o, (int)var3.field_N)) {
                    break L1;
                  } else {
                    if (var3.field_D != null) {
                      if (ne.a(le.field_c, (int)((j) this).field_N, (int)((j) this).field_D, var3.field_D, var3.field_d, var3.field_p)) {
                        break L1;
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
                L2: {
                  if (var3.field_s) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_13_0 = var3.a(16, 10);
                    stackIn_15_0 = stackOut_13_0 ? 1 : 0;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var4 = stackIn_15_0;
                    if (var3.field_Q == 6) {
                      break L4;
                    } else {
                      if (var3.field_Q == 37) {
                        break L4;
                      } else {
                        if (wh.field_v[var3.field_Q]) {
                          ((j) this).a(((j) this).field_gb - 8, 0);
                          break L3;
                        } else {
                          L5: {
                            if (!var3.field_s) {
                              stackOut_20_0 = 16;
                              stackIn_21_0 = stackOut_20_0;
                              break L5;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L5;
                            }
                          }
                          var5 = stackIn_21_0;
                          ((j) this).a(-var5 + ((j) this).field_gb, 0);
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = 1;
                  ((j) this).a(-100 + ((j) this).field_gb, 0);
                  break L3;
                }
                if (var4 != 0) {
                  L6: {
                    this.b(var3, 122);
                    this.d((byte) -82, wh.field_x[var3.field_Q]);
                    if (var3.a(false)) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    this.a(114, (gf) null, var3);
                    if (th.field_d[var3.field_Q]) {
                      break L7;
                    } else {
                      ((j) this).field_n[var2].a(7769);
                      ((j) this).field_n[var2] = null;
                      break L7;
                    }
                  }
                  if (var3.h(40)) {
                    int discarded$2 = 0;
                    this.a(var3);
                    var2++;
                    continue L0;
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  int discarded$3 = -128;
                  this.c(var3);
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

    private final void o(int param0) {
        int var2 = 0;
        L0: {
          if ((lh.field_m >> ((j) this).field_q & 1) != 0) {
            break L0;
          } else {
            if (((j) this).field_w <= 0) {
              break L0;
            } else {
              this.a(4, 251, (byte) -95);
              break L0;
            }
          }
        }
        L1: {
          if (0 == (gi.field_f >> ((j) this).field_q & 1)) {
            this.a(5, 250, (byte) -116);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (0 == (1 & fc.field_a >> ((j) this).field_q)) {
            this.a(6, 249, (byte) -99);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = 125 / ((param0 - 82) / 34);
          if ((1 & bc.field_f >> ((j) this).field_q) == 0) {
            if ((bc.field_f >> ((j) this).field_q & 1) == 0) {
              break L3;
            } else {
              if (0 == (1 & bg.field_k >> ((j) this).field_q)) {
                if (((j) this).field_w <= 0) {
                  break L3;
                } else {
                  this.a(8, 247, (byte) -90);
                  break L3;
                }
              } else {
                if ((bc.field_f >> ((j) this).field_q & 1) == 0) {
                  break L3;
                } else {
                  if (0 != (1 & bg.field_k >> ((j) this).field_q)) {
                    break L3;
                  } else {
                    if (((j) this).field_w <= 0) {
                      break L3;
                    } else {
                      this.a(8, 247, (byte) -90);
                      break L3;
                    }
                  }
                }
              }
            }
          } else {
            if ((bc.field_f >> ((j) this).field_q & 1) == 0) {
              break L3;
            } else {
              if (0 != (1 & bg.field_k >> ((j) this).field_q)) {
                break L3;
              } else {
                if (((j) this).field_w <= 0) {
                  break L3;
                } else {
                  this.a(8, 247, (byte) -90);
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if ((1 & cj.field_b >> ((j) this).field_q) != 0) {
            break L4;
          } else {
            if (0 >= ((j) this).field_w) {
              break L4;
            } else {
              this.a(9, 246, (byte) -99);
              break L4;
            }
          }
        }
        L5: {
          if (2 != ((j) this).field_q) {
            if (((j) this).field_q != 5) {
              break L5;
            } else {
              if (((j) this).field_w <= 0) {
                break L5;
              } else {
                this.a(11, 244, (byte) -81);
                break L5;
              }
            }
          } else {
            if (((j) this).field_q != 5) {
              break L5;
            } else {
              if (((j) this).field_w <= 0) {
                break L5;
              } else {
                this.a(11, 244, (byte) -81);
                break L5;
              }
            }
          }
        }
        L6: {
          if (8 != ((j) this).field_q) {
            break L6;
          } else {
            if (((j) this).field_w > 0) {
              this.a(12, 243, (byte) -94);
              if (hc.field_G == 2) {
                this.a(14, 241, (byte) -112);
                break L6;
              } else {
                break L6;
              }
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (0 != (dg.field_c >> ((j) this).field_q & 1)) {
            break L7;
          } else {
            if (2 < ((j) this).field_q) {
              break L7;
            } else {
              if (((j) this).field_w > 0) {
                this.a(13, 242, (byte) -96);
                break L7;
              } else {
                break L7;
              }
            }
          }
        }
    }

    private final int j() {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = 0; ((j) this).field_n[var2] != null; var2++) {
        }
        return var2;
    }

    final bg j(byte param0) {
        if (0 < ((j) this).field_H) {
            if (!(((j) this).field_W)) {
                int discarded$0 = 21;
                return vg.a(true, ((j) this).field_f, ((j) this).field_x, 3, ((j) this).field_i, 65514, ((j) this).field_g, new int[1]);
            }
        }
        if (param0 == -68) {
            return null;
        }
        return null;
    }

    private final void b(byte param0, int param1) {
        q.field_e.c(0, 0, 1907987);
        int var3 = -87 / ((-57 - param0) / 40);
        if (nd.field_M >= 0) {
            q.field_e.e(0, 0, nd.field_M);
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 0) {
            this.A(-84);
        }
        if (-1 < ((j) this).field_fb) {
            if (-1 <= ((j) this).field_q) {
                if (!(param0 >= ((j) this).field_gb)) {
                    gi.field_f = gi.field_f | 1 << ((j) this).field_q;
                }
            }
            ((j) this).field_y = true;
            ((j) this).field_gb = param0;
            if (!(255 >= ((j) this).field_gb)) {
                ((j) this).field_gb = 255;
            }
            if (((j) this).field_gb < 0) {
                int discarded$1 = -6111;
                this.d();
            } else {
                ((j) this).field_r = oj.field_e[((j) this).field_gb];
            }
        }
    }

    private final void F() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((j) this).field_eb) {
            ((j) this).field_M.j(0);
            ((j) this).field_u = 0;
            var2 = -((j) this).field_s + ((j) this).field_J;
            if (var2 > 300) {
              ((j) this).s(87);
              ((j) this).d((byte) 76);
              break L0;
            } else {
              L1: {
                ((j) this).field_c = ((j) this).field_c + (-0.5 + Math.random());
                ((j) this).field_j = ((j) this).field_j + (-0.4 + Math.random());
                if (((j) this).field_k == null) {
                  ((j) this).field_k = new ck[10];
                  var3 = 0;
                  L2: while (true) {
                    if (((j) this).field_k.length <= var3) {
                      break L1;
                    } else {
                      ((j) this).field_k[var3] = new ck();
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var5 = 0;
              var3 = var5;
              L3: while (true) {
                if (var5 >= ((j) this).field_k.length) {
                  break L0;
                } else {
                  ((j) this).field_k[var5].a((int)((j) this).field_D + hi.a(ri.field_e, 4, ((j) this).field_l), var2 / 4, 1049600, -104, 1, (int)((j) this).field_N + hi.a(am.field_l, 4, ((j) this).field_l));
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = qe.field_a * 3 * pi.field_S[0].field_c / -150;
          var3 = (-fk.field_m.field_h + 640) / 2;
          var4 = -(fk.field_m.field_h / 2) + 120;
          if (qe.field_a > -25) {
            var5_int = -(qe.field_a * 10);
            var4 = var4 - (255 + -var5_int) / 2;
            fk.field_m.a(var3, var4, var5_int);
            break L0;
          } else {
            fk.field_m.a(var3, var4);
            break L0;
          }
        }
        wj.f(var3 + 94, 101 + var4, var3 - -116, var4 + 131);
        var7 = 0;
        var5_int = var7;
        L1: while (true) {
          if (var7 > 3) {
            wj.a();
            cb.field_b.b(a.field_f, 320, 45 + var4, 16777215, 0);
            var5 = uf.field_d + (((j) this).field_q / 3 - -1) + "-" + (((j) this).field_q % 3 - -1);
            cb.field_b.b(var5, 320, cb.field_b.field_E + (var4 + 45), 16777215, 0);
            return;
          } else {
            pi.field_S[var7].e(var3 + 94, -var2 + (48 + (var4 + 53 - pi.field_S[0].field_c * -var7)));
            var7++;
            continue L1;
          }
        }
    }

    private final void z() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!ck.field_f[98]) {
            break L0;
          } else {
            si.field_C[0] = true;
            ((j) this).field_j = ((j) this).field_j - 0.5;
            break L0;
          }
        }
        L1: {
          if (!ck.field_f[99]) {
            break L1;
          } else {
            ((j) this).field_j = ((j) this).field_j + 0.5;
            si.field_C[1] = true;
            break L1;
          }
        }
        L2: {
          if (ck.field_f[96]) {
            ((j) this).field_c = ((j) this).field_c - 0.5;
            si.field_C[2] = true;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ck.field_f[97]) {
            ((j) this).field_c = ((j) this).field_c + 0.5;
            si.field_C[3] = true;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!ck.field_f[81]) {
            break L4;
          } else {
            if (((j) this).field_O) {
              pa.field_c = ((j) this).field_J;
              ah.field_J = ib.field_t;
              L5: while (true) {
                ib.field_t = (ib.field_t - -1) % 4;
                if (!nc.field_J[((j) this).field_q][ib.field_t]) {
                  continue L5;
                } else {
                  s.field_e = true;
                  break L4;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L6: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (ck.field_f[81]) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L6;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L6;
          }
        }
        L7: {
          L8: {
            ((j) this).field_O = stackIn_19_1 != 0;
            if (!ck.field_f[em.field_e]) {
              break L8;
            } else {
              if (0 == ib.field_t) {
                break L8;
              } else {
                L9: {
                  if (nc.field_J[((j) this).field_q][0]) {
                    pa.field_c = ((j) this).field_J;
                    ah.field_J = ib.field_t;
                    ib.field_t = 0;
                    break L9;
                  } else {
                    ((j) this).field_Z = 50;
                    break L9;
                  }
                }
                s.field_e = true;
                break L7;
              }
            }
          }
          L10: {
            if (!ck.field_f[lb.field_A]) {
              break L10;
            } else {
              if (ib.field_t != 1) {
                L11: {
                  if (!nc.field_J[((j) this).field_q][1]) {
                    ((j) this).field_Z = 50;
                    break L11;
                  } else {
                    pa.field_c = ((j) this).field_J;
                    ah.field_J = ib.field_t;
                    ib.field_t = 1;
                    break L11;
                  }
                }
                s.field_e = true;
                break L7;
              } else {
                break L10;
              }
            }
          }
          L12: {
            if (!ck.field_f[vd.field_f]) {
              break L12;
            } else {
              if (2 != ib.field_t) {
                L13: {
                  if (nc.field_J[((j) this).field_q][2]) {
                    pa.field_c = ((j) this).field_J;
                    ah.field_J = ib.field_t;
                    ib.field_t = 2;
                    break L13;
                  } else {
                    ((j) this).field_Z = 50;
                    break L13;
                  }
                }
                s.field_e = true;
                break L7;
              } else {
                break L12;
              }
            }
          }
          if (!ck.field_f[lf.field_c]) {
            break L7;
          } else {
            if (ib.field_t == 3) {
              break L7;
            } else {
              L14: {
                if (!nc.field_J[((j) this).field_q][3]) {
                  ((j) this).field_Z = 50;
                  break L14;
                } else {
                  pa.field_c = ((j) this).field_J;
                  ah.field_J = ib.field_t;
                  ib.field_t = 3;
                  break L14;
                }
              }
              s.field_e = true;
              break L7;
            }
          }
        }
        L15: {
          L16: {
            if (ck.field_f[83]) {
              break L16;
            } else {
              if (!ck.field_f[84]) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          if (((j) this).field_S != 0) {
            break L15;
          } else {
            if (((j) this).field_J < ((j) this).field_b) {
              break L15;
            } else {
              if (0 < gm.field_J) {
                break L15;
              } else {
                L17: {
                  if (ib.field_t == 3) {
                    ol.field_d = true;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                ((j) this).field_S = ((j) this).field_A;
                lg.field_g = true;
                break L15;
              }
            }
          }
        }
        L18: {
          L19: {
            L20: {
              if (ck.field_f[82]) {
                break L20;
              } else {
                if (!ck.field_f[nj.field_a]) {
                  break L19;
                } else {
                  break L20;
                }
              }
            }
            if (this.n(103)) {
              L21: {
                if (((j) this).field_u == 0) {
                  od.a(-1630758008, ((j) this).field_M);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                ((j) this).field_M.h(((j) this).field_u + 196);
                ((j) this).field_M.j((int)((25.0 + (double)((j) this).field_u / 2.0) * (double)dg.field_e / 80.0));
                ((j) this).field_u = ((j) this).field_u + 1;
                if (((j) this).field_u > 200) {
                  ((j) this).field_u = 200;
                  ((j) this).field_E = ((j) this).field_E + 1;
                  var2 = (int)(Math.exp((double)(-((j) this).field_E) / 100.0) * 125.0);
                  ((j) this).field_M.j(dg.field_e * var2 / 80);
                  break L22;
                } else {
                  break L22;
                }
              }
              if (((j) this).field_u <= 50) {
                break L18;
              } else {
                ni.field_w = true;
                break L18;
              }
            } else {
              break L19;
            }
          }
          if (((j) this).field_u <= 50) {
            ((j) this).field_u = 0;
            break L18;
          } else {
            this.a(23, (byte) 113);
            ((j) this).field_E = 0;
            nb.field_d = true;
            ((j) this).field_u = 0;
            break L18;
          }
        }
        L23: {
          if (0 != ((j) this).field_u) {
            break L23;
          } else {
            gi.a(((j) this).field_M, 3408);
            ((j) this).field_M.i(-1);
            break L23;
          }
        }
        L24: {
          if (nj.field_j >= 2) {
            if (((j) this).field_W) {
              L25: {
                if (!ck.field_f[11]) {
                  break L25;
                } else {
                  L26: {
                    if (ck.field_f[25]) {
                      k.a(0, 1);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (!ck.field_f[16]) {
                      break L27;
                    } else {
                      k.a(0, 2);
                      break L27;
                    }
                  }
                  L28: {
                    if (ck.field_f[17]) {
                      k.a(0, 4);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (!ck.field_f[18]) {
                      break L29;
                    } else {
                      k.a(0, 8);
                      break L29;
                    }
                  }
                  L30: {
                    if (ck.field_f[19]) {
                      k.a(0, 16);
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (ck.field_f[20]) {
                      k.a(0, 32);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (ck.field_f[21]) {
                      k.a(0, 50);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  if (ck.field_f[22]) {
                    k.a(0, 100);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              L33: {
                if (!ck.field_f[10]) {
                  break L33;
                } else {
                  ((j) this).field_W = true;
                  this.d((byte) -53, 1234567);
                  break L33;
                }
              }
              L34: {
                if (!ck.field_f[88]) {
                  break L34;
                } else {
                  ((j) this).field_W = true;
                  this.d((byte) -87, -((j) this).field_H);
                  break L34;
                }
              }
              L35: {
                if (!ck.field_f[103]) {
                  break L35;
                } else {
                  ((j) this).field_W = true;
                  ((j) this).field_w = 0;
                  int discarded$88 = -6111;
                  this.d();
                  break L35;
                }
              }
              L36: {
                if (!ck.field_f[85]) {
                  break L36;
                } else {
                  ((j) this).field_W = true;
                  var4 = 0;
                  var2 = var4;
                  L37: while (true) {
                    if (var4 >= ((j) this).field_n.length) {
                      break L36;
                    } else {
                      L38: {
                        if (null != ((j) this).field_n[var4]) {
                          ((j) this).field_n[var4].a(7769);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      ((j) this).field_n[var4] = null;
                      var4++;
                      continue L37;
                    }
                  }
                }
              }
              L39: {
                if (!ck.field_f[27]) {
                  break L39;
                } else {
                  ((j) this).field_F = true;
                  ((j) this).field_W = true;
                  break L39;
                }
              }
              L40: {
                if (0 == (((j) this).field_J & 15)) {
                  L41: {
                    if (ck.field_f[90]) {
                      ((j) this).field_W = true;
                      this.a(119, (double)hi.a(430, 4, ((j) this).field_l), 640.0, false, false);
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                  L42: {
                    if (ck.field_f[89]) {
                      ((j) this).field_W = true;
                      bf discarded$89 = ((j) this).a(hi.a(430, 4, ((j) this).field_l), false, hi.a(77, 4, ((j) this).field_l), 640, 0, true);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    if (!ck.field_f[80]) {
                      break L43;
                    } else {
                      if (!ck.field_f[86]) {
                        break L43;
                      } else {
                        L44: {
                          ((j) this).field_W = true;
                          if (ck.field_f[16]) {
                            this.a(0, 255, (byte) -105);
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          if (!ck.field_f[17]) {
                            break L45;
                          } else {
                            this.a(1, 254, (byte) -118);
                            break L45;
                          }
                        }
                        L46: {
                          if (ck.field_f[18]) {
                            this.a(2, 253, (byte) -81);
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        L47: {
                          if (ck.field_f[19]) {
                            this.a(3, 252, (byte) -77);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L48: {
                          if (ck.field_f[20]) {
                            this.a(4, 251, (byte) -83);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        L49: {
                          if (ck.field_f[21]) {
                            this.a(5, 250, (byte) -107);
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L50: {
                          if (ck.field_f[22]) {
                            this.a(6, 249, (byte) -121);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        L51: {
                          if (ck.field_f[23]) {
                            this.a(7, 248, (byte) -105);
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        L52: {
                          if (ck.field_f[24]) {
                            this.a(8, 247, (byte) -90);
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        L53: {
                          if (ck.field_f[25]) {
                            this.a(9, 246, (byte) -92);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        L54: {
                          if (!ck.field_f[32]) {
                            break L54;
                          } else {
                            this.a(10, 245, (byte) -105);
                            break L54;
                          }
                        }
                        L55: {
                          if (ck.field_f[33]) {
                            this.a(11, 244, (byte) -80);
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                        L56: {
                          if (ck.field_f[34]) {
                            this.a(12, 243, (byte) -107);
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        if (ck.field_f[35]) {
                          this.a(13, 242, (byte) -96);
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                  L57: {
                    if (!ck.field_f[80]) {
                      break L57;
                    } else {
                      if (ck.field_f[86]) {
                        break L57;
                      } else {
                        L58: {
                          ((j) this).field_W = true;
                          if (ck.field_f[16]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 1, false, false);
                            break L58;
                          } else {
                            break L58;
                          }
                        }
                        L59: {
                          if (ck.field_f[17]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 2, false, false);
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if (!ck.field_f[18]) {
                            break L60;
                          } else {
                            ((j) this).field_d[this.f(qk.a(215, 215))] = new ib(640.0, 215.0, 3, false, false);
                            break L60;
                          }
                        }
                        L61: {
                          if (ck.field_f[19]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 4, false, false);
                            break L61;
                          } else {
                            break L61;
                          }
                        }
                        L62: {
                          if (ck.field_f[20]) {
                            ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 5, false, false);
                            break L62;
                          } else {
                            break L62;
                          }
                        }
                        L63: {
                          if (ck.field_f[21]) {
                            ((j) this).field_d[this.f(qk.a(215, 215))] = new ib(640.0, 215.0, 6, false, false);
                            break L63;
                          } else {
                            break L63;
                          }
                        }
                        if (ck.field_f[22]) {
                          ((j) this).field_d[this.f(0)] = new ib(640.0, 215.0, 7, false, false);
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                  if (!ck.field_f[86]) {
                    break L40;
                  } else {
                    if (ck.field_f[80]) {
                      break L40;
                    } else {
                      ((j) this).field_W = true;
                      if (ck.field_f[102]) {
                        L64: {
                          if (ck.field_f[16]) {
                            bf discarded$90 = ((j) this).a(250, true, 47, -90, 0, true);
                            break L64;
                          } else {
                            break L64;
                          }
                        }
                        L65: {
                          if (!ck.field_f[17]) {
                            break L65;
                          } else {
                            bf discarded$91 = ((j) this).a(215, true, 48, 640, 0, true);
                            break L65;
                          }
                        }
                        L66: {
                          if (!ck.field_f[18]) {
                            break L66;
                          } else {
                            bf discarded$92 = ((j) this).a(215, true, 49, 640, 0, true);
                            break L66;
                          }
                        }
                        L67: {
                          if (!ck.field_f[19]) {
                            break L67;
                          } else {
                            bf discarded$93 = ((j) this).a(215, true, 50, 640, 0, true);
                            break L67;
                          }
                        }
                        L68: {
                          if (!ck.field_f[20]) {
                            break L68;
                          } else {
                            bf discarded$94 = ((j) this).a(215, true, 51, 640, 0, true);
                            break L68;
                          }
                        }
                        L69: {
                          if (ck.field_f[21]) {
                            bf discarded$95 = ((j) this).a(215, true, 52, 640, 0, true);
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        L70: {
                          if (!ck.field_f[22]) {
                            break L70;
                          } else {
                            bf discarded$96 = ((j) this).a(215, true, 53, 640, 0, true);
                            break L70;
                          }
                        }
                        L71: {
                          if (!ck.field_f[23]) {
                            break L71;
                          } else {
                            bf discarded$97 = ((j) this).a(215, true, 54, 640, 0, true);
                            break L71;
                          }
                        }
                        L72: {
                          if (ck.field_f[24]) {
                            bf discarded$98 = ((j) this).a(215, true, 55, 640, 0, true);
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        L73: {
                          if (!ck.field_f[25]) {
                            break L73;
                          } else {
                            bf discarded$99 = ((j) this).a(215, true, 56, 640, 0, true);
                            break L73;
                          }
                        }
                        L74: {
                          if (!ck.field_f[26]) {
                            break L74;
                          } else {
                            bf discarded$100 = ((j) this).a(215, true, 57, 640, 0, true);
                            break L74;
                          }
                        }
                        L75: {
                          if (!ck.field_f[27]) {
                            break L75;
                          } else {
                            bf discarded$101 = ((j) this).a(215, true, 58, 640, 0, true);
                            break L75;
                          }
                        }
                        L76: {
                          if (!ck.field_f[32]) {
                            break L76;
                          } else {
                            bf discarded$102 = ((j) this).a(215, true, 59, 640, 0, true);
                            break L76;
                          }
                        }
                        L77: {
                          if (ck.field_f[33]) {
                            bf discarded$103 = ((j) this).a(215, true, 60, 640, 0, true);
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        L78: {
                          if (ck.field_f[34]) {
                            bf discarded$104 = ((j) this).a(215, true, 61, 640, 0, true);
                            break L78;
                          } else {
                            break L78;
                          }
                        }
                        L79: {
                          if (!ck.field_f[35]) {
                            break L79;
                          } else {
                            bf discarded$105 = ((j) this).a(215, true, 62, 640, 0, true);
                            break L79;
                          }
                        }
                        L80: {
                          if (!ck.field_f[36]) {
                            break L80;
                          } else {
                            bf discarded$106 = ((j) this).a(215, true, 63, 640, 0, true);
                            break L80;
                          }
                        }
                        L81: {
                          if (!ck.field_f[37]) {
                            break L81;
                          } else {
                            bf discarded$107 = ((j) this).a(215, true, 64, 640, 0, true);
                            break L81;
                          }
                        }
                        L82: {
                          if (!ck.field_f[38]) {
                            break L82;
                          } else {
                            bf discarded$108 = ((j) this).a(215, true, 65, 640, 0, true);
                            break L82;
                          }
                        }
                        L83: {
                          if (!ck.field_f[39]) {
                            break L83;
                          } else {
                            bf discarded$109 = ((j) this).a(215, true, 66, 640, 0, true);
                            break L83;
                          }
                        }
                        L84: {
                          if (!ck.field_f[40]) {
                            break L84;
                          } else {
                            bf discarded$110 = ((j) this).a(215, true, 67, 640, 0, true);
                            break L84;
                          }
                        }
                        L85: {
                          if (!ck.field_f[41]) {
                            break L85;
                          } else {
                            bf discarded$111 = ((j) this).a(215, true, 68, 640, 0, true);
                            break L85;
                          }
                        }
                        L86: {
                          if (!ck.field_f[42]) {
                            break L86;
                          } else {
                            bf discarded$112 = ((j) this).a(215, true, 69, 640, 0, true);
                            break L86;
                          }
                        }
                        L87: {
                          if (!ck.field_f[43]) {
                            break L87;
                          } else {
                            bf discarded$113 = ((j) this).a(215, true, 70, 640, 0, true);
                            break L87;
                          }
                        }
                        L88: {
                          if (!ck.field_f[48]) {
                            break L88;
                          } else {
                            bf discarded$114 = ((j) this).a(215, true, 71, 640, 0, true);
                            break L88;
                          }
                        }
                        L89: {
                          if (!ck.field_f[49]) {
                            break L89;
                          } else {
                            bf discarded$115 = ((j) this).a(215, true, 72, 640, 0, true);
                            break L89;
                          }
                        }
                        L90: {
                          if (ck.field_f[50]) {
                            bf discarded$116 = ((j) this).a(215, true, 73, 640, 0, true);
                            break L90;
                          } else {
                            break L90;
                          }
                        }
                        L91: {
                          if (ck.field_f[51]) {
                            bf discarded$117 = ((j) this).a(215, true, 74, 640, 0, true);
                            break L91;
                          } else {
                            break L91;
                          }
                        }
                        L92: {
                          if (!ck.field_f[52]) {
                            break L92;
                          } else {
                            bf discarded$118 = ((j) this).a(215, true, 75, 640, 0, true);
                            break L92;
                          }
                        }
                        if (!ck.field_f[53]) {
                          break L40;
                        } else {
                          bf discarded$119 = ((j) this).a(215, true, 76, 640, 0, true);
                          break L40;
                        }
                      } else {
                        L93: {
                          if (!ck.field_f[16]) {
                            break L93;
                          } else {
                            bf discarded$120 = ((j) this).a(250, true, 0, 640, 0, true);
                            break L93;
                          }
                        }
                        L94: {
                          if (ck.field_f[17]) {
                            bf discarded$121 = ((j) this).a(215, true, 1, 640, 0, true);
                            break L94;
                          } else {
                            break L94;
                          }
                        }
                        L95: {
                          if (ck.field_f[18]) {
                            bf discarded$122 = ((j) this).a(215, true, 2, 640, 0, true);
                            break L95;
                          } else {
                            break L95;
                          }
                        }
                        L96: {
                          if (!ck.field_f[19]) {
                            break L96;
                          } else {
                            bf discarded$123 = ((j) this).a(215, true, 3, 640, 0, true);
                            break L96;
                          }
                        }
                        L97: {
                          if (!ck.field_f[20]) {
                            break L97;
                          } else {
                            bf discarded$124 = ((j) this).a(215, true, 4, 640, 0, true);
                            break L97;
                          }
                        }
                        L98: {
                          if (!ck.field_f[21]) {
                            break L98;
                          } else {
                            bf discarded$125 = ((j) this).a(215, true, 5, 640, 0, true);
                            break L98;
                          }
                        }
                        L99: {
                          if (!ck.field_f[22]) {
                            break L99;
                          } else {
                            bf discarded$126 = ((j) this).a(215, true, 6, 640, 0, true);
                            break L99;
                          }
                        }
                        L100: {
                          if (ck.field_f[23]) {
                            bf discarded$127 = ((j) this).a(215, true, 7, 640, 0, true);
                            break L100;
                          } else {
                            break L100;
                          }
                        }
                        L101: {
                          if (ck.field_f[24]) {
                            bf discarded$128 = ((j) this).a(215, true, 8, 640, 0, true);
                            break L101;
                          } else {
                            break L101;
                          }
                        }
                        L102: {
                          if (!ck.field_f[25]) {
                            break L102;
                          } else {
                            bf discarded$129 = ((j) this).a(215, true, 9, 640, 0, true);
                            break L102;
                          }
                        }
                        L103: {
                          if (!ck.field_f[26]) {
                            break L103;
                          } else {
                            bf discarded$130 = ((j) this).a(215, true, 10, 640, 0, true);
                            break L103;
                          }
                        }
                        L104: {
                          if (ck.field_f[27]) {
                            bf discarded$131 = ((j) this).a(215, true, 11, 640, 0, true);
                            break L104;
                          } else {
                            break L104;
                          }
                        }
                        L105: {
                          if (ck.field_f[32]) {
                            bf discarded$132 = ((j) this).a(215, true, 12, 640, 0, true);
                            break L105;
                          } else {
                            break L105;
                          }
                        }
                        L106: {
                          if (!ck.field_f[33]) {
                            break L106;
                          } else {
                            bf discarded$133 = ((j) this).a(215, true, 13, 640, 0, true);
                            break L106;
                          }
                        }
                        L107: {
                          if (!ck.field_f[34]) {
                            break L107;
                          } else {
                            bf discarded$134 = ((j) this).a(215, true, 14, 640, 0, true);
                            break L107;
                          }
                        }
                        L108: {
                          if (ck.field_f[35]) {
                            bf discarded$135 = ((j) this).a(215, true, 15, 640, 0, true);
                            break L108;
                          } else {
                            break L108;
                          }
                        }
                        L109: {
                          if (!ck.field_f[36]) {
                            break L109;
                          } else {
                            bf discarded$136 = ((j) this).a(215, true, 16, 640, 0, true);
                            break L109;
                          }
                        }
                        L110: {
                          if (!ck.field_f[37]) {
                            break L110;
                          } else {
                            bf discarded$137 = ((j) this).a(215, true, 17, 640, 0, true);
                            break L110;
                          }
                        }
                        L111: {
                          if (ck.field_f[38]) {
                            bf discarded$138 = ((j) this).a(215, true, 18, 640, 0, true);
                            break L111;
                          } else {
                            break L111;
                          }
                        }
                        L112: {
                          if (!ck.field_f[39]) {
                            break L112;
                          } else {
                            bf discarded$139 = ((j) this).a(215, true, 19, 640, 0, true);
                            break L112;
                          }
                        }
                        L113: {
                          if (ck.field_f[40]) {
                            bf discarded$140 = ((j) this).a(215, true, 20, 640, 0, true);
                            break L113;
                          } else {
                            break L113;
                          }
                        }
                        L114: {
                          if (!ck.field_f[41]) {
                            break L114;
                          } else {
                            bf discarded$141 = ((j) this).a(215, true, 21, 640, 0, true);
                            break L114;
                          }
                        }
                        L115: {
                          if (ck.field_f[42]) {
                            bf discarded$142 = ((j) this).a(215, true, 22, 640, 0, true);
                            break L115;
                          } else {
                            break L115;
                          }
                        }
                        L116: {
                          if (!ck.field_f[43]) {
                            break L116;
                          } else {
                            bf discarded$143 = ((j) this).a(215, true, 23, 640, 0, true);
                            break L116;
                          }
                        }
                        L117: {
                          if (!ck.field_f[48]) {
                            break L117;
                          } else {
                            bf discarded$144 = ((j) this).a(215, true, 24, 640, 0, true);
                            break L117;
                          }
                        }
                        L118: {
                          if (ck.field_f[49]) {
                            bf discarded$145 = ((j) this).a(215, true, 25, 640, 0, true);
                            break L118;
                          } else {
                            break L118;
                          }
                        }
                        L119: {
                          if (!ck.field_f[50]) {
                            break L119;
                          } else {
                            bf discarded$146 = ((j) this).a(215, true, 26, 640, 0, true);
                            break L119;
                          }
                        }
                        L120: {
                          if (!ck.field_f[51]) {
                            break L120;
                          } else {
                            bf discarded$147 = ((j) this).a(215, true, 27, 640, 0, true);
                            break L120;
                          }
                        }
                        L121: {
                          if (!ck.field_f[52]) {
                            break L121;
                          } else {
                            bf discarded$148 = ((j) this).a(215, true, 28, 640, 0, true);
                            break L121;
                          }
                        }
                        L122: {
                          if (!ck.field_f[53]) {
                            break L122;
                          } else {
                            bf discarded$149 = ((j) this).a(215, true, 29, 640, 0, true);
                            break L122;
                          }
                        }
                        L123: {
                          if (ck.field_f[54]) {
                            bf discarded$150 = ((j) this).a(215, true, 30, 640, 0, true);
                            break L123;
                          } else {
                            break L123;
                          }
                        }
                        L124: {
                          if (ck.field_f[55]) {
                            bf discarded$151 = ((j) this).a(215, true, 31, 640, 0, true);
                            break L124;
                          } else {
                            break L124;
                          }
                        }
                        L125: {
                          if (!ck.field_f[56]) {
                            break L125;
                          } else {
                            bf discarded$152 = ((j) this).a(215, true, 32, 640, 0, true);
                            break L125;
                          }
                        }
                        L126: {
                          if (ck.field_f[57]) {
                            bf discarded$153 = ((j) this).a(215, true, 33, 640, 0, true);
                            break L126;
                          } else {
                            break L126;
                          }
                        }
                        L127: {
                          if (ck.field_f[58]) {
                            bf discarded$154 = ((j) this).a(215, true, 34, 640, 0, true);
                            break L127;
                          } else {
                            break L127;
                          }
                        }
                        L128: {
                          if (!ck.field_f[59]) {
                            break L128;
                          } else {
                            bf discarded$155 = ((j) this).a(215, true, 35, 640, 0, true);
                            break L128;
                          }
                        }
                        L129: {
                          if (!ck.field_f[74]) {
                            break L129;
                          } else {
                            bf discarded$156 = ((j) this).a(215, true, 36, 640, 0, true);
                            break L129;
                          }
                        }
                        L130: {
                          if (!ck.field_f[64]) {
                            break L130;
                          } else {
                            bf discarded$157 = ((j) this).a(215, true, 37, 640, 0, true);
                            break L130;
                          }
                        }
                        L131: {
                          if (!ck.field_f[65]) {
                            break L131;
                          } else {
                            bf discarded$158 = ((j) this).a(215, true, 38, 640, 0, true);
                            break L131;
                          }
                        }
                        L132: {
                          if (!ck.field_f[66]) {
                            break L132;
                          } else {
                            bf discarded$159 = ((j) this).a(215, true, 39, 640, 0, true);
                            break L132;
                          }
                        }
                        L133: {
                          if (!ck.field_f[67]) {
                            break L133;
                          } else {
                            bf discarded$160 = ((j) this).a(215, true, 40, 640, 0, true);
                            break L133;
                          }
                        }
                        L134: {
                          if (ck.field_f[68]) {
                            bf discarded$161 = ((j) this).a(215, true, 41, 640, 0, true);
                            break L134;
                          } else {
                            break L134;
                          }
                        }
                        L135: {
                          if (!ck.field_f[69]) {
                            break L135;
                          } else {
                            bf discarded$162 = ((j) this).a(215, true, 42, 640, 0, true);
                            break L135;
                          }
                        }
                        L136: {
                          if (ck.field_f[70]) {
                            bf discarded$163 = ((j) this).a(250, true, 43, 640, 0, true);
                            break L136;
                          } else {
                            break L136;
                          }
                        }
                        L137: {
                          if (!ck.field_f[71]) {
                            break L137;
                          } else {
                            bf discarded$164 = ((j) this).a(250, true, 44, 640, 0, true);
                            break L137;
                          }
                        }
                        L138: {
                          if (!ck.field_f[72]) {
                            break L138;
                          } else {
                            bf discarded$165 = ((j) this).a(250, true, 45, 640, 0, true);
                            break L138;
                          }
                        }
                        if (!ck.field_f[73]) {
                          break L40;
                        } else {
                          bf discarded$166 = ((j) this).a(250, true, 46, 640, 0, true);
                          break L40;
                        }
                      }
                    }
                  }
                } else {
                  break L40;
                }
              }
              L139: {
                if (!ck.field_f[87]) {
                  break L139;
                } else {
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  int discarded$167 = 1;
                  this.H();
                  break L139;
                }
              }
              L140: {
                if (!ck.field_f[2]) {
                  break L140;
                } else {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 0;
                  ((j) this).field_W = true;
                  int discarded$168 = 1;
                  this.H();
                  break L140;
                }
              }
              L141: {
                if (!ck.field_f[3]) {
                  break L141;
                } else {
                  ((j) this).field_W = true;
                  ((j) this).field_q = 1;
                  ((j) this).field_ab = true;
                  int discarded$169 = 1;
                  this.H();
                  break L141;
                }
              }
              L142: {
                if (!ck.field_f[4]) {
                  break L142;
                } else {
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  ((j) this).field_q = 2;
                  int discarded$170 = 1;
                  this.H();
                  break L142;
                }
              }
              L143: {
                if (ck.field_f[5]) {
                  ((j) this).field_q = 3;
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  int discarded$171 = 1;
                  this.H();
                  break L143;
                } else {
                  break L143;
                }
              }
              L144: {
                if (ck.field_f[6]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 4;
                  ((j) this).field_W = true;
                  int discarded$172 = 1;
                  this.H();
                  break L144;
                } else {
                  break L144;
                }
              }
              L145: {
                if (ck.field_f[7]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_W = true;
                  ((j) this).field_q = 5;
                  int discarded$173 = 1;
                  this.H();
                  break L145;
                } else {
                  break L145;
                }
              }
              L146: {
                if (ck.field_f[8]) {
                  ((j) this).field_ab = true;
                  ((j) this).field_q = 6;
                  ((j) this).field_W = true;
                  int discarded$174 = 1;
                  this.H();
                  break L146;
                } else {
                  break L146;
                }
              }
              if (!ck.field_f[9]) {
                break L24;
              } else {
                ((j) this).field_W = true;
                ((j) this).field_q = 7;
                ((j) this).field_ab = true;
                int discarded$175 = 1;
                this.H();
                break L24;
              }
            } else {
              ((j) this).field_W = ck.field_f[12];
              break L24;
            }
          } else {
            break L24;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 1;
        int discarded$0 = 1280;
        int var4 = this.m();
        ((j) this).field_hb[var4] = new td(13, param2, param0, -1);
    }

    private final void i() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (((j) this).field_q == 0) {
              break L1;
            } else {
              if (((j) this).field_q != 3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = 1;
          var3 = 0;
          L2: while (true) {
            if (si.field_C.length <= var3) {
              L3: {
                if (el.field_tb != 0) {
                  break L3;
                } else {
                  if (var2 != 0) {
                    el.field_tb = el.field_tb + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (el.field_tb != 1) {
                  break L4;
                } else {
                  if (!lg.field_g) {
                    break L4;
                  } else {
                    el.field_tb = el.field_tb + 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (2 != el.field_tb) {
                  break L5;
                } else {
                  if (s.field_e) {
                    el.field_tb = el.field_tb + 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (el.field_tb != 3) {
                  break L6;
                } else {
                  if (!ni.field_w) {
                    break L6;
                  } else {
                    el.field_tb = el.field_tb + 1;
                    break L6;
                  }
                }
              }
              L7: {
                if (el.field_tb != 4) {
                  break L7;
                } else {
                  if (!nb.field_d) {
                    break L7;
                  } else {
                    el.field_tb = el.field_tb + 1;
                    break L7;
                  }
                }
              }
              L8: {
                if (5 != el.field_tb) {
                  break L8;
                } else {
                  if (ol.field_d) {
                    el.field_tb = el.field_tb + 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (5 != el.field_tb) {
                  break L9;
                } else {
                  if (((j) this).field_q != 0) {
                    break L9;
                  } else {
                    we.field_f = we.field_f + 1;
                    break L0;
                  }
                }
              }
              L10: {
                if (el.field_tb != 6) {
                  break L10;
                } else {
                  if (((j) this).field_q == 3) {
                    we.field_f = we.field_f + 1;
                    break L0;
                  } else {
                    break L10;
                  }
                }
              }
              we.field_f = 0;
              break L0;
            } else {
              var2 = var2 != 0 & si.field_C[var3] ? 1 : 0;
              var3++;
              continue L2;
            }
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        gf var3_ref_gf = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((j) this).field_S <= 0) {
            break L0;
          } else {
            if (((j) this).field_b <= ((j) this).field_J) {
              this.a(ib.field_t + 19, (byte) 34);
              if (((j) this).field_S > 0) {
                ((j) this).field_b = ((j) this).field_b + gg.field_i[ib.field_t];
                break L0;
              } else {
                L1: {
                  if (ib.field_t == 2) {
                    var2 = (int)((double)ni.field_v[ib.field_t] / Math.pow(1.25, (double)((j) this).field_A));
                    break L1;
                  } else {
                    var2 = ni.field_v[ib.field_t];
                    break L1;
                  }
                }
                ((j) this).field_b = ((j) this).field_J - -var2;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        var2 = 0;
        L2: while (true) {
          if (var2 >= 1400) {
            var2 = 0;
            L3: while (true) {
              if (800 <= var2) {
                var3 = 0;
                L4: while (true) {
                  if (((j) this).field_h.length <= var3) {
                    return;
                  } else {
                    L5: {
                      if (((j) this).field_u < 50) {
                        var4 = 65793 * (((j) this).field_u >> 4);
                        break L5;
                      } else {
                        if (100 <= ((j) this).field_u) {
                          if (150 <= ((j) this).field_u) {
                            var4 = 65537 * (((j) this).field_u >> 3);
                            break L5;
                          } else {
                            var4 = (((j) this).field_u >> 3) * 65792;
                            break L5;
                          }
                        } else {
                          var4 = 65536 * (((j) this).field_u >> 3);
                          break L5;
                        }
                      }
                    }
                    ((j) this).field_h[var3].a((int)(((j) this).field_D + (double)hi.a((int)(1.5 * (double)ri.field_e), 4, ((j) this).field_l) - (double)(ri.field_e / 3)), 15, var4, -5, 1, (int)(((j) this).field_N + (double)hi.a((int)((double)am.field_l * 1.5), 4, ((j) this).field_l) - (double)(am.field_l / 3)));
                    var3++;
                    continue L4;
                  }
                }
              } else {
                if (null != ((j) this).field_v[var2]) {
                  if (((j) this).field_v[var2].a((byte) -93)) {
                    ((j) this).field_v[var2] = null;
                    var2++;
                    continue L3;
                  } else {
                    var2++;
                    continue L3;
                  }
                } else {
                  var2++;
                  continue L3;
                }
              }
            }
          } else {
            var3_ref_gf = ((j) this).field_m[var2];
            if (var3_ref_gf != null) {
              L6: {
                if (28 == var3_ref_gf.field_I) {
                  L7: {
                    if (!var3_ref_gf.a(var3_ref_gf.field_d, ((j) this).field_D + (double)ri.field_q, ((j) this).field_N + (double)am.field_p, var3_ref_gf.field_F, true)) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L7;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L7;
                    }
                  }
                  var4 = stackIn_21_0;
                  break L6;
                } else {
                  L8: {
                    if (!var3_ref_gf.a(16510, ((j) this).field_D, 640.0)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L8;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L8;
                    }
                  }
                  var4 = stackIn_17_0;
                  break L6;
                }
              }
              L9: {
                if (var3_ref_gf.field_I != 20) {
                  break L9;
                } else {
                  if (435.0 >= var3_ref_gf.field_m) {
                    break L9;
                  } else {
                    var4 = 1;
                    this.a(ld.field_h[var3_ref_gf.field_I], (int)var3_ref_gf.field_m, gf.field_k[var3_ref_gf.field_I], (int)var3_ref_gf.field_i, 27396);
                    break L9;
                  }
                }
              }
              if (var4 != 0) {
                ((j) this).field_m[var2] = null;
                var2++;
                continue L2;
              } else {
                var2++;
                continue L2;
              }
            } else {
              var2++;
              continue L2;
            }
          }
        }
    }

    private final int g() {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = 0; ((j) this).field_m[var2] != null; var2++) {
        }
        return var2;
    }

    private final void c() {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = null;
          if (0 == ((j) this).field_q) {
            var2 = (Object) (Object) oi.field_f;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (1 != ((j) this).field_q) {
            break L1;
          } else {
            var2 = (Object) (Object) sg.field_e;
            break L1;
          }
        }
        L2: {
          if (2 == ((j) this).field_q) {
            var2 = (Object) (Object) uk.field_h;
            break L2;
          } else {
            break L2;
          }
        }
        if (var2 != null) {
          var3 = 0;
          L3: while (true) {
            if (var3 >= 20) {
              bc.field_d.c();
              wj.f(0, 0, bc.field_d.field_y, bc.field_d.field_w, 0);
              lb.field_C.a(124);
              ab.field_b = ((j) this).field_q;
              return;
            } else {
              al.field_g[var3] = hi.a(640, 4, ((j) this).field_l);
              if (!((he) var2).b(0, 0, al.field_g[var3], 305)) {
                var3--;
                var3++;
                continue L3;
              } else {
                var3++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void c(byte param0, int param1) {
        if (0 < param1) {
            ((j) this).field_R = ((j) this).field_R + param1;
        }
    }

    final void a(int param0, gf param1) {
        try {
            if (param0 != 24) {
                this.c(69);
            }
            int discarded$0 = -111;
            ((j) this).field_v[this.h()] = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "j.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void H() {
        int var2_int = 0;
        nl var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((j) this).field_eb) {
          L0: {
            ((j) this).field_Z = 0;
            ((j) this).field_fb = 0;
            if (gm.field_J < 500) {
              L1: {
                if (gm.field_J == 0) {
                  gf.field_D = Math.max(1 + sd.field_a.field_q, gf.field_D);
                  var2 = new nl(0, -1 + gf.field_D, 0, 0, 0, 0);
                  if (!oh.a(0)) {
                    rc.a(5, var2, -11659);
                    break L1;
                  } else {
                    dl.field_M.a((gi) (Object) var2, 255);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (gm.field_J <= 128) {
                    break L3;
                  } else {
                    if (((j) this).field_R == 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                gm.field_J = gm.field_J + 1;
                break L2;
              }
              this.o(123);
              break L0;
            } else {
              ((j) this).s(94);
              var2_int = 0;
              L4: while (true) {
                if (si.field_C.length <= var2_int) {
                  lg.field_g = true;
                  s.field_e = true;
                  ni.field_w = true;
                  nb.field_d = true;
                  int discarded$2 = 34;
                  wb.a();
                  break L0;
                } else {
                  si.field_C[var2_int] = true;
                  var2_int++;
                  continue L4;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void u() {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (gm.field_J > 0) {
            L1: {
              if (150 < gm.field_J) {
                if (((j) this).field_D <= (double)ri.field_e) {
                  ((j) this).field_j = 0.0;
                  break L1;
                } else {
                  ((j) this).field_j = ((j) this).field_j - 0.5;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (gm.field_J < 50) {
              be.a(0, 0, 640, 430, 22070844, gm.field_J * 5);
              break L0;
            } else {
              L2: {
                be.a(0, 0, 640, 430, 22070844, 255);
                var2 = gm.field_J * 2;
                if (255 < var2) {
                  var2 = 255;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var3 = (-150 + gm.field_J) * 2;
                if (var3 > 255) {
                  var3 = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                cb.field_b.b(vh.field_d, 320, 200, 16777215, -1, var2);
                if (0 > var3) {
                  var3 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var4 = sa.field_g + ((j) this).field_H;
                cb.field_b.b(var4, 320, 250, 16777215, -1, var2);
                if (0 >= ((j) this).field_R) {
                  break L5;
                } else {
                  var5 = kh.field_o + ((j) this).field_T + af.field_c + ((j) this).field_X + l.field_h + ((j) this).field_R;
                  cb.field_b.b(var5, 320, 255 - -cb.field_b.field_x, 16777215, -1, var2);
                  if (var2 > 200) {
                    if (((j) this).field_R > 29) {
                      ((j) this).field_R = ((j) this).field_R - 29;
                      this.d((byte) -100, 29);
                      break L5;
                    } else {
                      this.d((byte) -100, ((j) this).field_R);
                      ((j) this).field_R = 0;
                      break L5;
                    }
                  } else {
                    cb.field_b.b(bj.field_b, 320, 320, 16711680, -1, var3);
                    break L0;
                  }
                }
              }
              cb.field_b.b(bj.field_b, 320, 320, 16711680, -1, var3);
              break L0;
            }
          } else {
            if (!((j) this).field_eb) {
              break L0;
            } else {
              L6: {
                var2 = (-((j) this).field_s + ((j) this).field_J) * 255 / 300;
                if (255 < var2) {
                  var2 = 255;
                  break L6;
                } else {
                  break L6;
                }
              }
              be.a(64 + var2 / 2, -(var2 / 2 + 64), -(var2 / 2 + 64));
              be.b(var2 * 2 + 128);
              break L0;
            }
          }
        }
    }

    private final void v() {
        int var4 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = ((j) this).field_q;
        if (!(var2 != 2)) {
            var4 = 0;
            var2 = var4;
            while (var4 < 64) {
                wj.a(var4 * 10, i.field_c[var4], 20, 16777215, 64);
                var4++;
            }
        }
    }

    private final void a(int param0, double param1, double param2, boolean param3, boolean param4) {
        if (param0 <= 111) {
            int discarded$0 = 1;
            this.b();
        }
        int var8 = ((j) this).field_q <= 5 ? 430 : 334;
        if (!((double)var8 >= param1)) {
            param1 = (double)(-of.field_x.field_c + var8);
        }
        ((j) this).field_d[this.f(0)] = new ib(param2, param1, param3, param4);
    }

    private final void a(byte param0) {
        fj var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fj var7 = null;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = -108 / ((param0 - 60) / 54);
          var7 = (fj) (Object) ((j) this).field_I.h(-11151);
          var2 = var7;
          if (var2 != null) {
            L1: {
              var5 = ((j) this).field_bb;
              if (80 > var5) {
                var4 = var5 / 2 + -32;
                break L1;
              } else {
                if (var5 >= 230) {
                  var4 = -(var5 / 2) + 123;
                  break L1;
                } else {
                  var4 = 8;
                  break L1;
                }
              }
            }
            di.field_b[var7.field_h].b(8, var4);
            a.field_g.c(sc.field_b[var7.field_h], 48, a.field_g.field_x + var4, 16777215, -1);
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        if (param0 >= -37) {
            return;
        }
        if (param1 > 0) {
            var3 = (int)(cd.a((byte) 97) * (double)((j) this).field_L * (double)param1);
            ((j) this).field_i = ((j) this).field_i + var3;
            ((j) this).field_g = ((j) this).field_g ^ var3;
            ((j) this).field_H = ((j) this).field_H + var3;
            ((j) this).field_f = ((j) this).field_f + var3;
            ((j) this).field_x = ((j) this).field_x ^ var3;
            ((j) this).field_f = ((j) this).field_f + var3;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7_int = 0;
        ib var7 = null;
        int var8 = 0;
        int var9 = 0;
        bf var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (3 == ((j) this).field_q) {
          return;
        } else {
          var4 = ((j) this).field_G.field_h.length;
          var5 = -((j) this).field_J + var4;
          var7_int = 0;
          L0: while (true) {
            if (1600 <= var7_int) {
              L1: {
                if (param0 == -6718) {
                  break L1;
                } else {
                  this.a(121, -0.13010396482122083, -0.11679658977195154, true, true);
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var8 >= 160) {
                  return;
                } else {
                  var7 = ((j) this).field_d[var8];
                  if (var7 != null) {
                    if (var7.field_q) {
                      var9 = 0;
                      L3: while (true) {
                        if (var9 < 1600) {
                          var10 = ((j) this).field_n[var9];
                          if (var10 != null) {
                            if (cj.field_c[var10.field_Q]) {
                              if (!var10.field_s) {
                                if (ne.a(var10.b((byte) 55), (int)var10.field_o, (int)var10.field_N, var7.field_n, (int)var7.field_d, (int)var7.field_k)) {
                                  var11 = 0.0;
                                  var11 = -var7.field_b - 1.0 + -1.0;
                                  var13 = 0.0;
                                  var7.field_b = var11;
                                  var13 = -var7.field_p;
                                  var7.field_p = var13;
                                  var15 = Math.sqrt(var7.field_b * var7.field_b + var7.field_p * var7.field_p);
                                  if (var15 == 0.0) {
                                    var17 = Math.random() * 6.283185307179586;
                                    var7.field_b = ji.a(65535, var17);
                                    var7.field_p = pj.a(var17, 32768);
                                    var9++;
                                    continue L3;
                                  } else {
                                    var7.field_b = var7.field_b / var15;
                                    var7.field_p = var7.field_p / var15;
                                    var17 = Math.pow(0.95, (double)var7.field_c);
                                    var7.field_b = var7.field_b * var17;
                                    var7.field_p = var7.field_p * var17;
                                    var9++;
                                    continue L3;
                                  }
                                } else {
                                  var9++;
                                  continue L3;
                                }
                              } else {
                                var9++;
                                continue L3;
                              }
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    } else {
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            } else {
              var6 = ((j) this).field_n[var7_int];
              var10 = var6;
              var10 = var6;
              if (var6 != null) {
                if (!var6.field_s) {
                  if (!cj.field_c[var6.field_Q]) {
                    if (var6.field_Q != 40) {
                      var3 = var6.field_I + ((int)var6.field_o - -((j) this).field_J);
                      var8 = (int)var6.field_o;
                      L4: while (true) {
                        if ((int)((double)var6.field_m + var6.field_o) > var8) {
                          if (var8 - -((j) this).field_J >= 0) {
                            L5: {
                              if (var8 >= var5) {
                                L6: {
                                  var2 = 330;
                                  if (3 == ((j) this).field_q) {
                                    break L6;
                                  } else {
                                    if (((j) this).field_q == 4) {
                                      break L6;
                                    } else {
                                      if (5 == ((j) this).field_q) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                var2 = 0;
                                break L5;
                              } else {
                                var2 = -((j) this).field_G.field_h[((j) this).field_J + var8] + 430;
                                break L5;
                              }
                            }
                            L7: {
                              L8: {
                                L9: {
                                  if (var4 <= var3) {
                                    break L9;
                                  } else {
                                    if (var6.field_N + (double)var6.field_O > (double)(430 - ((j) this).field_G.field_h[var3])) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (var6.b((byte) 55).b((int)var6.field_o, (int)var6.field_N, var8, var2)) {
                                  break L8;
                                } else {
                                  break L7;
                                }
                              }
                              var6.field_j = -2.0;
                              var6.field_N = var6.field_N - 5.0;
                              var6.c(5);
                              break L7;
                            }
                            var8++;
                            continue L4;
                          } else {
                            var7_int++;
                            continue L0;
                          }
                        } else {
                          var7_int++;
                          continue L0;
                        }
                      }
                    } else {
                      var7_int++;
                      continue L0;
                    }
                  } else {
                    var7_int++;
                    continue L0;
                  }
                } else {
                  var7_int++;
                  continue L0;
                }
              } else {
                var7_int++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        double[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        Object var28 = null;
        bf var28_ref = null;
        int var29 = 0;
        double var30 = 0.0;
        int var32 = 0;
        gf var32_ref_gf = null;
        int var33 = 0;
        double var34_double = 0.0;
        int var34 = 0;
        double var36 = 0.0;
        int var38 = 0;
        bf var39 = null;
        bf var40 = null;
        double stackIn_80_0 = 0.0;
        double stackIn_81_0 = 0.0;
        double stackIn_82_0 = 0.0;
        double stackIn_82_1 = 0.0;
        double stackOut_79_0 = 0.0;
        double stackOut_81_0 = 0.0;
        double stackOut_81_1 = 0.0;
        double stackOut_80_0 = 0.0;
        double stackOut_80_1 = 0.0;
        L0: {
          var38 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 >= 21) {
            break L0;
          } else {
            this.a(-113, -38, 62, 92, 4);
            break L0;
          }
        }
        var3 = 0.0;
        var5 = 0.0;
        var7 = 0.0;
        var9 = 0.0;
        if (((j) this).field_eb) {
          return;
        } else {
          L1: {
            L2: {
              var5 = (double)ri.field_q + ((j) this).field_D;
              lh.field_m = lh.field_m | 1 << ((j) this).field_q;
              var3 = ((j) this).field_N + (double)am.field_p;
              var13_int = param0;
              if (19 != var13_int) {
                if (var13_int == 24) {
                  break L2;
                } else {
                  if (var13_int != 25) {
                    if (var13_int != 20) {
                      if (var13_int != 21) {
                        if (22 != var13_int) {
                          if (var13_int != 23) {
                            break L1;
                          } else {
                            var7 = 10.0;
                            var9 = 0.0;
                            break L1;
                          }
                        } else {
                          var9 = (double)(hi.a(((j) this).field_S * 4, 4, ((j) this).field_l) - ((j) this).field_S * 2);
                          var7 = 10.0;
                          break L1;
                        }
                      } else {
                        param0 = 28;
                        break L1;
                      }
                    } else {
                      var7 = ((j) this).field_c;
                      var9 = 0.0;
                      break L1;
                    }
                  } else {
                    L3: {
                      var7 = 23.0;
                      if (param0 != 25) {
                        break L3;
                      } else {
                        var7 = 34.0;
                        break L3;
                      }
                    }
                    var9 = 0.0;
                    var5 = var5 + 1.0;
                    var3 = -32.0 + (((j) this).field_N + (double)am.field_l);
                    break L1;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              var7 = 23.0;
              if (param0 != 25) {
                break L4;
              } else {
                var7 = 34.0;
                break L4;
              }
            }
            var9 = 0.0;
            var5 = var5 + 1.0;
            var3 = -32.0 + (((j) this).field_N + (double)am.field_l);
            break L1;
          }
          L5: {
            var32 = param0;
            if (var32 != 19) {
              if (var32 != 21) {
                if (28 != var32) {
                  if (23 != var32) {
                    if (var32 == 22) {
                      int discarded$31 = 119;
                      ((j) this).field_m[this.g()] = new gf(22, var3, var5, var7, var9, 800.0, ((j) this).field_D);
                      ((j) this).field_S = ((j) this).field_S - 1;
                      break L5;
                    } else {
                      if (var32 == 20) {
                        var30 = (double)((j) this).field_S / 4.0;
                        var32 = 0;
                        L6: while (true) {
                          if (((j) this).field_S <= var32) {
                            break L5;
                          } else {
                            int discarded$32 = 119;
                            ((j) this).field_m[this.g()] = new gf(param0, var3, var5, -var30 + (var7 + (double)var32), var9, 800.0, ((j) this).field_D);
                            ((j) this).field_S = ((j) this).field_S - 1;
                            var32++;
                            continue L6;
                          }
                        }
                      } else {
                        int discarded$33 = 119;
                        ((j) this).field_m[this.g()] = new gf(param0, var3, var5, var7, var9, 800.0, ((j) this).field_D);
                        ((j) this).field_S = ((j) this).field_S - 1;
                        break L5;
                      }
                    }
                  } else {
                    int discarded$34 = 119;
                    ((j) this).field_m[this.g()] = new gf(param0, var3, var5, var7, var9, 800.0, ((j) this).field_D, ((j) this).field_u);
                    break L5;
                  }
                } else {
                  var23 = -1;
                  var26 = 150.0;
                  var18 = (int)((double)am.field_p + ((j) this).field_N);
                  var20 = 0;
                  var29 = 0;
                  var28 = null;
                  var19 = (int)(((j) this).field_D + (double)ri.field_q);
                  L7: while (true) {
                    if (var29 != 0) {
                      L8: {
                        if (var23 == -1) {
                          ((j) this).field_a = true;
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var40 = ((j) this).field_n[var23];
                              var28_ref = var40;
                              var21 = var28_ref.field_I + (int)var28_ref.field_o;
                              var22 = var28_ref.field_t + (int)var28_ref.field_N;
                              if (var28_ref.field_Q == 0) {
                                break L10;
                              } else {
                                if (var28_ref.field_Q != 35) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var22 = var22 - var28_ref.field_t / 2;
                            break L9;
                          }
                          var32_ref_gf = new gf(param0, var3, var5, 0.0, 0.0, (double)var21, (double)var22);
                          var32_ref_gf.field_l = ((j) this).field_J;
                          int discarded$35 = 119;
                          ((j) this).field_m[this.g()] = var32_ref_gf;
                          if (!var28_ref.a(var32_ref_gf.field_t, 10)) {
                            break L8;
                          } else {
                            L11: {
                              this.b(var28_ref, 57);
                              this.d((byte) -63, wh.field_x[var40.field_Q]);
                              if (var28_ref.a(false)) {
                                break L11;
                              } else {
                                if (qa.field_I[var40.field_Q] != 0) {
                                  ((j) this).field_o = ((j) this).field_o - 1;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              L13: {
                                if (0 == ((j) this).field_o) {
                                  break L13;
                                } else {
                                  if (qa.field_I[var40.field_Q] < 0) {
                                    break L13;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              ((j) this).field_o = 5 - -hi.a(10, 4, ((j) this).field_l);
                              var34 = Math.abs(qa.field_I[var40.field_Q]);
                              L14: while (true) {
                                if (var34 <= 0) {
                                  break L12;
                                } else {
                                  this.a(121, var28_ref.field_N + (double)hi.a(var28_ref.field_O / 2, 4, ((j) this).field_l), var28_ref.field_o + (double)hi.a(var28_ref.field_m, 4, ((j) this).field_l), false, cj.field_c[var40.field_Q]);
                                  var34--;
                                  continue L14;
                                }
                              }
                            }
                            L15: {
                              this.a(116, (gf) null, var28_ref);
                              if (th.field_d[var28_ref.field_Q]) {
                                break L15;
                              } else {
                                ((j) this).field_n[var23].a(7769);
                                ((j) this).field_n[var23] = null;
                                break L15;
                              }
                            }
                            if (var28_ref.h(-120)) {
                              int discarded$36 = 0;
                              this.a(var28_ref);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      ((j) this).field_S = 0;
                      return;
                    } else {
                      var32 = 0;
                      L16: while (true) {
                        if (1600 <= var32) {
                          if (var23 == -1) {
                            if (var20 != 0) {
                              if (-100 == var20) {
                                var20 = 100;
                                continue L7;
                              } else {
                                var29 = 1;
                                continue L7;
                              }
                            } else {
                              var20 = -100;
                              continue L7;
                            }
                          } else {
                            var29 = 1;
                            continue L7;
                          }
                        } else {
                          L17: {
                            var39 = ((j) this).field_n[var32];
                            var40 = var39;
                            var28_ref = var40;
                            var40 = var39;
                            var28_ref = var40;
                            var28_ref = var39;
                            if (var28_ref == null) {
                              break L17;
                            } else {
                              if (var28_ref.a(false)) {
                                break L17;
                              } else {
                                if (var28_ref.field_s) {
                                  break L17;
                                } else {
                                  if (!wh.field_v[var39.field_Q]) {
                                    L18: {
                                      if (0 == var20) {
                                        break L18;
                                      } else {
                                        if (var28_ref.h(63)) {
                                          break L18;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L19: {
                                      var24 = dl.a(true, -var28_ref.field_o - (double)var28_ref.field_I - (double)var20 + (double)var18, -var28_ref.field_N - (double)var28_ref.field_t + (double)var19);
                                      stackOut_79_0 = var24;
                                      stackIn_81_0 = stackOut_79_0;
                                      stackIn_80_0 = stackOut_79_0;
                                      if (var28_ref.field_Q == 36) {
                                        stackOut_81_0 = stackIn_81_0;
                                        stackOut_81_1 = 30.0;
                                        stackIn_82_0 = stackOut_81_0;
                                        stackIn_82_1 = stackOut_81_1;
                                        break L19;
                                      } else {
                                        stackOut_80_0 = stackIn_80_0;
                                        stackOut_80_1 = 0.0;
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        break L19;
                                      }
                                    }
                                    var24 = stackIn_82_0 - stackIn_82_1;
                                    if (var24 >= var26) {
                                      break L17;
                                    } else {
                                      var23 = var32;
                                      var24 = var26;
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          var32++;
                          continue L16;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = var5 + 13.0;
                var13 = 20.0;
                var3 = var3 + 14.0;
                var17 = new double[]{0.0, 0.7853981633974483, -0.7853981633974483, 2.6179938779914944, -2.6179938779914944};
                var32 = -2;
                L20: while (true) {
                  if (var32 > 2) {
                    ((j) this).field_S = ((j) this).field_S - 1;
                    break L5;
                  } else {
                    var15 = (double)var32 * 0.15 / 2.0 + 1.5707963267948966;
                    var33 = 0;
                    L21: while (true) {
                      if (var33 >= 5) {
                        var32++;
                        continue L20;
                      } else {
                        var34_double = ji.a(65535, (double)((j) this).field_J / 5.0) * var13 * ji.a(65535, var17[var33] + var15);
                        var36 = var13 * ji.a(65535, (double)((j) this).field_J / 5.0) * pj.a(var17[var33] + var15, 32768);
                        int discarded$37 = 119;
                        ((j) this).field_m[this.g()] = new gf(param0, var34_double + (-15.0 + var3), var36 + var5, ji.a(65535, var15 + var17[var33]) * var13, pj.a(var15 + var17[var33], 32768) * var13, 800.0, ((j) this).field_D);
                        var33++;
                        continue L21;
                      }
                    }
                  }
                }
              }
            } else {
              var32 = ((j) this).field_S;
              if (var32 == 1) {
                var9 = var9 + 3.0 * (Math.random() - 0.5);
                int discarded$38 = 119;
                ((j) this).field_m[this.g()] = new gf(param0, var3, var5, var7, var9, 800.0, ((j) this).field_D);
                ((j) this).field_S = 0;
                break L5;
              } else {
                if (var32 != 2) {
                  if (var32 == 3) {
                    var11 = (Math.random() - 0.5) * 1.0 + 1.0;
                    int discarded$39 = 119;
                    ((j) this).field_m[this.g()] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 - var11, 800.0, ((j) this).field_D);
                    int discarded$40 = 119;
                    ((j) this).field_m[this.g()] = new gf(param0, var3, var5, var7, var9, 800.0, ((j) this).field_D);
                    int discarded$41 = 119;
                    ((j) this).field_m[this.g()] = new gf(param0, -10.0 + var3, 6.0 + var5, var7, var9 + var11, 800.0, ((j) this).field_D);
                    ((j) this).field_S = 0;
                    break L5;
                  } else {
                    if (var32 != 4) {
                      if (var32 == 5) {
                        var11 = 0.5 + 2.0 * (Math.random() - 0.5);
                        int discarded$42 = 119;
                        ((j) this).field_m[this.g()] = new gf(24, -10.0 + var3, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                        int discarded$43 = 119;
                        ((j) this).field_m[this.g()] = new gf(param0, var3, var5, var7, var9, 800.0, ((j) this).field_D);
                        int discarded$44 = 119;
                        ((j) this).field_m[this.g()] = new gf(24, var3 - 10.0, var5 + 6.0, var7 + 2.0, var9 + var11, 800.0, ((j) this).field_D);
                        ((j) this).field_S = 0;
                        break L5;
                      } else {
                        if (var32 == 6) {
                          var11 = 1.0 + 1.5 * (-0.5 + Math.random());
                          int discarded$45 = 119;
                          ((j) this).field_m[this.g()] = new gf(24, var3 - 10.0, -6.0 + var5, 2.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                          int discarded$46 = 119;
                          ((j) this).field_m[this.g()] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, ((j) this).field_D);
                          int discarded$47 = 119;
                          ((j) this).field_m[this.g()] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                          ((j) this).field_S = 0;
                          break L5;
                        } else {
                          if (var32 == 7) {
                            var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                            int discarded$48 = 119;
                            ((j) this).field_m[this.g()] = new gf(24, -10.0 + var3, var5 - 6.0, var7 + 2.0, -var11 + var9, 800.0, ((j) this).field_D);
                            int discarded$49 = 119;
                            ((j) this).field_m[this.g()] = new gf(25, var3, var5, 5.0 + var7, var9, 800.0, ((j) this).field_D);
                            int discarded$50 = 119;
                            ((j) this).field_m[this.g()] = new gf(24, var3 - 10.0, var5 + 6.0, 2.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                            ((j) this).field_S = 0;
                            break L5;
                          } else {
                            if (var32 == 8) {
                              var11 = 0.5 + 2.5 * (-0.5 + Math.random());
                              int discarded$51 = 119;
                              ((j) this).field_m[this.g()] = new gf(25, var3 - 10.0, -3.0 + var5, 5.0 + var7, var9 - var11, 800.0, ((j) this).field_D);
                              int discarded$52 = 119;
                              ((j) this).field_m[this.g()] = new gf(24, var3, var5, var7 + 2.0, var9, 800.0, ((j) this).field_D);
                              int discarded$53 = 119;
                              ((j) this).field_m[this.g()] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var11 + var9, 800.0, ((j) this).field_D);
                              ((j) this).field_S = 0;
                              break L5;
                            } else {
                              var11 = 1.0 + (-0.5 + Math.random()) * 2.5;
                              int discarded$54 = 119;
                              ((j) this).field_m[this.g()] = new gf(25, -10.0 + var3, -3.0 + var5, 5.0 + var7, -var11 + var9, 800.0, ((j) this).field_D);
                              int discarded$55 = 119;
                              ((j) this).field_m[this.g()] = new gf(25, var3, var5, var7 + 5.0, var9, 800.0, ((j) this).field_D);
                              int discarded$56 = 119;
                              ((j) this).field_m[this.g()] = new gf(25, var3 - 10.0, var5 + 3.0, 5.0 + var7, var9 + var11, 800.0, ((j) this).field_D);
                              if (((j) this).field_S != 9) {
                                ((j) this).field_S = ((j) this).field_S - 3;
                                break L5;
                              } else {
                                ((j) this).field_S = 0;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = 0.5 + (Math.random() - 0.5) * 1.0;
                      int discarded$57 = 119;
                      ((j) this).field_m[this.g()] = new gf(param0, -10.0 + var3, -6.0 + var5, var7, var9 - var11, 800.0, ((j) this).field_D);
                      int discarded$58 = 119;
                      ((j) this).field_m[this.g()] = new gf(24, var3, var5, 2.0 + var7, var9, 800.0, ((j) this).field_D);
                      int discarded$59 = 119;
                      ((j) this).field_m[this.g()] = new gf(param0, -10.0 + var3, var5 + 6.0, var7, var9 + var11, 800.0, ((j) this).field_D);
                      ((j) this).field_S = 0;
                      break L5;
                    }
                  }
                } else {
                  var11 = 2.0 * (-0.5 + Math.random()) + 0.5;
                  int discarded$60 = 119;
                  ((j) this).field_m[this.g()] = new gf(param0, var3 - 10.0, var5 - 6.0, var7, var9 + var11, 800.0, ((j) this).field_D);
                  int discarded$61 = 119;
                  ((j) this).field_m[this.g()] = new gf(param0, var3 - 10.0, 6.0 + var5, var7, var9 - var11, 800.0, ((j) this).field_D);
                  ((j) this).field_S = 0;
                  break L5;
                }
              }
            }
          }
          return;
        }
    }

    private final void e() {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 800) {
            return;
          } else {
            if (null != ((j) this).field_v[var2]) {
              ((j) this).field_v[var2].c((byte) 114);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, gf param1, bf param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackOut_0_1 = (int)param2.field_o + param2.field_I;
              stackOut_0_2 = (int)param2.field_N - -param2.field_t;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (param1 != null) {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = gf.field_k[param1.field_I];
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = -1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              int discarded$2 = -111;
              this.a(stackIn_3_1, stackIn_3_2, stackIn_3_3, param2);
              if (param2.field_Q == 42) {
                var4_int = param2.e((byte) -122);
                if (0 < var4_int) {
                  this.a(11, var4_int + ((int)param2.field_N - -param2.field_t), -1, param2.field_I + (int)param2.field_o - 5, 27396);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > 97) {
                break L3;
              } else {
                this.a(60, -64, (byte) -16);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("j.V(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final bf a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        bf var8 = null;
        int var9 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var8 = new bf(param2, param4, ((j) this).field_J, param3, param0, param1);
          if (param5) {
            break L0;
          } else {
            ((j) this).field_d = null;
            break L0;
          }
        }
        L1: {
          if (!var8.h(49)) {
            break L1;
          } else {
            sc.a(-1, true, lh.field_l);
            ((j) this).field_U = true;
            break L1;
          }
        }
        L2: {
          L3: {
            if (var8.a(false)) {
              break L3;
            } else {
              if (param1) {
                break L3;
              } else {
                int discarded$2 = 116;
                var7 = this.j();
                break L2;
              }
            }
          }
          var7 = this.e(2183);
          break L2;
        }
        L4: {
          ((j) this).field_n[var7] = var8;
          if (param1) {
            ((j) this).field_n[var7].field_o = (double)param3;
            break L4;
          } else {
            L5: {
              if (param2 == 8) {
                break L5;
              } else {
                if (param2 == 9) {
                  break L5;
                } else {
                  if (param2 == 10) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((j) this).field_n[var7].field_j = ((j) this).field_n[var7].field_j / 3.0;
            break L4;
          }
        }
        ((j) this).field_n[var7].c(5);
        return var8;
    }

    private final void A(int param0) {
        int var2 = 0;
        int var3_int = 0;
        td var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((j) this).field_q == 0) {
            break L0;
          } else {
            if (((j) this).field_q != 1) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var2 = 0;
          if (param0 == 1052688) {
            break L1;
          } else {
            ((j) this).y(53);
            break L1;
          }
        }
        L2: while (true) {
          if (var2 >= 2) {
            var5 = 0;
            var2 = var5;
            L3: while (true) {
              if (var5 >= 3801) {
                return;
              } else {
                var3 = ((j) this).field_hb[var5];
                if (var3 != null) {
                  if (var3.a((byte) -107)) {
                    ((j) this).field_hb[var5] = null;
                    var5++;
                    continue L3;
                  } else {
                    var5++;
                    continue L3;
                  }
                } else {
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            var3_int = 0;
            L4: while (true) {
              if (var3_int >= 20) {
                var2++;
                continue L2;
              } else {
                L5: {
                  vi.field_h[var2][var3_int].a((int)vj.field_f[var2], 3, lh.field_n[var2], -21, 1, (int)tc.field_f[var2]);
                  tc.field_f[var2] = tc.field_f[var2] + 0.3;
                  vj.field_f[var2] = vj.field_f[var2] + 0.6;
                  if (vj.field_f[var2] > 305.0) {
                    nd.field_M = 256;
                    this.a((int)vj.field_f[var2], -84, (int)tc.field_f[var2]);
                    tc.field_f[var2] = (double)(hi.a(640, 4, ((j) this).field_l) + -100);
                    vj.field_f[var2] = (double)(-hi.a(1720, 4, ((j) this).field_l));
                    if (hi.a(5, 4, ((j) this).field_l) < 4) {
                      lh.field_n[var2] = 1052688;
                      break L5;
                    } else {
                      lh.field_n[var2] = 2102528;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (640.0 < tc.field_f[var2]) {
                  tc.field_f[var2] = 0.0;
                  var3_int++;
                  continue L4;
                } else {
                  var3_int++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    private final void a(bf param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            cj.field_e = param0.b((byte) 55);
            ti.field_a = (int)param0.field_N;
            lc.field_m = (int)param0.field_o;
            var3_int = 0;
            L1: while (true) {
              if (ck.field_j.length <= var3_int) {
                ((j) this).field_U = false;
                var5 = 0;
                var3_int = var5;
                L2: while (true) {
                  if (((j) this).field_n.length <= var5) {
                    L3: {
                      stackOut_10_0 = this;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (((j) this).field_U) {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = this;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    L4: {
                      ((j) this).field_ab = stackIn_13_1 != 0;
                      if (!((j) this).field_ab) {
                        break L4;
                      } else {
                        int discarded$2 = 1;
                        this.H();
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L5: {
                      if (null != ((j) this).field_n[var5]) {
                        ((j) this).field_U = ((j) this).field_U | ((j) this).field_n[var5].h(80);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ck.field_j[var3_int] = new td(hi.a(6, 4, ((j) this).field_l), lc.field_m - -hi.a(cj.field_e.field_h, 4, ((j) this).field_l), ti.field_a - -hi.a(cj.field_e.field_c, 4, ((j) this).field_l), -1);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("j.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 0 + ')');
        }
    }

    final void y(int param0) {
        if (0 != sd.field_e) {
            this.G(param0 ^ 6212);
        } else {
            wj.c();
        }
        int discarded$0 = 97;
        this.e();
        int discarded$1 = -1601;
        this.l();
        int discarded$2 = -125;
        this.f();
        int discarded$3 = -3;
        this.p();
        int discarded$4 = -5651;
        this.B();
        int discarded$5 = -64;
        this.x();
        int discarded$6 = -122;
        this.v();
        if (qe.field_a <= 0) {
            this.c(true);
        }
        int discarded$7 = 7;
        this.u();
        this.a((byte) 123);
        int discarded$8 = 1;
        this.t();
        this.g(param0 ^ -4619);
        if (param0 != 6212) {
            this.i(-74);
        }
        if (((j) this).field_W) {
            cb.field_b.b("Cheating!", 270, 465, 16777215, -1, (int)(ji.a(65535, (double)((j) this).field_J / 50.0) * 128.0 + 128.0));
        }
    }

    private final boolean n(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 65) {
            break L0;
          } else {
            ((j) this).field_S = -21;
            break L0;
          }
        }
        L1: {
          L2: {
            if (640 + ((j) this).field_J >= ((j) this).field_G.field_h.length) {
              break L2;
            } else {
              if (((j) this).field_ab) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void I() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (64 <= var2) {
            L1: {
              if (((j) this).field_q == 2) {
                if (hi.a(100, 4, ((j) this).field_l) < 1) {
                  nd.field_M = 255;
                  DrPhlogistonSavesTheEarth.field_K = 255;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    ib.field_a = hi.a(640, 4, ((j) this).field_l);
                    var3++;
                    ch.field_y = hi.a(75, 4, ((j) this).field_l);
                    var2 = var2 != 0 | q.field_e.a(0, 0, ib.field_a, ch.field_y) ? 1 : 0;
                    if (var3 >= 100) {
                      break L1;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  DrPhlogistonSavesTheEarth.field_K = DrPhlogistonSavesTheEarth.field_K - 10;
                  break L1;
                }
              } else {
                DrPhlogistonSavesTheEarth.field_K = DrPhlogistonSavesTheEarth.field_K - 10;
                break L1;
              }
            }
            L3: {
              if (nd.field_M <= 64) {
                break L3;
              } else {
                nd.field_M = nd.field_M - 10;
                break L3;
              }
            }
            return;
          } else {
            i.field_c[var2] = i.field_c[var2] + 10;
            if (430 < i.field_c[var2]) {
              i.field_c[var2] = -20;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final int m() {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = 0; ((j) this).field_hb[var2] != null; var2++) {
        }
        return var2;
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = param0; ((j) this).field_d[var2] != null; var2++) {
        }
        return var2;
    }

    private final void b() {
        int var2 = 0;
        gf var3 = null;
        bf var4 = null;
        int var5 = 0;
        bf var6 = null;
        int var6_int = 0;
        int var8 = 0;
        int var9 = 0;
        gf var10 = null;
        gf var11 = null;
        int var12 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (1400 <= var2) {
            L1: {
              if (((j) this).field_fb >= 0) {
                break L1;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 800) {
                    break L1;
                  } else {
                    L3: {
                      var10 = ((j) this).field_v[var2];
                      var11 = var10;
                      var3 = var11;
                      var11 = var10;
                      var3 = var11;
                      var3 = var10;
                      if (var3 != null) {
                        if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, le.field_c, (int)((j) this).field_N, (int)((j) this).field_D)) {
                          ((j) this).a(((j) this).field_gb - var3.field_t, 0);
                          this.a(ld.field_h[var10.field_I], (int)var3.field_m, gf.field_k[var10.field_I], (int)var3.field_i, 27396);
                          if (uf.field_f[var10.field_I]) {
                            break L3;
                          } else {
                            ((j) this).field_v[var2] = null;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L2;
                  }
                }
              }
            }
            var2 = 0;
            L4: while (true) {
              if (800 <= var2) {
                return;
              } else {
                L5: {
                  var11 = ((j) this).field_v[var2];
                  var3 = var11;
                  if (var3 == null) {
                    break L5;
                  } else {
                    var12 = 0;
                    var5 = var12;
                    L6: while (true) {
                      if (var12 >= 1600) {
                        break L5;
                      } else {
                        L7: {
                          var6 = ((j) this).field_n[var12];
                          if (var6 == null) {
                            break L7;
                          } else {
                            if (wh.field_v[var6.field_Q]) {
                              if (!ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                break L7;
                              } else {
                                this.a(ld.field_h[var11.field_I], (int)var3.field_m, gf.field_k[var11.field_I], (int)var3.field_i, 27396);
                                ((j) this).field_v[var2] = null;
                                break L7;
                              }
                            } else {
                              if (!var6.a(false)) {
                                break L7;
                              } else {
                                if (var6.field_s) {
                                  break L7;
                                } else {
                                  if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var6.b((byte) 55), (int)var6.field_o, (int)var6.field_N)) {
                                    L8: {
                                      this.a(ld.field_h[var11.field_I], (int)var3.field_m, gf.field_k[var11.field_I], (int)var3.field_i, 27396);
                                      if (!var6.a(var3.field_t, 10)) {
                                        break L8;
                                      } else {
                                        this.a(120, var11, var6);
                                        if (cj.field_c[var6.field_Q]) {
                                          break L8;
                                        } else {
                                          ((j) this).field_n[var12].a(7769);
                                          ((j) this).field_n[var12] = null;
                                          break L8;
                                        }
                                      }
                                    }
                                    if (uf.field_f[var11.field_I]) {
                                      break L7;
                                    } else {
                                      ((j) this).field_v[var2] = null;
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var12++;
                        continue L6;
                      }
                    }
                  }
                }
                var2++;
                continue L4;
              }
            }
          } else {
            var3 = ((j) this).field_m[var2];
            var5 = 0;
            L9: while (true) {
              L10: {
                if (var5 >= 1600) {
                  break L10;
                } else {
                  if (((j) this).field_m[var2] == null) {
                    break L10;
                  } else {
                    L11: {
                      var4 = ((j) this).field_n[var5];
                      var6 = var4;
                      var6 = var4;
                      if (var4 == null) {
                        break L11;
                      } else {
                        if (!var4.field_s) {
                          L12: {
                            if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var4.b((byte) 55), (int)var4.field_o, (int)var4.field_N)) {
                              break L12;
                            } else {
                              if (var4.field_D == null) {
                                break L11;
                              } else {
                                if (ne.a(var3.field_g, (int)var3.field_i, (int)var3.field_m, var4.field_D, var4.field_d, var4.field_p)) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          L13: {
                            if (23 != var3.field_I) {
                              var6_int = var3.field_t;
                              break L13;
                            } else {
                              var6_int = 50;
                              if (~var6_int >= ~var3.field_t) {
                                break L13;
                              } else {
                                var6_int = var3.field_t;
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (!var4.a(var6_int, 10)) {
                              break L14;
                            } else {
                              L15: {
                                this.b(var4, 64);
                                this.d((byte) -126, wh.field_x[var4.field_Q]);
                                if (var4.a(false)) {
                                  break L15;
                                } else {
                                  if (0 != qa.field_I[var4.field_Q]) {
                                    ((j) this).field_o = ((j) this).field_o - 1;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                L17: {
                                  if (((j) this).field_o == 0) {
                                    break L17;
                                  } else {
                                    if (qa.field_I[var4.field_Q] >= 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                ((j) this).field_o = hi.a(10, 4, ((j) this).field_l) + 5;
                                var8 = Math.abs(qa.field_I[var4.field_Q]);
                                L18: while (true) {
                                  if (var8 <= 0) {
                                    break L16;
                                  } else {
                                    this.a(123, var4.field_N + (double)hi.a(var4.field_O / 2, 4, ((j) this).field_l), var4.field_o + (double)hi.a(var4.field_m, 4, ((j) this).field_l), false, cj.field_c[var4.field_Q]);
                                    var8--;
                                    continue L18;
                                  }
                                }
                              }
                              L19: {
                                this.a(102, var3, var4);
                                if (th.field_d[var4.field_Q]) {
                                  break L19;
                                } else {
                                  ((j) this).field_n[var5].a(7769);
                                  ((j) this).field_n[var5] = null;
                                  break L19;
                                }
                              }
                              L20: {
                                if (var4.h(-65)) {
                                  int discarded$1 = 0;
                                  this.a(var4);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              if (!var4.a(false)) {
                                break L14;
                              } else {
                                dg.field_c = dg.field_c | 1 << ((j) this).field_q;
                                break L14;
                              }
                            }
                          }
                          if (var3.field_I != 23) {
                            this.a(ld.field_h[var3.field_I], (int)var3.field_m + var3.field_u, gf.field_k[var3.field_I], var3.field_q + (int)var3.field_i, 27396);
                            ((j) this).field_m[var2] = null;
                            break L11;
                          } else {
                            L21: {
                              var3.field_t = var3.field_t - var6_int;
                              if (var3.field_t > 0) {
                                break L21;
                              } else {
                                ((j) this).field_m[var2] = null;
                                break L21;
                              }
                            }
                            this.a(ld.field_h[var3.field_I], var3.field_u + (int)var3.field_m, gf.field_k[var3.field_I], var3.field_q + (int)var3.field_i, 27396);
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var5++;
                    continue L9;
                  }
                }
              }
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (sd.field_e != 2) {
            return;
        }
        int var3 = 2 != ((j) this).field_q ? 305 : 381;
        for (var4 = 0; var4 < 20; var4++) {
            bc.field_d.a(al.field_g[var4], var3 + -bc.field_d.field_w, 256);
        }
        ((j) this).a(-86, -83);
    }

    private final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (var2 >= 3801) {
            L1: {
              if (null != cj.field_e) {
                var5 = 0;
                var2 = var5;
                L2: while (true) {
                  if (ck.field_j.length <= var5) {
                    break L1;
                  } else {
                    if (ck.field_j[var5] != null) {
                      if (null != pe.field_e) {
                        if (ck.field_j[var5].a((byte) -125)) {
                          if (!pe.field_e.field_j) {
                            ck.field_j[var5] = new td(hi.a(6, qk.a(param0, 4), ((j) this).field_l), lc.field_m + hi.a(cj.field_e.field_h, 4, ((j) this).field_l), ti.field_a - -hi.a(cj.field_e.field_c, qk.a(param0, 4), ((j) this).field_l), -1);
                            var5++;
                            continue L2;
                          } else {
                            ck.field_j[var5] = null;
                            var5++;
                            continue L2;
                          }
                        } else {
                          var5++;
                          continue L2;
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            if (((j) this).field_B[var2] != null) {
              if (((j) this).field_B[var2].a((byte) -106)) {
                ((j) this).field_B[var2] = null;
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
          }
        }
    }

    private final int h() {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = 0;
        int var3 = 2;
        while (null != ((j) this).field_v[var2]) {
            var2++;
        }
        return var2;
    }

    private final void l() {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 1600) {
            return;
          } else {
            if (((j) this).field_n[var2] != null) {
              ((j) this).field_n[var2].j(30325);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (160 <= var2) {
            return;
          } else {
            if (((j) this).field_d[var2] != null) {
              ((j) this).field_d[var2].b((byte) -114);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.l((byte) 113);
        td var7 = new td(param0, param3, param1, param2);
        if (param4 != 27396) {
            return;
        }
        ((j) this).field_B[var6] = var7;
    }

    private final int l(byte param0) {
        int var2 = 0;
        ArrayIndexOutOfBoundsException var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= 24) {
          var2 = 0;
          try {
            L0: {
              L1: while (true) {
                if (((j) this).field_B[var2] == null) {
                  break L0;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L2: {
              var3 = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              var2 = 0;
              ((j) this).field_B = new td[((j) this).field_B.length];
              break L2;
            }
          }
          return var2;
        } else {
          return 68;
        }
    }

    private final void a() {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 1600) {
            return;
          } else {
            var3 = ((j) this).field_n[var2];
            if (var3 != null) {
              if (var3.d((byte) 119)) {
                L1: {
                  ((j) this).field_n[var2].a(7769);
                  ((j) this).field_n[var2] = null;
                  if (var3.a(false)) {
                    break L1;
                  } else {
                    if (var3.field_Q == 8) {
                      break L1;
                    } else {
                      if (var3.field_Q == 9) {
                        break L1;
                      } else {
                        if (var3.field_Q != 10) {
                          cj.field_b = cj.field_b | 1 << ((j) this).field_q;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var4 = var3.field_Q;
                if (wh.field_x[var4] < 0) {
                  L2: {
                    if (0 < var3.field_H) {
                      this.c((byte) -61, -wh.field_x[var4]);
                      ((j) this).field_T = ((j) this).field_T + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((j) this).field_X = ((j) this).field_X + 1;
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

    private final int e(int param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = -1 + ((j) this).field_n.length; null != ((j) this).field_n[var2]; var2--) {
        }
        return var2;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        bf var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        L0: {
          L1: {
            var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var2 = ((j) this).field_G.field_c.length;
            var3 = -50;
            var4_int = ((j) this).field_q;
            if (6 != var4_int) {
              if (7 == var4_int) {
                break L1;
              } else {
                if (var4_int != 8) {
                  break L0;
                } else {
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          var3 = -25;
          break L0;
        }
        L2: {
          if (param0 >= 112) {
            break L2;
          } else {
            ((j) this).field_C = 62;
            break L2;
          }
        }
        var5 = 0;
        L3: while (true) {
          if (var5 >= var2) {
            return;
          } else {
            L4: {
              var4 = ((j) this).field_G.field_c[var5];
              if (var4 == null) {
                break L4;
              } else {
                var6 = null;
                if (640 + ((j) this).field_J != var4.field_k) {
                  if (((j) this).field_J != 0) {
                    if (var6 == null) {
                      break L4;
                    } else {
                      if (((bf) var6).field_Q != 38) {
                        break L4;
                      } else {
                        ((bf) var6).field_H = ((bf) var6).field_H * (1 - -((j) this).field_q);
                        break L4;
                      }
                    }
                  } else {
                    if (var6 == null) {
                      break L4;
                    } else {
                      if (((bf) var6).field_Q != 38) {
                        break L4;
                      } else {
                        ((bf) var6).field_H = ((bf) var6).field_H * (1 - -((j) this).field_q);
                        break L4;
                      }
                    }
                  }
                } else {
                  var6 = (Object) (Object) ((j) this).a(var3 + (430 - var4.field_W), false, var4.field_Q, ((j) this).field_J, var4.field_J, true);
                  if (var6 == null) {
                    break L4;
                  } else {
                    if (((bf) var6).field_Q != 38) {
                      break L4;
                    } else {
                      ((bf) var6).field_H = ((bf) var6).field_H * (1 - -((j) this).field_q);
                      break L4;
                    }
                  }
                }
              }
            }
            var5++;
            continue L3;
          }
        }
    }

    final boolean C(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 31578) {
            break L0;
          } else {
            this.b((byte) 45, -85);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!oh.a(param0 ^ 31578)) {
              break L2;
            } else {
              L3: {
                if (0 != ej.field_h) {
                  break L3;
                } else {
                  if (sd.field_a.field_H != 0) {
                    break L3;
                  } else {
                    if (sd.field_a.field_q == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    private final void t() {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (ue.field_b == 0) {
          L0: {
            int discarded$129 = -1;
            this.i();
            if (we.field_f >= 96) {
              stackOut_4_0 = 96;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = we.field_f;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_5_0;
            if (((j) this).field_q == 0) {
              if (-1 + ol.field_i.length <= el.field_tb) {
                break L1;
              } else {
                int discarded$130 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                al.field_a[0].a(var2 - -640 - al.field_a[0].field_h, -al.field_a[0].field_c + 430);
                break L1;
              }
            } else {
              if (3 != ((j) this).field_q) {
                break L1;
              } else {
                if (gm.field_J <= 0) {
                  if (ol.field_i.length <= el.field_tb) {
                    break L1;
                  } else {
                    int discarded$131 = cb.field_b.a(ol.field_i[el.field_tb], 0, 334, 544, 96, 16777215, 0, 2, 1, cb.field_b.field_x);
                    al.field_a[1].a(-al.field_a[1].field_h + var2 + 640, 430 - al.field_a[1].field_c);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 > -75) {
            return;
        }
        int var4 = 1 << param0;
        if (!((var4 & hi.field_j) == 0)) {
            return;
        }
        hi.field_j = hi.field_j | var4;
        ej.field_h = ej.field_h | var4;
        ((j) this).field_I.a((gi) (Object) new fj(param0), 255);
        if (!(((j) this).field_W)) {
            nf.field_x.a((gi) (Object) new je(param0, param1, ((j) this).field_Q, ((j) this).field_P, ((j) this).field_p, ((j) this).field_C), 255);
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 0;
          if (param0 < 0) {
            break L0;
          } else {
            this.a(36, -16, 69, 83, -103);
            break L0;
          }
        }
        L1: while (true) {
          if (2 <= var2) {
            var5 = 0;
            var2 = var5;
            L2: while (true) {
              if (var5 >= 3801) {
                return;
              } else {
                if (((j) this).field_hb[var5] != null) {
                  ((j) this).field_hb[var5].a(true);
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            var3 = 0;
            L3: while (true) {
              if (var3 >= 20) {
                var2++;
                continue L1;
              } else {
                vi.field_h[var2][var3].c(-1);
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    j(int param0) {
        int var2 = 0;
        int var3 = 0;
        ((j) this).field_U = false;
        ((j) this).field_F = false;
        ((j) this).field_ab = false;
        ((j) this).field_W = false;
        ((j) this).field_I = new vd();
        ((j) this).field_o = 10;
        ((j) this).field_c = 0.0;
        ((j) this).field_A = 1;
        ((j) this).field_d = new ib[160];
        ((j) this).field_gb = 255;
        ((j) this).field_t = new int[4];
        ((j) this).field_P = 268435455;
        ((j) this).field_u = 0;
        ((j) this).field_m = new gf[1400];
        ((j) this).field_w = 3;
        ((j) this).field_L = 1;
        ((j) this).field_n = new bf[1600];
        ((j) this).field_bb = 0;
        ((j) this).field_hb = new td[3801];
        ((j) this).field_E = 0;
        ((j) this).field_Z = 0;
        ((j) this).field_O = true;
        ((j) this).field_s = 2147483647;
        ((j) this).field_T = 0;
        ((j) this).field_S = 0;
        ((j) this).field_a = false;
        ((j) this).field_D = 190.0;
        ((j) this).field_B = new td[3801];
        ((j) this).field_R = 0;
        ((j) this).field_X = 0;
        ((j) this).field_b = 0;
        ((j) this).field_h = new ck[3];
        ((j) this).field_j = 0.0;
        ((j) this).field_v = new gf[800];
        ((j) this).field_H = 0;
        ((j) this).field_cb = new int[77];
        ((j) this).field_N = (double)(-am.field_l);
        ((j) this).field_Q = 0;
        ((j) this).field_k = null;
        ((j) this).field_p = ((j) this).field_Q ^ ((j) this).field_P;
        ((j) this).field_C = 268435456 - ((j) this).field_p;
        ((j) this).field_eb = false;
        ((j) this).field_fb = -1;
        ((j) this).field_J = 0;
        ib.field_t = 0;
        qk.field_c = true;
        ej.field_h = 0;
        ((j) this).field_l = new Random(9416L);
        var2 = 0;
        L0: while (true) {
          if (64 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 75) {
                    ((j) this).field_x = -1901789184;
                    gm.field_J = 0;
                    ((j) this).field_g = 15132;
                    qe.field_a = -150;
                    ((j) this).field_f = 0;
                    ((j) this).field_q = -1 + param0;
                    ((j) this).field_M = ag.a(nl.field_r[5], 256, dg.field_e * 24 / 80);
                    ((j) this).field_M.c(0, nl.field_r[5].field_i.length);
                    ((j) this).field_M.f(-1);
                    ((j) this).field_z = ag.a(nl.field_r[7], 256, 48);
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= ((j) this).field_h.length) {
                        ((j) this).a(255, 0);
                        return;
                      } else {
                        ((j) this).field_h[var2] = new ck();
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    wa.field_Q[var2] = hi.a(1280, 4, ((j) this).field_l);
                    we.field_e[var2] = 107 + hi.a(215, 4, ((j) this).field_l);
                    jf.field_ib[var2] = hi.a(65535, 4, ((j) this).field_l);
                    hh.field_a[var2] = hi.a(4096, 4, ((j) this).field_l) * hi.a(2048, 4, ((j) this).field_l) >> 12;
                    wi.field_f[var2] = hi.a(5, 4, ((j) this).field_l);
                    md.field_c[var2] = 15 + hi.a(10, 4, ((j) this).field_l);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                tc.field_f[var2] = (double)(hi.a(640, 4, ((j) this).field_l) - 100);
                vj.field_f[var2] = (double)(-hi.a(1720, 4, ((j) this).field_l));
                var3 = 0;
                L4: while (true) {
                  if (20 <= var3) {
                    if (hi.a(5, 4, ((j) this).field_l) < 4) {
                      lh.field_n[var2] = 1052688;
                      var2++;
                      continue L1;
                    } else {
                      lh.field_n[var2] = 2102528;
                      var2++;
                      continue L1;
                    }
                  } else {
                    vi.field_h[var2][var3] = new ck();
                    var3++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            i.field_c[var2] = hi.a(430, 4, ((j) this).field_l);
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new db(0);
        field_Y = "Logging in...";
    }
}
