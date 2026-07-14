/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_b;
    static sa field_c;
    static String field_a;
    static int field_d;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -47) {
            cd.a(115);
        }
    }

    final static void a(String param0, int param1, String param2) {
        L0: {
          if (null != ol.field_a) {
            ol.field_a.d(true);
            break L0;
          } else {
            break L0;
          }
        }
        pi.field_O = new wa(param0, param2, false, true, true);
        fb.field_e.a(33, (vg) (Object) pi.field_O);
        if (param1 > -2) {
          cd.b((byte) 3);
          return;
        } else {
          return;
        }
    }

    final static double a(byte param0) {
        if (param0 <= 70) {
          field_c = null;
          return Math.pow(3.0, (double)(-1 + hc.field_G));
        } else {
          return Math.pow(3.0, (double)(-1 + hc.field_G));
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (mi.field_f != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        dh.field_N.field_j = dh.field_N.field_j + 24;
                        if (param0 == 4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        cd.a(4);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            mi.field_f.a(0L, (byte) -63);
                            mi.field_f.a(24, dh.field_N.field_j, 18017, dh.field_N.field_h);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        dh.field_N.field_j = dh.field_N.field_j + 24;
                        if (param0 == 4) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        cd.a(4);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        dh.field_N.field_j = dh.field_N.field_j + 24;
                        if (param0 != 4) {
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
                        cd.a(4);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Continue";
        field_c = new sa(2, 4, 4, 0);
        field_d = 10;
    }
}
