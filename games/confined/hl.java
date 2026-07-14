/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements de {
    static String[] field_h;
    static String field_b;
    private ma[] field_e;
    private mn field_f;
    private mi field_a;
    private int field_g;
    private int field_c;
    private int field_d;

    public final int[] a(float param0, int param1, int param2) {
        ma var8 = null;
        int var4 = -107 / ((param1 - -35) / 50);
        ma var5 = ((hl) this).field_e[param2];
        ma var7 = var5;
        var7 = var5;
        if (var5 == null) {
            return null;
        }
        if (var5.field_t != null) {
            if (!(param0 != var5.field_o)) {
                ((hl) this).field_f.a((rk) (Object) var5, -1);
                return var5.field_t;
            }
            var5.a(true);
            var5.a();
            ((hl) this).field_c = ((hl) this).field_c + 1;
        }
        if (!var5.a(param0, ((hl) this).field_g, ((hl) this).field_a)) {
            return null;
        }
        if (((hl) this).field_c == 0) {
            var8 = (ma) (Object) ((hl) this).field_f.b((byte) 101);
            var8.a();
            ((hl) this).field_f.a((rk) (Object) var5, -1);
            return var5.field_t;
        }
        ((hl) this).field_c = ((hl) this).field_c - 1;
        ((hl) this).field_f.a((rk) (Object) var5, -1);
        return var5.field_t;
    }

    final static void a(int param0) {
        g var1 = (g) (Object) fc.field_a.a(-115);
        if (!(var1 != null)) {
            dc.d(120);
            return;
        }
        hb var2 = e.field_c;
        int discarded$20 = var2.f((byte) 72);
        int discarded$36 = var2.f((byte) 40);
        int discarded$47 = var2.f((byte) 100);
        int discarded$53 = var2.f((byte) 80);
        var1.a(true);
        if (param0 != -251) {
            hl.b(-118);
            return;
        }
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 1) {
            ((hl) this).field_d = -103;
            return true;
        }
        return true;
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -58) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    boolean discarded$3 = hl.a((byte) -7);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == tf.field_p) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) tf.field_p;
                    // monitorenter tf.field_p
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        tf.field_p = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 27) {
            field_b = null;
            return (tg.field_H ^ -1) < -251 ? true : false;
        }
        return (tg.field_H ^ -1) < -251 ? true : false;
    }

    public final boolean a(boolean param0, int param1) {
        if (param0) {
            boolean discarded$10 = ((hl) this).a(51, -31);
            return -65 == ((hl) this).field_g ? true : false;
        }
        return -65 == ((hl) this).field_g ? true : false;
    }

    public final int b(int param0, int param1) {
        if (param0 != 0) {
            ((hl) this).field_a = null;
            if (((hl) this).field_e[param1] != null) {
                return ((hl) this).field_e[param1].field_s;
            }
            return 0;
        }
        if (((hl) this).field_e[param1] != null) {
            return ((hl) this).field_e[param1].field_s;
        }
        return 0;
    }

    public final int a(int param0, byte param1) {
        if (param1 != -85) {
            return 80;
        }
        if (((hl) this).field_e[param0].field_r) {
            return 0;
        }
        return 1;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_h = null;
            field_b = null;
            return;
        }
        field_h = null;
        field_b = null;
    }

    hl(mi param0, mi param1, int param2, int param3) {
        int var7 = 0;
        kg var8 = null;
        ((hl) this).field_f = new mn();
        ((hl) this).field_g = 128;
        ((hl) this).field_c = 0;
        ((hl) this).field_a = param1;
        ((hl) this).field_d = param2;
        ((hl) this).field_c = ((hl) this).field_d;
        ((hl) this).field_g = param3;
        int[] var12 = param0.a((byte) -65, 0);
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var5 = var10;
        int var6 = var12.length;
        ((hl) this).field_e = new ma[param0.d(0, (byte) -73)];
        for (var7 = 0; var7 < var6; var7++) {
            var8 = new kg(param0.a((byte) -2, 0, var12[var7]));
            ((hl) this).field_e[var12[var7]] = new ma(var8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This page will be unlocked when you get the following achievement:";
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
