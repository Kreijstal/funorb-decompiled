/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rob extends rqa {
    static byte[] field_o;
    static String field_p;
    static llb field_q;

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        ds var9 = null;
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
                    var9 = new ds(param1);
                    var3 = var9.e((byte) -93);
                    var4 = var9.h(38);
                    if (var4 < param0) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (ph.field_o == 0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var4 > ph.field_o) {
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
                    if (0 != var3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(0, var16, (byte) -59, var4);
                    return var5_ref_byte__;
                }
                case 7: {
                    var5 = var9.h(119);
                    if (-1 < (var5 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (ph.field_o == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5 <= ph.field_o) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    throw new RuntimeException();
                }
                case 12: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 != var3) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    int discarded$4 = cv.a(var17, var5, param1, var4, 9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 14: {
                    var7 = (Object) (Object) oaa.field_h;
                    // monitorenter oaa.field_h
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        oaa.field_h.a(20773, var17, var9);
                        // monitorexit var7
                        statePc = 19;
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
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
        }
        return new nc((Object) (Object) frb.a(194, 127));
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 >= -22) {
            field_p = null;
        }
    }

    final static String a(int param0, int[] param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        byte[] var5 = new byte[1 + param1.length];
        byte[] var2 = var5;
        var5[0] = tcb.field_p;
        for (var3 = 0; var3 < param1.length; var3++) {
            var5[var3 + 1] = (byte)param1[var3];
        }
        if (param0 != 65535) {
            return null;
        }
        return fb.a(var2, (byte) -116);
    }

    rob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var2 = 0;
        field_o = new byte[32896];
        int var0 = 0;
        for (var1 = 0; -257 < (var1 ^ -1); var1++) {
            for (var2 = 0; var1 >= var2; var2++) {
                var0++;
                field_o[var0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + var1 * var1 + var2 * var2) / 65535.0f)));
            }
        }
        field_p = "DESTROY THE DRONES";
    }
}
