/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lm extends js {
    private boolean field_z;
    private int[] field_J;
    private boolean field_K;
    private int[] field_H;
    private kp[] field_S;
    private int field_h;
    private int[][] field_Y;
    private int field_A;
    private int field_m;
    private int field_q;
    private String field_r;
    private tv field_g;
    private int field_v;
    private kp[] field_T;
    private int[][] field_D;
    private ko field_Z;
    private int[] field_P;
    private int[] field_t;
    private int field_L;
    private bl[] field_y;
    private int[] field_B;
    private int[] field_I;
    private boolean field_U;
    private String[] field_Q;
    private int[][] field_O;
    static an field_j;
    private int field_W;
    private io[] field_X;
    private int[] field_M;
    private int field_C;
    private int[] field_p;
    private int field_x;
    private int field_R;
    private int[] field_o;
    private boolean field_i;
    private int field_s;
    private int[] field_w;
    private int[] field_l;
    private int field_G;
    private int field_E;
    private int field_u;
    static int field_V;
    static r field_N;
    private int field_n;
    private int field_k;
    static ld field_F;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (null != ((lm) this).field_X) {
          on.a(40, g.field_a.field_J + -42, 140 * ((lm) this).field_X.length, 50, 8, 65793, 128);
          var2 = -9 / ((param0 - 35) / 36);
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((lm) this).field_X.length) {
              return;
            } else {
              if (this.a(var3, -1)) {
                ((lm) this).field_X[var3].a(this.b(8, var3), this.c(var3, 96), 13800);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static vl a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        vl[] var3 = null;
        int var4 = 0;
        vl var5 = null;
        int var6 = 0;
        vl stackIn_3_0 = null;
        vl stackIn_9_0 = null;
        vl stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_11_0 = null;
        vl stackOut_8_0 = null;
        vl stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2 = nj.a(0, "jagex-last-login-method", param0);
            if (var2 != null) {
              var3 = pb.a(true);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_11_0 = rd.field_h;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, -97)) {
                    stackOut_8_0 = (vl) var5;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = rd.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("lm.R(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -7465 + ')');
        }
        return stackIn_12_0;
    }

    private final void b(int param0, boolean param1) {
        if (param0 == 54) {
            ph.field_a = 0;
        }
        if (param0 == 53) {
            ph.field_a = 1;
            return;
        }
    }

    final void a(ml param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        try {
            var3_int = param0.h((byte) -125);
            ((lm) this).field_Q = new String[var3_int];
            ((lm) this).field_H = new int[var3_int];
            if (param1) {
                field_F = null;
            }
            for (var4 = 0; ((lm) this).field_Q.length > var4; var4++) {
                ((lm) this).field_Q[var4] = param0.a(47);
                ((lm) this).field_H[var4] = param0.h((byte) -120);
            }
            ((lm) this).field_R = param0.h((byte) -112);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Kickabout.field_G;
          var4 = 0;
          if (param1 >= 63) {
            break L0;
          } else {
            ((lm) this).field_Z = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= ((lm) this).field_Z.field_a) {
            return -1;
          } else {
            var5 = ((lm) this).field_X[var4].field_d;
            var6 = ((lm) this).field_X[var4].field_h;
            var7 = -(var5 >> 1) + this.c(var4, 96);
            var8 = -(var6 >> 1) + this.b(8, var4);
            if (this.a(var4, -1)) {
              if (var7 <= param0) {
                if (param0 < var7 + var5) {
                  if (var8 <= param2) {
                    if (var8 - -var6 > param2) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            ((lm) this).field_w = null;
        }
        return ((lm) this).field_R > 0 ? true : false;
    }

    private final int c(int param0, int param1) {
        return 120 - -(param0 * 135);
    }

    private final void b(int param0) {
        int var2 = 20;
        on.a(-(((lm) this).field_A >> 1) + 320, var2, ((lm) this).field_A, ((lm) this).field_n, 8, 0, 128);
        on.a(-(-20 + ((lm) this).field_A >> 1) + 320, var2 - -10, ((lm) this).field_A - 20, 30, 8, 65793, 128);
        un.field_d.d("<u=ffffff>" + jc.field_e[2].toUpperCase() + "</u> " + (null != ((lm) this).field_r ? ((lm) this).field_r : ""), 320, var2 - -30, 16777215, -1);
        var2 = var2 + ii.field_l;
        int var3 = 22;
        int var4 = 80;
        int var5 = 618;
        int var6 = ((lm) this).field_n;
        var2 += 60;
        pt.a(var5, -22914, var3, var6, var4);
        on.a(-(-60 + ((lm) this).field_A >> 1) + 320, 10 + var2, -60 + ((lm) this).field_A, 30, 8, 65793, 128);
        un.field_d.d(lw.field_f.toUpperCase(), 320, var2 + 30, 16777215, -1);
        var2 += 120;
        int discarded$0 = eo.a(250, var2, qe.field_j, ((lm) this).field_O, (String[]) null, 160, 21, ((lm) this).field_Q.length, ((lm) this).field_Q, -1);
        var2 = var2 + 32 * ((lm) this).field_O.length;
        var2 += 20;
        on.a(320 + -(((lm) this).field_A + -60 >> 1), var2 - -10, -60 + ((lm) this).field_A, 30, 8, 65793, 128);
        un.field_d.d(ad.field_b.toUpperCase(), 320, 30 + var2, 16777215, -1);
        var2 += 120;
        int discarded$1 = eo.a(250, var2, d.field_c, ((lm) this).field_D, (String[]) null, 160, 21, ((lm) this).field_Q.length, ((lm) this).field_Q, -1);
        var2 = var2 + ((lm) this).field_D.length * 32;
        var2 += 20;
        on.a(320 + -(-60 + ((lm) this).field_A >> 1), var2 + 10, ((lm) this).field_A - 60, 30, 8, 65793, 128);
        un.field_d.d(oe.field_j.toUpperCase(), 320, var2 - -30, 16777215, -1);
        var2 += 120;
        int discarded$2 = eo.a(250, var2, sr.field_g, ((lm) this).field_Y, new String[2], 160, 21, ((lm) this).field_Q.length, ((lm) this).field_Q, -1);
        var2 = var2 + ((lm) this).field_Y.length * 32;
        var2 += 20;
        ta.e(117);
        if (((lm) this).field_k != 0) {
            if (((lm) this).field_h > ((lm) this).field_k) {
                on.a(((lm) this).field_m, ((lm) this).field_u, 570, 12, 3, ((lm) this).field_i ? 11184810 : ((lm) this).field_s, 128);
                un.field_d.d(qt.field_h, ((lm) this).field_m - -285, -1 + ((lm) this).field_u + 12, ((lm) this).field_i ? 65793 : 11184810, -1);
            }
        }
        if (!(((lm) this).field_h == 0)) {
            on.a(((lm) this).field_G, ((lm) this).field_q, 570, 12, 3, ((lm) this).field_U ? 11184810 : ((lm) this).field_s, 128);
            un.field_d.d(gu.field_Ib, ((lm) this).field_G - -285, 12 + (((lm) this).field_q - 1), !((lm) this).field_U ? 11184810 : 65793, -1);
        }
    }

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        int var7_int = 0;
        double var7 = 0.0;
        int var8 = 0;
        double var9 = 0.0;
        int var9_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tv var14 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_78_0 = null;
        Object stackOut_79_0 = null;
        Object stackOut_80_0 = null;
        Object stackOut_81_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_90_0 = null;
        Object stackOut_91_0 = null;
        Object stackOut_92_0 = null;
        Object stackOut_93_0 = null;
        Object stackOut_94_0 = null;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        var12 = Kickabout.field_G;
        if (!param1) {
          return;
        } else {
          L0: {
            var14 = h.a(17475);
            var4 = -84 / ((param0 - 38) / 60);
            if (((lm) this).field_g != var14) {
              L1: {
                L2: {
                  stackOut_7_0 = this;
                  stackIn_11_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (bt.field_e) {
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (((lm) this).field_g == var14) {
                      break L2;
                    } else {
                      stackOut_9_0 = this;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (hm.a((byte) -66, var14.field_q)) {
                        break L2;
                      } else {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              }
              ((lm) this).field_K = stackIn_12_1 != 0;
              ((lm) this).field_g = var14;
              break L0;
            } else {
              if (bt.field_e) {
                ((lm) this).field_K = false;
                break L0;
              } else {
                ((lm) this).field_r = null;
                break L0;
              }
            }
          }
          L3: {
            if (0 != ((lm) this).field_x) {
              ((lm) this).field_r = vo.a((byte) -18, ks.field_f, new String[1]);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 != ph.field_a) {
              break L4;
            } else {
              ((lm) this).field_L = 400;
              ((lm) this).field_C = 560;
              break L4;
            }
          }
          L5: {
            en.field_o = -1;
            dc.field_c = -1;
            if (ph.field_a == 1) {
              L6: {
                if (-1 == en.field_o) {
                  if (null != ((lm) this).field_T) {
                    stackOut_24_0 = ((lm) this).field_T.length;
                    stackIn_25_0 = stackOut_24_0;
                    break L6;
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    break L6;
                  }
                } else {
                  stackOut_21_0 = en.field_o;
                  stackIn_25_0 = stackOut_21_0;
                  break L6;
                }
              }
              L7: {
                var5_int = stackIn_25_0;
                ((lm) this).field_L = 400;
                stackOut_25_0 = this;
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (7 < var5_int) {
                  stackOut_27_0 = this;
                  stackOut_27_1 = 140;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L7;
                } else {
                  stackOut_26_0 = this;
                  stackOut_26_1 = 0;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L7;
                }
              }
              ((lm) this).field_C = stackIn_28_1 + 440;
              break L5;
            } else {
              break L5;
            }
          }
          L8: {
            if (ph.field_a != 2) {
              break L8;
            } else {
              ((lm) this).field_C = 600;
              ((lm) this).field_L = 400;
              break L8;
            }
          }
          L9: {
            if (((lm) this).field_A == ((lm) this).field_C) {
              break L9;
            } else {
              var5_int = -((lm) this).field_A + ((lm) this).field_C >> 3;
              if (0 == var5_int) {
                ((lm) this).field_A = ((lm) this).field_C;
                break L9;
              } else {
                ((lm) this).field_A = ((lm) this).field_A + var5_int;
                break L9;
              }
            }
          }
          L10: {
            if (((lm) this).field_n == ((lm) this).field_L) {
              break L10;
            } else {
              var5_int = -((lm) this).field_n + ((lm) this).field_L >> 3;
              if (0 != var5_int) {
                ((lm) this).field_n = ((lm) this).field_n + var5_int;
                break L10;
              } else {
                ((lm) this).field_n = ((lm) this).field_L;
                break L10;
              }
            }
          }
          L11: {
            if (!param1) {
              break L11;
            } else {
              ((lm) this).field_Z.a(-21174, this.a(wt.field_x, 77, us.field_j), this.a(dn.field_yb, 88, kf.field_Eb));
              if (((lm) this).field_Z.field_e < 0) {
                break L11;
              } else {
                if (((lm) this).field_Z.c(-1)) {
                  this.b(((lm) this).field_X[((lm) this).field_Z.field_e].field_m, false);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
          }
          var5_int = 0;
          L12: while (true) {
            if (var5_int >= ((lm) this).field_X.length) {
              L13: {
                if (((lm) this).field_T != null) {
                  break L13;
                } else {
                  ((lm) this).field_T = new kp[((lm) this).field_S.length];
                  break L13;
                }
              }
              var5_int = 0;
              L14: while (true) {
                if (var5_int >= ((lm) this).field_T.length) {
                  L15: {
                    L16: {
                      if (ph.field_a == 0) {
                        if (null == ((lm) this).field_y) {
                          break L16;
                        } else {
                          if (((lm) this).field_T == null) {
                            break L16;
                          } else {
                            L17: {
                              var5_int = ((lm) this).field_T.length + -1;
                              if (((lm) this).field_W == 1) {
                                var5_int -= 2;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (2 != ((lm) this).field_W) {
                                break L18;
                              } else {
                                var5_int -= 6;
                                break L18;
                              }
                            }
                            L19: {
                              if (((lm) this).field_W == 3) {
                                var5_int -= 14;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (dc.field_c == -1) {
                                break L20;
                              } else {
                                var5_int = 0;
                                break L20;
                              }
                            }
                            var13 = 0;
                            var6 = var13;
                            L21: while (true) {
                              if (var13 >= ((lm) this).field_y.length) {
                                break L16;
                              } else {
                                if (((lm) this).field_T.length > var5_int) {
                                  L22: {
                                    if (null == ((lm) this).field_y[var13]) {
                                      break L22;
                                    } else {
                                      if (((lm) this).field_z) {
                                        ((lm) this).field_y[var13].a(((lm) this).field_T[var5_int], param1, -109);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  if (-1 == dc.field_c) {
                                    var5_int++;
                                    var13++;
                                    continue L21;
                                  } else {
                                    var13++;
                                    continue L21;
                                  }
                                } else {
                                  var13++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (ph.field_a == 2) {
                          L23: {
                            L24: {
                              stackOut_77_0 = this;
                              stackIn_83_0 = stackOut_77_0;
                              stackIn_78_0 = stackOut_77_0;
                              if (!param1) {
                                break L24;
                              } else {
                                stackOut_78_0 = this;
                                stackIn_83_0 = stackOut_78_0;
                                stackIn_79_0 = stackOut_78_0;
                                if (el.field_A < ((lm) this).field_m) {
                                  break L24;
                                } else {
                                  stackOut_79_0 = this;
                                  stackIn_83_0 = stackOut_79_0;
                                  stackIn_80_0 = stackOut_79_0;
                                  if (570 + ((lm) this).field_m < el.field_A) {
                                    break L24;
                                  } else {
                                    stackOut_80_0 = this;
                                    stackIn_83_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    if (n.field_m < ((lm) this).field_u) {
                                      break L24;
                                    } else {
                                      stackOut_81_0 = this;
                                      stackIn_83_0 = stackOut_81_0;
                                      stackIn_82_0 = stackOut_81_0;
                                      if (12 + ((lm) this).field_u < n.field_m) {
                                        break L24;
                                      } else {
                                        stackOut_82_0 = this;
                                        stackOut_82_1 = 1;
                                        stackIn_84_0 = stackOut_82_0;
                                        stackIn_84_1 = stackOut_82_1;
                                        break L23;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_83_0 = this;
                            stackOut_83_1 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            break L23;
                          }
                          L25: {
                            ((lm) this).field_i = stackIn_84_1 != 0;
                            if (((lm) this).field_h == ii.field_l) {
                              break L25;
                            } else {
                              var5_int = ((lm) this).field_h - ii.field_l >> 3;
                              if (var5_int != 0) {
                                ii.field_l = ii.field_l + var5_int;
                                break L25;
                              } else {
                                if (ii.field_l >= ((lm) this).field_h) {
                                  ii.field_l = ii.field_l - 1;
                                  break L25;
                                } else {
                                  ii.field_l = ii.field_l + 1;
                                  break L25;
                                }
                              }
                            }
                          }
                          L26: {
                            L27: {
                              stackOut_90_0 = this;
                              stackIn_96_0 = stackOut_90_0;
                              stackIn_91_0 = stackOut_90_0;
                              if (!param1) {
                                break L27;
                              } else {
                                stackOut_91_0 = this;
                                stackIn_96_0 = stackOut_91_0;
                                stackIn_92_0 = stackOut_91_0;
                                if (el.field_A < ((lm) this).field_G) {
                                  break L27;
                                } else {
                                  stackOut_92_0 = this;
                                  stackIn_96_0 = stackOut_92_0;
                                  stackIn_93_0 = stackOut_92_0;
                                  if (570 + ((lm) this).field_G < el.field_A) {
                                    break L27;
                                  } else {
                                    stackOut_93_0 = this;
                                    stackIn_96_0 = stackOut_93_0;
                                    stackIn_94_0 = stackOut_93_0;
                                    if (n.field_m < ((lm) this).field_q) {
                                      break L27;
                                    } else {
                                      stackOut_94_0 = this;
                                      stackIn_96_0 = stackOut_94_0;
                                      stackIn_95_0 = stackOut_94_0;
                                      if (((lm) this).field_q + 12 < n.field_m) {
                                        break L27;
                                      } else {
                                        stackOut_95_0 = this;
                                        stackOut_95_1 = 1;
                                        stackIn_97_0 = stackOut_95_0;
                                        stackIn_97_1 = stackOut_95_1;
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_96_0 = this;
                            stackOut_96_1 = 0;
                            stackIn_97_0 = stackOut_96_0;
                            stackIn_97_1 = stackOut_96_1;
                            break L26;
                          }
                          L28: {
                            ((lm) this).field_U = stackIn_97_1 != 0;
                            if (!((lm) this).field_i) {
                              if (!((lm) this).field_U) {
                                break L28;
                              } else {
                                if (1 != nl.field_p) {
                                  break L28;
                                } else {
                                  if (((lm) this).field_h >= 0) {
                                    break L28;
                                  } else {
                                    ((lm) this).field_h = ((lm) this).field_h + 32;
                                    break L28;
                                  }
                                }
                              }
                            } else {
                              if (!((lm) this).field_U) {
                                break L28;
                              } else {
                                if (1 != nl.field_p) {
                                  break L28;
                                } else {
                                  if (((lm) this).field_h >= 0) {
                                    break L28;
                                  } else {
                                    ((lm) this).field_h = ((lm) this).field_h + 32;
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                          L29: {
                            ((lm) this).field_h = ((lm) this).field_h - id.field_v * 32;
                            if (((lm) this).field_h > 0) {
                              ((lm) this).field_h = 0;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          if (((lm) this).field_k > ((lm) this).field_h) {
                            ((lm) this).field_h = ((lm) this).field_k;
                            break L16;
                          } else {
                            var5 = (double)(((lm) this).field_E % 151);
                            var7 = var5 / 2.0;
                            var9 = -37.5 + var7;
                            var11 = (int)Math.abs(var9) << 2;
                            ((lm) this).field_s = var11 << 16 | (var11 << 8 | (var11 | 65793));
                            ((lm) this).field_E = ((lm) this).field_E + 1;
                            break L15;
                          }
                        } else {
                          ii.field_l = 0;
                          ((lm) this).field_h = 0;
                          break L16;
                        }
                      }
                    }
                    var5 = (double)(((lm) this).field_E % 151);
                    var7 = var5 / 2.0;
                    var9 = -37.5 + var7;
                    var11 = (int)Math.abs(var9) << 2;
                    ((lm) this).field_s = var11 << 16 | (var11 << 8 | (var11 | 65793));
                    ((lm) this).field_E = ((lm) this).field_E + 1;
                    break L15;
                  }
                  return;
                } else {
                  L30: {
                    if (null != ((lm) this).field_T[var5_int]) {
                      break L30;
                    } else {
                      ((lm) this).field_T[var5_int] = new kp();
                      ((lm) this).field_T[var5_int].b(false, ((lm) this).field_S[var5_int]);
                      break L30;
                    }
                  }
                  ((lm) this).field_T[var5_int].a(false, ((lm) this).field_S[var5_int]);
                  var5_int++;
                  continue L14;
                }
              }
            } else {
              L31: {
                if (param1) {
                  if (((lm) this).field_Z.field_e == var5_int) {
                    stackOut_50_0 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    break L31;
                  } else {
                    stackOut_49_0 = 0;
                    stackIn_52_0 = stackOut_49_0;
                    break L31;
                  }
                } else {
                  stackOut_47_0 = 0;
                  stackIn_52_0 = stackOut_47_0;
                  break L31;
                }
              }
              L32: {
                var6 = stackIn_52_0;
                if (param1) {
                  if (var6 != 0) {
                    if (((lm) this).field_Z.c(-1)) {
                      stackOut_58_0 = 1;
                      stackIn_60_0 = stackOut_58_0;
                      break L32;
                    } else {
                      stackOut_57_0 = 0;
                      stackIn_60_0 = stackOut_57_0;
                      break L32;
                    }
                  } else {
                    stackOut_55_0 = 0;
                    stackIn_60_0 = stackOut_55_0;
                    break L32;
                  }
                } else {
                  stackOut_53_0 = 0;
                  stackIn_60_0 = stackOut_53_0;
                  break L32;
                }
              }
              L33: {
                var7_int = stackIn_60_0;
                if (var6 != 0) {
                  if (((lm) this).field_Z.a(0)) {
                    stackOut_64_0 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    break L33;
                  } else {
                    stackOut_63_0 = 0;
                    stackIn_66_0 = stackOut_63_0;
                    break L33;
                  }
                } else {
                  stackOut_61_0 = 0;
                  stackIn_66_0 = stackOut_61_0;
                  break L33;
                }
              }
              var8 = stackIn_66_0;
              var9_int = wt.field_x - this.c(var5_int, 96);
              ((lm) this).field_X[var5_int].a(var6 != 0, var7_int != 0, var8 != 0, 16, var9_int);
              var5_int++;
              continue L12;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4_int = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        var7 = Kickabout.field_G;
        if (param0 == 13) {
          L0: {
            if (((lm) this).field_R == 2) {
              stackOut_4_0 = 4;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 5;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var4_int = stackIn_5_0;
          jm.a(var4_int, false, -2);
          return true;
        } else {
          L1: {
            if (param0 != il.field_h) {
              break L1;
            } else {
              L2: {
                if (bt.field_e) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              bt.field_e = stackIn_10_0 != 0;
              break L1;
            }
          }
          L3: {
            if (ph.field_a != 2) {
              break L3;
            } else {
              L4: {
                var8 = ne.field_G;
                var4 = var8;
                if (!var8[rb.field_Kb]) {
                  if (!var8[98]) {
                    if (param0 == 98) {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_20_0 = stackOut_17_0;
                      break L4;
                    }
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_20_0 = stackOut_15_0;
                    break L4;
                  }
                } else {
                  stackOut_13_0 = 1;
                  stackIn_20_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_20_0;
                if (!var8[oc.field_e]) {
                  if (!var8[99]) {
                    if (param0 == 99) {
                      stackOut_26_0 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    } else {
                      stackOut_25_0 = 0;
                      stackIn_28_0 = stackOut_25_0;
                      break L5;
                    }
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_28_0 = stackOut_23_0;
                    break L5;
                  }
                } else {
                  stackOut_21_0 = 1;
                  stackIn_28_0 = stackOut_21_0;
                  break L5;
                }
              }
              L6: {
                var6 = stackIn_28_0;
                if (0 == ((lm) this).field_k) {
                  break L6;
                } else {
                  if (((lm) this).field_h <= ((lm) this).field_k) {
                    break L6;
                  } else {
                    if (var6 != 0) {
                      ((lm) this).field_h = ((lm) this).field_h - 32;
                      return true;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              if (0 <= ((lm) this).field_h) {
                break L3;
              } else {
                if (var5 != 0) {
                  ((lm) this).field_h = ((lm) this).field_h + 32;
                  return true;
                } else {
                  break L3;
                }
              }
            }
          }
          L7: {
            if (param1 < -5) {
              break L7;
            } else {
              ((lm) this).field_q = 93;
              break L7;
            }
          }
          if (null == ((lm) this).field_Z) {
            return false;
          } else {
            L8: {
              ((lm) this).field_Z.a(0, true);
              if (0 <= ((lm) this).field_Z.field_e) {
                L9: while (true) {
                  if (this.a(((lm) this).field_Z.field_e, -1)) {
                    break L8;
                  } else {
                    if (96 != param0) {
                      ((lm) this).field_Z.field_e = (((lm) this).field_Z.field_e - -1) % ((lm) this).field_Z.field_a;
                      continue L9;
                    } else {
                      ((lm) this).field_Z.field_e = (((lm) this).field_Z.field_a + (((lm) this).field_Z.field_e - 1)) % ((lm) this).field_Z.field_a;
                      continue L9;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (((lm) this).field_Z.field_e < 0) {
                break L10;
              } else {
                if (!((lm) this).field_Z.c(-1)) {
                  break L10;
                } else {
                  this.b(((lm) this).field_X[((lm) this).field_Z.field_e].field_m, false);
                  break L10;
                }
              }
            }
            return true;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        return true;
    }

    lm(ml param0) {
        super(-2);
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((lm) this).field_h = ii.field_l;
        ((lm) this).field_C = 560;
        ((lm) this).field_L = 400;
        ((lm) this).field_m = 32;
        ((lm) this).field_q = 63;
        ((lm) this).field_E = 0;
        ((lm) this).field_u = 403;
        ((lm) this).field_n = 400;
        ((lm) this).field_A = 560;
        ((lm) this).field_G = 32;
        ((lm) this).field_s = 0;
        try {
          L0: {
            L1: {
              bt.field_e = false;
              hr.b(22);
              op.a(-363021503);
              var5 = new int[]{54, 53, 52, 12};
              var2_array = var5;
              if (var2_array == null) {
                break L1;
              } else {
                ((lm) this).field_X = new io[var5.length];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var5.length) {
                    ((lm) this).field_Z = new ko(((lm) this).field_X.length);
                    ((lm) this).field_Z.a(true, this.a(wt.field_x, 98, us.field_j), (byte) -127);
                    break L1;
                  } else {
                    ((lm) this).field_X[var3] = new io(120, 7126504, var5[var3]);
                    var3++;
                    continue L2;
                  }
                }
              }
            }
            ((lm) this).a(param0, false);
            ((lm) this).a(-85, param0);
            ((lm) this).a(param0, (byte) 116);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("lm.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final int f(int param0) {
        if (param0 <= 35) {
            return -3;
        }
        return ((lm) this).field_W;
    }

    final void a(ml param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_41_0 = null;
        String stackIn_44_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        String stackIn_60_0 = null;
        String stackIn_63_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        String stackOut_59_0 = null;
        String stackOut_58_0 = null;
        String stackOut_62_0 = null;
        String stackOut_61_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        String stackOut_40_0 = null;
        String stackOut_39_0 = null;
        String stackOut_43_0 = null;
        String stackOut_42_0 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param0.h((byte) -119);
            var4 = 17 % ((50 - param1) / 55);
            ((lm) this).field_S = new kp[var3_int];
            var5 = 0;
            L1: while (true) {
              if (((lm) this).field_S.length <= var5) {
                L2: {
                  ((lm) this).field_W = param0.h((byte) -108);
                  ((lm) this).field_v = param0.a((byte) 81);
                  ((lm) this).field_x = param0.a((byte) 81);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (param0.h((byte) -128) != 1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L2;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                }
                L3: {
                  ((lm) this).field_z = stackIn_7_1 != 0;
                  if (dc.field_c == -1) {
                    stackOut_9_0 = (int)Math.pow(2.0, (double)((lm) this).field_W);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = dc.field_c;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var5 = stackIn_10_0;
                    if (((lm) this).field_y == null) {
                      break L5;
                    } else {
                      if (((lm) this).field_y.length != var5) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((lm) this).field_y = new bl[var5];
                  break L4;
                }
                L6: {
                  var6 = 4;
                  if (4 < ((lm) this).field_y.length) {
                    stackOut_16_0 = 20;
                    stackIn_17_0 = stackOut_16_0;
                    break L6;
                  } else {
                    stackOut_15_0 = 79;
                    stackIn_17_0 = stackOut_15_0;
                    break L6;
                  }
                }
                L7: {
                  var7 = stackIn_17_0;
                  if (((lm) this).field_T == null) {
                    break L7;
                  } else {
                    L8: {
                      var8 = ((lm) this).field_T.length + -1;
                      if (((lm) this).field_W == 1) {
                        var8 -= 2;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (((lm) this).field_W == 2) {
                        var8 -= 6;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (((lm) this).field_W == 3) {
                        var8 -= 14;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (dc.field_c == -1) {
                        break L11;
                      } else {
                        var8 = 0;
                        break L11;
                      }
                    }
                    var9 = 0;
                    L12: while (true) {
                      if (~var9 <= ~var6) {
                        var9 = 0;
                        L13: while (true) {
                          if (~var9 <= ~var6) {
                            break L7;
                          } else {
                            L14: {
                              if (var9 - -var6 < var5) {
                                L15: {
                                  if (var5 == 8) {
                                    stackOut_53_0 = var6;
                                    stackIn_54_0 = stackOut_53_0;
                                    break L15;
                                  } else {
                                    stackOut_52_0 = -var6 + var5;
                                    stackIn_54_0 = stackOut_52_0;
                                    break L15;
                                  }
                                }
                                L16: {
                                  var10 = stackIn_54_0;
                                  stackOut_54_0 = -(jt.field_yb >> 1);
                                  stackOut_54_1 = 410 + 90 * var9;
                                  stackOut_54_2 = 90 * (var10 >> 1);
                                  stackIn_56_0 = stackOut_54_0;
                                  stackIn_56_1 = stackOut_54_1;
                                  stackIn_56_2 = stackOut_54_2;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  stackIn_55_2 = stackOut_54_2;
                                  if (var10 % 2 != 0) {
                                    stackOut_56_0 = stackIn_56_0;
                                    stackOut_56_1 = stackIn_56_1;
                                    stackOut_56_2 = stackIn_56_2;
                                    stackOut_56_3 = 0;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    stackIn_57_2 = stackOut_56_2;
                                    stackIn_57_3 = stackOut_56_3;
                                    break L16;
                                  } else {
                                    stackOut_55_0 = stackIn_55_0;
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = stackIn_55_2;
                                    stackOut_55_3 = 45;
                                    stackIn_57_0 = stackOut_55_0;
                                    stackIn_57_1 = stackOut_55_1;
                                    stackIn_57_2 = stackOut_55_2;
                                    stackIn_57_3 = stackOut_55_3;
                                    break L16;
                                  }
                                }
                                L17: {
                                  var11 = stackIn_57_0 + (stackIn_57_1 - (stackIn_57_2 - stackIn_57_3));
                                  var12 = 268;
                                  if (-1 != ((lm) this).field_T[var8].field_c[0]) {
                                    stackOut_59_0 = ((lm) this).field_Q[((lm) this).field_T[var8].field_c[0]];
                                    stackIn_60_0 = stackOut_59_0;
                                    break L17;
                                  } else {
                                    stackOut_58_0 = "";
                                    stackIn_60_0 = stackOut_58_0;
                                    break L17;
                                  }
                                }
                                L18: {
                                  var18 = stackIn_60_0;
                                  var13 = var18;
                                  if (-1 != ((lm) this).field_T[var8].field_c[1]) {
                                    stackOut_62_0 = ((lm) this).field_Q[((lm) this).field_T[var8].field_c[1]];
                                    stackIn_63_0 = stackOut_62_0;
                                    break L18;
                                  } else {
                                    stackOut_61_0 = "";
                                    stackIn_63_0 = stackOut_61_0;
                                    break L18;
                                  }
                                }
                                var19 = stackIn_63_0;
                                var14 = var19;
                                ((lm) this).field_y[var9 + var6] = new bl(((lm) this).field_T[var8], new String[2], var11, var12 - 15, var8);
                                if (dc.field_c != -1) {
                                  break L14;
                                } else {
                                  var8++;
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            var9++;
                            continue L13;
                          }
                        }
                      } else {
                        L19: {
                          if (var5 <= var9) {
                            break L19;
                          } else {
                            L20: {
                              if (~var6 >= ~var5) {
                                stackOut_34_0 = var6;
                                stackIn_35_0 = stackOut_34_0;
                                break L20;
                              } else {
                                stackOut_33_0 = var5;
                                stackIn_35_0 = stackOut_33_0;
                                break L20;
                              }
                            }
                            L21: {
                              var10 = stackIn_35_0;
                              if (0 == var10 % 2) {
                                stackOut_37_0 = 45;
                                stackIn_38_0 = stackOut_37_0;
                                break L21;
                              } else {
                                stackOut_36_0 = 0;
                                stackIn_38_0 = stackOut_36_0;
                                break L21;
                              }
                            }
                            L22: {
                              var11 = stackIn_38_0 + (-(90 * (var10 >> 1)) + 90 * var9) + 410 - (jt.field_yb >> 1);
                              var12 = 90 + var7;
                              if (((lm) this).field_T[var8].field_c[0] != -1) {
                                stackOut_40_0 = ((lm) this).field_Q[((lm) this).field_T[var8].field_c[0]];
                                stackIn_41_0 = stackOut_40_0;
                                break L22;
                              } else {
                                stackOut_39_0 = "";
                                stackIn_41_0 = stackOut_39_0;
                                break L22;
                              }
                            }
                            L23: {
                              var16 = stackIn_41_0;
                              var13 = var16;
                              if (-1 == ((lm) this).field_T[var8].field_c[1]) {
                                stackOut_43_0 = "";
                                stackIn_44_0 = stackOut_43_0;
                                break L23;
                              } else {
                                stackOut_42_0 = ((lm) this).field_Q[((lm) this).field_T[var8].field_c[1]];
                                stackIn_44_0 = stackOut_42_0;
                                break L23;
                              }
                            }
                            var17 = stackIn_44_0;
                            var14 = var17;
                            ((lm) this).field_y[var9] = new bl(((lm) this).field_T[var8], new String[2], var11, -15 + var12, var8);
                            if (dc.field_c != -1) {
                              break L19;
                            } else {
                              var8++;
                              break L19;
                            }
                          }
                        }
                        var9++;
                        continue L12;
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((lm) this).field_S[var5] = new kp();
                ((lm) this).field_S[var5].a((byte) -119, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var3;
            stackOut_67_1 = new StringBuilder().append("lm.C(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L24;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L24;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 8) {
            ((lm) this).field_x = -76;
        }
        return -20 + g.field_a.field_J;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        cn stackIn_1_0 = null;
        StringBuilder stackIn_1_1 = null;
        cn stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        cn stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        String stackIn_3_2 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        cn stackOut_0_0 = null;
        StringBuilder stackOut_0_1 = null;
        cn stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        String stackOut_2_2 = null;
        cn stackOut_1_0 = null;
        StringBuilder stackOut_1_1 = null;
        String stackOut_1_2 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var13 = Kickabout.field_G;
          on.a(-(((lm) this).field_A >> 1) + 320, 20, ((lm) this).field_A, ((lm) this).field_n, 8, 0, 128);
          on.a(320 - (((lm) this).field_A - 20 >> 1), 30, -20 + ((lm) this).field_A, 30, 8, 65793, 128);
          stackOut_0_0 = un.field_d;
          stackOut_0_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[0].toUpperCase()).append("</u> ");
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((lm) this).field_r == null) {
            stackOut_2_0 = (cn) (Object) stackIn_2_0;
            stackOut_2_1 = (StringBuilder) (Object) stackIn_2_1;
            stackOut_2_2 = "";
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (cn) (Object) stackIn_1_0;
            stackOut_1_1 = (StringBuilder) (Object) stackIn_1_1;
            stackOut_1_2 = ((lm) this).field_r;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((cn) (Object) stackIn_3_0).d(stackIn_3_2, 320, 50, 16777215, -1);
        pt.a(640, -22914, 0, 88, 60);
        on.a(224, 66, 372, 50, 8, 65793, 196);
        un.field_d.d(vo.a((byte) -18, wk.field_e, new String[1]), 410, 82, 16777215, -1);
        var2 = 46;
        on.a(var2, 66, 175, 50, 8, 65793, 196);
        un.field_d.d(nk.field_g, var2 - -87, 82, 16777215, -1);
        ta.e(120);
        var3 = 17;
        var4 = -var3 + 88;
        var5 = 175;
        var6 = 0;
        L1: while (true) {
          if (((lm) this).field_Q.length <= var6) {
            var6 = 0;
            L2: while (true) {
              if (var6 >= 16) {
                L3: {
                  on.a(224, 90, 372, 320, 65793, 96);
                  if (((lm) this).field_z) {
                    if (null != ((lm) this).field_y) {
                      var6 = 0;
                      L4: while (true) {
                        if (var6 >= ((lm) this).field_y.length) {
                          break L3;
                        } else {
                          if (null == ((lm) this).field_y[var6]) {
                            jr.a(410, -89, 250);
                            var6++;
                            continue L4;
                          } else {
                            ((lm) this).field_y[var6].a(98);
                            var6++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    int discarded$1 = un.field_d.a(vo.a((byte) -18, rv.field_a, new String[1]), 224, 90, 372, 320, 16777215, -1, 1, 1, 0);
                    break L3;
                  }
                }
                return;
              } else {
                on.c(var2, 2 + var3 + var6 + var4, 175, 65793, -(var6 << 3) + 128);
                var6++;
                continue L2;
              }
            }
          } else {
            var4 = var4 + (var3 + 2);
            on.a(var2, var4, var5, var3, 65793, 96);
            if (((lm) this).field_Q.length > var6) {
              L5: {
                var14 = ((lm) this).field_Q[var6].toLowerCase();
                var7 = var14;
                if ((((lm) this).field_v >> var6 & 1) != 1) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L5;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L5;
                }
              }
              L6: {
                var8 = stackIn_10_0;
                if (var8 != 0) {
                  var14 = var7;
                  var7 = vo.a((byte) -18, ig.field_e, new String[1]);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var8 != 0) {
                  stackOut_15_0 = 5592405;
                  stackIn_16_0 = stackOut_15_0;
                  break L7;
                } else {
                  stackOut_14_0 = 16777215;
                  stackIn_16_0 = stackOut_14_0;
                  break L7;
                }
              }
              L8: {
                var9 = stackIn_16_0;
                pt.a(var2 + var5, -22914, 20 + var2, var4 + 20, var4);
                if (-20 + var5 >= un.field_d.a(var7)) {
                  un.field_d.d(var7, var2 - -(var5 >> 1), var4 - -13, var9, -1);
                  break L8;
                } else {
                  var10 = (double)(un.field_d.a(var7) + 20 + -var5);
                  var12 = -(int)(var10 * Math.sin((double)((lm) this).field_E / 50.0) - 5.0);
                  un.field_d.d(var7, var2 + (var5 >> 1) - -var12, 13 + var4, var9, -1);
                  break L8;
                }
              }
              L9: {
                ta.e(127);
                if (var8 == 0) {
                  break L9;
                } else {
                  on.e(-(un.field_d.a(var7) >> 1) + (var5 >> 1) + (var2 - 8), 8 + var4, 8 + ((var5 >> 1) + var2) - -(un.field_d.a(var7) >> 1), var4 - -8, 11141377, 196);
                  on.e(-(un.field_d.a(var7) >> 1) + ((var5 >> 1) + var2 + -8), var4 - -9, (var5 >> 1) + (var2 - -(un.field_d.a(var7) >> 1)) + 8, var4 + 9, 11141377, 196);
                  break L9;
                }
              }
              b.field_U[((lm) this).field_H[var6]].c(var2, var4 + -1);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        kp var14 = null;
        int var15 = 0;
        kp var15_ref_kp = null;
        int var16 = 0;
        String var16_ref_String = null;
        int var17 = 0;
        String var17_ref_String = null;
        String var18 = null;
        int var19 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        cn stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        cn stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        cn stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        kp[] stackIn_48_0 = null;
        kp[] stackIn_49_0 = null;
        kp[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        kp[] stackIn_52_0 = null;
        kp[] stackIn_53_0 = null;
        kp[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_0 = 0;
        int[] stackIn_55_1 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_56_1 = null;
        int stackIn_57_0 = 0;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        String[] stackIn_59_0 = null;
        int[] stackIn_59_1 = null;
        String[] stackIn_60_0 = null;
        int[] stackIn_60_1 = null;
        String[] stackIn_61_0 = null;
        int[] stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        String stackIn_63_0 = null;
        int[] stackIn_64_0 = null;
        int[] stackIn_65_0 = null;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_68_0 = null;
        int[] stackIn_68_1 = null;
        String[] stackIn_69_0 = null;
        int[] stackIn_69_1 = null;
        String[] stackIn_70_0 = null;
        int[] stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        String stackIn_72_0 = null;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int stackIn_82_4 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int stackIn_83_4 = 0;
        int stackIn_83_5 = 0;
        int[] stackIn_100_0 = null;
        int[] stackIn_101_0 = null;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_105_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        cn stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        cn stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        cn stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int[] stackOut_99_0 = null;
        int[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        String stackOut_104_0 = null;
        String stackOut_103_0 = null;
        kp[] stackOut_47_0 = null;
        kp[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        kp[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        kp[] stackOut_51_0 = null;
        kp[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        kp[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int[] stackOut_54_1 = null;
        int stackOut_56_0 = 0;
        int[] stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_55_0 = 0;
        int[] stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        String stackOut_62_0 = null;
        String[] stackOut_58_0 = null;
        int[] stackOut_58_1 = null;
        String[] stackOut_60_0 = null;
        int[] stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        String[] stackOut_59_0 = null;
        int[] stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        String stackOut_61_0 = null;
        int[] stackOut_63_0 = null;
        int[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_71_0 = null;
        String[] stackOut_67_0 = null;
        int[] stackOut_67_1 = null;
        String[] stackOut_69_0 = null;
        int[] stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        String[] stackOut_68_0 = null;
        int[] stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        String stackOut_70_0 = null;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int stackOut_82_4 = 0;
        int stackOut_82_5 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int stackOut_81_4 = 0;
        int stackOut_81_5 = 0;
        L0: {
          var19 = Kickabout.field_G;
          if (en.field_o != -1) {
            stackOut_4_0 = en.field_o;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (((lm) this).field_T == null) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((lm) this).field_T.length;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var2 = stackIn_5_0;
          if (var2 <= 7) {
            stackOut_7_0 = 20;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = 300;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_8_0;
          var4 = 0;
          on.a(-(((lm) this).field_A >> 1) + 320, 20, ((lm) this).field_A, ((lm) this).field_n, 8, 0, 128);
          on.a(-(-var3 + ((lm) this).field_A >> 1) + 320, 30, ((lm) this).field_A + -var3, 30, 8, 65793, 128);
          stackOut_8_0 = un.field_d;
          stackOut_8_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[1].toUpperCase()).append("</u> ");
          stackIn_10_0 = stackOut_8_0;
          stackIn_10_1 = stackOut_8_1;
          stackIn_9_0 = stackOut_8_0;
          stackIn_9_1 = stackOut_8_1;
          if (null != ((lm) this).field_r) {
            stackOut_10_0 = (cn) (Object) stackIn_10_0;
            stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
            stackOut_10_2 = ((lm) this).field_r;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            stackIn_11_2 = stackOut_10_2;
            break L2;
          } else {
            stackOut_9_0 = (cn) (Object) stackIn_9_0;
            stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
            stackOut_9_2 = "";
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_11_2 = stackOut_9_2;
            break L2;
          }
        }
        L3: {
          ((cn) (Object) stackIn_11_0).d(stackIn_11_2, 320, 50, 16777215, -1);
          var5 = 110;
          var6 = 40;
          var7 = (var5 << 1) / 3;
          stackOut_11_0 = var6;
          stackIn_17_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (7 < var2) {
            stackOut_17_0 = stackIn_17_0;
            stackOut_17_1 = 5;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L3;
          } else {
            stackOut_12_0 = stackIn_12_0;
            stackIn_14_0 = stackOut_12_0;
            stackIn_13_0 = stackOut_12_0;
            if (var2 <= 3) {
              stackOut_14_0 = stackIn_14_0;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var2 > 1) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 20;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L3;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                break L3;
              }
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 10;
              stackIn_18_0 = stackOut_13_0;
              stackIn_18_1 = stackOut_13_1;
              break L3;
            }
          }
        }
        L4: {
          var8 = stackIn_18_0 - -stackIn_18_1;
          if (var2 <= 7) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L4;
          } else {
            stackOut_19_0 = var7;
            stackIn_21_0 = stackOut_19_0;
            break L4;
          }
        }
        L5: {
          stackOut_21_0 = -stackIn_21_0;
          stackIn_23_0 = stackOut_21_0;
          stackIn_22_0 = stackOut_21_0;
          if (var2 <= 3) {
            stackOut_23_0 = stackIn_23_0;
            stackOut_23_1 = 0;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            break L5;
          } else {
            stackOut_22_0 = stackIn_22_0;
            stackOut_22_1 = var7;
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            break L5;
          }
        }
        L6: {
          stackOut_24_0 = stackIn_24_0 + -stackIn_24_1;
          stackIn_26_0 = stackOut_24_0;
          stackIn_25_0 = stackOut_24_0;
          if (1 < var2) {
            stackOut_26_0 = stackIn_26_0;
            stackOut_26_1 = var7;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            break L6;
          } else {
            stackOut_25_0 = stackIn_25_0;
            stackOut_25_1 = 0;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            break L6;
          }
        }
        L7: {
          var9 = stackIn_27_0 + (-stackIn_27_1 + 320);
          if (7 < var2) {
            stackOut_29_0 = var8;
            stackIn_30_0 = stackOut_29_0;
            break L7;
          } else {
            stackOut_28_0 = 0;
            stackIn_30_0 = stackOut_28_0;
            break L7;
          }
        }
        L8: {
          stackOut_30_0 = -stackIn_30_0;
          stackIn_32_0 = stackOut_30_0;
          stackIn_31_0 = stackOut_30_0;
          if (var2 > 1) {
            stackOut_32_0 = stackIn_32_0;
            stackOut_32_1 = var8;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            break L8;
          } else {
            stackOut_31_0 = stackIn_31_0;
            stackOut_31_1 = 0;
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            break L8;
          }
        }
        L9: {
          stackOut_33_0 = stackIn_33_0 + -stackIn_33_1 + 210;
          stackIn_35_0 = stackOut_33_0;
          stackIn_34_0 = stackOut_33_0;
          if (var2 > 3) {
            stackOut_35_0 = stackIn_35_0;
            stackOut_35_1 = var8;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            break L9;
          } else {
            stackOut_34_0 = stackIn_34_0;
            stackOut_34_1 = 0;
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            break L9;
          }
        }
        L10: {
          var10 = stackIn_36_0 - stackIn_36_1;
          var11 = var9;
          var12 = var10;
          var13 = 3;
          if (var2 <= 7) {
            var13--;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (var2 > 3) {
            break L11;
          } else {
            var13--;
            break L11;
          }
        }
        L12: {
          if (var2 <= 1) {
            var13--;
            break L12;
          } else {
            break L12;
          }
        }
        un.field_d.d(kp.field_g[var13].toLowerCase(), var11, var12 + (-(var6 >> 1) - 4), 16777215, -1);
        var14_int = 0;
        L13: while (true) {
          if (var2 <= var14_int) {
            L14: {
              var12 = var12 - var8;
              if (null == ((lm) this).field_T) {
                break L14;
              } else {
                if (((lm) this).field_T[((lm) this).field_T.length - 1].field_f >= 5) {
                  L15: {
                    var14 = ((lm) this).field_T[((lm) this).field_T.length - 1];
                    var15 = (var6 << 1) + (var6 >> 1);
                    var12 = var12 + var15;
                    pt.a(var11 - -var5, -22914, var11 - var5, -(var6 >> 1) + var12, -var6 + var12);
                    on.a(-(un.field_d.a(eq.field_g) >> 1) + var11 - 10, var12 - var6, 20 + un.field_d.a(eq.field_g), var6, 8, 65793, 128);
                    un.field_d.d(eq.field_g, var11, var12 + (-(var6 >> 1) - 4), -1, -1);
                    ta.e(126);
                    on.a(-(var5 >> 1) + var11, -(var6 >> 1) + var12, var5, var6, 65793, 128);
                    kb.field_E[6].c(var11 + (var5 >> 1) - (kb.field_E[6].field_o - 4), -(kb.field_E[6].field_v >> 1) + var12);
                    var16 = var14.field_o;
                    if (var16 >= 0) {
                      break L15;
                    } else {
                      if (var14.field_f >= 5) {
                        var16 = var14.field_k;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    stackOut_99_0 = var14.field_c;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_100_0 = stackOut_99_0;
                    if (var14.field_d) {
                      stackOut_101_0 = (int[]) (Object) stackIn_101_0;
                      stackOut_101_1 = 1 + -var16;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      break L16;
                    } else {
                      stackOut_100_0 = (int[]) (Object) stackIn_100_0;
                      stackOut_100_1 = var16;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      break L16;
                    }
                  }
                  L17: {
                    var17 = stackIn_102_0[stackIn_102_1];
                    if (var17 > -1) {
                      stackOut_104_0 = ((lm) this).field_Q[var17];
                      stackIn_105_0 = stackOut_104_0;
                      break L17;
                    } else {
                      stackOut_103_0 = hi.field_w;
                      stackIn_105_0 = stackOut_103_0;
                      break L17;
                    }
                  }
                  var18 = stackIn_105_0;
                  un.field_d.d(var18, 10 + -(kb.field_E[6].field_o >> 1) + var11, 4 + var12, 16777215, -1);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            return;
          } else {
            L18: {
              if (null == ((lm) this).field_T) {
                break L18;
              } else {
                L19: {
                  stackOut_47_0 = ((lm) this).field_T;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_48_0 = stackOut_47_0;
                  if (en.field_o != -1) {
                    stackOut_49_0 = (kp[]) (Object) stackIn_49_0;
                    stackOut_49_1 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    break L19;
                  } else {
                    stackOut_48_0 = (kp[]) (Object) stackIn_48_0;
                    stackOut_48_1 = var14_int;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    break L19;
                  }
                }
                if (stackIn_50_0[stackIn_50_1] == null) {
                  break L18;
                } else {
                  L20: {
                    stackOut_51_0 = ((lm) this).field_T;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (en.field_o == -1) {
                      stackOut_53_0 = (kp[]) (Object) stackIn_53_0;
                      stackOut_53_1 = var14_int;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      break L20;
                    } else {
                      stackOut_52_0 = (kp[]) (Object) stackIn_52_0;
                      stackOut_52_1 = 0;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L20;
                    }
                  }
                  L21: {
                    var15_ref_kp = stackIn_54_0[stackIn_54_1];
                    stackOut_54_0 = -1;
                    stackOut_54_1 = var15_ref_kp.field_c;
                    stackIn_56_0 = stackOut_54_0;
                    stackIn_56_1 = stackOut_54_1;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    if (!var15_ref_kp.field_d) {
                      stackOut_56_0 = stackIn_56_0;
                      stackOut_56_1 = (int[]) (Object) stackIn_56_1;
                      stackOut_56_2 = 0;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      stackIn_57_2 = stackOut_56_2;
                      break L21;
                    } else {
                      stackOut_55_0 = stackIn_55_0;
                      stackOut_55_1 = (int[]) (Object) stackIn_55_1;
                      stackOut_55_2 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_57_1 = stackOut_55_1;
                      stackIn_57_2 = stackOut_55_2;
                      break L21;
                    }
                  }
                  L22: {
                    if (stackIn_57_0 == stackIn_57_1[stackIn_57_2]) {
                      stackOut_62_0 = "";
                      stackIn_63_0 = stackOut_62_0;
                      break L22;
                    } else {
                      L23: {
                        stackOut_58_0 = ((lm) this).field_Q;
                        stackOut_58_1 = var15_ref_kp.field_c;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        if (var15_ref_kp.field_d) {
                          stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                          stackOut_60_1 = (int[]) (Object) stackIn_60_1;
                          stackOut_60_2 = 1;
                          stackIn_61_0 = stackOut_60_0;
                          stackIn_61_1 = stackOut_60_1;
                          stackIn_61_2 = stackOut_60_2;
                          break L23;
                        } else {
                          stackOut_59_0 = (String[]) (Object) stackIn_59_0;
                          stackOut_59_1 = (int[]) (Object) stackIn_59_1;
                          stackOut_59_2 = 0;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_61_1 = stackOut_59_1;
                          stackIn_61_2 = stackOut_59_2;
                          break L23;
                        }
                      }
                      stackOut_61_0 = stackIn_61_0[stackIn_61_1[stackIn_61_2]];
                      stackIn_63_0 = stackOut_61_0;
                      break L22;
                    }
                  }
                  L24: {
                    var16_ref_String = stackIn_63_0;
                    stackOut_63_0 = var15_ref_kp.field_c;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (!var15_ref_kp.field_d) {
                      stackOut_65_0 = (int[]) (Object) stackIn_65_0;
                      stackOut_65_1 = 1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      break L24;
                    } else {
                      stackOut_64_0 = (int[]) (Object) stackIn_64_0;
                      stackOut_64_1 = 0;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      break L24;
                    }
                  }
                  L25: {
                    if (stackIn_66_0[stackIn_66_1] == -1) {
                      stackOut_71_0 = "";
                      stackIn_72_0 = stackOut_71_0;
                      break L25;
                    } else {
                      L26: {
                        stackOut_67_0 = ((lm) this).field_Q;
                        stackOut_67_1 = var15_ref_kp.field_c;
                        stackIn_69_0 = stackOut_67_0;
                        stackIn_69_1 = stackOut_67_1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        if (var15_ref_kp.field_d) {
                          stackOut_69_0 = (String[]) (Object) stackIn_69_0;
                          stackOut_69_1 = (int[]) (Object) stackIn_69_1;
                          stackOut_69_2 = 0;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          stackIn_70_2 = stackOut_69_2;
                          break L26;
                        } else {
                          stackOut_68_0 = (String[]) (Object) stackIn_68_0;
                          stackOut_68_1 = (int[]) (Object) stackIn_68_1;
                          stackOut_68_2 = 1;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          stackIn_70_2 = stackOut_68_2;
                          break L26;
                        }
                      }
                      stackOut_70_0 = stackIn_70_0[stackIn_70_1[stackIn_70_2]];
                      stackIn_72_0 = stackOut_70_0;
                      break L25;
                    }
                  }
                  var17_ref_String = stackIn_72_0;
                  eo.a(var15_ref_kp, var16_ref_String, var17_ref_String, var11 + -(var5 >> 1), var12 + -(var6 >> 1), var5, var6);
                  break L18;
                }
              }
            }
            L27: {
              if (var2 + -1 == var14_int) {
                break L27;
              } else {
                L28: {
                  stackOut_74_0 = (var5 >> 1) + var11;
                  stackOut_74_1 = -1 + var12;
                  stackOut_74_2 = -(var5 >> 1) + ((var7 << 1) + var11);
                  stackOut_74_3 = var12 + -1;
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_76_1 = stackOut_74_1;
                  stackIn_76_2 = stackOut_74_2;
                  stackIn_76_3 = stackOut_74_3;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  stackIn_75_3 = stackOut_74_3;
                  if (var14_int % 2 != 0) {
                    stackOut_76_0 = stackIn_76_0;
                    stackOut_76_1 = stackIn_76_1;
                    stackOut_76_2 = stackIn_76_2;
                    stackOut_76_3 = stackIn_76_3;
                    stackOut_76_4 = -(var8 >> 1);
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    stackIn_77_2 = stackOut_76_2;
                    stackIn_77_3 = stackOut_76_3;
                    stackIn_77_4 = stackOut_76_4;
                    break L28;
                  } else {
                    stackOut_75_0 = stackIn_75_0;
                    stackOut_75_1 = stackIn_75_1;
                    stackOut_75_2 = stackIn_75_2;
                    stackOut_75_3 = stackIn_75_3;
                    stackOut_75_4 = var8 >> 1;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_77_2 = stackOut_75_2;
                    stackIn_77_3 = stackOut_75_3;
                    stackIn_77_4 = stackOut_75_4;
                    break L28;
                  }
                }
                L29: {
                  on.b(stackIn_77_0, stackIn_77_1, stackIn_77_2, stackIn_77_3 + stackIn_77_4, 65793);
                  stackOut_77_0 = (var5 >> 1) + var11;
                  stackOut_77_1 = var12;
                  stackOut_77_2 = var11 + ((var7 << 1) + -(var5 >> 1));
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  stackIn_79_2 = stackOut_77_2;
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  stackIn_78_2 = stackOut_77_2;
                  if (var14_int % 2 != 0) {
                    stackOut_79_0 = stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackOut_79_2 = stackIn_79_2;
                    stackOut_79_3 = -(var8 >> 1);
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    stackIn_80_2 = stackOut_79_2;
                    stackIn_80_3 = stackOut_79_3;
                    break L29;
                  } else {
                    stackOut_78_0 = stackIn_78_0;
                    stackOut_78_1 = stackIn_78_1;
                    stackOut_78_2 = stackIn_78_2;
                    stackOut_78_3 = var8 >> 1;
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_80_1 = stackOut_78_1;
                    stackIn_80_2 = stackOut_78_2;
                    stackIn_80_3 = stackOut_78_3;
                    break L29;
                  }
                }
                L30: {
                  on.b(stackIn_80_0, stackIn_80_1, stackIn_80_2, stackIn_80_3 + var12, 65793);
                  stackOut_80_0 = var11 + (var5 >> 1);
                  stackOut_80_1 = var12 + 1;
                  stackOut_80_2 = -(var5 >> 1) + (var11 + (var7 << 1));
                  stackOut_80_3 = var12;
                  stackOut_80_4 = 1;
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_82_1 = stackOut_80_1;
                  stackIn_82_2 = stackOut_80_2;
                  stackIn_82_3 = stackOut_80_3;
                  stackIn_82_4 = stackOut_80_4;
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  stackIn_81_2 = stackOut_80_2;
                  stackIn_81_3 = stackOut_80_3;
                  stackIn_81_4 = stackOut_80_4;
                  if (var14_int % 2 == 0) {
                    stackOut_82_0 = stackIn_82_0;
                    stackOut_82_1 = stackIn_82_1;
                    stackOut_82_2 = stackIn_82_2;
                    stackOut_82_3 = stackIn_82_3;
                    stackOut_82_4 = stackIn_82_4;
                    stackOut_82_5 = var8 >> 1;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    stackIn_83_2 = stackOut_82_2;
                    stackIn_83_3 = stackOut_82_3;
                    stackIn_83_4 = stackOut_82_4;
                    stackIn_83_5 = stackOut_82_5;
                    break L30;
                  } else {
                    stackOut_81_0 = stackIn_81_0;
                    stackOut_81_1 = stackIn_81_1;
                    stackOut_81_2 = stackIn_81_2;
                    stackOut_81_3 = stackIn_81_3;
                    stackOut_81_4 = stackIn_81_4;
                    stackOut_81_5 = -(var8 >> 1);
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    stackIn_83_2 = stackOut_81_2;
                    stackIn_83_3 = stackOut_81_3;
                    stackIn_83_4 = stackOut_81_4;
                    stackIn_83_5 = stackOut_81_5;
                    break L30;
                  }
                }
                on.b(stackIn_83_0, stackIn_83_1, stackIn_83_2, stackIn_83_3 + (stackIn_83_4 - -stackIn_83_5), 65793);
                break L27;
              }
            }
            L31: {
              L32: {
                var12 = var12 + var8;
                if (var14_int == -8 + var2) {
                  break L32;
                } else {
                  if (-4 + var2 == var14_int) {
                    break L32;
                  } else {
                    if (~var14_int != ~(var2 + -2)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
              }
              var10 = var10 + (var8 >> 1);
              var9 = var9 + (var7 << 1);
              var8 = var8 << 1;
              var11 = var9;
              var12 = var10;
              var13--;
              if (var13 >= 0) {
                un.field_d.d(kp.field_g[var13].toLowerCase(), var11, -4 + var12 + -(var6 >> 1), 16777215, -1);
                break L31;
              } else {
                break L31;
              }
            }
            var14_int++;
            continue L13;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        RuntimeException runtimeException = null;
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
              if (param2 <= -28) {
                break L1;
              } else {
                int discarded$2 = this.b(-108, -27);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        L0: {
          var9 = Kickabout.field_G;
          pt.a(-(((lm) this).field_A >> 1) + 320 + ((lm) this).field_A, param0 + -22909, -(((lm) this).field_A >> 1) + 320, ((lm) this).field_n + 20, 20);
          if (0 != ph.field_a) {
            if (ph.field_a != 1) {
              if (ph.field_a == 2) {
                this.b(32);
                break L0;
              } else {
                break L0;
              }
            } else {
              this.b((byte) 111);
              break L0;
            }
          } else {
            this.e(-21109);
            break L0;
          }
        }
        ta.e(121);
        this.a(param0 ^ 28);
        var3 = 70;
        var4 = -42 + g.field_a.field_J;
        if (param0 == -5) {
          L1: {
            if (!((lm) this).field_K) {
              pt.a(du.field_n + var3 + -10, -22914, -10 + var3, var4, -18 + var4);
              cd.a((byte) -127, var4, var3);
              ta.e(123);
              break L1;
            } else {
              var5 = Math.abs(255 - (int)(nj.a(96) / 5L % 512L));
              var6 = 0;
              var7 = Math.abs(255 - var5) | Math.abs(-var5 + 255) << 8 | Math.abs(255 + -var5) << 16;
              pt.a(40 + (du.field_n + var3), -22914, -2 + var3, var4, -16 + var4);
              on.a(var3, var4 - 11, 33 + du.field_n, 20, 6, var6, al.a(false, (byte) -96));
              np.a(var4, -123, 14 + var3);
              np.a(var4, param0 + 113, du.field_n + (30 + var3));
              var8 = vo.a((byte) -18, vi.field_o, new String[1]);
              q.field_d.a(var8, var3 + 20, var4, var7, -1);
              ta.e(118);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_F = null;
        field_N = null;
        field_j = null;
    }

    final void a(int param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param1.h((byte) -106);
            ((lm) this).field_o = new int[var3_int];
            ((lm) this).field_p = new int[var3_int];
            ((lm) this).field_P = new int[var3_int];
            ((lm) this).field_I = new int[var3_int];
            ((lm) this).field_l = new int[var3_int];
            ((lm) this).field_B = new int[var3_int];
            ((lm) this).field_M = new int[var3_int];
            ((lm) this).field_w = new int[var3_int];
            ((lm) this).field_J = new int[var3_int];
            ((lm) this).field_t = new int[var3_int];
            var4 = 0;
            var5 = 37 % ((param0 - 72) / 36);
            L1: while (true) {
              if (var4 >= var3_int) {
                ((lm) this).field_O = new int[((lm) this).field_M.length][4];
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((lm) this).field_M.length) {
                    ((lm) this).field_D = new int[((lm) this).field_l.length][4];
                    var4 = 0;
                    L3: while (true) {
                      if (((lm) this).field_l.length <= var4) {
                        ((lm) this).field_Y = new int[((lm) this).field_J.length][2];
                        var4 = 0;
                        L4: while (true) {
                          if (((lm) this).field_J.length <= var4) {
                            ((lm) this).field_k = -(100 + 96 * ((lm) this).field_M.length);
                            break L0;
                          } else {
                            ((lm) this).field_Y[var4][0] = ((lm) this).field_J[var4];
                            ((lm) this).field_Y[var4][1] = ((lm) this).field_I[var4];
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        ((lm) this).field_D[var4][0] = ((lm) this).field_l[var4];
                        ((lm) this).field_D[var4][1] = ((lm) this).field_o[var4];
                        ((lm) this).field_D[var4][2] = ((lm) this).field_t[var4];
                        ((lm) this).field_D[var4][3] = ((lm) this).field_P[var4];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((lm) this).field_O[var4][0] = ((lm) this).field_M[var4];
                    ((lm) this).field_O[var4][1] = ((lm) this).field_p[var4];
                    ((lm) this).field_O[var4][2] = ((lm) this).field_w[var4];
                    ((lm) this).field_O[var4][3] = ((lm) this).field_B[var4];
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ((lm) this).field_M[var4] = param1.a((byte) 81);
                ((lm) this).field_p[var4] = param1.a((byte) 81);
                ((lm) this).field_w[var4] = param1.a((byte) 81);
                ((lm) this).field_B[var4] = param1.a((byte) 81);
                ((lm) this).field_l[var4] = param1.a((byte) 81);
                ((lm) this).field_o[var4] = param1.a((byte) 81);
                ((lm) this).field_t[var4] = param1.a((byte) 81);
                ((lm) this).field_P[var4] = param1.a((byte) 81);
                ((lm) this).field_J[var4] = param1.a((byte) 81);
                ((lm) this).field_I[var4] = param1.h((byte) -127);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("lm.S(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static void d(int param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new r();
        field_F = new ld();
    }
}
