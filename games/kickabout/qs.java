/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends ta {
    private bp field_J;
    private hd field_Q;
    private hd field_U;
    static String field_H;
    private int field_N;
    static String field_V;
    private tf field_I;
    static int[] field_P;
    static java.applet.Applet field_M;
    private hd field_G;
    private int field_O;
    static int[] field_S;
    private sp[] field_F;
    static int field_K;
    private mf field_T;
    private hd field_L;
    static ut field_R;

    final void a(boolean param0, int param1) {
        int discarded$4 = -12452;
        ig.b(((qs) this).field_j);
        if (param1 < 99) {
            ((qs) this).field_I = null;
        }
    }

    final int b(int param0, int param1) {
        if (param1 != -22667) {
            ((qs) this).a((byte) -46, true);
        }
        return param0 != 1 ? 320 : 600;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((qs) this).field_J.h((byte) -48);
        sr var6 = ((qs) this).field_J.field_zb[((qs) this).field_J.field_Db];
        ((qs) this).field_I.a((gn) (Object) new oi(param0 | param3 << 16), 3);
        int discarded$0 = 1;
        this.c();
        ((qs) this).field_J.a(var6, 94);
        ((qs) this).field_J.a(true, var5);
        ((qs) this).field_T.field_Fb = param1;
        if (param2 <= 20) {
            ((qs) this).a(false, -54);
        }
        ((qs) this).field_T.j((byte) 21).field_Hb = true;
        int discarded$1 = 0;
        this.b();
    }

    public static void h(byte param0) {
        field_H = null;
        field_P = null;
        if (param0 > -105) {
            qs.h((byte) -97);
        }
        field_M = null;
        field_V = null;
        field_R = null;
        field_S = null;
    }

    final void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        kq var6 = null;
        int var7 = Kickabout.field_G;
        super.a(0, param1, param2);
        ((qs) this).field_I = new tf();
        ((qs) this).field_Q.field_jb = new tf();
        ((qs) this).field_T = new mf(ic.field_h);
        kq[] var8 = ((qs) this).field_T.field_Eb;
        kq[] var4 = var8;
        for (var5 = param0; var8.length > var5; var5++) {
            var6 = var8[var5];
            var6.field_Lb = true;
        }
        ((qs) this).field_Q.a((byte) -126, (hd) (Object) ((qs) this).field_T);
        ((qs) this).field_Q.a(true, 12 + ((qs) this).field_T.field_q, 3, 54, 30 + ((qs) this).field_T.field_mb - -12);
        ((qs) this).field_T.field_J = 36;
        ((qs) this).field_T.field_s = 6;
        ((qs) this).field_G.a(true, ((qs) this).field_Q.field_q, ((qs) this).field_Q.field_s, 5 + (((qs) this).field_Q.field_mb + ((qs) this).field_Q.field_J), 97);
        int discarded$0 = 1;
        this.c();
        ((qs) this).field_J.field_Db = -1;
        ((qs) this).field_J.b(2, 104);
        ((qs) this).field_T.field_Fb = -1;
        int discarded$1 = 0;
        this.b();
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hd stackIn_14_0 = null;
        hd stackIn_15_0 = null;
        hd stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        hd stackOut_13_0 = null;
        hd stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hd stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var6 = Kickabout.field_G;
          super.a((byte) 113, param1);
          if (0 >= ((qs) this).field_O) {
            break L0;
          } else {
            ((qs) this).field_O = ((qs) this).field_O - 1;
            break L0;
          }
        }
        L1: {
          var3 = ((qs) this).field_J.h((byte) -38);
          tc.a(ic.field_h.field_x, 5464);
          ((qs) this).field_J.a(param1, false);
          ((qs) this).field_L.field_s = ((qs) this).field_j;
          ((qs) this).field_L.b(0, param1);
          ((qs) this).field_T.a(48);
          if (((qs) this).field_T.field_Fb == -1) {
            break L1;
          } else {
            if (!((qs) this).field_T.j((byte) 21).field_Eb.c(-2)) {
              break L1;
            } else {
              ((qs) this).field_T.field_Fb = -1;
              break L1;
            }
          }
        }
        L2: {
          if (((qs) this).field_T.field_Fb != ((qs) this).field_N) {
            ((qs) this).field_N = ((qs) this).field_T.field_Fb;
            int discarded$3 = 0;
            this.b();
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((qs) this).field_T.field_Fb == -1) {
            break L3;
          } else {
            if (((qs) this).field_U.field_sb != 1) {
              break L3;
            } else {
              var4 = ic.field_h.field_q[((qs) this).field_T.field_Fb];
              jf.a(64, ic.field_h.field_i[var4], var4);
              break L3;
            }
          }
        }
        var5 = 63 % ((param0 - 38) / 60);
        var7 = 0;
        var4 = var7;
        L4: while (true) {
          if (var7 >= ((qs) this).field_F.length) {
            L5: {
              if (((qs) this).field_J.h((byte) -73) <= var3) {
                if (((qs) this).field_J.h((byte) -86) >= var3) {
                  break L5;
                } else {
                  if (((qs) this).field_O != 0) {
                    break L5;
                  } else {
                    wh discarded$4 = sp.c(60, -127);
                    ((qs) this).field_O = 10;
                    break L5;
                  }
                }
              } else {
                if (((qs) this).field_J.h((byte) -86) >= var3) {
                  break L5;
                } else {
                  if (((qs) this).field_O != 0) {
                    break L5;
                  } else {
                    wh discarded$5 = sp.c(60, -127);
                    ((qs) this).field_O = 10;
                    break L5;
                  }
                }
              }
            }
            return;
          } else {
            L6: {
              stackOut_13_0 = ((qs) this).field_F[var7].field_Mb;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (ic.field_h.field_x < ((qs) this).field_F[var7].field_Gb) {
                stackOut_15_0 = (hd) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L6;
              } else {
                stackOut_14_0 = (hd) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L6;
              }
            }
            stackIn_16_0.field_lb = stackIn_16_1 != 0;
            if (((qs) this).field_F[var7].field_Mb.field_sb != 0) {
              if (ic.field_h.c((byte) -86)) {
                pi.a(6022, ((qs) this).field_F[var7]);
                var7++;
                continue L4;
              } else {
                tb.a((byte) 126, 0);
                var7++;
                continue L4;
              }
            } else {
              var7++;
              continue L4;
            }
          }
        }
    }

    private final void b() {
        ((qs) this).field_U.c((byte) -109);
        kq var2 = ((qs) this).field_T.j((byte) 21);
        if (var2 != null) {
            if (!(var2.field_Gb)) {
                ((qs) this).field_G.a((byte) -127, ((qs) this).field_U);
            }
        }
    }

    final static void a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        nl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 4) {
                break L0;
              } else {
                L2: {
                  L3: {
                    var2 = sh.field_a.field_P[ae.field_G][1 + var1_int];
                    if (0 >= var2.field_C) {
                      break L3;
                    } else {
                      if (var2.field_u != 4) {
                        mn.field_b[var1_int] = 16;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (0 >= mn.field_b[var1_int]) {
                    break L2;
                  } else {
                    mn.field_b[var1_int] = mn.field_b[var1_int] - 1;
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "qs.I(" + 0 + 41);
        }
    }

    private final void c() {
        int var3 = 0;
        sp var4 = null;
        int var4_int = 0;
        up var5 = null;
        int var6 = 0;
        oi var7 = null;
        int var8 = 0;
        int var9 = 0;
        tf var10 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var9 = Kickabout.field_G;
        var10 = new tf();
        var3 = -1;
        L0: while (true) {
          L1: {
            if (6 < var3) {
              break L1;
            } else {
              L2: {
                int discarded$1 = 15137;
                if (cq.e()) {
                  break L2;
                } else {
                  if (var3 != -1) {
                    break L2;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
              if (ic.field_h.field_t >= var3) {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int < 8) {
                    L4: {
                      var5 = ha.a(ic.field_h.field_e, var4_int, ic.field_h.field_N[var4_int + 8 * var3 + 8], -84, var3);
                      if (bh.field_k != var3) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L4;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                    var6 = stackIn_14_0;
                    var7 = (oi) (Object) ((qs) this).field_I.g(24009);
                    L5: while (true) {
                      if (var7 == null) {
                        var10.a((gn) (Object) new sp(var5, da.field_x, var3, var4_int, var6 != 0), 3);
                        var4_int++;
                        continue L3;
                      } else {
                        L6: {
                          var8 = var7.field_j;
                          if (var8 >> 16 != var3) {
                            break L6;
                          } else {
                            if ((var8 & 65535) == var4_int) {
                              var6 = 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7 = (oi) (Object) ((qs) this).field_I.c(33);
                        continue L5;
                      }
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          ((qs) this).field_F = new sp[var10.a(false)];
          var3 = 0;
          var4 = (sp) (Object) var10.g(24009);
          L7: while (true) {
            if (var4 == null) {
              ((qs) this).field_J.a((im[]) (Object) ((qs) this).field_F, 0);
              return;
            } else {
              ((qs) this).field_F[var3] = var4;
              var3++;
              var4 = (sp) (Object) var10.c(33);
              continue L7;
            }
          }
        }
    }

    qs() {
        ((qs) this).field_N = -1;
    }

    final void b(int param0) {
        sr[] var3 = new sr[sf.field_D.length];
        sr[] var4 = var3;
        var3[1] = vs.field_k;
        var3[2] = bs.field_a;
        var3[0] = ra.field_H;
        var3[4] = sr.field_k;
        var3[3] = ri.field_u;
        ((qs) this).field_J = new bp(da.field_x, sf.field_D, var4, 50);
        ((qs) this).field_J.a(369, (byte) -111, 54, 175);
        if (param0 != -38) {
            field_K = 109;
        }
        ((qs) this).field_Q = new hd();
        ((qs) this).field_G = new hd();
        ((qs) this).field_L = new hd();
        ((qs) this).field_L.a(true, 640, 640, 0, 480);
        ((qs) this).field_L.a((byte) -110, (hd) (Object) ((qs) this).field_J);
        ((qs) this).field_L.a((byte) -111, ((qs) this).field_Q);
        ((qs) this).field_L.a((byte) -111, ((qs) this).field_G);
        ((qs) this).field_U = eo.a(ja.field_M, 15147554);
        ((qs) this).field_U.field_J = 56;
        ((qs) this).field_U.field_s = 66 - (((qs) this).field_U.field_q >> 1);
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        on.a(((qs) this).field_Q.field_F, ((qs) this).field_Q.field_T, ((qs) this).field_Q.field_q, ((qs) this).field_Q.field_mb, 65793, 96);
        un.field_d.a(oc.field_b, 14 + ((qs) this).field_Q.field_F, ((qs) this).field_Q.field_T + 25, 16777215, -1);
        ((qs) this).field_T.k((byte) 55);
        on.a(((qs) this).field_G.field_F, ((qs) this).field_G.field_T, ((qs) this).field_G.field_q, ((qs) this).field_G.field_mb, 65793, 96);
        un.field_d.a(da.field_i, 14 + ((qs) this).field_G.field_F, 21 + ((qs) this).field_G.field_T, 16777215, -1);
        gm.a(param0 + -5181, ((qs) this).field_U.e((byte) -113), ((qs) this).field_G, ((qs) this).field_T.j((byte) 21));
        ((qs) this).field_J.a(-120);
        ((qs) this).field_L.a(75, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_H = "Box";
        field_P = new int[]{320, 158, 482};
    }
}
