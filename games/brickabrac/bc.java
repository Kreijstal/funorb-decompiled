/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    abstract ko b(byte param0);

    final static boolean a(String param0, String param1, String param2, int param3, byte param4, dk param5, boolean param6) {
        qf var9 = null;
        if (param4 > -102) {
            bc.a(51);
            if (ik.field_g != ej.field_P) {
                return false;
            }
            var9 = new qf(mf.field_f, param5);
            mf.field_f.a(-102, (oc) (Object) var9);
            if (mq.a((byte) -56)) {
                var9.c(true);
                return true;
            }
            td.field_w = param0;
            ik.field_g = jm.field_f;
            tf.field_i = param6 ? true : false;
            fj.field_Qb = param1;
            am.field_cc = param2;
            ni.field_Rb = null;
            vo.field_x = param3;
            return true;
        }
        if (ik.field_g != ej.field_P) {
            return false;
        }
        qf var10 = new qf(mf.field_f, param5);
        mf.field_f.a(-102, (oc) (Object) var10);
        if (mq.a((byte) -56)) {
            var10.c(true);
        } else {
            td.field_w = param0;
            ik.field_g = jm.field_f;
            tf.field_i = param6 ? true : false;
            fj.field_Qb = param1;
            am.field_cc = param2;
            ni.field_Rb = null;
            vo.field_x = param3;
            return true;
        }
        return true;
    }

    final static void a(int param0, long param1) {
        InterruptedException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param1);
                        if (param0 == -29869) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_a = null;
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 != 27423) {
          bc.a(49, -113L);
          tb.field_cb = jl.field_e.d(-1);
          var2 = (CharSequence) (Object) tb.field_cb;
          ih.field_d = gb.a(var2, 71);
          return;
        } else {
          tb.field_cb = jl.field_e.d(-1);
          var3 = (CharSequence) (Object) tb.field_cb;
          ih.field_d = gb.a(var3, 71);
          return;
        }
    }

    abstract byte[] a(int param0, byte param1);

    abstract int a(byte param0, int param1);

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -59) {
            bc.a(-15, -86L);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You can join this game";
        field_a = "Show chat (<%0> unread messages)";
        field_b = "Game options";
        field_c = "Location";
    }
}
