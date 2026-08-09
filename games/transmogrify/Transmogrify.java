/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Transmogrify extends ig {
    static String field_B;
    static String field_E;
    static int field_D;
    public static boolean field_A;

    final void e(int param0) {
        if (param0 != 0) {
            field_E = (String) null;
        }
        gl.j(param0 + 31107);
        if (!(ub.field_c == null)) {
            qd.b(5);
        }
        lf.a(true);
    }

    public static void l(int param0) {
        field_B = null;
        field_E = null;
        if (param0 != 0) {
            Transmogrify.d(false);
        }
    }

    final void b(byte param0) {
        boolean discarded$0 = false;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_43_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        gd var6 = null;
        gd var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A ? 1 : 0;
                    sf.v(107);
                    if (null == ub.field_c) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!ub.field_c.field_c) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    qd.b(5);
                    wk.b((byte) -120);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = this;
                    stackIn_4_0 = stackIn_5_0;
                    stackIn_5_1 = 10017;
                    stackIn_4_1 = stackIn_5_1;
                    if (ub.field_c == null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_4_1;
                    stackIn_6_2 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = this;
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    this.a(stackIn_6_1, stackIn_6_2 != 0);
                    if (!wf.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.j(-7632);
                    wf.field_a = false;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param0 <= -12) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    if (!rd.b(63)) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.b(false);
                    if (!rd.b(72)) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (pa.b(-120)) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    discarded$0 = this.a((byte) -96, false);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (qj.b((byte) 99)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    sh.field_c = pj.a(29, (byte) -76, 3, 10, 1);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (!vi.field_h) {
                        statePc = 95;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (qj.b((byte) 95)) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (ud.field_a) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (lb.field_i != 2) {
                        statePc = 86;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!ll.c(true)) {
                        statePc = 39;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (lb.field_i != 0) {
                        statePc = 37;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2 = ll.s(120);
                    if ((var2 ^ -1) != -4) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    dj.a(true, true);
                    if (var4 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var2 != 2) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    qd.b(5);
                    if (var4 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-5 != (var2 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    vb.a(-2, -2, (byte) 117);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (!ll.c(true)) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ej.field_l[be.field_q].a(true, 256);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.o(11179);
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!dj.b(-1)) {
                        statePc = 80;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (ub.field_c == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var2 = pc.a(stackIn_43_0 != 0, (ig) (this), (byte) 120);
                    if ((var2 ^ -1) != -2364825) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    jd.a((byte) -77);
                    if (var4 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var2 == 1) {
                        statePc = 78;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (2 == var2) {
                        statePc = 74;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var4 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (-170 < (tl.field_d ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.o(11179);
                    if (var4 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    tl.field_d = tl.field_d + fa.field_f;
                    if (169 > tl.field_d) {
                        statePc = 66;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    wd.a(17099, true, bd.field_u[6]);
                    if (var4 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (kb.field_n == null) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (kb.field_n.field_i) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    vf.a((byte) -123, 100.0f, gk.field_a);
                    if (var4 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    hc.field_u = hc.field_u & (kb.field_n.field_k ^ -1);
                    rh.field_n = rh.field_n | kb.field_n.field_k;
                    kb.field_n = null;
                    cg.b((byte) -27);
                    qd.a(-117);
                    ud.field_a = true;
                    if ((be.field_q ^ -1) != -7) {
                        statePc = 66;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (0 == hc.field_u) {
                        statePc = 62;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 62: {
                    qf.field_d = 2;
                    be.field_q = 2;
                    if (var4 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    gj.a(true, f.field_a);
                    if (this.a((byte) -96, true)) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.n(32198);
                    vi.field_h = true;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (!qj.b((byte) 122)) {
                        statePc = 68;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var6 = (gd) ((Object) mc.field_c.c(-128));
                    if (var6 != null) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var4 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var4 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    te.a(var6, (byte) -10, 4);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var4 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (null != ub.field_c) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    qd.b(5);
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    vl.a((byte) 120, ha.b(85));
                    if (var4 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    qd.b(5);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (-170 < (tl.field_d ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.o(11179);
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    tl.field_d = tl.field_d + fa.field_f;
                    if (169 > tl.field_d) {
                        statePc = 98;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    wd.a(17099, true, bd.field_u[6]);
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (kb.field_n == null) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (kb.field_n.field_i) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    vf.a((byte) -123, 100.0f, gk.field_a);
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    hc.field_u = hc.field_u & (kb.field_n.field_k ^ -1);
                    rh.field_n = rh.field_n | kb.field_n.field_k;
                    kb.field_n = null;
                    cg.b((byte) -27);
                    qd.a(-117);
                    ud.field_a = true;
                    if ((be.field_q ^ -1) != -7) {
                        statePc = 98;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (0 == hc.field_u) {
                        statePc = 94;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 94: {
                    qf.field_d = 2;
                    be.field_q = 2;
                    if (var4 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    gj.a(true, f.field_a);
                    if (this.a((byte) -96, true)) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    this.n(32198);
                    vi.field_h = true;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (!qj.b((byte) 122)) {
                        statePc = 100;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var7 = (gd) ((Object) mc.field_c.c(-128));
                    if (var7 != null) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var4 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var4 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    te.a(var7, (byte) -10, 4);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var4 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (!gj.a(ek.field_c, (byte) 114)) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.g(-89);
                    if (var4 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var4 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    rb.a(0, -377);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (vc.e(false)) {
                        statePc = 114;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var3 = this.f((byte) 102);
                    if ((var3 ^ -1) != -3) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    jd.a(240, 10, eh.field_c, 3, wf.field_d.field_y, 320, wf.field_d, wf.field_d.field_y * 3 / 2, 3, pf.field_h, false);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String k(int param0) {
        if (param0 != 72) {
            field_D = -63;
        }
        return nf.field_l.g(12248);
    }

    final static void m(int param0) {
        int fieldTemp$1 = 0;
        hj var1 = null;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 85) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_B = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1 = ff.field_D;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!cg.g(-5591)) {
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
                        var1.a(false, 8);
                        fieldTemp$1 = var1.field_h + 1;
                        var1.field_h = var1.field_h + 1;
                        var2 = fieldTemp$1;
                        lc.a((byte) 65, var1);
                        ff.field_D.a((byte) -42, var1.field_h - var2);
                        if (var3 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1_ref), "Transmogrify.I(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_23_0;
        int stackIn_23_1;
        mi stackIn_23_2;
        int stackIn_23_3;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        mi stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_26_5;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int[] stackIn_29_0;
        int stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        mi stackIn_29_4;
        int stackIn_29_5;
        int stackIn_29_6;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        mi stackIn_30_4 = null;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        int stackIn_33_8;
        int var2;
        int var3;
        int var4;
        L0: {
          L1: {
            var4 = field_A ? 1 : 0;
            if (lb.field_i != 0) {
              break L1;
            } else {
              L2: {
                if ((be.field_q ^ -1) == (qf.field_d ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      fieldTemp$0 = lc.field_q + 1;
                      lc.field_q = lc.field_q + 1;
                      if (16 != fieldTemp$0) {
                        break L4;
                      } else {
                        L5: {
                          if (2 != be.field_q) {
                            break L5;
                          } else {
                            sh.field_c = null;
                            break L5;
                          }
                        }
                        L6: {
                          if (-6 != (be.field_q ^ -1)) {
                            break L6;
                          } else {
                            if (qj.b((byte) 99)) {
                              rh.field_n = 0;
                              hc.field_u = 0;
                              mc.field_c.g(-1);
                              pf.field_g = 0;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        lc.field_q = 0;
                        be.field_q = qf.field_d;
                        if ((be.field_q ^ -1) == -1) {
                          wd.a(17099, true, bd.field_u[6]);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((lc.field_q ^ -1) != -2) {
                      break L3;
                    } else {
                      if ((qf.field_d ^ -1) <= -1) {
                        L7: {
                          L8: {
                            if (-1 != be.field_q) {
                              break L8;
                            } else {
                              ej.field_l[qf.field_d].a(false, 256);
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ej.field_l[qf.field_d].a(ej.field_l[be.field_q].field_j.field_f, param0 ^ 10923);
                          break L7;
                        }
                        if (qf.field_d == 5) {
                          L9: {
                            var2 = 130;
                            var3 = wf.field_d.field_t + (wf.field_d.field_D + 4);
                            var2 = var2 + var3 * wf.field_d.b(sd.field_Q, 341);
                            stackIn_23_0 = var2;

                            stackIn_23_1 = var3;

                            stackIn_23_2 = wf.field_d;

                            stackIn_23_3 = 1;

                            if (-1 == (hc.field_u ^ -1)) {
                              stackIn_24_0 = stackIn_23_0;
                              stackIn_24_1 = stackIn_23_1;
                              stackIn_24_2 = (mi) ((Object) stackIn_23_2);
                              stackIn_24_3 = stackIn_23_3;
                              stackIn_24_4 = 0;
                              break L9;
                            } else {
                              stackIn_24_0 = stackIn_23_0;
                              stackIn_24_1 = stackIn_23_1;
                              stackIn_24_2 = (mi) ((Object) stackIn_23_2);
                              stackIn_24_3 = stackIn_23_3;
                              stackIn_24_4 = 1;
                              break L9;
                            }
                          }
                          L10: {










                            stackIn_26_5 = 0;

                            if (0 == pf.field_g) {


                              stackIn_24_2 = (mi) ((Object) stackIn_24_2);


                              stackIn_27_5 = stackIn_26_5;
                              stackIn_27_6 = 0;
                              break L10;
                            } else {


                              stackIn_24_2 = (mi) ((Object) stackIn_24_2);


                              stackIn_27_5 = stackIn_26_5;
                              stackIn_27_6 = 1;
                              break L10;
                            }
                          }
                          L11: {
                            var2 = stackIn_24_0 + stackIn_24_1 * ((mi) (Object) stackIn_24_2).b(aj.a(stackIn_24_3 != 0, stackIn_24_4 != 0, stackIn_27_5 != 0, stackIn_27_6 != 0), 341);
                            fd.field_a[5] = var2 - -10;
                            stackIn_29_0 = fd.field_b;

                            stackIn_29_1 = 5;

                            stackIn_29_2 = var3 + jk.field_x.a(true);

                            stackIn_29_3 = var3;

                            stackIn_29_4 = wf.field_d;

                            stackIn_29_5 = -127;

                            stackIn_29_6 = 0;

                            if (0 == pf.field_g) {
                              stackIn_30_0 = (int[]) ((Object) stackIn_29_0);
                              stackIn_30_1 = stackIn_29_1;
                              stackIn_30_2 = stackIn_29_2;
                              stackIn_30_3 = stackIn_29_3;
                              stackIn_30_4 = (mi) ((Object) stackIn_29_4);
                              stackIn_30_5 = stackIn_29_5;
                              stackIn_30_6 = stackIn_29_6;
                              stackIn_30_7 = 0;
                              break L11;
                            } else {
                              stackIn_30_0 = (int[]) ((Object) stackIn_29_0);
                              stackIn_30_1 = stackIn_29_1;
                              stackIn_30_2 = stackIn_29_2;
                              stackIn_30_3 = stackIn_29_3;
                              stackIn_30_4 = (mi) ((Object) stackIn_29_4);
                              stackIn_30_5 = stackIn_29_5;
                              stackIn_30_6 = stackIn_29_6;
                              stackIn_30_7 = 1;
                              break L11;
                            }
                          }
                          L12: {
















                            if (-1 == (hc.field_u ^ -1)) {
                              stackIn_30_0 = (int[]) ((Object) stackIn_30_0);



                              stackIn_30_4 = (mi) ((Object) stackIn_30_4);



                              stackIn_33_8 = 0;
                              break L12;
                            } else {
                              stackIn_30_0 = (int[]) ((Object) stackIn_30_0);



                              stackIn_30_4 = (mi) ((Object) stackIn_30_4);



                              stackIn_33_8 = 1;
                              break L12;
                            }
                          }
                          stackIn_30_0[stackIn_30_1] = stackIn_30_2 + stackIn_30_3 * ((mi) (Object) stackIn_30_4).b(gd.a((byte) stackIn_30_5, stackIn_30_6 != 0, stackIn_30_7 != 0, stackIn_33_8 != 0), 341);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  eg.field_b = eg.field_b + 1;
                  if (oh.field_j <= 2) {
                    break L0;
                  } else {
                    if (10 > n.field_a) {
                      wk.field_c = wk.field_c + 1;
                      dc.field_a = dc.field_a + 1;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
              L13: {
                if (be.field_q == -1) {
                  break L13;
                } else {
                  ej.field_l[be.field_q].c((byte) 122);
                  if (oh.field_j <= 2) {
                    break L0;
                  } else {
                    if (-11 < (n.field_a ^ -1)) {
                      wk.field_c = wk.field_c + 1;
                      dc.field_a = dc.field_a + 1;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L13;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
              ia.d(80);
              if (-2 == (qf.field_d ^ -1)) {
                oh.field_j = oh.field_j + 1;
                g.field_z = 0;
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          L14: {
            if (1 != lb.field_i) {
              break L14;
            } else {
              lc.field_q = lc.field_q + 1;
              if ((lc.field_q ^ -1) != -17) {
                break L0;
              } else {
                L15: {
                  L16: {
                    if (ll.c(true)) {
                      break L16;
                    } else {
                      qg.b(false);
                      if (var4 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  fg.d((byte) 91);
                  break L15;
                }
                lb.field_i = 2;
                if (var4 == 0) {
                  break L0;
                } else {
                  break L14;
                }
              }
            }
          }
          L17: {
            if (2 == lb.field_i) {
              break L17;
            } else {
              lc.field_q = lc.field_q - 1;
              if ((lc.field_q ^ -1) != -1) {
                break L0;
              } else {
                lb.field_i = 0;
                if (var4 == 0) {
                  break L0;
                } else {
                  break L17;
                }
              }
            }
          }
          L18: {
            L19: {
              if (qj.b((byte) 104)) {
                break L19;
              } else {
                kb.field_n = l.a((byte) 12, 4);
                ug.b(true);
                sh.field_c = pj.a(29, (byte) 114, 3, 10, 1);
                be.field_q = vl.field_y;
                if (var4 == 0) {
                  break L18;
                } else {
                  break L19;
                }
              }
            }
            be.field_q = hf.field_i;
            break L18;
          }
          L20: {
            if (be.field_q == -2) {
              be.field_q = 0;
              dj.a(true, true);
              break L20;
            } else {
              break L20;
            }
          }
          lb.field_i = 3;
          qf.field_d = be.field_q;
          break L0;
        }
        L21: {
          if (param0 == 11179) {
            break L21;
          } else {
            this.a(60);
            break L21;
          }
        }
    }

    final void b(int param0) {
        Object stackIn_3_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_79_0 = 0;
        int statePc = 0;
        Object var2 = null;
        int var3 = 0;
        ti[] var3_ref_ti__ = null;
        int var4 = 0;
        int var5 = 0;
        ti var5_ref_ti = null;
        int var6 = 0;
        ti[] var7_ref_ti__ = null;
        int var7 = 0;
        int var8 = 0;
        ti var9 = null;
        int var10 = 0;
        Object var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_A ? 1 : 0;
                    if (ub.field_c == null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = ub.field_c;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = gd.field_k;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var11 = stackIn_3_0;
                    var2 = var11;
                    if (rd.b(65)) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ub.field_c) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_8_0 = rj.field_b ? 1 : 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = 1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    da.a(stackIn_8_0 != 0, (byte) 119, (java.awt.Canvas) (var11));
                    return;
                }
                case 9: {
                    if (!vi.field_h) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ng.a(false, (java.awt.Canvas) (var11));
                    return;
                }
                case 12: {
                    if (qj.b((byte) 119)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (ud.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ng.a(false, (java.awt.Canvas) (var11));
                    return;
                }
                case 15: {
                    if ((be.field_q ^ -1) != (qf.field_d ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (0 != (be.field_q ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    kd.a(param0 ^ 15706, 0);
                    if (var10 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ej.field_l[be.field_q].d(param0 + 4456, 0);
                    if ((tl.field_d ^ -1) > -170) {
                        statePc = 21;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (tl.field_d < 151) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var3 = 166 - tl.field_d;
                    if ((var3 ^ -1) <= -1) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (2 >= (var3 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var4 = 0;
                    var5 = 0;
                    if (var10 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var4 = jl.field_l.field_r * (3 - -var3) / 20;
                    var5 = jl.field_l.field_s * (3 - -var3) / 20;
                    if (var10 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var4 = (var3 + (3 - -(var3 * var3 / 2))) * jl.field_l.field_r / 20;
                    var5 = jl.field_l.field_s * (var3 * var3 / 2 + var3 + 3) / 20;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    jl.field_l.b(320 - (var4 >> 756986817), 240 - (var5 >> 1911458401), var4, var5);
                    if (var10 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    jh.field_h.f(0, 0);
                    if (25 <= tl.field_d) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var3 = tl.field_d * 640 / 25;
                    var4 = tl.field_d * 480 / 25;
                    var5 = -var3 + 640 >> -353365215;
                    var6 = -var4 + 480 >> 2118178113;
                    var7_ref_ti__ = gk.field_c;
                    var8 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var8 >= var7_ref_ti__.length) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var9 = var7_ref_ti__[var8];
                    var9.b(var5, var6, var3, var4);
                    var8++;
                    if (var10 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var10 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var7 = tl.field_d * 3 * jl.field_l.field_r / 500;
                    var8 = jl.field_l.field_s * 3 * tl.field_d / 500;
                    jl.field_l.b(-(var7 >> 52684673) + 320, -(var8 >> -253450431) + 240, var7, var8);
                    if (var10 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var3_ref_ti__ = gk.field_c;
                    var4 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((var3_ref_ti__.length ^ -1) >= (var4 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5_ref_ti = var3_ref_ti__[var4];
                    var5_ref_ti.c(0, 0);
                    var4++;
                    if (var10 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var10 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((tl.field_d ^ -1) <= -135) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = 3 * jl.field_l.field_r / 20;
                    var4 = jl.field_l.field_s * 3 / 20;
                    jl.field_l.b(320 - (var3 >> -1146190079), -(var4 >> -826029567) + 240, var3, var4);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var3 = -10 + tl.field_d;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((var3 ^ -1) <= -1) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    rh.field_s.c(0, (int)(Math.exp((double)(-var3) * 0.06) * -160.0 * Math.cos((double)var3 * 0.12)));
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var3 = tl.field_d + -50;
                    if ((var3 ^ -1) > -1) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var4 = (var3 << -1746519036) + -ij.field_h.field_n;
                    if (var4 > 16) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var4 = 16;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    ij.field_h.c(var4, 159);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var3 = -84 + tl.field_d;
                    if ((var3 ^ -1) > -1) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var4 = 640 + -(8 * var3);
                    if (var4 >= 406) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var4 = 406;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    hc.field_r.c(var4, 112);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var3 = -134 + tl.field_d;
                    if ((var3 ^ -1) > -1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var4 = jl.field_l.field_r * (3 - -var3 - -(var3 * var3 / 2)) / 20;
                    var5 = jl.field_l.field_s * (3 - (-var3 - var3 * var3 / 2)) / 20;
                    jl.field_l.b(320 - (var4 >> 1279264961), 240 - (var5 >> 1991447073), var4, var5);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var10 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (qf.field_d == -1) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ej.field_l[qf.field_d].d(param0 ^ 29608, 0);
                    if (var10 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    kd.a(param0 ^ 15706, 0);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((be.field_q ^ -1) != 0) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    kd.a(98, (lc.field_q << -832957535) + -(lc.field_q << 1557856197));
                    if (var10 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ej.field_l[be.field_q].d(param0 ^ 29608, (lc.field_q << -984032095) - (lc.field_q << 921441573));
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (param0 == 15648) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    return;
                }
                case 68: {
                    if (!ll.c(true)) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    sb.e(0, 0, 640, 480);
                    og.b(false);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (0 == lb.field_i) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var3 = 256 * lc.field_q / 16;
                    if (-1 > (var3 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    sb.c(0, 0, sb.field_c, sb.field_g, 0, var3);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (!dj.b(-1)) {
                        statePc = 80;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (ll.c(true)) {
                        statePc = 80;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (null != ub.field_c) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = rj.field_b ? 1 : 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = 1;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    cj.a(stackIn_79_0 != 0, 793);
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    ah.a(0, 0, (byte) 119, (java.awt.Canvas) (var11));
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public Transmogrify() {
    }

    private final boolean a(byte param0, boolean param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        sj dupTemp$2 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        ad[] stackIn_135_0 = null;
        ad[] stackIn_140_0 = null;
        ad[] stackIn_143_0 = null;
        ad[] stackIn_148_0 = null;
        nf stackIn_151_0 = null;
        nf stackIn_156_0 = null;
        int stackIn_164_0 = 0;
        int statePc = 0;
        int var3 = 0;
        ad[] var3_ref_ad__ = null;
        int var4 = 0;
        int var5_int = 0;
        ad[] var5 = null;
        int var6_int = 0;
        nf var6 = null;
        int var7_int = 0;
        sj var7 = null;
        int var8_int = 0;
        sj var8 = null;
        int var9_int = 0;
        sj var9 = null;
        int var10 = 0;
        ti var12 = null;
        ti[] var13 = null;
        ti var14 = null;
        ad[] var15 = null;
        ad[] var16 = null;
        sj var17 = null;
        sj var18 = null;
        byte[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_A ? 1 : 0;
                    if (null != pc.field_a) {
                        statePc = 2;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!li.field_k.a((byte) -116)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!li.field_k.a((byte) -98, "basic")) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    vf.a((byte) -121, 0.0f, ee.a(vg.field_a, (byte) 100, aa.field_f, li.field_k, "basic"));
                    return false;
                }
                case 6: {
                    if (!pc.field_a.a((byte) -120)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (pc.field_a.c(param0 ^ -32065)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    vf.a((byte) 90, 1.0f, ee.a(oc.field_H, (byte) 71, k.field_e, pc.field_a, ""));
                    return false;
                }
                case 10: {
                    if (!di.field_h.a((byte) -116)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!di.field_h.c(32031)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    vf.a((byte) -10, 2.0f, ee.a(i.field_d, (byte) 74, kh.field_e, di.field_h, ""));
                    return false;
                }
                case 14: {
                    if (!be.field_n.a((byte) -117)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!be.field_n.c(32031)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    vf.a((byte) 25, 48.0f, fg.a(kh.field_e, be.field_n, 0, i.field_d, 32389));
                    return false;
                }
                case 18: {
                    if (!ta.field_d.a((byte) -115)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (ta.field_d.c(32031)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    vf.a((byte) -128, 49.0f, ee.a(i.field_d, (byte) 97, kh.field_e, ta.field_d, ""));
                    return false;
                }
                case 22: {
                    if (!oi.field_g.a((byte) -128)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (oi.field_g.a((byte) 123, "")) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    vf.a((byte) -128, 50.0f, ee.a(vg.field_a, (byte) 73, aa.field_f, oi.field_g, ""));
                    return false;
                }
                case 26: {
                    if (!wl.a(false, 0)) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (!oi.field_g.a((byte) -113)) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (oi.field_g.a((byte) 121, "halloween")) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    vf.a((byte) 36, 50.0f, ee.a(q.field_e, (byte) 114, ih.field_c, oi.field_g, "halloween"));
                    return false;
                }
                case 31: {
                    if (!kk.field_a.a((byte) -118)) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (kk.field_a.c(32031)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    vf.a((byte) 11, 51.0f, ee.a(dj.field_a, (byte) 75, i.field_c, kk.field_a, ""));
                    return false;
                }
                case 35: {
                    if (li.field_k.a((byte) 126, "arialish12")) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    vf.a((byte) -128, 52.0f, ee.a(dj.field_a, (byte) 102, i.field_c, li.field_k, "arialish12"));
                    return false;
                }
                case 37: {
                    if (!ig.field_y.a((byte) 118, "arialish12")) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    vf.a((byte) -125, 52.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish12"));
                    return false;
                }
                case 40: {
                    if (li.field_k.a((byte) -13, "arialish20")) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    vf.a((byte) 83, 53.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish20"));
                    return false;
                }
                case 42: {
                    if (ig.field_y.a((byte) 117, "arialish20")) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    vf.a((byte) -123, 53.0f, ee.a(dj.field_a, (byte) 123, i.field_c, li.field_k, "arialish20"));
                    return false;
                }
                case 44: {
                    if (!l.field_a.a((byte) -124)) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (l.field_a.c(32031)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    vf.a((byte) -4, 54.0f, rj.a(l.field_a, (byte) -38));
                    return false;
                }
                case 48: {
                    vf.a((byte) 17, 73.0f, q.field_c);
                    if (!param1) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return false;
                }
                case 51: {
                    cg.b((byte) -121);
                    this.b(15648);
                    rc.field_a = new bl(pc.field_a, di.field_h);
                    dg.field_d[0] = r.a(pc.field_a, "", "trans16_button_click").a();
                    dg.field_d[1] = r.a(pc.field_a, "", "trans01_submit_accept").a();
                    dg.field_d[2] = r.a(pc.field_a, "", "trans02_submit_decline").a();
                    dg.field_d[3] = r.a(pc.field_a, "", "trans03_place_tile_1").a();
                    dg.field_d[4] = r.a(pc.field_a, "", "trans04_place_tile_2").a();
                    dg.field_d[5] = r.a(pc.field_a, "", "trans05_place_tile_3").a();
                    dg.field_d[6] = r.a(pc.field_a, "", "trans06_incorrect_letter").a();
                    dg.field_d[7] = r.a(pc.field_a, "", "trans07_popup_warning").a();
                    lj.field_u = bb.a(dg.field_d[1], 100, 255);
                    pc.field_a = null;
                    el.b(-6491);
                    return false;
                }
                case 52: {
                    if (null == di.field_h) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    vf.a((byte) -121, 74.0f, q.field_c);
                    this.b(15648);
                    dg.field_d[10] = ml.a(di.field_h, "", "trans14_crowd_cheer_long").b();
                    dg.field_d[11] = ml.a(di.field_h, "", "trans15_crowd_cheer_short").b();
                    var3 = 95190;
                    var4 = 275371;
                    dg.field_d[9] = ec.a(var4, 0, var3, dg.field_d[10]);
                    dg.field_d[8] = ec.a(dg.field_d[10].field_l.length, 0, var4, dg.field_d[10]);
                    dg.field_d[12] = ec.a(dg.field_d[10].field_l.length, 0, var3, dg.field_d[10]);
                    di.field_h = null;
                    el.b(-6491);
                    return false;
                }
                case 54: {
                    if (null != ta.field_d) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    vf.a((byte) -125, 75.0f, db.field_f);
                    this.b(15648);
                    bd.field_u = new pl[10];
                    bd.field_u[0] = pl.a(ta.field_d, "", "transmogrify intro jingle");
                    bd.field_u[1] = pl.a(ta.field_d, "", "transmogrify 1-3");
                    bd.field_u[2] = pl.a(ta.field_d, "", "transmogrify 4-6");
                    bd.field_u[3] = pl.a(ta.field_d, "", "transmogrify 7-9");
                    bd.field_u[4] = pl.a(ta.field_d, "", "transmogrify 10");
                    bd.field_u[5] = pl.a(ta.field_d, "", "transmogrify linking jingle");
                    bd.field_u[6] = pl.a(ta.field_d, "", "transmogrify title");
                    bd.field_u[7] = pl.a(ta.field_d, "", "transmogrify complete well jingle");
                    bd.field_u[8] = pl.a(ta.field_d, "", "transmogrify complete ok jingle");
                    bd.field_u[9] = pl.a(ta.field_d, "", "transmogrify complete poor jingle");
                    ta.field_d = null;
                    el.b(param0 + -6395);
                    return false;
                }
                case 57: {
                    if (be.field_n == null) {
                        statePc = 68;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var3 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (10 <= var3) {
                        statePc = 66;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var10 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (bd.field_u[var3] == null) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (!jk.field_D.a(176400, false, rc.field_a, bd.field_u[var3], be.field_n)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    return false;
                }
                case 65: {
                    var3++;
                    if (var10 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    jk.field_D.d(true);
                    rc.field_a = null;
                    be.field_n = null;
                    el.b(-6491);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    return false;
                }
                case 68: {
                    if (null != gb.field_a) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (null == wf.field_d) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    vf.a((byte) -125, 92.0f, ha.field_b);
                    this.b(param0 ^ -15744);
                    gb.field_a = ej.a((byte) -43, li.field_k, "", "arialish20");
                    el.b(-6491);
                    return false;
                }
                case 72: {
                    if (le.field_A != null) {
                        statePc = 91;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var21 = ig.field_y.a("", (byte) 92, "arialish20");
                    wf.field_d = jd.a(var21, 98, gb.field_a);
                    og.field_a = ua.a(oi.field_g, "", 32, kk.field_a, "arialish20narrow");
                    le.field_A = eh.a(gb.field_a, param0 ^ -96, var21, 255, 119);
                    le.field_A.field_K[1] = new int[]{0, 16777215, 7829367};
                    hk.field_a = am.a("", li.field_k, (byte) 72, ig.field_y, "arialish12");
                    gb.field_a = null;
                    wf.field_d.a(ue.field_c, (int[]) null);
                    hk.field_a.a(ue.field_c, (int[]) null);
                    ff.field_z = pc.a("basic", "unachieved", li.field_k, param0 ^ 33);
                    nh.a(ff.field_z, (byte) 59);
                    var4 = wf.field_d.field_t + wf.field_d.field_y;
                    c.field_a = pc.a("basic", "orbcoin", li.field_k, param0 ^ 33);
                    li.field_k = null;
                    ig.field_y = null;
                    og.field_b = new ti(var4, var4);
                    og.field_b.e();
                    c.field_a.a(0, 0, var4, var4);
                    c.field_a = null;
                    ri.field_k.a(115);
                    dh.field_B = pc.a("", "background", oi.field_g, param0 + -28);
                    qe.field_F = kl.a(oi.field_g, (byte) 127, "", "hostanims_uniq");
                    mk.field_B = kl.a(oi.field_g, (byte) 125, "", "dialog_frame");
                    pf.field_h = kl.a(oi.field_g, (byte) 125, "", "button_frame");
                    eh.field_c = kl.a(oi.field_g, (byte) 121, "", "button_frame_hi");
                    jk.field_x = new mg(ej.a((byte) -43, oi.field_g, "var_button", ""));
                    var5_int = wf.field_d.a(mc.field_a[0]);
                    var6_int = wf.field_d.a(mc.field_a[1]);
                    if ((var5_int ^ -1) > (var6_int ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var5_int = var6_int;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var6_int = wf.field_d.a(mc.field_a[2]);
                    tb.field_b = new ti[3];
                    if ((var6_int ^ -1) >= (var5_int ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var5_int = var6_int;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var5_int += 16;
                    var7_int = 4 - -wf.field_d.field_y + wf.field_d.field_t;
                    var8_int = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = var8_int;
                    stackIn_80_1 = 3;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 >= stackIn_80_1) {
                        statePc = 90;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    tb.field_b[var8_int] = new ti(var5_int, var7_int);
                    tb.field_b[var8_int].e();
                    dk.a(var7_int, mk.field_B, -28018, 0, 0, var5_int);
                    stackIn_164_0 = 0;
                    stackIn_82_0 = stackIn_164_0;
                    if (var10 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var9_int = stackIn_82_0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((sb.field_h.length ^ -1) >= (var9_int ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_80_0 = -1;
                    stackIn_85_0 = stackIn_80_0;
                    stackIn_80_1 = sb.field_h[var9_int] ^ -1;
                    stackIn_85_1 = stackIn_80_1;
                    if (var10 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (stackIn_85_0 == stackIn_85_1) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (7500402 <= sb.field_h[var9_int]) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    sb.field_h[var9_int] = 7500402;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var9_int++;
                    if (var10 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    wf.field_d.c(mc.field_a[var8_int], var5_int >> 828777697, wf.field_d.field_y + 2, 1, -1);
                    var8_int++;
                    if (var10 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    ri.field_k.a(param0 + 199);
                    el.b(-6491);
                    return false;
                }
                case 91: {
                    if (param0 == -96) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    field_B = (String) null;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (null == rk.field_r[4]) {
                        statePc = 95;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 95: {
                    a.field_R = pc.a("", "logo_highscores", oi.field_g, param0 ^ 118);
                    mk.field_y = pc.a("", "logo_achievements", oi.field_g, 58);
                    se.field_t = pc.a("", "logo_instructions", oi.field_g, -33);
                    uj.field_e = cf.a((byte) -122);
                    kk.field_d = kl.a(oi.field_g, (byte) 121, "", "frame_trans");
                    ck.field_C = kl.a(oi.field_g, (byte) 123, "", "frame_trans_inner");
                    pf.field_d = pc.a("", "banner", oi.field_g, 71);
                    rk.field_r[4] = new ti(640, 480);
                    var12 = new ti(640, 480);
                    var12.e();
                    dk.a(377, ck.field_C, -28018, 258, 72, 361);
                    mk.field_y.d(337, 14, 0);
                    var4 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if ((var4 ^ -1) <= (sb.field_h.length ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_103_0 = sb.field_h[var4] ^ -1;
                    stackIn_98_0 = stackIn_103_0;
                    stackIn_103_1 = -1;
                    stackIn_98_1 = stackIn_103_1;
                    if (var10 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 != stackIn_98_1) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    sb.field_h[var4] = 16777215;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var4++;
                    if (var10 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    rk.field_r[4].e();
                    uj.field_e.f(0, 0);
                    stackIn_103_0 = 0;
                    stackIn_103_1 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (!wl.a(stackIn_103_0 != 0, stackIn_103_1)) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    pc.a("halloween", "achievementsbg_nobox", oi.field_g, 18).c(0, 0);
                    if (var10 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    pc.a("", "achievementsbg_nobox", oi.field_g, -126).c(0, 0);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var12.e(0, 0, 166);
                    wf.a(kk.field_d, 377, 7, 258, 2363394, 361, 72);
                    mk.field_y.c(337, 14);
                    rk.field_r[6] = rk.field_r[4];
                    rk.field_r[1] = new ti(640, 480);
                    rk.field_r[1].e();
                    uj.field_e.f(0, 0);
                    if (!wl.a(false, 0)) {
                        statePc = 110;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    pc.a("halloween", "pausemenu_nobox", oi.field_g, -127).c(0, 0);
                    if (var10 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    pc.a("", "pausemenu_nobox", oi.field_g, param0 ^ -1).c(0, 0);
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    wf.a(kk.field_d, 347, param0 + 103, 140, 2363394, 361, 72);
                    wf.a(ck.field_C, 347, 7, 140, 16777215, 361, 72);
                    pf.field_d.c(219, 14);
                    ri.field_k.a(param0 ^ -47);
                    rk.field_r[7] = rk.field_r[1];
                    el.b(-6491);
                    return false;
                }
                case 112: {
                    if (rk.field_r[0] != null) {
                        statePc = 131;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (wl.a(false, 0)) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    rk.field_r[0] = kf.a(pc.a("", "mainmenu_packed", oi.field_g, -5), false, (byte) -93);
                    if (var10 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    rk.field_r[0] = kf.a(pc.a("halloween", "mainmenu_packed", oi.field_g, -125), false, (byte) 101);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    rk.field_r[0].e();
                    pf.field_d.c(219, 21);
                    rk.field_r[3] = pc.a("", "instructions_bg", oi.field_g, -128);
                    rk.field_r[5] = rk.field_r[1];
                    wl.field_K = pc.a("", "tile", oi.field_g, param0 + 149);
                    rj.field_a = kl.a(oi.field_g, (byte) 122, "", "sparkles");
                    hf.field_d = kl.a(oi.field_g, (byte) 122, "", "sparkle_array");
                    jh.field_h = new ti(640, 480);
                    jh.field_h.e();
                    uj.field_e.f(0, 0);
                    pc.a("", "spikes", oi.field_g, 45).c(0, 0);
                    rk.field_r[2] = new ti(640, 480);
                    rk.field_r[2].e();
                    jh.field_h.f(0, 0);
                    if (wl.a(false, 0)) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    pc.a("", "highscorebg_nobox", oi.field_g, -126).c(0, 0);
                    if (var10 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    pc.a("halloween", "highscorebg_nobox", oi.field_g, -127).c(0, 0);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    a.field_R.c(10, 10);
                    wf.a(kk.field_d, 377, 7, 217, 2363394, 361, 20);
                    wf.a(ck.field_C, 377, param0 + 103, 217, 16777215, 361, 20);
                    ri.field_k.a(117);
                    jl.field_l = pc.a("", "intro_bigstar", oi.field_g, param0 ^ -58);
                    gk.field_c = kl.a(oi.field_g, (byte) 124, "", "intro_stars");
                    ij.field_h = pc.a("", "intro_host", oi.field_g, -124);
                    hc.field_r = pc.a("", "intro_hostess", oi.field_g, 95);
                    rh.field_s = kf.a(pc.a("", "intro_logo_packed", oi.field_g, param0 + -31), false, (byte) 126);
                    rh.field_s.b();
                    kk.field_d = null;
                    ck.field_C = null;
                    pf.field_d = null;
                    uj.field_e = null;
                    fc.field_h = kl.a(oi.field_g, (byte) 126, "", "achievements");
                    var13 = fc.field_h;
                    var4 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if ((var13.length ^ -1) >= (var4 ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var14 = var13[var4];
                    nh.a(var14, (byte) 110);
                    var4++;
                    if (var10 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var10 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (wl.a(false, 0)) {
                        statePc = 128;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 128: {
                    ij.field_h = pc.a("halloween", "intro_host", oi.field_g, -128);
                    hc.field_r = pc.a("halloween", "intro_hostess", oi.field_g, 59);
                    qe.field_F = kl.a(oi.field_g, (byte) 127, "halloween", "hostanims_uniq");
                    rk.field_r[3] = pc.a("halloween", "instructions_bg", oi.field_g, -12);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    dh.field_B = pc.a("halloween", "background", oi.field_g, 19);
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    hk.a(wf.field_d, param0 + 98, 400, wf.field_d);
                    ej.a(16, (byte) 108, 8, 2, new pg(pf.field_h), new pg(eh.field_c));
                    vf.a(new pg(mk.field_B), 10, 10, param0 + 211);
                    el.b(-6491);
                    return false;
                }
                case 131: {
                    if (l.field_a == null) {
                        statePc = 157;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    vf.a((byte) -11, 93.0f, vh.field_k);
                    this.b(param0 + 15744);
                    var15 = kl.b(param0 + 12, l.field_a);
                    var3_ref_ad__ = var15;
                    var4 = 0;
                    var5_int = 0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var5_int >= var15.length) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_140_0 = (ad[]) (var3_ref_ad__);
                    stackIn_135_0 = stackIn_140_0;
                    if (var10 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (stackIn_135_0[var5_int] != null) {
                        statePc = 137;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var4++;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    var5_int++;
                    if (var10 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    incrementValue$0 = var4;
                    var4--;
                    stackIn_140_0 = new ad[incrementValue$0];
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var16 = stackIn_140_0;
                    var5 = var16;
                    var6_int = var15.length - 1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (-1 < (var6_int ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackIn_148_0 = (ad[]) (var3_ref_ad__);
                    stackIn_143_0 = stackIn_148_0;
                    if (var10 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0[var6_int] != null) {
                        statePc = 145;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var16 = var5;
                    incrementValue$1 = var4;
                    var4--;
                    var5[incrementValue$1] = var15[var6_int];
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var16 = var5;
                    var6_int--;
                    if (var10 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var16 = var5;
                    stackIn_148_0 = (ad[]) (var16);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var16 = var5;
                    we.field_l = new nf[stackIn_148_0.length];
                    var6_int = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if ((var6_int ^ -1) <= (we.field_l.length ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    we.field_l[var6_int] = new nf(oi.field_g, kk.field_a, var16[var6_int]);
                    stackIn_156_0 = we.field_l[var6_int];
                    stackIn_151_0 = stackIn_156_0;
                    if (var10 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (((String) (Object) stackIn_151_0.field_j).equals(hi.field_d)) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    am.field_n = var6_int;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    var6_int++;
                    if (var10 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_156_0 = we.field_l[am.field_n];
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var6 = stackIn_156_0;
                    var17 = w.a(de.field_d, 1, var6, (byte) 60, var6.field_d.charAt(0));
                    var17.field_g = 1000;
                    var8 = var17;
                    var8.field_j = 1000;
                    ob.a(1, 1, var17, 0);
                    ue.field_c[1].field_h = var6.field_c.field_D - -8;
                    var17.d(1);
                    dupTemp$2 = w.a(de.field_d, 1, var6, (byte) 88, var6.field_n.charAt(1));
                    sg.field_p = dupTemp$2;
                    var18 = dupTemp$2;
                    var7 = var18;
                    var7.field_g = 1000;
                    var9 = var7;
                    var9.field_j = 1000;
                    var7.field_x = true;
                    ob.a(1, 2, var18, 0);
                    oi.field_g = null;
                    l.field_a = null;
                    ue.field_c[2].field_h = 8 + var6.field_c.field_D;
                    kk.field_a = null;
                    el.b(param0 ^ 6405);
                    return false;
                }
                case 157: {
                    var3 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 162;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    ej.field_l[var3] = new vg(var3);
                    var3++;
                    if (var10 != 0) {
                        statePc = 163;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var10 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    be.field_q = 0;
                    ek.a(118);
                    el.b(-6491);
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    return true;
                }
                case 164: {
                    return stackIn_164_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        this.a(8, param0 ^ -10, 13, 9, 11, 0, false, 10);
        lc var2 = new lc();
        if (param0 != -9) {
            return;
        }
        var2.b(128, 9, -23780);
        uh.a((java.awt.Component) ((Object) gd.field_k), 22050, -21, lk.field_b, var2, true);
        uc.a(128, (byte) -119);
        u.field_b = 4473924;
        field_D = 128;
        pf.field_b = 255;
        this.a(true, false, false, false, (byte) 9);
        ue.field_c = new ii[3];
    }

    private final void n(int param0) {
        if (!qj.b((byte) 126)) {
            if (!(kb.field_n != null)) {
                kb.field_n = l.a((byte) 12, 4);
            }
        }
        wd.a(param0 + -15099, false, bd.field_u[0]);
        if (param0 != 32198) {
            this.c(9);
        }
    }

    final static boolean d(boolean param0) {
        if (param0) {
            field_E = (String) null;
            return true;
        }
        return true;
    }

    public final void init() {
        this.a("transmogrify", false, 12);
    }

    private final void j(int param0) {
        if (null != nk.field_d) {
            dl.a(nk.field_d, (byte) 119);
            nk.field_d = null;
            el.b(-6491);
        }
        oi.field_g = cg.a((byte) -82, 1);
        pc.field_a = cg.a((byte) -82, 2);
        di.field_h = cg.a((byte) -82, 3);
        be.field_n = cg.a((byte) -82, 4);
        ta.field_d = cg.a((byte) -82, 5);
        l.field_a = cg.a((byte) -82, 6);
        kk.field_a = cg.a((byte) -82, 7);
        of.b(22);
        if (param0 != -7632) {
            Transmogrify.k(115);
        }
    }

    final void c(int param0) {
        Transmogrify.l(0);
        qj.c((byte) -115);
        ai.a((byte) 67);
        kb.b(false);
        ub.a(-31455);
        i.c(true);
        uh.c(-21);
        cd.a(107);
        dk.a((byte) 127);
        we.a(-11509);
        gj.b(-102);
        ci.d(-120);
        ig.i((byte) -49);
        kl.a(6);
        fa.f(-121);
        qb.a((byte) -62);
        ce.a((byte) -127);
        qi.a(74);
        rj.a(false);
        sb.a();
        mh.a(0);
        gb.a(param0 + -5);
        oa.b((byte) -99);
        lk.a((byte) -124);
        bc.a(122);
        n.a(false);
        vf.a(true);
        ql.a(100);
        ne.a((byte) 68);
        aa.a(param0 ^ 3);
        sg.a((byte) -121);
        ok.a(42);
        af.a((byte) 22);
        of.a(-21068);
        td.b(0);
        cj.a((byte) 119);
        gg.c(127);
        dg.a(-1);
        ea.b((byte) 100);
        mg.a((byte) -28);
        bl.b(116);
        vg.a((byte) -60);
        nf.a((byte) -41);
        gk.a(9);
        wf.a(false);
        lc.e(-122);
        ul.b();
        ej.b(false);
        qh.f();
        oj.e(param0 ^ 111);
        ga.a(true);
        al.a(-84);
        pg.a((byte) -119);
        l.a((byte) 108);
        kg.a();
        tb.a(true);
        fj.a((byte) -101);
        el.a((byte) 99);
        qd.c(69);
        ih.a((byte) -46);
        ad.a(1);
        lb.a((byte) 103);
        il.a((byte) -24);
        da.i(param0 ^ param0);
        sf.c(true);
        sd.e((byte) 4);
        rf.r(param0 + -2394);
        ik.s(param0 ^ 107);
        wl.d((byte) 66);
        jk.m(486302657);
        ff.m(param0 + 124);
        ck.l(-123);
        hg.b((byte) -15);
        vd.a((byte) -126);
        jj.a(96);
        mj.a();
        ml.c();
        mb.a();
        hk.a((byte) 35);
        ri.a((byte) 18);
        k.a(false);
        se.c((byte) 99);
        id.a((byte) 92);
        ei.a((byte) -110);
        j.a((byte) -119);
        ld.a(102);
        sj.b((byte) -15);
        ua.a(-124);
        hj.m(param0 ^ 252);
        d.a(1);
        uc.a(0);
        eh.a((byte) 26);
        ic.a(param0 ^ 2);
        bh.a(126);
        nk.a((byte) -119);
        kk.a(false);
        ug.a((byte) 118);
        mc.a(true);
        ef.a(-106);
        nd.e(0);
        tj.d((byte) 107);
        bk.b(-123);
        pj.g(124);
        ak.a((byte) 116);
        be.c((byte) 113);
        di.b(54);
        eg.a((byte) 66);
        rh.b(true);
        ec.c(0);
        rl.b(7);
        db.a(8192);
        dj.a(48);
        gf.a();
        re.a((byte) -37);
        ch.a(807);
        ll.q(5);
        u.a((byte) 125);
        h.a(95);
        ka.a();
        hd.c((byte) -104);
        oe.a(-27273);
        e.b(62);
        f.a(false);
        qf.a(param0 ^ 3);
        uf.a(103);
        tg.a(false);
        de.a((byte) -79);
        th.a((byte) -42);
        ae.b(-116);
        bj.c((byte) -79);
        wb.b((byte) 83);
        ah.a(param0 ^ -23430);
        c.a(param0 + 18123);
        ba.d(param0 + -1);
        fd.a(127);
        wi.a(66);
        pa.a(122);
        ij.a(2);
        ue.a((byte) 18);
        lj.c(true);
        fi.h(param0 ^ 30382);
        bi.o(-31);
        mk.n(param0 + -116);
        aj.h(32);
        rd.a(param0 ^ 31);
        cc.a(true);
        rk.b(false);
        pc.c(1);
        wc.a(7);
        lf.a(66);
        vj.a((byte) 40);
        pe.a((byte) -102);
        rb.a(-53);
        ha.a(-19424);
        kf.e(123);
        fg.b((byte) 107);
        og.a(false);
        nb.a(param0 + 17);
        wd.a((byte) 126);
        si.a((byte) 106);
        nh.a(-33);
        oc.i(124);
        vc.p(93);
        rg.g((byte) -43);
        a.e((byte) -13);
        qe.i(-156630320);
        dh.l(-1);
        le.i(param0 + -4);
        ve.a((byte) -108);
        ob.k(-128);
        bf.a((byte) 16);
        me.a((byte) 122);
        v.a(17320);
        ge.n(1843);
        wh.h(43);
        fk.a((byte) 114);
        jg.a();
        pi.a((byte) -110);
        mf.a(true);
        nl.d(-114);
        hf.a((byte) 118);
        jh.c(-1);
        te.a((byte) 41);
        vl.i(2147483647);
        g.i(19224);
        vi.a(param0 + 62);
        pf.a(17205);
        dl.b(false);
        hc.d((byte) 105);
        je.a((byte) -128);
        w.b((byte) -117);
        wg.a(20738);
        o.d(0);
        am.a((byte) 5);
        ta.a(param0 + 4);
        od.b(true);
        ek.a((byte) -38);
        ni.b(param0 + 252);
        nc.c(94);
        kd.a(-73);
        gl.i(param0 ^ 2480);
        ng.a((byte) 122);
        qk.a((byte) -86);
        oh.a((byte) 104);
        gd.d(111);
        pd.b((byte) -74);
        uj.b(-1);
        fc.a(false);
        hi.a(false);
        b.d(-22826);
        ee.l(-31263);
        kh.a(0);
        wj.c(param0 ^ 483);
        bd.b(true);
        ac.a((byte) -114);
        sh.a(false);
        ia.a((byte) -4);
        oi.d(-97);
        jl.a((byte) 27);
        he.a((byte) 58);
        gh.e(58);
        ab.b(-2147483648);
        ol.a(false);
        li.h(param0 ^ 122);
        bg.b((byte) 54);
        vh.b((byte) 118);
        md.b(true);
        wk.a(-30254);
        nj.d(param0 ^ -115);
        rc.a(true);
        ca.d(param0 ^ -577295245);
        q.a(4);
        this.field_q = null;
    }

    static {
        field_E = "OK";
    }
}
