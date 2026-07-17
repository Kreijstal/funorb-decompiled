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
        int discarded$39 = 13119;
        this.t();
        wk.field_b[0] = ia.field_e;
        wk.field_b[3] = qm.field_P;
        wk.field_b[2] = sc.field_a;
        wk.field_b[1] = ue.field_f;
        int discarded$40 = 0;
        wk.field_b[4] = fg.a("", "key", vd.field_C);
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
                  if (~var3.field_j.length >= ~var4_int) {
                    var4_array = new pg[256];
                    var5_int = 0;
                    L3: while (true) {
                      if (~var5_int <= ~var4_array.length) {
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
                          wh.field_d = th.a(vd.field_C, 88, "digitalserial_16", te.field_J, "");
                          mk.field_L = th.a(vd.field_C, 49, "digitalserial_20", te.field_J, "");
                          id.field_A = th.a(vd.field_C, -127, "digitalserial_12", te.field_J, "");
                          fn discarded$41 = wc.a("basicfont12", gb.field_a, 83, wd.field_a, "");
                          of.field_e = th.a(vd.field_C, -111, "micro_numbers", te.field_J, "");
                          int discarded$42 = 0;
                          lm.field_y = fg.a("", "splat_guard", vd.field_C);
                          int discarded$43 = 0;
                          d.field_s = fg.a("", "splat_dormant", vd.field_C);
                          int discarded$44 = 0;
                          ee.field_g = fg.a("", "splat_praetorian", vd.field_C);
                          int discarded$45 = 0;
                          fk.field_c = fg.a("", "splat_queen", vd.field_C);
                          int discarded$46 = 0;
                          rh.field_x = fg.a("", "splat_runner", vd.field_C);
                          int discarded$47 = 0;
                          tb.field_I = fg.a("", "splat_spitter", vd.field_C);
                          int discarded$48 = 0;
                          ta.field_jb = fg.a("", "splat_egg", vd.field_C);
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
                            de.field_i = ci.a("basic", 109, "locked", wd.field_a);
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
                                cf.field_q = ei.a(vd.field_C, 105, "", "marine_run");
                                ng.field_p = new bd[5][];
                                ng.field_p[2] = ei.a(vd.field_C, 115, "", "marine_legs_left");
                                ng.field_p[3] = ei.a(vd.field_C, 97, "", "marine_legs_right");
                                ng.field_p[1] = ei.a(vd.field_C, bm.a(-113, -10), "", "marine_legs_forward");
                                ng.field_p[4] = ei.a(vd.field_C, 116, "", "marine_legs_back");
                                ng.field_p[4] = jh.a(ng.field_p[4], 150, 27);
                                ng.field_p[0] = null;
                                km.field_A = ei.a(vd.field_C, 96, "", "marine_idle");
                                vj.field_e = km.field_A;
                                dn.field_i = ei.a(vd.field_C, 104, "", "marine_interact");
                                od.field_G = ei.a(vd.field_C, 100, "", "marine_firing");
                                od.field_G = jh.a(od.field_G, 150, 25);
                                aa.field_d = ei.a(vd.field_C, 118, "", "marine_death");
                                gj.a(20, ig.field_H, 84.0f);
                                ((HostileSpawn) this).a((byte) -106);
                                int discarded$49 = 0;
                                oc.field_c = fg.a("", "hud_gun_big", vd.field_C);
                                int discarded$50 = 0;
                                jg.field_d = fg.a("", "hud_bottom", vd.field_C);
                                int discarded$51 = 0;
                                gj.field_d = fg.a("", "hud_progress_bar", vd.field_C);
                                int discarded$52 = 0;
                                ti.field_j = fg.a("", "hud_gun_box", vd.field_C);
                                field_J = new bd[3];
                                int discarded$53 = 0;
                                field_J[0] = fg.a("", "hud_health_base", vd.field_C);
                                int discarded$54 = 0;
                                field_J[1] = fg.a("", "hud_health_slice", vd.field_C);
                                int discarded$55 = 0;
                                field_J[2] = fg.a("", "hud_health_top", vd.field_C);
                                vg.field_c = qm.a("", 0, "marine_face", vd.field_C);
                                nj.field_d = new pg[2][10];
                                nj.field_d[0][0] = qm.a("", 0, "kerrus_1_preview", vd.field_C);
                                nj.field_d[0][1] = qm.a("", 0, "kerrus_2_preview", vd.field_C);
                                nj.field_d[0][2] = qm.a("", 0, "kerrus_3_preview", vd.field_C);
                                nj.field_d[0][3] = qm.a("", 0, "kerrus_4_preview", vd.field_C);
                                nj.field_d[0][4] = qm.a("", 0, "kerrus_5_preview", vd.field_C);
                                nj.field_d[0][5] = qm.a("", 0, "kerrus_6_preview", vd.field_C);
                                nj.field_d[0][6] = qm.a("", 0, "kerrus_7_preview", vd.field_C);
                                nj.field_d[0][7] = qm.a("", bm.a(-113, -113), "kerrus_8_preview", vd.field_C);
                                nj.field_d[0][8] = qm.a("", 0, "kerrus_9_preview", vd.field_C);
                                nj.field_d[0][9] = qm.a("", 0, "kerrus_10_preview", vd.field_C);
                                nj.field_d[1][0] = qm.a("", bm.a(-113, -113), "vengeance_1_preview", vd.field_C);
                                nj.field_d[1][1] = qm.a("", 0, "vengeance_2_preview", vd.field_C);
                                nj.field_d[1][2] = qm.a("", 0, "vengeance_3_preview", vd.field_C);
                                nj.field_d[1][3] = qm.a("", 0, "vengeance_4_preview", vd.field_C);
                                nj.field_d[1][4] = qm.a("", 0, "vengeance_5_preview", vd.field_C);
                                nj.field_d[1][5] = qm.a("", 0, "vengeance_6_preview", vd.field_C);
                                nj.field_d[1][6] = qm.a("", 0, "vengeance_7_preview", vd.field_C);
                                nj.field_d[1][7] = qm.a("", 0, "vengeance_8_preview", vd.field_C);
                                nj.field_d[1][8] = qm.a("", 0, "vengeance_9_preview", vd.field_C);
                                nj.field_d[1][9] = qm.a("", 0, "vengeance_10_preview", vd.field_C);
                                int discarded$56 = 39;
                                this.s();
                                int discarded$57 = 0;
                                ia.field_l[10] = fg.a("", "spawn20", vd.field_C);
                                int discarded$58 = 0;
                                ia.field_l[12] = fg.a("", "gunturret", vd.field_C);
                                int discarded$59 = 0;
                                ci.field_b = fg.a("", "cragturret", vd.field_C);
                                int discarded$60 = 0;
                                ia.field_l[13] = fg.a("", "barrel", vd.field_C);
                                bd[] discarded$61 = jd.a((byte) 33, "", vd.field_C, "spawneyes0");
                                ia.field_l[23] = ci.a("", -32, "doorgfx", vd.field_C);
                                int discarded$62 = 0;
                                wg.field_zb = fg.a("", "hatching", vd.field_C);
                                gj.a(20, ig.field_H, 91.0f);
                                ((HostileSpawn) this).a((byte) -51);
                                qa.field_g = ei.a(vd.field_C, 101, "", "guns");
                                di.field_b = jd.a((byte) 33, "", vd.field_C, "gun_silhouettes");
                                jj.field_j = ei.a(vd.field_C, 125, "", "bullet_acid");
                                int discarded$63 = 0;
                                sj.field_e = fg.a("", "bullet_plasma", vd.field_C);
                                ue.field_c = ci.a("", -36, "bullet_rocket", vd.field_C);
                                df.field_g = ei.a(vd.field_C, 125, "", "muzzleflash");
                                id.field_p = ei.a(vd.field_C, 89, "", "impact_gun");
                                int discarded$64 = 0;
                                bd discarded$65 = fg.a("", "impact_rail", vd.field_C);
                                bd discarded$66 = ci.a("", 116, "scorchmark_alpha", vd.field_C);
                                int discarded$67 = 0;
                                lg.field_k = fg.a("", "spatter_spawn", vd.field_C);
                                int discarded$68 = 0;
                                om.field_d = fg.a("", "bullet_pistol", vd.field_C);
                                te.field_G = ei.a(vd.field_C, 109, "", "grenade_roll");
                                int discarded$69 = 0;
                                sc.field_l = fg.a("", "acid_drop", vd.field_C);
                                int discarded$70 = 0;
                                v.field_j = fg.a("", "battle_damaged_cragturret", vd.field_C);
                                int discarded$71 = 0;
                                rl.field_d = fg.a("", "battle_damaged_gunturret", vd.field_C);
                                int discarded$72 = 114;
                                this.l();
                                fa.field_d = jd.a((byte) 33, "", vd.field_C, "lights");
                                gj.a(20, ig.field_H, 99.0f);
                                ((HostileSpawn) this).a((byte) -69);
                                pi.field_a[0] = ci.a("", 116, "shadow0", vd.field_C);
                                pi.field_a[1] = ci.a("", 110, "shadow1", vd.field_C);
                                pi.field_a[2] = ci.a("", 119, "shadow2", vd.field_C);
                                hh.field_a = ei.a(vd.field_C, 97, "", "ammo");
                                int discarded$73 = 0;
                                bd discarded$74 = fg.a("", "pointer", vd.field_C);
                                int discarded$75 = 0;
                                li.field_t = fg.a("", "compass", vd.field_C);
                                pi.field_b = ci.a("", 112, "health", vd.field_C);
                                int discarded$76 = 0;
                                eg.field_v = fg.a("", "dragged_egg", vd.field_C);
                                int discarded$77 = 0;
                                qg.field_q = fg.a("", "dragged_slime", vd.field_C);
                                uf.field_g = new pg[3];
                                uf.field_g[0] = qm.a("", 0, "win_kerrus", vd.field_C);
                                uf.field_g[1] = qm.a("", bm.a(-113, -113), "win_vengeance", vd.field_C);
                                uf.field_g[2] = qm.a("", 0, "win_vengeance_alt", vd.field_C);
                                vd.field_C = null;
                                gb.field_a = null;
                                var6 = 0;
                                L7: while (true) {
                                  if (~ia.field_l.length >= ~var6) {
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

    private final void l() {
        bd var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new bd(1, 1);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.WA(" + 114 + 41);
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
        RuntimeException decompiledCaughtException = null;
        var12 = field_I ? 1 : 0;
        try {
          L0: {
            var6 = ln.field_a.field_d;
            var7 = ln.field_a.field_a;
            var8_int = 0;
            L1: while (true) {
              if (~(-1 + var6) >= ~var8_int) {
                var8 = new oc(0, 0);
                var5 = 0;
                L2: while (true) {
                  if (ll.field_a <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (el.field_j <= var5) {
                        L4: {
                          L5: {
                            var9_int = ha.field_t;
                            if (var9_int != 0) {
                              if (var9_int == 6) {
                                break L5;
                              } else {
                                if (2 == var9_int) {
                                  var5 = 0;
                                  L6: while (true) {
                                    if (var5 >= el.field_j) {
                                      break L4;
                                    } else {
                                      L7: {
                                        var9_ref = mm.field_m[var5];
                                        if (var9_ref.field_i != 4) {
                                          break L7;
                                        } else {
                                          var4 = 1 + var9_ref.field_j.field_g * param1;
                                          var3_int = 1 + var9_ref.field_j.field_e * param1;
                                          si.c(var3_int, var4, param1, param1, 16711680);
                                          si.a(var3_int + -1, -1 + var4, param1 + 2, 2 + param1, 16711680, 32);
                                          si.a(var3_int + -2, -2 + var4, 4 + param1, param1 - -4, 16711680, 32);
                                          break L7;
                                        }
                                      }
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  if (var9_int != 3) {
                                    if (12 != var9_int) {
                                      if (nh.field_E.field_e >= 0) {
                                        var4 = 1 + param1 * nh.field_E.field_g;
                                        var3_int = 1 + nh.field_E.field_e * param1;
                                        si.f(var3_int, var4, 2 + param1, 16711680, 32);
                                        si.b(var3_int, var4, param1 + 4, 16711680);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      var5 = 0;
                                      L8: while (true) {
                                        if (~var5 <= ~ll.field_a) {
                                          break L4;
                                        } else {
                                          L9: {
                                            var9 = wh.field_b[var5];
                                            if (var9.field_i == 2) {
                                              if (var9.field_h == 11) {
                                                var4 = 1 + param1 * var9.field_j.field_g;
                                                var3_int = var9.field_j.field_e * param1 - -1;
                                                si.c(-1 + var3_int, var4 + -1, param1, param1, 16711680);
                                                si.a(-2 + var3_int, var4 + -2, param1 + 2, 2 + param1, 16711680, 32);
                                                si.a(var3_int + -3, -3 + var4, 4 + param1, param1 + 4, 16711680, 32);
                                                break L9;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var5++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    var5 = 0;
                                    L10: while (true) {
                                      if (~var5 <= ~el.field_j) {
                                        break L4;
                                      } else {
                                        L11: {
                                          var9_ref = mm.field_m[var5];
                                          if (var9_ref.field_i != 8) {
                                            break L11;
                                          } else {
                                            var4 = var9_ref.field_j.field_g * param1 - -1;
                                            var3_int = var9_ref.field_j.field_e * param1 + 1;
                                            si.c(var3_int - 1, -1 + var4, 2 * param1, param1 * 2, 16711680);
                                            si.a(var3_int + -2, -2 + var4, 2 * param1 - -2, param1 * 2 - -2, 16711680, 32);
                                            si.a(var3_int + -3, var4 + -3, 4 + param1 * 2, 4 + param1 * 2, 16711680, 32);
                                            break L11;
                                          }
                                        }
                                        var5++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          var8.field_e = 0;
                          L12: while (true) {
                            if (var6 <= var8.field_e) {
                              break L4;
                            } else {
                              var8.field_g = 0;
                              L13: while (true) {
                                if (var7 <= var8.field_g) {
                                  var8.field_e = var8.field_e + 1;
                                  continue L12;
                                } else {
                                  L14: {
                                    if (ln.field_a.field_y[var8.b(-4)] == 148) {
                                      var4 = 1 + (var8.field_g - 1) * param1;
                                      var3_int = 1 + (-1 + var8.field_e) * param1;
                                      si.c(var3_int, var4, param1 * 3, param1 * 3, 255);
                                      si.a(var3_int - 1, -1 + var4, 3 * param1 - -2, 3 * param1 + 2, 255, 32);
                                      si.a(var3_int - 2, -2 + var4, 3 * param1 - -4, 4 + 3 * param1, 255, 32);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var8.field_g = var8.field_g + 1;
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                        L15: {
                          if (param0 == 4) {
                            break L15;
                          } else {
                            this.a((java.awt.Canvas) null, -115);
                            break L15;
                          }
                        }
                        var4 = param1 * mm.field_m[0].field_j.field_g;
                        var3_int = mm.field_m[0].field_j.field_e * param1;
                        si.c(var3_int, var4, param1, param1, 16777215);
                        break L0;
                      } else {
                        L16: {
                          L17: {
                            var9_ref = mm.field_m[var5];
                            if (var9_ref.field_i == 1) {
                              break L17;
                            } else {
                              if (var9_ref.field_i == 2) {
                                break L17;
                              } else {
                                if (var9_ref.field_i == 18) {
                                  break L17;
                                } else {
                                  if (19 == var9_ref.field_i) {
                                    break L17;
                                  } else {
                                    if (var9_ref.field_i == 23) {
                                      break L17;
                                    } else {
                                      L18: {
                                        if (var9_ref.field_i != 24) {
                                          break L18;
                                        } else {
                                          if (var9_ref.field_s) {
                                            break L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (var9_ref.field_i == 25) {
                                        break L17;
                                      } else {
                                        if (var9_ref.field_i == 27) {
                                          break L17;
                                        } else {
                                          if (var9_ref.field_i != 28) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!var9_ref.field_n) {
                            break L16;
                          } else {
                            if (ln.field_a.field_i[var9_ref.field_j.b(-4)] > 0) {
                              var3_int = param1 * var9_ref.field_j.field_e - -1;
                              var4 = 1 + var9_ref.field_j.field_g * param1;
                              si.e(param1 / 2 + var3_int, param1 / 2 + var4, param1 / 2, 16711680);
                              si.f(var3_int - -(param1 / 2), var4 + param1 / 2, param1 / 2 - -1, 16711680, 128);
                              si.f(var3_int - -(param1 / 2), param1 / 2 + var4, param1 / 2 - -2, 16711680, 64);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L19: {
                      var9 = wh.field_b[var5];
                      if (!ln.field_a.field_B[var9.field_j.b(-4)]) {
                        break L19;
                      } else {
                        var3_int = 1 + param1 * var9.field_j.field_e;
                        var4 = 1 + var9.field_j.field_g * param1;
                        si.c(var3_int + -1, var4 - 1, param1, param1, 16776960);
                        si.a(-2 + var3_int, var4 - 2, param1 - -2, 2 + param1, 16776960, 32);
                        si.a(var3_int - 3, var4 - 3, param1 - -4, param1 - -4, 16776960, 32);
                        break L19;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var9_int = 0;
                L20: while (true) {
                  if (var7 + -1 <= var9_int) {
                    var8_int++;
                    continue L1;
                  } else {
                    L21: {
                      var4 = var9_int * param1 - -1;
                      var3_int = var8_int * param1 - -1;
                      var5 = var8_int + var6 * var9_int;
                      if (null == pk.field_d[ln.field_a.field_y[var5]]) {
                        break L21;
                      } else {
                        pk.field_d[ln.field_a.field_y[var5]].a(var3_int, var4, param1, param1);
                        break L21;
                      }
                    }
                    L22: {
                      var10 = ln.field_a.field_o[var5];
                      if (0 > var10) {
                        break L22;
                      } else {
                        ak.field_b[var10].a(var3_int, var4, param1, param1);
                        if (r.field_a == 0) {
                          si.a(var3_int, var4, param1, param1, 0, 128);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      var11 = ln.field_a.field_i[var5];
                      if (ln.field_a.field_f[var5] != 0) {
                        var11 = var11 * 5;
                        break L23;
                      } else {
                        var11 = 0;
                        break L23;
                      }
                    }
                    L24: {
                      if (var11 > 0) {
                        if (var11 < 25) {
                          si.a(var3_int, var4, param1, param1, 0, 255 - 10 * var11);
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        si.c(var3_int, var4, param1, param1, 0);
                        break L24;
                      }
                    }
                    var9_int++;
                    continue L20;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "HostileSpawn.TA(" + param0 + 44 + param1 + 41);
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != wa.field_q) {
                tb.f((byte) -100);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              int discarded$5 = 19659;
              la.b();
              if (param0 == 21085) {
                break L2;
              } else {
                field_C = null;
                break L2;
              }
            }
            int discarded$6 = 75;
            tg.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.CA(" + param0 + 41);
        }
    }

    private final nm q(int param0) {
        RuntimeException var2 = null;
        nm var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        nm stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_47_0 = null;
        var4 = field_I ? 1 : 0;
        try {
          L0: {
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
            L1: while (true) {
              if (5 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= 3) {
                        sf.field_V[15] = va.a(ul.field_P, "", "HS_pistol_equip_01").a().a(var2_ref);
                        sf.field_V[16] = va.a(ul.field_P, "", "HS_machine_gun_equip_01").a().a(var2_ref);
                        sf.field_V[17] = va.a(ul.field_P, "", "HS_shotgun_equip_01").a().a(var2_ref);
                        sf.field_V[18] = va.a(ul.field_P, "", "HS_flamethrower_equip").a().a(var2_ref);
                        sf.field_V[19] = va.a(ul.field_P, "", "HS_railgun_equip").a().a(var2_ref);
                        sf.field_V[20] = va.a(ul.field_P, "", "HS_rocket_equip").a().a(var2_ref);
                        sf.field_V[21] = va.a(ul.field_P, "", "HS_plasma_equip_01").a().a(var2_ref);
                        sf.field_V[22] = va.a(ul.field_P, "", "HS_grenade_equip").a().a(var2_ref);
                        var3 = 0;
                        L4: while (true) {
                          if (var3 >= 5) {
                            var3 = 0;
                            L5: while (true) {
                              if (var3 >= 3) {
                                var3 = 0;
                                L6: while (true) {
                                  if (4 <= var3) {
                                    sf.field_V[35] = va.a(ul.field_P, "", "HS_flamethrower_all").a().a(var2_ref);
                                    sf.field_V[36] = va.a(ul.field_P, "", "HS_flamethrower_end").a().a(var2_ref);
                                    sf.field_V[37] = va.a(ul.field_P, "", "HS_rocket_fire_02").a().a(var2_ref);
                                    sf.field_V[38] = va.a(ul.field_P, "", "HS_plasma_impact_01").a().a(var2_ref);
                                    sf.field_V[39] = va.a(ul.field_P, "", "HS_grenade_fire_01").a().a(var2_ref);
                                    fg.field_b[23] = va.a(ul.field_P, "", "HS_collect_charge_01").a().a(var2_ref);
                                    fg.field_b[25] = va.a(ul.field_P, "", "HS_force_field_01").a().a(var2_ref);
                                    fg.field_b[26] = va.a(ul.field_P, "", "HS_rumble_bgsound").a().a(var2_ref);
                                    var3 = 0;
                                    L7: while (true) {
                                      if (var3 >= 5) {
                                        L8: {
                                          if (param0 <= -94) {
                                            break L8;
                                          } else {
                                            ((HostileSpawn) this).b((byte) 51);
                                            break L8;
                                          }
                                        }
                                        stackOut_47_0 = (nm) var2_ref;
                                        stackIn_48_0 = stackOut_47_0;
                                        break L0;
                                      } else {
                                        sf.field_V[var3 + 41] = va.a(ul.field_P, "", "HS_crag_turret_0" + (var3 + 1)).a().a(var2_ref);
                                        sf.field_V[46 - -var3] = va.a(ul.field_P, "", "HS_turret_0" + (1 + var3)).a().a(var2_ref);
                                        var3++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    sf.field_V[var3 + 31] = va.a(ul.field_P, "", "HS_railgun_0" + (var3 - -1)).a().a(var2_ref);
                                    var3++;
                                    continue L6;
                                  }
                                }
                              } else {
                                sf.field_V[var3 + 28] = va.a(ul.field_P, "", "HS_plasma_0" + (1 + var3)).a().a(var2_ref);
                                var3++;
                                continue L5;
                              }
                            }
                          } else {
                            sf.field_V[23 + var3] = va.a(ul.field_P, "", "HS_shotgun_0" + (1 + var3)).a().a(var2_ref);
                            var3++;
                            continue L4;
                          }
                        }
                      } else {
                        sf.field_V[var3 + 12] = va.a(ul.field_P, "", "HS_pistol_0" + (1 + var3)).a().a(var2_ref);
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    sf.field_V[var3 + 10] = va.a(ul.field_P, "", "HS_machine_gun_cartridge_drop_0" + (1 + var3)).a().a(var2_ref);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                sf.field_V[var3 + 5] = va.a(ul.field_P, "", "HS_machine_gun_0" + (var3 - -1) + "_tail").a().a(var2_ref);
                sf.field_V[var3] = va.a(ul.field_P, "", "HS_machine_gun_0" + (var3 - -1) + "_no_tail").a().a(var2_ref);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.KA(" + param0 + 41);
        }
        return stackIn_48_0;
    }

    private final void m(int param0) {
        try {
            lk.a(4, 16776960, 4, (vm) (Object) mk.field_L, 24, 320, 65280, 16777215, 24, id.field_A.field_y + al.field_Z.field_F, ul.field_J, (bd[]) null, (bd[]) null, 4, 24, 7662, 240, 40, 40, param0, (vm) (Object) id.field_A);
            int discarded$0 = -91;
            this.j();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.EA(" + param0 + 41);
        }
    }

    private final void a(int param0, nm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("HostileSpawn.LA(").append(22).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void k(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_K = null;
              field_C = null;
              field_B = null;
              field_E = null;
              if (param0 > 126) {
                break L1;
              } else {
                char discarded$2 = HostileSpawn.a(21, (byte) 54);
                break L1;
              }
            }
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "HostileSpawn.UA(" + param0 + 41);
        }
    }

    private final void u() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
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
            var2_int = 0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.DA(" + 111 + 41);
        }
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
          L0: {
            HostileSpawn.k((byte) 127);
            int discarded$163 = -15154;
            t.d();
            vl.f(param0 + 51);
            int discarded$164 = -105;
            cm.a();
            kd.c((byte) -13);
            int discarded$165 = 13496;
            r.a();
            em.a((byte) 126);
            ga.a((byte) -94);
            kh.a((byte) -34);
            ki.a(true);
            int discarded$166 = 122;
            om.a();
            int discarded$167 = 1;
            eh.a();
            ib.a(121);
            tg.a(param0 ^ 111);
            int discarded$168 = -106;
            d.g();
            int discarded$169 = -82;
            kc.a();
            se.c((byte) 88);
            sc.a(-87);
            int discarded$170 = -69;
            jg.b();
            ci.b(-31);
            int discarded$171 = -63;
            kb.c();
            si.b();
            int discarded$172 = -16199;
            gb.b();
            int discarded$173 = -105;
            gf.b();
            il.a(-91);
            int discarded$174 = 255;
            vi.g();
            int discarded$175 = 0;
            hn.a();
            ie.a((byte) 4);
            vg.a(param0 + -26);
            int discarded$176 = 99;
            ec.a();
            int discarded$177 = 719371458;
            rl.a();
            int discarded$178 = 1;
            tc.a();
            int discarded$179 = 0;
            wh.a();
            int discarded$180 = 32;
            oa.a();
            ln.a(31311);
            int discarded$181 = 0;
            nl.a();
            int discarded$182 = -107;
            in.a();
            int discarded$183 = -102;
            sm.a();
            int discarded$184 = 26;
            ja.a();
            ue.a((byte) -27);
            gn.a(-40);
            e.b(param0 ^ 103);
            he.b(true);
            int discarded$185 = 83;
            re.a();
            cg.a(false);
            int discarded$186 = -12586;
            mg.a();
            int discarded$187 = -9575;
            oc.c();
            int discarded$188 = -1;
            eg.c();
            int discarded$189 = -66;
            qh.a();
            int discarded$190 = 1;
            bi.a();
            nm.a((byte) 76);
            am.b((byte) -50);
            int discarded$191 = -21742;
            ej.d();
            int discarded$192 = -3;
            dh.b();
            int discarded$193 = -106;
            sg.b();
            bn.a(false);
            td.b(200);
            im.a(-14986);
            int discarded$194 = -95;
            lh.a();
            oj.g((byte) 118);
            int discarded$195 = 2;
            v.b();
            ql.a(-3);
            int discarded$196 = 122;
            we.c();
            int discarded$197 = -4676;
            p.d();
            int discarded$198 = -13;
            qm.h();
            int discarded$199 = 21;
            id.a();
            int discarded$200 = -8;
            ia.a();
            int discarded$201 = 1;
            rd.b();
            int discarded$202 = -50;
            og.a();
            w.a(false);
            jm.a(true);
            int discarded$203 = 1;
            tm.a();
            gh.f();
            dl.d(-1);
            ug.g();
            ch.a(false);
            int discarded$204 = -121;
            sa.a();
            int discarded$205 = 60;
            ua.a();
            int discarded$206 = -7;
            l.a();
            int discarded$207 = 1;
            i.a();
            int discarded$208 = -67;
            ml.a();
            int discarded$209 = 0;
            s.a();
            pi.a(param0 ^ param0);
            int discarded$210 = 1;
            c.a();
            int discarded$211 = 120;
            bl.a();
            ca.a(param0 ^ 29);
            en.r(-10723);
            jc.a((byte) 89);
            int discarded$212 = 212563556;
            uc.a();
            kl.a(126);
            int discarded$213 = -102;
            fm.a();
            vm.a();
            be.a(param0 ^ 28);
            int discarded$214 = 1;
            pc.b();
            int discarded$215 = -85;
            bb.a();
            gg.a(false);
            int discarded$216 = 1;
            wg.b();
            pe.q(8421504);
            int discarded$217 = 24;
            ta.g();
            dg.q(param0 ^ -285);
            mk.l(param0 ^ 28);
            int discarded$218 = 82;
            nb.k();
            lk.j(param0 + 27191);
            int discarded$219 = 75;
            ij.e();
            na.a(param0 + 61);
            oh.a(-32278);
            wc.a(-17514);
            int discarded$220 = 9992;
            fh.b();
            uk.b(param0 + -109);
            pb.f(param0 + -139);
            th.d((byte) 16);
            int discarded$221 = -24510;
            fj.i();
            int discarded$222 = 0;
            cf.a();
            int discarded$223 = -3354;
            le.e();
            int discarded$224 = 2;
            wk.a();
            dk.a((byte) 71);
            int discarded$225 = -46;
            aj.a();
            vh.a(false);
            ni.b(param0 ^ 107);
            qc.a(true);
            qf.a();
            rm.b();
            ok.a();
            int discarded$226 = -104;
            aa.a();
            wl.a(110);
            eb.b(param0 + 32);
            lc.a(param0 ^ 63);
            qg.a(true);
            ih.f(param0 ^ 212);
            int discarded$227 = -4;
            bh.a();
            int discarded$228 = 1;
            lm.b();
            um.a(255);
            rh.e(param0 ^ 26);
            int discarded$229 = 0;
            rb.a();
            ee.b(param0 + -28);
            int discarded$230 = -98;
            fg.a();
            int discarded$231 = 1;
            ae.a();
            gi.b(true);
            int discarded$232 = 24;
            uf.g();
            pa.g(param0 ^ 107);
            int discarded$233 = 2;
            an.g();
            pj.c((byte) 98);
            int discarded$234 = 1;
            dd.b();
            int discarded$235 = -127;
            ob.d();
            vj.g(param0 + 112);
            int discarded$236 = 43;
            o.g();
            pk.h(param0 + -26);
            jk.b(-100);
            int discarded$237 = -115;
            jh.g();
            cn.a(param0 ^ 110);
            ge.c();
            int discarded$238 = 58;
            sj.a();
            int discarded$239 = 1;
            u.a();
            int discarded$240 = 1;
            pf.a();
            int discarded$241 = 69;
            wd.a();
            ad.a(-24221);
            int discarded$242 = 1;
            qa.b();
            int discarded$243 = 117;
            tk.a();
            int discarded$244 = -16182;
            lb.a();
            int discarded$245 = -122;
            cb.a();
            vc.a(119);
            int discarded$246 = -33;
            mf.b();
            int discarded$247 = 1;
            rg.a();
            int discarded$248 = -93;
            nj.b();
            wf.a();
            int discarded$249 = -665;
            ck.a();
            ng.c(10448);
            int discarded$250 = 0;
            hf.a();
            int discarded$251 = 0;
            ve.a();
            int discarded$252 = 5592405;
            rf.b();
            ha.b(true);
            int discarded$253 = 11129;
            ra.a();
            int discarded$254 = 76;
            h.a();
            ce.b(param0 + 6909);
            int discarded$255 = 5956;
            ag.d();
            int discarded$256 = 84;
            ph.i();
            fc.h(1);
            wb.n(420);
            ul.k(param0 ^ -1847325763);
            vd.a((byte) 75);
            fl.a((byte) -52);
            dc.a(256);
            int discarded$257 = -1;
            hh.a();
            int discarded$258 = -97;
            hj.e();
            int discarded$259 = -63;
            ik.a();
            int discarded$260 = 44;
            ac.a();
            int discarded$261 = 16;
            dn.a();
            int discarded$262 = -120;
            ud.a();
            rc.a(param0 + 8253);
            int discarded$263 = 50;
            q.a();
            int discarded$264 = 122;
            mj.a();
            fe.a((byte) -112);
            int discarded$265 = -128;
            ab.a();
            int discarded$266 = -121;
            lg.b();
            int discarded$267 = 107;
            wa.c();
            int discarded$268 = 0;
            hg.a();
            ak.a(param0 + -15701);
            int discarded$269 = 0;
            ea.a();
            int discarded$270 = 2107940192;
            bf.a();
            bc.a((byte) -52);
            int discarded$271 = 118;
            nf.c();
            pl.a(true);
            int discarded$272 = -120;
            j.a();
            int discarded$273 = 0;
            nh.k();
            int discarded$274 = 10;
            sf.p();
            int discarded$275 = 25;
            ig.m();
            me.f((byte) -56);
            int discarded$276 = -125;
            mc.j();
            cj.a(true);
            int discarded$277 = 11460;
            wj.j();
            int discarded$278 = 78;
            al.a();
            int discarded$279 = -72;
            vf.a();
            hi.e(param0 + -4);
            int discarded$280 = 1;
            of.a();
            int discarded$281 = 0;
            te.j();
            int discarded$282 = -123;
            g.j();
            tb.e((byte) 83);
            dj.a();
            int discarded$283 = 16976;
            tf.a();
            mb.c(param0 + 99);
            int discarded$284 = 70;
            md.c();
            df.a(49);
            int discarded$285 = -122;
            rj.e();
            int discarded$286 = -55;
            od.e();
            int discarded$287 = 30401;
            nd.a();
            int discarded$288 = -1;
            ed.a();
            int discarded$289 = -1667734544;
            ui.a();
            lj.f(param0 + -13);
            int discarded$290 = 0;
            hb.a();
            int discarded$291 = 1;
            el.b();
            int discarded$292 = 89;
            di.a();
            oe.a(65);
            int discarded$293 = -13;
            kj.a();
            int discarded$294 = 0;
            qb.a();
            int discarded$295 = 111;
            mn.b();
            int discarded$296 = -128;
            cl.c();
            int discarded$297 = 1;
            ke.b();
            ti.a(70);
            sd.b(param0 + -822203963);
            km.c(param0 + 93);
            int discarded$298 = -90;
            f.b();
            int discarded$299 = 608;
            jn.k();
            int discarded$300 = 128;
            ic.c();
            int discarded$301 = 0;
            jd.c();
            wi.a(24074);
            int discarded$302 = 17469;
            vb.f();
            int discarded$303 = -13206;
            qj.c();
            int discarded$304 = -104;
            gj.a();
            ri.c(-1);
            int discarded$305 = 5;
            hm.d();
            uj.c(param0 ^ 29);
            int discarded$306 = 0;
            m.b();
            int discarded$307 = 0;
            de.a();
            int discarded$308 = 86;
            ne.a();
            int discarded$309 = -111;
            ii.b();
            int discarded$310 = 90;
            ub.a();
            int discarded$311 = 3;
            ei.c();
            fa.a(false);
            int discarded$312 = 64;
            uh.b();
            int discarded$313 = 126;
            vk.d();
            int discarded$314 = -62;
            la.a();
            hk.c(-20150);
            int discarded$315 = -125;
            fk.b();
            int discarded$316 = 47;
            jj.a();
            qi.j(66);
            int discarded$317 = -99;
            jf.a();
            gm.a(0);
            int discarded$318 = -12;
            pm.b();
            n.d((byte) -69);
            int discarded$319 = -87;
            db.d();
            int discarded$320 = 117;
            ka.f();
            int discarded$321 = -1;
            hd.f();
            int discarded$322 = 83;
            ld.f();
            li.d((byte) -109);
            int discarded$323 = 34;
            je.a();
            mm.a((byte) 10);
            int discarded$324 = -88;
            bm.a();
            bj.c(125);
            int discarded$325 = -125;
            ll.a();
            ((HostileSpawn) this).field_G = null;
            ((HostileSpawn) this).field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.PA(" + param0 + 41);
        }
    }

    private final void j() {
        try {
            IllegalAccessException illegalAccessException = null;
            ClassNotFoundException classNotFoundException = null;
            NoSuchMethodException noSuchMethodException = null;
            NoSuchFieldException noSuchFieldException = null;
            Class var2 = null;
            RuntimeException var2_ref = null;
            Class var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = java.awt.Toolkit.class;
                try {
                  L1: {
                    kh.field_eb = var2.getMethod("createCustomCursor", new Class[3]);
                    var3 = Class.forName("java.awt.image.BufferedImage");
                    od.field_F = var3.getConstructor(new Class[3]);
                    le.field_eb = var3.getField("TYPE_INT_ARGB").getInt((Object) null);
                    aa.field_e = var3.getMethod("setRGB", new Class[7]);
                    break L1;
                  }
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  illegalAccessException = (IllegalAccessException) (Object) decompiledCaughtException;
                  kh.field_eb = null;
                  return;
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  classNotFoundException = (ClassNotFoundException) (Object) decompiledCaughtException;
                  kh.field_eb = null;
                  return;
                } catch (java.lang.NoSuchMethodException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  noSuchMethodException = (NoSuchMethodException) (Object) decompiledCaughtException;
                  kh.field_eb = null;
                  return;
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  noSuchFieldException = (NoSuchFieldException) (Object) decompiledCaughtException;
                  kh.field_eb = null;
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.U(" + -91 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void s() {
        RuntimeException var2 = null;
        bd[][][] var2_array = null;
        bd[][][] var3 = null;
        bd[] var3_array = null;
        int var4 = 0;
        bd[][] var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = field_I ? 1 : 0;
        try {
          L0: {
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
            pa.field_i[4] = ei.a(vd.field_C, bm.a(39, 76), "", "spawn_guard_attack");
            pa.field_i[5] = ei.a(vd.field_C, 92, "", "spawn_guard_death");
            pa.field_i[0] = ei.a(vd.field_C, 122, "", "spawn_guard_idle");
            pa.field_i[1] = ei.a(vd.field_C, 125, "", "spawn_guard_walk");
            bf.field_f[5] = ei.a(vd.field_C, 115, "", "spawn_dormant_death");
            bf.field_f[1] = ei.a(vd.field_C, 124, "", "spawn_dormant_walk");
            bf.field_f[5] = bf.field_f[1];
            bf.field_f[0] = bf.field_f[1];
            bf.field_f[4] = bf.field_f[1];
            re.field_D[4] = ei.a(vd.field_C, 102, "", "spawn_queen_attack");
            re.field_D[5] = ei.a(vd.field_C, bm.a(39, 87), "", "spawn_queen_death");
            re.field_D[0] = ei.a(vd.field_C, 91, "", "spawn_queen_idle");
            re.field_D[1] = ei.a(vd.field_C, bm.a(39, 67), "", "spawn_queen_walk");
            kl.field_b[4] = ei.a(vd.field_C, 102, "", "spawn_runner_attack");
            kl.field_b[5] = ei.a(vd.field_C, 102, "", "spawn_runner_death");
            kl.field_b[0] = ei.a(vd.field_C, 108, "", "spawn_runner_idle");
            kl.field_b[1] = ei.a(vd.field_C, 125, "", "spawn_runner_walk");
            lb.field_a[4] = ei.a(vd.field_C, bm.a(39, 74), "", "spawn_spitter_attack");
            lb.field_a[5] = ei.a(vd.field_C, 93, "", "spawn_spitter_death");
            lb.field_a[0] = ei.a(vd.field_C, 117, "", "spawn_spitter_idle");
            lb.field_a[1] = ei.a(vd.field_C, 126, "", "spawn_spitter_walk");
            wc.field_f[4] = ei.a(vd.field_C, 119, "", "spawn_praetorian_attack");
            wc.field_f[5] = ei.a(vd.field_C, 113, "", "spawn_praetorian_death");
            wc.field_f[0] = ei.a(vd.field_C, bm.a(39, 70), "", "spawn_praetorian_idle");
            wc.field_f[1] = ei.a(vd.field_C, 93, "", "spawn_praetorian_walk");
            var2_array = new bd[][][]{of.field_c, pa.field_i, bf.field_f, re.field_D, kl.field_b, lb.field_a, cb.field_g, vd.field_y, wc.field_f};
            var3 = var2_array;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                var3_array = new bd[lb.field_a[0].length + lb.field_a[4].length];
                kf.a((Object[]) (Object) lb.field_a[4], 0, (Object[]) (Object) var3_array, 0, lb.field_a[4].length);
                kf.a((Object[]) (Object) lb.field_a[0], 0, (Object[]) (Object) var3_array, lb.field_a[4].length, lb.field_a[0].length);
                lb.field_a[4] = var3_array;
                break L0;
              } else {
                var5 = var3[var4];
                var5[3] = var5[1];
                var5[2] = var5[1];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.IA(" + 39 + 41);
        }
    }

    private final void n() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_I ? 1 : 0;
        try {
          L0: {
            oc.field_h[0][3] = bi.field_h.a("level01-new.dat", "", 0);
            oc.field_h[0][4] = bi.field_h.a("level02-new.dat", "", 0);
            oc.field_h[0][5] = bi.field_h.a("level03-new.dat", "", 0);
            oc.field_h[0][6] = bi.field_h.a("level04-new.dat", "", 0);
            oc.field_h[0][7] = bi.field_h.a("level05-new.dat", "", 0);
            oc.field_h[0][8] = bi.field_h.a("level06-new.dat", "", 0);
            oc.field_h[0][9] = bi.field_h.a("level07-new.dat", "", 0);
            oc.field_h[0][0] = bi.field_h.a("levelf1-new.dat", "", 0);
            oc.field_h[0][1] = bi.field_h.a("levelf2-new.dat", "", 0);
            oc.field_h[0][2] = bi.field_h.a("levelf3-new.dat", "", bm.a(0, 0));
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 10) {
                bi.field_h = null;
                break L0;
              } else {
                L2: {
                  if (null == oc.field_h[0][var2_int]) {
                    System.err.println("Error loading leveldata for kerrus[" + var2_int + "]");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.AA(" + 0 + 41);
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        m var2_ref = null;
        int var3_int = 0;
        hm var3 = null;
        int var4 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var4 = field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              em.field_c = em.field_c + 1;
              int discarded$20 = 14470;
              q.b();
              if (null == mb.field_s) {
                break L1;
              } else {
                mb.field_s.b(param0 ^ 53);
                break L1;
              }
            }
            L2: {
              if (param0 == -35) {
                break L2;
              } else {
                ((HostileSpawn) this).e(-72);
                break L2;
              }
            }
            L3: {
              if (!wh.field_f) {
                break L3;
              } else {
                if (!ha.field_w.a(dg.field_tb, 105)) {
                  int discarded$21 = 1;
                  sj.b();
                  wh.field_f = false;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              stackOut_14_0 = this;
              stackIn_17_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (null != wa.field_q) {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L4;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                break L4;
              }
            }
            L5: {
              ((HostileSpawn) this).a(stackIn_18_1 != 0, param0 + 9803);
              if (!ri.field_m) {
                break L5;
              } else {
                int discarded$22 = -112;
                cf.d();
                ri.field_m = false;
                break L5;
              }
            }
            L6: {
              if (null == wa.field_q) {
                break L6;
              } else {
                if (wa.field_q.field_g) {
                  td.c((byte) 113);
                  v.a(-112, (java.awt.Canvas) (Object) wa.field_q);
                  wa.field_q.a(true, gf.field_b);
                  wa.field_q = null;
                  se.field_h.requestFocus();
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              int discarded$23 = -97;
              if (cm.b()) {
                ((HostileSpawn) this).h(-12752);
                break L7;
              } else {
                L8: {
                  if (ul.field_N) {
                    if (null == sg.field_j) {
                      if (el.field_h[0] == null) {
                        if (el.field_h[1] != null) {
                          this.a((byte) 113, 1);
                          break L8;
                        } else {
                          if (nh.field_L == null) {
                            int discarded$24 = 76;
                            this.m();
                            break L8;
                          } else {
                            if (nh.field_L.field_j) {
                              nh.field_L = null;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      } else {
                        this.a((byte) 113, 0);
                        break L8;
                      }
                    } else {
                      if (sg.field_j.field_l) {
                        var2_int = sg.field_j.field_j.length;
                        var3_int = 0;
                        L9: while (true) {
                          if (var2_int <= var3_int) {
                            L10: {
                              if (hb.a(18, pb.field_Ob, false)) {
                                bh.field_g[18] = vg.a(new String[1], 91, sf.field_Y);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            sg.field_j = null;
                            int discarded$25 = -43;
                            kb.b();
                            var3 = (hm) (Object) vl.field_c.g(param0 + -68);
                            L11: while (true) {
                              if (var3 == null) {
                                break L8;
                              } else {
                                jh.a(125, 4, var3);
                                var3 = (hm) (Object) vl.field_c.a(12684);
                                continue L11;
                              }
                            }
                          } else {
                            pb.field_Ob[var3_int] = sg.field_j.field_j[var3_int];
                            uk.field_c[var3_int] = ll.a(uk.field_c[var3_int], pb.field_Ob[var3_int]);
                            var3_int++;
                            continue L9;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    int discarded$26 = 4;
                    boolean discarded$27 = this.p();
                    break L8;
                  }
                }
                L12: {
                  if (ta.p(3)) {
                    break L12;
                  } else {
                    L13: while (true) {
                      var2_ref = (m) (Object) tm.field_o.c(18120);
                      if (null == var2_ref) {
                        break L12;
                      } else {
                        int discarded$28 = -7347;
                        int discarded$29 = 6;
                        g.a(var2_ref);
                        continue L13;
                      }
                    }
                  }
                }
                L14: while (true) {
                  if (!wd.a(23278, ng.field_l)) {
                    mb.d(0, -22370);
                    int discarded$30 = 0;
                    if (ig.c()) {
                      L15: {
                        L16: {
                          var2_int = ((HostileSpawn) this).d((byte) -75);
                          if (var2_int == 0) {
                            break L16;
                          } else {
                            if (var2_int == 1) {
                              break L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                        int discarded$31 = -107;
                        int discarded$32 = 2;
                        jh.b();
                        int discarded$33 = 3;
                        int discarded$34 = -21;
                        qj.a();
                        int discarded$35 = 4;
                        int discarded$36 = 113;
                        vh.a();
                        og.a(-22248, 5);
                        int discarded$37 = 65535;
                        int discarded$38 = 6;
                        jd.a();
                        break L15;
                      }
                      L17: {
                        if (var2_int == 2) {
                          int discarded$39 = 1;
                          cf.b();
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    ((HostileSpawn) this).h((byte) 126);
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.HA(" + param0 + 41);
        }
    }

    final static char a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_17_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                field_F = false;
                break L1;
              }
            }
            var2_int = 255 & param1;
            if (0 != var2_int) {
              L2: {
                if (128 > var2_int) {
                  break L2;
                } else {
                  if (var2_int < 160) {
                    L3: {
                      var3 = kh.field_hb[-128 + var2_int];
                      if (var3 == 0) {
                        var3 = 63;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var2_int = var3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_17_0 = (char)var2_int;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.SA(" + param0 + 44 + param1 + 41);
        }
        return stackIn_18_0;
    }

    public HostileSpawn() {
        ((HostileSpawn) this).field_D = 0;
        try {
            ni.field_g = (java.applet.Applet) this;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.<init>()");
        }
    }

    private final boolean p() {
        NullPointerException var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        nm var2_ref2 = null;
        int var3 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_98_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_146_0 = 0;
        var3 = field_I ? 1 : 0;
        try {
          L0: {
            int discarded$7 = 118;
            sc.a();
            try {
              L1: {
                ml.a((byte) 112, ll.field_c);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (NullPointerException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              if (mm.field_m != null) {
                break L3;
              } else {
                mm.field_m = new oj[3000];
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= 3000) {
                    break L3;
                  } else {
                    mm.field_m[var2_int] = new oj();
                    var2_int++;
                    continue L4;
                  }
                }
              }
            }
            L5: {
              if (null != re.field_n) {
                break L5;
              } else {
                re.field_n = new oj[3000];
                var2_int = 0;
                L6: while (true) {
                  if (3000 <= var2_int) {
                    break L5;
                  } else {
                    re.field_n[var2_int] = new oj();
                    var2_int++;
                    continue L6;
                  }
                }
              }
            }
            L7: {
              if (vj.field_w != null) {
                break L7;
              } else {
                vj.field_w = new qm[3000];
                var2_int = 0;
                L8: while (true) {
                  if (3000 <= var2_int) {
                    break L7;
                  } else {
                    vj.field_w[var2_int] = new qm();
                    var2_int++;
                    continue L8;
                  }
                }
              }
            }
            L9: {
              if (null != jn.field_F) {
                break L9;
              } else {
                jn.field_F = new p[8000];
                var2_int = 0;
                L10: while (true) {
                  if (var2_int >= 8000) {
                    break L9;
                  } else {
                    jn.field_F[var2_int] = new p();
                    var2_int++;
                    continue L10;
                  }
                }
              }
            }
            L11: {
              if (wh.field_b != null) {
                break L11;
              } else {
                wh.field_b = new p[1000];
                var2_int = 0;
                L12: while (true) {
                  if (var2_int >= 1000) {
                    break L11;
                  } else {
                    wh.field_b[var2_int] = new p();
                    var2_int++;
                    continue L12;
                  }
                }
              }
            }
            if (null != ul.field_P) {
              L13: {
                if (!ul.field_P.a(-15879)) {
                  break L13;
                } else {
                  if (!ul.field_P.e(0)) {
                    break L13;
                  } else {
                    L14: {
                      if (!ph.field_F.a(-15879)) {
                        break L14;
                      } else {
                        if (!ph.field_F.e(0)) {
                          break L14;
                        } else {
                          L15: {
                            if (!ej.field_h.a(-15879)) {
                              break L15;
                            } else {
                              if (ej.field_h.e(0)) {
                                L16: {
                                  if (!tk.field_a.a(-15879)) {
                                    break L16;
                                  } else {
                                    if (!tk.field_a.e(0)) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (!vd.field_C.a(-15879)) {
                                          break L17;
                                        } else {
                                          if (vd.field_C.e(0)) {
                                            L18: {
                                              if (!bi.field_h.a(-15879)) {
                                                break L18;
                                              } else {
                                                if (bi.field_h.e(0)) {
                                                  L19: {
                                                    if (!gi.field_h.a(-15879)) {
                                                      break L19;
                                                    } else {
                                                      if (!gi.field_h.e(0)) {
                                                        break L19;
                                                      } else {
                                                        L20: {
                                                          if (null == wd.field_a) {
                                                            break L20;
                                                          } else {
                                                            L21: {
                                                              if (!wd.field_a.a(-15879)) {
                                                                break L21;
                                                              } else {
                                                                if (wd.field_a.a(-8088, "basic")) {
                                                                  break L20;
                                                                } else {
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                            gj.a(20, s.a(wd.field_a, "basic", 47, cl.field_h, lj.field_r), 40.0f);
                                                            stackOut_98_0 = 0;
                                                            stackIn_99_0 = stackOut_98_0;
                                                            return stackIn_99_0 != 0;
                                                          }
                                                        }
                                                        L22: {
                                                          if (!he.field_t.a(-15879)) {
                                                            break L22;
                                                          } else {
                                                            if (he.field_t.e(0)) {
                                                              L23: {
                                                                if (te.field_J == null) {
                                                                  break L23;
                                                                } else {
                                                                  L24: {
                                                                    if (!te.field_J.a(-15879)) {
                                                                      break L24;
                                                                    } else {
                                                                      if (te.field_J.e(0)) {
                                                                        break L23;
                                                                      } else {
                                                                        break L24;
                                                                      }
                                                                    }
                                                                  }
                                                                  gj.a(20, md.a(in.field_a, te.field_J, cf.field_r, (byte) -58), 50.0f);
                                                                  stackOut_113_0 = 0;
                                                                  stackIn_114_0 = stackOut_113_0;
                                                                  return stackIn_114_0 != 0;
                                                                }
                                                              }
                                                              L25: {
                                                                if (!wd.field_a.a(-15879)) {
                                                                  break L25;
                                                                } else {
                                                                  if (!wd.field_a.a(-8088, "basicfont12")) {
                                                                    break L25;
                                                                  } else {
                                                                    L26: {
                                                                      if (!gb.field_a.a(-15879)) {
                                                                        break L26;
                                                                      } else {
                                                                        if (gb.field_a.a(-8088, "basicfont12")) {
                                                                          L27: {
                                                                            if (!wd.field_a.a(-15879)) {
                                                                              break L27;
                                                                            } else {
                                                                              if (!wd.field_a.a(-8088, "kartika13")) {
                                                                                break L27;
                                                                              } else {
                                                                                L28: {
                                                                                  if (!gb.field_a.a(-15879)) {
                                                                                    break L28;
                                                                                  } else {
                                                                                    if (gb.field_a.a(-8088, "kartika13")) {
                                                                                      int discarded$8 = -43;
                                                                                      kb.b();
                                                                                      u.field_e = u.field_e - w.field_r;
                                                                                      w.field_r = 0;
                                                                                      hg.field_e = 0;
                                                                                      var2_ref2 = this.q(-96);
                                                                                      this.a(22, var2_ref2);
                                                                                      int discarded$9 = 111;
                                                                                      this.u();
                                                                                      stackOut_143_0 = 0;
                                                                                      stackIn_144_0 = stackOut_143_0;
                                                                                      return stackIn_144_0 != 0;
                                                                                    } else {
                                                                                      break L28;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                gj.a(20, s.a(gb.field_a, "kartika13", 84, cf.field_r, in.field_a), 17.0f);
                                                                                stackOut_141_0 = 0;
                                                                                stackIn_142_0 = stackOut_141_0;
                                                                                return stackIn_142_0 != 0;
                                                                              }
                                                                            }
                                                                          }
                                                                          gj.a(20, s.a(wd.field_a, "kartika13", 113, cl.field_h, lj.field_r), 11.0f);
                                                                          stackOut_135_0 = 0;
                                                                          stackIn_136_0 = stackOut_135_0;
                                                                          return stackIn_136_0 != 0;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                    }
                                                                    gj.a(20, s.a(gb.field_a, "basicfont12", 125, cf.field_r, in.field_a), 15.0f);
                                                                    stackOut_127_0 = 0;
                                                                    stackIn_128_0 = stackOut_127_0;
                                                                    return stackIn_128_0 != 0;
                                                                  }
                                                                }
                                                              }
                                                              gj.a(20, s.a(wd.field_a, "basicfont12", 61, cl.field_h, lj.field_r), 14.0f);
                                                              stackOut_121_0 = 0;
                                                              stackIn_122_0 = stackOut_121_0;
                                                              return stackIn_122_0 != 0;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        gj.a(20, s.a(tk.field_a, "", 66, cl.field_h, lj.field_r), 80.0f);
                                                        stackOut_104_0 = 0;
                                                        stackIn_105_0 = stackOut_104_0;
                                                        return stackIn_105_0 != 0;
                                                      }
                                                    }
                                                  }
                                                  gj.a(20, md.a(ci.field_f, gi.field_h, dg.field_rb, (byte) -82), 35.0f);
                                                  stackOut_89_0 = 0;
                                                  stackIn_90_0 = stackOut_89_0;
                                                  return stackIn_90_0 != 0;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            gj.a(20, md.a(ci.field_f, bi.field_h, dg.field_rb, (byte) 68), 30.0f);
                                            stackOut_81_0 = 0;
                                            stackIn_82_0 = stackOut_81_0;
                                            return stackIn_82_0 != 0;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      gj.a(20, md.a(lj.field_r, vd.field_C, cl.field_h, (byte) -88), 25.0f);
                                      stackOut_75_0 = 0;
                                      stackIn_76_0 = stackOut_75_0;
                                      return stackIn_76_0 != 0;
                                    }
                                  }
                                }
                                gj.a(20, md.a(fh.field_i, tk.field_a, rd.field_g, (byte) 79), 20.0f);
                                stackOut_69_0 = 0;
                                stackIn_70_0 = stackOut_69_0;
                                return stackIn_70_0 != 0;
                              } else {
                                break L15;
                              }
                            }
                          }
                          gj.a(20, md.a(fh.field_i, ej.field_h, rd.field_g, (byte) 102), 15.0f);
                          stackOut_61_0 = 0;
                          stackIn_62_0 = stackOut_61_0;
                          return stackIn_62_0 != 0;
                        }
                      }
                    }
                    gj.a(20, md.a(sd.field_v, ph.field_F, hn.field_c, (byte) 84), 10.0f);
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    return stackIn_56_0 != 0;
                  }
                }
              }
              gj.a(20, md.a(sd.field_v, ul.field_P, hn.field_c, (byte) -112), 5.0f);
              stackOut_47_0 = 0;
              stackIn_48_0 = stackOut_47_0;
              return stackIn_48_0 != 0;
            } else {
              if (vd.field_C == null) {
                if (null == he.field_t) {
                  if (null == bi.field_h) {
                    L29: {
                      if (wb.field_S <= 0) {
                        break L29;
                      } else {
                        if (null == gi.field_h) {
                          break L29;
                        } else {
                          int discarded$10 = 28974;
                          this.o();
                          stackOut_158_0 = 0;
                          stackIn_159_0 = stackOut_158_0;
                          return stackIn_159_0 != 0;
                        }
                      }
                    }
                    L30: {
                      int discarded$11 = 7;
                      int discarded$12 = 50;
                      li.a();
                      ij.a((byte) -17, vg.field_h);
                      am.field_d = (HostileSpawn) this;
                      this.m(300);
                      of.field_h = new re(true);
                      if (ta.p(3)) {
                        break L30;
                      } else {
                        sg.field_j = wk.a(4, -2178);
                        of.field_h.f(-121);
                        break L30;
                      }
                    }
                    ul.field_N = true;
                    ql.f(8036);
                    stackOut_163_0 = 1;
                    stackIn_164_0 = stackOut_163_0;
                    break L0;
                  } else {
                    int discarded$13 = 0;
                    this.n();
                    stackOut_152_0 = 0;
                    stackIn_153_0 = stackOut_152_0;
                    return stackIn_153_0 != 0;
                  }
                } else {
                  this.l(-4);
                  stackOut_149_0 = 0;
                  stackIn_150_0 = stackOut_149_0;
                  return stackIn_150_0 != 0;
                }
              } else {
                this.i((byte) -113);
                stackOut_146_0 = 0;
                stackIn_147_0 = stackOut_146_0;
                return stackIn_147_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.VA(" + 4 + 41);
        }
        return stackIn_164_0 != 0;
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!el.field_h[param1].field_j) {
                break L1;
              } else {
                L2: {
                  if (~el.field_h[param1].field_h[0] >= ~gn.field_k[param1]) {
                    break L2;
                  } else {
                    gn.field_k[param1] = el.field_h[param1].field_h[0];
                    break L2;
                  }
                }
                el.field_h[param1] = null;
                break L1;
              }
            }
            of.field_h.field_E = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "HostileSpawn.RA(" + 113 + 44 + param1 + 41);
        }
    }

    private final void r(int param0) {
        t var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -113) {
                break L1;
              } else {
                nm discarded$2 = this.q(-36);
                break L1;
              }
            }
            L2: {
              var2 = (t) (Object) ac.field_i.g(-54);
              if (null == var2) {
                break L2;
              } else {
                L3: {
                  var4 = ((HostileSpawn) this).field_D;
                  if (80 > var4) {
                    var3 = var4 / 2 - 32;
                    break L3;
                  } else {
                    if (var4 >= 230) {
                      var3 = -(var4 / 2) + 123;
                      break L3;
                    } else {
                      var3 = 8;
                      break L3;
                    }
                  }
                }
                fj.field_Kb[var2.field_h].b(8, var3);
                al.field_Z.c(il.field_b[var2.field_h], 48, id.field_A.field_y + var3, 65280, -1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.OA(" + param0 + 41);
        }
    }

    final void a(byte param0) {
        Object var2_ref2 = null;
        ue var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_10_1 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_12_1 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_14_1 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas stackOut_4_0 = null;
        ue stackOut_2_0 = null;
        int stackOut_8_0 = 0;
        Object stackOut_8_1 = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_9_1 = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_10_1 = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        var2_ref2 = null;
        var4 = field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (wa.field_q == null) {
                stackOut_4_0 = se.field_h;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = wa.field_q;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref2 = stackIn_5_0;
            int discarded$5 = -97;
            if (cm.b()) {
              L2: {
                L3: {
                  stackOut_8_0 = 0;
                  stackOut_8_1 = var2_ref2;
                  stackIn_12_0 = stackOut_8_0;
                  stackIn_12_1 = (RuntimeException) (Object) stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = (RuntimeException) (Object) stackOut_8_1;
                  if (wa.field_q != null) {
                    break L3;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = (RuntimeException) (Object) stackIn_9_1;
                    stackIn_14_0 = stackOut_9_0;
                    stackIn_14_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (!nm.field_a) {
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = (RuntimeException) (Object) stackIn_14_1;
                      stackOut_14_2 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L2;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = (RuntimeException) (Object) stackIn_10_1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L3;
                    }
                  }
                }
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = (RuntimeException) (Object) stackIn_12_1;
                stackOut_12_2 = 1;
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_15_2 = stackOut_12_2;
                break L2;
              }
              gb.a(stackIn_15_0 != 0, (java.awt.Canvas) (Object) stackIn_15_1, stackIn_15_2 != 0);
              return;
            } else {
              if (!ul.field_N) {
                ad.a((java.awt.Canvas) var2_ref2, false);
                return;
              } else {
                L4: {
                  if (null == ei.field_o) {
                    if (null == of.field_h) {
                      if (null == ((HostileSpawn) this).field_G) {
                        L5: {
                          var3 = 1;
                          if (0 > ri.field_h) {
                            if (hf.field_i >= 0) {
                              var3 = 2;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            var3 = 0;
                            break L5;
                          }
                        }
                        me.b(105, var3);
                        rd.a(false);
                        break L4;
                      } else {
                        ((HostileSpawn) this).field_G.b((byte) -99);
                        break L4;
                      }
                    } else {
                      me.b(108, 0);
                      of.field_h.h(26);
                      break L4;
                    }
                  } else {
                    si.d();
                    ei.field_o.a(104);
                    break L4;
                  }
                }
                L6: {
                  this.a((java.awt.Canvas) var2_ref2, 67);
                  if (param0 <= -34) {
                    break L6;
                  } else {
                    this.l(112);
                    break L6;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.MA(" + param0 + 41);
        }
    }

    private final void l(int param0) {
        RuntimeException var2 = null;
        bd[][] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_I ? 1 : 0;
        try {
          L0: {
            uf.field_i[4] = new bd(he.field_t.a("starfield.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
            var2_array = new bd[8][];
            int discarded$12 = 8;
            int discarded$13 = 20;
            var2_array[0] = gl.a(new bd(he.field_t.a("floors_1.jpg", "", 0), (java.awt.Component) (Object) se.field_h));
            int discarded$14 = 8;
            int discarded$15 = 20;
            var2_array[1] = gl.a(new bd(he.field_t.a("floors_2.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h));
            int discarded$16 = 8;
            int discarded$17 = 20;
            var2_array[2] = gl.a(new bd(he.field_t.a("floors_3.jpg", "", 0), (java.awt.Component) (Object) se.field_h));
            int discarded$18 = 8;
            int discarded$19 = 20;
            var2_array[3] = gl.a(new bd(he.field_t.a("floors_4.jpg", "", bm.a(param0, param0)), (java.awt.Component) (Object) se.field_h));
            int discarded$20 = 8;
            int discarded$21 = 20;
            var2_array[5] = gl.a(new bd(he.field_t.a("floors_6.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h));
            int discarded$22 = 8;
            int discarded$23 = 20;
            var2_array[6] = gl.a(new bd(he.field_t.a("floors_7.jpg", "", 0), (java.awt.Component) (Object) se.field_h));
            pk.field_d = new bd[1280];
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                var2_array = null;
                ri.field_p = new bd(he.field_t.a("bg.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
                hk.field_h = new bd(he.field_t.a("hs_logo.jpg", "", 0), (java.awt.Component) (Object) se.field_h);
                var3 = 0;
                L2: while (true) {
                  if (~hk.field_h.field_D.length >= ~var3) {
                    o.field_n.b((byte) 125);
                    he.field_t = null;
                    break L0;
                  } else {
                    L3: {
                      if ((255 & hk.field_h.field_D[var3] >> 16) >= 10) {
                        break L3;
                      } else {
                        hk.field_h.field_D[var3] = 0;
                        break L3;
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (var2_array[var3] == null) {
                    break L4;
                  } else {
                    kf.a((Object[]) (Object) var2_array[var3], 0, (Object[]) (Object) pk.field_d, var3 * 160, 160);
                    break L4;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.V(" + param0 + 41);
        }
    }

    private final void o() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            oc.field_h[1][0] = gi.field_h.a("level_01.dat", "", 0);
            oc.field_h[1][1] = gi.field_h.a("level_02.dat", "", bm.a(28974, 28974));
            oc.field_h[1][2] = gi.field_h.a("level_03.dat", "", bm.a(28974, 28974));
            oc.field_h[1][3] = gi.field_h.a("level_04.dat", "", bm.a(28974, 28974));
            oc.field_h[1][4] = gi.field_h.a("level_05.dat", "", 0);
            oc.field_h[1][5] = gi.field_h.a("level_06.dat", "", 0);
            oc.field_h[1][6] = gi.field_h.a("level_07.dat", "", 0);
            oc.field_h[1][7] = gi.field_h.a("level_08.dat", "", 0);
            oc.field_h[1][8] = gi.field_h.a("level_09.dat", "", 0);
            oc.field_h[1][9] = gi.field_h.a("level_10.dat", "", 0);
            gi.field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.JA(" + 28974 + 41);
        }
    }

    private final void m() {
        RuntimeException var2 = null;
        int var2_int = 0;
        Object stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        try {
          L0: {
            L1: {
              q.field_n = q.field_n + j.field_c;
              in.field_b = in.field_b - j.field_c;
              if (ig.field_L == 0) {
                break L1;
              } else {
                lg.field_m = lg.field_m + 1;
                q.field_n = q.field_n + fa.field_a;
                in.field_b = in.field_b - pf.field_o * lg.field_m;
                fa.field_a = fa.field_a - pf.field_o;
                break L1;
              }
            }
            L2: {
              if (!m.field_l) {
                break L2;
              } else {
                of.field_h.f(-111);
                cn.a(false, (byte) 99);
                m.field_l = false;
                break L2;
              }
            }
            if (!jk.a(-23322)) {
              if (!pf.a(-126)) {
                if (null != ei.field_o) {
                  L3: {
                    ei.field_o.a((byte) -114);
                    if (0 != pf.field_o) {
                      ei.field_o.d(-868);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ei.field_o.b((byte) -66)) {
                      ei.field_o = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  L5: {
                    if (null == ac.field_i.g(-103)) {
                      break L5;
                    } else {
                      int fieldTemp$5 = ((HostileSpawn) this).field_D + 1;
                      ((HostileSpawn) this).field_D = ((HostileSpawn) this).field_D + 1;
                      if (fieldTemp$5 != 335) {
                        break L5;
                      } else {
                        ((HostileSpawn) this).field_D = 0;
                        am discarded$6 = ac.field_i.c(18120);
                        break L5;
                      }
                    }
                  }
                  L6: {
                    ca.field_c = ca.field_c + 10;
                    if (0 >= ((HostileSpawn) this).field_H) {
                      break L6;
                    } else {
                      ((HostileSpawn) this).field_H = ((HostileSpawn) this).field_H - 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (ca.field_c > 512) {
                      ca.field_c = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (wa.field_q == null) {
                      break L8;
                    } else {
                      if (!wa.field_q.field_g) {
                        break L8;
                      } else {
                        td.c((byte) 110);
                        v.a(29, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        break L8;
                      }
                    }
                  }
                  if (of.field_h == null) {
                    if (null != ((HostileSpawn) this).field_G) {
                      ((HostileSpawn) this).field_G.b(32);
                      return;
                    } else {
                      wj.a((byte) -59);
                      break L0;
                    }
                  } else {
                    int discarded$7 = -27587;
                    cg.a();
                    boolean discarded$8 = mb.field_s.b(0, (byte) 95);
                    return;
                  }
                }
              } else {
                L9: {
                  stackOut_21_0 = this;
                  stackIn_26_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (wa.field_q == null) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L9;
                  } else {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackOut_24_0 = this;
                    stackOut_24_1 = 1;
                    stackIn_27_0 = stackOut_24_0;
                    stackIn_27_1 = stackOut_24_1;
                    break L9;
                  }
                }
                L10: {
                  var2_int = ((HostileSpawn) this).b(stackIn_27_1 != 0, -1);
                  if (var2_int == 1) {
                    if (null == wa.field_q) {
                      break L10;
                    } else {
                      v.a(38, (java.awt.Canvas) (Object) wa.field_q);
                      wa.field_q.a(true, gf.field_b);
                      wa.field_q = null;
                      se.field_h.requestFocus();
                      break L10;
                    }
                  } else {
                    if (var2_int != 2) {
                      break L10;
                    } else {
                      L11: {
                        if (wa.field_q == null) {
                          break L11;
                        } else {
                          v.a(15, (java.awt.Canvas) (Object) wa.field_q);
                          wa.field_q.a(true, gf.field_b);
                          wa.field_q = null;
                          se.field_h.requestFocus();
                          break L11;
                        }
                      }
                      dc.a(75, bn.c(-1));
                      break L10;
                    }
                  }
                }
                return;
              }
            } else {
              L12: {
                var2_int = lj.d(-83);
                if (var2_int != 2) {
                  break L12;
                } else {
                  if (wa.field_q == null) {
                    break L12;
                  } else {
                    v.a(15, (java.awt.Canvas) (Object) wa.field_q);
                    wa.field_q.a(true, gf.field_b);
                    wa.field_q = null;
                    se.field_h.requestFocus();
                    break L12;
                  }
                }
              }
              L13: {
                if (var2_int != 3) {
                  break L13;
                } else {
                  nh.a(true, (byte) -90);
                  break L13;
                }
              }
              L14: {
                if (var2_int != 4) {
                  break L14;
                } else {
                  m.field_l = true;
                  int discarded$9 = 0;
                  od.k();
                  break L14;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.BA(" + 76 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        w var2 = null;
        kh var3 = null;
        kh var4 = null;
        kh var5 = null;
        kd var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((HostileSpawn) this).a(9, false, 11, 23, 0, false, 13, 10);
              eh.field_c = new wm();
              var2 = new w();
              var2.c(param0 + 4325, 128, 9);
              var3 = new kh();
              var4 = new kh((w) (Object) var3);
              var5 = new kh((w) (Object) var3);
              var6 = new kd((w) (Object) var3, (w) (Object) var4, (w) (Object) var5);
              mb.field_s = new he(var5);
              aj.a(var6, -25127, 22050, (java.awt.Component) (Object) se.field_h, true, gf.field_b);
              if (param0 == -4323) {
                break L1;
              } else {
                this.m(-15);
                break L1;
              }
            }
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "HostileSpawn.GA(" + param0 + 41);
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              this.r(param1 ^ -59);
              if (jk.a(param1 + -23389)) {
                si.a(0, 0, 640, 480, 0, 128);
                var3_int = -8 + (320 + -(lm.e(0) / 2) + -8);
                int discarded$3 = -1;
                var4 = -8 + (240 + -(ti.a() / 2)) + -8;
                var5 = 16 + lm.e(param1 ^ 67) - -16;
                int discarded$4 = -1;
                var6 = 16 + (ti.a() + 16);
                si.c(var3_int - 8, -8 + var4, var5 - -16, var6 - -16, 0);
                wh.b(param1 + 44);
                break L1;
              } else {
                if (!pf.a(param1 + -178)) {
                  break L1;
                } else {
                  L2: {
                    if (wa.field_q != null) {
                      stackOut_9_0 = 1;
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  hi.a(stackIn_10_0 != 0, (byte) 127);
                  break L1;
                }
              }
            }
            L3: {
              if (param1 == 67) {
                break L3;
              } else {
                ((HostileSpawn) this).field_D = 109;
                break L3;
              }
            }
            int discarded$5 = 0;
            ui.a(0, param0, (byte) 97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("HostileSpawn.QA(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
    }

    private final void t() {
        int var2_int = 0;
        int var3 = 0;
        var3 = field_I ? 1 : 0;
        kd.field_y = ci.a("", 127, "Scenery_1", vd.field_C);
        c.field_f = ei.a(vd.field_C, 97, "", "Scenery_2");
        int discarded$198 = 0;
        jd.field_h = fg.a("", "Scenery_3", vd.field_C);
        int discarded$199 = 0;
        om.field_c = fg.a("", "Scenery_4", vd.field_C);
        int discarded$200 = 0;
        ih.field_v = fg.a("", "Scenery_5", vd.field_C);
        int discarded$201 = 0;
        wj.field_L = fg.a("", "Scenery_6", vd.field_C);
        int discarded$202 = 0;
        oc.field_d = fg.a("", "Scenery_7", vd.field_C);
        int discarded$203 = 0;
        hg.field_a = fg.a("", "Scenery_8", vd.field_C);
        f.field_b = ci.a("", -76, "Scenery_9", vd.field_C);
        int discarded$204 = 0;
        og.field_d = fg.a("", "Scenery_10", vd.field_C);
        int discarded$205 = 0;
        r.field_e = fg.a("", "Scenery_11", vd.field_C);
        int discarded$206 = 0;
        r.field_b = fg.a("", "Scenery_12", vd.field_C);
        oe.field_g = ci.a("", -74, "Scenery_13", vd.field_C);
        int discarded$207 = 0;
        rd.field_a = fg.a("", "Scenery_14", vd.field_C);
        int discarded$208 = 0;
        ng.field_v = fg.a("", "Scenery_15", vd.field_C);
        int discarded$209 = 0;
        re.field_q = fg.a("", "Scenery_16", vd.field_C);
        int discarded$210 = 0;
        hf.field_b = fg.a("", "Scenery_17", vd.field_C);
        int discarded$211 = 0;
        qj.field_l = fg.a("", "Scenery_18", vd.field_C);
        int discarded$212 = 0;
        bj.field_j = fg.a("", "Scenery_19", vd.field_C);
        int discarded$213 = 0;
        eh.field_b = fg.a("", "Scenery_20", vd.field_C);
        int discarded$214 = 0;
        lc.field_a = fg.a("", "computer_console1_e_tga", vd.field_C);
        int discarded$215 = 0;
        bi.field_b = fg.a("", "computer_console1_n_tga", vd.field_C);
        int discarded$216 = 0;
        cl.field_j = fg.a("", "computer_console1_s_tga", vd.field_C);
        int discarded$217 = 0;
        de.field_o = fg.a("", "computer_console1_w_tga", vd.field_C);
        int discarded$218 = 0;
        an.field_j = fg.a("", "computer_console2_e_tga", vd.field_C);
        int discarded$219 = 0;
        gi.field_f = fg.a("", "computer_console2_n_tga", vd.field_C);
        int discarded$220 = 0;
        an.field_l = fg.a("", "computer_console2_s_tga", vd.field_C);
        int discarded$221 = 0;
        vi.field_j = fg.a("", "computer_console2_w_tga", vd.field_C);
        int discarded$222 = 0;
        ci.field_k = fg.a("", "Scenery_21", vd.field_C);
        int discarded$223 = 0;
        lc.field_b = fg.a("", "Scenery_22", vd.field_C);
        int discarded$224 = 0;
        rb.field_y = fg.a("", "Scenery_23", vd.field_C);
        int discarded$225 = 0;
        ue.field_h = fg.a("", "Scenery_24", vd.field_C);
        int discarded$226 = 0;
        jg.field_j = fg.a("", "Scenery_25", vd.field_C);
        int discarded$227 = 0;
        wa.field_o = fg.a("", "Scenery_26", vd.field_C);
        int discarded$228 = 0;
        sm.field_h = fg.a("", "Scenery_27", vd.field_C);
        int discarded$229 = 0;
        pl.field_j = fg.a("", "Scenery_28", vd.field_C);
        int discarded$230 = 0;
        pe.field_hb = fg.a("", "Scenery_29", vd.field_C);
        int discarded$231 = 0;
        en.field_w = fg.a("", "Scenery_30", vd.field_C);
        int discarded$232 = 0;
        e.field_d = fg.a("", "Scenery_31", vd.field_C);
        int discarded$233 = 0;
        ig.field_S = fg.a("", "Scenery_32", vd.field_C);
        int discarded$234 = 0;
        f.field_d = fg.a("", "Scenery_33", vd.field_C);
        int discarded$235 = 0;
        vc.field_h = fg.a("", "Scenery_34", vd.field_C);
        int discarded$236 = 0;
        ki.field_b = fg.a("", "Scenery_35", vd.field_C);
        int discarded$237 = 0;
        nh.field_C = fg.a("", "Scenery_36", vd.field_C);
        int discarded$238 = 0;
        wb.field_W = fg.a("", "explosive_crate_e_tga", vd.field_C);
        int discarded$239 = 0;
        gi.field_c = fg.a("", "explosive_crate_n_tga", vd.field_C);
        int discarded$240 = 0;
        el.field_f = fg.a("", "explosive_crate_s_tga", vd.field_C);
        int discarded$241 = 0;
        oa.field_e = fg.a("", "explosive_crate_w_tga", vd.field_C);
        int discarded$242 = 0;
        ue.field_f = fg.a("", "health_big_tga", vd.field_C);
        int discarded$243 = 0;
        ia.field_e = fg.a("", "health_sm_tga", vd.field_C);
        int discarded$244 = 0;
        kj.field_f = fg.a("", "Scenery_37", vd.field_C);
        int discarded$245 = 0;
        gf.field_a = fg.a("", "Scenery_38", vd.field_C);
        int discarded$246 = 0;
        bl.field_c = fg.a("", "Scenery_39", vd.field_C);
        int discarded$247 = 0;
        u.field_h = fg.a("", "Scenery_40", vd.field_C);
        int discarded$248 = 0;
        vj.field_p = fg.a("", "Scenery_41", vd.field_C);
        int discarded$249 = 0;
        ea.field_e = fg.a("", "Scenery_42", vd.field_C);
        int discarded$250 = 0;
        tc.field_b = fg.a("", "Scenery_43", vd.field_C);
        int discarded$251 = 0;
        oe.field_d = fg.a("", "Scenery_44", vd.field_C);
        int discarded$252 = 0;
        km.field_z = fg.a("", "Scenery_45", vd.field_C);
        int discarded$253 = 0;
        ab.field_a = fg.a("", "Scenery_46", vd.field_C);
        int discarded$254 = 0;
        vc.field_k = fg.a("", "Scenery_47", vd.field_C);
        int discarded$255 = 0;
        jc.field_a = fg.a("", "Scenery_48", vd.field_C);
        int discarded$256 = 0;
        hm.field_l = fg.a("", "Scenery_49", vd.field_C);
        int discarded$257 = 0;
        q.field_c = fg.a("", "Scenery_50", vd.field_C);
        int discarded$258 = 0;
        df.field_a = fg.a("", "Scenery_51", vd.field_C);
        int discarded$259 = 0;
        sj.field_g = fg.a("", "Scenery_52", vd.field_C);
        int discarded$260 = 0;
        vf.field_H = fg.a("", "Scenery_53", vd.field_C);
        int discarded$261 = 0;
        nd.field_a = fg.a("", "Scenery_54", vd.field_C);
        int discarded$262 = 0;
        el.field_l = fg.a("", "Scenery_55", vd.field_C);
        int discarded$263 = 0;
        lh.field_e = fg.a("", "Scenery_56", vd.field_C);
        int discarded$264 = 0;
        vg.field_d = fg.a("", "Scenery_57", vd.field_C);
        int discarded$265 = 0;
        ui.field_b = fg.a("", "Scenery_58", vd.field_C);
        int discarded$266 = 0;
        ig.field_R = fg.a("", "Scenery_59", vd.field_C);
        int discarded$267 = 0;
        ic.field_k = fg.a("", "Scenery_60", vd.field_C);
        int discarded$268 = 0;
        eb.field_b = fg.a("", "Scenery_61", vd.field_C);
        int discarded$269 = 0;
        cn.field_h = fg.a("", "Scenery_62", vd.field_C);
        int discarded$270 = 0;
        jh.field_cb = fg.a("", "Scenery_63", vd.field_C);
        int discarded$271 = 0;
        fe.field_c = fg.a("", "Scenery_64", vd.field_C);
        int discarded$272 = 0;
        qg.field_m = fg.a("", "Scenery_65", vd.field_C);
        int discarded$273 = 0;
        qc.field_B = fg.a("", "Scenery_66", vd.field_C);
        int discarded$274 = 0;
        ld.field_p = fg.a("", "Scenery_67", vd.field_C);
        int discarded$275 = 0;
        rj.field_N = fg.a("", "Scenery_68", vd.field_C);
        int discarded$276 = 0;
        td.field_f = fg.a("", "Scenery_69", vd.field_C);
        int discarded$277 = 0;
        dd.field_j = fg.a("", "Scenery_70", vd.field_C);
        int discarded$278 = 0;
        ck.field_C = fg.a("", "Scenery_71", vd.field_C);
        int discarded$279 = 0;
        tb.field_L = fg.a("", "Scenery_72", vd.field_C);
        int discarded$280 = 0;
        wd.field_b = fg.a("", "Scenery_73", vd.field_C);
        int discarded$281 = 0;
        ub.field_c = fg.a("", "Scenery_74", vd.field_C);
        int discarded$282 = 0;
        fa.field_e = fg.a("", "Scenery_75", vd.field_C);
        int discarded$283 = 0;
        ej.field_d = fg.a("", "Scenery_76", vd.field_C);
        int discarded$284 = 0;
        ci.field_l = fg.a("", "Scenery_77", vd.field_C);
        int discarded$285 = 0;
        ng.field_i = fg.a("", "Scenery_78", vd.field_C);
        int discarded$286 = 0;
        mn.field_b = fg.a("", "Scenery_79", vd.field_C);
        int discarded$287 = 0;
        ln.field_c = fg.a("", "Scenery_80", vd.field_C);
        int discarded$288 = 0;
        hh.field_b = fg.a("", "Scenery_81", vd.field_C);
        int discarded$289 = 0;
        bm.field_f = fg.a("", "reactor_tga", vd.field_C);
        int discarded$290 = 0;
        ca.field_b = fg.a("", "reactor_damaged_tga", vd.field_C);
        int discarded$291 = 0;
        vi.field_k = fg.a("", "shuttle_tga", vd.field_C);
        sc.field_a = ci.a("", 123, "shield_module", vd.field_C);
        int discarded$292 = 0;
        qm.field_P = fg.a("", "explosive_charge", vd.field_C);
        bd discarded$293 = ci.a("", -21, "cloak_module", vd.field_C);
        e.field_r = ci.a("", -78, "invulnerability_module", vd.field_C);
        jg.field_h = ci.a("", 117, "explosive_shells", vd.field_C);
        qh.field_l = ci.a("", 120, "fusion_power", vd.field_C);
        mg.field_b = ci.a("", -67, "incendiary_rockets", vd.field_C);
        bn.field_l = ci.a("", 111, "plasma_fire", vd.field_C);
        aa.field_b = ci.a("", -48, "powered_boots", vd.field_C);
        int discarded$294 = 0;
        jg.field_f = fg.a("", "security_pass", vd.field_C);
        im.field_a = jd.a((byte) 33, "", vd.field_C, "doors_hammerhead");
        ak.field_a = ci.a("", -116, "door_twiddles_hammerhead_h", vd.field_C);
        an.field_d = ci.a("", 125, "door_twiddles_hammerhead_v", vd.field_C);
        jd.field_o = jd.a((byte) 33, "", vd.field_C, "doors_planet");
        ce.field_a = ci.a("", 118, "door_twiddles_planet_h", vd.field_C);
        r.field_c = ci.a("", 125, "door_twiddles_planet_v", vd.field_C);
        th.field_Hb = jd.a((byte) 33, "", vd.field_C, "doors_station");
        qa.field_c = ci.a("", 116, "door_twiddles_station_h", vd.field_C);
        gi.field_d = ci.a("", -86, "door_twiddles_station_v", vd.field_C);
        int discarded$295 = 0;
        ri.field_k = fg.a("", "Scenery_82", vd.field_C);
        int discarded$296 = 0;
        ci.field_g = fg.a("", "Scenery_83", vd.field_C);
        int discarded$297 = 0;
        wa.field_n = fg.a("", "Scenery_84", vd.field_C);
        int discarded$298 = 0;
        mj.field_a = fg.a("", "Scenery_85", vd.field_C);
        int discarded$299 = 0;
        mg.field_f = fg.a("", "Scenery_86", vd.field_C);
        int discarded$300 = 0;
        le.field_xb = fg.a("", "Scenery_87", vd.field_C);
        int discarded$301 = 0;
        rh.field_C = fg.a("", "Scenery_88", vd.field_C);
        int discarded$302 = 0;
        rh.field_z = fg.a("", "Scenery_89", vd.field_C);
        int discarded$303 = 0;
        in.field_d = fg.a("", "Scenery_90", vd.field_C);
        gi.field_j = ci.a("", -69, "Scenery_91", vd.field_C);
        ln.field_g = ci.a("", -91, "Scenery_92", vd.field_C);
        int discarded$304 = 0;
        li.field_y = fg.a("", "Scenery_93", vd.field_C);
        int discarded$305 = 0;
        kc.field_d = fg.a("", "Scenery_94", vd.field_C);
        int discarded$306 = 0;
        sj.field_b = fg.a("", "Scenery_95", vd.field_C);
        int discarded$307 = 0;
        n.field_q = fg.a("", "Scenery_96", vd.field_C);
        int discarded$308 = 0;
        ml.field_a = fg.a("", "Scenery_97", vd.field_C);
        p.field_d = ci.a("", -33, "Scenery_98", vd.field_C);
        int discarded$309 = 0;
        wk.field_a = fg.a("", "Scenery_99", vd.field_C);
        int discarded$310 = 0;
        hf.field_e = fg.a("", "Scenery_100", vd.field_C);
        gb.field_l = ci.a("", 110, "Scenery_101", vd.field_C);
        wh.field_e = ci.a("", 120, "bend_a_1", vd.field_C);
        wi.field_e = ci.a("", 109, "bend_b_2", vd.field_C);
        dl.field_r = ci.a("", 123, "corner_c_1", vd.field_C);
        id.field_w = ci.a("", 126, "corner_c_2", vd.field_C);
        ld.field_o = ci.a("", -110, "corner_c_3", vd.field_C);
        la.field_e = ci.a("", 24, "corner_d_4", vd.field_C);
        bb.field_a = ci.a("", 112, "diagonal_d_1", vd.field_C);
        qg.field_i = ci.a("", -2, "diagonal_d_2", vd.field_C);
        oa.field_i = ci.a("", -46, "diagonal_d_3", vd.field_C);
        hf.field_j = ci.a("", -112, "Scenery_103", vd.field_C);
        int discarded$311 = 0;
        sd.field_t = fg.a("", "Scenery_107", vd.field_C);
        int discarded$312 = 0;
        vb.field_Lb = fg.a("", "Scenery_108", vd.field_C);
        int discarded$313 = 0;
        uh.field_f = fg.a("", "Scenery_109", vd.field_C);
        int discarded$314 = 0;
        qh.field_g = fg.a("", "Scenery_110", vd.field_C);
        int discarded$315 = 0;
        ei.field_m = fg.a("", "Scenery_111", vd.field_C);
        int discarded$316 = 0;
        j.field_a = fg.a("", "Scenery_112", vd.field_C);
        int discarded$317 = 0;
        vk.field_p = fg.a("", "Scenery_113", vd.field_C);
        int discarded$318 = 0;
        wc.field_e = fg.a("", "Scenery_114", vd.field_C);
        ui.field_c = ci.a("", 1, "Scenery_115", vd.field_C);
        int discarded$319 = 0;
        dn.field_h = fg.a("", "Scenery_116", vd.field_C);
        int discarded$320 = 0;
        hj.field_r = fg.a("", "Scenery_117", vd.field_C);
        int discarded$321 = 0;
        pj.field_l = fg.a("", "Scenery_118", vd.field_C);
        int discarded$322 = 0;
        qc.field_q = fg.a("", "Scenery_119", vd.field_C);
        int discarded$323 = 0;
        field_C = fg.a("", "Scenery_120", vd.field_C);
        int discarded$324 = 0;
        rg.field_a = fg.a("", "Scenery_121", vd.field_C);
        int discarded$325 = 0;
        la.field_h = fg.a("", "Scenery_122", vd.field_C);
        int discarded$326 = 0;
        gf.field_d = fg.a("", "Scenery_123", vd.field_C);
        int discarded$327 = 0;
        ed.field_a = fg.a("", "Scenery_124", vd.field_C);
        int discarded$328 = 0;
        nb.field_J = fg.a("", "Scenery_125", vd.field_C);
        int discarded$329 = 0;
        t.field_l = fg.a("", "Scenery_126", vd.field_C);
        int discarded$330 = 0;
        uc.field_a = fg.a("", "Scenery_127", vd.field_C);
        int discarded$331 = 0;
        s.field_d = fg.a("", "Scenery_128", vd.field_C);
        qg.field_g = new bd[106];
        vb.field_Kb = new bd[qg.field_g.length];
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= 43) {
            ie.field_b = jd.a((byte) 33, "", vd.field_C, "spinning_fans");
            int discarded$332 = 0;
            qg.field_g[43] = fg.a("", "tentacles_corner2", vd.field_C);
            int discarded$333 = 0;
            qg.field_g[44] = fg.a("", "tentacles_straight2", vd.field_C);
            int discarded$334 = 0;
            qg.field_g[45] = fg.a("", "tentacles_straight4", vd.field_C);
            int discarded$335 = 0;
            qg.field_g[46] = fg.a("", "tentacles_straight6", vd.field_C);
            int discarded$336 = 0;
            qg.field_g[47] = fg.a("", "tentacles_straight8", vd.field_C);
            int discarded$337 = 0;
            qg.field_g[48] = fg.a("", "tentacles_t_junction2", vd.field_C);
            int discarded$338 = 0;
            qg.field_g[49] = fg.a("", "tentacles_x_junction2", vd.field_C);
            int discarded$339 = 0;
            qg.field_g[50] = fg.a("", "floor_tentacles_fadeleft", vd.field_C);
            int discarded$340 = 0;
            qg.field_g[51] = fg.a("", "floor_tentacles_faderight", vd.field_C);
            int discarded$341 = 0;
            qg.field_g[52] = fg.a("", "floor_tentacles_innercorner3a", vd.field_C);
            int discarded$342 = 0;
            qg.field_g[53] = fg.a("", "floor_tentacles_innercorner5a", vd.field_C);
            int discarded$343 = 0;
            qg.field_g[54] = fg.a("", "floor_tentacles_innerstraight3_2a", vd.field_C);
            int discarded$344 = 0;
            qg.field_g[55] = fg.a("", "floor_tentacles_innerstraight3_3a", vd.field_C);
            int discarded$345 = 0;
            qg.field_g[56] = fg.a("", "floor_tentacles_innerstraight5_3a", vd.field_C);
            int discarded$346 = 0;
            qg.field_g[57] = fg.a("", "floor_tentacles_innerstraight5_4a", vd.field_C);
            int discarded$347 = 0;
            qg.field_g[58] = fg.a("", "floor_tentacles_outercorner3a", vd.field_C);
            int discarded$348 = 0;
            qg.field_g[59] = fg.a("", "floor_tentacles_outercorner5a", vd.field_C);
            int discarded$349 = 0;
            qg.field_g[60] = fg.a("", "floor_tentacles_outerstraight3_2a", vd.field_C);
            int discarded$350 = 0;
            qg.field_g[61] = fg.a("", "floor_tentacles_outerstraight3_3a", vd.field_C);
            int discarded$351 = 0;
            qg.field_g[62] = fg.a("", "floor_tentacles_outerstraight5_3a", vd.field_C);
            int discarded$352 = 0;
            qg.field_g[63] = fg.a("", "floor_tentacles_outerstraight5_4a", vd.field_C);
            int discarded$353 = 0;
            qg.field_g[64] = fg.a("", "floor_tentacles_patch_straight1", vd.field_C);
            int discarded$354 = 0;
            qg.field_g[65] = fg.a("", "floor_tentacles_patch_straight2", vd.field_C);
            int discarded$355 = 0;
            qg.field_g[66] = fg.a("", "floor_tentacles_patch_straight3", vd.field_C);
            int discarded$356 = 0;
            qg.field_g[67] = fg.a("", "floor_tentacles_patch_outercorner1", vd.field_C);
            int discarded$357 = 0;
            qg.field_g[68] = fg.a("", "floor_tentacles_patch_outercorner2", vd.field_C);
            int discarded$358 = 0;
            qg.field_g[69] = fg.a("", "floor_tentacles_patch_innercorner1", vd.field_C);
            int discarded$359 = 0;
            qg.field_g[70] = fg.a("", "floor_tentacles_patch_innercorner2", vd.field_C);
            int discarded$360 = 0;
            qg.field_g[71] = fg.a("", "floor_tentacles_patch_small1", vd.field_C);
            int discarded$361 = 0;
            qg.field_g[72] = fg.a("", "floor_tentacles_patch_small2", vd.field_C);
            int discarded$362 = 0;
            qg.field_g[73] = fg.a("", "floor_tentacles_patch_small3", vd.field_C);
            int discarded$363 = 0;
            qg.field_g[74] = fg.a("", "floor_tentacles_patch_small4", vd.field_C);
            int discarded$364 = 0;
            qg.field_g[75] = fg.a("", "extra_scenery_f5", vd.field_C);
            int discarded$365 = 0;
            qg.field_g[76] = fg.a("", "extra_scenery_f6", vd.field_C);
            int discarded$366 = 0;
            qg.field_g[77] = fg.a("", "scenery_e4", vd.field_C);
            int discarded$367 = 0;
            qg.field_g[78] = fg.a("", "scenery_e5", vd.field_C);
            int discarded$368 = 0;
            qg.field_g[79] = fg.a("", "scenery_e6", vd.field_C);
            int discarded$369 = 0;
            qg.field_g[80] = fg.a("", "scenery_e7", vd.field_C);
            int discarded$370 = 0;
            qg.field_g[81] = fg.a("", "scenery_e8", vd.field_C);
            int discarded$371 = 0;
            qg.field_g[82] = fg.a("", "scenery_e9", vd.field_C);
            int discarded$372 = 0;
            qg.field_g[83] = fg.a("", "scenery_e10", vd.field_C);
            int discarded$373 = 0;
            qg.field_g[84] = fg.a("", "bookshelf1", vd.field_C);
            int discarded$374 = 0;
            qg.field_g[85] = fg.a("", "bookshelf2", vd.field_C);
            int discarded$375 = 0;
            qg.field_g[86] = fg.a("", "bookshelf3", vd.field_C);
            int discarded$376 = 0;
            qg.field_g[87] = fg.a("", "bookshelf4", vd.field_C);
            int discarded$377 = 0;
            qg.field_g[88] = fg.a("", "bookshelf5", vd.field_C);
            int discarded$378 = 0;
            qg.field_g[89] = fg.a("", "bookshelf6", vd.field_C);
            int discarded$379 = 0;
            qg.field_g[90] = fg.a("", "allthatwasleft", vd.field_C);
            int discarded$380 = 0;
            qg.field_g[91] = fg.a("", "bigradialscorch", vd.field_C);
            int discarded$381 = 0;
            qg.field_g[92] = fg.a("", "bloodsplat_green", vd.field_C);
            int discarded$382 = 0;
            qg.field_g[93] = fg.a("", "bloodsplat_red", vd.field_C);
            int discarded$383 = 0;
            qg.field_g[94] = fg.a("", "oilslick1", vd.field_C);
            int discarded$384 = 0;
            qg.field_g[95] = fg.a("", "oilslick2", vd.field_C);
            int discarded$385 = 0;
            qg.field_g[96] = fg.a("", "scorchmark1", vd.field_C);
            int discarded$386 = 0;
            qg.field_g[97] = fg.a("", "skid", vd.field_C);
            int discarded$387 = 0;
            qg.field_g[98] = fg.a("", "smallradialscorch", vd.field_C);
            int discarded$388 = 0;
            qg.field_g[99] = fg.a("", "flightcontrolpanel1", vd.field_C);
            int discarded$389 = 0;
            qg.field_g[100] = fg.a("", "flightcontrolpanel2", vd.field_C);
            int discarded$390 = 0;
            qg.field_g[101] = fg.a("", "flightcontrolpanel3", vd.field_C);
            int discarded$391 = 0;
            qg.field_g[102] = fg.a("", "onebigrock", vd.field_C);
            int discarded$392 = 0;
            qg.field_g[103] = fg.a("", "tinyrocks", vd.field_C);
            int discarded$393 = 0;
            qg.field_g[104] = fg.a("", "tinyrocks2", vd.field_C);
            int discarded$394 = 0;
            qg.field_g[105] = fg.a("", "tinyrocks3", vd.field_C);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 106) {
                return;
              } else {
                vb.field_Kb[var2_int] = ne.a(qg.field_g[var2_int], (byte) -74);
                var2_int++;
                continue L1;
              }
            }
          } else {
            int discarded$395 = 0;
            qg.field_g[var2_int] = fg.a("", "extra_scenery_" + var2_int, vd.field_C);
            var2_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_K = new int[]{24, 5};
        field_F = false;
        field_E = new int[255];
        var0 = 0;
        L0: while (true) {
          if (255 <= var0) {
            return;
          } else {
            L1: {
              var1 = (var0 + -128) * 3;
              if (var1 > 255) {
                var1 = 255;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var1 >= 0) {
                break L2;
              } else {
                var1 = 0;
                break L2;
              }
            }
            field_E[var0] = 65792 * var0 - -var1;
            var0++;
            continue L0;
          }
        }
    }
}
