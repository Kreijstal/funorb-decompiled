/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gpa {
    static int field_b;
    private boolean field_c;
    static ft field_a;
    int field_d;

    final static void a(int param0) {
        rg.a((byte) -114);
        oo.a(vda.field_m[0].field_n, (byte) -104, mna.field_d, io.field_a, wg.field_i, di.field_a);
        if (param0 < 50) {
            gpa.a(76);
        }
    }

    final boolean b(int param0) {
        if (param0 != 59) {
            field_b = 33;
        }
        return ((gpa) this).field_c;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    public final String toString() {
        return "SwitchableID: " + ((gpa) this).field_d + " dud: " + ((gpa) this).field_c;
    }

    gpa(int param0) {
        ((gpa) this).field_d = param0;
    }

    final static ata a(int param0, uia param1) {
        if (param0 != 4) {
            gpa.a(true);
        }
        return new ata(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32772), param1.a(-32768), param1.h(255));
    }

    final int a(byte param0) {
        if (param0 < 13) {
            return 49;
        }
        return ((gpa) this).field_d;
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            int var3 = 0;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TombRacer.field_G ? 1 : 0;
                        if (hpa.field_f) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var3 = 46 / ((param0 - 67) / 33);
                            var2 = "tuhstatbut";
                            var4 = (String) lb.b(param1, 2864, "getcookies");
                            var5 = rga.a(32287, var4, ';');
                            var6 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
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
        field_a = new ft(4);
    }
}
