/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pna extends sna {
    private int field_vb;
    private int[] field_Hb;
    private sna field_Fb;
    private int field_Ab;
    private gna[] field_Gb;
    private int field_yb;
    private int field_Eb;
    private sna field_Cb;
    static rs[] field_zb;
    private int field_Bb;
    private kv[] field_Db;
    private int field_wb;
    private int field_xb;

    public static void f(int param0) {
        if (param0 != 1) {
            return;
        }
        field_zb = null;
    }

    final void a(String param0, boolean param1, int param2) {
        try {
            this.field_Gb[this.field_yb] = new gna(0L, (sna) null, (sna) null, this.field_Cb, (kv) null, param0);
            this.field_Gb[this.field_yb].field_A = this.field_Db;
            this.field_Gb[this.field_yb].field_qb = param1 ? true : false;
            this.field_Gb[this.field_yb].field_Y = 1;
            this.a(-1, this.field_Gb[this.field_yb]);
            this.field_Hb[this.field_yb] = param2;
            this.field_yb = this.field_yb + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pna.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        if (param2 == 0) {
          var6 = param3 - param4;
          var7 = -param5 + param0;
          if (var6 != 0) {
            if (-1 != (var7 ^ -1)) {
              L0: {
                var12 = (var7 << 1895167660) / var6;
                var13 = -(param4 * var12 >> 664868780) + param5;
                if (param4 < eo.field_l) {
                  var10 = (var12 * eo.field_l >> -294752180) + var13;
                  var8 = eo.field_l;
                  break L0;
                } else {
                  if (pw.field_x >= param4) {
                    var8 = param4;
                    var10 = param5;
                    break L0;
                  } else {
                    var8 = pw.field_x;
                    var10 = (pw.field_x * var12 >> -30028340) + var13;
                    break L0;
                  }
                }
              }
              L1: {
                if (param3 >= eo.field_l) {
                  if (param3 > pw.field_x) {
                    var9 = pw.field_x;
                    var11 = var13 + (var12 * pw.field_x >> 829614508);
                    break L1;
                  } else {
                    var9 = param3;
                    var11 = param0;
                    break L1;
                  }
                } else {
                  var11 = var13 + (var12 * eo.field_l >> 695207052);
                  var9 = eo.field_l;
                  break L1;
                }
              }
              L2: {
                if (an.field_q > var10) {
                  var10 = an.field_q;
                  var8 = (an.field_q - var13 << 772804972) / var12;
                  break L2;
                } else {
                  if (ha.field_n >= var10) {
                    break L2;
                  } else {
                    var8 = (ha.field_n - var13 << 1518952396) / var12;
                    var10 = ha.field_n;
                    break L2;
                  }
                }
              }
              L3: {
                if (var11 < an.field_q) {
                  var11 = an.field_q;
                  var9 = (an.field_q + -var13 << 1022124524) / var12;
                  break L3;
                } else {
                  if (var11 > ha.field_n) {
                    var9 = (ha.field_n - var13 << -2051888084) / var12;
                    var11 = ha.field_n;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              oe.a(var10, param1, -116, var9, var11, var8);
              return;
            } else {
              sfa.a(param1, param4, (byte) -20, param5, param3);
              return;
            }
          } else {
            L4: {
              if (var7 == 0) {
                break L4;
              } else {
                ap.a(param0, param4, param5, param2 + 76, param1);
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(kv[][] param0, int param1, vr param2, int param3, String[] param4, byte[] param5, byte[] param6, String[][] param7, String[] param8, boolean param9, int param10, String[] param11, kv[][] param12, int[] param13, String[][] param14) {
        gna[] array$3 = null;
        gna[] array$4 = null;
        gna[] array$5 = null;
        RuntimeException var15 = null;
        sna var16 = null;
        int var17_int = 0;
        sna var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        sna var23 = null;
        sna var24 = null;
        sna stackIn_7_0 = null;
        sna stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        sna stackIn_7_3 = null;
        sna stackIn_8_0 = null;
        sna stackIn_8_1 = null;
        long stackIn_8_2 = 0L;
        sna stackIn_8_3 = null;
        sna stackIn_9_0 = null;
        sna stackIn_9_1 = null;
        long stackIn_9_2 = 0L;
        sna stackIn_9_3 = null;
        String stackIn_9_4 = null;
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
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        sna stackOut_6_0 = null;
        sna stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        sna stackOut_6_3 = null;
        sna stackOut_8_0 = null;
        sna stackOut_8_1 = null;
        long stackOut_8_2 = 0L;
        sna stackOut_8_3 = null;
        String stackOut_8_4 = null;
        sna stackOut_7_0 = null;
        sna stackOut_7_1 = null;
        long stackOut_7_2 = 0L;
        sna stackOut_7_3 = null;
        String stackOut_7_4 = null;
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
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        var21 = BachelorFridge.field_y;
        try {
          L0: {
            kka.field_k = param8;
            cla.field_a = param6;
            qha.field_c = param13;
            rha.field_e = param0;
            dw.field_g = param5;
            bma.field_u = param1;
            mt.field_s = param10;
            md.field_p = param11;
            cia.field_f = param4;
            if (param9) {
              L1: {
                uha.field_Xb = param12;
                co.field_a = param14;
                gk.field_c = param7;
                ut.field_r = gw.a("lobby", "gameprivacy", param2, -89);
                gba.field_Db = gw.a("lobby", "ratedgame", param2, -81);
                sma.field_H = gw.a("lobby", "opentome", param2, -78);
                rv.field_k = gw.a("lobby", "allowspectators", param2, -72);
                cc.field_d = new String[5];
                cc.field_d[0] = cd.field_m;
                cc.field_d[4] = ct.field_s;
                cc.field_d[2] = kg.field_c;
                cc.field_d[3] = pv.field_h;
                cc.field_d[1] = oja.field_d;
                tv.field_o = new sna(0L, (sna) null);
                fja.field_a = new sna(0L, iia.field_m, bs.field_j);
                oca.field_n = new sna(0L, vda.field_a, tv.field_m);
                qba.field_m = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
                tv.field_o.a(-1, fja.field_a);
                if (eaa.field_c) {
                  tv.field_o.a(-1, oca.field_n);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                tv.field_o.a(-1, qba.field_m);
                qba.field_m.field_wb.a(qs.field_m, 11);
                qba.field_m.field_wb.field_Y = 1;
                var23 = qba.field_m.field_wb;
                var24 = var23;
                var24.field_N = 1;
                dea.field_m = new sna(0L, qs.field_m);
                dea.field_m.field_N = 1;
                mc.field_g = new sna(0L, iw.field_a, pja.field_f.toUpperCase());
                wia.field_f = new sna(0L, p.field_o, vl.field_b.toUpperCase());
                nea.field_yb = new sna(0L, vq.field_v);
                fl.field_m = new sna(0L, iia.field_m, oha.field_e);
                nd.field_i = new sna(0L, bna.field_z, iia.field_n);
                mt.field_q = new sna(0L, bna.field_z, gp.field_z);
                hj.field_p = new sna(0L, bna.field_z, oda.field_a);
                vf.field_F = new sna(0L, bna.field_z, iga.field_b);
                aia.field_l = new sna(0L, vda.field_a, fu.field_s);
                p.field_n = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
                ae.field_a = new sna(0L, vo.field_b, si.field_d.toUpperCase());
                ae.field_a.field_u = eaa.field_c;
                stackOut_6_0 = null;
                stackOut_6_1 = null;
                stackOut_6_2 = 0L;
                stackOut_6_3 = vo.field_b;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                if (!eaa.field_c) {
                  stackOut_8_0 = null;
                  stackOut_8_1 = null;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = (sna) ((Object) stackIn_8_3);
                  stackOut_8_4 = mg.field_o;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  break L2;
                } else {
                  stackOut_7_0 = null;
                  stackOut_7_1 = null;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = (sna) ((Object) stackIn_7_3);
                  stackOut_7_4 = mv.field_m;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  break L2;
                }
              }
              L3: {
                vh.field_y = new sna(stackIn_9_2, stackIn_9_3, ((String) (Object) stackIn_9_4).toUpperCase());
                ui.field_r = new sna(0L, (sna) null);
                ui.field_r.a(-1, wia.field_f);
                ui.field_r.a(-1, nea.field_yb);
                nea.field_yb.a(-1, fl.field_m);
                nea.field_yb.a(-1, nd.field_i);
                nea.field_yb.a(-1, mt.field_q);
                if (eaa.field_c) {
                  nea.field_yb.a(-1, hj.field_p);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                nea.field_yb.a(-1, vf.field_F);
                nea.field_yb.a(-1, aia.field_l);
                nea.field_yb.a(-1, p.field_n);
                if (!eaa.field_c) {
                  break L4;
                } else {
                  ui.field_r.a(-1, ae.field_a);
                  break L4;
                }
              }
              L5: {
                ui.field_r.a(-1, vh.field_y);
                io.field_q = new sna(0L, qs.field_m);
                io.field_q.field_Y = 0;
                io.field_q.field_N = 1;
                aja.field_l = new sna(0L, sn.field_l, ne.field_m.toUpperCase());
                sb.field_n = new sna(0L, qaa.field_d);
                sb.field_n.a(-1, io.field_q);
                sb.field_n.a(-1, aja.field_l);
                sr.field_b = new sna(0L, vg.field_k);
                sr.field_b.a(qs.field_m, 58);
                var16 = sr.field_b;
                sr.field_b.field_Y = 1;
                var16.field_N = 1;
                nu.field_f = new sna(0L, (sna) null);
                mja.field_t = new sna(0L, qs.field_m);
                mja.field_t.field_N = 1;
                oga.field_t = new sna(0L, iia.field_m, bs.field_j);
                ut.field_q = new sna(0L, vda.field_a, tv.field_m);
                ak.field_q = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
                nu.field_f.a(-1, mja.field_t);
                nu.field_f.a(-1, oga.field_t);
                if (eaa.field_c) {
                  nu.field_f.a(-1, ut.field_q);
                  break L5;
                } else {
                  break L5;
                }
              }
              nu.field_f.a(-1, ak.field_q);
              jj.field_wb = new sna(0L, iw.field_a, dh.field_i.toUpperCase());
              vaa.field_a = new sna(0L, p.field_o);
              vm.field_i = new sna(0L, vq.field_v);
              mh.field_j = new sna(0L, rda.field_a, ou.field_c.toUpperCase());
              pka.field_b = new sna[param3 + 4];
              gd.field_n = new gna[4 + param3][];
              pka.field_b[0] = new sna(0L, ina.field_n, pf.field_k);
              gd.field_n[0] = new gna[6];
              var17_int = 0;
              L6: while (true) {
                if (var17_int >= 5) {
                  L7: {
                    if (qha.field_c.length >= 2) {
                      pka.field_b[1] = new sna(0L, ina.field_n, gb.field_j);
                      array$3 = new gna[qha.field_c.length + 1];
                      gd.field_n[1] = array$3;
                      gd.field_n[1][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                      var17_int = 0;
                      L8: while (true) {
                        if (qha.field_c.length <= var17_int) {
                          break L7;
                        } else {
                          gd.field_n[1][1 + var17_int] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, Integer.toString(qha.field_c[var17_int]));
                          var17_int++;
                          continue L8;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    pka.field_b[2] = new sna(0L, ina.field_n, ud.field_q);
                    gd.field_n[2] = new gna[]{new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j), new gna(0L, uj.field_r, (sna) null, dla.field_k, rv.field_k[0], fl.field_l), new gna(0L, uj.field_r, (sna) null, dla.field_k, rv.field_k[1], vj.field_l)};
                    if (bma.field_u <= 1) {
                      break L9;
                    } else {
                      pka.field_b[3] = new sna(0L, ina.field_n, uk.field_w);
                      array$4 = new gna[1 + bma.field_u];
                      gd.field_n[3] = array$4;
                      gd.field_n[3][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                      var17_int = 0;
                      L10: while (true) {
                        if (var17_int >= bma.field_u) {
                          break L9;
                        } else {
                          gd.field_n[3][var17_int - -1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, cia.field_f[var17_int]);
                          var17_int++;
                          continue L10;
                        }
                      }
                    }
                  }
                  var17_int = 0;
                  L11: while (true) {
                    if (var17_int >= param3) {
                      var17_int = 0;
                      L12: while (true) {
                        if (var17_int >= param3 + 4) {
                          ik.field_i = new sna(0L, vo.field_b);
                          cn.field_j = new sna(0L, vo.field_b);
                          cw.field_yb = new sna(0L, rea.field_g);
                          cw.field_yb.a(qs.field_m, 16);
                          var17 = cw.field_yb;
                          cw.field_yb.field_Y = 1;
                          var17.field_N = 1;
                          ho.field_g = new sna(0L, (sna) null);
                          ho.field_g.a(-1, vaa.field_a);
                          ho.field_g.a(-1, vm.field_i);
                          vm.field_i.a(-1, mh.field_j);
                          var18 = 0;
                          L13: while (true) {
                            if (var18 >= 4 + param3) {
                              ho.field_g.a(-1, ik.field_i);
                              ho.field_g.a(-1, cn.field_j);
                              ho.field_g.a(-1, cw.field_yb);
                              saa.field_f = new sna(0L, mda.field_c, pe.field_l.toUpperCase());
                              vca.field_h = new sna(0L, sn.field_l, fk.field_t.toUpperCase());
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              L14: {
                                L15: {
                                  if ((var18 ^ -1) != -2) {
                                    break L15;
                                  } else {
                                    if (qha.field_c.length < 2) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (-4 != (var18 ^ -1)) {
                                    break L16;
                                  } else {
                                    if (bma.field_u > 1) {
                                      break L16;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                vm.field_i.a(-1, pka.field_b[var18]);
                                var19 = 0;
                                L17: while (true) {
                                  if (gd.field_n[var18].length <= var19) {
                                    break L14;
                                  } else {
                                    L18: {
                                      if (null != gd.field_n[var18][var19]) {
                                        vm.field_i.a(-1, gd.field_n[var18][var19]);
                                        break L18;
                                      } else {
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
                            if (pka.field_b[var17_int] == null) {
                              break L19;
                            } else {
                              pka.field_b[var17_int].field_B = 11;
                              break L19;
                            }
                          }
                          L20: {
                            if (gd.field_n[var17_int] == null) {
                              break L20;
                            } else {
                              var18 = 0;
                              L21: while (true) {
                                if (gd.field_n[var17_int].length <= var18) {
                                  break L20;
                                } else {
                                  if (null != gd.field_n[var17_int][var18]) {
                                    L22: {
                                      if (null != gd.field_n[var17_int][var18].field_vb) {
                                        gd.field_n[var17_int][var18].field_vb.field_B = 11;
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
                            }
                          }
                          var17_int++;
                          continue L12;
                        }
                      }
                    } else {
                      pka.field_b[4 - -var17_int] = new sna(0L, ina.field_n, kka.field_k[var17_int]);
                      array$5 = new gna[1 + dda.a(255, (int) dw.field_g[var17_int])];
                      gd.field_n[var17_int + 4] = array$5;
                      gd.field_n[4 - -var17_int][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                      var18 = 0;
                      L23: while (true) {
                        if (var18 >= (dw.field_g[var17_int] & 255)) {
                          var17_int++;
                          continue L11;
                        } else {
                          L24: {
                            if (rha.field_e == null) {
                              var19_ref = null;
                              break L24;
                            } else {
                              if (rha.field_e[var17_int] == null) {
                                var19_ref = null;
                                break L24;
                              } else {
                                var19_ref = rha.field_e[var17_int][var18];
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if (null == co.field_a) {
                              var20 = null;
                              break L25;
                            } else {
                              if (co.field_a[var17_int] == null) {
                                var20 = null;
                                break L25;
                              } else {
                                var20 = co.field_a[var17_int][var18];
                                break L25;
                              }
                            }
                          }
                          gd.field_n[var17_int + 4][var18 + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) (var19_ref), (String) (var20));
                          var18++;
                          continue L23;
                        }
                      }
                    }
                  }
                } else {
                  gd.field_n[0][var17_int + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, ut.field_r[var17_int], cc.field_d[var17_int]);
                  var17_int++;
                  continue L6;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var15 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var15);
            stackOut_76_1 = new StringBuilder().append("pna.CA(");
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L26;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L26;
            }
          }
          L27: {
            stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L27;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L27;
            }
          }
          L28: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param3).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param4 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L28;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L28;
            }
          }
          L29: {
            stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param5 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L29;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L29;
            }
          }
          L30: {
            stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
            stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param6 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L30;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L30;
            }
          }
          L31: {
            stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
            stackOut_91_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_91_2).append(',');
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param7 == null) {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L31;
            } else {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L31;
            }
          }
          L32: {
            stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param8 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L32;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L32;
            }
          }
          L33: {
            stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
            stackOut_97_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_97_2).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param11 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L33;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L33;
            }
          }
          L34: {
            stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
            stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param12 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L34;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L34;
            }
          }
          L35: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',');
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
              break L35;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L35;
            }
          }
          L36: {
            stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
            stackOut_106_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(',');
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param14 == null) {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L36;
            } else {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L36;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_109_0), stackIn_109_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pna(pna param0) {
        this(param0, param0.field_Db, param0.field_Fb, param0.field_Cb, param0.field_Eb, param0.field_xb, param0.field_vb, param0.field_Bb, param0.field_wb);
    }

    pna(sna param0, kv[] param1, sna param2, sna param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Hb = new int[256];
        this.field_Ab = -2;
        this.field_Gb = new gna[256];
        try {
            this.field_Fb = param2;
            this.field_Eb = param4;
            this.field_Db = param1;
            this.field_Cb = param3;
            this.field_Bb = param7;
            this.field_xb = param5;
            this.field_wb = param8;
            this.field_vb = param6;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (this.field_yb == 0) {
            this.field_Gb[this.field_yb] = new gna(0L, (sna) null, (sna) null, this.field_Fb, (kv) null, hba.field_u);
            this.field_Gb[this.field_yb].field_Y = 1;
            this.a(-1, this.field_Gb[this.field_yb]);
            this.field_Hb[this.field_yb] = -1;
            this.field_yb = this.field_yb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (this.field_yb <= var7) {
            L2: {
              var6 = var6 + this.field_Eb * 2;
              var7 = this.field_Bb - -(this.field_wb * this.field_yb) + this.field_Bb;
              var8 = oi.a(param0, var6, param2, -21264);
              if (!param1) {
                break L2;
              } else {
                this.a(-23, true, -68, 36, -73);
                break L2;
              }
            }
            var9 = nga.a(var7, param4, (byte) 119, param3);
            this.a(var7, 31407, var6, var8, var9);
            var10 = 0;
            L3: while (true) {
              if (var10 >= this.field_yb) {
                return;
              } else {
                this.field_Gb[var10].a(var6 + -(2 * this.field_Eb), this.field_xb, this.field_wb, this.field_Eb, this.field_vb, (byte) -123, var10 * this.field_wb + this.field_Bb);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = this.field_Gb[var7].a(120, this.field_vb, this.field_xb);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        this.a(19842, param0);
        if (!(param0)) {
            return -2;
        }
        for (var3 = 0; var3 < this.field_yb; var3++) {
            if (this.field_Gb[var3].field_R != 0) {
                return this.field_Hb[var3];
            }
        }
        if (param1 < 67) {
            this.field_Db = (kv[]) null;
        }
        if (!(lf.field_c == 0)) {
            return -1;
        }
        return this.field_Ab;
    }

    final void a(byte param0, String param1, kv param2, int param3) {
        try {
            this.field_Gb[this.field_yb] = new gna(0L, (sna) null, (sna) null, this.field_Cb, param2, param1);
            this.field_Gb[this.field_yb].field_A = this.field_Db;
            if (param0 < 8) {
                this.a(63, false, -121, 19, -117);
            }
            this.field_Gb[this.field_yb].field_qb = true;
            this.field_Gb[this.field_yb].field_Y = 1;
            this.a(-1, this.field_Gb[this.field_yb]);
            this.field_Hb[this.field_yb] = param3;
            this.field_yb = this.field_yb + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pna.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean g(int param0) {
        if ((this.field_Ab ^ -1) != 1) {
            return false;
        }
        if (!(13 != gf.field_k)) {
            this.field_Ab = -1;
        }
        if (param0 != 0) {
            pna.a((kv[][]) null, -30, (vr) null, -6, (String[]) null, (byte[]) null, (byte[]) null, (String[][]) null, (String[]) null, true, 101, (String[]) null, (kv[][]) null, (int[]) null, (String[][]) null);
        }
        return true;
    }

    static {
        field_zb = new rs[55];
    }
}
