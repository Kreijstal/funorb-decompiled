/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends l {
    static boolean field_n;
    static he field_h;
    static int field_k;
    static String field_i;
    static int field_l;
    static int field_g;
    int field_o;
    static String field_m;
    int field_j;

    final static void a(int param0, eh param1) {
        gj var2 = null;
        if (param0 != 1048576) {
          return;
        } else {
          gj.a(param1.a("headers.packvorbis", 100, ""));
          var2 = gj.a(param1, "jagex logo2.packvorbis", "");
          ml discarded$2 = var2.a();
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 45) {
          field_g = 115;
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        } else {
          field_h = null;
          field_i = null;
          field_m = null;
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, sc param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == wc.field_f) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    wl.a(1048576, param0 + -10509, param1, param3, param2);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param0 == -1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (vg.field_B != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var4 = (Object) (Object) ae.field_g;
                    // monitorenter ae.field_g
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        vg.field_B.a(param1, true, -1);
                        if (param3 != qi.field_b) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        vg.field_B.c(false);
                        ae.field_g.h();
                        qi.field_b = param3;
                        if (null == qi.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        vg.field_B.a(param2, 37, qi.field_b);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var4
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1) {
        ab var2 = null;
        Object var3 = null;
        we.field_c.a(param1, 24960);
        var2 = fh.field_c;
        if (param0 >= -60) {
          L0: {
            var3 = null;
            la.a(22, -99, true, (sc) null);
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private la() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Ask to join <%0>'s game";
        field_n = false;
        field_m = "Hide game chat";
        field_g = 0;
    }
}
