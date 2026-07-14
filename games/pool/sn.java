/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends gg implements pe, ha {
    static qb[] field_h;
    static String field_l;
    static String field_j;
    eq field_i;
    static String field_k;
    static vh field_m;
    static byte[] field_n;

    public final void a(sl param0, int param1) {
        int var3 = -25 % ((-43 - param1) / 35);
        ((sn) this).b(11755);
    }

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_l = null;
        field_h = null;
        if (param0 != -119) {
          sn.a((byte) -90);
          field_k = null;
          field_j = null;
          return;
        } else {
          field_k = null;
          field_j = null;
          return;
        }
    }

    final String f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((sn) this).field_i.h((byte) -119);
                        var3 = ((sn) this).field_i.j(25);
                        var5 = -15 / ((-30 - param0) / 45);
                        var4 = ((sn) this).field_i.h(119);
                        var6 = em.h(36);
                        if (-1891 < (var4 ^ -1)) {
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
                        if (var6 + -3 < var4) {
                            statePc = 3;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = nr.a(new String[2], -1, ej.field_c);
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
                        if (!qp.a((byte) 123, var4, var3, var2_int)) {
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
                        return null;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return ij.field_n;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean h(int param0) {
        if (param0 != -3) {
            return true;
        }
        if (null == sm.field_C) {
            return false;
        }
        if (!sm.field_C.f(20628)) {
            return false;
        }
        return true;
    }

    final na g(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        na stackIn_4_0 = null;
        na stackIn_8_0 = null;
        na stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        na stackOut_7_0 = null;
        na stackOut_3_0 = null;
        na stackOut_10_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -14836) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_k = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2_int = ((sn) this).field_i.h((byte) -119);
                        var3 = ((sn) this).field_i.j(param0 ^ -14827);
                        var4 = ((sn) this).field_i.h(49);
                        var5 = em.h(param0 + 14872);
                        if (1890 <= var4) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = gp.field_d;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (-3 + var5 < var4) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = gp.field_d;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (qp.a((byte) 122, var4, var3, var2_int)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = gp.field_d;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return gp.field_d;
                }
                case 13: {
                    return kr.field_e;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(sl param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ((sn) this).a((sl) null, -31);
        }
    }

    public sn() {
    }

    public final boolean d(int param0) {
        if (param0 != -3) {
            boolean discarded$0 = sn.h(41);
            return ((sn) this).field_i.g((byte) 114);
        }
        return ((sn) this).field_i.g((byte) 114);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Spots";
        field_l = "Lobby";
        field_k = "Random";
    }
}
