/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends tc {
    int[][] field_m;
    static hd field_n;
    int field_p;
    static volatile boolean field_l;
    boolean field_o;
    int field_k;
    int field_r;
    String[][] field_s;
    static int field_q;

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            wk[] discarded$0 = wj.a(96, (wk[]) null);
            field_n = null;
            return;
        }
        field_n = null;
    }

    wj() {
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2 = 0;
        wk var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -12310) {
          return null;
        } else {
          var2 = 0;
          L0: while (true) {
            if (param1.length <= var2) {
              return param1;
            } else {
              var3 = param1[var2];
              param1[var2].field_z = 0;
              var3.field_w = 0;
              param1[var2].field_A = param1[var2].field_y;
              param1[var2].field_x = param1[var2].field_v;
              var2++;
              continue L0;
            }
          }
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
                        if (null == le.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            le.field_d.a(-1, 0L);
                            le.field_d.a(24, mg.field_e.field_q, (byte) 46, mg.field_e.field_o);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_n = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        mg.field_e.field_q = mg.field_e.field_q + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        mg.field_e.field_q = mg.field_e.field_q + 24;
                        return;
                    }
                    case 8: {
                        field_n = null;
                        mg.field_e.field_q = mg.field_e.field_q + 24;
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
        field_l = true;
        field_q = 0;
    }
}
