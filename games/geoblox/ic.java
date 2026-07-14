/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ic {
    static String field_b;
    static String field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param1 <= param0) {
            break L0;
          } else {
            var3 = param0;
            param0 = param1;
            param1 = var3;
            break L0;
          }
        }
        L1: while (true) {
          if (-1 == (param1 ^ -1)) {
            if (param2 > -120) {
              ic.a(6);
              return param0;
            } else {
              return param0;
            }
          } else {
            var3 = param0 % param1;
            param0 = param1;
            param1 = var3;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 16424) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7, int param8, String param9, int param10, d param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        eh.field_d = new pk(param8);
                        fj.field_q = new pk(param2);
                        ja.field_D = param11;
                        ok.field_f = param3;
                        lb.field_c = param1;
                        sd.field_x = param13;
                        ac.field_s = param7;
                        f.field_ib = param0;
                        if (!param4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        stackOut_1_0 = 1;
                        stackIn_3_0 = stackOut_1_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 2: {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        rb.field_c = stackIn_3_0 != 0;
                        mk.field_l = param10;
                        ol.field_I = param9;
                        if (!param5) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        stackOut_4_0 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 5: {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ll.field_e = stackIn_6_0 != 0;
                        qe.field_b = param6;
                        if (ja.field_D.field_n != null) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param12 == 64) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        field_b = null;
                        return;
                    }
                    case 9: {
                        return;
                    }
                    case 11: {
                        try {
                            af.field_b = new sk(ja.field_D.field_n, 64, 0);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        if (param12 == 64) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        field_b = null;
                        return;
                    }
                    case 14: {
                        return;
                    }
                    case 16: {
                        var15 = (IOException) (Object) caughtException;
                        throw new RuntimeException(var15.toString());
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

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 65) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_a = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == af.field_b) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            af.field_b.a(22, 0L);
                            af.field_b.a(24, eh.field_d.field_f, eh.field_d.field_j, false);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        eh.field_d.field_f = eh.field_d.field_f + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        eh.field_d.field_f = eh.field_d.field_f + 24;
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
        field_b = "Create your own free Jagex account";
        field_a = "Bonus: <%0>";
    }
}
