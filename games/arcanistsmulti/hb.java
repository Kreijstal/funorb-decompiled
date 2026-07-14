/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends kc {
    static co field_Gb;
    static String field_Bb;
    kc field_Eb;
    static String field_Ib;
    static String field_Hb;
    dn field_Db;
    kc field_Jb;
    kc field_Lb;
    static eg field_Fb;
    static double field_Cb;
    static int field_Kb;

    hb(long param0, kc param1, kc param2, in param3, kc param4, String param5, String param6) {
        super(param0, param1);
        ((hb) this).field_Eb = new kc(0L, (kc) null);
        ((hb) this).field_Db = new dn(0L, ((hb) this).field_Eb, param2, param3);
        ((hb) this).field_Jb = new kc(0L, param4);
        ((hb) this).field_Lb = new kc(0L, param4);
        ((hb) this).field_Jb.field_rb = param5;
        ((hb) this).field_Lb.field_rb = param6;
        ((hb) this).a((kc) (Object) ((hb) this).field_Db, 84);
        ((hb) this).a(((hb) this).field_Jb, 38);
        ((hb) this).a(((hb) this).field_Lb, 31);
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        wk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new wk(param1);
                    var3 = var9.e((byte) 73);
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    hb.e(127);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = var9.d(-10674);
                    if (-1 < var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == ub.field_a) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (ub.field_a < var4) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a((byte) 114, 0, var16, var4);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.d(-10674);
                    if (-1 < var5) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-1 == ub.field_a) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 > ub.field_a) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$3 = bf.a(var17, var5, param1, var4, 9);
                    return var6;
                }
                case 16: {
                    var7 = (Object) (Object) wj.field_a;
                    // monitorenter wj.field_a
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        wj.field_a.a(122, var17, var9);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = (param0 + ((hb) this).field_x) / 2;
        int var6 = ((hb) this).field_I - param1;
        ((hb) this).field_Db.a(0, param2, ((hb) this).field_x, param3, 0, -param0 + var6, param0);
        ((hb) this).field_Jb.field_T = 0;
        ((hb) this).field_Jb.field_db = var6;
        ((hb) this).field_Jb.field_x = -param0 + var5;
        ((hb) this).field_Jb.field_I = param1;
        ((hb) this).field_Lb.field_T = var5;
        ((hb) this).field_Lb.field_db = var6;
        ((hb) this).field_Lb.field_I = param1;
        ((hb) this).field_Lb.field_x = -var5 + ((hb) this).field_x;
    }

    final static void a(cm param0, int param1, byte param2) {
        ab var6 = he.field_e;
        var6.b((byte) -123, param1);
        var6.field_g = var6.field_g + 1;
        int var4 = var6.field_g;
        var6.f(1, (byte) -21);
        var6.f(param0.field_g, (byte) -80);
        var6.f(param0.field_i, (byte) -7);
        int var5 = 1 / ((22 - param2) / 57);
        var6.a(param0.field_m, (byte) -101);
        var6.a(param0.field_n, (byte) -101);
        var6.a(param0.field_o, (byte) -101);
        var6.a(param0.field_k, (byte) -101);
        int discarded$0 = var6.a(true, var4);
        var6.b(-var4 + var6.field_g, (byte) 43);
    }

    final static void f(byte param0) {
        mo.field_p = -1;
        cb.field_c = null;
        oh.field_i = false;
        int var1 = 57 / ((param0 - -19) / 41);
        jh.field_f = 0;
        ka.field_p = -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((hb) this).field_T = param5;
        ((hb) this).field_db = param4;
        ((hb) this).field_I = param2;
        ((hb) this).field_x = param3;
        if (param6 != -16624) {
          var10 = null;
          hb.a((cm) null, -57, (byte) -106);
          ((hb) this).a(param1, param0, param7, false);
          return;
        } else {
          ((hb) this).a(param1, param0, param7, false);
          return;
        }
    }

    hb(long param0, hb param1, String param2, String param3) {
        this(param0, (kc) (Object) param1, param1.field_Db.field_Hb, param1.field_Db.field_Eb, param1.field_Jb, param2, param3);
    }

    public static void e(int param0) {
        field_Ib = null;
        field_Gb = null;
        if (param0 != 0) {
            return;
        }
        field_Hb = null;
        field_Fb = null;
        field_Bb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "Name";
        field_Hb = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Cb = 0.0;
        field_Ib = "All games";
        field_Kb = 2;
    }
}
