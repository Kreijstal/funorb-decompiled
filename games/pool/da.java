/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class da {
    static int field_b;
    static String field_a;

    final static void a(boolean param0) {
        if (!param0) {
            da.a(false);
        }
        d.field_f.b(0, 2147483647, 0, -(tq.field_p ? 40 + (nk.field_n + 4) : 0) + c.field_e.field_gb, 18);
        kj.field_a.b(0, 2147483647, -40 + -nk.field_n + c.field_e.field_gb - 2, nk.field_n + 42, 18);
        ci.field_c.a(nk.field_n, -20 + c.field_e.field_Db, (byte) -112, 2, c.field_e.field_gb, 0, 20);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ea var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        oq var13 = null;
        int var14 = 0;
        int var15 = 0;
        oq var16 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Pool.field_O;
        try {
          L0: {
            var13 = kn.field_e;
            var16 = var13;
            var2 = var16.g(-113);
            var3 = (ea) (Object) rc.field_c.c((byte) 100);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_s) {
                    break L2;
                  } else {
                    var3 = (ea) (Object) rc.field_c.f((byte) -5);
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var16.g(-79);
                  if (var4 != 0) {
                    var5 = var3.field_o;
                    sa.field_e[0] = di.field_j;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        gn.a(var4, var5, false);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            sp.a(true, var5);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_n = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][var5 * 4];
                            var3.field_q = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = jh.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var8 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = ep.field_H[var5 + var14];
                                      var6[1][var15] = sa.field_e[var11];
                                      var7[1][4 * var15] = kb.field_g[var11];
                                      var7[1][4 * var15 - -1] = ob.field_y[var11];
                                      var7[1][2 + var15 * 4] = om.field_s[var11];
                                      var7[1][var15 * 4 - -3] = gd.field_d[var11];
                                      if (!or.a((byte) 3, sa.field_e[var11])) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = ep.field_H[var9];
                                  var6[0][var10] = sa.field_e[var11];
                                  var7[0][var10 * 4] = kb.field_g[var11];
                                  var7[0][1 + 4 * var10] = ob.field_y[var11];
                                  var7[0][2 + var10 * 4] = om.field_s[var11];
                                  var7[0][var10 * 4 + 3] = gd.field_d[var11];
                                  if (or.a((byte) 3, sa.field_e[var11])) {
                                    if (0 == om.field_s[var11] + ob.field_y[var11] + gd.field_d[var11]) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              sf.b((byte) 125, (ge) (Object) var16);
                              if (0 == var6_int) {
                                var3.field_t = vb.field_f;
                                var3.field_w = vd.field_n;
                                var3.field_y = wi.field_a;
                                var3.field_x = jj.field_F;
                                rq.a(vd.field_n, var6_int, true, vb.field_f, wi.field_a, jj.field_F);
                                break L10;
                              } else {
                                rq.a(vd.field_n, var6_int, true, vb.field_f, wi.field_a, jj.field_F);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        sa.field_e[var6_int] = var13.j(-36);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_v = true;
                var3.a((byte) -117);
                break L0;
              } else {
                dn.c(-82);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "da.D(" + 106 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        String[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        String[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        String[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        String[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String stackOut_6_2 = null;
        String[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        String stackOut_5_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            if (null != nk.field_f) {
              return;
            } else {
              L1: {
                nk.field_f = new String[66];
                nk.field_f[8] = null;
                nk.field_f[2] = ti.field_c;
                nk.field_f[7] = qe.field_p;
                nk.field_f[6] = wd.field_Ob;
                nk.field_f[13] = dk.field_g;
                nk.field_f[4] = uj.field_b;
                nk.field_f[11] = ko.field_b;
                nk.field_f[0] = tg.field_e;
                nk.field_f[9] = bm.field_i;
                nk.field_f[1] = gr.field_H;
                nk.field_f[48] = un.field_d;
                nk.field_f[5] = hb.field_p;
                nk.field_f[23] = ep.field_y;
                stackOut_4_0 = nk.field_f;
                stackOut_4_1 = 49;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (!th.field_h) {
                  stackOut_6_0 = (String[]) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = uf.field_K;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (String[]) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = hb.field_q;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              stackIn_7_0[stackIn_7_1] = stackIn_7_2;
              nk.field_f[38] = s.field_d[1];
              nk.field_f[59] = wm.field_Yb;
              nk.field_f[19] = qd.field_e;
              nk.field_f[21] = fn.field_Nb;
              nk.field_f[56] = cb.field_b[2];
              nk.field_f[53] = pl.field_e;
              nk.field_f[47] = ko.field_a;
              nk.field_f[24] = de.field_f;
              nk.field_f[60] = md.field_a[5];
              nk.field_f[54] = cb.field_b[0];
              nk.field_f[14] = ih.field_f[0];
              nk.field_f[15] = ih.field_f[1];
              nk.field_f[39] = sa.field_b;
              nk.field_f[52] = qe.field_O;
              nk.field_f[55] = cb.field_b[1];
              nk.field_f[65] = ua.field_s;
              nk.field_f[40] = sl.field_U;
              nk.field_f[41] = fd.field_Q;
              nk.field_f[43] = oo.field_c;
              nk.field_f[26] = ue.field_d;
              nk.field_f[51] = pl.field_e;
              var1_int = -62 / ((-24 - param0) / 60);
              nk.field_f[22] = ge.field_o;
              nk.field_f[25] = cb.field_c;
              nk.field_f[42] = pf.field_a;
              nk.field_f[17] = mm.field_n[0];
              nk.field_f[20] = up.field_v;
              nk.field_f[50] = qe.field_O;
              nk.field_f[18] = mm.field_n[1];
              nk.field_f[3] = dg.field_M;
              nk.field_f[12] = up.field_J;
              nk.field_f[16] = ih.field_f[2];
              nk.field_f[37] = s.field_d[2];
              nk.field_f[57] = cb.field_b[3];
              nk.field_f[58] = cb.field_b[4];
              nk.field_f[62] = id.field_d;
              nk.field_f[61] = bc.field_d;
              var2 = 0;
              L2: while (true) {
                if (cb.field_b.length <= var2) {
                  var2 = 0;
                  L3: while (true) {
                    if (cb.field_b.length <= var2) {
                      qk.field_c[2][cb.field_b.length] = sn.field_k;
                      wj.field_S = new String[22];
                      ve.field_q[1] = im.field_ic;
                      ve.field_q[3] = ke.field_c;
                      wj.field_S[6] = wa.field_ob;
                      wj.field_S[0] = ll.field_g;
                      wj.field_S[1] = aj.field_Tb;
                      wj.field_S[4] = jq.field_b;
                      wj.field_S[3] = ml.field_a;
                      wj.field_S[2] = ln.field_l;
                      wj.field_S[8] = tq.field_v;
                      wj.field_S[5] = bo.field_b;
                      wj.field_S[11] = vf.field_Q;
                      wj.field_S[2] = ln.field_l;
                      wj.field_S[9] = rg.field_t;
                      wj.field_S[12] = oq.field_C;
                      wj.field_S[10] = me.field_w;
                      var2 = 1;
                      L4: while (true) {
                        if (9 < var2) {
                          hf.a(dl.field_e, hj.field_e, (byte) -96);
                          break L0;
                        } else {
                          wj.field_S[var2 + 12] = or.field_k[var2];
                          var2++;
                          continue L4;
                        }
                      }
                    } else {
                      qk.field_c[2][var2] = cb.field_b[var2];
                      var2++;
                      continue L3;
                    }
                  }
                } else {
                  nk.field_f[29 + var2] = cb.field_b[var2];
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "da.A(" + param0 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> has entered another game.";
    }
}
