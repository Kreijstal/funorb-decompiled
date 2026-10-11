/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public final class wizardrun extends u {
    private static o[] field_D;
    private int field_Q;
    static byte[] field_O;
    private int field_I;
    private int field_M;
    private int field_R;
    private int field_S;
    private int field_N;
    static int field_E;
    static String field_F;
    static java.awt.Canvas field_G;
    static volatile int field_T;
    private boolean field_J;
    private int field_K;
    private boolean field_P;
    private boolean field_L;
    public static int field_H;

    private final void a(boolean param0, int param1) {
        int var6_int = 0;
        int var8 = 0;
        o var4;
        int var5_int;
        Object var5;
        Object var6;
        int var7_int;
        ob var7;
        int var9;
        i var10;
        ue var11;
        o var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        ue var18;
        int var5_intLifetime1;
        int var7_intLifetime1;
        var9 = field_H;
        ab.a((byte) -69);
        if (param0) {
          ac.a(0, gi.field_c);
        }
        if (mi.field_E.b(17820) &&
          mi.field_E.d(-56)) {
          if (mh.field_jb.b(17820) &&
            mh.field_jb.d(param1 ^ -94)) {
            if (mi.field_y.b(17820) &&
              mi.field_y.d(-110)) {
              if (jl.field_u.b(17820) &&
                jl.field_u.d(-85)) {
                if (eg.field_u.b(param1 ^ 17842) &&
                  eg.field_u.d(-67)) {
                  if (md.field_b.b(17820) &&
                    md.field_b.d(83)) {
                    if (bb.field_h.b(17820) &&
                      bb.field_h.a((byte) 29, "basic")) {
                      if (bc.field_a.b(param1 ^ 17842) &&
                        bc.field_a.d(-85)) {
                        ok.a(nh.field_o, 100.0f, 0);
                        if (!param0) {
                          return;
                        }
                        cf.a((byte) 79);
                        this.f(-98);
                        a.field_a = ti.a(800863586, "", mi.field_E, "b12", bc.field_a);
                        hj.field_g = ti.a(800863586, "", mi.field_E, "wizfont", bc.field_a);
                        jj.field_b = ti.a(param1 + 800863540, "", mi.field_E, "wizfont2", bc.field_a);
                        lk.field_b = new o[16];
                        bc.field_a = null;
                        field_D = pe.a("", mi.field_E, "numbers", param1 + 45);
                        jj.field_a = pe.a("", mi.field_E, "gems", 114);
                        oc.field_c = pe.a("", mi.field_E, "playerintro", 117);
                        lg.field_a = pe.a("", mi.field_E, "highwizard", 100);
                        sh.field_b = vg.a(15, "benefits", mi.field_E, "");
                        fa.field_b = pe.a("", mi.field_E, "screenshots", 87);
                        var12 = vg.a(15, "gamelogo", mi.field_E, "");
                        var4 = vg.a(15, "mbstar", mi.field_E, "");
                        uc.a(-1, vk.field_u, sh.field_b);
                        pk.a(var12, false);
                        tk.a(0, var4, var4.field_x, 0, 2500, 0, 2, var4.field_s, 0);
                        ui.a(true, fa.field_b);
                        ck.a((java.applet.Applet) (this), l.field_O, 0, 34, 16777215, 255);
                        md.field_c = null;
                        oe.field_a = vg.a(param1 - 31, "paused", mi.field_E, "");
                        ok.field_d[0] = vg.a(15, "selstar", mi.field_E, "");
                        ok.field_d[1] = vg.a(15, "selstar2", mi.field_E, "");
                        ok.field_d[2] = vg.a(15, "selstar3", mi.field_E, "");
                        vg.a(15, "gameover", mi.field_E, "");
                        mg.field_s = vg.a(15, "bosshealth2", mi.field_E, "");
                        ve.field_c = pe.a("", mi.field_E, "wizard", 95);
                        ra.field_m = pe.a("", mi.field_E, "wizardnohat", param1 + 42);
                        rk.field_m = vg.a(param1 ^ 33, "explosion", mi.field_E, "");
                        ui.field_a = pe.a("", mi.field_E, "achievements", 108);
                        sk.field_z = vg.a(15, "unachieved", bb.field_h, "basic");
                        wc.field_f = vg.a(15, "orbcoin", bb.field_h, "basic");
                        fa.field_c = vg.a(15, "locked", bb.field_h, "basic");
                        kk.field_Bb = new o[5];
                        kk.field_Bb[0] = vg.a(15, "highscore", mi.field_E, "");
                        kk.field_Bb[1] = vg.a(15, "highscorebar", mi.field_E, "");
                        kk.field_Bb[2] = vg.a(param1 - 31, "stage", mi.field_E, "");
                        kk.field_Bb[3] = vg.a(sg.a(param1, 33), "score", mi.field_E, "");
                        kk.field_Bb[4] = field_D[10];
                        pd.field_H = pe.a("", mi.field_E, "frame", 91);
                        qc.field_E = pe.a("", mi.field_E, "buttonframe", 119);
                        ob.field_c = new o(32, 32);
                        ob.field_c.b();
                        ve.field_c[6].c(-18, -18);
                        hl.field_b.b(68);
                        ec.field_b = new o(64, 64);
                        ec.field_b.b();
                        ed.a(32, 32, 30, 16777215);
                        hl.field_b.b(param1 + 17);
                        gf.field_bb = ve.field_c[1];
                        ld.field_d = vg.a(param1 - 31, "selector", mi.field_E, "");
                        u.field_x = vg.a(param1 - 31, "bosshealth", mi.field_E, "");
                        jl.field_w = vg.a(param1 - 31, "title", mi.field_E, "");
                        wh.field_d = vg.a(15, "highscorescreen", mi.field_E, "");
                        l.field_M = vg.a(param1 ^ 33, "achievementscreen", mi.field_E, "");
                        bk.field_b = vg.a(param1 ^ 33, "controlscreen", mi.field_E, "");
                        bk.field_b.b();
                        var5_int = param1;
                        var13 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 112, og.field_P);
                        this.b(param1 ^ -12884, var13, 15583488, jj.field_b.b(var13) / 2 + 165, 180 + var5_int);
                        var14 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 49, qj.field_a);
                        this.b(-12926, var14, 15583488, jj.field_b.b(var14) / 2 + 165, var5_int * 2 + 180);
                        var15 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 94, kj.field_e);
                        this.b(-12926, var15, 15583488, 165 + jj.field_b.b(var15) / 2, 180 + 3 * var5_int);
                        var16 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 124, oi.field_d);
                        this.b(-12926, var16, 15583488, jj.field_b.b(var16) / 2 + 165, -15 + var5_int * 4 + 180);
                        var17 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 97, sk.field_C);
                        this.b(-12926, var17, 15583488, jj.field_b.b(var17) / 2 + 165, 5 * var5_int + 180);
                        hl.field_b.b(106);
                        kb.field_jb = vg.a(15, "optionscreen", mi.field_E, "");
                        we.field_b = vg.a(param1 - 31, "endscreen", mi.field_E, "");
                        il.a(240, jj.field_b, pd.field_H, (byte) -113, pd.field_H, 16777215, 16777088, 12, 12, 16776960, 320, 12, pd.field_H, 12, 12);
                        ug.a((byte) -94);
                        fl.field_T = new byte[6][6][];
                        mi.field_E = null;
                        for (var5_intLifetime1 = 0; var5_intLifetime1 <= 5; var5_intLifetime1++) {
                          for (var6_int = 0; var6_int <= 5; var6_int++) {
                            fl.field_T[var5_intLifetime1][var6_int] = mh.field_jb.a(52, "level" + var5_intLifetime1 + var6_int + ".dat", "");
                          }
                        }
                        mh.field_jb = null;
                        var10 = new i(22050, c.field_l);
                        si.field_j[0] = b.a(mi.field_y, "", "spell").b().a(var10);
                        si.field_j[1] = b.a(mi.field_y, "", "spell2").b().a(var10);
                        si.field_j[2] = b.a(mi.field_y, "", "bubblefire").b().a(var10);
                        si.field_j[3] = b.a(mi.field_y, "", "jump").b().a(var10);
                        si.field_j[4] = b.a(mi.field_y, "", "land").b().a(var10);
                        si.field_j[5] = b.a(mi.field_y, "", "bigthud").b().a(var10);
                        si.field_j[6] = b.a(mi.field_y, "", "bubblepop").b().a(var10);
                        si.field_j[7] = b.a(mi.field_y, "", "gotgem2").b().a(var10);
                        si.field_j[10] = b.a(mi.field_y, "", "enemyhit").b().a(var10);
                        si.field_j[11] = b.a(mi.field_y, "", "shield").b().a(var10);
                        si.field_j[12] = b.a(mi.field_y, "", "slimesplit").b().a(var10);
                        si.field_j[13] = b.a(mi.field_y, "", "zapshot").b().a(var10);
                        si.field_j[14] = b.a(mi.field_y, "", "fireball").b().a(var10);
                        si.field_j[15] = b.a(mi.field_y, "", "alljump").b().a(var10);
                        si.field_j[16] = b.a(mi.field_y, "", "stars").b().a(var10);
                        si.field_j[23] = b.a(mi.field_y, "", "spell_higher").b().a(var10);
                        si.field_j[24] = b.a(mi.field_y, "", "spell_highest").b().a(var10);
                        nl.field_q[0] = b.a(mi.field_y, "", "intro_bird_squawk").b().a(var10);
                        nl.field_q[1] = b.a(mi.field_y, "", "end_cage_release").b().a(var10);
                        nl.field_q[2] = b.a(mi.field_y, "", "end_cage_smash").b().a(var10);
                        nl.field_q[3] = b.a(mi.field_y, "", "rat_death").b().a(var10);
                        nl.field_q[4] = b.a(mi.field_y, "", "wasp_death").b().a(var10);
                        nl.field_q[5] = b.a(mi.field_y, "", "spider_death").b().a(var10);
                        nl.field_q[6] = b.a(mi.field_y, "", "spider_boss_land").b().a(var10);
                        nl.field_q[7] = b.a(mi.field_y, "", "spider_boss_death").b().a(var10);
                        nl.field_q[8] = b.a(mi.field_y, "", "small_crab_death").b().a(var10);
                        nl.field_q[9] = b.a(mi.field_y, "", "crab_death").b().a(var10);
                        nl.field_q[10] = b.a(mi.field_y, "", "seagull_death").b().a(var10);
                        nl.field_q[11] = b.a(mi.field_y, "", "cannibal_death").b().a(var10);
                        nl.field_q[15] = b.a(mi.field_y, "", "green_bird_death").b().a(var10);
                        nl.field_q[16] = b.a(mi.field_y, "", "ghost_death").b().a(var10);
                        nl.field_q[17] = b.a(mi.field_y, "", "ghost_spit").b().a(var10);
                        nl.field_q[18] = b.a(mi.field_y, "", "skeleton_cannon_fire").b().a(var10);
                        nl.field_q[22] = b.a(mi.field_y, "", "venus_death").b().a(var10);
                        nl.field_q[23] = b.a(mi.field_y, "", "bat_death").b().a(var10);
                        nl.field_q[25] = b.a(mi.field_y, "", "ogre_boss_rock").b().a(var10);
                        nl.field_q[32] = b.a(mi.field_y, "", "fireimp_death").b().a(var10);
                        nl.field_q[35] = b.a(mi.field_y, "", "harpie_death").b().a(var10);
                        nl.field_q[36] = b.a(mi.field_y, "", "dark_knight_attack").b().a(var10);
                        nl.field_q[37] = b.a(mi.field_y, "", "dark_knight_death").b().a(var10);
                        si.field_j[8] = nc.a(jl.field_u, "", "wizard_ooh").b().a(var10);
                        si.field_j[9] = nc.a(jl.field_u, "", "enemyeek").b().a(var10);
                        si.field_j[17] = nc.a(jl.field_u, "", "lizard_boss").b().a(var10);
                        si.field_j[18] = nc.a(jl.field_u, "", "hissing").b().a(var10);
                        si.field_j[19] = nc.a(jl.field_u, "", "vampire_laugh").b().a(var10);
                        si.field_j[20] = nc.a(jl.field_u, "", "ogre_boss").b().a(var10);
                        si.field_j[21] = nc.a(jl.field_u, "", "dragon_boss").b().a(var10);
                        si.field_j[22] = nc.a(jl.field_u, "", "demon_boss").b().a(var10);
                        si.field_j[25] = nc.a(jl.field_u, "", "spiderhit").b().a(var10);
                        si.field_j[26] = nc.a(jl.field_u, "", "ogrehit").b().a(var10);
                        si.field_j[27] = nc.a(jl.field_u, "", "dragonhit").b().a(var10);
                        si.field_j[28] = nc.a(jl.field_u, "", "demonhit").b().a(var10);
                        si.field_j[29] = nc.a(jl.field_u, "", "vampirehit").b().a(var10);
                        si.field_j[30] = nc.a(jl.field_u, "", "spiderboss").b().a(var10);
                        nl.field_q[13] = nc.a(jl.field_u, "", "voodoo_boss_death").b().a(var10);
                        nl.field_q[19] = nc.a(jl.field_u, "", "skeleton_cannon_death").b().a(var10);
                        nl.field_q[21] = nc.a(jl.field_u, "", "pirate_boss_death").b().a(var10);
                        nl.field_q[26] = nc.a(jl.field_u, "", "ogre_boss_death").b().a(var10);
                        nl.field_q[27] = nc.a(jl.field_u, "", "cyclops_death").b().a(var10);
                        nl.field_q[29] = nc.a(jl.field_u, "", "yeti_death").b().a(var10);
                        nl.field_q[30] = nc.a(jl.field_u, "", "dragon_death").b().a(var10);
                        nl.field_q[31] = nc.a(jl.field_u, "", "ice_dragon_boss_death").b().a(var10);
                        nl.field_q[33] = nc.a(jl.field_u, "", "city_guard_death").b().a(var10);
                        nl.field_q[34] = nc.a(jl.field_u, "", "executioner_death").b().a(var10);
                        nl.field_q[12] = nc.a(jl.field_u, "", "voodoo_boss_attack").b().a(var10);
                        nl.field_q[14] = nc.a(jl.field_u, "", "skeleton_death").b().a(var10);
                        nl.field_q[24] = nc.a(jl.field_u, "", "goblin_death").b().a(var10);
                        nl.field_q[28] = nc.a(jl.field_u, "", "horned_demon_death").b().a(var10);
                        var5 = null;
                        pj.field_G = ji.a(md.field_b, "", "wizard_run_forest");
                        ka.field_l = ji.a(md.field_b, "", "wizard_run_swamp");
                        ml.field_u = ji.a(md.field_b, "", "wizard_run_caves");
                        ne.field_b = ji.a(md.field_b, "", "wizard_run_mountains");
                        va.field_j = ji.a(md.field_b, "", "wizard_run_volcano");
                        ec.field_d = ji.a(md.field_b, "", "wizard_run_lair");
                        fb.field_a = ji.a(md.field_b, "", "wizard_run_boss");
                        kh.field_j = ji.a(md.field_b, "", "wizard_run_intro");
                        bh.field_e = ji.a(md.field_b, "", "wizard_run_cutscene");
                        qj.field_e = ji.a(md.field_b, "", "wizard_run_endscene");
                        md.field_b = null;
                        sl.field_q = new ji[7];
                        sl.field_q[3] = ne.field_b;
                        sl.field_q[5] = ec.field_d;
                        sl.field_q[4] = va.field_j;
                        sl.field_q[2] = ml.field_u;
                        sl.field_q[6] = kh.field_j;
                        sl.field_q[0] = pj.field_G;
                        sl.field_q[1] = ka.field_l;
                        var11 = new ue(mi.field_y, jl.field_u);
                        var18 = var11;
                        mi.field_y = null;
                        jl.field_u = null;
                        for (var7_int = 0; 7 > var7_int; var7_int++) {
                          mi.field_D.a(eg.field_u, -1, var11, sl.field_q[var7_int], 0);
                        }
                        mi.field_D.a(eg.field_u, -1, var18, bh.field_e, 0);
                        mi.field_D.a(eg.field_u, -1, var18, qj.field_e, 0);
                        mi.field_D.a(eg.field_u, param1 ^ -47, var18, fb.field_a, 0);
                        mi.field_D.b(true);
                        eg.field_u = null;
                        var6 = null;
                        for (var7_intLifetime1 = 0; var7_intLifetime1 < 1000; var7_intLifetime1++) {
                          ii.field_e[var7_intLifetime1] = new eg();
                        }
                        wi.field_K = 1;
                        cd.field_e = 500;
                        var7 = new ob();
                        fi.field_x = 0;
                        var7.field_a = 1;
                        var7.field_b = 3;
                        tj.field_I = 0;
                        sc.field_m = new jk();
                        uk.a((byte) 91, 50);
                        vk.a((byte) -74);
                        ga.field_e = sl.field_q[6];
                        mi.field_D.a(-1, hc.field_o);
                        if (tl.field_e) {
                          mi.field_D.a(true, param1 ^ -72, ga.field_e);
                        }
                        for (var8 = 0; var8 < 300; var8++) {
                          tc.field_l.field_j[var8] = 0;
                          tc.field_l.field_f[var8] = 0;
                          tc.field_l.field_d[var8] = false;
                          tc.field_l.field_a[var8] = 0;
                        }
                        th.field_h = true;
                        sf.field_h = 0;
                        wg.field_e = jl.field_w;
                        md.field_a = new int[100][3];
                        jj.b(0);
                        return;
                      }
                      ok.a(de.a(-40, mj.field_d, bc.field_a, hj.field_d), 95.0f, 0);
                      return;
                    }
                    ok.a(oh.a(qb.field_q, tk.field_e, bb.field_h, param1 ^ -90, "basic"), 85.0f, param1 ^ 46);
                    return;
                  }
                  ok.a(de.a(-40, ej.field_e, md.field_b, lj.field_d), 80.0f, 0);
                  return;
                }
                ok.a(de.a(-40, pa.field_d, eg.field_u, jf.field_g), 70.0f, 0);
                return;
              }
              ok.a(de.a(-40, ge.field_i, jl.field_u, il.field_d), 60.0f, 0);
              return;
            }
            ok.a(de.a(-40, ge.field_i, mi.field_y, il.field_d), 50.0f, param1 - 46);
            return;
          }
          ok.a(de.a(-40, qk.field_e, mh.field_jb, aa.field_gb), 40.0f, 0);
          return;
        }
        ok.a(de.a(-40, tk.field_e, mi.field_E, qb.field_q), 30.0f, param1 ^ 46);
    }

    private final void s(int param0) {
        boolean stackIn_6_1 = false;
        if (5 < ql.field_c) {
          hi.field_c = hi.field_c - ql.field_c;
          me.field_f = me.field_f - 5;
          ql.field_c = 5;
        }
        da.a(7775, 64 * sg.field_f + (ql.field_c + 6 * qh.field_l));
        rc.field_a = 0;
        sf.field_h = 2;
        stackIn_6_1 = !(0 >= hl.field_a);
        this.field_J = stackIn_6_1;
        rf.field_b = 0;
        tc.field_j = false;
        wg.field_e = wh.field_d;
        if (0 < qf.field_l) {
          sf.field_h = 5;
          wg.field_e = l.field_M;
        }
        ga.field_e = pj.field_G;
        if (param0 != 208) {
          return;
        }
        hg.field_a = 500;
        if (e.a(-96)) {
          sf.field_h = 6;
        }
        if (sg.field_f == 0 &&
          qf.field_l == 0 &&
          ke.field_u.f(8192)) {
          sf.field_h = 0;
          this.field_J = true;
          hi.field_a = -350;
        }
        if (!e.a(-90)) {
          hi.field_c = hi.field_c - (ql.field_c - 6);
          wg.field_b = wg.field_b - (sg.field_f << 6);
          me.field_f = me.field_f + (qh.field_l * 6 + 6);
          qh.field_l = -1;
          sg.field_f = 0;
          ql.field_c = 6;
        }
        hi.field_c = hi.field_c + qh.field_g;
        wg.field_b = wg.field_b - 5;
        od.field_k = 0;
        ga.field_e = sl.field_q[6];
        wi.field_K = 1;
        cd.field_e = 500;
        qh.field_g = 5;
        if (tl.field_e) {
          mi.field_D.a(true, param0 - 314, ga.field_e);
        }
        tj.field_I = 255;
        hi.field_a = -350;
    }

    final void i(int param0) {
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_23_1 = 0;
        boolean stackIn_24_2 = false;
        int var2;
        int var3;
        int var4;
        dc var5;
        pg var6;
        int var2Lifetime1;
        var4 = field_H;
        wh.field_k.e();
        pc.field_d.e();
        if (null != ki.field_E &&
          ki.field_E.field_b) {
          di.a((byte) 60);
          bb.b((byte) -100);
        }
        stackIn_6_1 = -4114;
        stackIn_7_2 = (null != ki.field_E);
        this.c(stackIn_6_1, stackIn_7_2);
        if (f.field_c) {
          this.u(-51);
          f.field_c = false;
        }
        if (ta.a((byte) 60)) {
          this.d((byte) -122);
          if (!th.field_h &&
            ph.a((byte) 123)) {
            this.a(false, 46);
          }
          if (ta.a((byte) 60)) {
            return;
          }
        }
        if (th.field_h) {
          if (!cg.c((byte) 54)) {
            hc.c(true);
          } else {
            if (oa.a(-25231)) {
              var2 = pg.d((byte) -48);
              if (var2 == 2) {
                di.a((byte) 60);
              } else {
                if (3 != var2) {
                  if (4 == var2) {
                    gf.h((byte) 107);
                  }
                } else {
                  pd.a(true, false);
                }
              }
            } else {
              if (!dg.b(-76)) {
                this.t(640);
              } else {
                stackIn_23_1 = 39;
                stackIn_24_2 = (null != ki.field_E);
                var2 = this.a((byte) stackIn_23_1, stackIn_24_2);
                if (var2 == 1 ||
                  var2 == 2) {
                  di.a((byte) 60);
                  if (var2 == 2) {
                    bc.a(127, jg.f(1));
                  }
                }
              }
            }
          }
        } else {
          this.a(true, 46);
        }
        if (!e.a(-81)) {
          while (true) {
            var6 = (pg) (ie.field_l.b(114));
            if (var6 != null) {
              hc.a(var6, false, 4);
              continue;
            }
            break;
          }
          while (true) {
            var5 = (dc) (ke.field_u.b(109));
            if (var5 == null) {
              break;
            }
            ml.a(var5, 5, -1);
          }
        }
        var2Lifetime1 = 40 / ((-56 - param0) / 41);
        while (ub.a(0, kc.field_G)) {
          this.b(true);
        }
        id.a((byte) -67, 0);
        if (h.b(true)) {
          var3 = this.o(-10618);
          if (var3 == 2) {
            ci.a((byte) -124);
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        boolean stackIn_51_0 = false;
        boolean stackIn_56_0 = false;
        int stackIn_86_0 = 0;
        int stackIn_87_1 = 0;
        boolean stackIn_99_0 = false;
        int stackIn_108_0 = 0;
        int stackIn_109_1 = 0;
        int var4;
        int var5;
        int var6;
        var6 = field_H;
        if (pa.field_c > 0) {
          return;
        }
        if (param1 == 2 &&
          param2 != 2 &&
          param2 != 3) {
          param1 = 0;
        }
        L1: {
          var4 = 43 % ((-44 - param0) / 58);
          var5 = param2;
          if (var5 != 0) {
            if (1 != var5) {
              if (var5 != 2) {
                if (3 != var5) {
                  switch (var5) {
                    case 4:
                      if (param1 != 0) {
                        break L1;
                      }
                      if (null == ki.field_E) {
                        pd.a(false, false);
                        break L1;
                      }
                      di.a((byte) 60);
                      break L1;
                    case 5:
                      if (param1 != 0) {
                        break L1;
                      }
                      th.field_i = 3;
                      pa.field_c = 32;
                      if (!pk.field_s) {
                        break L1;
                      }
                      tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                      break L1;
                    case 6:
                      if (param1 != 0) {
                        break L1;
                      }
                      th.field_i = 4;
                      pa.field_c = 32;
                      if (!pk.field_s) {
                        break L1;
                      }
                      tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                      break L1;
                    default:
                      break L1;
                    case 7:
                      if (param1 != 0) {
                        break L1;
                      }
                      if (pk.field_s) {
                        tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                      }
                      bc.a(124, jg.f(1));
                      break L1;
                  }
                }
                if (-1 == param1) {
                  param1 = -25;
                }
                if (param1 == 1) {
                  param1 = 25;
                }
                if (param1 == -3) {
                  param1 = -200;
                }
                if (3 == param1) {
                  param1 = 200;
                }
                boolean decompiledFrameRemainder1 = true;
                if (param1 == 2) {
                  if (pg.field_n >= 144 &&
                    tl.field_e) {
                    param1 = 0;
                    if (pg.field_n < (168 + 108 * hc.field_o / 200)) {
                      param1 = 200 * (pg.field_n - (hc.field_o * 108 / 200 + 172)) / 108;
                    }
                    if (!(pg.field_n <= 172 + 108 * hc.field_o / 200 + 4)) {
                      param1 = 200 * (-(hc.field_o * 108 / 200) - 172 + pg.field_n) / 108;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    stackIn_99_0 = !(tl.field_e);
                    if (!stackIn_99_0) {
                      tl.field_e = false;
                      mi.field_D.d(-89);
                    } else {
                      tl.field_e = true;
                      mi.field_D.a(true, -93, ga.field_e);
                    }
                    param1 = 0;
                  }
                } else {
                  if (param1 == 0) {
                    stackIn_86_0 = 0;
                    if (tl.field_e) {
                      stackIn_87_1 = 0;
                    } else {
                      stackIn_87_1 = 1;
                    }
                    if (stackIn_86_0 != stackIn_87_1) {
                      tl.field_e = true;
                      mi.field_D.a(true, -85, ga.field_e);
                    } else {
                      tl.field_e = false;
                      mi.field_D.d(-38);
                    }
                  }
                }
                if (param1 <= -1) {
                  hc.field_o = hc.field_o + param1;
                  if (hc.field_o > 0) {
                    mi.field_D.a(-1, hc.field_o);
                  } else {
                    hc.field_o = 0;
                    stackIn_108_0 = 0;
                    if (tl.field_e) {
                      stackIn_109_1 = 0;
                    } else {
                      stackIn_109_1 = 1;
                    }
                    if (stackIn_108_0 == stackIn_109_1) {
                      tl.field_e = false;
                      mi.field_D.d(-104);
                    }
                  }
                }
                if (param1 >= 1) {
                  hc.field_o = hc.field_o + param1;
                  if (hc.field_o > 200) {
                    hc.field_o = 200;
                  }
                  mi.field_D.a(-1, hc.field_o);
                  if (!tl.field_e) {
                    tl.field_e = true;
                    mi.field_D.a(true, -120, ga.field_e);
                  }
                }
                if (pk.field_s) {
                  if (nl.field_y <= 0) {
                    tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                    nl.field_y = 25;
                  }
                  return;
                }
              } else {
                if (param1 == -1) {
                  param1 = -13;
                }
                if (param1 == 1) {
                  param1 = 13;
                }
                if (param1 == -3) {
                  param1 = -104;
                }
                if (3 == param1) {
                  param1 = 104;
                }
                boolean decompiledFrameRemainder0 = true;
                if (param1 != 2) {
                  if (param1 == 0) {
                    stackIn_56_0 = !(pk.field_s);
                    pk.field_s = stackIn_56_0;
                  }
                } else {
                  if (pg.field_n >= 144 &&
                    pk.field_s) {
                    param1 = 0;
                    if (pg.field_n < (-1 + (172 + ee.field_p * 108 / 104))) {
                      param1 = (-(108 * ee.field_p / 104) - 172 + pg.field_n) * 104 / 108;
                    }
                    if (!(108 * ee.field_p / 104 + 172 + 1 >= pg.field_n)) {
                      param1 = 104 * (pg.field_n - (172 + ee.field_p * 108 / 104)) / 108;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param1 = 0;
                    stackIn_51_0 = !(pk.field_s);
                    pk.field_s = stackIn_51_0;
                  }
                }
                if (-1 >= param1) {
                  ee.field_p = ee.field_p + param1;
                  if (ee.field_p <= 0) {
                    pk.field_s = false;
                    ee.field_p = 0;
                  }
                }
                if (param1 >= 1) {
                  ee.field_p = ee.field_p + param1;
                  pk.field_s = true;
                  if (ee.field_p > 104) {
                    ee.field_p = 104;
                  }
                }
                if (pk.field_s) {
                  if (0 >= nl.field_y) {
                    tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                    nl.field_y = 25;
                  }
                  return;
                }
              }
              return;
            }
            if (param1 == 0) {
              th.field_i = 1;
              pa.field_c = 32;
              if (pk.field_s) {
                tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
              }
            }
          } else {
            nj.field_r = 255;
            wg.field_b = wg.field_b - (sg.field_f << 6);
            sg.field_f = 0;
            if (param1 == 0) {
              th.field_i = 5;
              pa.field_c = 32;
              if (pk.field_s) {
                tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
              }
            }
          }
        }
        if (pk.field_s &&
          param1 != 2) {
          tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
        }
    }

    final void f(int param0) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        boolean discarded$5 = false;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        int stackIn_524_0 = 0;
        int stackIn_567_0 = 0;
        int stackIn_567_1 = 0;
        boolean stackIn_574_0 = false;
        int stackIn_651_0 = 0;
        int stackIn_651_1 = 0;
        gb stackIn_657_0 = null;
        boolean stackIn_658_1 = false;
        boolean stackIn_661_2 = false;
        boolean stackIn_664_3 = false;
        gb stackIn_667_0 = null;
        boolean stackIn_668_1 = false;
        int stackIn_670_2 = 0;
        boolean stackIn_671_3 = false;
        boolean stackIn_674_4 = false;
        gb stackIn_676_0 = null;
        boolean stackIn_677_1 = false;
        int stackIn_679_2;
        boolean stackIn_679_3;
        boolean stackIn_680_4;
        boolean stackIn_690_1 = false;
        int stackIn_737_0 = 0;
        int stackIn_740_0 = 0;
        int stackIn_741_0 = 0;
        int stackIn_741_1 = 0;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        String var3_ref_String = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var6_ref_String = null;
        double var7_double = 0.0;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ai var10_ref_ai = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        java.awt.Canvas var19 = null;
        String var20 = null;
        StringBuilder var21 = null;
        String[] var22 = null;
        String var25 = null;
        String[] var26 = null;
        String var27 = null;
        String var28 = null;
        String[] var29 = null;
        String var30 = null;
        String var31 = null;
        gb var32 = null;
        Object var33 = null;
        ra var33_ref = null;
        long[] var38 = null;
        int[] var39 = null;
        String var3_ref_StringLifetime1;
        int stackIn_52_0Lifetime1;
        int stackIn_80_0Lifetime1;
        int stackIn_80_1Lifetime1;
        int stackIn_224_0Lifetime1;
        int stackIn_224_1Lifetime1;
        int stackIn_318_0Lifetime1;
        int stackIn_318_1Lifetime1;
        int stackIn_378_0Lifetime1;
        int stackIn_378_1Lifetime1;
        int stackIn_513_0Lifetime1;
        int stackIn_513_1Lifetime1;
        int stackIn_567_0Lifetime1;
        int stackIn_567_1Lifetime1;
        int stackIn_651_0Lifetime1;
        int stackIn_651_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        double var7_doubleLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var4_intLifetime2Lifetime1;
        int var4_intLifetime2Lifetime2;
        int var4_intLifetime2Lifetime3;
        int var5Lifetime2Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var6Lifetime1Lifetime4;
        int var6Lifetime1Lifetime5;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var10Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var33 = null;
        var18 = field_H;
        var19 = hi.d((byte) 72);
        if (ta.a((byte) 60)) {
          ud.a((byte) 38, dh.a(255), var19);
          return;
        }
        if (!th.field_h) {
          uc.a(false, var19);
          return;
        }
        if (!cg.c((byte) 54)) {
          ok.a(od.field_s, 100.0f, 0);
          uc.a(false, var19);
          return;
        }
        wg.field_e.c(0, 0);
        if (wi.field_K != 1) {
          fe.c((byte) 108);
          if (ql.field_c >= 5) {
            var3 = 0;
            var4_int = 0;
            var5 = 1;
            while (true) {
              if (od.field_k > var5) {
                stackIn_318_0 = ii.field_e[var5].field_d;
                stackIn_318_1 = var3;
                if (stackIn_318_0 == stackIn_318_1 &&
                  ii.field_e[var5].field_p > ii.field_e[var4_int].field_p) {
                  var3 = ii.field_e[var5].field_d;
                  var4_int = var5;
                }
                if (var3 < ii.field_e[var5].field_d) {
                  var3 = ii.field_e[var5].field_d;
                  var4_int = var5;
                }
                var5++;
                continue;
              }
              var5 = 50;
              stackIn_318_0Lifetime1 = -3;
              stackIn_318_1Lifetime1 = ~qh.field_l;
              if (stackIn_318_0Lifetime1 == stackIn_318_1Lifetime1) {
                var5 = 75;
              }
              if (qh.field_l == 3) {
                var5 = 75;
              }
              if (4 == qh.field_l) {
                var5 = 75;
              }
              if (qh.field_l == 5) {
                var5 = 200;
              }
              var6 = 0;
              if (0 == qh.field_l) {
                var6 = 64;
              }
              if (qh.field_l == 1) {
                var6 = 64;
              }
              if (qh.field_l == 2) {
                var6 = -u.field_x.field_s + 384;
              }
              if (3 == qh.field_l) {
                var6 = 64;
              }
              if (4 == qh.field_l) {
                var6 = 384 - u.field_x.field_s;
              }
              if (qh.field_l == 5) {
                var6 = 64;
              }
              mg.field_s.e(320 - u.field_x.field_x / 2, var6);
              if (var4_int == 0) {
                break;
              }
              ed.c(1 + (320 - u.field_x.field_x / 2), 0, 320 - u.field_x.field_x / 2 + (-2 + u.field_x.field_x) * ii.field_e[var4_int].field_p / var5, 480);
              u.field_x.e(320 - u.field_x.field_x / 2, var6);
              ed.c();
              break;
            }
          }
          if (qh.field_l > -1) {
            if (!pg.field_q) {
              var26 = new String[9];
              var3_ref_String__ = var26;
              for (var4_int = 0; 9 > var4_int; var4_int++) {
                var3_ref_String__[var4_int] = sc.a((byte) -108, bb.field_g.charAt(var4_int));
              }
              var4_int = 0;
              for (var5 = 440; var5 <= 610; var5 += 20) {
                ok.field_d[0].b(var5, 0, 30, 30, 64);
                jj.field_b.b(var26[var4_int], var5 + 15, 24, 0, -1);
                jj.field_b.b(var26[var4_int], var5 + 15, 26, 0, -1);
                jj.field_b.b(var26[var4_int], -1 + (15 + var5), 25, 0, -1);
                jj.field_b.b(var26[var4_int], 1 + (var5 + 15), 25, 0, -1);
                incrementValue$1 = var4_int;
                var4_int++;
                jj.field_b.b(var3_ref_String__[incrementValue$1], var5 + 15, 25, 16777215, -1);
              }
              ed.c(440, 0, 440 + 2 * fi.field_x, 64);
              var4_int = 0;
              for (var5 = 440; var5 <= 610; var5 += 20) {
                ok.field_d[0].a(var5, 0, 30, 30);
                incrementValue$0 = var4_int;
                var4_int++;
                jj.field_b.b(var3_ref_String__[incrementValue$0], var5 + 15, 25, 0, -1);
                stackIn_513_0 = -101;
                stackIn_513_1 = ~fi.field_x;
                if (stackIn_513_0 > stackIn_513_1 &&
                  fi.field_x < 110) {
                  ok.field_d[0].a(var5 + 5, 5, 20, 20);
                }
              }
              ed.c();
            }
            var3 = 2;
            if (qh.field_g > 0) {
              jj.field_b.c(hh.field_J, 8, 471, 0, -1);
              jj.field_b.c(hh.field_J, 8, 473, 0, -1);
              jj.field_b.c(hh.field_J, 7, 472, 0, -1);
              jj.field_b.c(hh.field_J, 9, 472, 0, -1);
              jj.field_b.c(hh.field_J, 8, 472, 16777215, -1);
              var3 = jj.field_b.b(hh.field_J) + 8;
              var4_int = 0;
              while (var4_int < qh.field_g) {
                stackIn_378_0 = qh.field_g;
                stackIn_378_1 = 25 + var4_int;
                if (stackIn_378_0 <= stackIn_378_1) {
                  if (qh.field_g <= (var4_int + 10)) {
                    if ((var4_int + 5) >= qh.field_g) {
                      ok.field_d[0].a(var3, 446, 24, 24);
                      gf.field_bb.a(var3, 446, 24, 24);
                      var3 += 24;
                    } else {
                      ok.field_d[0].a(var3, 446, 32, 32);
                      gf.field_bb.a(var3, 446, 32, 32);
                      a.field_a.c("5", var3, 461, 16777215, -1);
                      var3 += 32;
                      var4_int += 4;
                    }
                  } else {
                    ok.field_d[0].a(var3, 446, 32, 32);
                    gf.field_bb.a(var3, 446, 32, 32);
                    a.field_a.c("10", var3, 461, 16777215, -1);
                    var3 += 32;
                    var4_int += 9;
                  }
                } else {
                  ok.field_d[0].a(var3, 446, 32, 32);
                  gf.field_bb.a(var3, 446, 32, 32);
                  a.field_a.c("25", var3, 461, 16777215, -1);
                  var3 += 32;
                  var4_int += 24;
                }
                var4_int++;
              }
            }
            stackIn_378_0Lifetime1 = ~sg.field_f;
            stackIn_378_1Lifetime1 = -1;
            if (stackIn_378_0Lifetime1 < stackIn_378_1Lifetime1) {
              var27 = tf.field_d + sg.field_f;
              jj.field_b.c(var27, 8, jj.field_b.field_M - 1, 0, -1);
              jj.field_b.c(var27, 8, jj.field_b.field_M + 1, 0, -1);
              jj.field_b.c(var27, 7, jj.field_b.field_M, 0, -1);
              jj.field_b.c(var27, 9, jj.field_b.field_M, 0, -1);
              jj.field_b.c(var27, 8, jj.field_b.field_M, 16777215, -1);
            }
            if (wi.field_K == 2) {
              if (!pg.field_q &&
                5 == qh.field_l &&
                5 <= ql.field_c) {
                this.field_Q = this.field_Q + 1;
                if (this.field_Q >= 40) {
                  this.field_Q = 0;
                }
                lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
              }
              for (var4_int = 0; od.field_k > var4_int; var4_int++) {
                ii.field_e[var4_int].d(true);
              }
            }
            if (pg.field_q) {
              if (this.field_R == 11) {
                this.field_Q = this.field_Q + 1;
                if (this.field_Q >= 40) {
                  this.field_Q = 0;
                }
                lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
                var4_int = -32 + ((15 - ii.field_e[0].field_i.field_a - 1) * 32 - ii.field_e[0].field_f.field_a * 32 / 240);
                var3 = ii.field_e[0].field_i.field_b * 32 + ii.field_e[0].field_f.field_b * 32 / 240;
                if (ii.field_e[0].field_h != -1) {
                  ve.field_c[ii.field_e[0].field_n].d(var3, var4_int);
                } else {
                  ve.field_c[ii.field_e[0].field_n].e(var3, var4_int);
                }
              }
              if (this.field_R == 12) {
                var4_int = 352;
                lg.field_a[12 + (2 + this.field_Q / 10) % 4].e(512, 0);
                var3 = 64;
                if (this.field_Q < 10) {
                  var4_int = -64 - ii.field_e[0].field_i.field_a * 32 + (480 - ii.field_e[0].field_f.field_a * 32 / 240);
                  var3 = 32 * ii.field_e[0].field_f.field_b / 240 + ii.field_e[0].field_i.field_b * 32;
                  var5 = -var3 + 64;
                  var3 = var3 + var5 * this.field_Q / 10;
                  var6 = -var4_int + 352;
                  var4_int = var4_int + var6 * this.field_Q / 10;
                }
                var5 = 15;
                if (this.field_Q > 50) {
                  var5 = 16;
                }
                if (this.field_Q > 60) {
                  var5 = 12;
                }
                oc.field_c[var5].d(var3, var4_int);
                if (50 > this.field_Q) {
                  var6 = this.field_Q * 256 / 50;
                  var7_double = 0.0;
                  for (var9 = 0; var9 < 5; var9++) {
                    var7_doubleLifetime1 = (double)this.field_Q + 6.28 * (double)var9 / 5.0;
                    ob.field_c.d(-6 + ((int)(32.0 + 32.0 * Math.cos(var7_doubleLifetime1)) + var3), var4_int - (-(int)(32.0 + Math.sin(var7_doubleLifetime1) * 32.0) + 6), 12, 12, var6);
                  }
                }
                if (this.field_Q >= 50 &&
                  this.field_Q < 90) {
                  var6 = 576 - (64 + var3);
                  var7 = 64 - var4_int;
                  var8 = var6 * (-50 + this.field_Q) / 40 + var3;
                  var9 = var7 * (this.field_Q - 50) / 40 + var4_int;
                  ob.field_c.a(var8, var9, -123, 128, 2 * this.field_Q);
                  var8 = var3 + (int)(Math.sin(3.14 * (double)(this.field_Q - 50) / 80.0) * (double)var6);
                  var9 = var4_int + var7 * (-50 + this.field_Q) / 40;
                  ob.field_c.a(var8, var9, -118, 128, this.field_Q * 2);
                  var8 = var6 * (this.field_Q - 50) / 40 + var3;
                  var9 = (int)((double)var7 * Math.sin((double)(-50 + this.field_Q) * 3.14 / 80.0)) + var4_int;
                  ob.field_c.a(var8, var9, -115, 128, 2 * this.field_Q);
                }
              }
              if (this.field_R == 13) {
                var3 = 64;
                var4_int = 352;
                var5 = this.field_Q / 5 % 2 + 13;
                if (this.field_Q > 70) {
                  var5 = 12;
                }
                if (this.field_Q > 80) {
                  var5 = 11;
                }
                if (this.field_Q > 90) {
                  var5 = 10;
                }
                oc.field_c[var5].d(var3, var4_int);
                if (this.field_Q >= 50) {
                  lg.field_a[this.field_Q / 10 % 4 + 22].e(512, 288);
                } else {
                  lg.field_a[this.field_Q / 10 % 4 + 18].e(512, this.field_Q * 288 / 50);
                }
              }
              if (14 == this.field_R) {
                lg.field_a[22 + (2 + this.field_Q / 10) % 4].e(512, 288);
                var3 = this.field_Q + 64;
                var4_int = 352;
                var5 = 2 + this.field_Q / 10 % 4;
                oc.field_c[var5].d(var3, var4_int);
              }
              if (this.field_R == 15) {
                var3 = 164;
                if (this.field_Q < 50) {
                  lg.field_a[22 + this.field_Q / 10 % 4].e(512, 288);
                } else {
                  lg.field_a[this.field_Q / 10 % 4 + 26].e(512, 288);
                }
                var4_int = 352;
                var5 = this.field_Q / 5 % 2 + 19;
                oc.field_c[var5].d(var3, var4_int);
              }
              if (this.field_R == 16) {
                var4_int = 352;
                lg.field_a[26 + (2 + this.field_Q / 10) % 4].e(512, 288);
                var3 = 164;
                var5 = 10;
                if (this.field_Q > 10) {
                  var5 = 11;
                }
                if (25 < this.field_Q) {
                  var5 = 12;
                }
                if (50 <= this.field_Q) {
                  var5 = 13;
                }
                oc.field_c[var5].d(var3, var4_int);
              }
              if (this.field_R == 17) {
                lg.field_a[(this.field_Q / 10 + 2) % 4 + 30].e(512, 288);
                oc.field_c[(this.field_Q / 5 + 2) % 2 + 17].e(164, 352);
              }
              if (this.field_R == 1) {
                var3 = 256;
                var4_int = 288;
                var5 = this.field_Q / 10 % 8 - 0;
                lg.field_a[var5].e(var3, var4_int);
              }
              if (2 == this.field_R) {
                var5 = this.field_Q / 10 % 8 - 0;
                var3 = 256;
                var4_int = 288;
                lg.field_a[var5].e(var3, var4_int);
                var4_int = var4_int - (32 - this.field_Q + 100);
                var5 = this.field_Q / 5 % 4 + 6;
                var3 = var3 - (-64 + (100 - this.field_Q) * 5);
                ok.field_e[5][3][var5].d(var3, var4_int);
              }
              if (this.field_R == 3) {
                var4_int = 288;
                var5 = this.field_Q / 10 % 4 + 8;
                var3 = 256;
                var4_int = var4_int - this.field_Q;
                var3 = var3 + 5 * this.field_Q;
                lg.field_a[var5].e(var3, var4_int);
              }
              if (this.field_R == 4) {
                var3 = 2 * this.field_Q - 64;
                var5 = 6 + this.field_Q / 10 % 4;
                var4_int = 352;
                oc.field_c[var5].d(var3, var4_int);
              }
              if (this.field_R == 5) {
                var5 = 6 + (2 + this.field_Q / 10) % 4;
                var4_int = 352;
                if (this.field_Q < 100) {
                  var3 = -64 + (2 * this.field_Q + 200);
                  oc.field_c[var5].d(var3, var4_int);
                } else {
                  var3 = 336;
                  var5 = 7;
                  if (this.field_Q < 150) {
                    oc.field_c[var5].d(var3, var4_int);
                  } else {
                    oc.field_c[var5].e(var3, var4_int);
                  }
                }
                if (100 < this.field_Q) {
                  var3 = 64 + (int)(Math.sin(3.14 * (double)this.field_Q / 100.0) * 32.0);
                  var4_int = -448 + 2 * this.field_Q;
                  var5 = 36 + this.field_Q / 25 % 2;
                  oc.field_c[var5].e(var3, var4_int);
                }
              }
              if (6 == this.field_R) {
                var4_int = 352;
                var5 = 6 + this.field_Q / 10 % 4;
                var3 = 336;
                var5 = 7;
                if (this.field_Q > 20) {
                  var5 = 28;
                }
                if (this.field_Q > 40) {
                  var5 = 27;
                }
                if (this.field_Q > 150) {
                  var5 = 28;
                }
                if (this.field_Q > 175) {
                  var5 = 29;
                }
                oc.field_c[var5].e(var3, var4_int);
                var3 = (int)(Math.sin((double)this.field_Q * 3.14 / 100.0) * 32.0) + 64;
                var5 = 36 + this.field_Q / 25 % 2;
                var4_int = 2 * this.field_Q - 48;
                oc.field_c[var5].e(var3, var4_int);
              }
              if (this.field_R == 7) {
                if (this.field_Q >= 50) {
                  var4_int = 352;
                  var3 = 64;
                  if (this.field_Q >= 75) {
                    oc.field_c[10].e(var3, var4_int);
                  } else {
                    oc.field_c[0].e(var3, var4_int);
                    oc.field_c[36].e(var3, var4_int);
                  }
                } else {
                  var5 = this.field_Q / 5 % 4 + 6;
                  var3 = 336;
                  var4_int = 352;
                  var6 = 64 - var3;
                  var3 = var3 + var6 * this.field_Q / 50;
                  oc.field_c[var5].e(var3, var4_int);
                  var5 = 36;
                  var3 = 64;
                  var4_int = 352;
                  oc.field_c[var5].e(var3, var4_int);
                }
              }
              if (this.field_R == 8) {
                var5 = this.field_Q / 5 % 4 + 2;
                var4_int = 352;
                if (40 > this.field_Q) {
                  var3 = 64 + this.field_Q * 3;
                  oc.field_c[var5].d(var3, var4_int);
                }
                if (this.field_Q >= 40 &&
                  this.field_Q < 60) {
                  var3 = 184;
                  oc.field_c[3].d(var3, var4_int);
                }
                if (this.field_Q >= 60 &&
                  this.field_Q <= 100) {
                  var3 = 364 - this.field_Q * 3;
                  oc.field_c[var5].e(var3, var4_int);
                }
              }
              if (this.field_R == 9) {
                var4_int = 352;
                var5 = 10;
                var3 = 64;
                if (this.field_Q > 25) {
                  var5 = 11;
                }
                if (this.field_Q > 50) {
                  var5 = 12;
                }
                if (3 < qh.field_g) {
                  oc.field_c[var5].d(var3, var4_int);
                } else {
                  oc.field_c[var5].e(var3, var4_int);
                }
              }
            }
          }
        } else {
          if (sf.field_h == 0) {
            var3 = 208;
            for (var5 = 0; rc.field_a > var5; var5++) {
              stackIn_741_0 = var5;
              stackIn_741_1 = si.field_h;
              stackIn_16_0 = (stackIn_741_0 != stackIn_741_1) ? 15583488 : 16777215;
              var4_int = stackIn_16_0;
              var20 = og.field_R[var5];
              var7 = 177;
              if (var5 == 2 ||
                var5 == 3) {
                var7 = var7 - (50 + jj.field_b.b(var20) / 2);
              }
              this.b(-12926, var20, var4_int, var7, var3);
              if (var5 == 2) {
                if (!pk.field_s) {
                  stackIn_25_0 = 0;
                } else {
                  stackIn_25_0 = ee.field_p;
                }
                var8 = stackIn_25_0;
                ok.field_d[0].a(174, -10 + var3 - 6, -93, 20, 0);
                ok.field_d[0].a(174, 10 + (-6 + var3), -107, 20, 0);
                ok.field_d[0].a(174, var3 - 6, -108, 30, 0);
                ok.field_d[0].a(282, -6 + (var3 - 10), -123, 20, 0);
                ok.field_d[0].a(282, 10 + (var3 - 6), -98, 20, 0);
                ok.field_d[0].a(282, var3 - 6, -87, 30, 0);
                for (var9 = 172; 268 > var9; var9 += 14) {
                  ok.field_d[0].b(var9, -14 + var3 - 6, 28, 28, 64);
                }
                ed.c(0, 0, 174 + var8 * 108 / 104, 480);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ok.field_d[0].a(var9, -20 + var3, 28, 28);
                }
                ed.c();
                ok.field_d[0].a(var8 * 108 / 104 + 174, -10 + (var3 - 6), -103, 30, 0);
                ok.field_d[0].a(174 + 108 * var8 / 104, -6 + var3 + 10, -99, 30, 0);
                ok.field_d[0].a(174 + var8 * 108 / 104, var3 - 6, -95, 40, 0);
              }
              if (3 == var5) {
                if (tl.field_e) {
                  stackIn_37_0 = hc.field_o;
                } else {
                  stackIn_37_0 = 0;
                }
                var8 = stackIn_37_0;
                ok.field_d[0].a(174, -10 + (var3 - 6), -93, 20, 0);
                ok.field_d[0].a(174, 10 + (var3 - 6), -121, 20, 0);
                ok.field_d[0].a(174, var3 - 6, -91, 30, 0);
                ok.field_d[0].a(282, -6 + var3 - 10, -86, 20, 0);
                ok.field_d[0].a(282, 10 + (var3 - 6), -122, 20, 0);
                ok.field_d[0].a(282, var3 - 6, -117, 30, 0);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ok.field_d[0].b(var9, -6 + (-14 + var3), 28, 28, 64);
                }
                ed.c(0, 0, 108 * var8 / 200 + 172 + 2, 480);
                for (var9 = 172; var9 < 268; var9 += 14) {
                  ok.field_d[0].a(var9, -14 + (var3 - 6), 28, 28);
                }
                ed.c();
                ok.field_d[0].a(2 + var8 * 108 / 200 + 172, -6 + var3 - 10, -112, 30, 0);
                ok.field_d[0].a(2 + (var8 * 108 / 200 + 172), 10 + (-6 + var3), -114, 30, 0);
                ok.field_d[0].a(2 + (108 * var8 / 200 + 172), -6 + var3, -96, 40, 0);
              }
              var3 += 32;
            }
            for (var5 = 0; var5 < 100; var5++) {
              stackIn_52_0 = md.field_a[var5][2];
              if (stackIn_52_0 > 0) {
                ok.field_d[0].a(md.field_a[var5][0], md.field_a[var5][1], -128, md.field_a[var5][2], md.field_a[var5][2] * 2);
              }
            }
          }
          stackIn_52_0Lifetime1 = 11;
          if (stackIn_52_0Lifetime1 == sf.field_h) {
            ed.c(16, 153, 608, 311, 13158);
            ig.a(pd.field_H, 16, (byte) -110, 311, 608, 153);
            jj.field_b.b(uh.field_b, 320, jj.field_b.field_M + 169, 16777215, -1);
            var3 = 96;
            if (qh.field_l < 0) {
              hi.field_c = hi.field_c - qh.field_l * 6;
              qh.field_l = 0;
            }
            var4_int = var3 * 96 / 128;
            if (qh.field_l > 5) {
              wg.field_b = wg.field_b + 30;
              hi.field_c = hi.field_c - qh.field_l * 6;
              qh.field_l = 5;
            }
            var5 = 0;
            while (true) {
              if (var5 < 6) {
                var6 = var3 * var5 + 32;
                var7 = 208;
                bd.field_c[var5].a(var3 * var5 + 32, 208, var3, var4_int);
                stackIn_80_0 = ~var5;
                stackIn_80_1 = ~pl.field_A;
                if (stackIn_80_0 < stackIn_80_1 ||
                  !(hl.field_a > 0) &&
                  1 < var5) {
                  ed.d(var6, var7, var3, var4_int, 0, 192);
                  if (hl.field_a <= 0 &&
                    var5 > 1) {
                    fa.field_c.c(var3 / 2 + (32 + (var5 * var3 - var4_int / 2)), 208, var4_int, var4_int);
                  }
                }
                if (var5 != qh.field_l) {
                  ed.a(var5 * var3 + 32, 208, var3, var4_int, 0);
                  ed.a(32 + var5 * var3, 208, var3, var4_int, 1, 8421376);
                  ed.a(var3 * var5 + 32, 208, var3, var4_int, 2, 16776960);
                  ed.a(var5 * var3 + 32, 208, var3, var4_int, 3, 8421376);
                } else {
                  ed.a(var3 * var5 + 32, 208, var3, var4_int, 0);
                  ed.a(32 + var3 * var5, 208, var3, var4_int, 1, 16776960);
                  ed.a(var3 * var5 + 32, 208, var3, var4_int, 2, 16777215);
                  ed.a(var3 * var5 + 32, 208, var3, var4_int, 3, 16776960);
                }
                if (pg.field_n >= var6 &&
                  (var6 + var3) > pg.field_n &&
                  fi.field_B >= var7 &&
                  (var7 + var4_int) > fi.field_B) {
                  ed.a(var3 * var5 + 32, 208, var3, var4_int, 16777215);
                  if (sh.field_c == 1) {
                    hi.field_c = hi.field_c - qh.field_l * 6;
                    wg.field_b = wg.field_b + var5 * 6;
                    qh.field_l = var5;
                  }
                }
                var5++;
                continue;
              }
              var5 = 16777215;
              stackIn_80_0Lifetime1 = qh.field_l;
              stackIn_80_1Lifetime1 = pl.field_A;
              if (stackIn_80_0Lifetime1 > stackIn_80_1Lifetime1 ||
                !(qh.field_l <= 1) &&
                !(hl.field_a > 0)) {
                var5 = 16777088;
                if (qh.field_l > 1 &&
                  hl.field_a <= 0) {
                  var5 = 16711680;
                }
              }
              var6_ref_String = "BLAH BLAH BLAH!";
              if (qh.field_l == 0) {
                var6_ref_String = aa.field_kb;
              }
              if (qh.field_l == 1) {
                var6_ref_String = u.field_o;
              }
              if (qh.field_l == 2) {
                var6_ref_String = ra.field_l;
              }
              if (qh.field_l == 3) {
                var6_ref_String = de.field_c;
              }
              if (4 == qh.field_l) {
                var6_ref_String = wi.field_H;
              }
              if (qh.field_l == 5) {
                var6_ref_String = kk.field_vb;
              }
              jj.field_b.b(qj.field_c + (qh.field_l + 1), 320, var4_int + 192 + (16 + jj.field_b.field_M), var5, -1);
              jj.field_b.b(var6_ref_String, 320, 2 * jj.field_b.field_M + (208 + var4_int), var5, -1);
              if (var5 == 16777088) {
                jj.field_b.b(si.field_g, 320, 192 + var4_int + 16 + 3 * jj.field_b.field_M, var5, -1);
              }
              if (16711680 == var5) {
                jj.field_b.b(oj.field_a, 320, 192 - (-var4_int - 16 - 3 * jj.field_b.field_M), var5, -1);
              }
              if (!e.a(-109)) {
                if (var5 == 16777215 &&
                  this.a(400, 128, 65535, sc.field_l, 1) &&
                  5 > tj.field_I &&
                  0 >= pa.field_c) {
                  ic.field_a = ic.field_a - qh.field_g;
                  qh.field_g = 0;
                  nk.field_T = 0;
                  if (0 < qh.field_l) {
                    hi.field_c = hi.field_c - 5;
                    gd.field_b = false;
                    qh.field_g = 5;
                  }
                  od.field_k = 0;
                  tj.field_I = 5;
                  sj.field_l = 0;
                  if (qh.field_l > 0) {
                    nk.field_T = 400;
                  }
                }
              } else {
                var7 = 98;
                if (mh.field_tb == 2) {
                  var7 += 20;
                }
                if (this.a(400, var7, 65535, ue.field_b, 1) &&
                  tj.field_I < 5 &&
                  pa.field_c <= 0) {
                  sl.a(11, 11, -127);
                }
                if (var5 == 16777215) {
                  var7 = 320;
                  if (mh.field_tb == 2) {
                    var7 += 30;
                  }
                  if (this.a(400, var7, 65535, sc.field_l, 1) &&
                    tj.field_I < 5 &&
                    pa.field_c <= 0) {
                    wg.field_b = wg.field_b + qh.field_g;
                    qh.field_g = 0;
                    tj.field_I = 5;
                    if (qh.field_l > 0) {
                      gd.field_b = false;
                      me.field_f = me.field_f + 5;
                      qh.field_g = 5;
                    }
                    od.field_k = 0;
                    nk.field_T = 0;
                    if (qh.field_l > 0) {
                      nk.field_T = 400;
                    }
                    sj.field_l = 0;
                  }
                }
              }
              if (!this.a(400, 556, 65535, ne.field_a, 1)) {
                break;
              }
              if (tj.field_I >= 5) {
                break;
              }
              if (pa.field_c > 0) {
                break;
              }
              pa.field_c = 32;
              break;
            }
          }
          if (5 == sf.field_h) {
            cb.field_f = -1;
            var3 = 5 * jj.field_b.field_M / 2 + 231;
            ed.c(314, 119, 254, 94, 13158);
            ig.a(pd.field_H, 309, (byte) -110, 104, 264, 114);
            ed.c(249, 5 + var3 - 68, 382, 198, 13158);
            ig.a(pd.field_H, 244, (byte) -110, 208, 392, -64 + var3 - 4);
            var3 = 345;
            var4_int = 130;
            if (0 >= qf.field_l) {
              stackIn_148_0 = ti.field_a;
            } else {
              stackIn_148_0 = qf.field_l;
            }
            var5 = stackIn_148_0;
            if (ve.a((byte) 50, 0) ||
              (var5 & 2048) > 0) {
              var3 = 325;
            }
            var6 = 0;
            var7 = 1;
            var8 = a.field_a.field_E;
            for (var9 = 0; nl.field_t.length > var9; var9++) {
              var10 = 1;
              stackIn_224_0 = ~var9;
              stackIn_224_1 = -12;
              if (stackIn_224_0 == stackIn_224_1) {
                if ((1 << var9 & var5) == 0 &&
                  !ve.a((byte) 103, 0)) {
                  var10 = 0;
                }
                var3 = 525;
                var4_int = 130;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 != 0) {
                var11 = 0;
                if (tk.field_a == var9) {
                  var11 = 2;
                  ok.field_d[0].a(var3 - 8, -8 + var4_int, 48, 48);
                }
                if (pg.field_n >= var3 &&
                  pg.field_n <= var3 + 32 &&
                  fi.field_B >= var4_int &&
                  fi.field_B <= (32 + var4_int) && (qf.field_l == 0 ||
                  0 != (1 << var9 & var5))) {
                  var11 = 2;
                  if (~tk.field_a != ~var9) {
                    ok.field_d[0].d(-4 + var3, var4_int - 4, 40, 40, 128);
                  }
                  cb.field_f = var9;
                }
                if (0 == (1 << var9 & var5)) {
                  decompiledFrameRemainder0 = !(0 < qf.field_l);
                  if (decompiledFrameRemainder0) {
                    if (hl.field_a <= 0 &&
                      1 != var9 &&
                      var9 != 2 &&
                      var9 != 5 &&
                      var9 != 6) {
                      fa.field_c.c(-var11 + var3, var4_int - var11, var11 * 2 + 32, 2 * var11 + 32);
                    } else {
                      sk.field_z.c(-var11 + var3, -var11 + var4_int, var11 * 2 + 32, 32 + var11 * 2);
                    }
                  }
                } else {
                  ui.field_a[var9].c(-var11 + var3, var4_int - var11, 2 * var11 + 32, 2 * var11 + 32);
                }
                if (decompiledFrameRemainder0) {
                  if (~var9 == ~tk.field_a ||
                    !(pg.field_n < var3) &&
                    !(pg.field_n > (var3 + 32)) &&
                    !(var4_int > fi.field_B) &&
                    !(32 + var4_int < fi.field_B) &&
                    tk.field_a == -1) {
                    var7 = 0;
                    this.b(-12926, nl.field_t[var9], 15583488, 440, 255);
                    if ((1 << var9 & var5) == 0) {
                      a.field_a.a(uf.field_b, 620, 247 + (jj.field_b.field_M - 1), 0, 0);
                      a.field_a.a(uf.field_b, 619, jj.field_b.field_M + 247, 0, 0);
                      a.field_a.a(uf.field_b, 620, jj.field_b.field_M + 247, 16727871, -1);
                    } else {
                      a.field_a.a(bc.field_c, 619, jj.field_b.field_M + 247, 0, 0);
                      a.field_a.a(bc.field_c, 620, 246 + jj.field_b.field_M, 0, 0);
                      a.field_a.a(bc.field_c, 620, 247 + jj.field_b.field_M, 16777215, -1);
                    }
                    var12 = jj.field_b.field_M * 5 / 2 + 231;
                    if ((1 << var9 & var5) != 0) {
                      ui.field_a[var9].e(260, var12);
                    } else {
                      if (hl.field_a <= 0 &&
                        var9 != 1 &&
                        var9 != 2 &&
                        var9 != 5 &&
                        var9 != 6) {
                        fa.field_c.e(260, var12);
                      } else {
                        sk.field_z.e(260, var12);
                      }
                    }
                    var12 = var12 + jj.field_b.field_M;
                    if (0 == (var5 & 1 << var9) &&
                      5 <= var9 &&
                      var9 != 11) {
                      a.field_a.a(f.field_f, 398, var12 - 1, 222, 480, 0, 0, 0, 0, var8);
                      a.field_a.a(f.field_f, 397, var12, 222, 480, 0, 0, 0, 0, var8);
                      var12 = var12 + (var8 * 3 + 0 * a.field_a.a(f.field_f, 398, var12, 222, 480, 16777215, -1, 0, 0, var8));
                    } else {
                      a.field_a.a(mh.field_sb[var9], 397, -a.field_a.field_M + var12, 222, 480, 0, 0, 0, 0, var8);
                      a.field_a.a(mh.field_sb[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, var8);
                      var12 = var12 + (3 * var8 + a.field_a.a(mh.field_sb[var9], 398, var12 - a.field_a.field_M, 222, 480, 16777215, -1, 0, 0, var8) * 0);
                      jj.field_b.a(kl.field_e + u.field_m[var9], 397, var12 - a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                      jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                      var12 = var12 + jj.field_b.field_M * jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                      jj.field_b.a(nf.field_a, 397, var12 - a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                      jj.field_b.a(nf.field_a, 398, -a.field_a.field_M - 1 + var12, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                      jj.field_b.a(nf.field_a, 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                      var13 = md.field_e[var9];
                      for (var14 = 0; var14 < var13; var14++) {
                        wc.field_f.b(jj.field_b.b(nf.field_a) - var13 * 3 / 2 + (8 * var14 + 398), 4 + var12 - a.field_a.field_M);
                      }
                    }
                  }
                  incrementValue$2 = var6;
                  var6++;
                  if (4 == incrementValue$2) {
                    var3 = 325;
                    var4_int += 40;
                  } else {
                    var3 += 40;
                  }
                }
              }
            }
            if (var7 != 0) {
              if (qf.field_l > 0) {
                jj.field_b.b(rb.field_b, 440, 230 + jj.field_b.field_M, 0, 0);
                jj.field_b.b(rb.field_b, 439, 231 + jj.field_b.field_M, 0, 0);
                jj.field_b.b(rb.field_b, 440, jj.field_b.field_M + 231, 16777215, -1);
              }
              var9 = jj.field_b.field_M * 5 / 2 + 231;
              var9 = var9 + jj.field_b.field_M;
              jj.field_b.a(gk.field_r, 260, -1 + (var9 - 32), 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
              jj.field_b.a(gk.field_r, 259, -32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
              jj.field_b.a(gk.field_r, 260, -32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
              if (e.a(-86)) {
                jj.field_b.a(vl.field_n, 260, -1 + var9 + 32, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                jj.field_b.a(vl.field_n, 259, 32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                jj.field_b.a(vl.field_n, 260, 32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
              }
            }
          }
          stackIn_224_0Lifetime1 = sf.field_h;
          stackIn_224_1Lifetime1 = 2;
          if (stackIn_224_0Lifetime1 == stackIn_224_1Lifetime1) {
            ed.c(290, 125, 340, 300, 13158);
            ig.a(pd.field_H, 285, (byte) -110, 310, 350, 120);
            var21 = new StringBuilder(0);
            var5_ref_String = var21.toString();
            if (!e.a(-122)) {
              a.field_a.a(we.field_e, 289, 370, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
              a.field_a.a(we.field_e, 290, 369, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
              a.field_a.a(we.field_e, 290, 370, 340, 64, 16744448, -1, 1, 1, a.field_a.field_M);
              if (null == th.field_g) {
                th.field_g = ff.a(10, 2, (byte) 59, 3, 1);
              }
              if (th.field_g.field_m) {
                if (null != th.field_g.field_n) {
                  var22 = th.field_g.field_n[cd.field_c];
                  var38 = th.field_g.field_q[cd.field_c];
                  var3 = 128;
                  var39 = th.field_g.field_i[cd.field_c];
                  var9 = 0;
                  var10_ref_ai = fa.field_a;
                  var11Lifetime1 = 0;
                  for (var12Lifetime1 = 0; 11 > var12Lifetime1; var12Lifetime1++) {
                    var13Lifetime1 = 16744448;
                    stackIn_513_0 = ~var12Lifetime1;
                    stackIn_513_1 = -11;
                    if (stackIn_513_0 > stackIn_513_1 &&
                      var9 == 0 &&
                      var10_ref_ai != null &&
                      qj.a(var22[var12Lifetime1], 66) &&
                      var10_ref_ai.field_n == var38[var12Lifetime1] &&
                      ei.field_k == var39[var12Lifetime1]) {
                      var13Lifetime1 = 16777215;
                      var9 = 1;
                    }
                    L140: {
                      if ((var12Lifetime1 >= 10 ||
                        null == var22[var12Lifetime1]) &&
                        (var12Lifetime1 != 10 ||
                        !(ei.field_k > 0) ||
                        var9 != 0)) {
                        if (!(10 <= var12Lifetime1)) {
                          var3 = 24 * var12Lifetime1 + 144;
                          var5_ref_String = 1 + var12Lifetime1 + ".";
                          if (var12Lifetime1 == 0 &&
                            cd.field_c != 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = pd.field_G;
                          }
                          if (var12Lifetime1 == 1 &&
                            cd.field_c != 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = ef.field_G;
                          }
                          if (var12Lifetime1 == 0 &&
                            cd.field_c == 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = af.field_b;
                          }
                          if (var12Lifetime1 == 1 &&
                            cd.field_c == 1 &&
                            var11Lifetime1 == 0) {
                            var5_ref_String = ai.field_s;
                          }
                          if (var11Lifetime1 != 0) {
                            a.field_a.c(var5_ref_String, 322, 10 + var3, 0, -1);
                            a.field_a.c(var5_ref_String, 324, 10 + var3, 0, -1);
                            a.field_a.c(var5_ref_String, 323, var3 + 9, 0, -1);
                            a.field_a.c(var5_ref_String, 323, 11 + var3, 0, -1);
                            a.field_a.c(var5_ref_String, 323, var3 + 10, var13Lifetime1, -1);
                          } else {
                            if (!(1 < var12Lifetime1)) {
                              a.field_a.b(var5_ref_String, 468, 10 + var3, 0, -1);
                              a.field_a.b(var5_ref_String, 470, var3 + 10, 0, -1);
                              a.field_a.b(var5_ref_String, 469, 9 + var3, 0, -1);
                              a.field_a.b(var5_ref_String, 469, 11 + var3, 0, -1);
                              a.field_a.b(var5_ref_String, 469, var3 + 10, var13Lifetime1, -1);
                            }
                          }
                        }
                        break L140;
                      }
                      var11Lifetime1 = 1;
                      if (var12Lifetime1 == 0) {
                        a.field_a.c(bb.field_l, 299, 16 + var3, 0, 0);
                        a.field_a.a(qj.field_f, 619, var3 + 16, 0, 0);
                        a.field_a.c(bb.field_l, 300, 16 + (var3 - 1), 0, 0);
                        a.field_a.a(qj.field_f, 620, -1 + (var3 + 16), 0, 0);
                        a.field_a.c(bb.field_l, 300, var3 + 16, 16777215, -1);
                        a.field_a.a(qj.field_f, 620, var3 + 16, 16777215, -1);
                        if ((a.field_a.b(nj.field_p) / 2 + 510) < (620 - (a.field_a.b(qj.field_f) + 8))) {
                          a.field_a.b(nj.field_p, 509, 16 + var3, 0, 0);
                          a.field_a.b(nj.field_p, 510, -1 + var3 + 16, 0, 0);
                          a.field_a.b(nj.field_p, 510, 16 + var3, 16777215, -1);
                        } else {
                          var14Lifetime1 = -a.field_a.b(qj.field_f) + 620 - 8;
                          a.field_a.a(nj.field_p, var14Lifetime1 - 1, var3 + 16, 0, 0);
                          a.field_a.a(nj.field_p, var14Lifetime1, 16 + (var3 - 1), 0, 0);
                          a.field_a.a(nj.field_p, var14Lifetime1, var3 + 16, 16777215, -1);
                        }
                      }
                      var14Lifetime1Lifetime1 = 0;
                      if (var12Lifetime1 < 10 &&
                        null != var22[var12Lifetime1]) {
                        var5_ref_String = 1 + var12Lifetime1 + "." + var22[var12Lifetime1];
                        var14Lifetime1Lifetime1 = var39[var12Lifetime1];
                      } else {
                        if (var12Lifetime1 == 10 &&
                          ei.field_k > 0 &&
                          var9 == 0) {
                          var13Lifetime1 = 16777215;
                          var14Lifetime1Lifetime1 = ei.field_k;
                          var5_ref_String = d.field_a;
                        }
                      }
                      var15 = 300;
                      var16 = var14Lifetime1Lifetime1 % 64;
                      var17 = (-var16 + var14Lifetime1Lifetime1) / 64;
                      if (0 == var12Lifetime1) {
                        oe.field_d[0].field_a = var17;
                      }
                      boolean decompiledFrameRemainder1 = true;
                      var3 = 154 + var12Lifetime1 * 22;
                      if (var12Lifetime1 >= 10) {
                        decompiledFrameRemainder1 = (var9 == 0);
                        if ((decompiledFrameRemainder1) &&
                          (ei.field_k <= 0)) {
                          break L140;
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        ed.c(0, 0, 510 - a.field_a.b(q.field_l) / 2, 640);
                        a.field_a.c(var5_ref_String, 2 + var15, 10 + var3, 0, -1);
                        a.field_a.c(var5_ref_String, var15 + 4, var3 + 10, 0, -1);
                        a.field_a.c(var5_ref_String, 3 + var15, var3 + 9, 0, -1);
                        a.field_a.c(var5_ref_String, var15 + 3, var3 + 11, 0, -1);
                        a.field_a.c(var5_ref_String, var15 + 3, 10 + var3, var13Lifetime1, -1);
                        ed.c();
                        var5_ref_String = 1 + var16 / 6 + "-" + (1 + var16 % 6);
                        if (1 + var16 / 6 == 7) {
                          var5_ref_String = q.field_l;
                        }
                        a.field_a.b(var5_ref_String, 508, 10 + var3, 0, -1);
                        a.field_a.b(var5_ref_String, 510, 10 + var3, 0, -1);
                        a.field_a.b(var5_ref_String, 509, 9 + var3, 0, -1);
                        a.field_a.b(var5_ref_String, 509, var3 + 11, 0, -1);
                        a.field_a.b(var5_ref_String, 509, 10 + var3, var13Lifetime1, -1);
                        var25 = Integer.toString(var17);
                        a.field_a.a(var25, 621, 10 + var3, 0, -1);
                        a.field_a.a(var25, 623, 10 + var3, 0, -1);
                        a.field_a.a(var25, 622, var3 + 9, 0, -1);
                        a.field_a.a(var25, 622, var3 + 11, 0, -1);
                        a.field_a.a(var25, 622, 10 + var3, var13Lifetime1, -1);
                      }
                    }
                  }
                } else {
                  a.field_a.b(rd.field_a, 466, 248, 16744448, -1);
                }
              } else {
                a.field_a.b(lf.field_a, 466, 144, 16744448, -1);
              }
              var3 = 418;
            } else {
              a.field_a.b(dj.field_c, 466, 248, 16744448, -1);
            }
          }
        }
        hl.field_b.b(43);
        stackIn_513_0Lifetime1 = 0;
        stackIn_513_1Lifetime1 = tj.field_I;
        if (stackIn_513_0Lifetime1 < stackIn_513_1Lifetime1) {
          if (tj.field_I < 256) {
            ed.d(0, 0, 640, 480, 0, tj.field_I);
          } else {
            ed.d(0, 0, 640, 480, 0, -tj.field_I + 510);
          }
        }
        if (!(-350 >= hi.field_a) ||
          qh.field_l == 0) {
          var3Lifetime1 = hi.field_a;
          if (qh.field_l == 0) {
            stackIn_524_0 = (pg.field_q) ? 0 : 1;
            if (stackIn_524_0 != 1) {
            }
          }
          if (hi.field_a < 240) {
            hi.field_a = hi.field_a + 250;
            if (hi.field_a > 240) {
              hi.field_a = 240;
            }
          }
          var4_intLifetime1 = (-240 + hi.field_a) * (-240 + hi.field_a) / 120;
          if (hi.field_a < 240) {
            var4_intLifetime1 = -var4_intLifetime1;
          }
          var4_intLifetime1 += 240;
          ed.c(5 + (-(jj.field_b.b(bb.field_j) / 2) + 320 - 16), -11 - jj.field_b.field_M + var4_intLifetime1, jj.field_b.b(bb.field_j) + 32 - 10, -10 + hj.field_g.field_M + 16, 13158);
          ig.a(pd.field_H, -16 - jj.field_b.b(bb.field_j) / 2 + 320, (byte) -110, 16 + hj.field_g.field_M, 32 + jj.field_b.b(bb.field_j), var4_intLifetime1 - jj.field_b.field_M - 16);
          this.a(var4_intLifetime1, bb.field_j, 16777215, -57, 319);
          if (qh.field_l == 0 &&
            qh.field_g >= 0) {
            var5Lifetime1 = 64 + var4_intLifetime1;
            if (0 == ql.field_c &&
              ef.field_F != bb.field_j) {
              var6Lifetime1 = jj.field_b.b(ol.field_d);
              ed.c(5 + (320 - var6Lifetime1 / 2 - 16), 5 + (-jj.field_b.field_M + (var5Lifetime1 - 16)), var6Lifetime1 + 32 - 10, 118 + hj.field_g.field_M, 13158);
              ig.a(pd.field_H, -16 + (320 - var6Lifetime1 / 2), (byte) -110, hj.field_g.field_M + 128, var6Lifetime1 + 32, var5Lifetime1 - jj.field_b.field_M - 16);
              this.a(var5Lifetime1, r.field_c, 16777215, 123, 319);
              var5Lifetime1 += 32;
              this.a(var5Lifetime1, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 45, i.field_c), 16777215, -83, 319);
              var5Lifetime1 += 32;
              this.a(var5Lifetime1, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 126, pb.field_i), 16777215, -91, 319);
              var5Lifetime1 += 32;
            }
            if (1 == ql.field_c) {
              var6Lifetime1Lifetime1 = 500;
              ed.c(304 - var6Lifetime1Lifetime1 / 2 + 5, -jj.field_b.field_M + (var5Lifetime1 - 16 + 5), -10 + var6Lifetime1Lifetime1 + 32, 96 + (hj.field_g.field_M - 10), 13158);
              ig.a(pd.field_H, -16 + (-(var6Lifetime1Lifetime1 / 2) + 320), (byte) -110, hj.field_g.field_M + 96, var6Lifetime1Lifetime1 + 32, -16 + (var5Lifetime1 - jj.field_b.field_M));
              jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6Lifetime1Lifetime1 / 2) + 320 - 1, 5 + (-16 + var5Lifetime1 - (-4 - (-jj.field_b.field_M - 1))), var6Lifetime1Lifetime1, 480, 0, 0, 1, 0, jj.field_b.field_M);
              jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6Lifetime1Lifetime1 / 2) + 320 - 1, 5 - jj.field_b.field_M + 4 + (var5Lifetime1 - 16) - 1, var6Lifetime1Lifetime1, 480, 0, 0, 1, 0, jj.field_b.field_M);
              jj.field_b.a(fa.field_d + " " + ta.field_f, 320 - var6Lifetime1Lifetime1 / 2, -16 - jj.field_b.field_M + 4 + (var5Lifetime1 + 5), var6Lifetime1Lifetime1, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
              var5Lifetime1 += 64;
            }
            if (2 == ql.field_c) {
              var6Lifetime1Lifetime2 = jj.field_b.b(vl.field_a);
              if (jj.field_b.b(ol.field_d) > var6Lifetime1Lifetime2) {
                var6Lifetime1Lifetime2 = jj.field_b.b(ol.field_d);
              }
              if (608 >= var6Lifetime1Lifetime2) {
                ed.c(5 - var6Lifetime1Lifetime2 / 2 + 320 - 16, -11 + (-jj.field_b.field_M + var5Lifetime1), -10 + (32 + var6Lifetime1Lifetime2), hj.field_g.field_M + 150, 13158);
                ig.a(pd.field_H, 304 - var6Lifetime1Lifetime2 / 2, (byte) -110, hj.field_g.field_M + 160, var6Lifetime1Lifetime2 + 32, var5Lifetime1 - jj.field_b.field_M - 16);
                this.a(var5Lifetime1, cd.field_h, 16777215, -102, 319);
                var5Lifetime1 += 32;
                this.a(var5Lifetime1, vl.field_a, 16777215, -126, 319);
                var5Lifetime1 += 32;
                this.a(var5Lifetime1, ld.field_a, 16777215, -35, 319);
                var5Lifetime1 += 32;
              } else {
                var6Lifetime1Lifetime2 = 608;
                ed.c(5 - var6Lifetime1Lifetime2 / 2 + 320 - 16, -jj.field_b.field_M + var5Lifetime1 - 16 + 5, -10 + (32 + var6Lifetime1Lifetime2), 128 + (hj.field_g.field_M - 10), 13158);
                ig.a(pd.field_H, 304 - var6Lifetime1Lifetime2 / 2, (byte) -110, hj.field_g.field_M + 128, 32 + var6Lifetime1Lifetime2, -jj.field_b.field_M + var5Lifetime1 - 16);
                var28 = cd.field_h + " " + vl.field_a + " " + ld.field_a;
                a.field_a.a(var28, 32, -20 + var5Lifetime1, 575, 48, 0, 0, 1, 1, 14);
                a.field_a.a(var28, 32, -20 + var5Lifetime1 - 1, 576, 48, 0, 0, 1, 1, 14);
                a.field_a.a(var28, 32, var5Lifetime1 - 20, 576, 48, 16777215, -1, 1, 1, 14);
                var5Lifetime1 += 48;
              }
              jj.field_a[0].e(222, -20 + var5Lifetime1);
              jj.field_a[2].e(254, var5Lifetime1 - 20);
              jj.field_a[1].e(286, var5Lifetime1 - 20);
              jj.field_a[3].e(318, var5Lifetime1 - 20);
              jj.field_a[4].e(350, -20 + var5Lifetime1);
              jj.field_a[6].e(382, -20 + var5Lifetime1);
              var5Lifetime1 += 32;
            }
            if (ql.field_c == 3) {
              var6Lifetime1Lifetime3 = 600;
              ed.c(-11 + (-(var6Lifetime1Lifetime3 / 2) + 320), -11 + (-jj.field_b.field_M + var5Lifetime1), 22 + var6Lifetime1Lifetime3, 160 + (hj.field_g.field_M - 10), 13158);
              ig.a(pd.field_H, -16 - var6Lifetime1Lifetime3 / 2 + 320, (byte) -110, 160 + hj.field_g.field_M, 32 + var6Lifetime1Lifetime3, -16 + var5Lifetime1 - jj.field_b.field_M);
              jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 102, ag.field_w), -(var6Lifetime1Lifetime3 / 2) + 319, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 0, 0, 0, 0, 20);
              jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 61, ag.field_w), -(var6Lifetime1Lifetime3 / 2) + 320, -25 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 0, 0, 0, 0, 20);
              jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 107, ag.field_w), -(var6Lifetime1Lifetime3 / 2) + 320, -24 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 16777215, -1, 0, 0, 20);
              var5Lifetime1 += 32;
              var5Lifetime1 -= 24;
              var29 = new String[9];
              var7_ref_String__ = var29;
              for (var8Lifetime1 = 0; var8Lifetime1 < 9; var8Lifetime1++) {
                var7_ref_String__[var8Lifetime1] = sc.a((byte) 127, bb.field_g.charAt(var8Lifetime1));
              }
              var8Lifetime1Lifetime1 = 0;
              var9Lifetime1 = 0;
              if (mh.field_tb == 1) {
                var9Lifetime1 = -80;
              }
              for (var10Lifetime1 = var9Lifetime1 + 440; var10Lifetime1 <= 610 + var9Lifetime1; var10Lifetime1 += 20) {
                ok.field_d[0].b(-140 + var10Lifetime1, 0 + var5Lifetime1, 30, 30, 64);
                jj.field_b.b(var29[var8Lifetime1Lifetime1], var10Lifetime1 - 140 + 15, var5Lifetime1 + 24, 0, -1);
                jj.field_b.b(var29[var8Lifetime1Lifetime1], var10Lifetime1 - 125, 26 + var5Lifetime1, 0, -1);
                jj.field_b.b(var29[var8Lifetime1Lifetime1], -1 + (var10Lifetime1 - 140 + 15), 25 + var5Lifetime1, 0, -1);
                jj.field_b.b(var29[var8Lifetime1Lifetime1], 15 + var10Lifetime1 - 140 + 1, var5Lifetime1 + 25, 0, -1);
                incrementValue$4 = var8Lifetime1Lifetime1;
                var8Lifetime1Lifetime1++;
                jj.field_b.b(var7_ref_String__[incrementValue$4], var10Lifetime1 - 140 + 15, var5Lifetime1 + 25, 16777215, -1);
              }
              var8Lifetime1Lifetime2 = 0;
              ed.c(0, 0, 395 + var9Lifetime1, 480);
              for (var10Lifetime1Lifetime1 = 440 + var9Lifetime1; 610 + var9Lifetime1 >= var10Lifetime1Lifetime1; var10Lifetime1Lifetime1 += 20) {
                ok.field_d[0].a(-140 + var10Lifetime1Lifetime1, var5Lifetime1 + 0, 30, 30);
                incrementValue$3 = var8Lifetime1Lifetime2;
                var8Lifetime1Lifetime2++;
                jj.field_b.b(var7_ref_String__[incrementValue$3], 15 + var10Lifetime1Lifetime1 - 140, var5Lifetime1 + 25, 0, -1);
                stackIn_567_0 = ~fi.field_x;
                stackIn_567_1 = -101;
                if (stackIn_567_0 < stackIn_567_1 &&
                  fi.field_x < 110) {
                  ok.field_d[0].a(-140 + (var10Lifetime1Lifetime1 + 5), 5 + var5Lifetime1, 20, 20);
                }
              }
              ed.c();
              var5Lifetime1 += 24;
              var5Lifetime1 += 32;
              jj.field_b.a(lc.field_c + " " + sd.field_e, -(var6Lifetime1Lifetime3 / 2) + 320, -25 + var5Lifetime1, var6Lifetime1Lifetime3, 480, 0, 0, 1, 0, 20);
              jj.field_b.a(lc.field_c + " " + sd.field_e, 319 - var6Lifetime1Lifetime3 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 0, 0, 1, 0, 20);
              jj.field_b.a(lc.field_c + " " + sd.field_e, 320 - var6Lifetime1Lifetime3 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime3, 480, 16777215, -1, 1, 0, 20);
              var5Lifetime1 += 64;
            }
            stackIn_567_0Lifetime1 = -5;
            stackIn_567_1Lifetime1 = ~ql.field_c;
            if (stackIn_567_0Lifetime1 == stackIn_567_1Lifetime1) {
              var6Lifetime1Lifetime4 = jj.field_b.b(ab.field_b);
              ed.c(-11 - var6Lifetime1Lifetime4 / 2 + 320, -jj.field_b.field_M + var5Lifetime1 - 11, 22 + var6Lifetime1Lifetime4, 96 + (hj.field_g.field_M - 10), 13158);
              ig.a(pd.field_H, -16 + (-(var6Lifetime1Lifetime4 / 2) + 320), (byte) -110, hj.field_g.field_M + 96, var6Lifetime1Lifetime4 + 32, -16 + var5Lifetime1 - jj.field_b.field_M);
              jj.field_b.a(ab.field_b + " " + he.field_r, 320 - var6Lifetime1Lifetime4 / 2, -25 + var5Lifetime1, var6Lifetime1Lifetime4, 480, 0, 0, 1, 0, 22);
              jj.field_b.a(ab.field_b + " " + he.field_r, -(var6Lifetime1Lifetime4 / 2) + 319, -24 + var5Lifetime1, var6Lifetime1Lifetime4, 480, 0, 0, 1, 0, 22);
              jj.field_b.a(ab.field_b + " " + he.field_r, 320 - var6Lifetime1Lifetime4 / 2, var5Lifetime1 - 24, var6Lifetime1Lifetime4, 480, 16777215, -1, 1, 0, 22);
              var5Lifetime1 += 64;
            }
            if (ql.field_c == 5) {
              var6Lifetime1Lifetime5 = jj.field_b.b(ol.field_d);
              ed.c(-11 - var6Lifetime1Lifetime5 / 2 + 320, -11 + var5Lifetime1 - jj.field_b.field_M, var6Lifetime1Lifetime5 + 22, 128 + hj.field_g.field_M - 10, 13158);
              ig.a(pd.field_H, 304 - var6Lifetime1Lifetime5 / 2, (byte) -110, hj.field_g.field_M + 128, var6Lifetime1Lifetime5 + 32, -16 + (var5Lifetime1 - jj.field_b.field_M));
              this.a(var5Lifetime1, jd.field_c, 16777215, -52, 319);
              var5Lifetime1 += 32;
              this.a(var5Lifetime1, ql.field_a, 16777215, 78, 319);
              var5Lifetime1 += 32;
              this.a(var5Lifetime1, ug.field_P, 16777215, 95, 319);
              var5Lifetime1 += 32;
            }
            var5Lifetime1 += 16;
            stackIn_574_0 = !(pg.field_q);
            if (stackIn_574_0) {
              this.a(var5Lifetime1, ol.field_d, 16777215, -74, 319);
            }
          }
          hi.field_a = var3Lifetime1;
        }
        if (da.field_e != null) {
          da.field_e.c(40);
        }
        if (1 == sf.field_h ||
          sf.field_h == 2 ||
          sf.field_h == 5) {
          var30 = ne.field_a;
          ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
          var4_intLifetime2 = 16776960;
          if (this.field_N != 0) {
            if ((this.field_N == -1) &&
              (!(0 > pg.field_n)) &&
              (!(pg.field_n >= 88)) &&
              (!(fi.field_B < 436))) {
              var4_intLifetime2 = 16777215;
              if ((sh.field_c == 1 ||
                hi.field_p[84]) && pa.field_c < 32) {
                pa.field_c = 32;
              }
            }
          } else {
            var4_intLifetime2 = 16777215;
            if ((sh.field_c == 1 ||
              hi.field_p[84]) && pa.field_c < 32) {
              pa.field_c = 32;
            }
          }
          this.b(-12926, var30, var4_intLifetime2, 44, 458 + jj.field_b.field_M / 4);
          if (sf.field_h == 5 &&
            qf.field_l > 0) {
            var4_intLifetime2Lifetime1 = -32 - hj.field_g.b(var30) + 640;
            var31 = cf.field_m;
            var4_intLifetime2Lifetime1 = var4_intLifetime2Lifetime1 - (jj.field_b.b(var31) + 32);
            ig.a(qc.field_E, var4_intLifetime2Lifetime1, (byte) -110, 44, 32 + jj.field_b.b(var31), 436);
            var5Lifetime2 = 16776960;
            if (this.field_N == 1 ||
              !(pg.field_n < var4_intLifetime2Lifetime1) &&
              !(pg.field_n >= (jj.field_b.b(var31) + 32 + var4_intLifetime2Lifetime1)) &&
              !(436 > fi.field_B) &&
              this.field_N == -1) {
              if ((sh.field_c != 0 ||
                hi.field_p[84]) &&
                0 == pa.field_c) {
                th.field_i = 3;
                pa.field_c = 32;
              }
              var5Lifetime2 = 16777215;
            }
            this.b(-12926, var31, var5Lifetime2, 16 + var4_intLifetime2Lifetime1 + jj.field_b.b(var31) / 2, 458 + jj.field_b.field_M / 4);
          }
          if (sf.field_h == 2 &&
            !e.a(-108)) {
            var4_intLifetime2Lifetime2 = 88;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 <= 2; var5Lifetime2Lifetime1++) {
              var4_intLifetime2Lifetime2 += 8;
              var6Lifetime2 = 176;
              var3_ref_String = wh.field_l[var5Lifetime2Lifetime1];
              ig.a(qc.field_E, var4_intLifetime2Lifetime2, (byte) -110, 44, var6Lifetime2, 436);
              var7Lifetime1 = 16776960;
              stackIn_651_0 = ~cd.field_c;
              stackIn_651_1 = ~var5Lifetime2Lifetime1;
              if (stackIn_651_0 == stackIn_651_1) {
                var7Lifetime1 = 16711680;
              }
              if (this.field_N == var5Lifetime2Lifetime1 + 1 ||
                this.field_N == -1 &&
                !(pg.field_n < var4_intLifetime2Lifetime2) &&
                !(pg.field_n >= var6Lifetime2 + var4_intLifetime2Lifetime2) &&
                !(fi.field_B < 436)) {
                if (sh.field_c != 0 ||
                  hi.field_p[84]) {
                  cd.field_c = var5Lifetime2Lifetime1;
                }
                var7Lifetime1 = (var7Lifetime1 != 16711680) ? 16777215 : 16744576;
              }
              this.b(-12926, var3_ref_String, var7Lifetime1, var4_intLifetime2Lifetime2 + var6Lifetime2 / 2, jj.field_b.field_M / 4 + 458);
              var4_intLifetime2Lifetime2 = var4_intLifetime2Lifetime2 + var6Lifetime2;
            }
          }
          if (e.a(-128) && (2 == sf.field_h ||
            sf.field_h == 5)) {
            var3_ref_StringLifetime1 = ue.field_b;
            ig.a(qc.field_E, 96, (byte) -110, 44, 176, 436);
            var4_intLifetime2Lifetime3 = 16776960;
            if (this.field_N == 1 ||
              !(96 >= pg.field_n) &&
              !(pg.field_n >= 264) &&
              !(fi.field_B < 436) &&
              -1 == this.field_N) {
              if (sh.field_c != 0 ||
                hi.field_p[84]) {
                sl.a(sf.field_h, sf.field_h, -128);
              }
              var4_intLifetime2Lifetime3 = 16777215;
            }
            this.b(-12926, var3_ref_StringLifetime1, var4_intLifetime2Lifetime3, 184, 458 + jj.field_b.field_M / 4);
          }
        }
        stackIn_651_0Lifetime1 = -10;
        stackIn_651_1Lifetime1 = ~sf.field_h;
        if (stackIn_651_0Lifetime1 == stackIn_651_1Lifetime1) {
          ed.c(0, 0, 640, 480, 0);
          df.a(2);
        }
        var3Lifetime2 = 8 / ((param0 + 43) / 50);
        if (sf.field_h == 6) {
          var32 = a.field_a;
          var5Lifetime3 = 180 + var32.field_M;
          var6Lifetime3 = 4 + (var32.field_B + var32.field_q);
          ed.d(40, 170, 560, 20 + (120 + 5 * var6Lifetime3), 0, 192);
          ig.a(pd.field_H, 31, (byte) -110, 14 + (20 + (5 * var6Lifetime3 + 120)), 578, 163);
          var32.b(vg.field_U, 320, var5Lifetime3, 16777215, -1);
          stackIn_657_0 = var32;
          stackIn_658_1 = (0 == qf.field_l) ? false : true;
          stackIn_661_2 = (ke.field_u.f(8192)) ? false : true;
          stackIn_664_3 = (sg.field_f == 0) ? false : true;
          ((gb) (Object) stackIn_657_0).b(h.a(stackIn_658_1, stackIn_661_2, stackIn_664_3, 26505), 320, var5Lifetime3 + var6Lifetime3, 16777215, -1);
          if (this.a(var5Lifetime3 + 4 * var6Lifetime3, 320, 65535, cd.field_d, 1)) {
          }
          stackIn_667_0 = var32;
          stackIn_668_1 = (qf.field_l == 0) ? false : true;
          stackIn_670_2 = 2;
          stackIn_671_3 = (sg.field_f == 0) ? false : true;
          stackIn_674_4 = (ke.field_u.f(8192)) ? false : true;
          ((gb) (Object) stackIn_667_0).b(ka.a(stackIn_668_1, stackIn_670_2, stackIn_671_3, stackIn_674_4), 320, (int)(2.5 * (double)var6Lifetime3) + var5Lifetime3 + 60, 16777215, -1);
          discarded$5 = this.a(60 + (var6Lifetime3 / 2 + var6Lifetime3 * 5 + var5Lifetime3), 320, 65535, gf.field_X, 1);
          stackIn_676_0 = var32;
          stackIn_677_1 = (0 == sg.field_f) ? false : true;
          stackIn_679_2 = -3567;
          stackIn_679_3 = false;
          stackIn_680_4 = (0 == qf.field_l) ? false : true;
          ((gb) (Object) stackIn_676_0).b(l.a(stackIn_677_1, stackIn_679_2, stackIn_679_3, stackIn_680_4), 320, 120 + (var5Lifetime3 + 4 * var6Lifetime3), 16777215, -1);
        }
        if (sf.field_h == 7) {
          ih.a(0);
          sf.field_h = 8;
        } else {
          if (sf.field_h == 8) {
            if (e.a(-113)) {
              sf.field_h = n.field_c;
            } else {
              sf.field_h = hk.field_Y;
              if (sf.field_h == 10) {
                da.a(7775, ql.field_c + qh.field_l * 6 + sg.field_f * 64);
                ic.field_a = ic.field_a + (sg.field_f << 6);
                me.field_f = me.field_f + (-6 + ql.field_c);
                wg.field_b = wg.field_b - (6 * qh.field_l + 1);
                stackIn_690_1 = !(hl.field_a <= 0);
                this.field_J = stackIn_690_1;
                sg.field_f = 0;
                qh.field_l = -1;
                ql.field_c = 6;
                sf.field_h = 2;
                if (qf.field_l > 0) {
                  sf.field_h = 5;
                }
              }
            }
          }
        }
        if (this.field_I > 0 &&
          da.field_e == null) {
          ed.c(0, 0, 640, 480, 0);
        }
        if (se.field_a > 0) {
          ed.d(0, 0, 640, 480, 0, se.field_a);
        }
        if (pa.field_c > 0) {
          if (pa.field_c < 256) {
            ed.d(0, 0, 640, 480, 0, pa.field_c);
          } else {
            ed.d(0, 0, 640, 480, 0, 512 - pa.field_c);
          }
        }
        if (md.field_d) {
          bk.field_b.c(0, 0, pa.field_c);
          var4 = ne.field_a;
          ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
          var5Lifetime4 = 16776960;
          if (0 == this.field_N ||
            this.field_N == -1 &&
            !(pg.field_n < 0) &&
            !(88 <= pg.field_n) &&
            !(436 > fi.field_B)) {
            if (sh.field_c == 1 ||
              hi.field_p[84]) {
              pl.field_D = true;
            }
            var5Lifetime4 = 16777215;
          }
          this.b(-12926, var4, var5Lifetime4, 44, 458 + jj.field_b.field_M / 4);
        }
        var33_ref = (ra) (uc.field_b.b((byte) 87));
        if (var33_ref != null) {
          var6Lifetime4 = this.field_M;
          if (80 > var6Lifetime4) {
            var5Lifetime5 = var6Lifetime4 / 2 - 32;
          } else {
            if (var6Lifetime4 < 230) {
              var5Lifetime5 = 8;
            } else {
              var5Lifetime5 = 123 - var6Lifetime4 / 2;
            }
          }
          ed.c(4, var5Lifetime5 - 4, 48 + jj.field_b.b(nl.field_t[var33_ref.field_n]), 40, 13158);
          ig.a(pd.field_H, 0, (byte) -110, 48, 8 + (jj.field_b.b(nl.field_t[var33_ref.field_n]) + 48), var5Lifetime5 - 8);
          ui.field_a[var33_ref.field_n].a(8, var5Lifetime5, 32, 32);
          jj.field_b.c(nl.field_t[var33_ref.field_n], 48, jj.field_b.field_M + var5Lifetime5, 16776960, -1);
        }
        if (!oa.a(-25231)) {
          if (dg.b(70)) {
            rl.a(dh.a(255), false);
          }
        } else {
          ed.d(0, 0, 640, 480, 0, 128);
          ed.c(-3 - pf.c((byte) -117) / 2 + 320, 240 - (lb.a((byte) 47) / 2 + 5), 6 + pf.c((byte) 84), 10 + lb.a((byte) 47), 0);
          of.a(72);
        }
        if (ke.field_w) {
          jj.field_b.b("DEBUG PAUSE ON: PRESS 'V' TO CONTINUE", 320, 460, 16711680, 0);
        }
        fc.a((byte) 80, 0, var19, 0);
        return;
    }

    private final void u(int param0) {
        if (null != oh.field_b) {
          ub.a(-37, oh.field_b);
          oh.field_b = null;
          jj.b(0);
        }
        mi.field_E = si.a(87, 1);
        mh.field_jb = si.a(92, 2);
        mi.field_y = si.a(-117, 3);
        jl.field_u = si.a(-118, 4);
        int var2 = -60 / ((param0 - 39) / 38);
        eg.field_u = si.a(-106, 6);
        md.field_b = si.a(-90, 5);
        bc.field_a = si.a(84, 7);
        ol.a(bb.field_h, md.field_c, (byte) 109);
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 79 / ((15 - param0) / 52);
        if (param1 < 4096) {
          return 2048 > param1 ? sb.field_b[2048 - param1] : -sb.field_b[param1 - 2048];
        }
        return param1 < 6144 ? -sb.field_b[6144 - param1] : sb.field_b[param1 - 6144];
    }

    private final boolean a(int param0, int param1, int param2, String param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          var6_int = jj.field_b.b(param3);
          param1 = param1 + var6_int / 2;
          ig.a(qc.field_E, param1 - (var6_int + 16), (byte) -110, jj.field_b.field_M + 32, 32 + var6_int, param0 - jj.field_b.field_M - 16);
          if (param4 != 1) {
            this.field_R = 17;
          }
          if (pg.field_n > -var6_int + param1 - 16 &&
            16 + param1 >= pg.field_n &&
            fi.field_B > (-jj.field_b.field_M + param0 - 16) &&
            16 + param0 >= fi.field_B) {
            param2 = (65535 == param2) ? 16777215 : 0;
          }
          if (param2 == 65535) {
            param2 = 15583488;
          }
          this.b(param4 - 12927, param3, param2, param1 - 2 - jj.field_b.b(param3) / 2, -4 + param0);
          if (param2 != 16777215) {
            return false;
          }
          if (sh.field_c == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("wizardrun.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void t(int param0) {
        try {
          int fieldTemp$0 = 0;
          int[] dupTemp$4 = null;
          int incrementValue$1 = 0;
          int incrementValue$2 = 0;
          int incrementValue$3 = 0;
          int fieldTemp$5 = 0;
          int fieldTemp$6 = 0;
          ob dupTemp$7 = null;
          ob dupTemp$8 = null;
          int fieldTemp$9 = 0;
          int fieldTemp$10 = 0;
          int fieldTemp$11 = 0;
          int fieldTemp$12 = 0;
          ob dupTemp$13 = null;
          ob dupTemp$14 = null;
          int fieldTemp$15 = 0;
          int fieldTemp$16 = 0;
          int fieldTemp$17 = 0;
          int fieldTemp$18 = 0;
          int fieldTemp$19 = 0;
          int fieldTemp$20 = 0;
          int fieldTemp$21 = 0;
          int fieldTemp$22 = 0;
          int fieldTemp$23 = 0;
          ob dupTemp$24 = null;
          ob dupTemp$25 = null;
          int fieldTemp$26 = 0;
          gb stackIn_30_0 = null;
          boolean stackIn_31_1 = false;
          int stackIn_33_2;
          boolean stackIn_33_3;
          boolean stackIn_34_4;
          int stackIn_38_0 = 0;
          boolean stackIn_39_1 = false;
          int stackIn_113_0 = 0;
          int stackIn_113_1 = 0;
          int stackIn_138_0 = 0;
          int stackIn_138_1 = 0;
          int stackIn_323_0 = 0;
          int stackIn_323_1 = 0;
          int stackIn_540_0 = 0;
          int stackIn_540_1 = 0;
          int stackIn_594_0 = 0;
          int stackIn_595_1 = 0;
          int stackIn_688_0 = 0;
          int stackIn_688_1 = 0;
          int stackIn_759_0 = 0;
          int stackIn_759_1 = 0;
          int stackIn_766_0 = 0;
          int stackIn_767_1 = 0;
          boolean stackIn_777_0 = false;
          int stackIn_789_0 = 0;
          int stackIn_789_1 = 0;
          int stackIn_820_0 = 0;
          int stackIn_855_0 = 0;
          int stackIn_855_1 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          ob var2_ref_ob = null;
          int var3 = 0;
          int var4 = 0;
          byte[] var4_ref_byte__ = null;
          int var5 = 0;
          int var6_int = 0;
          Exception var6 = null;
          int var7 = 0;
          int var8 = 0;
          ob var9 = null;
          ob var10 = null;
          gb var11 = null;
          byte[] var12 = null;
          ob var13 = null;
          ob var14 = null;
          byte[] var15 = null;
          int stackIn_113_0Lifetime1;
          int stackIn_113_1Lifetime1;
          int stackIn_138_0Lifetime1;
          int stackIn_138_1Lifetime1;
          int stackIn_323_0Lifetime1;
          int stackIn_323_1Lifetime1;
          int stackIn_540_0Lifetime1;
          int stackIn_540_1Lifetime1;
          int stackIn_688_0Lifetime1;
          int stackIn_688_1Lifetime1;
          int stackIn_759_0Lifetime1;
          int stackIn_759_1Lifetime1;
          int stackIn_789_0Lifetime1;
          int stackIn_789_1Lifetime1;
          int stackIn_855_0Lifetime1;
          int stackIn_855_0Lifetime2;
          int stackIn_855_1Lifetime1;
          int stackIn_855_1Lifetime2;
          int var7Lifetime1;
          var8 = field_H;
          if (sf.field_h == 2 &&
            0 < qf.field_l) {
            sf.field_h = 5;
          }
          if (nl.field_y > 0) {
            nl.field_y = nl.field_y - 1;
          }
          if (sf.field_h == 0) {
            this.field_N = 0;
            this.field_K = pg.field_n;
            this.field_S = fi.field_B;
          }
          if (pg.field_n != this.field_K ||
            ~fi.field_B != ~this.field_S ||
            sh.field_c == 1) {
            this.field_K = pg.field_n;
            this.field_S = fi.field_B;
            this.field_N = -1;
          }
          if (6 == sf.field_h) {
            var11 = a.field_a;
            var3 = 180 + var11.field_M;
            var4 = 4 + (var11.field_B + var11.field_q);
            var6_int = 320;
            var5 = jj.field_b.b(cd.field_d);
            var7 = var4 * 4 + var3;
            var6_int = var6_int + var5 / 2;
            if (-16 - var5 + var6_int < pg.field_n &&
              pg.field_n <= (16 + var6_int) &&
              (-jj.field_b.field_M + var7 - 16) < fi.field_B &&
              fi.field_B <= var7 + 16 &&
              1 == w.field_c) {
              sl.a(6, 10, -127);
            }
            var6_int = 320;
            var5 = jj.field_b.b(gf.field_X);
            var7Lifetime1 = 60 + (var4 / 2 + var3) + var4 * 5;
            var6_int = var6_int + var5 / 2;
            if ((-var5 + var6_int - 16) < pg.field_n &&
              pg.field_n <= (var6_int + 16) &&
              fi.field_B > (-16 + (-jj.field_b.field_M + var7Lifetime1)) &&
              16 + var7Lifetime1 >= fi.field_B &&
              w.field_c == 1) {
              ei.field_k = 0;
              qf.field_l = 0;
              ke.field_u.a(false);
              ie.field_l.a(false);
              hi.field_a = -350;
              sf.field_h = 9;
              pl.field_A = 0;
              tb.a(0, true);
            }
            stackIn_30_0 = var11;
            stackIn_31_1 = (sg.field_f == 0) ? false : true;
            stackIn_33_2 = -3567;
            stackIn_33_3 = false;
            stackIn_34_4 = (qf.field_l == 0) ? false : true;
            ((gb) (Object) stackIn_30_0).b(l.a(stackIn_31_1, stackIn_33_2, stackIn_33_3, stackIn_34_4), 320, var4 * 4 + (var3 + 120), 16777215, -1);
          }
          if (sf.field_h == 9) {
            stackIn_38_0 = param0 - 54;
            stackIn_39_1 = (dg.b(98)) ? false : true;
            var2 = kd.a(stackIn_38_0, stackIn_39_1);
            if (var2 == 3) {
              nl.a(jg.f(param0 ^ 641), true);
            }
            if (1 == var2) {
              if (pa.field_c <= 0) {
                pa.field_c = pa.field_c + 32;
              }
              this.field_N = 0;
            }
            this.field_J = true;
            if (var2 == 2) {
              if (pa.field_c <= 0) {
                pa.field_c = pa.field_c + 32;
              }
              this.field_N = -1;
            }
          }
          if (5 == sf.field_h) {
            if (w.field_c != 0 &&
              cb.field_f != -1) {
              if (~tk.field_a == ~cb.field_f) {
                tk.field_a = -1;
              } else {
                tk.field_a = cb.field_f;
              }
            }
          } else {
            tk.field_a = -1;
          }
          if (md.field_d) {
            if (!pl.field_D) {
              if (256 > pa.field_c) {
                pa.field_c = pa.field_c + 32;
              }
            } else {
              if (pa.field_c > 0) {
                pa.field_c = pa.field_c - 32;
              }
              if (pa.field_c == 0) {
                pl.field_D = false;
                md.field_d = false;
              }
            }
            while (ae.a(param0 ^ 706)) {
              if (vk.field_r != 13 &&
                !hi.field_p[84]) {
                continue;
              }
              pl.field_D = true;
            }
          } else {
            if (hi.field_a >= 240) {
              hi.field_a = hi.field_a - 8;
              if (hi.field_a < 240) {
                if (qh.field_l == 0 &&
                  !pg.field_q &&
                  qh.field_g >= 0) {
                  hi.field_a = 240;
                }
                if (hi.field_p[84] ||
                  hi.field_p[13] ||
                  sh.field_c != 0) {
                  hi.field_a = -10;
                }
              }
            } else {
              if (hi.field_a > -1000) {
                hi.field_a = hi.field_a - 8;
              }
            }
            if (uc.field_b.b((byte) 55) != null) {
              fieldTemp$0 = this.field_M + 1;
              this.field_M = this.field_M + 1;
              if (335 == fieldTemp$0) {
                this.field_M = 0;
                uc.field_b.b(-40);
              }
            }
            if (this.field_I > 0) {
              this.field_I = this.field_I - 1;
            }
            if (0 < pa.field_c) {
              pa.field_c = pa.field_c + 32;
              if (256 == pa.field_c) {
                if (sf.field_h == 0) {
                  if (th.field_i == 1) {
                    sf.field_h = 1;
                  }
                  if (th.field_i == 3) {
                    sf.field_h = 2;
                  }
                  if (4 == th.field_i) {
                    sf.field_h = 5;
                  }
                  if (th.field_i == 5) {
                    sf.field_h = 11;
                  }
                } else {
                  if (sf.field_h == 5 &&
                    qf.field_l > 0 &&
                    th.field_i == 3) {
                    qf.field_l = 0;
                    sf.field_h = 2;
                  } else {
                    if (5 == sf.field_h) {
                      qf.field_l = 0;
                    }
                    if (sf.field_h == 2) {
                      th.field_g = null;
                    }
                    sf.field_h = 0;
                    if (!this.field_J) {
                      tb.a(0, true);
                      this.field_J = true;
                      sf.field_h = 9;
                    }
                  }
                }
              }
              if (pa.field_c >= 512) {
                pa.field_c = 0;
              }
            } else {
              if (sf.field_h == 0 &&
                null == da.field_e &&
                2 != wi.field_K) {
                if (og.field_R.length > rc.field_a) {
                  rf.field_b = rf.field_b - 1;
                }
                if (0 > rf.field_b) {
                  rf.field_b = 8;
                  var2 = 0;
                  while (true) {
                    if (var2 < 25) {
                      pb.field_k = pb.field_k + 1;
                      stackIn_113_0 = -101;
                      stackIn_113_1 = ~pb.field_k;
                      if (stackIn_113_0 >= stackIn_113_1) {
                        pb.field_k = 0;
                      }
                      md.field_a[pb.field_k][0] = jj.field_b.b(og.field_R[rc.field_a]) * (-13 + var2) / 25 + 177;
                      md.field_a[pb.field_k][1] = (int)(-Math.random() * (double)jj.field_b.field_M + 208.0 + (double)(32 * rc.field_a));
                      md.field_a[pb.field_k][2] = 128;
                      var2++;
                      continue;
                    }
                    stackIn_113_0Lifetime1 = rc.field_a;
                    stackIn_113_1Lifetime1 = 1;
                    rc.field_a = stackIn_113_0Lifetime1 + stackIn_113_1Lifetime1;
                    if (!pk.field_s) {
                      break;
                    }
                    tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                    break;
                  }
                }
                var2 = 0;
                if (~pg.field_n != ~le.field_i) {
                  le.field_i = pg.field_n;
                  var2 = 1;
                }
                if (fi.field_B != qj.field_d) {
                  var2 = 1;
                  qj.field_d = fi.field_B;
                }
                if (rc.field_a < 2) {
                  var2 = 0;
                }
                if (w.field_c == 1) {
                  var2 = 1;
                }
                if (qh.field_g >= 0) {
                  L45: {
                    if (var2 != 0) {
                      si.field_h = -1;
                      var3 = 208;
                      var4 = 0;
                      while (var4 < rc.field_a) {
                        stackIn_138_0 = pg.field_n;
                        stackIn_138_1 = 27;
                        if (stackIn_138_0 >= stackIn_138_1 &&
                          pg.field_n <= 327 &&
                          fi.field_B >= (-24 + var3) &&
                          fi.field_B <= 8 + var3) {
                          si.field_h = var4;
                        }
                        var3 += 32;
                        var4++;
                      }
                      stackIn_138_0Lifetime1 = ~si.field_h;
                      stackIn_138_1Lifetime1 = -3;
                      if ((stackIn_138_0Lifetime1 == stackIn_138_1Lifetime1 ||
                        3 == si.field_h) &&
                        pg.field_n >= 144) {
                        if (sh.field_c == 1) {
                          this.a(-123, 2, si.field_h);
                          break L45;
                        }
                      } else {
                        if (w.field_c != 1) {
                          break L45;
                        }
                        this.a(54, 2, si.field_h);
                      }
                      break L45;
                    }
                    if ((2 == si.field_h ||
                      si.field_h == 3) && (pg.field_n > 144 &&
                      sh.field_c == 1)) {
                      this.a(-114, 2, si.field_h);
                    }
                  }
                  if (0 <= si.field_h) {
                    pb.field_k = pb.field_k + 1;
                    if (pb.field_k >= 100) {
                      pb.field_k = 0;
                    }
                    if (pb.field_k % 25 == 0) {
                      md.field_a[0][0] = 161 - jj.field_b.b(og.field_R[si.field_h]) / 2;
                      md.field_a[0][1] = -jj.field_b.field_M / 2 + 208 + 32 * si.field_h;
                      if (si.field_h == 2) {
                        md.field_a[0][0] = 27;
                      }
                      if (si.field_h == 3) {
                        md.field_a[0][0] = 27;
                      }
                      md.field_a[0][2] = 128;
                    }
                    if (12 == pb.field_k % 25) {
                      md.field_a[1][0] = 16 + (jj.field_b.b(og.field_R[si.field_h]) / 2 + 177);
                      if (si.field_h == 2) {
                        md.field_a[1][0] = 327;
                      }
                      md.field_a[1][1] = si.field_h * 32 + -jj.field_b.field_M / 2 + 208;
                      if (3 == si.field_h) {
                        md.field_a[1][0] = 327;
                      }
                      md.field_a[1][2] = 128;
                    }
                  }
                }
              }
            }
            if ((da.field_e == null ||
              !da.field_e.field_p) &&
              !this.field_P) {
              if (0 < se.field_a) {
                se.field_a = se.field_a / 2;
              }
              if (!(0 >= se.field_a)) {
                se.field_a = se.field_a - 1;
              }
            } else {
              if (256 > se.field_a) {
                se.field_a = se.field_a / 2 + 128;
              }
              if (256 > se.field_a) {
                se.field_a = se.field_a + 1;
              }
              if (256 == se.field_a) {
                if (this.field_P &&
                  wi.field_K != 1) {
                  this.field_P = false;
                  da.field_e = new ph();
                  rf.field_b = 0;
                  rc.field_a = 0;
                  return;
                }
                this.field_P = false;
                if (sf.field_h == 2) {
                  th.field_g = null;
                }
                da.field_e = null;
                sf.field_h = 0;
              }
            }
            if (ki.field_E != null &&
              ki.field_E.field_b) {
              di.a((byte) 60);
            }
            var2 = 0;
            while (true) {
              if (100 > var2) {
                stackIn_323_0 = 0;
                stackIn_323_1 = md.field_a[var2][2];
                if (stackIn_323_0 < stackIn_323_1) {
                  dupTemp$4 = md.field_a[var2];
                  dupTemp$4[2] = dupTemp$4[2] - 5;
                }
                var2++;
                continue;
              }
              if (this.field_L) {
                var2 = pg.field_n / 32;
                var3 = -(fi.field_B / 32) + 14;
                while (ae.a(-75)) {
                  if (vk.field_r == 13) {
                    this.field_L = false;
                    wi.field_K = 1;
                  }
                  if (vk.field_r == 41) {
                    var15 = new byte[900];
                    var12 = var15;
                    var4_ref_byte__ = var12;
                    var5 = 0;
                    for (var6_int = 0; var6_int < 300; var6_int++) {
                      incrementValue$1 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$1] = (byte)tc.field_l.field_j[var6_int];
                      incrementValue$2 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$2] = (byte)tc.field_l.field_f[var6_int];
                      incrementValue$3 = var5;
                      var5++;
                      var4_ref_byte__[incrementValue$3] = (byte)tc.field_l.field_a[var6_int];
                    }
                    fl.field_T[qh.field_l][ql.field_c] = var15;
                    try {
                      var5 = 0;
                      bk.a(var4_ref_byte__, var15.length, true, new File("level" + qh.field_l + ql.field_c + ".dat"));
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      System.out.println(var6);
                    }
                  }
                  if (16 == vk.field_r) {
                    tc.field_l.field_a[var3 * 20 + var2] = 1;
                  }
                  if (vk.field_r == 17) {
                    tc.field_l.field_a[var2 + var3 * 20] = 2;
                  }
                  if (vk.field_r == 18) {
                    tc.field_l.field_a[var2 + var3 * 20] = 3;
                  }
                  if (vk.field_r == 19) {
                    tc.field_l.field_a[20 * var3 + var2] = 4;
                  }
                  if (20 == vk.field_r) {
                    tc.field_l.field_a[var2 + 20 * var3] = 5;
                  }
                  if (vk.field_r == 35) {
                    tc.field_l.field_j[var2 + 20 * var3] = 0;
                    tc.field_l.field_f[20 * var3 + var2] = 0;
                    tc.field_l.field_a[20 * var3 + var2] = 0;
                  }
                  if (vk.field_r == 32) {
                    tc.field_l.field_j[var2 + 20 * var3] = 1;
                    tc.field_l.field_f[var2 + var3 * 20] = 1;
                  }
                  if (vk.field_r == 33) {
                    tc.field_l.field_j[20 * var3 + var2] = 2;
                    tc.field_l.field_f[20 * var3 + var2] = 1;
                  }
                  if (34 == vk.field_r) {
                    tc.field_l.field_j[20 * var3 + var2] = 3;
                    tc.field_l.field_f[var2 + var3 * 20] = 1;
                  }
                  if (vk.field_r == 48) {
                    tc.field_l.field_j[var2 + var3 * 20] = 4;
                    tc.field_l.field_f[var2 + var3 * 20] = 0;
                  }
                  if (vk.field_r == 49) {
                    tc.field_l.field_j[var3 * 20 + var2] = 5;
                    tc.field_l.field_f[var2 + var3 * 20] = 0;
                  }
                  if (50 == vk.field_r) {
                    tc.field_l.field_j[20 * var3 + var2] = 6;
                    tc.field_l.field_f[var2 + var3 * 20] = 0;
                  }
                  if (vk.field_r == 64) {
                    tc.field_l.field_j[var3 * 20 + var2] = 7;
                    tc.field_l.field_f[var3 * 20 + var2] = 0;
                  }
                  if (vk.field_r == 65) {
                    tc.field_l.field_j[var2 + 20 * var3] = 8;
                    tc.field_l.field_f[20 * var3 + var2] = 0;
                  }
                  if (vk.field_r == 66) {
                    tc.field_l.field_j[var3 * 20 + var2] = 9;
                    tc.field_l.field_f[20 * var3 + var2] = 0;
                  }
                  if (vk.field_r == 67) {
                    tc.field_l.field_j[var2 + 20 * var3] = 10;
                    tc.field_l.field_f[var2 + 20 * var3] = 0;
                  }
                  if (vk.field_r == 68) {
                    tc.field_l.field_j[var2 + var3 * 20] = 11;
                    tc.field_l.field_f[20 * var3 + var2] = 0;
                  }
                  if (vk.field_r == 69) {
                    tc.field_l.field_j[var2 + var3 * 20] = 12;
                    tc.field_l.field_f[var2 + var3 * 20] = 0;
                  }
                  if (vk.field_r == 43) {
                    hi.field_c = hi.field_c + 1;
                    ql.field_c = ql.field_c + 1;
                    if (ql.field_c == 5) {
                      ga.field_e = fb.field_a;
                      if (tl.field_e) {
                        mi.field_D.a(true, -101, ga.field_e);
                      }
                    }
                    if (ql.field_c >= 6) {
                      hi.field_c = hi.field_c - ql.field_c;
                      wg.field_b = wg.field_b + 6;
                      qh.field_l = qh.field_l + 1;
                      ql.field_c = 0;
                      if (5 >= qh.field_l) {
                        vk.a((byte) -75);
                      } else {
                        wg.field_b = wg.field_b - qh.field_l * 6;
                        me.field_f = me.field_f - 30;
                        qh.field_l = 5;
                      }
                    }
                    ni.b(7530);
                    if (2 == qh.field_l && (!(hl.field_a > 0) ||
                      e.a(param0 - 751))) {
                      this.s(208);
                    }
                  }
                  if (vk.field_r != 42) {
                    continue;
                  }
                  ql.field_c = ql.field_c - 1;
                  hi.field_c = hi.field_c + 1;
                  if (ql.field_c == 4) {
                    vk.a((byte) -59);
                  }
                  if (ql.field_c < 0) {
                    ql.field_c = 5;
                    qh.field_l = qh.field_l - 1;
                    if (qh.field_l < 0) {
                      qh.field_l = 0;
                    } else {
                      vk.a((byte) -118);
                    }
                    ga.field_e = fb.field_a;
                    if (tl.field_e) {
                      mi.field_D.a(true, param0 - 740, ga.field_e);
                    }
                  }
                  ni.b(7530);
                }
                break;
              }
              stackIn_323_0Lifetime1 = param0;
              stackIn_323_1Lifetime1 = 640;
              if (stackIn_323_0Lifetime1 != stackIn_323_1Lifetime1) {
                field_D = (o[]) null;
              }
              if (null != da.field_e) {
                this.field_I = 5;
                sf.field_h = 3;
                while (ae.a(-120)) {
                  if (vk.field_r == 13) {
                    da.field_e.field_p = true;
                    continue;
                  }
                  if (vk.field_r == 102) {
                    if (da.field_e.field_a == 2) {
                      this.a(19, -3, 2);
                    }
                    if (da.field_e.field_a != 3) {
                      continue;
                    }
                    this.a(54, -3, 3);
                    continue;
                  }
                  if (vk.field_r != 103) {
                    if (null == da.field_e) {
                      continue;
                    }
                    da.field_e.b(0);
                    continue;
                  }
                  if (da.field_e.field_a == 2) {
                    this.a(-127, 3, 2);
                  }
                  if (da.field_e.field_a != 3) {
                    continue;
                  }
                  this.a(93, 3, 3);
                }
                if (da.field_e != null) {
                  da.field_e.a(param0 ^ -642);
                }
                if (null != da.field_e) {
                  return;
                }
                sf.field_h = 0;
                return;
              }
              if (sg.field_f > ia.field_n) {
                ia.field_n = sg.field_f;
              }
              if (wi.field_K == 1) {
                while (ae.a(-65)) {
                  if (13 == vk.field_r &&
                    sf.field_h != 0) {
                    this.field_P = true;
                    if (sf.field_h != 6) {
                      return;
                    }
                    this.field_P = false;
                    tb.a(0, true);
                    this.field_J = true;
                    sf.field_h = 9;
                    return;
                  }
                  if (vk.field_r == 96 &&
                    sh.field_c == 0) {
                    if (2 == sf.field_h) {
                      if (!e.a(param0 - 755)) {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      } else {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      }
                    }
                    if (sf.field_h == 5) {
                      if (!e.a(param0 ^ -739) &&
                        qf.field_l <= 0) {
                        this.field_N = 0;
                      } else {
                        this.field_N = this.field_N - 1;
                        if (this.field_N < 0) {
                          this.field_N = 0;
                        }
                      }
                    }
                    if (sf.field_h == 11 &&
                      qh.field_l > 0 &&
                      tj.field_I < 5) {
                      qh.field_l = qh.field_l - 1;
                      wg.field_b = wg.field_b - 6;
                    }
                    if (sf.field_h == 1) {
                      this.field_N = 0;
                    }
                  }
                  if (97 == vk.field_r &&
                    0 == sh.field_c) {
                    if (sf.field_h == 2) {
                      if (e.a(param0 - 727)) {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 1) {
                          this.field_N = 1;
                        }
                      } else {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 3) {
                          this.field_N = 3;
                        }
                      }
                    }
                    if (sf.field_h == 5) {
                      if (!e.a(param0 - 751) &&
                        0 >= qf.field_l) {
                        this.field_N = 0;
                      } else {
                        this.field_N = this.field_N + 1;
                        if (this.field_N > 1) {
                          this.field_N = 1;
                        }
                      }
                    }
                    if (11 == sf.field_h &&
                      5 > qh.field_l &&
                      5 > tj.field_I) {
                      qh.field_l = qh.field_l + 1;
                      me.field_f = me.field_f - 6;
                    }
                    if (sf.field_h == 1) {
                      this.field_N = 0;
                    }
                  }
                  if (sf.field_h == 0) {
                    if (98 == vk.field_r) {
                      if (si.field_h == -1) {
                        si.field_h = 0;
                      }
                      fieldTemp$5 = si.field_h - 1;
                      si.field_h = si.field_h - 1;
                      if (fieldTemp$5 < 0) {
                        si.field_h = si.field_h + rc.field_a;
                      }
                    }
                    if (vk.field_r == 99) {
                      fieldTemp$6 = si.field_h + 1;
                      si.field_h = si.field_h + 1;
                      if (rc.field_a <= fieldTemp$6) {
                        si.field_h = si.field_h - rc.field_a;
                      }
                    }
                    if (vk.field_r == 96) {
                      this.a(89, -1, si.field_h);
                    }
                    if (vk.field_r == 97) {
                      this.a(param0 - 614, 1, si.field_h);
                    }
                    if (102 == vk.field_r) {
                      this.a(91, -3, si.field_h);
                    }
                    if (vk.field_r == 103) {
                      this.a(param0 - 530, 3, si.field_h);
                    }
                    if (vk.field_r != 84) {
                      continue;
                    }
                    this.a(param0 ^ 760, 0, si.field_h);
                    continue;
                  }
                  if (pa.field_c > 0) {
                    continue;
                  }
                  if (84 != vk.field_r) {
                    continue;
                  }
                  if (sf.field_h != 11) {
                    if (sf.field_h == 2) {
                      continue;
                    }
                    if (sf.field_h == 5) {
                      continue;
                    }
                    pa.field_c = 32;
                    continue;
                  }
                  if (qh.field_l > pl.field_A) {
                    continue;
                  }
                  if (tj.field_I >= 5) {
                    continue;
                  }
                  hi.field_c = hi.field_c + qh.field_g;
                  qh.field_g = 0;
                  nk.field_T = 0;
                  od.field_k = 0;
                  if (0 >= qh.field_l) {
                    gd.field_b = false;
                  } else {
                    gd.field_b = true;
                    me.field_f = me.field_f + 5;
                    qh.field_g = 5;
                  }
                  tj.field_I = 5;
                  if ((4 & ti.field_a) > 0) {
                    nk.field_T = 400;
                  }
                  sj.field_l = 0;
                }
                if (sf.field_h == 0) {
                  wg.field_e = jl.field_w;
                }
                if (1 == sf.field_h) {
                  wg.field_e = bk.field_b;
                }
                if (sf.field_h == 2) {
                  wg.field_e = wh.field_d;
                }
                if (5 == sf.field_h) {
                  wg.field_e = l.field_M;
                }
                if (tj.field_I > 0) {
                  tj.field_I = tj.field_I + 5;
                }
                if (4 == sf.field_h) {
                  wg.field_e = we.field_b;
                }
                if (tj.field_I == 255) {
                  th.field_g = null;
                  od.field_k = 0;
                  if (pl.field_A < qh.field_l &&
                    qh.field_l > 1) {
                    wg.field_b = wg.field_b - 3 * qh.field_l;
                    hi.field_c = hi.field_c - 3 * qh.field_l;
                    qh.field_l = 0;
                  }
                  wi.field_K = 2;
                  fa.field_a = null;
                  hi.field_c = hi.field_c - ql.field_c;
                  ql.field_c = 0;
                  vk.a((byte) -43);
                  ni.b(param0 ^ 8170);
                  if (qh.field_l == 0 &&
                    ql.field_c == 0) {
                    hi.field_a = 580;
                    bb.field_j = ef.field_F;
                  } else {
                    hi.field_a = 580;
                    bb.field_j = wg.field_f + (1 + qh.field_l) + eh.field_i + (1 + ql.field_c);
                  }
                  var9 = new ob();
                  var13 = var9;
                  var13.field_b = 2;
                  if (4 == qh.field_l &&
                    ql.field_c == 5) {
                    var13.field_b = var13.field_b + 1;
                  }
                  var9.field_a = 2;
                  ii.field_e[od.field_k].a(9147, 0, var13);
                  od.field_k = od.field_k + 1;
                  vj.c(param0 - 762);
                  da.field_g = false;
                  if (qh.field_l == 0) {
                    this.field_Q = 0;
                    pg.field_q = true;
                    this.field_R = 1;
                  } else {
                    pg.field_q = false;
                  }
                  gd.field_b = false;
                  ia.field_n = 0;
                  cd.field_e = 100;
                  ol.field_e = false;
                  if (tl.field_e &&
                    pg.field_q) {
                    mi.field_D.a(true, -115, bh.field_e);
                  }
                }
                if (510 < tj.field_I) {
                  tj.field_I = 0;
                }
                cd.field_e = cd.field_e - 1;
                if (!(cd.field_e >= 0)) {
                  cd.field_e = 0;
                }
              }
              if (2 == wi.field_K) {
                if (((ql.field_c != 0 ||
                  qh.field_l != 0) &&
                  sg.field_f > hg.field_a ||
                  ql.field_c == 0 &&
                  qh.field_l == 0 &&
                  !(qh.field_g >= 5) &&
                  !(qh.field_g <= 0)) && !pg.field_q) {
                  qh.field_g = qh.field_g + 1;
                  if (ql.field_c != 0 ||
                    qh.field_l != 0) {
                    if (hg.field_a >= 10000) {
                      hg.field_a = hg.field_a + 10000;
                    }
                    if (hg.field_a == 5000) {
                      hg.field_a = 10000;
                    }
                    if (hg.field_a == 2000) {
                      hg.field_a = 5000;
                    }
                    if (1000 == hg.field_a) {
                      hg.field_a = 2000;
                    }
                    if (hg.field_a <= 500) {
                      hg.field_a = 1000;
                    }
                  }
                  ic.field_a = ic.field_a + 1;
                  for (var2 = 0; var2 < 5; var2++) {
                    fi.field_x = 0;
                    ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                    ii.field_e[od.field_k].field_f.a(-92, ii.field_e[0].field_f);
                    ii.field_e[od.field_k].field_f.field_a = 0;
                    ii.field_e[od.field_k].field_h = -1;
                    dupTemp$7 = ii.field_e[od.field_k].field_f;
                    dupTemp$7.field_b = dupTemp$7.field_b + 80;
                    ii.field_e[od.field_k].field_e = var2 * 20;
                    fi.field_x = 0;
                    od.field_k = od.field_k + 1;
                    ii.field_e[od.field_k].a(param0 + 8507, 1, ii.field_e[0].field_i);
                    ii.field_e[od.field_k].field_f.a(param0 - 746, ii.field_e[0].field_f);
                    ii.field_e[od.field_k].field_f.field_a = 0;
                    ii.field_e[od.field_k].field_h = 1;
                    dupTemp$8 = ii.field_e[od.field_k].field_f;
                    dupTemp$8.field_b = dupTemp$8.field_b + 80;
                    ii.field_e[od.field_k].field_e = 20 * var2;
                    od.field_k = od.field_k + 1;
                  }
                }
                if (!pg.field_q) {
                  var2 = 0;
                  for (var3 = 0; od.field_k > var3; var3++) {
                    stackIn_540_0 = ii.field_e[var3].field_B;
                    stackIn_540_1 = 2;
                    if (stackIn_540_0 > stackIn_540_1) {
                      var2 = 1;
                    }
                  }
                  if (var2 == 0 &&
                    !(0 > qh.field_g) &&
                    tj.field_I == 0) {
                    if (5 == qh.field_l &&
                      ql.field_c > 5) {
                      this.field_R = 11;
                      pg.field_q = true;
                      ql.a(1, 255, 0);
                    } else {
                      tj.field_I = tj.field_I + 5;
                    }
                  }
                }
                stackIn_540_0Lifetime1 = dd.field_m;
                stackIn_540_1Lifetime1 = 2;
                if (stackIn_540_0Lifetime1 >= stackIn_540_1Lifetime1) {
                  if (hi.field_p[66]) {
                    ke.field_w = true;
                  }
                  if (hi.field_p[67]) {
                    ke.field_w = false;
                  }
                  if (ke.field_w) {
                    return;
                  }
                  if (hi.field_p[55]) {
                    tc.field_j = true;
                    tj.field_I = 5;
                    pg.field_q = false;
                    ql.field_c = 4;
                  }
                  if (hi.field_p[40]) {
                    pg.field_q = false;
                    tc.field_j = true;
                    tj.field_I = 5;
                  }
                  if (hi.field_p[39] &&
                    5 > qh.field_l) {
                    pg.field_q = false;
                    tj.field_I = 5;
                    ql.field_c = 6;
                    tc.field_j = true;
                  }
                  if (!hi.field_p[68]) {
                  }
                  if (hi.field_p[56]) {
                    if (qh.field_g > 50) {
                      qh.field_g = 5;
                      tc.field_j = true;
                    } else {
                      qh.field_g = 100;
                      tc.field_j = true;
                    }
                  }
                  if (hi.field_p[38]) {
                    tc.field_j = false;
                    sg.field_f = (int)(Math.random() * 1000.0 + 500.0);
                  }
                }
                if (50 < qh.field_g &&
                  tc.field_j) {
                  qh.field_g = 100;
                }
                if (0 < tj.field_I) {
                  tj.field_I = tj.field_I + 5;
                }
                if (tj.field_I > 510) {
                  tj.field_I = 0;
                }
                if (pg.field_q) {
                  if (this.field_R == 11) {
                    if (ii.field_e[0].field_i.field_a <= 2) {
                      if (2 < ii.field_e[0].field_i.field_b) {
                        sc.field_m.field_b = -1;
                      }
                      if (ii.field_e[0].field_i.field_b < 2) {
                        sc.field_m.field_b = 1;
                      }
                    } else {
                      sc.field_m.field_b = -1;
                    }
                    ii.field_e[0].a((byte) -123, tc.field_l);
                    if (ii.field_e[0].field_i.field_b == 2 &&
                      2 == ii.field_e[0].field_i.field_a) {
                      this.field_R = 12;
                      this.field_Q = 0;
                      if (tl.field_e) {
                        mi.field_D.a(true, param0 ^ -727, qj.field_e);
                      }
                    }
                  }
                  if (this.field_R == 12) {
                    if (this.field_Q >= 90) {
                      var10 = new ob();
                      var2_ref_ob = var10;
                      var2_ref_ob.field_b = 16 + (int)(4.0 * Math.random());
                      var2_ref_ob.field_a = (int)(Math.random() * 4.0) + 11;
                      ii.field_e[od.field_k].a(param0 + 8507, 20, var10);
                      ii.field_e[od.field_k].field_f.field_b = (int)(Math.random() * 240.0);
                      ii.field_e[od.field_k].field_f.field_a = (int)(Math.random() * 240.0);
                      ii.field_e[od.field_k].field_w = 4;
                      od.field_k = od.field_k + 1;
                    }
                    if (90 == this.field_Q) {
                      stackIn_594_0 = 0;
                      if (pk.field_s) {
                        stackIn_595_1 = 0;
                      } else {
                        stackIn_595_1 = 1;
                      }
                      if (stackIn_594_0 == stackIn_595_1) {
                        tl.field_a.a(nl.field_q[1], 100, ee.field_p * 256 / 100);
                      }
                    }
                    fieldTemp$9 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$9 > 100) {
                      this.field_R = 13;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 13) {
                    if (50 == this.field_Q &&
                      pk.field_s) {
                      tl.field_a.a(nl.field_q[2], 100, 256 * ee.field_p / 100);
                    }
                    fieldTemp$10 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$10 > 100) {
                      this.field_R = 14;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 14) {
                    fieldTemp$11 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$11) {
                      this.field_Q = 0;
                      this.field_R = 15;
                    }
                  }
                  if (this.field_R == 15) {
                    fieldTemp$12 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$12) {
                      this.field_R = 16;
                      this.field_Q = 0;
                    }
                  }
                  if (16 == this.field_R) {
                    if (this.field_Q == 75 &&
                      qh.field_g > 0) {
                      ic.field_a = ic.field_a - 64000;
                      hi.field_c = hi.field_c + 1;
                      qh.field_g = qh.field_g - 1;
                      sg.field_f = sg.field_f + 1000;
                      var2 = qh.field_g % 5;
                      fi.field_x = 0;
                      ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                      ii.field_e[od.field_k].field_f.a(-113, ii.field_e[0].field_f);
                      ii.field_e[od.field_k].field_f.field_a = 0;
                      ii.field_e[od.field_k].field_h = -1;
                      dupTemp$13 = ii.field_e[od.field_k].field_f;
                      dupTemp$13.field_b = dupTemp$13.field_b + 790;
                      ii.field_e[od.field_k].field_e = var2 * 20;
                      od.field_k = od.field_k + 1;
                      fi.field_x = 0;
                      ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                      ii.field_e[od.field_k].field_f.a(-98, ii.field_e[0].field_f);
                      ii.field_e[od.field_k].field_f.field_a = 0;
                      ii.field_e[od.field_k].field_h = 1;
                      dupTemp$14 = ii.field_e[od.field_k].field_f;
                      dupTemp$14.field_b = dupTemp$14.field_b + 790;
                      ii.field_e[od.field_k].field_e = 20 * var2;
                      this.field_Q = 70;
                      od.field_k = od.field_k + 1;
                    }
                    fieldTemp$15 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$15 > 100) {
                      this.field_R = 17;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 17) {
                    fieldTemp$16 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (200 < fieldTemp$16) {
                      hi.field_c = hi.field_c + (qh.field_g + 1);
                      me.field_f = me.field_f - 36;
                      ic.field_a = ic.field_a + (ql.field_c + 6 * qh.field_l);
                      qh.field_g = -1;
                      ql.field_c = 0;
                      qh.field_l = 6;
                    }
                  }
                  if (this.field_R == 1) {
                    this.field_Q = this.field_Q + 1;
                    if (0 == tj.field_I) {
                      this.field_Q = 0;
                      this.field_R = 2;
                    }
                  }
                  if (this.field_R == 2) {
                    fieldTemp$17 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$17) {
                      this.field_Q = 0;
                      this.field_R = 3;
                    }
                  }
                  if (this.field_R == 3) {
                    if (this.field_Q == 5 &&
                      pk.field_s) {
                      tl.field_a.a(nl.field_q[0], 100, 256 * ee.field_p / 100);
                    }
                    fieldTemp$18 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$18 > 100) {
                      this.field_Q = 0;
                      this.field_R = 4;
                    }
                  }
                  if (this.field_R == 4) {
                    fieldTemp$19 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$19 > 100) {
                      this.field_R = 5;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 5) {
                    fieldTemp$20 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$20 > 200) {
                      this.field_Q = 0;
                      this.field_R = 6;
                    }
                  }
                  if (this.field_R == 6) {
                    fieldTemp$21 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (200 < fieldTemp$21) {
                      this.field_Q = 0;
                      this.field_R = 7;
                    }
                  }
                  if (7 == this.field_R) {
                    fieldTemp$22 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$22) {
                      this.field_Q = 0;
                      this.field_R = 8;
                    }
                  }
                  if (8 == this.field_R) {
                    fieldTemp$23 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (fieldTemp$23 > 100) {
                      this.field_R = 9;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 9) {
                    if (50 == this.field_Q &&
                      tl.field_e) {
                      mi.field_D.a(true, param0 ^ -740, ga.field_e);
                    }
                    if (75 == this.field_Q &&
                      qh.field_g < 5) {
                      wg.field_b = wg.field_b - 1;
                      qh.field_g = qh.field_g + 1;
                      fi.field_x = 0;
                      var2 = qh.field_g;
                      ii.field_e[od.field_k].a(param0 ^ 8507, 1, ii.field_e[0].field_i);
                      ii.field_e[od.field_k].field_f.a(param0 ^ -751, ii.field_e[0].field_f);
                      ii.field_e[od.field_k].field_f.field_a = 0;
                      ii.field_e[od.field_k].field_h = -1;
                      dupTemp$24 = ii.field_e[od.field_k].field_f;
                      dupTemp$24.field_b = dupTemp$24.field_b + 40;
                      ii.field_e[od.field_k].field_e = var2 % 3 * 20;
                      fi.field_x = 0;
                      od.field_k = od.field_k + 1;
                      ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                      ii.field_e[od.field_k].field_f.a(-124, ii.field_e[0].field_f);
                      ii.field_e[od.field_k].field_f.field_a = 0;
                      ii.field_e[od.field_k].field_h = 1;
                      dupTemp$25 = ii.field_e[od.field_k].field_f;
                      dupTemp$25.field_b = dupTemp$25.field_b + 40;
                      ii.field_e[od.field_k].field_e = 20 * (var2 % 3);
                      od.field_k = od.field_k + 1;
                      this.field_Q = 70;
                    }
                    fieldTemp$26 = this.field_Q;
                    this.field_Q = this.field_Q + 1;
                    if (100 < fieldTemp$26) {
                      this.field_R = 10;
                      this.field_Q = 0;
                    }
                  }
                  if (this.field_R == 10) {
                    pg.field_q = false;
                    hi.field_a = 580;
                    bb.field_j = l.field_Q;
                  }
                  for (var2 = 0; od.field_k > var2; var2++) {
                    stackIn_688_0 = -1;
                    stackIn_688_1 = ~var2;
                    if (stackIn_688_0 != stackIn_688_1 ||
                      !pg.field_q) {
                      ii.field_e[var2].a((byte) -123, tc.field_l);
                    }
                  }
                }
                if (!pg.field_q) {
                  stackIn_688_0Lifetime1 = tj.field_I;
                  stackIn_688_1Lifetime1 = 255;
                  if (stackIn_688_0Lifetime1 == stackIn_688_1Lifetime1) {
                    od.field_k = 0;
                    ql.field_c = ql.field_c + 1;
                    wg.field_b = wg.field_b + 1;
                    if (ql.field_c == 5 &&
                      qh.field_l == 0 &&
                      !ol.field_e) {
                      ql.a(1, 254, 1);
                    }
                    fi.field_x = 0;
                    if (5 == ql.field_c) {
                      w.field_b = 0;
                      ga.field_e = fb.field_a;
                      if (tl.field_e) {
                        mi.field_D.a(true, -127, ga.field_e);
                      }
                      da.field_g = false;
                    }
                    if (ql.field_c >= 6) {
                      if (!da.field_g) {
                        if (qh.field_l == 0) {
                          ql.a(1, 250, 5);
                        }
                        if (1 == qh.field_l) {
                          ql.a(1, 249, 6);
                        }
                        if (qh.field_l == 2) {
                          ql.a(1, 248, 7);
                        }
                        if (qh.field_l == 3) {
                          ql.a(1, 247, 8);
                        }
                        if (qh.field_l == 4) {
                          ql.a(1, 246, 9);
                        }
                      }
                      if (!gd.field_b) {
                        if (2 == qh.field_l) {
                          ql.a(param0 ^ 641, 252, 3);
                        }
                        if (qh.field_l == 4) {
                          ql.a(1, 251, 4);
                        }
                      }
                      if (qh.field_l == 0) {
                        ql.a(1, 253, 2);
                      }
                      hi.field_c = hi.field_c - (ql.field_c - 6);
                      qh.field_l = qh.field_l + 1;
                      ql.field_c = 0;
                      if (pl.field_A < qh.field_l) {
                        ke.field_u.a(new dc(0, qh.field_l - 1, 0, 0, 0, 0), false);
                        pl.field_A = qh.field_l;
                      }
                      if (qh.field_l < 6) {
                        vk.a((byte) -71);
                      }
                    }
                    hi.field_a = 580;
                    bb.field_j = wg.field_f + (qh.field_l + 1) + eh.field_i + (1 + ql.field_c);
                    if (-1 < qh.field_g) {
                      if (qh.field_l < 6) {
                        ni.b(7530);
                      }
                      var14 = new ob();
                      var14.field_a = 2;
                      var14.field_b = 2;
                      if (qh.field_l == 4 &&
                        ql.field_c == 5) {
                        var14.field_b = var14.field_b + 1;
                      }
                      ii.field_e[od.field_k].a(9147, 0, var14);
                      od.field_k = od.field_k + 1;
                      vj.c(69);
                      ia.field_n = 0;
                      cd.field_e = 100;
                    }
                    if (qh.field_l == 2 && (!(0 < hl.field_a) ||
                      e.a(param0 ^ -766))) {
                      this.s(208);
                    }
                  }
                }
                if (qh.field_g < 0 &&
                  hi.field_a < -350) {
                  tj.field_I = 100;
                  this.s(208);
                }
                sc.field_m.field_d = false;
                sc.field_m.field_f = false;
                sc.field_m.field_b = 0;
                if (pg.field_q &&
                  0 == qh.field_l &&
                  ql.field_c == 0) {
                  while (true) {
                    if (ae.a(125)) {
                      stackIn_759_0 = 13;
                      stackIn_759_1 = vk.field_r;
                      if (stackIn_759_0 != stackIn_759_1 &&
                        vk.field_r != 84) {
                        continue;
                      }
                      bb.field_j = cc.field_b;
                      hi.field_a = 580;
                      pg.field_q = false;
                      if (tl.field_e) {
                        mi.field_D.a(true, -93, ga.field_e);
                      }
                      me.field_f = me.field_f - qh.field_g;
                      wg.field_b = wg.field_b - 5;
                      qh.field_g = 5;
                      continue;
                    }
                    stackIn_759_0Lifetime1 = ~w.field_c;
                    stackIn_759_1Lifetime1 = -2;
                    if (stackIn_759_0Lifetime1 != stackIn_759_1Lifetime1) {
                      break;
                    }
                    pg.field_q = false;
                    me.field_f = me.field_f - qh.field_g;
                    hi.field_a = 580;
                    wg.field_b = wg.field_b - 5;
                    qh.field_g = 5;
                    bb.field_j = cc.field_b;
                    if (!tl.field_e) {
                      break;
                    }
                    mi.field_D.a(true, -86, ga.field_e);
                    break;
                  }
                }
                if (0 == tj.field_I) {
                  stackIn_766_0 = 0;
                  if (pg.field_q) {
                    stackIn_767_1 = 0;
                  } else {
                    stackIn_767_1 = 1;
                  }
                  if (stackIn_766_0 != stackIn_767_1) {
                    while (ae.a(88)) {
                      if (vk.field_r == 49) {
                        stackIn_777_0 = !(pk.field_s);
                        pk.field_s = stackIn_777_0;
                      } else {
                        if (vk.field_r == 70) {
                          if (tl.field_e) {
                            tl.field_e = false;
                            mi.field_D.d(-94);
                          } else {
                            tl.field_e = true;
                            mi.field_D.a(true, -101, ga.field_e);
                          }
                        }
                      }
                      if (13 != vk.field_r) {
                        continue;
                      }
                      this.field_P = true;
                      stackIn_789_0 = -2;
                      stackIn_789_1 = ~wi.field_K;
                      if (stackIn_789_0 == stackIn_789_1 &&
                        sf.field_h == 0) {
                        this.field_P = false;
                      }
                      if (sf.field_h == 6) {
                        this.field_P = false;
                        tb.a(0, true);
                        sf.field_h = 9;
                        this.field_J = true;
                      }
                      return;
                    }
                    stackIn_789_0Lifetime1 = hi.field_a;
                    stackIn_789_1Lifetime1 = -350;
                    if (stackIn_789_0Lifetime1 <= stackIn_789_1Lifetime1) {
                      if (nk.field_T < 300 &&
                        sj.field_l < 500) {
                        sj.field_l = sj.field_l + 1;
                      }
                      uc.field_g = uc.field_g + 1;
                      if (hi.field_p[96]) {
                        sc.field_m.field_b = -1;
                        if (nk.field_T < 25) {
                          nk.field_T = 50;
                          sj.field_l = 0;
                          nk.field_T = nk.field_T + 1;
                        }
                      }
                      if (uc.field_g > 40) {
                        uc.field_g = uc.field_g - 40;
                      }
                      if (hi.field_p[97]) {
                        if (nk.field_T < 25) {
                          nk.field_T = 50;
                          nk.field_T = nk.field_T + 1;
                          sj.field_l = 0;
                        }
                        sc.field_m.field_b = 1;
                      }
                      if (hi.field_p[nf.field_d] ||
                        hi.field_p[98]) {
                        sc.field_m.field_f = true;
                        if (nk.field_T >= 100 &&
                          nk.field_T < 150) {
                          sj.field_l = 0;
                          nk.field_T = 250;
                        }
                      }
                      if (hi.field_p[hh.field_S] ||
                        hi.field_p[83]) {
                        sc.field_m.field_d = true;
                        if (50 <= nk.field_T &&
                          nk.field_T < 100) {
                          nk.field_T = 100;
                          sj.field_l = 0;
                        }
                      }
                    }
                    stackIn_820_0 = (!il.field_e) ? 0 : 1;
                    var3 = stackIn_820_0;
                    var2 = 0;
                    while (var2 < od.field_k) {
                      stackIn_855_0 = 2;
                      stackIn_855_1 = ii.field_e[var2].field_B;
                      if (stackIn_855_0 < stackIn_855_1 &&
                        ii.field_e[var2].field_B != 21 &&
                        44 != ii.field_e[var2].field_B) {
                        var3 = 1;
                      }
                      if (!(hi.field_a > -350) ||
                        !(0 <= qh.field_g)) {
                        ii.field_e[var2].a((byte) -123, tc.field_l);
                      }
                      var2++;
                    }
                    if (il.field_e) {
                      if (0 >= hi.field_a) {
                        ge.field_f = ge.field_f + 1;
                      }
                      if (ql.field_c == 5 &&
                        qh.field_l == 1 &&
                        hl.field_a <= 0 &&
                        ge.field_f == 370) {
                        ge.field_f = ge.field_f + 1;
                        bb.field_j = i.field_d;
                        hi.field_a = 580;
                      }
                      if (375 < ge.field_f) {
                        var4 = od.field_k;
                        for (var2 = 0; var4 > var2; var2++) {
                          stackIn_855_0Lifetime1 = 21;
                          stackIn_855_1Lifetime1 = ii.field_e[var2].field_B;
                          if (stackIn_855_0Lifetime1 == stackIn_855_1Lifetime1) {
                            ii.field_e[var2].field_k = 1;
                          }
                        }
                      }
                    }
                    if (var3 == 0 &&
                      !il.field_e) {
                      ra.a(2);
                    }
                    stackIn_855_0Lifetime2 = -1;
                    stackIn_855_1Lifetime2 = od.field_k;
                    for (var2 = stackIn_855_0Lifetime2 + stackIn_855_1Lifetime2; var2 >= 0; var2--) {
                      if (ii.field_e[var2].field_k == 1) {
                        od.field_k = od.field_k - 1;
                        ii.field_e[var2].field_w = ii.field_e[od.field_k].field_w;
                        ii.field_e[var2].field_o = ii.field_e[od.field_k].field_o;
                        ii.field_e[var2].field_z = ii.field_e[od.field_k].field_z;
                        ii.field_e[var2].field_n = ii.field_e[od.field_k].field_n;
                        ii.field_e[var2].field_B = ii.field_e[od.field_k].field_B;
                        ii.field_e[var2].field_x = ii.field_e[od.field_k].field_x;
                        ii.field_e[var2].field_e = ii.field_e[od.field_k].field_e;
                        ii.field_e[var2].field_i.a(-116, ii.field_e[od.field_k].field_i);
                        ii.field_e[var2].field_f.a(-89, ii.field_e[od.field_k].field_f);
                        ii.field_e[var2].field_h = ii.field_e[od.field_k].field_h;
                        ii.field_e[var2].field_d = ii.field_e[od.field_k].field_d;
                        ii.field_e[var2].field_k = ii.field_e[od.field_k].field_k;
                        ii.field_e[var2].field_p = ii.field_e[od.field_k].field_p;
                        ii.field_e[var2].field_r = ii.field_e[od.field_k].field_r;
                        ii.field_e[var2].field_s = ii.field_e[od.field_k].field_s;
                        ii.field_e[var2].field_y = ii.field_e[od.field_k].field_y;
                        ii.field_e[var2].field_A = ii.field_e[od.field_k].field_A;
                        ii.field_e[var2].field_q = ii.field_e[od.field_k].field_q;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        String var6 = null;
        if (param1 == null) {
          return;
        }
        try {
          var6 = wg.a("<col", 0, "<", param1);
          int var7 = -9 % ((22 - param3) / 52);
          jj.field_b.b(var6, param4, -1 + param0, 0, -1);
          jj.field_b.b(var6, param4, 1 + param0, 0, -1);
          jj.field_b.b(var6, param4 - 1, param0, 0, -1);
          jj.field_b.b(var6, 1 + param4, param0, 0, -1);
          jj.field_b.b(param1, param4, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "wizardrun.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_34_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_12_0Lifetime1;
        boolean stackIn_34_0Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = field_H;
        try {
          if (param6 >= param2) {
            return;
          }
          if (param3 <= (1 + param6)) {
            return;
          }
          if (param3 > (param6 + 5) &&
            ~param4 != ~param5) {
            var7_int = (param4 >> 1) + ((param5 >> 1) + (param4 & param5 & 1));
            var8 = param6;
            var9 = param5;
            var10 = param4;
            var11 = param6;
            while (var11 < param3) {
              var12 = sj.field_m[var11];
              stackIn_34_0 = param0;
              if (stackIn_34_0) {
                stackIn_27_0 = ug.field_I[var12];
              } else {
                stackIn_27_0 = td.field_c[var12];
              }
              var13 = stackIn_27_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                sj.field_m[var11] = sj.field_m[var8];
                incrementValue$0 = var8;
                var8++;
                sj.field_m[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
              var11++;
            }
            wizardrun.a(param0, param1, param2, var8, var9, param5, param6);
            stackIn_34_0Lifetime1 = param0;
            wizardrun.a(stackIn_34_0Lifetime1, (byte) 11, param2, param3, param4, var10, var8);
            return;
          }
          var7_intLifetime1 = -1 + param3;
          while (true) {
            stackIn_12_0 = var7_intLifetime1;
            if (stackIn_12_0 <= param6) {
              return;
            }
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = sj.field_m[var8Lifetime1];
              var10Lifetime1 = sj.field_m[1 + var8Lifetime1];
              stackOut_15_0 = uh.a(var10Lifetime1, var9Lifetime1, param0, (byte) -54);
              stackIn_12_0Lifetime1 = stackOut_15_0 ? 1 : 0;
              stackIn_16_0 = stackOut_15_0;
              if (stackIn_16_0) {
                sj.field_m[var8Lifetime1] = var10Lifetime1;
                sj.field_m[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
            var7_intLifetime1--;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var7), "wizardrun.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = field_H;
        this.a(11, false, 8, 10, false, 9, param0, 0);
        c.a(22050, false, 10);
        wh.field_k = c.a(ld.field_g, (java.awt.Component) ((Object) field_G), 0, 512);
        pc.field_d = c.a(ld.field_g, (java.awt.Component) ((Object) field_G), 1, 22050);
        tl.field_a = new vi();
        wh.field_k.a(tl.field_a);
        mi.field_D = new fl();
        mi.field_D.a(128, 9, (byte) 108);
        pc.field_d.a(mi.field_D);
        hg.field_a = 500;
        hi.field_c = hi.field_c - sg.field_f * 64;
        wg.field_b = wg.field_b - ql.field_c;
        me.field_f = me.field_f + qh.field_l * 6;
        qh.field_l = 0;
        sg.field_f = 0;
        ia.field_n = 0;
        oe.field_d = new ol[16];
        ql.field_c = 0;
        for (var2 = 0; 16 > var2; var2++) {
          oe.field_d[var2] = new ol();
        }
        ia.field_n = oe.field_d[0].field_a;
        this.a(false, true, true, true, false);
    }

    public static void c(boolean param0) {
        field_D = null;
        field_G = null;
        field_O = null;
        if (!param0) {
          return;
        }
        field_F = null;
    }

    public final void init() {
        this.a(12, (byte) 49, "wizardrun");
    }

    private final void b(int param0, String param1, int param2, int param3, int param4) {
        jj.field_b.b(param1, param3 - 1, param4, 1377125, 1377125);
        jj.field_b.b(param1, param3, -1 + param4, 1377125, 1377125);
        if (param0 != -12926) {
          return;
        }
        try {
          jj.field_b.b(param1, param3 - 1, 1 + param4, 1377125, 1377125);
          jj.field_b.b(param1, param3 + 1, -1 + param4, 1377125, 1377125);
          jj.field_b.b(param1, -1 + param3, param4 - 1, 1377125, -1);
          jj.field_b.b(param1, param3, param4 - 2, 1377125, -1);
          jj.field_b.b(param1, param3 - 2, param4, 1377125, -1);
          jj.field_b.b(param1, param3, param4, param2, 1377125);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "wizardrun.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        if (ki.field_E != null) {
          di.a((byte) 60);
        }
        if (wh.field_k != null) {
          wh.field_k.f();
        }
        if (null != pc.field_d) {
          pc.field_d.f();
        }
        if (param0) {
          return;
        }
        ck.a((byte) 84);
    }

    final void d(int param0) {
        int var3 = field_H;
        if (param0 != 7069) {
          field_E = -28;
        }
        wizardrun.c(true);
        ra.c(114);
        oi.e(param0 - 6962);
        lk.a(param0 ^ -7070);
        oj.a((byte) 100);
        mk.a(-7241);
        mj.a(13214);
        oa.a(true);
        ve.a(true);
        ic.a(true);
        hj.a((byte) -62);
        w.a(-91);
        id.a(0);
        u.n(-18084);
        sb.a(param0 - 6516);
        da.b(113);
        ud.a(240);
        tf.b(4286);
        ta.b(param0 ^ -7070);
        ed.a();
        kl.a(param0 + 15706);
        t.a((byte) 102);
        rl.b(param0 ^ -32304);
        va.g((byte) 118);
        d.a(-5309);
        me.a((byte) -31);
        bl.a(false);
        ni.a(36);
        n.a(-1);
        ld.a((byte) -122);
        oh.a(21100);
        kj.a((byte) 64);
        wc.a(param0 ^ 7071);
        hg.a(0);
        cb.a(param0 ^ 7127);
        ci.a(false);
        tl.a((byte) -99);
        md.a((byte) -97);
        df.a((byte) 75);
        uc.a((byte) 37);
        ui.a(true);
        qi.b(false);
        na.b(0);
        cd.a(false);
        ad.a(-111);
        si.a((byte) -92);
        hi.b(param0 - 37603);
        fl.c(91);
        ol.a(false);
        eg.a(param0 - 7133);
        jk.a(param0 ^ -7150);
        ob.a(12523);
        tg.a(true);
        c.d();
        ph.e(0);
        wl.b((byte) 81);
        gi.a(false);
        ne.c(-1);
        bd.c(1);
        td.a(param0 - 7065);
        sd.a(0);
        uh.a(8192);
        mg.h((byte) -102);
        e.a((byte) -2);
        ab.a(1);
        vk.b(true);
        wf.a();
        he.c(-28471);
        ue.a(param0 - 7069);
        pi.a(32348);
        oc.a((byte) 124);
        bk.a(2);
        v.a(102);
        vd.a();
        rf.a((byte) 25);
        s.a(540);
        rj.c(28);
        ec.a(param0 - 7115);
        wi.h((byte) 117);
        kk.j((byte) 120);
        hk.e(false);
        kb.l(1);
        mh.e(true);
        nk.h(-1);
        ki.g((byte) -121);
        qc.g(-6664);
        od.a(23285);
        ih.b(0);
        pc.b(1);
        hl.a(true);
        nl.d(110);
        rk.a(param0 - 7070);
        jf.a(false);
        ge.a(true);
        ee.d(-21880);
        qj.a(-6145);
        ii.a(1000);
        i.a((byte) 43);
        aj.a();
        nc.a();
        el.a();
        qh.b((byte) -25);
        pa.a(-49);
        sl.e(-1);
        th.a((byte) 92);
        fi.d((byte) -101);
        sg.b((byte) 111);
        sk.f(100);
        fh.b((byte) -8);
        lc.a(param0 ^ -7105);
        ml.e(-86);
        ti.c((byte) -80);
        lj.a((byte) -60);
        rd.a((byte) -63);
        ll.a(param0 - 3055);
        f.a(-74);
        vl.b(param0 - 6994);
        qa.b(param0 - 17128);
        wb.a(param0 ^ -7141);
        eh.b(param0 - 7067);
        pf.a(91);
        ub.f((byte) 31);
        mi.a(param0 ^ -7071);
        tj.d(true);
        af.a(false);
        ik.f(param0 ^ -7161);
        pl.d(true);
        og.k((byte) 37);
        pe.a((byte) -106);
        gf.i((byte) -68);
        rg.i(-6);
        hd.a((byte) 111);
        wj.d(false);
        ff.d(-26);
        kc.d(112);
        l.a((byte) 101);
        ef.d(param0 ^ 20678);
        mf.e(29);
        fa.a((byte) 52);
        re.g((byte) -55);
        cj.b();
        we.a(-7077);
        vg.k(80);
        bc.a(param0 - 7067);
        ca.a((byte) -120);
        le.c(0);
        sh.a((byte) -125);
        dg.c(param0 - 6813);
        jj.a(0);
        lh.a(false);
        lf.a(-13078);
        hh.e(30828);
        jd.a(-1);
        vj.a(0);
        oe.a(31);
        dj.b(16);
        li.a();
        gk.a(-124);
        pk.a(param0 ^ -10072);
        ej.a((byte) -43);
        gh.a(-681844375);
        ac.e(0);
        il.a(true);
        uk.a((byte) -44);
        di.b((byte) 80);
        nf.b(param0 - 7190);
        ql.b(110);
        fb.a(-106);
        dl.a(param0 ^ 12465);
        ib.b((byte) -64);
        hf.a(3543);
        ia.b(false);
        cg.d(0);
        a.a(-331851056);
        rb.a(-1926289535);
        qk.a((byte) 58);
        pb.b(false);
        h.c(true);
        q.a(false);
        dh.a(false);
        ug.d(-13542);
        vb.a((byte) 126);
        gg.a();
        cf.c(10881);
        lb.b((byte) 55);
        pj.g(125);
        pd.f(-27864);
        fc.a(param0 ^ 7063);
        kh.c(0);
        bh.a((byte) 21);
        gj.a((byte) 94);
        de.a((byte) 5);
        ig.a((byte) -110);
        ag.f(param0 - 6950);
        ea.b(4);
        wh.a(339);
        vf.b(false);
        te.a(10615);
        pg.e((byte) -73);
        sf.a(125);
        hb.a(24944);
        sc.a((byte) -76);
        dc.c(param0 - 7157);
        ga.a(-44);
        wd.a((byte) 119);
        jl.d(2763306);
        tk.a(117);
        qb.b(-1);
        ke.b((byte) -110);
        cc.a((byte) -85);
        jc.g((byte) -19);
        nj.a(-89);
        ai.a(65535);
        wg.a(true);
        aa.c(false);
        of.a((byte) 118);
        sa.a((byte) -118);
        uf.a(-119);
        bb.c(24957);
        nh.d((byte) -118);
        ka.b(-30);
        vc.d(false);
        ei.a(1);
        fg.b(0);
        jg.c((byte) 100);
        rh.f(-110);
        sj.f(-128);
        hc.g(param0 ^ 2098084476);
        qf.c(true);
        kd.a(24188);
        ok.a(0);
        r.d(param0 - 6948);
        lg.a((byte) 99);
        tc.a((byte) -100);
        ie.c(-1);
        ae.b(-2076560510);
        this.field_y = null;
    }

    public wizardrun() {
        this.field_M = 0;
        this.field_J = true;
        this.field_N = -1;
    }

    static {
        field_O = new byte[520];
        field_T = -1;
        field_F = "Close";
        field_E = -1;
    }
}
