/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends hl implements qm {
    static int field_m;
    private byte field_l;

    og(kda param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (param0 != -15730) {
            ((og) this).field_l = (byte) -118;
        }
        return super.a(((og) this).field_h.field_Tc, param1, 1);
    }

    final static void b(int param0) {
        if (null == dq.field_f) {
            return;
        }
        pq.a((java.awt.Canvas) (Object) dq.field_f, false);
        dq.field_f.a((byte) -34, dsa.field_c);
        dq.field_f = null;
        if (null != wba.field_o) {
            wba.field_o.a(118);
        }
        nma.field_l.requestFocus();
        if (param0 != 0) {
            field_m = -90;
        }
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            String stackIn_10_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_9_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 == 86) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var3 = (String) lb.b(param0, 2864, "getcookies");
                            var4 = rga.a(param2 + 32201, var3, ';');
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = var4[var5].substring(var6 + 1).trim();
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var3_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    public final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
            return false;
        }
        ((og) this).field_l = (byte)param1;
        super.a(-97, param0);
        return true;
    }

    final int a(byte param0) {
        if (param0 > -25) {
            return 2;
        }
        return ((og) this).field_l;
    }

    public final void a(int param0) {
        if (param0 != 12574) {
            return;
        }
        super.a(param0 ^ 0);
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            field_m = 54;
        }
        return super.a(((og) this).field_h.field_Tc, 108);
    }

    static {
    }
}
