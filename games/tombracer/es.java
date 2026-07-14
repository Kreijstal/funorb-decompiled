/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends ip {
    private long field_e;
    private long[] field_i;
    static int[] field_h;
    private int field_g;
    private int field_c;
    private long field_f;
    private long field_d;

    final void a(int param0) {
        if (!((((es) this).field_d ^ -1L) <= (((es) this).field_f ^ -1L))) {
            ((es) this).field_d = ((es) this).field_d + (-((es) this).field_d + ((es) this).field_f);
        }
        ((es) this).field_e = 0L;
        if (param0 <= 100) {
            boolean discarded$0 = es.a(false);
        }
    }

    final int a(long param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != 0) {
            return 57;
        }
        if (((es) this).field_d < ((es) this).field_f) {
            ((es) this).field_e = ((es) this).field_e + (((es) this).field_f - ((es) this).field_d);
            ((es) this).field_d = ((es) this).field_d + (-((es) this).field_d + ((es) this).field_f);
            ((es) this).field_f = ((es) this).field_f + param0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            ((es) this).field_f = ((es) this).field_f + param0;
            // if_icmpge L118
        } while ((((es) this).field_f ^ -1L) > (((es) this).field_d ^ -1L));
        if (!(((es) this).field_f >= ((es) this).field_d)) {
            ((es) this).field_f = ((es) this).field_d;
        }
        return var4;
    }

    final long a(byte param0) {
        ((es) this).field_d = ((es) this).field_d + this.d(-97);
        if (param0 < 27) {
            boolean discarded$0 = es.a(false);
        }
        if ((((es) this).field_f ^ -1L) < (((es) this).field_d ^ -1L)) {
            return (-((es) this).field_d + ((es) this).field_f) / 1000000L;
        }
        return 0L;
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_h = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) nfa.field_n;
                    // monitorenter nfa.field_n
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (vha.field_b == nt.field_a) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        fna.field_h = dl.field_o[vha.field_b];
                        kda.field_td = uk.field_O[vha.field_b];
                        vha.field_b = 1 + vha.field_b & 127;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 + -((es) this).field_e;
        ((es) this).field_e = var2;
        if (-5000000000L < var4) {
            if ((var4 ^ -1L) > -5000000001L) {
                ((es) this).field_i[((es) this).field_g] = var4;
                ((es) this).field_g = (((es) this).field_g + 1) % 10;
                if (!(1 <= ((es) this).field_c)) {
                    ((es) this).field_c = ((es) this).field_c + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0 > 0) {
            ((es) this).field_i = null;
        }
        for (var8 = 1; var8 <= ((es) this).field_c; var8++) {
            var6 = var6 + ((es) this).field_i[(-var8 + ((es) this).field_g + 10) % 10];
        }
        return var6 / (long)((es) this).field_c;
    }

    public static void c(int param0) {
        int var1 = 118 % ((-58 - param0) / 32);
        field_h = null;
    }

    final static jua a(byte param0, boolean param1) {
        int var3 = -49 / ((-41 - param0) / 63);
        jua var2 = new jua(true);
        var2.field_a = param1 ? true : false;
        return var2;
    }

    es() {
        ((es) this).field_g = 0;
        ((es) this).field_i = new long[10];
        ((es) this).field_e = 0L;
        ((es) this).field_c = 1;
        ((es) this).field_f = 0L;
        ((es) this).field_d = 0L;
        ((es) this).field_d = System.nanoTime();
        ((es) this).field_f = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{85, 130, 220, 340, 440, 520, 520};
    }
}
