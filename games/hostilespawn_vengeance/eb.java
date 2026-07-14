/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static bd field_b;
    static sc field_c;
    static String field_d;
    static int field_a;
    static ug field_e;
    static String field_f;

    final static void a(fd param0, int param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HostileSpawn.field_I ? 1 : 0;
                    if (null != param0.field_d) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3_int = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (50 <= var3_int) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == param0.field_d.peekEvent()) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    vj.a(1L, (byte) -49);
                    var3_int++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (param1 == 1001) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_f = null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param0.field_d.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 <= 53) {
          boolean discarded$2 = eb.a(88);
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 13372) {
            field_c = null;
            if (!(-1 != jd.field_q)) {
                if (!(re.c((byte) 33, 1))) {
                    return false;
                }
                jd.field_q = sc.field_g.l(32270);
                sc.field_g.field_i = 0;
            }
            if (!(-2 != jd.field_q)) {
                if (!(re.c((byte) 33, 2))) {
                    return false;
                }
                jd.field_q = sc.field_g.e(8);
                sc.field_g.field_i = 0;
            }
            return re.c((byte) 33, jd.field_q);
        }
        if (!(-1 != jd.field_q)) {
            if (!(re.c((byte) 33, 1))) {
                return false;
            }
            jd.field_q = sc.field_g.l(32270);
            sc.field_g.field_i = 0;
        }
        if (!(-2 != jd.field_q)) {
            if (!(re.c((byte) 33, 2))) {
                return false;
            }
            jd.field_q = sc.field_g.e(8);
            sc.field_g.field_i = 0;
        }
        return re.c((byte) 33, jd.field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_a = 5;
        field_f = "Become a member to get this expansion and...";
    }
}
