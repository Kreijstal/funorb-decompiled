/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl extends DualLinkNode {
    static long field_v;
    static java.applet.Applet field_x;
    static BrickABrac field_C;
    static int field_z;
    static RgbSprite field_D;
    static th field_B;
    static String field_y;
    int field_u;
    static String[] field_A;
    static boolean field_w;

    public static void f(int param0) {
        field_x = null;
        field_y = null;
        field_A = null;
        field_B = null;
        if (param0 != 31434) {
          sl.a((String[][]) null, (RgbSprite[][]) null, -45, (String[]) null, 69, (byte[]) null, (String[]) null, (mf) null, (int[]) null, (RgbSprite[][]) null, (byte[]) null, 112, (String[]) null, -119, (String[][]) null);
        }
        field_C = null;
        field_D = null;
    }

    abstract Object g(int param0);

    final static void a(String[][] param0, RgbSprite[][] param1, int param2, String[] param3, int param4, byte[] param5, String[] param6, mf param7, int[] param8, RgbSprite[][] param9, byte[] param10, int param11, String[] param12, int param13, String[][] param14) {
        rk[] array$0 = null;
        rk[] array$1 = null;
        rk[] array$2 = null;
        int var19 = 0;
        mh stackIn_6_0;
        mh stackIn_6_1;
        long stackIn_6_2;
        mh stackIn_6_3;
        mh stackIn_7_0 = null;
        mh stackIn_7_1 = null;
        String stackIn_7_4 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        mh var16 = null;
        int var17_int = 0;
        mh var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        mh var23 = null;
        mh var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          w.field_n = param8;
          pe.field_t = param4;
          Brick.field_O = param5;
          dm.field_c = param10;
          rg.field_b = param12;
          th.field_a = param3;
          aj.field_c = param1;
          mk.field_c = param0;
          im.field_c = param6;
          ff.field_i = param14;
          pf.field_i = param11;
          ki.field_k = param9;
          dj.field_f = cr.a("lobby", param7, "gameprivacy", 2);
          bq.field_c = cr.a("lobby", param7, "ratedgame", 2);
          uo.field_c = cr.a("lobby", param7, "opentome", 2);
          Ball.field_K = cr.a("lobby", param7, "allowspectators", 2);
          bl.field_H = new String[5];
          bl.field_H[3] = cm.field_u;
          bl.field_H[1] = t.field_e;
          bl.field_H[2] = ji.field_g;
          bl.field_H[4] = bq.field_a;
          bl.field_H[0] = MainMenuScreen.field_r;
          Ball.field_A = new mh(0L, (mh) null);
          qb.field_v = new mh(0L, MainMenuScreen.field_t, n.field_a);
          ij.field_a = new mh(0L, ik.field_a, pf.field_c);
          IsaacGenerator.field_b = new mm(0L, new mh(0L, (mh) null), am.field_Qb, ic.field_c);
          Ball.field_A.a(qb.field_v, 0);
          if (vd.field_e) {
            Ball.field_A.a(ij.field_a, 0);
          }
          Ball.field_A.a(IsaacGenerator.field_b, 0);
          IsaacGenerator.field_b.field_Qb.a((byte) -74, ad.field_l);
          IsaacGenerator.field_b.field_Qb.field_Q = 1;
          var23 = IsaacGenerator.field_b.field_Qb;
          var24 = var23;
          var24.field_S = 1;
          dn.field_N = new mh(0L, ad.field_l);
          dn.field_N.field_S = 1;
          jf.field_k = new mh(0L, ab.field_x, fj.field_Rb.toUpperCase());
          sc.field_b = new mh(0L, qh.field_j, rl.field_c.toUpperCase());
          ll.field_e = new mh(0L, qb.field_x);
          nk.field_g = new mh(0L, MainMenuScreen.field_t, nk.field_b);
          nk.field_a = new mh(0L, cd.field_d, td.field_r);
          kk.field_b = new mh(0L, cd.field_d, ch.field_d);
          la.field_b = new mh(0L, cd.field_d, kc.field_o);
          wh.field_h = new mh(0L, cd.field_d, r.field_v);
          dp.field_x = new mh(0L, ik.field_a, tl.field_d);
          rl.field_e = new mm(0L, new mh(0L, (mh) null), am.field_Qb, ic.field_c);
          gj.field_b = new mh(0L, fm.field_b, ua.field_e.toUpperCase());
          gj.field_b.field_eb = vd.field_e;
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = 0L;
          stackIn_6_3 = fm.field_b;
          if (vd.field_e) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = MultiplayerMatch.field_e;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = jk.field_v;
          }
          td.field_v = new mh(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_7_4).toUpperCase());
          rm.field_a = new mh(0L, (mh) null);
          rm.field_a.a(sc.field_b, 0);
          rm.field_a.a(ll.field_e, 0);
          ll.field_e.a(nk.field_g, 0);
          if (param2 < 13) {
            return;
          }
          ll.field_e.a(nk.field_a, 0);
          ll.field_e.a(kk.field_b, 0);
          if (vd.field_e) {
            ll.field_e.a(la.field_b, 0);
          }
          ll.field_e.a(wh.field_h, 0);
          ll.field_e.a(dp.field_x, 0);
          ll.field_e.a(rl.field_e, 0);
          if (vd.field_e) {
            rm.field_a.a(gj.field_b, 0);
          }
          rm.field_a.a(td.field_v, 0);
          Brick.field_A = new mh(0L, ad.field_l);
          Brick.field_A.field_S = 1;
          Brick.field_A.field_Q = 0;
          nh.field_a = new mh(0L, ij.field_b, k.field_j.toUpperCase());
          qp.field_f = new mh(0L, MenuSelection.field_m);
          qp.field_f.a(Brick.field_A, 0);
          qp.field_f.a(nh.field_a, 0);
          t.field_f = new mh(0L, am.field_Qb);
          t.field_f.a((byte) -83, ad.field_l);
          t.field_f.field_Q = 1;
          var16 = t.field_f;
          var16.field_S = 1;
          ji.field_b = new mh(0L, (mh) null);
          um.field_b = new mh(0L, ad.field_l);
          um.field_b.field_S = 1;
          rn.field_g = new mh(0L, MainMenuScreen.field_t, n.field_a);
          wd.field_E = new mh(0L, ik.field_a, pf.field_c);
          TimedSplashScreen.field_u = new mm(0L, new mh(0L, (mh) null), am.field_Qb, ic.field_c);
          ji.field_b.a(um.field_b, 0);
          ji.field_b.a(rn.field_g, 0);
          if (vd.field_e) {
            ji.field_b.a(wd.field_E, 0);
          }
          ji.field_b.a(TimedSplashScreen.field_u, 0);
          ij.field_e = new mh(0L, ab.field_x, di.field_a.toUpperCase());
          ba.field_v = new mh(0L, qh.field_j);
          rg.field_e = new mh(0L, qb.field_x);
          jd.field_a = new mh(0L, lj.field_k, bc.field_b.toUpperCase());
          gb.field_l = new mh[4 + param13];
          ab.field_A = new rk[4 + param13][];
          gb.field_l[0] = new mh(0L, wi.field_n, ro.field_H);
          ab.field_A[0] = new rk[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            ab.field_A[0][1 + var17_int] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, dj.field_f[var17_int], bl.field_H[var17_int]);
          }
          if (2 <= w.field_n.length) {
            gb.field_l[1] = new mh(0L, wi.field_n, og.field_ac);
            array$0 = new rk[1 + w.field_n.length];
            ab.field_A[1] = array$0;
            ab.field_A[1][0] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, ni.field_Pb);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < w.field_n.length; var17_intLifetime1++) {
              ab.field_A[1][var17_intLifetime1 + 1] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, Integer.toString(w.field_n[var17_intLifetime1]));
            }
          }
          gb.field_l[2] = new mh(0L, wi.field_n, p.field_j);
          ab.field_A[2] = new rk[]{new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, ni.field_Pb), new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, Ball.field_K[0], MenuSelection.field_a), new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, Ball.field_K[1], hh.field_f)};
          if (1 < pe.field_t) {
            gb.field_l[3] = new mh(0L, wi.field_n, uc.field_r);
            array$1 = new rk[pe.field_t + 1];
            ab.field_A[3] = array$1;
            ab.field_A[3][0] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, ni.field_Pb);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < pe.field_t; var17_intLifetime2++) {
              ab.field_A[3][var17_intLifetime2 + 1] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, im.field_c[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param13 > var17_intLifetime3; var17_intLifetime3++) {
            gb.field_l[var17_intLifetime3 + 4] = new mh(0L, wi.field_n, rg.field_b[var17_intLifetime3]);
            array$2 = new rk[ik.a((int) dm.field_c[var17_intLifetime3], 255) + 1];
            ab.field_A[4 + var17_intLifetime3] = array$2;
            ab.field_A[4 + var17_intLifetime3][0] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) null, ni.field_Pb);
            for (var18 = 0; (255 & dm.field_c[var17_intLifetime3]) > var18; var18++) {
              if (ki.field_k != null) {
                if (ki.field_k[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = ki.field_k[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (mk.field_c != null) {
                if (null == mk.field_c[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = mk.field_c[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              ab.field_A[4 + var17_intLifetime3][var18 + 1] = new rk(0L, al.field_n, (mh) null, DualLinkNode.field_t, (RgbSprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param13 > var17_intLifetime4; var17_intLifetime4++) {
            if (gb.field_l[var17_intLifetime4] != null) {
              gb.field_l[var17_intLifetime4].field_R = 11;
            }
            if (null != ab.field_A[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; var18Lifetime1 < ab.field_A[var17_intLifetime4].length; var18Lifetime1++) {
                if (null != ab.field_A[var17_intLifetime4][var18Lifetime1] &&
                  null != ab.field_A[var17_intLifetime4][var18Lifetime1].field_Rb) {
                  ab.field_A[var17_intLifetime4][var18Lifetime1].field_Rb.field_R = 11;
                }
              }
            }
          }
          pf.field_h = new mh(0L, fm.field_b);
          dn.field_K = new mh(0L, fm.field_b);
          ke.field_e = new mh(0L, Paddle.field_C);
          ke.field_e.a((byte) -125, ad.field_l);
          var17 = ke.field_e;
          ke.field_e.field_Q = 1;
          var17.field_S = 1;
          MultiplayerMatch.field_d = new mh(0L, (mh) null);
          MultiplayerMatch.field_d.a(ba.field_v, 0);
          MultiplayerMatch.field_d.a(rg.field_e, 0);
          rg.field_e.a(jd.field_a, 0);
          for (var18Lifetime2 = 0; param13 + 4 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(w.field_n.length < 2)) && (var18Lifetime2 != 3 ||
              !(pe.field_t <= 1))) {
              rg.field_e.a(gb.field_l[var18Lifetime2], 0);
              for (var19 = 0; ab.field_A[var18Lifetime2].length > var19; var19++) {
                if (ab.field_A[var18Lifetime2][var19] != null) {
                  rg.field_e.a(ab.field_A[var18Lifetime2][var19], 0);
                }
              }
            }
          }
          MultiplayerMatch.field_d.a(pf.field_h, 0);
          MultiplayerMatch.field_d.a(dn.field_K, 0);
          MultiplayerMatch.field_d.a(ke.field_e, 0);
          pk.field_h = new mh(0L, rf.field_c, lq.field_a.toUpperCase());
          nd.field_a = new mh(0L, ij.field_b, fh.field_e.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_77_0 = var15;
          stackIn_77_1 = new StringBuilder().append("sl.F(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param6 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param7 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param8 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',');
          if (param9 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
          if (param10 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(')').toString());
        }
    }

    abstract boolean b(boolean param0);

    sl(int param0) {
        this.field_u = param0;
    }

    static {
        field_z = 2147483647;
        field_A = new String[29];
        field_B = new th(12, 0, 1, 0);
    }
}
