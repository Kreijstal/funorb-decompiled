/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class oh {
    static String field_b;
    static String field_c;
    static boolean field_e;
    static String field_d;
    static int[] field_h;
    static cm field_a;
    static int field_f;
    static String field_g;

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((param3 ^ -1) > -1) {
                            statePc = 4;
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
                        if (-12 <= (param3 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param2 < 1) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (nk.b(-14487, param3, param0) >= param2) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        if (param1) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        oh.a(-54, (int[]) null, (String[]) null, (String[][]) null, (String[]) null, 77, (String[][]) null, -51, (wk[][]) null, (wk[][]) null, 31, (String[]) null, (byte[]) null, (byte[]) null, (cm) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
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
                case 16: {
                    try {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var4, "oh.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int[] param1, String[] param2, String[][] param3, String[] param4, int param5, String[][] param6, int param7, wk[][] param8, wk[][] param9, int param10, String[] param11, byte[] param12, byte[] param13, cm param14) {
        RuntimeException var15 = null;
        gh var15_ref = null;
        gh var16 = null;
        int var17_int = 0;
        gh var17 = null;
        int var18 = 0;
        wk var19_ref = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        gh stackIn_7_0 = null;
        gh stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        gh stackIn_7_3 = null;
        gh stackIn_9_0 = null;
        gh stackIn_9_1 = null;
        long stackIn_9_2 = 0L;
        gh stackIn_9_3 = null;
        gh stackIn_10_0 = null;
        gh stackIn_10_1 = null;
        long stackIn_10_2 = 0L;
        gh stackIn_10_3 = null;
        String stackIn_10_4 = null;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        wk[][] stackIn_56_1 = null;
        wk stackIn_65_0 = null;
        Object stackIn_68_0 = null;
        String stackIn_75_0 = null;
        int stackIn_78_0 = 0;
        gh stackIn_81_0 = null;
        Object stackIn_88_0 = null;
        qh stackIn_92_0 = null;
        qh[][] stackIn_96_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_113_0 = 0;
        Object stackIn_129_0 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_145_2 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_153_2 = null;
        RuntimeException stackIn_154_0 = null;
        StringBuilder stackIn_154_1 = null;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        String stackIn_157_2 = null;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        String stackIn_161_2 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_165_2 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        String stackIn_169_2 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_185_2 = null;
        Throwable caughtException = null;
        gh stackOut_6_0 = null;
        gh stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        gh stackOut_6_3 = null;
        gh stackOut_7_0 = null;
        gh stackOut_7_1 = null;
        long stackOut_7_2 = 0L;
        gh stackOut_7_3 = null;
        String stackOut_7_4 = null;
        gh stackOut_9_0 = null;
        gh stackOut_9_1 = null;
        long stackOut_9_2 = 0L;
        gh stackOut_9_3 = null;
        String stackOut_9_4 = null;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_55_0 = null;
        wk[][] stackOut_55_1 = null;
        Object stackOut_59_0 = null;
        wk stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        Object stackOut_67_0 = null;
        String stackOut_71_0 = null;
        Object stackOut_73_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_77_0 = 0;
        gh stackOut_80_0 = null;
        Object stackOut_87_0 = null;
        qh stackOut_91_0 = null;
        qh[][] stackOut_95_0 = null;
        gh stackOut_104_0 = null;
        int stackOut_108_0 = 0;
        int stackOut_112_0 = 0;
        Object stackOut_128_0 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        String stackOut_150_2 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        String stackOut_152_2 = null;
        RuntimeException stackOut_153_0 = null;
        StringBuilder stackOut_153_1 = null;
        RuntimeException stackOut_154_0 = null;
        StringBuilder stackOut_154_1 = null;
        String stackOut_154_2 = null;
        RuntimeException stackOut_156_0 = null;
        StringBuilder stackOut_156_1 = null;
        String stackOut_156_2 = null;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        RuntimeException stackOut_158_0 = null;
        StringBuilder stackOut_158_1 = null;
        String stackOut_158_2 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        String stackOut_166_2 = null;
        RuntimeException stackOut_168_0 = null;
        StringBuilder stackOut_168_1 = null;
        String stackOut_168_2 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_173_0 = null;
        StringBuilder stackOut_173_1 = null;
        RuntimeException stackOut_174_0 = null;
        StringBuilder stackOut_174_1 = null;
        String stackOut_174_2 = null;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        String stackOut_176_2 = null;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        String stackOut_180_2 = null;
        RuntimeException stackOut_181_0 = null;
        StringBuilder stackOut_181_1 = null;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        String stackOut_182_2 = null;
        RuntimeException stackOut_184_0 = null;
        StringBuilder stackOut_184_1 = null;
        String stackOut_184_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    bl.field_h = param3;
                    e.field_g = param4;
                    li.field_D = param8;
                    dc.field_b = param9;
                    ok.field_a = param7;
                    al.field_a = param2;
                    ck.field_b = param11;
                    tc.field_z = param0;
                    eh.field_e = param12;
                    fj.field_b = param6;
                    ub.field_f = param13;
                    jg.field_l = param1;
                    hg.field_i = cf.a("gameprivacy", "lobby", (byte) -19, param14);
                    ha.field_Q = cf.a("ratedgame", "lobby", (byte) -98, param14);
                    jn.field_d = cf.a("opentome", "lobby", (byte) -57, param14);
                    bm.field_Z = cf.a("allowspectators", "lobby", (byte) -51, param14);
                    m.field_j = new String[5];
                    m.field_j[3] = g.field_a;
                    m.field_j[2] = dm.field_d;
                    m.field_j[4] = fm.field_g;
                    m.field_j[0] = ei.field_x;
                    m.field_j[1] = vn.field_l;
                    fl.field_c = new gh(0L, (gh) null);
                    gi.field_o = new gh(0L, sj.field_J, uj.field_g);
                    uj.field_j = new gh((long)param5, kb.field_b, sf.field_l);
                    mj.field_Sb = new kg(0L, new gh(0L, (gh) null), jk.field_h, uh.field_j);
                    fl.field_c.a(gi.field_o, 119);
                    if (!rm.field_p) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fl.field_c.a(uj.field_j, 122);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    fl.field_c.a((gh) (Object) mj.field_Sb, 123);
                    mj.field_Sb.field_Tb.b(bd.field_f, 6402);
                    mj.field_Sb.field_Tb.field_Fb = 1;
                    var15_ref = mj.field_Sb.field_Tb;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var15_ref.field_Kb = 1;
                    jb.field_C = new gh(0L, bd.field_f);
                    jb.field_C.field_Kb = 1;
                    sg.field_i = new gh(0L, gm.field_c, jc.field_i.toUpperCase());
                    qi.field_c = new gh(0L, qb.field_E, r.field_q.toUpperCase());
                    q.field_d = new gh(0L, ce.field_o);
                    td.field_bc = new gh(0L, sj.field_J, cf.field_p);
                    dj.field_d = new gh(0L, im.field_f, field_c);
                    hd.field_q = new gh(0L, im.field_f, vf.field_f);
                    pe.field_v = new gh(0L, im.field_f, ij.field_Q);
                    ql.field_Vb = new gh(0L, im.field_f, le.field_B);
                    cf.field_w = new gh(0L, kb.field_b, bf.field_Bb);
                    rn.field_y = new kg(0L, new gh(0L, (gh) null), jk.field_h, uh.field_j);
                    qm.field_b = new gh(0L, rm.field_j, fc.field_f.toUpperCase());
                    qm.field_b.field_T = rm.field_p;
                    stackOut_6_0 = null;
                    stackOut_6_1 = null;
                    stackOut_6_2 = 0L;
                    stackOut_6_3 = rm.field_j;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_9_2 = stackOut_6_2;
                    stackIn_9_3 = stackOut_6_3;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    stackIn_7_3 = stackOut_6_3;
                    if (rm.field_p) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = null;
                    stackOut_7_1 = null;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = (gh) (Object) stackIn_7_3;
                    stackOut_7_4 = kc.field_C;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    stackIn_10_3 = stackOut_7_3;
                    stackIn_10_4 = stackOut_7_4;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = null;
                    stackOut_9_1 = null;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = (gh) (Object) stackIn_9_3;
                    stackOut_9_4 = q.field_c;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    new gh(stackIn_10_2, stackIn_10_3, ((String) (Object) stackIn_10_4).toUpperCase());
                    uc.field_j = stackIn_10_0;
                    pc.field_q = new gh(0L, (gh) null);
                    pc.field_q.a(qi.field_c, 118);
                    pc.field_q.a(q.field_d, 119);
                    q.field_d.a(td.field_bc, 120);
                    q.field_d.a(dj.field_d, param5 ^ 124);
                    q.field_d.a(hd.field_q, param5 ^ 120);
                    if (!rm.field_p) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    q.field_d.a(pe.field_v, 120);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    q.field_d.a(ql.field_Vb, 126);
                    q.field_d.a(cf.field_w, 121);
                    q.field_d.a((gh) (Object) rn.field_y, param5 + 124);
                    if (rm.field_p) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    pc.field_q.a(qm.field_b, 122);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    pc.field_q.a(uc.field_j, param5 + 121);
                    sj.field_z = new gh(0L, bd.field_f);
                    sj.field_z.field_Kb = 1;
                    sj.field_z.field_Fb = 0;
                    pm.field_gb = new gh(0L, b.field_e, mb.field_D.toUpperCase());
                    fl.field_b = new gh(0L, an.field_a);
                    fl.field_b.a(sj.field_z, 122);
                    fl.field_b.a(pm.field_gb, 122);
                    wl.field_J = new gh(0L, jk.field_h);
                    wl.field_J.b(bd.field_f, param5 ^ 6402);
                    var16 = wl.field_J;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    wl.field_J.field_Fb = 1;
                    var16.field_Kb = 1;
                    m.field_i = new gh(0L, (gh) null);
                    uj.field_e = new gh(0L, bd.field_f);
                    uj.field_e.field_Kb = 1;
                    gl.field_u = new gh(0L, sj.field_J, uj.field_g);
                    ei.field_p = new gh(0L, kb.field_b, sf.field_l);
                    gl.field_t = new kg(0L, new gh(0L, (gh) null), jk.field_h, uh.field_j);
                    m.field_i.a(uj.field_e, 120);
                    m.field_i.a(gl.field_u, 127);
                    if (!rm.field_p) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    m.field_i.a(ei.field_p, param5 + 118);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    m.field_i.a((gh) (Object) gl.field_t, 124);
                    mn.field_E = new gh(0L, gm.field_c, bi.field_c.toUpperCase());
                    nm.field_q = new gh(0L, qb.field_E);
                    qa.field_L = new gh(0L, ce.field_o);
                    bj.field_d = new gh(0L, c.field_p, ak.field_b.toUpperCase());
                    un.field_h = new qh[4 + param10][];
                    sl.field_k = new gh[4 + param10];
                    sl.field_k[0] = new gh(0L, dj.field_b, tm.field_c);
                    un.field_h[0] = new qh[6];
                    var17_int = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (5 <= var17_int) {
                        statePc = 27;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    un.field_h[0][var17_int - -1] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, hg.field_i[var17_int], m.field_j[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var21 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (-3 >= (jg.field_l.length ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 30: {
                    sl.field_k[1] = new gh(0L, dj.field_b, rb.field_d);
                    un.field_h[1] = new qh[jg.field_l.length - -1];
                    un.field_h[1][0] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, (wk) null, cb.field_e);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var17_int = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (jg.field_l.length <= var17_int) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    un.field_h[1][1 + var17_int] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, (wk) null, Integer.toString(jg.field_l[var17_int]));
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var21 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    sl.field_k[2] = new gh(0L, dj.field_b, SteelSentinels.field_H);
                    un.field_h[2] = new qh[3];
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (-2 > (tc.field_z ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 41: {
                    sl.field_k[3] = new gh(0L, dj.field_b, pc.field_o);
                    un.field_h[3] = new qh[1 + tc.field_z];
                    un.field_h[3][0] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, (wk) null, cb.field_e);
                    var17_int = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (tc.field_z <= var17_int) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    un.field_h[3][var17_int - -1] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, (wk) null, ck.field_b[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var21 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var17_int = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param10 <= var17_int) {
                        statePc = 77;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    sl.field_k[var17_int + 4] = new gh(0L, dj.field_b, al.field_a[var17_int]);
                    un.field_h[var17_int + 4] = new qh[ec.a((int) ub.field_f[var17_int], 255) + 1];
                    un.field_h[4 + var17_int][0] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, (wk) null, cb.field_e);
                    stackOut_49_0 = 0;
                    stackIn_78_0 = stackOut_49_0;
                    stackIn_50_0 = stackOut_49_0;
                    if (var21 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = stackIn_50_0;
                    stackIn_52_0 = stackOut_50_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var18 = stackIn_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if ((255 & ub.field_f[var17_int]) <= var18) {
                        statePc = 76;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = null;
                    stackIn_88_0 = stackOut_54_0;
                    stackIn_55_0 = stackOut_54_0;
                    if (var21 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = stackIn_55_0;
                    stackOut_55_1 = dc.field_b;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 != (Object) (Object) stackIn_56_1) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = null;
                    stackIn_65_0 = (wk) (Object) stackOut_59_0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 61: {
                    if (dc.field_b[var17_int] == null) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = dc.field_b[var17_int][var18];
                    stackIn_65_0 = stackOut_62_0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = null;
                    stackIn_65_0 = (wk) (Object) stackOut_64_0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var19_ref = stackIn_65_0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (bl.field_h == null) {
                        statePc = 74;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = null;
                    stackIn_68_0 = stackOut_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 == (Object) (Object) bl.field_h[var17_int]) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = bl.field_h[var17_int][var18];
                    stackIn_75_0 = stackOut_71_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = null;
                    stackIn_75_0 = (String) (Object) stackOut_73_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackOut_74_0 = null;
                    stackIn_75_0 = (String) (Object) stackOut_74_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var20 = stackIn_75_0;
                    un.field_h[4 - -var17_int][1 + var18] = new qh(0L, bf.field_Ab, (gh) null, qb.field_K, var19_ref, var20);
                    var18++;
                    if (var21 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var17_int++;
                    if (var21 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackOut_77_0 = 0;
                    stackIn_78_0 = stackOut_77_0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var17_int = stackIn_78_0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (param10 - -4 <= var17_int) {
                        statePc = 104;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = sl.field_k[var17_int];
                    stackIn_105_0 = (Object) (Object) stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (var21 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 == null) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    sl.field_k[var17_int].field_Ib = 11;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = null;
                    stackIn_88_0 = stackOut_87_0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 == (Object) (Object) un.field_h[var17_int]) {
                        statePc = 103;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var18 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if ((var18 ^ -1) <= (un.field_h[var17_int].length ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = un.field_h[var17_int][var18];
                    stackIn_105_0 = (Object) (Object) stackOut_91_0;
                    stackIn_92_0 = stackOut_91_0;
                    if (var21 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == null) {
                        statePc = 102;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = un.field_h;
                    stackIn_96_0 = stackOut_95_0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0[var17_int][var18].field_Tb == null) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    un.field_h[var17_int][var18].field_Tb.field_Ib = 11;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var18++;
                    if (var21 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var17_int++;
                    if (var21 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    rn.field_C = new gh(0L, rm.field_j);
                    fk.field_q = new gh(0L, rm.field_j);
                    rh.field_w = new gh(0L, gh.field_ib);
                    rh.field_w.b(bd.field_f, 6402);
                    stackOut_104_0 = rh.field_w;
                    stackIn_105_0 = (Object) (Object) stackOut_104_0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var17 = (gh) (Object) stackIn_105_0;
                    rh.field_w.field_Fb = 1;
                    var17.field_Kb = 1;
                    gl.field_y = new gh(0L, (gh) null);
                    gl.field_y.a(nm.field_q, 127);
                    gl.field_y.a(qa.field_L, 125);
                    qa.field_L.a(bj.field_d, 118);
                    var18 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if ((var18 ^ -1) <= (4 + param10 ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var21 != 0) {
                        statePc = 186;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = -2;
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 != (var18 ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackOut_112_0 = 2;
                    stackIn_113_0 = stackOut_112_0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (stackIn_113_0 <= jg.field_l.length) {
                        statePc = 119;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var21 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (3 != var18) {
                        statePc = 125;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (tc.field_z <= 1) {
                        statePc = 136;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    qa.field_L.a(sl.field_k[var18], 122);
                    var19 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (un.field_h[var18].length <= var19) {
                        statePc = 136;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var21 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = null;
                    stackIn_129_0 = stackOut_128_0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 != (Object) (Object) un.field_h[var18][var19]) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    qa.field_L.a((gh) (Object) un.field_h[var18][var19], 122);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var19++;
                    if (var21 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var18++;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var21 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    gl.field_y.a(rn.field_C, 123);
                    gl.field_y.a(fk.field_q, 120);
                    gl.field_y.a(rh.field_w, 120);
                    tf.field_a = new gh(0L, od.field_g, he.field_j.toUpperCase());
                    ta.field_i = new gh(0L, b.field_e, uh.field_f.toUpperCase());
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, int param12, int param13) {
        RuntimeException runtimeException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ll.field_i = null;
                        nb.b((byte) 108);
                        param10 = ul.a(11, param1, param12, param6, param10, param3, param4);
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
                        d.a(param10, param1, param7, param0, param13, param2, param8, (byte) -6, param11, param9);
                        if (param5 <= -121) {
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
                        oh.a((java.applet.Applet) null, (byte) -9);
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
                        qd.a(param7, (byte) 70, param11);
                        ug.a(-1, param10, param6, param7);
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
                    throw ci.a((Throwable) (Object) runtimeException, "oh.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_b = null;
            field_h = null;
            field_g = null;
            field_a = null;
            field_c = null;
            field_d = null;
            if (param0 != 1) {
                oh.a((int[]) null, false, (cm) null, (gk[]) null, (cm) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "oh.E(" + param0 + 41);
        }
    }

    final static void a(int[] param0, boolean param1, cm param2, gk[] param3, cm param4) {
        gk[] var5 = null;
        gk[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        fh var7 = null;
        gh var8 = null;
        gh var9 = null;
        gh var10 = null;
        gh var11 = null;
        wk[] var12 = null;
        wk[] var13 = null;
        wk[] var14 = null;
        gh var15 = null;
        wk[] var16 = null;
        wk[] var17 = null;
        int var18 = 0;
        L0: {
          var18 = SteelSentinels.field_G;
          var5 = cj.a(-115, "lobby", param2, "crowns");
          uc.field_l = var5.length;
          if (null != param3) {
            var6 = new gk[param3.length + uc.field_l];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7_int >= uc.field_l) {
                    break L3;
                  } else {
                    var6[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if ((param3.length ^ -1) >= (var7_int ^ -1)) {
                    break L5;
                  } else {
                    var6[uc.field_l - -var7_int] = param3[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6_array = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (uc.field_l <= var7_int) {
                break L8;
              } else {
                var6_array[var7_int] = 10;
                var7_int++;
                if (var18 != 0) {
                  break L7;
                } else {
                  if (var18 == 0) {
                    continue L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (param3 == null) {
                break L9;
              } else {
                L10: {
                  if (param0 != null) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if ((param3.length ^ -1) >= (var7_int ^ -1)) {
                          break L12;
                        } else {
                          var6_array[uc.field_l - -var7_int] = param3[var7_int].field_d;
                          var7_int++;
                          if (var18 != 0) {
                            break L7;
                          } else {
                            if (var18 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var18 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var7_int = 0;
                L13: while (true) {
                  if (param3.length <= var7_int) {
                    break L9;
                  } else {
                    var6_array[var7_int + uc.field_l] = param0[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L7;
                    } else {
                      if (var18 == 0) {
                        continue L13;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
            te.field_b = 2;
            db.field_b = 15;
            va.field_e = 2;
            da.field_g = 4;
            km.field_g = 11;
            break L7;
          }
          var7 = vd.a(param4, "lobby", param2, -1, "largefont");
          gd.field_kb = vd.a(param4, "lobby", param2, -1, "generalfont");
          nh.field_d = vd.a(param4, "lobby", param2, -1, "chatfont");
          var7.a((ea[]) (Object) var5, var6_array);
          gd.field_kb.a((ea[]) (Object) var5, var6_array);
          nh.field_d.a((ea[]) (Object) var5, var6_array);
          var8 = new gh(0L, (gh) null);
          var8.field_Ib = db.field_b;
          var8.field_nb = 16777215;
          var8.field_L = (mi) (Object) var7;
          var9 = var8;
          var8.field_Fb = 1;
          var9.field_Kb = 1;
          var10 = new gh(0L, (gh) null);
          var10.field_Ib = db.field_b;
          var10.field_nb = 16777215;
          var10.field_L = (mi) (Object) gd.field_kb;
          var10.field_Fb = 1;
          var11 = var10;
          var11.field_Kb = 1;
          qb.field_E = new gh(0L, var8);
          qb.field_E.field_I = ei.a(0, cf.a("heading", "lobby", (byte) -30, param2));
          kj.field_H = new gh(0L, (gh) null);
          kj.field_H.field_I = nl.a(param1, 8421504, false, -22, 120, 4210752);
          nc.field_n = new gh(0L, (gh) null);
          nc.field_n.field_I = se.a(3, 1, 6316128, 114, 6316128, 13574);
          kf.field_y = new gh(0L, (gh) null);
          kf.field_y.field_I = ei.a(0, cf.a("popup", "lobby", (byte) -94, param2));
          var12 = ei.a(0, cf.a("popup_mouseover", "lobby", (byte) -110, param2));
          var13 = cf.a("button", "lobby", (byte) -97, param2);
          var14 = ei.a(0, cf.a("tab_active", "lobby", (byte) -125, param2));
          od.field_g = new gh(0L, var8);
          od.field_g.field_I = var14;
          hg.field_e = new gh(0L, (gh) null);
          hg.field_e.field_Pb = rl.a(param2, "lobby", "closebutton", false);
          hg.field_e.field_db = rl.a(param2, "lobby", "closebutton_mouseover", param1);
          c.field_p = new gh(0L, var8);
          c.field_p.field_I = nl.a(true, 3815994, true, -100, 40, 2039583);
          sj.field_J = new gh(0L, var10);
          sj.field_J.field_ub = 2;
          sj.field_J.field_I = nl.a(true, 3815994, false, -15, 30, 2039583);
          im.field_f = new gh(0L, var10);
          im.field_f.field_ub = 2;
          im.field_f.field_I = nl.a(false, 3815994, false, -52, 30, 2039583);
          kb.field_b = new gh(0L, var10);
          kb.field_b.field_ub = 2;
          kb.field_b.field_I = nl.a(false, 3815994, true, -47, 30, 2039583);
          bd.field_f = new gh(0L, (gh) null);
          bd.field_f.field_L = (mi) (Object) gd.field_kb;
          bd.field_f.field_nb = 13421772;
          bd.field_f.field_Fb = 1;
          bd.field_f.field_Ib = db.field_b;
          qb.field_K = new gh(0L, bd.field_f);
          qb.field_K.field_xb = 16777215;
          qb.field_K.field_Mb = 16777215;
          qb.field_K.field_nb = 16764006;
          qb.field_K.field_rb = 16777215;
          qb.field_K.field_yb = 8421504;
          var15 = new gh(0L, qb.field_K);
          var15.field_Ib = db.field_b;
          var15.field_L = (mi) (Object) var7;
          var15.field_nb = 16777215;
          gh.field_ib = new gh(0L, bd.field_f);
          gh.field_ib.field_I = nl.a(false, 2236962, false, -54, 16, 2236962);
          gh.field_ib.field_ub = 2;
          dj.field_b = new gh(0L, bd.field_f);
          dj.field_b.field_I = nl.a(false, 1513239, false, -75, 16, 1513239);
          dj.field_b.field_ub = 2;
          SteelSentinels.field_J = new gh(0L, gh.field_ib);
          SteelSentinels.field_J.b(qb.field_K, 6402);
          bb.field_W = new gh(0L, dj.field_b);
          bb.field_W.b(qb.field_K, 6402);
          var16 = cf.a("button_mouseover", "lobby", (byte) -114, param2);
          jn.field_h = new dn(kf.field_y, var12, bd.field_f, qb.field_K, 3, 2, va.field_e, 3, db.field_b);
          fl.field_e = new gh(0L, qb.field_K);
          fl.field_e.field_I = var13;
          fl.field_e.field_Qb = 1;
          fl.field_e.field_Z = 1;
          fl.field_e.field_ob = 1;
          fl.field_e.field_Ab = var16;
          fl.field_e.field_ab = 1;
          fl.field_e.field_mb = cf.a("button_mouseheld", "lobby", (byte) -51, param2);
          fl.field_e.field_bb = cf.a("button_active", "lobby", (byte) -107, param2);
          fl.field_e.field_H = cf.a("button_disabled", "lobby", (byte) -104, param2);
          fl.field_e.field_Kb = 1;
          ka.field_U = new gh(0L, qb.field_K);
          ka.field_U.field_Kb = 1;
          ka.field_U.field_I = ei.a(0, cf.a("tab_inactive", "lobby", (byte) -115, param2));
          ka.field_U.field_Ab = ei.a(0, cf.a("tab_mouseover", "lobby", (byte) -29, param2));
          ka.field_U.field_bb = var14;
          be.field_c = new gh(0L, (gh) null);
          be.field_c.field_I = se.a(3, -1, 1856141, 206, 1127256, 13574);
          ce.field_o = new gh(0L, (gh) null);
          ce.field_o.field_I = se.a(3, -1, 11579568, 290, 6052956, 13574);
          rm.field_j = new gh(0L, var15);
          rm.field_j.field_Kb = 1;
          rm.field_j.field_Qb = 1;
          rm.field_j.field_Z = 1;
          rm.field_j.field_ab = 1;
          rm.field_j.field_ob = 1;
          b.field_e = new gh(0L, rm.field_j);
          gd.field_wb = new gh(0L, qb.field_K);
          gd.field_wb.field_Z = 1;
          gd.field_wb.field_Kb = 1;
          gd.field_wb.field_ob = 1;
          gd.field_wb.field_Qb = 1;
          gd.field_wb.field_ab = 1;
          fa.field_f = new gh(0L, gd.field_wb);
          co.field_c = new gh(0L, gd.field_wb);
          gm.field_c = new gh(0L, rm.field_j);
          ei.field_o = new gh(0L, gd.field_wb);
          jl.field_s = new gh(0L, gd.field_wb);
          bf.field_Ab = new gh(0L, gd.field_wb);
          gd.field_wb.field_I = ei.a(0, cf.a("smallbutton", "lobby", (byte) -39, param2));
          gd.field_wb.field_Ab = ei.a(0, cf.a("smallbutton_mouseover", "lobby", (byte) -72, param2));
          gd.field_wb.field_bb = ei.a(0, cf.a("smallbutton_active", "lobby", (byte) -79, param2));
          gd.field_wb.field_mb = ei.a(0, cf.a("smallbutton_active", "lobby", (byte) -79, param2));
          gd.field_wb.field_H = ei.a(0, cf.a("smallbutton_disabled", "lobby", (byte) -95, param2));
          b.field_e.field_I = ei.a(0, cf.a("mediumbutton", "lobby", (byte) -84, param2));
          b.field_e.field_Ab = ei.a(0, cf.a("mediumbutton_mouseover", "lobby", (byte) -30, param2));
          b.field_e.field_mb = ei.a(0, cf.a("mediumbutton_mouseheld", "lobby", (byte) -92, param2));
          rm.field_j.field_I = ei.a(0, cf.a("bigbutton", "lobby", (byte) -68, param2));
          rm.field_j.field_Ab = ei.a(0, cf.a("bigbutton_mouseover", "lobby", (byte) -23, param2));
          rm.field_j.field_mb = ei.a(0, cf.a("bigbutton_mouseheld", "lobby", (byte) -66, param2));
          rm.field_j.field_H = ei.a(0, cf.a("bigbutton_disabled", "lobby", (byte) -71, param2));
          fa.field_f.field_I = ei.a(0, cf.a("greenbutton", "lobby", (byte) -84, param2));
          fa.field_f.field_Ab = ei.a(0, cf.a("greenbutton_mouseover", "lobby", (byte) -50, param2));
          fa.field_f.field_mb = ei.a(0, cf.a("greenbutton_mouseheld", "lobby", (byte) -68, param2));
          co.field_c.field_I = ei.a(0, cf.a("redbutton", "lobby", (byte) -105, param2));
          co.field_c.field_Ab = ei.a(0, cf.a("redbutton_mouseover", "lobby", (byte) -24, param2));
          co.field_c.field_mb = ei.a(0, cf.a("redbutton_mouseheld", "lobby", (byte) -99, param2));
          gm.field_c.field_I = ei.a(0, cf.a("backbutton", "lobby", (byte) -109, param2));
          gm.field_c.field_Ab = ei.a(0, cf.a("backbutton_mouseover", "lobby", (byte) -31, param2));
          gm.field_c.field_mb = ei.a(0, cf.a("backbutton_mouseheld", "lobby", (byte) -62, param2));
          gm.field_c.field_H = ei.a(0, cf.a("backbutton_disabled", "lobby", (byte) -53, param2));
          bf.field_Ab.field_I = ei.a(0, cf.a("gameoptionbutton", "lobby", (byte) -58, param2));
          bf.field_Ab.field_Ab = ei.a(0, cf.a("gameoptionbutton_mouseover", "lobby", (byte) -53, param2));
          bf.field_Ab.field_bb = ei.a(0, cf.a("gameoptionbutton_active", "lobby", (byte) -52, param2));
          bf.field_Ab.field_mb = ei.a(0, cf.a("gameoptionbutton_active", "lobby", (byte) -52, param2));
          bf.field_Ab.field_H = ei.a(0, cf.a("gameoptionbutton_disabled", "lobby", (byte) -127, param2));
          ei.field_o.field_I = ei.a(0, cf.a("chatbutton", "lobby", (byte) -110, param2));
          ei.field_o.field_Ab = ei.a(0, cf.a("chatbutton_mouseover", "lobby", (byte) -42, param2));
          ei.field_o.field_bb = ei.a(0, cf.a("chatbutton_active", "lobby", (byte) -107, param2));
          ei.field_o.field_mb = ei.a(0, cf.a("chatbutton_active", "lobby", (byte) -107, param2));
          jl.field_s.field_I = ei.a(0, cf.a("chatfilterbutton", "lobby", (byte) -101, param2));
          jl.field_s.field_Ab = ei.a(0, cf.a("chatfilterbutton_mouseover", "lobby", (byte) -61, param2));
          jl.field_s.field_bb = ei.a(0, cf.a("chatfilterbutton_active", "lobby", (byte) -64, param2));
          jl.field_s.field_mb = ei.a(0, cf.a("chatfilterbutton_active", "lobby", (byte) -64, param2));
          var17 = cf.a("checkbox", "lobby", (byte) -92, param2);
          ol.field_Tb = new id(0L, var17[1], var17[0], 1, qb.field_K, (String) null);
          m.field_d = new gh(0L, (gh) null);
          m.field_d.field_I = hj.a((byte) 26, rl.a(param2, "lobby", "slideregion", param1));
          m.field_d.field_Ab = hj.a((byte) 26, rl.a(param2, "lobby", "slideregion_mouseover", false));
          m.field_d.field_mb = hj.a((byte) 26, rl.a(param2, "lobby", "slideregion_mouseheld", false));
          m.field_d.field_H = hj.a((byte) 26, rl.a(param2, "lobby", "slideregion_disabled", false));
          mj.field_Zb = new gh(0L, (gh) null);
          mj.field_Zb.field_I = ei.a(0, cf.a("dragbar", "lobby", (byte) -108, param2));
          mj.field_Zb.field_Ab = ei.a(0, cf.a("dragbar_mouseover", "lobby", (byte) -126, param2));
          mj.field_Zb.field_mb = ei.a(0, cf.a("dragbar_mouseheld", "lobby", (byte) -78, param2));
          mj.field_Zb.field_H = ei.a(0, cf.a("dragbar_disabled", "lobby", (byte) -14, param2));
          ue.field_f = new gh(0L, (gh) null);
          ue.field_f.field_Pb = rl.a(param2, "lobby", "upbutton", param1);
          ue.field_f.field_db = rl.a(param2, "lobby", "upbutton_mouseover", false);
          ue.field_f.field_fb = rl.a(param2, "lobby", "upbutton_mouseheld", false);
          ue.field_f.field_Ob = rl.a(param2, "lobby", "upbutton_disabled", false);
          cm.field_h = new gh(0L, (gh) null);
          cm.field_h.field_Pb = rl.a(param2, "lobby", "downbutton", param1);
          cm.field_h.field_db = rl.a(param2, "lobby", "downbutton_mouseover", false);
          cm.field_h.field_fb = rl.a(param2, "lobby", "downbutton_mouseheld", false);
          cm.field_h.field_Ob = rl.a(param2, "lobby", "downbutton_disabled", false);
          uh.field_j = new lb(0L, ue.field_f, cm.field_h, m.field_d, mj.field_Zb);
          l.field_e = new ql(0L, (gh) null, jk.field_h, uh.field_j, gd.field_wb, (String) null, (String) null);
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getCodeBase();
                            var3 = ge.a(0, var2, param0).getFile();
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
                            Object discarded$6 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
                            Object discarded$7 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
                            Object discarded$8 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
                            if (param1 > 115) {
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
                            field_a = null;
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
                            Object discarded$9 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
                            Object discarded$10 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
                            Object discarded$11 = hn.a("updatelinks", (byte) -41, param0, new Object[2]);
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
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_ref = caughtException;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = (RuntimeException) var2_ref2;
                            stackOut_10_1 = new StringBuilder().append("oh.B(");
                            stackIn_13_0 = stackOut_10_0;
                            stackIn_13_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (param0 == null) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                            stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                            stackOut_11_2 = "{...}";
                            stackIn_14_0 = stackOut_11_0;
                            stackIn_14_1 = stackOut_11_1;
                            stackIn_14_2 = stackOut_11_2;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 13: {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "null";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 34, 4, -1, -1};
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_d = "Buying or selling an account";
        field_c = "Owner";
        field_g = "Please check if address is correct";
        field_f = 0;
    }
}
