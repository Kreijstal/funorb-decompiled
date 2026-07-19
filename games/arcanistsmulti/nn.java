/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    final static String g(byte param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -25) {
            nn.c(-47);
        }
        String var6 = "(" + ve.field_m + " " + nf.field_W + " " + se.field_I + ") " + on.field_g;
        String var1 = var6;
        if (-1 <= (fj.field_h ^ -1)) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < fj.field_h; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & df.field_z.field_j[var2];
                var4 = var3 >> -153130460;
                var3 = var3 & 15;
                if (-11 >= (var4 ^ -1)) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    public static void c(int param0) {
        field_t = null;
        if (param0 <= 25) {
            return;
        }
        field_s = null;
        field_o = null;
        field_q = null;
        field_m = null;
        field_n = (int[][]) null;
    }

    final static void a(byte[] param0, int[] param1, int param2, qb[][] param3, int param4, String[] param5, String[][] param6, String[] param7, eg param8, byte[] param9, String[] param10, String[][] param11, int param12, qb[][] param13, int param14) {
        nl[] array$3 = null;
        nl[] array$4 = null;
        nl[] array$5 = null;
        RuntimeException var15 = null;
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
        kc stackIn_4_0 = null;
        kc stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        kc stackIn_4_3 = null;
        kc stackIn_5_0 = null;
        kc stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        kc stackIn_5_3 = null;
        kc stackIn_6_0 = null;
        kc stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        kc stackIn_6_3 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        kc stackOut_3_0 = null;
        kc stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        kc stackOut_3_3 = null;
        kc stackOut_5_0 = null;
        kc stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        kc stackOut_5_3 = null;
        String stackOut_5_4 = null;
        kc stackOut_4_0 = null;
        kc stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        kc stackOut_4_3 = null;
        String stackOut_4_4 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              le.field_q = param12;
              fl.field_b = param7;
              pn.field_b = param13;
              lj.field_o = param6;
              ef.field_t = param4;
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
              mj.field_s.a(uc.field_d, param14 + 87);
              if (!fc.field_a) {
                break L1;
              } else {
                mj.field_s.a(nh.field_z, 41);
                break L1;
              }
            }
            L2: {
              mj.field_s.a(nj.field_m, 47);
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
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = 0L;
              stackOut_3_3 = ko.field_h;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (fc.field_a) {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (kc) ((Object) stackIn_5_3);
                stackOut_5_4 = ga.field_t;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackOut_4_1 = null;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = (kc) ((Object) stackIn_4_3);
                stackOut_4_4 = sl.field_K;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            L3: {
              jl.field_a = new kc(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              fn.field_e = new kc(0L, (kc) null);
              fn.field_e.a(sm.field_c, 23);
              fn.field_e.a(ad.field_c, 36);
              ad.field_c.a(tj.field_o, 106);
              ad.field_c.a(hg.field_e, 50);
              ad.field_c.a(ci.field_a, param14 + 20);
              if (!fc.field_a) {
                break L3;
              } else {
                ad.field_c.a(lo.field_r, 44);
                break L3;
              }
            }
            L4: {
              ad.field_c.a(vc.field_j, param14 + 47);
              ad.field_c.a(jo.field_a, 29);
              ad.field_c.a(ee.field_g, 124);
              if (!fc.field_a) {
                break L4;
              } else {
                fn.field_e.a(of.field_a, 20);
                break L4;
              }
            }
            L5: {
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
                bk.field_M.a(hf.field_q, param14 + 10);
                break L5;
              } else {
                break L5;
              }
            }
            bk.field_M.a(lf.field_b, 31);
            mo.field_o = new kc(0L, th.field_c, gb.field_a.toUpperCase());
            nl.field_Db = new kc(0L, wa.field_Pb);
            mi.field_m = new kc(0L, ia.field_a);
            ib.field_s = new kc(0L, dd.field_b, o.field_o.toUpperCase());
            s.field_e = new nl[param2 + 4][];
            wd.field_g = new kc[4 + param2];
            wd.field_g[0] = new kc(0L, mi.field_A, gg.field_i);
            s.field_e[0] = new nl[6];
            var17_int = 0;
            L6: while (true) {
              if ((var17_int ^ -1) <= -6) {
                L7: {
                  if (-3 < (ao.field_h.length ^ -1)) {
                    break L7;
                  } else {
                    wd.field_g[1] = new kc(0L, mi.field_A, w.field_Bb);
                    array$3 = new nl[ao.field_h.length - -1];
                    s.field_e[1] = array$3;
                    s.field_e[1][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                    var17_int = 0;
                    L8: while (true) {
                      if (ao.field_h.length <= var17_int) {
                        break L7;
                      } else {
                        s.field_e[1][var17_int - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, Integer.toString(ao.field_h[var17_int]));
                        var17_int++;
                        continue L8;
                      }
                    }
                  }
                }
                L9: {
                  wd.field_g[2] = new kc(0L, mi.field_A, gb.field_b);
                  s.field_e[param14] = new nl[]{new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb), new nl(0L, nf.field_j, (kc) null, nj.field_d, ec.field_i[0], nh.field_B), new nl(0L, nf.field_j, (kc) null, nj.field_d, ec.field_i[1], cf.field_d)};
                  if (le.field_q > 1) {
                    wd.field_g[3] = new kc(0L, mi.field_A, fm.field_e);
                    array$4 = new nl[le.field_q + 1];
                    s.field_e[3] = array$4;
                    s.field_e[3][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                    var17_int = 0;
                    L10: while (true) {
                      if (var17_int >= le.field_q) {
                        break L9;
                      } else {
                        s.field_e[3][1 + var17_int] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, fl.field_b[var17_int]);
                        var17_int++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var17_int = 0;
                L11: while (true) {
                  if (param2 <= var17_int) {
                    var17_int = 0;
                    L12: while (true) {
                      if (param2 - -4 <= var17_int) {
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
                        L13: while (true) {
                          if (var18 >= param2 - -4) {
                            oh.field_h.a(go.field_d, 13);
                            oh.field_h.a(dk.field_k, 23);
                            oh.field_h.a(jf.field_d, 110);
                            hf.field_t = new kc(0L, be.field_l, mb.field_O.toUpperCase());
                            gj.field_d = new kc(0L, gn.field_c, f.field_i.toUpperCase());
                            break L0;
                          } else {
                            L14: {
                              L15: {
                                if (1 != var18) {
                                  break L15;
                                } else {
                                  if (2 <= ao.field_h.length) {
                                    break L15;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L16: {
                                if (3 != var18) {
                                  break L16;
                                } else {
                                  if (1 < le.field_q) {
                                    break L16;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              mi.field_m.a(wd.field_g[var18], param14 + 5);
                              var19 = 0;
                              L17: while (true) {
                                if (s.field_e[var18].length <= var19) {
                                  break L14;
                                } else {
                                  L18: {
                                    if (s.field_e[var18][var19] == null) {
                                      break L18;
                                    } else {
                                      mi.field_m.a(s.field_e[var18][var19], 92);
                                      break L18;
                                    }
                                  }
                                  var19++;
                                  continue L17;
                                }
                              }
                            }
                            var18++;
                            continue L13;
                          }
                        }
                      } else {
                        L19: {
                          if (wd.field_g[var17_int] != null) {
                            wd.field_g[var17_int].field_z = 11;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        L20: {
                          if (s.field_e[var17_int] != null) {
                            var18 = 0;
                            L21: while (true) {
                              if (s.field_e[var17_int].length <= var18) {
                                break L20;
                              } else {
                                if (s.field_e[var17_int][var18] != null) {
                                  L22: {
                                    if (s.field_e[var17_int][var18].field_Eb != null) {
                                      s.field_e[var17_int][var18].field_Eb.field_z = 11;
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  var18++;
                                  continue L21;
                                } else {
                                  var18++;
                                  continue L21;
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                        var17_int++;
                        continue L12;
                      }
                    }
                  } else {
                    wd.field_g[var17_int + 4] = new kc(0L, mi.field_A, ob.field_bb[var17_int]);
                    array$5 = new nl[1 + dg.a((int) gb.field_d[var17_int], 255)];
                    s.field_e[var17_int + 4] = array$5;
                    s.field_e[4 - -var17_int][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                    var18 = 0;
                    L23: while (true) {
                      if (var18 >= (gb.field_d[var17_int] & 255)) {
                        var17_int++;
                        continue L11;
                      } else {
                        L24: {
                          if (null == pn.field_b) {
                            var19_ref = null;
                            break L24;
                          } else {
                            if (null != pn.field_b[var17_int]) {
                              var19_ref = pn.field_b[var17_int][var18];
                              break L24;
                            } else {
                              var19_ref = null;
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if (lj.field_o == null) {
                            var20 = null;
                            break L25;
                          } else {
                            if (null != lj.field_o[var17_int]) {
                              var20 = lj.field_o[var17_int][var18];
                              break L25;
                            } else {
                              var20 = null;
                              break L25;
                            }
                          }
                        }
                        s.field_e[4 + var17_int][var18 - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) (var19_ref), (String) (var20));
                        var18++;
                        continue L23;
                      }
                    }
                  }
                }
              } else {
                s.field_e[0][var17_int + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, mo.field_b[var17_int], vm.field_c[var17_int]);
                var17_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var15 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var15);
            stackOut_73_1 = new StringBuilder().append("nn.C(");
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L26;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L26;
            }
          }
          L27: {
            stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param1 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L27;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L27;
            }
          }
          L28: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param2).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param3 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L28;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L28;
            }
          }
          L29: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param4).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param5 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L29;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L29;
            }
          }
          L30: {
            stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param6 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L30;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L30;
            }
          }
          L31: {
            stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param7 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L31;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L31;
            }
          }
          L32: {
            stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
            stackOut_91_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',');
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param8 == null) {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L32;
            } else {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L32;
            }
          }
          L33: {
            stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param9 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L33;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L33;
            }
          }
          L34: {
            stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param10 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L34;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L34;
            }
          }
          L35: {
            stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
            stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param11 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L35;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L35;
            }
          }
          L36: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param12).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param13 == null) {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L36;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L36;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param14 + ')');
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
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 <= (param3 ^ -1)) {
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
            L3: {
              var5 = new rm();
              if (param1 == -93) {
                break L3;
              } else {
                nn.a((byte[]) null, (int[]) null, 89, (qb[][]) null, -13, (String[]) null, (String[][]) null, (String[]) null, (eg) null, (byte[]) null, (String[]) null, (String[][]) null, 28, (qb[][]) null, -101);
                break L3;
              }
            }
            var5.c(-23645);
            var5.a((long)(8 * param0), 8, var4);
            var10 = new byte[64];
            var9 = var10;
            var6 = var9;
            var5.a((byte) 119, 0, var10);
            stackOut_8_0 = (byte[]) (var6);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4_ref);
            stackOut_10_1 = new StringBuilder().append("nn.A(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    nn(int param0) {
        this.field_r = param0;
    }

    static {
        field_t = "You are offering to draw.";
        field_p = 15;
        field_m = "Start Game";
        field_s = new eh();
        field_n = new int[][]{new int[]{25, 26, 27}, new int[]{28, 29, 30}, new int[]{31, 32, 33}, new int[]{34, 35, 36}, new int[]{37, 38, 39}, new int[]{40, 41, 42}, new int[]{45, 46, 47}, new int[]{48, 49, 50}, new int[]{61, 62, 62}, new int[]{40, 41, 42}};
    }
}
