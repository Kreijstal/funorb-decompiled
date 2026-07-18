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
        RuntimeException decompiledCaughtException = null;
        var13 = field_G;
        try {
          var2_ref = gl.a(false);
          if (ol.j(0)) {
            int discarded$2 = 2;
            df.a(-111, var2_ref, qb.g());
            return;
          } else {
            int discarded$3 = -28003;
            en.a(var2_ref);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.EA(" + param0 + ')');
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
        int discarded$59 = 35;
        ec.a();
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
                    wk[] discarded$60 = cf.a("menu_overlays", "basic", (byte) -87, kd.field_x);
                    wd.field_a = nb.a(kd.field_x, (byte) 42, "frame", "basic");
                    km.field_e = nb.a(kd.field_x, (byte) -119, "frame_filled", "basic");
                    ag.field_o = nb.a(kd.field_x, (byte) -60, "button_frame", "basic");
                    vk.field_l = nb.a(kd.field_x, (byte) -122, "button_raised", "basic");
                    ja.field_e = nb.a(kd.field_x, (byte) 36, "button_depressed", "basic");
                    if (ni.b(param0 ^ -44)) {
                      break L1;
                    } else {
                      if (rd.field_b > 0) {
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
                  if (~var3_int <= ~vg.field_h.length) {
                    int discarded$61 = 0;
                    ff.field_tb = rl.a(tm.field_d, "basic", "unachieved");
                    int discarded$62 = 0;
                    ug.field_P = rl.a(tm.field_d, "basic", "locked");
                    int discarded$63 = 0;
                    d.field_G = rl.a(tm.field_d, "basic", "orbcoin");
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
                    int discarded$64 = 0;
                    ao.field_y = rl.a(kd.field_x, "basic", "dropdown_mark");
                    int discarded$65 = 0;
                    ac.field_bb = rl.a(kd.field_x, "basic", "button_cover");
                    var3_int = 0;
                    L3: while (true) {
                      if (~ac.field_bb.field_E.length >= ~var3_int) {
                        int discarded$66 = 0;
                        oa.field_N = rl.a(kd.field_x, "basic", "goldstar");
                        int discarded$67 = 0;
                        td.field_ec = rl.a(kd.field_x, "basic", "silverstar");
                        int discarded$68 = 0;
                        wk discarded$69 = rl.a(kd.field_x, "basic", "starfrigate");
                        int discarded$70 = 0;
                        sb.field_W = rl.a(kd.field_x, "basic", "starcruiser");
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
                          if (~var4_int <= ~ub.field_a.length) {
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
                            int discarded$71 = 0;
                            var3_array[0] = rl.a(kd.field_x, "basic", "instr_giantrobot");
                            int discarded$72 = 0;
                            var3_array[1] = rl.a(kd.field_x, "basic", "instr_queue");
                            int discarded$73 = 0;
                            var3_array[2] = rl.a(kd.field_x, "Basic", "instr_walk");
                            int discarded$74 = 0;
                            var3_array[3] = rl.a(kd.field_x, "basic", "instr_jump");
                            int discarded$75 = 0;
                            var3_array[4] = rl.a(kd.field_x, "basic", "instr_thrust");
                            var3_array[5] = ie.field_d[16].a();
                            int discarded$76 = 0;
                            var3_array[6] = rl.a(kd.field_x, "basic", "instr_selweapon");
                            int discarded$77 = 0;
                            var3_array[7] = rl.a(kd.field_x, "basic", "instr_target");
                            int discarded$78 = 0;
                            var3_array[8] = rl.a(kd.field_x, "basic", "instr_noenergy");
                            var3_array[9] = ie.field_d[32].a();
                            var3_array[10] = ie.field_d[33].a();
                            int discarded$79 = 0;
                            var3_array[11] = rl.a(kd.field_x, "basic", "instr_bigshieldicon");
                            var3_array[12] = ie.field_d[27].a();
                            int discarded$80 = 0;
                            var3_array[13] = rl.a(kd.field_x, "basic", "instr_stats");
                            int discarded$81 = 0;
                            var3_array[14] = rl.a(kd.field_x, "basic", "instr_chassis");
                            int discarded$82 = 0;
                            var3_array[15] = rl.a(kd.field_x, "basic", "instr_components");
                            int discarded$83 = 0;
                            var3_array[16] = rl.a(kd.field_x, "basic", "instr_weapons");
                            int discarded$84 = 0;
                            var3_array[17] = rl.a(kd.field_x, "basic", "instr_modules");
                            int discarded$85 = 0;
                            var3_array[18] = rl.a(kd.field_x, "basic", "instr_engineer");
                            int discarded$86 = 0;
                            var3_array[19] = rl.a(kd.field_x, "basic", "instr_coop");
                            int discarded$87 = 0;
                            var3_array[20] = rl.a(kd.field_x, "basic", "instr_team");
                            int discarded$88 = 0;
                            var3_array[25] = rl.a(kd.field_x, "basic", "instr_techvalue");
                            int discarded$89 = 0;
                            fa.field_b = rl.a(kd.field_x, "basic", "logo_menu_chromakey");
                            ob.field_z = (ek) (Object) dn.a("basic", -63, "main_lower_panel", kd.field_x);
                            ma.field_eb = (ek) (Object) dn.a("basic", param0 ^ 75, "main_title_panel", kd.field_x);
                            int discarded$90 = 0;
                            fi.field_j = rl.a(kd.field_x, "basic", "menu_mesh");
                            int discarded$91 = 0;
                            ic.field_db = rl.a(kd.field_x, "basic", "menu_titlebar");
                            pl.field_T = nb.a(kd.field_x, (byte) -62, "menu_button_1", "basic");
                            wk[] discarded$92 = nb.a(kd.field_x, (byte) 107, "empty_button", "basic");
                            int discarded$93 = 0;
                            el.field_Ub = rl.a(kd.field_x, "basic", "prevbtn");
                            int discarded$94 = 0;
                            gm.field_b = rl.a(kd.field_x, "basic", "nextbtn");
                            int discarded$95 = 0;
                            pf.field_b = rl.a(kd.field_x, "basic", "lobby_icon");
                            vc.field_e = cf.a("statbars", "basic", (byte) -13, kd.field_x);
                            pd.field_Z = cf.a("tags", "basic", (byte) -50, kd.field_x);
                            int discarded$96 = 0;
                            uh.field_k = rl.a(kd.field_x, "basic", "tagborder");
                            qg.field_f = cf.a("movekeys", "basic", (byte) -38, kd.field_x);
                            int discarded$97 = 0;
                            bc.field_wb = rl.a(kd.field_x, "basic", "shiftkey");
                            da.field_e = cf.a("config_tabs", "basic", (byte) -33, kd.field_x);
                            int discarded$98 = 0;
                            aj.field_r[0] = rl.a(kd.field_x, "basic", "research_ring");
                            int discarded$99 = 0;
                            b.field_q[0] = rl.a(kd.field_x, "basic", "research_icon");
                            bl.field_p = cj.a(param0 + -75, "basic", kd.field_x, "powerups");
                            gf.field_c = cf.a("headings_bar", "basic", (byte) -26, kd.field_x);
                            int discarded$100 = 0;
                            wk discarded$101 = rl.a(kd.field_x, "basic", "solarite");
                            int discarded$102 = 0;
                            vk.field_q = rl.a(kd.field_x, "basic", "mansize");
                            int discarded$103 = 0;
                            gj.field_a = rl.a(kd.field_x, "basic", "stripeybar");
                            int discarded$104 = 0;
                            vk.field_r = rl.a(kd.field_x, "basic", "hackbit");
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
                                wk[] discarded$105 = cf.a("dust", "basic", (byte) -81, kd.field_x);
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
                          if (ac.field_bb.field_E[var3_int] == 16777215) {
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
                  int discarded$106 = 0;
                  hd.a();
                  int discarded$107 = 0;
                  gf.a();
                  var2_int = 0;
                  L8: while (true) {
                    if (23 <= var2_int) {
                      L9: {
                        pm.field_T = 0;
                        vb.field_g = 0;
                        int discarded$108 = -127;
                        int discarded$109 = 50;
                        vg.a();
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
                          int discarded$110 = 1;
                          int discarded$111 = -1;
                          this.b();
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
              boolean discarded$112 = q.field_f.a(0, me.field_f, 21687, he.field_e, rc.field_i);
              boolean discarded$113 = q.field_f.a(0, l.field_i, 21687, he.field_e, rc.field_i);
              boolean discarded$114 = q.field_f.a(0, gb.field_e, 21687, he.field_e, rc.field_i);
              boolean discarded$115 = q.field_f.a(0, kj.field_z, 21687, he.field_e, rc.field_i);
              boolean discarded$116 = q.field_f.a(0, ue.field_e, param0 + 21739, he.field_e, rc.field_i);
              boolean discarded$117 = q.field_f.a(0, db.field_a, 21687, he.field_e, rc.field_i);
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
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var5 = new wk[9];
            if (param2 == -62) {
              L1: {
                wk dupTemp$4 = bd.a(param1, param3, 248);
                var5[6] = dupTemp$4;
                var5[3] = dupTemp$4;
                var5[2] = dupTemp$4;
                var5[1] = dupTemp$4;
                var5[0] = dupTemp$4;
                wk dupTemp$5 = bd.a(param4, param3, 248);
                var5[8] = dupTemp$5;
                var5[7] = dupTemp$5;
                var5[5] = dupTemp$5;
                if (param0 != 0) {
                  var5[4] = bd.a(param0, 64, 248);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_7_0 = (wk[]) var5;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wk[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5_ref, "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_8_0;
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
                      if (al.field_g != 0) {
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
                      if (al.field_g != 1) {
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
                      if (al.field_g != 2) {
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
                      if (al.field_g != 4) {
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
                      if (al.field_g != 6) {
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
                      if (al.field_g != 8) {
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
                      if (al.field_g != 10) {
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
                      if (al.field_g != 11) {
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
                      if (al.field_g != 12) {
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
                      if (al.field_g != 13) {
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
                      if (al.field_g != 14) {
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
                      if (al.field_g != 15) {
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
                      if (al.field_g != 19) {
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
                      if (al.field_g != 21) {
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
                      if (al.field_g == 23) {
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
              if (cb.field_l != 2) {
                break L25;
              } else {
                if (he.field_e == null) {
                  break L25;
                } else {
                  L26: {
                    ua.field_r = 90;
                    if (al.field_g != 0) {
                      if (al.field_g != 1) {
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
                              if (al.field_g == 5) {
                                qj.field_q[5] = he.field_e.a("footstep_4", "", 125);
                                al.field_g = al.field_g + 1;
                                break L26;
                              } else {
                                if (al.field_g != 6) {
                                  if (al.field_g == 7) {
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
                                              if (al.field_g == 13) {
                                                qj.field_q[13] = he.field_e.a("gauss_gun", "", -110);
                                                al.field_g = al.field_g + 1;
                                                break L26;
                                              } else {
                                                if (al.field_g == 14) {
                                                  qj.field_q[14] = he.field_e.a("rapier_missle", "", param0 + 68);
                                                  al.field_g = al.field_g + 1;
                                                  break L26;
                                                } else {
                                                  if (15 != al.field_g) {
                                                    if (al.field_g == 16) {
                                                      qj.field_q[16] = he.field_e.a("mini_gun", "", 127);
                                                      al.field_g = al.field_g + 1;
                                                      break L26;
                                                    } else {
                                                      if (al.field_g != 17) {
                                                        if (al.field_g != 18) {
                                                          if (19 != al.field_g) {
                                                            if (al.field_g == 20) {
                                                              qj.field_q[20] = he.field_e.a("light_rocket_launch", "", -56);
                                                              al.field_g = al.field_g + 1;
                                                              break L26;
                                                            } else {
                                                              if (al.field_g != 21) {
                                                                if (al.field_g != 22) {
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
                                                                      if (al.field_g == 25) {
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
                                                                            if (al.field_g == 28) {
                                                                              qj.field_q[28] = he.field_e.a("EDD_teleport", "", 103);
                                                                              al.field_g = al.field_g + 1;
                                                                              break L26;
                                                                            } else {
                                                                              if (29 != al.field_g) {
                                                                                if (30 != al.field_g) {
                                                                                  if (al.field_g != 31) {
                                                                                    if (32 != al.field_g) {
                                                                                      if (al.field_g == 33) {
                                                                                        qj.field_q[33] = he.field_e.a("flak_cannon_2", "", -103);
                                                                                        al.field_g = al.field_g + 1;
                                                                                        break L26;
                                                                                      } else {
                                                                                        if (al.field_g != 34) {
                                                                                          if (al.field_g == 35) {
                                                                                            qj.field_q[35] = he.field_e.a("morter", "", -67);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            break L26;
                                                                                          } else {
                                                                                            if (al.field_g != 36) {
                                                                                              if (al.field_g != 37) {
                                                                                                if (al.field_g != 38) {
                                                                                                  if (al.field_g == 39) {
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
                                                                                                        if (al.field_g != 42) {
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
                                                                                                              if (al.field_g == 45) {
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
                                                                                                                        if (al.field_g != 50) {
                                                                                                                          if (al.field_g != 51) {
                                                                                                                            if (al.field_g != 52) {
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
                                                                                                                                        if (al.field_g != 58) {
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
                                                                                                                                              if (al.field_g != 61) {
                                                                                                                                                if (al.field_g == 62) {
                                                                                                                                                  qj.field_q[60] = he.field_e.a("class_DEATH_nuke", "", -113);
                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                  break L26;
                                                                                                                                                } else {
                                                                                                                                                  if (al.field_g == 63) {
                                                                                                                                                    qj.field_q[61] = he.field_e.a("air_death_missile", "", bi.a(param0, 85));
                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                    break L26;
                                                                                                                                                  } else {
                                                                                                                                                    if (64 != al.field_g) {
                                                                                                                                                      if (al.field_g == 65) {
                                                                                                                                                        qj.field_q[63] = he.field_e.a("EMP_cannon", "", -61);
                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                        break L26;
                                                                                                                                                      } else {
                                                                                                                                                        if (al.field_g == 66) {
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
                                                                                                                                                                  if (al.field_g != 71) {
                                                                                                                                                                    if (72 != al.field_g) {
                                                                                                                                                                      if (al.field_g == 73) {
                                                                                                                                                                        qj.field_q[87] = he.field_e.a("explosion_fireball_2", "", -125);
                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                        break L26;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (74 == al.field_g) {
                                                                                                                                                                          qj.field_q[88] = he.field_e.a("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                          break L26;
                                                                                                                                                                        } else {
                                                                                                                                                                          if (al.field_g == 75) {
                                                                                                                                                                            qj.field_q[89] = he.field_e.a("explosion_fireball_4", "", -85);
                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                            break L26;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (al.field_g != 76) {
                                                                                                                                                                              if (al.field_g != 77) {
                                                                                                                                                                                if (al.field_g == 78) {
                                                                                                                                                                                  qj.field_q[92] = he.field_e.a("hoverloop", "", param0 + 59);
                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                  break L26;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (al.field_g == 79) {
                                                                                                                                                                                    qj.field_q[93] = he.field_e.a("trackloop", "", bi.a(param0, 68));
                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                    break L26;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    if (al.field_g == 80) {
                                                                                                                                                                                      qj.field_q[94] = he.field_e.a("damage_plasma_burn2", "", -79);
                                                                                                                                                                                      al.field_g = al.field_g + 1;
                                                                                                                                                                                      break L26;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      if (al.field_g == 81) {
                                                                                                                                                                                        qj.field_q[95] = he.field_e.a("Button_press", "", -49);
                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                        break L26;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (al.field_g == 82) {
                                                                                                                                                                                          qj.field_q[96] = he.field_e.a("Main_menu_appear", "", 104);
                                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                                          break L26;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (al.field_g == 83) {
                                                                                                                                                                                            qj.field_q[97] = he.field_e.a("Mouseover", "", 120);
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            break L26;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (al.field_g != 84) {
                                                                                                                                                                                              if (al.field_g == 85) {
                                                                                                                                                                                                qj.field_q[99] = he.field_e.a("Menu_engineering_select_chassis", "", -112);
                                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                                break L26;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                if (al.field_g == 86) {
                                                                                                                                                                                                  qj.field_q[100] = he.field_e.a("Menu_engineering_select_part", "", -28);
                                                                                                                                                                                                  al.field_g = al.field_g + 1;
                                                                                                                                                                                                  break L26;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  if (al.field_g != 87) {
                                                                                                                                                                                                    if (al.field_g != 88) {
                                                                                                                                                                                                      if (al.field_g != 89) {
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
                  if (al.field_g != 0) {
                    break L29;
                  } else {
                    if (!kd.field_x.a((byte) -38, "lw_midground_01", "basic")) {
                      break L29;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1] = new wk[4];
                      int discarded$13 = 0;
                      ig.field_o[1][0] = rl.a(kd.field_x, "basic", "lw_midground_01");
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
                      int discarded$14 = 0;
                      ig.field_o[1][1] = rl.a(kd.field_x, "basic", "lw_midground_02");
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
                      int discarded$15 = 0;
                      ig.field_o[1][2] = rl.a(kd.field_x, "basic", "lw_midground_03");
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
                      int discarded$16 = 0;
                      ig.field_o[1][3] = rl.a(kd.field_x, "basic", "lw_midground_04");
                      break L28;
                    }
                  }
                }
                L33: {
                  if (al.field_g != 4) {
                    break L33;
                  } else {
                    if (kd.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                      al.field_g = al.field_g + 1;
                      ig.field_o[2] = new wk[4];
                      int discarded$17 = 0;
                      ig.field_o[2][0] = rl.a(kd.field_x, "basic", "ct_midground_01");
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
                      int discarded$18 = 0;
                      ig.field_o[2][1] = rl.a(kd.field_x, "basic", "ct_midground_02");
                      break L28;
                    } else {
                      break L34;
                    }
                  }
                }
                L35: {
                  if (al.field_g != 6) {
                    break L35;
                  } else {
                    if (kd.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                      al.field_g = al.field_g + 1;
                      int discarded$19 = 0;
                      ig.field_o[2][2] = rl.a(kd.field_x, "basic", "ct_midground_03");
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
                      int discarded$20 = 0;
                      ig.field_o[2][3] = rl.a(kd.field_x, "basic", "ct_midground_04");
                      break L28;
                    }
                  }
                }
                L37: {
                  if (al.field_g != 8) {
                    break L37;
                  } else {
                    if (!kd.field_x.a((byte) 107, "testsurface", "basic")) {
                      break L37;
                    } else {
                      al.field_g = al.field_g + 1;
                      int discarded$21 = 0;
                      vi.field_R = rl.a(kd.field_x, "basic", "testsurface");
                      break L28;
                    }
                  }
                }
                L38: {
                  if (al.field_g != 9) {
                    break L38;
                  } else {
                    if (kd.field_x.a((byte) -63, "wz_texture", "basic")) {
                      al.field_g = al.field_g + 1;
                      bc.field_rb = new wk[5];
                      int discarded$22 = 0;
                      bc.field_rb[0] = rl.a(kd.field_x, "basic", "wz_texture");
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
                      int discarded$23 = 0;
                      bc.field_rb[1] = rl.a(kd.field_x, "basic", "lw_texture");
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
                      int discarded$24 = 0;
                      bc.field_rb[2] = rl.a(kd.field_x, "basic", "ct_texture");
                      break L28;
                    }
                  }
                }
                if (al.field_g != 12) {
                  break L28;
                } else {
                  if (!kd.field_x.a((byte) 127, "mn_texture", "basic")) {
                    break L28;
                  } else {
                    al.field_g = al.field_g + 1;
                    int discarded$25 = 0;
                    bc.field_rb[3] = rl.a(kd.field_x, "basic", "mn_texture");
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
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.TA(" + param0 + ')');
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
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$6 = 7094;
              ti.d();
              if (null != wb.field_c) {
                ub.c(0);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 21 % ((param0 - 34) / 48);
            int discarded$7 = 0;
            ao.h();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((SteelSentinels) this).a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.init()");
        }
    }

    private final void b() {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5_int = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nb stackIn_240_0 = null;
        nb stackIn_240_1 = null;
        int stackIn_240_2 = 0;
        int stackIn_240_3 = 0;
        int stackIn_240_4 = 0;
        String[] stackIn_240_5 = null;
        int stackIn_240_6 = 0;
        int stackIn_240_7 = 0;
        int[][] stackIn_240_8 = null;
        nb stackIn_242_0 = null;
        nb stackIn_242_1 = null;
        int stackIn_242_2 = 0;
        int stackIn_242_3 = 0;
        int stackIn_242_4 = 0;
        String[] stackIn_242_5 = null;
        int stackIn_242_6 = 0;
        int stackIn_242_7 = 0;
        int[][] stackIn_242_8 = null;
        nb stackIn_243_0 = null;
        nb stackIn_243_1 = null;
        int stackIn_243_2 = 0;
        int stackIn_243_3 = 0;
        int stackIn_243_4 = 0;
        String[] stackIn_243_5 = null;
        int stackIn_243_6 = 0;
        int stackIn_243_7 = 0;
        int[][] stackIn_243_8 = null;
        int stackIn_243_9 = 0;
        RuntimeException decompiledCaughtException = null;
        nb stackOut_239_0 = null;
        nb stackOut_239_1 = null;
        int stackOut_239_2 = 0;
        int stackOut_239_3 = 0;
        int stackOut_239_4 = 0;
        String[] stackOut_239_5 = null;
        int stackOut_239_6 = 0;
        int stackOut_239_7 = 0;
        int[][] stackOut_239_8 = null;
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
        nb stackOut_240_0 = null;
        nb stackOut_240_1 = null;
        int stackOut_240_2 = 0;
        int stackOut_240_3 = 0;
        int stackOut_240_4 = 0;
        String[] stackOut_240_5 = null;
        int stackOut_240_6 = 0;
        int stackOut_240_7 = 0;
        int[][] stackOut_240_8 = null;
        int stackOut_240_9 = 0;
        var8 = field_G;
        try {
          L0: {
            L1: {
              wh.a(false);
              if (in.field_h == in.field_i) {
                var3_int = 0;
                var4 = 0;
                L2: {
                  if (!bg.field_H) {
                    break L2;
                  } else {
                    if (rc.field_n) {
                      break L2;
                    } else {
                      if (!da.field_d) {
                        L3: {
                          if (!ob.field_y) {
                            break L3;
                          } else {
                            if (!jn.field_g) {
                              break L3;
                            } else {
                              var3_int = 0;
                              break L3;
                            }
                          }
                        }
                        L4: {
                          L5: {
                            la.a(13, var3_int != 0);
                            if (ee.field_G) {
                              break L5;
                            } else {
                              if (!ob.field_y) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ue.a((byte) 38, var4 != 0, 320, 180);
                          break L4;
                        }
                        L6: {
                          if (!ee.field_G) {
                            break L6;
                          } else {
                            if (null != si.field_A) {
                              si.field_A.c(-38, var4 != 0);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (!ob.field_y) {
                            break L7;
                          } else {
                            fk.field_i.c(-121, var4 != 0);
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (!dl.f(22759)) {
                            break L2;
                          } else {
                            L9: {
                              if (!vl.field_v) {
                                L10: {
                                  if (ob.field_y) {
                                    break L10;
                                  } else {
                                    if (!ee.field_G) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if (jn.field_g) {
                                    break L11;
                                  } else {
                                    if (ei.field_q == 80) {
                                      break L11;
                                    } else {
                                      if (ei.field_q == 10) {
                                        break L11;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (cn.a(13, 15, 12, false)) {
                                  continue L8;
                                } else {
                                  break L9;
                                }
                              } else {
                                L12: {
                                  if (ob.field_y) {
                                    break L12;
                                  } else {
                                    if (!ee.field_G) {
                                      boolean discarded$3 = cj.a(13, (byte) 99, 12, 15);
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (!cn.a(13, 15, 12, false)) {
                                  break L9;
                                } else {
                                  continue L8;
                                }
                              }
                            }
                            if (jn.field_g) {
                              continue L8;
                            } else {
                              L13: {
                                if (!ee.field_G) {
                                  break L13;
                                } else {
                                  si.field_A.g(73);
                                  break L13;
                                }
                              }
                              if (!ob.field_y) {
                                continue L8;
                              } else {
                                fk.field_i.g(51);
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L14: {
                  if (bg.field_H) {
                    break L14;
                  } else {
                    jk.d((byte) -66);
                    break L14;
                  }
                }
                L15: {
                  if (vl.field_v) {
                    if (on.field_i >= an.field_h) {
                      break L15;
                    } else {
                      on.field_i = on.field_i + 1;
                      break L15;
                    }
                  } else {
                    if (on.field_i > 0) {
                      on.field_i = on.field_i - 1;
                      break L15;
                    } else {
                      break L15;
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
                  int fieldTemp$4 = ob.field_o + 1;
                  ob.field_o = ob.field_o + 1;
                  if (fieldTemp$4 == 500) {
                    ob.field_o = 0;
                    ck discarded$5 = bd.field_b.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (~bg.field_G == ~in.field_i) {
                  ji.field_a = ji.field_a + 1;
                  if (ji.field_a == 16) {
                    L16: {
                      if (si.field_y) {
                        ef.a(-117);
                        break L16;
                      } else {
                        bb.a((byte) 113);
                        break L16;
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
                    if (ji.field_a != 0) {
                      break L1;
                    } else {
                      in.field_i = in.field_h;
                      break L1;
                    }
                  } else {
                    L17: {
                      if (!ni.b(12)) {
                        L18: {
                          if (null == lc.field_c) {
                            break L18;
                          } else {
                            pa.a(3, (byte) -114, lc.field_c);
                            break L18;
                          }
                        }
                        L19: {
                          gf.c(-128);
                          vb.field_g = ji.field_i;
                          if (!si.field_y) {
                            break L19;
                          } else {
                            si.field_y = false;
                            ag.a(-4, false);
                            break L19;
                          }
                        }
                        if (d.a(vb.field_g, 0)) {
                          ol.b(true);
                          break L17;
                        } else {
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    in.field_i = ik.field_b;
                    break L1;
                  }
                }
              }
            }
            this.m(-19);
            L20: {
              if (vb.field_g == -3) {
                lc.field_c = null;
                var3_ref = g.field_l;
                var4_ref_String__ = new String[]{var3_ref};
                var5 = new int[var4_ref_String__.length][];
                var5[0] = uc.field_b;
                var6 = 1;
                L21: while (true) {
                  if (var6 >= var4_ref_String__.length) {
                    L22: {
                      var6 = 0;
                      var7 = di.field_g;
                      if (0 == var7) {
                        var5[0] = ua.field_v;
                        var6 = 16;
                        break L22;
                      } else {
                        if (var7 == 1) {
                          var5[0] = ua.field_v;
                          var6 = 16;
                          break L22;
                        } else {
                          if (7 == var7) {
                            var6 = 16;
                            break L22;
                          } else {
                            if (var7 != 4) {
                              L23: {
                                if (var7 == 3) {
                                  break L23;
                                } else {
                                  if (var7 == 5) {
                                    break L23;
                                  } else {
                                    if (var7 == 10) {
                                      var6 = ua.field_t[10 * ge.field_j - -ol.field_Ub][1];
                                      var5[0] = ua.field_C[ol.field_Ub + ge.field_j * 10];
                                      break L22;
                                    } else {
                                      if (var7 == -1) {
                                        var6 = 0;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                              var5[0] = ua.field_C[ol.field_Ub + 10 * ge.field_j];
                              var6 = 16;
                              break L22;
                            } else {
                              var6 = 16;
                              break L22;
                            }
                          }
                        }
                      }
                    }
                    L24: {
                      vl.field_v = false;
                      jn.field_g = false;
                      stackOut_239_0 = null;
                      stackOut_239_1 = null;
                      stackOut_239_2 = 0;
                      stackOut_239_3 = var6;
                      stackOut_239_4 = 1;
                      stackOut_239_5 = (String[]) var4_ref_String__;
                      stackOut_239_6 = 0;
                      stackOut_239_7 = 0;
                      stackOut_239_8 = (int[][]) var5;
                      stackIn_242_0 = stackOut_239_0;
                      stackIn_242_1 = stackOut_239_1;
                      stackIn_242_2 = stackOut_239_2;
                      stackIn_242_3 = stackOut_239_3;
                      stackIn_242_4 = stackOut_239_4;
                      stackIn_242_5 = stackOut_239_5;
                      stackIn_242_6 = stackOut_239_6;
                      stackIn_242_7 = stackOut_239_7;
                      stackIn_242_8 = stackOut_239_8;
                      stackIn_240_0 = stackOut_239_0;
                      stackIn_240_1 = stackOut_239_1;
                      stackIn_240_2 = stackOut_239_2;
                      stackIn_240_3 = stackOut_239_3;
                      stackIn_240_4 = stackOut_239_4;
                      stackIn_240_5 = stackOut_239_5;
                      stackIn_240_6 = stackOut_239_6;
                      stackIn_240_7 = stackOut_239_7;
                      stackIn_240_8 = stackOut_239_8;
                      if (-1 != di.field_g) {
                        stackOut_242_0 = null;
                        stackOut_242_1 = null;
                        stackOut_242_2 = stackIn_242_2;
                        stackOut_242_3 = stackIn_242_3;
                        stackOut_242_4 = stackIn_242_4;
                        stackOut_242_5 = (String[]) (Object) stackIn_242_5;
                        stackOut_242_6 = stackIn_242_6;
                        stackOut_242_7 = stackIn_242_7;
                        stackOut_242_8 = (int[][]) (Object) stackIn_242_8;
                        stackOut_242_9 = 0;
                        stackIn_243_0 = stackOut_242_0;
                        stackIn_243_1 = stackOut_242_1;
                        stackIn_243_2 = stackOut_242_2;
                        stackIn_243_3 = stackOut_242_3;
                        stackIn_243_4 = stackOut_242_4;
                        stackIn_243_5 = stackOut_242_5;
                        stackIn_243_6 = stackOut_242_6;
                        stackIn_243_7 = stackOut_242_7;
                        stackIn_243_8 = stackOut_242_8;
                        stackIn_243_9 = stackOut_242_9;
                        break L24;
                      } else {
                        stackOut_240_0 = null;
                        stackOut_240_1 = null;
                        stackOut_240_2 = stackIn_240_2;
                        stackOut_240_3 = stackIn_240_3;
                        stackOut_240_4 = stackIn_240_4;
                        stackOut_240_5 = (String[]) (Object) stackIn_240_5;
                        stackOut_240_6 = stackIn_240_6;
                        stackOut_240_7 = stackIn_240_7;
                        stackOut_240_8 = (int[][]) (Object) stackIn_240_8;
                        stackOut_240_9 = 3;
                        stackIn_243_0 = stackOut_240_0;
                        stackIn_243_1 = stackOut_240_1;
                        stackIn_243_2 = stackOut_240_2;
                        stackIn_243_3 = stackOut_240_3;
                        stackIn_243_4 = stackOut_240_4;
                        stackIn_243_5 = stackOut_240_5;
                        stackIn_243_6 = stackOut_240_6;
                        stackIn_243_7 = stackOut_240_7;
                        stackIn_243_8 = stackOut_240_8;
                        stackIn_243_9 = stackOut_240_9;
                        break L24;
                      }
                    }
                    fk.field_i = new nb(stackIn_243_2 != 0, stackIn_243_3, stackIn_243_4, stackIn_243_5, stackIn_243_6, stackIn_243_7 != 0, stackIn_243_8, stackIn_243_9, 2, false, false);
                    var7 = nk.field_B ? 1 : 0;
                    q.a(-1, var7 != 0, -1, 0);
                    ea.field_k = true;
                    break L20;
                  } else {
                    var5[var6] = uc.field_b;
                    var6++;
                    continue L21;
                  }
                }
              } else {
                break L20;
              }
            }
            L25: {
              if (-4 != vb.field_g) {
                break L25;
              } else {
                mm.field_g.a(63, (byte) -117);
                mm.field_g.field_p = mm.field_g.field_p + 1;
                var3_int = mm.field_g.field_p;
                mm.field_g.a((byte) 124, uc.field_b.length);
                var4 = 0;
                L26: while (true) {
                  if (var4 >= uc.field_b.length) {
                    mm.field_g.b((byte) 111, mm.field_g.field_p - var3_int);
                    mm.field_g.a(9, (byte) -117);
                    rc.field_n = true;
                    vb.field_g = pm.field_T;
                    on.field_i = an.field_h;
                    break L25;
                  } else {
                    mm.field_g.a((byte) 127, uc.field_b[var4]);
                    var4++;
                    continue L26;
                  }
                }
              }
            }
            L27: {
              if (vb.field_g == -5) {
                na.a((byte) -43, 11, nf.field_b.j(-26));
                da.field_d = true;
                vb.field_g = pm.field_T;
                break L27;
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "SteelSentinels.SA(" + -1 + ',' + true + ')');
        }
    }

    final void b(int param0) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((SteelSentinels) this).a(14, false, 5000, 71, 1, 0, 4, 2);
              var2 = new ic();
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
                break L1;
              } else {
                ((SteelSentinels) this).c(-47);
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
          throw ci.a((Throwable) (Object) var2_ref, "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
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
              var2 = (Object) (Object) (cf) (Object) un.field_b.a(true);
              if (var2 != null) {
                r.a(4, (byte) 123, (cf) var2);
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
                if (vb.field_g != -2) {
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
                      if (var2_int != 1) {
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
                  if (var2_int != 2) {
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
              if (ch.field_N == 14) {
                L21: {
                  ol.b(true);
                  jj.field_i = nf.a(uc.field_b, h.field_G, (byte) 44);
                  kc.field_w[1] = (byte) 0;
                  if ((jj.field_i & rc.field_o[1][kc.field_w[1]]) == 0) {
                    kc.field_w[1] = (byte) 1;
                    if (rd.field_b <= 0) {
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
                  if (kc.field_w[1] != 0) {
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
                if (ch.field_N == 15) {
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
                  if (ch.field_N == 80) {
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
                      if (ch.field_N == 12) {
                        na discarded$4 = eb.a((byte) -127, true);
                        bg.a(new na(true), -93);
                        continue L9;
                      } else {
                        if (ch.field_N != 67) {
                          if (ch.field_N != 60) {
                            if (ch.field_N == 77) {
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
                              if (ch.field_N == 78) {
                                var2_int = 0;
                                L28: while (true) {
                                  if (var2_int >= 3) {
                                    var2_int = 0;
                                    L29: while (true) {
                                      if (~jh.field_a.length >= ~var2_int) {
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
                                if (ch.field_N != 73) {
                                  if (ch.field_N == 72) {
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
                                              if (ch.field_N == 57) {
                                                break L33;
                                              } else {
                                                if (ch.field_N == 58) {
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
                                                      var2 = null;
                                                      if (!ob.field_y) {
                                                        if (!ee.field_G) {
                                                          break L37;
                                                        } else {
                                                          var2 = (Object) (Object) si.field_A;
                                                          break L37;
                                                        }
                                                      } else {
                                                        var2 = (Object) (Object) fk.field_i;
                                                        break L37;
                                                      }
                                                    }
                                                    L38: {
                                                      if (null != var2) {
                                                        if (ch.field_N != 61) {
                                                          if (ch.field_N != 69) {
                                                            if (ch.field_N != 76) {
                                                              if (ch.field_N == 71) {
                                                                L39: {
                                                                  if (((nb) var2).field_i + -100 <= ((nb) var2).field_w) {
                                                                    break L39;
                                                                  } else {
                                                                    if (((nb) var2).field_X.field_r >= ((nb) var2).field_w) {
                                                                      break L39;
                                                                    } else {
                                                                      ((nb) var2).field_w = -100 + ((nb) var2).field_i;
                                                                      break L39;
                                                                    }
                                                                  }
                                                                }
                                                                ((nb) var2).field_i = rf.field_d.i(param0 ^ 2);
                                                                var3 = rf.field_d.i(0);
                                                                var4 = rf.field_d.i(param0 + -2);
                                                                if (~((nb) var2).field_l > ~((nb) var2).field_X.field_r) {
                                                                  ((nb) var2).field_j = var3;
                                                                  ((nb) var2).field_l = var4;
                                                                  continue L9;
                                                                } else {
                                                                  continue L9;
                                                                }
                                                              } else {
                                                                if (62 == ch.field_N) {
                                                                  ((nb) var2).field_i = rf.field_d.i(0);
                                                                  ((nb) var2).field_z = true;
                                                                  continue L9;
                                                                } else {
                                                                  if (ch.field_N != 63) {
                                                                    if (ch.field_N != 64) {
                                                                      if (ch.field_N != 65) {
                                                                        if (66 == ch.field_N) {
                                                                          ((nb) var2).field_N = rf.field_d.f((byte) -85);
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
                                                                        ((nb) var2).field_X.field_X = rf.field_d.f((byte) -91);
                                                                        if (null == fk.field_i) {
                                                                          continue L9;
                                                                        } else {
                                                                          h.i(-1);
                                                                          continue L9;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      ((nb) var2).field_X.field_hb = rf.field_d.f((byte) -111);
                                                                      continue L9;
                                                                    }
                                                                  } else {
                                                                    ((nb) var2).field_X.field_V = rf.field_d.f((byte) -92);
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
                                                              ((nb) var2).field_X.a(var4, 28669, var3);
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
                                                              var11 = ((nb) var2).field_X.f(var3, -128);
                                                              if (var4 == 10) {
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
                                                            var4_ref_mb = ((nb) var2).field_X.f(var3, -128);
                                                            var5_ref_je = (je) (Object) var4_ref_mb.field_Ec.b(1063677678);
                                                            if (var5_ref_je != null) {
                                                              var5_ref_je.b(param0 ^ 6);
                                                              break L42;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                          var5_ref_je = (je) (Object) var4_ref_mb.field_B.b(1063677678);
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
                                              if ((var6 & 1) == 0) {
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
                                              if (~var13_int <= ~var10.length) {
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
                                                      if (var12[var13_int][var14] != 255) {
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
                                      var3_ref_String = qg.field_o;
                                      if (79 == ch.field_N) {
                                        var3_ref_String = c.field_r;
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                    bd.field_b.a(3, (ck) (Object) new ai((wk) null, db.a(var3_ref_String, -105, new String[1])));
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
                                    if (var2_int < 2) {
                                      lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int, new int[1], 3);
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
                                      if (~var2_int <= ~va.field_k.length) {
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
                          var2 = (Object) (Object) jg.a(true);
                          var3 = 0;
                          L56: while (true) {
                            if (var3 >= ((Object[]) var2).length) {
                              var3_ref_String = (String) var2;
                              var4_ref_int__ = ge.field_m;
                              var5 = 0;
                              L57: while (true) {
                                if (var5 >= 8) {
                                  L58: {
                                    if (!ln.field_h) {
                                      break L58;
                                    } else {
                                      var3_ref_int__ = ce.field_t;
                                      var4_ref_int__ = (int[]) var2;
                                      var5 = 0;
                                      L59: while (true) {
                                        if (var5 >= 8) {
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
                                  var4_ref_int__ = (int[]) var2;
                                  var5 = 0;
                                  L60: while (true) {
                                    if (var5 >= 8) {
                                      wl.c((byte) 10);
                                      continue L9;
                                    } else {
                                      var3_ref_int__[var5] = vn.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                                      var5++;
                                      continue L60;
                                    }
                                  }
                                } else {
                                  ((int[]) (Object) var3_ref_String)[var5] = ec.a(((int[]) (Object) var3_ref_String)[var5], ~var4_ref_int__[var5]);
                                  var5++;
                                  continue L57;
                                }
                              }
                            } else {
                              ((int[]) var2)[var3] = rf.field_d.i(0);
                              var3++;
                              continue L56;
                            }
                          }
                        }
                      }
                    } else {
                      var2 = (Object) (Object) eb.a((byte) -62, false);
                      bg.a((na) var2, -92);
                      if (m.field_a == 1) {
                        if (fk.field_i != null) {
                          if (ph.field_e != null) {
                            L61: {
                              var3_ref_String = "";
                              if (null == b.field_g) {
                                break L61;
                              } else {
                                L62: {
                                  var4_ref_String = b.field_g;
                                  if (be.field_b == 1) {
                                    var4_ref_String = "<img=0>" + var4_ref_String;
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                }
                                L63: {
                                  if (2 != be.field_b) {
                                    break L63;
                                  } else {
                                    var4_ref_String = "<img=1>" + var4_ref_String;
                                    break L63;
                                  }
                                }
                                var3_ref_String = var4_ref_String + ": ";
                                break L61;
                              }
                            }
                            L64: {
                              L65: {
                                var4_ref_String = var3_ref_String + mi.a(bg.field_F);
                                if (((na) var2).field_g) {
                                  break L65;
                                } else {
                                  if (!o.a(-122, ((na) var2).field_p)) {
                                    break L65;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              bl.a(48127, var4_ref_String, (byte) 124);
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
          L0: {
            L1: {
              SteelSentinels.j((byte) -10);
              int discarded$207 = -29;
              ul.c();
              int discarded$208 = 0;
              wd.a();
              hf.a(true);
              int discarded$209 = -120;
              fj.a();
              int discarded$210 = 125;
              rg.c();
              gh.a(false);
              int discarded$211 = 100;
              i.a();
              int discarded$212 = 0;
              uc.a();
              ci.a(false);
              am.a(2);
              int discarded$213 = -111;
              n.h();
              od.a(false);
              lg.e(48);
              int discarded$214 = -64;
              fk.a();
              wc.a(true);
              a.c(72);
              pb.a();
              cm.b(false);
              un.a(false);
              if (param0 >= 22) {
                break L1;
              } else {
                ((SteelSentinels) this).a(48);
                break L1;
              }
            }
            int discarded$215 = -125;
            gi.d();
            int discarded$216 = 122;
            mm.b();
            int discarded$217 = 124;
            fl.a();
            int discarded$218 = 84;
            of.a();
            int discarded$219 = 127;
            in.b();
            int discarded$220 = 80;
            ph.a();
            int discarded$221 = -67;
            vh.a();
            int discarded$222 = -34;
            be.a();
            int discarded$223 = 56;
            pa.a();
            int discarded$224 = -119;
            ib.a();
            int discarded$225 = 2;
            na.a();
            int discarded$226 = -88;
            im.a();
            int discarded$227 = -126;
            wn.a();
            al.b(30);
            int discarded$228 = 690;
            he.a();
            cj.a(-1);
            int discarded$229 = 30;
            nn.b();
            int discarded$230 = -109;
            jg.b();
            int discarded$231 = -82;
            ng.a();
            ub.a(94);
            ji.h((byte) -104);
            int discarded$232 = 750;
            nb.b();
            nd.a(-107);
            int discarded$233 = 0;
            hh.a();
            int discarded$234 = -91;
            vk.c();
            int discarded$235 = -1;
            cb.b();
            int discarded$236 = -35;
            ta.a();
            rj.a(83);
            int discarded$237 = -45;
            sg.a();
            int discarded$238 = 79;
            jn.a();
            ck.c(4433);
            int discarded$239 = 0;
            cd.a();
            di.a(-1);
            int discarded$240 = 80;
            bi.a();
            int discarded$241 = 79;
            ik.b();
            int discarded$242 = 1;
            lc.b();
            int discarded$243 = -98;
            o.a();
            dj.a((byte) 94);
            int discarded$244 = -118;
            me.a();
            int discarded$245 = 1;
            kj.e();
            int discarded$246 = -94;
            ie.a();
            int discarded$247 = -102;
            gj.a();
            int discarded$248 = 26;
            tf.a();
            int discarded$249 = 0;
            lb.j();
            int discarded$250 = 93;
            dh.c();
            int discarded$251 = -60;
            ve.b();
            ee.g(0);
            int discarded$252 = 20;
            nk.d();
            int discarded$253 = -18;
            rm.d();
            qj.c(21841);
            int discarded$254 = 5370;
            jc.e();
            mi.a();
            int discarded$255 = -119;
            vf.a();
            jh.a(30706);
            ba.a(false);
            int discarded$256 = -110;
            je.a();
            int discarded$257 = 31554;
            wl.h();
            int discarded$258 = 58;
            mb.c();
            int discarded$259 = 0;
            hd.b();
            ic.a(false);
            uh.c(96);
            int discarded$260 = 0;
            hj.e();
            ab.a();
            ej.e(-93);
            tb.f();
            sj.b(false);
            int discarded$261 = -65;
            hk.d();
            int discarded$262 = -91;
            dk.b();
            int discarded$263 = 102;
            cc.k();
            int discarded$264 = 109;
            lj.a();
            jl.a(0);
            int discarded$265 = -1;
            vb.a();
            int discarded$266 = 38;
            fa.b();
            wi.g(573);
            kd.f(8191);
            rd.a(8192);
            int discarded$267 = 0;
            eh.b();
            ka.f((byte) 127);
            int discarded$268 = -29;
            fg.o();
            int discarded$269 = -47;
            ki.l();
            int discarded$270 = -111;
            bf.m();
            k.n((byte) 107);
            int discarded$271 = 0;
            vi.a();
            int discarded$272 = -48;
            pd.i();
            int discarded$273 = 320;
            pm.l();
            int discarded$274 = 60;
            qc.j();
            int discarded$275 = 103;
            ll.a();
            int discarded$276 = -1;
            uj.a();
            uk.c();
            pj.a();
            int discarded$277 = -84;
            dg.a();
            int discarded$278 = 0;
            ri.d();
            tj.a(true);
            ea.a((byte) 66);
            int discarded$279 = 17;
            qd.a();
            ne.g(-23261);
            oc.a(-1);
            int discarded$280 = -104;
            qi.a();
            ad.a(0);
            int discarded$281 = 127;
            id.j();
            int discarded$282 = 0;
            dn.b();
            int discarded$283 = 91;
            ql.d();
            dd.a(0);
            int discarded$284 = -114;
            td.j();
            int discarded$285 = 1;
            oh.a();
            int discarded$286 = 64;
            m.a();
            int discarded$287 = 37;
            qm.a();
            int discarded$288 = -83;
            te.a();
            int discarded$289 = 124;
            ak.a();
            int discarded$290 = -1;
            gm.a();
            int discarded$291 = -111;
            gf.b();
            rb.a((byte) -82);
            int discarded$292 = 1;
            en.a();
            int discarded$293 = -105;
            kk.a();
            int discarded$294 = 1;
            pl.c();
            ai.e(0);
            int discarded$295 = -38;
            dc.a();
            ra.b((byte) 26);
            int discarded$296 = 15;
            qh.j();
            int discarded$297 = 24;
            uf.a();
            nf.a(55);
            int discarded$298 = -16;
            ol.k();
            int discarded$299 = -185837884;
            qb.h();
            int discarded$300 = 115;
            ua.a();
            int discarded$301 = 0;
            sn.b();
            int discarded$302 = -23333;
            bd.a();
            int discarded$303 = -88;
            og.a();
            int discarded$304 = -112;
            la.a();
            int discarded$305 = -63;
            an.a();
            int discarded$306 = -2;
            f.e();
            int discarded$307 = 10;
            qa.h();
            int discarded$308 = 15598;
            rc.a();
            int discarded$309 = -58;
            df.i();
            int discarded$310 = 2;
            fi.c();
            int discarded$311 = 1;
            ok.a();
            int discarded$312 = 21;
            fe.e();
            int discarded$313 = -114;
            se.a();
            int discarded$314 = 0;
            jd.l();
            lf.b();
            int discarded$315 = -123;
            jj.b();
            int discarded$316 = -117;
            pe.a();
            int discarded$317 = 5;
            tm.a();
            int discarded$318 = 24;
            ec.b();
            int discarded$319 = 1;
            fc.a();
            sa.a(false);
            int discarded$320 = 61;
            pi.b();
            int discarded$321 = 23225;
            mc.a();
            int discarded$322 = -81;
            jk.b();
            int discarded$323 = 0;
            gb.a();
            oi.a();
            int discarded$324 = -120;
            nh.a();
            int discarded$325 = 42;
            ni.a();
            int discarded$326 = 0;
            rl.a();
            int discarded$327 = 1;
            pf.a();
            int discarded$328 = -21121;
            wa.c();
            int discarded$329 = 0;
            b.a();
            int discarded$330 = 105;
            qg.b();
            int discarded$331 = 1;
            da.a();
            lh.c((byte) 19);
            oa.a((byte) -105);
            int discarded$332 = 475;
            ug.g();
            int discarded$333 = 38;
            ac.k();
            int discarded$334 = 127;
            bb.h();
            dl.g(-19969);
            int discarded$335 = -31914;
            qe.a();
            int discarded$336 = -3274;
            sh.a();
            int discarded$337 = 5;
            kb.a();
            int discarded$338 = 0;
            ln.b();
            mg.k(-31097);
            int discarded$339 = -13;
            co.a();
            oe.a(272);
            int discarded$340 = 1;
            mn.g();
            int discarded$341 = 0;
            ao.g();
            int discarded$342 = 127;
            nc.a();
            int discarded$343 = 1;
            db.a();
            vg.a(-61);
            int discarded$344 = 0;
            gl.c();
            int discarded$345 = 65280;
            ti.b();
            int discarded$346 = 99;
            ed.a();
            vc.b(-13);
            int discarded$347 = -96;
            ue.b();
            p.a();
            int discarded$348 = 77;
            ce.a();
            int discarded$349 = -98;
            bh.a();
            int discarded$350 = -2107133436;
            jb.h();
            int discarded$351 = 121;
            ig.a();
            int discarded$352 = 0;
            qf.a();
            int discarded$353 = -72;
            mj.d();
            int discarded$354 = 1;
            el.b();
            int discarded$355 = -73;
            ca.c();
            bj.a(7);
            hc.f((byte) 67);
            int discarded$356 = -108;
            bc.i();
            jf.d(true);
            gd.l(-12930);
            int discarded$357 = -47;
            bk.g();
            int discarded$358 = -42;
            ij.a();
            int discarded$359 = 0;
            ma.c();
            int discarded$360 = -30289;
            lk.h();
            ff.h(-3413);
            sb.g(108);
            ia.c((byte) 103);
            int discarded$361 = 87;
            wb.a();
            int discarded$362 = 0;
            nj.a();
            int discarded$363 = -122;
            nl.f();
            int discarded$364 = 32;
            um.g();
            int discarded$365 = 5;
            cl.a();
            vn.d(false);
            int discarded$366 = 0;
            re.l();
            ch.a((byte) -68);
            int discarded$367 = 1;
            ha.c();
            si.a(24);
            ge.b(26);
            int discarded$368 = 122;
            g.a();
            int discarded$369 = 0;
            h.h();
            int discarded$370 = 12;
            d.h();
            int discarded$371 = -127;
            q.a();
            int discarded$372 = 1;
            hb.a();
            int discarded$373 = -1008;
            bg.g();
            fm.a(4314);
            int discarded$374 = 124;
            le.i();
            r.c((byte) -117);
            mf.a();
            va.a(false);
            int discarded$375 = 22;
            l.a();
            int discarded$376 = 46;
            wh.a();
            int discarded$377 = 90;
            kf.d();
            int discarded$378 = 0;
            tc.a();
            int discarded$379 = 108;
            hg.a();
            int discarded$380 = 20000000;
            ud.d();
            int discarded$381 = 100;
            pc.f();
            int discarded$382 = -89;
            jm.d();
            int discarded$383 = 100;
            kh.b();
            int discarded$384 = 0;
            bl.a();
            int discarded$385 = 9;
            ag.b();
            li.d(-30874);
            s.a((byte) -86);
            int discarded$386 = -13;
            ui.h();
            int discarded$387 = 0;
            ah.b();
            int discarded$388 = -104;
            sl.a();
            int discarded$389 = 0;
            hl.e();
            int discarded$390 = 9;
            cf.a();
            int discarded$391 = 127;
            c.a();
            int discarded$392 = 0;
            rh.b();
            dm.a(-127);
            int discarded$393 = 126;
            rf.c();
            int discarded$394 = -1341;
            kc.d();
            int discarded$395 = 7;
            de.a();
            fb.b((byte) -119);
            int discarded$396 = 28873;
            pg.c();
            int discarded$397 = -116;
            on.b();
            int discarded$398 = 0;
            sf.a();
            ml.a(107);
            e.a((byte) -89);
            int discarded$399 = -90;
            bm.a();
            int discarded$400 = -1;
            aj.d();
            int discarded$401 = -27;
            km.a();
            int discarded$402 = -13375;
            t.a();
            int discarded$403 = 105;
            hm.a();
            ob.d(18601);
            rn.d(3);
            ke.b((byte) 12);
            int discarded$404 = -58;
            il.c();
            int discarded$405 = 1;
            ei.c();
            int discarded$406 = -128;
            vm.d();
            int discarded$407 = 18384;
            ih.c();
            int discarded$408 = 116;
            nm.d();
            int discarded$409 = 81;
            eb.c();
            int discarded$410 = -113;
            tk.d();
            int discarded$411 = 1;
            ja.a();
            int discarded$412 = 29;
            vl.a();
            vd.b((byte) 56);
            v.c(true);
            int discarded$413 = 8421504;
            ef.b();
            ((SteelSentinels) this).field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.V(" + param0 + ')');
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
