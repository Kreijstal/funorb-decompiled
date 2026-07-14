/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static km[] field_c;
    static String field_d;
    static String field_f;
    static char[] field_a;
    static String[] field_b;
    static long field_e;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 27690) {
            field_e = -20L;
        }
        ak.field_q[param4] = param0;
        ak.field_k[param4] = param5;
        ak.field_r[param4] = param1;
        ak.field_m[param4] = param3;
        ak.field_y[param4] = param2;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -20127) {
            return;
        }
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static void a(p param0, int param1) {
        try {
            byte[] var2 = null;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Chess.field_G;
                        var3 = 40 % ((30 - param1) / 62);
                        var10 = new byte[24];
                        var8 = var10;
                        var7 = var8;
                        var11 = var7;
                        var9 = var11;
                        var2 = var9;
                        if (null != tc.field_z) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        param0.a(var11, (byte) -45, 0, 24);
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            tc.field_z.a(0L, 0);
                            tc.field_z.a(0, var10);
                            var4_int = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (24 <= var4_int) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (0 == var11[var4_int]) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4_int++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (24 > var4_int) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var4 = (Exception) (Object) caughtException;
                        var5 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if ((var5 ^ -1) <= -25) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var5] = (byte)-1;
                        var5++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param0.a(var11, (byte) -45, 0, 24);
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    final static ek b(int param0) {
        try {
            Throwable var1 = null;
            ek stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ek stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == 24) {
                  break L0;
                } else {
                  ek discarded$2 = sa.b(-8);
                  break L0;
                }
              }
              stackOut_2_0 = (ek) Class.forName("oe").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (ek) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Staff impersonation";
        field_d = "From <%0>: ";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
