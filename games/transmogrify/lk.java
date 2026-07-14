/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_d;
    static boolean field_c;
    static fe field_b;
    static int[] field_e;
    static String field_a;

    final synchronized static long a(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        long var1 = System.currentTimeMillis();
        if ((var1 ^ -1L) > (cl.field_y ^ -1L)) {
            vl.field_B = vl.field_B + (cl.field_y - var1);
        }
        cl.field_y = var1;
        return var1 + vl.field_B;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 >= -15) {
            field_c = false;
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == hi.field_e) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) hi.field_e;
                    // monitorenter hi.field_e
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        hi.field_e = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    if (!param0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_d = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
        oa var10 = null;
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
                    var3 = -27 % ((param0 - 13) / 43);
                    var10 = new oa(param1);
                    var4 = var10.d((byte) 57);
                    var5 = var10.c((byte) -126);
                    if (var5 > -1) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (ll.field_R == 0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (ll.field_R < var5) {
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
                    if (-1 != var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6_ref_byte__ = var11;
                    var10.a(var5, 2, var17, 0);
                    return var6_ref_byte__;
                }
                case 7: {
                    var6 = var10.c((byte) -116);
                    if (var6 < 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (ll.field_R == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (ll.field_R >= var6) {
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
                    var18 = new byte[var6];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if (-2 == (var4 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8 = (Object) (Object) je.field_d;
                    // monitorenter je.field_d
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        je.field_d.a(var10, -115, var18);
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
                    int discarded$1 = gf.a(var18, var6, param1, var5, 9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ti a(boolean param0) {
        int var4_int = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var1 = wk.field_b[0] * ql.field_b[0];
        byte[] var2 = re.field_K[0];
        int[] var3 = new int[var1];
        if (!param0) {
            return null;
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = rg.field_D[vg.c(255, (int) var2[var4_int])];
        }
        ti var4 = new ti(pj.field_y, ll.field_U, gj.field_j[0], re.field_a[0], ql.field_b[0], wk.field_b[0], var3);
        wd.d(126);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = new int[]{396, 396, 396, 396, 336, 336, 396};
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
