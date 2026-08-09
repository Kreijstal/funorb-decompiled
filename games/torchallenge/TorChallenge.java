/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class TorChallenge extends d {
    static sl field_I;
    static si field_H;
    static int field_G;
    static int field_E;
    public static boolean field_F;

    public final void init() {
        try {
            this.a((byte) 58, 12, "torchallenge");
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.init()");
        }
    }

    private final void t(int param0) {
        ka[] array$0 = null;
        ka[] array$1 = null;
        ka[] array$2 = null;
        ka[] array$3 = null;
        int stackIn_11_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_182_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_235_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        ka[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        ka[] var3 = null;
        ka var4_ref_ka = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7_int = 0;
        ka var7 = null;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ka var10 = null;
        ka var11 = null;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    tk.a(param0 + 101);
                    ag.field_e = ad.a(ic.field_C, bh.field_q, "", "small_font", false);
                    ph.field_o = new ka[7];
                    ph.field_o[0] = qk.a("", "overlay_title", ic.field_C, TorChallenge.a(param0, 1));
                    ph.field_o[1] = qk.a("", "overlay_pause", ic.field_C, 0);
                    ph.field_o[2] = qk.a("", "overlay_highscores", ic.field_C, 0);
                    ph.field_o[3] = qk.a("", "overlay_instructions", ic.field_C, param0 + -1);
                    ph.field_o[4] = qk.a("", "overlay_achievements", ic.field_C, 0);
                    ph.field_o[5] = qk.a("", "overlay_characters", ic.field_C, 0);
                    ph.field_o[6] = qk.a("", "overlay_levels", ic.field_C, 0);
                    ri.field_j = qk.a("", "overlay_title_tile", ic.field_C, param0 ^ 1);
                    ui.field_i = v.a("frame", 26, "", ic.field_C);
                    dh.field_cb = new ka[2][];
                    hd.field_a = v.a("main_menu_frame", param0 + 123, "", ic.field_C);
                    dh.field_cb[0] = hd.field_a;
                    dh.field_cb[1] = lk.a(-127, "char_select_frame_selected", "", ic.field_C);
                    ba.field_b = v.a("button_frame", 53, "", ic.field_C);
                    aa.field_k = lk.a(-127, "nav_frame", "", ic.field_C);
                    ph.field_m = lk.a(param0 + -129, "text_frame", "", ic.field_C);
                    qf.field_c = lk.a(-127, "seal_list", "", ic.field_C);
                    ib.field_M = lk.a(-127, "go_button", "", ic.field_C);
                    dg.field_J = v.a("instructions_frame", 35, "", ic.field_C);
                    lk.a(-127, "char_select_arrows", "", ic.field_C);
                    ua.field_d = mh.a(param0 + 52, ic.field_C, "keys", "");
                    dj.field_V = mh.a(113, ic.field_C, "keys2", "");
                    tf.field_j = lk.a(-128, "achievements_large", "", ic.field_C);
                    var2 = tf.field_j;
                    var3_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var3_int ^ -1) <= (var2.length ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4_ref_ka = var2[var3_int];
                    fd.a((byte) -44, var4_ref_ka);
                    var3_int++;
                    if (var12 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var12 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    fd.a((byte) -44, je.field_b);
                    lj.field_o = lk.a(-127, "interface_clouds", "", ic.field_C);
                    rd.field_i = lk.a(param0 ^ -127, "interface_border", "", ic.field_C);
                    ng.field_L = lk.a(param0 + -128, "interface_score_health", "", ic.field_C);
                    ph.field_h = lk.a(-127, "interface_lives_remaining", "", ic.field_C);
                    di.field_t = lk.a(-128, "interface_lives_heads", "", ic.field_C);
                    rc.field_p = lk.a(-127, "interface_bo_energy", "", ic.field_C);
                    ni.field_h = lk.a(param0 + -128, "interface_sais_energy", "", ic.field_C);
                    ba.field_d = lk.a(-128, "interface_glovepunch_energy", "", ic.field_C);
                    wf.field_b = qk.a("", "interface_seals", ic.field_C, 0);
                    dl.field_j = qk.a("", "interface_sealscollected", ic.field_C, param0 ^ 1);
                    mb.field_d = lk.a(-128, "interface_health_icon", "", ic.field_C);
                    rl.field_h = lk.a(param0 + -129, "boss_heads", "", ic.field_C);
                    la.field_f.a(-63);
                    ie.field_f = new ka[3][2];
                    ie.field_f[0][0] = rc.field_p[0];
                    ie.field_f[0][1] = rc.field_p[1];
                    ie.field_f[1][0] = ni.field_h[0];
                    ie.field_f[1][1] = ni.field_h[1];
                    ie.field_f[2][0] = ba.field_d[0];
                    ie.field_f[2][1] = ba.field_d[1];
                    dh.field_Y = qk.a("", "menu_slider", ic.field_C, 0);
                    wa.field_xb = rb.a(ic.field_C, "", (byte) -127, "intro4_bg");
                    hl.a(wa.field_xb, false, gf.field_m[3][0]);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var2_int = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var2_int >= 5) {
                        statePc = 50;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    array$0 = new ka[s.field_l[var2_int]];
                    ef.field_h[var2_int] = array$0;
                    var3_int = var2_int;
                    stackIn_51_0 = var3_int;
                    stackIn_11_0 = stackIn_51_0;
                    if (var12 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var12 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var3_int != 1) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var12 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 != var3_int) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var12 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (3 == var3_int) {
                        statePc = 44;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var3_int ^ -1) == -5) {
                        statePc = 47;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ef.field_h[var2_int][0] = qk.a("", "intro1", ic.field_C, 0);
                    if (var12 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ef.field_h[var2_int][0] = qk.a("", "intro2", ic.field_C, param0 + -1);
                    if (var12 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ef.field_h[var2_int][0] = qk.a("", "intro3", ic.field_C, param0 + -1);
                    if (var12 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ef.field_h[var2_int][0] = null;
                    ef.field_h[var2_int][1] = qk.a("", "intro4_enemies", ic.field_C, 0);
                    if (var12 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ef.field_h[var2_int][0] = qk.a("", "intro5", ic.field_C, 0);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var2_int++;
                    if (var12 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ef.field_h[3][0] = wa.field_xb.a();
                    wa.field_xb = null;
                    we.field_m = new ka[4];
                    we.field_m[0] = null;
                    qc.field_c = rb.a(ic.field_C, "", (byte) -116, "game_start_bg");
                    we.field_m[1] = qk.a("", "game_start_henhui", ic.field_C, 0);
                    we.field_m[2] = qk.a("", "game_start_ziren", ic.field_C, 0);
                    we.field_m[3] = qk.a("", "game_start_damen", ic.field_C, 0);
                    eb.field_p = new ka[2];
                    eb.field_p[0] = qk.a("", "level_start_heads", ic.field_C, param0 + -1);
                    eb.field_p[1] = qk.a("", "level_start_tower_1", ic.field_C, 0);
                    pl.field_f = new ka[4];
                    pl.field_f[0] = null;
                    ad.field_e = rb.a(ic.field_C, "", (byte) -115, "level_start_boss_bg");
                    hl.a(ad.field_e, false, 15245826);
                    pl.field_f[1] = qk.a("", "level_start_boss_1", ic.field_C, param0 + -1);
                    pl.field_f[2] = qk.a("", "level_start_boss_2", ic.field_C, 0);
                    pl.field_f[3] = qk.a("", "level_start_boss_3", ic.field_C, 0);
                    ei.field_w = new ka[4];
                    ei.field_w[0] = null;
                    lb.field_t = rb.a(ic.field_C, "", (byte) -128, "game_over_scene_bg");
                    hl.a(lb.field_t, false, 6831816);
                    ei.field_w[1] = qk.a("", "game_over_scene_henhui", ic.field_C, 0);
                    ei.field_w[2] = qk.a("", "game_over_scene_ziren", ic.field_C, param0 + -1);
                    ei.field_w[3] = qk.a("", "game_over_scene_damen", ic.field_C, 0);
                    pf.field_a = new ka[5];
                    pf.field_a[0] = null;
                    mb.field_b = qc.field_c.b();
                    hl.a(qc.field_c, false, 15245826);
                    hl.a(mb.field_b, false, 6831816);
                    pf.field_a[1] = qk.a("", "game_win_1_henhui", ic.field_C, 0);
                    pf.field_a[2] = qk.a("", "game_win_1_ziren", ic.field_C, 0);
                    pf.field_a[3] = qk.a("", "game_win_1_damen", ic.field_C, 0);
                    pf.field_a[4] = qk.a("", "game_win_1_stars", ic.field_C, 0);
                    pe.field_eb = lk.a(-127, "status_messages", "", ic.field_C);
                    var2_int = pe.field_eb.length;
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var3_int = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var2_int <= var3_int) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    pe.field_eb[var3_int].g();
                    var3_int++;
                    if (var12 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var12 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    dd.field_m = lk.a(param0 + -129, "rocket_trail", "", ic.field_C);
                    qb.a((byte) 49, dd.field_m);
                    wh.field_f = lk.a(-127, "dust_cloud", "", ic.field_C);
                    qb.a((byte) 45, wh.field_f);
                    ve.field_b = lk.a(param0 + -128, "monk1", "", ic.field_C);
                    qb.a((byte) 87, ve.field_b);
                    tf.field_a = lk.a(param0 + -128, "monk2", "", ic.field_C);
                    qb.a((byte) 81, tf.field_a);
                    oe.field_d = lk.a(param0 + -128, "monk3", "", ic.field_C);
                    qb.a((byte) 23, oe.field_d);
                    hc.field_T = lk.a(param0 ^ -127, "monk1_swooshes", "", ic.field_C);
                    qb.a((byte) 57, hc.field_T);
                    cg.field_d = lk.a(-127, "monk2_swooshes", "", ic.field_C);
                    qb.a((byte) 16, cg.field_d);
                    af.field_b = lk.a(-127, "boss1", "", ic.field_C);
                    qb.a((byte) 64, af.field_b);
                    aj.field_i = lk.a(-127, "boss1_attacks", "", ic.field_C);
                    qb.a((byte) 33, aj.field_i);
                    pl.field_c = lk.a(-127, "boss2", "", ic.field_C);
                    qb.a((byte) 72, pl.field_c);
                    s.field_n = lk.a(-127, "boss2_attacks", "", ic.field_C);
                    qb.a((byte) 109, s.field_n);
                    hi.field_F = lk.a(-127, "boss3", "", ic.field_C);
                    qb.a((byte) 126, hi.field_F);
                    nk.field_a = lk.a(-128, "boss3_attacks", "", ic.field_C);
                    qb.a((byte) 14, nk.field_a);
                    si.field_I = new ka[3][][];
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var6_int = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = -4;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 >= (var6_int ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var5 = oj.field_g[var6_int][1];
                    var4 = oj.field_g[var6_int][0];
                    si.field_I[var6_int] = new ka[var4][var5];
                    if (var12 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((var6_int ^ -1) == -1) {
                        statePc = 73;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (1 == var6_int) {
                        statePc = 72;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (2 != var6_int) {
                        statePc = 85;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var3 = lk.a(-127, "boss3_swooshes", "", ic.field_C);
                    if (var12 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var3 = lk.a(-128, "boss2_swooshes", "", ic.field_C);
                    if (var12 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var3 = lk.a(-128, "boss1_swooshes", "", ic.field_C);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    qb.a((byte) 4, var3);
                    var7_int = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var7_int >= var4) {
                        statePc = 85;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_60_0 = 0;
                    stackIn_77_0 = stackIn_60_0;
                    if (var12 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var8 = stackIn_77_0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    si.field_I[var6_int][var7_int][var8] = var3[var5 * var7_int + var8];
                    var8++;
                    if (var12 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var12 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var7_int++;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var12 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    dj.field_O = qk.a("", "spear", ic.field_C, 0);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var3 = null;
                    this.b(true);
                    var6_int = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = 3;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 <= var6_int) {
                        statePc = 112;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_113_0 = 0;
                    stackIn_91_0 = stackIn_113_0;
                    if (var12 != 0) {
                        statePc = 113;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var7_int = stackIn_91_0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = 20;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 <= var7_int) {
                        statePc = 111;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    array$1 = new ka[db.field_x[var7_int][var6_int]];
                    c.field_c[var7_int][var6_int] = array$1;
                    stackIn_89_0 = 0;
                    stackIn_95_0 = stackIn_89_0;
                    if (var12 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var8 = stackIn_95_0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (db.field_x[var7_int][var6_int] <= var8) {
                        statePc = 110;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_93_0 = var6_int;
                    stackIn_98_0 = stackIn_93_0;
                    if (var12 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    c.field_c[var7_int][var6_int][var8] = ve.field_b[var8 + var7_int * 6];
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (-2 == (var6_int ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    c.field_c[var7_int][var6_int][var8] = tf.field_a[var8 + 6 * var7_int];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (2 == var6_int) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    c.field_c[var7_int][var6_int][var8] = oe.field_d[var8 + 6 * var7_int];
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var7_int++;
                    if (var12 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    ve.field_b = null;
                    oe.field_d = null;
                    tf.field_a = null;
                    stackIn_113_0 = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var6_int = stackIn_113_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = var6_int;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (stackIn_115_0 >= 2) {
                        statePc = 133;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_134_0 = 0;
                    stackIn_117_0 = stackIn_134_0;
                    if (var12 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var7_int = stackIn_117_0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = var7_int ^ -1;
                    stackIn_119_1 = -21;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 <= stackIn_119_1) {
                        statePc = 132;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    array$2 = new ka[db.field_x[var7_int][var6_int]];
                    uf.field_o[var7_int][var6_int] = array$2;
                    stackIn_115_0 = 0;
                    stackIn_121_0 = stackIn_115_0;
                    if (var12 != 0) {
                        statePc = 115;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var8 = stackIn_121_0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if ((var8 ^ -1) <= (db.field_x[var7_int][var6_int] ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_119_0 = 0;
                    stackIn_124_0 = stackIn_119_0;
                    stackIn_119_1 = var6_int;
                    stackIn_124_1 = stackIn_119_1;
                    if (var12 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 != stackIn_124_1) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    uf.field_o[var7_int][var6_int][var8] = hc.field_T[var8 + 6 * var7_int];
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (1 != var6_int) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    uf.field_o[var7_int][var6_int][var8] = cg.field_d[var8 + 6 * var7_int];
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var7_int++;
                    if (var12 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    cg.field_d = null;
                    hc.field_T = null;
                    ak.field_a[0] = lk.a(-127, "henhui_puff", "", ic.field_C);
                    ak.field_a[1] = lk.a(param0 + -129, "ziren_puff", "", ic.field_C);
                    ak.field_a[2] = lk.a(-128, "damen_puff", "", ic.field_C);
                    ra.field_b[0][0] = qk.a("", "damen_vert_swipe", ic.field_C, param0 + -1);
                    ra.field_b[0][1] = ra.field_b[0][0].i();
                    ra.field_b[1][0] = qk.a("", "damen_angled_swipe", ic.field_C, 0);
                    ra.field_b[1][1] = ra.field_b[1][0].i();
                    stackIn_134_0 = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var6_int = stackIn_134_0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_136_0 = var6_int;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (stackIn_136_0 >= 3) {
                        statePc = 181;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_182_0 = 0;
                    stackIn_138_0 = stackIn_182_0;
                    if (var12 != 0) {
                        statePc = 182;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var7_int = stackIn_138_0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    stackIn_140_0 = var7_int;
                    stackIn_140_1 = 16;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (stackIn_140_0 >= stackIn_140_1) {
                        statePc = 180;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    array$3 = new ka[kk.field_h[var7_int][var6_int]];
                    g.field_i[var7_int][var6_int] = array$3;
                    stackIn_136_0 = 0;
                    stackIn_142_0 = stackIn_136_0;
                    if (var12 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var8 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((var8 ^ -1) <= (kk.field_h[var7_int][var6_int] ^ -1)) {
                        statePc = 179;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    stackIn_140_0 = 0;
                    stackIn_145_0 = stackIn_140_0;
                    stackIn_140_1 = var6_int;
                    stackIn_145_1 = stackIn_140_1;
                    if (var12 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (stackIn_145_0 != stackIn_145_1) {
                        statePc = 155;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (8 <= var7_int) {
                        statePc = 152;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    g.field_i[var7_int][var6_int][var8] = af.field_b[var7_int * 8 - -var8];
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    g.field_i[var7_int][var6_int][var8] = aj.field_i[var7_int * 8 - 64 - -var8];
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (1 == var6_int) {
                        statePc = 170;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var6_int == 2) {
                        statePc = 163;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if ((var7_int ^ -1) <= -9) {
                        statePc = 167;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    g.field_i[var7_int][var6_int][var8] = hi.field_F[var8 + var7_int * 8];
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    g.field_i[var7_int][var6_int][var8] = nk.field_a[var8 + var7_int * 8 - 64];
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((var7_int ^ -1) <= -9) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    g.field_i[var7_int][var6_int][var8] = pl.field_c[var8 + 8 * var7_int];
                    if (var12 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    g.field_i[var7_int][var6_int][var8] = s.field_n[8 * (-8 + var7_int) + var8];
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var8++;
                    if (var12 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var7_int++;
                    if (var12 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    ec.field_a = lk.a(param0 + -129, "tour_icon", "", ic.field_C);
                    qb.a((byte) 21, ec.field_a);
                    wi.field_d = lk.a(-127, "coins", "", ic.field_C);
                    qb.a((byte) 103, wi.field_d);
                    be.field_f = lk.a(-127, "tour_wall", "", ic.field_C);
                    ic.field_D = lk.a(param0 ^ -127, "tour_wall2", "", ic.field_C);
                    af.field_a = lk.a(-128, "tour_wall3", "", ic.field_C);
                    stackIn_182_0 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var6_int = stackIn_182_0;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if (6 <= var6_int) {
                        statePc = 193;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_194_0 = 0;
                    stackIn_185_0 = stackIn_194_0;
                    if (var12 != 0) {
                        statePc = 194;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var7_int = stackIn_185_0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if ((var7_int ^ -1) <= -3) {
                        statePc = 191;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    we.field_e[var6_int][var7_int] = new ka(ic.field_D[0].field_u, ic.field_D[0].field_x);
                    var7_int++;
                    if (var12 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var12 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var6_int++;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (var12 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_194_0 = 0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    var6_int = stackIn_194_0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (-3 >= (var6_int ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    stackIn_206_0 = 0;
                    stackIn_197_0 = stackIn_206_0;
                    if (var12 != 0) {
                        statePc = 206;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var7_int = stackIn_197_0;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (var7_int >= 2) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    re.field_v[var6_int][var7_int] = new ka(af.field_a[0].field_u, af.field_a[0].field_x);
                    var7_int++;
                    if (var12 != 0) {
                        statePc = 204;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var12 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var6_int++;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var12 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackIn_206_0 = 0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var6_int = stackIn_206_0;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    stackIn_208_0 = var6_int ^ -1;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (stackIn_208_0 <= -5) {
                        statePc = 222;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackIn_223_0 = 0;
                    stackIn_210_0 = stackIn_223_0;
                    if (var12 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var7_int = stackIn_210_0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (2 <= var7_int) {
                        statePc = 221;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    stackIn_208_0 = 0;
                    stackIn_213_0 = stackIn_208_0;
                    if (var12 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var8 = stackIn_213_0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (-3 >= (var8 ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    sf.field_d[var6_int][var7_int][var8] = new ka(be.field_f[ea.field_e * 6 - -var8].field_u, be.field_f[var8 + 6 * ea.field_e].field_x);
                    var8++;
                    if (var12 != 0) {
                        statePc = 220;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (var12 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var7_int++;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (var12 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var6_int++;
                    if (var12 == 0) {
                        statePc = 207;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    kj.field_C = lk.a(param0 + -129, "doors", "", ic.field_C);
                    qb.a((byte) 82, kj.field_C);
                    stackIn_223_0 = 8;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    var6 = new int[stackIn_223_0];
                    var8 = 90;
                    var7 = new ka(var8, var8);
                    je.field_g = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    cj.field_c = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    od.a(33, 30, 68, 90, 34, 45, je.field_g, var7, var6);
                    var6 = null;
                    var7_ref = null;
                    je.field_g.h();
                    c.field_b = qk.a("", "door_sign", ic.field_C, 0);
                    c.field_b.h();
                    si.field_F = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    si.field_F.d();
                    qg.f(33, 30, 68, 90, param0);
                    kj.field_C[1].g(0, 0);
                    la.field_f.a(101);
                    dk.field_c = new ka[4][9];
                    var9 = 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (-5 >= (var9 ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackIn_235_0 = 0;
                    stackIn_226_0 = stackIn_235_0;
                    if (var12 != 0) {
                        statePc = 235;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var10_int = stackIn_226_0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (9 <= var10_int) {
                        statePc = 232;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    dk.field_c[var9][var10_int] = wi.field_d[var10_int + var9 * 9];
                    var10_int++;
                    if (var12 != 0) {
                        statePc = 233;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (var12 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var9++;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (var12 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    wi.field_d = null;
                    lj.field_h = lk.a(param0 + -128, "clouds", "", ic.field_C);
                    qb.a((byte) 86, lj.field_h);
                    var9 = tf.field_x.field_x - -tf.field_x.field_K;
                    hh.field_b = new ka(var9, var9);
                    hh.field_b.d();
                    bc.field_f.c(0, 0, var9, var9);
                    bc.field_f = null;
                    la.field_f.a(105);
                    stackIn_235_0 = 12476;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    oj.a(gi.b(stackIn_235_0), 0, 80, false, il.field_p, 255);
                    var10 = qk.a("", "mb_frames", ic.field_C, param0 ^ 1);
                    pl.a(13267, dl.field_E, var10);
                    nj.a(qk.a("", "mb_logo", ic.field_C, 0), 2);
                    pa.a(-99, lk.a(-127, "mb_sshots", "", ic.field_C));
                    var11 = qk.a("", "mb_pricing_bg", ic.field_C, 0);
                    hc.a(10, param0 ^ 100, 10, 30, 80, 1500, 80, 10, var11);
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            stackIn_1_0 = param0 ^ param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                TorChallenge.a((String) null, false, -43, -1, (String) null, (String) null, 18);
                break L1;
              }
            }
            field_I = null;
            field_H = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "TorChallenge.L(" + param0 + ')');
        }
    }

    final void f(int param0) {
        int stackIn_82_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        ka var3_ref_ka = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_F ? 1 : 0;
        try {
          L0: {
            var2 = ab.a(102);
            if (!hc.c((byte) 57)) {
              if (!eb.field_o) {
                il.a(-20895, var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!jh.a((byte) 103)) {
                  mh.a(wa.field_qb, (byte) -125, 100.0f);
                  il.a(-20895, var2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if ((bc.field_o ^ -1) == (bb.field_h ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (16 > hk.field_e) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (-1 == bb.field_h) {
                                  break L5;
                                } else {
                                  ug.field_i[bb.field_h].e(param0 ^ 1014663489);
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              ji.field_m.c(param0 ^ 7856);
                              break L4;
                            }
                            var3_ref_ka = new ka(1, 1);
                            var3_ref_ka.field_y = qg.field_i;
                            var3_ref_ka.field_q = qg.field_g;
                            var3_ref_ka.field_u = qg.field_g;
                            var3_ref_ka.field_v = qg.field_f;
                            var3_ref_ka.field_x = qg.field_f;
                            var4 = 256 * (hk.field_e + 1 + -16) / 16;
                            var3_ref_ka.e(0, 0, var4);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if ((bc.field_o ^ -1) == 0) {
                              break L7;
                            } else {
                              ug.field_i[bc.field_o].e(param0 ^ 1014663489);
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ji.field_m.c(48);
                          break L6;
                        }
                        var3_ref_ka = new ka(1, 1);
                        var3_ref_ka.field_q = qg.field_g;
                        var3_ref_ka.field_u = qg.field_g;
                        var3_ref_ka.field_y = qg.field_i;
                        var3_ref_ka.field_v = qg.field_f;
                        var3_ref_ka.field_x = qg.field_f;
                        var4 = (-(255 * hk.field_e) + 3825) / 15;
                        var3_ref_ka.e(0, 0, var4);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L8: {
                      if (-1 != bc.field_o) {
                        break L8;
                      } else {
                        ji.field_m.c(48);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        if (bc.field_o == 8) {
                          break L10;
                        } else {
                          if (9 != bc.field_o) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ug.field_i[8].e(1014667201);
                      ug.field_i[9].e(1014667201);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      if (bc.field_o == 10) {
                        break L11;
                      } else {
                        if (11 == bc.field_o) {
                          break L11;
                        } else {
                          ug.field_i[bc.field_o].e(1014667201);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    ug.field_i[10].e(1014667201);
                    ug.field_i[11].e(param0 + 1014659393);
                    break L1;
                  }
                  L12: {
                    if (param0 == 7808) {
                      break L12;
                    } else {
                      field_G = -107;
                      break L12;
                    }
                  }
                  L13: {
                    if (vc.a(0)) {
                      qg.d(0, 0, qg.field_g, qg.field_f);
                      si.a(true, ui.field_i, ui.field_i[0].field_x + 16, 16 + ui.field_i[0].field_u);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((rb.field_b ^ -1) != -1) {
                      var3 = 256 * hk.field_e / 32;
                      if (0 >= var3) {
                        break L14;
                      } else {
                        qg.a(0, 0, qg.field_g, qg.field_f, 0, var3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (lc.a(1)) {
                      L16: {
                        if (null == gi.field_d) {
                          stackIn_82_0 = m.field_d ? 1 : 0;
                          break L16;
                        } else {
                          stackIn_82_0 = 1;
                          break L16;
                        }
                      }
                      qk.a(stackIn_82_0 != 0, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  nj.a(0, 0, var2, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              ib.a(var2, param0 + -7783, ph.a((byte) -40));
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "TorChallenge.C(" + param0 + ')');
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

    final void d(int param0) {
        RuntimeException runtimeException = null;
        kb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(false, 11, 2, 3, false, 0, 1, 39);
                        var2 = new kb();
                        var2.b(128, -122, 9);
                        kb.a(22050, 16239, sh.field_u, true, (java.awt.Component) ((Object) bg.field_P), var2);
                        lg.field_f = 1;
                        qa.field_f = 0;
                        ai.field_d = 0;
                        this.a(true, true, true, true, false);
                        if (param0 <= -62) {
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
                        var3 = 0;
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
                        if (-4 >= (var3 ^ -1)) {
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
                        ii.field_f[var3] = new int[1];
                        var3++;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ja.a((byte) 124);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.H(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = gl.field_l[param5][param6][1][0];
              var9 = gl.field_l[param5][param6][1][1];
              var10 = gl.field_l[param5][param6][2][0];
              var11 = gl.field_l[param5][param6][2][1];
              var12 = vb.field_a[param5][param6];
              if (!param3) {
                break L1;
              } else {
                TorChallenge.q(123);
                break L1;
              }
            }
            L2: {
              qg.a(ae.field_y);
              var13 = 64;
              qg.a(var8_int, param1, var9, param4);
              var14 = var12 + -1;
              if (-1 < (var14 ^ -1)) {
                var14 += 64;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var15 = var12 - -1;
              if (64 <= var15) {
                var15 -= 64;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (0 != param7) {
                  break L5;
                } else {
                  if ((64 & ic.field_E[var14][param2]) <= 0) {
                    break L5;
                  } else {
                    qg.f(var10, param1, var9, param4);
                    re.field_v[1][param6].a(var10, param1);
                    qg.b(ae.field_y);
                    if (var16 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (-1 == (param7 ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    if ((param7 ^ -1) != -2) {
                      break L7;
                    } else {
                      if (0 >= (64 & ic.field_E[var15][param2])) {
                        break L7;
                      } else {
                        qg.f(var8_int, param1, var11, param4);
                        re.field_v[1][param6].a(var8_int, param1);
                        qg.b(ae.field_y);
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  qg.f(var11, param1, -var11 + var9, var13, 0);
                  qg.a(var8_int, param1, var11, param4);
                  re.field_v[0][param6].a(var8_int, param1);
                  qg.b(ae.field_y);
                  if (var16 == 0) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              qg.f(var8_int, param1, var10 + -var8_int, var13, 0);
              qg.a(var10, param1, var9, param4);
              re.field_v[0][param6].a(var10, param1);
              qg.b(ae.field_y);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "TorChallenge.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void d(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ka[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 19;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3 = lk.a(-128, "skeleton_runner", "", ic.field_C);
                        var4 = 3;
                        var5 = 8;
                        var6 = var3.length;
                        var7 = var6 / var5;
                        var8 = var4 * var6;
                        var9 = new ka[var8];
                        var10 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = var5 ^ -1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 >= (var10 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_22_0 = 0;
                        stackIn_6_0 = stackIn_22_0;
                        if (var15 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var11 = stackIn_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var11 ^ -1) <= (var4 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_4_0 = 0;
                        stackIn_9_0 = stackIn_4_0;
                        if (var15 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = stackIn_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var13 = var7 * var10 - -var12;
                        var14 = var11 * var7 + var4 * var7 * var10 - -var12;
                        var9[var14] = var3[var13];
                        var12++;
                        if (var15 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        re.field_x[dg.field_T[1]] = var9;
                        if (var15 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        re.field_x[dg.field_T[1]] = lk.a(-128, "runner", "", ic.field_C);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qb.a((byte) 94, re.field_x[dg.field_T[1]]);
                        stackIn_22_0 = param0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 >= 80) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        field_H = (si) null;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) var3_ref), "TorChallenge.K(" + param0 + ',' + param1 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void s(int param0) {
        if (jd.field_e != null) {
            kc.a(jd.field_e, 0);
            jd.field_e = null;
            id.a(87);
        }
        if (param0 <= 111) {
            return;
        }
        try {
            ic.field_C = pe.b(4, -1);
            bh.field_q = pe.b(5, -1);
            pk.field_d = pe.b(6, -1);
            lk.field_f = pe.b(7, -1);
            cl.field_y = pe.b(8, -1);
            fh.field_f = pe.b(9, -1);
            qh.field_M = pe.b(10, -1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.D(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        boolean discarded$0 = false;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rd var3_ref_rd = null;
        bk var3_ref_bk = null;
        eh var3_ref_eh = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cl.b((byte) -117);
                        if (gi.field_d == null) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (gi.field_d.field_i) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ij.c((byte) -126);
                        ki.a((byte) 116);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = 54 / ((param0 - -39) / 43);
                        stackIn_11_0 = this;
                        stackIn_9_0 = stackIn_11_0;
                        stackIn_11_1 = -115;
                        stackIn_9_1 = stackIn_11_1;
                        if (null == gi.field_d) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_9_1;
                        stackIn_12_2 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.b(stackIn_12_1, stackIn_12_2 != 0);
                        if (tc.field_k) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.s(119);
                        tc.field_k = false;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (hc.c((byte) 63)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.i(109);
                        if (hc.c((byte) -108)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!ih.f((byte) -128)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        discarded$0 = this.a(false, (byte) 82);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return;
                }
                case 26: {
                    try {
                        if (eb.field_o) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        mc.a(bl.field_X, 83);
                        if (!this.a(true, (byte) 63)) {
                            statePc = 108;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        eb.field_o = true;
                        if (var4 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!jh.a((byte) 77)) {
                            statePc = 91;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (vc.a(0)) {
                            statePc = 65;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (lc.a(1)) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.u(0);
                        if (var4 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_50_0 = this;
                        stackIn_46_0 = stackIn_50_0;
                        if (null == gi.field_d) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = this;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_51_0 = this;
                        stackIn_51_1 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = this;
                        stackIn_51_1 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3 = this.a(stackIn_51_1 != 0, 127);
                        if ((var3 ^ -1) == -2) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var3 != 2) {
                            statePc = 64;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (gi.field_d == null) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ij.c((byte) -120);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (2 == var3) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ef.a((byte) -93, gi.b(12476));
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var4 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (-1 == (rb.field_b ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.u(0);
                        if (var4 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var3 = og.a(false);
                        if (var3 == 2) {
                            statePc = 84;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-4 == (var3 ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var3 == 4) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        fh.a(0, 7284, -2);
                        if (var4 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        il.a(true, 0);
                        if (var4 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ij.c((byte) -104);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!vc.a(0)) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ug.field_i[bc.field_o].a(3, true);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var4 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        aj.b(3);
                        if (jh.a((byte) 57)) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        bi.a(125);
                        mf.b(2);
                        if (-1 > (ee.field_o ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        cd.field_o = true;
                        if (var4 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        cd.field_o = false;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (5 != bc.field_o) {
                            statePc = 108;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (eh.field_l != 0) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        bc.field_o = 2;
                        be.a(2, (byte) -125, false);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (d.p(-77)) {
                            statePc = 126;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var3_ref_rd = (rd) ((Object) wc.field_g.a((byte) -100));
                        if (null == var3_ref_rd) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        fc.a(var3_ref_rd, 4, false);
                        if (var4 != 0) {
                            statePc = 119;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var4 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var3_ref_bk = (bk) ((Object) kj.field_B.a((byte) 102));
                        if (null == var3_ref_bk) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        ee.a(var3_ref_bk, 5, (byte) -43);
                        if (var4 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var4 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var3_ref_eh = (eh) ((Object) wj.field_b.a((byte) -113));
                        if (var3_ref_eh == null) {
                            statePc = 126;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ki.a(var3_ref_eh, 6, 160);
                        if (var4 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var4 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (!p.a(16, qc.field_h)) {
                            statePc = 133;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.j(5000);
                        if (var4 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        nb.a(0, -1);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (!nb.a(-26375)) {
                            statePc = 140;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var3 = this.e((byte) 110);
                        if ((var3 ^ -1) != -3) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        kc.f(10);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) var2), "TorChallenge.N(" + param0 + ')');
                }
                case 140: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(String param0, boolean param1, int param2, int param3, String param4, String param5, int param6) {
        qa var7 = null;
        RuntimeException var7_ref = null;
        qa var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new qa(param4);
              if (param2 == -20031) {
                break L1;
              } else {
                TorChallenge.a((String) null, false, -109, -34, (String) null, (String) null, -9);
                break L1;
              }
            }
            var8 = new qa(param0);
            stackIn_4_0 = pd.a(var8, param6, param5, param1, param3, -1, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7_ref);

            stackIn_8_1 = new StringBuilder().append("TorChallenge.G(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ',' + param6 + ')');
        }
        return stackIn_4_0;
    }

    public TorChallenge() {
    }

    private final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        Object stackIn_89_0 = null;
        int stackIn_96_0 = 0;
        Object stackIn_99_0 = null;
        int stackIn_100_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_125_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    t.a(-67);
                    if (null == pk.field_d) {
                        statePc = 63;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!aj.field_f.b(-7957)) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!aj.field_f.b(5, "basic")) {
                        statePc = 10;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 10: {
                    mh.a(pk.a(256, ra.field_m, "basic", aj.field_f, uk.field_K), (byte) -125, 3.0f);
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    if (!pk.field_d.b(-7957)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!pk.field_d.b((byte) 79)) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 18: {
                    mh.a(pk.a(256, ie.field_c, "", pk.field_d, cb.field_a), (byte) -125, 10.0f);
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    if (!lk.field_f.b(-7957)) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!lk.field_f.b((byte) 79)) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    mh.a(pk.a(256, ie.field_c, "", lk.field_f, cb.field_a), (byte) -125, 20.0f);
                    stackIn_27_0 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    if (!cl.field_y.b(-7957)) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (cl.field_y.b((byte) 79)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    mh.a(fc.a(qh.field_L, cl.field_y, 0, 89, ui.field_e), (byte) -125, 30.0f);
                    stackIn_33_0 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    if (!fh.field_f.b(-7957)) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (fh.field_f.b((byte) 79)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    mh.a(pk.a(256, ui.field_e, "", fh.field_f, qh.field_L), (byte) -125, 40.0f);
                    stackIn_39_0 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    if (!ic.field_C.b(-7957)) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (ic.field_C.b((byte) 79)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    mh.a(pk.a(256, ra.field_m, "", ic.field_C, uk.field_K), (byte) -125, 50.0f);
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    return stackIn_45_0 != 0;
                }
                case 46: {
                    if (!bh.field_q.b(-7957)) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (bh.field_q.b((byte) 79)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    mh.a(pk.a(256, ij.field_x, "", bh.field_q, wf.field_a), (byte) -125, 60.0f);
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return stackIn_51_0 != 0;
                }
                case 52: {
                    if (!qh.field_M.b(-7957)) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (qh.field_M.b((byte) 79)) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    mh.a(pk.a(256, "Loading Levels", "", qh.field_M, "Waiting for Levels"), (byte) -125, 60.0f);
                    stackIn_57_0 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    return stackIn_57_0 != 0;
                }
                case 58: {
                    mh.a(pk.field_a, (byte) -125, 65.0f);
                    if (param0) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    return stackIn_60_0 != 0;
                }
                case 61: {
                    bi.a(124);
                    this.f(7808);
                    ub.field_d = new u(pk.field_d, lk.field_f);
                    cg.field_a[0] = q.a(pk.field_d, "", "Btn_Chime").b();
                    cg.field_a[1] = q.a(pk.field_d, "", "menu_change_character").b();
                    cg.field_a[2] = q.a(pk.field_d, "", "Slider").b();
                    wl.field_c[0][0] = q.a(pk.field_d, "", "H_Jump").b();
                    wl.field_c[0][1] = q.a(pk.field_d, "", "Z_Jump").b();
                    wl.field_c[0][2] = q.a(pk.field_d, "", "D_Jump").b();
                    wl.field_c[1][0] = q.a(pk.field_d, "", "H_Land").b();
                    wl.field_c[1][1] = q.a(pk.field_d, "", "Z_Land").b();
                    wl.field_c[1][2] = q.a(pk.field_d, "", "D_Land").b();
                    wl.field_c[2][0] = q.a(pk.field_d, "", "H_Slide").b();
                    wl.field_c[2][1] = q.a(pk.field_d, "", "Z_Slide").b();
                    wl.field_c[2][2] = q.a(pk.field_d, "", "D_Slide").b();
                    wl.field_c[3][0] = q.a(pk.field_d, "", "H_Step1").b();
                    wl.field_c[3][1] = q.a(pk.field_d, "", "Z_Step1").b();
                    wl.field_c[3][2] = q.a(pk.field_d, "", "D_Step1").b();
                    wl.field_c[4][0] = q.a(pk.field_d, "", "H_Step2").b();
                    wl.field_c[4][1] = q.a(pk.field_d, "", "Z_Step2").b();
                    wl.field_c[4][2] = q.a(pk.field_d, "", "D_Step2").b();
                    wl.field_c[5][0] = q.a(pk.field_d, "", "H_Weapon_Death_Impact").b();
                    wl.field_c[5][1] = q.a(pk.field_d, "", "Z_Weapon_Death_Impact").b();
                    wl.field_c[5][2] = q.a(pk.field_d, "", "D_Weapon_Death_Impact").b();
                    ia.field_i[0][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Death").b();
                    ia.field_i[0][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Death").b();
                    ia.field_i[0][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Death").b();
                    ia.field_i[2][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Step").b();
                    ia.field_i[2][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Step").b();
                    ia.field_i[2][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Step").b();
                    ia.field_i[3][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_Jump").b();
                    ia.field_i[3][dg.field_T[1]][2] = ia.field_i[3][dg.field_T[1]][1];
                    ia.field_i[4][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_land").b();
                    ia.field_i[4][dg.field_T[1]][2] = ia.field_i[4][dg.field_T[1]][2];
                    ia.field_i[0][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Death").b();
                    ia.field_i[0][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Death").b();
                    ia.field_i[0][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Death").b();
                    ia.field_i[2][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Step").b();
                    ia.field_i[2][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Step").b();
                    ia.field_i[2][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Step").b();
                    ia.field_i[4][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_Land").b();
                    ia.field_i[4][dg.field_T[2]][1] = ia.field_i[4][dg.field_T[2]][0];
                    ia.field_i[4][dg.field_T[2]][2] = ia.field_i[4][dg.field_T[2]][0];
                    ia.field_i[6][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Spit").b();
                    ia.field_i[6][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Spit").b();
                    ia.field_i[6][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Spit").b();
                    ia.field_i[4][dg.field_T[7]][0] = q.a(pk.field_d, "", "Spitter_1_Spit_Impact").b();
                    ia.field_i[4][dg.field_T[7]][1] = q.a(pk.field_d, "", "Spitter_2_Spit_Impact").b();
                    ia.field_i[4][dg.field_T[7]][2] = q.a(pk.field_d, "", "Spitter_3_Spit_Impact").b();
                    ia.field_i[0][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_1_Death").b();
                    ia.field_i[0][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_2_Death").b();
                    ia.field_i[0][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Death").b();
                    ia.field_i[7][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Charge_Step").b();
                    ia.field_i[4][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Land").b();
                    ia.field_i[4][dg.field_T[3]][1] = ia.field_i[4][dg.field_T[3]][0];
                    ia.field_i[4][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][0];
                    ia.field_i[6][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_Rock_Throw").b();
                    ia.field_i[6][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][1];
                    ia.field_i[2][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Step").b();
                    ia.field_i[2][dg.field_T[3]][1] = ia.field_i[2][dg.field_T[3]][0];
                    ia.field_i[2][dg.field_T[3]][2] = ia.field_i[2][dg.field_T[3]][0];
                    ia.field_i[4][dg.field_T[22]][1] = q.a(pk.field_d, "", "Thud_Rock_Impact").b();
                    ia.field_i[4][dg.field_T[22]][2] = ia.field_i[4][dg.field_T[22]][1];
                    ia.field_i[0][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_1_Death").b();
                    ia.field_i[0][dg.field_T[4]][1] = q.a(pk.field_d, "", "Rocket_2_Death").b();
                    ia.field_i[0][dg.field_T[4]][2] = q.a(pk.field_d, "", "Rocket_3_Death").b();
                    ia.field_i[1][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_Roar_Loop").b();
                    ia.field_i[1][dg.field_T[4]][1] = ia.field_i[1][dg.field_T[4]][0];
                    ia.field_i[1][dg.field_T[4]][2] = ia.field_i[1][dg.field_T[4]][1];
                    ia.field_i[0][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_1_Death").b();
                    ia.field_i[0][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Death").b();
                    ia.field_i[0][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Death").b();
                    ia.field_i[2][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Move").b();
                    ia.field_i[2][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Move").b();
                    ia.field_i[5][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Fall").b();
                    ia.field_i[5][dg.field_T[5]][1] = ia.field_i[5][dg.field_T[5]][0];
                    ia.field_i[5][dg.field_T[5]][2] = ia.field_i[5][dg.field_T[5]][0];
                    ia.field_i[4][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Impact").b();
                    ia.field_i[4][dg.field_T[5]][1] = ia.field_i[4][dg.field_T[5]][0];
                    ia.field_i[4][dg.field_T[5]][2] = ia.field_i[4][dg.field_T[5]][0];
                    ia.field_i[0][dg.field_T[6]][0] = q.a(pk.field_d, "", "Grinder_2_Death").b();
                    ia.field_i[4][dg.field_T[6]][1] = q.a(pk.field_d, "", "Grinder_2_Wall_Impact").b();
                    ia.field_i[4][dg.field_T[6]][2] = q.a(pk.field_d, "", "Grinder_3_Wall_Impact").b();
                    bf.field_c[0][0] = q.a(pk.field_d, "", "Boss_1_Jump").b();
                    bf.field_c[0][1] = q.a(pk.field_d, "", "Boss_1_Land").b();
                    bf.field_c[0][2] = q.a(pk.field_d, "", "Boss_1_Miss_Combo").b();
                    bf.field_c[0][3] = q.a(pk.field_d, "", "Boss_1_Step").b();
                    bf.field_c[0][4] = q.a(pk.field_d, "", "Boss_1_Step2").b();
                    bf.field_c[0][5] = q.a(pk.field_d, "", "Boss_1_Weapon_Impact").b();
                    bf.field_c[1][0] = q.a(pk.field_d, "", "Boss_2_Jump").b();
                    bf.field_c[1][1] = q.a(pk.field_d, "", "Boss_2_Land").b();
                    bf.field_c[1][2] = q.a(pk.field_d, "", "Boss_2_Miss_Combo").b();
                    bf.field_c[1][3] = q.a(pk.field_d, "", "Boss_2_Step").b();
                    bf.field_c[1][5] = q.a(pk.field_d, "", "Boss_2_Weapon_Impact").b();
                    bf.field_c[2][0] = q.a(pk.field_d, "", "Boss_3_Jump").b();
                    bf.field_c[2][1] = q.a(pk.field_d, "", "Boss_3_Land").b();
                    bf.field_c[2][2] = q.a(pk.field_d, "", "Boss_3_Miss_Combo").b();
                    bf.field_c[2][3] = q.a(pk.field_d, "", "Boss_3_Step").b();
                    bf.field_c[2][4] = q.a(pk.field_d, "", "Boss_3_Step2").b();
                    bf.field_c[2][5] = q.a(pk.field_d, "", "Boss_3_Weapon_Impact").b();
                    cj.field_h[0] = q.a(pk.field_d, "", "collect1").b();
                    cj.field_h[1] = q.a(pk.field_d, "", "collect2").b();
                    cj.field_h[2] = q.a(pk.field_d, "", "Exit_Door").b();
                    cj.field_h[3] = q.a(pk.field_d, "", "Extra_HP").b();
                    cj.field_h[4] = q.a(pk.field_d, "", "Extra_Life").b();
                    cj.field_h[5] = q.a(pk.field_d, "", "Health_Drink").b();
                    cj.field_h[6] = q.a(pk.field_d, "", "Help_Bubble").b();
                    cj.field_h[7] = q.a(pk.field_d, "", "seal_active").b();
                    cj.field_h[8] = q.a(pk.field_d, "", "seal_achieved").b();
                    cj.field_h[9] = q.a(pk.field_d, "", "Timer").b();
                    cj.field_h[10] = q.a(pk.field_d, "", "Timer_Ending").b();
                    cj.field_h[11] = cj.field_h[7];
                    cj.field_h[12] = q.a(pk.field_d, "", "Exit_Door_active").b();
                    pk.field_d = null;
                    id.a(62);
                    stackIn_62_0 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    return stackIn_62_0 != 0;
                }
                case 63: {
                    if (qh.field_M == null) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    je.field_c = new byte[cg.field_c.length][];
                    var3_int = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if ((var3_int ^ -1) <= (je.field_c.length ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    je.field_c[var3_int] = qh.field_M.a(-2, cg.field_c[var3_int], "");
                    var3_int++;
                    if (var4 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var4 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    qh.field_M = null;
                    id.a(108);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return stackIn_72_0 != 0;
                }
                case 73: {
                    if (null != lk.field_f) {
                        statePc = 76;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 76: {
                    mh.a(pk.field_a, (byte) -125, 70.0f);
                    this.f(7808);
                    cg.field_a[3] = wg.a(lk.field_f, "", "Henhui_character_select").c();
                    cg.field_a[4] = wg.a(lk.field_f, "", "Ziren_character_select").c();
                    cg.field_a[5] = wg.a(lk.field_f, "", "Damen_character_select").c();
                    cg.field_a[6] = wg.a(lk.field_f, "", "TOR_Challenge_Menu").c();
                    cg.field_a[7] = wg.a(lk.field_f, "", "menu_character_selected_gong").c();
                    cg.field_a[8] = wg.a(lk.field_f, "", "menu_TOWER").c();
                    cg.field_a[9] = wg.a(lk.field_f, "", "menu_ONE").c();
                    cg.field_a[10] = wg.a(lk.field_f, "", "menu_TWO").c();
                    cg.field_a[11] = wg.a(lk.field_f, "", "menu_THREE").c();
                    cg.field_a[12] = wg.a(lk.field_f, "", "menu_FOUR").c();
                    cg.field_a[13] = wg.a(lk.field_f, "", "menu_FIVE").c();
                    cg.field_a[14] = wg.a(lk.field_f, "", "menu_SIX").c();
                    cg.field_a[15] = wg.a(lk.field_f, "", "menu_READY").c();
                    cg.field_a[16] = wg.a(lk.field_f, "", "menu_YOU_LOSE").c();
                    wl.field_c[6][0] = wg.a(lk.field_f, "", "H_Attack_1").c();
                    wl.field_c[6][1] = wg.a(lk.field_f, "", "Z_Attack_1").c();
                    wl.field_c[6][2] = wg.a(lk.field_f, "", "D_Attack_1").c();
                    wl.field_c[7][0] = wg.a(lk.field_f, "", "H_Attack_2").c();
                    wl.field_c[7][1] = wg.a(lk.field_f, "", "Z_Attack_2").c();
                    wl.field_c[7][2] = wg.a(lk.field_f, "", "D_Attack_2").c();
                    wl.field_c[8][0] = wg.a(lk.field_f, "", "H_Attack_3_combo").c();
                    wl.field_c[8][1] = wg.a(lk.field_f, "", "Z_Attack_3_combo").c();
                    wl.field_c[8][2] = wg.a(lk.field_f, "", "D_Attack_3_combo").c();
                    wl.field_c[9][0] = wg.a(lk.field_f, "", "H_Attack_2_spec").c();
                    wl.field_c[9][1] = wg.a(lk.field_f, "", "Z_Attack_2_spec").c();
                    wl.field_c[9][2] = wg.a(lk.field_f, "", "D_Attack_2_spec").c();
                    wl.field_c[10][0] = wg.a(lk.field_f, "", "H_Death").c();
                    wl.field_c[10][1] = wg.a(lk.field_f, "", "Z_Death").c();
                    wl.field_c[10][2] = wg.a(lk.field_f, "", "D_Death").c();
                    wl.field_c[11][0] = wg.a(lk.field_f, "", "H_Hit_1").c();
                    wl.field_c[11][1] = wg.a(lk.field_f, "", "Z_Hit_1").c();
                    wl.field_c[11][2] = wg.a(lk.field_f, "", "D_Hit_1").c();
                    wl.field_c[12][0] = wg.a(lk.field_f, "", "H_Hit_2").c();
                    wl.field_c[12][1] = wg.a(lk.field_f, "", "Z_Hit_2").c();
                    wl.field_c[12][2] = wg.a(lk.field_f, "", "D_Hit_2").c();
                    wl.field_c[13][0] = wg.a(lk.field_f, "", "H_Hit_3").c();
                    wl.field_c[13][1] = wg.a(lk.field_f, "", "Z_Hit_3").c();
                    wl.field_c[13][2] = wg.a(lk.field_f, "", "D_Hit_3").c();
                    bf.field_c[0][6] = wg.a(lk.field_f, "", "Boss_1_Attack_combo").c();
                    bf.field_c[0][7] = wg.a(lk.field_f, "", "Boss_1_Death").c();
                    bf.field_c[0][8] = wg.a(lk.field_f, "", "Boss_1_Hit").c();
                    bf.field_c[1][6] = wg.a(lk.field_f, "", "Boss_2_Attack_combo").c();
                    bf.field_c[1][7] = wg.a(lk.field_f, "", "Boss_2_Death").c();
                    bf.field_c[1][8] = wg.a(lk.field_f, "", "Boss_2_Hit").c();
                    bf.field_c[2][6] = wg.a(lk.field_f, "", "Boss_3_Attack_combo").c();
                    bf.field_c[2][7] = wg.a(lk.field_f, "", "Boss_3_Death").c();
                    bf.field_c[2][8] = wg.a(lk.field_f, "", "Boss_3_Hit").c();
                    lk.field_f = null;
                    id.a(102);
                    stackIn_77_0 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    return stackIn_77_0 != 0;
                }
                case 78: {
                    if (null != fh.field_f) {
                        statePc = 81;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 81: {
                    mh.a(wc.field_a, (byte) -125, 75.0f);
                    this.f(7808);
                    al.field_x[0] = ej.a(fh.field_f, "", "TOR_Lvl_1");
                    al.field_x[1] = ej.a(fh.field_f, "", "TOR_Lvl_2");
                    al.field_x[2] = ej.a(fh.field_f, "", "TOR_Lvl_3");
                    al.field_x[3] = ej.a(fh.field_f, "", "TOR_Lvl_4");
                    al.field_x[4] = ej.a(fh.field_f, "", "TOR_Lvl_5");
                    al.field_x[5] = ej.a(fh.field_f, "", "TOR_Lvl_6");
                    al.field_x[6] = ej.a(fh.field_f, "", "TOR_Boss_Fight");
                    al.field_x[7] = ej.a(fh.field_f, "", "TOR_Title");
                    al.field_x[8] = ej.a(fh.field_f, "", "TOR_Menu");
                    al.field_x[9] = ej.a(fh.field_f, "", "TOR_lvl_start_jingle");
                    al.field_x[10] = ej.a(fh.field_f, "", "TOR_lvl_complete_jingle");
                    al.field_x[11] = ej.a(fh.field_f, "", "TOR_boss_complete_jingle");
                    al.field_x[12] = ej.a(fh.field_f, "", "TOR_game_over_jingle");
                    al.field_x[13] = ej.a(fh.field_f, "", "TOR_Complete");
                    fh.field_f = null;
                    id.a(126);
                    stackIn_82_0 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    return stackIn_82_0 != 0;
                }
                case 83: {
                    if (cl.field_y != null) {
                        statePc = 86;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var3_int = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (14 <= var3_int) {
                        statePc = 98;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_99_0 = null;
                    stackIn_89_0 = stackIn_99_0;
                    if (var4 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 == al.field_x[var3_int]) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (la.field_a.a(false, ub.field_d, al.field_x[var3_int], cl.field_y, 176400)) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_96_0 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    return stackIn_96_0 != 0;
                }
                case 97: {
                    var3_int++;
                    if (var4 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    la.field_a.b(true);
                    cl.field_y = null;
                    stackIn_99_0 = null;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    ub.field_d = (u) ((Object) stackIn_99_0);
                    id.a(47);
                    stackIn_100_0 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    return stackIn_100_0 != 0;
                }
                case 101: {
                    if (aj.field_f != null) {
                        statePc = 104;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 104: {
                    je.field_b = qk.a("basic", "unachieved", aj.field_f, 0);
                    bc.field_f = qk.a("basic", "orbcoin", aj.field_f, 0);
                    hb.field_c = qk.a("basic", "locked", aj.field_f, 0);
                    fd.a((byte) -44, je.field_b);
                    fd.a((byte) -44, bc.field_f);
                    fd.a((byte) -44, hb.field_c);
                    ul.a(aj.field_f, -1656370552, ad.field_g);
                    aj.field_f = null;
                    id.a(51);
                    stackIn_105_0 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    return stackIn_105_0 != 0;
                }
                case 106: {
                    if (ic.field_C == null) {
                        statePc = 109;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    mh.a(vb.field_e, (byte) -125, 90.0f);
                    this.f(7808);
                    this.t(1);
                    ic.field_C = null;
                    bh.field_q = null;
                    id.a(67);
                    stackIn_108_0 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    return stackIn_108_0 != 0;
                }
                case 109: {
                    if (!param0) {
                        statePc = 121;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    m.b((byte) -98);
                    var3_int = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (16 <= var3_int) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    ug.field_i[var3_int] = new pd(var3_int, (TorChallenge) (this));
                    var3_int++;
                    if (var4 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var4 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    bb.field_h = 12;
                    bc.field_o = 12;
                    ug.field_i[12].a(3, true);
                    al.b(50, true);
                    u.a((byte) 102, 50);
                    o.a(-126, 50);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (!d.p(-83)) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    qa.field_g = be.a(4, 31315);
                    vh.field_d = new tc[3];
                    vh.field_d[0] = v.b(1, 256, 5, 0);
                    vh.field_d[1] = v.b(1, 256, 5, 1);
                    vh.field_d[2] = v.b(1, 256, 5, 2);
                    eb.field_l = kk.b(6, -6262);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (param1 > 34) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    TorChallenge.q(-52);
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    id.a(60);
                    stackIn_125_0 = 1;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    return stackIn_125_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void u(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_H = (si) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((rb.field_b ^ -1) == -1) {
                  break L3;
                } else {
                  L4: {
                    if ((rb.field_b ^ -1) == -2) {
                      break L4;
                    } else {
                      L5: {
                        if ((rb.field_b ^ -1) == -3) {
                          break L5;
                        } else {
                          L6: {
                            if (-1 <= (hk.field_e ^ -1)) {
                              break L6;
                            } else {
                              hk.field_e = hk.field_e - 1;
                              break L6;
                            }
                          }
                          L7: {
                            if (0 <= hk.field_e) {
                              break L7;
                            } else {
                              hk.field_e = 0;
                              break L7;
                            }
                          }
                          if ((hk.field_e ^ -1) != -1) {
                            break L2;
                          } else {
                            rb.field_b = 0;
                            if (var3 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L8: {
                        L9: {
                          if (!d.p(-115)) {
                            break L9;
                          } else {
                            bc.field_o = m.field_h;
                            if (var3 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          qa.field_g = be.a(4, param0 ^ 31315);
                          vh.field_d = new tc[4];
                          vh.field_d[0] = v.b(1, TorChallenge.a(param0, 256), 5, 0);
                          vh.field_d[1] = v.b(1, 256, 5, 1);
                          vh.field_d[2] = v.b(1, 256, 5, 2);
                          eb.field_l = kk.b(6, param0 + -6262);
                          if (null != ji.field_m) {
                            gl.field_a = true;
                            oi.a(true, true, false);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (ji.field_m != null) {
                            ji.field_m.c((byte) -66);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        bc.field_o = lj.field_e;
                        if (bc.field_o == -2) {
                          bc.field_o = 0;
                          il.a(false, 0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      rb.field_b = 3;
                      hk.field_e = 31;
                      bb.field_h = bc.field_o;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hk.field_e = hk.field_e + 1;
                  if (32 == hk.field_e) {
                    L12: {
                      L13: {
                        if (!vc.a(0)) {
                          break L13;
                        } else {
                          vl.a((byte) -88);
                          if (var3 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      dj.f((byte) -83);
                      break L12;
                    }
                    rb.field_b = 2;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L14: {
                if (bc.field_o == bb.field_h) {
                  break L14;
                } else {
                  L15: {
                    hk.field_e = hk.field_e + 1;
                    if (16 > hk.field_e) {
                      break L15;
                    } else {
                      if ((bc.field_o ^ -1) != -4) {
                        break L15;
                      } else {
                        if ((bb.field_h ^ -1) == -2) {
                          if (oi.field_g) {
                            L16: {
                              L17: {
                                if (dj.field_Q < 0) {
                                  break L17;
                                } else {
                                  if ((n.field_jb ^ -1) == (dj.field_Q ^ -1)) {
                                    break L17;
                                  } else {
                                    n.field_jb = dj.field_Q;
                                    if (var3 == 0) {
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              n.field_jb = 0;
                              break L16;
                            }
                            L18: {
                              L19: {
                                oi.field_g = false;
                                if ((kj.field_A ^ -1) > -1) {
                                  break L19;
                                } else {
                                  if (i.field_r != kj.field_A) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              i.field_r = 0;
                              if (var3 == 0) {
                                break L15;
                              } else {
                                break L18;
                              }
                            }
                            i.field_r = kj.field_A;
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  if (32 == hk.field_e) {
                    L20: {
                      if (bc.field_o != 2) {
                        break L20;
                      } else {
                        rc.field_r = null;
                        break L20;
                      }
                    }
                    L21: {
                      if (-2 != (bc.field_o ^ -1)) {
                        break L21;
                      } else {
                        vd.b(0);
                        break L21;
                      }
                    }
                    bc.field_o = bb.field_h;
                    cf.field_b = bc.field_o;
                    hk.field_e = 0;
                    if (bc.field_o != 0) {
                      break L2;
                    } else {
                      if (cj.field_e) {
                        h.a(6, 4);
                        cj.field_e = false;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L14;
                        }
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L22: {
                if ((bc.field_o ^ -1) == 0) {
                  break L22;
                } else {
                  L23: {
                    L24: {
                      if (8 == bc.field_o) {
                        break L24;
                      } else {
                        if (bc.field_o != 9) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    ug.field_i[8].f(9504);
                    ug.field_i[9].f(9504);
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L23;
                    }
                  }
                  L25: {
                    L26: {
                      if (-11 == (bc.field_o ^ -1)) {
                        break L26;
                      } else {
                        if (11 != bc.field_o) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    ug.field_i[10].f(9504);
                    ug.field_i[11].f(9504);
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L25;
                    }
                  }
                  L27: {
                    if (3 == bc.field_o) {
                      break L27;
                    } else {
                      ug.field_i[bc.field_o].f(9504);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L27;
                      }
                    }
                  }
                  ug.field_i[3].f(9504);
                  ug.field_i[14].f(9504);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L22;
                  }
                }
              }
              ji.field_m.a(param0 + 21);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.O(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              ae.a(4);
              if (gi.field_d != null) {
                ij.c((byte) -94);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = -126 / ((11 - param0) / 36);
            rl.c(-94);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.J(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        ka[] array$0 = null;
        ka[] array$1 = null;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = g.a(124, 0) ? 1 : 0;
                        this.d(83, var2_int != 0);
                        re.field_x[dg.field_T[2]] = lk.a(-128, "spitter", "", ic.field_C);
                        qb.a((byte) 69, re.field_x[dg.field_T[2]]);
                        re.field_x[dg.field_T[7]] = lk.a(-127, "spittle", "", ic.field_C);
                        qb.a((byte) 85, re.field_x[dg.field_T[7]]);
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.d((byte) 102);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        re.field_x[dg.field_T[3]] = lk.a(-127, "thudder", "", ic.field_C);
                        qb.a((byte) 46, re.field_x[dg.field_T[3]]);
                        re.field_x[dg.field_T[4]] = lk.a(-127, "rocketeer", "", ic.field_C);
                        qb.a((byte) 114, re.field_x[dg.field_T[4]]);
                        re.field_x[dg.field_T[5]] = lk.a(-127, "slimer", "", ic.field_C);
                        qb.a((byte) 65, re.field_x[dg.field_T[5]]);
                        re.field_x[dg.field_T[6]] = lk.a(-127, "grinder", "", ic.field_C);
                        qb.a((byte) 21, re.field_x[dg.field_T[6]]);
                        re.field_x[dg.field_T[22]] = lk.a(-128, "rock", "", ic.field_C);
                        qb.a((byte) 56, re.field_x[dg.field_T[22]]);
                        var3 = new int[8];
                        var4 = new int[8];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-9 >= (var5 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3[var5] = re.field_x[var5].length / 8;
                        var4[var5] = var3[var5] / 3;
                        var5++;
                        if (var9 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 8;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 <= var5) {
                            statePc = 31;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_32_0 = 1;
                        stackIn_14_0 = stackIn_32_0;
                        if (var9 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = var6 ^ -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 <= -9) {
                            statePc = 30;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_12_0 = 0;
                        stackIn_18_0 = stackIn_12_0;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var7 ^ -1) <= -4) {
                            statePc = 29;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        array$0 = new ka[h.field_b[var6][var5][var7]];
                        ah.field_d[var5][var6][var7] = array$0;
                        stackIn_16_0 = 0;
                        stackIn_21_0 = stackIn_16_0;
                        if (var9 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((h.field_b[var6][var5][var7] ^ -1) >= (var8 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ah.field_d[var5][var6][var7][var8] = re.field_x[var5][var8 + var7 * var4[var5] + var6 * var3[var5]];
                        var8++;
                        if (var9 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5++;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var5;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= 8) {
                            statePc = 50;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var9 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-4 >= (var6 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        array$1 = new ka[h.field_b[0][var5][var6]];
                        ah.field_d[var5][0][var6] = array$1;
                        stackIn_34_0 = 0;
                        stackIn_39_0 = stackIn_34_0;
                        if (var9 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var7 >= h.field_b[0][var5][var6]) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ah.field_d[var5][0][var6][var7] = ah.field_d[var5][1][var6][var7];
                        var7++;
                        if (var9 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5++;
                        if (var9 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) var2), "TorChallenge.M(" + param0 + ')');
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean r(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1592) {
                break L1;
              } else {
                field_H = (si) null;
                break L1;
              }
            }
            stackIn_4_0 = eb.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "TorChallenge.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              TorChallenge.q(1);
              sl.e(25840);
              lj.a(11446);
              ki.a(64);
              ea.a((byte) -106);
              sd.a((byte) -55);
              ac.b(-93);
              id.a(false);
              gb.a(123);
              kf.a((byte) -100);
              d.h(127);
              jd.a(640);
              ug.a((byte) -57);
              we.a(25910);
              mj.a((byte) -36);
              vf.a((byte) -79);
              og.a(-117);
              if (param0 >= 103) {
                break L1;
              } else {
                TorChallenge.a((String) null, true, -106, 32, (String) null, (String) null, -51);
                break L1;
              }
            }
            qg.c();
            eg.a();
            qc.a((byte) 26);
            nk.a(250);
            uf.d(128);
            ol.a((byte) -99);
            mb.a((byte) -116);
            ik.a(true);
            c.b(0);
            ub.a((byte) -52);
            hk.b(0);
            wj.a(23801);
            pl.a((byte) -74);
            bf.a(-14471);
            wh.a(false);
            ve.a(-126);
            gi.a(10);
            jl.b(118);
            oe.b(-15721);
            r.a((byte) 96);
            ad.a(0);
            cd.b((byte) 79);
            u.a(-26193);
            pd.k(1);
            wl.b(10);
            lk.a(-89);
            qb.a(2316);
            vd.a(-38);
            vb.d(0);
            rb.b(-98);
            oa.b(122);
            rk.b(true);
            wb.a(true);
            da.a((byte) -92);
            kb.c(128);
            dl.b(false);
            pc.b();
            pg.c(16);
            kh.a();
            fj.b(false);
            a.b((byte) 106);
            rl.b((byte) -82);
            rc.b(true);
            h.a(38);
            ec.a(-1);
            ck.b(255);
            qe.d(true);
            ra.a((byte) 125);
            tf.a((byte) 106);
            hd.a((byte) 102);
            kl.a(-102);
            le.a(true);
            mg.a((byte) 113);
            vj.a((byte) 95);
            si.d((byte) 69);
            ta.p(255);
            pe.m(4210752);
            jf.n(-118);
            wa.n(104);
            dg.h(-110);
            ih.h(99);
            fg.f((byte) -86);
            ib.c(false);
            qa.a(-1);
            dk.a(23592);
            tj.a(120);
            dc.a();
            wg.b();
            l.b();
            sa.a((byte) 104);
            ok.a(32097);
            jj.a((byte) 124);
            de.a((byte) 103);
            hh.a((byte) 126);
            pa.n(6);
            bi.b(0);
            jc.a(-108);
            tg.b(false);
            w.b((byte) 68);
            fi.d();
            vl.a(0);
            jh.a(-14282);
            ah.a(44);
            am.a(98);
            t.b(68);
            cg.b((byte) -13);
            aj.a(0);
            fh.a((byte) -88);
            wi.c(1);
            of.a(8727);
            wc.a((byte) -48);
            nl.a();
            ei.a(-113);
            ed.a(91);
            bb.b(6);
            fl.e(-25984);
            ii.b(16711680);
            db.h(117);
            la.b((byte) -64);
            al.c((byte) 99);
            di.a(false);
            nd.a(0);
            ai.a(2048);
            sh.b(true);
            cb.b(-9386);
            nh.l(-25725);
            te.a((byte) -50);
            bc.a((byte) 46);
            oc.a();
            nb.b(-128);
            ti.a(true);
            vg.c(606002657);
            pi.b((byte) -119);
            mh.a((byte) -55);
            oj.a(106);
            ch.a(false);
            af.a(-7604);
            kg.e(-8796);
            aa.a(2432);
            pk.a(false);
            vc.a(false);
            gh.a(-16742);
            mf.a(3);
            ob.a(887316838);
            mc.a(false);
            ga.b((byte) -79);
            g.a(28215);
            ph.a(2);
            lg.a(-27840);
            ee.f(107);
            ng.c(true);
            ic.g(1);
            v.c(false);
            b.a(0);
            kj.g(-10365);
            nj.b((byte) -40);
            pf.a(0);
            oh.a(-4);
            lh.g(116);
            cj.b(0);
            sf.a(false);
            je.a(-98);
            hl.a(-106);
            ca.a(32);
            ba.a((byte) -5);
            ie.a((byte) 33);
            gl.a(-26425);
            bj.b(-38);
            bd.b((byte) 126);
            dd.d(15752);
            ja.a(75);
            s.a(2);
            ua.a(102);
            ul.d(-31397);
            td.c(0);
            fb.a(1012);
            ab.a(true);
            bg.h(0);
            rf.i((byte) 96);
            dj.l(65);
            n.l(5);
            ek.c((byte) 123);
            li.c(true);
            df.a(-1);
            tk.c((byte) 87);
            dh.g(112);
            hc.a(-110);
            wf.a((byte) -116);
            qh.f((byte) -36);
            uc.a(-15087);
            bl.e(false);
            ce.a();
            be.a(3366);
            oi.d(10166);
            fa.b(-3);
            m.a(128);
            uk.d((byte) 50);
            k.a(true);
            fd.b(0);
            ak.a((byte) -103);
            lb.d(18972);
            re.e((byte) -114);
            fc.c(67);
            qf.a((byte) 75);
            md.b(-1);
            ag.b(640);
            ae.b(true);
            ji.a(65535);
            vk.a(68);
            e.b((byte) -83);
            o.b(true);
            cl.c((byte) 110);
            me.a(-13978);
            fk.b((byte) -88);
            ij.b(42);
            hf.b(19199);
            hi.h(-1);
            qk.c(false);
            ue.c((byte) 126);
            ni.a(true);
            ql.a(4707);
            rd.b((byte) -60);
            tc.a(127);
            bk.b((byte) -128);
            eb.a(237);
            eh.c((byte) 121);
            ne.a((byte) -116);
            ef.b(-124);
            vh.c(-44);
            cf.a(-113);
            lc.b((byte) -75);
            sj.a(15638);
            hb.a(false);
            na.e(-7345);
            ri.g(12);
            kk.f(61);
            ll.a(256);
            kd.a(8192);
            gj.a(-909082559);
            qi.a((byte) -81);
            i.g(-14298);
            bh.f(1);
            il.g(8);
            kc.d((byte) 102);
            ci.f(68);
            gf.d((byte) -113);
            p.a(true);
            ia.b((byte) 79);
            rj.a(10);
            ui.c((byte) -125);
            vi.a(-57);
            this.field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.P(" + param0 + ')');
        }
    }

    static {
        field_I = null;
        field_E = 0;
        field_G = 640;
    }
}
