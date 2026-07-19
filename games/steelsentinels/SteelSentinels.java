/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends n {
    static String field_H;
    static String field_I;
    static gh field_J;
    public static int field_G;

    final void a(byte param0) {
        boolean discarded$3 = false;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        ai var3 = null;
        gh var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        ee var6_ref_ee = null;
        int var7 = 0;
        int var8 = 0;
        mb var9 = null;
        int var9_int = 0;
        qb var9_ref = null;
        wl var9_ref2 = null;
        mb var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_125_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_124_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        boolean stackOut_127_1 = false;
        var13 = field_G;
        try {
          L0: {
            var2_ref = gl.a(false);
            if (ol.j(0)) {
              df.a(-111, var2_ref, qb.g(2));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (gh.field_pb) {
                if (co.a(false)) {
                  L1: {
                    this.n(53);
                    if (pm.field_T == vb.field_g) {
                      an.a(pm.field_T, pc.field_w, true, -15);
                      break L1;
                    } else {
                      if ((pm.field_T ^ -1) == -1) {
                        an.a(vb.field_g, pc.field_w, false, -62);
                        an.a(pm.field_T, pc.field_w, false, -34);
                        break L1;
                      } else {
                        if ((vb.field_g ^ -1) != -1) {
                          if (-11 < (pm.field_U ^ -1)) {
                            an.a(pm.field_T, pc.field_w, false, -110);
                            break L1;
                          } else {
                            an.a(vb.field_g, ea.field_k, false, 86);
                            break L1;
                          }
                        } else {
                          an.a(pm.field_T, pc.field_w, false, 125);
                          an.a(vb.field_g, pc.field_w, false, -40);
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (!pc.field_w) {
                        break L3;
                      } else {
                        if (ea.field_k) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      da.a(li.c(8), 25104);
                      if ((pm.field_T ^ -1) != 1) {
                        break L4;
                      } else {
                        var3_ref = hl.a((byte) -66);
                        if (var3_ref == null) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              var4 = var3_ref.field_Rb;
                              var5_int = var3_ref.field_cb;
                              pb.a(var4 + 4, 4 + var5_int + 42, var3_ref.field_Rb + -4 + var3_ref.field_zb, var3_ref.field_cb + (-4 + var3_ref.field_Lb));
                              if (null == ih.field_s) {
                                break L6;
                              } else {
                                if (!fc.field_e[101]) {
                                  L7: {
                                    var6_ref_ee = ih.field_s;
                                    var7 = var4 + -2;
                                    if (var6_ref_ee.field_K.b((byte) -128) >= 2) {
                                      break L7;
                                    } else {
                                      L8: {
                                        var9_int = -100000;
                                        var10 = new mb(0, var9_int, var6_ref_ee);
                                        var11 = 0;
                                        if (var6_ref_ee.field_K.e(13058) != null) {
                                          var11 = -((mb) ((Object) var6_ref_ee.field_K.e(13058))).field_jc + 1;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        var12 = ua.field_v;
                                        if (0.5 > Math.random()) {
                                          var12 = ua.field_x;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (0.3 <= Math.random()) {
                                          break L10;
                                        } else {
                                          var12 = ua.field_P;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (0.1 > Math.random()) {
                                          var12 = ua.field_N;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (0.1 > Math.random()) {
                                          var12 = ua.field_O;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var10.a(var12, true, false, -1, var11);
                                      var10.field_Nb = 10;
                                      var10.d(-28033);
                                      var10.field_ab = 1000;
                                      var10.field_Qb = 250;
                                      var10.j(-5);
                                      var6_ref_ee.field_K.a(3, var10);
                                      break L7;
                                    }
                                  }
                                  var8 = 310;
                                  var9 = (mb) ((Object) var6_ref_ee.field_K.e(13058));
                                  L13: while (true) {
                                    if (null == var9) {
                                      var9_ref = (qb) ((Object) var6_ref_ee.field_o.e(13058));
                                      L14: while (true) {
                                        if (null == var9_ref) {
                                          var9_ref2 = (wl) ((Object) var6_ref_ee.field_db.e(13058));
                                          L15: while (true) {
                                            if (null == var9_ref2) {
                                              var9_ref = (qb) ((Object) var6_ref_ee.field_o.e(13058));
                                              L16: while (true) {
                                                if (var9_ref == null) {
                                                  break L5;
                                                } else {
                                                  var9_ref.a(var7, var8, false, (byte) 31);
                                                  var9_ref = (qb) ((Object) var6_ref_ee.field_o.a((byte) -82));
                                                  continue L16;
                                                }
                                              }
                                            } else {
                                              var9_ref2.a(var8, var7, 4);
                                              var9_ref2 = (wl) ((Object) var6_ref_ee.field_db.a((byte) -39));
                                              continue L15;
                                            }
                                          }
                                        } else {
                                          var9_ref.a(var7, var8, true, (byte) -89);
                                          var9_ref = (qb) ((Object) var6_ref_ee.field_o.a((byte) -112));
                                          continue L14;
                                        }
                                      }
                                    } else {
                                      discarded$3 = var9.a((byte) -22, var7, oh.field_f, pi.field_c, var8);
                                      var9 = (mb) ((Object) var6_ref_ee.field_K.a((byte) -119));
                                      continue L13;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                            }
                            di.field_g = -1;
                            ih.field_s = new ee(-1, 1, new String[]{}, new int[][]{null}, false, 0, 0, 2, false, false);
                            ih.field_s.field_Q = 2;
                            break L5;
                          }
                          pb.c();
                          break L4;
                        }
                      }
                    }
                    r.a(false, li.c(8));
                    ci.a(li.c(8), (byte) -62);
                    break L2;
                  }
                  L17: {
                    var3 = (ai) ((Object) bd.field_b.e(13058));
                    if (var3 == null) {
                      break L17;
                    } else {
                      L18: {
                        var4 = 6;
                        var5_int = 250;
                        var6 = var4 * 2 + 64;
                        var7 = 0;
                        if ((ob.field_o ^ -1) > (var6 ^ -1)) {
                          var7 = var7 + (ob.field_o + -var6);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        var8 = -var5_int + 640;
                        if ((500 - var6 ^ -1) > (ob.field_o ^ -1)) {
                          var7 = var7 + (500 + (-ob.field_o - var6));
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      pb.c(var8, var7, var5_int, var6, 0, 192);
                      pb.h(var8, var7, var5_int, var6, 39398, 192);
                      if (var3.field_q != null) {
                        var3.field_q.c(var8 - -var4, var7 - -var4, 64, 64);
                        discarded$4 = ff.field_lb.a(var3.field_u, var4 * 2 + var8 + 64, var7 - -var4, -64 + (var5_int - var4 * 3), var6 - var4 * 2, 52479, -1, 0, 1, 12);
                        break L17;
                      } else {
                        discarded$5 = ff.field_lb.a(var3.field_u, var8 - -var4, var7 + var4, -(2 * var4) + var5_int, -(2 * var4) + var6, 52479, -1, 0, 1, 12);
                        break L17;
                      }
                    }
                  }
                  L20: {
                    var4 = 27 / ((param0 - 56) / 48);
                    if (!mg.b(true)) {
                      if (cf.c((byte) 92)) {
                        L21: {
                          stackOut_124_0 = -64;
                          stackIn_129_0 = stackOut_124_0;
                          stackIn_125_0 = stackOut_124_0;
                          if (wb.field_c != null) {
                            stackOut_129_0 = stackIn_129_0;
                            stackOut_129_1 = 1;
                            stackIn_130_0 = stackOut_129_0;
                            stackIn_130_1 = stackOut_129_1;
                            break L21;
                          } else {
                            stackOut_125_0 = stackIn_125_0;
                            stackIn_127_0 = stackOut_125_0;
                            stackOut_127_0 = stackIn_127_0;
                            stackOut_127_1 = kc.field_q;
                            stackIn_130_0 = stackOut_127_0;
                            stackIn_130_1 = stackOut_127_1 ? 1 : 0;
                            break L21;
                          }
                        }
                        qa.a((byte) stackIn_130_0, stackIn_130_1 != 0);
                        break L20;
                      } else {
                        if (!ri.b(-113)) {
                          break L20;
                        } else {
                          if (!mg.b(true)) {
                            pb.f(0, 0, pb.field_c, pb.field_j);
                            ec.a((byte) -95);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    } else {
                      pb.f(0, 0, pb.field_c, pb.field_j);
                      qf.a(100);
                      break L20;
                    }
                  }
                  L22: {
                    if (in.field_i != in.field_h) {
                      var5_int = 256 * ji.field_a / 16;
                      if ((var5_int ^ -1) >= -1) {
                        break L22;
                      } else {
                        pb.c(0, 0, pb.field_c, pb.field_j, 0, var5_int);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (cb.field_l < ej.field_v) {
                      pb.h(2, 2, 102, 15, 6710886, 128);
                      pb.a(3, 3, 100, 13, 0);
                      pb.a(4, 4, cb.field_l * 33 + 33 * al.field_g / ua.field_r, 11, 39398);
                      if (fk.field_d == null) {
                        break L23;
                      } else {
                        var5 = db.a(ff.field_sb, -98, new String[]{Integer.toString(cb.field_l * 33 + al.field_g * 33 / ua.field_r)});
                        fk.field_d.a(var5, 54, 12, 39398, 0);
                        pb.a(3, 3, 33 * cb.field_l + al.field_g * 33 / ua.field_r, 17);
                        fk.field_d.a(var5, 54, 12, 0, 39398);
                        pb.c();
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  kg.a(0, 0, 28594, var2_ref);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  mc.a(qj.field_i, 100.0f, -21801);
                  en.a(var2_ref, -28003);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                en.a(var2_ref, -28003);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.EA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean k(byte param0) {
        wk[] discarded$11 = null;
        wk discarded$12 = null;
        wk[] discarded$13 = null;
        wk discarded$14 = null;
        wk[] discarded$15 = null;
        boolean discarded$16 = false;
        boolean discarded$17 = false;
        boolean discarded$18 = false;
        boolean discarded$19 = false;
        boolean discarded$20 = false;
        boolean discarded$21 = false;
        RuntimeException var2 = null;
        gk[] var2_array = null;
        int var2_int = 0;
        gk[] var3 = null;
        int var3_int = 0;
        wk[] var3_array = null;
        wk[][] var3_array2 = null;
        int var4_int = 0;
        wk[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_177_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_160_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        var6 = field_G;
        try {
          L0: {
            ec.a(35);
            if (null == aj.field_x) {
              if (ti.field_t == null) {
                if (g.field_i == null) {
                  if (oh.field_a != null) {
                    L1: {
                      L2: {
                        mc.a(jl.field_i, 90.0f, param0 + -21749);
                        this.a((byte) 109);
                        var2_array = cj.a(-126, "basic", kd.field_x, "ranks");
                        va.field_j = vd.a(ej.field_t, "roman20", tm.field_d, param0 + 51, "");
                        dm.field_f = be.a(kd.field_x, oh.field_a, (byte) -102, "biting30", "basic");
                        dk.field_h = vd.a(oh.field_a, "basic", kd.field_x, param0 ^ 51, "smallfont");
                        fk.field_d = vd.a(oh.field_a, "basic", kd.field_x, -1, "tinyfont");
                        ff.field_lb = vd.a(ej.field_t, "basicfont12", tm.field_d, param0 + 51, "");
                        pl.field_U = be.a(kd.field_x, oh.field_a, (byte) -93, "bitingfont", "basic");
                        ui.field_U = be.a(kd.field_x, oh.field_a, (byte) -84, "bitinghalf", "basic");
                        ql.field_Tb = dd.a(kd.field_x, oh.field_a, true, "basic", "menutitlefont");
                        discarded$11 = cf.a("menu_overlays", "basic", (byte) -87, kd.field_x);
                        wd.field_a = nb.a(kd.field_x, (byte) 42, "frame", "basic");
                        km.field_e = nb.a(kd.field_x, (byte) -119, "frame_filled", "basic");
                        ag.field_o = nb.a(kd.field_x, (byte) -60, "button_frame", "basic");
                        vk.field_l = nb.a(kd.field_x, (byte) -122, "button_raised", "basic");
                        ja.field_e = nb.a(kd.field_x, (byte) 36, "button_depressed", "basic");
                        if (ni.b(param0 ^ -44)) {
                          break L2;
                        } else {
                          if ((rd.field_b ^ -1) < -1) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = cj.a(121, "basic", kd.field_x, "expansion");
                      eh.field_c = new ng((java.applet.Applet) (this), dm.field_e, var3, ji.field_f);
                      break L1;
                    }
                    od.field_c = cf.a("achievements_large", "basic", (byte) -79, kd.field_x);
                    vg.field_h = cf.a("cursors", "basic", (byte) -54, kd.field_x);
                    var3_int = 0;
                    L3: while (true) {
                      if ((var3_int ^ -1) <= (vg.field_h.length ^ -1)) {
                        ff.field_tb = rl.a(tm.field_d, "basic", "unachieved", false);
                        ug.field_P = rl.a(tm.field_d, "basic", "locked", false);
                        d.field_G = rl.a(tm.field_d, "basic", "orbcoin", false);
                        g.field_d = new wk(40, 40);
                        g.field_d.d();
                        ff.field_tb.c(0, 0, 40, 40);
                        sj.field_F = new wk(40, 40);
                        sj.field_F.d();
                        ug.field_P.c(0, 0, 40, 40);
                        sb.field_bb.b((byte) 126);
                        rg.a(false, ff.field_tb);
                        rg.a(false, ug.field_P);
                        rg.a(false, d.field_G);
                        ig.field_o = new wk[5][];
                        wa.a((cm) null, 2, kd.field_x);
                        ea.field_m = cf.a("darkblueboxfilled", "basic", (byte) -52, kd.field_x);
                        be.field_f = cf.a("obviousdarkbluebox", "basic", (byte) -56, kd.field_x);
                        tk.field_t = cf.a("darkbluebox", "basic", (byte) -54, kd.field_x);
                        sa.field_e = cf.a("darkerbluebox", "basic", (byte) -30, kd.field_x);
                        nn.field_a = cf.a("lightbluetabbox", "basic", (byte) -108, kd.field_x);
                        lj.field_b = cf.a("darkgrayboxfilled", "basic", (byte) -114, kd.field_x);
                        co.field_d = cf.a("darkgraybox", "basic", (byte) -67, kd.field_x);
                        pa.field_g = cf.a("sectiontab", "basic", (byte) -99, kd.field_x);
                        bm.field_Y = cf.a("tabselected", "basic", (byte) -40, kd.field_x);
                        sb.field_X = cf.a("tabunselected", "basic", (byte) -67, kd.field_x);
                        oe.field_f = cf.a("tabmouseover", "basic", (byte) -71, kd.field_x);
                        si.field_E = cf.a("sentinelimages", "basic", (byte) -111, kd.field_x);
                        tk.field_t[4] = null;
                        be.field_f[4] = null;
                        pd.field_T = cf.a("greybox", "basic", (byte) -90, kd.field_x);
                        pd.field_T[4] = null;
                        ao.field_y = rl.a(kd.field_x, "basic", "dropdown_mark", false);
                        ac.field_bb = rl.a(kd.field_x, "basic", "button_cover", false);
                        var3_int = 0;
                        L4: while (true) {
                          if ((ac.field_bb.field_E.length ^ -1) >= (var3_int ^ -1)) {
                            oa.field_N = rl.a(kd.field_x, "basic", "goldstar", false);
                            td.field_ec = rl.a(kd.field_x, "basic", "silverstar", false);
                            discarded$12 = rl.a(kd.field_x, "basic", "starfrigate", false);
                            sb.field_W = rl.a(kd.field_x, "basic", "starcruiser", false);
                            hb.field_e = sb.field_W.a();
                            jc.field_c = cj.a(27, "basic", kd.field_x, "texticons");
                            bb.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
                            dk.field_h.a(jc.field_c, bb.field_X);
                            fk.field_d.a(jc.field_c, bb.field_X);
                            pl.field_U.a(jc.field_c, bb.field_X);
                            ff.field_lb.a(jc.field_c, bb.field_X);
                            var3 = cj.a(param0 ^ -5, "basic", kd.field_x, "instr_texticons");
                            ub.field_a = new gk[18];
                            pg.field_w = new int[ub.field_a.length];
                            var4_int = 0;
                            L5: while (true) {
                              if ((var4_int ^ -1) <= (ub.field_a.length ^ -1)) {
                                ii.a(var3, 0, ub.field_a, 6, 2);
                                ub.field_a[17] = ub.field_a[7];
                                ah.field_Zb = cf.a("scrolldown", "basic", (byte) -87, kd.field_x);
                                sj.field_x = cf.a("scrollup", "basic", (byte) -33, kd.field_x);
                                jn.field_f = cf.a("scrollbar", "basic", (byte) -95, kd.field_x);
                                qi.field_a = cf.a("scrollvert", "basic", (byte) -104, kd.field_x);
                                wc.field_k = cf.a("frame_shiny", "basic", (byte) -123, kd.field_x);
                                ta.field_c = cf.a("frame_shiny_bright", "basic", (byte) -43, kd.field_x);
                                cm.field_b = cf.a("frame_basic_bright", "basic", (byte) -128, kd.field_x);
                                ng.field_p = cf.a("frame_basic_thin", "basic", (byte) -55, kd.field_x);
                                vh.field_b = cf.a("frame_basic", "basic", (byte) -127, kd.field_x);
                                oa.field_U = cf.a("display_frame", "basic", (byte) -35, kd.field_x);
                                oa.field_U[4] = null;
                                bl.field_d = cf.a("config_tut_frame", "basic", (byte) -32, kd.field_x);
                                bl.field_d[4] = null;
                                oa.field_Q = cf.a("popup_frame", "basic", (byte) -94, kd.field_x);
                                oa.field_Q[4] = null;
                                si.field_l = cj.a(125, "basic", kd.field_x, "mechbits");
                                hb.field_j = cf.a("weaponclasses", "basic", (byte) -107, kd.field_x);
                                ja.field_d = cj.a(-123, "basic", kd.field_x, "batdrone");
                                lb.field_Zb = cj.a(param0 ^ 69, "basic", kd.field_x, "drones");
                                jd.field_qb = cj.a(param0 + 163, "basic", kd.field_x, "bits_golem");
                                mb.field_nc = cj.a(42, "basic", kd.field_x, "bits_bird");
                                li.field_z = cj.a(-115, "basic", kd.field_x, "bits_slave");
                                wi.field_C = cj.a(125, "basic", kd.field_x, "bits_babel");
                                ne.field_R = cj.a(-128, "basic", kd.field_x, "bits_valhalla");
                                hk.field_Ec = cj.a(-128, "basic", kd.field_x, "bits_orbital");
                                ui.field_V = cj.a(61, "basic", kd.field_x, "bits_bertha");
                                vc.field_b = cj.a(67, "basic", kd.field_x, "bits_smasher");
                                ng.field_c = cj.a(76, "basic", kd.field_x, "bits_scorpion");
                                qb.field_L = cj.a(-116, "basic", kd.field_x, "bits_hurricane");
                                cf.field_u = cj.a(param0 + -65, "basic", kd.field_x, "bits_commando");
                                ea.field_b = cj.a(param0 ^ -112, "basic", kd.field_x, "bits_turtle");
                                ml.field_c = cj.a(param0 + 19, "basic", kd.field_x, "droppod");
                                fa.field_a = cj.a(param0 ^ -128, "basic", kd.field_x, "infantary");
                                ie.field_d = cj.a(-123, "basic", kd.field_x, "modules");
                                var3_array = rh.field_v;
                                var3_array[0] = rl.a(kd.field_x, "basic", "instr_giantrobot", false);
                                var3_array[1] = rl.a(kd.field_x, "basic", "instr_queue", false);
                                var3_array[2] = rl.a(kd.field_x, "Basic", "instr_walk", false);
                                var3_array[3] = rl.a(kd.field_x, "basic", "instr_jump", false);
                                var3_array[4] = rl.a(kd.field_x, "basic", "instr_thrust", false);
                                var3_array[5] = ie.field_d[16].a();
                                var3_array[6] = rl.a(kd.field_x, "basic", "instr_selweapon", false);
                                var3_array[7] = rl.a(kd.field_x, "basic", "instr_target", false);
                                var3_array[8] = rl.a(kd.field_x, "basic", "instr_noenergy", false);
                                var3_array[9] = ie.field_d[32].a();
                                var3_array[10] = ie.field_d[33].a();
                                var3_array[11] = rl.a(kd.field_x, "basic", "instr_bigshieldicon", false);
                                var3_array[12] = ie.field_d[27].a();
                                var3_array[13] = rl.a(kd.field_x, "basic", "instr_stats", false);
                                var3_array[14] = rl.a(kd.field_x, "basic", "instr_chassis", false);
                                var3_array[15] = rl.a(kd.field_x, "basic", "instr_components", false);
                                var3_array[16] = rl.a(kd.field_x, "basic", "instr_weapons", false);
                                var3_array[17] = rl.a(kd.field_x, "basic", "instr_modules", false);
                                var3_array[18] = rl.a(kd.field_x, "basic", "instr_engineer", false);
                                var3_array[19] = rl.a(kd.field_x, "basic", "instr_coop", false);
                                var3_array[20] = rl.a(kd.field_x, "basic", "instr_team", false);
                                var3_array[25] = rl.a(kd.field_x, "basic", "instr_techvalue", false);
                                fa.field_b = rl.a(kd.field_x, "basic", "logo_menu_chromakey", false);
                                ob.field_z = (ek) ((Object) dn.a("basic", -63, "main_lower_panel", kd.field_x));
                                ma.field_eb = (ek) ((Object) dn.a("basic", param0 ^ 75, "main_title_panel", kd.field_x));
                                fi.field_j = rl.a(kd.field_x, "basic", "menu_mesh", false);
                                ic.field_db = rl.a(kd.field_x, "basic", "menu_titlebar", false);
                                pl.field_T = nb.a(kd.field_x, (byte) -62, "menu_button_1", "basic");
                                discarded$13 = nb.a(kd.field_x, (byte) 107, "empty_button", "basic");
                                el.field_Ub = rl.a(kd.field_x, "basic", "prevbtn", false);
                                gm.field_b = rl.a(kd.field_x, "basic", "nextbtn", false);
                                pf.field_b = rl.a(kd.field_x, "basic", "lobby_icon", false);
                                vc.field_e = cf.a("statbars", "basic", (byte) -13, kd.field_x);
                                pd.field_Z = cf.a("tags", "basic", (byte) -50, kd.field_x);
                                uh.field_k = rl.a(kd.field_x, "basic", "tagborder", false);
                                qg.field_f = cf.a("movekeys", "basic", (byte) -38, kd.field_x);
                                bc.field_wb = rl.a(kd.field_x, "basic", "shiftkey", false);
                                da.field_e = cf.a("config_tabs", "basic", (byte) -33, kd.field_x);
                                aj.field_r[0] = rl.a(kd.field_x, "basic", "research_ring", false);
                                b.field_q[0] = rl.a(kd.field_x, "basic", "research_icon", false);
                                bl.field_p = cj.a(param0 + -75, "basic", kd.field_x, "powerups");
                                gf.field_c = cf.a("headings_bar", "basic", (byte) -26, kd.field_x);
                                discarded$14 = rl.a(kd.field_x, "basic", "solarite", false);
                                vk.field_q = rl.a(kd.field_x, "basic", "mansize", false);
                                gj.field_a = rl.a(kd.field_x, "basic", "stripeybar", false);
                                vk.field_r = rl.a(kd.field_x, "basic", "hackbit", false);
                                wc.field_d = cf.a("pretty_button_lit", "basic", (byte) -111, kd.field_x);
                                hk.field_Tb = cf.a("pretty_button_unlit", "basic", (byte) -50, kd.field_x);
                                eb.field_p = cf.a("menu_border", "basic", (byte) -31, kd.field_x);
                                lj.field_e = cf.a("bin_icon", "basic", (byte) -14, kd.field_x);
                                pd.field_Q = cf.a("faces_idle", "basic", (byte) -87, kd.field_x);
                                bg.field_C = cf.a("faces_talk", "basic", (byte) -97, kd.field_x);
                                am.field_f = cf.a("tutor_buttons", "basic", (byte) -125, kd.field_x);
                                b.field_n = cf.a("shields", "basic", (byte) -58, kd.field_x);
                                vi.field_gb = cf.a("explosion", "basic", (byte) -34, kd.field_x);
                                var3_array = ec.a((byte) -115, "smoke", kd.field_x, "basic");
                                cc.field_pc = new ek[var3_array.length];
                                var4_int = 0;
                                L6: while (true) {
                                  if (var4_int >= var3_array.length) {
                                    bm.field_S = cf.a("plasma", "basic", (byte) -98, kd.field_x);
                                    discarded$15 = cf.a("dust", "basic", (byte) -81, kd.field_x);
                                    bf.field_Cb = cj.a(-120, "basic", kd.field_x, "crowns");
                                    bc.field_sb = new wk(32, 32);
                                    bc.field_sb.d();
                                    d.field_G.b(0, 0, 32, 32);
                                    sb.field_bb.b((byte) 125);
                                    d.field_G = null;
                                    var3_array2 = new wk[nc.field_m.length][];
                                    var4 = new wk[nc.field_m.length][];
                                    var5 = 0;
                                    L7: while (true) {
                                      if (nc.field_m.length <= var5) {
                                        cm.a(te.field_c, (byte) 74, tm.field_d, (int[]) null, rj.field_k, var4, true, 4, 3, bb.field_R, var2_array, v.field_b, var3_array2, ej.field_t, kc.field_w, qb.field_y, ti.field_u);
                                        pa.a(tm.field_d, 111, ej.field_t);
                                        un.a(200, 126);
                                        oh.field_a = null;
                                        cc.j(param0 ^ -52);
                                        stackOut_160_0 = 0;
                                        stackIn_161_0 = stackOut_160_0;
                                        decompiledRegionSelector0 = 20;
                                        break L0;
                                      } else {
                                        var3_array2[var5] = cf.a(nc.field_m[var5], "basic", (byte) -63, kd.field_x);
                                        var4[var5] = null;
                                        var5++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    cc.field_pc[var4_int] = (ek) ((Object) var3_array[var4_int]);
                                    var4_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                pg.field_w[var4_int] = 14;
                                var4_int++;
                                continue L5;
                              }
                            }
                          } else {
                            L8: {
                              if ((ac.field_bb.field_E[var3_int] ^ -1) == -16777216) {
                                ac.field_bb.field_E[var3_int] = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3_int++;
                            continue L4;
                          }
                        }
                      } else {
                        vg.field_h[var3_int].e();
                        var3_int++;
                        continue L3;
                      }
                    }
                  } else {
                    if (null == ie.field_k) {
                      hd.a(false);
                      gf.a(0);
                      var2_int = 0;
                      L9: while (true) {
                        if (23 <= var2_int) {
                          L10: {
                            pm.field_T = 0;
                            vb.field_g = 0;
                            vg.a(50, (byte) -127);
                            jn.a(true, (byte) 92, 200, me.field_f);
                            if (ni.b(118)) {
                              break L10;
                            } else {
                              al.field_i = fg.a(4, param0 + 20051);
                              break L10;
                            }
                          }
                          L11: {
                            cc.j(0);
                            if (param0 == -52) {
                              break L11;
                            } else {
                              this.b(-1, true);
                              break L11;
                            }
                          }
                          stackOut_176_0 = 1;
                          stackIn_177_0 = stackOut_176_0;
                          decompiledRegionSelector0 = 22;
                          break L0;
                        } else {
                          i.field_e[var2_int] = new ji(var2_int);
                          var2_int++;
                          continue L9;
                        }
                      }
                    } else {
                      hj.a((byte) 106, new m(ie.field_k.a("huffman", -742, "")));
                      ie.field_k = null;
                      cc.j(0);
                      stackOut_163_0 = 0;
                      stackIn_164_0 = stackOut_163_0;
                      decompiledRegionSelector0 = 21;
                      break L0;
                    }
                  }
                } else {
                  mc.a(ba.field_a, 88.0f, -21801);
                  this.a((byte) 104);
                  me.field_f = tg.a(g.field_i, "", "md_title_music");
                  l.field_i = tg.a(g.field_i, "", "war_zone");
                  gb.field_e = tg.a(g.field_i, "", "lost_world");
                  kj.field_z = tg.a(g.field_i, "", "cityscape");
                  ue.field_e = tg.a(g.field_i, "", "thats_no_moon");
                  db.field_a = tg.a(g.field_i, "", "star_fleet");
                  discarded$16 = q.field_f.a(0, me.field_f, 21687, he.field_e, rc.field_i);
                  discarded$17 = q.field_f.a(0, l.field_i, 21687, he.field_e, rc.field_i);
                  discarded$18 = q.field_f.a(0, gb.field_e, 21687, he.field_e, rc.field_i);
                  discarded$19 = q.field_f.a(0, kj.field_z, 21687, he.field_e, rc.field_i);
                  discarded$20 = q.field_f.a(0, ue.field_e, param0 + 21739, he.field_e, rc.field_i);
                  discarded$21 = q.field_f.a(0, db.field_a, 21687, he.field_e, rc.field_i);
                  q.field_f.a((byte) 25);
                  g.field_i = null;
                  rc.field_i = null;
                  cc.j(0);
                  stackOut_122_0 = 0;
                  stackIn_123_0 = stackOut_122_0;
                  decompiledRegionSelector0 = 19;
                  break L0;
                }
              } else {
                mc.a(cm.field_n, 85.0f, -21801);
                this.a((byte) -116);
                qj.field_q[71] = uk.a(ti.field_t, "default", "deploying_in").a();
                qj.field_q[72] = uk.a(ti.field_t, "default", "five").a();
                qj.field_q[73] = uk.a(ti.field_t, "default", "four").a();
                qj.field_q[74] = uk.a(ti.field_t, "default", "three").a();
                qj.field_q[75] = uk.a(ti.field_t, "default", "two").a();
                qj.field_q[76] = uk.a(ti.field_t, "default", "one").a();
                qj.field_q[77] = uk.a(ti.field_t, "default", "chassis_upgrade_available").a();
                qj.field_q[78] = uk.a(ti.field_t, "default", "armour_level_critical").a();
                qj.field_q[79] = uk.a(ti.field_t, "default", "target_acquired").a();
                qj.field_q[80] = uk.a(ti.field_t, "default", "target_lock_failed").a();
                qj.field_q[81] = uk.a(ti.field_t, "default", "warning").a();
                qj.field_q[82] = uk.a(ti.field_t, "default", "energy_low").a();
                qj.field_q[83] = uk.a(ti.field_t, "default", "shield_depleted").a();
                ti.field_t = null;
                cc.j(0);
                stackOut_119_0 = 0;
                stackIn_120_0 = stackOut_119_0;
                decompiledRegionSelector0 = 18;
                break L0;
              }
            } else {
              L12: {
                if (!tm.field_d.a(true)) {
                  break L12;
                } else {
                  if (!tm.field_d.a("basic", (byte) 90)) {
                    break L12;
                  } else {
                    L13: {
                      if (!tm.field_d.a(true)) {
                        break L13;
                      } else {
                        if (tm.field_d.a("roman20", (byte) 90)) {
                          L14: {
                            if (!ej.field_t.a(true)) {
                              break L14;
                            } else {
                              if (!ej.field_t.a("roman20", (byte) 90)) {
                                break L14;
                              } else {
                                L15: {
                                  if (!tm.field_d.a(true)) {
                                    break L15;
                                  } else {
                                    if (tm.field_d.a("lobby", (byte) 90)) {
                                      L16: {
                                        if (!tm.field_d.a(true)) {
                                          break L16;
                                        } else {
                                          if (!tm.field_d.a("basicfont12", (byte) 90)) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (!ej.field_t.a(true)) {
                                                break L17;
                                              } else {
                                                if (ej.field_t.a("basicfont12", (byte) 90)) {
                                                  L18: {
                                                    if (!ej.field_t.a(true)) {
                                                      break L18;
                                                    } else {
                                                      if (ej.field_t.a("lobby", (byte) 90)) {
                                                        L19: {
                                                          if (!aj.field_x.a(true)) {
                                                            break L19;
                                                          } else {
                                                            if (aj.field_x.a(param0 ^ -43)) {
                                                              L20: {
                                                                if (!dh.field_z.a(true)) {
                                                                  break L20;
                                                                } else {
                                                                  if (dh.field_z.a(param0 ^ -43)) {
                                                                    L21: {
                                                                      qi.field_l = false;
                                                                      if (!ti.field_t.a(true)) {
                                                                        break L21;
                                                                      } else {
                                                                        if (ti.field_t.a(25)) {
                                                                          L22: {
                                                                            if (!rc.field_i.a(true)) {
                                                                              break L22;
                                                                            } else {
                                                                              if (!rc.field_i.a(param0 + 77)) {
                                                                                break L22;
                                                                              } else {
                                                                                L23: {
                                                                                  if (!g.field_i.a(true)) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    if (g.field_i.a(25)) {
                                                                                      L24: {
                                                                                        if (!kd.field_x.a(true)) {
                                                                                          break L24;
                                                                                        } else {
                                                                                          if (!kd.field_x.a("basic", (byte) 90)) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            L25: {
                                                                                              if (!im.field_h.a(true)) {
                                                                                                break L25;
                                                                                              } else {
                                                                                                if (im.field_h.a(25)) {
                                                                                                  L26: {
                                                                                                    if (!oh.field_a.a(true)) {
                                                                                                      break L26;
                                                                                                    } else {
                                                                                                      if (oh.field_a.a("basic", (byte) 90)) {
                                                                                                        L27: {
                                                                                                          if (!ie.field_k.a(true)) {
                                                                                                            break L27;
                                                                                                          } else {
                                                                                                            if (ie.field_k.a(25)) {
                                                                                                              L28: {
                                                                                                                if (!rj.field_k.a(true)) {
                                                                                                                  break L28;
                                                                                                                } else {
                                                                                                                  if (rj.field_k.a(param0 + 77)) {
                                                                                                                    en.a(-59);
                                                                                                                    mc.a(cm.field_n, 82.0f, param0 ^ 21787);
                                                                                                                    this.a((byte) 111);
                                                                                                                    he.field_e = new ub(aj.field_x, dh.field_z);
                                                                                                                    aj.field_x = null;
                                                                                                                    cc.j(0);
                                                                                                                    stackOut_116_0 = 0;
                                                                                                                    stackIn_117_0 = stackOut_116_0;
                                                                                                                    decompiledRegionSelector0 = 17;
                                                                                                                    break L0;
                                                                                                                  } else {
                                                                                                                    break L28;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              mc.a(ka.a((byte) -128, qj.field_i, sl.field_l, rj.field_k), 90.0f, -21801);
                                                                                                              stackOut_114_0 = 0;
                                                                                                              stackIn_115_0 = stackOut_114_0;
                                                                                                              decompiledRegionSelector0 = 16;
                                                                                                              break L0;
                                                                                                            } else {
                                                                                                              break L27;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        mc.a(ci.a(ie.field_k, (byte) 94, "", qj.field_i, sl.field_l), 85.0f, -21801);
                                                                                                        stackOut_108_0 = 0;
                                                                                                        stackIn_109_0 = stackOut_108_0;
                                                                                                        decompiledRegionSelector0 = 15;
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        break L26;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  mc.a(ci.a(oh.field_a, (byte) 108, "basic", kb.field_c, og.field_c), 80.0f, -21801);
                                                                                                  stackOut_102_0 = 0;
                                                                                                  stackIn_103_0 = stackOut_102_0;
                                                                                                  decompiledRegionSelector0 = 14;
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  break L25;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            mc.a(ka.a((byte) -78, en.field_f, ai.field_t, im.field_h), 75.0f, -21801);
                                                                                            stackOut_96_0 = 0;
                                                                                            stackIn_97_0 = stackOut_96_0;
                                                                                            decompiledRegionSelector0 = 13;
                                                                                            break L0;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      mc.a(ci.a(kd.field_x, (byte) 94, "basic", en.field_f, ai.field_t), 70.0f, -21801);
                                                                                      stackOut_90_0 = 0;
                                                                                      stackIn_91_0 = stackOut_90_0;
                                                                                      decompiledRegionSelector0 = 12;
                                                                                      break L0;
                                                                                    } else {
                                                                                      break L23;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                mc.a(ci.a(g.field_i, (byte) 101, "", tf.field_f, nj.field_P), 60.0f, -21801);
                                                                                stackOut_82_0 = 0;
                                                                                stackIn_83_0 = stackOut_82_0;
                                                                                decompiledRegionSelector0 = 11;
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          }
                                                                          mc.a(ka.a((byte) -103, tf.field_f, nj.field_P, rc.field_i), 45.0f, -21801);
                                                                          stackOut_76_0 = 0;
                                                                          stackIn_77_0 = stackOut_76_0;
                                                                          decompiledRegionSelector0 = 10;
                                                                          break L0;
                                                                        } else {
                                                                          break L21;
                                                                        }
                                                                      }
                                                                    }
                                                                    mc.a(ci.a(ti.field_t, (byte) 99, "", rn.field_t, ue.field_a), 42.0f, -21801);
                                                                    stackOut_68_0 = 0;
                                                                    stackIn_69_0 = stackOut_68_0;
                                                                    decompiledRegionSelector0 = 9;
                                                                    break L0;
                                                                  } else {
                                                                    break L20;
                                                                  }
                                                                }
                                                              }
                                                              mc.a(ci.a(dh.field_z, (byte) 127, "", rn.field_t, ue.field_a), 40.0f, -21801);
                                                              stackOut_62_0 = 0;
                                                              stackIn_63_0 = stackOut_62_0;
                                                              decompiledRegionSelector0 = 8;
                                                              break L0;
                                                            } else {
                                                              break L19;
                                                            }
                                                          }
                                                        }
                                                        mc.a(ci.a(aj.field_x, (byte) 122, "", rn.field_t, ue.field_a), 20.0f, param0 + -21749);
                                                        stackOut_56_0 = 0;
                                                        stackIn_57_0 = stackOut_56_0;
                                                        decompiledRegionSelector0 = 7;
                                                        break L0;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  mc.a(ci.a(ej.field_t, (byte) 116, "lobby", kb.field_c, og.field_c), 17.0f, param0 + -21749);
                                                  stackOut_50_0 = 0;
                                                  stackIn_51_0 = stackOut_50_0;
                                                  decompiledRegionSelector0 = 6;
                                                  break L0;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            mc.a(ci.a(ej.field_t, (byte) 97, "basicfont12", kb.field_c, og.field_c), 15.0f, param0 + -21749);
                                            stackOut_44_0 = 0;
                                            stackIn_45_0 = stackOut_44_0;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      mc.a(ci.a(tm.field_d, (byte) 120, "basicfont12", en.field_f, ai.field_t), 14.0f, -21801);
                                      stackOut_38_0 = 0;
                                      stackIn_39_0 = stackOut_38_0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                mc.a(ci.a(tm.field_d, (byte) 104, "lobby", en.field_f, ai.field_t), 13.0f, param0 + -21749);
                                stackOut_30_0 = 0;
                                stackIn_31_0 = stackOut_30_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          mc.a(ci.a(ej.field_t, (byte) 111, "roman20", kb.field_c, og.field_c), 12.0f, -21801);
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L13;
                        }
                      }
                    }
                    mc.a(ci.a(tm.field_d, (byte) 116, "roman20", en.field_f, ai.field_t), 11.0f, param0 ^ 21787);
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              mc.a(ci.a(tm.field_d, (byte) 116, "basic", en.field_f, ai.field_t), 10.0f, -21801);
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.OA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_31_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_45_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_51_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_57_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_63_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_69_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_77_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_83_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_91_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_97_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_103_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_109_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_115_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_117_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_120_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_123_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_161_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_164_0 != 0;
                                                  } else {
                                                    return stackIn_177_0 != 0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static wk[] a(int param0, int param1, byte param2, int param3, int param4) {
        wk dupTemp$4 = null;
        wk dupTemp$5 = null;
        wk[] var5 = null;
        RuntimeException var5_ref = null;
        wk[] stackIn_2_0 = null;
        wk[] stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_7_0 = null;
        wk[] stackOut_1_0 = null;
        try {
          L0: {
            var5 = new wk[9];
            if (param2 == -62) {
              L1: {
                dupTemp$4 = bd.a(param1, param3, 248);
                var5[6] = dupTemp$4;
                var5[3] = dupTemp$4;
                var5[2] = dupTemp$4;
                var5[1] = dupTemp$4;
                var5[0] = dupTemp$4;
                dupTemp$5 = bd.a(param4, param3, 248);
                var5[8] = dupTemp$5;
                var5[7] = dupTemp$5;
                var5[5] = dupTemp$5;
                if (-1 != (param0 ^ -1)) {
                  var5[4] = bd.a(param0, 64, 248);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_7_0 = (wk[]) (var5);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (wk[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref), "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var3 = field_G;
        try {
          L0: {
            ej.field_v = 3;
            if (param0 == 53) {
              if (kd.field_x == null) {
                L1: {
                  if (cb.field_l != 1) {
                    break L1;
                  } else {
                    if (im.field_h != null) {
                      ua.field_r = 23;
                      cb.field_l = 1;
                      if (im.field_h.a(true)) {
                        L2: {
                          if ((al.field_g ^ -1) != -1) {
                            break L2;
                          } else {
                            if (!im.field_h.a((byte) -91, "wz_background.jpg", "warzone/")) {
                              break L2;
                            } else {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        L3: {
                          if ((al.field_g ^ -1) != -2) {
                            break L3;
                          } else {
                            if (im.field_h.a((byte) -40, "lw_background.jpg", "lostworld/")) {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (-3 != (al.field_g ^ -1)) {
                            break L4;
                          } else {
                            if (im.field_h.a((byte) 126, "ct_background.jpg", "city/")) {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (3 != al.field_g) {
                            break L5;
                          } else {
                            if (im.field_h.a((byte) -48, "mn_background.jpg", "moon/")) {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (-5 != (al.field_g ^ -1)) {
                            break L6;
                          } else {
                            if (im.field_h.a((byte) 94, "wz_midground_01.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              ig.field_o[0] = new wk[4];
                              ig.field_o[0][0] = (wk) ((Object) new ek(im.field_h.a("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (al.field_g != 5) {
                            break L7;
                          } else {
                            if (im.field_h.a((byte) 109, "wz_midground_02.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              ig.field_o[0][1] = (wk) ((Object) new ek(im.field_h.a("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if ((al.field_g ^ -1) != -7) {
                            break L8;
                          } else {
                            if (im.field_h.a((byte) 83, "wz_midground_03.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              ig.field_o[0][2] = (wk) ((Object) new ek(im.field_h.a("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (7 != al.field_g) {
                            break L9;
                          } else {
                            if (im.field_h.a((byte) 118, "wz_midground_04.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              ig.field_o[0][3] = (wk) ((Object) new ek(im.field_h.a("wz_midground_04.png", bi.a(param0, -721), "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 11;
                              break L0;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (-9 != (al.field_g ^ -1)) {
                            break L10;
                          } else {
                            if (!im.field_h.a((byte) 88, "wz_foreground_01.png", "warzone/")) {
                              break L10;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0] = new wk[7];
                              kc.field_x[0][0] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_01.png", param0 + -795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 12;
                              break L0;
                            }
                          }
                        }
                        L11: {
                          if (9 != al.field_g) {
                            break L11;
                          } else {
                            if (!im.field_h.a((byte) 122, "wz_foreground_02.png", "warzone/")) {
                              break L11;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][1] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_02.png", param0 + -795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 13;
                              break L0;
                            }
                          }
                        }
                        L12: {
                          if ((al.field_g ^ -1) != -11) {
                            break L12;
                          } else {
                            if (im.field_h.a((byte) 84, "wz_foreground_03.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][2] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 14;
                              break L0;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (-12 != (al.field_g ^ -1)) {
                            break L13;
                          } else {
                            if (!im.field_h.a((byte) 122, "wz_foreground_04.png", "warzone/")) {
                              break L13;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][3] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 15;
                              break L0;
                            }
                          }
                        }
                        L14: {
                          if (-13 != (al.field_g ^ -1)) {
                            break L14;
                          } else {
                            if (!im.field_h.a((byte) -76, "wz_foreground_05.png", "warzone/")) {
                              break L14;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][4] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_05.png", param0 + -795, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 16;
                              break L0;
                            }
                          }
                        }
                        L15: {
                          if ((al.field_g ^ -1) != -14) {
                            break L15;
                          } else {
                            if (im.field_h.a((byte) 102, "wz_foreground_06.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][5] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 17;
                              break L0;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (-15 != (al.field_g ^ -1)) {
                            break L16;
                          } else {
                            if (im.field_h.a((byte) 93, "wz_foreground_07.png", "warzone/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[0][6] = (wk) ((Object) new ek(im.field_h.a("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 18;
                              break L0;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          if ((al.field_g ^ -1) != -16) {
                            break L17;
                          } else {
                            if (im.field_h.a((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
                              kc.field_x[1] = new wk[6];
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][0] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 19;
                              break L0;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (16 != al.field_g) {
                            break L18;
                          } else {
                            if (!im.field_h.a((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
                              break L18;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][1] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 20;
                              break L0;
                            }
                          }
                        }
                        L19: {
                          if (17 != al.field_g) {
                            break L19;
                          } else {
                            if (!im.field_h.a((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
                              break L19;
                            } else {
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][2] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_03.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 21;
                              break L0;
                            }
                          }
                        }
                        L20: {
                          if (18 != al.field_g) {
                            break L20;
                          } else {
                            if (im.field_h.a((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][3] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_04.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 22;
                              break L0;
                            } else {
                              break L20;
                            }
                          }
                        }
                        L21: {
                          if (-20 != (al.field_g ^ -1)) {
                            break L21;
                          } else {
                            if (im.field_h.a((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][4] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_05.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 23;
                              break L0;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (20 != al.field_g) {
                            break L22;
                          } else {
                            if (im.field_h.a((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
                              al.field_g = al.field_g + 1;
                              kc.field_x[1][5] = (wk) ((Object) new ek(im.field_h.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) gl.a(false))));
                              decompiledRegionSelector0 = 24;
                              break L0;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          if ((al.field_g ^ -1) != -22) {
                            break L23;
                          } else {
                            if (im.field_h.a((byte) -87, "planet.jpg", "fleetbattle/")) {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 25;
                              break L0;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          if (al.field_g != 22) {
                            break L24;
                          } else {
                            if (im.field_h.a((byte) 123, "moon.jpg", "fleetbattle/")) {
                              al.field_g = al.field_g + 1;
                              decompiledRegionSelector0 = 26;
                              break L0;
                            } else {
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if ((al.field_g ^ -1) == -24) {
                            al.field_g = 0;
                            cb.field_l = cb.field_l + 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        decompiledRegionSelector0 = 27;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L26: {
                  if (-3 != (cb.field_l ^ -1)) {
                    break L26;
                  } else {
                    if (he.field_e == null) {
                      break L26;
                    } else {
                      L27: {
                        ua.field_r = 90;
                        if (-1 != (al.field_g ^ -1)) {
                          if (-2 != (al.field_g ^ -1)) {
                            if (al.field_g == 2) {
                              qj.field_q[2] = he.field_e.a("thrusting", "", bi.a(param0, 92));
                              al.field_g = al.field_g + 1;
                              break L27;
                            } else {
                              if (3 == al.field_g) {
                                qj.field_q[3] = he.field_e.a("footstep_1", "", bi.a(param0, 75));
                                al.field_g = al.field_g + 1;
                                break L27;
                              } else {
                                if (al.field_g != 4) {
                                  if (-6 == (al.field_g ^ -1)) {
                                    qj.field_q[5] = he.field_e.a("footstep_4", "", 125);
                                    al.field_g = al.field_g + 1;
                                    break L27;
                                  } else {
                                    if (-7 != (al.field_g ^ -1)) {
                                      if ((al.field_g ^ -1) == -8) {
                                        qj.field_q[7] = he.field_e.a("footstep_2", "", 111);
                                        al.field_g = al.field_g + 1;
                                        break L27;
                                      } else {
                                        if (8 != al.field_g) {
                                          if (al.field_g == 9) {
                                            qj.field_q[9] = he.field_e.a("death", "", param0 + -141);
                                            al.field_g = al.field_g + 1;
                                            break L27;
                                          } else {
                                            if (10 == al.field_g) {
                                              qj.field_q[10] = he.field_e.a("footstep_3", "", param0 + 64);
                                              al.field_g = al.field_g + 1;
                                              break L27;
                                            } else {
                                              if (11 == al.field_g) {
                                                qj.field_q[11] = he.field_e.a("landing", "", 121);
                                                al.field_g = al.field_g + 1;
                                                break L27;
                                              } else {
                                                if (12 != al.field_g) {
                                                  if (-14 == (al.field_g ^ -1)) {
                                                    qj.field_q[13] = he.field_e.a("gauss_gun", "", -110);
                                                    al.field_g = al.field_g + 1;
                                                    break L27;
                                                  } else {
                                                    if (-15 == (al.field_g ^ -1)) {
                                                      qj.field_q[14] = he.field_e.a("rapier_missle", "", param0 + 68);
                                                      al.field_g = al.field_g + 1;
                                                      break L27;
                                                    } else {
                                                      if (15 != al.field_g) {
                                                        if ((al.field_g ^ -1) == -17) {
                                                          qj.field_q[16] = he.field_e.a("mini_gun", "", 127);
                                                          al.field_g = al.field_g + 1;
                                                          break L27;
                                                        } else {
                                                          if (al.field_g != 17) {
                                                            if ((al.field_g ^ -1) != -19) {
                                                              if (19 != al.field_g) {
                                                                if (-21 == (al.field_g ^ -1)) {
                                                                  qj.field_q[20] = he.field_e.a("light_rocket_launch", "", -56);
                                                                  al.field_g = al.field_g + 1;
                                                                  break L27;
                                                                } else {
                                                                  if (-22 != (al.field_g ^ -1)) {
                                                                    if (-23 != (al.field_g ^ -1)) {
                                                                      if (al.field_g == 23) {
                                                                        qj.field_q[23] = he.field_e.a("energy_sword_part_2", "", -41);
                                                                        al.field_g = al.field_g + 1;
                                                                        break L27;
                                                                      } else {
                                                                        if (al.field_g == 24) {
                                                                          qj.field_q[24] = he.field_e.a("hammer", "", -57);
                                                                          al.field_g = al.field_g + 1;
                                                                          break L27;
                                                                        } else {
                                                                          if ((al.field_g ^ -1) == -26) {
                                                                            qj.field_q[25] = he.field_e.a("attach_component", "", -57);
                                                                            al.field_g = al.field_g + 1;
                                                                            break L27;
                                                                          } else {
                                                                            if (al.field_g == 26) {
                                                                              qj.field_q[26] = he.field_e.a("ballistic_target_tracking_module", "", param0 + -176);
                                                                              al.field_g = al.field_g + 1;
                                                                              break L27;
                                                                            } else {
                                                                              if (27 == al.field_g) {
                                                                                qj.field_q[27] = he.field_e.a("shield_hit", "", bi.a(param0, -109));
                                                                                al.field_g = al.field_g + 1;
                                                                                break L27;
                                                                              } else {
                                                                                if (-29 == (al.field_g ^ -1)) {
                                                                                  qj.field_q[28] = he.field_e.a("EDD_teleport", "", 103);
                                                                                  al.field_g = al.field_g + 1;
                                                                                  break L27;
                                                                                } else {
                                                                                  if (29 != al.field_g) {
                                                                                    if (30 != al.field_g) {
                                                                                      if (al.field_g != 31) {
                                                                                        if (32 != al.field_g) {
                                                                                          if (-34 == (al.field_g ^ -1)) {
                                                                                            qj.field_q[33] = he.field_e.a("flak_cannon_2", "", -103);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            break L27;
                                                                                          } else {
                                                                                            if (-35 != (al.field_g ^ -1)) {
                                                                                              if (-36 == (al.field_g ^ -1)) {
                                                                                                qj.field_q[35] = he.field_e.a("morter", "", -67);
                                                                                                al.field_g = al.field_g + 1;
                                                                                                break L27;
                                                                                              } else {
                                                                                                if (al.field_g != 36) {
                                                                                                  if ((al.field_g ^ -1) != -38) {
                                                                                                    if (al.field_g != 38) {
                                                                                                      if ((al.field_g ^ -1) == -40) {
                                                                                                        qj.field_q[39] = he.field_e.a("flak_cannon_1", "", 95);
                                                                                                        al.field_g = al.field_g + 1;
                                                                                                        break L27;
                                                                                                      } else {
                                                                                                        if (al.field_g != 40) {
                                                                                                          if (41 == al.field_g) {
                                                                                                            qj.field_q[41] = he.field_e.a("mine_proximity_2", "", -72);
                                                                                                            al.field_g = al.field_g + 1;
                                                                                                            break L27;
                                                                                                          } else {
                                                                                                            if (-43 != (al.field_g ^ -1)) {
                                                                                                              if (43 == al.field_g) {
                                                                                                                qj.field_q[43] = he.field_e.a("rifled_sniper_cannon", "", 120);
                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                break L27;
                                                                                                              } else {
                                                                                                                if (al.field_g == 44) {
                                                                                                                  qj.field_q[44] = he.field_e.a("heavy_rocket_launch", "", param0 + 63);
                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                  break L27;
                                                                                                                } else {
                                                                                                                  if ((al.field_g ^ -1) == -46) {
                                                                                                                    qj.field_q[45] = he.field_e.a("heavy_cannon_2", "", param0 + 62);
                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                    break L27;
                                                                                                                  } else {
                                                                                                                    if (al.field_g != 46) {
                                                                                                                      if (al.field_g == 47) {
                                                                                                                        qj.field_q[68] = he.field_e.a("heavy_gun_2", "", bi.a(param0, -27));
                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                        break L27;
                                                                                                                      } else {
                                                                                                                        if (al.field_g != 48) {
                                                                                                                          if (49 == al.field_g) {
                                                                                                                            qj.field_q[47] = he.field_e.a("explosion_2", "", bi.a(param0, -87));
                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                            break L27;
                                                                                                                          } else {
                                                                                                                            if (-51 != (al.field_g ^ -1)) {
                                                                                                                              if (-52 != (al.field_g ^ -1)) {
                                                                                                                                if ((al.field_g ^ -1) != -53) {
                                                                                                                                  if (53 == al.field_g) {
                                                                                                                                    qj.field_q[51] = he.field_e.a("damage_scraping_metal", "", -108);
                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                    break L27;
                                                                                                                                  } else {
                                                                                                                                    if (al.field_g != 54) {
                                                                                                                                      if (al.field_g == 55) {
                                                                                                                                        qj.field_q[53] = he.field_e.a("explosion_5", "", 117);
                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                        break L27;
                                                                                                                                      } else {
                                                                                                                                        if (al.field_g == 56) {
                                                                                                                                          qj.field_q[54] = he.field_e.a("explosion_6", "", 96);
                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                          break L27;
                                                                                                                                        } else {
                                                                                                                                          if (al.field_g != 57) {
                                                                                                                                            if (-59 != (al.field_g ^ -1)) {
                                                                                                                                              if (al.field_g == 59) {
                                                                                                                                                qj.field_q[57] = he.field_e.a("destructor_rocket", "", 100);
                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                break L27;
                                                                                                                                              } else {
                                                                                                                                                if (60 == al.field_g) {
                                                                                                                                                  qj.field_q[58] = he.field_e.a("howitzer", "", -53);
                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                  break L27;
                                                                                                                                                } else {
                                                                                                                                                  if (-62 != (al.field_g ^ -1)) {
                                                                                                                                                    if ((al.field_g ^ -1) == -63) {
                                                                                                                                                      qj.field_q[60] = he.field_e.a("class_DEATH_nuke", "", -113);
                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                      break L27;
                                                                                                                                                    } else {
                                                                                                                                                      if (-64 == (al.field_g ^ -1)) {
                                                                                                                                                        qj.field_q[61] = he.field_e.a("air_death_missile", "", bi.a(param0, 85));
                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                        break L27;
                                                                                                                                                      } else {
                                                                                                                                                        if (64 != al.field_g) {
                                                                                                                                                          if (-66 == (al.field_g ^ -1)) {
                                                                                                                                                            qj.field_q[63] = he.field_e.a("EMP_cannon", "", -61);
                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                            break L27;
                                                                                                                                                          } else {
                                                                                                                                                            if ((al.field_g ^ -1) == -67) {
                                                                                                                                                              qj.field_q[64] = he.field_e.a("solaris_laser", "", -116);
                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                              break L27;
                                                                                                                                                            } else {
                                                                                                                                                              if (al.field_g == 67) {
                                                                                                                                                                qj.field_q[65] = he.field_e.a("doomsday_cannon", "", -83);
                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                break L27;
                                                                                                                                                              } else {
                                                                                                                                                                if (al.field_g == 68) {
                                                                                                                                                                  qj.field_q[66] = he.field_e.a("ultra_gun", "", 123);
                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                  break L27;
                                                                                                                                                                } else {
                                                                                                                                                                  if (al.field_g != 69) {
                                                                                                                                                                    if (70 == al.field_g) {
                                                                                                                                                                      qj.field_q[84] = he.field_e.a("pause_menu_open", "", bi.a(param0, -110));
                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                      break L27;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (-72 != (al.field_g ^ -1)) {
                                                                                                                                                                        if (72 != al.field_g) {
                                                                                                                                                                          if (-74 == (al.field_g ^ -1)) {
                                                                                                                                                                            qj.field_q[87] = he.field_e.a("explosion_fireball_2", "", -125);
                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                            break L27;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (74 == al.field_g) {
                                                                                                                                                                              qj.field_q[88] = he.field_e.a("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                                              break L27;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (-76 == (al.field_g ^ -1)) {
                                                                                                                                                                                qj.field_q[89] = he.field_e.a("explosion_fireball_4", "", -85);
                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                break L27;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (-77 != (al.field_g ^ -1)) {
                                                                                                                                                                                  if (-78 != (al.field_g ^ -1)) {
                                                                                                                                                                                    if (al.field_g == 78) {
                                                                                                                                                                                      qj.field_q[92] = he.field_e.a("hoverloop", "", param0 + 59);
                                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                                      break L27;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if ((al.field_g ^ -1) == -80) {
                                                                                                                                                                                        qj.field_q[93] = he.field_e.a("trackloop", "", bi.a(param0, 68));
                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                        break L27;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if ((al.field_g ^ -1) == -81) {
                                                                                                                                                                                          qj.field_q[94] = he.field_e.a("damage_plasma_burn2", "", -79);
                                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                                          break L27;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if ((al.field_g ^ -1) == -82) {
                                                                                                                                                                                            qj.field_q[95] = he.field_e.a("Button_press", "", -49);
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            break L27;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (-83 == (al.field_g ^ -1)) {
                                                                                                                                                                                              qj.field_q[96] = he.field_e.a("Main_menu_appear", "", 104);
                                                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                                                              break L27;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (-84 == (al.field_g ^ -1)) {
                                                                                                                                                                                                qj.field_q[97] = he.field_e.a("Mouseover", "", 120);
                                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                                break L27;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (-85 != (al.field_g ^ -1)) {
                                                                                                                                                                                                  if (-86 == (al.field_g ^ -1)) {
                                                                                                                                                                                                    qj.field_q[99] = he.field_e.a("Menu_engineering_select_chassis", "", -112);
                                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                                    break L27;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    if (al.field_g == 86) {
                                                                                                                                                                                                      qj.field_q[100] = he.field_e.a("Menu_engineering_select_part", "", -28);
                                                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                                                      break L27;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      if (-88 != (al.field_g ^ -1)) {
                                                                                                                                                                                                        if ((al.field_g ^ -1) != -89) {
                                                                                                                                                                                                          if (-90 != (al.field_g ^ -1)) {
                                                                                                                                                                                                            break L27;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            qj.field_q[104] = he.field_e.a("new_nuke_explosion", "", 100);
                                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                                            break L27;
                                                                                                                                                                                                          }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          qj.field_q[103] = he.field_e.a("energy_sword_part_1", "", param0 + 47);
                                                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                                                          break L27;
                                                                                                                                                                                                        }
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        qj.field_q[102] = he.field_e.a("power_up", "", 102);
                                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                                        break L27;
                                                                                                                                                                                                      }
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  qj.field_q[98] = he.field_e.a("main_menu_disappear", "", 93);
                                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                                  break L27;
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    qj.field_q[91] = he.field_e.a("flak_explosion_500ms", "", 95);
                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                    break L27;
                                                                                                                                                                                  }
                                                                                                                                                                                } else {
                                                                                                                                                                                  qj.field_q[90] = he.field_e.a("steam", "", -108);
                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                  break L27;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        } else {
                                                                                                                                                                          qj.field_q[86] = he.field_e.a("explosion_fireball_1", "", 100);
                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                          break L27;
                                                                                                                                                                        }
                                                                                                                                                                      } else {
                                                                                                                                                                        qj.field_q[85] = he.field_e.a("pause_menu_close", "", -92);
                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                        break L27;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    qj.field_q[69] = he.field_e.a("Add_order", "", 118);
                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                    break L27;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          qj.field_q[62] = he.field_e.a("fusion_cannon", "", -56);
                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                          break L27;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  } else {
                                                                                                                                                    qj.field_q[59] = he.field_e.a("rail_cannon", "", 122);
                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                    break L27;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              qj.field_q[56] = he.field_e.a("explosion_3", "", -82);
                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                          } else {
                                                                                                                                            qj.field_q[55] = he.field_e.a("damage_debris_hitting_ground", "", -32);
                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                            break L27;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      qj.field_q[52] = he.field_e.a("explosion_4", "", 122);
                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                      break L27;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  qj.field_q[50] = he.field_e.a("damage_plasma_burn", "", 113);
                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                  break L27;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                qj.field_q[49] = he.field_e.a("damage_richochet", "", bi.a(param0, -15));
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                break L27;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              qj.field_q[48] = he.field_e.a("explosion_1", "", 110);
                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                              break L27;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          qj.field_q[46] = he.field_e.a("flak_cannon_3", "", 103);
                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                          break L27;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      qj.field_q[67] = he.field_e.a("laser_beam", "", 110);
                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                      break L27;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              qj.field_q[42] = he.field_e.a("plasma_cannon", "", 104);
                                                                                                              al.field_g = al.field_g + 1;
                                                                                                              break L27;
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          qj.field_q[40] = he.field_e.a("rail_repeater", "", 118);
                                                                                                          al.field_g = al.field_g + 1;
                                                                                                          break L27;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      qj.field_q[38] = he.field_e.a("heavy_gun_1", "", 126);
                                                                                                      al.field_g = al.field_g + 1;
                                                                                                      break L27;
                                                                                                    }
                                                                                                  } else {
                                                                                                    qj.field_q[37] = he.field_e.a("air_mine", "", -78);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    break L27;
                                                                                                  }
                                                                                                } else {
                                                                                                  qj.field_q[36] = he.field_e.a("heavy_gun_3", "", param0 + -94);
                                                                                                  al.field_g = al.field_g + 1;
                                                                                                  break L27;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              qj.field_q[34] = he.field_e.a("heavy_cannon_1", "", -109);
                                                                                              al.field_g = al.field_g + 1;
                                                                                              break L27;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          qj.field_q[32] = he.field_e.a("heavy_cannon_3", "", -86);
                                                                                          al.field_g = al.field_g + 1;
                                                                                          break L27;
                                                                                        }
                                                                                      } else {
                                                                                        qj.field_q[31] = he.field_e.a("lightning_cannon", "", 123);
                                                                                        al.field_g = al.field_g + 1;
                                                                                        break L27;
                                                                                      }
                                                                                    } else {
                                                                                      qj.field_q[30] = he.field_e.a("mine_inactive_hum_2", "", -105);
                                                                                      al.field_g = al.field_g + 1;
                                                                                      break L27;
                                                                                    }
                                                                                  } else {
                                                                                    qj.field_q[29] = he.field_e.a("shield_loop", "", 122);
                                                                                    al.field_g = al.field_g + 1;
                                                                                    break L27;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      qj.field_q[22] = he.field_e.a("sword", "", 113);
                                                                      al.field_g = al.field_g + 1;
                                                                      break L27;
                                                                    }
                                                                  } else {
                                                                    qj.field_q[21] = he.field_e.a("electron_cannon", "", param0 + -135);
                                                                    al.field_g = al.field_g + 1;
                                                                    break L27;
                                                                  }
                                                                }
                                                              } else {
                                                                qj.field_q[19] = he.field_e.a("plasma_spray", "", -50);
                                                                al.field_g = al.field_g + 1;
                                                                break L27;
                                                              }
                                                            } else {
                                                              qj.field_q[18] = he.field_e.a("flak_repeater", "", 124);
                                                              al.field_g = al.field_g + 1;
                                                              break L27;
                                                            }
                                                          } else {
                                                            qj.field_q[17] = he.field_e.a("emp_rocket_impact", "", 112);
                                                            al.field_g = al.field_g + 1;
                                                            break L27;
                                                          }
                                                        }
                                                      } else {
                                                        qj.field_q[15] = he.field_e.a("pulse_laser", "", -118);
                                                        al.field_g = al.field_g + 1;
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  qj.field_q[12] = he.field_e.a("proxy_grenade_launcher", "", 105);
                                                  al.field_g = al.field_g + 1;
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          qj.field_q[8] = he.field_e.a("respawn", "", -28);
                                          al.field_g = al.field_g + 1;
                                          break L27;
                                        }
                                      }
                                    } else {
                                      qj.field_q[6] = he.field_e.a("footstep_5", "", 100);
                                      al.field_g = al.field_g + 1;
                                      break L27;
                                    }
                                  }
                                } else {
                                  qj.field_q[4] = he.field_e.a("drop_pod", "", -121);
                                  al.field_g = al.field_g + 1;
                                  break L27;
                                }
                              }
                            }
                          } else {
                            qj.field_q[1] = he.field_e.a("jumping", "", bi.a(param0, 90));
                            al.field_g = al.field_g + 1;
                            break L27;
                          }
                        } else {
                          qj.field_q[0] = he.field_e.a("menu_select", "", -123);
                          al.field_g = al.field_g + 1;
                          break L27;
                        }
                      }
                      L28: {
                        if (al.field_g != 90) {
                          break L28;
                        } else {
                          al.field_g = 0;
                          cb.field_l = cb.field_l + 1;
                          he.field_e = null;
                          break L28;
                        }
                      }
                      decompiledRegionSelector0 = 28;
                      break L0;
                    }
                  }
                }
                decompiledRegionSelector0 = 29;
                break L0;
              } else {
                ua.field_r = 13;
                cb.field_l = 0;
                if (kd.field_x.a(true)) {
                  L29: {
                    L30: {
                      if (-1 != (al.field_g ^ -1)) {
                        break L30;
                      } else {
                        if (!kd.field_x.a((byte) -38, "lw_midground_01", "basic")) {
                          break L30;
                        } else {
                          al.field_g = al.field_g + 1;
                          ig.field_o[1] = new wk[4];
                          ig.field_o[1][0] = rl.a(kd.field_x, "basic", "lw_midground_01", false);
                          break L29;
                        }
                      }
                    }
                    L31: {
                      if (1 != al.field_g) {
                        break L31;
                      } else {
                        if (!kd.field_x.a((byte) 113, "lw_midground_02", "basic")) {
                          break L31;
                        } else {
                          al.field_g = al.field_g + 1;
                          ig.field_o[1][1] = rl.a(kd.field_x, "basic", "lw_midground_02", false);
                          break L29;
                        }
                      }
                    }
                    L32: {
                      if (2 != al.field_g) {
                        break L32;
                      } else {
                        if (kd.field_x.a((byte) -78, "lw_midground_03", "basic")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[1][2] = rl.a(kd.field_x, "basic", "lw_midground_03", false);
                          break L29;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (al.field_g != 3) {
                        break L33;
                      } else {
                        if (!kd.field_x.a((byte) 101, "lw_midground_04", "basic")) {
                          break L33;
                        } else {
                          al.field_g = al.field_g + 1;
                          ig.field_o[1][3] = rl.a(kd.field_x, "basic", "lw_midground_04", false);
                          break L29;
                        }
                      }
                    }
                    L34: {
                      if (-5 != (al.field_g ^ -1)) {
                        break L34;
                      } else {
                        if (kd.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2] = new wk[4];
                          ig.field_o[2][0] = rl.a(kd.field_x, "basic", "ct_midground_01", false);
                          break L29;
                        } else {
                          break L34;
                        }
                      }
                    }
                    L35: {
                      if (al.field_g != 5) {
                        break L35;
                      } else {
                        if (kd.field_x.a((byte) 102, "ct_midground_02", "basic")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2][1] = rl.a(kd.field_x, "basic", "ct_midground_02", false);
                          break L29;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      if (-7 != (al.field_g ^ -1)) {
                        break L36;
                      } else {
                        if (kd.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2][2] = rl.a(kd.field_x, "basic", "ct_midground_03", false);
                          break L29;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L37: {
                      if (7 != al.field_g) {
                        break L37;
                      } else {
                        if (!kd.field_x.a((byte) -57, "ct_midground_04", "basic")) {
                          break L37;
                        } else {
                          al.field_g = al.field_g + 1;
                          ig.field_o[2][3] = rl.a(kd.field_x, "basic", "ct_midground_04", false);
                          break L29;
                        }
                      }
                    }
                    L38: {
                      if (-9 != (al.field_g ^ -1)) {
                        break L38;
                      } else {
                        if (!kd.field_x.a((byte) 107, "testsurface", "basic")) {
                          break L38;
                        } else {
                          al.field_g = al.field_g + 1;
                          vi.field_R = rl.a(kd.field_x, "basic", "testsurface", false);
                          break L29;
                        }
                      }
                    }
                    L39: {
                      if (-10 != (al.field_g ^ -1)) {
                        break L39;
                      } else {
                        if (kd.field_x.a((byte) -63, "wz_texture", "basic")) {
                          al.field_g = al.field_g + 1;
                          bc.field_rb = new wk[5];
                          bc.field_rb[0] = rl.a(kd.field_x, "basic", "wz_texture", false);
                          bc.field_rb[4] = bc.field_rb[0];
                          break L29;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (al.field_g != 10) {
                        break L40;
                      } else {
                        if (!kd.field_x.a((byte) -81, "lw_texture", "basic")) {
                          break L40;
                        } else {
                          al.field_g = al.field_g + 1;
                          bc.field_rb[1] = rl.a(kd.field_x, "basic", "lw_texture", false);
                          break L29;
                        }
                      }
                    }
                    L41: {
                      if (11 != al.field_g) {
                        break L41;
                      } else {
                        if (!kd.field_x.a((byte) -113, "ct_texture", "basic")) {
                          break L41;
                        } else {
                          al.field_g = al.field_g + 1;
                          bc.field_rb[2] = rl.a(kd.field_x, "basic", "ct_texture", false);
                          break L29;
                        }
                      }
                    }
                    if ((al.field_g ^ -1) != -13) {
                      break L29;
                    } else {
                      if (!kd.field_x.a((byte) 127, "mn_texture", "basic")) {
                        break L29;
                      } else {
                        al.field_g = al.field_g + 1;
                        bc.field_rb[3] = rl.a(kd.field_x, "basic", "mn_texture", false);
                        break L29;
                      }
                    }
                  }
                  L42: {
                    if (13 == al.field_g) {
                      kd.field_x = null;
                      cb.field_l = cb.field_l + 1;
                      al.field_g = 0;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return;
                                                            } else {
                                                              if (decompiledRegionSelector0 == 27) {
                                                                return;
                                                              } else {
                                                                if (decompiledRegionSelector0 == 28) {
                                                                  return;
                                                                } else {
                                                                  return;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void j(byte param0) {
        field_H = null;
        field_J = null;
        if (param0 != -10) {
            return;
        }
        try {
            field_I = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.TA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pl.field_S == null) {
                break L1;
              } else {
                rc.a(0, pl.field_S);
                pl.field_S = null;
                cc.j(0);
                break L1;
              }
            }
            ie.field_k = dh.a(-124, 3);
            kd.field_x = dh.a(60, 5);
            oh.field_a = dh.a(-90, 6);
            aj.field_x = dh.a(55, 7);
            dh.field_z = dh.a(120, 8);
            var2_int = -77 % ((47 - param0) / 35);
            rc.field_i = dh.a(-92, 9);
            g.field_i = dh.a(-106, 10);
            rj.field_k = dh.a(104, 11);
            ti.field_t = dh.a(125, 12);
            im.field_h = dh.a(70, 13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ti.d(7094);
              if (null != wb.field_c) {
                ub.c(0);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 21 % ((param0 - 34) / 48);
            ao.h(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.init()");
        }
    }

    private final void b(int param0, boolean param1) {
        boolean discarded$3 = false;
        int fieldTemp$4 = 0;
        ck discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5_int = 0;
        int[][] var5 = null;
        mb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nb stackIn_242_0 = null;
        nb stackIn_242_1 = null;
        int stackIn_242_2 = 0;
        int stackIn_242_3 = 0;
        int stackIn_242_4 = 0;
        String[] stackIn_242_5 = null;
        int stackIn_242_6 = 0;
        int stackIn_242_7 = 0;
        int[][] stackIn_242_8 = null;
        nb stackIn_244_0 = null;
        nb stackIn_244_1 = null;
        int stackIn_244_2 = 0;
        int stackIn_244_3 = 0;
        int stackIn_244_4 = 0;
        String[] stackIn_244_5 = null;
        int stackIn_244_6 = 0;
        int stackIn_244_7 = 0;
        int[][] stackIn_244_8 = null;
        nb stackIn_245_0 = null;
        nb stackIn_245_1 = null;
        int stackIn_245_2 = 0;
        int stackIn_245_3 = 0;
        int stackIn_245_4 = 0;
        String[] stackIn_245_5 = null;
        int stackIn_245_6 = 0;
        int stackIn_245_7 = 0;
        int[][] stackIn_245_8 = null;
        int stackIn_245_9 = 0;
        RuntimeException decompiledCaughtException = null;
        nb stackOut_241_0 = null;
        nb stackOut_241_1 = null;
        int stackOut_241_2 = 0;
        int stackOut_241_3 = 0;
        int stackOut_241_4 = 0;
        String[] stackOut_241_5 = null;
        int stackOut_241_6 = 0;
        int stackOut_241_7 = 0;
        int[][] stackOut_241_8 = null;
        nb stackOut_244_0 = null;
        nb stackOut_244_1 = null;
        int stackOut_244_2 = 0;
        int stackOut_244_3 = 0;
        int stackOut_244_4 = 0;
        String[] stackOut_244_5 = null;
        int stackOut_244_6 = 0;
        int stackOut_244_7 = 0;
        int[][] stackOut_244_8 = null;
        int stackOut_244_9 = 0;
        nb stackOut_242_0 = null;
        nb stackOut_242_1 = null;
        int stackOut_242_2 = 0;
        int stackOut_242_3 = 0;
        int stackOut_242_4 = 0;
        String[] stackOut_242_5 = null;
        int stackOut_242_6 = 0;
        int stackOut_242_7 = 0;
        int[][] stackOut_242_8 = null;
        int stackOut_242_9 = 0;
        var8 = field_G;
        try {
          L0: {
            L1: {
              wh.a(false);
              if (in.field_h == in.field_i) {
                L2: {
                  var3_int = 0;
                  var4 = 0;
                  if (!param1) {
                    if ((vb.field_g ^ -1) != (pm.field_T ^ -1)) {
                      pm.field_U = pm.field_U + 1;
                      if (pm.field_U != 20) {
                        break L2;
                      } else {
                        ol.b(true);
                        break L2;
                      }
                    } else {
                      if (pm.field_T != -1) {
                        if (pm.field_T != -2) {
                          if (!d.a(pm.field_T, param0 ^ 120)) {
                            break L2;
                          } else {
                            i.field_e[pm.field_T].b(true);
                            break L2;
                          }
                        } else {
                          L3: {
                            if (null == ih.field_s) {
                              break L3;
                            } else {
                              if (null == hl.a((byte) -66)) {
                                break L3;
                              } else {
                                ih.field_s.b((byte) 27);
                                var5_ref = (mb) ((Object) ih.field_s.field_K.e(13058));
                                L4: while (true) {
                                  if (null == var5_ref) {
                                    break L3;
                                  } else {
                                    var5_ref.field_vb = 0;
                                    var5_ref = (mb) ((Object) ih.field_s.field_K.a((byte) -80));
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          var3_int = 1;
                          break L2;
                        }
                      } else {
                        if (bg.field_H) {
                          var4 = 1;
                          var3_int = 1;
                          break L2;
                        } else {
                          if (null == fk.field_i) {
                            break L2;
                          } else {
                            fk.field_i.c(-68, true);
                            L5: while (true) {
                              if (!dl.f(22759)) {
                                break L2;
                              } else {
                                fk.field_i.g(97);
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L6: {
                  if (!bg.field_H) {
                    break L6;
                  } else {
                    if (rc.field_n) {
                      break L6;
                    } else {
                      if (!da.field_d) {
                        L7: {
                          if (!ob.field_y) {
                            break L7;
                          } else {
                            if (!jn.field_g) {
                              break L7;
                            } else {
                              var3_int = 0;
                              break L7;
                            }
                          }
                        }
                        L8: {
                          L9: {
                            la.a(13, var3_int != 0);
                            if (ee.field_G) {
                              break L9;
                            } else {
                              if (!ob.field_y) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          ue.a((byte) 38, var4 != 0, 320, 180);
                          break L8;
                        }
                        L10: {
                          if (!ee.field_G) {
                            break L10;
                          } else {
                            if (null != si.field_A) {
                              si.field_A.c(param0 ^ 37, var4 != 0);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (!ob.field_y) {
                            break L11;
                          } else {
                            fk.field_i.c(-121, var4 != 0);
                            break L11;
                          }
                        }
                        L12: while (true) {
                          if (!dl.f(22759)) {
                            break L6;
                          } else {
                            L13: {
                              if (!vl.field_v) {
                                L14: {
                                  if (ob.field_y) {
                                    break L14;
                                  } else {
                                    if (!ee.field_G) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  if (jn.field_g) {
                                    break L15;
                                  } else {
                                    if ((ei.field_q ^ -1) == -81) {
                                      break L15;
                                    } else {
                                      if (-11 == (ei.field_q ^ -1)) {
                                        break L15;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                if (cn.a(13, 15, 12, false)) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              } else {
                                L16: {
                                  if (ob.field_y) {
                                    break L16;
                                  } else {
                                    if (!ee.field_G) {
                                      discarded$3 = cj.a(13, (byte) 99, 12, 15);
                                      break L13;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (!cn.a(13, 15, 12, false)) {
                                  break L13;
                                } else {
                                  continue L12;
                                }
                              }
                            }
                            if (jn.field_g) {
                              continue L12;
                            } else {
                              L17: {
                                if (!ee.field_G) {
                                  break L17;
                                } else {
                                  si.field_A.g(73);
                                  break L17;
                                }
                              }
                              if (!ob.field_y) {
                                continue L12;
                              } else {
                                fk.field_i.g(51);
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L18: {
                  if (bg.field_H) {
                    break L18;
                  } else {
                    jk.d((byte) -66);
                    break L18;
                  }
                }
                L19: {
                  if (vl.field_v) {
                    if (on.field_i >= an.field_h) {
                      break L19;
                    } else {
                      on.field_i = on.field_i + 1;
                      break L19;
                    }
                  } else {
                    if ((on.field_i ^ -1) < -1) {
                      on.field_i = on.field_i - 1;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
                var5_int = an.field_h * an.field_h;
                var6 = var5_int - on.field_i * on.field_i;
                var7 = vf.field_e + 120 * var6 / var5_int;
                ji.d(0, var7);
                if (bd.field_b.e(13058) == null) {
                  break L1;
                } else {
                  fieldTemp$4 = ob.field_o + 1;
                  ob.field_o = ob.field_o + 1;
                  if (fieldTemp$4 == 500) {
                    ob.field_o = 0;
                    discarded$5 = bd.field_b.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if ((bg.field_G ^ -1) == (in.field_i ^ -1)) {
                  ji.field_a = ji.field_a + 1;
                  if (ji.field_a == 16) {
                    L20: {
                      if (si.field_y) {
                        ef.a(param0 ^ 116);
                        break L20;
                      } else {
                        bb.a((byte) 113);
                        break L20;
                      }
                    }
                    in.field_i = de.field_f;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (de.field_f != in.field_i) {
                    ji.field_a = ji.field_a - 1;
                    if ((ji.field_a ^ -1) != -1) {
                      break L1;
                    } else {
                      in.field_i = in.field_h;
                      break L1;
                    }
                  } else {
                    L21: {
                      if (!ni.b(12)) {
                        L22: {
                          if (null == lc.field_c) {
                            break L22;
                          } else {
                            pa.a(3, (byte) -114, lc.field_c);
                            break L22;
                          }
                        }
                        L23: {
                          gf.c(-128);
                          vb.field_g = ji.field_i;
                          if (!si.field_y) {
                            break L23;
                          } else {
                            si.field_y = false;
                            ag.a(-4, false);
                            break L23;
                          }
                        }
                        L24: {
                          if (!fe.field_E) {
                            break L24;
                          } else {
                            if (!vb.b(-52)) {
                              break L24;
                            } else {
                              L25: {
                                L26: {
                                  var3_int = vb.field_g;
                                  if (-6 == (var3_int ^ -1)) {
                                    break L26;
                                  } else {
                                    if (-7 == (var3_int ^ -1)) {
                                      break L26;
                                    } else {
                                      if (-9 == (var3_int ^ -1)) {
                                        break L26;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                                var3_int = gh.field_Jb;
                                break L25;
                              }
                              q.a(-4, false, -1, var3_int);
                              break L24;
                            }
                          }
                        }
                        if (d.a(vb.field_g, 0)) {
                          ol.b(true);
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    in.field_i = ik.field_b;
                    break L1;
                  }
                }
              }
            }
            L27: {
              if (param0 == 120) {
                break L27;
              } else {
                this.m(-19);
                break L27;
              }
            }
            L28: {
              if (2 == (vb.field_g ^ -1)) {
                lc.field_c = null;
                var3_ref = g.field_l;
                var4_ref_String__ = new String[]{var3_ref};
                var5 = new int[var4_ref_String__.length][];
                var5[0] = uc.field_b;
                var6 = 1;
                L29: while (true) {
                  if (var6 >= var4_ref_String__.length) {
                    L30: {
                      var6 = 0;
                      var7 = di.field_g;
                      if (0 == var7) {
                        var5[0] = ua.field_v;
                        var6 = 16;
                        break L30;
                      } else {
                        if (var7 == 1) {
                          var5[0] = ua.field_v;
                          var6 = 16;
                          break L30;
                        } else {
                          if (7 == var7) {
                            var6 = 16;
                            break L30;
                          } else {
                            if (-5 != (var7 ^ -1)) {
                              L31: {
                                if (-4 == (var7 ^ -1)) {
                                  break L31;
                                } else {
                                  if (-6 == (var7 ^ -1)) {
                                    break L31;
                                  } else {
                                    if (var7 == 10) {
                                      var6 = ua.field_t[10 * ge.field_j - -ol.field_Ub][1];
                                      var5[0] = ua.field_C[ol.field_Ub + ge.field_j * 10];
                                      break L30;
                                    } else {
                                      if (var7 == -1) {
                                        var6 = 0;
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                }
                              }
                              var5[0] = ua.field_C[ol.field_Ub + 10 * ge.field_j];
                              var6 = 16;
                              break L30;
                            } else {
                              var6 = 16;
                              break L30;
                            }
                          }
                        }
                      }
                    }
                    L32: {
                      vl.field_v = false;
                      jn.field_g = false;
                      stackOut_241_0 = null;
                      stackOut_241_1 = null;
                      stackOut_241_2 = 0;
                      stackOut_241_3 = var6;
                      stackOut_241_4 = 1;
                      stackOut_241_5 = (String[]) (var4_ref_String__);
                      stackOut_241_6 = 0;
                      stackOut_241_7 = 0;
                      stackOut_241_8 = (int[][]) (var5);
                      stackIn_244_0 = stackOut_241_0;
                      stackIn_244_1 = stackOut_241_1;
                      stackIn_244_2 = stackOut_241_2;
                      stackIn_244_3 = stackOut_241_3;
                      stackIn_244_4 = stackOut_241_4;
                      stackIn_244_5 = stackOut_241_5;
                      stackIn_244_6 = stackOut_241_6;
                      stackIn_244_7 = stackOut_241_7;
                      stackIn_244_8 = stackOut_241_8;
                      stackIn_242_0 = stackOut_241_0;
                      stackIn_242_1 = stackOut_241_1;
                      stackIn_242_2 = stackOut_241_2;
                      stackIn_242_3 = stackOut_241_3;
                      stackIn_242_4 = stackOut_241_4;
                      stackIn_242_5 = stackOut_241_5;
                      stackIn_242_6 = stackOut_241_6;
                      stackIn_242_7 = stackOut_241_7;
                      stackIn_242_8 = stackOut_241_8;
                      if (-1 != di.field_g) {
                        stackOut_244_0 = null;
                        stackOut_244_1 = null;
                        stackOut_244_2 = stackIn_244_2;
                        stackOut_244_3 = stackIn_244_3;
                        stackOut_244_4 = stackIn_244_4;
                        stackOut_244_5 = (String[]) ((Object) stackIn_244_5);
                        stackOut_244_6 = stackIn_244_6;
                        stackOut_244_7 = stackIn_244_7;
                        stackOut_244_8 = (int[][]) ((Object) stackIn_244_8);
                        stackOut_244_9 = 0;
                        stackIn_245_0 = stackOut_244_0;
                        stackIn_245_1 = stackOut_244_1;
                        stackIn_245_2 = stackOut_244_2;
                        stackIn_245_3 = stackOut_244_3;
                        stackIn_245_4 = stackOut_244_4;
                        stackIn_245_5 = stackOut_244_5;
                        stackIn_245_6 = stackOut_244_6;
                        stackIn_245_7 = stackOut_244_7;
                        stackIn_245_8 = stackOut_244_8;
                        stackIn_245_9 = stackOut_244_9;
                        break L32;
                      } else {
                        stackOut_242_0 = null;
                        stackOut_242_1 = null;
                        stackOut_242_2 = stackIn_242_2;
                        stackOut_242_3 = stackIn_242_3;
                        stackOut_242_4 = stackIn_242_4;
                        stackOut_242_5 = (String[]) ((Object) stackIn_242_5);
                        stackOut_242_6 = stackIn_242_6;
                        stackOut_242_7 = stackIn_242_7;
                        stackOut_242_8 = (int[][]) ((Object) stackIn_242_8);
                        stackOut_242_9 = 3;
                        stackIn_245_0 = stackOut_242_0;
                        stackIn_245_1 = stackOut_242_1;
                        stackIn_245_2 = stackOut_242_2;
                        stackIn_245_3 = stackOut_242_3;
                        stackIn_245_4 = stackOut_242_4;
                        stackIn_245_5 = stackOut_242_5;
                        stackIn_245_6 = stackOut_242_6;
                        stackIn_245_7 = stackOut_242_7;
                        stackIn_245_8 = stackOut_242_8;
                        stackIn_245_9 = stackOut_242_9;
                        break L32;
                      }
                    }
                    fk.field_i = new nb(stackIn_245_2 != 0, stackIn_245_3, stackIn_245_4, stackIn_245_5, stackIn_245_6, stackIn_245_7 != 0, stackIn_245_8, stackIn_245_9, 2, false, false);
                    var7 = nk.field_B ? 1 : 0;
                    q.a(-1, var7 != 0, -1, 0);
                    ea.field_k = true;
                    break L28;
                  } else {
                    var5[var6] = uc.field_b;
                    var6++;
                    continue L29;
                  }
                }
              } else {
                break L28;
              }
            }
            L33: {
              if (-4 != vb.field_g) {
                break L33;
              } else {
                mm.field_g.a(63, (byte) -117);
                mm.field_g.field_p = mm.field_g.field_p + 1;
                var3_int = mm.field_g.field_p;
                mm.field_g.a((byte) 124, uc.field_b.length);
                var4 = 0;
                L34: while (true) {
                  if (var4 >= uc.field_b.length) {
                    mm.field_g.b((byte) 111, mm.field_g.field_p - var3_int);
                    mm.field_g.a(9, (byte) -117);
                    rc.field_n = true;
                    vb.field_g = pm.field_T;
                    on.field_i = an.field_h;
                    break L33;
                  } else {
                    mm.field_g.a((byte) 127, uc.field_b[var4]);
                    var4++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              if ((vb.field_g ^ -1) == 4) {
                na.a((byte) -43, 11, nf.field_b.j(-26));
                da.field_d = true;
                vb.field_g = pm.field_T;
                break L35;
              } else {
                break L35;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "SteelSentinels.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(14, false, 5000, 71, 1, 0, 4, 2);
              var2 = new ic();
              var2.b(128, (byte) -123, 9);
              qm.a(-31, hb.field_i, 22050, var2, true, (java.awt.Component) ((Object) sl.field_n));
              this.a(1, true, true, false, true, true, false);
              ad.field_d = n.field_s;
              m.field_b = pl.field_ab;
              f.field_B[66] = 1;
              f.field_B[61] = 1;
              f.field_B[67] = 32;
              gl.field_x = qg.field_j;
              if (param0 == 26689) {
                break L1;
              } else {
                this.c(-47);
                break L1;
              }
            }
            f.field_B[57] = -2;
            f.field_B[71] = 12;
            f.field_B[72] = 2;
            f.field_B[78] = -1;
            uc.field_b = ua.field_x;
            fc.field_b = rc.field_o;
            f.field_B[80] = 2;
            f.field_B[70] = 1;
            f.field_B[76] = 5;
            f.field_B[73] = 21;
            f.field_B[58] = -2;
            f.field_B[63] = 1;
            f.field_B[77] = -1;
            ol.field_cc = te.field_a;
            ja.field_b = cb.field_h;
            f.field_B[60] = -1;
            f.field_B[74] = 1;
            f.field_B[64] = 1;
            in.field_b = uc.field_h;
            f.field_B[65] = 1;
            f.field_B[62] = 4;
            f.field_B[69] = 19;
            f.field_B[79] = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
        int discarded$4 = 0;
        na discarded$5 = null;
        int discarded$6 = 0;
        int[] array$7 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var3_ref_String = null;
        int[] var3_ref_int__ = null;
        String var4_ref_String = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        mb var4_ref_mb = null;
        int var5 = 0;
        je var5_ref_je = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        je var10_ref = null;
        int var11_int = 0;
        mb var11 = null;
        int[][] var12 = null;
        int var13_int = 0;
        nb var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_263_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_319_0 = 0;
        int stackIn_323_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_72_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_262_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_322_0 = 0;
        int stackOut_320_0 = 0;
        var15 = field_G;
        try {
          L0: {
            L1: {
              discarded$4 = ub.b(-108);
              kg.field_Vb = ha.a((byte) -86);
              vk.a(false);
              if (wb.field_c == null) {
                break L1;
              } else {
                if (!wb.field_c.field_b) {
                  break L1;
                } else {
                  ub.c(param0 + -2);
                  og.a(-5213);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 2) {
                break L2;
              } else {
                this.init();
                break L2;
              }
            }
            L3: {
              stackOut_10_0 = this;
              stackOut_10_1 = 5;
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (wb.field_c == null) {
                stackOut_13_0 = this;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L3;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_14_2 = stackOut_11_2;
                break L3;
              }
            }
            L4: {
              this.a(stackIn_14_1, stackIn_14_2 != 0);
              if (!rm.field_f) {
                break L4;
              } else {
                this.m(105);
                rm.field_f = false;
                break L4;
              }
            }
            L5: {
              a.field_c = a.field_c + 1;
              if (!ol.j(0)) {
                break L5;
              } else {
                this.k(113);
                if (!ol.j(0)) {
                  break L5;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L6: {
              if (!gh.field_pb) {
                r.a(jj.field_d, (byte) 104);
                if (this.k((byte) -52)) {
                  gh.field_pb = true;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                if (!co.a(false)) {
                  ai.d(param0 + 103);
                  break L6;
                } else {
                  if (!mg.b(true)) {
                    if (cf.c((byte) 100)) {
                      L7: {
                        stackOut_71_0 = this;
                        stackIn_76_0 = stackOut_71_0;
                        stackIn_72_0 = stackOut_71_0;
                        if (null == wb.field_c) {
                          stackOut_76_0 = this;
                          stackOut_76_1 = 0;
                          stackIn_77_0 = stackOut_76_0;
                          stackIn_77_1 = stackOut_76_1;
                          break L7;
                        } else {
                          stackOut_72_0 = this;
                          stackIn_74_0 = stackOut_72_0;
                          stackOut_74_0 = this;
                          stackOut_74_1 = 1;
                          stackIn_77_0 = stackOut_74_0;
                          stackIn_77_1 = stackOut_74_1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var2_int = this.a(stackIn_77_1 != 0, -3836);
                          if (var2_int == 1) {
                            break L9;
                          } else {
                            if ((var2_int ^ -1) == -3) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L10: {
                          if (wb.field_c == null) {
                            break L10;
                          } else {
                            ub.c(0);
                            break L10;
                          }
                        }
                        if (var2_int != 2) {
                          break L8;
                        } else {
                          t.a(true, wl.d((byte) -21));
                          break L8;
                        }
                      }
                      this.b(120, true);
                      break L6;
                    } else {
                      if (ri.b(-121)) {
                        if (in.field_i != in.field_h) {
                          this.b(param0 + 118, false);
                          break L6;
                        } else {
                          L11: {
                            var2_int = rn.c((byte) 90);
                            if ((var2_int ^ -1) == -2) {
                              fe.field_E = true;
                              v.a(0, pl.field_Q, param0 + 8);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          this.b(param0 + 118, true);
                          break L6;
                        }
                      } else {
                        this.b(120, false);
                        break L6;
                      }
                    }
                  } else {
                    if (in.field_i != in.field_h) {
                      this.b(param0 + 118, false);
                      break L6;
                    } else {
                      L12: {
                        var2_int = eh.a(0);
                        if (-3 != (var2_int ^ -1)) {
                          if (-4 == (var2_int ^ -1)) {
                            si.field_y = false;
                            ag.a(-4, true);
                            break L12;
                          } else {
                            if (-5 == (var2_int ^ -1)) {
                              si.field_y = true;
                              v.a(0, lk.field_bb, param0 + 8);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        } else {
                          ub.c(0);
                          break L12;
                        }
                      }
                      this.b(param0 + 118, true);
                      break L6;
                    }
                  }
                }
              }
            }
            L13: {
              if (ni.b(92)) {
                break L13;
              } else {
                L14: while (true) {
                  var2 = (cf) ((Object) un.field_b.a(true));
                  if (var2 != null) {
                    r.a(4, (byte) 123, (cf) (var2));
                    continue L14;
                  } else {
                    break L13;
                  }
                }
              }
            }
            L15: {
              if (ni.b(74)) {
                break L15;
              } else {
                if (jb.field_P != 0) {
                  ef.a((byte) -109);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L16: while (true) {
              if (!rl.a((byte) 54, f.field_B)) {
                L17: {
                  gj.a(0, 0);
                  if (-2 != pm.field_T) {
                    break L17;
                  } else {
                    if ((vb.field_g ^ -1) != 1) {
                      break L17;
                    } else {
                      vl.field_v = true;
                      break L17;
                    }
                  }
                }
                L18: {
                  if (!vl.field_v) {
                    break L18;
                  } else {
                    ln.field_e = 0;
                    break L18;
                  }
                }
                L19: {
                  if (ri.a(16731221)) {
                    L20: {
                      L21: {
                        var2_int = this.i((byte) -112);
                        if (0 == var2_int) {
                          break L21;
                        } else {
                          if ((var2_int ^ -1) != -2) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      wh.a(2, -26077);
                      uc.a(true, 3);
                      hk.a((byte) 86, 4);
                      vf.a(false, 6);
                      ml.a(param0 + -74, 7);
                      gm.a((byte) -92);
                      if (1 == var2_int) {
                        rc.field_n = true;
                        da.field_d = true;
                        break L20;
                      } else {
                        L22: {
                          if (!bg.field_H) {
                            break L22;
                          } else {
                            L23: {
                              ob.field_y = false;
                              ea.field_k = false;
                              ee.field_G = false;
                              lc.field_e = true;
                              jc.field_d = true;
                              if (ob.field_y) {
                                ll.field_s = rl.field_e;
                                q.a(11, false, -1, 0);
                                break L23;
                              } else {
                                q.a(0, false, param0 + -3, 0);
                                break L23;
                              }
                            }
                            ol.b(true);
                            i.field_e[pm.field_T].a(false, 0, -102);
                            bg.field_H = false;
                            vn.c(12);
                            break L22;
                          }
                        }
                        rc.field_n = false;
                        da.field_d = false;
                        break L20;
                      }
                    }
                    L24: {
                      var3 = 0;
                      if (-3 != (var2_int ^ -1)) {
                        break L24;
                      } else {
                        var3 = 1;
                        break L24;
                      }
                    }
                    L25: {
                      L26: {
                        if (bg.field_H) {
                          break L26;
                        } else {
                          if (rc.field_n) {
                            break L26;
                          } else {
                            if (!da.field_d) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      var3 = 1;
                      break L25;
                    }
                    L27: {
                      if (!ri.a(16731221)) {
                        var3 = 0;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    if (var3 == 0) {
                      break L19;
                    } else {
                      of.a(10);
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (ch.field_N != 9) {
                  if (-15 == (ch.field_N ^ -1)) {
                    L28: {
                      ol.b(true);
                      jj.field_i = nf.a(uc.field_b, h.field_G, (byte) 44);
                      kc.field_w[1] = (byte) 0;
                      if (-1 == (jj.field_i & rc.field_o[1][kc.field_w[1]] ^ -1)) {
                        kc.field_w[1] = (byte) 1;
                        if ((rd.field_b ^ -1) >= -1) {
                          break L28;
                        } else {
                          kc.field_w[1] = (byte) 2;
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (-1 != (kc.field_w[1] ^ -1)) {
                        break L29;
                      } else {
                        v.field_b[0] = 4;
                        break L29;
                      }
                    }
                    L30: {
                      if (1 != kc.field_w[1]) {
                        break L30;
                      } else {
                        v.field_b[0] = 6;
                        break L30;
                      }
                    }
                    L31: {
                      if (kc.field_w[1] == 2) {
                        v.field_b[0] = 12;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    sg.a(ge.a(2000, (byte) -32), nl.field_db.length, tm.a((byte) 50), 1024, ge.a(12, (byte) -32), nj.a((byte) -127), ti.field_u, (byte) -22, ic.f(3443), 150);
                    nh.a((byte) -98, tc.d(800), wn.b((byte) 121));
                    rc.field_n = false;
                    vb.field_g = -2;
                    bg.field_H = true;
                    continue L16;
                  } else {
                    if (-16 == (ch.field_N ^ -1)) {
                      L32: {
                        if (bg.field_H) {
                          ol.b(true);
                          oa.f(param0 ^ -12163);
                          ie.b((byte) 124);
                          ea.field_k = false;
                          ob.field_y = false;
                          vb.field_g = 0;
                          jc.field_d = true;
                          ee.field_G = false;
                          bg.field_H = false;
                          lc.field_e = true;
                          vn.c(103);
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      da.field_d = false;
                      rc.field_n = false;
                      continue L16;
                    } else {
                      L33: {
                        if (ch.field_N != 10) {
                          break L33;
                        } else {
                          if (bg.field_H) {
                            in.a(11247);
                            continue L16;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if ((ch.field_N ^ -1) == -81) {
                        var2_int = rf.field_d.f((byte) -123);
                        var3 = (byte)(255 & rf.field_d.f((byte) -123));
                        if (null == nf.field_b) {
                          continue L16;
                        } else {
                          if (0 == var2_int) {
                            nf.field_b.field_Ub = var3;
                            v.field_b[0] = var3;
                            continue L16;
                          } else {
                            nf.field_b.field_Sb[var2_int] = (byte) var3;
                            continue L16;
                          }
                        }
                      } else {
                        if (ch.field_N != 11) {
                          if (-13 == (ch.field_N ^ -1)) {
                            discarded$5 = eb.a((byte) -127, true);
                            bg.a(new na(true), -93);
                            continue L16;
                          } else {
                            if (ch.field_N != 67) {
                              if ((ch.field_N ^ -1) != -61) {
                                if ((ch.field_N ^ -1) == -78) {
                                  var2_int = rf.field_d.f((byte) -123);
                                  ee.field_S = new int[var2_int];
                                  var3 = 0;
                                  L34: while (true) {
                                    if (var2_int <= var3) {
                                      continue L16;
                                    } else {
                                      ee.field_S[var3] = rf.field_d.f((byte) -123);
                                      var3++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  if (-79 == (ch.field_N ^ -1)) {
                                    var2_int = 0;
                                    L35: while (true) {
                                      if ((var2_int ^ -1) <= -4) {
                                        var2_int = 0;
                                        L36: while (true) {
                                          if ((jh.field_a.length ^ -1) >= (var2_int ^ -1)) {
                                            L37: {
                                              if ((16 & fm.field_f[0]) == 0) {
                                                stackOut_262_0 = 0;
                                                stackIn_263_0 = stackOut_262_0;
                                                break L37;
                                              } else {
                                                stackOut_260_0 = 1;
                                                stackIn_263_0 = stackOut_260_0;
                                                break L37;
                                              }
                                            }
                                            L38: {
                                              var2_int = stackIn_263_0;
                                              fm.field_f[0] = ec.a(fm.field_f[0], 15);
                                              if (fj.field_d > fm.field_f[0]) {
                                                jc.field_f = 0;
                                                break L38;
                                              } else {
                                                if (var2_int != 0) {
                                                  jc.field_f = 2;
                                                  break L38;
                                                } else {
                                                  jc.field_f = 1;
                                                  break L38;
                                                }
                                              }
                                            }
                                            if (gi.h((byte) -79)) {
                                              km.field_a = ee.field_k;
                                              continue L16;
                                            } else {
                                              continue L16;
                                            }
                                          } else {
                                            jh.field_a[var2_int] = rf.field_d.c((byte) -60);
                                            var2_int++;
                                            continue L36;
                                          }
                                        }
                                      } else {
                                        fm.field_f[var2_int] = rf.field_d.f((byte) -65);
                                        var2_int++;
                                        continue L35;
                                      }
                                    }
                                  } else {
                                    if ((ch.field_N ^ -1) != -74) {
                                      if ((ch.field_N ^ -1) == -73) {
                                        var2_int = rf.field_d.c((byte) -60);
                                        li.field_v = li.field_v + var2_int;
                                        if (var2_int <= 0) {
                                          continue L16;
                                        } else {
                                          vn.d(param0 + -44);
                                          hj.field_F = var2_int;
                                          continue L16;
                                        }
                                      } else {
                                        L39: {
                                          if (ch.field_N == 74) {
                                            break L39;
                                          } else {
                                            if (79 == ch.field_N) {
                                              break L39;
                                            } else {
                                              if (ch.field_N == 70) {
                                                discarded$6 = rf.field_d.f((byte) -67);
                                                continue L16;
                                              } else {
                                                L40: {
                                                  if (-58 == (ch.field_N ^ -1)) {
                                                    break L40;
                                                  } else {
                                                    if ((ch.field_N ^ -1) == -59) {
                                                      break L40;
                                                    } else {
                                                      if (ch.field_N == 59) {
                                                        L41: {
                                                          L42: {
                                                            if (ob.field_y) {
                                                              break L42;
                                                            } else {
                                                              if (ee.field_G) {
                                                                break L42;
                                                              } else {
                                                                break L41;
                                                              }
                                                            }
                                                          }
                                                          L43: {
                                                            ol.b(true);
                                                            if (!ob.field_y) {
                                                              break L43;
                                                            } else {
                                                              fk.field_i.a((byte) -128, false);
                                                              break L43;
                                                            }
                                                          }
                                                          lc.field_e = true;
                                                          vb.field_g = -2;
                                                          ee.field_G = false;
                                                          ob.field_y = false;
                                                          ea.field_k = false;
                                                          vl.field_v = true;
                                                          ln.field_e = 0;
                                                          vn.c(104);
                                                          break L41;
                                                        }
                                                        da.field_d = false;
                                                        continue L16;
                                                      } else {
                                                        L44: {
                                                          var2 = null;
                                                          if (!ob.field_y) {
                                                            if (!ee.field_G) {
                                                              break L44;
                                                            } else {
                                                              var2 = si.field_A;
                                                              break L44;
                                                            }
                                                          } else {
                                                            var2 = fk.field_i;
                                                            break L44;
                                                          }
                                                        }
                                                        L45: {
                                                          if (null != var2) {
                                                            if (ch.field_N != 61) {
                                                              if ((ch.field_N ^ -1) != -70) {
                                                                if (-77 != (ch.field_N ^ -1)) {
                                                                  if ((ch.field_N ^ -1) == -72) {
                                                                    L46: {
                                                                      if (((nb) (var2)).field_i + -100 <= ((nb) (var2)).field_w) {
                                                                        break L46;
                                                                      } else {
                                                                        if (((nb) (var2)).field_X.field_r >= ((nb) (var2)).field_w) {
                                                                          break L46;
                                                                        } else {
                                                                          ((nb) (var2)).field_w = -100 + ((nb) (var2)).field_i;
                                                                          break L46;
                                                                        }
                                                                      }
                                                                    }
                                                                    ((nb) (var2)).field_i = rf.field_d.i(param0 ^ 2);
                                                                    var3 = rf.field_d.i(0);
                                                                    var4 = rf.field_d.i(param0 + -2);
                                                                    if ((((nb) (var2)).field_l ^ -1) > (((nb) (var2)).field_X.field_r ^ -1)) {
                                                                      ((nb) (var2)).field_j = var3;
                                                                      ((nb) (var2)).field_l = var4;
                                                                      continue L16;
                                                                    } else {
                                                                      continue L16;
                                                                    }
                                                                  } else {
                                                                    if (62 == ch.field_N) {
                                                                      ((nb) (var2)).field_i = rf.field_d.i(0);
                                                                      ((nb) (var2)).field_z = true;
                                                                      continue L16;
                                                                    } else {
                                                                      if (-64 != (ch.field_N ^ -1)) {
                                                                        if (-65 != (ch.field_N ^ -1)) {
                                                                          if ((ch.field_N ^ -1) != -66) {
                                                                            if (66 == ch.field_N) {
                                                                              ((nb) (var2)).field_N = rf.field_d.f((byte) -85);
                                                                              if (null == fk.field_i) {
                                                                                continue L16;
                                                                              } else {
                                                                                h.i(-1);
                                                                                continue L16;
                                                                              }
                                                                            } else {
                                                                              break L45;
                                                                            }
                                                                          } else {
                                                                            ((nb) (var2)).field_X.field_X = rf.field_d.f((byte) -91);
                                                                            if (null == fk.field_i) {
                                                                              continue L16;
                                                                            } else {
                                                                              h.i(-1);
                                                                              continue L16;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          ((nb) (var2)).field_X.field_hb = rf.field_d.f((byte) -111);
                                                                          continue L16;
                                                                        }
                                                                      } else {
                                                                        ((nb) (var2)).field_X.field_V = rf.field_d.f((byte) -92);
                                                                        if (null == fk.field_i) {
                                                                          continue L16;
                                                                        } else {
                                                                          in.c(2);
                                                                          continue L16;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3 = rf.field_d.f((byte) -120);
                                                                  var4 = rf.field_d.i(0);
                                                                  ((nb) (var2)).field_X.a(var4, 28669, var3);
                                                                  continue L16;
                                                                }
                                                              } else {
                                                                L47: {
                                                                  var3 = rf.field_d.f((byte) -85);
                                                                  var4 = rf.field_d.f((byte) -80);
                                                                  var5 = rf.field_d.f((byte) -120);
                                                                  var6 = rf.field_d.i(0);
                                                                  var7 = rf.field_d.i(0);
                                                                  var8 = rf.field_d.i(param0 ^ 2);
                                                                  var9 = rf.field_d.i(param0 ^ 2);
                                                                  if (var5 == 255) {
                                                                    var5 = -1;
                                                                    break L47;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                                L48: {
                                                                  var10_ref = new je(var4, var5, var6);
                                                                  var10_ref.field_B = var9;
                                                                  var10_ref.field_u = var7;
                                                                  var10_ref.field_y = var8;
                                                                  var11 = ((nb) (var2)).field_X.f(var3, -128);
                                                                  if ((var4 ^ -1) == -11) {
                                                                    break L48;
                                                                  } else {
                                                                    break L48;
                                                                  }
                                                                }
                                                                if (null != var11) {
                                                                  var11.d((byte) 79, var10_ref);
                                                                  continue L16;
                                                                } else {
                                                                  continue L16;
                                                                }
                                                              }
                                                            } else {
                                                              L49: {
                                                                var3 = rf.field_d.f((byte) -117);
                                                                var4_ref_mb = ((nb) (var2)).field_X.f(var3, -128);
                                                                var5_ref_je = (je) ((Object) var4_ref_mb.field_Ec.b(1063677678));
                                                                if (var5_ref_je != null) {
                                                                  var5_ref_je.b(param0 ^ 6);
                                                                  break L49;
                                                                } else {
                                                                  break L49;
                                                                }
                                                              }
                                                              var5_ref_je = (je) ((Object) var4_ref_mb.field_B.b(1063677678));
                                                              if (var5_ref_je != null) {
                                                                var5_ref_je.b(4);
                                                                continue L16;
                                                              } else {
                                                                continue L16;
                                                              }
                                                            }
                                                          } else {
                                                            break L45;
                                                          }
                                                        }
                                                        this.h(param0 + 50);
                                                        continue L16;
                                                      }
                                                    }
                                                  }
                                                }
                                                L50: {
                                                  ol.b(true);
                                                  var2_int = rf.field_d.i(param0 + -2);
                                                  var3 = rf.field_d.f((byte) -110);
                                                  var4 = rf.field_d.f((byte) -74);
                                                  var5 = rf.field_d.f((byte) -90);
                                                  var6 = rf.field_d.f((byte) -102);
                                                  if (-1 == (var6 & 1 ^ -1)) {
                                                    stackOut_314_0 = 0;
                                                    stackIn_315_0 = stackOut_314_0;
                                                    break L50;
                                                  } else {
                                                    stackOut_312_0 = 1;
                                                    stackIn_315_0 = stackOut_312_0;
                                                    break L50;
                                                  }
                                                }
                                                L51: {
                                                  var7 = stackIn_315_0;
                                                  if ((2 & var6) == 0) {
                                                    stackOut_318_0 = 0;
                                                    stackIn_319_0 = stackOut_318_0;
                                                    break L51;
                                                  } else {
                                                    stackOut_316_0 = 1;
                                                    stackIn_319_0 = stackOut_316_0;
                                                    break L51;
                                                  }
                                                }
                                                L52: {
                                                  var8 = stackIn_319_0;
                                                  if (0 == rf.field_d.f((byte) -81)) {
                                                    stackOut_322_0 = 0;
                                                    stackIn_323_0 = stackOut_322_0;
                                                    break L52;
                                                  } else {
                                                    stackOut_320_0 = 1;
                                                    stackIn_323_0 = stackOut_320_0;
                                                    break L52;
                                                  }
                                                }
                                                var9 = stackIn_323_0;
                                                var10 = new String[rf.field_d.f((byte) -90)];
                                                var11_int = -2;
                                                var12 = new int[var10.length][];
                                                var13_int = 0;
                                                L53: while (true) {
                                                  if ((var13_int ^ -1) <= (var10.length ^ -1)) {
                                                    L54: {
                                                      var11_int = rf.field_d.d((byte) -2);
                                                      di.field_g = -1;
                                                      qh.field_Yb = -2;
                                                      jn.field_g = false;
                                                      vl.field_v = false;
                                                      lc.field_c = null;
                                                      if (-1 != var11_int) {
                                                        break L54;
                                                      } else {
                                                        var11_int = -2;
                                                        break L54;
                                                      }
                                                    }
                                                    L55: {
                                                      var13 = new nb(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                                                      var13.field_w = rf.field_d.i(0);
                                                      if (57 == ch.field_N) {
                                                        fk.field_i = var13;
                                                        ob.field_y = true;
                                                        in.c(2);
                                                        h.i(-1);
                                                        ol.l(0);
                                                        break L55;
                                                      } else {
                                                        si.field_A = var13;
                                                        ee.field_G = true;
                                                        ol.l(0);
                                                        break L55;
                                                      }
                                                    }
                                                    vb.field_g = -1;
                                                    da.field_d = false;
                                                    ea.field_k = true;
                                                    continue L16;
                                                  } else {
                                                    var10[var13_int] = rf.field_d.e((byte) 126);
                                                    array$7 = new int[rf.field_d.f((byte) -63)];
                                                    var12[var13_int] = array$7;
                                                    var14 = 0;
                                                    L56: while (true) {
                                                      if (var14 >= var12[var13_int].length) {
                                                        var13_int++;
                                                        continue L53;
                                                      } else {
                                                        L57: {
                                                          var12[var13_int][var14] = rf.field_d.f((byte) -123);
                                                          if ((var12[var13_int][var14] ^ -1) != -256) {
                                                            break L57;
                                                          } else {
                                                            var12[var13_int][var14] = -1;
                                                            break L57;
                                                          }
                                                        }
                                                        var14++;
                                                        continue L56;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L58: {
                                          var2_int = rf.field_d.f((byte) -113);
                                          var3_ref_String = qg.field_o;
                                          if (79 == ch.field_N) {
                                            var3_ref_String = c.field_r;
                                            break L58;
                                          } else {
                                            break L58;
                                          }
                                        }
                                        bd.field_b.a(3, new ai((wk) null, db.a(var3_ref_String, -105, new String[]{t.field_e[var2_int]})));
                                        continue L16;
                                      }
                                    } else {
                                      L59: {
                                        var2_int = rf.field_d.f((byte) -63) + -1;
                                        var3 = rf.field_d.i(0);
                                        var4 = rf.field_d.i(0);
                                        var5 = rf.field_d.i(0);
                                        var6 = rf.field_d.i(0);
                                        var7 = rf.field_d.i(0);
                                        if (-3 < (var2_int ^ -1)) {
                                          lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int + 0, new int[]{var3}, 3);
                                          break L59;
                                        } else {
                                          break L59;
                                        }
                                      }
                                      qi.field_d = null;
                                      qm.a(true);
                                      bd.field_b.a(3, new ai((wk) null, db.a(vm.field_q, param0 + -102, new String[]{Integer.toString(var3 / 516)})));
                                      continue L16;
                                    }
                                  }
                                }
                              } else {
                                li.field_v = rf.field_d.i(0);
                                h.field_G = rf.field_d.i(0);
                                var2_int = 0;
                                L60: while (true) {
                                  if (var2_int >= 4) {
                                    var2_int = 0;
                                    L61: while (true) {
                                      if (2 <= var2_int) {
                                        var2_int = 0;
                                        L62: while (true) {
                                          if ((var2_int ^ -1) <= (va.field_k.length ^ -1)) {
                                            vn.d(-30);
                                            continue L16;
                                          } else {
                                            va.field_k[var2_int] = 0;
                                            var2_int++;
                                            continue L62;
                                          }
                                        }
                                      } else {
                                        fe.field_D[var2_int] = rf.field_d.i(0);
                                        var2_int++;
                                        continue L61;
                                      }
                                    }
                                  } else {
                                    rn.field_D[var2_int] = rf.field_d.i(0);
                                    var2_int++;
                                    continue L60;
                                  }
                                }
                              }
                            } else {
                              var2 = jg.a(true);
                              var3 = 0;
                              L63: while (true) {
                                if (var3 >= ((Object[]) (var2)).length) {
                                  var3_ref_String = (String) (var2);
                                  var4_ref_int__ = ge.field_m;
                                  var5 = 0;
                                  L64: while (true) {
                                    if (var5 >= 8) {
                                      L65: {
                                        if (!ln.field_h) {
                                          break L65;
                                        } else {
                                          var3_ref_int__ = ce.field_t;
                                          var4_ref_int__ = (int[]) (var2);
                                          var5 = 0;
                                          L66: while (true) {
                                            if ((var5 ^ -1) <= -9) {
                                              break L65;
                                            } else {
                                              var3_ref_int__[var5] = vn.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                              var5++;
                                              continue L66;
                                            }
                                          }
                                        }
                                      }
                                      var3_ref_int__ = ge.field_m;
                                      var4_ref_int__ = (int[]) (var2);
                                      var5 = 0;
                                      L67: while (true) {
                                        if ((var5 ^ -1) <= -9) {
                                          wl.c((byte) 10);
                                          continue L16;
                                        } else {
                                          var3_ref_int__[var5] = vn.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                          var5++;
                                          continue L67;
                                        }
                                      }
                                    } else {
                                      ((int[]) ((Object) var3_ref_String))[var5] = ec.a(((int[]) ((Object) var3_ref_String))[var5], var4_ref_int__[var5] ^ -1);
                                      var5++;
                                      continue L64;
                                    }
                                  }
                                } else {
                                  ((int[]) (var2))[var3] = rf.field_d.i(0);
                                  var3++;
                                  continue L63;
                                }
                              }
                            }
                          }
                        } else {
                          var2 = eb.a((byte) -62, false);
                          bg.a((na) (var2), -92);
                          if (-2 == (m.field_a ^ -1)) {
                            if (fk.field_i != null) {
                              if (ph.field_e != null) {
                                L68: {
                                  var3_ref_String = "";
                                  if (null == b.field_g) {
                                    break L68;
                                  } else {
                                    L69: {
                                      var4_ref_String = b.field_g;
                                      if (be.field_b == 1) {
                                        var4_ref_String = "<img=0>" + var4_ref_String;
                                        break L69;
                                      } else {
                                        break L69;
                                      }
                                    }
                                    L70: {
                                      if (2 != be.field_b) {
                                        break L70;
                                      } else {
                                        var4_ref_String = "<img=1>" + var4_ref_String;
                                        break L70;
                                      }
                                    }
                                    var3_ref_String = var4_ref_String + ": ";
                                    break L68;
                                  }
                                }
                                L71: {
                                  L72: {
                                    var4_ref_String = var3_ref_String + mi.a(bg.field_F);
                                    if (((na) (var2)).field_g) {
                                      break L72;
                                    } else {
                                      if (!o.a(-122, ((na) (var2)).field_p)) {
                                        break L72;
                                      } else {
                                        break L71;
                                      }
                                    }
                                  }
                                  bl.a(48127, var4_ref_String, (byte) 124);
                                  ln.field_e = ln.field_e - 1;
                                  break L71;
                                }
                                continue L16;
                              } else {
                                continue L16;
                              }
                            } else {
                              continue L16;
                            }
                          } else {
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                } else {
                  ol.b(true);
                  vb.field_g = 11;
                  rc.field_n = false;
                  ll.field_s = rf.field_d.h(1);
                  continue L16;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "SteelSentinels.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              SteelSentinels.j((byte) -10);
              ul.c((byte) -29);
              wd.a(0);
              hf.a(true);
              fj.a((byte) -120);
              rg.c(125);
              gh.a(false);
              i.a((byte) 100);
              uc.a(false);
              ci.a(false);
              am.a(2);
              n.h((byte) -111);
              od.a(false);
              lg.e(48);
              fk.a((byte) -64);
              wc.a(true);
              a.c(72);
              pb.a();
              cm.b(false);
              un.a(false);
              if (param0 >= 22) {
                break L1;
              } else {
                this.a(48);
                break L1;
              }
            }
            gi.d(-125);
            mm.b(122);
            fl.a(124);
            of.a((byte) 84);
            in.b(127);
            ph.a(80);
            vh.a(-67);
            be.a((byte) -34);
            pa.a((byte) 56);
            ib.a((byte) -119);
            na.a(2);
            im.a((byte) -88);
            wn.a((byte) -126);
            al.b(30);
            he.a(690);
            cj.a(-1);
            nn.b((byte) 30);
            jg.b((byte) -109);
            ng.a((byte) -82);
            ub.a(94);
            ji.h((byte) -104);
            nb.b(750);
            nd.a(-107);
            hh.a(false);
            vk.c((byte) -91);
            cb.b(-1);
            ta.a((byte) -35);
            rj.a(83);
            sg.a((byte) -45);
            jn.a((byte) 79);
            ck.c(4433);
            cd.a(false);
            di.a(-1);
            bi.a((byte) 80);
            ik.b(79);
            lc.b(1);
            o.a(-98);
            dj.a((byte) 94);
            me.a(-118);
            kj.e(true);
            ie.a((byte) -94);
            gj.a(-102);
            tf.a((byte) 26);
            lb.j(0);
            dh.c((byte) 93);
            ve.b((byte) -60);
            ee.g(0);
            nk.d((byte) 20);
            rm.d((byte) -18);
            qj.c(21841);
            jc.e(5370);
            mi.a();
            vf.a(-119);
            jh.a(30706);
            ba.a(false);
            je.a((byte) -110);
            wl.h(31554);
            mb.c((byte) 58);
            hd.b(false);
            ic.a(false);
            uh.c(96);
            hj.e(0);
            ab.a();
            ej.e(-93);
            tb.f();
            sj.b(false);
            hk.d((byte) -65);
            dk.b((byte) -91);
            cc.k(102);
            lj.a((byte) 109);
            jl.a(0);
            vb.a(-1);
            fa.b(38);
            wi.g(573);
            kd.f(8191);
            rd.a(8192);
            eh.b(0);
            ka.f((byte) 127);
            fg.o((byte) -29);
            ki.l((byte) -47);
            bf.m((byte) -111);
            k.n((byte) 107);
            vi.a(false);
            pd.i(-48);
            pm.l(320);
            qc.j(60);
            ll.a(103);
            uj.a(-1);
            uk.c();
            pj.a();
            dg.a((byte) -84);
            ri.d(0);
            tj.a(true);
            ea.a((byte) 66);
            qd.a((byte) 17);
            ne.g(-23261);
            oc.a(-1);
            qi.a(-104);
            ad.a(0);
            id.j(127);
            dn.b(false);
            ql.d((byte) 91);
            dd.a(0);
            td.j(-114);
            oh.a(1);
            m.a(64);
            qm.a((byte) 37);
            te.a((byte) -83);
            ak.a(124);
            gm.a(-1);
            gf.b(-111);
            rb.a((byte) -82);
            en.a(true);
            kk.a((byte) -105);
            pl.c(true);
            ai.e(0);
            dc.a(-38);
            ra.b((byte) 26);
            qh.j(15);
            uf.a(24);
            nf.a(55);
            ol.k(-16);
            qb.h(-185837884);
            ua.a((byte) 115);
            sn.b(0);
            bd.a(-23333);
            og.a((byte) -88);
            la.a((byte) -112);
            an.a((byte) -63);
            f.e(-2);
            qa.h(10);
            rc.a(15598);
            df.i(-58);
            fi.c(2);
            ok.a(true);
            fe.e((byte) 21);
            se.a((byte) -114);
            jd.l(0);
            lf.b();
            jj.b(-123);
            pe.a((byte) -117);
            tm.a(5);
            ec.b((byte) 24);
            fc.a(true);
            sa.a(false);
            pi.b((byte) 61);
            mc.a(23225);
            jk.b((byte) -81);
            gb.a(false);
            oi.a();
            nh.a(-120);
            ni.a(42);
            rl.a(0);
            pf.a(true);
            wa.c(-21121);
            b.a(0);
            qg.b((byte) 105);
            da.a(true);
            lh.c((byte) 19);
            oa.a((byte) -105);
            ug.g(475);
            ac.k((byte) 38);
            bb.h((byte) 127);
            dl.g(-19969);
            qe.a(-31914);
            sh.a(-3274);
            kb.a(5);
            ln.b(0);
            mg.k(-31097);
            co.a((byte) -13);
            oe.a(272);
            mn.g(1);
            ao.g(0);
            nc.a((byte) 127);
            db.a(true);
            vg.a(-61);
            gl.c(0);
            ti.b(65280);
            ed.a((byte) 99);
            vc.b(-13);
            ue.b((byte) -96);
            p.a();
            ce.a((byte) 77);
            bh.a((byte) -98);
            jb.h(-2107133436);
            ig.a((byte) 121);
            qf.a(false);
            mj.d((byte) -72);
            el.b(true);
            ca.c((byte) -73);
            bj.a(7);
            hc.f((byte) 67);
            bc.i((byte) -108);
            jf.d(true);
            gd.l(-12930);
            bk.g(-47);
            ij.a((byte) -42);
            ma.c(false);
            lk.h(-30289);
            ff.h(-3413);
            sb.g(108);
            ia.c((byte) 103);
            wb.a((byte) 87);
            nj.a(false);
            nl.f((byte) -122);
            um.g(32);
            cl.a(5);
            vn.d(false);
            re.l(0);
            ch.a((byte) -68);
            ha.c(true);
            si.a(24);
            ge.b(26);
            g.a(122);
            h.h(0);
            d.h(12);
            q.a((byte) -127);
            hb.a(true);
            bg.g(-1008);
            fm.a(4314);
            le.i(124);
            r.c((byte) -117);
            mf.a();
            va.a(false);
            l.a((byte) 22);
            wh.a((byte) 46);
            kf.d(90);
            tc.a(false);
            hg.a(108);
            ud.d(20000000);
            pc.f(100);
            jm.d(-89);
            kh.b(100);
            bl.a(false);
            ag.b(9);
            li.d(-30874);
            s.a((byte) -86);
            ui.h(-13);
            ah.b(false);
            sl.a(-104);
            hl.e(0);
            cf.a((byte) 9);
            c.a((byte) 127);
            rh.b(false);
            dm.a(-127);
            rf.c(126);
            kc.d(-1341);
            de.a(7);
            fb.b((byte) -119);
            pg.c(28873);
            on.b((byte) -116);
            sf.a(false);
            ml.a(107);
            e.a((byte) -89);
            bm.a((byte) -90);
            aj.d(-1);
            km.a((byte) -27);
            t.a(-13375);
            hm.a((byte) 105);
            ob.d(18601);
            rn.d(3);
            ke.b((byte) 12);
            il.c(-58);
            ei.c(1);
            vm.d((byte) -128);
            ih.c(18384);
            nm.d((byte) 116);
            eb.c(81);
            tk.d((byte) -113);
            ja.a(true);
            vl.a((byte) 29);
            vd.b((byte) 56);
            v.c(true);
            ef.b(8421504);
            this.field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.V(" + param0 + ')');
        }
    }

    static {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
