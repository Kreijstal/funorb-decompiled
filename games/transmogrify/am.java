/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends wf {
    int field_p;
    long field_o;
    int[] field_m;
    static oa field_q;
    int field_i;
    int field_k;
    int field_g;
    static int field_n;
    int field_l;
    int field_h;
    int field_j;

    final static void a(boolean param0, int param1, pl param2, byte param3) {
        Object var4_ref_Object = null;
        int var4 = 0;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null != jj.field_a) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ff.a(param2, param0, param1, 1048576, (byte) 40);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null == jk.field_D) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4_ref_Object = (Object) (Object) re.field_h;
                    // monitorenter re.field_h
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        jk.field_D.c(-1, param1, 0);
                        if (d.field_e == param2) {
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
                        // monitorexit var4_ref_Object
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
                        jk.field_D.f(16);
                        re.field_h.c();
                        d.field_e = param2;
                        if (d.field_e == null) {
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
                        jk.field_D.a(-63, param0, d.field_e);
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
                        // monitorexit var4_ref_Object
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var4 = -81 % ((-55 - param3) / 56);
                    return;
                }
                case 13: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4_ref_Object
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var5;
                }
                case 15: {
                    var4 = -81 % ((-55 - param3) / 56);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 != 5) {
            am.a((byte) -97);
        }
    }

    final static mi a(String param0, ci param1, byte param2, ci param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param2 != 72) {
          return null;
        } else {
          var5 = param1.b(114, param4);
          var6 = param1.a(param2 + -73, param0, var5);
          return oa.a(-123, param3, param1, var5, var6);
        }
    }

    am(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((am) this).field_i = param1;
        ((am) this).field_k = param3;
        ((am) this).field_m = param6;
        ((am) this).field_g = param2;
        ((am) this).field_l = param5;
        ((am) this).field_j = param0;
        ((am) this).field_h = param4;
        qa.field_r = qa.field_r + 1;
        ((am) this).field_p = 65535 & qa.field_r;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new oa((byte[]) null);
    }
}
