/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends kj implements sg {
    static int[] field_O;
    private ng field_M;
    private ng field_P;
    static int field_K;
    private ng field_L;
    static int[] field_N;
    static int field_J;

    public ih() {
        super(0, 0, 476, 225, (j) null);
        ((ih) this).field_M = new ng(nd.field_a, (gg) null);
        ((ih) this).field_P = new ng(uk.field_Q, (gg) null);
        ((ih) this).field_L = new ng(cj.field_k, (gg) null);
        cl var1 = new cl();
        ((ih) this).field_M.field_q = (j) (Object) var1;
        ((ih) this).field_P.field_q = (j) (Object) var1;
        ((ih) this).field_L.field_q = (j) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1994746241;
        ((ih) this).field_P.a((byte) 111, -var3 + ((ih) this).field_p >> -1872318335, 30, var4, -var2 + (((ih) this).field_l - 48));
        ((ih) this).field_L.a((byte) 116, var4 + (-var3 + ((ih) this).field_p >> -948730079) - -var2, 30, var4, -var2 + -48 + ((ih) this).field_l);
        ((ih) this).field_M.a((byte) 123, ((ih) this).field_p + -var3 >> 1795746721, 30, var3, -(2 * var2) + (((ih) this).field_l - 78));
        ((ih) this).field_P.field_k = (gg) this;
        ((ih) this).field_M.field_k = (gg) this;
        ((ih) this).field_L.field_k = (gg) this;
        ((ih) this).field_M.field_r = am.field_c;
        ((ih) this).field_L.field_r = vk.field_c;
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_P);
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_M);
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_L);
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 == ((ih) this).field_P) {
            nd.b((byte) 116);
        } else {
            if (param0 != ((ih) this).field_M) {
                // if_acmpne L54
                hf.a((byte) -111);
            } else {
                k.a(-14956);
            }
        }
        if (param4) {
            field_K = -44;
        }
    }

    final static boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -77) {
            break L0;
          } else {
            ih.h(-21);
            break L0;
          }
        }
        L1: {
          L2: {
            if (gj.field_c > -11) {
              break L2;
            } else {
              if (-14 > li.field_K) {
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

    final static void a(int param0) {
        L0: {
          oa.field_g = 0;
          ha.field_d = 0;
          jj.field_d = false;
          cl.field_z = false;
          s.field_m = false;
          db.field_B = 0;
          ra.field_q = false;
          dk.field_a = 0;
          ah.field_i = false;
          ng.field_I = 0;
          ni.field_b = false;
          lc.field_r = false;
          me.field_g = 0;
          ii.field_k = null;
          we.field_j = 0;
          lj.field_b = 0;
          ec.field_b = -1;
          ed.field_c = 0;
          gh.field_m = false;
          fa.field_t = -1;
          sd.field_d = 0;
          kc.field_w = null;
          fh.field_d = 0;
          vi.field_a = 0;
          n.field_jb = 0;
          fc.field_o = 0;
          if (param0 > 84) {
            break L0;
          } else {
            field_O = null;
            break L0;
          }
        }
        rk.field_e = true;
        o.field_l = 0;
        ad.field_a = true;
        tk.field_P = false;
        bd.field_l = false;
        i.field_r = 0;
        qk.field_lb = 0;
        rj.field_d = null;
        uf.field_k = false;
        hf.field_c = 0;
        gl.field_f = false;
        pi.field_c = null;
        id.field_d = null;
        wj.field_a = 0;
        eb.field_n = false;
        wk.field_F = 0;
        ii.field_e = false;
        kl.field_a = false;
        ql.field_j = false;
        td.field_e = 0;
        bk.field_w = false;
        hb.field_f = 0;
        ti.field_d = 0;
        vd.field_b = true;
        kf.field_d = 0;
        ea.field_h = null;
        sf.field_c = 0;
        ql.field_n = 0;
        mj.field_b = false;
        wh.field_b = false;
        qh.d(true);
        sd.a(123);
        sd.b(116);
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (super.a(param0, param1, (byte) 98, param3)) {
            return true;
        }
        if (!(98 != param0)) {
            return ((ih) this).a(param3, (byte) -16);
        }
        if (param0 == 99) {
            return ((ih) this).b(113, param3);
        }
        if (param2 <= 9) {
            Object var6 = null;
            boolean discarded$0 = ((ih) this).a(20, 'Q', (byte) 83, (ee) null);
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ka var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = TorChallenge.field_F ? 1 : 0;
          if (qg.field_a <= param1) {
            break L0;
          } else {
            param0 = param0 - (qg.field_a - param1);
            param1 = qg.field_a;
            break L0;
          }
        }
        L1: {
          if (qg.field_k <= param6) {
            break L1;
          } else {
            param3 = param3 - (-param6 + qg.field_k);
            param6 = qg.field_k;
            break L1;
          }
        }
        L2: {
          if (qg.field_c >= param0 + param1) {
            break L2;
          } else {
            param0 = -param1 + qg.field_c;
            break L2;
          }
        }
        if (param2 == 4) {
          L3: {
            if (qg.field_l >= param6 - -param3) {
              break L3;
            } else {
              param3 = qg.field_l - param6;
              break L3;
            }
          }
          L4: {
            if (param0 <= 0) {
              break L4;
            } else {
              if (-1 <= (param3 ^ -1)) {
                break L4;
              } else {
                var21 = param5.c();
                var32 = qg.field_i;
                var10 = qg.field_g;
                var11 = qg.field_f;
                var30 = new int[4];
                qg.a(var30);
                param5.d();
                qg.a(var30[0], var30[1], var30[2], var30[3]);
                var13 = param6 * param5.field_u + param1;
                var14 = -param0 + param5.field_u;
                var31 = var21.field_y;
                var28 = var31;
                var25 = var28;
                var22 = var25;
                var15 = var22;
                var16 = param6;
                L5: while (true) {
                  if (var16 >= param6 + param3) {
                    var21.g(-param5.field_s, -param5.field_p);
                    qg.a(var32, var10, var11);
                    qg.b(var30);
                    return;
                  } else {
                    var17 = param1;
                    L6: while (true) {
                      if (param1 - -param0 <= var17) {
                        var13 = var13 + var14;
                        var16++;
                        continue L5;
                      } else {
                        var18 = var31[var13];
                        if (-1 != (var18 ^ -1)) {
                          L7: {
                            L8: {
                              if ((var17 ^ -1) >= -1) {
                                break L8;
                              } else {
                                if (0 == var15[-1 + var13]) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if ((var16 ^ -1) >= -1) {
                                break L9;
                              } else {
                                if (var15[var13 - param5.field_u] == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var17 >= param5.field_u - 1) {
                                break L10;
                              } else {
                                if (var15[var13 - -1] == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var16 < -1 + param5.field_x) {
                              if (-1 == (var15[param5.field_u + var13] ^ -1)) {
                                break L7;
                              } else {
                                var13++;
                                var17++;
                                continue L6;
                              }
                            } else {
                              var13++;
                              var17++;
                              continue L6;
                            }
                          }
                          qg.e(var17, var16, param4, param7);
                          var13++;
                          var17++;
                          continue L6;
                        } else {
                          var13++;
                          var17++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        field_O = null;
        if (param0 != 99) {
            field_K = -128;
        }
        field_N = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = ((ih) this).field_m - -param1;
        int var6 = ((ih) this).field_i + param0;
        int discarded$0 = oe.field_g.a(dk.field_g, 20 + var5, var6 + 20, -40 + ((ih) this).field_p, ((ih) this).field_l + -50, 16777215, -1, 1, 0, oe.field_g.field_x);
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[8192];
        field_N = new int[]{16773632, 12095488, 12424960, 16773632};
        field_J = 0;
    }
}
