/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends vh {
    volatile boolean field_A;
    boolean field_x;
    static oa field_w;
    boolean field_C;
    static rh field_u;
    static int field_v;
    static String field_y;
    static String field_s;
    static int[] field_p;
    static boolean field_r;
    static String field_t;
    static ui[] field_B;
    static rh field_z;
    static String field_q;

    public static void a(boolean param0) {
        field_t = null;
        field_s = null;
        field_z = null;
        if (!param0) {
          rf.d((byte) -6);
          field_w = null;
          field_u = null;
          field_B = null;
          field_p = null;
          field_y = null;
          field_q = null;
          return;
        } else {
          field_w = null;
          field_u = null;
          field_B = null;
          field_p = null;
          field_y = null;
          field_q = null;
          return;
        }
    }

    abstract byte[] b(boolean param0);

    abstract int c(int param0);

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == a.field_d) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) a.field_d;
                    // monitorenter a.field_d
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        a.field_d = null;
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
                    if (param0 >= 81) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_y = null;
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
                    if (param0 < 81) {
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
                    field_y = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rf() {
        ((rf) this).field_A = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new oa();
        field_y = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "OBJECTIVE FAILED";
        field_t = "Undo troop placement";
        field_u = new rh(4, 1, 1, 1);
        field_B = new ui[]{new ui(0), new ui(1), new ui(2), new ui(3), new ui(4), new ui(5), new ui(6), new ui(7), new ui(8)};
        field_z = new rh(1, 2, 2, 0);
        field_q = "Reload ";
    }
}
