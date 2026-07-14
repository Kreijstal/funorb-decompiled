/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static hj[] field_b;
    static int field_c;
    static String field_a;

    final static bl a(int param0) {
        if (param0 != 0) {
          L0: {
            field_a = null;
            if (ed.field_h == null) {
              ed.field_h = new bl();
              ed.field_h.a(lm.field_f, -2699);
              ed.field_h.field_j = pc.field_bb;
              ed.field_h.field_r = 7697781;
              ed.field_h.field_d = 4;
              ed.field_h.field_a = 5;
              ed.field_h.field_o = 0;
              ed.field_h.field_h = 6;
              ed.field_h.field_i = 14;
              ed.field_h.field_k = 2763306;
              break L0;
            } else {
              break L0;
            }
          }
          return ed.field_h;
        } else {
          L1: {
            if (ed.field_h == null) {
              ed.field_h = new bl();
              ed.field_h.a(lm.field_f, -2699);
              ed.field_h.field_j = pc.field_bb;
              ed.field_h.field_r = 7697781;
              ed.field_h.field_d = 4;
              ed.field_h.field_a = 5;
              ed.field_h.field_o = 0;
              ed.field_h.field_h = 6;
              ed.field_h.field_i = 14;
              ed.field_h.field_k = 2763306;
              break L1;
            } else {
              break L1;
            }
          }
          return ed.field_h;
        }
    }

    public static void b(int param0) {
        if (param0 != 24) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (s.field_y != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        cd.field_t.field_i = cd.field_t.field_i + 24;
                        if (param0 > 38) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        field_b = null;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            s.field_y.a(0L, -1);
                            s.field_y.a(false, cd.field_t.field_j, 24, cd.field_t.field_i);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        cd.field_t.field_i = cd.field_t.field_i + 24;
                        if (param0 > 38) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_b = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        cd.field_t.field_i = cd.field_t.field_i + 24;
                        if (param0 <= 38) {
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
                        field_b = null;
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
        field_a = "CHOMPO";
    }
}
