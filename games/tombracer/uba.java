/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends kma implements cd, eaa {
    static int field_f;
    paa field_i;
    static String[] field_g;
    static String field_h;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((uba) this).field_i.a(param0 + -1780);
                        var3 = ((uba) this).field_i.d(param0 + 20939);
                        var4 = ((uba) this).field_i.j((byte) 110);
                        var5 = cn.a((byte) 60);
                        if (var4 < param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (-3 + var5 >= var4) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = gl.a((byte) 91, era.field_b, new String[2]);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (!fa.a(var3, var2_int, true, var4)) {
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
                        stackOut_6_0 = null;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (String) (Object) stackIn_7_0;
                }
                case 8: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return nia.field_m;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean a(boolean param0) {
        if (!param0) {
            ((uba) this).field_i = null;
            return ((uba) this).field_i.i((byte) 64);
        }
        return ((uba) this).field_i.i((byte) 64);
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 != -128) {
            uba.b((byte) -33);
        }
    }

    public final void a(tra param0, int param1) {
        ((uba) this).c(-65);
        if (param1 != -10) {
            Object var4 = null;
            ((uba) this).a((tra) null, -90);
        }
    }

    final it d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        it stackIn_3_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        it stackOut_2_0 = null;
        it stackOut_5_0 = null;
        it stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((uba) this).field_i.a(111);
                        var3 = ((uba) this).field_i.d(22829);
                        var4 = ((uba) this).field_i.j((byte) 110);
                        var5 = cn.a((byte) 125);
                        if ((var4 ^ -1) > param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = fp.field_c;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = fp.field_c;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!fa.a(var3, var2_int, true, var4)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = fp.field_c;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return fp.field_c;
                }
                case 12: {
                    return uh.field_k;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, rla param1) {
        if (param0 != -3) {
            return;
        }
        ((uba) this).c(-81);
    }

    public uba() {
    }

    public final void a(int param0, tra param1) {
        if (param0 != -6038) {
            field_f = -61;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Building tombs", "Setting traps", "Scattering bones", "Poking snakes", "Carving statues", "Drawing maps", "Lighting torches", "Inviting archaeologists", "Rolling boulders", "Looking for Tom Bracer...", "Twiddling Thumbs"};
        field_h = "You are on <%0>";
    }
}
