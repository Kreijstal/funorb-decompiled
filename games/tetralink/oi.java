/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi {
    int field_k;
    static String field_g;
    int field_b;
    int field_h;
    int field_d;
    int field_j;
    int field_f;
    static oh field_e;
    static int field_m;
    static ie field_l;
    static int field_c;
    static String field_i;
    static int[] field_n;
    static jb field_a;

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ie.field_l.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (in.a(18, param1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            if (param0 < -36) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            oi.a(90);
                            return;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        fk.a(-41, (Throwable) null, "MGR1: " + param1);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
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

    abstract void a(int param0, int param1);

    final static void a(byte param0, int param1) {
        bc var2 = null;
        var2 = nd.field_Lb;
        if (param0 != 126) {
          field_n = null;
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        } else {
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = null;
        field_n = null;
        if (param0 >= -22) {
            field_c = -30;
        }
    }

    final static cn a(Throwable param0, String param1) {
        cn var2_ref = null;
        cn var2 = null;
        if (!(param0 instanceof cn)) {
            var2 = new cn(param0, param1);
        } else {
            var2_ref = (cn) (Object) param0;
            var2_ref.field_d = var2_ref.field_d + 32 + param1;
        }
        return var2_ref;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "to keep fullscreen or";
        field_e = new oh(270, 70);
        field_i = "You are offering an unrated rematch.";
        field_n = new int[256];
    }
}
