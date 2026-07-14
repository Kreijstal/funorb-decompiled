/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class el {
    static rn field_e;
    static int[][] field_f;
    static int field_c;
    static String field_a;
    static sn[] field_b;
    static int field_d;

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -105) {
            return;
        }
        for (var5 = 0; var5 < am.field_K.length; var5++) {
            param4 = am.field_K[var5];
            var6 = var5 << 873662084;
            while (true) {
                param4--;
                if (-1 == (param4 ^ -1)) {
                    break;
                }
                var6++;
                param3 = ab.field_c[var6];
                param2[param1[param3]] = param2[param1[param3]] + 1;
                ab.field_c[param2[param1[param3]]] = param3;
            }
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static byte[] a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        vh var9 = null;
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
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = 69;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = new vh(param1);
                    var3 = var9.k(0);
                    var4 = var9.i(1);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (ag.field_P == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > ag.field_P) {
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
                    if (0 == var3) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.i(1);
                    if (var5_int > -1) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == ag.field_P) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (ag.field_P >= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
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
                    if (1 != var3) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$4 = pb.a(var16, var5_int, param1, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) ph.field_c;
                    // monitorenter ph.field_c
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        ph.field_c.a((byte) -71, var9, var16);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
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
                    var9.a(0, var4, 0, var17);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 != -8834) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[][]{new int[22], new int[38], new int[38], new int[18], new int[28], new int[50]};
        field_a = "Rankings";
        field_e = new rn();
        field_b = new sn[9];
    }
}
