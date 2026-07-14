/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_c;
    double field_a;
    double field_b;

    final static String a(String param0, String param1, gk param2, int param3) {
        if (param3 < 31) {
            return (String) null;
        }
        if (!param2.b((byte) -127)) {
            return param1;
        }
        return param0 + " - " + param2.a(-85) + "%";
    }

    private final void d(int param0) {
        ((kc) this).a(0.0, 0.0, true);
        if (param0 != 1) {
            this.d(60);
        }
    }

    final void a(double param0, double param1, int param2) {
        param1 = param1 * 3.141592653589793 / 128.0;
        ((kc) this).field_a = param0 * Math.sin(param1);
        if (param2 <= 99) {
            ((kc) this).field_b = -0.9803758533084136;
        }
        ((kc) this).field_b = Math.cos(param1) * param0;
    }

    final double a(kc param0, byte param1) {
        if (param1 > -3) {
            kc var4 = (kc) null;
            ((kc) this).a((kc) null, -117);
        }
        return ((kc) this).field_b * ((kc) param0).field_b + ((kc) param0).field_a * ((kc) this).field_a;
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0.charAt(0);
        if (param1 != 26035) {
            field_c = 0;
        }
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (var2 != param0.charAt(var3)) {
                return false;
            }
        }
        return true;
    }

    final double b(int param0) {
        if (param0 != 127) {
            ((kc) this).field_a = -1.4009529146571602;
        }
        return ((kc) this).field_a * ((kc) this).field_a + ((kc) this).field_b * ((kc) this).field_b;
    }

    final double a(byte param0) {
        if (param0 != -74) {
            return 1.5918164754456066;
        }
        return Math.sqrt(((kc) this).b(127));
    }

    final void a(byte param0, kc param1) {
        ((kc) this).field_b = ((kc) this).field_b + ((kc) param1).field_b;
        ((kc) this).field_a = ((kc) this).field_a + ((kc) param1).field_a;
        if (param0 != 103) {
            field_c = -5;
        }
    }

    final int c(int param0) {
        if (0.0 == ((kc) this).field_a) {
            if (0.0 == ((kc) this).field_b) {
                return 255;
            }
        }
        if (param0 != -113) {
            return -46;
        }
        return (int)(Math.atan2(((kc) this).field_b, ((kc) this).field_a) * 255.0 / 3.141592653589793);
    }

    final void a(kc param0, boolean param1) {
        ((kc) this).field_a = ((kc) param0).field_a;
        ((kc) this).field_b = ((kc) param0).field_b;
        if (!param1) {
            kc var4 = (kc) null;
            ((kc) this).a((kc) null, true);
        }
    }

    final void a(double param0, double param1, boolean param2) {
        if (!param2) {
            ((kc) this).field_a = -0.3043247171709143;
        }
        ((kc) this).field_b = param1;
        ((kc) this).field_a = param0;
    }

    final void a(kc param0, int param1) {
        ((kc) this).field_b = ((kc) this).field_b - ((kc) param0).field_b;
        ((kc) this).field_a = ((kc) this).field_a - ((kc) param0).field_a;
        if (param1 != -30507) {
        }
    }

    public kc() {
        this.d(1);
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = AceOfSkies.field_G ? 1 : 0;
                    var1 = (Object) (Object) ua.field_d;
                    // monitorenter ua.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        he.field_n = he.field_n + 1;
                        ch.field_a = lt.field_u;
                        if (param0 <= fb.field_a) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-113 >= (var2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        lp.field_a[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fb.field_a = gr.field_h;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (fb.field_a == gr.field_h) {
                            statePc = 10;
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
                        var2 = da.field_b[gr.field_h];
                        gr.field_h = 127 & gr.field_h + 1;
                        if ((var2 ^ -1) > -1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        lp.field_a[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        lp.field_a[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lt.field_u = nl.field_w;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kc(kc param0) {
        ((kc) this).a(param0, true);
    }

    kc(double param0, double param1) {
        ((kc) this).a(param0, param1, true);
    }

    static {
    }
}
