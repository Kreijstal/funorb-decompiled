/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class nn extends tf {
    static String field_t;
    static ij field_q;
    static eh field_s;
    static String field_m;
    static int field_p;
    static int[][] field_n;
    int field_r;
    static og field_o;

    abstract boolean f(byte param0);

    final static String g() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        String var1 = "(" + ve.field_m + " " + nf.field_W + " " + se.field_I + ") " + on.field_g;
        if (fj.field_h <= 0) {
        } else {
            var1 = var1 + ":";
            for (var2 = 0; var2 < fj.field_h; var2++) {
                var1 = var1 + 32;
                var3 = 255 & df.field_z.field_j[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public static void c() {
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
        field_m = null;
        field_n = null;
    }

    final static void a(byte[] param0, int[] param1, int param2, qb[][] param3, int param4, String[] param5, String[][] param6, String[] param7, eg param8, byte[] param9, String[] param10, String[][] param11, int param12, qb[][] param13) {
        kc var16 = null;
        int var17_int = 0;
        kc var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        kc var23 = null;
        kc var24 = null;
        kc stackIn_3_0 = null;
        kc stackIn_3_1 = null;
        long stackIn_3_2 = 0L;
        kc stackIn_3_3 = null;
        kc stackIn_4_0 = null;
        kc stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        kc stackIn_4_3 = null;
        kc stackIn_5_0 = null;
        kc stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        kc stackIn_5_3 = null;
        String stackIn_5_4 = null;
        kc stackOut_2_0 = null;
        kc stackOut_2_1 = null;
        long stackOut_2_2 = 0L;
        kc stackOut_2_3 = null;
        kc stackOut_4_0 = null;
        kc stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        kc stackOut_4_3 = null;
        String stackOut_4_4 = null;
        kc stackOut_3_0 = null;
        kc stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        kc stackOut_3_3 = null;
        String stackOut_3_4 = null;
        L0: {
          var21 = ArcanistsMulti.field_G ? 1 : 0;
          le.field_q = 1;
          fl.field_b = param7;
          pn.field_b = param13;
          lj.field_o = param6;
          ef.field_t = 6;
          ao.field_h = param1;
          qa.field_o = param11;
          rk.field_I = param5;
          nk.field_m = param3;
          ob.field_bb = param10;
          ml.field_m = param9;
          gb.field_d = param0;
          mo.field_b = qe.a(param8, "gameprivacy", "lobby", 92);
          re.field_j = qe.a(param8, "ratedgame", "lobby", 81);
          sk.field_f = qe.a(param8, "opentome", "lobby", 71);
          ec.field_i = qe.a(param8, "allowspectators", "lobby", 88);
          vm.field_c = new String[5];
          vm.field_c[4] = io.field_C;
          vm.field_c[1] = ne.field_a;
          vm.field_c[0] = wm.field_F;
          vm.field_c[2] = um.field_d;
          vm.field_c[3] = lj.field_m;
          mj.field_s = new kc(0L, (kc) null);
          uc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          nh.field_z = new kc(0L, vf.field_i, ef.field_q);
          nj.field_m = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          mj.field_s.a(uc.field_d, 89);
          if (!fc.field_a) {
            break L0;
          } else {
            mj.field_s.a(nh.field_z, 41);
            break L0;
          }
        }
        L1: {
          mj.field_s.a((kc) (Object) nj.field_m, 47);
          nj.field_m.field_Hb.a(pg.field_c, (byte) 126);
          var23 = nj.field_m.field_Hb;
          var24 = var23;
          nj.field_m.field_Hb.field_gb = 1;
          var24.field_X = 1;
          kg.field_c = new kc(0L, pg.field_c);
          kg.field_c.field_X = 1;
          ii.field_b = new kc(0L, th.field_c, ti.field_M.toUpperCase());
          sm.field_c = new kc(0L, wa.field_Pb, hb.field_Ib.toUpperCase());
          ad.field_c = new kc(0L, ia.field_a);
          tj.field_o = new kc(0L, vf.field_u, of.field_k);
          hg.field_e = new kc(0L, rn.field_S, lc.field_c);
          ci.field_a = new kc(0L, rn.field_S, ba.field_c);
          lo.field_r = new kc(0L, rn.field_S, dk.field_h);
          vc.field_j = new kc(0L, rn.field_S, g.field_b);
          jo.field_a = new kc(0L, vf.field_i, kh.field_a);
          ee.field_g = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          of.field_a = new kc(0L, ko.field_h, fi.field_f.toUpperCase());
          of.field_a.field_ub = fc.field_a;
          stackOut_2_0 = null;
          stackOut_2_1 = null;
          stackOut_2_2 = 0L;
          stackOut_2_3 = ko.field_h;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (fc.field_a) {
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (kc) (Object) stackIn_4_3;
            stackOut_4_4 = ga.field_t;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackOut_3_1 = null;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = (kc) (Object) stackIn_3_3;
            stackOut_3_4 = sl.field_K;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        L2: {
          jl.field_a = new kc(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_5_4).toUpperCase());
          fn.field_e = new kc(0L, (kc) null);
          fn.field_e.a(sm.field_c, 23);
          fn.field_e.a(ad.field_c, 36);
          ad.field_c.a(tj.field_o, 106);
          ad.field_c.a(hg.field_e, 50);
          ad.field_c.a(ci.field_a, 22);
          if (!fc.field_a) {
            break L2;
          } else {
            ad.field_c.a(lo.field_r, 44);
            break L2;
          }
        }
        L3: {
          ad.field_c.a(vc.field_j, 49);
          ad.field_c.a(jo.field_a, 29);
          ad.field_c.a((kc) (Object) ee.field_g, 124);
          if (!fc.field_a) {
            break L3;
          } else {
            fn.field_e.a(of.field_a, 20);
            break L3;
          }
        }
        L4: {
          fn.field_e.a(jl.field_a, 15);
          la.field_c = new kc(0L, pg.field_c);
          la.field_c.field_gb = 0;
          la.field_c.field_X = 1;
          dm.field_E = new kc(0L, gn.field_c, im.field_f.toUpperCase());
          gm.field_h = new kc(0L, mf.field_d);
          gm.field_h.a(la.field_c, 110);
          gm.field_h.a(dm.field_E, 121);
          vc.field_c = new kc(0L, am.field_c);
          vc.field_c.a(pg.field_c, (byte) 119);
          vc.field_c.field_gb = 1;
          var16 = vc.field_c;
          var16.field_X = 1;
          bk.field_M = new kc(0L, (kc) null);
          aj.field_d = new kc(0L, pg.field_c);
          aj.field_d.field_X = 1;
          qc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          hf.field_q = new kc(0L, vf.field_i, ef.field_q);
          lf.field_b = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          bk.field_M.a(aj.field_d, 30);
          bk.field_M.a(qc.field_d, 51);
          if (fc.field_a) {
            bk.field_M.a(hf.field_q, 12);
            break L4;
          } else {
            break L4;
          }
        }
        bk.field_M.a((kc) (Object) lf.field_b, 31);
        mo.field_o = new kc(0L, th.field_c, gb.field_a.toUpperCase());
        nl.field_Db = new kc(0L, wa.field_Pb);
        mi.field_m = new kc(0L, ia.field_a);
        ib.field_s = new kc(0L, dd.field_b, o.field_o.toUpperCase());
        s.field_e = new nl[7][];
        wd.field_g = new kc[7];
        wd.field_g[0] = new kc(0L, mi.field_A, gg.field_i);
        s.field_e[0] = new nl[6];
        var17_int = 0;
        L5: while (true) {
          if (var17_int >= 5) {
            L6: {
              if (ao.field_h.length < 2) {
                break L6;
              } else {
                wd.field_g[1] = new kc(0L, mi.field_A, w.field_Bb);
                s.field_e[1] = new nl[ao.field_h.length - -1];
                s.field_e[1][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                var17_int = 0;
                L7: while (true) {
                  if (ao.field_h.length <= var17_int) {
                    break L6;
                  } else {
                    s.field_e[1][var17_int - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, Integer.toString(ao.field_h[var17_int]));
                    var17_int++;
                    continue L7;
                  }
                }
              }
            }
            L8: {
              wd.field_g[2] = new kc(0L, mi.field_A, gb.field_b);
              s.field_e[2] = new nl[3];
              if (le.field_q > 1) {
                wd.field_g[3] = new kc(0L, mi.field_A, fm.field_e);
                s.field_e[3] = new nl[le.field_q + 1];
                s.field_e[3][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                var17_int = 0;
                L9: while (true) {
                  if (var17_int >= le.field_q) {
                    break L8;
                  } else {
                    s.field_e[3][1 + var17_int] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, fl.field_b[var17_int]);
                    var17_int++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            var17_int = 0;
            L10: while (true) {
              if (var17_int >= 3) {
                var17_int = 0;
                L11: while (true) {
                  if (var17_int >= 7) {
                    go.field_d = new kc(0L, ko.field_h);
                    dk.field_k = new kc(0L, ko.field_h);
                    jf.field_d = new kc(0L, j.field_f);
                    jf.field_d.a(pg.field_c, (byte) 119);
                    var17 = jf.field_d;
                    jf.field_d.field_gb = 1;
                    var17.field_X = 1;
                    oh.field_h = new kc(0L, (kc) null);
                    oh.field_h.a(nl.field_Db, 19);
                    oh.field_h.a(mi.field_m, 49);
                    mi.field_m.a(ib.field_s, 98);
                    var18 = 0;
                    L12: while (true) {
                      if (var18 >= 7) {
                        oh.field_h.a(go.field_d, 13);
                        oh.field_h.a(dk.field_k, 23);
                        oh.field_h.a(jf.field_d, 110);
                        hf.field_t = new kc(0L, be.field_l, mb.field_O.toUpperCase());
                        gj.field_d = new kc(0L, gn.field_c, f.field_i.toUpperCase());
                        return;
                      } else {
                        L13: {
                          L14: {
                            if (1 != var18) {
                              break L14;
                            } else {
                              if (2 <= ao.field_h.length) {
                                break L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (3 != var18) {
                              break L15;
                            } else {
                              if (1 < le.field_q) {
                                break L15;
                              } else {
                                break L13;
                              }
                            }
                          }
                          mi.field_m.a(wd.field_g[var18], 7);
                          var19 = 0;
                          L16: while (true) {
                            if (s.field_e[var18].length <= var19) {
                              break L13;
                            } else {
                              L17: {
                                if (s.field_e[var18][var19] == null) {
                                  break L17;
                                } else {
                                  mi.field_m.a((kc) (Object) s.field_e[var18][var19], 92);
                                  break L17;
                                }
                              }
                              var19++;
                              continue L16;
                            }
                          }
                        }
                        var18++;
                        continue L12;
                      }
                    }
                  } else {
                    L18: {
                      if (wd.field_g[var17_int] != null) {
                        wd.field_g[var17_int].field_z = 11;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (s.field_e[var17_int] != null) {
                        var18 = 0;
                        L20: while (true) {
                          if (s.field_e[var17_int].length <= var18) {
                            break L19;
                          } else {
                            L21: {
                              if (s.field_e[var17_int][var18] == null) {
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            var18++;
                            continue L20;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                    var17_int++;
                    continue L11;
                  }
                }
              } else {
                wd.field_g[var17_int + 4] = new kc(0L, mi.field_A, ob.field_bb[var17_int]);
                s.field_e[var17_int + 4] = new nl[1 + dg.a((int) gb.field_d[var17_int], 255)];
                s.field_e[4 - -var17_int][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                var18 = 0;
                L22: while (true) {
                  if (var18 >= (gb.field_d[var17_int] & 255)) {
                    var17_int++;
                    continue L10;
                  } else {
                    L23: {
                      if (null == pn.field_b) {
                        var19_ref = null;
                        break L23;
                      } else {
                        if (null != pn.field_b[var17_int]) {
                          var19_ref = (Object) (Object) pn.field_b[var17_int][var18];
                          break L23;
                        } else {
                          var19_ref = null;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (lj.field_o == null) {
                        var20 = null;
                        break L24;
                      } else {
                        if (null != lj.field_o[var17_int]) {
                          var20 = (Object) (Object) lj.field_o[var17_int][var18];
                          break L24;
                        } else {
                          var20 = null;
                          break L24;
                        }
                      }
                    }
                    s.field_e[4 + var17_int][var18 - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) var19_ref, (String) var20);
                    var18++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            s.field_e[0][var17_int + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, mo.field_b[var17_int], vm.field_c[var17_int]);
            var17_int++;
            continue L5;
          }
        }
    }

    abstract Object e(byte param0);

    final static byte[] a(int param0, byte param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        rm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
                var4 = param2;
                break L1;
              } else {
                var8 = new byte[param0];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param0 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param2[param3 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new rm();
            var5.c(-23645);
            var5.a((long)(8 * param0), 8, var4);
            var6 = new byte[64];
            var5.a((byte) 119, 0, var6);
            stackOut_6_0 = (byte[]) var6;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("nn.A(").append(param0).append(44).append(-93).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    nn(int param0) {
        ((nn) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "You are offering to draw.";
        field_p = 15;
        field_m = "Start Game";
        field_s = new eh();
        field_n = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
