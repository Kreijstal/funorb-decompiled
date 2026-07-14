/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static bd field_e;
    static boolean field_a;
    static nc field_b;
    static boolean field_i;
    static String[] field_g;
    static long field_d;
    static String field_c;
    static ll[] field_j;
    static int[] field_h;
    static qb field_f;

    public static void a(int param0) {
        if (param0 != -1) {
            field_h = null;
        }
        field_e = null;
        field_j = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_h = null;
    }

    final static String a(boolean param0, fm param1) {
        if (param0) {
            fd.a(-96);
        }
        return rl.a(param1.field_d, 29424);
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ArcanistsMulti.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) ei.a(param1, 118, "getcookies");
                            var4 = eh.a(false, ';', var3);
                            var5 = 0;
                            var6 = -80 / ((param0 - -36) / 40);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var4[var5].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                                statePc = 7;
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
                            if (!var4[var5].substring(0, var7).trim().equals((Object) (Object) param2)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var4[var5].substring(var7 - -1).trim();
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
                        return (String) (Object) stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        return null;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = null;
        field_d = 20000000L;
        field_c = "'<col=ffffff>Z</col>' and '<col=ffffff>X</col>' move your character.<br>'<col=ffffff>N</col>' switches units.<br>'<col=ffffff>Q</col>' skips your turn.<br>'<col=ffffff>Enter</col>' and '<col=ffffff>Backspace</col>' perform a jump and a high jump, respectively.<br>Use the mouse to select targets and hold the mouse button to increase the velocity of your attacks.";
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new int[]{67, 68, 69};
    }
}
