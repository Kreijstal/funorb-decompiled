/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.io.PrintStream;

public final class Lexicominos extends nk {
    static db field_I;
    static String field_H;
    private boolean field_K;
    static boolean field_M;
    static int field_G;
    static boolean field_E;
    static String field_F;
    private int field_J;
    public static boolean field_L;

    private final boolean a(byte param0, boolean param1) {
        db dupTemp$0 = null;
        db dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_144_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int[] stackIn_161_0 = null;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int[] stackIn_170_0 = null;
        int stackIn_173_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_194_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_207_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_210_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_222_0 = 0;
        eb[] stackIn_233_0 = null;
        eb[] stackIn_241_0 = null;
        eb[] stackIn_244_0 = null;
        eb[] stackIn_251_0 = null;
        boolean stackIn_254_0 = false;
        int stackIn_261_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_269_0 = 0;
        int stackIn_278_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_253_0;
        int statePc = 0;
        ke var3 = null;
        int var3_int = 0;
        db[] var3_array = null;
        eb[] var3_array2 = null;
        RuntimeException var3_ref = null;
        ke var4_ref_ke = null;
        int var4 = 0;
        int var5_int = 0;
        eb[] var5 = null;
        db var6_ref_db = null;
        int var6 = 0;
        int var7_int = 0;
        db var7 = null;
        int[] var7_array = null;
        db[] var7_array2 = null;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (kc.field_m[0] != null) {
                        statePc = 96;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!th.field_p.c(-61)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (th.field_p.a("basic", 10762)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    al.a(16, rh.a(th.field_p, (byte) 55, "basic", pe.field_e, qf.field_s), 0.0f);
                    stackIn_9_0 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    if (!th.field_p.a("roman20", param0 + 10848)) {
                        statePc = 13;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 13: {
                    al.a(16, rh.a(th.field_p, (byte) 68, "roman20", v.field_t, li.field_P), 0.0f);
                    stackIn_14_0 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    if (!th.field_p.a("roman12", 10762)) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 18: {
                    al.a(16, rh.a(th.field_p, (byte) 94, "roman12", v.field_t, li.field_P), 0.0f);
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    if (!gg.field_d.c(106)) {
                        statePc = 26;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!gg.field_d.a("roman20", 10762)) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    al.a(16, rh.a(gg.field_d, (byte) 37, "roman20", v.field_t, li.field_P), 0.0f);
                    stackIn_27_0 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    if (gg.field_d.a("roman12", param0 ^ -10848)) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    al.a(16, rh.a(gg.field_d, (byte) 124, "roman12", v.field_t, li.field_P), 0.0f);
                    stackIn_30_0 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    if (!gl.field_a.c(81)) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (gl.field_a.a((byte) -124)) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    al.a(param0 + 102, rh.a(gl.field_a, (byte) 122, "", kj.field_p, e.field_h), 1.0f);
                    stackIn_36_0 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return stackIn_36_0 != 0;
                }
                case 37: {
                    if (!hc.field_gb.c(79)) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!hc.field_gb.a((byte) 120)) {
                        statePc = 43;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 43: {
                    al.a(param0 + 102, rh.a(hc.field_gb, (byte) 37, "", kj.field_p, e.field_h), 4.0f);
                    stackIn_44_0 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return stackIn_44_0 != 0;
                }
                case 45: {
                    if (!ga.field_a.c(-114)) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!ga.field_a.a((byte) -118)) {
                        statePc = 51;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 51: {
                    al.a(16, qg.a((byte) 100, ga.field_a, ni.field_d, 0, fj.field_y), 5.0f);
                    stackIn_52_0 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    return stackIn_52_0 != 0;
                }
                case 53: {
                    if (!ec.field_b.c(113)) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (!ec.field_b.a((byte) 70)) {
                        statePc = 59;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 59: {
                    al.a(16, rh.a(ec.field_b, (byte) 42, "", ni.field_d, fj.field_y), 6.0f);
                    stackIn_60_0 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    return stackIn_60_0 != 0;
                }
                case 61: {
                    if (!dl.field_d.c(87)) {
                        statePc = 67;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (!dl.field_d.a((byte) -118)) {
                        statePc = 67;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 67: {
                    al.a(16, rh.a(dl.field_d, (byte) 98, "", pe.field_e, qf.field_s), 9.0f);
                    stackIn_68_0 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    return stackIn_68_0 != 0;
                }
                case 69: {
                    if (!ci.field_e.c(param0 ^ -5)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (ci.field_e.a((byte) 55)) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    al.a(16, rh.a(ci.field_e, (byte) 113, "", v.field_t, li.field_P), 10.0f);
                    stackIn_74_0 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    return stackIn_74_0 != 0;
                }
                case 75: {
                    if (!hh.field_L.c(99)) {
                        statePc = 81;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (!hh.field_L.a((byte) -127)) {
                        statePc = 81;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 81: {
                    al.a(16, rh.a(hh.field_L, (byte) 119, "", ia.field_F, ee.field_e), (float)(10 + hh.field_L.b("", (byte) 112) * 76 / 100));
                    stackIn_82_0 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    return stackIn_82_0 != 0;
                }
                case 83: {
                    if (!ci.field_a.c(118)) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (ci.field_a.a((byte) 15)) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    al.a(16, rh.a(ci.field_a, (byte) 97, "index", fg.field_a, sg.field_f), 86.0f);
                    stackIn_88_0 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    return stackIn_88_0 != 0;
                }
                case 89: {
                    al.a(param0 + 102, qk.field_b, 90.0f);
                    this.d(18380);
                    if (!param1) {
                        statePc = 92;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    return stackIn_93_0 != 0;
                }
                case 94: {
                    kj.c(true);
                    kc.field_m[0] = sd.a(gl.field_a, "", "turnover_page").c();
                    kc.field_m[1] = sd.a(gl.field_a, "", "drop_book").c();
                    kc.field_m[4] = sd.a(gl.field_a, "", "x2").c();
                    kc.field_m[5] = sd.a(gl.field_a, "", "x3").c();
                    kc.field_m[6] = sd.a(gl.field_a, "", "x4").c();
                    kc.field_m[7] = sd.a(gl.field_a, "", "x5").c();
                    var3 = sd.a(gl.field_a, "", "score_increase_loop").c();
                    var4_ref_ke = sd.a(gl.field_a, "", "score_increase_stop").c();
                    kc.field_m[2] = aj.a((byte) -42, var4_ref_ke, var3);
                    th.field_o[2] = cc.a(kc.field_m[2], 100, 128);
                    kc.field_m[8] = ba.a(hc.field_gb, "", "lexi_block_stop").a();
                    vb.field_r = new ja(hc.field_gb, gl.field_a);
                    kc.field_m[9] = vb.field_r.a((byte) -80, "drum_075_claves");
                    th.field_o[9] = cc.a(kc.field_m[9], 100, 128);
                    dl.b(5);
                    stackIn_95_0 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    return stackIn_95_0 != 0;
                }
                case 96: {
                    if (ec.field_b == null) {
                        statePc = 109;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    al.a(16, pl.field_b, 91.0f);
                    this.d(param0 + 18466);
                    hc.field_gb = null;
                    gl.field_a = null;
                    aa.field_i[0] = ih.a(ec.field_b, "", "game");
                    aa.field_i[1] = ih.a(ec.field_b, "", "game2");
                    aa.field_i[2] = ih.a(ec.field_b, "", "game3");
                    aa.field_i[3] = ih.a(ec.field_b, "", "game4");
                    aa.field_i[4] = ih.a(ec.field_b, "", "game5");
                    aa.field_i[5] = ih.a(ec.field_b, "", "panic");
                    aa.field_i[6] = ih.a(ec.field_b, "", "titlescreen");
                    aa.field_i[7] = ih.a(ec.field_b, "", "gameover");
                    var3_int = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (aa.field_i.length <= var3_int) {
                        statePc = 106;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var17 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (aa.field_i[var3_int] == null) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    uh.field_n.field_A.a(0, aa.field_i[var3_int], (byte) 102, vb.field_r, ga.field_a);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var3_int++;
                    if (var17 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    uh.field_n.field_A.c(-94);
                    ga.field_a = null;
                    vb.field_r = null;
                    ec.field_b = null;
                    dl.b(5);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    return stackIn_108_0 != 0;
                }
                case 109: {
                    if (null == th.field_p) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ob.field_e = df.a("basic", "orbcoin", th.field_p, (byte) -70);
                    e.field_u = df.a("basic", "unachieved", th.field_p, (byte) -41);
                    bi.field_a = hb.a(gg.field_d, 246, "roman20", "", th.field_p);
                    mk.field_h = hb.a(gg.field_d, 246, "roman12", "", th.field_p);
                    tb.field_a = hb.a(dl.field_d, "scorefont", "", ci.field_e, -2569);
                    jh.field_d = hb.a(ci.field_e, 246, "", "lexfont", dl.field_d);
                    th.field_p = null;
                    gg.field_d = null;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (jj.field_f != null) {
                        statePc = 220;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    al.a(param0 ^ -70, gf.field_q, 92.0f);
                    this.d(18380);
                    cb.field_n = df.a("", "bookbg", dl.field_d, (byte) -69);
                    pa.field_a = df.a("", "leftpage", dl.field_d, (byte) -83);
                    va.field_m = df.a("", "rightpage", dl.field_d, (byte) -64);
                    var3_array = td.a("", "frame", dl.field_d, 22306);
                    var4 = 150;
                    var5_int = 100;
                    var6_ref_db = new db(var4, var5_int);
                    var6_ref_db.b();
                    va.field_m.b(-104, -198);
                    var3_array[4] = new db(var4 << 668183681, var5_int << -930153823);
                    var3_array[4].b();
                    var6_ref_db.b(0, 0);
                    var6_ref_db.g(var4, 0);
                    var6_ref_db.d();
                    var6_ref_db.b(0, var5_int);
                    var6_ref_db.g(var4, var5_int);
                    nh.field_c = new db[9];
                    qb.field_o = new db[9];
                    var7_int = 0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if ((var7_int ^ -1) <= -10) {
                        statePc = 125;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_127_0 = -5;
                    stackIn_116_0 = stackIn_127_0;
                    stackIn_127_1 = var7_int ^ -1;
                    stackIn_116_1 = stackIn_127_1;
                    if (var17 != 0) {
                        statePc = 127;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != stackIn_116_1) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    qb.field_o[var7_int] = var3_array[var7_int];
                    nh.field_c[var7_int] = null;
                    if (var17 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    qb.field_o[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                    qb.field_o[var7_int].b();
                    var3_array[var7_int].e(0, 0, 11345438);
                    nh.field_c[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                    nh.field_c[var7_int].b();
                    var3_array[var7_int].e(0, 0, 13343019);
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var7_int++;
                    if (var17 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var3_array = td.a("", "frame2", dl.field_d, param0 + 22392);
                    jh.field_b = new db[9];
                    var7_int = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = -10;
                    stackIn_127_1 = var7_int ^ -1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0 >= stackIn_127_1) {
                        statePc = 140;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var17 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (-5 != (var7_int ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    jh.field_b[var7_int] = null;
                    if (var17 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    jh.field_b[var7_int] = new db(var3_array[var7_int].field_p, var3_array[var7_int].field_u);
                    jh.field_b[var7_int].b();
                    var3_array[var7_int].e(0, 0, 13343019);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var7_int++;
                    if (var17 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    ef.field_d = td.a("", "achievements_lrg", dl.field_d, 22306);
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var7 = df.a("", "glass_case", dl.field_d, (byte) -54);
                    var7.e();
                    var8_ref_int__ = var7.field_y;
                    ef.field_d[10].e();
                    var9 = ef.field_d[10].field_y;
                    var10_int = 0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if ((var10_int ^ -1) <= -16385) {
                        statePc = 149;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var11_int = var8_ref_int__[var10_int];
                    stackIn_150_0 = 0;
                    stackIn_144_0 = stackIn_150_0;
                    if (var17 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (stackIn_144_0 == var11_int) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var12 = var11_int >> 462656835 & 31 | var11_int >> -2070198650 & 1020;
                    var13 = 256 + -var12;
                    var14 = var9[var10_int];
                    var15 = var14 & 16711935;
                    var16 = 65280 & var14;
                    var9[var10_int] = tb.a(vg.a(var13 * var15 + var12 * 16711935 >> 1286219176, 16711935), vg.a(65280, var13 * var16 + var12 * 65280 >> -2121242232));
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var10_int++;
                    if (var17 == 0) {
                        statePc = 142;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    ef.field_d[10].f();
                    stackIn_150_0 = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var7_int = stackIn_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (ef.field_d.length <= var7_int) {
                        statePc = 156;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    ee.a((byte) -102, ef.field_d[var7_int]);
                    var7_int++;
                    if (var17 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var17 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    ee.a((byte) -102, e.field_u);
                    fc.field_e = new db[ef.field_d.length];
                    md.field_A = new db[ef.field_d.length];
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var7_int = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    stackIn_159_0 = var7_int;
                    stackIn_159_1 = fc.field_e.length;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (stackIn_159_0 >= stackIn_159_1) {
                        statePc = 169;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    fc.field_e[var7_int] = this.a(-128, ef.field_d[var7_int]);
                    md.field_A[var7_int] = fc.field_e[var7_int].c();
                    var8_ref_int__ = md.field_A[var7_int].field_y;
                    stackIn_170_0 = (int[]) (var8_ref_int__);
                    stackIn_161_0 = stackIn_170_0;
                    if (var17 != 0) {
                        statePc = 170;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var9_int = stackIn_161_0.length + -1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (0 > var9_int) {
                        statePc = 168;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_159_0 = var8_ref_int__[var9_int];
                    stackIn_164_0 = stackIn_159_0;
                    stackIn_159_1 = 16777215;
                    stackIn_164_1 = stackIn_159_1;
                    if (var17 != 0) {
                        statePc = 159;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (stackIn_164_0 == stackIn_164_1) {
                        statePc = 166;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var8_ref_int__[var9_int] = 9639960;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var9_int--;
                    if (var17 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var7_int++;
                    if (var17 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    ri.field_b = this.a(param0 ^ -62, e.field_u);
                    fl.field_c = ri.field_b.c();
                    stackIn_170_0 = fl.field_c.field_y;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var7_array = stackIn_170_0;
                    var8 = -1 + var7_array.length;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if ((var8 ^ -1) > -1) {
                        statePc = 179;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    stackIn_180_0 = var7_array[var8];
                    stackIn_173_0 = stackIn_180_0;
                    if (var17 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 != 16777215) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var7_array[var8] = 9639960;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var8--;
                    if (var17 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    fg.field_e = new db[ef.field_d.length];
                    stackIn_180_0 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    var7_int = stackIn_180_0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if ((var7_int ^ -1) <= (fg.field_e.length ^ -1)) {
                        statePc = 186;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    fg.field_e[var7_int] = new db(32, 32);
                    fg.field_e[var7_int].b();
                    ef.field_d[var7_int].b(0, 0, 32, 32);
                    fg.field_e[var7_int].f();
                    var7_int++;
                    if (var17 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var17 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    v.field_B.b(1);
                    ia.field_H = df.a("", "letterBkgnd", dl.field_d, (byte) -47);
                    lg.field_c = df.a("", "letterBkgndGrey", dl.field_d, (byte) -56);
                    jj.field_f = td.a("", "highlight", dl.field_d, 22306);
                    th.field_l = td.a("", "multipliers", dl.field_d, 22306);
                    ob.field_d = df.a("", "ingameleft", dl.field_d, (byte) -108);
                    kf.field_A = td.a("", "ingameright", dl.field_d, 22306);
                    wc.field_c = td.a("", "deleasy", dl.field_d, 22306);
                    ij.field_n[0] = df.a("", "mmleft", dl.field_d, (byte) -53);
                    ij.field_n[2] = df.a("", "pauseleft", dl.field_d, (byte) -97);
                    ij.field_n[14] = ij.field_n[2];
                    ij.field_n[1] = df.a("", "hsleft", dl.field_d, (byte) -117);
                    dupTemp$0 = df.a("", "instleft", dl.field_d, (byte) -104);
                    ij.field_n[3] = dupTemp$0;
                    ij.field_n[12] = dupTemp$0;
                    ij.field_n[5] = df.a("", "achleft", dl.field_d, (byte) -91);
                    ij.field_n[7] = df.a("", "achgameleft", dl.field_d, (byte) -93);
                    ij.field_n[6] = ij.field_n[0];
                    dupTemp$1 = df.a("", "instright", dl.field_d, (byte) -40);
                    na.field_a[3] = dupTemp$1;
                    na.field_a[12] = dupTemp$1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var7_array2 = td.a("", "mmoutlined", dl.field_d, 22306);
                    gg.field_a = new db[var7_array2.length];
                    ej.field_b = new db[var7_array2.length];
                    var8 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    stackIn_189_0 = var8 ^ -1;
                    stackIn_189_1 = var7_array2.length ^ -1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (stackIn_189_0 <= stackIn_189_1) {
                        statePc = 202;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    gg.field_a[var8] = var7_array2[var8].c();
                    ej.field_b[var8] = var7_array2[var8].c();
                    var9 = var7_array2[var8].field_y;
                    var10 = gg.field_a[var8].field_y;
                    var11 = ej.field_b[var8].field_y;
                    stackIn_203_0 = -1 + var9.length;
                    stackIn_191_0 = stackIn_203_0;
                    if (var17 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var12 = stackIn_191_0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (var12 < 0) {
                        statePc = 201;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_189_0 = var9[var12] ^ -1;
                    stackIn_194_0 = stackIn_189_0;
                    stackIn_189_1 = -16777216;
                    stackIn_194_1 = stackIn_189_1;
                    if (var17 != 0) {
                        statePc = 189;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (stackIn_194_0 != stackIn_194_1) {
                        statePc = 198;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var10[var12] = 0;
                    if (var17 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var11[var12] = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    var12--;
                    if (var17 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    gg.field_a[var8].f();
                    var8++;
                    if (var17 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var7_array2 = td.a("", "hsmodeconcise", dl.field_d, 22306);
                    hi.field_b = new db[var7_array2.length];
                    dc.field_z = new db[var7_array2.length];
                    stackIn_203_0 = 0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var8 = stackIn_203_0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    stackIn_205_0 = var7_array2.length ^ -1;
                    stackIn_205_1 = var8 ^ -1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (stackIn_205_0 >= stackIn_205_1) {
                        statePc = 218;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    hi.field_b[var8] = var7_array2[var8].c();
                    dc.field_z[var8] = var7_array2[var8].c();
                    var9 = var7_array2[var8].field_y;
                    var10 = hi.field_b[var8].field_y;
                    var11 = dc.field_z[var8].field_y;
                    stackIn_219_0 = var9.length - 1;
                    stackIn_207_0 = stackIn_219_0;
                    if (var17 != 0) {
                        statePc = 219;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var12 = stackIn_207_0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (-1 < (var12 ^ -1)) {
                        statePc = 217;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackIn_205_0 = var9[var12] ^ -1;
                    stackIn_210_0 = stackIn_205_0;
                    stackIn_205_1 = -16777216;
                    stackIn_210_1 = stackIn_205_1;
                    if (var17 != 0) {
                        statePc = 205;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (stackIn_210_0 != stackIn_210_1) {
                        statePc = 214;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var10[var12] = 0;
                    if (var17 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var11[var12] = 0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var12--;
                    if (var17 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    hi.field_b[var8].f();
                    var8++;
                    if (var17 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    jf.field_N = df.a("", "slider", dl.field_d, (byte) -121);
                    ia.field_G = df.a("", "cursors", dl.field_d, (byte) -43);
                    dl.b(5);
                    stackIn_219_0 = 0;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    return stackIn_219_0 != 0;
                }
                case 220: {
                    if (param0 == -86) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    stackIn_222_0 = 1;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    return stackIn_222_0 != 0;
                }
                case 223: {
                    if (hh.field_L == null) {
                        statePc = 226;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    al.a(16, qa.field_b, 93.0f);
                    this.d(param0 + 18466);
                    ib.field_a = ig.a(hh.field_L.a((byte) 127, "introanim.acp", ""), -66);
                    hh.field_L = null;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (ci.field_a != null) {
                        statePc = 229;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 229: {
                    al.a(16, we.field_j, 99.0f);
                    this.d(param0 ^ -18330);
                    if (id.field_w != null) {
                        statePc = 260;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var3_array2 = ed.a(ci.field_a, true);
                    var4 = 0;
                    var5_int = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if ((var3_array2.length ^ -1) >= (var5_int ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    stackIn_241_0 = (eb[]) (var3_array2);
                    stackIn_233_0 = stackIn_241_0;
                    if (var17 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (stackIn_233_0[var5_int] != null) {
                        statePc = 238;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 238: {
                    var4++;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var5_int++;
                    if (var17 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    incrementValue$2 = var4;
                    var4--;
                    stackIn_241_0 = new eb[incrementValue$2];
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    var5 = stackIn_241_0;
                    var6 = var3_array2.length + -1;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if ((var6 ^ -1) > -1) {
                        statePc = 250;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackIn_251_0 = (eb[]) (var3_array2);
                    stackIn_244_0 = stackIn_251_0;
                    if (var17 != 0) {
                        statePc = 251;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (stackIn_244_0[var6] == null) {
                        statePc = 249;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    incrementValue$3 = var4;
                    var4--;
                    var5[incrementValue$3] = var3_array2[var6];
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var6--;
                    if (var17 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    stackIn_251_0 = (eb[]) (var5);
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    id.field_w = new oj[stackIn_251_0.length];
                    var6 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (id.field_w.length <= var6) {
                        statePc = 260;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    id.field_w[var6] = new oj(dl.field_d, ci.field_e, var5[var6]);
                    stackOut_253_0 = ug.field_s.equals(id.field_w[var6].field_k);
                    stackIn_261_0 = stackOut_253_0 ? 1 : 0;
                    stackIn_254_0 = stackOut_253_0;
                    if (var17 != 0) {
                        statePc = 261;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (!stackIn_254_0) {
                        statePc = 259;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    rg.field_b = var6;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    var6++;
                    if (var17 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    dl.field_d = null;
                    ci.field_a = null;
                    ci.field_e = null;
                    dl.b(5);
                    stackIn_261_0 = 0;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    return stackIn_261_0 != 0;
                }
                case 262: {
                    if (qc.field_d == null) {
                        statePc = 265;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 265: {
                    qc.field_d = el.a(0, ia.field_H);
                    v.field_B.b(1);
                    dl.b(5);
                    stackIn_266_0 = 0;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    return stackIn_266_0 != 0;
                }
                case 267: {
                    if (null != ne.field_b) {
                        statePc = 270;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    ne.field_b = el.a(0, lg.field_c);
                    v.field_B.b(1);
                    dl.b(param0 ^ -81);
                    stackIn_269_0 = 0;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    return stackIn_269_0 != 0;
                }
                case 270: {
                    var3_int = 0;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (var3_int >= 15) {
                        statePc = 276;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    vg.field_d[var3_int] = new sg((Lexicominos) (this), var3_int);
                    var3_int++;
                    if (var17 != 0) {
                        statePc = 277;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (var17 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    th.field_r = 0;
                    ed.field_v = 90;
                    cg.field_j = -1;
                    aa.field_j = -2;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    stackIn_278_0 = 1;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    return stackIn_278_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 > 57) {
                break L1;
              } else {
                Lexicominos.o(111);
                break L1;
              }
            }
            uh.field_D = param0;
            ij.field_p = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "Lexicominos.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, db param1, db param2, int param3) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5 = lf.field_b;
                var6 = lf.field_f;
                var7 = lf.field_a;
                param2.b();
                pa.field_a.b(0, 0);
                if ((param3 ^ -1) > -1) {
                  break L2;
                } else {
                  vg.field_d[param3].d(48);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              el.field_c.d(param0 ^ 22018);
              break L1;
            }
            L3: {
              param1.b();
              if (param0 == 22110) {
                break L3;
              } else {
                field_G = -106;
                break L3;
              }
            }
            L4: {
              L5: {
                va.field_m.b(0, 0);
                if (0 <= param3) {
                  break L5;
                } else {
                  el.field_c.b((byte) 62);
                  if (var8 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              vg.field_d[param3].c(param0 + -22109);
              break L4;
            }
            lf.a(var5, var6, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (runtimeException);

            stackIn_21_1 = new StringBuilder().append("Lexicominos.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_26_2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, int[] param4, int param5, int[] param6, byte param7, int[] param8) {
        int stackIn_60_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_110_2 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-3 != (this.field_J ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((tj.field_i ^ -1) <= -21) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_J = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_J == 1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-13 >= (tj.field_i ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_J = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (tj.field_i <= 28) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_J = 2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 != this.field_J) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (16 < tj.field_i) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_J = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 == this.field_J) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param5 = 307199;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (0 > param5) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var10_int = param6[param5];
                        if (0 == (var10_int ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param3 = 311 * ((2044 & var10_int) >> -1103444990) + (var10_int >> 375933229 & 511);
                        if ((var10_int ^ -1) <= -1) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param4[param5] = param1[param3];
                        if (var17 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param4[param5] = param8[param3];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param5--;
                        if (var17 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return;
                }
                case 37: {
                    try {
                        if (this.field_J != 1) {
                            statePc = 57;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        param5 = 307199;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (0 > param5) {
                            statePc = 56;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10_int = param6[param5];
                        if ((var10_int ^ -1) == 0) {
                            statePc = 55;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param2 = var10_int >> 2120236907 & 3;
                        param3 = 311 * ((var10_int & 2044) >> -636547966) + ((var10_int & 4193849) >> 1018580429);
                        if (0 > var10_int) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-1 == (param2 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[1 + param3];
                        var13 = param2 * (16711935 & var12) + (4 + -param2) * (var11 & 16711935) >> 1609487170;
                        var14 = (var11 & 65280) * (4 - param2) - -(param2 * (var12 & 65280)) >> 584790690;
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                        if (var17 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param4[param5] = param8[param3];
                        if (var17 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((param2 ^ -1) == -1) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[1 + param3];
                        var13 = (4 + -param2) * (var11 & 16711935) - -((var12 & 16711935) * param2) >> -384903454;
                        var14 = (65280 & var12) * param2 + (4 - param2) * (var11 & 65280) >> -1599835070;
                        param4[param5] = tb.a(vg.a(16711935, var13), vg.a(65280, var14));
                        if (var17 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param4[param5] = param1[param3];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param5--;
                        if (var17 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 56: {
                    return;
                }
                case 57: {
                    try {
                        param5 = 307199;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (param5 < 0) {
                            statePc = 101;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var10_int = param6[param5];
                        stackIn_102_0 = var10_int ^ -1;
                        stackIn_60_0 = stackIn_102_0;
                        if (var17 != 0) {
                            statePc = 102;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        param0 = 3 & var10_int;
                        param2 = var10_int >> 1824052683 & 3;
                        param3 = ((var10_int & 4186687) >> 190414509) + ((2044 & var10_int) >> 520261154) * 311;
                        if ((var10_int ^ -1) <= -1) {
                            statePc = 82;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (param2 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (param0 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 1];
                        var13 = param1[param3 + 311];
                        var14 = param1[312 + param3];
                        var15 = param0 * ((16711935 & var14) * param2 + (-param2 + 4) * (var13 & 16711935)) + ((16711935 & var11) * (4 + -param2) - -(param2 * (var12 & 16711935))) * (4 + -param0) >> -1389752412;
                        var16 = (4 - param0) * ((var11 & 65280) * (-param2 + 4) - -(param2 * (var12 & 65280))) - -(param0 * (param2 * (var14 & 65280) + (4 - param2) * (var13 & 65280))) >> 149256836;
                        param4[param5] = tb.a(vg.a(65280, var16), vg.a(16711935, var15));
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (-1 != (param2 ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (param0 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        param4[param5] = param1[param3];
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 311];
                        var13 = (16711935 & var11) * (-param0 + 4) + param0 * (var12 & 16711935) >> 901625026;
                        var14 = param0 * (var12 & 65280) + (65280 & var11) * (-param0 + 4) >> -1684271422;
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(var13, 16711935));
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var11 = param1[param3];
                        var12 = param1[param3 + 1];
                        var13 = (16711935 & var12) * param2 + (4 + -param2) * (16711935 & var11) >> -575889438;
                        var14 = (65280 & var12) * param2 + (65280 & var11) * (4 + -param2) >> -62624510;
                        param4[param5] = tb.a(vg.a(var13, 16711935), vg.a(var14, 65280));
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (param2 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (param0 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-1 != (param2 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((param0 ^ -1) == -1) {
                            statePc = 95;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[311 + param3];
                        var13 = (16711935 & var11) * (4 + -param0) - -((var12 & 16711935) * param0) >> 1075790434;
                        var14 = (65280 & var11) * (-param0 + 4) - -(param0 * (65280 & var12)) >> -919400478;
                        param4[param5] = tb.a(vg.a(65280, var14), vg.a(16711935, var13));
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param4[param5] = param8[param3];
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[1 + param3];
                        var13 = param2 * (var12 & 16711935) + (16711935 & var11) * (-param2 + 4) >> 1269091458;
                        var14 = (-param2 + 4) * (var11 & 65280) + param2 * (var12 & 65280) >> 1806435714;
                        param4[param5] = tb.a(vg.a(var14, 65280), vg.a(16711935, var13));
                        if (var17 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var11 = param8[param3];
                        var12 = param8[param3 - -1];
                        var13 = param8[311 + param3];
                        var14 = param8[311 + param3 - -1];
                        var15 = (4 - param0) * (param2 * (16711935 & var12) + (4 - param2) * (var11 & 16711935)) + param0 * ((16711935 & var13) * (4 - param2) - -((16711935 & var14) * param2)) >> 899412868;
                        var16 = ((var13 & 65280) * (4 + -param2) + (65280 & var14) * param2) * param0 + ((4 - param2) * (65280 & var11) - -(param2 * (var12 & 65280))) * (-param0 + 4) >> 360688932;
                        param4[param5] = tb.a(vg.a(var16, 65280), vg.a(var15, 16711935));
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param5--;
                        if (var17 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = param7;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 > 109) {
                            statePc = 123;
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
                        field_E = true;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    stackIn_109_0 = (RuntimeException) (var10);
                    stackIn_107_0 = stackIn_109_0;
                    stackIn_109_1 = new StringBuilder().append("Lexicominos.WA(").append(param0).append(',');
                    stackIn_107_1 = stackIn_109_1;
                    if (param1 == null) {
                        statePc = 109;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_110_0 = (RuntimeException) ((Object) stackIn_107_0);
                    stackIn_110_1 = (StringBuilder) ((Object) stackIn_107_1);
                    stackIn_110_2 = "{...}";
                    statePc = 110;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                    stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                    stackIn_110_2 = "null";
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    stackIn_113_0 = (RuntimeException) ((Object) stackIn_110_0);
                    stackIn_111_0 = stackIn_113_0;
                    stackIn_113_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_111_1 = stackIn_113_1;
                    if (param4 == null) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_114_0 = (RuntimeException) ((Object) stackIn_111_0);
                    stackIn_114_1 = (StringBuilder) ((Object) stackIn_111_1);
                    stackIn_114_2 = "{...}";
                    statePc = 114;
                    continue stateLoop;
                }
                case 113: {
                    stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
                    stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
                    stackIn_114_2 = "null";
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_117_0 = (RuntimeException) ((Object) stackIn_114_0);
                    stackIn_115_0 = stackIn_117_0;
                    stackIn_117_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param5).append(',');
                    stackIn_115_1 = stackIn_117_1;
                    if (param6 == null) {
                        statePc = 117;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_118_0 = (RuntimeException) ((Object) stackIn_115_0);
                    stackIn_118_1 = (StringBuilder) ((Object) stackIn_115_1);
                    stackIn_118_2 = "{...}";
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
                    stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
                    stackIn_118_2 = "null";
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_121_0 = (RuntimeException) ((Object) stackIn_118_0);
                    stackIn_119_0 = stackIn_121_0;
                    stackIn_121_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_118_2).append(',').append(param7).append(',');
                    stackIn_119_1 = stackIn_121_1;
                    if (param8 == null) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_119_0);
                    stackIn_122_1 = (StringBuilder) ((Object) stackIn_119_1);
                    stackIn_122_2 = "{...}";
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_121_0);
                    stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                    stackIn_122_2 = "null";
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    throw ld.a((Throwable) ((Object) stackIn_122_0), stackIn_122_2 + ')');
                }
                case 123: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              Lexicominos.o(2);
              ff.a(param0 ^ -43);
              bl.a((byte) 111);
              eb.b((byte) -100);
              hb.a((byte) 76);
              uh.a((byte) 120);
              bi.a(-1);
              of.a(param0 ^ -80);
              ka.a((byte) -81);
              nk.c((byte) 89);
              de.a(param0 ^ 73);
              qb.e(439);
              wg.c(param0 + 37);
              da.a((byte) 123);
              ee.a(param0 + 35);
              lf.c();
              sh.a(1);
              le.a();
              wd.a((byte) 11);
              qd.b(false);
              rf.b(0);
              qc.a(225);
              ga.a(param0 + -79);
              t.a(12307);
              jh.a(false);
              ah.b((byte) -95);
              il.a(0);
              df.a(true);
              af.b(param0 ^ 25);
              hi.a(5);
              ig.a(-71);
              tb.a(255);
              dd.a(1);
              td.b(0);
              ra.b(20);
              gf.b(-78);
              qk.a(false);
              b.b();
              ja.a((byte) -36);
              oj.b((byte) -26);
              fc.a(-265);
              sg.b(0);
              wb.d(5);
              pg.c(-8413);
              be.b((byte) -116);
              ge.a((byte) -59);
              ed.c(-43);
              ca.a(param0 + -163);
              kd.b(true);
              vg.b(0);
              fd.a((byte) -61);
              hl.c(true);
              na.a(true);
              cb.a(param0 + 29073);
              ek.b();
              kj.c((byte) 37);
              fg.a(param0 + -55);
              wh.a(param0 + -167);
              bk.a((byte) 98);
              ob.b(122);
              e.a(param0 + -78);
              gk.b(11);
              hf.a(param0 + -16006);
              jl.a(-15699);
              fl.a(false);
              jj.a(100);
              eg.i(-102);
              u.j((byte) -50);
              uk.i(78);
              qj.g(true);
              uc.h(param0 + 11252);
              pj.e((byte) 71);
              mh.a((byte) 119);
              ti.e(false);
              r.h(param0 ^ -45);
              sd.b();
              mf.a();
              ak.a();
              oh.a(param0 + -204);
              p.a(-127);
              bd.a(84);
              gd.e((byte) -62);
              th.j((byte) 120);
              ej.a(param0 ^ -77);
              if (param0 == 79) {
                break L1;
              } else {
                this.field_K = false;
                break L1;
              }
            }
            ad.a((byte) -108);
            nh.a(60);
            gg.a(true);
            qg.a((byte) 105);
            bj.a(true);
            kb.a(false);
            q.a((byte) 70);
            ph.a(87);
            pe.a((byte) -81);
            qf.e((byte) -15);
            ci.b((byte) -127);
            dc.f((byte) -63);
            dl.a(param0 ^ 72);
            fj.f((byte) -12);
            ug.d(64);
            vh.a((byte) 119);
            si.e(false);
            ce.a(-5602);
            ef.a(param0 ^ 79);
            ik.b((byte) -108);
            k.a();
            ne.a(338);
            nj.a((byte) -5);
            pk.a(15569);
            eh.a((byte) 99);
            rg.c(0);
            pa.b(param0 + -77);
            wc.a((byte) -50);
            dj.a(-45);
            ui.e(-1);
            he.a(-1);
            jc.a(-63);
            el.a(true);
            nl.b((byte) -125);
            ic.a();
            ok.a((byte) 28);
            pd.b(118);
            lj.a(0);
            fb.a(2);
            ib.a(false);
            og.a((byte) 124);
            ve.a(true);
            w.c(false);
            kf.e(-85);
            mg.d(false);
            ql.g((byte) 42);
            al.d((byte) 102);
            nb.d(false);
            ta.f(0);
            sk.a(82);
            oe.a(param0 + 32034);
            me.d(80);
            lb.a(-128);
            ll.a((byte) 114);
            bf.a((byte) -118);
            fa.a(param0 + 829);
            qa.a(param0 + 48);
            vl.a(96);
            ni.a((byte) 65);
            lg.c(21745);
            ck.a((byte) -18);
            rk.a(true);
            aa.b((byte) -126);
            jd.a((byte) -118);
            we.a((byte) -128);
            vf.a((byte) -53);
            ac.a(param0 + -75);
            kc.a(0);
            wj.c(false);
            rc.a(870040769);
            jf.h(-127);
            cl.o(-60);
            rl.g((byte) 93);
            re.i((byte) -27);
            md.e(344066273);
            bb.a((byte) -26);
            bc.e(false);
            ld.j(6977);
            li.a((byte) 81);
            te.a((byte) -122);
            tj.d(0);
            pl.a(0);
            kg.i(300);
            ae.j(-126);
            gi.a();
            hd.a(-115);
            kk.d(param0 + -159);
            gl.a(-116);
            hh.h(225);
            l.h(4);
            ji.b((byte) -70);
            bg.a((byte) 70);
            rh.c(-119);
            gj.d(-8601);
            ch.d(-123);
            sb.b(16478);
            vk.a(param0 ^ -30299);
            ec.a(true);
            sj.a((byte) 5);
            nc.a((byte) 88);
            d.a(false);
            cg.a((byte) -119);
            v.b(-13714);
            uj.a(true);
            id.c((byte) 96);
            di.a(false);
            ia.h(0);
            hc.g(-1);
            f.a((byte) 69);
            sa.a(0);
            vi.a(112);
            vb.a(109);
            ki.a(-119);
            mb.b(-26);
            la.a((byte) 122);
            c.a(117);
            vc.g(-16531);
            tl.a(3);
            m.a(1000);
            fk.b(false);
            pf.c(false);
            a.b(true);
            oc.a(-123);
            mc.a(29407);
            wa.a((byte) 102);
            pb.a((byte) -48);
            tg.a(0);
            n.b(23887);
            rj.b((byte) 88);
            ij.a((byte) 66);
            mk.a((byte) -101);
            ol.c(false);
            va.d((byte) -113);
            pc.d((byte) -82);
            jg.e(param0 + -25127);
            uf.c(false);
            g.e(-17779);
            rb.a((byte) 50);
            sc.a(-70);
            ri.c((byte) 117);
            tf.a(-3082);
            this.field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.I(" + param0 + ')');
        }
        L2: {
          if (!qb.field_k) {
            break L2;
          } else {
            L3: {
              if (var3 == 0) {
                stackIn_14_0 = 1;
                break L3;
              } else {
                stackIn_14_0 = 0;
                break L3;
              }
            }
            field_L = stackIn_14_0 != 0;
            break L2;
          }
        }
    }

    private final void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              nh.a(0, 1000000, 6, true);
              if (ki.a((byte) -118)) {
                break L1;
              } else {
                vc.field_D = ce.a(4, 109);
                hh.field_N = ud.a(1, -108, 10, 3, 9);
                al.a(16, ef.field_c, 100.0f);
                break L1;
              }
            }
            L2: {
              if (param0 == -83) {
                break L2;
              } else {
                this.b(true);
                break L2;
              }
            }
            fi.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.PA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        try {
            this.a(12, 13, false, 10, 5000, 0, 11, 2);
            b.a(22050, true, 10);
            ce.field_b = b.a(jh.field_a, (java.awt.Component) ((Object) ug.field_y), 0, 4096);
            ik.field_h = b.a(jh.field_a, (java.awt.Component) ((Object) ug.field_y), 1, 2048);
            wj.field_j = new hk();
            ik.field_h.b(wj.field_j);
            uh.field_n = new uh();
            uh.field_n.field_s = new hl(uh.field_n.field_A);
            uh.field_n.field_A.a(128, true, 9);
            uh.field_n.field_s.a(128, true, 9);
            ce.field_b.b(uh.field_n);
            this.a(false, param0, true, (byte) 18, false);
            ea.field_b = 0;
            g.field_n = 10640990;
            ec.field_c = 3941155;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.F(" + param0 + ')');
        }
    }

    private final boolean p(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  if (ki.a((byte) -120)) {
                    break L2;
                  } else {
                    if (!this.field_K) {
                      stackIn_10_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ki.a((byte) -119)) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = (vb) ((Object) rb.field_b.a((byte) 56));
                        if (var2 != null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        eh.a(var2, 4, (byte) -4);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!td.a(fg.field_f, param0)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.m(-6721);
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kc.a(0, -1);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int = param0 ? 1 : 0;
                        if (!d.a((byte) -56)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = this.n(6);
                        if (var3 != 2) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var2_int != 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wi.a(12, bi.field_a.field_E * 3 >> -1883778623, (byte) -123, bi.field_a, 4, 4, bi.field_a.field_E - -1, 240, 320, jh.field_b, nh.field_c);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.NA(" + param0 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void h(byte param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == eg.field_C) {
                break L1;
              } else {
                ce.a(false, eg.field_C);
                eg.field_C = null;
                dl.b(5);
                break L1;
              }
            }
            L2: {
              dl.field_d = oj.a(false, 1);
              ci.field_a = oj.a(false, 2);
              gl.field_a = oj.a(false, 3);
              hh.field_L = oj.a(false, 5);
              ga.field_a = oj.a(false, 6);
              ec.field_b = oj.a(false, 7);
              if (param0 > 77) {
                break L2;
              } else {
                discarded$1 = this.p(71);
                break L2;
              }
            }
            hc.field_gb = oj.a(false, 8);
            ci.field_e = oj.a(false, 9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.RA(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 40) {
                break L1;
              } else {
                discarded$1 = this.p(56);
                break L1;
              }
            }
            L2: {
              ce.field_b.a();
              ik.field_h.a();
              if (ff.field_b == null) {
                break L2;
              } else {
                af.a(-65);
                break L2;
              }
            }
            ca.c(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "Lexicominos.K(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a(14, "lexicominos", (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "Lexicominos.init()");
        }
    }

    final void d(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ff.field_b != null) {
                stackIn_5_0 = ff.field_b;
                break L1;
              } else {
                stackIn_5_0 = ug.field_y;
                break L1;
              }
            }
            var2 = stackIn_5_0;
            if (lh.b(-24921)) {
              L2: {
                stackIn_11_0 = 57;

                if (ff.field_b != null) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = vi.field_j ? 1 : 0;
                  break L2;
                }
              }
              ga.a((byte) stackIn_12_0, stackIn_12_1 != 0, (java.awt.Canvas) (var2));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (oj.field_g) {
                if (this.p(param0 + -18380)) {
                  L3: {
                    if ((aa.field_j ^ -1) == 1) {
                      break L3;
                    } else {
                      if (1 != (th.field_r ^ -1)) {
                        lf.g(0, 0, 640, 20);
                        cb.field_n.b(0, 0);
                        lf.g(0, 460, 640, 480);
                        cb.field_n.b(0, 0);
                        lf.g(0, 20, 24, 460);
                        cb.field_n.b(0, 0);
                        lf.g(616, 20, 640, 460);
                        cb.field_n.b(0, 0);
                        lf.b();
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (1 == (aa.field_j ^ -1)) {
                        break L5;
                      } else {
                        if (1 == (th.field_r ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            if ((aa.field_j ^ -1) != (th.field_r ^ -1)) {
                              break L6;
                            } else {
                              this.a(param0 + 3730, cl.field_S, jf.field_O, aa.field_j);
                              this.a(jf.field_O.field_y, cl.field_S.field_y, false);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if ((cg.field_j ^ -1) >= -1) {
                                break L8;
                              } else {
                                this.a(param0 ^ 4498, cl.field_S, jf.field_O, aa.field_j);
                                this.a(22110, v.field_z, bb.field_C, th.field_r);
                                if (var4 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.a(22110, cl.field_S, jf.field_O, th.field_r);
                            this.a(22110, v.field_z, bb.field_C, aa.field_j);
                            break L7;
                          }
                          L9: {
                            if (ed.field_v != 0) {
                              break L9;
                            } else {
                              this.a(jf.field_O.field_y, cl.field_S.field_y, false);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if ((ed.field_v ^ -1) == -41) {
                              break L10;
                            } else {
                              this.a(jf.field_O.field_y, v.field_z.field_y, false);
                              this.a(ed.field_v, bb.field_C, (byte) 34, cl.field_S);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          this.a(bb.field_C.field_y, v.field_z.field_y, false);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L11: {
                      this.a(22110, v.field_z, jf.field_O, 0);
                      if (-41 > (ed.field_v ^ -1)) {
                        stackIn_64_0 = 40;
                        break L11;
                      } else {
                        stackIn_64_0 = ed.field_v;
                        break L11;
                      }
                    }
                    var3 = stackIn_64_0;
                    this.a(-102, gk.field_f[var3], v.field_z, c.field_i[var3], qb.field_l[var3]);
                    ib.field_a[var3].a(0, 0);
                    break L4;
                  }
                  L12: {
                    if (2 > vb.field_i) {
                      break L12;
                    } else {
                      bi.field_a.c(Integer.toString(tj.field_i), 630, 25, 16711680, -1);
                      break L12;
                    }
                  }
                  L13: {
                    if (ra.a(-17977)) {
                      lf.d(0, 0, lf.field_f, lf.field_a);
                      rg.a(qb.field_o, 10, (byte) -105, 10);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((je.field_a ^ -1) != -1) {
                      var3 = ed.field_v << -2006446333;
                      if ((var3 ^ -1) >= -1) {
                        break L14;
                      } else {
                        lf.c(0, 0, lf.field_f, lf.field_a, 0, var3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (!pb.c(true)) {
                      break L15;
                    } else {
                      if (ra.a(-17977)) {
                        break L15;
                      } else {
                        L16: {
                          stackIn_87_0 = 0;

                          if (null != ff.field_b) {
                            stackIn_88_0 = stackIn_87_0;
                            stackIn_88_1 = 1;
                            break L16;
                          } else {

                            stackIn_88_0 = stackIn_87_0;
                            stackIn_88_1 = vi.field_j ? 1 : 0;
                            break L16;
                          }
                        }
                        bh.a(stackIn_88_0, stackIn_88_1 != 0);
                        break L15;
                      }
                    }
                  }
                  if (param0 == 18380) {
                    lj.a(0, (java.awt.Canvas) (var2), 0, (byte) -128);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  uj.a(-101, (java.awt.Canvas) (var2));
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                uj.a(106, (java.awt.Canvas) (var2));
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "Lexicominos.D(" + param0 + ')');
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
                return;
              }
            }
          }
        }
    }

    private final void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(0, param1, 0, 0, lf.field_b, 0, qb.field_b, (byte) 121, param0);
              if (!param2) {
                break L1;
              } else {
                field_I = (db) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("Lexicominos.MA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_265_0 = 0;
        PrintStream stackIn_292_0 = null;
        StringBuilder stackIn_292_1 = null;
        char stackIn_292_2 = 0;
        PrintStream stackIn_294_0 = null;
        StringBuilder stackIn_294_1 = null;
        char stackIn_294_2 = 0;
        PrintStream stackIn_296_0 = null;
        StringBuilder stackIn_296_1 = null;
        char stackIn_296_2 = 0;
        PrintStream stackIn_297_0 = null;
        StringBuilder stackIn_297_1 = null;
        char stackIn_297_2 = 0;
        int stackIn_297_3 = 0;
        fc stackIn_331_0 = null;
        fc stackIn_333_0 = null;
        fc stackIn_334_0 = null;
        int stackIn_334_1 = 0;
        int stackIn_336_0 = 0;
        int stackIn_336_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ce.field_b.e();
                        ik.field_h.e();
                        if (null == ff.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ff.field_b.field_d) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        af.a(-53);
                        ce.b(4);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = this;
                        stackIn_9_0 = stackIn_11_0;
                        if (null == ff.field_b) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.c(stackIn_12_1 != 0, -1);
                        if (ne.field_e) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.h((byte) 121);
                        ne.field_e = false;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!lh.b(-24921)) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.e((byte) 49);
                        if (lh.b(-24921)) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!ha.a(89)) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (oj.field_g) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        discarded$0 = this.a((byte) -86, false);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return;
                }
                case 29: {
                    try {
                        var2_int = 0;
                        if (!oj.field_g) {
                            statePc = 116;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.p(0)) {
                            statePc = 58;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (vc.field_D == null) {
                            statePc = 52;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!vc.field_D.field_h) {
                            statePc = 52;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_K = true;
                        sc.field_g = sc.field_g | vc.field_D.field_i;
                        ee.field_a = ee.field_a & (vc.field_D.field_i ^ -1);
                        vc.field_D = null;
                        if (param0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        kj.c(stackIn_45_0 != 0);
                        qf.a((Lexicominos) (this), 117);
                        if (-8 != (aa.field_j ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (ee.field_a != 0) {
                            statePc = 126;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        aa.field_j = 1;
                        th.field_r = 1;
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null == vc.field_D) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        vc.field_D = ce.a(4, 76);
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!ra.a(-17977)) {
                            statePc = 85;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (je.field_a == 0) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var2_int = 1;
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3 = lb.b(-30187);
                        if (-4 == (var3 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (2 == var3) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var3 != 4) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        qc.a(-3, -3, 42);
                        if (var4 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        af.a(-61);
                        if (var4 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        kl.a(bi.field_a.field_E * 3 >> -991828927, 4, 320, jh.field_b, 12, bi.field_a, 4, (byte) -103, nh.field_c, true, 1 + bi.field_a.field_E, 240);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!ra.a(-17977)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        vg.field_d[aa.field_j].a(true, true);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!ae.i(0)) {
                            statePc = 115;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_93_0 = this;
                        stackIn_89_0 = stackIn_93_0;
                        if (ff.field_b == null) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_91_0 = this;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_94_0 = this;
                        stackIn_94_1 = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_94_0 = this;
                        stackIn_94_1 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3 = aa.a((nk) (this), stackIn_94_1 != 0, -96);
                        if ((var3 ^ -1) != -2364825) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        bg.a(482);
                        if (var4 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (1 == var3) {
                            statePc = 104;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((var3 ^ -1) != -3) {
                            statePc = 114;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (ff.field_b != null) {
                            statePc = 109;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        af.a(-108);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if ((var3 ^ -1) == -3) {
                            statePc = 113;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ge.a(0, kk.c(-14047));
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var2_int = 1;
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        hb.a(gd.field_l, true);
                        if (!this.a((byte) -86, true)) {
                            statePc = 126;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (param0) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackIn_125_0 = 1;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        stackIn_125_0 = 0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        kj.c(stackIn_125_0 != 0);
                        this.g((byte) -83);
                        dl.b(5);
                        oj.field_g = true;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var2_int == 0) {
                            statePc = 340;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (-1 == (je.field_a ^ -1)) {
                            statePc = 181;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (-2 != (je.field_a ^ -1)) {
                            statePc = 145;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        fieldTemp$1 = ed.field_v + 1;
                        ed.field_v = ed.field_v + 1;
                        if (-33 == (fieldTemp$1 ^ -1)) {
                            statePc = 138;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (!ra.a(-17977)) {
                            statePc = 142;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        pl.a((byte) -85);
                        if (var4 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        mk.a(14891);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        je.field_a = 2;
                        if (var4 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (2 == je.field_a) {
                            statePc = 154;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        fieldTemp$2 = ed.field_v - 1;
                        ed.field_v = ed.field_v - 1;
                        if (-1 != (fieldTemp$2 ^ -1)) {
                            statePc = 340;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        je.field_a = 0;
                        if (var4 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (ki.a((byte) -115)) {
                            statePc = 175;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (el.field_c == null) {
                            statePc = 168;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (el.field_c.field_J <= 0) {
                            statePc = 168;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (el.field_c.field_h) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        ki.field_d = gl.a(65526, 9, el.field_c.field_i, 3, el.field_c.field_f, (byte) 56, el.field_c.field_R, new int[]{el.field_c.field_J * 64 - -el.field_c.field_m.field_i}, el.field_c.field_a);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        hh.field_N = ud.a(1, -118, 10, 3, 9);
                        aa.field_j = hf.field_a;
                        if (7 != aa.field_j) {
                            statePc = 174;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (-1 != (ee.field_a ^ -1)) {
                            statePc = 174;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        aa.field_j = 1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        al.a(16, ef.field_c, 100.0f);
                        if (var4 == 0) {
                            statePc = 177;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        aa.field_j = hc.field_db;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (2 != (aa.field_j ^ -1)) {
                            statePc = 180;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        aa.field_j = 0;
                        kl.a(3 * bi.field_a.field_E >> 1806035777, 4, 320, jh.field_b, 12, bi.field_a, 4, (byte) 86, nh.field_c, false, 1 + bi.field_a.field_E, 240);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        je.field_a = 3;
                        th.field_r = aa.field_j;
                        if (var4 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if ((th.field_r ^ -1) == (aa.field_j ^ -1)) {
                            statePc = 227;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        ed.field_v = ed.field_v + cg.field_j;
                        if ((aa.field_j ^ -1) > -1) {
                            statePc = 192;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (vg.field_d[aa.field_j].field_m == null) {
                            statePc = 192;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        vg.field_d[aa.field_j].field_m.b(2);
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (-1 < (aa.field_j ^ -1)) {
                            statePc = 199;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (el.field_c != null) {
                            statePc = 198;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        el.field_c.b(2);
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (((ed.field_v + -20) * cg.field_j ^ -1) > -21) {
                            statePc = 340;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (th.field_r != -2) {
                            statePc = 209;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if (ed.field_v != 40) {
                            statePc = 340;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        ge.a(0, kk.c(-14047));
                        if (var4 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (-1 < (aa.field_j ^ -1)) {
                            statePc = 217;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (vg.field_d[aa.field_j].field_m == null) {
                            statePc = 217;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        th.field_o[2].e(0);
                        vg.field_d[aa.field_j].field_m = null;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (6 != aa.field_j) {
                            statePc = 224;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        if ((th.field_r ^ -1) == -1) {
                            statePc = 223;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        sc.field_g = 0;
                        ee.field_a = 0;
                        rb.field_b.g(-105);
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        aa.field_j = th.field_r;
                        if (aa.field_j == -1) {
                            statePc = 340;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (aa.field_j == -1) {
                            statePc = 234;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        vg.field_d[aa.field_j].a((byte) -88);
                        if (el.field_c != null) {
                            statePc = 233;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        el.field_c.b(2);
                        if (var4 == 0) {
                            statePc = 340;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        if (!ji.a((byte) -72)) {
                            statePc = 335;
                        } else {
                            statePc = 235;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        statePc = 237;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        if ((da.field_b ^ -1) != -14) {
                            statePc = 245;
                        } else {
                            statePc = 238;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        if (-3 >= (vb.field_i ^ -1)) {
                            statePc = 243;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        this.a((byte) -77, false, 2, -1);
                        if (var4 == 0) {
                            statePc = 234;
                        } else {
                            statePc = 245;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (2 > vb.field_i) {
                            statePc = 234;
                        } else {
                            statePc = 246;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        stackIn_336_0 = da.field_b;
                        stackIn_247_0 = stackIn_336_0;
                        stackIn_336_1 = 84;
                        stackIn_247_1 = stackIn_336_1;
                        if (var4 != 0) {
                            statePc = 336;
                        } else {
                            statePc = 247;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        if (stackIn_247_0 != stackIn_247_1) {
                            statePc = 253;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        ob.a(0, sk.field_a, (byte) 22, ' ');
                        if (var4 == 0) {
                            statePc = 271;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        if (!ci.a(true, pe.field_b)) {
                            statePc = 271;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        discarded$3 = sk.field_a.append(pe.field_b);
                        if (na.a(1048576, (CharSequence) ((Object) sk.field_a)) != -26658124) {
                            statePc = 266;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        if (mg.field_B) {
                            statePc = 264;
                        } else {
                            statePc = 260;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        stackIn_265_0 = 1;
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        stackIn_265_0 = 0;
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        mg.field_B = stackIn_265_0 != 0;
                        ob.a(0, sk.field_a, (byte) 22, ' ');
                        if (var4 == 0) {
                            statePc = 271;
                        } else {
                            statePc = 266;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        if (1039745816 != (na.a(1048576, (CharSequence) ((Object) sk.field_a)) ^ -1)) {
                            statePc = 271;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        mg.field_B = false;
                        ob.a(0, sk.field_a, (byte) 22, ' ');
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        if (null == el.field_c) {
                            statePc = 287;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        if (-51 != (da.field_b ^ -1)) {
                            statePc = 287;
                        } else {
                            statePc = 273;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if ((el.field_c.field_d ^ -1) > -17) {
                            statePc = 280;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        el.field_c.field_t = el.field_c.field_t + 8;
                        var3 = (el.field_c.field_t >> 691519107) + 1;
                        if (el.field_c.field_d < var3) {
                            statePc = 283;
                        } else {
                            statePc = 281;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        el.field_c.field_d = el.field_c.field_d + 1;
                        el.field_c.field_s = 0;
                        if (1 == (el.field_c.field_d & 1)) {
                            statePc = 286;
                        } else {
                            statePc = 284;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        ki.a(40000 * el.field_c.field_d + 960000, el.field_c.field_I, -127);
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        if (null == el.field_c) {
                            statePc = 316;
                        } else {
                            statePc = 288;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        if (!el.field_c.field_T) {
                            statePc = 316;
                        } else {
                            statePc = 289;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        stackIn_296_0 = System.out;
                        stackIn_292_0 = stackIn_296_0;
                        stackIn_296_1 = new StringBuilder().append("keycode=").append(da.field_b).append("; keychar=");
                        stackIn_292_1 = stackIn_296_1;
                        stackIn_296_2 = pe.field_b;
                        stackIn_292_2 = stackIn_296_2;
                        if (param0) {
                            statePc = 296;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        stackIn_294_0 = (PrintStream) ((Object) stackIn_292_0);
                        stackIn_294_1 = (StringBuilder) ((Object) stackIn_292_1);
                        stackIn_294_2 = stackIn_292_2;
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        stackIn_297_0 = (PrintStream) ((Object) stackIn_294_0);
                        stackIn_297_1 = (StringBuilder) ((Object) stackIn_294_1);
                        stackIn_297_2 = stackIn_294_2;
                        stackIn_297_3 = 1;
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        stackIn_297_0 = (PrintStream) ((Object) stackIn_296_0);
                        stackIn_297_1 = (StringBuilder) ((Object) stackIn_296_1);
                        stackIn_297_2 = stackIn_296_2;
                        stackIn_297_3 = 0;
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        ((PrintStream) (Object) stackIn_297_0).println(String.valueOf(va.a(stackIn_297_2, stackIn_297_3 != 0)));
                        if (65 > pe.field_b) {
                            statePc = 309;
                        } else {
                            statePc = 298;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        if ((pe.field_b ^ -1) < -91) {
                            statePc = 309;
                        } else {
                            statePc = 299;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        statePc = 301;
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        var3 = 0;
                        statePc = 302;
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        if ((var3 ^ -1) <= -5) {
                            statePc = 307;
                        } else {
                            statePc = 303;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        el.field_c.field_Q.field_h[var3] = pe.field_b;
                        var3++;
                        if (var4 != 0) {
                            statePc = 308;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        if (var4 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 305;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        statePc = 307;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        el.field_c.field_h = true;
                        statePc = 308;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        if (var4 == 0) {
                            statePc = 234;
                        } else {
                            statePc = 309;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        if (-50 < (pe.field_b ^ -1)) {
                            statePc = 316;
                        } else {
                            statePc = 310;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        if (55 >= pe.field_b) {
                            statePc = 315;
                        } else {
                            statePc = 311;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        statePc = 316;
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        el.field_c.field_Q = new ha(el.field_c, -49 + pe.field_b, el.field_c.field_Q.field_h);
                        el.field_c.field_h = true;
                        if (var4 == 0) {
                            statePc = 234;
                        } else {
                            statePc = 316;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        if (null == el.field_c) {
                            statePc = 322;
                        } else {
                            statePc = 317;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        if ((pe.field_b ^ -1) != -103) {
                            statePc = 322;
                        } else {
                            statePc = 318;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        statePc = 320;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        el.field_c.field_T = true;
                        statePc = 322;
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        if (el.field_c == null) {
                            statePc = 328;
                        } else {
                            statePc = 323;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        if ((pe.field_b ^ -1) != -118) {
                            statePc = 328;
                        } else {
                            statePc = 324;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        statePc = 326;
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        el.field_c.field_T = false;
                        statePc = 328;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        if (el.field_c == null) {
                            statePc = 234;
                        } else {
                            statePc = 329;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        if (pe.field_b != 105) {
                            statePc = 234;
                        } else {
                            statePc = 330;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        stackIn_333_0 = el.field_c;
                        stackIn_331_0 = stackIn_333_0;
                        if (el.field_c.field_D) {
                            statePc = 333;
                        } else {
                            statePc = 331;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        stackIn_334_0 = (fc) ((Object) stackIn_331_0);
                        stackIn_334_1 = 1;
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        stackIn_334_0 = (fc) ((Object) stackIn_333_0);
                        stackIn_334_1 = 0;
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        stackIn_334_0.field_D = stackIn_334_1 != 0;
                        if (var4 == 0) {
                            statePc = 234;
                        } else {
                            statePc = 335;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        stackIn_336_0 = aa.field_j;
                        stackIn_336_1 = -1;
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        if ((stackIn_336_0 ^ stackIn_336_1) == 0) {
                            statePc = 339;
                        } else {
                            statePc = 337;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        el.field_c.e(1);
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        this.c(param0);
                        statePc = 343;
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 342: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var2), "Lexicominos.M(" + param0 + ')');
                }
                case 343: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int[] param1, db param2, int[] param3, int[] param4) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param3[0];
                        var7 = param1[0];
                        var8 = 126 / ((param0 - -6) / 58);
                        var9 = param4[0];
                        var10 = 0;
                        var11 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (10 <= var11) {
                            statePc = 41;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = param3[var11];
                        var13 = param1[var11];
                        var14 = param4[var11];
                        var15 = ce.field_c[-1 + var11];
                        var16 = -var6_int + var12 + 1;
                        if (var30 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var16 >= 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var30 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var17 = var12 - -1;
                        var18 = var10 << -941368812;
                        var19 = (var15 << -876279052) / var16;
                        var20 = var7 << -1813240812;
                        var21 = (var13 + -var7 << 436799476) / var16;
                        var22 = 1 + -var7 + var9 << -557216908;
                        var23 = (-var9 - (-var7 - (-var13 + var14)) << -1727712492) / var16;
                        var7 = var13;
                        var6_int = var12;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0 >= var16) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var24 = var20 >> -153043628;
                        var25 = var22 >> 1205238292;
                        var26 = 0;
                        var27 = 471859200 / var25;
                        stackIn_21_0 = lf.field_h ^ -1;
                        stackIn_13_0 = stackIn_21_0;
                        stackIn_21_1 = var24 + var25 ^ -1;
                        stackIn_13_1 = stackIn_21_1;
                        if (var30 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var25 = var25 - (-lf.field_h + (var24 - -var25));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var28 = var17 - var16 - -(var24 * lf.field_f);
                        if (var24 >= lf.field_c) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var29 = lf.field_c + -var24;
                        var26 = var26 + var29 * var27;
                        var28 = var28 + lf.field_f * var29;
                        var25 = var25 - var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        hd.a(param2.field_y, var28, var26, var25, 0, lf.field_f, lf.field_b, var18 >> -1791734956, 311, var27);
                        var18 = var18 + var19;
                        var20 = var20 + var21;
                        var22 = var22 + var23;
                        var16--;
                        if (var30 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var10;
                        stackIn_21_1 = var15;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = stackIn_21_0 + stackIn_21_1;
                        var9 = var14;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11++;
                        if (var30 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var6);
                    stackIn_25_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("Lexicominos.UA(").append(param0).append(',');
                    stackIn_25_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_31_1;
                    if (param2 == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_35_0;
                    stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
                    stackIn_33_1 = stackIn_35_1;
                    if (param3 == null) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_39_0;
                    stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
                    stackIn_37_1 = stackIn_39_1;
                    if (param4 == null) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_40_2 = "{...}";
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_40_2 = "null";
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw ld.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final db a(int param0, db param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        db stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        db var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1.field_s;
                        var4 = param1.field_w;
                        var5 = new db(param1.field_p + 16, 16 + param1.field_u);
                        var5.field_s = -8 + var3_int;
                        var5.field_w = -8 + var4;
                        var5.b();
                        var6 = 0;
                        var7_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = param1.field_u;
                        stackIn_3_1 = var7_int;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_14_0 = 0;
                        stackIn_5_0 = stackIn_14_0;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.field_p <= var8) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$0 = var6;
                        var6++;
                        stackIn_3_0 = -1;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = param1.field_y[incrementValue$0] ^ -1;
                        stackIn_8_1 = stackIn_3_1;
                        if (var9 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lf.c(8 + var8, var7_int - -8, 8, 16777215);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8++;
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_int++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = 0;
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_int = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = param1.field_u;
                        stackIn_16_1 = var7_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 <= stackIn_16_1) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 >= param1.field_p) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        incrementValue$1 = var6;
                        var6++;
                        stackIn_16_0 = param1.field_y[incrementValue$1] ^ -1;
                        stackIn_20_0 = stackIn_16_0;
                        stackIn_16_1 = -1;
                        stackIn_20_1 = stackIn_16_1;
                        if (var9 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 == stackIn_20_1) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        lf.c(var8 - -8, var7_int - -8, 4, 8421504);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8++;
                        if (var9 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7_int++;
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = var5.field_y;
                        var8 = -1 + var7.length;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 < (var8 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_35_0 = var7[var8] ^ -1;
                        stackIn_28_0 = stackIn_35_0;
                        stackIn_35_1 = -8421505;
                        stackIn_28_1 = stackIn_35_1;
                        if (var9 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7[var8] = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8--;
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 34;
                        stackIn_35_1 = (-42 - param0) / 44;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = stackIn_35_0 % stackIn_35_1;
                        stackIn_36_0 = (db) (var5);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_40_0 = (RuntimeException) (var3);
                    stackIn_38_0 = stackIn_40_0;
                    stackIn_40_1 = new StringBuilder().append("Lexicominos.SA(").append(param0).append(',');
                    stackIn_38_1 = stackIn_40_1;
                    if (param1 == null) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_41_2 = "{...}";
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_41_2 = "null";
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw ld.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            field_I = null;
            field_H = null;
            field_F = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "Lexicominos.LA(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        boolean stackIn_17_0 = false;
        int stackIn_42_0 = 0;
        cd stackIn_42_1 = null;
        int stackIn_43_0 = 0;
        cd stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_46_3;
        int stackIn_46_4;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int stackIn_47_5 = 0;
        int[] stackIn_50_0;
        int stackIn_50_1;
        int stackIn_50_2;
        int stackIn_50_3;
        cd stackIn_50_4;
        int stackIn_50_5;
        int stackIn_50_6;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        cd stackIn_51_4 = null;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_51_7 = 0;
        int stackIn_55_8;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 22 / ((16 - param0) / 59);
              th.field_r = param2;
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                vg.field_d[param2].field_g = param3;
                break L1;
              }
            }
            L2: {
              L3: {
                if (ja.field_b[th.field_r - -2] <= ja.field_b[2 + aa.field_j]) {
                  break L3;
                } else {
                  cg.field_j = 1;
                  ed.field_v = 0;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              cg.field_j = -1;
              ed.field_v = 40;
              break L2;
            }
            L4: {
              L5: {
                L6: {
                  if (8 > th.field_r) {
                    break L6;
                  } else {
                    if (th.field_r > 11) {
                      break L6;
                    } else {
                      var6 = 0;
                      L7: while (true) {
                        L8: {
                          if (var6 >= id.field_w.length) {
                            break L8;
                          } else {
                            stackOut_16_0 = ug.field_s.equals(id.field_w[var6].field_k);
                            stackIn_57_0 = stackOut_16_0 ? 1 : 0;
                            stackIn_17_0 = stackOut_16_0;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              L9: {
                                if (!stackIn_17_0) {
                                  break L9;
                                } else {
                                  if (var8 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var6++;
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        vg.field_d[th.field_r].field_m = new fc((Lexicominos) (this), id.field_w[var6], new Random());
                        vg.field_d[th.field_r].field_m.b(-71, th.field_r + -8);
                        vg.field_d[th.field_r].field_m.field_M = -92;
                        vg.field_d[th.field_r].field_b = 0;
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if ((th.field_r ^ -1) != -2) {
                    break L10;
                  } else {
                    if (ki.a((byte) -127)) {
                      break L10;
                    } else {
                      hh.field_N = ud.a(1, -85, 10, 3, 9);
                      if (var8 == 0) {
                        break L5;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (th.field_r != 6) {
                  break L5;
                } else {
                  L11: {
                    var6 = 50;
                    var7 = 4 + bi.field_a.field_t + bi.field_a.field_G;
                    var6 = var6 + bi.field_a.a(me.field_u, 254) * var7;
                    stackIn_42_0 = var6;

                    stackIn_42_1 = bi.field_a;

                    if (0 == ee.field_a) {
                      stackIn_43_0 = stackIn_42_0;
                      stackIn_43_1 = (cd) ((Object) stackIn_42_1);
                      stackIn_43_2 = 0;
                      break L11;
                    } else {
                      stackIn_43_0 = stackIn_42_0;
                      stackIn_43_1 = (cd) ((Object) stackIn_42_1);
                      stackIn_43_2 = 1;
                      break L11;
                    }
                  }
                  L12: {






                    stackIn_46_3 = 0;

                    stackIn_46_4 = 52;

                    if ((el.field_c.field_J ^ -1) == -1) {

                      stackIn_43_1 = (cd) ((Object) stackIn_43_1);

                      stackIn_47_3 = stackIn_46_3;
                      stackIn_47_4 = stackIn_46_4;
                      stackIn_47_5 = 0;
                      break L12;
                    } else {

                      stackIn_43_1 = (cd) ((Object) stackIn_43_1);

                      stackIn_47_3 = stackIn_46_3;
                      stackIn_47_4 = stackIn_46_4;
                      stackIn_47_5 = 1;
                      break L12;
                    }
                  }
                  L13: {
                    var6 = stackIn_43_0 + ((cd) (Object) stackIn_43_1).a(ii.a(stackIn_43_2 != 0, stackIn_47_3 != 0, stackIn_47_4, stackIn_47_5 != 0), 254) * var7;
                    qc.field_c[6] = var6;
                    stackIn_50_0 = uk.field_U;

                    stackIn_50_1 = 6;

                    stackIn_50_2 = 2 * gg.field_a[0].field_x;

                    stackIn_50_3 = var7;

                    stackIn_50_4 = bi.field_a;

                    stackIn_50_5 = 0;

                    stackIn_50_6 = -95;

                    if (ee.field_a == 0) {
                      stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                      stackIn_51_1 = stackIn_50_1;
                      stackIn_51_2 = stackIn_50_2;
                      stackIn_51_3 = stackIn_50_3;
                      stackIn_51_4 = (cd) ((Object) stackIn_50_4);
                      stackIn_51_5 = stackIn_50_5;
                      stackIn_51_6 = stackIn_50_6;
                      stackIn_51_7 = 0;
                      break L13;
                    } else {
                      stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                      stackIn_51_1 = stackIn_50_1;
                      stackIn_51_2 = stackIn_50_2;
                      stackIn_51_3 = stackIn_50_3;
                      stackIn_51_4 = (cd) ((Object) stackIn_50_4);
                      stackIn_51_5 = stackIn_50_5;
                      stackIn_51_6 = stackIn_50_6;
                      stackIn_51_7 = 1;
                      break L13;
                    }
                  }
                  L14: {
















                    if (0 == el.field_c.field_J) {
                      stackIn_51_0 = (int[]) ((Object) stackIn_51_0);



                      stackIn_51_4 = (cd) ((Object) stackIn_51_4);



                      stackIn_55_8 = 0;
                      break L14;
                    } else {
                      stackIn_51_0 = (int[]) ((Object) stackIn_51_0);



                      stackIn_51_4 = (cd) ((Object) stackIn_51_4);



                      stackIn_55_8 = 1;
                      break L14;
                    }
                  }
                  stackIn_51_0[stackIn_51_1] = stackIn_51_2 + (stackIn_51_3 - -(((cd) (Object) stackIn_51_4).a(ac.a(stackIn_51_5 != 0, stackIn_51_6, stackIn_51_7 != 0, stackIn_55_8 != 0), 254) * var7));
                  break L5;
                }
              }
              stackIn_57_0 = th.field_r ^ -1;
              break L4;
            }
            L15: {
              if (stackIn_57_0 <= -1) {
                vg.field_d[th.field_r].a(param1, true);
                break L15;
              } else {
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var5), "Lexicominos.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, cg param1, int param2) {
        RuntimeException runtimeException = null;
        th var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = ed.field_q;
              if (param0 == -17800) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            var3.h(param2, 0);
            var3.c(param1.field_h, -1);
            var3.e(96, param1.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("Lexicominos.VA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, db param1, byte param2, db param3) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        db var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 34) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_G = -57;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = og.field_f[param0][0];
                        var6 = we.field_b[param0][0];
                        var7 = bg.field_f[param0][0];
                        var8 = 0;
                        var9 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = -11;
                        stackIn_6_1 = var9 ^ -1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= stackIn_6_1) {
                            statePc = 34;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = og.field_f[param0][var9];
                        var11 = we.field_b[param0][var9];
                        var12 = bg.field_f[param0][var9];
                        var13 = ce.field_c[var9 + -1];
                        var14 = 1 + (var10 - var5_int);
                        if (var29 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 >= var14) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var15 = param3;
                        var18 = var6 << 279813204;
                        var16 = var10 + 1;
                        var20 = var7 << -1246929068;
                        var19 = (-var6 + var11 << 600342196) / var14;
                        var21 = (var12 + -var7 << -175862476) / var14;
                        var17 = var8 << 412633300;
                        if (var29 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var18 = var11 << 878980308;
                        var17 = -var8 + (311 + -var13) << -1573550252;
                        var14 = 1 + (var5_int - var10);
                        var16 = var5_int - -1;
                        var15 = param1;
                        var21 = (var7 - var12 << -1784577900) / var14;
                        var20 = var12 << -526181132;
                        var19 = (-var11 + var6 << 259594324) / var14;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var22 = (var13 << -919598828) / var14;
                        var7 = var12;
                        var8 = var8 + var13;
                        var6 = var11;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var14 ^ -1) >= -1) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var23 = var18 >> 1101679156;
                        var24 = -var23 + ((var20 >> 2128682900) + 1);
                        var25 = 0;
                        var26 = 471859200 / var24;
                        stackIn_6_0 = lf.field_h ^ -1;
                        stackIn_16_0 = stackIn_6_0;
                        stackIn_6_1 = var24 + var23 ^ -1;
                        stackIn_16_1 = stackIn_6_1;
                        if (var29 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 <= stackIn_16_1) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var24 = var24 - (var23 - -var24 + -lf.field_h);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var27 = lf.field_f * var23 + (-var14 + var16);
                        if (lf.field_c > var23) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var28 = lf.field_c - var23;
                        var27 = var27 + lf.field_f * var28;
                        var24 = var24 - var28;
                        var25 = var25 + var26 * var28;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        hd.a(var15.field_y, var27, var25, var24, 0, lf.field_f, lf.field_b, var17 >> 1101871732, 311, var26);
                        var18 = var18 + var19;
                        var17 = var17 + var22;
                        var20 = var20 + var21;
                        var14--;
                        if (var29 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5_int = var10;
                        var9++;
                        if (var29 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var5);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("Lexicominos.QA(").append(param0).append(',');
                    stackIn_26_1 = stackIn_28_1;
                    if (param1 == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');
                    stackIn_30_1 = stackIn_32_1;
                    if (param3 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public Lexicominos() {
        this.field_J = 2;
    }

    static {
        field_G = 0;
        field_F = "Connection lost. <%0>";
    }
}
