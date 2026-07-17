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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
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
              if (param0 > 113) {
                break L1;
              } else {
                this.o(-63);
                break L1;
              }
            }
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
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.WA(" + param0 + 41);
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
              la.b(19659);
              if (param0 == 21085) {
                break L2;
              } else {
                field_C = null;
                break L2;
              }
            }
            tg.a((byte) 75);
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
            this.j((byte) -91);
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
            L1: {
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
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("HostileSpawn.LA(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
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

    private final void u(int param0) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.DA(" + param0 + 41);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.PA(" + param0 + 41);
        }
    }

    private final void j(byte param0) {
        try {
            Class var3 = null;
            Class var2 = java.awt.Toolkit.class;
            try {
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
            pa.field_i[4] = ei.a(vd.field_C, bm.a(param0, 76), "", "spawn_guard_attack");
            pa.field_i[5] = ei.a(vd.field_C, 92, "", "spawn_guard_death");
            pa.field_i[0] = ei.a(vd.field_C, 122, "", "spawn_guard_idle");
            if (param0 == 39) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.IA(" + param0 + 41);
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_I ? 1 : 0;
        try {
          L0: {
            oc.field_h[0][3] = bi.field_h.a("level01-new.dat", "", 0);
            oc.field_h[0][4] = bi.field_h.a("level02-new.dat", "", 0);
            oc.field_h[0][5] = bi.field_h.a("level03-new.dat", "", param0);
            oc.field_h[0][6] = bi.field_h.a("level04-new.dat", "", 0);
            oc.field_h[0][7] = bi.field_h.a("level05-new.dat", "", 0);
            oc.field_h[0][8] = bi.field_h.a("level06-new.dat", "", 0);
            oc.field_h[0][9] = bi.field_h.a("level07-new.dat", "", 0);
            oc.field_h[0][0] = bi.field_h.a("levelf1-new.dat", "", param0);
            oc.field_h[0][1] = bi.field_h.a("levelf2-new.dat", "", 0);
            oc.field_h[0][2] = bi.field_h.a("levelf3-new.dat", "", bm.a(param0, 0));
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
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.AA(" + param0 + 41);
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
              q.b(14470);
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
                  sj.b(true);
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
                cf.d(-112);
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
              if (cm.b((byte) -97)) {
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
                            this.m((byte) 76);
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
                            kb.b((byte) -43);
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
                    boolean discarded$1 = this.p(4);
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
                        g.a(var2_ref, 6, -7347);
                        continue L13;
                      }
                    }
                  }
                }
                L14: while (true) {
                  if (!wd.a(23278, ng.field_l)) {
                    mb.d(0, -22370);
                    if (ig.c(false)) {
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
                        jh.b(2, -107);
                        qj.a((byte) -21, 3);
                        vh.a((byte) 113, 4);
                        og.a(-22248, 5);
                        jd.a(6, 65535);
                        break L15;
                      }
                      L17: {
                        if (var2_int == 2) {
                          cf.b(true);
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

    private final boolean p(int param0) {
        NullPointerException var2 = null;
        RuntimeException var2_ref = null;
        int var2_int = 0;
        nm var2_ref2 = null;
        int var3 = 0;
        int stackIn_37_0 = 0;
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
        int stackOut_36_0 = 0;
        var3 = field_I ? 1 : 0;
        try {
          L0: {
            sc.a((byte) 118);
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
            if (param0 == 4) {
              if (null != ul.field_P) {
                L13: {
                  if (!ul.field_P.a(-15879)) {
                    break L13;
                  } else {
                    if (!ul.field_P.e(param0 ^ 4)) {
                      break L13;
                    } else {
                      L14: {
                        if (!ph.field_F.a(param0 + -15883)) {
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
                                    if (!tk.field_a.a(param0 ^ -15875)) {
                                      break L16;
                                    } else {
                                      if (!tk.field_a.e(0)) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (!vd.field_C.a(-15879)) {
                                            break L17;
                                          } else {
                                            if (vd.field_C.e(param0 ^ 4)) {
                                              L18: {
                                                if (!bi.field_h.a(param0 ^ -15875)) {
                                                  break L18;
                                                } else {
                                                  if (bi.field_h.e(param0 ^ 4)) {
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
                                                                if (!wd.field_a.a(param0 ^ -15875)) {
                                                                  break L21;
                                                                } else {
                                                                  if (wd.field_a.a(-8088, "basic")) {
                                                                    break L20;
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              gj.a(param0 ^ 16, s.a(wd.field_a, "basic", 47, cl.field_h, lj.field_r), 40.0f);
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
                                                                        if (te.field_J.e(param0 ^ 4)) {
                                                                          break L23;
                                                                        } else {
                                                                          break L24;
                                                                        }
                                                                      }
                                                                    }
                                                                    gj.a(param0 ^ 16, md.a(in.field_a, te.field_J, cf.field_r, (byte) -58), 50.0f);
                                                                    stackOut_113_0 = 0;
                                                                    stackIn_114_0 = stackOut_113_0;
                                                                    return stackIn_114_0 != 0;
                                                                  }
                                                                }
                                                                L25: {
                                                                  if (!wd.field_a.a(param0 + -15883)) {
                                                                    break L25;
                                                                  } else {
                                                                    if (!wd.field_a.a(-8088, "basicfont12")) {
                                                                      break L25;
                                                                    } else {
                                                                      L26: {
                                                                        if (!gb.field_a.a(-15879)) {
                                                                          break L26;
                                                                        } else {
                                                                          if (gb.field_a.a(param0 ^ -8084, "basicfont12")) {
                                                                            L27: {
                                                                              if (!wd.field_a.a(-15879)) {
                                                                                break L27;
                                                                              } else {
                                                                                if (!wd.field_a.a(param0 + -8092, "kartika13")) {
                                                                                  break L27;
                                                                                } else {
                                                                                  L28: {
                                                                                    if (!gb.field_a.a(-15879)) {
                                                                                      break L28;
                                                                                    } else {
                                                                                      if (gb.field_a.a(-8088, "kartika13")) {
                                                                                        kb.b((byte) -43);
                                                                                        u.field_e = u.field_e - w.field_r;
                                                                                        w.field_r = 0;
                                                                                        hg.field_e = 0;
                                                                                        var2_ref2 = this.q(-96);
                                                                                        this.a(22, var2_ref2);
                                                                                        this.u(111);
                                                                                        stackOut_143_0 = 0;
                                                                                        stackIn_144_0 = stackOut_143_0;
                                                                                        return stackIn_144_0 != 0;
                                                                                      } else {
                                                                                        break L28;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  gj.a(param0 + 16, s.a(gb.field_a, "kartika13", 84, cf.field_r, in.field_a), 17.0f);
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
                                                                gj.a(20, s.a(wd.field_a, "basicfont12", param0 ^ 57, cl.field_h, lj.field_r), 14.0f);
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
                                              gj.a(param0 ^ 16, md.a(ci.field_f, bi.field_h, dg.field_rb, (byte) 68), 30.0f);
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
                                  gj.a(param0 ^ 16, md.a(fh.field_i, tk.field_a, rd.field_g, (byte) 79), 20.0f);
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
                      gj.a(param0 ^ 16, md.a(sd.field_v, ph.field_F, hn.field_c, (byte) 84), 10.0f);
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
                            this.o(28974);
                            stackOut_158_0 = 0;
                            stackIn_159_0 = stackOut_158_0;
                            return stackIn_159_0 != 0;
                          }
                        }
                      }
                      L30: {
                        li.a(50, param0 ^ 3);
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
                      this.n(param0 + -4);
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
            } else {
              stackOut_36_0 = 0;
              stackIn_37_0 = stackOut_36_0;
              return stackIn_37_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "HostileSpawn.VA(" + param0 + 41);
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
            L3: {
              of.field_h.field_E = null;
              if (param0 == 113) {
                break L3;
              } else {
                field_C = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "HostileSpawn.RA(" + param0 + 44 + param1 + 41);
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
            if (cm.b((byte) -97)) {
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
            var2_array[0] = gl.a(new bd(he.field_t.a("floors_1.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
            var2_array[1] = gl.a(new bd(he.field_t.a("floors_2.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h), 20, 8);
            var2_array[2] = gl.a(new bd(he.field_t.a("floors_3.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
            var2_array[3] = gl.a(new bd(he.field_t.a("floors_4.jpg", "", bm.a(param0, param0)), (java.awt.Component) (Object) se.field_h), 20, 8);
            var2_array[5] = gl.a(new bd(he.field_t.a("floors_6.jpg", "", param0 + 4), (java.awt.Component) (Object) se.field_h), 20, 8);
            var2_array[6] = gl.a(new bd(he.field_t.a("floors_7.jpg", "", 0), (java.awt.Component) (Object) se.field_h), 20, 8);
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

    private final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.JA(" + param0 + 41);
        }
    }

    private final void m(byte param0) {
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
                of.field_h.f(param0 ^ -35);
                cn.a(false, (byte) 99);
                m.field_l = false;
                break L2;
              }
            }
            if (!jk.a(-23322)) {
              if (!pf.a(param0 + -202)) {
                if (null != ei.field_o) {
                  L3: {
                    ei.field_o.a((byte) -114);
                    if (0 != pf.field_o) {
                      ei.field_o.d(param0 ^ -816);
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
                    if (param0 == 76) {
                      break L5;
                    } else {
                      field_K = null;
                      break L5;
                    }
                  }
                  L6: {
                    if (null == ac.field_i.g(-103)) {
                      break L6;
                    } else {
                      int fieldTemp$3 = ((HostileSpawn) this).field_D + 1;
                      ((HostileSpawn) this).field_D = ((HostileSpawn) this).field_D + 1;
                      if (fieldTemp$3 != 335) {
                        break L6;
                      } else {
                        ((HostileSpawn) this).field_D = 0;
                        am discarded$4 = ac.field_i.c(18120);
                        break L6;
                      }
                    }
                  }
                  L7: {
                    ca.field_c = ca.field_c + 10;
                    if (0 >= ((HostileSpawn) this).field_H) {
                      break L7;
                    } else {
                      ((HostileSpawn) this).field_H = ((HostileSpawn) this).field_H - 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (ca.field_c > 512) {
                      ca.field_c = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (wa.field_q == null) {
                      break L9;
                    } else {
                      if (!wa.field_q.field_g) {
                        break L9;
                      } else {
                        td.c((byte) 110);
                        v.a(29, (java.awt.Canvas) (Object) wa.field_q);
                        wa.field_q.a(true, gf.field_b);
                        wa.field_q = null;
                        se.field_h.requestFocus();
                        break L9;
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
                    cg.a(-27587);
                    boolean discarded$5 = mb.field_s.b(0, (byte) 95);
                    return;
                  }
                }
              } else {
                L10: {
                  stackOut_21_0 = this;
                  stackIn_26_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (wa.field_q == null) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L10;
                  } else {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackOut_24_0 = this;
                    stackOut_24_1 = 1;
                    stackIn_27_0 = stackOut_24_0;
                    stackIn_27_1 = stackOut_24_1;
                    break L10;
                  }
                }
                L11: {
                  var2_int = ((HostileSpawn) this).b(stackIn_27_1 != 0, param0 + -77);
                  if (var2_int == 1) {
                    if (null == wa.field_q) {
                      break L11;
                    } else {
                      v.a(param0 + -38, (java.awt.Canvas) (Object) wa.field_q);
                      wa.field_q.a(true, gf.field_b);
                      wa.field_q = null;
                      se.field_h.requestFocus();
                      break L11;
                    }
                  } else {
                    if (var2_int != 2) {
                      break L11;
                    } else {
                      L12: {
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
                      dc.a(param0 + -1, bn.c(-1));
                      break L11;
                    }
                  }
                }
                return;
              }
            } else {
              L13: {
                var2_int = lj.d(-83);
                if (var2_int != 2) {
                  break L13;
                } else {
                  if (wa.field_q == null) {
                    break L13;
                  } else {
                    v.a(15, (java.awt.Canvas) (Object) wa.field_q);
                    wa.field_q.a(true, gf.field_b);
                    wa.field_q = null;
                    se.field_h.requestFocus();
                    break L13;
                  }
                }
              }
              L14: {
                if (var2_int != 3) {
                  break L14;
                } else {
                  nh.a(true, (byte) -90);
                  break L14;
                }
              }
              L15: {
                if (var2_int != 4) {
                  break L15;
                } else {
                  m.field_l = true;
                  od.k(0);
                  break L15;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "HostileSpawn.BA(" + param0 + 41);
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
                var4 = -8 + (240 + -(ti.a((byte) -1) / 2)) + -8;
                var5 = 16 + lm.e(param1 ^ 67) - -16;
                var6 = 16 + (ti.a((byte) -1) + 16);
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
            ui.a(0, param0, (byte) 97, 0);
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
                if (var2_int >= 106) {
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
