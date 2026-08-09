/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int field_c;
    static ck[] field_d;
    static int field_f;
    static ck field_b;
    static String field_e;
    static dh[] field_i;
    static ck field_j;
    static w field_a;
    static long field_h;
    static int[] field_g;

    final static w a(int param0) {
        if (param0 > -72) {
            return (w) null;
        }
        return wf.c(-122);
    }

    final static int[] c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_8_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    if (param0 == 4) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    l.a(64);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = new int[4];
                    var1 = var4;
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var2 >= 4) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_8_0 = (int[]) (var4);
                    stackIn_5_0 = stackIn_8_0;
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_5_0[var2] = bf.field_y.nextInt();
                    var2++;
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = (int[]) (var4);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return stackIn_8_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_e = null;
        field_j = null;
        if (param0 < 118) {
            field_h = -47L;
        }
        field_i = null;
        field_b = null;
        field_d = null;
        field_g = null;
    }

    static {
        int var0 = 0;
        field_d = new ck[64];
        field_f = 0;
        field_e = "City";
        for (var0 = 0; var0 < 64; var0++) {
            field_d[var0] = new ck(9, 9);
        }
        field_h = 0L;
        field_g = new int[8];
    }
}
