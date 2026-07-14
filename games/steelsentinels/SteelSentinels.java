/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends n {
    static String field_H;
    static String field_I;
    static gh field_J;
    public static int field_G;

    final void a(byte param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var13 = 0;
        boolean stackOut_38_0 = false;
        boolean[] stackOut_48_0 = null;
        int stackOut_132_0 = 0;
        int stackOut_139_0 = 0;
        boolean stackOut_142_0 = false;
        int stackOut_144_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        gh var3 = null;
        ai var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        ee var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        mb var9 = null;
        qb var9_ref = null;
        wl var9_ref2 = null;
        mb var10 = null;
        int var11 = 0;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = gl.a(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ol.j(0)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        df.a(-111, var2_ref, qb.g(2));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        en.a(var2_ref, -28003);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 161: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var2, "SteelSentinels.EA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean k(byte param0) {
        gk[] var2 = null;
        int var2_int = 0;
        gk[] var3 = null;
        int var3_int = 0;
        wk[] var3_array = null;
        wk[][] var3_array2 = null;
        int var4_int = 0;
        wk[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = field_G;
        ec.a(35);
        if (null == aj.field_x) {
          if (ti.field_t == null) {
            if (g.field_i == null) {
              if (oh.field_a != null) {
                L0: {
                  L1: {
                    mc.a(jl.field_i, 90.0f, param0 + -21749);
                    ((SteelSentinels) this).a((byte) 109);
                    var2 = cj.a(-126, "basic", kd.field_x, "ranks");
                    va.field_j = vd.a(ej.field_t, "roman20", tm.field_d, param0 + 51, "");
                    dm.field_f = be.a(kd.field_x, oh.field_a, (byte) -102, "biting30", "basic");
                    dk.field_h = vd.a(oh.field_a, "basic", kd.field_x, param0 ^ 51, "smallfont");
                    fk.field_d = vd.a(oh.field_a, "basic", kd.field_x, -1, "tinyfont");
                    ff.field_lb = vd.a(ej.field_t, "basicfont12", tm.field_d, param0 + 51, "");
                    pl.field_U = be.a(kd.field_x, oh.field_a, (byte) -93, "bitingfont", "basic");
                    ui.field_U = be.a(kd.field_x, oh.field_a, (byte) -84, "bitinghalf", "basic");
                    ql.field_Tb = dd.a(kd.field_x, oh.field_a, true, "basic", "menutitlefont");
                    wk[] discarded$11 = cf.a("menu_overlays", "basic", (byte) -87, kd.field_x);
                    wd.field_a = nb.a(kd.field_x, (byte) 42, "frame", "basic");
                    km.field_e = nb.a(kd.field_x, (byte) -119, "frame_filled", "basic");
                    ag.field_o = nb.a(kd.field_x, (byte) -60, "button_frame", "basic");
                    vk.field_l = nb.a(kd.field_x, (byte) -122, "button_raised", "basic");
                    ja.field_e = nb.a(kd.field_x, (byte) 36, "button_depressed", "basic");
                    if (ni.b(param0 ^ -44)) {
                      break L1;
                    } else {
                      if ((rd.field_b ^ -1) < -1) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3 = cj.a(121, "basic", kd.field_x, "expansion");
                  eh.field_c = new ng((java.applet.Applet) this, dm.field_e, var3, ji.field_f);
                  break L0;
                }
                od.field_c = cf.a("achievements_large", "basic", (byte) -79, kd.field_x);
                vg.field_h = cf.a("cursors", "basic", (byte) -54, kd.field_x);
                var3_int = 0;
                L2: while (true) {
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
                    L3: while (true) {
                      if ((ac.field_bb.field_E.length ^ -1) >= (var3_int ^ -1)) {
                        oa.field_N = rl.a(kd.field_x, "basic", "goldstar", false);
                        td.field_ec = rl.a(kd.field_x, "basic", "silverstar", false);
                        wk discarded$12 = rl.a(kd.field_x, "basic", "starfrigate", false);
                        sb.field_W = rl.a(kd.field_x, "basic", "starcruiser", false);
                        hb.field_e = sb.field_W.a();
                        jc.field_c = cj.a(27, "basic", kd.field_x, "texticons");
                        bb.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
                        dk.field_h.a((ea[]) (Object) jc.field_c, bb.field_X);
                        fk.field_d.a((ea[]) (Object) jc.field_c, bb.field_X);
                        pl.field_U.a((ea[]) (Object) jc.field_c, bb.field_X);
                        ff.field_lb.a((ea[]) (Object) jc.field_c, bb.field_X);
                        var3 = cj.a(param0 ^ -5, "basic", kd.field_x, "instr_texticons");
                        ub.field_a = new gk[18];
                        pg.field_w = new int[ub.field_a.length];
                        var4_int = 0;
                        L4: while (true) {
                          if ((var4_int ^ -1) <= (ub.field_a.length ^ -1)) {
                            ii.a((Object[]) (Object) var3, 0, (Object[]) (Object) ub.field_a, 6, 2);
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
                            ob.field_z = (ek) (Object) dn.a("basic", -63, "main_lower_panel", kd.field_x);
                            ma.field_eb = (ek) (Object) dn.a("basic", param0 ^ 75, "main_title_panel", kd.field_x);
                            fi.field_j = rl.a(kd.field_x, "basic", "menu_mesh", false);
                            ic.field_db = rl.a(kd.field_x, "basic", "menu_titlebar", false);
                            pl.field_T = nb.a(kd.field_x, (byte) -62, "menu_button_1", "basic");
                            wk[] discarded$13 = nb.a(kd.field_x, (byte) 107, "empty_button", "basic");
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
                            wk discarded$14 = rl.a(kd.field_x, "basic", "solarite", false);
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
                            L5: while (true) {
                              if (var4_int >= var3_array.length) {
                                bm.field_S = cf.a("plasma", "basic", (byte) -98, kd.field_x);
                                wk[] discarded$15 = cf.a("dust", "basic", (byte) -81, kd.field_x);
                                bf.field_Cb = cj.a(-120, "basic", kd.field_x, "crowns");
                                bc.field_sb = new wk(32, 32);
                                bc.field_sb.d();
                                d.field_G.b(0, 0, 32, 32);
                                sb.field_bb.b((byte) 125);
                                d.field_G = null;
                                var3_array2 = new wk[nc.field_m.length][];
                                var4 = new wk[nc.field_m.length][];
                                var5 = 0;
                                L6: while (true) {
                                  if (nc.field_m.length <= var5) {
                                    cm.a(te.field_c, (byte) 74, tm.field_d, (int[]) null, rj.field_k, var4, true, 4, 3, bb.field_R, var2, v.field_b, var3_array2, ej.field_t, kc.field_w, qb.field_y, ti.field_u);
                                    pa.a(tm.field_d, 111, ej.field_t);
                                    un.a(200, 126);
                                    oh.field_a = null;
                                    cc.j(param0 ^ -52);
                                    return false;
                                  } else {
                                    var3_array2[var5] = cf.a(nc.field_m[var5], "basic", (byte) -63, kd.field_x);
                                    var4[var5] = null;
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                cc.field_pc[var4_int] = (ek) (Object) var3_array[var4_int];
                                var4_int++;
                                continue L5;
                              }
                            }
                          } else {
                            pg.field_w[var4_int] = 14;
                            var4_int++;
                            continue L4;
                          }
                        }
                      } else {
                        L7: {
                          if ((ac.field_bb.field_E[var3_int] ^ -1) == -16777216) {
                            ac.field_bb.field_E[var3_int] = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var3_int++;
                        continue L3;
                      }
                    }
                  } else {
                    vg.field_h[var3_int].e();
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                if (null == ie.field_k) {
                  hd.a(false);
                  gf.a(0);
                  var2_int = 0;
                  L8: while (true) {
                    if (23 <= var2_int) {
                      L9: {
                        pm.field_T = 0;
                        vb.field_g = 0;
                        vg.a(50, (byte) -127);
                        jn.a(true, (byte) 92, 200, me.field_f);
                        if (ni.b(118)) {
                          break L9;
                        } else {
                          al.field_i = fg.a(4, param0 + 20051);
                          break L9;
                        }
                      }
                      L10: {
                        cc.j(0);
                        if (param0 == -52) {
                          break L10;
                        } else {
                          this.b(-1, true);
                          break L10;
                        }
                      }
                      return true;
                    } else {
                      i.field_e[var2_int] = new ji(var2_int);
                      var2_int++;
                      continue L8;
                    }
                  }
                } else {
                  hj.a((byte) 106, new m(ie.field_k.a("huffman", -742, "")));
                  ie.field_k = null;
                  cc.j(0);
                  return false;
                }
              }
            } else {
              mc.a(ba.field_a, 88.0f, -21801);
              ((SteelSentinels) this).a((byte) 104);
              me.field_f = tg.a(g.field_i, "", "md_title_music");
              l.field_i = tg.a(g.field_i, "", "war_zone");
              gb.field_e = tg.a(g.field_i, "", "lost_world");
              kj.field_z = tg.a(g.field_i, "", "cityscape");
              ue.field_e = tg.a(g.field_i, "", "thats_no_moon");
              db.field_a = tg.a(g.field_i, "", "star_fleet");
              boolean discarded$16 = q.field_f.a(0, me.field_f, 21687, he.field_e, rc.field_i);
              boolean discarded$17 = q.field_f.a(0, l.field_i, 21687, he.field_e, rc.field_i);
              boolean discarded$18 = q.field_f.a(0, gb.field_e, 21687, he.field_e, rc.field_i);
              boolean discarded$19 = q.field_f.a(0, kj.field_z, 21687, he.field_e, rc.field_i);
              boolean discarded$20 = q.field_f.a(0, ue.field_e, param0 + 21739, he.field_e, rc.field_i);
              boolean discarded$21 = q.field_f.a(0, db.field_a, 21687, he.field_e, rc.field_i);
              q.field_f.a((byte) 25);
              g.field_i = null;
              rc.field_i = null;
              cc.j(0);
              return false;
            }
          } else {
            mc.a(cm.field_n, 85.0f, -21801);
            ((SteelSentinels) this).a((byte) -116);
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
            return false;
          }
        } else {
          L11: {
            if (!tm.field_d.a(true)) {
              break L11;
            } else {
              if (!tm.field_d.a("basic", (byte) 90)) {
                break L11;
              } else {
                L12: {
                  if (!tm.field_d.a(true)) {
                    break L12;
                  } else {
                    if (tm.field_d.a("roman20", (byte) 90)) {
                      L13: {
                        if (!ej.field_t.a(true)) {
                          break L13;
                        } else {
                          if (!ej.field_t.a("roman20", (byte) 90)) {
                            break L13;
                          } else {
                            L14: {
                              if (!tm.field_d.a(true)) {
                                break L14;
                              } else {
                                if (tm.field_d.a("lobby", (byte) 90)) {
                                  L15: {
                                    if (!tm.field_d.a(true)) {
                                      break L15;
                                    } else {
                                      if (!tm.field_d.a("basicfont12", (byte) 90)) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (!ej.field_t.a(true)) {
                                            break L16;
                                          } else {
                                            if (ej.field_t.a("basicfont12", (byte) 90)) {
                                              L17: {
                                                if (!ej.field_t.a(true)) {
                                                  break L17;
                                                } else {
                                                  if (ej.field_t.a("lobby", (byte) 90)) {
                                                    L18: {
                                                      if (!aj.field_x.a(true)) {
                                                        break L18;
                                                      } else {
                                                        if (aj.field_x.a(param0 ^ -43)) {
                                                          L19: {
                                                            if (!dh.field_z.a(true)) {
                                                              break L19;
                                                            } else {
                                                              if (dh.field_z.a(param0 ^ -43)) {
                                                                L20: {
                                                                  qi.field_l = false;
                                                                  if (!ti.field_t.a(true)) {
                                                                    break L20;
                                                                  } else {
                                                                    if (ti.field_t.a(25)) {
                                                                      L21: {
                                                                        if (!rc.field_i.a(true)) {
                                                                          break L21;
                                                                        } else {
                                                                          if (!rc.field_i.a(param0 + 77)) {
                                                                            break L21;
                                                                          } else {
                                                                            L22: {
                                                                              if (!g.field_i.a(true)) {
                                                                                break L22;
                                                                              } else {
                                                                                if (g.field_i.a(25)) {
                                                                                  L23: {
                                                                                    if (!kd.field_x.a(true)) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      if (!kd.field_x.a("basic", (byte) 90)) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        L24: {
                                                                                          if (!im.field_h.a(true)) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            if (im.field_h.a(25)) {
                                                                                              L25: {
                                                                                                if (!oh.field_a.a(true)) {
                                                                                                  break L25;
                                                                                                } else {
                                                                                                  if (oh.field_a.a("basic", (byte) 90)) {
                                                                                                    L26: {
                                                                                                      if (!ie.field_k.a(true)) {
                                                                                                        break L26;
                                                                                                      } else {
                                                                                                        if (ie.field_k.a(25)) {
                                                                                                          L27: {
                                                                                                            if (!rj.field_k.a(true)) {
                                                                                                              break L27;
                                                                                                            } else {
                                                                                                              if (rj.field_k.a(param0 + 77)) {
                                                                                                                en.a(-59);
                                                                                                                mc.a(cm.field_n, 82.0f, param0 ^ 21787);
                                                                                                                ((SteelSentinels) this).a((byte) 111);
                                                                                                                he.field_e = new ub(aj.field_x, dh.field_z);
                                                                                                                aj.field_x = null;
                                                                                                                cc.j(0);
                                                                                                                return false;
                                                                                                              } else {
                                                                                                                break L27;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          mc.a(ka.a((byte) -128, qj.field_i, sl.field_l, rj.field_k), 90.0f, -21801);
                                                                                                          return false;
                                                                                                        } else {
                                                                                                          break L26;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    mc.a(ci.a(ie.field_k, (byte) 94, "", qj.field_i, sl.field_l), 85.0f, -21801);
                                                                                                    return false;
                                                                                                  } else {
                                                                                                    break L25;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              mc.a(ci.a(oh.field_a, (byte) 108, "basic", kb.field_c, og.field_c), 80.0f, -21801);
                                                                                              return false;
                                                                                            } else {
                                                                                              break L24;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        mc.a(ka.a((byte) -78, en.field_f, ai.field_t, im.field_h), 75.0f, -21801);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  mc.a(ci.a(kd.field_x, (byte) 94, "basic", en.field_f, ai.field_t), 70.0f, -21801);
                                                                                  return false;
                                                                                } else {
                                                                                  break L22;
                                                                                }
                                                                              }
                                                                            }
                                                                            mc.a(ci.a(g.field_i, (byte) 101, "", tf.field_f, nj.field_P), 60.0f, -21801);
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      mc.a(ka.a((byte) -103, tf.field_f, nj.field_P, rc.field_i), 45.0f, -21801);
                                                                      return false;
                                                                    } else {
                                                                      break L20;
                                                                    }
                                                                  }
                                                                }
                                                                mc.a(ci.a(ti.field_t, (byte) 99, "", rn.field_t, ue.field_a), 42.0f, -21801);
                                                                return false;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          mc.a(ci.a(dh.field_z, (byte) 127, "", rn.field_t, ue.field_a), 40.0f, -21801);
                                                          return false;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                    mc.a(ci.a(aj.field_x, (byte) 122, "", rn.field_t, ue.field_a), 20.0f, param0 + -21749);
                                                    return false;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              mc.a(ci.a(ej.field_t, (byte) 116, "lobby", kb.field_c, og.field_c), 17.0f, param0 + -21749);
                                              return false;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        mc.a(ci.a(ej.field_t, (byte) 97, "basicfont12", kb.field_c, og.field_c), 15.0f, param0 + -21749);
                                        return false;
                                      }
                                    }
                                  }
                                  mc.a(ci.a(tm.field_d, (byte) 120, "basicfont12", en.field_f, ai.field_t), 14.0f, -21801);
                                  return false;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            mc.a(ci.a(tm.field_d, (byte) 104, "lobby", en.field_f, ai.field_t), 13.0f, param0 + -21749);
                            return false;
                          }
                        }
                      }
                      mc.a(ci.a(ej.field_t, (byte) 111, "roman20", kb.field_c, og.field_c), 12.0f, -21801);
                      return false;
                    } else {
                      break L12;
                    }
                  }
                }
                mc.a(ci.a(tm.field_d, (byte) 116, "roman20", en.field_f, ai.field_t), 11.0f, param0 ^ 21787);
                return false;
              }
            }
          }
          mc.a(ci.a(tm.field_d, (byte) 116, "basic", en.field_f, ai.field_t), 10.0f, -21801);
          return false;
        }
    }

    final static wk[] a(int param0, int param1, byte param2, int param3, int param4) {
        wk[] var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        wk[] stackIn_8_0 = null;
        Object stackOut_1_0 = null;
        wk[] stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5 = new wk[9];
                        if (param2 == -62) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (wk[]) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var5[6] = bd.a(param1, param3, 248);
                        var5[3] = bd.a(param1, param3, 248);
                        var5[2] = bd.a(param1, param3, 248);
                        var5[1] = bd.a(param1, param3, 248);
                        var5[0] = bd.a(param1, param3, 248);
                        var5[8] = bd.a(param4, param3, 248);
                        var5[7] = bd.a(param4, param3, 248);
                        var5[5] = bd.a(param4, param3, 248);
                        if (-1 != (param0 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5[4] = bd.a(param0, 64, 248);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (wk[]) var5;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var5_ref, "SteelSentinels.QA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void n(int param0) {
        int var3 = 0;
        var3 = field_G;
        ej.field_v = 3;
        if (param0 == 53) {
          if (kd.field_x == null) {
            L0: {
              if (cb.field_l != 1) {
                break L0;
              } else {
                if (im.field_h != null) {
                  ua.field_r = 23;
                  cb.field_l = 1;
                  if (im.field_h.a(true)) {
                    L1: {
                      if ((al.field_g ^ -1) != -1) {
                        break L1;
                      } else {
                        if (!im.field_h.a((byte) -91, "wz_background.jpg", "warzone/")) {
                          break L1;
                        } else {
                          al.field_g = al.field_g + 1;
                          return;
                        }
                      }
                    }
                    L2: {
                      if ((al.field_g ^ -1) != -2) {
                        break L2;
                      } else {
                        if (im.field_h.a((byte) -40, "lw_background.jpg", "lostworld/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (-3 != (al.field_g ^ -1)) {
                        break L3;
                      } else {
                        if (im.field_h.a((byte) 126, "ct_background.jpg", "city/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (3 != al.field_g) {
                        break L4;
                      } else {
                        if (im.field_h.a((byte) -48, "mn_background.jpg", "moon/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-5 != (al.field_g ^ -1)) {
                        break L5;
                      } else {
                        if (im.field_h.a((byte) 94, "wz_midground_01.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0] = new wk[4];
                          ig.field_o[0][0] = (wk) (Object) new ek(im.field_h.a("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (al.field_g != 5) {
                        break L6;
                      } else {
                        if (im.field_h.a((byte) 109, "wz_midground_02.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][1] = (wk) (Object) new ek(im.field_h.a("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((al.field_g ^ -1) != -7) {
                        break L7;
                      } else {
                        if (im.field_h.a((byte) 83, "wz_midground_03.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][2] = (wk) (Object) new ek(im.field_h.a("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (7 != al.field_g) {
                        break L8;
                      } else {
                        if (im.field_h.a((byte) 118, "wz_midground_04.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][3] = (wk) (Object) new ek(im.field_h.a("wz_midground_04.png", bi.a(param0, -721), "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (-9 != (al.field_g ^ -1)) {
                        break L9;
                      } else {
                        if (!im.field_h.a((byte) 88, "wz_foreground_01.png", "warzone/")) {
                          break L9;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0] = new wk[7];
                          kc.field_x[0][0] = (wk) (Object) new ek(im.field_h.a("wz_foreground_01.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L10: {
                      if (9 != al.field_g) {
                        break L10;
                      } else {
                        if (!im.field_h.a((byte) 122, "wz_foreground_02.png", "warzone/")) {
                          break L10;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][1] = (wk) (Object) new ek(im.field_h.a("wz_foreground_02.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L11: {
                      if ((al.field_g ^ -1) != -11) {
                        break L11;
                      } else {
                        if (im.field_h.a((byte) 84, "wz_foreground_03.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][2] = (wk) (Object) new ek(im.field_h.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (-12 != (al.field_g ^ -1)) {
                        break L12;
                      } else {
                        if (!im.field_h.a((byte) 122, "wz_foreground_04.png", "warzone/")) {
                          break L12;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][3] = (wk) (Object) new ek(im.field_h.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L13: {
                      if (-13 != (al.field_g ^ -1)) {
                        break L13;
                      } else {
                        if (!im.field_h.a((byte) -76, "wz_foreground_05.png", "warzone/")) {
                          break L13;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][4] = (wk) (Object) new ek(im.field_h.a("wz_foreground_05.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L14: {
                      if ((al.field_g ^ -1) != -14) {
                        break L14;
                      } else {
                        if (im.field_h.a((byte) 102, "wz_foreground_06.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][5] = (wk) (Object) new ek(im.field_h.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (-15 != (al.field_g ^ -1)) {
                        break L15;
                      } else {
                        if (im.field_h.a((byte) 93, "wz_foreground_07.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][6] = (wk) (Object) new ek(im.field_h.a("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if ((al.field_g ^ -1) != -16) {
                        break L16;
                      } else {
                        if (im.field_h.a((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
                          kc.field_x[1] = new wk[6];
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][0] = (wk) (Object) new ek(im.field_h.a("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (16 != al.field_g) {
                        break L17;
                      } else {
                        if (!im.field_h.a((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
                          break L17;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][1] = (wk) (Object) new ek(im.field_h.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L18: {
                      if (17 != al.field_g) {
                        break L18;
                      } else {
                        if (!im.field_h.a((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
                          break L18;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][2] = (wk) (Object) new ek(im.field_h.a("sb_foreground_03.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L19: {
                      if (18 != al.field_g) {
                        break L19;
                      } else {
                        if (im.field_h.a((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][3] = (wk) (Object) new ek(im.field_h.a("sb_foreground_04.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (-20 != (al.field_g ^ -1)) {
                        break L20;
                      } else {
                        if (im.field_h.a((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][4] = (wk) (Object) new ek(im.field_h.a("sb_foreground_05.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (20 != al.field_g) {
                        break L21;
                      } else {
                        if (im.field_h.a((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][5] = (wk) (Object) new ek(im.field_h.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if ((al.field_g ^ -1) != -22) {
                        break L22;
                      } else {
                        if (im.field_h.a((byte) -87, "planet.jpg", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (al.field_g != 22) {
                        break L23;
                      } else {
                        if (im.field_h.a((byte) 123, "moon.jpg", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if ((al.field_g ^ -1) == -24) {
                        al.field_g = 0;
                        cb.field_l = cb.field_l + 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            L25: {
              if (-3 != (cb.field_l ^ -1)) {
                break L25;
              } else {
                if (he.field_e == null) {
                  break L25;
                } else {
                  L26: {
                    ua.field_r = 90;
                    if (-1 != (al.field_g ^ -1)) {
                      if (-2 != (al.field_g ^ -1)) {
                        if (al.field_g == 2) {
                          qj.field_q[2] = he.field_e.a("thrusting", "", bi.a(param0, 92));
                          al.field_g = al.field_g + 1;
                          break L26;
                        } else {
                          if (3 == al.field_g) {
                            qj.field_q[3] = he.field_e.a("footstep_1", "", bi.a(param0, 75));
                            al.field_g = al.field_g + 1;
                            break L26;
                          } else {
                            if (al.field_g != 4) {
                              if (-6 == (al.field_g ^ -1)) {
                                qj.field_q[5] = he.field_e.a("footstep_4", "", 125);
                                al.field_g = al.field_g + 1;
                                break L26;
                              } else {
                                if (-7 != (al.field_g ^ -1)) {
                                  if ((al.field_g ^ -1) == -8) {
                                    qj.field_q[7] = he.field_e.a("footstep_2", "", 111);
                                    al.field_g = al.field_g + 1;
                                    break L26;
                                  } else {
                                    if (8 != al.field_g) {
                                      if (al.field_g == 9) {
                                        qj.field_q[9] = he.field_e.a("death", "", param0 + -141);
                                        al.field_g = al.field_g + 1;
                                        break L26;
                                      } else {
                                        if (10 == al.field_g) {
                                          qj.field_q[10] = he.field_e.a("footstep_3", "", param0 + 64);
                                          al.field_g = al.field_g + 1;
                                          break L26;
                                        } else {
                                          if (11 == al.field_g) {
                                            qj.field_q[11] = he.field_e.a("landing", "", 121);
                                            al.field_g = al.field_g + 1;
                                            break L26;
                                          } else {
                                            if (12 != al.field_g) {
                                              if (-14 == (al.field_g ^ -1)) {
                                                qj.field_q[13] = he.field_e.a("gauss_gun", "", -110);
                                                al.field_g = al.field_g + 1;
                                                break L26;
                                              } else {
                                                if (-15 == (al.field_g ^ -1)) {
                                                  qj.field_q[14] = he.field_e.a("rapier_missle", "", param0 + 68);
                                                  al.field_g = al.field_g + 1;
                                                  break L26;
                                                } else {
                                                  if (15 != al.field_g) {
                                                    if ((al.field_g ^ -1) == -17) {
                                                      qj.field_q[16] = he.field_e.a("mini_gun", "", 127);
                                                      al.field_g = al.field_g + 1;
                                                      break L26;
                                                    } else {
                                                      if (al.field_g != 17) {
                                                        if ((al.field_g ^ -1) != -19) {
                                                          if (19 != al.field_g) {
                                                            if (-21 == (al.field_g ^ -1)) {
                                                              qj.field_q[20] = he.field_e.a("light_rocket_launch", "", -56);
                                                              al.field_g = al.field_g + 1;
                                                              break L26;
                                                            } else {
                                                              if (-22 != (al.field_g ^ -1)) {
                                                                if (-23 != (al.field_g ^ -1)) {
                                                                  if (al.field_g == 23) {
                                                                    qj.field_q[23] = he.field_e.a("energy_sword_part_2", "", -41);
                                                                    al.field_g = al.field_g + 1;
                                                                    break L26;
                                                                  } else {
                                                                    if (al.field_g == 24) {
                                                                      qj.field_q[24] = he.field_e.a("hammer", "", -57);
                                                                      al.field_g = al.field_g + 1;
                                                                      break L26;
                                                                    } else {
                                                                      if ((al.field_g ^ -1) == -26) {
                                                                        qj.field_q[25] = he.field_e.a("attach_component", "", -57);
                                                                        al.field_g = al.field_g + 1;
                                                                        break L26;
                                                                      } else {
                                                                        if (al.field_g == 26) {
                                                                          qj.field_q[26] = he.field_e.a("ballistic_target_tracking_module", "", param0 + -176);
                                                                          al.field_g = al.field_g + 1;
                                                                          break L26;
                                                                        } else {
                                                                          if (27 == al.field_g) {
                                                                            qj.field_q[27] = he.field_e.a("shield_hit", "", bi.a(param0, -109));
                                                                            al.field_g = al.field_g + 1;
                                                                            break L26;
                                                                          } else {
                                                                            if (-29 == (al.field_g ^ -1)) {
                                                                              qj.field_q[28] = he.field_e.a("EDD_teleport", "", 103);
                                                                              al.field_g = al.field_g + 1;
                                                                              break L26;
                                                                            } else {
                                                                              if (29 != al.field_g) {
                                                                                if (30 != al.field_g) {
                                                                                  if (al.field_g != 31) {
                                                                                    if (32 != al.field_g) {
                                                                                      if (-34 == (al.field_g ^ -1)) {
                                                                                        qj.field_q[33] = he.field_e.a("flak_cannon_2", "", -103);
                                                                                        al.field_g = al.field_g + 1;
                                                                                        break L26;
                                                                                      } else {
                                                                                        if (-35 != (al.field_g ^ -1)) {
                                                                                          if (-36 == (al.field_g ^ -1)) {
                                                                                            qj.field_q[35] = he.field_e.a("morter", "", -67);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            break L26;
                                                                                          } else {
                                                                                            if (al.field_g != 36) {
                                                                                              if ((al.field_g ^ -1) != -38) {
                                                                                                if (al.field_g != 38) {
                                                                                                  if ((al.field_g ^ -1) == -40) {
                                                                                                    qj.field_q[39] = he.field_e.a("flak_cannon_1", "", 95);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    break L26;
                                                                                                  } else {
                                                                                                    if (al.field_g != 40) {
                                                                                                      if (41 == al.field_g) {
                                                                                                        qj.field_q[41] = he.field_e.a("mine_proximity_2", "", -72);
                                                                                                        al.field_g = al.field_g + 1;
                                                                                                        break L26;
                                                                                                      } else {
                                                                                                        if (-43 != (al.field_g ^ -1)) {
                                                                                                          if (43 == al.field_g) {
                                                                                                            qj.field_q[43] = he.field_e.a("rifled_sniper_cannon", "", 120);
                                                                                                            al.field_g = al.field_g + 1;
                                                                                                            break L26;
                                                                                                          } else {
                                                                                                            if (al.field_g == 44) {
                                                                                                              qj.field_q[44] = he.field_e.a("heavy_rocket_launch", "", param0 + 63);
                                                                                                              al.field_g = al.field_g + 1;
                                                                                                              break L26;
                                                                                                            } else {
                                                                                                              if ((al.field_g ^ -1) == -46) {
                                                                                                                qj.field_q[45] = he.field_e.a("heavy_cannon_2", "", param0 + 62);
                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                break L26;
                                                                                                              } else {
                                                                                                                if (al.field_g != 46) {
                                                                                                                  if (al.field_g == 47) {
                                                                                                                    qj.field_q[68] = he.field_e.a("heavy_gun_2", "", bi.a(param0, -27));
                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                    break L26;
                                                                                                                  } else {
                                                                                                                    if (al.field_g != 48) {
                                                                                                                      if (49 == al.field_g) {
                                                                                                                        qj.field_q[47] = he.field_e.a("explosion_2", "", bi.a(param0, -87));
                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                        break L26;
                                                                                                                      } else {
                                                                                                                        if (-51 != (al.field_g ^ -1)) {
                                                                                                                          if (-52 != (al.field_g ^ -1)) {
                                                                                                                            if ((al.field_g ^ -1) != -53) {
                                                                                                                              if (53 == al.field_g) {
                                                                                                                                qj.field_q[51] = he.field_e.a("damage_scraping_metal", "", -108);
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                break L26;
                                                                                                                              } else {
                                                                                                                                if (al.field_g != 54) {
                                                                                                                                  if (al.field_g == 55) {
                                                                                                                                    qj.field_q[53] = he.field_e.a("explosion_5", "", 117);
                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                    break L26;
                                                                                                                                  } else {
                                                                                                                                    if (al.field_g == 56) {
                                                                                                                                      qj.field_q[54] = he.field_e.a("explosion_6", "", 96);
                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                      break L26;
                                                                                                                                    } else {
                                                                                                                                      if (al.field_g != 57) {
                                                                                                                                        if (-59 != (al.field_g ^ -1)) {
                                                                                                                                          if (al.field_g == 59) {
                                                                                                                                            qj.field_q[57] = he.field_e.a("destructor_rocket", "", 100);
                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                            break L26;
                                                                                                                                          } else {
                                                                                                                                            if (60 == al.field_g) {
                                                                                                                                              qj.field_q[58] = he.field_e.a("howitzer", "", -53);
                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                              break L26;
                                                                                                                                            } else {
                                                                                                                                              if (-62 != (al.field_g ^ -1)) {
                                                                                                                                                if ((al.field_g ^ -1) == -63) {
                                                                                                                                                  qj.field_q[60] = he.field_e.a("class_DEATH_nuke", "", -113);
                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                  break L26;
                                                                                                                                                } else {
                                                                                                                                                  if (-64 == (al.field_g ^ -1)) {
                                                                                                                                                    qj.field_q[61] = he.field_e.a("air_death_missile", "", bi.a(param0, 85));
                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                    break L26;
                                                                                                                                                  } else {
                                                                                                                                                    if (64 != al.field_g) {
                                                                                                                                                      if (-66 == (al.field_g ^ -1)) {
                                                                                                                                                        qj.field_q[63] = he.field_e.a("EMP_cannon", "", -61);
                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                        break L26;
                                                                                                                                                      } else {
                                                                                                                                                        if ((al.field_g ^ -1) == -67) {
                                                                                                                                                          qj.field_q[64] = he.field_e.a("solaris_laser", "", -116);
                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                          break L26;
                                                                                                                                                        } else {
                                                                                                                                                          if (al.field_g == 67) {
                                                                                                                                                            qj.field_q[65] = he.field_e.a("doomsday_cannon", "", -83);
                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                            break L26;
                                                                                                                                                          } else {
                                                                                                                                                            if (al.field_g == 68) {
                                                                                                                                                              qj.field_q[66] = he.field_e.a("ultra_gun", "", 123);
                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                              break L26;
                                                                                                                                                            } else {
                                                                                                                                                              if (al.field_g != 69) {
                                                                                                                                                                if (70 == al.field_g) {
                                                                                                                                                                  qj.field_q[84] = he.field_e.a("pause_menu_open", "", bi.a(param0, -110));
                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                  break L26;
                                                                                                                                                                } else {
                                                                                                                                                                  if (-72 != (al.field_g ^ -1)) {
                                                                                                                                                                    if (72 != al.field_g) {
                                                                                                                                                                      if (-74 == (al.field_g ^ -1)) {
                                                                                                                                                                        qj.field_q[87] = he.field_e.a("explosion_fireball_2", "", -125);
                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                        break L26;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (74 == al.field_g) {
                                                                                                                                                                          qj.field_q[88] = he.field_e.a("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                          break L26;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (-76 == (al.field_g ^ -1)) {
                                                                                                                                                                            qj.field_q[89] = he.field_e.a("explosion_fireball_4", "", -85);
                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                            break L26;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (-77 != (al.field_g ^ -1)) {
                                                                                                                                                                              if (-78 != (al.field_g ^ -1)) {
                                                                                                                                                                                if (al.field_g == 78) {
                                                                                                                                                                                  qj.field_q[92] = he.field_e.a("hoverloop", "", param0 + 59);
                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                  break L26;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if ((al.field_g ^ -1) == -80) {
                                                                                                                                                                                    qj.field_q[93] = he.field_e.a("trackloop", "", bi.a(param0, 68));
                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                    break L26;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if ((al.field_g ^ -1) == -81) {
                                                                                                                                                                                      qj.field_q[94] = he.field_e.a("damage_plasma_burn2", "", -79);
                                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                                      break L26;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if ((al.field_g ^ -1) == -82) {
                                                                                                                                                                                        qj.field_q[95] = he.field_e.a("Button_press", "", -49);
                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                        break L26;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (-83 == (al.field_g ^ -1)) {
                                                                                                                                                                                          qj.field_q[96] = he.field_e.a("Main_menu_appear", "", 104);
                                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                                          break L26;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (-84 == (al.field_g ^ -1)) {
                                                                                                                                                                                            qj.field_q[97] = he.field_e.a("Mouseover", "", 120);
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            break L26;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (-85 != (al.field_g ^ -1)) {
                                                                                                                                                                                              if (-86 == (al.field_g ^ -1)) {
                                                                                                                                                                                                qj.field_q[99] = he.field_e.a("Menu_engineering_select_chassis", "", -112);
                                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                                break L26;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (al.field_g == 86) {
                                                                                                                                                                                                  qj.field_q[100] = he.field_e.a("Menu_engineering_select_part", "", -28);
                                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                                  break L26;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (-88 != (al.field_g ^ -1)) {
                                                                                                                                                                                                    if ((al.field_g ^ -1) != -89) {
                                                                                                                                                                                                      if (-90 != (al.field_g ^ -1)) {
                                                                                                                                                                                                        break L26;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        qj.field_q[104] = he.field_e.a("new_nuke_explosion", "", 100);
                                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                                        break L26;
                                                                                                                                                                                                      }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      qj.field_q[103] = he.field_e.a("energy_sword_part_1", "", param0 + 47);
                                                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                                                      break L26;
                                                                                                                                                                                                    }
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    qj.field_q[102] = he.field_e.a("power_up", "", 102);
                                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                                    break L26;
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            } else {
                                                                                                                                                                                              qj.field_q[98] = he.field_e.a("main_menu_disappear", "", 93);
                                                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                                                              break L26;
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
                                                                                                                                                                                break L26;
                                                                                                                                                                              }
                                                                                                                                                                            } else {
                                                                                                                                                                              qj.field_q[90] = he.field_e.a("steam", "", -108);
                                                                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                                                                              break L26;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    } else {
                                                                                                                                                                      qj.field_q[86] = he.field_e.a("explosion_fireball_1", "", 100);
                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                      break L26;
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    qj.field_q[85] = he.field_e.a("pause_menu_close", "", -92);
                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                    break L26;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              } else {
                                                                                                                                                                qj.field_q[69] = he.field_e.a("Add_order", "", 118);
                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                break L26;
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      qj.field_q[62] = he.field_e.a("fusion_cannon", "", -56);
                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                      break L26;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              } else {
                                                                                                                                                qj.field_q[59] = he.field_e.a("rail_cannon", "", 122);
                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                break L26;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          qj.field_q[56] = he.field_e.a("explosion_3", "", -82);
                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                          break L26;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        qj.field_q[55] = he.field_e.a("damage_debris_hitting_ground", "", -32);
                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                        break L26;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  qj.field_q[52] = he.field_e.a("explosion_4", "", 122);
                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                  break L26;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              qj.field_q[50] = he.field_e.a("damage_plasma_burn", "", 113);
                                                                                                                              al.field_g = al.field_g + 1;
                                                                                                                              break L26;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            qj.field_q[49] = he.field_e.a("damage_richochet", "", bi.a(param0, -15));
                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                            break L26;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          qj.field_q[48] = he.field_e.a("explosion_1", "", 110);
                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                          break L26;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      qj.field_q[46] = he.field_e.a("flak_cannon_3", "", 103);
                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                      break L26;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  qj.field_q[67] = he.field_e.a("laser_beam", "", 110);
                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                  break L26;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          qj.field_q[42] = he.field_e.a("plasma_cannon", "", 104);
                                                                                                          al.field_g = al.field_g + 1;
                                                                                                          break L26;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      qj.field_q[40] = he.field_e.a("rail_repeater", "", 118);
                                                                                                      al.field_g = al.field_g + 1;
                                                                                                      break L26;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  qj.field_q[38] = he.field_e.a("heavy_gun_1", "", 126);
                                                                                                  al.field_g = al.field_g + 1;
                                                                                                  break L26;
                                                                                                }
                                                                                              } else {
                                                                                                qj.field_q[37] = he.field_e.a("air_mine", "", -78);
                                                                                                al.field_g = al.field_g + 1;
                                                                                                break L26;
                                                                                              }
                                                                                            } else {
                                                                                              qj.field_q[36] = he.field_e.a("heavy_gun_3", "", param0 + -94);
                                                                                              al.field_g = al.field_g + 1;
                                                                                              break L26;
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          qj.field_q[34] = he.field_e.a("heavy_cannon_1", "", -109);
                                                                                          al.field_g = al.field_g + 1;
                                                                                          break L26;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      qj.field_q[32] = he.field_e.a("heavy_cannon_3", "", -86);
                                                                                      al.field_g = al.field_g + 1;
                                                                                      break L26;
                                                                                    }
                                                                                  } else {
                                                                                    qj.field_q[31] = he.field_e.a("lightning_cannon", "", 123);
                                                                                    al.field_g = al.field_g + 1;
                                                                                    break L26;
                                                                                  }
                                                                                } else {
                                                                                  qj.field_q[30] = he.field_e.a("mine_inactive_hum_2", "", -105);
                                                                                  al.field_g = al.field_g + 1;
                                                                                  break L26;
                                                                                }
                                                                              } else {
                                                                                qj.field_q[29] = he.field_e.a("shield_loop", "", 122);
                                                                                al.field_g = al.field_g + 1;
                                                                                break L26;
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
                                                                  break L26;
                                                                }
                                                              } else {
                                                                qj.field_q[21] = he.field_e.a("electron_cannon", "", param0 + -135);
                                                                al.field_g = al.field_g + 1;
                                                                break L26;
                                                              }
                                                            }
                                                          } else {
                                                            qj.field_q[19] = he.field_e.a("plasma_spray", "", -50);
                                                            al.field_g = al.field_g + 1;
                                                            break L26;
                                                          }
                                                        } else {
                                                          qj.field_q[18] = he.field_e.a("flak_repeater", "", 124);
                                                          al.field_g = al.field_g + 1;
                                                          break L26;
                                                        }
                                                      } else {
                                                        qj.field_q[17] = he.field_e.a("emp_rocket_impact", "", 112);
                                                        al.field_g = al.field_g + 1;
                                                        break L26;
                                                      }
                                                    }
                                                  } else {
                                                    qj.field_q[15] = he.field_e.a("pulse_laser", "", -118);
                                                    al.field_g = al.field_g + 1;
                                                    break L26;
                                                  }
                                                }
                                              }
                                            } else {
                                              qj.field_q[12] = he.field_e.a("proxy_grenade_launcher", "", 105);
                                              al.field_g = al.field_g + 1;
                                              break L26;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      qj.field_q[8] = he.field_e.a("respawn", "", -28);
                                      al.field_g = al.field_g + 1;
                                      break L26;
                                    }
                                  }
                                } else {
                                  qj.field_q[6] = he.field_e.a("footstep_5", "", 100);
                                  al.field_g = al.field_g + 1;
                                  break L26;
                                }
                              }
                            } else {
                              qj.field_q[4] = he.field_e.a("drop_pod", "", -121);
                              al.field_g = al.field_g + 1;
                              break L26;
                            }
                          }
                        }
                      } else {
                        qj.field_q[1] = he.field_e.a("jumping", "", bi.a(param0, 90));
                        al.field_g = al.field_g + 1;
                        break L26;
                      }
                    } else {
                      qj.field_q[0] = he.field_e.a("menu_select", "", -123);
                      al.field_g = al.field_g + 1;
                      break L26;
                    }
                  }
                  L27: {
                    if (al.field_g != 90) {
                      break L27;
                    } else {
                      al.field_g = 0;
                      cb.field_l = cb.field_l + 1;
                      he.field_e = null;
                      break L27;
                    }
                  }
                  return;
                }
              }
            }
            return;
          } else {
            ua.field_r = 13;
            cb.field_l = 0;
            if (kd.field_x.a(true)) {
              L28: {
                L29: {
                  if (-1 != (al.field_g ^ -1)) {
                    break L29;
                  } else {
                    if (!kd.field_x.a((byte) -38, "lw_midground_01", "basic")) {
                      break L29;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1] = new wk[4];
                      ig.field_o[1][0] = rl.a(kd.field_x, "basic", "lw_midground_01", false);
                      break L28;
                    }
                  }
                }
                L30: {
                  if (1 != al.field_g) {
                    break L30;
                  } else {
                    if (!kd.field_x.a((byte) 113, "lw_midground_02", "basic")) {
                      break L30;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1][1] = rl.a(kd.field_x, "basic", "lw_midground_02", false);
                      break L28;
                    }
                  }
                }
                L31: {
                  if (2 != al.field_g) {
                    break L31;
                  } else {
                    if (kd.field_x.a((byte) -78, "lw_midground_03", "basic")) {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1][2] = rl.a(kd.field_x, "basic", "lw_midground_03", false);
                      break L28;
                    } else {
                      break L31;
                    }
                  }
                }
                L32: {
                  if (al.field_g != 3) {
                    break L32;
                  } else {
                    if (!kd.field_x.a((byte) 101, "lw_midground_04", "basic")) {
                      break L32;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1][3] = rl.a(kd.field_x, "basic", "lw_midground_04", false);
                      break L28;
                    }
                  }
                }
                L33: {
                  if (-5 != (al.field_g ^ -1)) {
                    break L33;
                  } else {
                    if (kd.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2] = new wk[4];
                      ig.field_o[2][0] = rl.a(kd.field_x, "basic", "ct_midground_01", false);
                      break L28;
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  if (al.field_g != 5) {
                    break L34;
                  } else {
                    if (kd.field_x.a((byte) 102, "ct_midground_02", "basic")) {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2][1] = rl.a(kd.field_x, "basic", "ct_midground_02", false);
                      break L28;
                    } else {
                      break L34;
                    }
                  }
                }
                L35: {
                  if (-7 != (al.field_g ^ -1)) {
                    break L35;
                  } else {
                    if (kd.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2][2] = rl.a(kd.field_x, "basic", "ct_midground_03", false);
                      break L28;
                    } else {
                      break L35;
                    }
                  }
                }
                L36: {
                  if (7 != al.field_g) {
                    break L36;
                  } else {
                    if (!kd.field_x.a((byte) -57, "ct_midground_04", "basic")) {
                      break L36;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2][3] = rl.a(kd.field_x, "basic", "ct_midground_04", false);
                      break L28;
                    }
                  }
                }
                L37: {
                  if (-9 != (al.field_g ^ -1)) {
                    break L37;
                  } else {
                    if (!kd.field_x.a((byte) 107, "testsurface", "basic")) {
                      break L37;
                    } else {
                      al.field_g = al.field_g + 1;
                      vi.field_R = rl.a(kd.field_x, "basic", "testsurface", false);
                      break L28;
                    }
                  }
                }
                L38: {
                  if (-10 != (al.field_g ^ -1)) {
                    break L38;
                  } else {
                    if (kd.field_x.a((byte) -63, "wz_texture", "basic")) {
                      al.field_g = al.field_g + 1;
                      bc.field_rb = new wk[5];
                      bc.field_rb[0] = rl.a(kd.field_x, "basic", "wz_texture", false);
                      bc.field_rb[4] = bc.field_rb[0];
                      break L28;
                    } else {
                      break L38;
                    }
                  }
                }
                L39: {
                  if (al.field_g != 10) {
                    break L39;
                  } else {
                    if (!kd.field_x.a((byte) -81, "lw_texture", "basic")) {
                      break L39;
                    } else {
                      al.field_g = al.field_g + 1;
                      bc.field_rb[1] = rl.a(kd.field_x, "basic", "lw_texture", false);
                      break L28;
                    }
                  }
                }
                L40: {
                  if (11 != al.field_g) {
                    break L40;
                  } else {
                    if (!kd.field_x.a((byte) -113, "ct_texture", "basic")) {
                      break L40;
                    } else {
                      al.field_g = al.field_g + 1;
                      bc.field_rb[2] = rl.a(kd.field_x, "basic", "ct_texture", false);
                      break L28;
                    }
                  }
                }
                if ((al.field_g ^ -1) != -13) {
                  break L28;
                } else {
                  if (!kd.field_x.a((byte) 127, "mn_texture", "basic")) {
                    break L28;
                  } else {
                    al.field_g = al.field_g + 1;
                    bc.field_rb[3] = rl.a(kd.field_x, "basic", "mn_texture", false);
                    break L28;
                  }
                }
              }
              L41: {
                if (13 == al.field_g) {
                  kd.field_x = null;
                  cb.field_l = cb.field_l + 1;
                  al.field_g = 0;
                  break L41;
                } else {
                  break L41;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          return;
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
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.TA(" + param0 + 41);
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (pl.field_S == null) {
                break L0;
              } else {
                rc.a(0, pl.field_S);
                pl.field_S = null;
                cc.j(0);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
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
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ti.d(7094);
                        if (null != wb.field_c) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ub.c(0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = 21 % ((param0 - 34) / 48);
                        ao.h(0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var2, "SteelSentinels.LA(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((SteelSentinels) this).a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.init()");
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int[][] var5 = null;
        int var5_int = 0;
        mb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_117_0 = false;
        boolean stackIn_121_0 = false;
        boolean stackIn_133_0 = false;
        Object stackIn_141_0 = null;
        boolean stackIn_157_0 = false;
        boolean stackIn_171_0 = false;
        int stackIn_178_0 = 0;
        int stackIn_182_0 = 0;
        boolean stackIn_198_0 = false;
        int stackIn_218_0 = 0;
        nb stackIn_272_0 = null;
        nb stackIn_272_1 = null;
        int stackIn_272_2 = 0;
        int stackIn_272_3 = 0;
        int stackIn_272_4 = 0;
        String[] stackIn_272_5 = null;
        int stackIn_272_6 = 0;
        int stackIn_272_7 = 0;
        int[][] stackIn_272_8 = null;
        nb stackIn_274_0 = null;
        nb stackIn_274_1 = null;
        int stackIn_274_2 = 0;
        int stackIn_274_3 = 0;
        int stackIn_274_4 = 0;
        String[] stackIn_274_5 = null;
        int stackIn_274_6 = 0;
        int stackIn_274_7 = 0;
        int[][] stackIn_274_8 = null;
        nb stackIn_275_0 = null;
        nb stackIn_275_1 = null;
        int stackIn_275_2 = 0;
        int stackIn_275_3 = 0;
        int stackIn_275_4 = 0;
        String[] stackIn_275_5 = null;
        int stackIn_275_6 = 0;
        int stackIn_275_7 = 0;
        int[][] stackIn_275_8 = null;
        int stackIn_275_9 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_116_0 = false;
        boolean stackOut_120_0 = false;
        boolean stackOut_132_0 = false;
        Object stackOut_140_0 = null;
        boolean stackOut_156_0 = false;
        boolean stackOut_170_0 = false;
        int stackOut_177_0 = 0;
        int stackOut_181_0 = 0;
        boolean stackOut_197_0 = false;
        int stackOut_217_0 = 0;
        nb stackOut_271_0 = null;
        nb stackOut_271_1 = null;
        int stackOut_271_2 = 0;
        int stackOut_271_3 = 0;
        int stackOut_271_4 = 0;
        String[] stackOut_271_5 = null;
        int stackOut_271_6 = 0;
        int stackOut_271_7 = 0;
        int[][] stackOut_271_8 = null;
        nb stackOut_272_0 = null;
        nb stackOut_272_1 = null;
        int stackOut_272_2 = 0;
        int stackOut_272_3 = 0;
        int stackOut_272_4 = 0;
        String[] stackOut_272_5 = null;
        int stackOut_272_6 = 0;
        int stackOut_272_7 = 0;
        int[][] stackOut_272_8 = null;
        int stackOut_272_9 = 0;
        nb stackOut_274_0 = null;
        nb stackOut_274_1 = null;
        int stackOut_274_2 = 0;
        int stackOut_274_3 = 0;
        int stackOut_274_4 = 0;
        String[] stackOut_274_5 = null;
        int stackOut_274_6 = 0;
        int stackOut_274_7 = 0;
        int[][] stackOut_274_8 = null;
        int stackOut_274_9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wh.a(false);
                        if (in.field_h == in.field_i) {
                            statePc = 63;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((bg.field_G ^ -1) == (in.field_i ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (de.field_f != in.field_i) {
                            statePc = 44;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!ni.b(12)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null == lc.field_c) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        pa.a(3, (byte) -114, lc.field_c);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        gf.c(-128);
                        vb.field_g = ji.field_i;
                        if (!si.field_y) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        si.field_y = false;
                        ag.a(-4, false);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (d.a(vb.field_g, 0)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ol.b(true);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        in.field_i = ik.field_b;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ji.field_a = ji.field_a - 1;
                        if ((ji.field_a ^ -1) != -1) {
                            statePc = 224;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        in.field_i = in.field_h;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ji.field_a = ji.field_a + 1;
                        if (ji.field_a == 16) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (si.field_y) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        bb.a((byte) 113);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ef.a(param0 ^ 116);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        in.field_i = de.field_f;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var3_int = 0;
                        var4 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!param1) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((vb.field_g ^ -1) != (pm.field_T ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (pm.field_T != -1) {
                            statePc = 86;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (bg.field_H) {
                            statePc = 84;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (null == fk.field_i) {
                            statePc = 115;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        fk.field_i.c(-68, true);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!dl.f(22759)) {
                            statePc = 115;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        fk.field_i.g(97);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var4 = 1;
                        var3_int = 1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (pm.field_T != -2) {
                            statePc = 103;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (null == ih.field_s) {
                            statePc = 101;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (null == hl.a((byte) -66)) {
                            statePc = 101;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ih.field_s.b((byte) 27);
                        var5_ref = (mb) (Object) ih.field_s.field_K.e(13058);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (null == var5_ref) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var5_ref.field_vb = 0;
                        var5_ref = (mb) (Object) ih.field_s.field_K.a((byte) -80);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var3_int = 1;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (!d.a(pm.field_T, param0 ^ 120)) {
                            statePc = 115;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        i.field_e[pm.field_T].b(true);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        pm.field_U = pm.field_U + 1;
                        if (pm.field_U != 20) {
                            statePc = 115;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        ol.b(true);
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!bg.field_H) {
                            statePc = 197;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = rc.field_n;
                        stackIn_117_0 = stackOut_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (stackIn_117_0) {
                            statePc = 197;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = da.field_d;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (!stackIn_121_0) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (!ob.field_y) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!jn.field_g) {
                            statePc = 131;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var3_int = 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        la.a(13, var3_int != 0);
                        if (ee.field_G) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = ob.field_y;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (!stackIn_133_0) {
                            statePc = 139;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ue.a((byte) 38, var4 != 0, 320, 180);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (!ee.field_G) {
                            statePc = 147;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = null;
                        stackIn_141_0 = stackOut_140_0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (stackIn_141_0 != (Object) (Object) si.field_A) {
                            statePc = 146;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        si.field_A.c(param0 ^ 37, var4 != 0);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (!ob.field_y) {
                            statePc = 151;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        fk.field_i.c(-121, var4 != 0);
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (!dl.f(22759)) {
                            statePc = 197;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (!vl.field_v) {
                            statePc = 167;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (ob.field_y) {
                            statePc = 160;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackOut_156_0 = ee.field_G;
                        stackIn_157_0 = stackOut_156_0;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (!stackIn_157_0) {
                            statePc = 166;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (!cn.a(13, 15, 12, false)) {
                            statePc = 188;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        boolean discarded$2 = cj.a(13, (byte) 99, 12, 15);
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (ob.field_y) {
                            statePc = 174;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = ee.field_G;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (!stackIn_171_0) {
                            statePc = 188;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (jn.field_g) {
                            statePc = 187;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackOut_177_0 = ei.field_q;
                        stackIn_178_0 = stackOut_177_0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if ((stackIn_178_0 ^ -1) == -81) {
                            statePc = 187;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackOut_181_0 = -11;
                        stackIn_182_0 = stackOut_181_0;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (stackIn_182_0 == (ei.field_q ^ -1)) {
                            statePc = 187;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (cn.a(13, 15, 12, false)) {
                            statePc = 151;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (jn.field_g) {
                            statePc = 151;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (!ee.field_G) {
                            statePc = 195;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        si.field_A.g(73);
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (!ob.field_y) {
                            statePc = 151;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        fk.field_i.g(51);
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        stackOut_197_0 = bg.field_H;
                        stackIn_198_0 = stackOut_197_0;
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        if (stackIn_198_0) {
                            statePc = 202;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        jk.d((byte) -66);
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (vl.field_v) {
                            statePc = 209;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if ((on.field_i ^ -1) < -1) {
                            statePc = 208;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        on.field_i = on.field_i - 1;
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (on.field_i >= an.field_h) {
                            statePc = 215;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        on.field_i = on.field_i + 1;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        var5_int = an.field_h * an.field_h;
                        var6 = var5_int - on.field_i * on.field_i;
                        var7 = vf.field_e + 120 * var6 / var5_int;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        ji.d(0, var7);
                        if (bd.field_b.e(13058) == null) {
                            statePc = 224;
                        } else {
                            statePc = 217;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        stackOut_217_0 = ob.field_o;
                        stackIn_218_0 = stackOut_217_0;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        ob.field_o = stackIn_218_0 + 1;
                        if (stackIn_218_0 + 1 == 500) {
                            statePc = 223;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        ob.field_o = 0;
                        ck discarded$3 = bd.field_b.a(true);
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (param0 == 120) {
                            statePc = 228;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        this.m(-19);
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        if (2 == (vb.field_g ^ -1)) {
                            statePc = 231;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        lc.field_c = null;
                        var3_ref = g.field_l;
                        var4_ref_String__ = new String[]{var3_ref};
                        var5 = new int[var4_ref_String__.length][];
                        var5[0] = uc.field_b;
                        var6 = 1;
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        if (var6 >= var4_ref_String__.length) {
                            statePc = 236;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        var5[var6] = uc.field_b;
                        var6++;
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        var6 = 0;
                        var7 = di.field_g;
                        statePc = 237;
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        if (0 == var7) {
                            statePc = 264;
                        } else {
                            statePc = 238;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 240;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        if (var7 == 1) {
                            statePc = 265;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        if (7 == var7) {
                            statePc = 266;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        if (-5 != (var7 ^ -1)) {
                            statePc = 250;
                        } else {
                            statePc = 245;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 252;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        if (-4 == (var7 ^ -1)) {
                            statePc = 268;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        if (-6 == (var7 ^ -1)) {
                            statePc = 268;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        if (var7 == 10) {
                            statePc = 269;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        if (var7 == -1) {
                            statePc = 270;
                        } else {
                            statePc = 260;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        var5[0] = ua.field_v;
                        var6 = 16;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        var5[0] = ua.field_v;
                        var6 = 16;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        var6 = 16;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        var6 = 16;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        var5[0] = ua.field_C[ol.field_Ub + 10 * ge.field_j];
                        var6 = 16;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        var6 = ua.field_t[10 * ge.field_j - -ol.field_Ub][1];
                        var5[0] = ua.field_C[ol.field_Ub + ge.field_j * 10];
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        var6 = 0;
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        vl.field_v = false;
                        jn.field_g = false;
                        stackOut_271_0 = null;
                        stackOut_271_1 = null;
                        stackOut_271_2 = 0;
                        stackOut_271_3 = var6;
                        stackOut_271_4 = 1;
                        stackOut_271_5 = (String[]) var4_ref_String__;
                        stackOut_271_6 = 0;
                        stackOut_271_7 = 0;
                        stackOut_271_8 = (int[][]) var5;
                        stackIn_274_0 = stackOut_271_0;
                        stackIn_274_1 = stackOut_271_1;
                        stackIn_274_2 = stackOut_271_2;
                        stackIn_274_3 = stackOut_271_3;
                        stackIn_274_4 = stackOut_271_4;
                        stackIn_274_5 = stackOut_271_5;
                        stackIn_274_6 = stackOut_271_6;
                        stackIn_274_7 = stackOut_271_7;
                        stackIn_274_8 = stackOut_271_8;
                        stackIn_272_0 = stackOut_271_0;
                        stackIn_272_1 = stackOut_271_1;
                        stackIn_272_2 = stackOut_271_2;
                        stackIn_272_3 = stackOut_271_3;
                        stackIn_272_4 = stackOut_271_4;
                        stackIn_272_5 = stackOut_271_5;
                        stackIn_272_6 = stackOut_271_6;
                        stackIn_272_7 = stackOut_271_7;
                        stackIn_272_8 = stackOut_271_8;
                        if (-1 != di.field_g) {
                            statePc = 274;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        stackOut_272_0 = null;
                        stackOut_272_1 = null;
                        stackOut_272_2 = stackIn_272_2;
                        stackOut_272_3 = stackIn_272_3;
                        stackOut_272_4 = stackIn_272_4;
                        stackOut_272_5 = (String[]) (Object) stackIn_272_5;
                        stackOut_272_6 = stackIn_272_6;
                        stackOut_272_7 = stackIn_272_7;
                        stackOut_272_8 = (int[][]) (Object) stackIn_272_8;
                        stackOut_272_9 = 3;
                        stackIn_275_0 = stackOut_272_0;
                        stackIn_275_1 = stackOut_272_1;
                        stackIn_275_2 = stackOut_272_2;
                        stackIn_275_3 = stackOut_272_3;
                        stackIn_275_4 = stackOut_272_4;
                        stackIn_275_5 = stackOut_272_5;
                        stackIn_275_6 = stackOut_272_6;
                        stackIn_275_7 = stackOut_272_7;
                        stackIn_275_8 = stackOut_272_8;
                        stackIn_275_9 = stackOut_272_9;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = null;
                        stackOut_274_1 = null;
                        stackOut_274_2 = stackIn_274_2;
                        stackOut_274_3 = stackIn_274_3;
                        stackOut_274_4 = stackIn_274_4;
                        stackOut_274_5 = (String[]) (Object) stackIn_274_5;
                        stackOut_274_6 = stackIn_274_6;
                        stackOut_274_7 = stackIn_274_7;
                        stackOut_274_8 = (int[][]) (Object) stackIn_274_8;
                        stackOut_274_9 = 0;
                        stackIn_275_0 = stackOut_274_0;
                        stackIn_275_1 = stackOut_274_1;
                        stackIn_275_2 = stackOut_274_2;
                        stackIn_275_3 = stackOut_274_3;
                        stackIn_275_4 = stackOut_274_4;
                        stackIn_275_5 = stackOut_274_5;
                        stackIn_275_6 = stackOut_274_6;
                        stackIn_275_7 = stackOut_274_7;
                        stackIn_275_8 = stackOut_274_8;
                        stackIn_275_9 = stackOut_274_9;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        new nb(stackIn_275_2 != 0, stackIn_275_3, stackIn_275_4, stackIn_275_5, stackIn_275_6, stackIn_275_7 != 0, stackIn_275_8, stackIn_275_9, 2, false, false);
                        fk.field_i = stackIn_275_0;
                        var7 = nk.field_B ? 1 : 0;
                        q.a(-1, var7 != 0, -1, 0);
                        ea.field_k = true;
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        if (-4 != vb.field_g) {
                            statePc = 283;
                        } else {
                            statePc = 277;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        mm.field_g.a(63, (byte) -117);
                        mm.field_g.field_p = mm.field_g.field_p + 1;
                        var3_int = mm.field_g.field_p;
                        mm.field_g.a((byte) 124, uc.field_b.length);
                        var4 = 0;
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        if (var4 >= uc.field_b.length) {
                            statePc = 282;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        mm.field_g.a((byte) 127, uc.field_b[var4]);
                        var4++;
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        mm.field_g.b((byte) 111, mm.field_g.field_p - var3_int);
                        mm.field_g.a(9, (byte) -117);
                        rc.field_n = true;
                        vb.field_g = pm.field_T;
                        on.field_i = an.field_h;
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        if ((vb.field_g ^ -1) == 4) {
                            statePc = 286;
                        } else {
                            statePc = 284;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        na.a((byte) -43, 11, nf.field_b.j(-26));
                        da.field_d = true;
                        vb.field_g = pm.field_T;
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 288: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var3, "SteelSentinels.SA(" + param0 + 44 + param1 + 41);
                }
                case 289: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((SteelSentinels) this).a(14, false, 5000, 71, 1, 0, 4, 2);
                        var2 = new ic();
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var2.b(128, (byte) -123, 9);
                        qm.a(-31, hb.field_i, 22050, var2, true, (java.awt.Component) (Object) sl.field_n);
                        ((SteelSentinels) this).a(1, true, true, false, true, true, false);
                        ad.field_d = n.field_s;
                        m.field_b = pl.field_ab;
                        f.field_B[66] = 1;
                        f.field_B[61] = 1;
                        f.field_B[67] = 32;
                        gl.field_x = qg.field_j;
                        if (param0 == 26689) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((SteelSentinels) this).c(-47);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var2_ref, "SteelSentinels.W(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
        cf var2 = null;
        int var2_int = 0;
        na var2_ref = null;
        int[] var2_array = null;
        int var3 = 0;
        String var3_ref = null;
        int[] var3_ref_int__ = null;
        String var4_ref = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
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
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_134_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_176_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        L0: {
          var15 = field_G;
          int discarded$3 = ub.b(-108);
          kg.field_Vb = ha.a((byte) -86);
          vk.a(false);
          if (wb.field_c == null) {
            break L0;
          } else {
            if (!wb.field_c.field_b) {
              break L0;
            } else {
              ub.c(param0 + -2);
              og.a(-5213);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 2) {
            break L1;
          } else {
            ((SteelSentinels) this).init();
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = this;
          stackOut_6_1 = 5;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (wb.field_c == null) {
            stackOut_8_0 = this;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        L3: {
          ((SteelSentinels) this).a(stackIn_9_1, stackIn_9_2 != 0);
          if (!rm.field_f) {
            break L3;
          } else {
            this.m(105);
            rm.field_f = false;
            break L3;
          }
        }
        L4: {
          a.field_c = a.field_c + 1;
          if (!ol.j(0)) {
            break L4;
          } else {
            ((SteelSentinels) this).k(113);
            if (!ol.j(0)) {
              break L4;
            } else {
              return;
            }
          }
        }
        L5: {
          r.a(jj.field_d, (byte) 104);
          if (this.k((byte) -52)) {
            gh.field_pb = true;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (ni.b(92)) {
            break L6;
          } else {
            L7: while (true) {
              var2 = (cf) (Object) un.field_b.a(true);
              if (var2 != null) {
                r.a(4, (byte) 123, var2);
                continue L7;
              } else {
                break L6;
              }
            }
          }
        }
        L8: {
          if (ni.b(74)) {
            break L8;
          } else {
            if (jb.field_P != 0) {
              ef.a((byte) -109);
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: while (true) {
          if (!rl.a((byte) 54, f.field_B)) {
            L10: {
              gj.a(0, 0);
              if (-2 != pm.field_T) {
                break L10;
              } else {
                if ((vb.field_g ^ -1) != 1) {
                  break L10;
                } else {
                  vl.field_v = true;
                  break L10;
                }
              }
            }
            L11: {
              if (!vl.field_v) {
                break L11;
              } else {
                ln.field_e = 0;
                break L11;
              }
            }
            L12: {
              if (ri.a(16731221)) {
                L13: {
                  L14: {
                    var2_int = ((SteelSentinels) this).i((byte) -112);
                    if (0 == var2_int) {
                      break L14;
                    } else {
                      if ((var2_int ^ -1) != -2) {
                        break L13;
                      } else {
                        break L14;
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
                    break L13;
                  } else {
                    L15: {
                      if (!bg.field_H) {
                        break L15;
                      } else {
                        L16: {
                          ob.field_y = false;
                          ea.field_k = false;
                          ee.field_G = false;
                          lc.field_e = true;
                          jc.field_d = true;
                          if (ob.field_y) {
                            ll.field_s = rl.field_e;
                            q.a(11, false, -1, 0);
                            break L16;
                          } else {
                            q.a(0, false, param0 + -3, 0);
                            break L16;
                          }
                        }
                        ol.b(true);
                        i.field_e[pm.field_T].a(false, 0, -102);
                        bg.field_H = false;
                        vn.c(12);
                        break L15;
                      }
                    }
                    rc.field_n = false;
                    da.field_d = false;
                    break L13;
                  }
                }
                L17: {
                  var3 = 0;
                  if (-3 != (var2_int ^ -1)) {
                    break L17;
                  } else {
                    var3 = 1;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    if (bg.field_H) {
                      break L19;
                    } else {
                      if (rc.field_n) {
                        break L19;
                      } else {
                        if (!da.field_d) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  var3 = 1;
                  break L18;
                }
                L20: {
                  if (!ri.a(16731221)) {
                    var3 = 0;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (var3 == 0) {
                  break L12;
                } else {
                  of.a(10);
                  break L12;
                }
              } else {
                break L12;
              }
            }
            return;
          } else {
            if (ch.field_N != 9) {
              if (-15 == (ch.field_N ^ -1)) {
                L21: {
                  ol.b(true);
                  jj.field_i = nf.a(uc.field_b, h.field_G, (byte) 44);
                  kc.field_w[1] = (byte) 0;
                  if (-1 == (jj.field_i & rc.field_o[1][kc.field_w[1]] ^ -1)) {
                    kc.field_w[1] = (byte) 1;
                    if ((rd.field_b ^ -1) >= -1) {
                      break L21;
                    } else {
                      kc.field_w[1] = (byte) 2;
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-1 != (kc.field_w[1] ^ -1)) {
                    break L22;
                  } else {
                    v.field_b[0] = 4;
                    break L22;
                  }
                }
                L23: {
                  if (1 != kc.field_w[1]) {
                    break L23;
                  } else {
                    v.field_b[0] = 6;
                    break L23;
                  }
                }
                L24: {
                  if (kc.field_w[1] == 2) {
                    v.field_b[0] = 12;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                sg.a(ge.a(2000, (byte) -32), nl.field_db.length, tm.a((byte) 50), 1024, ge.a(12, (byte) -32), nj.a((byte) -127), ti.field_u, (byte) -22, ic.f(3443), 150);
                nh.a((byte) -98, tc.d(800), wn.b((byte) 121));
                rc.field_n = false;
                vb.field_g = -2;
                bg.field_H = true;
                continue L9;
              } else {
                if (-16 == (ch.field_N ^ -1)) {
                  L25: {
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
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  da.field_d = false;
                  rc.field_n = false;
                  continue L9;
                } else {
                  L26: {
                    if (ch.field_N != 10) {
                      break L26;
                    } else {
                      if (bg.field_H) {
                        in.a(11247);
                        continue L9;
                      } else {
                        break L26;
                      }
                    }
                  }
                  if ((ch.field_N ^ -1) == -81) {
                    var2_int = rf.field_d.f((byte) -123);
                    var3 = (byte)(255 & rf.field_d.f((byte) -123));
                    if (null == nf.field_b) {
                      continue L9;
                    } else {
                      if (0 == var2_int) {
                        nf.field_b.field_Ub = var3;
                        v.field_b[0] = var3;
                        continue L9;
                      } else {
                        nf.field_b.field_Sb[var2_int] = (byte) var3;
                        continue L9;
                      }
                    }
                  } else {
                    if (ch.field_N != 11) {
                      if (-13 == (ch.field_N ^ -1)) {
                        na discarded$4 = eb.a((byte) -127, true);
                        bg.a(new na(true), -93);
                        continue L9;
                      } else {
                        if (ch.field_N != 67) {
                          if ((ch.field_N ^ -1) != -61) {
                            if ((ch.field_N ^ -1) == -78) {
                              var2_int = rf.field_d.f((byte) -123);
                              ee.field_S = new int[var2_int];
                              var3 = 0;
                              L27: while (true) {
                                if (var2_int <= var3) {
                                  continue L9;
                                } else {
                                  ee.field_S[var3] = rf.field_d.f((byte) -123);
                                  var3++;
                                  continue L27;
                                }
                              }
                            } else {
                              if (-79 == (ch.field_N ^ -1)) {
                                var2_int = 0;
                                L28: while (true) {
                                  if ((var2_int ^ -1) <= -4) {
                                    var2_int = 0;
                                    L29: while (true) {
                                      if ((jh.field_a.length ^ -1) >= (var2_int ^ -1)) {
                                        L30: {
                                          if ((16 & fm.field_f[0]) == 0) {
                                            stackOut_133_0 = 0;
                                            stackIn_134_0 = stackOut_133_0;
                                            break L30;
                                          } else {
                                            stackOut_132_0 = 1;
                                            stackIn_134_0 = stackOut_132_0;
                                            break L30;
                                          }
                                        }
                                        L31: {
                                          var2_int = stackIn_134_0;
                                          fm.field_f[0] = ec.a(fm.field_f[0], 15);
                                          if (fj.field_d > fm.field_f[0]) {
                                            jc.field_f = 0;
                                            break L31;
                                          } else {
                                            if (var2_int != 0) {
                                              jc.field_f = 2;
                                              break L31;
                                            } else {
                                              jc.field_f = 1;
                                              break L31;
                                            }
                                          }
                                        }
                                        if (gi.h((byte) -79)) {
                                          km.field_a = ee.field_k;
                                          continue L9;
                                        } else {
                                          continue L9;
                                        }
                                      } else {
                                        jh.field_a[var2_int] = rf.field_d.c((byte) -60);
                                        var2_int++;
                                        continue L29;
                                      }
                                    }
                                  } else {
                                    fm.field_f[var2_int] = rf.field_d.f((byte) -65);
                                    var2_int++;
                                    continue L28;
                                  }
                                }
                              } else {
                                if ((ch.field_N ^ -1) != -74) {
                                  if ((ch.field_N ^ -1) == -73) {
                                    var2_int = rf.field_d.c((byte) -60);
                                    li.field_v = li.field_v + var2_int;
                                    if (var2_int <= 0) {
                                      continue L9;
                                    } else {
                                      vn.d(param0 + -44);
                                      hj.field_F = var2_int;
                                      continue L9;
                                    }
                                  } else {
                                    L32: {
                                      if (ch.field_N == 74) {
                                        break L32;
                                      } else {
                                        if (79 == ch.field_N) {
                                          break L32;
                                        } else {
                                          if (ch.field_N == 70) {
                                            int discarded$5 = rf.field_d.f((byte) -67);
                                            continue L9;
                                          } else {
                                            L33: {
                                              if (-58 == (ch.field_N ^ -1)) {
                                                break L33;
                                              } else {
                                                if ((ch.field_N ^ -1) == -59) {
                                                  break L33;
                                                } else {
                                                  if (ch.field_N == 59) {
                                                    L34: {
                                                      L35: {
                                                        if (ob.field_y) {
                                                          break L35;
                                                        } else {
                                                          if (ee.field_G) {
                                                            break L35;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                      L36: {
                                                        ol.b(true);
                                                        if (!ob.field_y) {
                                                          break L36;
                                                        } else {
                                                          fk.field_i.a((byte) -128, false);
                                                          break L36;
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
                                                      break L34;
                                                    }
                                                    da.field_d = false;
                                                    continue L9;
                                                  } else {
                                                    L37: {
                                                      var2_array = null;
                                                      if (!ob.field_y) {
                                                        if (!ee.field_G) {
                                                          break L37;
                                                        } else {
                                                          var2_ref = (na) (Object) si.field_A;
                                                          break L37;
                                                        }
                                                      } else {
                                                        var2_ref = (na) (Object) fk.field_i;
                                                        break L37;
                                                      }
                                                    }
                                                    L38: {
                                                      if (null != var2_ref) {
                                                        if (ch.field_N != 61) {
                                                          if ((ch.field_N ^ -1) != -70) {
                                                            if (-77 != (ch.field_N ^ -1)) {
                                                              if ((ch.field_N ^ -1) == -72) {
                                                                L39: {
                                                                  if (((nb) (Object) var2_ref).field_i + -100 <= ((nb) (Object) var2_ref).field_w) {
                                                                    break L39;
                                                                  } else {
                                                                    if (((nb) (Object) var2_ref).field_X.field_r >= ((nb) (Object) var2_ref).field_w) {
                                                                      break L39;
                                                                    } else {
                                                                      ((nb) (Object) var2_ref).field_w = -100 + ((nb) (Object) var2_ref).field_i;
                                                                      break L39;
                                                                    }
                                                                  }
                                                                }
                                                                ((nb) (Object) var2_ref).field_i = rf.field_d.i(param0 ^ 2);
                                                                var3 = rf.field_d.i(0);
                                                                var4 = rf.field_d.i(param0 + -2);
                                                                if ((((nb) (Object) var2_ref).field_l ^ -1) > (((nb) (Object) var2_ref).field_X.field_r ^ -1)) {
                                                                  ((nb) (Object) var2_ref).field_j = var3;
                                                                  ((nb) (Object) var2_ref).field_l = var4;
                                                                  continue L9;
                                                                } else {
                                                                  continue L9;
                                                                }
                                                              } else {
                                                                if (62 == ch.field_N) {
                                                                  ((nb) (Object) var2_ref).field_i = rf.field_d.i(0);
                                                                  ((nb) (Object) var2_ref).field_z = true;
                                                                  continue L9;
                                                                } else {
                                                                  if (-64 != (ch.field_N ^ -1)) {
                                                                    if (-65 != (ch.field_N ^ -1)) {
                                                                      if ((ch.field_N ^ -1) != -66) {
                                                                        if (66 == ch.field_N) {
                                                                          ((nb) (Object) var2_ref).field_N = rf.field_d.f((byte) -85);
                                                                          if (null == fk.field_i) {
                                                                            continue L9;
                                                                          } else {
                                                                            h.i(-1);
                                                                            continue L9;
                                                                          }
                                                                        } else {
                                                                          break L38;
                                                                        }
                                                                      } else {
                                                                        ((nb) (Object) var2_ref).field_X.field_X = rf.field_d.f((byte) -91);
                                                                        if (null == fk.field_i) {
                                                                          continue L9;
                                                                        } else {
                                                                          h.i(-1);
                                                                          continue L9;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      ((nb) (Object) var2_ref).field_X.field_hb = rf.field_d.f((byte) -111);
                                                                      continue L9;
                                                                    }
                                                                  } else {
                                                                    ((nb) (Object) var2_ref).field_X.field_V = rf.field_d.f((byte) -92);
                                                                    if (null == fk.field_i) {
                                                                      continue L9;
                                                                    } else {
                                                                      in.c(2);
                                                                      continue L9;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3 = rf.field_d.f((byte) -120);
                                                              var4 = rf.field_d.i(0);
                                                              ((nb) (Object) var2_ref).field_X.a(var4, 28669, var3);
                                                              continue L9;
                                                            }
                                                          } else {
                                                            L40: {
                                                              var3 = rf.field_d.f((byte) -85);
                                                              var4 = rf.field_d.f((byte) -80);
                                                              var5 = rf.field_d.f((byte) -120);
                                                              var6 = rf.field_d.i(0);
                                                              var7 = rf.field_d.i(0);
                                                              var8 = rf.field_d.i(param0 ^ 2);
                                                              var9 = rf.field_d.i(param0 ^ 2);
                                                              if (var5 == 255) {
                                                                var5 = -1;
                                                                break L40;
                                                              } else {
                                                                break L40;
                                                              }
                                                            }
                                                            L41: {
                                                              var10_ref = new je(var4, var5, var6);
                                                              var10_ref.field_B = var9;
                                                              var10_ref.field_u = var7;
                                                              var10_ref.field_y = var8;
                                                              var11 = ((nb) (Object) var2_ref).field_X.f(var3, -128);
                                                              if ((var4 ^ -1) == -11) {
                                                                break L41;
                                                              } else {
                                                                break L41;
                                                              }
                                                            }
                                                            if (null != var11) {
                                                              var11.d((byte) 79, var10_ref);
                                                              continue L9;
                                                            } else {
                                                              continue L9;
                                                            }
                                                          }
                                                        } else {
                                                          L42: {
                                                            var3 = rf.field_d.f((byte) -117);
                                                            var4_ref = (String) (Object) ((nb) (Object) var2_ref).field_X.f(var3, -128);
                                                            var5_ref_je = (je) (Object) ((mb) (Object) var4_ref).field_Ec.b(1063677678);
                                                            if (var5_ref_je != null) {
                                                              var5_ref_je.b(param0 ^ 6);
                                                              break L42;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                          var5_ref_je = (je) (Object) ((mb) (Object) var4_ref).field_B.b(1063677678);
                                                          if (var5_ref_je != null) {
                                                            var5_ref_je.b(4);
                                                            continue L9;
                                                          } else {
                                                            continue L9;
                                                          }
                                                        }
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    ((SteelSentinels) this).h(param0 + 50);
                                                    continue L9;
                                                  }
                                                }
                                              }
                                            }
                                            L43: {
                                              ol.b(true);
                                              var2_int = rf.field_d.i(param0 + -2);
                                              var3 = rf.field_d.f((byte) -110);
                                              var4 = rf.field_d.f((byte) -74);
                                              var5 = rf.field_d.f((byte) -90);
                                              var6 = rf.field_d.f((byte) -102);
                                              if (-1 == (var6 & 1 ^ -1)) {
                                                stackOut_169_0 = 0;
                                                stackIn_170_0 = stackOut_169_0;
                                                break L43;
                                              } else {
                                                stackOut_168_0 = 1;
                                                stackIn_170_0 = stackOut_168_0;
                                                break L43;
                                              }
                                            }
                                            L44: {
                                              var7 = stackIn_170_0;
                                              if ((2 & var6) == 0) {
                                                stackOut_172_0 = 0;
                                                stackIn_173_0 = stackOut_172_0;
                                                break L44;
                                              } else {
                                                stackOut_171_0 = 1;
                                                stackIn_173_0 = stackOut_171_0;
                                                break L44;
                                              }
                                            }
                                            L45: {
                                              var8 = stackIn_173_0;
                                              if (0 == rf.field_d.f((byte) -81)) {
                                                stackOut_175_0 = 0;
                                                stackIn_176_0 = stackOut_175_0;
                                                break L45;
                                              } else {
                                                stackOut_174_0 = 1;
                                                stackIn_176_0 = stackOut_174_0;
                                                break L45;
                                              }
                                            }
                                            var9 = stackIn_176_0;
                                            var10 = new String[rf.field_d.f((byte) -90)];
                                            var11_int = -2;
                                            var12 = new int[var10.length][];
                                            var13_int = 0;
                                            L46: while (true) {
                                              if ((var13_int ^ -1) <= (var10.length ^ -1)) {
                                                L47: {
                                                  var11_int = rf.field_d.d((byte) -2);
                                                  di.field_g = -1;
                                                  qh.field_Yb = -2;
                                                  jn.field_g = false;
                                                  vl.field_v = false;
                                                  lc.field_c = null;
                                                  if (-1 != var11_int) {
                                                    break L47;
                                                  } else {
                                                    var11_int = -2;
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  var13 = new nb(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                                                  var13.field_w = rf.field_d.i(0);
                                                  if (57 == ch.field_N) {
                                                    fk.field_i = var13;
                                                    ob.field_y = true;
                                                    in.c(2);
                                                    h.i(-1);
                                                    ol.l(0);
                                                    break L48;
                                                  } else {
                                                    si.field_A = var13;
                                                    ee.field_G = true;
                                                    ol.l(0);
                                                    break L48;
                                                  }
                                                }
                                                vb.field_g = -1;
                                                da.field_d = false;
                                                ea.field_k = true;
                                                continue L9;
                                              } else {
                                                var10[var13_int] = rf.field_d.e((byte) 126);
                                                var12[var13_int] = new int[rf.field_d.f((byte) -63)];
                                                var14 = 0;
                                                L49: while (true) {
                                                  if (var14 >= var12[var13_int].length) {
                                                    var13_int++;
                                                    continue L46;
                                                  } else {
                                                    L50: {
                                                      var12[var13_int][var14] = rf.field_d.f((byte) -123);
                                                      if ((var12[var13_int][var14] ^ -1) != -256) {
                                                        break L50;
                                                      } else {
                                                        var12[var13_int][var14] = -1;
                                                        break L50;
                                                      }
                                                    }
                                                    var14++;
                                                    continue L49;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L51: {
                                      var2_int = rf.field_d.f((byte) -113);
                                      var3_ref = qg.field_o;
                                      if (79 == ch.field_N) {
                                        var3_ref = c.field_r;
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                    bd.field_b.a(3, (ck) (Object) new ai((wk) null, db.a(var3_ref, -105, new String[1])));
                                    continue L9;
                                  }
                                } else {
                                  L52: {
                                    var2_int = rf.field_d.f((byte) -63) + -1;
                                    var3 = rf.field_d.i(0);
                                    var4 = rf.field_d.i(0);
                                    var5 = rf.field_d.i(0);
                                    var6 = rf.field_d.i(0);
                                    var7 = rf.field_d.i(0);
                                    if (-3 < (var2_int ^ -1)) {
                                      lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int + 0, new int[1], 3);
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                  qi.field_d = null;
                                  qm.a(true);
                                  bd.field_b.a(3, (ck) (Object) new ai((wk) null, db.a(vm.field_q, param0 + -102, new String[1])));
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            li.field_v = rf.field_d.i(0);
                            h.field_G = rf.field_d.i(0);
                            var2_int = 0;
                            L53: while (true) {
                              if (var2_int >= 4) {
                                var2_int = 0;
                                L54: while (true) {
                                  if (2 <= var2_int) {
                                    var2_int = 0;
                                    L55: while (true) {
                                      if ((var2_int ^ -1) <= (va.field_k.length ^ -1)) {
                                        vn.d(-30);
                                        continue L9;
                                      } else {
                                        va.field_k[var2_int] = 0;
                                        var2_int++;
                                        continue L55;
                                      }
                                    }
                                  } else {
                                    fe.field_D[var2_int] = rf.field_d.i(0);
                                    var2_int++;
                                    continue L54;
                                  }
                                }
                              } else {
                                rn.field_D[var2_int] = rf.field_d.i(0);
                                var2_int++;
                                continue L53;
                              }
                            }
                          }
                        } else {
                          var2_array = jg.a(true);
                          var3 = 0;
                          L56: while (true) {
                            if (var3 >= var2_array.length) {
                              var3_ref_int__ = var2_array;
                              var4_ref_int__ = ge.field_m;
                              var5 = 0;
                              L57: while (true) {
                                if (var5 >= 8) {
                                  L58: {
                                    if (!ln.field_h) {
                                      break L58;
                                    } else {
                                      var3_ref_int__ = ce.field_t;
                                      var4_ref_int__ = var2_array;
                                      var5 = 0;
                                      L59: while (true) {
                                        if ((var5 ^ -1) <= -9) {
                                          break L58;
                                        } else {
                                          var3_ref_int__[var5] = vn.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                          var5++;
                                          continue L59;
                                        }
                                      }
                                    }
                                  }
                                  var3_ref_int__ = ge.field_m;
                                  var4_ref_int__ = var2_array;
                                  var5 = 0;
                                  L60: while (true) {
                                    if ((var5 ^ -1) <= -9) {
                                      wl.c((byte) 10);
                                      continue L9;
                                    } else {
                                      var3_ref_int__[var5] = vn.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                      var5++;
                                      continue L60;
                                    }
                                  }
                                } else {
                                  var3_ref_int__[var5] = ec.a(var3_ref_int__[var5], var4_ref_int__[var5] ^ -1);
                                  var5++;
                                  continue L57;
                                }
                              }
                            } else {
                              var2_array[var3] = rf.field_d.i(0);
                              var3++;
                              continue L56;
                            }
                          }
                        }
                      }
                    } else {
                      var2_ref = eb.a((byte) -62, false);
                      bg.a(var2_ref, -92);
                      if (-2 == (m.field_a ^ -1)) {
                        if (fk.field_i != null) {
                          if (ph.field_e != null) {
                            L61: {
                              var3_ref = "";
                              if (null == b.field_g) {
                                break L61;
                              } else {
                                L62: {
                                  var4_ref = b.field_g;
                                  if (be.field_b == 1) {
                                    var4_ref = "<img=0>" + var4_ref;
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                }
                                L63: {
                                  if (2 != be.field_b) {
                                    break L63;
                                  } else {
                                    var4_ref = "<img=1>" + var4_ref;
                                    break L63;
                                  }
                                }
                                var3_ref = var4_ref + ": ";
                                break L61;
                              }
                            }
                            L64: {
                              L65: {
                                var4_ref = var3_ref + mi.a(bg.field_F);
                                if (var2_ref.field_g) {
                                  break L65;
                                } else {
                                  if (!o.a(-122, var2_ref.field_p)) {
                                    break L65;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              bl.a(48127, var4_ref, (byte) 124);
                              ln.field_e = ln.field_e - 1;
                              break L64;
                            }
                            continue L9;
                          } else {
                            continue L9;
                          }
                        } else {
                          continue L9;
                        }
                      } else {
                        continue L9;
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
              continue L9;
            }
          }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
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
                break L0;
              } else {
                ((SteelSentinels) this).a(48);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
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
          ((SteelSentinels) this).field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
