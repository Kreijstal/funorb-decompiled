/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends mf {
    private ul field_l;
    static mn field_k;
    static int[] field_m;
    static nf field_j;
    static String field_h;
    static bi field_i;

    final static void a(int param0, int param1, bj param2) {
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        hb var8 = vh.field_a;
        hb var9 = var8;
        var9.b(true, param0);
        var9.field_n = var9.field_n + 1;
        int var4 = var9.field_n;
        var9.f(96, 1);
        var9.c(param2.field_p, 8);
        var9.c(param2.field_r, 8);
        var9.c(param2.field_x, 8);
        var9.d(-97, param2.field_n);
        var9.d(-101, param2.field_u);
        var9.d(-108, param2.field_o);
        var9.d(-83, param2.field_t);
        var9.f(107, param2.field_s.length);
        if (param1 < 35) {
            Object var7 = null;
            lf.a(-61, -11, (bj) null);
        }
        for (var5 = 0; param2.field_s.length > var5; var5++) {
            var8.d(-91, param2.field_s[var5]);
        }
        int discarded$0 = var9.e(26199, var4);
        var9.a(25859, -var4 + var9.field_n);
    }

    final String a(String param0, boolean param1) {
        dm var3 = null;
        if (((lf) this).field_l instanceof j) {
            var3 = ((j) (Object) ((lf) this).field_l).a((byte) -9);
            if (!(var3 == null)) {
                if (var3.a(-3621) == nn.field_q) {
                    if (!param0.equals((Object) (Object) ((lf) this).field_l.field_B)) {
                        return lm.field_d;
                    }
                }
                return var3.a((byte) 68);
            }
        }
        if (!param1) {
            lf.e(71);
        }
        if (param0.equals((Object) (Object) ((lf) this).field_l.field_B)) {
            return null;
        }
        return lm.field_d;
    }

    lf(ul param0, ul param1) {
        super(param0);
        ((lf) this).field_l = param1;
    }

    final fi a(byte param0, String param1) {
        dm var3 = null;
        if (param0 > -44) {
            return null;
        }
        if (!(!(((lf) this).field_l instanceof j))) {
            var3 = ((j) (Object) ((lf) this).field_l).a((byte) -9);
            if (var3 != null) {
                if (var3.a(-3621) != nn.field_q) {
                    return fb.field_e;
                }
            }
        }
        return !param1.equals((Object) (Object) ((lf) this).field_l.field_B) ? fb.field_e : nn.field_q;
    }

    final static void c(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Confined.field_J ? 1 : 0;
                    var1 = (Object) (Object) tf.field_p;
                    // monitorenter tf.field_p
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ic.field_b = lh.field_b;
                        cg.field_d = cg.field_d + 1;
                        if (0 <= ab.field_a) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var2 ^ -1) <= -113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        mc.field_e[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ab.field_a = mi.field_g;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (mi.field_g == ab.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = on.field_f[mi.field_g];
                        mi.field_g = 1 + mi.field_g & 127;
                        if (0 <= var2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mc.field_e[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        mc.field_e[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == -84) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_i = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        lh.field_b = oe.field_W;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        field_i = null;
        if (param0 < 15) {
            lf.c((byte) 83);
        }
        field_m = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[]{5, 18, 39, 52};
        field_k = new mn();
        field_h = "Special energy weapons";
    }
}
