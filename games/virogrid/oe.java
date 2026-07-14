/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_d;
    static lc field_e;
    static String field_a;
    static int field_f;
    static String field_c;
    static hk[][] field_b;

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
          field_b = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 0) {
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
                        if (null == gh.field_Ib) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            gh.field_Ib.a(0L, 0);
                            gh.field_Ib.a(sh.field_qb.field_l, sh.field_qb.field_g, 24, param0 ^ 0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        sh.field_qb.field_l = sh.field_qb.field_l + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        sh.field_qb.field_l = sh.field_qb.field_l + 24;
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

    final static kg a(String param0, boolean param1) {
        Object var3 = null;
        if (param1) {
          var3 = null;
          kg discarded$2 = oe.a((String) null, false);
          return new kg(param0);
        } else {
          return new kg(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "All players have left <%0>'s game.";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_c = "Reject <%0> from this game";
        field_e = new lc(15, 0, 1, 0);
    }
}
