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
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = BachelorFridge.field_y;
        if (param2 != 0) {
          return;
        }
        var6 = param3 - param4;
        var7 = -param5 + param0;
        if (var6 == 0) {
          if (var7 != 0) {
            ap.a(param0, param4, param5, param2 + 76, param1);
          }
          return;
        }
        if (var7 == 0) {
          sfa.a(param1, param4, (byte) -20, param5, param3);
          return;
        }
        var12 = (var7 << 12) / var6;
        var13 = -(param4 * var12 >> 12) + param5;
        if (param4 < eo.field_l) {
          var10 = (var12 * eo.field_l >> 12) + var13;
          var8 = eo.field_l;
        } else {
          if (pw.field_x >= param4) {
            var8 = param4;
            var10 = param5;
          } else {
            var8 = pw.field_x;
            var10 = (pw.field_x * var12 >> 12) + var13;
          }
        }
        if (param3 >= eo.field_l) {
          if (param3 > pw.field_x) {
            var9 = pw.field_x;
            var11 = var13 + (var12 * pw.field_x >> 12);
          } else {
            var9 = param3;
            var11 = param0;
          }
        } else {
          var11 = var13 + (var12 * eo.field_l >> 12);
          var9 = eo.field_l;
        }
        if (an.field_q > var10) {
          var10 = an.field_q;
          var8 = (an.field_q - var13 << 12) / var12;
        } else {
          if (ha.field_n < var10) {
            var8 = (ha.field_n - var13 << 12) / var12;
            var10 = ha.field_n;
          }
        }
        if (var11 < an.field_q) {
          var11 = an.field_q;
          var9 = (an.field_q - var13 << 12) / var12;
        } else {
          if (var11 > ha.field_n) {
            var9 = (ha.field_n - var13 << 12) / var12;
            var11 = ha.field_n;
          }
        }
        oe.a(var10, param1, -116, var9, var11, var8);
        return;
    }

    final static void a(kv[][] param0, int param1, vr param2, int param3, String[] param4, byte[] param5, byte[] param6, String[][] param7, String[] param8, boolean param9, int param10, String[] param11, kv[][] param12, int[] param13, String[][] param14) {
        gna[] array$0 = null;
        gna[] array$1 = null;
        gna[] array$2 = null;
        int var19 = 0;
        sna stackIn_8_0;
        sna stackIn_8_1;
        long stackIn_8_2;
        sna stackIn_8_3;
        sna stackIn_9_0 = null;
        sna stackIn_9_1 = null;
        String stackIn_9_4 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        sna var16 = null;
        int var17_int = 0;
        sna var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        sna var23 = null;
        sna var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = BachelorFridge.field_y;
        try {
          kka.field_k = param8;
          cla.field_a = param6;
          qha.field_c = param13;
          rha.field_e = param0;
          dw.field_g = param5;
          bma.field_u = param1;
          mt.field_s = param10;
          md.field_p = param11;
          cia.field_f = param4;
          if (!param9) {
            return;
          }
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
          }
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
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = vo.field_b;
          if (!eaa.field_c) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = mg.field_o;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = mv.field_m;
          }
          vh.field_y = new sna(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          ui.field_r = new sna(0L, (sna) null);
          ui.field_r.a(-1, wia.field_f);
          ui.field_r.a(-1, nea.field_yb);
          nea.field_yb.a(-1, fl.field_m);
          nea.field_yb.a(-1, nd.field_i);
          nea.field_yb.a(-1, mt.field_q);
          if (eaa.field_c) {
            nea.field_yb.a(-1, hj.field_p);
          }
          nea.field_yb.a(-1, vf.field_F);
          nea.field_yb.a(-1, aia.field_l);
          nea.field_yb.a(-1, p.field_n);
          if (eaa.field_c) {
            ui.field_r.a(-1, ae.field_a);
          }
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
          for (var17_int = 0; var17_int < 5; var17_int++) {
            gd.field_n[0][var17_int + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, ut.field_r[var17_int], cc.field_d[var17_int]);
          }
          if (qha.field_c.length >= 2) {
            pka.field_b[1] = new sna(0L, ina.field_n, gb.field_j);
            array$0 = new gna[qha.field_c.length + 1];
            gd.field_n[1] = array$0;
            gd.field_n[1][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
            for (var17_intLifetime1 = 0; qha.field_c.length > var17_intLifetime1; var17_intLifetime1++) {
              gd.field_n[1][1 + var17_intLifetime1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, Integer.toString(qha.field_c[var17_intLifetime1]));
            }
          }
          pka.field_b[2] = new sna(0L, ina.field_n, ud.field_q);
          gd.field_n[2] = new gna[]{new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j), new gna(0L, uj.field_r, (sna) null, dla.field_k, rv.field_k[0], fl.field_l), new gna(0L, uj.field_r, (sna) null, dla.field_k, rv.field_k[1], vj.field_l)};
          if (bma.field_u > 1) {
            pka.field_b[3] = new sna(0L, ina.field_n, uk.field_w);
            array$1 = new gna[1 + bma.field_u];
            gd.field_n[3] = array$1;
            gd.field_n[3][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < bma.field_u; var17_intLifetime2++) {
              gd.field_n[3][var17_intLifetime2 + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, cia.field_f[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; var17_intLifetime3 < param3; var17_intLifetime3++) {
            pka.field_b[4 + var17_intLifetime3] = new sna(0L, ina.field_n, kka.field_k[var17_intLifetime3]);
            array$2 = new gna[1 + dda.a(255, (int) dw.field_g[var17_intLifetime3])];
            gd.field_n[var17_intLifetime3 + 4] = array$2;
            gd.field_n[4 + var17_intLifetime3][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
            for (var18 = 0; var18 < (dw.field_g[var17_intLifetime3] & 255); var18++) {
              if (rha.field_e == null) {
                var19_ref = null;
              } else {
                if (rha.field_e[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = rha.field_e[var17_intLifetime3][var18];
                }
              }
              if (null == co.field_a) {
                var20 = null;
              } else {
                if (co.field_a[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = co.field_a[var17_intLifetime3][var18];
                }
              }
              gd.field_n[var17_intLifetime3 + 4][var18 + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < param3 + 4; var17_intLifetime4++) {
            if (pka.field_b[var17_intLifetime4] != null) {
              pka.field_b[var17_intLifetime4].field_B = 11;
            }
            if (gd.field_n[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; gd.field_n[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (null != gd.field_n[var17_intLifetime4][var18Lifetime1] &&
                  null != gd.field_n[var17_intLifetime4][var18Lifetime1].field_vb) {
                  gd.field_n[var17_intLifetime4][var18Lifetime1].field_vb.field_B = 11;
                }
              }
            }
          }
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
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param3; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(qha.field_c.length < 2)) && (var18Lifetime2 != 3 ||
              !(bma.field_u <= 1))) {
              vm.field_i.a(-1, pka.field_b[var18Lifetime2]);
              for (var19 = 0; gd.field_n[var18Lifetime2].length > var19; var19++) {
                if (null != gd.field_n[var18Lifetime2][var19]) {
                  vm.field_i.a(-1, gd.field_n[var18Lifetime2][var19]);
                }
              }
            }
          }
          ho.field_g.a(-1, ik.field_i);
          ho.field_g.a(-1, cn.field_j);
          ho.field_g.a(-1, cw.field_yb);
          saa.field_f = new sna(0L, mda.field_c, pe.field_l.toUpperCase());
          vca.field_h = new sna(0L, sn.field_l, fk.field_t.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_79_0 = var15;
          stackIn_79_1 = new StringBuilder().append("pna.CA(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param5 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param6 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param7 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param8 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param12 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param13 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',');
          if (param14 == null) {
            stackIn_110_2 = "null";
          } else {
            stackIn_110_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
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
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = BachelorFridge.field_y;
        if (this.field_yb == 0) {
          this.field_Gb[this.field_yb] = new gna(0L, (sna) null, (sna) null, this.field_Fb, (kv) null, hba.field_u);
          this.field_Gb[this.field_yb].field_Y = 1;
          this.a(-1, this.field_Gb[this.field_yb]);
          this.field_Hb[this.field_yb] = -1;
          this.field_yb = this.field_yb + 1;
        }
        var6 = 0;
        for (var7 = 0; this.field_yb > var7; var7++) {
          var8 = this.field_Gb[var7].a(120, this.field_vb, this.field_xb);
          if (var8 > var6) {
            var6 = var8;
          }
        }
        var6 = var6 + this.field_Eb * 2;
        var7Lifetime1 = this.field_Bb + this.field_wb * this.field_yb + this.field_Bb;
        var8Lifetime1 = oi.a(param0, var6, param2, -21264);
        if (param1) {
          this.a(-23, true, -68, 36, -73);
        }
        var9 = nga.a(var7Lifetime1, param4, (byte) 119, param3);
        this.a(var7Lifetime1, 31407, var6, var8Lifetime1, var9);
        for (var10 = 0; var10 < this.field_yb; var10++) {
          this.field_Gb[var10].a(var6 - 2 * this.field_Eb, this.field_xb, this.field_wb, this.field_Eb, this.field_vb, (byte) -123, var10 * this.field_wb + this.field_Bb);
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        this.a(19842, param0);
        if (!param0) {
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
        if (lf.field_c != 0) {
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
        if (this.field_Ab != -2) {
          return false;
        }
        if (13 == gf.field_k) {
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
