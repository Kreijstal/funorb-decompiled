/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gma {
    int field_b;
    short field_g;
    boolean field_f;
    boolean field_d;
    static si[] field_e;
    boolean field_a;
    static int[][] field_c;

    public static void a(int param0) {
        if (param0 != -5377) {
            gma.b(117);
            field_e = null;
            field_c = null;
            return;
        }
        field_e = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        eha.c(false);
        uka.field_j = param0 ? true : false;
        gfa.field_i = true;
        gja.field_m.f((byte) -66);
        uv.a(false, hla.field_r, false);
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != vg.field_n) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (param0 <= 44) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        ig.field_m.field_g = ig.field_m.field_g + 24;
                        return;
                    }
                    case 3: {
                        return;
                    }
                    case 5: {
                        try {
                            vg.field_n.a(0L, (byte) -108);
                            vg.field_n.a(-96, ig.field_m.field_g, ig.field_m.field_h, 24);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        if (param0 <= 44) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ig.field_m.field_g = ig.field_m.field_g + 24;
                        return;
                    }
                    case 8: {
                        return;
                    }
                    case 10: {
                        var1 = (Exception) (Object) caughtException;
                        if (param0 <= 44) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ig.field_m.field_g = ig.field_m.field_g + 24;
                        return;
                    }
                    case 12: {
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

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            if (param1) {
                field_c = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(ow.a(var2, (byte) -125, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new si[8];
    }
}
