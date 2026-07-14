/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends qr {
    static pf field_Bb;
    private qr field_Ab;
    private qr field_xb;
    static int field_Fb;
    static vd field_Db;
    static String field_yb;
    static String field_zb;
    static th field_Cb;
    static qr field_Eb;

    private rs(long param0, qr param1, qr param2, String param3) {
        super(param0, (qr) null);
        ((rs) this).field_xb = new qr(0L, param1);
        ((rs) this).field_Ab = new qr(0L, param2);
        ((rs) this).field_Ab.field_z = param3;
        ((rs) this).a(4, ((rs) this).field_xb);
        ((rs) this).a(4, ((rs) this).field_Ab);
        ((rs) this).e((byte) -123);
    }

    rs(long param0, rs param1, String param2) {
        this(param0, param1.field_xb, param1.field_Ab, param2);
    }

    private final void b(int param0, byte param1) {
        ((rs) this).field_xb.a(((rs) this).field_xb.e(false), ((rs) this).field_mb, (byte) 69, 0, 0);
        int var3 = ((rs) this).field_xb.field_K + param0;
        ((rs) this).field_Ab.a(-var3 + ((rs) this).field_K, ((rs) this).field_mb, (byte) 112, 0, var3);
        int var4 = 8 / ((23 - param1) / 43);
    }

    public static void h(int param0) {
        field_yb = null;
        field_zb = null;
        field_Eb = null;
        if (param0 != 2616) {
          field_yb = null;
          field_Bb = null;
          field_Cb = null;
          field_Db = null;
          return;
        } else {
          field_Bb = null;
          field_Cb = null;
          field_Db = null;
          return;
        }
    }

    rs(long param0, bi param1, bi param2, int param3, qr param4, String param5) {
        this(param0, (qr) null, param4, param5);
        ((rs) this).field_xb.field_pb = param2;
        ((rs) this).field_xb.field_G = param3;
        ((rs) this).field_xb.field_Z = param1;
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (im.field_c == null) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) im.field_c;
                    // monitorenter im.field_c
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        im.field_c = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (param0 < -70) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_Db = null;
                    statePc = 5;
                    continue stateLoop;
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
                    if (param0 >= -70) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    field_Db = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(int param0, int param1) {
        if (param1 != 0) {
          field_Fb = 86;
          return ((rs) this).field_xb.e(false) + (param0 + ((rs) this).field_Ab.e(false));
        } else {
          return ((rs) this).field_xb.e(false) + (param0 + ((rs) this).field_Ab.e(false));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((rs) this).a(param0, param4, (byte) 42, param5, param1);
        int var7 = 89 % ((1 - param2) / 60);
        this.b(param3, (byte) -34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = -1;
        field_Bb = new pf();
        field_yb = "To server list";
        field_zb = "Music: ";
    }
}
