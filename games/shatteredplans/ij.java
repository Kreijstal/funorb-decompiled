/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static kj field_a;

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != vc.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        sa.field_a.field_j = sa.field_a.field_j + param0;
                        return;
                    }
                    case 2: {
                        try {
                            vc.field_a.a((byte) -26, 0L);
                            vc.field_a.a(param0 + 84, 24, sa.field_a.field_j, sa.field_a.field_h);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        sa.field_a.field_j = sa.field_a.field_j + param0;
                        return;
                    }
                    case 4: {
                        var1 = (Exception) (Object) caughtException;
                        sa.field_a.field_j = sa.field_a.field_j + param0;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        ei.a(false, param4, param1, -12394, param5, param3, param0);
        if (!param2) {
            field_a = null;
        }
    }

    final static fp b(int param0) {
        int var1 = 55 / ((param0 - 37) / 59);
        return (fp) (Object) new gs();
    }

    final static qh b(byte param0) {
        tm.field_k = new qh(250, 60, 150, 186, ib.field_c.toUpperCase());
        fe var1 = new fe(-16 + (tm.field_k.field_k - -tm.field_k.field_m), tm.field_k.field_t + 2, 11, 11, -1, (bi) null, "X", 16711680);
        var1.field_h = (Object) (Object) tm.field_k;
        tm.field_k.a((vd) (Object) var1, 8);
        lp var2 = new lp(9 + tm.field_k.field_k, 20 + tm.field_k.field_t, 132, 158);
        tm.field_k.a((vd) (Object) var2, 8);
        tm.field_k.field_z = var2;
        rh var3 = new rh();
        int var4 = -110 % ((param0 - -14) / 61);
        tm.field_k.field_x = (jk) (Object) var3;
        return tm.field_k;
    }

    public static void a(byte param0) {
        if (param0 != -29) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
