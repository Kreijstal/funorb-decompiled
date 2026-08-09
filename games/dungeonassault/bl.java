/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl {
    String field_f;
    String field_g;
    int field_m;
    static int[] field_n;
    static boolean field_k;
    static cn field_j;
    static Random field_i;
    nh field_q;
    String field_h;
    static String field_b;
    static cn[] field_d;
    static cn field_s;
    static int field_p;
    static cn field_o;
    static rj field_l;
    static cn field_e;
    static int field_c;
    static je field_r;
    static String field_a;
    static nh field_t;

    public static void d(byte param0) {
        field_o = null;
        field_b = null;
        field_s = null;
        field_n = null;
        field_i = null;
        field_e = null;
        field_r = null;
        field_a = null;
        field_t = null;
        field_j = null;
        if (param0 >= -127) {
            field_a = (String) null;
        }
        field_d = null;
        field_l = null;
    }

    final static void c(byte param0) {
        cn var19 = null;
        cn var2 = null;
        cn var3 = null;
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        cn var7 = null;
        int var8_int = 0;
        cn var8 = null;
        int var9_int = 0;
        cn var9 = null;
        cn var10 = null;
        int var11_int = 0;
        cn[] var11 = null;
        cn[] var20 = null;
        cn var14_ref_cn = null;
        cn var21 = null;
        cn var15_ref_cn = null;
        byte[] var14_ref_byte__ = null;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int[] var13 = null;
        cn discarded$1 = null;
        int var1_int = 0;
        int var10_int = 0;
        int var13_int = 0;
        cn var22 = null;
        int var15 = 0;
        int var14 = 0;
        int var18 = DungeonAssault.field_K;
        try {
            kk.field_l = ah.a(np.field_A, 200, "smallfont", "", hj.field_Z);
            db.field_v = ah.a(np.field_A, 200, "roman12bold", "", hj.field_Z);
            df.field_c = rc.a("", sb.field_a, "main_center", (byte) 71);
            dm.field_d = new cn[3];
            qi.field_f = new cn[3];
            for (var1_int = 0; var1_int < 3; var1_int++) {
                dm.field_d[var1_int] = rc.a("", sb.field_a, "main_left_0" + (var1_int - -1), (byte) 71);
            }
            for (var1_int = 0; (var1_int ^ -1) > -4; var1_int++) {
                qi.field_f[var1_int] = rc.a("", sb.field_a, "main_right_0" + (var1_int - -1), (byte) 71);
            }
            tm.field_p = oh.a(hj.field_Z, "", 11091, "menu_block");
            of.field_j = oh.a(hj.field_Z, "", 11091, "menu_button");
            le.field_f = oh.a(hj.field_Z, "", 11091, "menu_moss_top_left");
            e.field_j = oh.a(hj.field_Z, "", 11091, "menu_moss_top_right");
            wj.field_w = oh.a(hj.field_Z, "", 11091, "menu_moss_1");
            oj.field_a = oh.a(hj.field_Z, "", 11091, "menu_moss_2");
            oh.a(hj.field_Z, "", 11091, "menu_moss_bottom");
            am.field_a = oh.a(hj.field_Z, "", 11091, "menu_chain_frame");
            lf.field_x = oh.a(hj.field_Z, "", 11091, "menu_chain_ext");
            lf.field_n = oh.a(hj.field_Z, "", 11091, "menu_chain_line");
            hf.field_Ab = oh.a(hj.field_Z, "", 11091, "menu_chain");
            kh.field_m = kn.a(hj.field_Z, "", "cursor", -49);
            jg.field_c = new cn[kh.field_m.length];
            for (var1_int = 0; kh.field_m.length > var1_int; var1_int++) {
                jg.field_c[var1_int] = rb.a(8, kh.field_m[var1_int], 16711680, (byte) 124);
            }
            bf.field_d = oh.a(hj.field_Z, "", 11091, "smoke");
            bo.field_Kb = oh.a(hj.field_Z, "", 11091, "scrollbar_top");
            ud.field_y = oh.a(hj.field_Z, "", 11091, "scrollbar_bottom");
            qh.field_q = oh.a(hj.field_Z, "", 11091, "scrollbar_slider");
            tn.field_W = bo.field_Kb.d();
            tn.field_W.f();
            dc.field_x = ud.field_y.d();
            dc.field_x.f();
            ml.field_a = qh.field_q.d();
            ml.field_a.f();
            hm.field_q = dd.a((byte) -112, 4, bo.field_Kb);
            qf.field_f = dd.a((byte) -112, 4, ud.field_y);
            ji.field_G = dd.a((byte) -112, 4, qh.field_q);
            field_o = dd.a((byte) -112, 4, tn.field_W);
            go.field_S = dd.a((byte) -112, 4, dc.field_x);
            im.field_m = dd.a((byte) -112, 4, ml.field_a);
            var19 = oh.a(hj.field_Z, "", 11091, "cracked_bar");
            var2 = var19.d();
            var2.g();
            var3 = oh.a(hj.field_Z, "", 11091, "cracked_bar_endcap");
            var4 = var3.d();
            var4.g();
            ad.field_e = ph.a(hj.field_Z, "", "interface_crescent");
            oe.field_m = ph.a(hj.field_Z, "", "interface_dragon");
            pi.field_b = oh.a(hj.field_Z, "", 11091, "interface_lattice");
            jm.field_i = oh.a(hj.field_Z, "", 11091, "button_152");
            oh.a(hj.field_Z, "", 11091, "button_252");
            gh.field_g = kn.a(hj.field_Z, "", "strategy_buttons", -98);
            jh.c();
            var5 = var19.field_y;
            var6 = var19.field_v;
            for (var7_int = 0; var5 * var6 > var7_int; var7_int++) {
                var19.field_B[var7_int] = mp.a(var19.field_B[var7_int], -2147483648);
            }
            var7 = new cn(var5, var6);
            var7.e();
            gf.b(0, 0, var5, 2, 16416);
            gf.b(0, 2, var5, var6 - 4, 96);
            gf.b(0, var6 - 2, var5, 2, 49184);
            bk.field_e = new ph(var19, var7);
            var5 = var2.field_y;
            var6 = var2.field_v;
            for (var8_int = 0; var8_int < var5 * var6; var8_int++) {
                var2.field_B[var8_int] = mp.a(var2.field_B[var8_int], -2147483648);
            }
            var8 = new cn(var5, var6);
            var8.e();
            gf.b(0, 0, 2, var6, 4194336);
            gf.b(2, 0, var5 + -4, var6, 96);
            gf.b(-2 + var5, 0, 2, var6, 12582944);
            be.field_o = new ph(var2, var8);
            var6 = var3.field_v;
            var5 = var3.field_y;
            for (var9_int = 0; var6 * var5 > var9_int; var9_int++) {
                var3.field_B[var9_int] = mp.a(var3.field_B[var9_int], -2147483648);
            }
            var9 = new cn(var5, var6);
            var9.e();
            gf.b(0, 0, var5, 2, 16416);
            gf.b(0, 2, var5, -4 + var6, 96);
            gf.b(0, var6 - 2, var5, 2, 49184);
            for (var10_int = 0; var10_int < var5 * var6; var10_int++) {
                if (var3.field_B[var10_int] == -2147483648) {
                    var3.field_B[var10_int] = 0;
                    var9.field_B[var10_int] = 0;
                }
            }
            wh.field_g = new ph(var3, var9);
            var6 = var4.field_v;
            var5 = var4.field_y;
            for (var10_int = 0; var10_int < var6 * var5; var10_int++) {
                var4.field_B[var10_int] = mp.a(var4.field_B[var10_int], -2147483648);
            }
            var10 = new cn(var5, var6);
            var10.e();
            gf.b(0, 0, 2, var6, 4194336);
            gf.b(2, 0, var5 + -4, var6, 96);
            gf.b(var5 - 2, 0, 2, var6, 12582944);
            for (var11_int = 0; var11_int < var6 * var5; var11_int++) {
                if (!(-2147483648 != var4.field_B[var11_int])) {
                    var4.field_B[var11_int] = 0;
                    var10.field_B[var11_int] = 0;
                }
            }
            ac.field_w = new ph(var4, var10);
            ec.field_j = qa.a(15322, "achievements_large", "", hj.field_Z);
            md.a(97, f.field_a);
            md.a(98, lb.field_o);
            cf.field_f = new cn(32, 32);
            cf.field_f.e();
            lb.field_o.a(0, 0, 32, 32);
            jh.b();
            lb.field_o = null;
            nb.field_d = oh.a(hj.field_Z, "", 11091, "base");
            var11 = kn.a(hj.field_Z, "", "room_icons", -66);
            ja.field_b = kn.a(hj.field_Z, "", "room_icons_2d", -105);
            field_d = kn.a(hj.field_Z, "", "wall_icons_2d", -84);
            ri.field_d = kn.a(hj.field_Z, "", "walls", -127);
            mc.field_w = kn.a(hj.field_Z, "", "room_floors", -78);
            var20 = mc.field_w;
            for (var13_int = 0; var13_int < var20.length; var13_int++) {
                var14_ref_cn = var20[var13_int];
                var22 = var14_ref_cn;
                var22 = var14_ref_cn;
                var14_ref_cn.field_A = 18;
            }
            i.field_r = wk.a(var11, 0);
            var21 = oh.a(hj.field_Z, "", 11091, "room_monster");
            for (var13_int = 0; var13_int < 38; var13_int++) {
                if (null != gh.field_i[var13_int] && (gh.field_i[var13_int].field_g ^ -1) == -3) {
                    i.field_r[var13_int] = var21;
                }
            }
            i.field_r[0] = mc.field_w[0];
            i.field_r[2] = oh.a(hj.field_Z, "", 11091, "room_gold");
            i.field_r[4] = oh.a(hj.field_Z, "", 11091, "room_pit");
            i.field_r[5] = oh.a(hj.field_Z, "", 11091, "room_snakes");
            i.field_r[6] = oh.a(hj.field_Z, "", 11091, "room_nails");
            i.field_r[7] = oh.a(hj.field_Z, "", 11091, "room_hiddenpit");
            i.field_r[8] = oh.a(hj.field_Z, "", 11091, "room_teleport");
            i.field_r[9] = oh.a(hj.field_Z, "", 11091, "room_hiddennails");
            i.field_r[10] = oh.a(hj.field_Z, "", 11091, "room_pit");
            i.field_r[11] = oh.a(hj.field_Z, "", 11091, "room_crusher");
            i.field_r[12] = oh.a(hj.field_Z, "", 11091, "room_crossbow");
            i.field_r[14] = oh.a(hj.field_Z, "", 11091, "room_gas");
            i.field_r[36] = oh.a(hj.field_Z, "", 11091, "room_hallofglass");
            sn.field_c = kn.a(hj.field_Z, "", "torches", -86);
            rg.i(112);
            mf.field_b = kn.a(hj.field_Z, "", "doormasks", -49);
            jh.c();
            ua.field_b = new ph[6];
            for (var13_int = 0; (var13_int ^ -1) > -7; var13_int++) {
                var22 = ri.field_d[var13_int];
                for (var15 = 0; var22.field_B.length > var15; var15++) {
                    if (var22.field_B[var15] != 0) {
                        var22.field_B[var15] = mp.a(var22.field_B[var15], -2147483648);
                    }
                }
                var15_ref_cn = new cn(var22.field_y, var22.field_v);
                var15_ref_cn.e();
                var22.e(0, 0, (1 & var13_int) == 0 ? 3199008 : 13684768);
                ua.field_b[var13_int] = new ph(var22, var15_ref_cn);
            }
            jh.b();
            jc.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_baeserker");
            if (param0 > -21) {
                bl.a(false, -71, -26);
            }
            f.field_f = oh.a(hj.field_Z, "pieces", 11091, "piece_banshee");
            qm.field_m = oh.a(hj.field_Z, "pieces", 11091, "piece_bat");
            ia.field_R = oh.a(hj.field_Z, "pieces", 11091, "piece_beastman");
            ld.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_blackknight");
            ck.field_G = oh.a(hj.field_Z, "pieces", 11091, "piece_blade_construct");
            ll.field_q = oh.a(hj.field_Z, "pieces", 11091, "piece_darkelf");
            lb.field_v = oh.a(hj.field_Z, "pieces", 11091, "piece_demon");
            fp.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_dryhad");
            bj.field_F = oh.a(hj.field_Z, "pieces", 11091, "piece_dwarf");
            ie.field_i = oh.a(hj.field_Z, "pieces", 11091, "piece_enchantress");
            hl.field_h = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_cleaver");
            tn.field_I = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_club");
            jl.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_goblin_scout");
            bn.field_h = oh.a(hj.field_Z, "pieces", 11091, "piece_hellbeast");
            fl.field_j = oh.a(hj.field_Z, "pieces", 11091, "piece_imp");
            ub.field_j = oh.a(hj.field_Z, "pieces", 11091, "piece_merc");
            fn.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_minotaur");
            g.field_Ib = oh.a(hj.field_Z, "pieces", 11091, "piece_necromancer");
            df.field_e = oh.a(hj.field_Z, "pieces", 11091, "piece_northman");
            ef.field_e = oh.a(hj.field_Z, "pieces", 11091, "piece_ogre");
            kf.field_k = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_blademaster");
            lj.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_mace");
            le.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_ork_shaman");
            oo.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_pitdemon");
            cg.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_priest");
            lm.field_z = oh.a(hj.field_Z, "pieces", 11091, "piece_rat");
            ii.field_H = oh.a(hj.field_Z, "pieces", 11091, "piece_rotworm");
            sp.field_a = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_imp");
            qd.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_spawn");
            na.field_A = oh.a(hj.field_Z, "pieces", 11091, "piece_saurus_warrior");
            dk.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_skeleton");
            n.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_snake");
            hh.field_o = oh.a(hj.field_Z, "pieces", 11091, "piece_spectre");
            jf.field_f = oh.a(hj.field_Z, "pieces", 11091, "piece_spider");
            DungeonAssault.field_I = oh.a(hj.field_Z, "pieces", 11091, "piece_spy");
            m.field_c = oh.a(hj.field_Z, "pieces", 11091, "piece_thief");
            sp.field_d = oh.a(hj.field_Z, "pieces", 11091, "piece_troglodyte");
            gd.field_A = oh.a(hj.field_Z, "pieces", 11091, "piece_troll");
            h.field_E = oh.a(hj.field_Z, "pieces", 11091, "piece_vampire");
            in.field_D = oh.a(hj.field_Z, "pieces", 11091, "piece_witch");
            up.field_b = oh.a(hj.field_Z, "pieces", 11091, "piece_zealot");
            gd.field_E = oh.a(hj.field_Z, "", 11091, "stat_attack");
            jj.field_b = oh.a(hj.field_Z, "", 11091, "stat_defence");
            wl.field_d = oh.a(hj.field_Z, "", 11091, "stat_dodge");
            pk.field_o = oh.a(hj.field_Z, "", 11091, "stat_sneak");
            tb.field_c = oh.a(hj.field_Z, "", 11091, "stat_snare");
            kd.field_f = oh.a(hj.field_Z, "", 11091, "stat_detect");
            uj.field_c = oh.a(hj.field_Z, "", 11091, "stat_renown");
            ue.field_i = kn.a(hj.field_Z, "", "modifier_icons", -80);
            oh.a(hj.field_Z, "", 11091, "dead_icon");
            rj.field_k = oh.a(hj.field_Z, "", 11091, "youarehere");
            fj.field_d = kn.a(hj.field_Z, "", "spy_icon", -70);
            bf.field_e = kn.a(hj.field_Z, "", "sac_icon", -44);
            kh.field_r = oh.a(hj.field_Z, "", 11091, "revive_icon");
            hj.field_T = oh.a(hj.field_Z, "", 11091, "menu_locked");
            n.field_e = pa.a((byte) -103, hj.field_Z, "", "ingot");
            tb.field_a = n.field_e.d();
            fb.field_f = n.field_e.c();
            for (var13_int = 0; var13_int < 2; var13_int++) {
                if (!((1 & fb.field_f.field_g) == 0)) {
                    fb.field_f.field_g = fb.field_f.field_g + 1;
                }
                if ((fb.field_f.field_d & 1) != 0) {
                    fb.field_f.field_d = fb.field_f.field_d + 1;
                }
                fb.field_f.field_g = fb.field_f.field_g / 2;
                fb.field_f.field_d = fb.field_f.field_d / 2;
                var14_ref_byte__ = new byte[fb.field_f.field_d * fb.field_f.field_g];
                var15 = 0;
                for (var16 = 0; var16 < fb.field_f.field_e; var16++) {
                    for (var17 = 0; fb.field_f.field_h > var17; var17++) {
                        incrementValue$0 = var15;
                        var15++;
                        var14_ref_byte__[(fb.field_f.field_b + var17 >> -460841503) - -((var16 - -fb.field_f.field_a >> -1791004703) * fb.field_f.field_d)] = fb.field_f.field_j[incrementValue$0];
                    }
                }
                fb.field_f.field_j = var14_ref_byte__;
                fb.field_f.field_e = fb.field_f.field_g;
                fb.field_f.field_h = fb.field_f.field_d;
                fb.field_f.field_a = 0;
                fb.field_f.field_b = 0;
            }
            la.field_b.a(new q[]{fb.field_f, rf.a(10)}, new int[]{9, 10});
            fl.field_i = fn.a(2);
            wm.field_h = fl.field_i.b();
            dh.field_a = rj.a((byte) 127);
            sm.field_g = qp.a(true);
            fo.field_a = wo.a(5, 1, 6, 5, 16744448);
            qp.field_a = fo.field_a.d();
            qp.field_a.g();
            i.field_v = qp.field_a.d();
            i.field_v.g();
            qi.field_i = i.field_v.d();
            qi.field_i.g();
            qe.a(gd.field_E, jj.field_b, wl.field_d, pk.field_o, tb.field_c, kd.field_f);
            ao.field_n = oh.a(hj.field_Z, "", 11091, "scroll_top");
            rn.field_c = oh.a(hj.field_Z, "", 11091, "scroll_bottom");
            field_s = oh.a(hj.field_Z, "", 11091, "scroll_tile");
            li.field_l = new cn[9];
            li.field_l[0] = oh.a(hj.field_Z, "", 11091, "scroll_top_left");
            li.field_l[1] = oh.a(hj.field_Z, "", 11091, "scroll_top_centre");
            li.field_l[2] = oh.a(hj.field_Z, "", 11091, "scroll_top_right");
            li.field_l[3] = oh.a(hj.field_Z, "", 11091, "scroll_centre_left");
            li.field_l[4] = new cn(li.field_l[0].field_y, li.field_l[0].field_v);
            li.field_l[4].e();
            gf.b(0, 0, gf.field_i, gf.field_c, 13619075);
            k.field_h.a(true);
            li.field_l[5] = oh.a(hj.field_Z, "", 11091, "scroll_centre_right");
            li.field_l[6] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_left");
            li.field_l[7] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_centre");
            li.field_l[8] = oh.a(hj.field_Z, "", 11091, "scroll_bottom_right");
            kg.field_a = oh.a(hj.field_Z, "", 11091, "small_button");
            jn.field_n = new lg(327680, 1310720, 327680, 327680, 65536, 32768, 49152, 24576, 0, -4096, 100, 50);
            var13 = new int[256];
            for (var14 = 0; (var14 ^ -1) > -65; var14++) {
                var13[var14] = 262144 * var14;
            }
            for (var14 = 64; (var14 ^ -1) > -193; var14++) {
                var13[var14] = -32768 - -(512 * var14) + 16711680;
            }
            for (var14 = 192; (var14 ^ -1) > -257; var14++) {
                var13[var14] = 16776960 - -((-192 + var14) * 4);
            }
            jn.field_n.field_v.field_i = var13;
            fp.field_d = new tf(ne.field_c, tp.field_u, cm.field_M);
            na.field_w = new tf(ne.field_c, bn.field_q, cm.field_M);
            cg.field_a = new tf(ne.field_c, vd.field_c, cm.field_M);
            ih.field_x = new tf(ne.field_c, c.field_e.toUpperCase(), cm.field_M);
            bf.field_m = new tf(ne.field_c, gk.field_K, cm.field_M);
            kd.field_e = new tf[ie.field_j.length];
            for (var14 = 0; var14 < ie.field_j.length; var14++) {
                kd.field_e[var14] = new tf(db.field_v, ie.field_j[var14], cm.field_M);
            }
            discarded$1 = new cn(gf.field_i, gf.field_c);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bl.D(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        int var1;
        int var2;
        L0: {
          var2 = DungeonAssault.field_K;
          cd.field_b = false;
          ub.field_o = null;
          if (param0 == -97) {
            break L0;
          } else {
            field_p = -78;
            break L0;
          }
        }
        L1: {
          if (!qc.field_t) {
            var1 = hf.field_sb;
            if (0 >= var1) {
              a.field_n.j((byte) 79);
              hl.a(true);
              break L1;
            } else {
              if (var1 != 1) {
                ub.field_o = jk.a(new String[]{Integer.toString(var1)}, hm.field_j, 30496);
                ub.field_o = nf.a(new CharSequence[]{(CharSequence) ((Object) ub.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qa.field_b)}, (byte) 34);
                a.field_n.j((byte) 79);
                hl.a(true);
                break L1;
              } else {
                ub.field_o = fb.field_g;
                ub.field_o = nf.a(new CharSequence[]{(CharSequence) ((Object) ub.field_o), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qa.field_b)}, (byte) 34);
                a.field_n.j((byte) 79);
                hl.a(true);
                break L1;
              }
            }
          } else {
            a.field_n.o(4210752);
            break L1;
          }
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        pp stackIn_22_0 = null;
        pp stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        pp stackIn_25_0 = null;
        pp stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        pp stackIn_28_0 = null;
        pp stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int var1;
        int var2;
        L0: {
          if (hh.field_s != id.field_l) {
            break L0;
          } else {
            id.field_l = null;
            break L0;
          }
        }
        L1: {
          if (0 > ce.field_p) {
            break L1;
          } else {
            fieldTemp$0 = ce.field_p + 1;
            ce.field_p = ce.field_p + 1;
            if ((fieldTemp$0 ^ -1) > -51) {
              break L1;
            } else {
              jn.field_l = gk.field_L;
              ce.field_p = -1;
              ui.field_a = hc.field_b;
              break L1;
            }
          }
        }
        L2: {
          wi.field_kb = fa.a((byte) -127, ui.field_a, hc.field_b);
          if (gk.field_L == null) {
            stackIn_8_0 = 620;
            break L2;
          } else {
            stackIn_8_0 = hh.field_p - 100;
            break L2;
          }
        }
        L3: {
          vf.field_w = stackIn_8_0;
          if (null != gk.field_L) {
            stackIn_11_0 = ed.field_P - (wi.field_kb >> 1000989537);
            break L3;
          } else {
            stackIn_11_0 = 480 - wi.field_kb >> -453690911;
            break L3;
          }
        }
        L4: {
          qc.field_w = stackIn_11_0;
          if (-1 != ce.field_p) {
            L5: {
              if (jn.field_l == null) {
                stackIn_16_0 = 620;
                break L5;
              } else {
                stackIn_16_0 = -100 + hh.field_p;
                break L5;
              }
            }
            L6: {
              var1 = stackIn_16_0;
              if (jn.field_l != null) {
                stackIn_19_0 = -(wi.field_kb >> 685188897) + ed.field_P;
                break L6;
              } else {
                stackIn_19_0 = 480 - wi.field_kb >> 1388626049;
                break L6;
              }
            }
            var2 = stackIn_19_0;
            vf.field_w = fa.a((byte) -127, var1, vf.field_w);
            qc.field_w = fa.a((byte) -128, var2, qc.field_w);
            break L4;
          } else {
            break L4;
          }
        }
        L7: {
          ti.field_A.b(204 + vf.field_w, qc.field_w - 28, (byte) 4);
          tk.field_k.b(vf.field_w + -7, 20 + qc.field_w + wi.field_kb, (byte) 4);
          ec.field_n.b(7 + (vf.field_w + 200), qc.field_w + (wi.field_kb + 22), (byte) 4);
          stackIn_22_0 = ti.field_A;

          if (null == gk.field_L) {
            stackIn_23_0 = (pp) ((Object) stackIn_22_0);
            stackIn_23_1 = 0;
            break L7;
          } else {
            stackIn_23_0 = (pp) ((Object) stackIn_22_0);
            stackIn_23_1 = 1;
            break L7;
          }
        }
        L8: {
          stackIn_23_0.field_w = stackIn_23_1 != 0;
          stackIn_25_0 = tk.field_k;

          if (param0 >= fc.field_d) {
            stackIn_26_0 = (pp) ((Object) stackIn_25_0);
            stackIn_26_1 = 0;
            break L8;
          } else {
            stackIn_26_0 = (pp) ((Object) stackIn_25_0);
            stackIn_26_1 = 1;
            break L8;
          }
        }
        L9: {
          stackIn_26_0.field_w = stackIn_26_1 != 0;
          stackIn_28_0 = ec.field_n;

          if (fc.field_d >= uo.field_f.length + -1) {
            stackIn_29_0 = (pp) ((Object) stackIn_28_0);
            stackIn_29_1 = 0;
            break L9;
          } else {
            stackIn_29_0 = (pp) ((Object) stackIn_28_0);
            stackIn_29_1 = 1;
            break L9;
          }
        }
        stackIn_29_0.field_w = stackIn_29_1 != 0;
    }

    final static void a(byte param0) {
        ac[] stackIn_23_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ac[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var4 = 0;
        ac[] var5 = null;
        int var6 = 0;
        h[] var7 = null;
        h var8 = null;
        ac var9 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = hp.field_b;
            var2 = 0;
            L1: while (true) {
              if (var7.length <= var2) {
                var5 = gh.field_i;
                var1 = var5;
                var6 = 0;
                var2 = var6;
                if (param0 > 1) {
                  stackIn_23_0 = (ac[]) (var1);
                  L2: while (true) {
                    if (stackIn_23_0.length <= var6) {
                      System.gc();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        var9 = var5[var6];
                        if (var9 != null) {
                          L4: {
                            if (var9.field_d == null) {
                              break L4;
                            } else {
                              var9.field_d.a((byte) -19);
                              break L4;
                            }
                          }
                          L5: {
                            if (var9.field_u == null) {
                              break L5;
                            } else {
                              var9.field_u.a((byte) -19);
                              break L5;
                            }
                          }
                          L6: {
                            if (var9.field_m != null) {
                              var9.field_m.a((byte) -19);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var6++;
                          break L3;
                        } else {
                          var6++;
                          break L3;
                        }
                      }
                      stackIn_23_0 = (ac[]) (var5);
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L7: {
                  var8 = var7[var2];
                  if (var8 != null) {
                    L8: {
                      if (var8.field_e != null) {
                        var8.field_e.a((byte) -19);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var8.field_u != null) {
                        var8.field_u.a((byte) -19);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (null == var8.field_t) {
                        break L10;
                      } else {
                        var8.field_t.a((byte) -19);
                        break L10;
                      }
                    }
                    L11: {
                      if (null == var8.field_v) {
                        break L11;
                      } else {
                        var8.field_v.a((byte) -19);
                        break L11;
                      }
                    }
                    if (null != var8.field_l) {
                      var8.field_l.a((byte) -19);
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "bl.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static cn a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        cn var6 = new cn(param2, param2);
        cn var3 = var6;
        for (var4 = 0; var3.field_B.length > var4; var4++) {
            var6.field_B[var4] = param1;
        }
        if (param0) {
            return (cn) null;
        }
        return var3;
    }

    final static ai a(boolean param0, ec param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ai var4 = null;
        ec var5 = null;
        ai stackIn_5_0 = null;
        ec stackIn_5_1 = null;
        ai stackIn_6_0 = null;
        ec stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        ai stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var5 = (ec) null;
                bl.a(false, (ec) null, true);
                break L1;
              }
            }
            L2: {
              var3_int = param1.c(true);
              var4 = new ai(var3_int);
              var4.field_p = param1.c(true);
              var4.field_g = param1.c(true);
              var4.field_r = param1.c(true);
              var4.field_q = param1.c(true);
              if (param0) {
                break L2;
              } else {
                L3: {
                  var4.field_j = param1.c(true);
                  var4.field_l = param1.c(true);
                  stackIn_5_0 = (ai) (var4);

                  stackIn_5_1 = (ec) (param1);

                  if (param2) {
                    stackIn_6_0 = (ai) ((Object) stackIn_5_0);
                    stackIn_6_1 = (ec) ((Object) stackIn_5_1);
                    stackIn_6_2 = 0;
                    break L3;
                  } else {
                    stackIn_6_0 = (ai) ((Object) stackIn_5_0);
                    stackIn_6_1 = (ec) ((Object) stackIn_5_1);
                    stackIn_6_2 = 1;
                    break L3;
                  }
                }
                stackIn_6_0.field_s = ((ec) (Object) stackIn_6_1).c(stackIn_6_2 != 0);
                var4.field_o = param1.c(true);
                break L2;
              }
            }
            stackIn_8_0 = (ai) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_n = new int[]{6, 11, 12, 13, 7};
        field_i = new Random();
        field_b = "<col=FF0000>Free players are limited to a maximum of 5 Orbs of this type.<%0></col>";
        field_c = 0;
        field_a = "Next";
    }
}
