/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak extends jb {
    int field_g;
    boolean field_n;
    int[][] field_l;
    long[][] field_k;
    String[][] field_i;
    static db field_f;
    int field_j;
    int field_h;
    static int field_m;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 77) {
            field_f = null;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == oi.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (param0 < 0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (ek.field_h == gj.field_k) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        tp.field_f.field_f = 0;
                        return;
                    }
                    case 5: {
                        if (tp.field_f.field_f != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if ((10000L + mp.field_p ^ -1L) > (lo.a((byte) -118) ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        tp.field_f.d(8, param0);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if ((tp.field_f.field_f ^ -1) >= -1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            oi.field_c.a(0, param1 ^ -116, tp.field_f.field_h, tp.field_f.field_f);
                            mp.field_p = lo.a((byte) 90);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        iOException = (IOException) (Object) caughtException;
                        jj.a(4);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        tp.field_f.field_f = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param1 != -48) {
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
                        ak.a((byte) -60, 78, 70, 24, -99);
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

    ak() {
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        kh.f(param1, param2 - -10, 79, 4, 0);
        kh.f(param1 - -1, param2 + 9, 77, 6, 0);
        kh.f(param1 - -1, 10 + param2, 77, 4, param4);
        oc.a(af.field_c, 26, param2, param3 + param1, 15, -123);
        if (param0 != 61) {
            ak.a(-86);
        }
    }

    static {
    }
}
