/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class am {
    static dm field_b;
    static ck field_d;
    private int[] field_c;
    static int[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 49) {
            am.a((byte) 72);
        }
        field_a = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var3 = (((am) this).field_c.length >> -1161198783) - 1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = ((am) this).field_c[1 + var4 + var4];
          if (-1 != var5) {
            if (((am) this).field_c[var4 - -var4] != param1) {
              var4 = var4 - -1 & var3;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    final static rh a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            jh var6 = null;
            IOException var6_ref = null;
            jh var7 = null;
            bj var8 = null;
            Object stackIn_2_0 = null;
            rh stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            rh stackOut_14_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param0 <= -49) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (rh) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            var6 = null;
                            if (ph.field_i.field_j != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            af.field_d = new sk(ph.field_i.field_j, 5200, 0);
                            ph.field_i.field_j = null;
                            var6 = new jh(255, af.field_d, new sk(ph.field_i.field_s, 12000, 0), 2097152);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = null;
                            if (af.field_d == null) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (je.field_h != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            je.field_h = new sk[ph.field_i.field_r.length];
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (je.field_h[param1] != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            je.field_h[param1] = new sk(ph.field_i.field_r[param1], 12000, 0);
                            ph.field_i.field_r[param1] = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var7 = new jh(param1, af.field_d, je.field_h[param1], 2097152);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var8 = gb.field_b.a(param1, (byte) -9, param5, var6, var7);
                            if (!param2) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8.b(92);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = new rh((nh) (Object) var8, param4, param3);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
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

    am(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length - -(param0.length >> -1603804415) >= var2) {
            var2 = var2 << 1;
        }
        ((am) this).field_c = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((am) this).field_c[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & var2 + -1;
            while (((am) this).field_c[var4 + var4 + 1] != -1) {
                var4 = var4 - -1 & -1 + var2;
            }
            ((am) this).field_c[var4 - -var4] = param0[var3];
            ((am) this).field_c[1 + var4 + var4] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_d = new ck(12, 0, 1, 0);
    }
}
