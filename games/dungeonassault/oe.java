/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ne {
    pn[] field_s;
    static String field_p;
    static ph field_m;
    byte[][][] field_k;
    static int field_i;
    pn[] field_o;
    int[] field_n;
    int field_q;
    int[] field_r;
    int field_j;
    int[] field_l;

    final static void a(byte param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
            java.net.MalformedURLException malformedURLException = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!qg.field_n.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ji.a(param3, -38)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        malformedURLException = (java.net.MalformedURLException) (Object) caughtException;
                        sm.a((Throwable) null, 1, "MGR1: " + param3);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param0 <= 112) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        field_m = null;
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

    public static void a(int param0) {
        field_m = null;
        field_p = null;
        if (param0 != 0) {
            field_p = null;
        }
    }

    oe() {
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            if (param2 <= 47) {
                Object var4 = null;
                oe.a((String) null, (java.applet.Applet) null, (byte) 72);
            }
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = j.a((byte) 95, var3, param1);
                oe.a((byte) 126, true, param1, var3.toString());
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
        field_i = 0;
        field_p = "Employed by the human cities to thin out the population of orcs and goblins in the wilderness, rangers have a well-rounded set of skills and are deadly with a bow.";
    }
}
