/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ie {
    private long field_g;
    static int field_r;
    static nm field_l;
    static boolean field_k;
    private long[] field_f;
    private long field_m;
    static String field_s;
    private long field_h;
    static ck[] field_p;
    static String field_j;
    static String field_q;
    static boolean field_i;
    private int field_n;
    private int field_o;

    final int a(byte param0, long param1) {
        int var5 = client.field_A ? 1 : 0;
        if (param0 != 109) {
            return -6;
        }
        if (((dn) this).field_g < ((dn) this).field_m) {
            ((dn) this).field_h = ((dn) this).field_h + (-((dn) this).field_g + ((dn) this).field_m);
            ((dn) this).field_g = ((dn) this).field_g + (((dn) this).field_m - ((dn) this).field_g);
            ((dn) this).field_m = ((dn) this).field_m + param1;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            ((dn) this).field_m = ((dn) this).field_m + param1;
            // if_icmpge L110
        } while (((dn) this).field_m < ((dn) this).field_g);
        if (!(((dn) this).field_m >= ((dn) this).field_g)) {
            ((dn) this).field_m = ((dn) this).field_g;
        }
        return var4;
    }

    final void b(int param0) {
        if (param0 != -30693) {
            return;
        }
        ((dn) this).field_h = 0L;
        if (!(((dn) this).field_g >= ((dn) this).field_m)) {
            ((dn) this).field_g = ((dn) this).field_g + (-((dn) this).field_g + ((dn) this).field_m);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_q = null;
        field_l = null;
        field_s = null;
        field_p = null;
        if (param0 <= 65) {
            ac discarded$0 = dn.b((byte) 101);
        }
    }

    final long a(int param0) {
        ((dn) this).field_g = ((dn) this).field_g + this.c(-8325);
        if (param0 != -22962) {
            ((dn) this).field_o = 53;
        }
        if (!(((dn) this).field_g >= ((dn) this).field_m)) {
            return (-((dn) this).field_g + ((dn) this).field_m) / 1000000L;
        }
        return 0L;
    }

    final static ac b(byte param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        ac var2 = null;
        int var3 = 0;
        ac stackIn_6_0 = null;
        ac stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 25) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_j = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = oi.field_a.a(-39, var1_int);
                        if (!var2.field_D) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (ac) var2;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1 = (IllegalArgumentException) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((dn) this).field_h;
        if (param0 != -8325) {
        }
        ((dn) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (!((var4 ^ -1L) <= -5000000001L)) {
                ((dn) this).field_f[((dn) this).field_o] = var4;
                if (!(-2 >= (((dn) this).field_n ^ -1))) {
                    ((dn) this).field_n = ((dn) this).field_n + 1;
                }
                ((dn) this).field_o = (1 + ((dn) this).field_o) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((dn) this).field_n; var8++) {
            var6 = var6 + ((dn) this).field_f[(10 + (((dn) this).field_o - var8)) % 10];
        }
        return var6 / (long)((dn) this).field_n;
    }

    dn() {
        ((dn) this).field_g = 0L;
        ((dn) this).field_h = 0L;
        ((dn) this).field_f = new long[10];
        ((dn) this).field_n = 1;
        ((dn) this).field_o = 0;
        ((dn) this).field_m = 0L;
        ((dn) this).field_g = System.nanoTime();
        ((dn) this).field_m = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Service unavailable";
        field_j = "Flowers";
        field_r = 20;
        field_q = "Match 4 or more to make them disappear, like this:";
        field_p = new ck[8];
    }
}
