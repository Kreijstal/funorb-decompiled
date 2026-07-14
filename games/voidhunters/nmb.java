/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nmb extends hrb {
    private long[] field_f;
    private long field_e;
    private long field_d;
    private long field_g;
    private int field_c;
    private int field_h;

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (param0 != 0) {
            return 1;
        }
        if ((((nmb) this).field_g ^ -1L) <= (((nmb) this).field_e ^ -1L)) {
            var4 = 0;
            do {
                var4++;
                ((nmb) this).field_e = ((nmb) this).field_e + param1;
                // if_icmpge L66
            } while (((nmb) this).field_g > ((nmb) this).field_e);
            if (((nmb) this).field_e < ((nmb) this).field_g) {
                ((nmb) this).field_e = ((nmb) this).field_g;
            }
            return var4;
        }
        ((nmb) this).field_d = ((nmb) this).field_d + (-((nmb) this).field_g + ((nmb) this).field_e);
        ((nmb) this).field_g = ((nmb) this).field_g + (-((nmb) this).field_g + ((nmb) this).field_e);
        ((nmb) this).field_e = ((nmb) this).field_e + param1;
        return 1;
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 <= -57) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (gha.field_q == null) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) gha.field_q;
                    // monitorenter gha.field_q
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        gha.field_q = null;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(byte param0) {
        ((nmb) this).field_g = ((nmb) this).field_g + this.c(-110);
        if (param0 != -81) {
            ((nmb) this).field_h = 67;
        }
        if (((nmb) this).field_g < ((nmb) this).field_e) {
            return (-((nmb) this).field_g + ((nmb) this).field_e) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, ana param1) {
        kpb.field_q.a((f) (Object) param1.field_e);
        if (param0 >= -73) {
            return;
        }
    }

    final static boolean b(int param0) {
        int var1 = 99 / ((param0 - 30) / 45);
        return wqa.field_a == lqa.field_o.field_Nb ? true : false;
    }

    nmb() {
        ((nmb) this).field_f = new long[10];
        ((nmb) this).field_g = 0L;
        ((nmb) this).field_d = 0L;
        ((nmb) this).field_e = 0L;
        ((nmb) this).field_c = 0;
        ((nmb) this).field_h = 1;
        ((nmb) this).field_g = System.nanoTime();
        ((nmb) this).field_e = System.nanoTime();
    }

    final void a(int param0) {
        if (!(((nmb) this).field_g >= ((nmb) this).field_e)) {
            ((nmb) this).field_g = ((nmb) this).field_g + (-((nmb) this).field_g + ((nmb) this).field_e);
        }
        ((nmb) this).field_d = 0L;
        if (param0 >= -78) {
            nmb.d(13);
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        long var2 = System.nanoTime();
        long var4 = var2 + -((nmb) this).field_d;
        ((nmb) this).field_d = var2;
        if (-5000000000L < var4) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                ((nmb) this).field_f[((nmb) this).field_c] = var4;
                ((nmb) this).field_c = (((nmb) this).field_c + 1) % 10;
                if ((((nmb) this).field_h ^ -1) > -2) {
                    ((nmb) this).field_h = ((nmb) this).field_h + 1;
                }
            }
        }
        if (param0 >= -71) {
            ((nmb) this).field_g = 79L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((nmb) this).field_h; var8++) {
            var6 = var6 + ((nmb) this).field_f[(10 + ((nmb) this).field_c + -var8) % 10];
        }
        return var6 / (long)((nmb) this).field_h;
    }

    static {
    }
}
