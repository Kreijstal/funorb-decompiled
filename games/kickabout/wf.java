/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class wf extends qt {
    private hd field_P;
    private jw[] field_E;
    static int field_Q;
    private jr[] field_B;
    static String field_M;
    static int field_A;
    private hd field_K;
    static String field_I;
    private jh field_G;
    private hd field_R;
    private tf field_T;
    private hd field_L;
    static int field_O;
    private boolean field_N;
    private long field_J;
    private int field_V;
    private int field_S;
    private int field_F;
    private int field_U;
    private int field_D;
    long field_H;
    private int field_C;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sr[] var5 = null;
        sr[] var6 = null;
        L0: {
          var4 = Kickabout.field_G;
          ((wf) this).field_L = new hd();
          ((wf) this).field_L.a(true, 640, 0, 0, 480);
          if (param0 == -38) {
            break L0;
          } else {
            ((wf) this).field_B = null;
            break L0;
          }
        }
        ((wf) this).field_R = eo.a(ir.field_B, 7126504, (hu) (Object) un.field_d, 162, true);
        ((wf) this).field_P = eo.a(vd.field_b, 16679959, (hu) (Object) un.field_d, 162, true);
        ((wf) this).field_R.field_s = 10;
        ((wf) this).field_R.field_J = 56;
        ((wf) this).field_P.field_J = 86;
        ((wf) this).field_P.field_s = 10;
        ((wf) this).field_K = new hd();
        ((wf) this).field_K.field_E = bi.field_a.toLowerCase();
        ((wf) this).field_K.a(true, 420, 195, 51, 66);
        ((wf) this).field_E = new jw[4];
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var5 = new sr[gr.field_l.length];
            var6 = var5;
            var3 = 0;
            L2: while (true) {
              if (var3 >= var5.length) {
                ((wf) this).field_G = new jh(gk.field_f, gr.field_l, var6, 50);
                ((wf) this).field_G.a(300, (byte) -116, 122, 7);
                ((wf) this).field_B = new jr[]{};
                ((wf) this).field_G.a((im[]) (Object) ((wf) this).field_B, 0);
                ((wf) this).field_L.a((byte) -123, ((wf) this).field_P);
                ((wf) this).field_L.a((byte) -106, ((wf) this).field_R);
                ((wf) this).field_L.a((byte) -124, ((wf) this).field_K);
                ((wf) this).field_L.a((byte) -115, (hd) (Object) ((wf) this).field_G);
                return;
              } else {
                var5[var3] = ra.field_H;
                if (-3 == (var3 ^ -1)) {
                  var5[var3] = bs.field_a;
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          } else {
            ((wf) this).field_E[var2] = new jw(uf.field_e[var2], (hu) (Object) pb.field_C, 90);
            ((wf) this).field_E[var2].field_s = var2 * 100 + 15;
            ((wf) this).field_E[var2].field_J = 27;
            ((wf) this).field_E[var2].field_Gb = true;
            ((wf) this).field_K.a((byte) -117, (hd) (Object) ((wf) this).field_E[var2]);
            var2++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1, kg param2, int param3) {
        if (256 != hw.field_i) {
            param2.a(param1, param3, hw.field_i * param2.field_i >> 476031784, hw.field_i * param2.field_a >> -840618968);
        } else {
            param2.a(param1, param3);
        }
        if (param0 != -840618968) {
            field_A = 99;
        }
    }

    public static void h(byte param0) {
        field_M = null;
        if (param0 >= -50) {
            field_M = null;
        }
        field_I = null;
    }

    final static void b(int param0, int param1, byte param2) {
        ml var3 = or.field_d;
        var3.b(param1, (byte) 127);
        var3.a(123, 3);
        int var4 = 127 / ((57 - param2) / 58);
        var3.a(112, 8);
        var3.g(-1207444472, param0);
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          super.a((byte) 124, param1);
          if (-1 > (((wf) this).field_V ^ -1)) {
            ((wf) this).field_V = ((wf) this).field_V - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((wf) this).field_G.h((byte) 123);
          stackOut_3_0 = param1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (ds.field_g) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = stackIn_6_0;
          stackOut_6_1 = stackIn_6_1;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (dg.field_e) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = stackIn_9_0;
          stackOut_9_1 = stackIn_9_1 & stackIn_9_2;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          if (la.a(100)) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            break L3;
          }
        }
        L4: {
          param1 = stackIn_12_0 & (stackIn_12_1 & stackIn_12_2) != 0;
          ((wf) this).field_G.a(param1, false);
          ((wf) this).field_L.field_s = ((wf) this).field_j;
          ((wf) this).field_L.b(0, param1);
          if (!param1) {
            break L4;
          } else {
            var4_long = nj.a(73);
            if ((var4_long ^ -1L) > (((wf) this).field_H + 10000L ^ -1L)) {
              break L4;
            } else {
              this.a(true, (byte) -127);
              break L4;
            }
          }
        }
        L5: {
          this.a(false, param1);
          var4 = ((wf) this).field_G.i((byte) -124) - this.g((byte) 63);
          var5 = ((wf) this).field_G.b(64);
          var6 = ((wf) this).field_G.j((byte) 34);
          if (-1 == var5) {
            var5 = 4;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!param1) {
            break L6;
          } else {
            L7: {
              if (((wf) this).field_S != ((wf) this).field_U) {
                break L7;
              } else {
                if (var5 != ((wf) this).field_F) {
                  break L7;
                } else {
                  if (var6 != ((wf) this).field_C) {
                    break L7;
                  } else {
                    if (var4 < -4 + ((wf) this).field_D) {
                      break L7;
                    } else {
                      if (var4 > 4 + ((wf) this).field_D) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
            }
            ((wf) this).field_J = -1L;
            ((wf) this).field_C = var6;
            ((wf) this).field_D = var4;
            ((wf) this).field_F = var5;
            this.a(false, (byte) -126);
            break L6;
          }
        }
        L8: {
          ((wf) this).field_S = ((wf) this).field_U;
          var7 = -68 % ((38 - param0) / 60);
          if (var3 >= ((wf) this).field_G.h((byte) -25)) {
            if (var3 <= ((wf) this).field_G.h((byte) -126)) {
              break L8;
            } else {
              if (-1 != (((wf) this).field_V ^ -1)) {
                break L8;
              } else {
                wh discarded$2 = sp.c(60, -101);
                ((wf) this).field_V = 10;
                break L8;
              }
            }
          } else {
            if (var3 <= ((wf) this).field_G.h((byte) -126)) {
              break L8;
            } else {
              if (-1 != (((wf) this).field_V ^ -1)) {
                break L8;
              } else {
                wh discarded$3 = sp.c(60, -101);
                ((wf) this).field_V = 10;
                break L8;
              }
            }
          }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (la.a(100)) {
            var3 = 320;
            if (param0 != 1) {
              if ((param0 ^ -1) == -1) {
                return 24 + (var3 - ((((wf) this).field_i[1].field_d + ((wf) this).field_i[0].field_d >> 1782894721) - ((wf) this).field_i[1].field_d * 2));
              } else {
                if (-3 == (param0 ^ -1)) {
                  return 600;
                } else {
                  break L0;
                }
              }
            } else {
              return var3 - (((wf) this).field_i[1].field_d + ((wf) this).field_i[0].field_d >> 238508289);
            }
          } else {
            break L0;
          }
        }
        if (param1 == -22667) {
          L1: {
            if (-2 == (param0 ^ -1)) {
              stackOut_13_0 = 600;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = 320;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          return stackIn_14_0;
        } else {
          return 15;
        }
    }

    final static ut[][][] a(int param0, ut param1) {
        ut var3 = null;
        int var4_int = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6_int = 0;
        ut[] var6 = null;
        int var7_int = 0;
        ut[][][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ut var13 = null;
        String var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var15 = Kickabout.field_G;
        var16 = new int[]{uv.field_e, pb.field_A, rb.field_Kb, oc.field_e};
        var3 = new ut(32, 32);
        iw.a(-111, var3);
        var4_int = 15;
        L0: while (true) {
          if (-20 >= (var4_int ^ -1)) {
            var4 = 1.0f;
            var5 = 0.4000000059604645f;
            var6_int = 2;
            L1: while (true) {
              if (20 <= var6_int) {
                ta.e(117);
                var6 = new ut[4];
                var7_int = 0;
                L2: while (true) {
                  if (4 <= var7_int) {
                    var6[1].g();
                    var6[2].d();
                    var6[param0].c();
                    var7 = new ut[2][4][2];
                    var8 = 0;
                    L3: while (true) {
                      if ((var8 ^ -1) <= -17) {
                        return var7;
                      } else {
                        L4: {
                          if (-1 != (8 & var8 ^ -1)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L4;
                          } else {
                            stackOut_12_0 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            break L4;
                          }
                        }
                        L5: {
                          var9 = stackIn_14_0;
                          var10 = 3 & var8 >> -1167564863;
                          if ((var8 & 1) == 0) {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            break L5;
                          } else {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            break L5;
                          }
                        }
                        L6: {
                          var11 = stackIn_17_0;
                          if (var11 != 0) {
                            stackOut_19_0 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            break L6;
                          } else {
                            stackOut_18_0 = 0;
                            stackIn_20_0 = stackOut_18_0;
                            break L6;
                          }
                        }
                        L7: {
                          var12 = stackIn_20_0;
                          var13 = new ut(param1.field_o, param1.field_v);
                          iw.a(-96, var13);
                          param1.d(0, 0);
                          if (var11 != 0) {
                            break L7;
                          } else {
                            on.g(0, 0, on.field_g, on.field_f);
                            break L7;
                          }
                        }
                        L8: {
                          if (var9 == 0) {
                            var6[var10].f(-7 + (on.field_g >> -1641453919), var12 - -5);
                            break L8;
                          } else {
                            var14 = mk.field_b[var16[var10]].toLowerCase();
                            un.field_d.d(var14, (on.field_g >> 2033121505) - -var12, 18 - -var12, 65793, -1);
                            break L8;
                          }
                        }
                        ta.e(120);
                        sd.a(var13, (byte) -51);
                        var7[var8 >> 1755602339][qj.b(3, var8 >> 996516353)][qj.b(var8, 1)] = var13;
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6[var7_int] = var3.b();
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                on.a(var6_int, -(int)var4 + 17, (int)(2.0f * var4), 65793);
                var4 = var4 + var5;
                var6_int++;
                continue L1;
              }
            }
          } else {
            on.f(4, var4_int, 26, 592137);
            var4_int++;
            continue L0;
          }
        }
    }

    private final int g(byte param0) {
        int var2 = -70 % ((param0 - 8) / 47);
        return (((wf) this).field_T.a(false) ^ -1) < -1 ? 2 + ((wf) this).field_T.a(false) : 0;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 ^ 0, param1, param2);
        kc.a(tu.field_E.field_x, param0 + 415422632);
        ((wf) this).field_N = true;
        ((wf) this).field_B = new jr[param0];
        ((wf) this).field_G.a(0, (byte) -47, (im[]) (Object) ((wf) this).field_B, 5);
        ((wf) this).field_G.field_Db = -1;
        ((wf) this).field_G.b(4, 113);
        ((wf) this).field_U = 15;
        ((wf) this).field_F = 4;
        ((wf) this).field_S = ((wf) this).field_U;
        ((wf) this).field_C = 0;
        ((wf) this).field_D = 0;
        if (!dg.field_e) {
            if (!(!ds.field_g)) {
                return;
            }
            this.e(30353);
            this.a(true, (byte) -126);
            return;
        }
    }

    private final void a(vc param0, int param1) {
        int var4 = Kickabout.field_G;
        vc var3 = (vc) (Object) ((wf) this).field_T.g(24009);
        if (param1 != 640) {
            ((wf) this).field_B = null;
        }
        while (var3 != null) {
            if (!(var3.field_a != param0.field_a)) {
                var3 = param0;
            }
            var3 = (vc) (Object) ((wf) this).field_T.c(param1 ^ 673);
        }
    }

    final void a(boolean param0, int param1) {
        ig.b(((wf) this).field_j, -12452);
        if (param1 < 99) {
            ((wf) this).field_F = -63;
        }
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        var4 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(((wf) this).field_K.field_F, ((wf) this).field_K.field_T, ((wf) this).field_K.field_q, ((wf) this).field_K.field_mb, 65793, 96);
        on.a(((wf) this).field_K.field_F - -8, 23 + ((wf) this).field_K.field_T, ((wf) this).field_K.field_q + -16, -30 + ((wf) this).field_K.field_mb, 10, 65793, 96);
        un.field_d.a(((wf) this).field_K.field_E, 13 + ((wf) this).field_K.field_F, 17 + ((wf) this).field_K.field_T, 16777215, -1);
        var3_int = 0;
        L0: while (true) {
          if (4 <= var3_int) {
            L1: {
              ((wf) this).field_G.a(-82);
              ((wf) this).field_L.a(63, false);
              if (((wf) this).field_N) {
                L2: {
                  if (-1 == (((wf) this).field_U ^ -1)) {
                    stackOut_7_0 = aa.field_h;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = bh.field_t;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                var3 = stackIn_8_0;
                pb.field_C.d(var3, ((wf) this).field_G.field_F - -(((wf) this).field_G.field_q >> 1432917857), (((wf) this).field_G.field_mb >> -988620351) + ((wf) this).field_G.field_T, 16777215, -1);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (!la.a(param0 ^ -97)) {
                break L3;
              } else {
                on.a(((wf) this).field_j, 48, 640, 383, 0, 196);
                break L3;
              }
            }
            L4: {
              L5: {
                if (ds.field_g) {
                  break L5;
                } else {
                  if (!dg.field_e) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              on.a(((wf) this).field_j, 48, 640, 383, 0, 196);
              int discarded$1 = pb.field_C.a(ew.field_d, ((wf) this).field_j, 0, 640, 480, 16777215, -1, 1, 1, 0);
              break L4;
            }
            return;
          } else {
            ((wf) this).field_E[var3_int].a(false, (byte) 46);
            var3_int++;
            continue L0;
          }
        }
    }

    private final boolean a(vc param0, byte param1) {
        int var5 = Kickabout.field_G;
        int var3 = 4 / ((40 - param1) / 37);
        vc var4 = (vc) (Object) ((wf) this).field_T.g(24009);
        while (var4 != null) {
            if (!(param0.field_a != var4.field_a)) {
                return true;
            }
            var4 = (vc) (Object) ((wf) this).field_T.c(33);
        }
        return false;
    }

    final void a(boolean param0, vc[] param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jr var9_ref_jr = null;
        int var9 = 0;
        jr var10_ref_jr = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jr var12_ref_jr = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        tf var17 = null;
        vc var18 = null;
        jh stackIn_45_0 = null;
        jh stackIn_46_0 = null;
        jh stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        jh stackOut_44_0 = null;
        jh stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        jh stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        L0: {
          var16 = null;
          var15 = Kickabout.field_G;
          ui.field_w = param1;
          var17 = new tf();
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (((wf) this).field_T.a(false) <= param3) {
            break L0;
          } else {
            var18 = (vc) (Object) ((wf) this).field_T.g(24009);
            L1: while (true) {
              if (var18 == null) {
                break L0;
              } else {
                L2: {
                  if ((var7 ^ -1) <= (param3 ^ -1)) {
                    L3: {
                      if (var7 == 0) {
                        var10_ref_jr = new jr(nc.field_b);
                        var10_ref_jr.field_X = (hu) (Object) pb.field_C;
                        var10_ref_jr.field_mb = 50;
                        var10_ref_jr.field_y = 16777215;
                        var17.a((gn) (Object) var10_ref_jr, 3);
                        var8++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var10_ref_jr = new jr(var18, gk.field_f);
                    var10_ref_jr.field_y = 16777215;
                    var10_ref_jr.field_mb = 50;
                    var10_ref_jr.field_X = (hu) (Object) pb.field_C;
                    var8++;
                    var17.a((gn) (Object) var10_ref_jr, 3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7++;
                var18 = (vc) (Object) ((wf) this).field_T.c(33);
                continue L1;
              }
            }
          }
        }
        L4: {
          if ((var7 ^ -1) < -1) {
            var9_ref_jr = new jr(ko.field_k);
            var9_ref_jr.field_mb = 50;
            var9_ref_jr.field_y = 16777215;
            var9_ref_jr.field_X = (hu) (Object) pb.field_C;
            var8++;
            var17.a((gn) (Object) var9_ref_jr, 3);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0) {
            break L5;
          } else {
            wf.h((byte) 106);
            break L5;
          }
        }
        var9 = 0;
        L6: while (true) {
          if (var9 >= ui.field_w.length) {
            L7: {
              var9 = param3;
              if ((var9 ^ -1) < -6) {
                var9 = 5;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (0 <= var9) {
                break L8;
              } else {
                var9 = 0;
                break L8;
              }
            }
            L9: {
              var10 = -var6 - (param3 - -var8 - param2);
              if (-1 >= (param3 ^ -1)) {
                break L9;
              } else {
                var10 = -var6 + param2;
                break L9;
              }
            }
            L10: {
              if (-6 <= (var10 ^ -1)) {
                break L10;
              } else {
                var10 = 5;
                break L10;
              }
            }
            L11: {
              if ((var10 ^ -1) <= -1) {
                break L11;
              } else {
                var10 = 0;
                break L11;
              }
            }
            ((wf) this).field_B = new jr[var9 + (var6 - (-var8 + -var10))];
            var11 = var9;
            var12 = 0;
            L12: while (true) {
              if ((var11 ^ -1) >= (var12 ^ -1)) {
                var12_ref_jr = (jr) (Object) var17.g(24009);
                L13: while (true) {
                  if (var12_ref_jr == null) {
                    var12 = var11;
                    L14: while (true) {
                      if (var12 >= ((wf) this).field_B.length) {
                        L15: {
                          if (((wf) this).field_T.a(false) + var6 == 0) {
                            ((wf) this).field_N = true;
                            break L15;
                          } else {
                            ((wf) this).field_N = false;
                            break L15;
                          }
                        }
                        L16: {
                          var12 = ((wf) this).field_G.h((byte) 127);
                          var13 = this.g((byte) 84) + -var8;
                          var14 = this.g((byte) -110);
                          stackOut_44_0 = ((wf) this).field_G;
                          stackIn_46_0 = stackOut_44_0;
                          stackIn_45_0 = stackOut_44_0;
                          if (0 <= param3) {
                            stackOut_46_0 = (jh) (Object) stackIn_46_0;
                            stackOut_46_1 = -var9 + (param3 + var13);
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L16;
                          } else {
                            stackOut_45_0 = (jh) (Object) stackIn_45_0;
                            stackOut_45_1 = 0;
                            stackIn_47_0 = stackOut_45_0;
                            stackIn_47_1 = stackOut_45_1;
                            break L16;
                          }
                        }
                        ((jh) (Object) stackIn_47_0).a(stackIn_47_1, (byte) -47, (im[]) (Object) ((wf) this).field_B, param2 + var14);
                        ((wf) this).field_G.a(param0, var12);
                        ((wf) this).field_G.b(0, false);
                        return;
                      } else {
                        ((wf) this).field_B[var12] = new jr(gk.field_f);
                        ((wf) this).field_B[var12].field_mb = 50;
                        ((wf) this).field_B[var12].field_X = (hu) (Object) pb.field_C;
                        ((wf) this).field_B[var12].field_y = 16777215;
                        var12++;
                        continue L14;
                      }
                    }
                  } else {
                    ((wf) this).field_B[var11] = (jr) (Object) param1;
                    var12_ref_jr = (jr) (Object) var17.c(33);
                    var11++;
                    continue L13;
                  }
                }
              } else {
                ((wf) this).field_B[var12] = new jr(gk.field_f);
                ((wf) this).field_B[var12].field_mb = 50;
                ((wf) this).field_B[var12].field_X = (hu) (Object) pb.field_C;
                ((wf) this).field_B[var12].field_y = 16777215;
                var12++;
                continue L12;
              }
            }
          } else {
            L17: {
              if (this.a(ui.field_w[var9], (byte) 117)) {
                this.a(ui.field_w[var9], 640);
                break L17;
              } else {
                break L17;
              }
            }
            var10_ref_jr = new jr(ui.field_w[var9], gk.field_f);
            var10_ref_jr.field_mb = 50;
            var10_ref_jr.field_X = (hu) (Object) pb.field_C;
            var10_ref_jr.field_y = 16777215;
            var6++;
            var17.a((gn) (Object) var10_ref_jr, 3);
            var9++;
            continue L6;
          }
        }
    }

    private final void e(int param0) {
        long var2 = 0L;
        if (la.a(100)) {
          return;
        } else {
          L0: {
            if (dg.field_e) {
              break L0;
            } else {
              if (!ds.field_g) {
                L1: {
                  or.field_d.b(84, (byte) 112);
                  var2 = nj.a(-79);
                  if (param0 == 30353) {
                    break L1;
                  } else {
                    ((wf) this).field_J = -31L;
                    break L1;
                  }
                }
                ((wf) this).field_H = var2;
                ((wf) this).field_P.field_lb = true;
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hd stackIn_1_0 = null;
        hd stackIn_2_0 = null;
        hd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        hd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        jw stackIn_29_0 = null;
        jw stackIn_30_0 = null;
        jw stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        hd stackOut_0_0 = null;
        hd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        hd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        hd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        jw stackOut_28_0 = null;
        jw stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        jw stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        L0: {
          var4 = Kickabout.field_G;
          stackOut_0_0 = ((wf) this).field_R;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (dg.field_e) {
            stackOut_2_0 = (hd) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (hd) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (hd) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (ds.field_g) {
            stackOut_5_0 = (hd) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (hd) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          stackIn_6_0.field_lb = (stackIn_6_1 & stackIn_6_2) != 0;
          if (((wf) this).field_R.field_gb) {
            qd.a((byte) -67, bg.field_v);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((3000L + ((wf) this).field_J ^ -1L) <= (nj.a(23) ^ -1L)) {
            ((wf) this).field_P.field_lb = false;
            break L3;
          } else {
            ((wf) this).field_P.field_lb = true;
            break L3;
          }
        }
        var3 = 0;
        L4: while (true) {
          if (var3 >= ((wf) this).field_E.length) {
            L5: {
              if ((((wf) this).field_R.field_sb ^ -1) != -2) {
                break L5;
              } else {
                if (tu.field_E.c(-3)) {
                  if (tu.field_E.a((byte) -97)) {
                    rm.e(25);
                    wh discarded$4 = sp.c(49, 55);
                    break L5;
                  } else {
                    tb.a((byte) 126, 33);
                    wh discarded$5 = sp.c(53, -126);
                    break L5;
                  }
                } else {
                  tb.a((byte) 126, 6);
                  wh discarded$6 = sp.c(53, -120);
                  break L5;
                }
              }
            }
            var5 = 0;
            var3 = var5;
            L6: while (true) {
              if (var5 >= ((wf) this).field_E.length) {
                L7: {
                  if (!param0) {
                    break L7;
                  } else {
                    this.e(48);
                    break L7;
                  }
                }
                L8: {
                  if ((((wf) this).field_P.field_sb ^ -1) == -2) {
                    ((wf) this).field_J = nj.a(-72);
                    this.a(false, (byte) -126);
                    kj.a((byte) 24);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                tc.a(tu.field_E.field_x, 5464);
                return;
              } else {
                L9: {
                  if (((wf) this).field_E[var5].field_sb == 1) {
                    ((wf) this).field_U = ((wf) this).field_U ^ 1 << var5;
                    wh discarded$7 = sp.c(61, -118);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  stackOut_28_0 = ((wf) this).field_E[var5];
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (0 == (((wf) this).field_U & 1 << var5)) {
                    stackOut_30_0 = (jw) (Object) stackIn_30_0;
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L10;
                  } else {
                    stackOut_29_0 = (jw) (Object) stackIn_29_0;
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    break L10;
                  }
                }
                stackIn_31_0.field_Gb = stackIn_31_1 != 0;
                var5++;
                continue L6;
              }
            }
          } else {
            if (((wf) this).field_E[var3].field_gb) {
              qd.a((byte) -67, vo.a((byte) -18, vq.field_e, new String[1]));
              var3++;
              continue L4;
            } else {
              var3++;
              continue L4;
            }
          }
        }
    }

    final static void b(int param0, boolean param1) {
        String var2 = null;
        String[] var3 = null;
        gr var4 = null;
        gr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        gr var10 = null;
        String stackIn_3_0 = null;
        int stackIn_11_0 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var8 = Kickabout.field_G;
          vs.field_g = null;
          if (wq.field_d != 0L) {
            stackOut_2_0 = ow.field_e;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = gw.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var9 = stackIn_3_0;
          var2 = var9;
          var3 = new String[]{var9, rp.field_D};
          if (param0 == 10) {
            break L1;
          } else {
            field_A = -58;
            break L1;
          }
        }
        L2: {
          var4 = wk.a(true, true);
          var4.field_k = 15;
          var4.field_w = 0;
          var4.field_R = 15;
          var5 = tu.field_E;
          if (param1) {
            var10 = wk.a(false, true);
            var5 = var10;
            var10.field_o = 2;
            var10.field_K = 0;
            var10.field_k = 16;
            var10.field_w = 4;
            var10.field_R = 31;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((eq.field_d ^ -1) >= -1) {
            stackOut_10_0 = 2;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 3;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        var6 = stackIn_11_0;
        um.field_e = new ap(false, (up[]) null, var3, 0, false, false, 3, var6, false, false, false, false, false, -1, var4);
        var7 = 0;
        L4: while (true) {
          if ((var7 ^ -1) <= -3) {
            L5: {
              um.field_e.field_o.field_t = var5.field_K;
              um.field_e.field_o.field_m = var5.field_o;
              um.field_e.field_o.field_H[0] = var5.field_w;
              um.field_e.field_o.field_d[0] = var5.field_k;
              um.field_e.field_o.field_Q[0] = var5.field_R;
              um.field_e.field_o.field_H[1] = var4.field_w;
              um.field_e.field_o.field_d[1] = var4.field_k;
              um.field_e.field_o.field_Q[1] = var4.field_R;
              if (!param1) {
                um.field_e.b(26415, 2);
                gv discarded$1 = gm.a(de.field_a, true, (byte) -117);
                break L5;
              } else {
                um.field_e.field_o.field_b[0][0] = var5.field_i[2];
                um.field_e.field_o.field_b[0][1] = var5.field_i[0];
                um.field_e.field_o.field_b[0][2] = var5.field_i[1];
                um.field_e.field_o.field_b[0][3] = var5.field_i[3];
                um.field_e.field_o.field_b[1][0] = var4.field_i[0];
                um.field_e.field_o.field_b[1][1] = var4.field_i[1];
                um.field_e.field_o.field_b[1][2] = var4.field_i[2];
                um.field_e.field_o.field_s = true;
                um.field_e.field_o.field_b[1][3] = var4.field_i[3];
                um.field_e.b(param0 + 26405, 4);
                la.a(um.field_e.field_o, 0);
                break L5;
              }
            }
            sb.a(false, (byte) -122, um.field_e.field_o.field_m, um.field_e.field_o.field_t);
            return;
          } else {
            um.field_e.field_o.field_g[var7].field_p = var7;
            var7++;
            continue L4;
          }
        }
    }

    final void a(boolean param0, vc[] param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ((wf) this).field_T = new tf();
        for (var3 = 0; var3 < param1.length; var3++) {
            ((wf) this).field_T.a((gn) (Object) param1[var3], 3);
        }
        if (!param0) {
            ((wf) this).a(68, false);
        }
    }

    private final void a(boolean param0, byte param1) {
        long var3 = 0L;
        ml stackIn_10_0 = null;
        ml stackIn_11_0 = null;
        ml stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ml stackOut_9_0 = null;
        ml stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ml stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (param1 <= -125) {
          if (la.a(100)) {
            return;
          } else {
            L0: {
              if (dg.field_e) {
                break L0;
              } else {
                if (!ds.field_g) {
                  L1: {
                    if (((wf) this).field_D + -5 > ((wf) this).field_T.a(false)) {
                      break L1;
                    } else {
                      this.e(30353);
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_9_0 = or.field_d;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!param0) {
                      stackOut_11_0 = (ml) (Object) stackIn_11_0;
                      stackOut_11_1 = 55;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L2;
                    } else {
                      stackOut_10_0 = (ml) (Object) stackIn_10_0;
                      stackOut_10_1 = 83;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L2;
                    }
                  }
                  ((ml) (Object) stackIn_12_0).b(stackIn_12_1, (byte) -91);
                  or.field_d.n(-115);
                  or.field_d.a(4, 79, ((wf) this).field_U);
                  or.field_d.a(3, 93, ((wf) this).field_F);
                  or.field_d.a(3, 79, ((wf) this).field_C);
                  or.field_d.b(false);
                  or.field_d.a(-5 + ((wf) this).field_D, (byte) 109);
                  var3 = nj.a(-111);
                  ((wf) this).field_P.field_lb = true;
                  ((wf) this).field_H = var3;
                  return;
                } else {
                  break L0;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    wf() {
        ((wf) this).field_T = new tf();
        ((wf) this).field_N = true;
        ((wf) this).field_F = 4;
        ((wf) this).field_V = 0;
        ((wf) this).field_J = -1L;
        ((wf) this).field_D = 0;
        ((wf) this).field_H = -1L;
        ((wf) this).field_C = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Become a member to use the Trinkets Expansion.";
        field_A = 0;
        field_I = null;
    }
}
