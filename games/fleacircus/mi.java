/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends lh {
    int field_i;
    int field_j;
    int field_l;
    static vc field_r;
    static String field_p;
    mi field_q;
    int field_m;
    int field_n;
    static String field_k;
    static dd field_o;

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        we.a(param0 + -7);
        gb.g(param2, param4, param1, param3);
        if (param0 != -52) {
            mi.a((byte) -106);
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != 27) {
          mi.a((byte) -97, -115, -108, -36, -108);
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    mi(int param0, int param1, int param2, int param3, int param4) {
        ((mi) this).field_j = param2;
        ((mi) this).field_l = param4;
        ((mi) this).field_i = param1;
        ((mi) this).field_m = param0;
        ((mi) this).field_n = param3;
    }

    final static jd c(byte param0) {
        L0: {
          if (null == ll.field_n) {
            ll.field_n = new jd();
            ll.field_n.a(ug.field_e, true);
            ll.field_n.field_a = nb.field_c;
            ll.field_n.field_b = 7697781;
            ll.field_n.field_k = 14;
            ll.field_n.field_e = 0;
            ll.field_n.field_j = 4;
            ll.field_n.field_f = 2763306;
            ll.field_n.field_r = 5;
            ll.field_n.field_c = 6;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 105) {
          mi.a((byte) 126, -126, -98, 103, -72);
          return ll.field_n;
        } else {
          return ll.field_n;
        }
    }

    final static void a(byte param0, int param1, boolean param2, wk param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 12) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    mi.a((byte) 55, -95, -74, 14, 24);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null != hh.field_b) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    jd.a(param2, 1048576, (byte) 102, param3, param1);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (gg.field_h == null) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = (Object) (Object) db.field_J;
                    // monitorenter db.field_J
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        gg.field_h.a(param1, true, -1);
                        if (param3 == ae.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        gg.field_h.e(-398);
                        db.field_J.g();
                        ae.field_b = param3;
                        if (ae.field_b == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        gg.field_h.a(param2, 68, ae.field_b);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var5;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Loading music";
        field_k = "Back";
        field_r = new vc();
    }
}
