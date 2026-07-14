/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            byte[] discarded$0 = qk.a(29, (byte[]) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6_ref_byte__ = null;
        int var6 = 0;
        byte[] var7 = null;
        Object var8 = null;
        Throwable var9 = null;
        wf var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = new wf(param1);
                    var3 = var10.d(true);
                    var4 = var10.d((byte) 19);
                    var5 = -48 % ((-21 - param0) / 59);
                    if (var4 < 0) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == jd.field_a) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (jd.field_a < var4) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (-1 != var3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6_ref_byte__ = var11;
                    var10.a(105, var4, 0, var17);
                    return var6_ref_byte__;
                }
                case 7: {
                    var6 = var10.d((byte) 19);
                    if (var6 < 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-1 == (jd.field_a ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (jd.field_a < var6) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    throw new RuntimeException();
                }
                case 12: {
                    var18 = new byte[var6];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if (var3 == 1) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8 = (Object) (Object) al.field_F;
                    // monitorenter al.field_F
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        al.field_F.a(8, var18, var10);
                        // monitorexit var8
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = caughtException;
                        // monitorexit var8
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var9;
                }
                case 18: {
                    int discarded$1 = ic.a(var18, var6, param1, var4, 9);
                    return var7;
                }
                case 19: {
                    return var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 != 0) {
            return 118;
        }
        return ka.a(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading...";
        field_b = "Unpacking sound effects";
    }
}
