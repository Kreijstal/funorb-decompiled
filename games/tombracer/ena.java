/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends od {
    private byte[][] field_m;
    private int field_k;
    static vs field_p;
    static jpa field_l;
    rq[] field_o;
    static volatile int field_n;

    final boolean a(byte param0) {
        Object var2_ref = null;
        Object var2_ref_Object = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Throwable var5_ref_Throwable = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object var7_ref = null;
        Throwable var8_ref_Throwable = null;
        int var8 = 0;
        Throwable var9 = null;
        nk var9_ref = null;
        Object var10 = null;
        nk var10_ref = null;
        Object var10_ref2 = null;
        Throwable var11 = null;
        int var12 = 0;
        uia var15 = null;
        uia var18 = null;
        vna var19 = null;
        int[] var28 = null;
        byte[] var29 = null;
        int[] var30 = null;
        byte[] var31 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    if (null != ((ena) this).field_o) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (null != ((ena) this).field_m) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2_ref_Object = (Object) (Object) dk.field_c;
                    // monitorenter dk.field_c
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (dk.field_c.e(((ena) this).field_k, param0 ^ -107)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var2_ref_Object
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var28 = dk.field_c.d(param0 + -216, ((ena) this).field_k);
                        ((ena) this).field_m = new byte[var28.length][];
                        var4 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var28.length <= var4) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ena) this).field_m[var4] = dk.field_c.a(false, ((ena) this).field_k, var28[var4]);
                        var4++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var2_ref_Object
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_ref_Throwable = caughtException;
                        // monitorexit var2_ref_Object
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var5_ref_Throwable;
                }
                case 15: {
                    if (param0 == 107) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((ena) this).field_k = 87;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var2 = 1;
                    var3 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var3 >= ((ena) this).field_m.length) {
                        statePc = 25;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var29 = ((ena) this).field_m[var3];
                    var15 = new uia(var29);
                    var15.field_h = 1;
                    var6 = var15.d(124);
                    var7_ref = (Object) (Object) jma.field_j;
                    // monitorenter jma.field_j
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var2 = var2 != 0 & jma.field_j.a(param0 ^ -15228, var6) ? 1 : 0;
                        // monitorexit var7_ref
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8_ref_Throwable = caughtException;
                        // monitorexit var7_ref
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) var8_ref_Throwable;
                }
                case 24: {
                    var3++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 25: {
                    if (var2 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return false;
                }
                case 28: {
                    var19 = new vna();
                    var5_ref_Object = (Object) (Object) dk.field_c;
                    // monitorenter dk.field_c
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        var6 = dk.field_c.a((byte) -117, ((ena) this).field_k);
                        ((ena) this).field_o = new rq[var6];
                        var30 = dk.field_c.d(-79, ((ena) this).field_k);
                        // monitorexit var5_ref_Object
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = caughtException;
                        // monitorexit var5_ref_Object
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) var9;
                }
                case 33: {
                    var5 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var30.length <= var5) {
                        statePc = 50;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var31 = ((ena) this).field_m[var5];
                    var18 = new uia(var31);
                    var18.field_h = 1;
                    var8 = var18.d(param0 + 18);
                    var9 = null;
                    var10_ref = (nk) (Object) var19.f(-80);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var10_ref == null) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var10_ref.field_l == var8) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var9_ref = var10_ref;
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    var10_ref = (nk) (Object) var19.e(param0 + 4);
                    statePc = 36;
                    continue stateLoop;
                }
                case 41: {
                    if (var9_ref == null) {
                        statePc = 43;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var10_ref2 = (Object) (Object) jma.field_j;
                    // monitorenter jma.field_j
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        var9_ref = new nk(var8, jma.field_j.f(var8, -93));
                        // monitorexit var10_ref2
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = caughtException;
                        // monitorexit var10_ref2
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 47: {
                    throw (RuntimeException) (Object) var11;
                }
                case 48: {
                    var19.b((byte) -124, (vg) (Object) var9_ref);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    ((ena) this).field_o[var30[var5]] = new rq(var31, var9_ref);
                    var5++;
                    statePc = 34;
                    continue stateLoop;
                }
                case 50: {
                    ((ena) this).field_m = null;
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        field_l = null;
        if (!param0) {
            ena.a(false);
        }
    }

    ena(int param0) {
        ((ena) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
    }
}
