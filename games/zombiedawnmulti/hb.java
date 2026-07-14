/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static String[] field_b;
    static String field_a;

    final static void b(int param0) {
        lk.g((byte) 89);
        kf.a(2, wp.field_j[0].field_z, nj.field_h, qa.field_o, jo.field_f, jk.field_f);
        if (param0 <= 31) {
            field_a = null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        k var9 = null;
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
                    var9 = new k(param0);
                    var3 = var9.g(31365);
                    var4 = var9.i(param1 ^ -1478490344);
                    if (-1 < var4) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == qo.field_u) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (qo.field_u >= var4) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (var3 == param1) {
                        statePc = 19;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5_int = var9.i(-1478490344);
                    if (0 > var5_int) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 == qo.field_u) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (qo.field_u >= var5_int) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    throw new RuntimeException();
                }
                case 11: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = (Object) (Object) hg.field_wb;
                    // monitorenter hg.field_wb
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        hg.field_wb.a(var16, var9, param1 + 27);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var8;
                }
                case 17: {
                    int discarded$1 = wo.a(var16, var5_int, param0, var4, 9);
                    return var6;
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(0, param1 ^ -6351, var4, var17);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            hb.b(87);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        hd.field_s = new fe();
        wj.field_i.a((cf) (Object) hd.field_s, (byte) 121);
        if (param0 != 0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "";
    }
}
