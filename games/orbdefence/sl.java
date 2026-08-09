/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends sf {
    static int field_ab;
    static String field_Z;

    final static void a(int param0, hj param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != ((param1.field_p | (param1.field_k | param1.field_o) | param1.field_u) & 3)) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        var2_int = param1.field_o + (param1.field_p & 3);
                        var3 = param1.field_k + (param1.field_u & 3);
                        var2_int = 4 - ((var2_int & 3) - var2_int);
                        var3 = var3 + (-(var3 & 3) + 4);
                        var4 = new int[var2_int * var3];
                        var5 = 0;
                        var6 = (3 & param1.field_p) + var2_int * (3 & param1.field_u);
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= param1.field_k) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_14_0 = 0;
                        stackIn_6_0 = stackIn_14_0;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = stackIn_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1.field_o <= var8) {
                            statePc = 11;
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
                        incrementValue$0 = var6;
                        var6++;
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$0] = param1.field_v[incrementValue$1];
                        var8++;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = var6 + (var2_int - param1.field_o);
                        var7++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 0) {
                            statePc = 4;
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
                        stackIn_14_0 = param0;
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
                        if (stackIn_14_0 == 2408) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        sl.d((byte) -106);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param1.field_u = param1.field_u & -4;
                        param1.field_p = param1.field_p & -4;
                        param1.field_k = var3;
                        param1.field_o = var2_int;
                        param1.field_v = var4;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var2);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("sl.C(").append(param0).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param1 == null) {
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
                    throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_Z = null;
        if (param0 >= 118) {
            return;
        }
        hj var2 = (hj) null;
        sl.a(16, (hj) null);
    }

    final static hj[] d(byte param0) {
        hj[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int[] var13 = null;
        int[] var15 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        boolean stackIn_4_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_45_0 = 0;
        boolean stackOut_3_0;
        boolean stackOut_25_0;
        int statePc = 0;
        int var6 = 0;
        int[] var11 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    var1 = new hj[ec.field_K];
                    var2 = 0;
                    if (param0 < -82) {
                        statePc = 24;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = (hj) null;
                    sl.a(16, (hj) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var2 >= ec.field_K) {
                        statePc = 22;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = wh.field_b[var2] * m.field_a[var2];
                    var30 = fl.field_a[var2];
                    stackOut_3_0 = ha.field_g[var2];
                    stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!stackIn_4_0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var31 = md.field_i[var2];
                    var15 = new int[var3];
                    var13 = var15;
                    var6_ref_int__ = var13;
                    var7 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var7 >= var3) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var30[var7])], vi.a(-16777216, var31[var7] << 862549368));
                    var7++;
                    if (var8 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var8 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var8 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var11 = new int[var3];
                    var6 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var6 >= var3) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var11[var6] = vc.field_g[vi.a(255, (int) var30[var6])];
                    var6++;
                    if (var8 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var8 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var2++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var8 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = -127;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    md.a((byte) stackIn_23_0);
                    return var1;
                }
                case 24: {
                    if (var2 >= ec.field_K) {
                        statePc = 44;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3 = wh.field_b[var2] * m.field_a[var2];
                    var28 = fl.field_a[var2];
                    stackOut_25_0 = ha.field_g[var2];
                    stackIn_45_0 = stackOut_25_0 ? 1 : 0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var8 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!stackIn_26_0) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var29 = md.field_i[var2];
                    var15 = new int[var3];
                    var13 = var15;
                    var6_ref_int__ = var13;
                    var7 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var7 >= var3) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6_ref_int__[var7] = ge.a(vc.field_g[vi.a(255, (int) var28[var7])], vi.a(-16777216, var29[var7] << 862549368));
                    var7++;
                    if (var8 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var8 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    var1[var2] = (hj) ((Object) new ra(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var15));
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var11 = new int[var3];
                    var6 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var6 >= var3) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var11[var6] = vc.field_g[vi.a(255, (int) var28[var6])];
                    var6++;
                    if (var8 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var8 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    var1[var2] = new hj(sg.field_B, he.field_r, jd.field_g[var2], wc.field_a[var2], wh.field_b[var2], m.field_a[var2], var11);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var2++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var8 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = -127;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    md.a((byte) stackIn_45_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private sl() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
        field_ab = -1;
        field_Z = "CONGRATULATIONS!<br><br>You have managed to defeat all the Norbs thus far. To continue you must become a member!";
    }
}
