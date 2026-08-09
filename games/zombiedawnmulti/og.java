/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ek {
    static String field_M;
    static String field_T;
    static boolean field_N;
    boolean field_Q;
    static String field_P;
    int field_R;
    int field_O;
    static String field_S;

    final static void h(byte param0) {
        dl.field_h.b((byte) 106);
        if (param0 < 109) {
            og.b(26, 121);
        }
    }

    final void h(int param0) {
        int fieldTemp$0 = this.field_R - 1;
        this.field_R = this.field_R - 1;
        if ((fieldTemp$0 ^ -1) >= -1) {
            this.a(true);
            this.a(-4564);
            return;
        }
        if (param0 < 30) {
            field_T = (String) null;
        }
    }

    final static void b(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        int var3 = -1 / ((param1 - 57) / 55);
        var2.field_j = var2.field_j + 1;
        int var4 = var2.field_j;
        var2.a(122, 5);
        var2.a(122, mh.field_c.field_mc);
        int var5 = mh.field_c.field_Pb + (mh.field_c.field_fc << -910194394);
        var2.a(-101, var5);
        var2.a(mh.field_c.field_Zb, mh.field_c.field_Zb.length, 0, 114);
        var2.e(91, -var4 + var2.field_j);
    }

    public static void g(byte param0) {
        field_T = null;
        if (param0 >= -76) {
            return;
        }
        field_P = null;
        field_S = null;
        field_M = null;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 >= 32 && param0 <= 126) {
            return true;
        }
        if (param0 >= 160 && param0 <= 255) {
            return true;
        }
        if (param1 <= 98) {
            og.b(64, 2);
        }
        if (8364 == param0 || 338 == param0 || param0 == 8212 || param0 == 339 || 376 == param0) {
            return true;
        }
        return false;
    }

    final void a(int param0, rl param1) {
        try {
            super.a(param0 ^ 0, param1);
            if (param0 != -9019) {
                og.b(-123, -15);
            }
            this.field_R = this.field_A.field_m.a((byte) 32, this.field_O, 3000);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "og.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    og(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_O = param3;
        this.field_R = 3000;
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5, int param6) {
        cj dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        int stackIn_2_3 = 0;
        tq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        Object stackIn_7_0 = null;
        jh stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        jh stackIn_10_0 = null;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        jh stackIn_11_0 = null;
        cj stackIn_11_1 = null;
        cj stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        cj stackIn_11_4 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        jh stackIn_30_0 = null;
        cj stackIn_30_1 = null;
        cj stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        jh stackIn_31_0 = null;
        cj stackIn_31_1 = null;
        cj stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        jh stackIn_32_0 = null;
        cj stackIn_32_1 = null;
        cj stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        cj stackIn_32_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        ja[] stackIn_91_0 = null;
        ja[] stackIn_92_0 = null;
        ja[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        ja[] stackIn_100_0 = null;
        ja[] stackIn_101_0 = null;
        ja[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_104_0 = null;
        ja[][] stackIn_104_1 = null;
        Object stackIn_109_0 = null;
        ja[][] stackIn_109_1 = null;
        boolean stackIn_154_0 = false;
        boolean stackIn_167_0 = false;
        String stackIn_177_0 = null;
        String stackIn_186_0 = null;
        String stackIn_191_0 = null;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        Object stackIn_210_0 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        th var8 = null;
        long var9 = 0L;
        Object var11 = null;
        jh var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var18_int = 0;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        cj var21 = null;
        int var22_int = 0;
        cj var22 = null;
        cj var23 = null;
        cj var24 = null;
        cj var25 = null;
        cj var26 = null;
        cj var27 = null;
        cj var28 = null;
        cj var29 = null;
        cj var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        ja var42 = null;
        cj var43 = null;
        cj var44 = null;
        cj var45 = null;
        cj var46 = null;
        cj var47 = null;
        cj var48 = null;
        cj var49 = null;
        Object var50 = null;
        ja var50_ref = null;
        Object var51 = null;
        ja var51_ref = null;
        Object var52 = null;
        ja var52_ref = null;
        Object var53 = null;
        ja var53_ref = null;
        ja var54 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var50 = null;
                    var51 = null;
                    var52 = null;
                    var53 = null;
                    var41 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = ek.field_H;
                    stackIn_2_0 = stackIn_3_0;
                    stackIn_3_1 = 2;
                    stackIn_2_1 = stackIn_3_1;
                    stackIn_3_2 = param5;
                    stackIn_2_2 = stackIn_3_2;
                    stackIn_3_3 = 2 * (jk.field_f + 2);
                    stackIn_2_3 = stackIn_3_3;
                    if (vc.field_d != ek.field_H) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_4_0 = (tq) ((Object) stackIn_2_0);
                    stackIn_4_1 = stackIn_2_1;
                    stackIn_4_2 = stackIn_2_2;
                    stackIn_4_3 = stackIn_2_3;
                    stackIn_4_4 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = (tq) ((Object) stackIn_3_0);
                    stackIn_4_1 = stackIn_3_1;
                    stackIn_4_2 = stackIn_3_2;
                    stackIn_4_3 = stackIn_3_3;
                    stackIn_4_4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var7_int = ((tq) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, (4 * jk.field_f - -8) * param6, -108) ? 1 : 0;
                    var8 = ek.field_H.field_Gb.field_Cb;
                    var9 = bl.a((byte) 99);
                    var11 = null;
                    var12 = (jh) ((Object) var8.c(105));
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var12 == null) {
                        statePc = 207;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var13 = 0;
                    stackIn_210_0 = null;
                    stackIn_7_0 = stackIn_210_0;
                    if (var41 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != var12.field_Cb) {
                        statePc = 33;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var14 = param4 | param2;
                    var12.field_Kb = new cj(0L, wc.field_H);
                    var12.a((byte) 50, var12.field_Kb);
                    var12.field_Kb.field_R = 1;
                    var12.field_Gb = new cj(0L, m.field_x);
                    var12.a((byte) 50, var12.field_Gb);
                    var12.field_Ib = new cj(0L, wc.field_H);
                    var12.a((byte) 50, var12.field_Ib);
                    var12.field_Ib.field_V = 0;
                    var12.field_gc = new cj(0L, wc.field_H);
                    var12.a((byte) 50, var12.field_gc);
                    var12.field_gc.field_V = 0;
                    var12.field_Lb = new cj(0L, m.field_x);
                    var12.a((byte) 50, var12.field_Lb);
                    var12.field_Lb.field_R = 2;
                    stackIn_10_0 = (jh) (var12);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = null;
                    stackIn_9_1 = stackIn_10_1;
                    stackIn_10_2 = null;
                    stackIn_9_2 = stackIn_10_2;
                    stackIn_10_3 = 0L;
                    stackIn_9_3 = stackIn_10_3;
                    if (tb.field_u) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (jh) ((Object) stackIn_9_0);
                    stackIn_11_1 = null;
                    stackIn_11_2 = null;
                    stackIn_11_3 = stackIn_9_3;
                    stackIn_11_4 = m.field_x;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (jh) ((Object) stackIn_10_0);
                    stackIn_11_1 = null;
                    stackIn_11_2 = null;
                    stackIn_11_3 = stackIn_10_3;
                    stackIn_11_4 = wc.field_H;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_11_0.field_jc = new cj(stackIn_11_3, stackIn_11_4);
                    var12.a((byte) 50, var12.field_jc);
                    var12.field_Qb = new cj[kj.field_h];
                    var12.field_Xb = new cj(0L, (cj) null);
                    if ((var14 & 1 << jq.field_f) != 0) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var12.field_jc.a((byte) 50, var12.field_Xb);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var12.field_kc = new cj(0L, (cj) null);
                    if (0 != (1 << ho.field_l & var14)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var12.field_jc.a((byte) 50, var12.field_kc);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var12.field_Tb = new cj(0L, (cj) null);
                    if ((1 << el.field_M & var14) != 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var12.field_jc.a((byte) 50, var12.field_Tb);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var12.field_ec = new cj(0L, (cj) null);
                    if ((1 << ti.field_J & var14 ^ -1) != -1) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var12.field_jc.a((byte) 50, var12.field_ec);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var45 = var12.field_Xb;
                    var44 = var12.field_ec;
                    var43 = var12.field_kc;
                    var12.field_Tb.field_lb = 1;
                    var43.field_lb = 1;
                    var44.field_lb = 1;
                    var45.field_lb = 1;
                    var18_int = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((kj.field_h ^ -1) >= (var18_int ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var12.field_Qb[var18_int] = new cj(0L, (cj) null);
                    stackIn_208_0 = 0;
                    stackIn_26_0 = stackIn_208_0;
                    stackIn_208_1 = 1 << var18_int + vm.field_ib & var14;
                    stackIn_26_1 = stackIn_208_1;
                    if (var41 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == stackIn_26_1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12.field_jc.a((byte) 50, var12.field_Qb[var18_int]);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var12.field_Qb[var18_int].field_lb = 1;
                    var18_int++;
                    if (var41 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (jh) (var12);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = null;
                    stackIn_30_1 = stackIn_31_1;
                    stackIn_31_2 = null;
                    stackIn_30_2 = stackIn_31_2;
                    stackIn_31_3 = 0L;
                    stackIn_30_3 = stackIn_31_3;
                    if (tb.field_u) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (jh) ((Object) stackIn_30_0);
                    stackIn_32_1 = null;
                    stackIn_32_2 = null;
                    stackIn_32_3 = stackIn_30_3;
                    stackIn_32_4 = wc.field_H;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (jh) ((Object) stackIn_31_0);
                    stackIn_32_1 = null;
                    stackIn_32_2 = null;
                    stackIn_32_3 = stackIn_31_3;
                    stackIn_32_4 = m.field_x;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_32_0.field_Yb = new cj(stackIn_32_3, stackIn_32_4);
                    var12.a((byte) 50, var12.field_Yb);
                    var12.field_Yb.field_R = 2;
                    var12.field_ac = new cj(0L, m.field_x);
                    var12.a((byte) 50, var12.field_ac);
                    var12.field_hc = new cj(0L, cm.field_b);
                    var12.a((byte) 50, var12.field_hc);
                    var12.field_pc = new cj(0L, cm.field_b);
                    var12.a((byte) 50, var12.field_pc);
                    var12.field_Rb = new cj(0L, vo.field_m);
                    var12.a((byte) 50, var12.field_Rb);
                    var12.f(-128);
                    var12.field_oc = new cj(0L, fd.field_O);
                    var12.a((byte) 50, var12.field_oc);
                    var13 = 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var12.field_Kb.field_wb = null;
                    if (var12.field_Fb) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = param4;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = param2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var14 = stackIn_36_0;
                    var46 = var12.field_Kb;
                    var12.field_Kb.field_z = 0;
                    var46.field_zb = 0;
                    var12.field_oc.field_wb = null;
                    var12.field_oc.field_z = 0;
                    var47 = var12.field_oc;
                    var47.field_zb = 0;
                    var12.field_Gb.field_wb = null;
                    var48 = var12.field_Gb;
                    var12.field_Gb.field_z = 0;
                    var48.field_zb = 0;
                    var12.field_Ib.field_wb = null;
                    var18 = var12.field_Ib;
                    var12.field_Ib.field_z = 0;
                    var12.field_gc.field_wb = null;
                    var18.field_zb = 0;
                    var19 = var12.field_gc;
                    var12.field_gc.field_z = 0;
                    var19.field_zb = 0;
                    var12.field_Lb.field_wb = null;
                    var20 = var12.field_Lb;
                    var12.field_Lb.field_z = 0;
                    var12.field_jc.field_wb = null;
                    var20.field_zb = 0;
                    var12.field_jc.field_z = 0;
                    var21 = var12.field_jc;
                    var21.field_zb = 0;
                    var22_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var22_int >= kj.field_h) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12.field_Qb[var22_int].field_rb = null;
                    var23 = var12.field_Qb[var22_int];
                    var12.field_Qb[var22_int].field_z = 0;
                    var23.field_zb = 0;
                    var22_int++;
                    if (var41 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var41 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var12.field_Xb.field_rb = null;
                    var12.field_Xb.field_z = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var22 = var12.field_Xb;
                    var12.field_ec.field_rb = null;
                    var22.field_zb = 0;
                    var12.field_ec.field_z = 0;
                    var49 = var12.field_ec;
                    var12.field_kc.field_rb = null;
                    var49.field_zb = 0;
                    var24 = var12.field_kc;
                    var12.field_kc.field_z = 0;
                    var24.field_zb = 0;
                    var12.field_Tb.field_rb = null;
                    var12.field_Tb.field_z = 0;
                    var25 = var12.field_Tb;
                    var12.field_Yb.field_wb = null;
                    var25.field_zb = 0;
                    var12.field_Yb.field_z = 0;
                    var26 = var12.field_Yb;
                    var26.field_zb = 0;
                    var12.field_ac.field_wb = null;
                    var27 = var12.field_ac;
                    var12.field_ac.field_z = 0;
                    var12.field_hc.field_wb = null;
                    var27.field_zb = 0;
                    var28 = var12.field_hc;
                    var12.field_hc.field_z = 0;
                    var28.field_zb = 0;
                    var12.field_pc.field_wb = null;
                    var29 = var12.field_pc;
                    var12.field_pc.field_z = 0;
                    var29.field_zb = 0;
                    var12.field_Rb.field_wb = null;
                    var12.field_Rb.field_z = 0;
                    var30 = var12.field_Rb;
                    var30.field_zb = 0;
                    var12.field_zb = ek.field_H.field_Gb.field_zb;
                    var31 = 0;
                    var32 = var12.field_Nb;
                    if (var12.j(2)) {
                        statePc = 145;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var12.field_Fb) {
                        statePc = 54;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var12.field_Ob) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!var12.field_lc) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var12.field_oc.field_wb = ak.field_c;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (!var12.field_Mb) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12.field_Kb.field_wb = bf.field_j;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var12.field_Kb.field_wb = kn.field_c;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var12.field_Sb >= 0) {
                        statePc = 66;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (!var12.field_Wb) {
                        statePc = 61;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var12.field_Ob) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (!var12.field_lc) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var12.field_oc.field_wb = ak.field_c;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (2 != var12.field_fc) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var12.field_oc.field_wb = ap.field_u;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var12.field_Kb.field_wb = jb.field_a;
                    if (var41 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var12.field_Kb.field_wb = ke.field_c;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (var12.field_oc.field_wb != null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var12.field_Kb.a(jk.field_f, var31, 68, 0, -3344);
                    if (var41 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var12.field_oc.a(jk.field_f, var31, 68, 0, -3344);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var12.field_Gb.field_wb = fm.a(var12.field_Gb.field_yb, var32, 78);
                    var12.field_Gb.a(jk.field_f, var31, 78, 70, -3344);
                    if (!var12.field_Gb.field_L) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (!var12.field_Gb.field_wb.equals(var32)) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ui.field_j = var32;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var12.field_Ib.field_wb = Integer.toString(var12.field_cc);
                    if (var12.field_Wb) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var12.field_Ib.field_R = 1;
                    var12.field_Ib.a(jk.field_f, var31, 48, 150, -3344);
                    if (var41 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var12.field_Ib.field_R = 2;
                    var12.field_gc.field_wb = "/" + var12.field_mc;
                    var33_int = (348 - var12.field_gc.field_yb.a("/")) / 2;
                    var12.field_Ib.a(jk.field_f, var31, -150 + var33_int, 150, -3344);
                    var12.field_gc.a(jk.field_f, var31, 198 - var33_int, var33_int, -3344);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var12.field_Lb.field_wb = Integer.toString(var12.field_Ub);
                    var12.field_Lb.a(jk.field_f, var31, 48, 200, -3344);
                    if (tb.field_u) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = 200;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = 250;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var33_int = stackIn_82_0;
                    var12.field_jc.a(jk.field_f, var31, -var33_int + 365 + -2, var33_int, -3344);
                    var34_int = ed.field_c;
                    if ((var14 & 1 << jq.field_f) == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var50_ref = qp.field_u[var12.field_Pb];
                    var12.field_Xb.field_rb = var50_ref;
                    var12.field_Xb.a(var12.field_jc.field_z, 0, var50_ref.field_z, var34_int, -3344);
                    var34_int = var34_int + (ed.field_c + var50_ref.field_z);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (0 == (var14 & 1 << ho.field_l)) {
                        statePc = 94;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var12.field_Ob) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (!var12.field_lc) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_90_0 = 1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var36 = stackIn_90_0;
                    stackIn_92_0 = na.field_G;
                    stackIn_91_0 = stackIn_92_0;
                    if (var36 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_93_0 = (ja[]) ((Object) stackIn_91_0);
                    stackIn_93_1 = 1;
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = (ja[]) ((Object) stackIn_92_0);
                    stackIn_93_1 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var51_ref = stackIn_93_0[stackIn_93_1];
                    var12.field_kc.field_rb = var51_ref;
                    var12.field_kc.a(var12.field_jc.field_z, 0, var51_ref.field_z, var34_int, -3344);
                    var34_int = var34_int + (ed.field_c + var51_ref.field_z);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (0 != (1 << el.field_M & var14)) {
                        statePc = 96;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var52_ref = we.field_j[var12.field_fc + -1];
                    var12.field_Tb.field_rb = var52_ref;
                    var12.field_Tb.a(var12.field_jc.field_z, 0, var52_ref.field_z, var34_int, -3344);
                    var34_int = var34_int + (ed.field_c + var52_ref.field_z);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (-1 != (1 << ti.field_J & var14 ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = ke.field_i;
                    stackIn_100_0 = stackIn_101_0;
                    if (!var12.field_dc) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_102_0 = (ja[]) ((Object) stackIn_100_0);
                    stackIn_102_1 = 1;
                    statePc = 102;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = (ja[]) ((Object) stackIn_101_0);
                    stackIn_102_1 = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var53_ref = stackIn_102_0[stackIn_102_1];
                    var12.field_ec.field_rb = var53_ref;
                    var12.field_ec.a(var12.field_jc.field_z, 0, var53_ref.field_z, var34_int, -3344);
                    var34_int = var34_int + (var53_ref.field_z - -ed.field_c);
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = null;
                    stackIn_104_1 = um.field_g;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (stackIn_104_0 != stackIn_104_1) {
                        statePc = 106;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var36 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (kj.field_h <= var36) {
                        statePc = 117;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_104_0 = null;
                    stackIn_109_0 = stackIn_104_0;
                    stackIn_104_1 = um.field_g;
                    stackIn_109_1 = stackIn_104_1;
                    if (var41 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 != stackIn_109_1[var36]) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var41 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (0 != (var14 & 1 << vm.field_ib - -var36)) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var41 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var42 = um.field_g[var36][255 & var12.field_Zb[var36]];
                    var54 = var42;
                    var12.field_Qb[var36].field_rb = var42;
                    var12.field_Qb[var36].a(var12.field_jc.field_z, 0, var54.field_z, var34_int, -3344);
                    var34_int = var34_int + (ed.field_c + var54.field_z);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var36++;
                    if (var41 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var36 = (var12.field_jc.field_zb - var34_int) / 2;
                    if (var36 <= 0) {
                        statePc = 123;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var12.field_Xb.field_x = var12.field_Xb.field_x + var36;
                    var12.field_kc.field_x = var12.field_kc.field_x + var36;
                    var12.field_Tb.field_x = var12.field_Tb.field_x + var36;
                    var12.field_ec.field_x = var12.field_ec.field_x + var36;
                    var37_int = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (kj.field_h <= var37_int) {
                        statePc = 123;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    dupTemp$0 = var12.field_Qb[var37_int];
                    dupTemp$0.field_x = dupTemp$0.field_x + var36;
                    var37_int++;
                    if (var41 != 0) {
                        statePc = 126;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var41 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var12.field_Fb) {
                        statePc = 125;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var37_int = var12.field_Sb;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (var37_int < 0) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var37_int = (int)(var9 + -var12.field_qc);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    var38_int = var37_int / 1000;
                    var39 = var38_int / 60;
                    var38_int = var38_int % 60;
                    if (60 > var39) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var40 = var39 / 60;
                    var39 = var39 % 60;
                    var12.field_Yb.field_wb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                    if (var41 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var12.field_Yb.field_wb = var39 + ":" + var38_int / 10 + var38_int % 10;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var12.field_Yb.a(jk.field_f, var31, var12.field_zb - 365, 365, -3344);
                    var31 = var31 + jk.field_f;
                    if (null != var12.field_bc) {
                        statePc = 134;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var31 += 2;
                    var37 = new StringBuilder(64);
                    discarded$1 = var37.append(ko.field_k);
                    discarded$2 = var37.append(var12.field_bc[0]);
                    var38_int = 1;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (var12.field_cc <= var38_int) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    discarded$3 = var37.append(", ");
                    discarded$4 = var37.append(var12.field_bc[var38_int]);
                    var38_int++;
                    if (var41 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var41 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var38 = var37.toString();
                    var12.field_ac.field_wb = var38;
                    var39 = var12.field_ac.field_yb.b(var38, -(2 * var12.field_ac.field_V) + var12.field_zb);
                    var12.field_ac.a(var39 * jk.field_f, var31, var12.field_zb, 0, -3344);
                    var31 = var31 + jk.field_f * var39;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (!var12.field_lc) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var12.field_hc.field_wb = vl.a(hj.field_b, new String[]{var32}, 2);
                    var12.field_hc.a(jk.field_f, var31, var12.field_zb - 2 * nj.field_h, nj.field_h, -3344);
                    var31 = var31 + jk.field_f;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (var12.field_rc) {
                        statePc = 144;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var12.field_pc.field_wb = vl.a(be.field_k, new String[]{var32}, 2);
                    var12.field_pc.a(jk.field_f, var31, var12.field_zb + -(nj.field_h * 2), nj.field_h, -3344);
                    var31 = var31 + jk.field_f;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    var33 = hd.a(var12.field_Vb, var32, -9);
                    var34 = var33;
                    var34 = var33;
                    if (var33 == null) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var34_int = var12.field_Rb.field_yb.b(var33, -nj.field_h + (var12.field_zb - nj.field_h));
                    var12.field_Rb.field_Y = var12.field_Jb * 256 / so.field_r;
                    var12.field_Rb.field_wb = var33;
                    var12.field_Rb.a(var34_int * jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
                    var31 = var31 + var34_int * jk.field_f;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var7_int != 0) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var12.field_I = var31 + -var12.field_z;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var13 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    ek.field_H.field_Gb.a(2, var12, 1300, (cj) (var11));
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var34_int = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if ((kj.field_h ^ -1) >= (var34_int ^ -1)) {
                        statePc = 166;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackIn_167_0 = var12.field_Qb[var34_int].field_L;
                    stackIn_154_0 = stackIn_167_0;
                    if (var41 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (stackIn_154_0) {
                        statePc = 156;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (kp.field_n == null) {
                        statePc = 160;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (kp.field_n[var34_int] != null) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var35 = null;
                    statePc = 161;
                    continue stateLoop;
                }
                case 159: {
                    var35 = kp.field_n[var34_int][var12.field_Zb[var34_int] & 255];
                    statePc = 161;
                    continue stateLoop;
                }
                case 160: {
                    var35 = null;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (var35 == null) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    ui.field_j = cf.field_f[var34_int] + " - " + (String) (var35);
                    if (var41 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    ui.field_j = cf.field_f[var34_int];
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var34_int++;
                    if (var41 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackIn_167_0 = var12.field_Xb.field_L;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (!stackIn_167_0) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (-2 != (var12.field_Pb ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var34 = cb.field_g;
                    statePc = 171;
                    continue stateLoop;
                }
                case 170: {
                    var34 = t.field_c[var12.field_Pb];
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    ui.field_j = vc.field_h + " - " + var34;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (var12.field_ec.field_L) {
                        statePc = 174;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (!var12.field_dc) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackIn_177_0 = mk.field_l;
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = hp.field_m;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    ui.field_j = stackIn_177_0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (!var12.field_kc.field_L) {
                        statePc = 187;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var12.field_Ob) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (!var12.field_lc) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackIn_186_0 = bk.field_j;
                    statePc = 186;
                    continue stateLoop;
                }
                case 183: {
                    if (var12.field_Wb) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_186_0 = lb.field_b;
                    statePc = 186;
                    continue stateLoop;
                }
                case 185: {
                    stackIn_186_0 = hp.field_i;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    ui.field_j = stackIn_186_0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (!var12.field_Tb.field_L) {
                        statePc = 192;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var12.field_fc == 2) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_191_0 = qd.field_E;
                    statePc = 191;
                    continue stateLoop;
                }
                case 190: {
                    stackIn_191_0 = oe.field_a;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    ui.field_j = stackIn_191_0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (0 == var12.field_T) {
                        statePc = 206;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (!var12.j(2)) {
                        statePc = 195;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (0 != var12.field_oc.field_T) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    qm.a(var12, param0, var32, -123);
                    if (var41 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (!var12.field_Fb) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (!var12.field_Wb) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var12.field_Ob) {
                        statePc = 203;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (!var12.field_lc) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    pl.a(param3, (byte) 92, var12.i(6));
                    if (var41 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    kk.a(-108, var12.i(6), param3);
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var12 = (jh) ((Object) var8.b(6));
                    if (var41 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackIn_208_0 = param1;
                    stackIn_208_1 = 111;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (stackIn_208_0 >= stackIn_208_1) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackIn_210_0 = null;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    field_M = (String) ((Object) stackIn_210_0);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                og.b(-87, 110);
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (1 >= param2) {
                    break L4;
                  } else {
                    stackIn_11_0 = param2 & 1 ^ -1;

                    stackIn_11_1 = -1;

                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_11_0 != stackIn_11_1) {
                          var3_int = var3_int * param0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      param0 = param0 * param0;
                      param2 = param2 >> 1;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_11_0 = param2;
                stackIn_11_1 = 1;
                break L3;
              }
              if (stackIn_11_0 != stackIn_11_1) {
                stackIn_15_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_13_0 = param0 * var3_int;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "og.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        L0: {
          if (param2 <= -114) {
            break L0;
          } else {
            og.a(96, -108, -22);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = this.field_G >> 690195632;
            var5 = this.field_E >> 445340176;
            if (param1 >= 24 + (var4 + -7)) {
              break L2;
            } else {
              if (7 + (var4 + -24) >= param1) {
                break L2;
              } else {
                if ((param0 ^ -1) >= (5 + (-48 + var5) ^ -1)) {
                  break L2;
                } else {
                  if ((var5 + 2 ^ -1) >= (param0 ^ -1)) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        hk.field_a = true;
        if (param0 != 0) {
            return;
        }
        try {
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            dc.a(var4, param1, var2, -100, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "og.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = "Return to game";
        field_M = "Creating your account";
        field_P = "You could learn more about humans.";
        field_S = "Fast";
        field_N = true;
    }
}
