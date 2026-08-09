/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Virogrid extends od {
    private p field_I;
    static co field_O;
    private int[] field_N;
    private int[] field_D;
    private int field_E;
    private int[] field_B;
    private int[] field_C;
    private int[] field_K;
    private int field_A;
    private int[] field_M;
    private int[] field_H;
    private int[] field_L;
    private int[] field_G;
    private int[] field_J;
    public static boolean field_F;

    private final void r(int param0) {
        jf dupTemp$1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_F ? 1 : 0;
                    bc.field_c = 3;
                    ln.field_g = 3;
                    co.field_l = 3;
                    dupTemp$1 = new jf();
                    gb.field_H = dupTemp$1;
                    ke.field_p = dupTemp$1;
                    ad.field_g = new double[]{1.0, 0.0, 0.0};
                    vm.field_d = new double[]{0.0, 0.0, -128.0};
                    da.field_k = new double[3];
                    gb.c((byte) -44);
                    ke.field_p.field_d = true;
                    ce.field_E = 0;
                    bi.field_c = new int[]{0, 154, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                    gb.field_H.field_d = true;
                    c.field_d = new mg(640, 400);
                    we.field_e = new mg(640, 400);
                    mk.field_bb = new mg(200, 400);
                    var2 = 0;
                    if (param0 > 59) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    Virogrid.b((byte) -64, false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var2 >= 256) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    pj.field_d[var2] = rb.a(16711872, 143 * var2 << -1617433272);
                    pj.field_d[var2] = oh.a(pj.field_d[var2], rb.a(65280, var2 * 191));
                    pj.field_d[var2] = oh.a(pj.field_d[var2], var2);
                    var2++;
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    jm.a(320, 240, -2);
                    qa.field_e = -1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(byte param0) {
        int var2 = (id.field_r % 20480 << -2083455892) % 83886080;
        si.a(nk.field_K, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 700.0, 200.0, sj.field_j, 23967451 + var2, var2 - -59918628, 0, 16711680, ke.field_p.field_k);
        si.a(nk.field_K, new double[]{-768.0 + rf.field_c * 1800.0, 20.0, 300.0 + rf.field_c * 400.0}, new double[]{rf.field_c, 0.0, -rf.field_c}, 500.0, 200.0, sj.field_j, var2 - -59918628, 83820544 + var2, 0, 16711680, ke.field_p.field_k);
        if (param0 != -62) {
            return;
        }
        this.s(-1933);
    }

    private final void a(eh param0, byte param1, eh param2, eh param3, eh param4, eh param5) {
        mg discarded$2 = null;
        mg discarded$3 = null;
        RuntimeException runtimeException = null;
        int var8 = 0;
        int var9_int = 0;
        mg[][] var9 = null;
        int var10 = 0;
        mg var11 = null;
        int var12 = 0;
        mg var13 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hd.field_b = a.a("", param5, -110, "font", param4);
                        vg.field_H = a.a("", param5, -95, "smallfont", param4);
                        mc.field_b = a.a("", param5, -120, "menufont", param4);
                        re.field_o = a.a("", param5, -110, "tinyfont", param4);
                        var13 = sn.a(param5, "starfield", "", false);
                        sj.field_j = new mg(2560, 256);
                        sj.field_j.b();
                        var13.b(0, 0);
                        var13.b(1280, 0);
                        ca.field_M.a((byte) 29);
                        eh.field_l = vc.a(param5, "logo", "", (byte) 114);
                        sn.a(param5, "splash", "", false);
                        tk.field_d = ke.a("walk1", "", param5, 32370);
                        ic.field_y = ke.a("walk2", "", param5, 32370);
                        wh.field_b = ke.a("walk3", "", param5, 32370);
                        vb.field_l = new mg(640, 480);
                        ib.field_b = b.a("", param5, 7, "frame");
                        wf.a(100, mc.field_b, 0, vg.field_H);
                        en.field_Kb = 16777215;
                        la.field_k = 16777215;
                        sf.field_I = 16777215;
                        na.field_Hb = 8437759;
                        jl.field_E = 16777215;
                        ti.field_b = 8437759;
                        cb.field_d = ke.a(32, param5, "", "achievements_large");
                        mj.field_F = sn.a(param2, "unachieved", "basic", false);
                        ad.field_b = sn.a(param2, "orbcoin", "basic", false);
                        var8 = cb.field_d.length;
                        vd.field_Y = new mg[var8];
                        qc.a(123);
                        var9_int = -67 / ((param1 - -11) / 58);
                        var10 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var8 ^ -1) >= (var10 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = new mg(32, 32);
                        var11.b();
                        cb.field_d[var10].b(0, 0, 32, 32);
                        vd.field_Y[var10] = var11;
                        var10++;
                        if (var12 != 0) {
                            statePc = 7;
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
                        if (var12 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        tn.field_b = new mg(32, 32);
                        tn.field_b.b();
                        mj.field_F.b(0, 0, 32, 32);
                        ul.b((byte) 108);
                        kd.field_p = ke.a(32, param5, "", "viewicons");
                        discarded$2 = this.b(131586, -9105, 30136);
                        discarded$3 = this.b(263172, -9105, 6316128);
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
                        var9 = new mg[2][];
                        var9[0] = ke.a(32, param5, "", "turntime_icons");
                        var9[1] = ke.a(32, param5, "", "gridwidth_icons");
                        nn.a(var9, var9, 2, ra.field_e, m.field_a, param3, param2, true, -27871, wc.field_c, wc.field_c, wf.field_e, wn.field_j, 2, ng.field_T);
                        ak.field_e = sn.a(param5, "lobbyicon", "", false);
                        fk.a(new vl(param0, param5, 8, 128));
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("Virogrid.KB(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param2 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param4 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param5 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ck b(byte param0, boolean param1) {
        if (param0 != -32) {
            field_O = (co) null;
        }
        ck var2 = new ck(true);
        var2.field_d = param1 ? true : false;
        return var2;
    }

    final void c(boolean param0) {
        this.a(77, 14, 4, 0, 2, 1, false, 121);
        i var3 = new i();
        var3.a(128, 9, !param0 ? true : false);
        pe.a((java.awt.Component) ((Object) fi.field_v), var3, ei.field_c, param0, (byte) -18, 22050);
        this.a(false, true, -118, true, false, false, false);
        jc.field_i[60] = 4;
        jc.field_i[67] = 1;
        jc.field_i[63] = 1;
        jc.field_i[64] = 1;
        jc.field_i[65] = 1;
        jc.field_i[62] = 2;
        jc.field_i[9] = -1;
        jc.field_i[61] = 5;
        jc.field_i[10] = -1;
        jc.field_i[57] = -2;
        jc.field_i[58] = -2;
        jc.field_i[66] = 1;
        db.a((byte) 81, 200);
        this.r(114);
    }

    private final boolean c(byte param0, boolean param1) {
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_F ? 1 : 0;
                    a.b((byte) 69);
                    if (null == pj.field_c) {
                        statePc = 70;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!ge.field_c.c(0)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (ge.field_c.a((byte) -102, "basic")) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    al.a(uh.a("basic", sb.field_a, aa.field_c, -1, ge.field_c), 13, 10.0f);
                    return false;
                }
                case 5: {
                    if (!ge.field_c.c(0)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (!ge.field_c.a((byte) -102, "kartika13")) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    al.a(uh.a("kartika13", sb.field_a, aa.field_c, -1, ge.field_c), 13, 11.0f);
                    return false;
                }
                case 9: {
                    if (!s.field_a.c(0)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!s.field_a.a((byte) -102, "kartika13")) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    al.a(uh.a("roman20", we.field_j, mm.field_d, -1, s.field_a), param0 ^ -37, 12.0f);
                    return false;
                }
                case 13: {
                    if (!ge.field_c.c(0)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (ge.field_c.a((byte) -102, "lobby")) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    al.a(uh.a("lobby", sb.field_a, aa.field_c, -1, ge.field_c), 13, 13.0f);
                    return false;
                }
                case 17: {
                    if (!s.field_a.c(0)) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!s.field_a.a((byte) -102, "lobby")) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    al.a(uh.a("lobby", we.field_j, mm.field_d, -1, s.field_a), 13, 17.0f);
                    return false;
                }
                case 21: {
                    if (!pj.field_c.c(param0 + 42)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (pj.field_c.b(25867)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    al.a(uh.a("", ee.field_d, bm.field_n, -1, pj.field_c), param0 + 55, 20.0f);
                    return false;
                }
                case 25: {
                    if (!sf.field_O.c(0)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (sf.field_O.b(param0 ^ -25891)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    al.a(uh.a("", ee.field_d, bm.field_n, -1, sf.field_O), 13, 40.0f);
                    return false;
                }
                case 29: {
                    if (!el.field_d.c(0)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!el.field_d.b(25867)) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    al.a(pe.a(te.field_g, nh.field_r, el.field_d, 0, 0), 13, 45.0f);
                    return false;
                }
                case 33: {
                    if (!wm.field_w.c(param0 + 42)) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (wm.field_w.b(param0 + 25909)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    al.a(uh.a("", nh.field_r, te.field_g, -1, wm.field_w), 13, 60.0f);
                    return false;
                }
                case 37: {
                    if (!oj.field_Fb.c(0)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!oj.field_Fb.b(25867)) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    al.a(uh.a("", sb.field_a, aa.field_c, -1, oj.field_Fb), param0 + 55, 75.0f);
                    return false;
                }
                case 41: {
                    if (!g.field_a.c(0)) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (g.field_a.b(25867)) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    al.a(uh.a("", sb.field_a, aa.field_c, -1, g.field_a), 13, 75.0f);
                    return false;
                }
                case 45: {
                    if (!md.field_h.c(param0 ^ -42)) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (md.field_h.b(25867)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    al.a(uh.a("", sk.field_b, gl.field_a, -1, md.field_h), 13, 75.0f);
                    return false;
                }
                case 49: {
                    if (!wn.field_i.c(0)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (!wn.field_i.b(25867)) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    al.a(uh.a("", pl.field_d, fa.field_m, -1, wn.field_i), 13, 75.0f);
                    return false;
                }
                case 53: {
                    if (!gn.field_G.c(param0 ^ -42)) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (gn.field_G.b(param0 + 25909)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    al.a(uh.a("", vl.field_m, gn.field_H, param0 + 41, gn.field_G), 13, 75.0f);
                    return false;
                }
                case 57: {
                    if (!ng.field_T.c(param0 + 42)) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (!ng.field_T.b(param0 + 25909)) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    al.a(db.a(ng.field_T, sk.field_b, (byte) -118, gl.field_a), 13, 77.0f);
                    return false;
                }
                case 61: {
                    al.a(hn.field_u, 13, 78.0f);
                    if (param1) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return false;
                }
                case 63: {
                    ge.b(18887);
                    this.b(true);
                    af.field_g = new jg(pj.field_c, sf.field_O);
                    af.field_g.a((byte) 86, "", "menu_select");
                    of.field_b = af.field_g.a((byte) 112, "", "tetralink_invalid_move");
                    tk.field_c = new ml[5];
                    td.field_d = new ml[5];
                    var3 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var3 >= 5) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    tk.field_c[var3] = af.field_g.a((byte) 84, "", "tetralink_drop_piece_" + (var3 + 1));
                    td.field_d[var3] = af.field_g.a((byte) 95, "", "tetralink_piece_inplace_" + (1 + var3));
                    var3++;
                    if (var4 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var4 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    qd.field_i = af.field_g.a((byte) 92, "", "tetralink_reset_board");
                    bg.field_Lb = af.field_g.a((byte) 119, "", "tetralink_second_tick");
                    wc.field_a = af.field_g.a((byte) 96, "", "tetralink_select_column");
                    u.field_t = af.field_g.a((byte) 110, "", "tetralink_start_game");
                    f.field_j = af.field_g.a((byte) 118, "", "tetralink_winning_line_sound_winner");
                    cg.field_d = af.field_g.a((byte) 82, "", "tetralink_winning_line_sound_loser");
                    af.field_g.a((byte) 90, "", "tetralink_title_appear");
                    ih.field_d = af.field_g.a((byte) 99, "", "tetralink_dissolve");
                    af.field_k = af.field_g.a((byte) 103, "", "tetralink_dissolve_in");
                    dj.field_f = new ml[3];
                    dj.field_f[0] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_1");
                    dj.field_f[1] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_2");
                    dj.field_f[2] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_3");
                    pj.field_c = null;
                    sf.field_O = null;
                    sb.a(param0 + 15);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    return false;
                }
                case 70: {
                    if (param0 == -42) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    this.field_L = (int[]) null;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (wm.field_w == null) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    al.a(mi.field_e, param0 ^ -37, 80.0f);
                    this.b(true);
                    oi.field_c = new sc[4];
                    oi.field_c[0] = sc.a(wm.field_w, "", "ataxx titlescreen");
                    oi.field_c[1] = sc.a(wm.field_w, "", "tetralink ingame 1");
                    oi.field_c[2] = sc.a(wm.field_w, "", "tetralink ingame 2");
                    oi.field_c[3] = sc.a(wm.field_w, "", "tetralink ingame 3");
                    var3 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((var3 ^ -1) <= -5) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    vg.field_B.a(el.field_d, 0, af.field_g, oi.field_c[var3], 0);
                    var3++;
                    if (var4 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var4 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    vg.field_B.e(-1);
                    af.field_g = null;
                    el.field_d = null;
                    wm.field_w = null;
                    sb.a(-90);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    return false;
                }
                case 80: {
                    if (null != g.field_a) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    al.a(aj.field_l, 13, 90.0f);
                    this.b(true);
                    this.a(gn.field_G, (byte) -105, ge.field_c, s.field_a, g.field_a, oj.field_Fb);
                    s.field_a = null;
                    g.field_a = null;
                    sb.a(-82);
                    return false;
                }
                case 83: {
                    if (null != wn.field_i) {
                        statePc = 85;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 85: {
                    al.a(gl.field_i, 13, 95.0f);
                    this.b(true);
                    this.a(1053, wn.field_i);
                    wn.field_i = null;
                    sb.a(param0 + -63);
                    return false;
                }
                case 86: {
                    if (null != md.field_h) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    cg.a(8799, new ii(md.field_h.a("", 100, "huffman")));
                    md.field_h = null;
                    sb.a(param0 + -86);
                    return false;
                }
                case 89: {
                    pn.a(false);
                    var3 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (var3 >= 12) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    al.field_j[var3] = new oi(var3);
                    var3++;
                    if (var4 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var4 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    hm.field_c = 10;
                    i.field_y = 10;
                    fh.a((byte) -89);
                    qc.a(50, (byte) 111);
                    bm.c(-111, 50);
                    ei.a(0, oi.field_c[0]);
                    id.field_r = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void u(int param0) {
        field_O = null;
        if (param0 != 240) {
            field_O = (co) null;
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (db.b((byte) 13, 0)) {
            if (!(0 >= hj.field_h)) {
                var2 = id.field_c - hj.field_h;
                var3 = -700;
                var4 = 4 * var2 + -1300;
                var5 = 200;
                if (100 > var2) {
                    var5 = var5 - (var2 + 200);
                    var3 = -20000 + var3 + var2 * 200;
                }
                var6 = -2048;
                var7 = id.a(var6, 32);
                var8 = nf.a(21855, var6);
                ae.field_e = new int[]{var3, var5, var4, var8, 0, -var7, 0, 65536, 0, var7, 0, var8};
                ri.field_a.a(pe.field_j, ae.field_e);
                ri.field_a.c();
            }
        }
        if (param0 != -1933) {
            this.field_D = (int[]) null;
        }
    }

    private final void f(byte param0) {
        int stackIn_43_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        fl var3_ref_fl = null;
        int var4 = 0;
        pm var4_ref_pm = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_F ? 1 : 0;
                    var2 = 1;
                    if ((hm.field_c ^ -1) != (i.field_y ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (nf.field_g == pg.field_g) {
                        statePc = 18;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (i.field_y != -2) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (we.field_l < 16) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    dj.a(pg.field_g, false, -1, 3, hm.field_c);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2 = 0;
                    ej.a(false, 25680);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 == (hm.field_c ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (we.field_l < 16) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    dj.a(pg.field_g, false, 33 + -we.field_l, 3, hm.field_c);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    dj.a(nf.field_g, false, 1 + we.field_l, 3, i.field_y);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((we.field_l ^ -1) > -17) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2 = 0;
                    ej.a(false, 25680);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    dj.a(nf.field_g, false, -1, 3, i.field_y);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (1 == (i.field_y ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    dj.a(nf.field_g, true, -1, 3, i.field_y);
                    if (var8 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ej.a(false, 25680);
                    var2 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var2 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (null == ci.field_s) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (sj.field_o != cc.field_x) {
                        statePc = 26;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 26: {
                    cc.field_x = sj.field_o;
                    lj.field_r = sg.field_i;
                    cf.field_c = sj.field_o;
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    gb.c((byte) -44);
                    ci.field_s = new mg(640, 480);
                    pj.a(ci.field_s, 256);
                    df.b(0, 0, 640, 480, 3158064);
                    var3 = j.field_b;
                    var4 = tm.field_g;
                    jm.a(320, 240, -2);
                    var19 = new int[12];
                    var12 = var19;
                    var5_ref_int__ = var12;
                    var6 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var6 ^ -1) <= -4) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var5_ref_int__[var6] = pe.field_j[var6] << -412966013;
                    var6++;
                    if (var8 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var8 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6 = 3;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((var19.length ^ -1) >= (var6 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var5_ref_int__[var6] = pe.field_j[var6];
                    var6++;
                    if (var8 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var8 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.e((byte) -62);
                    kg.field_c.a(pe.field_j, bi.field_c);
                    nb.field_x.a(pe.field_j, bi.field_c);
                    kf.field_c.a(pe.field_j, bi.field_c);
                    cm.field_k.a(pe.field_j, bi.field_c);
                    ba.field_c.a(pe.field_j, bi.field_c);
                    wf.field_j.a(pe.field_j, bi.field_c);
                    th.field_y.a(var19, bi.field_c);
                    pj.field_a.a(var19, bi.field_c);
                    qg.field_h.a(var19, bi.field_c);
                    jg.field_i.a(var19, bi.field_c);
                    ee.field_a.a(var19, bi.field_c);
                    og.field_l.a(var19, bi.field_c);
                    ab.field_L.a(var19, bi.field_c);
                    rc.field_o.a(var19, bi.field_c);
                    hn.field_x.a(var19, bi.field_c);
                    td.field_i.a(var19, bi.field_c);
                    ul.b((byte) 109);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    jm.a(var3, var4, -2);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    ci.field_s.b(0, tm.field_g + -240);
                    if (!ke.field_p.field_m) {
                        statePc = 44;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var3 = id.field_r % 64;
                    if (-33 >= (var3 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = var3 + -16;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = 48 - var3;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var3 = stackIn_43_0;
                    var3 = var3 << 2;
                    var21 = new int[3];
                    var14 = var21;
                    var9 = var14;
                    var28 = var9;
                    var20 = new int[3];
                    var13 = var20;
                    var10 = var13;
                    var29 = var10;
                    var22 = new int[3];
                    var15 = var22;
                    var6_ref_int__ = var15;
                    var9[0] = (int)ao.field_Hb;
                    var20[0] = 50;
                    var9[1] = -(int)ao.field_Hb;
                    var6_ref_int__[0] = (var3 >> -498345404) + 128;
                    var20[1] = 50;
                    var21[2] = 0;
                    var6_ref_int__[1] = (var3 >> 903526148) + 128;
                    var20[2] = 80;
                    var22[2] = 128;
                    var7 = si.a(8437759);
                    qf.a(240, 0, 0, var28, var29, var22, var7, var7, var7);
                    var3 = var21[0];
                    var9[0] = var21[1];
                    var21[1] = var3;
                    var3 = var20[0];
                    var10[0] = var20[1];
                    var20[1] = var3;
                    var3 = var22[0];
                    var6_ref_int__[0] = var22[1];
                    var22[1] = var3;
                    qf.a(240, 0, 0, var28, var29, var22, var7, var7, var7);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (ke.field_p.field_d) {
                        statePc = 46;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var25 = c.field_d.field_B;
                    var18 = var25;
                    var11 = var18;
                    var3_ref_int__ = var11;
                    if (-1 <= (co.field_h ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var6 = 256000;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (-1 <= (var6 ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var6--;
                    var4 = 16711935 & var25[var6];
                    var5 = 65280 & var25[var6];
                    var4 = var4 * (256 + -co.field_h);
                    var4 = var4 & -16711936;
                    var5 = var5 * (256 - co.field_h);
                    var5 = var5 & 16711680;
                    var4 = var4 + (co.field_h * 16711935 & -16711936);
                    var5 = var5 + (16711680 & co.field_h * 65280);
                    var11[var6] = oh.a(var5, var4) >>> -307183480;
                    if (var8 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var8 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    pj.a(c.field_d, 256);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var4_ref_pm = (pm) ((Object) gd.field_n.a((byte) -107));
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var4_ref_pm == null) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    rk.a(var4_ref_pm.field_m, var4_ref_pm.field_h, var4_ref_pm.field_r << -949217277, 10000);
                    var4_ref_pm = (pm) ((Object) gd.field_n.a(16213));
                    if (var8 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var8 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    ul.b((byte) 86);
                    c.field_d.d(j.field_b + -(c.field_d.field_w >> -520710623), -(c.field_d.field_p >> -80635967) + tm.field_g);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((ke.field_p.field_f ^ -1) < -1) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    rk.a(j.field_b - (c.field_d.field_w >> 1175213633), tm.field_g - (c.field_d.field_p >> -1532224799), (c.field_d.field_w >> 754109761) + j.field_b, -(c.field_d.field_p >> -1055677983) + tm.field_g, 40, ke.field_p.field_f, pj.field_d);
                    rk.a((c.field_d.field_w >> 1488812609) + j.field_b, -(c.field_d.field_p >> -1740488575) + tm.field_g, (c.field_d.field_w >> 878374113) + j.field_b, tm.field_g + (c.field_d.field_p >> -709682687), 40, ke.field_p.field_f, pj.field_d);
                    rk.a((c.field_d.field_w >> -524379871) + j.field_b, tm.field_g + (c.field_d.field_p >> -1496783103), -(c.field_d.field_w >> -798391391) + j.field_b, tm.field_g - -(c.field_d.field_p >> 1947554369), 40, ke.field_p.field_f, pj.field_d);
                    rk.a(j.field_b + -(c.field_d.field_w >> -1295443103), tm.field_g - -(c.field_d.field_p >> -1354931231), j.field_b - (c.field_d.field_w >> -1365650591), tm.field_g - (c.field_d.field_p >> -1493913631), 40, ke.field_p.field_f, pj.field_d);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var3_ref_fl = (fl) ((Object) sh.field_tb.a((byte) -108));
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (var3_ref_fl == null) {
                        statePc = 69;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var4 = var3_ref_fl.field_n >> 1113140140;
                    var6 = 512 + (var3_ref_fl.field_m >> -2081407860);
                    var5 = var3_ref_fl.field_p >> 926962540;
                    stackIn_70_0 = -1;
                    stackIn_65_0 = stackIn_70_0;
                    stackIn_70_1 = var6 ^ -1;
                    stackIn_65_1 = stackIn_70_1;
                    if (var8 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 > stackIn_65_1) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    df.a((var4 << 872440237) / var6 + (j.field_b << 709710660), (tm.field_g << -1694155324) + (var5 << 2046275885) / var6, 65536 / var6, var3_ref_fl.field_o * 5 / 3, pj.field_d);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var3_ref_fl = (fl) ((Object) sh.field_tb.a(16213));
                    if (var8 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = 14;
                    stackIn_70_1 = (param0 - -76) / 33;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var3 = stackIn_70_0 / stackIn_70_1;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        Object stackIn_3_0 = null;
        ic stackIn_17_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        Object var2;
        ic var3;
        int var4;
        hj var4_ref_hj;
        int var5;
        int var6;
        int var7;
        Object var8;
        L0: {
          var7 = field_F ? 1 : 0;
          if (null == ih.field_b) {
            stackIn_3_0 = fi.field_v;
            break L0;
          } else {
            stackIn_3_0 = ih.field_b;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        var2 = var8;
        if (!j.a(-1)) {
          if (i.field_H) {
            if (!jm.a((byte) -85)) {
              al.a(sk.field_b, 13, 100.0f);
              uh.a((byte) 83, (java.awt.Canvas) (var8));
              return;
            } else {
              L1: {
                L2: {
                  if (!ke.field_p.field_g) {
                    break L2;
                  } else {
                    this.e(true);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.f((byte) 54);
                break L1;
              }
              L3: {
                if (null != vg.field_I) {
                  stackIn_17_0 = vg.field_I;
                  break L3;
                } else {
                  stackIn_17_0 = ei.field_b;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3 = stackIn_17_0;
                  if (var3 != null) {
                    break L5;
                  } else {
                    fa.a(-30265);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var3.c(-16, true);
                fa.a(-30265);
                if (!ok.field_J) {
                  break L4;
                } else {
                  if (vm.field_e) {
                    ok.b(f.b(-844), 3410);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                L7: {
                  if ((hm.field_c ^ -1) != (i.field_y ^ -1)) {
                    break L7;
                  } else {
                    if (pg.field_g == nf.field_g) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-2 == i.field_y) {
                    break L8;
                  } else {
                    if (-2 != hm.field_c) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                }
                if (we.field_l < 16) {
                  break L6;
                } else {
                  break L6;
                }
              }
              L9: {
                L10: {
                  if (!ok.field_J) {
                    break L10;
                  } else {
                    if (vm.field_e) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                ok.b(f.b(-844), 3410);
                break L9;
              }
              L11: {
                L12: {
                  if (ug.a(param0)) {
                    break L12;
                  } else {
                    L13: {
                      if (ak.b(-31609)) {
                        break L13;
                      } else {
                        L14: {
                          if (!eg.a((byte) 47)) {
                            break L14;
                          } else {
                            var4 = 24 + rh.a(-16118);
                            var5 = pg.a(true) - -26;
                            dg.b(var5, -125, var4);
                            fm.a(false);
                            if (var7 == 0) {
                              break L11;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (this.field_I.b((byte) 64)) {
                          break L11;
                        } else {
                          L15: {
                            L16: {
                              var4_ref_hj = (hj) ((Object) this.field_I.a((byte) -103));
                              var6 = this.field_A;
                              if (-81 < (var6 ^ -1)) {
                                break L16;
                              } else {
                                L17: {
                                  if (-231 >= (var6 ^ -1)) {
                                    break L17;
                                  } else {
                                    var5 = 8;
                                    if (var7 == 0) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var5 = 123 - var6 / 2;
                                if (var7 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var5 = -32 + var6 / 2;
                            break L15;
                          }
                          vd.field_Y[var4_ref_hj.field_i].d(8, var5);
                          hd.field_b.b(qk.field_d[var4_ref_hj.field_i], 48, hd.field_b.field_H + var5, 8437759, -1);
                          if (var7 == 0) {
                            break L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (ih.field_b != null) {
                          break L19;
                        } else {
                          if (!fe.field_Gb) {
                            stackIn_52_0 = 0;
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      stackIn_52_0 = 1;
                      break L18;
                    }
                    fd.a(stackIn_52_0 != 0, -20248);
                    if (var7 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L20: {
                  df.g(0, 0, df.field_e, df.field_f);
                  if (param0) {
                    stackIn_56_0 = 0;
                    break L20;
                  } else {
                    stackIn_56_0 = 1;
                    break L20;
                  }
                }
                var4 = ma.a(stackIn_56_0 != 0) - -24;
                var5 = Virogrid.q(-80) + 26;
                dg.b(var5, -124, var4);
                qi.b(-5205);
                break L11;
              }
              L21: {
                if (tg.field_x == 0) {
                  break L21;
                } else {
                  ij.a(-119, (16 - wa.field_K) * 256 / 16);
                  break L21;
                }
              }
              L22: {
                if (-3 >= (hd.field_d ^ -1)) {
                  hd.field_b.b(Integer.toString(mj.field_E), 4, 24, 16777215, -1);
                  break L22;
                } else {
                  break L22;
                }
              }
              td.a(-30179, (java.awt.Canvas) (var8), 0, 0);
              return;
            }
          } else {
            uh.a((byte) 46, (java.awt.Canvas) (var8));
            return;
          }
        } else {
          cm.a((java.awt.Canvas) (var8), (byte) -47, mi.a((byte) -121));
          return;
        }
    }

    private final static int q(int param0) {
        int var1 = -13 / ((param0 - -32) / 40);
        return sg.field_n;
    }

    private final void a(int param0, eh param1) {
        qb var27 = null;
        qb var4 = null;
        qb var5 = null;
        qb var6 = null;
        qb var7 = null;
        qb var8 = null;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        qb var17 = null;
        qb var18 = null;
        qb var19 = null;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        qb var26 = null;
        fk.a(1.0f);
        fk.a();
        if (param0 != 1053) {
            return;
        }
        try {
            var27 = qb.a(param1, "", "scenery_walls");
            var4 = qb.a(param1, "", "scenery_walls2");
            var5 = qb.a(param1, "", "scenery_game-table");
            var6 = qb.a(param1, "", "scenery_floor");
            var7 = qb.a(param1, "", "scenery_props1");
            var8 = qb.a(param1, "", "scenery_props2");
            var9 = qb.a(param1, "", "scenery_ceiling");
            var10 = qb.a(param1, "", "scenery_door");
            var11 = qb.a(param1, "", "scenery_game-screen_back");
            var12 = qb.a(param1, "", "scenery_game-screen_front");
            var13 = qb.a(param1, "", "scenery_game-screen_front-left");
            var14 = qb.a(param1, "", "scenery_game-screen_back-left");
            var15 = qb.a(param1, "", "scenery_game-screen_back-top");
            var16 = qb.a(param1, "", "scenery_game-screen_front-right");
            var17 = qb.a(param1, "", "scenery_game-screen_back-right");
            var18 = qb.a(param1, "", "scenery_game-screen_front-top");
            var19 = qb.a(param1, "", "scenery_game-screen_front-black");
            var20 = qb.a(param1, "", "scenery_game-screen_back-black");
            this.a(var11, (byte) 69);
            this.a(var12, (byte) 69);
            this.a(var13, (byte) 69);
            this.a(var14, (byte) 69);
            this.a(var16, (byte) 69);
            this.a(var17, (byte) 69);
            this.a(var15, (byte) 69);
            this.a(var18, (byte) 69);
            this.a(var19, (byte) 69);
            this.a(var20, (byte) 69);
            this.field_J = this.a((byte) 124, var11);
            this.field_K = this.a((byte) 118, var12);
            this.field_D = this.a((byte) 94, var13);
            this.field_B = this.a((byte) 116, var16);
            this.field_C = this.a((byte) 74, var18);
            this.field_L = this.a((byte) 116, var19);
            this.field_M = this.a((byte) 64, var14);
            this.field_G = this.a((byte) 69, var17);
            this.field_H = this.a((byte) 107, var15);
            this.field_N = this.a((byte) 69, var20);
            var21 = 96;
            var22 = 2260;
            var23 = 0;
            var24 = 256;
            var25 = 0;
            if (!(!db.b((byte) 13, 0))) {
                var26 = qb.a(param1, "", "ghost_untextured");
                ri.field_a = (il) ((Object) var26.a(var21, var22, var23, var24, var25));
                var23 = 64;
                var21 = 42;
            }
            kf.field_c = (il) ((Object) var27.a(var21, var22, var23, var24, var25));
            cm.field_k = (il) ((Object) var4.a(var21, var22, var23, var24, var25));
            fl.field_s = (il) ((Object) var5.a(var21, var22, var23, var24, var25));
            nb.field_x = (il) ((Object) var6.a(var21, var22, var23, var24, var25));
            ba.field_c = (il) ((Object) var7.a(var21, var22, var23, var24, var25));
            wf.field_j = (il) ((Object) var8.a(var21, var22, var23, var24, var25));
            kg.field_c = (il) ((Object) var9.a(var21, var22, var23, var24, var25));
            lk.field_Qb = (il) ((Object) var10.a(var21, var22, var23, var24, var25));
            var13.d();
            var14.d();
            var14.a(var13, 0, 0, 0, false);
            var16.d();
            var17.d();
            var17.a(var16, 0, 0, 0, false);
            th.field_y = (il) ((Object) var11.a(var21, var22, var23, var24, var25));
            ee.field_a = (il) ((Object) var12.a(var21, var22, var23, var24, var25));
            qg.field_h = (il) ((Object) var14.a(var21, var22, var23, var24, var25));
            jg.field_i = (il) ((Object) var17.a(var21, var22, var23, var24, var25));
            pj.field_a = (il) ((Object) var15.a(var21, var22, var23, var24, var25));
            ab.field_L = (il) ((Object) var13.a(var21, var22, var23, var24, var25));
            rc.field_o = (il) ((Object) var16.a(var21, var22, var23, var24, var25));
            og.field_l = (il) ((Object) var18.a(var21, var22, var23, var24, var25));
            hn.field_x = (il) ((Object) var20.a(var21, var22, var23, var24, var25));
            td.field_i = (il) ((Object) var19.a(var21, var22, var23, var24, var25));
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        String[] array$1 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        double stackIn_77_0 = 0.0;
        int stackIn_91_0 = 0;
        String[] stackIn_104_0 = null;
        String[] stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        String[] stackIn_105_0 = null;
        String[] stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        String[] stackIn_106_0 = null;
        String[] stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        String stackIn_106_3 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int statePc = 0;
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String[] var5_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ic var7_ref_ic = null;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = field_F ? 1 : 0;
                    lj.c(param0 ^ -28791807);
                    tl.field_l = km.e(param0 ^ -125);
                    kh.a(false);
                    if (null == ih.field_b) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!ih.field_b.field_a) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    am.a((byte) -16);
                    qc.b((byte) -12);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = this;
                    stackIn_4_0 = stackIn_5_0;
                    if (ih.field_b == null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = this;
                    stackIn_6_1 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    this.a(stackIn_6_1 != 0, 121);
                    if (!i.field_w) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.t(param0 ^ 13);
                    i.field_w = false;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    id.field_r = id.field_r + 1;
                    if (id.field_r != 500) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (10 != hm.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    el.a(12229, false);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (!j.a(-1)) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.m(1);
                    if (!j.a(-1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!me.b(66)) {
                        statePc = 184;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    discarded$0 = this.c((byte) -42, false);
                    return;
                }
                case 15: {
                    if (!i.field_H) {
                        statePc = 54;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (!jm.a((byte) 118)) {
                        statePc = 52;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (!ug.a(true)) {
                        statePc = 30;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((tg.field_x ^ -1) == -1) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(false, false);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var2 = ca.a(2);
                    if (-3 == (var2 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var2 == 3) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-5 == (var2 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 25: {
                    a.field_D = true;
                    gn.a((byte) 53, jc.field_j, 0);
                    if (var11 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    a.field_D = false;
                    ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_A + hd.field_b.field_G, 8, -16824, true, 240);
                    if (var11 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    am.a((byte) -16);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.a(false, true);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (ak.b(-31609)) {
                        statePc = 41;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (eg.a((byte) 47)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.a(false, false);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if ((tg.field_x ^ -1) == -1) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.a(false, false);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2 = d.f((byte) 57);
                    if (1 == var2) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    bj.field_n = true;
                    gn.a((byte) -56, qe.field_l, 0);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    this.a(false, true);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = this;
                    stackIn_42_0 = stackIn_43_0;
                    if (ih.field_b == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = this;
                    stackIn_44_1 = 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = this;
                    stackIn_44_1 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var2 = this.c(stackIn_44_1 != 0, -120);
                    if (1 == var2) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var2 ^ -1) != -3) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (null == ih.field_b) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    am.a((byte) -16);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var2 != 2) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ha.a((byte) 39, (java.applet.Applet) (this));
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.a(false, true);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ee.b(false);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    jb.a(og.field_b, param0 + 45);
                    if (!this.c((byte) -42, true)) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    i.field_H = true;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (!kd.a(-122, jc.field_i)) {
                        statePc = 151;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_152_0 = 9;
                    stackIn_62_0 = stackIn_152_0;
                    stackIn_152_1 = ci.field_q;
                    stackIn_62_1 = stackIn_152_1;
                    if (var11 != 0) {
                        statePc = 152;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 == stackIn_62_1) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    wm.c((byte) -86);
                    jk.field_c = 2;
                    ec.field_z = 3.1415927410125732f;
                    hm.field_c = 9;
                    qe.field_k = false;
                    em.field_c = 128.0f;
                    kn.field_J = sh.field_qb.h(-117);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (-15 == (ci.field_q ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    vm.a((byte) 30, ih.field_d);
                    wm.c((byte) -86);
                    jj.a(ra.a(8742, 2), ci.j(param0 + -126), ra.field_e, 8, eg.d(1048576), 1024, 150, ra.a(8742, 2000), wn.field_j.length, ri.b((byte) 51));
                    dl.a(bf.a((byte) -96), (byte) -127, fa.c(16777215));
                    hm.field_c = -2;
                    qe.field_k = false;
                    aj.field_a = true;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (ci.field_q == 15) {
                        statePc = 70;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (aj.field_a) {
                        statePc = 72;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 72: {
                    wm.c((byte) -86);
                    wm.b(param0 ^ 2);
                    fn.a((byte) -69);
                    hm.field_c = 0;
                    th.field_q = true;
                    mn.field_e = true;
                    vm.field_e = false;
                    dd.field_a = false;
                    aj.field_a = false;
                    on.field_d = false;
                    jm.a(320, 240, param0 ^ -2);
                    if (null == vg.field_I) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (1 == vg.field_I.field_e) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = 3.141592653589793;
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = 0.0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    sj.field_o = (float)stackIn_77_0;
                    el.a(false, (byte) -106);
                    vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                    vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                    ka.a(true, (byte) 87);
                    gb.c((byte) -44);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    eh.field_e = false;
                    qe.field_k = false;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((ci.field_q ^ -1) != -11) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (!aj.field_a) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    bj.a(-51);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (67 != ci.field_q) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var2 = sh.field_qb.g(11132);
                    var3 = 1 << var2;
                    rn.field_c = rn.field_c | var3;
                    this.field_I.a(new hj(var2), (byte) -61);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (ci.field_q == 57) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (ci.field_q == 58) {
                        statePc = 88;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 88: {
                    wm.c((byte) -86);
                    var2 = sh.field_qb.g(11132);
                    var3 = sh.field_qb.g(11132);
                    if ((sh.field_qb.g(11132) ^ -1) == -1) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_91_0 = 1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 90: {
                    stackIn_91_0 = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var4_int = stackIn_91_0;
                    var5_ref_String__ = new String[2];
                    var7 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if ((var5_ref_String__.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var5_ref_String__[var7] = sh.field_qb.i(15070);
                    var7++;
                    if (var11 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var11 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var6 = -2;
                    var6 = sh.field_qb.a((byte) 62);
                    var6 = var6 - (var6 >>> 677961951);
                    var7_ref_ic = new ic(true, var2, var5_ref_String__, var6, var4_int != 0, var3, 0);
                    var7_ref_ic.field_C.a(sh.field_qb, (byte) 57);
                    var7_ref_ic.field_A.a(false);
                    if (-58 != (ci.field_q ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    dd.field_a = true;
                    vg.field_I = var7_ref_ic;
                    if (!var7_ref_ic.field_t) {
                        statePc = 103;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var8 = var7_ref_ic.field_C.field_c[0];
                    var9_int = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (!jc.a(var8, true)) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var9_int++;
                    var8 = var7_ref_ic.field_C.field_c[var9_int];
                    if (var11 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var11 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var12 = oi.a(new String[]{var8}, pc.field_e, 2);
                    gf.a(mi.field_d, 0, false, var12, 1, var7_ref_ic.field_C.field_c[0]);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    array$1 = new String[1];
                    stackIn_105_0 = (String[]) (array$1);
                    stackIn_104_0 = stackIn_105_0;
                    stackIn_105_1 = (String[]) (array$1);
                    stackIn_104_1 = stackIn_105_1;
                    stackIn_105_2 = 0;
                    stackIn_104_2 = stackIn_105_2;
                    if (-1 != (var6 ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = (String[]) ((Object) stackIn_104_0);
                    stackIn_106_1 = (String[]) ((Object) stackIn_104_1);
                    stackIn_106_2 = stackIn_104_2;
                    stackIn_106_3 = uk.field_g;
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = (String[]) ((Object) stackIn_105_0);
                    stackIn_106_1 = (String[]) ((Object) stackIn_105_1);
                    stackIn_106_2 = stackIn_105_2;
                    stackIn_106_3 = pb.field_k;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    stackIn_106_1[stackIn_106_2] = stackIn_106_3;
                    var13 = oi.a(stackIn_106_0, rf.field_f, 2);
                    gf.a(mi.field_d, 0, false, var13, 1, var7_ref_ic.field_C.field_c[0]);
                    if (var11 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    ei.field_b = var7_ref_ic;
                    on.field_d = true;
                    var8 = var7_ref_ic.field_C.field_c[0];
                    var9 = var7_ref_ic.field_C.field_c[1];
                    var14 = oi.a(new String[]{var8, var9}, lm.field_k, 2);
                    gf.a(mi.field_d, 0, false, var14, 1, var7_ref_ic.field_C.field_c[0]);
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    lj.b(122);
                    eh.field_e = false;
                    vm.field_e = true;
                    hm.field_c = -1;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (-60 != (ci.field_q ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (dd.field_a) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (on.field_d) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 113: {
                    wm.c((byte) -86);
                    if (dd.field_a) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    vg.field_I.a((byte) -70, false);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    ka.a(true, (byte) 87);
                    bl.field_B = true;
                    vm.field_e = false;
                    hm.field_c = -2;
                    th.field_q = true;
                    dd.field_a = false;
                    wc.field_j = 0;
                    on.field_d = false;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    eh.field_e = false;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var2_ref = null;
                    if (dd.field_a) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (!on.field_d) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var2_ref = ei.field_b;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    var2_ref = vg.field_I;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var2_ref != null) {
                        statePc = 124;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (-61 == (ci.field_q ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var3 = sh.field_qb.g(11132);
                    var4_int = sh.field_qb.g(11132);
                    var5 = sh.field_qb.c((byte) -92);
                    ((ic) (var2_ref)).field_C.a(var3, var4_int, 21428);
                    if (((ic) (var2_ref)).field_C.field_v != -1) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    ((ic) (var2_ref)).field_C.field_v = var3;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    ((ic) (var2_ref)).field_C.a(((ic) (var2_ref)).field_A.field_h, ((ic) (var2_ref)).field_C.field_A, (byte) 14);
                    ((ic) (var2_ref)).field_w = var5 + -50;
                    if (1 <= ((ic) (var2_ref)).field_w) {
                        statePc = 60;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    ((ic) (var2_ref)).field_w = 1;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (ci.field_q == 61) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var3 = sh.field_qb.g(param0 ^ 11132);
                    var4_int = sh.field_qb.g(param0 + 11132);
                    var5 = sh.field_qb.g(param0 ^ 11132);
                    var6 = sh.field_qb.g(11132);
                    var7 = sh.field_qb.g(11132);
                    ((ic) (var2_ref)).field_C.a(var6, var7, (byte) 119, var3, var4_int, var5);
                    ((ic) (var2_ref)).field_A.a(((ic) (var2_ref)).field_g, 31626);
                    ((ic) (var2_ref)).field_A.field_k = -1;
                    ((ic) (var2_ref)).field_D = false;
                    ((ic) (var2_ref)).field_A.field_c = -1;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (-63 != (ci.field_q ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var3 = sh.field_qb.a((byte) -72);
                    ((ic) (var2_ref)).field_C.d(-39, var3);
                    ((ic) (var2_ref)).field_C.c((int) sh.field_qb.a((byte) -103), 2);
                    var4 = var2_ref;
                    if (1 == (((ic) (var4)).field_e ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    ((ic) (var4)).a(false, -1, 22273, false);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    ((ic) (var4)).field_n = 0;
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-64 != (ci.field_q ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    ((ic) (var2_ref)).field_C.field_D = sh.field_qb.g(11132);
                    if (null == vg.field_I) {
                        statePc = 60;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    mn.a(false);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (64 != ci.field_q) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    ((ic) (var2_ref)).field_C.field_r = sh.field_qb.g(11132);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (ci.field_q == 65) {
                        statePc = 145;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 145: {
                    ((ic) (var2_ref)).field_C.field_b = sh.field_qb.g(param0 ^ 11132);
                    if (null == vg.field_I) {
                        statePc = 60;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    fe.g(1);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (66 != ci.field_q) {
                        statePc = 150;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    ((ic) (var2_ref)).field_v = sh.field_qb.g(11132);
                    if (null == vg.field_I) {
                        statePc = 60;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    fe.g(1);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.n(-108);
                    if (var11 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    al.b(-1, param0);
                    stackIn_152_0 = i.field_y;
                    stackIn_152_1 = -2;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0 == stackIn_152_1) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    bl.field_B = true;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (!bl.field_B) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    wc.field_j = 0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (eg.b((byte) -121)) {
                        statePc = 159;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var2 = this.g(0);
                    if (var2 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var2 != 1) {
                        statePc = 173;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    ti.c(114);
                    if ((var2 ^ -1) != -2) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    qe.field_k = true;
                    eh.field_e = true;
                    if (var11 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (aj.field_a) {
                        statePc = 167;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 167: {
                    vm.field_e = false;
                    mn.field_e = true;
                    th.field_q = true;
                    if (!dd.field_a) {
                        statePc = 170;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    kn.field_J = mi.field_f;
                    gb.a(-2, 0, false, 9);
                    if (var11 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    gb.a(-2, 0, false, 0);
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    wm.c((byte) -86);
                    ka.a(true, (byte) 87);
                    al.field_j[i.field_y].a((byte) 120, 0, false);
                    on.field_d = false;
                    dd.field_a = false;
                    aj.field_a = false;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    eh.field_e = false;
                    qe.field_k = false;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    var3 = 0;
                    if (2 != var2) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var3 = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (aj.field_a) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (qe.field_k) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (eh.field_e) {
                        statePc = 179;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var3 = 1;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if (var3 != 0) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    ve.c((byte) -121);
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    return;
                }
                case 184: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        this.a("virogrid", 15, (byte) 118);
    }

    private final int[] a(byte param0, qb param1) {
        RuntimeException var3 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 61) {
                break L1;
              } else {
                Virogrid.b((byte) 94, false);
                break L1;
              }
            }
            stackIn_3_0 = bi.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("Virogrid.VA(").append(param0).append(',');

            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void e(boolean param0) {
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        il stackIn_105_0 = null;
        il stackIn_106_0 = null;
        il stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        il stackIn_115_0 = null;
        il stackIn_116_0 = null;
        il stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        il stackIn_120_0 = null;
        il stackIn_121_0 = null;
        il stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        il stackIn_125_0 = null;
        il stackIn_126_0 = null;
        il stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        il stackIn_130_0 = null;
        il stackIn_131_0 = null;
        il stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        il stackIn_134_0 = null;
        il stackIn_135_0 = null;
        il stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        double[] var11_ref_double__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        fl var16_ref = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        double[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = null;
                    var17 = field_F ? 1 : 0;
                    var2 = param0 ? 1 : 0;
                    if (i.field_y != hm.field_c) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (pg.field_g == nf.field_g) {
                        statePc = 18;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (1 != (i.field_y ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-17 >= (we.field_l ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = 0;
                    ej.a(false, 25680);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    lm.a(hm.field_c, -1, false, pg.field_g, 0);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 != (hm.field_c ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (we.field_l >= 16) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    lm.a(i.field_y, -1, false, nf.field_g, 0);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = 0;
                    ej.a(false, 25680);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((we.field_l ^ -1) <= -17) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    lm.a(i.field_y, we.field_l - -1, false, nf.field_g, 0);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    lm.a(hm.field_c, 1 + (-we.field_l + 32), false, pg.field_g, 0);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((i.field_y ^ -1) == 1) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    lm.a(i.field_y, -1, true, nf.field_g, 0);
                    if (var17 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ej.a(false, 25680);
                    var2 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var2 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    df.b(0, 0, 640, 480, 3158064);
                    this.e((byte) -62);
                    pc.a(mk.field_bb, (byte) -86);
                    si.a(nk.field_K, new double[]{-110.0, 26.0, -410.0}, new double[]{-1.0, 0.0, 0.0}, 64.0, 114.0, mk.field_bb, 2621440, 10420224, 10485760, 26148864, ke.field_p.field_k);
                    lk.field_Qb.a(pe.field_j, bi.field_c);
                    var23 = new int[12];
                    var18 = var23;
                    var3 = var18;
                    var4 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var4 >= 3) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3[var4] = pe.field_j[var4] << -188484317;
                    var4++;
                    if (var17 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var17 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var4 = 3;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var4 ^ -1) <= (var23.length ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3[var4] = pe.field_j[var4];
                    var4++;
                    if (var17 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var17 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (vm.field_d[2] <= 0.0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var4 = stackIn_37_0;
                    if (0.0 >= vm.field_d[0]) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var5 = stackIn_40_0;
                    if (72.0 < vm.field_d[0]) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (vm.field_d[0] >= -72.0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var6 = stackIn_45_0;
                    if ((we.field_c.field_F ^ -1) != (this.field_E ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (da.field_k[0] != vm.field_d[0]) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (vm.field_d[1] != da.field_k[1]) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (vm.field_d[2] != da.field_k[2]) {
                        statePc = 50;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_E = we.field_c.field_F;
                    da.field_k[1] = vm.field_d[1];
                    da.field_k[2] = vm.field_d[2];
                    da.field_k[0] = vm.field_d[0];
                    qc.a(118);
                    vb.field_l.b();
                    df.b(0, 0, 640, 480, 0);
                    kg.field_c.a(pe.field_j, bi.field_c);
                    nb.field_x.a(pe.field_j, bi.field_c);
                    kf.field_c.a(pe.field_j, bi.field_c);
                    cm.field_k.a(pe.field_j, bi.field_c);
                    ba.field_c.a(pe.field_j, bi.field_c);
                    wf.field_j.a(pe.field_j, bi.field_c);
                    fl.field_s.a(pe.field_j, bi.field_c);
                    if (var4 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ee.field_a.a(var23, this.field_K);
                    og.field_l.a(var23, this.field_J);
                    if (var5 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var6 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    rc.field_o.a(var23, this.field_B);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    ab.field_L.a(var23, this.field_D);
                    if (var17 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var6 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ab.field_L.a(var23, this.field_D);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    rc.field_o.a(var23, this.field_B);
                    if (var17 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    th.field_y.a(var23, this.field_J);
                    pj.field_a.a(var23, this.field_H);
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var6 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    jg.field_i.a(var23, this.field_G);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    qg.field_h.a(var23, this.field_M);
                    if (var17 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var6 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    qg.field_h.a(var23, this.field_M);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    jg.field_i.a(var23, this.field_G);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (var4 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    hn.field_x.a(var23, this.field_N);
                    if (var17 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    td.field_i.a(var23, this.field_L);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    ul.b((byte) 116);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    vb.field_l.d(0, 0);
                    var7 = id.field_r % 64;
                    if (32 > var7) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = -var7 + 48;
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = -16 + var7;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var7 = stackIn_75_0;
                    var7 = var7 << 2;
                    if (!ke.field_p.field_d) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var7 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var26 = new int[3];
                    var21 = var26;
                    var8 = var21;
                    var24 = new int[3];
                    var19 = var24;
                    var9 = var19;
                    var25 = new int[3];
                    var20 = var25;
                    var10 = var20;
                    var8[0] = (int)ao.field_Hb << 2115963748;
                    var24[0] = 800;
                    var8[1] = -(int)ao.field_Hb << 62284740;
                    var25[0] = var7;
                    var24[1] = 800;
                    var26[2] = 0;
                    var25[1] = var7;
                    var24[2] = 1280;
                    var25[2] = 0;
                    si.a(pe.field_j, var26, var24, var25);
                    if (ke.field_p.field_m) {
                        statePc = 79;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var11 = id.field_r % 128;
                    if (-65 < (var11 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = -var11 + 128;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = var11;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var11 = stackIn_82_0;
                    var12 = 38784 - -(var11 * 2);
                    qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
                    var7 = var26[0];
                    var8[0] = var26[1];
                    var26[1] = var7;
                    var7 = var24[0];
                    var9[0] = var24[1];
                    var24[1] = var7;
                    var7 = var25[0];
                    var10[0] = var25[1];
                    var25[1] = var7;
                    qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (!ke.field_p.field_d) {
                        statePc = 96;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (0.0 > nk.field_K[11]) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                    if (var17 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var27 = new double[ad.field_g.length];
                    var22 = var27;
                    var11_ref_double__ = var22;
                    var12 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if ((var12 ^ -1) <= (var27.length ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var11_ref_double__[var12] = -ad.field_g[var12];
                    var12++;
                    if (var17 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var17 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, var11_ref_double__, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (ke.field_p.field_f > 0) {
                        statePc = 95;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 95: {
                    si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, pj.field_d, 40, ke.field_p.field_f);
                    if (var17 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    System.out.println("Warning, drawing non-single plane");
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var16_ref = (fl) ((Object) sh.field_tb.a((byte) -61));
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var16_ref == null) {
                        statePc = 103;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var11 = -(pe.field_j[0] << -603747578) + (var16_ref.field_n >> 664161928);
                    var7 = -(pe.field_j[2] << -1367555290) + (var16_ref.field_m >> -435917880);
                    var12 = -(pe.field_j[1] << 533482790) + (var16_ref.field_p >> 1925002888);
                    var13 = pe.field_j[5] * var7 + var12 * pe.field_j[4] + var11 * pe.field_j[3];
                    var15 = var7 * pe.field_j[11] + (var12 * pe.field_j[10] + var11 * pe.field_j[9]);
                    var14 = var7 * pe.field_j[8] + var12 * pe.field_j[7] + pe.field_j[6] * var11;
                    var7 = var15 >> 144557622;
                    stackIn_138_0 = -1;
                    stackIn_100_0 = stackIn_138_0;
                    stackIn_138_1 = var15 ^ -1;
                    stackIn_100_1 = stackIn_138_1;
                    if (var17 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 <= stackIn_100_1) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    df.a((j.field_b << 903978180) - -((var13 >> 1501989897) / var7), (var14 >> -890619063) / var7 + (tm.field_g << -1979774556), 16384 / var7, var16_ref.field_o * 5 / 3, pj.field_d);
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var16_ref = (fl) ((Object) sh.field_tb.a(16213));
                    if (var17 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var4 != 0) {
                        statePc = 114;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = ee.field_a;
                    stackIn_105_0 = stackIn_106_0;
                    if (param0) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_107_0 = (il) ((Object) stackIn_105_0);
                    stackIn_107_1 = 1;
                    statePc = 107;
                    continue stateLoop;
                }
                case 106: {
                    stackIn_107_0 = (il) ((Object) stackIn_106_0);
                    stackIn_107_1 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    sj.a(stackIn_107_0, stackIn_107_1 != 0, var23, this.field_K);
                    sj.a(og.field_l, false, var23, this.field_C);
                    if (var5 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    sj.a(ab.field_L, false, var23, this.field_D);
                    if (var6 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    sj.a(jg.field_i, false, var23, this.field_G);
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    sj.a(rc.field_o, false, var23, this.field_B);
                    if (var17 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    sj.a(rc.field_o, false, var23, this.field_B);
                    if (var6 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    sj.a(qg.field_h, false, var23, this.field_M);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    sj.a(ab.field_L, false, var23, this.field_D);
                    if (var17 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_116_0 = th.field_y;
                    stackIn_115_0 = stackIn_116_0;
                    if (param0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_117_0 = (il) ((Object) stackIn_115_0);
                    stackIn_117_1 = 1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = (il) ((Object) stackIn_116_0);
                    stackIn_117_1 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    sj.a(stackIn_117_0, stackIn_117_1 != 0, var23, this.field_J);
                    sj.a(pj.field_a, false, var23, this.field_H);
                    if (var5 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    sj.a(jg.field_i, false, var23, this.field_G);
                    if (var6 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = ab.field_L;
                    stackIn_120_0 = stackIn_121_0;
                    if (param0) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_122_0 = (il) ((Object) stackIn_120_0);
                    stackIn_122_1 = 1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = (il) ((Object) stackIn_121_0);
                    stackIn_122_1 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    sj.a(stackIn_122_0, stackIn_122_1 != 0, var23, this.field_D);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    sj.a(qg.field_h, false, var23, this.field_M);
                    if (var17 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = qg.field_h;
                    stackIn_125_0 = stackIn_126_0;
                    if (param0) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_127_0 = (il) ((Object) stackIn_125_0);
                    stackIn_127_1 = 1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = (il) ((Object) stackIn_126_0);
                    stackIn_127_1 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    sj.a(stackIn_127_0, stackIn_127_1 != 0, var23, this.field_M);
                    if (var6 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = rc.field_o;
                    stackIn_130_0 = stackIn_131_0;
                    if (param0) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (il) ((Object) stackIn_130_0);
                    stackIn_132_1 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (il) ((Object) stackIn_131_0);
                    stackIn_132_1 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    sj.a(stackIn_132_0, stackIn_132_1 != 0, var23, this.field_B);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_135_0 = jg.field_i;
                    stackIn_134_0 = stackIn_135_0;
                    if (param0) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_136_0 = (il) ((Object) stackIn_134_0);
                    stackIn_136_1 = 1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_136_0 = (il) ((Object) stackIn_135_0);
                    stackIn_136_1 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    sj.a(stackIn_136_0, stackIn_136_1 != 0, var23, this.field_G);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = i.field_y;
                    stackIn_138_1 = 10;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 != stackIn_138_1) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (-11 != (hm.field_c ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    ij.a((byte) 105);
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_118_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = field_F ? 1 : 0;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (-1 == (tg.field_x ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-2 == (tg.field_x ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (2 != tg.field_x) {
                        statePc = 23;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!qm.i(20)) {
                        statePc = 7;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 7: {
                    hm.field_c = pm.field_k;
                    wn.c(param0);
                    if (a.field_D) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    a.field_D = false;
                    ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_G + hd.field_b.field_A, 8, -16824, false, 240);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (!bj.field_n) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3 = bd.field_e;
                    if (0 == hm.field_c) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-3 == (i.field_y ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-4 == (i.field_y ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (4 == hm.field_c) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (hm.field_c == 5) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var3 = hm.field_c;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    gb.a(-2, var3, false, -4);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (mf.a(86, hm.field_c)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    wm.c((byte) -86);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    tg.field_x = 3;
                    if (var7 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    wa.field_K = wa.field_K - 1;
                    if ((wa.field_K ^ -1) == -1) {
                        statePc = 25;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 25: {
                    tg.field_x = 0;
                    if (var7 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    wa.field_K = wa.field_K + 1;
                    if ((wa.field_K ^ -1) == -17) {
                        statePc = 28;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!a.field_D) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ka.a(0);
                    if (var7 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    dn.a(8192);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    tg.field_x = 2;
                    if (var7 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3 = 0;
                    var4 = 0;
                    if (!param1) {
                        statePc = 52;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!aj.field_a) {
                        statePc = 97;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (qe.field_k) {
                        statePc = 97;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!eh.field_e) {
                        statePc = 38;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 38: {
                    bc.a(var3 != 0, (byte) -120);
                    if (!on.field_d) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ei.field_b.a(-103, var4 != 0);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (!dd.field_a) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    vg.field_I.a(-111, var4 != 0);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (!nd.b((byte) -111)) {
                        statePc = 97;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!bl.field_B) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ln.a(15, (byte) 104, 12, 13);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (on.field_d) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ei.field_b.d(-114);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (!dd.field_a) {
                        statePc = 42;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    vg.field_I.d(-20);
                    if (var7 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var7 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (i.field_y != hm.field_c) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((pg.field_g ^ -1) == (nf.field_g ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    we.field_l = we.field_l + 1;
                    if (-33 == (we.field_l ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 57: {
                    wm.c((byte) -86);
                    if (var7 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (i.field_y == -1) {
                        statePc = 66;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if ((i.field_y ^ -1) != 1) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3 = 1;
                    if (var7 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (!mf.a(107, i.field_y)) {
                        statePc = 79;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    al.field_j[i.field_y].a((byte) -79);
                    if (var7 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (!aj.field_a) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var3 = 1;
                    var4 = 1;
                    if (var7 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 69: {
                    vg.field_I.a(-104, true);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (!nd.b((byte) -107)) {
                        statePc = 79;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    vg.field_I.d(117);
                    if (var7 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var7 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 74: {
                    vg.field_I.a(-104, true);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (!nd.b((byte) -107)) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    vg.field_I.d(117);
                    if (var7 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var7 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (!aj.field_a) {
                        statePc = 97;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (qe.field_k) {
                        statePc = 97;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (!eh.field_e) {
                        statePc = 83;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 83: {
                    bc.a(var3 != 0, (byte) -120);
                    if (!on.field_d) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    ei.field_b.a(-103, var4 != 0);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (!dd.field_a) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    vg.field_I.a(-111, var4 != 0);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (!nd.b((byte) -111)) {
                        statePc = 97;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (!bl.field_B) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ln.a(15, (byte) 104, 12, 13);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (on.field_d) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    ei.field_b.d(-114);
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (!dd.field_a) {
                        statePc = 87;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    vg.field_I.d(-20);
                    if (var7 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var7 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (!aj.field_a) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    mf.e(1);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var5 = we.field_c.field_F;
                    if (!bl.field_B) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (aj.field_a) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = 481;
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = dh.field_r;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var6 = stackIn_105_0;
                    tn.field_g = tn.field_g + (-tn.field_g + (float)var6) * 0.10000000149011612f;
                    if ((int)((double)tn.field_g + 0.5) == var5) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    sl.a(-118, (int)tn.field_g);
                    jm.a(320, ((int)(tn.field_g * 4.0f) + 240) / 9, -2);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (null == this.field_I.a((byte) -102)) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    fieldTemp$0 = this.field_A + 1;
                    this.field_A = this.field_A + 1;
                    if (fieldTemp$0 == 335) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_A = 0;
                    this.field_I.d(-29889);
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (!param1) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    li.a(param0);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (-3 != hm.field_c) {
                        statePc = 119;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var8 = new String[]{mb.field_eb, em.field_e};
                    vg.field_I = new ic(false, eg.field_y, var8, 0, false, ll.field_b, ce.field_I);
                    lj.b(101);
                    if (!pn.field_x) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_118_0 = 1;
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var4 = stackIn_118_0;
                    gb.a(-2, 0, var4 != 0, -1);
                    vm.field_e = true;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if ((hm.field_c ^ -1) != 3) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    gk.field_g.g(9, 8);
                    qe.field_k = true;
                    hm.field_c = i.field_y;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (-5 == hm.field_c) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    nn.a(wl.field_d.e((byte) -124), 11, (byte) -120);
                    eh.field_e = true;
                    hm.field_c = i.field_y;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    oj.e((byte) -75);
                    if (db.b((byte) 13, 0)) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (-1 != (sh.a(4712, 1000) ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    gi.a(dj.field_f[sh.a(4712, 3)], 100, 24);
                    if (var7 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (vg.field_I == null) {
                        statePc = 135;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (!vg.field_I.field_g) {
                        statePc = 135;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (!vg.field_I.field_t) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if ((vg.field_I.field_C.field_u ^ -1) >= (sh.a(4712, 40000) ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (!vg.field_I.field_l) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    vg.field_I.field_l = true;
                    hj.field_h = id.field_c;
                    ca.field_G = c.field_a;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (-1 <= (hj.field_h ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    hj.field_h = hj.field_h - 1;
                    var3 = c.field_a + -4;
                    if (-1 >= (var3 ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var3 = 0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    bm.d(var3, 0);
                    if (0 != sh.a(4712, 20)) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    ed.a(sh.a(4712, 256), dj.field_f[sh.a(4712, 3)], -629134904, 96);
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var7 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var3 = 1 + c.field_a;
                    if (ca.field_G < var3) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    bm.d(var3, 0);
                    if (var7 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    ca.field_G = 0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final mg b(int param0, int param1, int param2) {
        mg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_F ? 1 : 0;
                    var4 = new mg(57, 57);
                    pj.a(var4, 256);
                    df.c(29, 29, 27, 263172);
                    var5 = 23;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 < (var5 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    df.c(29, 29, var5, param2 - -(var5 * param0));
                    var5--;
                    if (var6 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ul.b((byte) 93);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 == -9105) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.e(true);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(eh param0, byte param1) {
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new mg(param0.a("final_frame.jpg", 100, ""), (java.awt.Component) ((Object) fi.field_v));
            var3 = var2.field_w;
            var4 = var2.field_p;
            lm.a(0);
            int var5 = 120 / ((33 - param1) / 33);
            nd.field_d = new mg(var3, 3 * var4 / 4);
            nd.field_d.b();
            var2.b(0, 0);
            dn.field_c = new mg(var3, -nd.field_d.field_p + var4);
            dn.field_c.b();
            var2.b(0, -nd.field_d.field_p);
            dn.field_c.field_x = nd.field_d.field_p;
            ai.a(true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void t(int param0) {
        if (null != uh.field_e) {
            a.a(20, uh.field_e);
            uh.field_e = null;
            sb.a(-52);
        }
        md.field_h = p.a(83, 3);
        oj.field_Fb = p.a(117, 5);
        g.field_a = p.a(98, 6);
        pj.field_c = p.a(89, 7);
        sf.field_O = p.a(param0 ^ 35, 8);
        el.field_d = p.a(64, 9);
        wm.field_w = p.a(97, 10);
        wn.field_i = p.a(33, 11);
        gn.field_G = p.a(param0 ^ 51, 12);
        ng.field_T = p.a(81, param0);
    }

    final void a(int param0) {
        if (param0 >= -80) {
            this.field_L = (int[]) null;
        }
        al.i(100);
        if (!(null == ih.field_b)) {
            am.a((byte) -16);
        }
        ce.f(13633);
    }

    final void d(int param0) {
        int var3 = field_F ? 1 : 0;
        Virogrid.u(240);
        hj.a(17);
        l.b(-6325);
        p.c(param0 + -32);
        ud.a((byte) -94);
        fj.a((byte) -99);
        rh.b(param0 ^ 57);
        bn.a((byte) -118);
        rk.a(-97);
        ld.a((byte) -110);
        cg.a(-65);
        nf.a(-28637);
        wd.a(param0 ^ -8518);
        em.a(-85);
        od.d(false);
        rg.a(param0 ^ 64);
        uk.b(param0 + -6490);
        og.b(param0 + 74);
        me.a(param0 + 0);
        cb.b(3981);
        df.a();
        eh.a((byte) -104);
        e.a();
        ak.a(4472);
        jc.b((byte) 110);
        hc.a(true);
        se.a((byte) 79);
        rb.a((byte) -13);
        vm.a((byte) -106);
        oh.a(true);
        td.a(6666);
        kb.a(122);
        pc.a(-30114);
        ih.a(81);
        cj.a(-99);
        nm.a(26523);
        hm.b(param0 ^ -126);
        wf.a(param0 ^ -28608);
        qc.a((byte) 9);
        h.a(true);
        li.b((byte) 112);
        jg.a(28275);
        dk.a(-124);
        sb.b(-851125662);
        ha.a(param0 + 79);
        nh.a(false);
        el.d(-127);
        oi.c(122);
        ic.b(23320);
        pi.a(param0 ^ -29216);
        il.a();
        qb.b();
        uf.a(98);
        ee.b((byte) 119);
        rl.d(0);
        wb.c(true);
        bd.a(95);
        tn.f(param0 + 31);
        ke.d(-51);
        wg.a(0);
        sd.a((byte) 113);
        ah.a((byte) -115);
        ib.a(-60);
        k.a(1000);
        we.a((byte) -104);
        gi.a((byte) -103);
        en.g(0);
        qm.j(124);
        km.f(param0 + 2147483647);
        ga.i(param0 ^ -91);
        ao.g(-119);
        dj.a(false);
        um.g(0);
        bg.g(param0);
        lk.e((byte) 10);
        an.a((byte) 26);
        pl.a((byte) -120);
        pj.a(false);
        oe.b(param0 + 0);
        hk.d(false);
        jm.a(param0 + 0);
        he.g(7);
        fk.c();
        vl.a(false);
        ll.a((byte) -64);
        pg.b(param0 + 8192);
        s.a(-1);
        i.a((byte) -78);
        ln.a(true);
        wn.d(79);
        qj.b();
        pa.c(true);
        ua.b();
        eg.c(param0 ^ -55);
        ef.a(-3);
        kf.a(-1);
        vj.b((byte) 17);
        ea.a(-74);
        sj.a((byte) 121);
        jd.a(true);
        ba.a(14);
        fh.a(10061);
        vf.a(false);
        je.h(-202);
        b.j((byte) -22);
        vc.g((byte) 108);
        de.g(false);
        sh.g(true);
        qh.f(8246);
        jl.f(15354);
        ca.f((byte) 15);
        uh.a(false);
        id.a((byte) 24);
        o.a((byte) 67);
        ig.a(-77);
        ii.a((byte) 6);
        ac.a(-95);
        qi.a(25651);
        of.a((byte) 110);
        lg.a(param0 ^ -122);
        ne.a(false);
        ul.a((byte) -96);
        bk.a((byte) 122);
        hg.f((byte) 103);
        mm.a(false);
        dd.b((byte) -58);
        m.b(-314);
        ia.a(44);
        ab.e(-16349);
        va.a(-91);
        na.e((byte) 56);
        sk.a((byte) -52);
        qf.c();
        ff.a();
        nn.a(53);
        bf.c(param0 ^ 20391);
        ji.a(-112);
        am.b((byte) 88);
        ei.a(-59);
        lb.b(7);
        lm.a((byte) -94);
        pn.c(true);
        qk.c(2);
        ub.f(-121);
        gl.a(param0 + 3);
        bl.d(false);
        oa.c((byte) -127);
        c.a(false);
        nb.d(-30419);
        rf.a(-24750);
        mk.k(-16);
        aj.a(false);
        gj.c();
        tf.a(0);
        wm.c(0);
        af.a(99);
        mn.a(0);
        lh.b(false);
        sm.a(param0 + -1);
        cf.a(112);
        ag.b(25);
        g.b((byte) -108);
        md.b(46);
        wh.a(param0 + -23862);
        bb.a();
        db.a(6);
        bc.a((byte) -101);
        aa.a(false);
        lj.a(67);
        nl.c(120);
        ql.a((byte) -87);
        rj.a(6);
        ie.b(0);
        fi.c(false);
        tg.a((byte) -78);
        ec.a(param0 + -3298);
        dc.h(-126);
        gg.g(-1);
        fd.e(1);
        ma.d(param0 ^ 0);
        jk.a((byte) 110);
        nj.b();
        tk.a(0);
        kh.a((byte) 81);
        qa.a(8342);
        mc.a(false);
        oj.f((byte) -111);
        wc.a(param0 + 200);
        ad.a(param0 + 90);
        u.b((byte) -11);
        th.e(-5);
        sl.a(param0 + 1);
        rn.a((byte) -38);
        te.a((byte) 126);
        mf.f(-93);
        gd.b((byte) 104);
        ug.a(-97);
        ch.a(0);
        hl.a();
        sg.d(-2);
        fm.a((byte) -54);
        hd.a(3881);
        d.e((byte) -73);
        fe.h(32498);
        ge.a(72);
        rc.a(param0 + -24021);
        qd.a(true);
        ej.f(2);
        vd.l(-1);
        wa.f((byte) 39);
        mb.h((byte) 126);
        dg.a((byte) 41);
        nk.a(35);
        w.a(-116);
        ng.g(false);
        gn.g(true);
        qe.b((byte) -36);
        fn.b((byte) 97);
        ok.f(-100);
        qn.c((byte) -124);
        gb.e(117);
        al.g(-1);
        jb.a((byte) -99);
        gf.a((byte) 124);
        dn.a((byte) 112);
        bm.c(2797);
        tl.b((byte) -71);
        nd.a((byte) 114);
        ce.a((byte) 107);
        vg.f(-114);
        gk.a((byte) -127);
        eb.a(true);
        dm.e(-48);
        lc.a(-26834);
        mj.g(-108);
        ph.d(param0 ^ 121);
        bh.a();
        ed.a((byte) 51);
        j.b(param0 ^ -116);
        f.b((byte) 103);
        jf.a((byte) -124);
        ij.a(-25621);
        pm.a(0);
        fl.a(-24488);
        dh.a(-128);
        pe.a((byte) -79);
        la.a((byte) 108);
        hf.b(param0 ^ -125);
        ti.b(-88);
        cc.b(false);
        a.c(false);
        ae.a((byte) -125);
        kn.h(param0 ^ 0);
        oc.c(false);
        hn.a((byte) -9);
        ai.b(false);
        gh.d(false);
        vb.b((byte) 112);
        ka.c(-85);
        sa.a((byte) -52);
        kg.b((byte) 123);
        dl.a(0);
        bj.a((byte) -62);
        qg.a(114);
        ob.a(param0 + 29137);
        sf.a(100);
        co.a((byte) 103);
        mh.b((byte) 51);
        re.b(-120);
        vi.b(param0 + 31856);
        bi.a(46);
        fb.a((byte) 21);
        ra.a(false);
        tm.a(-74);
        da.a(param0 ^ 8355711);
        cm.c(115);
        fa.d(0);
        jj.a((byte) 74);
        ri.b(2);
        di.h(46);
        sn.c((byte) -89);
        ve.c(true);
        kd.c((byte) -124);
        kk.c((byte) -8);
        ci.h(-104);
        on.a((byte) 120);
        pb.a((byte) 111);
        wl.a((byte) -75);
        mi.e(12);
        hh.a((byte) -124);
        this.field_N = null;
        this.field_C = null;
        this.field_I = null;
        this.field_G = null;
        this.field_D = null;
        this.field_L = null;
        this.field_H = null;
        this.field_B = null;
        this.field_v = null;
        this.field_K = null;
        this.field_J = null;
        this.field_M = null;
        if (uk.field_f != 0) {
            field_F = var3 != 0 ? false : true;
            return;
        }
    }

    private final void a(qb param0, byte param1) {
        int[] discarded$0 = null;
        try {
            param0.a(0, 154, 0);
            if (param1 != 69) {
                qb var4 = (qb) null;
                discarded$0 = this.a((byte) -76, (qb) null);
            }
            param0.a(256, 256, 256, 32);
            param0.a(0, -154, 0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public Virogrid() {
        this.field_I = new p();
        this.field_A = 0;
    }

    static {
        field_O = new co("usename");
    }
}
