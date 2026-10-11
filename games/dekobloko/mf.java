/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends oe implements vn {
    static String field_S;
    static String field_V;
    static int field_Q;
    private ek field_U;
    private pn field_T;
    static sb field_N;
    static ck field_O;
    static int field_R;
    static String field_P;

    final void a(ce param0, int param1, int param2, int param3) {
        try {
          if (param1 < 38) {
            field_V = (String) null;
          }
          super.a(param0, 98, param2, param3);
          this.field_U.field_I = this.field_T.a(-128).a(20350) == dc.field_b ? true : false;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "mf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 != 67) {
          field_R = -124;
        }
        if (this.field_T.a(-101).a(param0 ^ 20285) != dc.field_b) {
          return;
        }
        try {
          kh.a(-31, this.field_T.i(-22079), this.field_T.f((byte) 48), this.field_T.b(false));
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "mf.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param3.getGraphics();
            le.field_m.a((byte) 54, var4, param1, param2);
            var4.dispose();
            if (param0 != 1) {
              field_V = (String) null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = var4_ref2;
          stackIn_7_1 = new StringBuilder().append("mf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        vk.field_f = hk.field_i;
        wj.field_Lb = hk.field_j;
        pa.g((byte) 115);
        dc.field_e.a(g.field_R.field_N - 42, g.field_R.field_mb, 0, 107, 0);
        fn.field_g.a(aj.field_a.field_mb, 0, 0, kf.field_O, 0);
        int var1 = kf.field_O + 2;
        gg.field_y.a(aj.field_a.field_mb, param0 ^ 5, !pd.field_a ? 0 : var1, -(!pd.field_a ? 0 : var1) + aj.field_a.field_N, 0);
        bf.c((byte) -103);
        uh.field_c.a(g.field_R.field_mb, 0, -40 + g.field_R.field_N, 40, 0);
        p.field_b.a(wm.field_h.field_mb, 0, 0, 30, 0);
        li.field_h.a(wm.field_h.field_mb, param0 ^ 5, 30, -70 + (wm.field_h.field_N - 2), 0);
        f.field_o.a(68, param0 ^ 5, 5, 30, 5);
        d.field_a.a(78, 0, 5, 30, 75);
        tg.field_f.a(48, 0, 5, 30, 155);
        md.field_X.a(48, 0, param0, 30, 205);
        int var2 = !pd.field_a ? 200 : 250;
        jc.field_h.a(363 - var2, param0 - 5, 5, 30, 5 + var2);
        bk.field_Rb.a(-370 + (wm.field_h.field_mb - 5), 0, 5, 30, 370);
        gf.field_c.a(6, 37, vh.field_e, 5, -10 + (li.field_h.field_N - 32), li.field_h.field_mb - 5 - 5, 2);
        int var3 = (wm.field_h.field_mb + 2) / 2;
        o.field_a.a(var3 - 2, 0, wm.field_h.field_N - 40, 40, 0);
        if (!pd.field_a) {
          var3 = 0;
        }
        se.field_U.a(wm.field_h.field_mb - var3, 0, wm.field_h.field_N - 40, 40, var3);
    }

    final static void a(int param0, String[] param1, byte[] param2, ji param3, int param4, String[][] param5, ck[][] param6, int param7, String[][] param8, String[] param9, String[] param10, ck[][] param11, int param12, byte[] param13, int[] param14) {
        qd[] array$0 = null;
        qd[] array$1 = null;
        qd[] array$2 = null;
        int var19 = 0;
        w stackIn_5_0;
        w stackIn_5_1;
        long stackIn_5_2;
        w stackIn_5_3;
        w stackIn_6_0 = null;
        w stackIn_6_1 = null;
        String stackIn_6_4 = null;
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
        w var16 = null;
        int var17_int = 0;
        w var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        w var23 = null;
        w var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = client.field_A ? 1 : 0;
        try {
          pa.field_db = param10;
          jj.field_a = param1;
          gn.field_c = param5;
          hb.field_Qb = param8;
          pf.field_k = param9;
          hd.field_u = param0;
          rn.field_e = param6;
          da.field_a = param13;
          mg.field_Vb = param7;
          be.field_u = param11;
          ne.field_c = param2;
          b.field_P = param14;
          fj.field_a = bj.a(112, param3, "lobby", "gameprivacy");
          si.field_d = bj.a(112, param3, "lobby", "ratedgame");
          client.field_x = bj.a(112, param3, "lobby", "opentome");
          bb.field_b = bj.a(112, param3, "lobby", "allowspectators");
          ed.field_b = new String[5];
          ed.field_b[2] = om.field_g;
          ed.field_b[3] = hd.field_p;
          ed.field_b[4] = ik.field_a;
          ed.field_b[1] = ul.field_h;
          ed.field_b[0] = dk.field_b;
          gg.field_y = new w(0L, (w) null);
          gh.field_b = new w(0L, fh.field_g, cb.field_h);
          kn.field_r = new w(0L, dd.field_k, ak.field_a);
          ec.field_k = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
          gg.field_y.a(gh.field_b, -16834);
          if (pd.field_a) {
            gg.field_y.a(kn.field_r, param4 - 7940);
          }
          gg.field_y.a(ec.field_k, -16834);
          ec.field_k.field_Rb.a(-122, ua.field_H);
          var23 = ec.field_k.field_Rb;
          var24 = var23;
          ec.field_k.field_Rb.field_W = 1;
          var24.field_X = 1;
          fn.field_g = new w(0L, ua.field_H);
          fn.field_g.field_X = 1;
          uh.field_c = new w(0L, hd.field_q, pc.field_f.toUpperCase());
          p.field_b = new w(0L, ml.field_a, in.field_u.toUpperCase());
          li.field_h = new w(0L, bf.field_t);
          f.field_o = new w(0L, fh.field_g, li.field_c);
          d.field_a = new w(0L, bl.field_Y, ml.field_c);
          tg.field_f = new w(0L, bl.field_Y, ba.field_e);
          md.field_X = new w(0L, bl.field_Y, be.field_o);
          jc.field_h = new w(0L, bl.field_Y, gk.field_Db);
          bk.field_Rb = new w(0L, dd.field_k, bk.field_Qb);
          gf.field_c = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
          o.field_a = new w(0L, d.field_g, qe.field_c.toUpperCase());
          o.field_a.field_Hb = pd.field_a;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = d.field_g;
          if (pd.field_a) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = p.field_c;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = pl.field_c;
          }
          se.field_U = new w(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          wm.field_h = new w(0L, (w) null);
          wm.field_h.a(p.field_b, -16834);
          wm.field_h.a(li.field_h, -16834);
          li.field_h.a(f.field_o, -16834);
          li.field_h.a(d.field_a, -16834);
          li.field_h.a(tg.field_f, -16834);
          if (pd.field_a) {
            li.field_h.a(md.field_X, -16834);
          }
          li.field_h.a(jc.field_h, -16834);
          li.field_h.a(bk.field_Rb, -16834);
          li.field_h.a(gf.field_c, param4 - 7940);
          if (pd.field_a) {
            wm.field_h.a(o.field_a, -16834);
          }
          wm.field_h.a(se.field_U, -16834);
          f.field_n = new w(0L, ua.field_H);
          f.field_n.field_W = 0;
          f.field_n.field_X = 1;
          ce.field_A = new w(0L, kn.field_p, gm.field_J.toUpperCase());
          tc.field_Ob = new w(0L, ui.field_x);
          tc.field_Ob.a(f.field_n, -16834);
          tc.field_Ob.a(ce.field_A, -16834);
          cl.field_n = new w(0L, gf.field_g);
          cl.field_n.a(-128, ua.field_H);
          cl.field_n.field_W = 1;
          var16 = cl.field_n;
          var16.field_X = 1;
          in.field_o = new w(0L, (w) null);
          if (param4 != -8894) {
            return;
          }
          he.field_jb = new w(0L, ua.field_H);
          he.field_jb.field_X = 1;
          kl.field_r = new w(0L, fh.field_g, cb.field_h);
          ea.field_A = new w(0L, dd.field_k, ak.field_a);
          tb.field_b = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
          in.field_o.a(he.field_jb, -16834);
          in.field_o.a(kl.field_r, -16834);
          if (pd.field_a) {
            in.field_o.a(ea.field_A, param4 ^ 25468);
          }
          in.field_o.a(tb.field_b, param4 ^ 25468);
          ma.field_G = new w(0L, hd.field_q, om.field_b.toUpperCase());
          fl.field_b = new w(0L, ml.field_a);
          qm.field_a = new w(0L, bf.field_t);
          li.field_d = new w(0L, i.field_e, bk.field_Nb.toUpperCase());
          um.field_c = new w[4 + param12];
          qa.field_v = new qd[param12 + 4][];
          um.field_c[0] = new w(0L, sg.field_e, qc.field_l);
          qa.field_v[0] = new qd[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            qa.field_v[0][var17_int + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, fj.field_a[var17_int], ed.field_b[var17_int]);
          }
          if (2 <= b.field_P.length) {
            um.field_c[1] = new w(0L, sg.field_e, hb.field_Pb);
            array$0 = new qd[1 + b.field_P.length];
            qa.field_v[1] = array$0;
            qa.field_v[1][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
            for (var17_intLifetime1 = 0; b.field_P.length > var17_intLifetime1; var17_intLifetime1++) {
              qa.field_v[1][var17_intLifetime1 + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, Integer.toString(b.field_P[var17_intLifetime1]));
            }
          }
          um.field_c[2] = new w(0L, sg.field_e, bc.field_G);
          qa.field_v[2] = new qd[]{new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[0], jh.field_f), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[1], h.field_f)};
          if (mg.field_Vb > 1) {
            um.field_c[3] = new w(0L, sg.field_e, mk.field_a);
            array$1 = new qd[mg.field_Vb + 1];
            qa.field_v[3] = array$1;
            qa.field_v[3][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
            for (var17_intLifetime2 = 0; mg.field_Vb > var17_intLifetime2; var17_intLifetime2++) {
              qa.field_v[3][var17_intLifetime2 + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, pf.field_k[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param12 > var17_intLifetime3; var17_intLifetime3++) {
            um.field_c[4 + var17_intLifetime3] = new w(0L, sg.field_e, pa.field_db[var17_intLifetime3]);
            array$2 = new qd[lb.a((int) da.field_a[var17_intLifetime3], 255) + 1];
            qa.field_v[4 + var17_intLifetime3] = array$2;
            qa.field_v[var17_intLifetime3 + 4][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
            for (var18 = 0; (da.field_a[var17_intLifetime3] & 255) > var18; var18++) {
              if (rn.field_e == null) {
                var19_ref = null;
              } else {
                if (null != rn.field_e[var17_intLifetime3]) {
                  var19_ref = rn.field_e[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (null != gn.field_c) {
                if (null == gn.field_c[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = gn.field_c[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              qa.field_v[var17_intLifetime3 + 4][var18 + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < param12 + 4; var17_intLifetime4++) {
            if (null != um.field_c[var17_intLifetime4]) {
              um.field_c[var17_intLifetime4].field_Db = 11;
            }
            if (null != qa.field_v[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < qa.field_v[var17_intLifetime4].length; var18Lifetime1++) {
                if (qa.field_v[var17_intLifetime4][var18Lifetime1] != null &&
                  qa.field_v[var17_intLifetime4][var18Lifetime1].field_Tb != null) {
                  qa.field_v[var17_intLifetime4][var18Lifetime1].field_Tb.field_Db = 11;
                }
              }
            }
          }
          fh.field_d = new w(0L, d.field_g);
          nn.field_a = new w(0L, d.field_g);
          tg.field_i = new w(0L, fc.field_c);
          tg.field_i.a(-112, ua.field_H);
          tg.field_i.field_W = 1;
          var17 = tg.field_i;
          var17.field_X = 1;
          oh.field_d = new w(0L, (w) null);
          oh.field_d.a(fl.field_b, -16834);
          oh.field_d.a(qm.field_a, -16834);
          qm.field_a.a(li.field_d, -16834);
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param12; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(b.field_P.length < 2)) && (var18Lifetime2 != 3 ||
              !(mg.field_Vb <= 1))) {
              qm.field_a.a(um.field_c[var18Lifetime2], -16834);
              for (var19 = 0; var19 < qa.field_v[var18Lifetime2].length; var19++) {
                if (qa.field_v[var18Lifetime2][var19] != null) {
                  qm.field_a.a(qa.field_v[var18Lifetime2][var19], -16834);
                }
              }
            }
          }
          oh.field_d.a(fh.field_d, -16834);
          oh.field_d.a(nn.field_a, param4 - 7940);
          oh.field_d.a(tg.field_i, -16834);
          ie.field_a = new w(0L, tg.field_h, ea.field_u.toUpperCase());
          qc.field_q = new w(0L, kn.field_p, kb.field_d.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_79_0 = var15;
          stackIn_79_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param3 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param4).append(',');
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
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param9 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param10 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param11 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param12).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(')').toString());
        }
    }

    final void g(int param0) {
        int var2 = 250;
        this.field_T.b(25, 140, -var2 + this.field_t >> 1, this.field_y - 5 >> 1, -16555);
        this.field_U.b(30, 100, 10 + (140 + (-var2 + this.field_t >> 1)), 2 + (20 + (this.field_y - param0) >> 1), param0 ^ -16565);
    }

    final static void a(byte param0, int param1) {
        if (param0 < 80) {
          field_S = (String) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 2);
        var2.a(true, 4);
        var2.a(true, am.b(112));
    }

    public static void i(int param0) {
        field_O = null;
        field_S = null;
        field_V = null;
        field_N = null;
        field_P = null;
        if (param0 != -17690) {
          field_O = (ck) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -106, param2, param3);
        bj.field_f.a(vf.field_e, 4 + param0 + this.field_u, 4 + bj.field_f.field_R + param3 + this.field_D, 16777215, -1);
        if (param1 >= -103) {
          ek var6 = (ek) null;
          this.a((byte) -51, -52, (ek) null, -94, 59);
        }
    }

    mf(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (gl) null);
        this.field_T = new pn(new di(10000536), gf.field_i, 0, 0, 140, 25);
        this.field_T.a((byte) 79, new qf());
        this.field_U = new ek(fa.field_o, (kg) (this));
        this.field_K = new ce[]{(ce) ((Object) this.field_T), (ce) ((Object) this.field_U)};
        this.field_U.field_p = (gl) ((Object) new fk());
        this.f(119);
    }

    static {
        field_V = "Add name";
        field_S = "Please select options in the following rows:  ";
        field_O = new ck(36, 36);
        field_P = "Achievements";
    }
}
