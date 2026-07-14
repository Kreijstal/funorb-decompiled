/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    boolean field_a;
    String field_f;
    String[] field_c;
    static String[] field_b;
    int field_g;
    boolean field_e;
    static hh field_d;

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -10) {
            field_b = null;
        }
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (bd.field_h == null) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            bd.field_h.a(0, 0L);
                            bd.field_h.a(true, om.field_g.field_m, om.field_g.field_g, 24);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        om.field_g.field_m = om.field_g.field_m + 24;
                        if (param0 <= -44) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        lm.a((byte) -105);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        om.field_g.field_m = om.field_g.field_m + 24;
                        if (param0 > -44) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        lm.a((byte) -105);
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

    lm(boolean param0) {
        ((lm) this).field_a = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"infracstructure_glow_asteroid", "infracstructure_glow_ice", null, "infracstructure_glow_alien", null};
    }
}
