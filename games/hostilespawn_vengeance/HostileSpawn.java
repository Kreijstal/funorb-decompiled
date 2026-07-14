/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class HostileSpawn extends d {
    private int field_D;
    static int[] field_K;
    private int field_H;
    static java.applet.Applet field_B;
    static bd[] field_J;
    private qh field_G;
    static boolean field_F;
    static int[] field_E;
    private static bd field_C;
    public static boolean field_I;

    private final void i(byte param0) {
        int var2_int = 0;
        bd[] var2 = null;
        pg[] var2_array = null;
        int var3_int = 0;
        pg var3 = null;
        int var4_int = 0;
        bd var4 = null;
        pg[] var4_array = null;
        int var5_int = 0;
        pg[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = field_I ? 1 : 0;
        gj.a(20, ig.field_H, 77.0f);
        ((HostileSpawn) this).a((byte) -76);
        this.t(13119);
        wk.field_b[0] = ia.field_e;
        wk.field_b[3] = qm.field_P;
        wk.field_b[2] = sc.field_a;
        wk.field_b[1] = ue.field_f;
        wk.field_b[4] = fg.a("", "key", vd.field_C, false);
        wk.field_b[11] = jg.field_f;
        kh.field_bb = new int[101];
        wk.field_b[10] = aa.field_b;
        wk.field_b[5] = e.field_r;
        wk.field_b[9] = bn.field_l;
        wk.field_b[8] = mg.field_b;
        wk.field_b[6] = jg.field_h;
        wk.field_b[7] = qh.field_l;
        var2_int = 0;
        L0: while (true) {
          if (101 <= var2_int) {
            ee.field_d = jd.a((byte) 33, "", vd.field_C, "crosshair");
            var2 = ee.field_d;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= var2.length) {
                var3 = new pg(24, 24, 2);
                var3.field_k[1] = 65280;
                var4_int = 0;
                L2: while (true) {
                  if ((var3.field_j.length ^ -1) >= (var4_int ^ -1)) {
                    var4_array = new pg[256];
                    var5_int = 0;
                    L3: while (true) {
                      if ((var5_int ^ -1) <= (var4_array.length ^ -1)) {
                        L4: {
                          ak.field_b = new pg[2048];
                          var2_array = sg.a(true, "", vd.field_C, "wall_hammerhead");
                          kf.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ak.field_b, 0, 256);
                          kf.a((Object[]) (Object) var4_array, 0, (Object[]) (Object) ak.field_b, 256, 256);
                          var2_array = sg.a(true, "", vd.field_C, "wall_normal_kerrus");
                          kf.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ak.field_b, 512, 256);
                          var2_array = sg.a(true, "", vd.field_C, "wall_station");
                          kf.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ak.field_b, 768, 256);
                          var2_array = sg.a(true, "", vd.field_C, "wall_hive");
                          kf.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ak.field_b, 1024, 256);
                          kf.a((Object[]) (Object) var4_array, 0, (Object[]) (Object) ak.field_b, 1280, 256);
                          kf.a((Object[]) (Object) var4_array, 0, (Object[]) (Object) ak.field_b, 1536, 256);
                          var2_array = sg.a(true, "", vd.field_C, "wall_office");
                          kf.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ak.field_b, 1792, 256);
                          var4_array = null;
                          al.field_Z = th.a(vd.field_C, -124, "digitalserial_10", te.field_J, "");
                          wh.field_d = th.a(vd.field_C, param0 + 201, "digitalserial_16", te.field_J, "");
                          mk.field_L = th.a(vd.field_C, 49, "digitalserial_20", te.field_J, "");
                          id.field_A = th.a(vd.field_C, -127, "digitalserial_12", te.field_J, "");
                          fn discarded$5 = wc.a("basicfont12", gb.field_a, 83, wd.field_a, "");
                          of.field_e = th.a(vd.field_C, -111, "micro_numbers", te.field_J, "");
                          lm.field_y = fg.a("", "splat_guard", vd.field_C, false);
                          d.field_s = fg.a("", "splat_dormant", vd.field_C, false);
                          ee.field_g = fg.a("", "splat_praetorian", vd.field_C, false);
                          fk.field_c = fg.a("", "splat_queen", vd.field_C, false);
                          rh.field_x = fg.a("", "splat_runner", vd.field_C, false);
                          tb.field_I = fg.a("", "splat_spitter", vd.field_C, false);
                          ta.field_jb = fg.a("", "splat_egg", vd.field_C, false);
                          pe.field_fb = jd.a((byte) 33, "", vd.field_C, "muzzle");
                          ln.field_m = ei.a(vd.field_C, 105, "", "newexplosion");
                          me.field_ib = ln.field_m;
                          if (!ib.a((byte) -72)) {
                            var5 = sg.a(true, "", vd.field_C, "member_benefits");
                            dh.field_a = new e(ni.field_g, aj.field_g, var5, ci.field_i);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var5 = sg.a(true, "", vd.field_C, "keys");
                        var6 = 0;
                        L5: while (true) {
                          if (var5.length <= var6) {
                            al.field_Z.a((aj[]) (Object) var5, (int[]) null);
                            id.field_A.a((aj[]) (Object) var5, (int[]) null);
                            il.field_c = jd.a((byte) 33, "", vd.field_C, "infoscreen");
                            qi.field_H = ci.a("", 27, "numkeys", vd.field_C);
                            pl.field_f = ci.a("", 114, "secweaponkeys", vd.field_C);
                            fj.field_Kb = jd.a((byte) 33, "", vd.field_C, "achievements_lrg");
                            qc.field_v = qm.a("", 0, "hs_unachieved", vd.field_C);
                            de.field_i = ci.a("basic", param0 + 222, "locked", wd.field_a);
                            ob.field_B = sg.a(true, "", vd.field_C, "hs_coins");
                            nm.field_f = ci.a("", -100, "sliderbutton", vd.field_C);
                            oa.field_m = new bd[9];
                            oa.field_m[0] = new bd(4, 4);
                            oa.field_m[1] = new bd(4, 4);
                            var6 = 0;
                            L6: while (true) {
                              if (oa.field_m[1].field_D.length <= var6) {
                                oa.field_m[6] = oa.field_m[0];
                                oa.field_m[8] = oa.field_m[0];
                                oa.field_m[4] = oa.field_m[1];
                                oa.field_m[2] = oa.field_m[0];
                                oa.field_m[3] = oa.field_m[0];
                                oa.field_m[5] = oa.field_m[0];
                                oa.field_m[7] = oa.field_m[1];
                                qc.field_x = jd.a((byte) 33, "", vd.field_C, "level_select_mouseover_frame");
                                fm.field_a = jd.a((byte) 33, "", vd.field_C, "level_select_selected_frame");
                                ul.field_J = jd.a((byte) 33, "", vd.field_C, "menu_frame");
                                ul.field_J[4] = null;
                                o.field_n.b((byte) -36);
                                cf.field_q = ei.a(vd.field_C, param0 + 218, "", "marine_run");
                                ng.field_p = new bd[5][];
                                ng.field_p[2] = ei.a(vd.field_C, param0 + 228, "", "marine_legs_left");
                                ng.field_p[3] = ei.a(vd.field_C, 97, "", "marine_legs_right");
                                ng.field_p[1] = ei.a(vd.field_C, bm.a((int) param0, -10), "", "marine_legs_forward");
                                ng.field_p[4] = ei.a(vd.field_C, 116, "", "marine_legs_back");
                                ng.field_p[4] = jh.a(ng.field_p[4], 150, 27);
                                ng.field_p[0] = null;
                                km.field_A = ei.a(vd.field_C, 96, "", "marine_idle");
                                vj.field_e = km.field_A;
                                dn.field_i = ei.a(vd.field_C, 104, "", "marine_interact");
                                od.field_G = ei.a(vd.field_C, 100, "", "marine_firing");
                                od.field_G = jh.a(od.field_G, 150, 25);
                                aa.field_d = ei.a(vd.field_C, param0 ^ -7, "", "marine_death");
                                gj.a(param0 ^ -101, ig.field_H, 84.0f);
                                ((HostileSpawn) this).a((byte) -106);
                                oc.field_c = fg.a("", "hud_gun_big", vd.field_C, false);
                                jg.field_d = fg.a("", "hud_bottom", vd.field_C, false);
                                gj.field_d = fg.a("", "hud_progress_bar", vd.field_C, false);
                                ti.field_j = fg.a("", "hud_gun_box", vd.field_C, false);
                                field_J = new bd[3];
                                field_J[0] = fg.a("", "hud_health_base", vd.field_C, false);
                                field_J[1] = fg.a("", "hud_health_slice", vd.field_C, false);
                                field_J[2] = fg.a("", "hud_health_top", vd.field_C, false);
                                vg.field_c = qm.a("", 0, "marine_face", vd.field_C);
                                nj.field_d = new pg[2][10];
                                nj.field_d[0][0] = qm.a("", 0, "kerrus_1_preview", vd.field_C);
                                nj.field_d[0][1] = qm.a("", 0, "kerrus_2_preview", vd.field_C);
                                nj.field_d[0][2] = qm.a("", 0, "kerrus_3_preview", vd.field_C);
                                nj.field_d[0][3] = qm.a("", 0, "kerrus_4_preview", vd.field_C);
                                nj.field_d[0][4] = qm.a("", param0 + 113, "kerrus_5_preview", vd.field_C);
                                nj.field_d[0][5] = qm.a("", 0, "kerrus_6_preview", vd.field_C);
                                nj.field_d[0][6] = qm.a("", param0 + 113, "kerrus_7_preview", vd.field_C);
                                nj.field_d[0][7] = qm.a("", bm.a((int) param0, -113), "kerrus_8_preview", vd.field_C);
                                nj.field_d[0][8] = qm.a("", 0, "kerrus_9_preview", vd.field_C);
                                nj.field_d[0][9] = qm.a("", 0, "kerrus_10_preview", vd.field_C);
                                nj.field_d[1][0] = qm.a("", bm.a((int) param0, -113), "vengeance_1_preview", vd.field_C);
                                nj.field_d[1][1] = qm.a("", 0, "vengeance_2_preview", vd.field_C);
                                nj.field_d[1][2] = qm.a("", 0, "vengeance_3_preview", vd.field_C);
                                nj.field_d[1][3] = qm.a("", 0, "vengeance_4_preview", vd.field_C);
                                nj.field_d[1][4] = qm.a("", 0, "vengeance_5_preview", vd.field_C);
                                nj.field_d[1][5] = qm.a("", 0, "vengeance_6_preview", vd.field_C);
                                nj.field_d[1][6] = qm.a("", param0 + 113, "vengeance_7_preview", vd.field_C);
                                nj.field_d[1][7] = qm.a("", 0, "vengeance_8_preview", vd.field_C);
                                nj.field_d[1][8] = qm.a("", 0, "vengeance_9_preview", vd.field_C);
                                nj.field_d[1][9] = qm.a("", 0, "vengeance_10_preview", vd.field_C);
                                this.s(param0 + 152);
                                ia.field_l[10] = fg.a("", "spawn20", vd.field_C, false);
                                ia.field_l[12] = fg.a("", "gunturret", vd.field_C, false);
                                ci.field_b = fg.a("", "cragturret", vd.field_C, false);
                                ia.field_l[13] = fg.a("", "barrel", vd.field_C, false);
                                bd[] discarded$6 = jd.a((byte) 33, "", vd.field_C, "spawneyes0");
                                ia.field_l[23] = ci.a("", -32, "doorgfx", vd.field_C);
                                wg.field_zb = fg.a("", "hatching", vd.field_C, false);
                                gj.a(param0 + 133, ig.field_H, 91.0f);
                                ((HostileSpawn) this).a((byte) -51);
                                qa.field_g = ei.a(vd.field_C, 101, "", "guns");
                                di.field_b = jd.a((byte) 33, "", vd.field_C, "gun_silhouettes");
                                jj.field_j = ei.a(vd.field_C, 125, "", "bullet_acid");
                                sj.field_e = fg.a("", "bullet_plasma", vd.field_C, false);
                                ue.field_c = ci.a("", -36, "bullet_rocket", vd.field_C);
                                df.field_g = ei.a(vd.field_C, 125, "", "muzzleflash");
                                id.field_p = ei.a(vd.field_C, 89, "", "impact_gun");
                                bd discarded$7 = fg.a("", "impact_rail", vd.field_C, false);
                                bd discarded$8 = ci.a("", 116, "scorchmark_alpha", vd.field_C);
                                lg.field_k = fg.a("", "spatter_spawn", vd.field_C, false);
                                if (param0 == -113) {
                                  om.field_d = fg.a("", "bullet_pistol", vd.field_C, false);
                                  te.field_G = ei.a(vd.field_C, 109, "", "grenade_roll");
                                  sc.field_l = fg.a("", "acid_drop", vd.field_C, false);
                                  v.field_j = fg.a("", "battle_damaged_cragturret", vd.field_C, false);
                                  rl.field_d = fg.a("", "battle_damaged_gunturret", vd.field_C, false);
                                  this.l((byte) 114);
                                  fa.field_d = jd.a((byte) 33, "", vd.field_C, "lights");
                                  gj.a(20, ig.field_H, 99.0f);
                                  ((HostileSpawn) this).a((byte) -69);
                                  pi.field_a[0] = ci.a("", 116, "shadow0", vd.field_C);
                                  pi.field_a[1] = ci.a("", 110, "shadow1", vd.field_C);
                                  pi.field_a[2] = ci.a("", param0 + 232, "shadow2", vd.field_C);
                                  hh.field_a = ei.a(vd.field_C, 97, "", "ammo");
                                  bd discarded$9 = fg.a("", "pointer", vd.field_C, false);
                                  li.field_t = fg.a("", "compass", vd.field_C, false);
                                  pi.field_b = ci.a("", param0 + 225, "health", vd.field_C);
                                  eg.field_v = fg.a("", "dragged_egg", vd.field_C, false);
                                  qg.field_q = fg.a("", "dragged_slime", vd.field_C, false);
                                  uf.field_g = new pg[3];
                                  uf.field_g[0] = qm.a("", 0, "win_kerrus", vd.field_C);
                                  uf.field_g[1] = qm.a("", bm.a((int) param0, -113), "win_vengeance", vd.field_C);
                                  uf.field_g[2] = qm.a("", 0, "win_vengeance_alt", vd.field_C);
                                  vd.field_C = null;
                                  gb.field_a = null;
                                  var6 = 0;
                                  L7: while (true) {
                                    if ((ia.field_l.length ^ -1) >= (var6 ^ -1)) {
                                      return;
                                    } else {
                                      L8: {
                                        if (null == ia.field_l[var6]) {
                                          break L8;
                                        } else {
                                          dc.field_a[var6] = ne.a(ia.field_l[var6], (byte) -93);
                                          break L8;
                                        }
                                      }
                                      var6++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                oa.field_m[1].field_D[var6] = 14342656;
                                var6++;
                                continue L6;
                              }
                            }
                          } else {
                            var5[var6].field_i = var5[var6].field_a;
                            var5[var6].field_c = 0;
                            var6++;
                            continue L5;
                          }
                        }
                      } else {
                        var4_array[var5_int] = var3;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var3.field_j[var4_int] = (byte) 1;
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = var2[var3_int];
                var4.c();
                var3_int++;
                continue L1;
              }
            }
          } else {
            kh.field_bb[var2_int] = var2_int * 131586;
            var2_int++;
            continue L0;
          }
        }
    }

    private final void l(byte param0) {
        bd var2 = null;
        RuntimeException var2_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = new bd(1, 1);
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
                        ia.field_l[99] = vf.field_H;
                        ia.field_l[118] = tb.field_L;
                        ia.field_l[145] = n.field_q;
                        ia.field_l[141] = ln.field_g;
                        ia.field_l[164] = pi.field_c;
                        ia.field_l[108] = cn.field_h;
                        ia.field_l[162] = ga.field_a;
                        ia.field_l[115] = td.field_f;
                        ia.field_l[212] = qc.field_q;
                        ia.field_l[140] = gi.field_j;
                        ia.field_l[207] = wc.field_e;
                        ia.field_l[74] = ki.field_b;
                        ia.field_l[177] = el.field_d;
                        ia.field_l[201] = vb.field_Lb;
                        ia.field_l[41] = og.field_d;
                        ia.field_l[120] = ub.field_c;
                        ia.field_l[210] = hj.field_r;
                        ia.field_l[146] = ml.field_a;
                        ia.field_l[130] = vi.field_k;
                        ia.field_l[62] = rb.field_y;
                        ia.field_l[89] = tc.field_b;
                        ia.field_l[105] = ig.field_R;
                        ia.field_l[189] = oa.field_i;
                        ia.field_l[128] = bm.field_f;
                        ia.field_l[54] = cl.field_j;
                        ia.field_l[91] = km.field_z;
                        ia.field_l[209] = dn.field_h;
                        ia.field_l[173] = sm.field_i;
                        ia.field_l[55] = de.field_o;
                        ia.field_l[137] = rh.field_C;
                        ia.field_l[129] = ca.field_b;
                        ia.field_l[61] = lc.field_b;
                        ia.field_l[135] = mg.field_f;
                        ia.field_l[60] = ci.field_k;
                        ia.field_l[125] = mn.field_b;
                        ia.field_l[127] = hh.field_b;
                        ia.field_l[186] = dc.field_b;
                        ia.field_l[138] = rh.field_z;
                        ia.field_l[149] = hf.field_e;
                        ia.field_l[217] = ed.field_a;
                        ia.field_l[114] = rj.field_N;
                        ia.field_l[208] = ui.field_c;
                        ia.field_l[176] = sf.field_T;
                        ia.field_l[79] = oa.field_e;
                        ia.field_l[136] = le.field_xb;
                        ia.field_l[171] = ul.field_G;
                        ia.field_l[163] = oh.field_a;
                        ia.field_l[75] = nh.field_C;
                        ia.field_l[159] = ci.field_j;
                        ia.field_l[170] = bh.field_h;
                        ia.field_l[219] = t.field_l;
                        ia.field_l[40] = f.field_b;
                        ia.field_l[168] = id.field_w;
                        ia.field_l[58] = an.field_l;
                        ia.field_l[77] = gi.field_c;
                        ia.field_l[175] = gm.field_j;
                        ia.field_l[123] = ci.field_l;
                        ia.field_l[65] = wa.field_o;
                        ia.field_l[66] = sm.field_h;
                        ia.field_l[97] = df.field_a;
                        ia.field_l[203] = qh.field_g;
                        ia.field_l[102] = lh.field_e;
                        ia.field_l[111] = qg.field_m;
                        ia.field_l[92] = ab.field_a;
                        ia.field_l[184] = ra.field_b;
                        ia.field_l[104] = ui.field_b;
                        ia.field_l[180] = nb.field_E;
                        ia.field_l[32] = kd.field_y;
                        ia.field_l[134] = mj.field_a;
                        ia.field_l[93] = vc.field_k;
                        ia.field_l[211] = pj.field_l;
                        ia.field_l[199] = var2;
                        ia.field_l[202] = uh.field_f;
                        ia.field_l[84] = gf.field_a;
                        ia.field_l[197] = var2;
                        ia.field_l[103] = vg.field_d;
                        ia.field_l[198] = var2;
                        ia.field_l[51] = eh.field_b;
                        ia.field_l[121] = fa.field_e;
                        ia.field_l[206] = vk.field_p;
                        ia.field_l[44] = oe.field_g;
                        ia.field_l[150] = gb.field_l;
                        ia.field_l[190] = om.field_e;
                        ia.field_l[96] = q.field_c;
                        ia.field_l[70] = e.field_d;
                        ia.field_l[182] = gf.field_g;
                        ia.field_l[133] = wa.field_n;
                        ia.field_l[221] = s.field_d;
                        ia.field_l[152] = ni.field_b;
                        ia.field_l[158] = jn.field_B;
                        ia.field_l[63] = ue.field_h;
                        ia.field_l[113] = ld.field_p;
                        ia.field_l[48] = hf.field_b;
                        ia.field_l[94] = jc.field_a;
                        ia.field_l[187] = bb.field_a;
                        ia.field_l[205] = j.field_a;
                        ia.field_l[193] = cf.field_t;
                        ia.field_l[144] = sj.field_b;
                        ia.field_l[139] = in.field_d;
                        if (param0 > 113) {
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
                        this.o(-63);
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
                        ia.field_l[42] = r.field_e;
                        ia.field_l[78] = el.field_f;
                        ia.field_l[218] = nb.field_J;
                        ia.field_l[183] = sd.field_w;
                        ia.field_l[81] = ue.field_f;
                        ia.field_l[53] = bi.field_b;
                        ia.field_l[153] = fm.field_b;
                        ia.field_l[131] = ri.field_k;
                        ia.field_l[174] = la.field_e;
                        ia.field_l[220] = uc.field_a;
                        ia.field_l[69] = en.field_w;
                        ia.field_l[132] = ci.field_g;
                        ia.field_l[116] = dd.field_j;
                        ia.field_l[73] = vc.field_h;
                        ia.field_l[178] = df.field_j;
                        ia.field_l[38] = oc.field_d;
                        ia.field_l[64] = jg.field_j;
                        ia.field_l[88] = ea.field_e;
                        ia.field_l[147] = p.field_d;
                        ia.field_l[192] = ne.field_n;
                        ia.field_l[155] = o.field_g;
                        ia.field_l[59] = vi.field_j;
                        ia.field_l[169] = ld.field_o;
                        ia.field_l[117] = ck.field_C;
                        ia.field_l[80] = qa.field_g[7];
                        ia.field_l[85] = bl.field_c;
                        ia.field_l[90] = oe.field_d;
                        ia.field_l[194] = uj.field_r;
                        ia.field_l[36] = ih.field_v;
                        ia.field_l[143] = kc.field_d;
                        ia.field_l[160] = ln.field_j;
                        ia.field_l[67] = pl.field_j;
                        ia.field_l[156] = wi.field_e;
                        ia.field_l[68] = pe.field_hb;
                        ia.field_l[39] = hg.field_a;
                        ia.field_l[213] = field_C;
                        ia.field_l[72] = f.field_d;
                        ia.field_l[166] = bn.field_o;
                        ia.field_l[112] = qc.field_B;
                        ia.field_l[56] = an.field_j;
                        ia.field_l[100] = nd.field_a;
                        ia.field_l[200] = sd.field_t;
                        ia.field_l[196] = hf.field_j;
                        ia.field_l[98] = sj.field_g;
                        ia.field_l[122] = ej.field_d;
                        ia.field_l[216] = gf.field_d;
                        ia.field_l[87] = vj.field_p;
                        ia.field_l[188] = qg.field_i;
                        ia.field_l[109] = jh.field_cb;
                        ia.field_l[107] = eb.field_b;
                        ia.field_l[191] = ei.field_n;
                        ia.field_l[154] = pl.field_p;
                        ia.field_l[148] = wk.field_a;
                        ia.field_l[185] = t.field_j;
                        ia.field_l[110] = fe.field_c;
                        ia.field_l[82] = ia.field_e;
                        ia.field_l[215] = la.field_h;
                        ia.field_l[167] = dl.field_r;
                        ia.field_l[195] = var2;
                        ia.field_l[165] = sm.field_d;
                        ia.field_l[35] = om.field_c;
                        ia.field_l[161] = jg.field_i;
                        ia.field_l[86] = u.field_h;
                        ia.field_l[52] = lc.field_a;
                        ia.field_l[119] = wd.field_b;
                        ia.field_l[83] = kj.field_f;
                        ia.field_l[172] = ei.field_p;
                        ia.field_l[124] = ng.field_i;
                        ia.field_l[95] = hm.field_l;
                        ia.field_l[37] = wj.field_L;
                        ia.field_l[50] = bj.field_j;
                        ia.field_l[71] = ig.field_S;
                        ia.field_l[46] = ng.field_v;
                        ia.field_l[45] = rd.field_a;
                        ia.field_l[101] = el.field_l;
                        ia.field_l[151] = wh.field_e;
                        ia.field_l[179] = dk.field_n;
                        ia.field_l[43] = r.field_b;
                        ia.field_l[49] = qj.field_l;
                        ia.field_l[126] = ln.field_c;
                        ia.field_l[57] = gi.field_f;
                        ia.field_l[181] = ni.field_d;
                        ia.field_l[34] = jd.field_h;
                        ia.field_l[33] = c.field_f[0];
                        ia.field_l[76] = wb.field_W;
                        ia.field_l[106] = ic.field_k;
                        ia.field_l[142] = li.field_y;
                        ia.field_l[204] = ei.field_m;
                        ia.field_l[214] = rg.field_a;
                        ia.field_l[157] = fg.field_d;
                        ia.field_l[47] = re.field_q;
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
                    throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.WA(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        oc var8 = null;
        int var9_int = 0;
        p var9 = null;
        oj var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_7_0 = null;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        oj stackIn_63_0 = null;
        oj stackIn_67_0 = null;
        oj stackIn_71_0 = null;
        oj stackIn_78_0 = null;
        oj stackIn_82_0 = null;
        id stackIn_89_0 = null;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        oj stackOut_62_0 = null;
        oj stackOut_66_0 = null;
        oj stackOut_70_0 = null;
        oj stackOut_77_0 = null;
        oj stackOut_81_0 = null;
        id stackOut_88_0 = null;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = ln.field_a.field_d;
                        var7 = ln.field_a.field_a;
                        var8_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((-1 + var6 ^ -1) >= (var8_int ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 + -1 <= var9_int) {
                            statePc = 35;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = var9_int * param1 - -1;
                        var3_int = var8_int * param1 - -1;
                        var5 = var8_int + var6 * var9_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackIn_7_0 = stackOut_6_0;
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
                        if (stackIn_7_0 == (Object) (Object) pk.field_d[ln.field_a.field_y[var5]]) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pk.field_d[ln.field_a.field_y[var5]].a(var3_int, var4, param1, param1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = ln.field_a.field_o[var5];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 > var10) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ak.field_b[var10].a(var3_int, var4, param1, param1);
                        if (-1 == (r.field_a ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        si.a(var3_int, var4, param1, param1, 0, 128);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var11 = ln.field_a.field_i[var5];
                        if (ln.field_a.field_f[var5] != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = var11 * 5;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 > (var11 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        si.c(var3_int, var4, param1, param1, 0);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-26 < (var11 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        si.a(var3_int, var4, param1, param1, 0, 255 - 10 * var11);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8 = new oc(0, 0);
                        var5 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (ll.field_a <= var5) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = wh.field_b[var5];
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!ln.field_a.field_B[var9.field_j.b(-4)]) {
                            statePc = 43;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3_int = 1 + param1 * var9.field_j.field_e;
                        var4 = 1 + var9.field_j.field_g * param1;
                        si.c(var3_int + -1, var4 - 1, param1, param1, 16776960);
                        si.a(-2 + var3_int, var4 - 2, param1 - -2, 2 + param1, 16776960, 32);
                        si.a(var3_int - 3, var4 - 3, param1 - -4, param1 - -4, 16776960, 32);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (el.field_j <= var5) {
                            statePc = 96;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9_ref = mm.field_m[var5];
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var9_ref.field_i == 1) {
                            statePc = 85;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = -3;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == (var9_ref.field_i ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = -19;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == (var9_ref.field_i ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = 19;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0 == var9_ref.field_i) {
                            statePc = 85;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = (oj) var9_ref;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((stackIn_63_0.field_i ^ -1) == -24) {
                            statePc = 85;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = (oj) var9_ref;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((stackIn_67_0.field_i ^ -1) != -25) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = (oj) var9_ref;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0.field_s) {
                            statePc = 85;
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
                        if (var9_ref.field_i == 25) {
                            statePc = 85;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = (oj) var9_ref;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0.field_i == 27) {
                            statePc = 85;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = (oj) var9_ref;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (stackIn_82_0.field_i != 28) {
                            statePc = 95;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!var9_ref.field_n) {
                            statePc = 95;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackOut_88_0 = ln.field_a;
                        stackIn_89_0 = stackOut_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (stackIn_89_0.field_i[var9_ref.field_j.b(-4)] > 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3_int = param1 * var9_ref.field_j.field_e - -1;
                        var4 = 1 + var9_ref.field_j.field_g * param1;
                        si.e(param1 / 2 + var3_int, param1 / 2 + var4, param1 / 2, 16711680);
                        si.f(var3_int - -(param1 / 2), var4 + param1 / 2, param1 / 2 - -1, 16711680, 128);
                        si.f(var3_int - -(param1 / 2), param1 / 2 + var4, param1 / 2 - -2, 16711680, 64);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var5++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var9_int = ha.field_t;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((var9_int ^ -1) != -1) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((var9_int ^ -1) == -7) {
                            statePc = 119;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (2 == var9_int) {
                            statePc = 132;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (-4 != (var9_int ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (12 != var9_int) {
                            statePc = 160;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var8.field_e = 0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var6 <= var8.field_e) {
                            statePc = 164;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var8.field_g = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var7 <= var8.field_g) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if ((ln.field_a.field_y[var8.b(-4)] ^ -1) == -149) {
                            statePc = 129;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var4 = 1 + (var8.field_g - 1) * param1;
                        var3_int = 1 + (-1 + var8.field_e) * param1;
                        si.c(var3_int, var4, param1 * 3, param1 * 3, 255);
                        si.a(var3_int - 1, -1 + var4, 3 * param1 - -2, 3 * param1 + 2, 255, 32);
                        si.a(var3_int - 2, -2 + var4, 3 * param1 - -4, 4 + 3 * param1, 255, 32);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var8.field_g = var8.field_g + 1;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var8.field_e = var8.field_e + 1;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var5 = 0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var5 >= el.field_j) {
                            statePc = 164;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var9_ref = mm.field_m[var5];
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (-5 != (var9_ref.field_i ^ -1)) {
                            statePc = 139;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var4 = 1 + var9_ref.field_j.field_g * param1;
                        var3_int = 1 + var9_ref.field_j.field_e * param1;
                        si.c(var3_int, var4, param1, param1, 16711680);
                        si.a(var3_int + -1, -1 + var4, param1 + 2, 2 + param1, 16711680, 32);
                        si.a(var3_int + -2, -2 + var4, 4 + param1, param1 - -4, 16711680, 32);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var5++;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var5 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if ((var5 ^ -1) <= (el.field_j ^ -1)) {
                            statePc = 164;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var9_ref = mm.field_m[var5];
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if ((var9_ref.field_i ^ -1) != -9) {
                            statePc = 147;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var4 = var9_ref.field_j.field_g * param1 - -1;
                        var3_int = var9_ref.field_j.field_e * param1 + 1;
                        si.c(var3_int - 1, -1 + var4, 2 * param1, param1 * 2, 16711680);
                        si.a(var3_int + -2, -2 + var4, 2 * param1 - -2, param1 * 2 - -2, 16711680, 32);
                        si.a(var3_int + -3, var4 + -3, 4 + param1 * 2, 4 + param1 * 2, 16711680, 32);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var5++;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var5 = 0;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if ((var5 ^ -1) <= (ll.field_a ^ -1)) {
                            statePc = 164;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var9 = wh.field_b[var5];
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if ((var9.field_i ^ -1) == -3) {
                            statePc = 155;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (-12 == (var9.field_h ^ -1)) {
                            statePc = 158;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var4 = 1 + param1 * var9.field_j.field_g;
                        var3_int = var9.field_j.field_e * param1 - -1;
                        si.c(-1 + var3_int, var4 + -1, param1, param1, 16711680);
                        si.a(-2 + var3_int, var4 + -2, param1 + 2, 2 + param1, 16711680, 32);
                        si.a(var3_int + -3, -3 + var4, 4 + param1, param1 + 4, 16711680, 32);
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var5++;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if ((nh.field_E.field_e ^ -1) <= -1) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var4 = 1 + param1 * nh.field_E.field_g;
                        var3_int = 1 + nh.field_E.field_e * param1;
                        si.f(var3_int, var4, 2 + param1, 16711680, 32);
                        si.b(var3_int, var4, param1 + 4, 16711680);
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackOut_164_0 = param0;
                        stackOut_164_1 = 4;
                        stackIn_165_0 = stackOut_164_0;
                        stackIn_165_1 = stackOut_164_1;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (stackIn_165_0 == stackIn_165_1) {
                            statePc = 169;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        this.a((java.awt.Canvas) null, -115);
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        var4 = param1 * mm.field_m[0].field_j.field_g;
                        var3_int = mm.field_m[0].field_j.field_e * param1;
                        si.c(var3_int, var4, param1, param1, 16777215);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 171: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var3, "HostileSpawn.TA(" + param0 + 44 + param1 + 41);
                }
                case 172: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != wa.field_q) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tb.f((byte) -100);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        la.b(19659);
                        if (param0 == 21085) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_C = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
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
                        tg.a((byte) 75);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.CA(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final nm q(int param0) {
        RuntimeException var2 = null;
        nm var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        nm stackIn_53_0 = null;
        nm stackOut_52_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gj.a(20, ac.field_e, 56.0f);
                        ((HostileSpawn) this).a((byte) -80);
                        nd.field_e = new rd(ul.field_P, ph.field_F);
                        var2_ref = new nm(22050, ug.field_g);
                        em.field_a[10] = va.a(ul.field_P, "", "flamethrower_all").a().a(var2_ref);
                        em.field_a[11] = va.a(ul.field_P, "", "footstep1").a().a(var2_ref);
                        em.field_a[12] = va.a(ul.field_P, "", "footstep2").a().a(var2_ref);
                        em.field_a[19] = va.a(ul.field_P, "", "slidingdoor_close").a().a(var2_ref);
                        em.field_a[20] = va.a(ul.field_P, "", "slidingdoor_open").a().a(var2_ref);
                        em.field_a[22] = va.a(ul.field_P, "", "spawn_kill").a().a(var2_ref);
                        em.field_a[23] = va.a(ul.field_P, "", "spawnhurt_splat").a().a(var2_ref);
                        lm.field_A[1] = va.a(ul.field_P, "", "acid_spit").a().a(var2_ref);
                        lm.field_A[3] = va.a(ul.field_P, "", "menu_beep").a().a(var2_ref);
                        lm.field_A[4] = va.a(ul.field_P, "", "menu_click").a().a(var2_ref);
                        lm.field_A[5] = va.a(ul.field_P, "", "burning_fire_loop").a().a(var2_ref);
                        lm.field_A[6] = va.a(ul.field_P, "", "queen_spawn").a().a(var2_ref);
                        lm.field_A[7] = va.a(ul.field_P, "", "fast_spawn").a().a(var2_ref);
                        lm.field_A[8] = va.a(ul.field_P, "", "final_explosion").a().a(var2_ref);
                        lm.field_A[9] = va.a(ul.field_P, "", "baby_spawn").a().a(var2_ref);
                        lm.field_A[14] = va.a(ul.field_P, "", "crate_explode").a().a(var2_ref);
                        lm.field_A[13] = em.field_a[14];
                        lm.field_A[17] = va.a(ul.field_P, "", "explode").a().a(var2_ref);
                        lm.field_A[20] = va.a(ul.field_P, "", "normal_alien_attack").a().a(var2_ref);
                        lm.field_A[21] = va.a(ul.field_P, "", "lift_up").a().a(var2_ref);
                        lm.field_A[22] = va.a(ul.field_P, "", "lift_down").a().a(var2_ref);
                        lm.field_A[23] = va.a(ul.field_P, "", "trigger_reactor").a().a(var2_ref);
                        ua.field_c = new jb[]{lm.field_A[24], lm.field_A[5]};
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (5 <= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sf.field_V[var3 + 5] = va.a(ul.field_P, "", "HS_machine_gun_0" + (var3 - -1) + "_tail").a().a(var2_ref);
                        sf.field_V[0 + var3] = va.a(ul.field_P, "", "HS_machine_gun_0" + (var3 - -1) + "_no_tail").a().a(var2_ref);
                        var3++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3 >= (var3 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sf.field_V[var3 + 10] = va.a(ul.field_P, "", "HS_machine_gun_cartridge_drop_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-4 >= (var3 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        sf.field_V[var3 + 12] = va.a(ul.field_P, "", "HS_pistol_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        sf.field_V[15] = va.a(ul.field_P, "", "HS_pistol_equip_01").a().a(var2_ref);
                        sf.field_V[16] = va.a(ul.field_P, "", "HS_machine_gun_equip_01").a().a(var2_ref);
                        sf.field_V[17] = va.a(ul.field_P, "", "HS_shotgun_equip_01").a().a(var2_ref);
                        sf.field_V[18] = va.a(ul.field_P, "", "HS_flamethrower_equip").a().a(var2_ref);
                        sf.field_V[19] = va.a(ul.field_P, "", "HS_railgun_equip").a().a(var2_ref);
                        sf.field_V[20] = va.a(ul.field_P, "", "HS_rocket_equip").a().a(var2_ref);
                        sf.field_V[21] = va.a(ul.field_P, "", "HS_plasma_equip_01").a().a(var2_ref);
                        sf.field_V[22] = va.a(ul.field_P, "", "HS_grenade_equip").a().a(var2_ref);
                        var3 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var3 >= 5) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        sf.field_V[23 + var3] = va.a(ul.field_P, "", "HS_shotgun_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var3 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-4 >= (var3 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        sf.field_V[var3 + 28] = va.a(ul.field_P, "", "HS_plasma_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (4 <= var3) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        sf.field_V[var3 + 31] = va.a(ul.field_P, "", "HS_railgun_0" + (var3 - -1)).a().a(var2_ref);
                        var3++;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        sf.field_V[35] = va.a(ul.field_P, "", "HS_flamethrower_all").a().a(var2_ref);
                        sf.field_V[36] = va.a(ul.field_P, "", "HS_flamethrower_end").a().a(var2_ref);
                        sf.field_V[37] = va.a(ul.field_P, "", "HS_rocket_fire_02").a().a(var2_ref);
                        sf.field_V[38] = va.a(ul.field_P, "", "HS_plasma_impact_01").a().a(var2_ref);
                        sf.field_V[39] = va.a(ul.field_P, "", "HS_grenade_fire_01").a().a(var2_ref);
                        fg.field_b[23] = va.a(ul.field_P, "", "HS_collect_charge_01").a().a(var2_ref);
                        fg.field_b[25] = va.a(ul.field_P, "", "HS_force_field_01").a().a(var2_ref);
                        fg.field_b[26] = va.a(ul.field_P, "", "HS_rumble_bgsound").a().a(var2_ref);
                        var3 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((var3 ^ -1) <= -6) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        sf.field_V[var3 + 41] = va.a(ul.field_P, "", "HS_crag_turret_0" + (var3 + 1)).a().a(var2_ref);
                        sf.field_V[46 - -var3] = va.a(ul.field_P, "", "HS_turret_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param0 <= -94) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((HostileSpawn) this).b((byte) 51);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (nm) var2_ref;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    return stackIn_53_0;
                }
                case 54: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.KA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(int param0) {
        try {
            lk.a(4, 16776960, 4, (vm) (Object) mk.field_L, 24, 320, 65280, 16777215, 24, id.field_A.field_y + al.field_Z.field_F, ul.field_J, (bd[]) null, (bd[]) null, 4, 24, 7662, 240, 40, 40, param0, (vm) (Object) id.field_A);
            this.j((byte) -91);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.EA(" + param0 + 41);
        }
    }

    private final void a(int param0, nm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        gj.a(20, ac.field_e, 63.0f);
                        ((HostileSpawn) this).a((byte) -43);
                        em.field_a[0] = qf.a(ph.field_F, "", "bang1").c().a(param1);
                        em.field_a[1] = qf.a(ph.field_F, "", "bang4").c().a(param1);
                        em.field_a[6] = qf.a(ph.field_F, "", "spawnhurt").c().a(param1);
                        em.field_a[7] = qf.a(ph.field_F, "", "spawnhurt2").c().a(param1);
                        em.field_a[8] = qf.a(ph.field_F, "", "spawnkill").c().a(param1);
                        em.field_a[24] = qf.a(ph.field_F, "", "bigspawnkill").c().a(param1);
                        sf.field_V[40] = qf.a(ph.field_F, "", "reload").c().a(param1);
                        fg.field_b[0] = qf.a(ph.field_F, "", "acid_hit_01").c().a(param1);
                        fg.field_b[1] = qf.a(ph.field_F, "", "human_pain_01").c().a(param1);
                        fg.field_b[2] = qf.a(ph.field_F, "", "human_pain_02").c().a(param1);
                        fg.field_b[3] = qf.a(ph.field_F, "", "human_pain_03").c().a(param1);
                        fg.field_b[4] = qf.a(ph.field_F, "", "human_pain_04").c().a(param1);
                        fg.field_b[5] = qf.a(ph.field_F, "", "human_pain_05").c().a(param1);
                        fg.field_b[6] = qf.a(ph.field_F, "", "human_pain_06").c().a(param1);
                        fg.field_b[7] = qf.a(ph.field_F, "", "human_pain_07").c().a(param1);
                        fg.field_b[8] = qf.a(ph.field_F, "", "human_pain_08").c().a(param1);
                        fg.field_b[9] = qf.a(ph.field_F, "", "human_pain_09").c().a(param1);
                        fg.field_b[10] = qf.a(ph.field_F, "", "human_pain_10").c().a(param1);
                        fg.field_b[11] = qf.a(ph.field_F, "", "human_pain_11").c().a(param1);
                        fg.field_b[12] = qf.a(ph.field_F, "", "human_pain_12").c().a(param1);
                        fg.field_b[13] = qf.a(ph.field_F, "", "human_pain_13").c().a(param1);
                        fg.field_b[14] = qf.a(ph.field_F, "", "human_pain_14").c().a(param1);
                        if (param0 == 22) {
                            statePc = 4;
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
                        field_B = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fg.field_b[15] = qf.a(ph.field_F, "", "human_pain_15").c().a(param1);
                        fg.field_b[17] = qf.a(ph.field_F, "", "human_death_01").c().a(param1);
                        fg.field_b[18] = qf.a(ph.field_F, "", "heal_killcount").c().a(param1);
                        fg.field_b[19] = qf.a(ph.field_F, "", "heal_small").c().a(param1);
                        fg.field_b[20] = qf.a(ph.field_F, "", "heal_large").c().a(param1);
                        fg.field_b[21] = qf.a(ph.field_F, "", "pass_card").c().a(param1);
                        fg.field_b[22] = qf.a(ph.field_F, "", "lift_powerup").c().a(param1);
                        fg.field_b[24] = qf.a(ph.field_F, "", "door_locked").c().a(param1);
                        jc.field_c[0] = qf.a(ph.field_F, "", "basic_attack_01").c().a(param1);
                        jc.field_c[1] = qf.a(ph.field_F, "", "bullet_hit_01").c().a(param1);
                        jc.field_c[2] = qf.a(ph.field_F, "", "bullet_hit_02").c().a(param1);
                        jc.field_c[3] = qf.a(ph.field_F, "", "bullet_hit_03").c().a(param1);
                        jc.field_c[4] = qf.a(ph.field_F, "", "bullet_hit_04").c().a(param1);
                        jc.field_c[5] = qf.a(ph.field_F, "", "bullet_hit_05").c().a(param1);
                        jc.field_c[6] = qf.a(ph.field_F, "", "bullet_hit_06").c().a(param1);
                        jc.field_c[7] = qf.a(ph.field_F, "", "bullet_hit_07").c().a(param1);
                        jc.field_c[8] = qf.a(ph.field_F, "", "bullet_hit_08").c().a(param1);
                        jc.field_c[9] = qf.a(ph.field_F, "", "basic_die_01").c().a(param1);
                        jc.field_c[10] = qf.a(ph.field_F, "", "basic_die_02").c().a(param1);
                        jc.field_c[11] = qf.a(ph.field_F, "", "basic_die_03").c().a(param1);
                        jc.field_c[12] = qf.a(ph.field_F, "", "basic_roar_01").c().a(param1);
                        jc.field_c[13] = qf.a(ph.field_F, "", "basic_roar_02").c().a(param1);
                        jc.field_c[14] = qf.a(ph.field_F, "", "basic_roar_03").c().a(param1);
                        jc.field_c[15] = qf.a(ph.field_F, "", "basic_roar_04").c().a(param1);
                        jc.field_c[16] = qf.a(ph.field_F, "", "basic_roar_05").c().a(param1);
                        jc.field_c[17] = qf.a(ph.field_F, "", "basic_roar_06").c().a(param1);
                        jc.field_c[18] = qf.a(ph.field_F, "", "runner_roar_01").c().a(param1);
                        jc.field_c[19] = qf.a(ph.field_F, "", "runner_roar_02").c().a(param1);
                        jc.field_c[20] = qf.a(ph.field_F, "", "runner_roar_03").c().a(param1);
                        jc.field_c[21] = qf.a(ph.field_F, "", "runner_die_01").c().a(param1);
                        jc.field_c[22] = qf.a(ph.field_F, "", "runner_die_02").c().a(param1);
                        jc.field_c[23] = qf.a(ph.field_F, "", "runner_die_03").c().a(param1);
                        jc.field_c[24] = qf.a(ph.field_F, "", "spitter_die_03").c().a(param1);
                        jc.field_c[26] = jc.field_c[24];
                        jc.field_c[25] = jc.field_c[24];
                        jc.field_c[27] = qf.a(ph.field_F, "", "guard_hurt_loop_01").c().a(param1);
                        jc.field_c[28] = qf.a(ph.field_F, "", "guard_roar_01").c().a(param1);
                        jc.field_c[29] = qf.a(ph.field_F, "", "guard_roar_02").c().a(param1);
                        jc.field_c[30] = qf.a(ph.field_F, "", "guard_roar_03").c().a(param1);
                        jc.field_c[32] = qf.a(ph.field_F, "", "queen_roar_01").c().a(param1);
                        jc.field_c[33] = qf.a(ph.field_F, "", "queen_roar_02").c().a(param1);
                        jc.field_c[34] = qf.a(ph.field_F, "", "queen_roar_03").c().a(param1);
                        jc.field_c[31] = qf.a(ph.field_F, "", "queen_big_roar_01").c().a(param1);
                        jc.field_c[35] = qf.a(ph.field_F, "", "queen_bite_01").c().a(param1);
                        jc.field_c[36] = qf.a(ph.field_F, "", "queen_bite_02").c().a(param1);
                        jc.field_c[37] = qf.a(ph.field_F, "", "queen_bite_03").c().a(param1);
                        jc.field_c[38] = qf.a(ph.field_F, "", "queen_bite_04").c().a(param1);
                        jc.field_c[39] = qf.a(ph.field_F, "", "queen_bite_05").c().a(param1);
                        jc.field_c[40] = qf.a(ph.field_F, "", "queen_die_proc_01").c().a(param1);
                        jc.field_c[41] = qf.a(ph.field_F, "", "dormant_hatch_01").c().a(param1);
                        jc.field_c[42] = qf.a(ph.field_F, "", "dormant_hatch_02").c().a(param1);
                        jc.field_c[43] = qf.a(ph.field_F, "", "dormant_hatch_03").c().a(param1);
                        jc.field_c[44] = qf.a(ph.field_F, "", "dormant_hatch_04").c().a(param1);
                        jc.field_c[45] = qf.a(ph.field_F, "", "dormant_hatch_05").c().a(param1);
                        jc.field_c[46] = qf.a(ph.field_F, "", "dormant_hatch_06").c().a(param1);
                        jc.field_c[47] = qf.a(ph.field_F, "", "egg_burst_01").c().a(param1);
                        jc.field_c[48] = qf.a(ph.field_F, "", "egg_burst_02").c().a(param1);
                        jc.field_c[49] = qf.a(ph.field_F, "", "egg_burst_03").c().a(param1);
                        jc.field_c[55] = qf.a(ph.field_F, "", "larva_die_01").c().a(param1);
                        jc.field_c[56] = qf.a(ph.field_F, "", "larva_die_02").c().a(param1);
                        jc.field_c[57] = qf.a(ph.field_F, "", "larva_die_03").c().a(param1);
                        jc.field_c[58] = qf.a(ph.field_F, "", "larva_die_04").c().a(param1);
                        jc.field_c[59] = qf.a(ph.field_F, "", "larva_die_05").c().a(param1);
                        jc.field_c[60] = qf.a(ph.field_F, "", "larva_die_06").c().a(param1);
                        jc.field_c[61] = qf.a(ph.field_F, "", "larva_die_07").c().a(param1);
                        jc.field_c[62] = qf.a(ph.field_F, "", "spitter_spit_01").c().a(param1);
                        jc.field_c[63] = qf.a(ph.field_F, "", "spitter_spit_02").c().a(param1);
                        jc.field_c[64] = qf.a(ph.field_F, "", "spitter_spit_03").c().a(param1);
                        lm.field_A[11] = qf.a(ph.field_F, "", "barrel_hit_mg_only").c().a(param1);
                        param1 = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var3;
                        stackOut_7_1 = new StringBuilder().append("HostileSpawn.LA(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void k(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_K = null;
              field_C = null;
              field_B = null;
              field_E = null;
              if (param0 > 126) {
                break L0;
              } else {
                char discarded$2 = HostileSpawn.a(21, (byte) 54);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_J = null;
        }
    }

    private final void u(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gj.a(20, wh.field_a, 70.0f);
          ((HostileSpawn) this).a((byte) -124);
          vg.field_h = ji.a(tk.field_a, "", "hostilespawntitle");
          rb.field_s = ji.a(tk.field_a, "", "hostilespawninstructions");
          dg.field_tb = ji.a(tk.field_a, "", "hostilespawnmissioncomplete");
          pe.field_ab = ji.a(tk.field_a, "", "hostilespawngameover");
          cl.field_o = ji.a(tk.field_a, "", "Hostilespawnloop");
          bb.field_b = ji.a(tk.field_a, "", "Hostilespawnloop_planet");
          uk.field_d = ji.a(tk.field_a, "", "Hostilespawnloop_goo");
          bb.field_e = ji.a(tk.field_a, "", "Hostilespawnthreat");
          var2_int = -11 % ((57 - param0) / 52);
          en.field_u = ji.a(tk.field_a, "", "hostilespawnloop_vengeance");
          ua.field_f = ji.a(tk.field_a, "", "hostilespawnthreat_vengeance");
          ph.field_F = null;
          ul.field_P = null;
          tk.field_a = null;
          boolean discarded$10 = ha.field_w.field_F.a(0, vg.field_h, ej.field_h, nd.field_e, false);
          boolean discarded$11 = ha.field_w.field_F.a(0, rb.field_s, ej.field_h, nd.field_e, false);
          boolean discarded$12 = ha.field_w.field_F.a(0, dg.field_tb, ej.field_h, nd.field_e, false);
          boolean discarded$13 = ha.field_w.field_F.a(0, pe.field_ab, ej.field_h, nd.field_e, false);
          boolean discarded$14 = ha.field_w.field_F.a(0, cl.field_o, ej.field_h, nd.field_e, false);
          boolean discarded$15 = ha.field_w.field_F.a(0, bb.field_b, ej.field_h, nd.field_e, false);
          boolean discarded$16 = ha.field_w.field_F.a(0, uk.field_d, ej.field_h, nd.field_e, false);
          boolean discarded$17 = ha.field_w.field_F.a(0, bb.field_e, ej.field_h, nd.field_e, false);
          boolean discarded$18 = ha.field_w.field_F.a(0, en.field_u, ej.field_h, nd.field_e, false);
          boolean discarded$19 = ha.field_w.field_F.a(0, ua.field_f, ej.field_h, nd.field_e, false);
          nd.field_e = null;
          ej.field_h = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw wg.a((Throwable) (Object) var2, "HostileSpawn.DA(" + param0 + 41);
    }

    public final void init() {
        try {
            ((HostileSpawn) this).a("hostilespawn", 480, 14);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.init()");
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          HostileSpawn.k((byte) 127);
          t.d(-15154);
          vl.f(param0 + 51);
          cm.a((byte) -105);
          kd.c((byte) -13);
          r.a(13496);
          em.a((byte) 126);
          ga.a((byte) -94);
          kh.a((byte) -34);
          ki.a(true);
          om.a((byte) 122);
          eh.a(true);
          ib.a(121);
          tg.a(param0 ^ 111);
          d.g((byte) -106);
          kc.a(-82);
          se.c((byte) 88);
          sc.a(-87);
          jg.b(-69);
          ci.b(-31);
          kb.c((byte) -63);
          si.b();
          gb.b(-16199);
          gf.b((byte) -105);
          il.a(-91);
          vi.g(255);
          hn.a(false);
          ie.a((byte) 4);
          vg.a(param0 + -26);
          ec.a(99);
          rl.a(719371458);
          tc.a(true);
          wh.a(0);
          oa.a(32);
          ln.a(31311);
          nl.a(false);
          in.a(-107);
          sm.a((byte) -102);
          ja.a(26);
          ue.a((byte) -27);
          gn.a(-40);
          e.b(param0 ^ 103);
          he.b(true);
          re.a(83);
          cg.a(false);
          mg.a(-12586);
          oc.c(-9575);
          eg.c(-1);
          qh.a((byte) -66);
          bi.a(true);
          nm.a((byte) 76);
          am.b((byte) -50);
          ej.d(-21742);
          dh.b(-3);
          sg.b(-106);
          bn.a(false);
          td.b(200);
          im.a(-14986);
          lh.a(-95);
          oj.g((byte) 118);
          v.b(2);
          ql.a(-3);
          we.c((byte) 122);
          p.d(-4676);
          qm.h(-13);
          id.a((byte) 21);
          ia.a((byte) -8);
          rd.b(1);
          og.a((byte) -50);
          w.a(false);
          jm.a(true);
          tm.a(true);
          gh.f();
          dl.d(-1);
          ug.g();
          ch.a(false);
          sa.a((byte) -121);
          ua.a((byte) 60);
          l.a((byte) -7);
          i.a(true);
          ml.a((byte) -67);
          s.a(false);
          pi.a(param0 ^ param0);
          c.a(true);
          bl.a(120);
          ca.a(param0 ^ 29);
          en.r(-10723);
          jc.a((byte) 89);
          uc.a(212563556);
          kl.a(126);
          fm.a((byte) -102);
          vm.a();
          be.a(param0 ^ 28);
          pc.b(1);
          bb.a((byte) -85);
          gg.a(false);
          wg.b(true);
          pe.q(8421504);
          ta.g((byte) 24);
          dg.q(param0 ^ -285);
          mk.l(param0 ^ 28);
          nb.k(82);
          lk.j(param0 + 27191);
          ij.e((byte) 75);
          na.a(param0 + 61);
          oh.a(-32278);
          wc.a(-17514);
          fh.b(9992);
          uk.b(param0 + -109);
          pb.f(param0 + -139);
          th.d((byte) 16);
          fj.i(-24510);
          cf.a(false);
          le.e(-3354);
          wk.a(2);
          dk.a((byte) 71);
          aj.a(-46);
          vh.a(false);
          ni.b(param0 ^ 107);
          qc.a(true);
          qf.a();
          rm.b();
          ok.a();
          aa.a((byte) -104);
          wl.a(110);
          eb.b(param0 + 32);
          lc.a(param0 ^ 63);
          qg.a(true);
          ih.f(param0 ^ 212);
          bh.a(-4);
          lm.b(true);
          um.a(255);
          rh.e(param0 ^ 26);
          rb.a(false);
          ee.b(param0 + -28);
          fg.a((byte) -98);
          ae.a(true);
          gi.b(true);
          uf.g(24);
          pa.g(param0 ^ 107);
          an.g(2);
          pj.c((byte) 98);
          dd.b(true);
          ob.d((byte) -127);
          vj.g(param0 + 112);
          o.g(43);
          pk.h(param0 + -26);
          jk.b(-100);
          jh.g((byte) -115);
          cn.a(param0 ^ 110);
          ge.c();
          sj.a((byte) 58);
          u.a(true);
          pf.a(true);
          wd.a((byte) 69);
          ad.a(-24221);
          qa.b(true);
          tk.a(117);
          lb.a(-16182);
          cb.a((byte) -122);
          vc.a(119);
          mf.b(-33);
          rg.a(1);
          nj.b((byte) -93);
          wf.a();
          ck.a(-665);
          ng.c(10448);
          hf.a(false);
          ve.a(0);
          rf.b(5592405);
          ha.b(true);
          ra.a(11129);
          h.a((byte) 76);
          ce.b(param0 + 6909);
          ag.d(5956);
          ph.i(84);
          fc.h(1);
          wb.n(420);
          ul.k(param0 ^ -1847325763);
          vd.a((byte) 75);
          fl.a((byte) -52);
          dc.a(256);
          hh.a(-1);
          hj.e(-97);
          ik.a((byte) -63);
          ac.a((byte) 44);
          dn.a((byte) 16);
          ud.a((byte) -120);
          rc.a(param0 + 8253);
          q.a(50);
          mj.a((byte) 122);
          fe.a((byte) -112);
          ab.a(-128);
          lg.b((byte) -121);
          wa.c((byte) 107);
          hg.a(0);
          ak.a(param0 + -15701);
          ea.a(0);
          bf.a(2107940192);
          bc.a((byte) -52);
          nf.c(118);
          pl.a(true);
          j.a((byte) -120);
          nh.k(0);
          sf.p(10);
          ig.m(25);
          me.f((byte) -56);
          mc.j(-125);
          cj.a(true);
          wj.j(11460);
          al.a((byte) 78);
          vf.a((byte) -72);
          hi.e(param0 + -4);
          of.a(true);
          te.j(0);
          g.j(-123);
          tb.e((byte) 83);
          dj.a();
          tf.a(16976);
          mb.c(param0 + 99);
          md.c((byte) 70);
          df.a(49);
          rj.e((byte) -122);
          od.e((byte) -55);
          nd.a(30401);
          ed.a(-1);
          ui.a(-1667734544);
          lj.f(param0 + -13);
          hb.a(false);
          el.b(true);
          di.a(89);
          oe.a(65);
          kj.a((byte) -13);
          qb.a(false);
          mn.b((byte) 111);
          cl.c(-128);
          ke.b(true);
          ti.a(70);
          sd.b(param0 + -822203963);
          km.c(param0 + 93);
          f.b((byte) -90);
          jn.k(608);
          ic.c(128);
          jd.c(0);
          wi.a(24074);
          vb.f(17469);
          qj.c(-13206);
          gj.a((byte) -104);
          ri.c(-1);
          hm.d(5);
          uj.c(param0 ^ 29);
          m.b(false);
          de.a(false);
          ne.a((byte) 86);
          ii.b(-111);
          ub.a(90);
          ei.c(3);
          fa.a(false);
          uh.b(64);
          vk.d(126);
          la.a((byte) -62);
          hk.c(-20150);
          fk.b((byte) -125);
          jj.a(47);
          qi.j(66);
          jf.a((byte) -99);
          gm.a(0);
          pm.b((byte) -12);
          n.d((byte) -69);
          db.d((byte) -87);
          ka.f(117);
          hd.f(-1);
          ld.f(83);
          li.d((byte) -109);
          je.a(34);
          mm.a((byte) 10);
          bm.a(-88);
          bj.c(125);
          ll.a(-125);
          ((HostileSpawn) this).field_G = null;
          ((HostileSpawn) this).field_o = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw wg.a((Throwable) (Object) var2, "HostileSpawn.PA(" + param0 + 41);
    }

    private final void j(byte param0) {
        try {
            Class var3 = null;
            Class var2 = java.awt.Toolkit.class;
            try {
                if (false) throw (IllegalAccessException) null;
                kh.field_eb = var2.getMethod("createCustomCursor", new Class[3]);
                var3 = Class.forName("java.awt.image.BufferedImage");
                od.field_F = var3.getConstructor(new Class[3]);
                le.field_eb = var3.getField("TYPE_INT_ARGB").getInt((Object) null);
                aa.field_e = var3.getMethod("setRGB", new Class[7]);
            } catch (IllegalAccessException illegalAccessException) {
                kh.field_eb = null;
                return;
            } catch (ClassNotFoundException classNotFoundException) {
                kh.field_eb = null;
                return;
            } catch (NoSuchMethodException noSuchMethodException) {
                kh.field_eb = null;
                return;
            } catch (NoSuchFieldException noSuchFieldException) {
                kh.field_eb = null;
                return;
            }
            try {
                if (param0 >= -30) {
                    field_K = null;
                }
            } catch (RuntimeException runtimeException) {
                throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.U(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void s(int param0) {
        RuntimeException var2 = null;
        bd[][][] var2_array = null;
        bd[][][] var3 = null;
        bd[] var3_array = null;
        int var4 = 0;
        bd[][] var5 = null;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        vd.field_y = new bd[7][];
                        re.field_D = new bd[7][];
                        of.field_c = new bd[7][];
                        cb.field_g = new bd[7][];
                        wc.field_f = new bd[7][];
                        ck.field_y = new bd[7][];
                        lb.field_a = new bd[7][];
                        pa.field_i = new bd[7][];
                        bf.field_f = new bd[7][];
                        kl.field_b = new bd[7][];
                        jh.field_eb = new bd[7][];
                        pa.field_i[4] = ei.a(vd.field_C, bm.a(param0, 76), "", "spawn_guard_attack");
                        pa.field_i[5] = ei.a(vd.field_C, 92, "", "spawn_guard_death");
                        pa.field_i[0] = ei.a(vd.field_C, 122, "", "spawn_guard_idle");
                        if (param0 == 39) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        pa.field_i[1] = ei.a(vd.field_C, param0 + 86, "", "spawn_guard_walk");
                        bf.field_f[5] = ei.a(vd.field_C, 115, "", "spawn_dormant_death");
                        bf.field_f[1] = ei.a(vd.field_C, 124, "", "spawn_dormant_walk");
                        bf.field_f[5] = bf.field_f[1];
                        bf.field_f[0] = bf.field_f[1];
                        bf.field_f[4] = bf.field_f[1];
                        re.field_D[4] = ei.a(vd.field_C, 102, "", "spawn_queen_attack");
                        re.field_D[5] = ei.a(vd.field_C, bm.a(param0, 87), "", "spawn_queen_death");
                        re.field_D[0] = ei.a(vd.field_C, 91, "", "spawn_queen_idle");
                        re.field_D[1] = ei.a(vd.field_C, bm.a(param0, 67), "", "spawn_queen_walk");
                        kl.field_b[4] = ei.a(vd.field_C, 102, "", "spawn_runner_attack");
                        kl.field_b[5] = ei.a(vd.field_C, 102, "", "spawn_runner_death");
                        kl.field_b[0] = ei.a(vd.field_C, param0 + 69, "", "spawn_runner_idle");
                        kl.field_b[1] = ei.a(vd.field_C, 125, "", "spawn_runner_walk");
                        lb.field_a[4] = ei.a(vd.field_C, bm.a(param0, 74), "", "spawn_spitter_attack");
                        lb.field_a[5] = ei.a(vd.field_C, 93, "", "spawn_spitter_death");
                        lb.field_a[0] = ei.a(vd.field_C, 117, "", "spawn_spitter_idle");
                        lb.field_a[1] = ei.a(vd.field_C, 126, "", "spawn_spitter_walk");
                        wc.field_f[4] = ei.a(vd.field_C, 119, "", "spawn_praetorian_attack");
                        wc.field_f[5] = ei.a(vd.field_C, param0 + 74, "", "spawn_praetorian_death");
                        wc.field_f[0] = ei.a(vd.field_C, bm.a(param0, 70), "", "spawn_praetorian_idle");
                        wc.field_f[1] = ei.a(vd.field_C, 93, "", "spawn_praetorian_walk");
                        var2_array = new bd[][][]{of.field_c, pa.field_i, bf.field_f, re.field_D, kl.field_b, lb.field_a, cb.field_g, vd.field_y, wc.field_f};
                        var3 = var2_array;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var3.length) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = var3[var4];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5[3] = var5[1];
                        var5[2] = var5[1];
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3_array = new bd[lb.field_a[0].length + lb.field_a[4].length];
                        kf.a((Object[]) (Object) lb.field_a[4], 0, (Object[]) (Object) var3_array, 0, lb.field_a[4].length);
                        kf.a((Object[]) (Object) lb.field_a[0], 0, (Object[]) (Object) var3_array, lb.field_a[4].length, lb.field_a[0].length);
                        lb.field_a[4] = var3_array;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.IA(" + param0 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_4_0 = null;
        byte[][][] stackIn_4_1 = null;
        Object stackOut_3_0 = null;
        byte[][][] stackOut_3_1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oc.field_h[0][3] = bi.field_h.a("level01-new.dat", "", 0);
                        oc.field_h[0][4] = bi.field_h.a("level02-new.dat", "", 0);
                        oc.field_h[0][5] = bi.field_h.a("level03-new.dat", "", param0 + 0);
                        oc.field_h[0][6] = bi.field_h.a("level04-new.dat", "", 0);
                        oc.field_h[0][7] = bi.field_h.a("level05-new.dat", "", 0);
                        oc.field_h[0][8] = bi.field_h.a("level06-new.dat", "", 0);
                        oc.field_h[0][9] = bi.field_h.a("level07-new.dat", "", 0);
                        oc.field_h[0][0] = bi.field_h.a("levelf1-new.dat", "", param0);
                        oc.field_h[0][1] = bi.field_h.a("levelf2-new.dat", "", 0);
                        oc.field_h[0][2] = bi.field_h.a("levelf3-new.dat", "", bm.a(param0, 0));
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-11 >= (var2_int ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = null;
                        stackOut_3_1 = oc.field_h;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
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
                        if (stackIn_4_0 == (Object) (Object) stackIn_4_1[0][var2_int]) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        System.err.println("Error loading leveldata for kerrus[" + var2_int + "]");
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        bi.field_h = null;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.AA(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        m var2_ref = null;
        int var3_int = 0;
        hm var3 = null;
        int var4 = 0;
        kd stackIn_11_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ue stackIn_27_0 = null;
        int stackIn_104_0 = 0;
        kd stackOut_10_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        ue stackOut_26_0 = null;
        int stackOut_103_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        em.field_c = em.field_c + 1;
                        q.b(14470);
                        if (null == mb.field_s) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        mb.field_s.b(param0 ^ 53);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == -35) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((HostileSpawn) this).e(-72);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!wh.field_f) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ha.field_w;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!((kd) (Object) stackIn_11_0).a(dg.field_tb, 105)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        sj.b(true);
                        wh.field_f = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (null != wa.field_q) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackOut_20_1 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((HostileSpawn) this).a(stackIn_21_1 != 0, param0 + 9803);
                        if (!ri.field_m) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        cf.d(-112);
                        ri.field_m = false;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null == wa.field_q) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = wa.field_q;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0.field_g) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        td.c((byte) 113);
                        v.a(-112, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (cm.b((byte) -97)) {
                            statePc = 115;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (ul.field_N) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        boolean discarded$1 = this.p(4);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == sg.field_j) {
                            statePc = 64;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (sg.field_j.field_l) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_int = sg.field_j.field_j.length;
                        var3_int = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var2_int <= var3_int) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        pb.field_Ob[var3_int] = sg.field_j.field_j[var3_int];
                        uk.field_c[var3_int] = ll.a(uk.field_c[var3_int], pb.field_Ob[var3_int]);
                        var3_int++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (hb.a(18, pb.field_Ob, false)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        bh.field_g[18] = vg.a(new String[1], 91, sf.field_Y);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        sg.field_j = null;
                        kb.b((byte) -43);
                        var3 = (hm) (Object) vl.field_c.g(param0 + -68);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var3 == null) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        jh.a(125, 4, var3);
                        var3 = (hm) (Object) vl.field_c.a(12684);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (el.field_h[0] == null) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.a((byte) 113, 0);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (el.field_h[1] != null) {
                            statePc = 85;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (nh.field_L == null) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (nh.field_L.field_j) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        nh.field_L = null;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.m((byte) 76);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        this.a((byte) 113, 1);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (ta.p(3)) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_ref = (m) (Object) tm.field_o.c(18120);
                        if (null == var2_ref) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        g.a(var2_ref, 6, -7347);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (!wd.a(23278, ng.field_l)) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ((HostileSpawn) this).h((byte) 126);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        mb.d(0, -22370);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (ig.c(false)) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var2_int = ((HostileSpawn) this).d((byte) -75);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((var2_int ^ -1) == -1) {
                            statePc = 109;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = -2;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0 == (var2_int ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        jh.b(2, -107);
                        qj.a((byte) -21, 3);
                        vh.a((byte) 113, 4);
                        og.a(-22248, 5);
                        jd.a(6, 65535);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if ((var2_int ^ -1) == -3) {
                            statePc = 113;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        cf.b(true);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        ((HostileSpawn) this).h(-12752);
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.HA(" + param0 + 41);
                }
                case 120: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static char a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        char stackIn_22_0 = 0;
        int stackOut_9_0 = 0;
        char stackOut_21_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 3) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_F = false;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = 255 & param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 != var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (128 > var2_int) {
                            statePc = 21;
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
                        stackOut_9_0 = var2_int;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((stackIn_10_0 ^ -1) > -161) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = kh.field_hb[-128 + var2_int];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var3 ^ -1) == -1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = 63;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2_int = var3;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (char)var2_int;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.SA(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public HostileSpawn() {
        ((HostileSpawn) this).field_D = 0;
        try {
            ni.field_g = (java.applet.Applet) this;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.<init>()");
        }
    }

    private final boolean p(int param0) {
        NullPointerException var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        nm var2_ref2 = null;
        int var3 = 0;
        int stackIn_37_0 = 0;
        gb stackIn_43_0 = null;
        int stackIn_49_0 = 0;
        gb stackIn_52_0 = null;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        gb stackIn_67_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_85_0 = 0;
        gb stackIn_88_0 = null;
        int stackIn_94_0 = 0;
        gb stackIn_97_0 = null;
        int stackIn_104_0 = 0;
        int stackIn_110_0 = 0;
        gb stackIn_113_0 = null;
        int stackIn_120_0 = 0;
        gb stackIn_123_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_135_0 = 0;
        gb stackIn_138_0 = null;
        int stackIn_144_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_173_0 = 0;
        int stackOut_36_0 = 0;
        gb stackOut_42_0 = null;
        int stackOut_48_0 = 0;
        gb stackOut_51_0 = null;
        int stackOut_57_0 = 0;
        int stackOut_63_0 = 0;
        gb stackOut_66_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_84_0 = 0;
        gb stackOut_87_0 = null;
        int stackOut_93_0 = 0;
        gb stackOut_96_0 = null;
        int stackOut_103_0 = 0;
        int stackOut_109_0 = 0;
        gb stackOut_112_0 = null;
        int stackOut_119_0 = 0;
        gb stackOut_122_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_134_0 = 0;
        gb stackOut_137_0 = null;
        int stackOut_143_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_172_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sc.a((byte) 118);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ml.a((byte) 112, ll.field_c);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof NullPointerException ? 4 : 174);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = (NullPointerException) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (mm.field_m != null) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        mm.field_m = new oj[3000];
                        var2_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3001 >= (var2_int ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mm.field_m[var2_int] = new oj();
                        var2_int++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof NullPointerException ? 10 : 174);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null != re.field_n) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        re.field_n = new oj[3000];
                        var2_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (3000 <= var2_int) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        re.field_n[var2_int] = new oj();
                        var2_int++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof NullPointerException ? 16 : 174);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (vj.field_w != null) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        vj.field_w = new qm[3000];
                        var2_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (3000 <= var2_int) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        vj.field_w[var2_int] = new qm();
                        var2_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof NullPointerException ? 22 : 174);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null != jn.field_F) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        jn.field_F = new p[8000];
                        var2_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-8001 >= (var2_int ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        jn.field_F[var2_int] = new p();
                        var2_int++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof NullPointerException ? 28 : 174);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (wh.field_b != null) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        wh.field_b = new p[1000];
                        var2_int = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var2_int ^ -1) <= -1001) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        wh.field_b[var2_int] = new p();
                        var2_int++;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof NullPointerException ? 34 : 174);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param0 == 4) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0 != 0;
                }
                case 38: {
                    try {
                        if (null != ul.field_P) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof RuntimeException ? 174 : 40);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof RuntimeException ? 174 : 40);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!ul.field_P.a(-15879)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof NullPointerException ? 45 : 174);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = ul.field_P;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof NullPointerException ? 45 : 174);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!((gb) (Object) stackIn_43_0).e(param0 ^ 4)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof NullPointerException ? 47 : 174);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof NullPointerException ? 47 : 174);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof NullPointerException ? 47 : 174);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof NullPointerException ? 47 : 174);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        gj.a(20, md.a(sd.field_v, ul.field_P, hn.field_c, (byte) -112), 5.0f);
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0 != 0;
                }
                case 50: {
                    try {
                        if (!ph.field_F.a(param0 + -15883)) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof RuntimeException ? 174 : 54);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = ph.field_F;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof RuntimeException ? 174 : 54);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!((gb) (Object) stackIn_52_0).e(0)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof NullPointerException ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof NullPointerException ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof NullPointerException ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof NullPointerException ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        gj.a(param0 ^ 16, md.a(sd.field_v, ph.field_F, hn.field_c, (byte) 84), 10.0f);
                        stackOut_57_0 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return stackIn_58_0 != 0;
                }
                case 59: {
                    try {
                        if (!ej.field_h.a(-15879)) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof RuntimeException ? 174 : 62);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (ej.field_h.e(0)) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof RuntimeException ? 174 : 62);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        gj.a(20, md.a(fh.field_i, ej.field_h, rd.field_g, (byte) 102), 15.0f);
                        stackOut_63_0 = 0;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return stackIn_64_0 != 0;
                }
                case 65: {
                    try {
                        if (!tk.field_a.a(param0 ^ -15875)) {
                            statePc = 72;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof RuntimeException ? 174 : 69);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = tk.field_a;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof RuntimeException ? 174 : 69);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (!((gb) (Object) stackIn_67_0).e(0)) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof NullPointerException ? 71 : 174);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof NullPointerException ? 71 : 174);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof NullPointerException ? 71 : 174);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof NullPointerException ? 71 : 174);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        gj.a(param0 ^ 16, md.a(fh.field_i, tk.field_a, rd.field_g, (byte) 79), 20.0f);
                        stackOut_72_0 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return stackIn_73_0 != 0;
                }
                case 74: {
                    try {
                        if (!vd.field_C.a(-15879)) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof RuntimeException ? 174 : 77);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (vd.field_C.e(param0 ^ 4)) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof RuntimeException ? 174 : 77);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        gj.a(20, md.a(lj.field_r, vd.field_C, cl.field_h, (byte) -88), 25.0f);
                        stackOut_78_0 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 79: {
                    return stackIn_79_0 != 0;
                }
                case 80: {
                    try {
                        if (!bi.field_h.a(param0 ^ -15875)) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof RuntimeException ? 174 : 83);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (bi.field_h.e(param0 ^ 4)) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof RuntimeException ? 174 : 83);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        gj.a(param0 ^ 16, md.a(ci.field_f, bi.field_h, dg.field_rb, (byte) 68), 30.0f);
                        stackOut_84_0 = 0;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return stackIn_85_0 != 0;
                }
                case 86: {
                    try {
                        if (!gi.field_h.a(-15879)) {
                            statePc = 93;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof RuntimeException ? 174 : 90);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = gi.field_h;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = (stateCaught_87 instanceof RuntimeException ? 174 : 90);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (!((gb) (Object) stackIn_88_0).e(0)) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = (stateCaught_88 instanceof NullPointerException ? 92 : 174);
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = (stateCaught_89 instanceof NullPointerException ? 92 : 174);
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = (stateCaught_90 instanceof NullPointerException ? 92 : 174);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof NullPointerException ? 92 : 174);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        gj.a(20, md.a(ci.field_f, gi.field_h, dg.field_rb, (byte) -82), 35.0f);
                        stackOut_93_0 = 0;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 94: {
                    return stackIn_94_0 != 0;
                }
                case 95: {
                    try {
                        if (null == wd.field_a) {
                            statePc = 105;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = (stateCaught_95 instanceof RuntimeException ? 174 : 99);
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = wd.field_a;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = (stateCaught_96 instanceof RuntimeException ? 174 : 99);
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (!((gb) (Object) stackIn_97_0).a(param0 ^ -15875)) {
                            statePc = 103;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = (stateCaught_97 instanceof NullPointerException ? 102 : 174);
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = (stateCaught_98 instanceof NullPointerException ? 102 : 174);
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = (stateCaught_99 instanceof NullPointerException ? 102 : 174);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (wd.field_a.a(-8088, "basic")) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof NullPointerException ? 102 : 174);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        gj.a(param0 ^ 16, s.a(wd.field_a, "basic", 47, cl.field_h, lj.field_r), 40.0f);
                        stackOut_103_0 = 0;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 104: {
                    return stackIn_104_0 != 0;
                }
                case 105: {
                    try {
                        if (!he.field_t.a(-15879)) {
                            statePc = 109;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = (stateCaught_105 instanceof RuntimeException ? 174 : 108);
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (he.field_t.e(0)) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = (stateCaught_106 instanceof RuntimeException ? 174 : 108);
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        gj.a(20, s.a(tk.field_a, "", 66, cl.field_h, lj.field_r), 80.0f);
                        stackOut_109_0 = 0;
                        stackIn_110_0 = stackOut_109_0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 110: {
                    return stackIn_110_0 != 0;
                }
                case 111: {
                    try {
                        if (te.field_J == null) {
                            statePc = 121;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = (stateCaught_111 instanceof RuntimeException ? 174 : 115);
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = te.field_J;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = (stateCaught_112 instanceof RuntimeException ? 174 : 115);
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (!((gb) (Object) stackIn_113_0).a(-15879)) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = (stateCaught_113 instanceof NullPointerException ? 118 : 174);
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = (stateCaught_114 instanceof NullPointerException ? 118 : 174);
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = (stateCaught_115 instanceof NullPointerException ? 118 : 174);
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (te.field_J.e(param0 ^ 4)) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = (stateCaught_116 instanceof NullPointerException ? 118 : 174);
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        gj.a(param0 ^ 16, md.a(in.field_a, te.field_J, cf.field_r, (byte) -58), 50.0f);
                        stackOut_119_0 = 0;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 120: {
                    return stackIn_120_0 != 0;
                }
                case 121: {
                    try {
                        if (!wd.field_a.a(param0 + -15883)) {
                            statePc = 128;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = (stateCaught_121 instanceof RuntimeException ? 174 : 125);
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = wd.field_a;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = (stateCaught_122 instanceof RuntimeException ? 174 : 125);
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!((gb) (Object) stackIn_123_0).a(-8088, "basicfont12")) {
                            statePc = 128;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = (stateCaught_123 instanceof NullPointerException ? 127 : 174);
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = (stateCaught_124 instanceof NullPointerException ? 127 : 174);
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = (stateCaught_125 instanceof NullPointerException ? 127 : 174);
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = (stateCaught_126 instanceof NullPointerException ? 127 : 174);
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        gj.a(20, s.a(wd.field_a, "basicfont12", param0 ^ 57, cl.field_h, lj.field_r), 14.0f);
                        stackOut_128_0 = 0;
                        stackIn_129_0 = stackOut_128_0;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 129: {
                    return stackIn_129_0 != 0;
                }
                case 130: {
                    try {
                        if (!gb.field_a.a(-15879)) {
                            statePc = 134;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = (stateCaught_130 instanceof RuntimeException ? 174 : 133);
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (gb.field_a.a(param0 ^ -8084, "basicfont12")) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = (stateCaught_131 instanceof RuntimeException ? 174 : 133);
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        gj.a(20, s.a(gb.field_a, "basicfont12", 125, cf.field_r, in.field_a), 15.0f);
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 135: {
                    return stackIn_135_0 != 0;
                }
                case 136: {
                    try {
                        if (!wd.field_a.a(-15879)) {
                            statePc = 143;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = (stateCaught_136 instanceof RuntimeException ? 174 : 140);
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = wd.field_a;
                        stackIn_138_0 = stackOut_137_0;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = (stateCaught_137 instanceof RuntimeException ? 174 : 140);
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (!((gb) (Object) stackIn_138_0).a(param0 + -8092, "kartika13")) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = (stateCaught_138 instanceof NullPointerException ? 142 : 174);
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = (stateCaught_139 instanceof NullPointerException ? 142 : 174);
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = (stateCaught_140 instanceof NullPointerException ? 142 : 174);
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = (stateCaught_141 instanceof NullPointerException ? 142 : 174);
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        gj.a(20, s.a(wd.field_a, "kartika13", 113, cl.field_h, lj.field_r), 11.0f);
                        stackOut_143_0 = 0;
                        stackIn_144_0 = stackOut_143_0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 144: {
                    return stackIn_144_0 != 0;
                }
                case 145: {
                    try {
                        if (!gb.field_a.a(-15879)) {
                            statePc = 149;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = (stateCaught_145 instanceof RuntimeException ? 174 : 148);
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (gb.field_a.a(-8088, "kartika13")) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = (stateCaught_146 instanceof RuntimeException ? 174 : 148);
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        gj.a(param0 + 16, s.a(gb.field_a, "kartika13", 84, cf.field_r, in.field_a), 17.0f);
                        stackOut_149_0 = 0;
                        stackIn_150_0 = stackOut_149_0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 150: {
                    return stackIn_150_0 != 0;
                }
                case 151: {
                    try {
                        kb.b((byte) -43);
                        u.field_e = u.field_e - w.field_r;
                        w.field_r = 0;
                        hg.field_e = 0;
                        var2_ref2 = this.q(-96);
                        this.a(22, var2_ref2);
                        this.u(111);
                        stackOut_151_0 = 0;
                        stackIn_152_0 = stackOut_151_0;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 152: {
                    return stackIn_152_0 != 0;
                }
                case 153: {
                    try {
                        if (vd.field_C == null) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        this.i((byte) -113);
                        stackOut_154_0 = 0;
                        stackIn_155_0 = stackOut_154_0;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 155: {
                    return stackIn_155_0 != 0;
                }
                case 156: {
                    try {
                        if (null == he.field_t) {
                            statePc = 159;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        this.l(-4);
                        stackOut_157_0 = 0;
                        stackIn_158_0 = stackOut_157_0;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 158: {
                    return stackIn_158_0 != 0;
                }
                case 159: {
                    try {
                        if (null == bi.field_h) {
                            statePc = 162;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        this.n(param0 + -4);
                        stackOut_160_0 = 0;
                        stackIn_161_0 = stackOut_160_0;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 161: {
                    return stackIn_161_0 != 0;
                }
                case 162: {
                    try {
                        if (wb.field_S <= 0) {
                            statePc = 168;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = (stateCaught_162 instanceof RuntimeException ? 174 : 165);
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (null == gi.field_h) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = (stateCaught_163 instanceof RuntimeException ? 174 : 165);
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        this.o(28974);
                        stackOut_166_0 = 0;
                        stackIn_167_0 = stackOut_166_0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 167: {
                    return stackIn_167_0 != 0;
                }
                case 168: {
                    try {
                        li.a(50, param0 ^ 3);
                        ij.a((byte) -17, vg.field_h);
                        am.field_d = (HostileSpawn) this;
                        this.m(300);
                        of.field_h = new re(true);
                        if (ta.p(3)) {
                            statePc = 172;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = (stateCaught_168 instanceof RuntimeException ? 174 : 171);
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        sg.field_j = wk.a(4, -2178);
                        of.field_h.f(-121);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = (stateCaught_169 instanceof RuntimeException ? 174 : 171);
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        ul.field_N = true;
                        ql.f(8036);
                        stackOut_172_0 = 1;
                        stackIn_173_0 = stackOut_172_0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 173: {
                    return stackIn_173_0 != 0;
                }
                case 174: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.VA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!el.field_h[param1].field_j) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if ((el.field_h[param1].field_h[0] ^ -1) >= (gn.field_k[param1] ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        gn.field_k[param1] = el.field_h[param1].field_h[0];
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        el.field_h[param1] = null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        of.field_h.field_E = null;
                        if (param0 == 113) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_C = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var3, "HostileSpawn.RA(" + param0 + 44 + param1 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void r(int param0) {
        t var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -113) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        nm discarded$2 = this.q(-36);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = (t) (Object) ac.field_i.g(-54);
                        if (null == var2) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = ((HostileSpawn) this).field_D;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (80 > var4) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-231 >= (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = 8;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = -(var4 / 2) + 123;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = var4 / 2 - 32;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        fj.field_Kb[var2.field_h].b(8, var3);
                        al.field_Z.c(il.field_b[var2.field_h], 48, id.field_A.field_y + var3, 65280, -1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.OA(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        ue var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_11_1 = null;
        boolean stackIn_11_2 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_12_1 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_14_1 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_16_1 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        ue stackOut_2_0 = null;
        java.awt.Canvas stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        ue stackOut_9_1 = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_10_1 = null;
        boolean stackOut_10_2 = false;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_11_1 = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_12_1 = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (wa.field_q == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = wa.field_q;
                        stackIn_5_0 = (Object) (Object) stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = se.field_h;
                        stackIn_5_0 = (Object) (Object) stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = (ue) (Object) stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (cm.b((byte) -97)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 0;
                        stackOut_9_1 = (ue) var2;
                        stackIn_14_0 = stackOut_9_0;
                        stackIn_14_1 = (RuntimeException) (Object) stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = (RuntimeException) (Object) stackOut_9_1;
                        if (wa.field_q != null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = (RuntimeException) (Object) stackIn_10_1;
                        stackOut_10_2 = nm.field_a;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = (RuntimeException) (Object) stackIn_11_1;
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_16_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (!stackIn_11_2) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = (RuntimeException) (Object) stackIn_12_1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = (RuntimeException) (Object) stackIn_14_1;
                        stackOut_14_2 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = (RuntimeException) (Object) stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        gb.a(stackIn_17_0 != 0, (java.awt.Canvas) (Object) stackIn_17_1, stackIn_17_2 != 0);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        if (!ul.field_N) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ad.a((java.awt.Canvas) (Object) var2, false);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        if (null == ei.field_o) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        si.d();
                        ei.field_o.a(104);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == of.field_h) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        me.b(108, 0);
                        of.field_h.h(26);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == ((HostileSpawn) this).field_G) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((HostileSpawn) this).field_G.b((byte) -99);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3 = 1;
                        if (0 > ri.field_h) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((hf.field_i ^ -1) <= -1) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3 = 2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        me.b(105, var3);
                        rd.a(false);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.a((java.awt.Canvas) (Object) var2, 67);
                        if (param0 <= -34) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.l(112);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.MA(" + param0 + 41);
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void l(int param0) {
        RuntimeException var2 = null;
        bd[][] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        bd[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        bd[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        uf.field_i[4] = new bd(he.field_t.a("starfield.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
                        var2_array = new bd[8][];
                        var2_array[0] = gl.a(new bd(he.field_t.a("floors_1.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
                        var2_array[1] = gl.a(new bd(he.field_t.a("floors_2.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h), 20, 8);
                        var2_array[2] = gl.a(new bd(he.field_t.a("floors_3.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
                        var2_array[3] = gl.a(new bd(he.field_t.a("floors_4.jpg", "", bm.a(param0, param0)), (java.awt.Component) (Object) se.field_h), 20, 8);
                        var2_array[5] = gl.a(new bd(he.field_t.a("floors_6.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h), 20, 8);
                        var2_array[6] = gl.a(new bd(he.field_t.a("floors_7.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
                        pk.field_d = new bd[1280];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (bd[][]) var2_array;
                        stackOut_3_1 = var3;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
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
                        if (stackIn_4_0[stackIn_4_1] == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kf.a((Object[]) (Object) var2_array[var3], 0, (Object[]) (Object) pk.field_d, var3 * 160, 160);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_array = null;
                        ri.field_p = new bd(he.field_t.a("bg.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
                        hk.field_h = new bd(he.field_t.a("hs_logo.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
                        var3 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((hk.field_h.field_D.length ^ -1) >= (var3 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = -11;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 >= (255 & hk.field_h.field_D[var3] >> 753806480 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hk.field_h.field_D[var3] = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        o.field_n.b((byte) 125);
                        he.field_t = null;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.V(" + param0 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oc.field_h[1][0] = gi.field_h.a("level_01.dat", "", 0);
          oc.field_h[1][1] = gi.field_h.a("level_02.dat", "", bm.a(param0, 28974));
          oc.field_h[1][2] = gi.field_h.a("level_03.dat", "", bm.a(param0, 28974));
          oc.field_h[1][3] = gi.field_h.a("level_04.dat", "", bm.a(param0, param0));
          oc.field_h[1][4] = gi.field_h.a("level_05.dat", "", param0 + -28974);
          oc.field_h[1][5] = gi.field_h.a("level_06.dat", "", param0 + -28974);
          oc.field_h[1][6] = gi.field_h.a("level_07.dat", "", 0);
          oc.field_h[1][7] = gi.field_h.a("level_08.dat", "", 0);
          oc.field_h[1][8] = gi.field_h.a("level_09.dat", "", 0);
          oc.field_h[1][9] = gi.field_h.a("level_10.dat", "", 0);
          gi.field_h = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw wg.a((Throwable) (Object) var2, "HostileSpawn.JA(" + param0 + 41);
    }

    private final void m(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_70_0 = null;
        ue stackIn_86_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_69_0 = null;
        ue stackOut_85_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        q.field_n = q.field_n + j.field_c;
                        in.field_b = in.field_b - j.field_c;
                        if (ig.field_L == 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        lg.field_m = lg.field_m + 1;
                        q.field_n = q.field_n + fa.field_a;
                        in.field_b = in.field_b - pf.field_o * lg.field_m;
                        fa.field_a = fa.field_a - pf.field_o;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!m.field_l) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        of.field_h.f(param0 ^ -35);
                        cn.a(false, (byte) 99);
                        m.field_l = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!jk.a(-23322)) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = lj.d(-83);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2_int != 2) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (wa.field_q == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        v.a(15, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var2_int ^ -1) != -4) {
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
                        nh.a(true, (byte) -90);
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var2_int != 4) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        m.field_l = true;
                        od.k(0);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return;
                }
                case 26: {
                    try {
                        if (!pf.a(param0 + -202)) {
                            statePc = 52;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = this;
                        stackIn_32_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (wa.field_q == null) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = this;
                        stackIn_30_0 = stackOut_28_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = this;
                        stackOut_30_1 = 1;
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = this;
                        stackOut_32_1 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2_int = ((HostileSpawn) this).b(stackIn_33_1 != 0, param0 + -77);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-2 == (var2_int ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var2_int ^ -1) != -3) {
                            statePc = 51;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (wa.field_q == null) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        v.a(15, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        dc.a(param0 + -1, bn.c(-1));
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null == wa.field_q) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        v.a(param0 + -38, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return;
                }
                case 52: {
                    try {
                        if (null != ei.field_o) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ei.field_o.a((byte) -114);
                        if (0 != pf.field_o) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ei.field_o.d(param0 ^ -816);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (ei.field_o.b((byte) -66)) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ei.field_o = null;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return;
                }
                case 64: {
                    try {
                        if (param0 == 76) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        field_K = null;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (null == ac.field_i.g(-103)) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = this;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        ((HostileSpawn) this).field_D = ((HostileSpawn) this).field_D + 1;
                        if ((((HostileSpawn) this).field_D + 1 ^ -1) != -336) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        ((HostileSpawn) this).field_D = 0;
                        am discarded$2 = ac.field_i.c(18120);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ca.field_c = ca.field_c + 10;
                        if (0 >= ((HostileSpawn) this).field_H) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((HostileSpawn) this).field_H = ((HostileSpawn) this).field_H - 1;
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
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-513 > (ca.field_c ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ca.field_c = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (wa.field_q == null) {
                            statePc = 92;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = wa.field_q;
                        stackIn_86_0 = stackOut_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!stackIn_86_0.field_g) {
                            statePc = 92;
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
                        td.c((byte) 110);
                        v.a(29, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (of.field_h == null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        cg.a(-27587);
                        boolean discarded$3 = mb.field_s.b(0, (byte) 95);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    return;
                }
                case 95: {
                    try {
                        if (null != ((HostileSpawn) this).field_G) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ((HostileSpawn) this).field_G.b(32);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return;
                }
                case 100: {
                    try {
                        wj.a((byte) -59);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) var2, "HostileSpawn.BA(" + param0 + 41);
                }
                case 103: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        w var2 = null;
        kh var3 = null;
        kh var4 = null;
        kh var5 = null;
        kd var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((HostileSpawn) this).a(9, false, 11, 23, 0, false, 13, 10);
                        eh.field_c = new wm();
                        var2 = new w();
                        var2.c(param0 + 4325, 128, 9);
                        var3 = new kh();
                        var4 = new kh((w) (Object) var3);
                        var5 = new kh((w) (Object) var3);
                        var6 = new kd((w) (Object) var3, (w) (Object) var4, (w) (Object) var5);
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
                        mb.field_s = new he(var5);
                        aj.a(var6, -25127, 22050, (java.awt.Component) (Object) se.field_h, true, gf.field_b);
                        if (param0 == -4323) {
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
                        this.m(-15);
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
                        kd.field_v = new gd((tj) (Object) eh.field_c);
                        kd.field_v.f(0.5f);
                        kd.field_v.b(0.699999988079071f);
                        kd.field_v.e(30.0f);
                        kd.field_v.c(0.4000000059604645f);
                        kd.field_v.a(0.6000000238418579f);
                        kd.field_v.d(0.30000001192092896f);
                        eb.field_e.a((tj) (Object) kd.field_v);
                        wj.field_O = wj.field_O / 4;
                        uj.field_p = new oc();
                        ((HostileSpawn) this).a(true, (byte) 44, true, true, true);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.GA(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 > -18) {
                char discarded$0 = HostileSpawn.a(-115, (byte) 85);
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                param0.getAppletContext().showDocument(nj.a(param0, true, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(java.awt.Canvas param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        this.r(param1 ^ -59);
                        if (jk.a(param1 + -23389)) {
                            statePc = 11;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!pf.a(param1 + -178)) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (wa.field_q != null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_10_0 = stackOut_7_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        hi.a(stackIn_10_0 != 0, (byte) 127);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        si.a(0, 0, 640, 480, 0, 128);
                        var3_int = -8 + (320 + -(lm.e(0) / 2) + -8);
                        var4 = -8 + (240 + -(ti.a((byte) -1) / 2)) + -8;
                        var5 = 16 + lm.e(param1 ^ 67) - -16;
                        var6 = 16 + (ti.a((byte) -1) + 16);
                        si.c(var3_int - 8, -8 + var4, var5 - -16, var6 - -16, 0);
                        wh.b(param1 + 44);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param1 == 67) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((HostileSpawn) this).field_D = 109;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ui.a(0, param0, (byte) 97, 0);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) var3;
                        stackOut_19_1 = new StringBuilder().append("HostileSpawn.QA(");
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                    stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                    stackOut_22_2 = "null";
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void t(int param0) {
        int var2_int = 0;
        int var3 = 0;
        var3 = field_I ? 1 : 0;
        kd.field_y = ci.a("", 127, "Scenery_1", vd.field_C);
        c.field_f = ei.a(vd.field_C, 97, "", "Scenery_2");
        jd.field_h = fg.a("", "Scenery_3", vd.field_C, false);
        om.field_c = fg.a("", "Scenery_4", vd.field_C, false);
        ih.field_v = fg.a("", "Scenery_5", vd.field_C, false);
        wj.field_L = fg.a("", "Scenery_6", vd.field_C, false);
        oc.field_d = fg.a("", "Scenery_7", vd.field_C, false);
        hg.field_a = fg.a("", "Scenery_8", vd.field_C, false);
        f.field_b = ci.a("", -76, "Scenery_9", vd.field_C);
        og.field_d = fg.a("", "Scenery_10", vd.field_C, false);
        r.field_e = fg.a("", "Scenery_11", vd.field_C, false);
        r.field_b = fg.a("", "Scenery_12", vd.field_C, false);
        oe.field_g = ci.a("", -74, "Scenery_13", vd.field_C);
        rd.field_a = fg.a("", "Scenery_14", vd.field_C, false);
        ng.field_v = fg.a("", "Scenery_15", vd.field_C, false);
        re.field_q = fg.a("", "Scenery_16", vd.field_C, false);
        hf.field_b = fg.a("", "Scenery_17", vd.field_C, false);
        qj.field_l = fg.a("", "Scenery_18", vd.field_C, false);
        bj.field_j = fg.a("", "Scenery_19", vd.field_C, false);
        eh.field_b = fg.a("", "Scenery_20", vd.field_C, false);
        lc.field_a = fg.a("", "computer_console1_e_tga", vd.field_C, false);
        bi.field_b = fg.a("", "computer_console1_n_tga", vd.field_C, false);
        cl.field_j = fg.a("", "computer_console1_s_tga", vd.field_C, false);
        de.field_o = fg.a("", "computer_console1_w_tga", vd.field_C, false);
        an.field_j = fg.a("", "computer_console2_e_tga", vd.field_C, false);
        gi.field_f = fg.a("", "computer_console2_n_tga", vd.field_C, false);
        an.field_l = fg.a("", "computer_console2_s_tga", vd.field_C, false);
        vi.field_j = fg.a("", "computer_console2_w_tga", vd.field_C, false);
        ci.field_k = fg.a("", "Scenery_21", vd.field_C, false);
        lc.field_b = fg.a("", "Scenery_22", vd.field_C, false);
        rb.field_y = fg.a("", "Scenery_23", vd.field_C, false);
        ue.field_h = fg.a("", "Scenery_24", vd.field_C, false);
        jg.field_j = fg.a("", "Scenery_25", vd.field_C, false);
        wa.field_o = fg.a("", "Scenery_26", vd.field_C, false);
        sm.field_h = fg.a("", "Scenery_27", vd.field_C, false);
        pl.field_j = fg.a("", "Scenery_28", vd.field_C, false);
        pe.field_hb = fg.a("", "Scenery_29", vd.field_C, false);
        en.field_w = fg.a("", "Scenery_30", vd.field_C, false);
        e.field_d = fg.a("", "Scenery_31", vd.field_C, false);
        ig.field_S = fg.a("", "Scenery_32", vd.field_C, false);
        f.field_d = fg.a("", "Scenery_33", vd.field_C, false);
        vc.field_h = fg.a("", "Scenery_34", vd.field_C, false);
        ki.field_b = fg.a("", "Scenery_35", vd.field_C, false);
        nh.field_C = fg.a("", "Scenery_36", vd.field_C, false);
        wb.field_W = fg.a("", "explosive_crate_e_tga", vd.field_C, false);
        gi.field_c = fg.a("", "explosive_crate_n_tga", vd.field_C, false);
        el.field_f = fg.a("", "explosive_crate_s_tga", vd.field_C, false);
        oa.field_e = fg.a("", "explosive_crate_w_tga", vd.field_C, false);
        ue.field_f = fg.a("", "health_big_tga", vd.field_C, false);
        ia.field_e = fg.a("", "health_sm_tga", vd.field_C, false);
        kj.field_f = fg.a("", "Scenery_37", vd.field_C, false);
        gf.field_a = fg.a("", "Scenery_38", vd.field_C, false);
        bl.field_c = fg.a("", "Scenery_39", vd.field_C, false);
        u.field_h = fg.a("", "Scenery_40", vd.field_C, false);
        vj.field_p = fg.a("", "Scenery_41", vd.field_C, false);
        ea.field_e = fg.a("", "Scenery_42", vd.field_C, false);
        tc.field_b = fg.a("", "Scenery_43", vd.field_C, false);
        oe.field_d = fg.a("", "Scenery_44", vd.field_C, false);
        km.field_z = fg.a("", "Scenery_45", vd.field_C, false);
        ab.field_a = fg.a("", "Scenery_46", vd.field_C, false);
        vc.field_k = fg.a("", "Scenery_47", vd.field_C, false);
        jc.field_a = fg.a("", "Scenery_48", vd.field_C, false);
        hm.field_l = fg.a("", "Scenery_49", vd.field_C, false);
        q.field_c = fg.a("", "Scenery_50", vd.field_C, false);
        df.field_a = fg.a("", "Scenery_51", vd.field_C, false);
        sj.field_g = fg.a("", "Scenery_52", vd.field_C, false);
        vf.field_H = fg.a("", "Scenery_53", vd.field_C, false);
        nd.field_a = fg.a("", "Scenery_54", vd.field_C, false);
        el.field_l = fg.a("", "Scenery_55", vd.field_C, false);
        lh.field_e = fg.a("", "Scenery_56", vd.field_C, false);
        vg.field_d = fg.a("", "Scenery_57", vd.field_C, false);
        ui.field_b = fg.a("", "Scenery_58", vd.field_C, false);
        ig.field_R = fg.a("", "Scenery_59", vd.field_C, false);
        ic.field_k = fg.a("", "Scenery_60", vd.field_C, false);
        eb.field_b = fg.a("", "Scenery_61", vd.field_C, false);
        cn.field_h = fg.a("", "Scenery_62", vd.field_C, false);
        jh.field_cb = fg.a("", "Scenery_63", vd.field_C, false);
        fe.field_c = fg.a("", "Scenery_64", vd.field_C, false);
        qg.field_m = fg.a("", "Scenery_65", vd.field_C, false);
        qc.field_B = fg.a("", "Scenery_66", vd.field_C, false);
        ld.field_p = fg.a("", "Scenery_67", vd.field_C, false);
        rj.field_N = fg.a("", "Scenery_68", vd.field_C, false);
        td.field_f = fg.a("", "Scenery_69", vd.field_C, false);
        dd.field_j = fg.a("", "Scenery_70", vd.field_C, false);
        ck.field_C = fg.a("", "Scenery_71", vd.field_C, false);
        tb.field_L = fg.a("", "Scenery_72", vd.field_C, false);
        wd.field_b = fg.a("", "Scenery_73", vd.field_C, false);
        ub.field_c = fg.a("", "Scenery_74", vd.field_C, false);
        fa.field_e = fg.a("", "Scenery_75", vd.field_C, false);
        ej.field_d = fg.a("", "Scenery_76", vd.field_C, false);
        ci.field_l = fg.a("", "Scenery_77", vd.field_C, false);
        ng.field_i = fg.a("", "Scenery_78", vd.field_C, false);
        mn.field_b = fg.a("", "Scenery_79", vd.field_C, false);
        ln.field_c = fg.a("", "Scenery_80", vd.field_C, false);
        hh.field_b = fg.a("", "Scenery_81", vd.field_C, false);
        bm.field_f = fg.a("", "reactor_tga", vd.field_C, false);
        ca.field_b = fg.a("", "reactor_damaged_tga", vd.field_C, false);
        vi.field_k = fg.a("", "shuttle_tga", vd.field_C, false);
        sc.field_a = ci.a("", param0 ^ 13124, "shield_module", vd.field_C);
        qm.field_P = fg.a("", "explosive_charge", vd.field_C, false);
        bd discarded$1 = ci.a("", -21, "cloak_module", vd.field_C);
        e.field_r = ci.a("", -78, "invulnerability_module", vd.field_C);
        jg.field_h = ci.a("", param0 ^ 13130, "explosive_shells", vd.field_C);
        qh.field_l = ci.a("", 120, "fusion_power", vd.field_C);
        mg.field_b = ci.a("", -67, "incendiary_rockets", vd.field_C);
        bn.field_l = ci.a("", 111, "plasma_fire", vd.field_C);
        if (param0 == 13119) {
          aa.field_b = ci.a("", -48, "powered_boots", vd.field_C);
          jg.field_f = fg.a("", "security_pass", vd.field_C, false);
          im.field_a = jd.a((byte) 33, "", vd.field_C, "doors_hammerhead");
          ak.field_a = ci.a("", -116, "door_twiddles_hammerhead_h", vd.field_C);
          an.field_d = ci.a("", 125, "door_twiddles_hammerhead_v", vd.field_C);
          jd.field_o = jd.a((byte) 33, "", vd.field_C, "doors_planet");
          ce.field_a = ci.a("", 118, "door_twiddles_planet_h", vd.field_C);
          r.field_c = ci.a("", 125, "door_twiddles_planet_v", vd.field_C);
          th.field_Hb = jd.a((byte) 33, "", vd.field_C, "doors_station");
          qa.field_c = ci.a("", param0 + -13003, "door_twiddles_station_h", vd.field_C);
          gi.field_d = ci.a("", -86, "door_twiddles_station_v", vd.field_C);
          ri.field_k = fg.a("", "Scenery_82", vd.field_C, false);
          ci.field_g = fg.a("", "Scenery_83", vd.field_C, false);
          wa.field_n = fg.a("", "Scenery_84", vd.field_C, false);
          mj.field_a = fg.a("", "Scenery_85", vd.field_C, false);
          mg.field_f = fg.a("", "Scenery_86", vd.field_C, false);
          le.field_xb = fg.a("", "Scenery_87", vd.field_C, false);
          rh.field_C = fg.a("", "Scenery_88", vd.field_C, false);
          rh.field_z = fg.a("", "Scenery_89", vd.field_C, false);
          in.field_d = fg.a("", "Scenery_90", vd.field_C, false);
          gi.field_j = ci.a("", param0 ^ -13180, "Scenery_91", vd.field_C);
          ln.field_g = ci.a("", -91, "Scenery_92", vd.field_C);
          li.field_y = fg.a("", "Scenery_93", vd.field_C, false);
          kc.field_d = fg.a("", "Scenery_94", vd.field_C, false);
          sj.field_b = fg.a("", "Scenery_95", vd.field_C, false);
          n.field_q = fg.a("", "Scenery_96", vd.field_C, false);
          ml.field_a = fg.a("", "Scenery_97", vd.field_C, false);
          p.field_d = ci.a("", -33, "Scenery_98", vd.field_C);
          wk.field_a = fg.a("", "Scenery_99", vd.field_C, false);
          hf.field_e = fg.a("", "Scenery_100", vd.field_C, false);
          gb.field_l = ci.a("", 110, "Scenery_101", vd.field_C);
          wh.field_e = ci.a("", 120, "bend_a_1", vd.field_C);
          wi.field_e = ci.a("", param0 ^ 13138, "bend_b_2", vd.field_C);
          dl.field_r = ci.a("", 123, "corner_c_1", vd.field_C);
          id.field_w = ci.a("", param0 ^ 13121, "corner_c_2", vd.field_C);
          ld.field_o = ci.a("", param0 ^ -13139, "corner_c_3", vd.field_C);
          la.field_e = ci.a("", 24, "corner_d_4", vd.field_C);
          bb.field_a = ci.a("", param0 + -13007, "diagonal_d_1", vd.field_C);
          qg.field_i = ci.a("", param0 + -13121, "diagonal_d_2", vd.field_C);
          oa.field_i = ci.a("", -46, "diagonal_d_3", vd.field_C);
          hf.field_j = ci.a("", -112, "Scenery_103", vd.field_C);
          sd.field_t = fg.a("", "Scenery_107", vd.field_C, false);
          vb.field_Lb = fg.a("", "Scenery_108", vd.field_C, false);
          uh.field_f = fg.a("", "Scenery_109", vd.field_C, false);
          qh.field_g = fg.a("", "Scenery_110", vd.field_C, false);
          ei.field_m = fg.a("", "Scenery_111", vd.field_C, false);
          j.field_a = fg.a("", "Scenery_112", vd.field_C, false);
          vk.field_p = fg.a("", "Scenery_113", vd.field_C, false);
          wc.field_e = fg.a("", "Scenery_114", vd.field_C, false);
          ui.field_c = ci.a("", 1, "Scenery_115", vd.field_C);
          dn.field_h = fg.a("", "Scenery_116", vd.field_C, false);
          hj.field_r = fg.a("", "Scenery_117", vd.field_C, false);
          pj.field_l = fg.a("", "Scenery_118", vd.field_C, false);
          qc.field_q = fg.a("", "Scenery_119", vd.field_C, false);
          field_C = fg.a("", "Scenery_120", vd.field_C, false);
          rg.field_a = fg.a("", "Scenery_121", vd.field_C, false);
          la.field_h = fg.a("", "Scenery_122", vd.field_C, false);
          gf.field_d = fg.a("", "Scenery_123", vd.field_C, false);
          ed.field_a = fg.a("", "Scenery_124", vd.field_C, false);
          nb.field_J = fg.a("", "Scenery_125", vd.field_C, false);
          t.field_l = fg.a("", "Scenery_126", vd.field_C, false);
          uc.field_a = fg.a("", "Scenery_127", vd.field_C, false);
          s.field_d = fg.a("", "Scenery_128", vd.field_C, false);
          qg.field_g = new bd[106];
          vb.field_Kb = new bd[qg.field_g.length];
          var2_int = 0;
          L0: while (true) {
            if (var2_int >= 43) {
              ie.field_b = jd.a((byte) 33, "", vd.field_C, "spinning_fans");
              qg.field_g[43] = fg.a("", "tentacles_corner2", vd.field_C, false);
              qg.field_g[44] = fg.a("", "tentacles_straight2", vd.field_C, false);
              qg.field_g[45] = fg.a("", "tentacles_straight4", vd.field_C, false);
              qg.field_g[46] = fg.a("", "tentacles_straight6", vd.field_C, false);
              qg.field_g[47] = fg.a("", "tentacles_straight8", vd.field_C, false);
              qg.field_g[48] = fg.a("", "tentacles_t_junction2", vd.field_C, false);
              qg.field_g[49] = fg.a("", "tentacles_x_junction2", vd.field_C, false);
              qg.field_g[50] = fg.a("", "floor_tentacles_fadeleft", vd.field_C, false);
              qg.field_g[51] = fg.a("", "floor_tentacles_faderight", vd.field_C, false);
              qg.field_g[52] = fg.a("", "floor_tentacles_innercorner3a", vd.field_C, false);
              qg.field_g[53] = fg.a("", "floor_tentacles_innercorner5a", vd.field_C, false);
              qg.field_g[54] = fg.a("", "floor_tentacles_innerstraight3_2a", vd.field_C, false);
              qg.field_g[55] = fg.a("", "floor_tentacles_innerstraight3_3a", vd.field_C, false);
              qg.field_g[56] = fg.a("", "floor_tentacles_innerstraight5_3a", vd.field_C, false);
              qg.field_g[57] = fg.a("", "floor_tentacles_innerstraight5_4a", vd.field_C, false);
              qg.field_g[58] = fg.a("", "floor_tentacles_outercorner3a", vd.field_C, false);
              qg.field_g[59] = fg.a("", "floor_tentacles_outercorner5a", vd.field_C, false);
              qg.field_g[60] = fg.a("", "floor_tentacles_outerstraight3_2a", vd.field_C, false);
              qg.field_g[61] = fg.a("", "floor_tentacles_outerstraight3_3a", vd.field_C, false);
              qg.field_g[62] = fg.a("", "floor_tentacles_outerstraight5_3a", vd.field_C, false);
              qg.field_g[63] = fg.a("", "floor_tentacles_outerstraight5_4a", vd.field_C, false);
              qg.field_g[64] = fg.a("", "floor_tentacles_patch_straight1", vd.field_C, false);
              qg.field_g[65] = fg.a("", "floor_tentacles_patch_straight2", vd.field_C, false);
              qg.field_g[66] = fg.a("", "floor_tentacles_patch_straight3", vd.field_C, false);
              qg.field_g[67] = fg.a("", "floor_tentacles_patch_outercorner1", vd.field_C, false);
              qg.field_g[68] = fg.a("", "floor_tentacles_patch_outercorner2", vd.field_C, false);
              qg.field_g[69] = fg.a("", "floor_tentacles_patch_innercorner1", vd.field_C, false);
              qg.field_g[70] = fg.a("", "floor_tentacles_patch_innercorner2", vd.field_C, false);
              qg.field_g[71] = fg.a("", "floor_tentacles_patch_small1", vd.field_C, false);
              qg.field_g[72] = fg.a("", "floor_tentacles_patch_small2", vd.field_C, false);
              qg.field_g[73] = fg.a("", "floor_tentacles_patch_small3", vd.field_C, false);
              qg.field_g[74] = fg.a("", "floor_tentacles_patch_small4", vd.field_C, false);
              qg.field_g[75] = fg.a("", "extra_scenery_f5", vd.field_C, false);
              qg.field_g[76] = fg.a("", "extra_scenery_f6", vd.field_C, false);
              qg.field_g[77] = fg.a("", "scenery_e4", vd.field_C, false);
              qg.field_g[78] = fg.a("", "scenery_e5", vd.field_C, false);
              qg.field_g[79] = fg.a("", "scenery_e6", vd.field_C, false);
              qg.field_g[80] = fg.a("", "scenery_e7", vd.field_C, false);
              qg.field_g[81] = fg.a("", "scenery_e8", vd.field_C, false);
              qg.field_g[82] = fg.a("", "scenery_e9", vd.field_C, false);
              qg.field_g[83] = fg.a("", "scenery_e10", vd.field_C, false);
              qg.field_g[84] = fg.a("", "bookshelf1", vd.field_C, false);
              qg.field_g[85] = fg.a("", "bookshelf2", vd.field_C, false);
              qg.field_g[86] = fg.a("", "bookshelf3", vd.field_C, false);
              qg.field_g[87] = fg.a("", "bookshelf4", vd.field_C, false);
              qg.field_g[88] = fg.a("", "bookshelf5", vd.field_C, false);
              qg.field_g[89] = fg.a("", "bookshelf6", vd.field_C, false);
              qg.field_g[90] = fg.a("", "allthatwasleft", vd.field_C, false);
              qg.field_g[91] = fg.a("", "bigradialscorch", vd.field_C, false);
              qg.field_g[92] = fg.a("", "bloodsplat_green", vd.field_C, false);
              qg.field_g[93] = fg.a("", "bloodsplat_red", vd.field_C, false);
              qg.field_g[94] = fg.a("", "oilslick1", vd.field_C, false);
              qg.field_g[95] = fg.a("", "oilslick2", vd.field_C, false);
              qg.field_g[96] = fg.a("", "scorchmark1", vd.field_C, false);
              qg.field_g[97] = fg.a("", "skid", vd.field_C, false);
              qg.field_g[98] = fg.a("", "smallradialscorch", vd.field_C, false);
              qg.field_g[99] = fg.a("", "flightcontrolpanel1", vd.field_C, false);
              qg.field_g[100] = fg.a("", "flightcontrolpanel2", vd.field_C, false);
              qg.field_g[101] = fg.a("", "flightcontrolpanel3", vd.field_C, false);
              qg.field_g[102] = fg.a("", "onebigrock", vd.field_C, false);
              qg.field_g[103] = fg.a("", "tinyrocks", vd.field_C, false);
              qg.field_g[104] = fg.a("", "tinyrocks2", vd.field_C, false);
              qg.field_g[105] = fg.a("", "tinyrocks3", vd.field_C, false);
              var2_int = 0;
              L1: while (true) {
                if (-107 >= (var2_int ^ -1)) {
                  return;
                } else {
                  vb.field_Kb[var2_int] = ne.a(qg.field_g[var2_int], (byte) -74);
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              qg.field_g[var2_int] = fg.a("", "extra_scenery_" + var2_int, vd.field_C, false);
              var2_int++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_K = new int[]{24, 5};
                    field_F = false;
                    field_E = new int[255];
                    var0 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (255 <= var0) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1 = (var0 + -128) * 3;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (var1 > 255) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    var1 = 255;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var1 >= 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    field_E[var0] = 65792 * var0 - -var1;
                    var0++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 10: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }
}
