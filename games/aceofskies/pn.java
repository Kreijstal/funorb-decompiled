/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn implements Runnable {
    rk field_f;
    static int field_d;
    volatile boolean field_e;
    volatile boolean field_a;
    static long[] field_b;
    volatile tk[] field_c;

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        rb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (byte[]) null;
                }
                case 2: {
                    var9 = new rb(param0);
                    var3 = var9.g(-123);
                    var4 = var9.a((byte) 113);
                    if (var4 > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == kk.field_K) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > kk.field_K) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == var3) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.a((byte) 110);
                    if (-1 < (var5_int ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (kk.field_K == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5_int > kk.field_K) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (var3 == 1) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = (Object) (Object) vg.field_h;
                    // monitorenter vg.field_h
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        vg.field_h.a(var16, 10, var9);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) var8;
                }
                case 19: {
                    int discarded$1 = on.a(var16, var5_int, param0, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(0, param1 + 7186, var4, var17);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 9) {
            field_d = 33;
        }
        field_b = null;
    }

    public final void run() {
        int var1_int = 0;
        tk var2 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ((pn) this).field_e = true;
        try {
            while (!((pn) this).field_a) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = ((pn) this).field_c[var1_int];
                    if (var2 != null) {
                        var2.h();
                    }
                }
                wf.a(10L, false);
                rb.a(5, (Object) null, ((pn) this).field_f);
            }
        } catch (Exception exception) {
            String var5 = (String) null;
            v.a((String) null, (byte) -52, (Throwable) (Object) exception);
        } finally {
            ((pn) this).field_e = false;
        }
    }

    final static ak a(Throwable param0, String param1) {
        ak var2_ref = null;
        ak var2 = null;
        if (!(param0 instanceof ak)) {
            var2 = new ak(param0, param1);
        } else {
            var2_ref = (ak) param0;
            var2_ref.field_a = var2_ref.field_a + 32 + param1;
        }
        return var2_ref;
    }

    final static void a(oc param0, byte param1, int param2) {
        ci.field_j.a(77, (wf) (Object) param0);
        if (param1 > -70) {
            field_b = (long[]) null;
        }
        ac.a(param2, 0, param0);
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = gi.field_i[0];
        if (!param0) {
            return;
        }
        for (var2 = 1; var2 < gi.field_i.length; var2++) {
            var3 = gi.field_i[var2];
            au.a(jr.field_n, var2 << 2044675652, jr.field_n, var1, var3);
            var1 = var1 + var3;
        }
    }

    pn() {
        ((pn) this).field_c = new tk[2];
        ((pn) this).field_a = false;
        ((pn) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = new long[32];
    }
}
