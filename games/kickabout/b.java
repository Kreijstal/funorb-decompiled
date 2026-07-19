/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends ta {
    private mf field_L;
    private hd field_X;
    private hd field_W;
    private pu[] field_T;
    private hd field_R;
    static String field_F;
    private hd field_P;
    private int field_S;
    static String field_O;
    static ut[] field_U;
    private hd[] field_K;
    static hd field_N;
    private hd field_Q;
    static String field_M;
    private hd field_V;
    private hd field_Y;
    static String field_J;
    private hd field_I;
    static sj field_H;
    private hd field_G;

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        super.a(param0, param1, param2);
        this.field_V.field_jb = new tf();
        this.field_L = new mf(ic.field_h);
        this.field_V.a((byte) -113, (hd) (this.field_L));
        this.field_V.a(true, 12 + this.field_L.field_q, 3, 60, 12 + this.field_L.field_mb - -30);
        this.field_L.field_J = 36;
        this.field_L.field_s = 6;
        for (var4 = 0; var4 < 9; var4++) {
            i.field_A[var4] = null;
        }
        gb.field_F = false;
        if (la.a(100)) {
        } else {
            if (!ic.field_h.a(-4)) {
                gb.field_F = true;
            } else {
                or.field_d.b(63, (byte) -86);
            }
        }
        this.g(param0 + -46);
        this.field_L.field_Fb = -1;
    }

    final void a(boolean param0, int param1) {
        if (param1 < 99) {
            this.field_S = 96;
        }
        ig.b(this.field_j, -12452);
    }

    final void h(byte param0) {
        this.field_L.a(param0 + -36);
        if (param0 != 84) {
            this.field_R = (hd) null;
        }
        if ((this.field_L.field_Fb ^ -1) != 0) {
            if (!(!this.field_L.j((byte) 21).field_Eb.c(-2))) {
                this.field_L.field_Fb = -1;
            }
        }
        this.g(-111);
    }

    final static int c(int param0, int param1) {
        if (param0 >= -15) {
            field_N = (hd) null;
        }
        return ((int)((double)hw.field_i * (-hd.field_K + (double)param1)) >> 642761960) + 320;
    }

    public static void f(int param0) {
        field_O = null;
        field_F = null;
        field_M = null;
        if (param0 != -2010043359) {
            return;
        }
        field_U = null;
        field_H = null;
        field_N = null;
        field_J = null;
    }

    final void a(byte param0, boolean param1) {
        kq var3 = null;
        up var4_ref_up = null;
        int var4 = 0;
        pu[] var5_ref_pu__ = null;
        int var5 = 0;
        int var6_int = 0;
        fn var6 = null;
        pu var7 = null;
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          super.a((byte) -55, param1);
          this.field_R.field_s = this.field_j;
          this.field_L.a(48);
          this.field_R.b(0, param1);
          if (this.field_S != this.field_L.field_Fb) {
            this.field_S = this.field_L.field_Fb;
            this.g(-49);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = this.field_L.j((byte) 21);
          if (var3 != null) {
            var4_ref_up = this.field_L.j((byte) 21).field_Eb;
            var5_ref_pu__ = this.field_T;
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= var5_ref_pu__.length) {
                L3: {
                  if (this.field_Q.field_sb == 1) {
                    dg.a((byte) -120, -1, ic.field_h.field_q[this.field_L.field_Fb], var4_ref_up);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = 0;
                L4: while (true) {
                  if (this.field_K.length <= var5) {
                    break L1;
                  } else {
                    if (1 == this.field_K[var5].field_sb) {
                      var6 = pa.field_g[var4_ref_up.field_h[var5]];
                      s.c(-1, ic.field_h.field_q[this.field_L.field_Fb], var5, var6.field_k);
                      var5++;
                      continue L4;
                    } else {
                      var5++;
                      continue L4;
                    }
                  }
                }
              } else {
                var7 = var5_ref_pu__[var6_int];
                var7.h((byte) 30);
                var6_int++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        var4 = -47 / ((param0 - 38) / 60);
    }

    b() {
        this.field_S = -1;
    }

    final void a(int param0, boolean param1) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        hd var3 = null;
        kq var4 = null;
        uo var5 = null;
        String var6 = null;
        ot var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        pu[] var15 = null;
        vc var15_ref = null;
        int var16 = 0;
        String var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        pu[] var23 = null;
        pu var24 = null;
        hd var25 = null;
        up var26 = null;
        pu var27 = null;
        vc var28 = null;
        up stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        up stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        up stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        up stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        up stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        up stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        up stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        up stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        up stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        up stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        String stackIn_22_0 = null;
        up stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        up stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        up stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        up stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        up stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        up stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        up stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        up stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        up stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        up stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        var22 = Kickabout.field_G;
        super.a(param0, param1);
        var25 = this.field_Y;
        on.a(var25.field_F, var25.field_T, var25.field_q, var25.field_mb, 65793, 96);
        var3 = (hd) ((Object) this.field_Y.field_jb.g(24009));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              on.g(this.field_V.field_F, this.field_V.field_T, this.field_V.field_q, this.field_V.field_mb);
              un.field_d.a(oc.field_b, 14 + this.field_V.field_F, 25 + this.field_V.field_T, 16777215, -1);
              this.field_L.k((byte) -109);
              var4 = this.field_L.j((byte) 21);
              var5 = pb.field_C;
              if (var4 == null) {
                discarded$7 = var5.a(gu.field_Db, 20 + this.field_I.field_F, this.field_I.field_T + 10, this.field_I.field_q - 40, -10 + this.field_I.field_mb, 14540253, -1, 1, 1, 16);
                break L1;
              } else {
                L2: {
                  var26 = this.field_L.j((byte) 21).field_Eb;
                  stackOut_4_0 = (up) (var26);
                  stackOut_4_1 = 0;
                  stackOut_4_2 = (up) (var26);
                  stackOut_4_3 = -107;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  if (jd.f(param0 ^ 4)) {
                    stackOut_6_0 = (up) ((Object) stackIn_6_0);
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = (up) ((Object) stackIn_6_2);
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    stackIn_7_4 = stackOut_6_4;
                    break L2;
                  } else {
                    stackOut_5_0 = (up) ((Object) stackIn_5_0);
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = (up) ((Object) stackIn_5_2);
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    stackOut_7_0 = (up) ((Object) stackIn_7_0);
                    stackOut_7_1 = stackIn_7_1;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (((up) (Object) stackIn_7_2).c((byte) stackIn_7_3, stackIn_7_4 == 0)) {
                      break L4;
                    } else {
                      stackOut_8_0 = (up) ((Object) stackIn_8_0);
                      stackOut_8_1 = stackIn_8_1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!wn.a((byte) 47)) {
                        break L4;
                      } else {
                        stackOut_9_0 = (up) ((Object) stackIn_9_0);
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = (up) ((Object) stackIn_10_0);
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                }
                L5: {
                  var7 = kk.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0);
                  var8 = -36 + this.field_I.field_F + this.field_I.field_q;
                  var9 = this.field_I.field_T - -40;
                  if (var7 != null) {
                    ((ut) ((Object) var7)).c(var8 + -(((ut) ((Object) var7)).field_o >> -467939135), -(((ut) ((Object) var7)).field_v >> 1511364385) + var9);
                    break L5;
                  } else {
                    jr.a(var8, param0 + -94, var9);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var10 = 60 + this.field_I.field_F;
                    var11 = 44 + this.field_I.field_T;
                    var12 = 10;
                    var5.c(field_O, var10, var11, 268435455, -1);
                    var5.a(var26.d(100), var10 - -var12, var11, 268435455, -1);
                    var11 += 22;
                    var5.c(hg.field_H, var10, var11, 268435455, -1);
                    var5.a(uf.field_e[var26.field_q], var10 - -var12, var11, 268435455, -1);
                    var11 = -10 + (this.field_I.field_T + this.field_I.field_mb);
                    var13 = this.field_W.field_F - -(-100 + this.field_W.field_q >> -1264520831);
                    var14 = this.field_W.field_T - -32;
                    eo.a(var13, var14, var26.field_n, 0, true, var26.c(true, oi.b(param0 + -73)));
                    var14 += 18;
                    eo.a(var13, var14, var26.field_g, 1, true, var26.a(param0 + 5210, oi.b(-89)));
                    var14 += 18;
                    eo.a(var13, var14, var26.field_o, 2, true, var26.b((byte) 108, oi.b(param0 ^ 95)));
                    if ((var26.field_n ^ -1) != -101) {
                      break L7;
                    } else {
                      if (100 != var26.field_o) {
                        break L7;
                      } else {
                        if ((var26.field_g ^ -1) == -101) {
                          discarded$8 = var5.a(ae.field_M, this.field_P.field_F - -10, this.field_P.field_T - -31, -20 + this.field_P.field_q, -60 + this.field_P.field_mb, 11184810, -1, 0, 1, 16);
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var15_int = this.field_P.field_F + (-100 + this.field_P.field_q >> 1734696353);
                  var16 = 36 + this.field_P.field_T;
                  eo.a(var15_int, var16, var26.field_r, 3, true, 0);
                  if (this.field_Q.e((byte) -113)) {
                    break L6;
                  } else {
                    L8: {
                      if (!this.field_L.j((byte) 21).field_Gb) {
                        stackOut_21_0 = qr.field_a;
                        stackIn_22_0 = stackOut_21_0;
                        break L8;
                      } else {
                        stackOut_20_0 = nq.field_H;
                        stackIn_22_0 = stackOut_20_0;
                        break L8;
                      }
                    }
                    var17 = stackIn_22_0;
                    discarded$9 = var5.a(var17, this.field_P.field_F - -10, 51 + this.field_P.field_T, -20 + this.field_P.field_q, this.field_P.field_mb - 60, 11184810, -1, 0, 1, 16);
                    break L6;
                  }
                }
                L9: {
                  L10: {
                    var14 += 18;
                    if (-1 != (var26.field_h.length ^ -1)) {
                      break L10;
                    } else {
                      if (jd.f(param0 + 4)) {
                        break L10;
                      } else {
                        discarded$10 = var5.a(io.field_o, this.field_X.field_F, this.field_X.field_T, this.field_X.field_q, this.field_X.field_mb, 16777215, -1, 1, 1, 0);
                        break L9;
                      }
                    }
                  }
                  var23 = this.field_T;
                  var15 = var23;
                  var16 = 0;
                  L11: while (true) {
                    if (var23.length <= var16) {
                      break L9;
                    } else {
                      var24 = var23[var16];
                      var27 = var24;
                      q.field_d.d(rv.field_b[var24.field_Bb.field_h], var27.field_F - -(var27.field_q >> -468900831), var27.field_mb + var27.field_T - -14, 16777215, -1);
                      var16++;
                      continue L11;
                    }
                  }
                }
                var28 = i.field_A[ic.field_h.field_q[this.field_L.field_Fb]];
                var15_ref = var28;
                if (!ds.field_g) {
                  L12: {
                    if (var15_ref == null) {
                      break L12;
                    } else {
                      if (!la.a(param0 + 105)) {
                        if (gb.field_F) {
                          var16 = var28.field_v;
                          var17_int = 0;
                          L13: while (true) {
                            if (3 <= var17_int) {
                              L14: {
                                var17 = kq.field_Bb;
                                var18 = 65280;
                                if (ic.field_h.a(1, var28.field_a)) {
                                  var18 = 16711680;
                                  var17 = bs.field_b;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              discarded$11 = var5.a(var17, 10 + this.field_G.field_F, 75 + this.field_G.field_T, -20 + this.field_G.field_q, 50, var18, -1, 1, 1, 0);
                              break L1;
                            } else {
                              L15: {
                                var18 = this.field_G.field_F + (this.field_G.field_q >> 1382036929);
                                var19 = 46 + this.field_G.field_T - -(var17_int * 18);
                                var21 = 16777215;
                                if (-1 == (var17_int ^ -1)) {
                                  if ((var16 ^ -1) == 0) {
                                    var20 = gd.field_d;
                                    var21 = 13421772;
                                    break L15;
                                  } else {
                                    var20 = ad.a(var16, param0 ^ -26297);
                                    break L15;
                                  }
                                } else {
                                  if ((var17_int ^ -1) != -2) {
                                    var20 = ql.field_c[var28.field_s];
                                    break L15;
                                  } else {
                                    if (var28.field_r) {
                                      var20 = ad.a(var28.field_t, 26300);
                                      break L15;
                                    } else {
                                      var21 = 13421772;
                                      var20 = sp.field_Rb;
                                      break L15;
                                    }
                                  }
                                }
                              }
                              var5.c(fk.field_j[var17_int], -7 + var18, var19, var21, -1);
                              var5.a(var20, var18, var19, 16777215, -1);
                              var17_int++;
                              continue L13;
                            }
                          }
                        } else {
                          jr.a(this.field_G.field_F - -(this.field_G.field_q >> -701462623), -32, (this.field_G.field_mb >> -2010043359) + this.field_G.field_T);
                          break L1;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  discarded$12 = var5.a(na.field_Eb, 10 + this.field_G.field_F, this.field_G.field_T, -20 + this.field_G.field_q, this.field_G.field_mb, 11184810, -1, 1, 1, 16);
                  break L1;
                } else {
                  discarded$13 = var5.a(ew.field_d, this.field_G.field_F + 10, this.field_G.field_T, -20 + this.field_G.field_q, this.field_G.field_mb, 11184810, -1, 1, 1, 16);
                  break L1;
                }
              }
            }
            L16: {
              this.field_R.a(param0 + 129, false);
              if (var4 == null) {
                break L16;
              } else {
                if (jd.f(-1)) {
                  L17: {
                    if (-1 <= (this.field_L.j((byte) 21).field_Eb.field_h.length ^ -1)) {
                      break L17;
                    } else {
                      eo.d(this.field_X.field_F, this.field_X.field_T, this.field_X.field_q, this.field_X.field_mb);
                      break L17;
                    }
                  }
                  var6 = wf.field_M;
                  var5.c(var6, this.field_X.field_q + this.field_X.field_F + -20, 22 + this.field_X.field_T, 16777215, -1);
                  break L16;
                } else {
                  if (var4.field_Gb) {
                    var6 = dt.field_e;
                    var5.d(var6, (this.field_X.field_q >> 95798209) + this.field_X.field_F, 109 + this.field_X.field_T, 11184810, -1);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
            }
            return;
          } else {
            on.a(var3.field_F, var3.field_T, var3.field_q, var3.field_mb, 10, 65793, 96);
            un.field_d.a(var3.field_E, var3.field_F - -10, var3.field_T - -20, 16777215, -1);
            var3 = (hd) ((Object) this.field_Y.field_jb.c(33));
            continue L0;
          }
        }
    }

    private final void g(int param0) {
        int var3 = 0;
        up var4 = null;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        fn var8 = null;
        pu var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        kq var13 = null;
        hd stackIn_7_0 = null;
        hd stackIn_8_0 = null;
        hd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_15_0 = null;
        hd stackOut_6_0 = null;
        hd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        hd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String stackOut_14_0 = null;
        String stackOut_13_0 = null;
        L0: {
          var12 = Kickabout.field_G;
          var13 = this.field_L.j((byte) 21);
          this.field_Q.c((byte) -109);
          this.field_X.field_jb = new tf();
          var3 = -36 / ((param0 - 11) / 33);
          if (var13 == null) {
            break L0;
          } else {
            L1: {
              var4 = var13.field_Eb;
              if (-101 < (var4.field_r ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (100 > var4.field_n) {
                    break L2;
                  } else {
                    if (var4.field_g < 100) {
                      break L2;
                    } else {
                      if (100 <= var4.field_o) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  stackOut_6_0 = this.field_Q;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var13.field_Gb) {
                    stackOut_8_0 = (hd) ((Object) stackIn_8_0);
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = (hd) ((Object) stackIn_7_0);
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                stackIn_9_0.field_lb = stackIn_9_1 != 0;
                this.field_P.a((byte) -106, this.field_Q);
                break L1;
              }
            }
            var5 = var13.field_Eb;
            this.field_K = new hd[var5.field_h.length];
            this.field_T = new pu[var5.field_h.length];
            var6 = this.field_X.field_q - 150 * (-1 + var5.field_h.length) >> 960550721;
            var7 = 0;
            L4: while (true) {
              if (var7 >= this.field_K.length) {
                break L0;
              } else {
                L5: {
                  var8 = pa.field_g[var5.field_h[var7]];
                  var9 = new pu(var8, false);
                  if (var8.j(256)) {
                    stackOut_14_0 = mc.field_f;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = cj.field_E;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                var10 = stackIn_15_0;
                this.field_K[var7] = eo.a(var10, 7126504);
                var11 = var6 - -(var7 * 150);
                var9.field_s = var11 + -(var9.field_q >> 1350627489);
                var9.field_J = 36;
                this.field_X.a((byte) -113, (hd) (var9));
                this.field_K[var7].field_s = -(this.field_K[var7].field_q >> 1220085345) + var11;
                this.field_K[var7].field_J = 90;
                this.field_T[var7] = var9;
                this.field_X.a((byte) -117, (hd) (this.field_T[var7]));
                if (!var13.field_Gb) {
                  if (!jd.f(-1)) {
                    this.field_X.a((byte) -108, this.field_K[var7]);
                    var7++;
                    continue L4;
                  } else {
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
        }
        this.field_R.b(0, false);
    }

    final void b(int param0) {
        L0: {
          this.field_V = new hd();
          this.field_Y = new hd();
          this.field_Y.a(true, 452, 180, 60, 358);
          this.field_I = new hd();
          this.field_I.a(true, 234, 6, 6, 84);
          this.field_G = new hd();
          this.field_G.a(true, 234, 6, 96, 124);
          this.field_W = new hd();
          this.field_W.a(true, 200, 246, 6, 100);
          this.field_P = new hd();
          this.field_P.a(true, 200, 246, 112, 108);
          this.field_X = new hd();
          this.field_X.a(true, 440, 6, 226, 126);
          if (param0 == -38) {
            break L0;
          } else {
            this.field_L = (mf) null;
            break L0;
          }
        }
        this.field_I.field_E = tr.field_g.toLowerCase();
        this.field_W.field_E = q.field_f.toLowerCase();
        this.field_P.field_E = fi.field_d.toLowerCase();
        this.field_G.field_E = ca.field_d.toLowerCase();
        this.field_X.field_E = mp.field_k.toLowerCase();
        this.field_Q = eo.a(ov.field_c, 7126504);
        this.field_K = new hd[]{};
        this.field_T = new pu[]{};
        this.field_Q.field_s = -this.field_Q.field_q + this.field_P.field_q >> -1974702431;
        this.field_Q.field_J = 66;
        this.field_Y.a((byte) -115, this.field_X);
        this.field_Y.a((byte) -109, this.field_I);
        this.field_Y.a((byte) -126, this.field_W);
        this.field_Y.a((byte) -115, this.field_P);
        this.field_Y.a((byte) -104, this.field_G);
        this.field_R = new hd();
        this.field_R.a(true, 640, 640, 0, 480);
        this.field_R.a((byte) -125, this.field_V);
        this.field_R.a((byte) -109, this.field_Y);
    }

    final int b(int param0, int param1) {
        if (param1 != -22667) {
            this.field_V = (hd) null;
        }
        return (param0 ^ -1) != -2 ? 320 : 600;
    }

    static {
        field_F = "To <%0>: ";
        field_O = "Name: ";
        field_M = "Passwords must be between 5 and 20 characters long";
        field_J = "Use the buttons to choose your formation. Click OK when ready.";
    }
}
