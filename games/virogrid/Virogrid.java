/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Virogrid extends od {
    private p field_I;
    static co field_O;
    private int[] field_N;
    private int[] field_D;
    private int field_E;
    private int[] field_B;
    private int[] field_C;
    private int[] field_K;
    private int field_A;
    private int[] field_M;
    private int[] field_H;
    private int[] field_L;
    private int[] field_G;
    private int[] field_J;
    public static boolean field_F;

    private final void r(int param0) {
        jf dupTemp$2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_F ? 1 : 0;
        try {
          bc.field_c = 3;
          ln.field_g = 3;
          co.field_l = 3;
          dupTemp$2 = new jf();
          gb.field_H = dupTemp$2;
          ke.field_p = dupTemp$2;
          ad.field_g = new double[]{1.0, 0.0, 0.0};
          vm.field_d = new double[]{0.0, 0.0, -128.0};
          da.field_k = new double[3];
          gb.c((byte) -44);
          ke.field_p.field_d = true;
          ce.field_E = 0;
          bi.field_c = new int[]{0, 154, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          gb.field_H.field_d = true;
          c.field_d = new mg(640, 400);
          we.field_e = new mg(640, 400);
          mk.field_bb = new mg(200, 400);
          var2_int = 0;
          if (param0 <= 59) {
            Virogrid.$cfr$intArgs$b$d65aded092bd(-64, false);
          }
          while (var2_int < 256) {
            pj.field_d[var2_int] = rb.a(16711872, 143 * var2_int << 8);
            pj.field_d[var2_int] = oh.a(pj.field_d[var2_int], rb.a(65280, var2_int * 191));
            pj.field_d[var2_int] = oh.a(pj.field_d[var2_int], var2_int);
            var2_int++;
          }
          jm.a(320, 240, -2);
          qa.field_e = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.BB(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        int var2_int = (id.field_r % 20480 << 12) % 83886080;
        si.a(nk.field_K, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 700.0, 200.0, sj.field_j, 23967451 + var2_int, var2_int + 59918628, 0, 16711680, ke.field_p.field_k);
        si.a(nk.field_K, new double[]{-768.0 + rf.field_c * 1800.0, 20.0, 300.0 + rf.field_c * 400.0}, new double[]{rf.field_c, 0.0, -rf.field_c}, 500.0, 200.0, sj.field_j, var2_int + 59918628, 83820544 + var2_int, 0, 16711680, ke.field_p.field_k);
        if (param0 != -62) {
          return;
        }
        try {
          this.s(-1933);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.IB(" + param0 + ')');
        }
    }

    private final void a(eh param0, byte param1, eh param2, eh param3, eh param4, eh param5) {
        int var10 = 0;
        mg discarded$0 = null;
        mg discarded$1 = null;
        int var8 = 0;
        int var9_int = 0;
        mg var11 = null;
        int var12 = 0;
        mg var13 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        mg[][] var9 = null;
        var12 = field_F ? 1 : 0;
        try {
          hd.field_b = a.a("", param5, -110, "font", param4);
          vg.field_H = a.a("", param5, -95, "smallfont", param4);
          mc.field_b = a.a("", param5, -120, "menufont", param4);
          re.field_o = a.a("", param5, -110, "tinyfont", param4);
          var13 = sn.a(param5, "starfield", "", false);
          sj.field_j = new mg(2560, 256);
          sj.field_j.b();
          var13.b(0, 0);
          var13.b(1280, 0);
          ca.field_M.a((byte) 29);
          eh.field_l = vc.a(param5, "logo", "", (byte) 114);
          sn.a(param5, "splash", "", false);
          tk.field_d = ke.a("walk1", "", param5, 32370);
          ic.field_y = ke.a("walk2", "", param5, 32370);
          wh.field_b = ke.a("walk3", "", param5, 32370);
          vb.field_l = new mg(640, 480);
          ib.field_b = b.a("", param5, 7, "frame");
          wf.a(100, mc.field_b, 0, vg.field_H);
          en.field_Kb = 16777215;
          la.field_k = 16777215;
          sf.field_I = 16777215;
          na.field_Hb = 8437759;
          jl.field_E = 16777215;
          ti.field_b = 8437759;
          cb.field_d = ke.a(32, param5, "", "achievements_large");
          mj.field_F = sn.a(param2, "unachieved", "basic", false);
          ad.field_b = sn.a(param2, "orbcoin", "basic", false);
          var8 = cb.field_d.length;
          vd.field_Y = new mg[var8];
          qc.a(123);
          var9_int = -67 / ((param1 + 11) / 58);
          for (var10 = 0; var8 > var10; var10++) {
            var11 = new mg(32, 32);
            var11.b();
            cb.field_d[var10].b(0, 0, 32, 32);
            vd.field_Y[var10] = var11;
          }
          tn.field_b = new mg(32, 32);
          tn.field_b.b();
          mj.field_F.b(0, 0, 32, 32);
          ul.b((byte) 108);
          kd.field_p = ke.a(32, param5, "", "viewicons");
          discarded$0 = this.b(131586, -9105, 30136);
          discarded$1 = this.b(263172, -9105, 6316128);
          var9 = new mg[2][];
          var9[0] = ke.a(32, param5, "", "turntime_icons");
          var9[1] = ke.a(32, param5, "", "gridwidth_icons");
          nn.a(var9, var9, 2, ra.field_e, m.field_a, param3, param2, true, -27871, wc.field_c, wc.field_c, wf.field_e, wn.field_j, 2, ng.field_T);
          ak.field_e = sn.a(param5, "lobbyicon", "", false);
          fk.a(new vl(param0, param5, 8, 128));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("Virogrid.KB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_10_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_10_0;
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_15_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          stackIn_22_0 = stackIn_19_0;
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_23_0 = stackIn_22_0;
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = stackIn_19_0;
            stackIn_23_2 = "{...}";
          }
          stackIn_26_0 = stackIn_23_0;
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = stackIn_23_0;
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static ck b(byte param0, boolean param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        ck stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        ck stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -32) {
            field_O = (co) null;
          }
          var2 = new ck(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_d = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "Virogrid.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(boolean param0) {
        i var3 = null;
        i stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(77, 14, 4, 0, 2, 1, false, 121);
          var3 = new i();
          stackIn_3_0 = var3;
          stackIn_3_1 = 128;
          stackIn_3_2 = 9;
          stackIn_4_3 = !(param0);
          ((i) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_4_3);
          pe.a((java.awt.Component) ((Object) fi.field_v), var3, ei.field_c, param0, (byte) -18, 22050);
          this.a(false, true, -118, true, false, false, false);
          jc.field_i[60] = 4;
          jc.field_i[67] = 1;
          jc.field_i[63] = 1;
          jc.field_i[64] = 1;
          jc.field_i[65] = 1;
          jc.field_i[62] = 2;
          jc.field_i[9] = -1;
          jc.field_i[61] = 5;
          jc.field_i[10] = -1;
          jc.field_i[57] = -2;
          jc.field_i[58] = -2;
          jc.field_i[66] = 1;
          db.a((byte) 81, 200);
          this.r(114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.K(" + param0 + ')');
        }
    }

    private final boolean c(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var4 = field_F ? 1 : 0;
        try {
          a.b((byte) 69);
          if (null == pj.field_c) {
            if (param0 != -42) {
              this.field_L = (int[]) null;
            }
            if (wm.field_w != null) {
              al.a(mi.field_e, param0 ^ -37, 80.0f);
              this.b(true);
              oi.field_c = new sc[4];
              oi.field_c[0] = sc.a(wm.field_w, "", "ataxx titlescreen");
              oi.field_c[1] = sc.a(wm.field_w, "", "tetralink ingame 1");
              oi.field_c[2] = sc.a(wm.field_w, "", "tetralink ingame 2");
              oi.field_c[3] = sc.a(wm.field_w, "", "tetralink ingame 3");
              for (var3_int = 0; var3_int < 4; var3_int++) {
                vg.field_B.a(el.field_d, 0, af.field_g, oi.field_c[var3_int], 0);
              }
              vg.field_B.e(-1);
              af.field_g = null;
              el.field_d = null;
              wm.field_w = null;
              sb.a(-90);
              return false;
            }
            if (null != g.field_a) {
              al.a(aj.field_l, 13, 90.0f);
              this.b(true);
              this.a(gn.field_G, (byte) -105, ge.field_c, s.field_a, g.field_a, oj.field_Fb);
              s.field_a = null;
              g.field_a = null;
              sb.a(-82);
              return false;
            }
            if (null != wn.field_i) {
              al.a(gl.field_i, 13, 95.0f);
              this.b(true);
              this.a(1053, wn.field_i);
              wn.field_i = null;
              sb.a(param0 - 63);
              return false;
            }
            if (null != md.field_h) {
              cg.a(8799, new ii(md.field_h.a("", 100, "huffman")));
              md.field_h = null;
              sb.a(param0 - 86);
              return false;
            }
            pn.a(false);
            for (var3_intLifetime2 = 0; var3_intLifetime2 < 12; var3_intLifetime2++) {
              al.field_j[var3_intLifetime2] = new oi(var3_intLifetime2);
            }
            hm.field_c = 10;
            i.field_y = 10;
            fh.a((byte) -89);
            qc.a(50, (byte) 111);
            bm.c(-111, 50);
            ei.a(0, oi.field_c[0]);
            id.field_r = 0;
            return true;
          }
          if (ge.field_c.c(0) &&
            ge.field_c.a((byte) -102, "basic")) {
            if (ge.field_c.c(0) &&
              ge.field_c.a((byte) -102, "kartika13")) {
              if (s.field_a.c(0) &&
                s.field_a.a((byte) -102, "kartika13")) {
                if (ge.field_c.c(0) &&
                  ge.field_c.a((byte) -102, "lobby")) {
                  if (s.field_a.c(0) &&
                    s.field_a.a((byte) -102, "lobby")) {
                    if (pj.field_c.c(param0 + 42) &&
                      pj.field_c.b(25867)) {
                      if (sf.field_O.c(0) &&
                        sf.field_O.b(param0 ^ -25891)) {
                        if (el.field_d.c(0) &&
                          el.field_d.b(25867)) {
                          if (wm.field_w.c(param0 + 42) &&
                            wm.field_w.b(param0 + 25909)) {
                            if (oj.field_Fb.c(0) &&
                              oj.field_Fb.b(25867)) {
                              if (g.field_a.c(0) &&
                                g.field_a.b(25867)) {
                                if (md.field_h.c(param0 ^ -42) &&
                                  md.field_h.b(25867)) {
                                  if (wn.field_i.c(0) &&
                                    wn.field_i.b(25867)) {
                                    if (gn.field_G.c(param0 ^ -42) &&
                                      gn.field_G.b(param0 + 25909)) {
                                      if (ng.field_T.c(param0 + 42) &&
                                        ng.field_T.b(param0 + 25909)) {
                                        al.a(hn.field_u, 13, 78.0f);
                                        if (!param1) {
                                          return false;
                                        }
                                        ge.b(18887);
                                        this.b(true);
                                        af.field_g = new jg(pj.field_c, sf.field_O);
                                        af.field_g.a((byte) 86, "", "menu_select");
                                        of.field_b = af.field_g.a((byte) 112, "", "tetralink_invalid_move");
                                        tk.field_c = new ml[5];
                                        td.field_d = new ml[5];
                                        for (var3_intLifetime1 = 0; var3_intLifetime1 < 5; var3_intLifetime1++) {
                                          tk.field_c[var3_intLifetime1] = af.field_g.a((byte) 84, "", "tetralink_drop_piece_" + (var3_intLifetime1 + 1));
                                          td.field_d[var3_intLifetime1] = af.field_g.a((byte) 95, "", "tetralink_piece_inplace_" + (1 + var3_intLifetime1));
                                        }
                                        qd.field_i = af.field_g.a((byte) 92, "", "tetralink_reset_board");
                                        bg.field_Lb = af.field_g.a((byte) 119, "", "tetralink_second_tick");
                                        wc.field_a = af.field_g.a((byte) 96, "", "tetralink_select_column");
                                        u.field_t = af.field_g.a((byte) 110, "", "tetralink_start_game");
                                        f.field_j = af.field_g.a((byte) 118, "", "tetralink_winning_line_sound_winner");
                                        cg.field_d = af.field_g.a((byte) 82, "", "tetralink_winning_line_sound_loser");
                                        af.field_g.a((byte) 90, "", "tetralink_title_appear");
                                        ih.field_d = af.field_g.a((byte) 99, "", "tetralink_dissolve");
                                        af.field_k = af.field_g.a((byte) 103, "", "tetralink_dissolve_in");
                                        dj.field_f = new ml[3];
                                        dj.field_f[0] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_1");
                                        dj.field_f[1] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_2");
                                        dj.field_f[2] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_3");
                                        pj.field_c = null;
                                        sf.field_O = null;
                                        sb.a(param0 + 15);
                                        return false;
                                      }
                                      al.a(db.a(ng.field_T, sk.field_b, (byte) -118, gl.field_a), 13, 77.0f);
                                      return false;
                                    }
                                    al.a(uh.a("", vl.field_m, gn.field_H, param0 + 41, gn.field_G), 13, 75.0f);
                                    return false;
                                  }
                                  al.a(uh.a("", pl.field_d, fa.field_m, -1, wn.field_i), 13, 75.0f);
                                  return false;
                                }
                                al.a(uh.a("", sk.field_b, gl.field_a, -1, md.field_h), 13, 75.0f);
                                return false;
                              }
                              al.a(uh.a("", sb.field_a, aa.field_c, -1, g.field_a), 13, 75.0f);
                              return false;
                            }
                            al.a(uh.a("", sb.field_a, aa.field_c, -1, oj.field_Fb), param0 + 55, 75.0f);
                            return false;
                          }
                          al.a(uh.a("", nh.field_r, te.field_g, -1, wm.field_w), 13, 60.0f);
                          return false;
                        }
                        al.a(pe.a(te.field_g, nh.field_r, el.field_d, 0, 0), 13, 45.0f);
                        return false;
                      }
                      al.a(uh.a("", ee.field_d, bm.field_n, -1, sf.field_O), 13, 40.0f);
                      return false;
                    }
                    al.a(uh.a("", ee.field_d, bm.field_n, -1, pj.field_c), param0 + 55, 20.0f);
                    return false;
                  }
                  al.a(uh.a("lobby", we.field_j, mm.field_d, -1, s.field_a), 13, 17.0f);
                  return false;
                }
                al.a(uh.a("lobby", sb.field_a, aa.field_c, -1, ge.field_c), 13, 13.0f);
                return false;
              }
              al.a(uh.a("roman20", we.field_j, mm.field_d, -1, s.field_a), param0 ^ -37, 12.0f);
              return false;
            }
            al.a(uh.a("kartika13", sb.field_a, aa.field_c, -1, ge.field_c), 13, 11.0f);
            return false;
          }
          al.a(uh.a("basic", sb.field_a, aa.field_c, -1, ge.field_c), 13, 10.0f);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "Virogrid.EB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void u(int param0) {
        try {
          field_O = null;
          if (param0 != 240) {
            field_O = (co) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.HB(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (db.b((byte) 13, 0) &&
            0 < hj.field_h) {
            var2_int = id.field_c - hj.field_h;
            var3 = -700;
            var4 = 4 * var2_int - 1300;
            var5 = 200;
            if (100 > var2_int) {
              var5 = var5 - (var2_int + 200);
              var3 = -20000 + var3 + var2_int * 200;
            }
            var6 = -2048;
            var7 = id.a(var6, 32);
            var8 = nf.a(21855, var6);
            ae.field_e = new int[]{var3, var5, var4, var8, 0, -var7, 0, 65536, 0, var7, 0, var8};
            ri.field_a.a(pe.field_j, ae.field_e);
            ri.field_a.c();
          }
          if (param0 != -1933) {
            this.field_D = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.JB(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        int var8 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        fl var3_ref_fl = null;
        int var4 = 0;
        pm var4_ref_pm = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var3Lifetime2;
        int var6Lifetime3;
        var8 = field_F ? 1 : 0;
        try {
          var2_int = 1;
          if (hm.field_c == i.field_y &&
            nf.field_g == pg.field_g) {
            if (i.field_y != -2) {
              dj.a(nf.field_g, true, -1, 3, i.field_y);
            } else {
              ej.a(false, 25680);
              var2_int = 0;
            }
          } else {
            if (i.field_y != -2) {
              if (hm.field_c == -2) {
                if (we.field_l < 16) {
                  dj.a(nf.field_g, false, -1, 3, i.field_y);
                } else {
                  var2_int = 0;
                  ej.a(false, 25680);
                }
              } else {
                if (we.field_l < 16) {
                  dj.a(nf.field_g, false, 1 + we.field_l, 3, i.field_y);
                } else {
                  dj.a(pg.field_g, false, 33 - we.field_l, 3, hm.field_c);
                }
              }
            } else {
              if (we.field_l < 16) {
                var2_int = 0;
                ej.a(false, 25680);
              } else {
                dj.a(pg.field_g, false, -1, 3, hm.field_c);
              }
            }
          }
          if (var2_int != 0) {
            if (null == ci.field_s ||
              sj.field_o != cc.field_x) {
              cc.field_x = sj.field_o;
              lj.field_r = sg.field_i;
              cf.field_c = sj.field_o;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
              ci.field_s = new mg(640, 480);
              pj.a(ci.field_s, 256);
              df.b(0, 0, 640, 480, 3158064);
              var3 = j.field_b;
              var4 = tm.field_g;
              jm.a(320, 240, -2);
              var9 = new int[12];
              var20 = var9;
              var13 = var20;
              var5_ref_int__ = var13;
              for (var6 = 0; var6 < 3; var6++) {
                var9[var6] = pe.field_j[var6] << 3;
              }
              var6Lifetime3 = 3;
              stackIn_34_0 = var5_ref_int__;
              while (stackIn_34_0.length > var6Lifetime3) {
                var5_ref_int__[var6Lifetime3] = pe.field_j[var6Lifetime3];
                var6Lifetime3++;
                stackIn_34_0 = var20;
              }
              this.e((byte) -62);
              kg.field_c.a(pe.field_j, bi.field_c);
              nb.field_x.a(pe.field_j, bi.field_c);
              kf.field_c.a(pe.field_j, bi.field_c);
              cm.field_k.a(pe.field_j, bi.field_c);
              ba.field_c.a(pe.field_j, bi.field_c);
              wf.field_j.a(pe.field_j, bi.field_c);
              th.field_y.a(var20, bi.field_c);
              pj.field_a.a(var20, bi.field_c);
              qg.field_h.a(var20, bi.field_c);
              jg.field_i.a(var20, bi.field_c);
              ee.field_a.a(var20, bi.field_c);
              og.field_l.a(var20, bi.field_c);
              ab.field_L.a(var20, bi.field_c);
              rc.field_o.a(var20, bi.field_c);
              hn.field_x.a(var20, bi.field_c);
              td.field_i.a(var20, bi.field_c);
              ul.b((byte) 109);
              jm.a(var3, var4, -2);
            }
            ci.field_s.b(0, tm.field_g - 240);
            if (ke.field_p.field_m) {
              var3Lifetime2 = id.field_r % 64;
              if (var3Lifetime2 >= 32) {
                stackIn_43_0 = 48 - var3Lifetime2;
              } else {
                stackIn_43_0 = var3Lifetime2 - 16;
              }
              var3Lifetime2 = stackIn_43_0;
              var3Lifetime2 = var3Lifetime2 << 2;
              var22 = new int[3];
              var15 = var22;
              var10 = var15;
              var29 = var10;
              var21 = new int[3];
              var14 = var21;
              var11 = var14;
              var30 = var11;
              var23 = new int[3];
              var16 = var23;
              var6_ref_int__ = var16;
              var10[0] = (int)ao.field_Hb;
              var21[0] = 50;
              var10[1] = -(int)ao.field_Hb;
              var6_ref_int__[0] = (var3Lifetime2 >> 4) + 128;
              var21[1] = 50;
              var22[2] = 0;
              var6_ref_int__[1] = (var3Lifetime2 >> 4) + 128;
              var21[2] = 80;
              var23[2] = 128;
              var7 = si.a(8437759);
              qf.a(240, 0, 0, var29, var30, var23, var7, var7, var7);
              var3Lifetime2 = var22[0];
              var10[0] = var22[1];
              var22[1] = var3Lifetime2;
              var3Lifetime2 = var21[0];
              var11[0] = var21[1];
              var21[1] = var3Lifetime2;
              var3Lifetime2 = var23[0];
              var6_ref_int__[0] = var23[1];
              var23[1] = var3Lifetime2;
              qf.a(240, 0, 0, var29, var30, var23, var7, var7, var7);
            }
            if (ke.field_p.field_d) {
              var26 = c.field_d.field_B;
              var19 = var26;
              var12 = var19;
              var3_ref_int__ = var12;
              if (co.field_h > 0) {
                var6Lifetime1 = 256000;
                while (var6Lifetime1 > 0) {
                  var6Lifetime1--;
                  var4Lifetime1 = 16711935 & var26[var6Lifetime1];
                  var5 = 65280 & var26[var6Lifetime1];
                  var4Lifetime1 = var4Lifetime1 * (256 - co.field_h);
                  var4Lifetime1 = var4Lifetime1 & -16711936;
                  var5 = var5 * (256 - co.field_h);
                  var5 = var5 & 16711680;
                  var4Lifetime1 = var4Lifetime1 + (co.field_h * 16711935 & -16711936);
                  var5 = var5 + (16711680 & co.field_h * 65280);
                  var12[var6Lifetime1] = oh.a(var5, var4Lifetime1) >>> 8;
                }
              }
              pj.a(c.field_d, 256);
              var4_ref_pm = (pm) (gd.field_n.a((byte) -107));
              while (var4_ref_pm != null) {
                rk.a(var4_ref_pm.field_m, var4_ref_pm.field_h, var4_ref_pm.field_r << 3, 10000);
                var4_ref_pm = (pm) (gd.field_n.a(16213));
              }
              ul.b((byte) 86);
              c.field_d.d(j.field_b - (c.field_d.field_w >> 1), -(c.field_d.field_p >> 1) + tm.field_g);
              if (!(ke.field_p.field_f <= 0)) {
                rk.a(j.field_b - (c.field_d.field_w >> 1), tm.field_g - (c.field_d.field_p >> 1), (c.field_d.field_w >> 1) + j.field_b, -(c.field_d.field_p >> 1) + tm.field_g, 40, ke.field_p.field_f, pj.field_d);
                rk.a((c.field_d.field_w >> 1) + j.field_b, -(c.field_d.field_p >> 1) + tm.field_g, (c.field_d.field_w >> 1) + j.field_b, tm.field_g + (c.field_d.field_p >> 1), 40, ke.field_p.field_f, pj.field_d);
                rk.a((c.field_d.field_w >> 1) + j.field_b, tm.field_g + (c.field_d.field_p >> 1), -(c.field_d.field_w >> 1) + j.field_b, tm.field_g + (c.field_d.field_p >> 1), 40, ke.field_p.field_f, pj.field_d);
                rk.a(j.field_b - (c.field_d.field_w >> 1), tm.field_g + (c.field_d.field_p >> 1), j.field_b - (c.field_d.field_w >> 1), tm.field_g - (c.field_d.field_p >> 1), 40, ke.field_p.field_f, pj.field_d);
              }
            }
            var3_ref_fl = (fl) (sh.field_tb.a((byte) -108));
            while (var3_ref_fl != null) {
              var4Lifetime2 = var3_ref_fl.field_n >> 12;
              var6Lifetime2 = 512 + (var3_ref_fl.field_m >> 12);
              var5Lifetime1 = var3_ref_fl.field_p >> 12;
              if (var6Lifetime2 > 0) {
                df.a((var4Lifetime2 << 13) / var6Lifetime2 + (j.field_b << 4), (tm.field_g << 4) + (var5Lifetime1 << 13) / var6Lifetime2, 65536 / var6Lifetime2, var3_ref_fl.field_o * 5 / 3, pj.field_d);
              }
              var3_ref_fl = (fl) (sh.field_tb.a(16213));
            }
          }
          var3Lifetime1 = 14 / ((param0 + 76) / 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.LB(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        Object stackIn_5_0 = null;
        ic stackIn_24_0 = null;
        boolean stackIn_61_0 = false;
        boolean stackIn_66_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        ic var3 = null;
        int var4 = 0;
        hj var4_ref_hj = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = field_F ? 1 : 0;
        try {
          if (null == ih.field_b) {
            stackIn_5_0 = fi.field_v;
          } else {
            stackIn_5_0 = ih.field_b;
          }
          var8 = stackIn_5_0;
          var2 = var8;
          if (j.a(-1)) {
            cm.a((java.awt.Canvas) (var8), (byte) -47, mi.a((byte) -121));
            return;
          }
          if (!i.field_H) {
            uh.a((byte) 46, (java.awt.Canvas) (var8));
            return;
          }
          if (!jm.a((byte) -85)) {
            al.a(sk.field_b, 13, 100.0f);
            uh.a((byte) 83, (java.awt.Canvas) (var8));
            return;
          }
          if (ke.field_p.field_g) {
            this.e(true);
          } else {
            this.f((byte) 54);
          }
          if (null != vg.field_I) {
            stackIn_24_0 = vg.field_I;
          } else {
            stackIn_24_0 = ei.field_b;
          }
          var3 = stackIn_24_0;
          if (var3 != null) {
            var3.c(-16, true);
            fa.a(-30265);
            if (ok.field_J &&
              vm.field_e) {
              ok.b(f.b(-844), 3410);
            }
          } else {
            fa.a(-30265);
          }
          if ((hm.field_c != i.field_y ||
            pg.field_g != nf.field_g) &&
            (-2 == i.field_y ||
            -2 == hm.field_c) &&
            we.field_l < 16) {
          }
          if (!ok.field_J ||
            !vm.field_e) {
            ok.b(f.b(-844), 3410);
          }
          if (ug.a(param0)) {
            df.g(0, 0, df.field_e, df.field_f);
            stackIn_66_0 = !param0;
            var4 = ma.a(stackIn_66_0) + 24;
            var5 = Virogrid.q(-80) + 26;
            dg.b(var5, -124, var4);
            qi.b(-5205);
          } else {
            if (ak.b(-31609)) {
              stackIn_61_0 = (ih.field_b != null) || (fe.field_Gb);
              fd.a(stackIn_61_0, -20248);
            } else {
              if (!eg.a((byte) 47)) {
                if (!this.field_I.b((byte) 64)) {
                  var4_ref_hj = (hj) (this.field_I.a((byte) -103));
                  var6 = this.field_A;
                  if (var6 < 80) {
                    var5 = -32 + var6 / 2;
                  } else {
                    if (var6 >= 230) {
                      var5 = 123 - var6 / 2;
                    } else {
                      var5 = 8;
                    }
                  }
                  vd.field_Y[var4_ref_hj.field_i].d(8, var5);
                  hd.field_b.b(qk.field_d[var4_ref_hj.field_i], 48, hd.field_b.field_H + var5, 8437759, -1);
                }
              } else {
                var4 = 24 + rh.a(-16118);
                var5 = pg.a(true) + 26;
                dg.b(var5, -125, var4);
                fm.a(false);
              }
            }
          }
          if (tg.field_x != 0) {
            ij.a(-119, (16 - wa.field_K) * 256 / 16);
          }
          if (hd.field_d >= 2) {
            hd.field_b.b(Integer.toString(mj.field_E), 4, 24, 16777215, -1);
          }
          td.a(-30179, (java.awt.Canvas) (var8), 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "Virogrid.J(" + param0 + ')');
        }
    }

    private final static int q(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          var1_int = -13 / ((param0 + 32) / 40);
          stackIn_1_0 = sg.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "Virogrid.SA(" + param0 + ')');
        }
    }

    private final void a(int param0, eh param1) {
        qb var4 = null;
        qb var5 = null;
        qb var6 = null;
        qb var7 = null;
        qb var8 = null;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        qb var17 = null;
        qb var18 = null;
        qb var19 = null;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        qb var27 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        qb var26 = null;
        try {
          fk.a(1.0f);
          fk.a();
          if (param0 != 1053) {
            return;
          }
          var27 = qb.a(param1, "", "scenery_walls");
          var4 = qb.a(param1, "", "scenery_walls2");
          var5 = qb.a(param1, "", "scenery_game-table");
          var6 = qb.a(param1, "", "scenery_floor");
          var7 = qb.a(param1, "", "scenery_props1");
          var8 = qb.a(param1, "", "scenery_props2");
          var9 = qb.a(param1, "", "scenery_ceiling");
          var10 = qb.a(param1, "", "scenery_door");
          var11 = qb.a(param1, "", "scenery_game-screen_back");
          var12 = qb.a(param1, "", "scenery_game-screen_front");
          var13 = qb.a(param1, "", "scenery_game-screen_front-left");
          var14 = qb.a(param1, "", "scenery_game-screen_back-left");
          var15 = qb.a(param1, "", "scenery_game-screen_back-top");
          var16 = qb.a(param1, "", "scenery_game-screen_front-right");
          var17 = qb.a(param1, "", "scenery_game-screen_back-right");
          var18 = qb.a(param1, "", "scenery_game-screen_front-top");
          var19 = qb.a(param1, "", "scenery_game-screen_front-black");
          var20 = qb.a(param1, "", "scenery_game-screen_back-black");
          this.a(var11, (byte) 69);
          this.a(var12, (byte) 69);
          this.a(var13, (byte) 69);
          this.a(var14, (byte) 69);
          this.a(var16, (byte) 69);
          this.a(var17, (byte) 69);
          this.a(var15, (byte) 69);
          this.a(var18, (byte) 69);
          this.a(var19, (byte) 69);
          this.a(var20, (byte) 69);
          this.field_J = this.a((byte) 124, var11);
          this.field_K = this.a((byte) 118, var12);
          this.field_D = this.a((byte) 94, var13);
          this.field_B = this.a((byte) 116, var16);
          this.field_C = this.a((byte) 74, var18);
          this.field_L = this.a((byte) 116, var19);
          this.field_M = this.a((byte) 64, var14);
          this.field_G = this.a((byte) 69, var17);
          this.field_H = this.a((byte) 107, var15);
          this.field_N = this.a((byte) 69, var20);
          var21 = 96;
          var22 = 2260;
          var23 = 0;
          var24 = 256;
          var25 = 0;
          if (db.b((byte) 13, 0)) {
            var26 = qb.a(param1, "", "ghost_untextured");
            ri.field_a = (il) (var26.a(var21, var22, var23, var24, var25));
            var23 = 64;
            var21 = 42;
          }
          kf.field_c = (il) (var27.a(var21, var22, var23, var24, var25));
          cm.field_k = (il) (var4.a(var21, var22, var23, var24, var25));
          fl.field_s = (il) (var5.a(var21, var22, var23, var24, var25));
          nb.field_x = (il) (var6.a(var21, var22, var23, var24, var25));
          ba.field_c = (il) (var7.a(var21, var22, var23, var24, var25));
          wf.field_j = (il) (var8.a(var21, var22, var23, var24, var25));
          kg.field_c = (il) (var9.a(var21, var22, var23, var24, var25));
          lk.field_Qb = (il) (var10.a(var21, var22, var23, var24, var25));
          var13.d();
          var14.d();
          var14.a(var13, 0, 0, 0, false);
          var16.d();
          var17.d();
          var17.a(var16, 0, 0, 0, false);
          th.field_y = (il) (var11.a(var21, var22, var23, var24, var25));
          ee.field_a = (il) (var12.a(var21, var22, var23, var24, var25));
          qg.field_h = (il) (var14.a(var21, var22, var23, var24, var25));
          jg.field_i = (il) (var17.a(var21, var22, var23, var24, var25));
          pj.field_a = (il) (var15.a(var21, var22, var23, var24, var25));
          ab.field_L = (il) (var13.a(var21, var22, var23, var24, var25));
          rc.field_o = (il) (var16.a(var21, var22, var23, var24, var25));
          og.field_l = (il) (var18.a(var21, var22, var23, var24, var25));
          hn.field_x = (il) (var20.a(var21, var22, var23, var24, var25));
          td.field_i = (il) (var19.a(var21, var22, var23, var24, var25));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("Virogrid.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        String[] array$1 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_50_1 = false;
        double stackIn_83_0 = 0.0;
        int stackIn_99_0 = 0;
        String[] stackIn_112_0 = null;
        String[] stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        String stackIn_113_3;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        ic var7_ref_ic = null;
        String var8 = null;
        String var9 = null;
        int var9_int = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var4_intLifetime2;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime1Lifetime2;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        var11 = field_F ? 1 : 0;
        try {
          lj.c(param0 ^ -28791807);
          tl.field_l = km.e(param0 ^ -125);
          kh.a(false);
          if (null != ih.field_b &&
            ih.field_b.field_a) {
            am.a((byte) -16);
            qc.b((byte) -12);
          }
          stackIn_8_1 = (ih.field_b != null);
          this.a(stackIn_8_1, 121);
          if (i.field_w) {
            this.t(param0 ^ 13);
            i.field_w = false;
          }
          id.field_r = id.field_r + 1;
          if (id.field_r == 500 &&
            10 == hm.field_c) {
            el.a(12229, false);
          }
          if (j.a(-1)) {
            this.m(1);
            if (j.a(-1)) {
              if (me.b(66)) {
                discarded$0 = this.c((byte) -42, false);
              }
              return;
            }
          }
          if (!i.field_H) {
            jb.a(og.field_b, param0 + 45);
            if (this.c((byte) -42, true)) {
              i.field_H = true;
            }
          } else {
            if (!jm.a((byte) 118)) {
              ee.b(false);
            } else {
              if (!ug.a(true)) {
                if (ak.b(-31609)) {
                  stackIn_50_1 = (ih.field_b != null);
                  var2_int = this.c(stackIn_50_1, -120);
                  if (1 == var2_int ||
                    var2_int == 2) {
                    if (null != ih.field_b) {
                      am.a((byte) -16);
                    }
                    if (var2_int == 2) {
                      ha.a((byte) 39, (java.applet.Applet) (this));
                    }
                  }
                  this.a(false, true);
                } else {
                  if (eg.a((byte) 47)) {
                    if (tg.field_x == 0) {
                      var2_int = d.f((byte) 57);
                      if (1 == var2_int) {
                        bj.field_n = true;
                        gn.a((byte) -56, qe.field_l, 0);
                      }
                      this.a(false, true);
                    } else {
                      this.a(false, false);
                    }
                  } else {
                    this.a(false, false);
                  }
                }
              } else {
                if (tg.field_x == 0) {
                  var2_int = ca.a(2);
                  if (var2_int == 2) {
                    am.a((byte) -16);
                  } else {
                    if (var2_int == 3) {
                      a.field_D = false;
                      ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_A + hd.field_b.field_G, 8, -16824, true, 240);
                    } else {
                      if (var2_int == 4) {
                        a.field_D = true;
                        gn.a((byte) 53, jc.field_j, 0);
                      }
                    }
                  }
                  this.a(false, true);
                } else {
                  this.a(false, false);
                }
              }
            }
          }
          while (true) {
            if (!kd.a(-122, jc.field_i)) {
              al.b(-1, param0);
              if (i.field_y == -2) {
                bl.field_B = true;
              }
              if (bl.field_B) {
                wc.field_j = 0;
              }
              if (eg.b((byte) -121)) {
                var2_intLifetime1 = this.g(0);
                if (var2_intLifetime1 == 0 ||
                  var2_intLifetime1 == 1) {
                  ti.c(114);
                  if (var2_intLifetime1 != 1) {
                    if (aj.field_a) {
                      vm.field_e = false;
                      mn.field_e = true;
                      th.field_q = true;
                      if (!dd.field_a) {
                        gb.a(-2, 0, false, 0);
                      } else {
                        kn.field_J = mi.field_f;
                        gb.a(-2, 0, false, 9);
                      }
                      wm.c((byte) -86);
                      ka.a(true, (byte) 87);
                      al.field_j[i.field_y].a((byte) 120, 0, false);
                      on.field_d = false;
                      dd.field_a = false;
                      aj.field_a = false;
                    }
                    eh.field_e = false;
                    qe.field_k = false;
                  } else {
                    qe.field_k = true;
                    eh.field_e = true;
                  }
                }
                var3 = 0;
                if (2 == var2_intLifetime1) {
                  var3 = 1;
                }
                if (aj.field_a ||
                  qe.field_k ||
                  eh.field_e) {
                  var3 = 1;
                }
                if (var3 != 0) {
                  ve.c((byte) -121);
                }
              }
              return;
            }
            if (9 == ci.field_q) {
              wm.c((byte) -86);
              jk.field_c = 2;
              ec.field_z = 3.1415927410125732f;
              hm.field_c = 9;
              qe.field_k = false;
              em.field_c = 128.0f;
              kn.field_J = sh.field_qb.h(-117);
              continue;
            }
            if (ci.field_q == 14) {
              vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
              wm.c((byte) -86);
              jj.a(ra.a(8742, 2), ci.j(param0 - 126), ra.field_e, 8, eg.d(1048576), 1024, 150, ra.a(8742, 2000), wn.field_j.length, ri.b((byte) 51));
              dl.a(bf.a((byte) -96), (byte) -127, fa.c(16777215));
              hm.field_c = -2;
              qe.field_k = false;
              aj.field_a = true;
              continue;
            }
            if (ci.field_q == 15) {
              if (aj.field_a) {
                wm.c((byte) -86);
                wm.b(param0 ^ 2);
                fn.a((byte) -69);
                hm.field_c = 0;
                th.field_q = true;
                mn.field_e = true;
                vm.field_e = false;
                dd.field_a = false;
                aj.field_a = false;
                on.field_d = false;
                jm.a(320, 240, param0 ^ -2);
                if (null != vg.field_I &&
                  1 == vg.field_I.field_e) {
                  stackIn_83_0 = 0.0;
                } else {
                  stackIn_83_0 = 3.141592653589793;
                }
                sj.field_o = (float)stackIn_83_0;
                el.a(false, (byte) -106);
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                ka.a(true, (byte) 87);
                gb.c((byte) -44);
              }
              eh.field_e = false;
              qe.field_k = false;
              continue;
            }
            if (ci.field_q == 10 &&
              aj.field_a) {
              bj.a(-51);
              continue;
            }
            if (67 == ci.field_q) {
              var2_intLifetime1Lifetime1 = sh.field_qb.g(11132);
              var3Lifetime1 = 1 << var2_intLifetime1Lifetime1;
              rn.field_c = rn.field_c | var3Lifetime1;
              this.field_I.a(new hj(var2_intLifetime1Lifetime1), (byte) -61);
              continue;
            }
            if (ci.field_q != 57 &&
              ci.field_q != 58) {
              if (ci.field_q == 59) {
                if (dd.field_a ||
                  on.field_d) {
                  wm.c((byte) -86);
                  if (dd.field_a) {
                    vg.field_I.a((byte) -70, false);
                  }
                  ka.a(true, (byte) 87);
                  bl.field_B = true;
                  vm.field_e = false;
                  hm.field_c = -2;
                  th.field_q = true;
                  dd.field_a = false;
                  wc.field_j = 0;
                  on.field_d = false;
                }
                eh.field_e = false;
                continue;
              }
              var2 = null;
              if (dd.field_a) {
                var2 = vg.field_I;
              } else {
                if (on.field_d) {
                  var2 = ei.field_b;
                }
              }
              if (var2 != null) {
                if (ci.field_q == 60) {
                  var3Lifetime2 = sh.field_qb.g(11132);
                  var4_int = sh.field_qb.g(11132);
                  var5 = sh.field_qb.c((byte) -92);
                  ((ic) (var2)).field_C.a(var3Lifetime2, var4_int, 21428);
                  if (((ic) (var2)).field_C.field_v == -1) {
                    ((ic) (var2)).field_C.field_v = var3Lifetime2;
                  }
                  ((ic) (var2)).field_C.a(((ic) (var2)).field_A.field_h, ((ic) (var2)).field_C.field_A, (byte) 14);
                  ((ic) (var2)).field_w = var5 - 50;
                  if (1 <= ((ic) (var2)).field_w) {
                    continue;
                  }
                  ((ic) (var2)).field_w = 1;
                  continue;
                }
                if (ci.field_q == 61) {
                  var3Lifetime2Lifetime1 = sh.field_qb.g(param0 ^ 11132);
                  var4_intLifetime2 = sh.field_qb.g(param0 + 11132);
                  var5Lifetime1 = sh.field_qb.g(param0 ^ 11132);
                  var6 = sh.field_qb.g(11132);
                  var7 = sh.field_qb.g(11132);
                  ((ic) (var2)).field_C.a(var6, var7, (byte) 119, var3Lifetime2Lifetime1, var4_intLifetime2, var5Lifetime1);
                  ((ic) (var2)).field_A.a(((ic) (var2)).field_g, 31626);
                  ((ic) (var2)).field_A.field_k = -1;
                  ((ic) (var2)).field_D = false;
                  ((ic) (var2)).field_A.field_c = -1;
                  continue;
                }
                if (ci.field_q == 62) {
                  var3Lifetime2Lifetime2 = sh.field_qb.a((byte) -72);
                  ((ic) (var2)).field_C.d(-39, var3Lifetime2Lifetime2);
                  ((ic) (var2)).field_C.c((int) sh.field_qb.a((byte) -103), 2);
                  var4 = var2;
                  if (((ic) (var4)).field_e != -2) {
                    ((ic) (var4)).a(false, -1, 22273, false);
                  }
                  ((ic) (var4)).field_n = 0;
                  continue;
                }
                if (ci.field_q == 63) {
                  ((ic) (var2)).field_C.field_D = sh.field_qb.g(11132);
                  if (null == vg.field_I) {
                    continue;
                  }
                  mn.a(false);
                  continue;
                }
                if (64 == ci.field_q) {
                  ((ic) (var2)).field_C.field_r = sh.field_qb.g(11132);
                  continue;
                }
                if (ci.field_q == 65) {
                  ((ic) (var2)).field_C.field_b = sh.field_qb.g(param0 ^ 11132);
                  if (null == vg.field_I) {
                    continue;
                  }
                  fe.g(1);
                  continue;
                }
                if (66 == ci.field_q) {
                  ((ic) (var2)).field_v = sh.field_qb.g(11132);
                  if (null == vg.field_I) {
                    continue;
                  }
                  fe.g(1);
                  continue;
                }
              }
              this.n(-108);
              continue;
            }
            wm.c((byte) -86);
            var2_intLifetime1Lifetime2 = sh.field_qb.g(11132);
            var3Lifetime3 = sh.field_qb.g(11132);
            stackIn_99_0 = (sh.field_qb.g(11132) == 0) ? 0 : 1;
            var4_intLifetime1 = stackIn_99_0;
            var5_ref_String__ = new String[2];
            for (var7Lifetime1 = 0; var5_ref_String__.length > var7Lifetime1; var7Lifetime1++) {
              var5_ref_String__[var7Lifetime1] = sh.field_qb.i(15070);
            }
            var6Lifetime1 = -2;
            var6Lifetime2 = sh.field_qb.a((byte) 62);
            var6Lifetime2 = var6Lifetime2 - (var6Lifetime2 >>> 31);
            var7_ref_ic = new ic(true, var2_intLifetime1Lifetime2, var5_ref_String__, var6Lifetime2, var4_intLifetime1 != 0, var3Lifetime3, 0);
            var7_ref_ic.field_C.a(sh.field_qb, (byte) 57);
            var7_ref_ic.field_A.a(false);
            if (ci.field_q != 57) {
              ei.field_b = var7_ref_ic;
              on.field_d = true;
              var8 = var7_ref_ic.field_C.field_c[0];
              var9 = var7_ref_ic.field_C.field_c[1];
              var14 = oi.a(new String[]{var8, var9}, lm.field_k, 2);
              gf.a(mi.field_d, 0, false, var14, 1, var7_ref_ic.field_C.field_c[0]);
            } else {
              dd.field_a = true;
              vg.field_I = var7_ref_ic;
              if (var7_ref_ic.field_t) {
                var8 = var7_ref_ic.field_C.field_c[0];
                var9_int = 0;
                while (jc.a(var8, true)) {
                  var9_int++;
                  var8 = var7_ref_ic.field_C.field_c[var9_int];
                }
                var12 = oi.a(new String[]{var8}, pc.field_e, 2);
                gf.a(mi.field_d, 0, false, var12, 1, var7_ref_ic.field_C.field_c[0]);
              }
              array$1 = new String[1];
              stackIn_112_0 = array$1;
              stackIn_112_1 = array$1;
              stackIn_112_2 = 0;
              if (var6Lifetime2 != 0) {
                stackIn_113_3 = pb.field_k;
              } else {
                stackIn_113_3 = uk.field_g;
              }
              stackIn_112_1[stackIn_112_2] = stackIn_113_3;
              var13 = oi.a(stackIn_112_0, rf.field_f, 2);
              gf.a(mi.field_d, 0, false, var13, 1, var7_ref_ic.field_C.field_c[0]);
            }
            lj.b(122);
            eh.field_e = false;
            vm.field_e = true;
            hm.field_c = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (var2), "Virogrid.E(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("virogrid", 15, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.init()");
        }
    }

    private final int[] a(byte param0, qb param1) {
        RuntimeException var3 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 61) {
            Virogrid.$cfr$intArgs$b$d65aded092bd(94, false);
          }
          stackIn_3_0 = bi.field_c;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("Virogrid.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_89_0 = 0;
        il stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        il stackIn_124_0 = null;
        boolean stackIn_125_1 = false;
        il stackIn_130_0 = null;
        boolean stackIn_131_1 = false;
        il stackIn_136_0 = null;
        boolean stackIn_137_1 = false;
        il stackIn_143_0 = null;
        boolean stackIn_144_1 = false;
        il stackIn_148_0 = null;
        boolean stackIn_149_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        double[] var11_ref_double__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        fl var16_ref = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        double[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11Lifetime2;
        int var7Lifetime2Lifetime1;
        int var7Lifetime2Lifetime2;
        int var7Lifetime3Lifetime1;
        var16 = null;
        var17 = field_F ? 1 : 0;
        try {
          var2_int = param0 ? 1 : 0;
          if (i.field_y == hm.field_c &&
            pg.field_g == nf.field_g) {
            if (i.field_y != -2) {
              lm.a(i.field_y, -1, true, nf.field_g, 0);
            } else {
              ej.a(false, 25680);
              var2_int = 0;
            }
          } else {
            if (i.field_y != -2) {
              if (hm.field_c != -2) {
                if (we.field_l >= 16) {
                  lm.a(hm.field_c, 1 + (-we.field_l + 32), false, pg.field_g, 0);
                } else {
                  lm.a(i.field_y, we.field_l + 1, false, nf.field_g, 0);
                }
              } else {
                if (we.field_l >= 16) {
                  var2_int = 0;
                  ej.a(false, 25680);
                } else {
                  lm.a(i.field_y, -1, false, nf.field_g, 0);
                }
              }
            } else {
              if (we.field_l >= 16) {
                lm.a(hm.field_c, -1, false, pg.field_g, 0);
              } else {
                var2_int = 0;
                ej.a(false, 25680);
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2_int != 0) {
            df.b(0, 0, 640, 480, 3158064);
            this.e((byte) -62);
            pc.a(mk.field_bb, (byte) -86);
            si.a(nk.field_K, new double[]{-110.0, 26.0, -410.0}, new double[]{-1.0, 0.0, 0.0}, 64.0, 114.0, mk.field_bb, 2621440, 10420224, 10485760, 26148864, ke.field_p.field_k);
            lk.field_Qb.a(pe.field_j, bi.field_c);
            var23 = new int[12];
            var18 = var23;
            var3 = var18;
            for (var4 = 0; var4 < 3; var4++) {
              var3[var4] = pe.field_j[var4] << 3;
            }
            for (var4Lifetime1 = 3; var4Lifetime1 < var23.length; var4Lifetime1++) {
              var3[var4Lifetime1] = pe.field_j[var4Lifetime1];
            }
            stackIn_36_0 = (!(vm.field_d[2] > 0.0)) ? 0 : 1;
            var4Lifetime2 = stackIn_36_0;
            stackIn_40_0 = (!(0.0 < vm.field_d[0])) ? 0 : 1;
            var5 = stackIn_40_0;
            if (!(72.0 < vm.field_d[0])) {
              stackIn_46_0 = (vm.field_d[0] < -72.0) ? 1 : 0;
            } else {
              stackIn_46_0 = 1;
            }
            var6 = stackIn_46_0;
            if (we.field_c.field_F != this.field_E ||
              da.field_k[0] != vm.field_d[0] ||
              vm.field_d[1] != da.field_k[1] ||
              vm.field_d[2] != da.field_k[2]) {
              this.field_E = we.field_c.field_F;
              da.field_k[1] = vm.field_d[1];
              da.field_k[2] = vm.field_d[2];
              da.field_k[0] = vm.field_d[0];
              qc.a(118);
              vb.field_l.b();
              df.b(0, 0, 640, 480, 0);
              kg.field_c.a(pe.field_j, bi.field_c);
              nb.field_x.a(pe.field_j, bi.field_c);
              kf.field_c.a(pe.field_j, bi.field_c);
              cm.field_k.a(pe.field_j, bi.field_c);
              ba.field_c.a(pe.field_j, bi.field_c);
              wf.field_j.a(pe.field_j, bi.field_c);
              fl.field_s.a(pe.field_j, bi.field_c);
              if (var4Lifetime2 == 0) {
                th.field_y.a(var23, this.field_J);
                pj.field_a.a(var23, this.field_H);
                if (var5 == 0) {
                  if (var6 == 0) {
                    qg.field_h.a(var23, this.field_M);
                  }
                  jg.field_i.a(var23, this.field_G);
                } else {
                  if (var6 == 0) {
                    jg.field_i.a(var23, this.field_G);
                  }
                  qg.field_h.a(var23, this.field_M);
                }
              } else {
                ee.field_a.a(var23, this.field_K);
                og.field_l.a(var23, this.field_J);
                if (var5 == 0) {
                  if (var6 == 0) {
                    ab.field_L.a(var23, this.field_D);
                  }
                  rc.field_o.a(var23, this.field_B);
                } else {
                  if (var6 == 0) {
                    rc.field_o.a(var23, this.field_B);
                  }
                  ab.field_L.a(var23, this.field_D);
                }
              }
              if (var4Lifetime2 == 0) {
                td.field_i.a(var23, this.field_L);
              } else {
                hn.field_x.a(var23, this.field_N);
              }
              ul.b((byte) 116);
            }
            vb.field_l.d(0, 0);
            var7 = id.field_r % 64;
            if (32 > var7) {
              stackIn_80_0 = -16 + var7;
            } else {
              stackIn_80_0 = -var7 + 48;
            }
            var7Lifetime1 = stackIn_80_0;
            var7Lifetime1 = var7Lifetime1 << 2;
            if (ke.field_p.field_d) {
              var7Lifetime1 = 0;
            }
            var26 = new int[3];
            var21 = var26;
            var8 = var21;
            var24 = new int[3];
            var19 = var24;
            var9 = var19;
            var25 = new int[3];
            var20 = var25;
            var10 = var20;
            var8[0] = (int)ao.field_Hb << 4;
            var24[0] = 800;
            var8[1] = -(int)ao.field_Hb << 4;
            var25[0] = var7Lifetime1;
            var24[1] = 800;
            var26[2] = 0;
            var25[1] = var7Lifetime1;
            var24[2] = 1280;
            var25[2] = 0;
            si.a(pe.field_j, var26, var24, var25);
            if (ke.field_p.field_m) {
              var11 = id.field_r % 128;
              if (var11 < 64) {
                stackIn_89_0 = var11;
              } else {
                stackIn_89_0 = -var11 + 128;
              }
              var11Lifetime2 = stackIn_89_0;
              var12 = 38784 + var11Lifetime2 * 2;
              qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
              var7Lifetime2 = var26[0];
              var8[0] = var26[1];
              var26[1] = var7Lifetime2;
              var7Lifetime2Lifetime1 = var24[0];
              var9[0] = var24[1];
              var24[1] = var7Lifetime2Lifetime1;
              var7Lifetime2Lifetime2 = var25[0];
              var10[0] = var25[1];
              var25[1] = var7Lifetime2Lifetime2;
              qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
            }
            if (!ke.field_p.field_d) {
              System.out.println("Warning, drawing non-single plane");
            } else {
              if (0.0 > nk.field_K[11]) {
                var27 = new double[ad.field_g.length];
                var22 = var27;
                var11_ref_double__ = var22;
                for (var12Lifetime1 = 0; var12Lifetime1 < var27.length; var12Lifetime1++) {
                  var11_ref_double__[var12Lifetime1] = -ad.field_g[var12Lifetime1];
                }
                si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, var11_ref_double__, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
              } else {
                si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
              }
              if (ke.field_p.field_f > 0) {
                si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, pj.field_d, 40, ke.field_p.field_f);
              }
            }
            var16_ref = (fl) (sh.field_tb.a((byte) -61));
            while (var16_ref != null) {
              var11Lifetime1 = -(pe.field_j[0] << 6) + (var16_ref.field_n >> 8);
              var7Lifetime3 = -(pe.field_j[2] << 6) + (var16_ref.field_m >> 8);
              var12Lifetime2 = -(pe.field_j[1] << 6) + (var16_ref.field_p >> 8);
              var13 = pe.field_j[5] * var7Lifetime3 + var12Lifetime2 * pe.field_j[4] + var11Lifetime1 * pe.field_j[3];
              var15 = var7Lifetime3 * pe.field_j[11] + (var12Lifetime2 * pe.field_j[10] + var11Lifetime1 * pe.field_j[9]);
              var14 = var7Lifetime3 * pe.field_j[8] + var12Lifetime2 * pe.field_j[7] + pe.field_j[6] * var11Lifetime1;
              var7Lifetime3Lifetime1 = var15 >> 22;
              if (var15 > 0) {
                df.a((j.field_b << 4) + (var13 >> 9) / var7Lifetime3Lifetime1, (var14 >> 9) / var7Lifetime3Lifetime1 + (tm.field_g << 4), 16384 / var7Lifetime3Lifetime1, var16_ref.field_o * 5 / 3, pj.field_d);
              }
              var16_ref = (fl) (sh.field_tb.a(16213));
            }
            if (var4Lifetime2 == 0) {
              stackIn_113_0 = ee.field_a;
              stackIn_114_1 = !(param0);
              sj.a(stackIn_113_0, stackIn_114_1, var23, this.field_K);
              sj.a(og.field_l, false, var23, this.field_C);
              if (var5 == 0) {
                sj.a(rc.field_o, false, var23, this.field_B);
                if (var6 != 0) {
                  sj.a(qg.field_h, false, var23, this.field_M);
                }
                sj.a(ab.field_L, false, var23, this.field_D);
              } else {
                sj.a(ab.field_L, false, var23, this.field_D);
                if (var6 != 0) {
                  sj.a(jg.field_i, false, var23, this.field_G);
                }
                sj.a(rc.field_o, false, var23, this.field_B);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_124_0 = th.field_y;
              stackIn_125_1 = !(param0);
              sj.a(stackIn_124_0, stackIn_125_1, var23, this.field_J);
              sj.a(pj.field_a, false, var23, this.field_H);
              if (var5 == 0) {
                sj.a(jg.field_i, false, var23, this.field_G);
                if (var6 != 0) {
                  stackIn_130_0 = ab.field_L;
                  stackIn_131_1 = !(param0);
                  sj.a(stackIn_130_0, stackIn_131_1, var23, this.field_D);
                }
                sj.a(qg.field_h, false, var23, this.field_M);
              } else {
                stackIn_136_0 = qg.field_h;
                stackIn_137_1 = !(param0);
                sj.a(stackIn_136_0, stackIn_137_1, var23, this.field_M);
                if (var6 != 0) {
                  stackIn_143_0 = rc.field_o;
                  stackIn_144_1 = !(param0);
                  sj.a(stackIn_143_0, stackIn_144_1, var23, this.field_B);
                }
                stackIn_148_0 = jg.field_i;
                stackIn_149_1 = !(param0);
                sj.a(stackIn_148_0, stackIn_149_1, var23, this.field_G);
              }
            }
          }
          if (i.field_y == 10 &&
            hm.field_c == 10) {
            ij.a((byte) 105);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.UA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_106_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        var7 = field_F ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          if (tg.field_x == 0) {
            boolean decompiledFrameRemainder0 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (i.field_y == hm.field_c &&
                pg.field_g == nf.field_g) {
                if (i.field_y != -1) {
                  if (i.field_y == -2) {
                    var3_int = 1;
                  } else {
                    if (!(!mf.a(107, i.field_y))) {
                      al.field_j[i.field_y].a((byte) -79);
                    }
                  }
                } else {
                  if (aj.field_a) {
                    var3_int = 1;
                    var4 = 1;
                  } else {
                    vg.field_I.a(-104, true);
                    while (nd.b((byte) -107)) {
                      vg.field_I.d(117);
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                we.field_l = we.field_l + 1;
                if (we.field_l == 32) {
                  wm.c((byte) -86);
                }
              }
            }
            if (aj.field_a &&
              !qe.field_k &&
              !eh.field_e) {
              bc.a(var3_int != 0, (byte) -120);
              if (on.field_d) {
                ei.field_b.a(-103, var4 != 0);
              }
              if (dd.field_a) {
                vg.field_I.a(-111, var4 != 0);
              }
              while (nd.b((byte) -111)) {
                if (bl.field_B) {
                  ln.a(15, (byte) 104, 12, 13);
                }
                if (on.field_d) {
                  ei.field_b.d(-114);
                }
                if (!dd.field_a) {
                  continue;
                }
                vg.field_I.d(-20);
              }
            }
            if (!aj.field_a) {
              mf.e(1);
            }
            var5 = we.field_c.field_F;
            if (bl.field_B &&
              aj.field_a) {
              stackIn_91_0 = dh.field_r;
            } else {
              stackIn_91_0 = 481;
            }
            var6 = stackIn_91_0;
            tn.field_g = tn.field_g + (-tn.field_g + (float)var6) * 0.10000000149011612f;
            if ((int)((double)tn.field_g + 0.5) != var5) {
              sl.a(-118, (int)tn.field_g);
              jm.a(320, ((int)(tn.field_g * 4.0f) + 240) / 9, -2);
            }
            if (null != this.field_I.a((byte) -102)) {
              fieldTemp$0 = this.field_A + 1;
              this.field_A = this.field_A + 1;
              if (fieldTemp$0 == 335) {
                this.field_A = 0;
                this.field_I.d(-29889);
              }
            }
            if (!param1) {
              li.a(param0);
            }
          } else {
            if (tg.field_x == 1) {
              wa.field_K = wa.field_K + 1;
              if (wa.field_K == 16) {
                if (!a.field_D) {
                  dn.a(8192);
                } else {
                  ka.a(0);
                }
                tg.field_x = 2;
              }
            } else {
              if (2 != tg.field_x) {
                wa.field_K = wa.field_K - 1;
                if (wa.field_K == 0) {
                  tg.field_x = 0;
                }
              } else {
                if (!qm.i(20)) {
                  hm.field_c = pm.field_k;
                  wn.c(param0);
                  if (a.field_D) {
                    a.field_D = false;
                    ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_G + hd.field_b.field_A, 8, -16824, false, 240);
                  }
                  if (bj.field_n) {
                    var3_int = bd.field_e;
                    if (0 == hm.field_c ||
                      i.field_y == 2 ||
                      i.field_y == 3 ||
                      4 == hm.field_c ||
                      hm.field_c == 5) {
                      var3_int = hm.field_c;
                    }
                    gb.a(-2, var3_int, false, -4);
                  }
                  if (mf.a(86, hm.field_c)) {
                    wm.c((byte) -86);
                  }
                }
                tg.field_x = 3;
              }
            }
          }
          if (-3 == hm.field_c) {
            var8 = new String[]{mb.field_eb, em.field_e};
            vg.field_I = new ic(false, eg.field_y, var8, 0, false, ll.field_b, ce.field_I);
            lj.b(101);
            stackIn_106_0 = (!pn.field_x) ? 0 : 1;
            var4Lifetime1 = stackIn_106_0;
            gb.a(-2, 0, var4Lifetime1 != 0, -1);
            vm.field_e = true;
          }
          if (hm.field_c == -4) {
            gk.field_g.g(9, 8);
            qe.field_k = true;
            hm.field_c = i.field_y;
          }
          if (-5 == hm.field_c) {
            nn.a(wl.field_d.e((byte) -124), 11, (byte) -120);
            eh.field_e = true;
            hm.field_c = i.field_y;
          }
          oj.e((byte) -75);
          if (db.b((byte) 13, 0)) {
            if (vg.field_I != null &&
              vg.field_I.field_g &&
              vg.field_I.field_t &&
              vg.field_I.field_C.field_u > sh.a(4712, 40000) &&
              !vg.field_I.field_l) {
              vg.field_I.field_l = true;
              hj.field_h = id.field_c;
              ca.field_G = c.field_a;
            }
            if (hj.field_h <= 0) {
              var3_intLifetime1 = 1 + c.field_a;
              if (ca.field_G < var3_intLifetime1) {
                ca.field_G = 0;
              } else {
                bm.d(var3_intLifetime1, 0);
              }
            } else {
              hj.field_h = hj.field_h - 1;
              var3_intLifetime1 = c.field_a - 4;
              if (var3_intLifetime1 < 0) {
                var3_intLifetime1 = 0;
              }
              bm.d(var3_intLifetime1, 0);
              if (0 == sh.a(4712, 20)) {
                ed.a(sh.a(4712, 256), dj.field_f[sh.a(4712, 3)], -629134904, 96);
              }
            }
          } else {
            if (sh.a(4712, 1000) == 0) {
              gi.a(dj.field_f[sh.a(4712, 3)], 100, 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "Virogrid.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final mg b(int param0, int param1, int param2) {
        int var5 = 0;
        mg var4 = null;
        int var6 = 0;
        mg stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = field_F ? 1 : 0;
        try {
          var4 = new mg(57, 57);
          pj.a(var4, 256);
          df.c(29, 29, 27, 263172);
          for (var5 = 23; var5 >= 0; var5--) {
            df.c(29, 29, var5, param2 + var5 * param0);
          }
          ul.b((byte) 93);
          if (param1 != -9105) {
            this.e(true);
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4_ref), "Virogrid.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(eh param0, byte param1) {
        RuntimeException runtimeException = null;
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new mg(param0.a("final_frame.jpg", 100, ""), (java.awt.Component) ((Object) fi.field_v));
          var3 = var2.field_w;
          var4 = var2.field_p;
          lm.a(0);
          var5 = 120 / ((33 - param1) / 33);
          nd.field_d = new mg(var3, 3 * var4 / 4);
          nd.field_d.b();
          var2.b(0, 0);
          dn.field_c = new mg(var3, -nd.field_d.field_p + var4);
          dn.field_c.b();
          var2.b(0, -nd.field_d.field_p);
          dn.field_c.field_x = nd.field_d.field_p;
          ai.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("Virogrid.CB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void t(int param0) {
        try {
          if (null != uh.field_e) {
            a.a(20, uh.field_e);
            uh.field_e = null;
            sb.a(-52);
          }
          md.field_h = p.a(83, 3);
          oj.field_Fb = p.a(117, 5);
          g.field_a = p.a(98, 6);
          pj.field_c = p.a(89, 7);
          sf.field_O = p.a(param0 ^ 35, 8);
          el.field_d = p.a(64, 9);
          wm.field_w = p.a(97, 10);
          wn.field_i = p.a(33, 11);
          gn.field_G = p.a(param0 ^ 51, 12);
          ng.field_T = p.a(81, param0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.AB(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -80) {
            this.field_L = (int[]) null;
          }
          al.i(100);
          if (null != ih.field_b) {
            am.a((byte) -16);
          }
          ce.f(13633);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "Virogrid.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int var3 = field_F ? 1 : 0;
        try {
          Virogrid.u(240);
          hj.a(17);
          l.b(-6325);
          p.c(param0 - 32);
          ud.a((byte) -94);
          fj.a((byte) -99);
          rh.b(param0 ^ 57);
          bn.a((byte) -118);
          rk.a(-97);
          ld.a((byte) -110);
          cg.a(-65);
          nf.a(-28637);
          wd.a(param0 ^ -8518);
          em.a(-85);
          od.d(false);
          rg.a(param0 ^ 64);
          uk.b(param0 - 6490);
          og.b(param0 + 74);
          me.a(param0 + 0);
          cb.b(3981);
          df.a();
          eh.a((byte) -104);
          e.a();
          ak.a(4472);
          jc.b((byte) 110);
          hc.a(true);
          se.a((byte) 79);
          rb.a((byte) -13);
          vm.a((byte) -106);
          oh.a(true);
          td.a(6666);
          kb.a(122);
          pc.a(-30114);
          ih.a(81);
          cj.a(-99);
          nm.a(26523);
          hm.b(param0 ^ -126);
          wf.a(param0 ^ -28608);
          qc.a((byte) 9);
          h.a(true);
          li.b((byte) 112);
          jg.a(28275);
          dk.a(-124);
          sb.b(-851125662);
          ha.a(param0 + 79);
          nh.a(false);
          el.d(-127);
          oi.c(122);
          ic.b(23320);
          pi.a(param0 ^ -29216);
          il.a();
          qb.b();
          uf.a(98);
          ee.b((byte) 119);
          rl.d(0);
          wb.c(true);
          bd.a(95);
          tn.f(param0 + 31);
          ke.d(-51);
          wg.a(0);
          sd.a((byte) 113);
          ah.a((byte) -115);
          ib.a(-60);
          k.a(1000);
          we.a((byte) -104);
          gi.a((byte) -103);
          en.g(0);
          qm.j(124);
          km.f(param0 + 2147483647);
          ga.i(param0 ^ -91);
          ao.g(-119);
          dj.a(false);
          um.g(0);
          bg.g(param0);
          lk.e((byte) 10);
          an.a((byte) 26);
          pl.a((byte) -120);
          pj.a(false);
          oe.b(param0 + 0);
          hk.d(false);
          jm.a(param0 + 0);
          he.g(7);
          fk.c();
          vl.a(false);
          ll.a((byte) -64);
          pg.b(param0 + 8192);
          s.a(-1);
          i.a((byte) -78);
          ln.a(true);
          wn.d(79);
          qj.b();
          pa.c(true);
          ua.b();
          eg.c(param0 ^ -55);
          ef.a(-3);
          kf.a(-1);
          vj.b((byte) 17);
          ea.a(-74);
          sj.a((byte) 121);
          jd.a(true);
          ba.a(14);
          fh.a(10061);
          vf.a(false);
          je.h(-202);
          b.j((byte) -22);
          vc.g((byte) 108);
          de.g(false);
          sh.g(true);
          qh.f(8246);
          jl.f(15354);
          ca.f((byte) 15);
          uh.a(false);
          id.a((byte) 24);
          o.a((byte) 67);
          ig.a(-77);
          ii.a((byte) 6);
          ac.a(-95);
          qi.a(25651);
          of.a((byte) 110);
          lg.a(param0 ^ -122);
          ne.a(false);
          ul.a((byte) -96);
          bk.a((byte) 122);
          hg.f((byte) 103);
          mm.a(false);
          dd.b((byte) -58);
          m.b(-314);
          ia.a(44);
          ab.e(-16349);
          va.a(-91);
          na.e((byte) 56);
          sk.a((byte) -52);
          qf.c();
          ff.a();
          nn.a(53);
          bf.c(param0 ^ 20391);
          ji.a(-112);
          am.b((byte) 88);
          ei.a(-59);
          lb.b(7);
          lm.a((byte) -94);
          pn.c(true);
          qk.c(2);
          ub.f(-121);
          gl.a(param0 + 3);
          bl.d(false);
          oa.c((byte) -127);
          c.a(false);
          nb.d(-30419);
          rf.a(-24750);
          mk.k(-16);
          aj.a(false);
          gj.c();
          tf.a(0);
          wm.c(0);
          af.a(99);
          mn.a(0);
          lh.b(false);
          sm.a(param0 - 1);
          cf.a(112);
          ag.b(25);
          g.b((byte) -108);
          md.b(46);
          wh.a(param0 - 23862);
          bb.a();
          db.a(6);
          bc.a((byte) -101);
          aa.a(false);
          lj.a(67);
          nl.c(120);
          ql.a((byte) -87);
          rj.a(6);
          ie.b(0);
          fi.c(false);
          tg.a((byte) -78);
          ec.a(param0 - 3298);
          dc.h(-126);
          gg.g(-1);
          fd.e(1);
          ma.d(param0 ^ 0);
          jk.a((byte) 110);
          nj.b();
          tk.a(0);
          kh.a((byte) 81);
          qa.a(8342);
          mc.a(false);
          oj.f((byte) -111);
          wc.a(param0 + 200);
          ad.a(param0 + 90);
          u.b((byte) -11);
          th.e(-5);
          sl.a(param0 + 1);
          rn.a((byte) -38);
          te.a((byte) 126);
          mf.f(-93);
          gd.b((byte) 104);
          ug.a(-97);
          ch.a(0);
          hl.a();
          sg.d(-2);
          fm.a((byte) -54);
          hd.a(3881);
          d.e((byte) -73);
          fe.h(32498);
          ge.a(72);
          rc.a(param0 - 24021);
          qd.a(true);
          ej.f(2);
          vd.l(-1);
          wa.f((byte) 39);
          mb.h((byte) 126);
          dg.a((byte) 41);
          nk.a(35);
          w.a(-116);
          ng.g(false);
          gn.g(true);
          qe.b((byte) -36);
          fn.b((byte) 97);
          ok.f(-100);
          qn.c((byte) -124);
          gb.e(117);
          al.g(-1);
          jb.a((byte) -99);
          gf.a((byte) 124);
          dn.a((byte) 112);
          bm.c(2797);
          tl.b((byte) -71);
          nd.a((byte) 114);
          ce.a((byte) 107);
          vg.f(-114);
          gk.a((byte) -127);
          eb.a(true);
          dm.e(-48);
          lc.a(-26834);
          mj.g(-108);
          ph.d(param0 ^ 121);
          bh.a();
          ed.a((byte) 51);
          j.b(param0 ^ -116);
          f.b((byte) 103);
          jf.a((byte) -124);
          ij.a(-25621);
          pm.a(0);
          fl.a(-24488);
          dh.a(-128);
          pe.a((byte) -79);
          la.a((byte) 108);
          hf.b(param0 ^ -125);
          ti.b(-88);
          cc.b(false);
          a.c(false);
          ae.a((byte) -125);
          kn.h(param0 ^ 0);
          oc.c(false);
          hn.a((byte) -9);
          ai.b(false);
          gh.d(false);
          vb.b((byte) 112);
          ka.c(-85);
          sa.a((byte) -52);
          kg.b((byte) 123);
          dl.a(0);
          bj.a((byte) -62);
          qg.a(114);
          ob.a(param0 + 29137);
          sf.a(100);
          co.a((byte) 103);
          mh.b((byte) 51);
          re.b(-120);
          vi.b(param0 + 31856);
          bi.a(46);
          fb.a((byte) 21);
          ra.a(false);
          tm.a(-74);
          da.a(param0 ^ 8355711);
          cm.c(115);
          fa.d(0);
          jj.a((byte) 74);
          ri.b(2);
          di.h(46);
          sn.c((byte) -89);
          ve.c(true);
          kd.c((byte) -124);
          kk.c((byte) -8);
          ci.h(-104);
          on.a((byte) 120);
          pb.a((byte) 111);
          wl.a((byte) -75);
          mi.e(12);
          hh.a((byte) -124);
          this.field_N = null;
          this.field_C = null;
          this.field_I = null;
          this.field_G = null;
          this.field_D = null;
          this.field_L = null;
          this.field_H = null;
          this.field_B = null;
          this.field_v = null;
          this.field_K = null;
          this.field_J = null;
          this.field_M = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.F(" + param0 + ')');
        }
    }

    private final void a(qb param0, byte param1) {
        int[] discarded$1 = null;
        RuntimeException runtimeException = null;
        qb var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.a(0, 154, 0);
          if (param1 != 69) {
            var4 = (qb) null;
            discarded$1 = this.a((byte) -76, (qb) null);
          }
          param0.a(256, 256, 256, 32);
          param0.a(0, -154, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("Virogrid.TA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public Virogrid() {
        this.field_I = new p();
        this.field_A = 0;
    }

    static {
        field_O = new co("usename");
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ck $cfr$intArgs$b$d65aded092bd(int param0, boolean param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        ck stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        ck stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -32) {
            field_O = (co) null;
          }
          var2 = new ck(true);
          stackIn_4_0 = var2;
          stackIn_5_1 = (param1);
          stackIn_4_0.field_d = stackIn_5_1;
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "Virogrid.DB(" + param0 + ',' + param1 + ')');
        }
    }
}
