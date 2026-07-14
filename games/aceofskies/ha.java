/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static of field_b;
    int field_c;
    d field_a;

    final void e(int param0) throws lp {
        ((ha) this).b(0, 0);
        if (param0 >= -3) {
            field_b = (of) null;
        }
    }

    abstract void e();

    private final static ha a(java.awt.Canvas param0, int param1, d param2, int param3, byte param4) {
        int var5 = -65 % ((4 - param4) / 50);
        return (ha) (Object) new oa(param0, param2, param3, param1);
    }

    abstract int i();

    final void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 3105) {
            return;
        }
        ((ha) this).a(param4, param2, param3, param1, param0, 1);
    }

    abstract void c(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void f(int param0, int param1);

    final synchronized static ha a(int param0, gk param1, int param2, java.awt.Canvas param3, int param4, int param5, int param6, d param7) {
        if (param2 == 0) {
            return to.a(16, param7, param3, param6, param0);
        }
        if (!(2 != param2)) {
            return ha.a(param3, param6, param7, param0, (byte) -64);
        }
        if ((param2 ^ -1) == -2) {
            return lh.a(param3, (byte) 66, param4, param7);
        }
        if (param2 == param5) {
            return gt.a(-70, param7, param3, param1, param4);
        }
        if (-4 == (param2 ^ -1)) {
            return mn.a((byte) 1, param4, param3, param1, param7);
        }
        throw new IllegalArgumentException("UM");
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract void a(sm param0);

    abstract int[] Y();

    abstract boolean b();

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void a(za param0);

    abstract void a();

    abstract gd a(int param0, int param1);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).c(param1, param0, param2, param4, param3, param5);
    }

    abstract da a(vs param0, vd[] param1, boolean param2);

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract sm a(ra param0, gd param1);

    final void a(int param0) {
        vj.field_f[((ha) this).field_c] = false;
        if (param0 != -9) {
            boolean discarded$0 = ((ha) this).d();
        }
        ((ha) this).c();
    }

    final pa a(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var7 = -44 % ((param0 - 43) / 53);
        return ((ha) this).a(param2, param3, param5, param4, param1, true);
    }

    abstract pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    abstract void K(int[] param0);

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 28321) {
            return;
        }
        ((ha) this).U(param3, param0, param4, param1, 1);
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void T(int param0, int param1, int param2, int param3);

    final static void a(ap param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = -3 / ((param1 - 13) / 46);
                    if (null == wt.field_e) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    dh.a(1000000, param3, param2, 1048576, param0);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (mg.field_d != null) {
                        statePc = 4;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = (Object) (Object) um.field_m;
                    // monitorenter um.field_m
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        mg.field_d.a((byte) -116, param3, -1);
                        if (param0 == dt.field_c) {
                            statePc = 7;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        // monitorexit var5
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        mg.field_d.d(-126);
                        um.field_m.e();
                        dt.field_c = param0;
                        if (null == dt.field_c) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mg.field_d.a(param2, -2029711608, dt.field_c);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var6;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void c();

    public static void a(boolean param0) {
        if (!param0) {
            ha.a(false);
        }
        field_b = null;
    }

    abstract int XA();

    abstract za c(int param0);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    protected void finalize() {
        ((ha) this).a(-9);
    }

    abstract void b(int param0);

    abstract void b(int param0, int param1) throws lp;

    void a(pa param0, boolean param1) {
        ((ha) this).a(((ha) this).a((ra) (Object) param0, param1 ? ((ha) this).a(param0.a(), param0.b()) : null));
    }

    abstract pa a(vd param0, boolean param1);

    abstract boolean d();

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).aa(param5, param2, param1, param0, param4, 1);
        if (param3 != -5782) {
            int discarded$0 = ((ha) this).XA();
        }
    }

    ha(d param0) {
        int var3 = 0;
        ((ha) this).field_a = param0;
        int var2 = -1;
        for (var3 = 0; (var3 ^ -1) > -9; var3++) {
            if (!vj.field_f[var3]) {
                var2 = var3;
                vj.field_f[var3] = true;
                break;
            }
        }
        if ((var2 ^ -1) == 0) {
            throw new IllegalStateException("NFTI");
        }
        ((ha) this).field_c = var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new of();
    }
}
