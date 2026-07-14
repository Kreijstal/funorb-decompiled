/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lo {
    static db field_a;
    static String[] field_c;
    static hp field_b;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.length()) {
            if (param1 > 42) {
              return false;
            } else {
              return true;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!ep.a((char) var3, (byte) -14)) {
              if (!ag.a((char) var3, 48)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, ng param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = CrazyCrystals.field_B;
                        var6 = new byte[param0];
                        var2 = var6;
                        if (fp.field_e == null) {
                            statePc = 12;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            fp.field_e.a(0L, -1);
                            fp.field_e.a(var6, -88);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (-1 != var6[var3_int]) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-25 <= var3_int) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            param1.a(0, 24, 76, var2);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-25 >= (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 12: {
                        param1.a(0, 24, 76, var2);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
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

    final synchronized static long a(byte param0) {
        int var3 = 103 % ((35 - param0) / 39);
        long var1 = System.currentTimeMillis();
        if (!(u.field_b <= var1)) {
            r.field_f = r.field_f + (u.field_b - var1);
        }
        u.field_b = var1;
        return var1 - -r.field_f;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -114 / ((55 - param0) / 48);
        field_c = null;
        field_a = null;
    }

    static {
    }
}
