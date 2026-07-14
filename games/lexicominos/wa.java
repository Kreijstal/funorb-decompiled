/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wa extends kd {
    int field_h;
    int field_o;
    int field_n;
    int field_l;
    static boolean[] field_j;
    int field_i;
    static String field_k;
    int field_m;

    final static void a(byte param0, long param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param1);
        } catch (InterruptedException interruptedException) {
        }
        if (param0 != 5) {
            field_k = null;
            return;
        }
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Lexicominos.field_L ? 1 : 0;
                        if (kb.field_b != null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        kb.field_b.b(0);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param0 <= 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        field_k = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == u.field_pb) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        u.field_pb.a((byte) -114);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (wj.field_s == null) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            wj.field_s.c(0);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != bd.field_i) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (bd.field_i.length > var1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        if (null != bd.field_i[var1]) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            bd.field_i[var1].c(0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
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

    public static void a(byte param0) {
        field_k = null;
        int var1 = 115 % ((param0 - -66) / 60);
        field_j = null;
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ng discarded$0 = new ng();
        field_j = new boolean[112];
    }
}
