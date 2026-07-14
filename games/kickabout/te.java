/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int[] field_a;
    static String field_b;

    final static void a(boolean param0, String param1) {
        lh.field_A = param1;
        if (!param0) {
            ut[] discarded$0 = te.a(-69, -48, -126, true, -8);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = null;
        }
    }

    final static void a(int param0, ii param1, byte param2) {
        ml var5 = or.field_d;
        var5.b(param0, (byte) 114);
        var5.field_n = var5.field_n + 1;
        int var4 = var5.field_n;
        var5.a(107, 1);
        var5.a(param2 ^ -4, param1.field_g);
        var5.a(param2 ^ -22, param1.field_f);
        var5.b(-121, param1.field_e);
        var5.b(-40, param1.field_k);
        var5.b(-62, param1.field_i);
        var5.b(-91, param1.field_j);
        if (param2 != -112) {
            field_b = null;
        }
        int discarded$0 = var5.a(var4, false);
        var5.c(62, var5.field_n - var4);
    }

    final static ut[] a(int param0, int param1, int param2, boolean param3, int param4) {
        ut[] var6 = new ut[9];
        ut[] var5 = var6;
        if (param3) {
            return null;
        }
        var6[6] = lh.a(param4, (byte) -96, param0);
        var5[3] = lh.a(param4, (byte) -96, param0);
        var5[2] = lh.a(param4, (byte) -96, param0);
        var5[1] = lh.a(param4, (byte) -96, param0);
        var5[0] = lh.a(param4, (byte) -96, param0);
        var6[8] = lh.a(param2, (byte) -96, param0);
        var5[7] = lh.a(param2, (byte) -96, param0);
        var5[5] = lh.a(param2, (byte) -96, param0);
        if (!(param1 == 0)) {
            var6[4] = lh.a(param1, (byte) -96, 64);
        }
        return var5;
    }

    final static bb a(int param0, hd param1, int[] param2, hd param3, hd param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        bb[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        bg var11 = null;
        int var12 = 0;
        Object var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Kickabout.field_G;
                    var5 = param2.length;
                    var6 = new String[var5];
                    var15 = new char[var5];
                    var14 = var15;
                    var7 = var14;
                    var8 = new bb[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10_int >= var5) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = lm.field_j.a(119, param2[var10_int]);
                        var6[var10_int] = var11.g((byte) -79);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 6: {
                    if (param0 < -91) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13 = null;
                    bb discarded$1 = te.a(-59, (hd) null, (int[]) null, (hd) null, (hd) null);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return new bb(0L, param1, param4, param3, var8, param2, var6, var15);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, boolean param5, int param6, boolean param7, int param8, boolean param9, int param10, boolean param11) {
        if (param1 > -64) {
            Object var13 = null;
            te.a(80, (ii) null, (byte) -28);
        }
        gm.a(-79, param4, param5, 16777215, param2, param8, param9, 16777215, param6, param3, param11, param7, param10, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{250, 660, 1050, 1050};
        field_b = "Waiting for fonts";
    }
}
