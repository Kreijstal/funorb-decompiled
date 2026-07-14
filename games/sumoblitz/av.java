/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class av extends jt {
    private Object field_D;
    static il field_B;
    static int[] field_C;

    final static void a(fs param0, boolean param1) {
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
                        var5 = Sumoblitz.field_L ? 1 : 0;
                        var6 = new byte[24];
                        var2 = var6;
                        if (null == pe.field_E) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            pe.field_E.a(-7564, 0L);
                            pe.field_E.a(var6, (byte) 124);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 5;
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
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
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
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (24 <= var4) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        field_C = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(var2, (byte) -123, 24, 0);
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

    final boolean e(int param0) {
        int var2 = -48 % ((14 - param0) / 51);
        return false;
    }

    final static void a(int param0, boolean param1, int param2) {
        eh.field_a = 0;
        rc.field_k = param2;
        if (param0 != -7753) {
            field_C = null;
        }
        if (!(0 > rc.field_k)) {
            iv.field_g[rc.field_k].b(param0 + -875, param1);
        }
        if (0 == rc.field_k) {
            if (7 != nj.field_b) {
                ag.a(0, 0);
            }
        }
    }

    av(Object param0, int param1) {
        super(param1);
        ((av) this).field_D = param0;
    }

    public static void f(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 24) {
            av.f(30);
        }
    }

    final Object c(byte param0) {
        int var2 = -15 % ((37 - param0) / 58);
        return ((av) this).field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new il();
    }
}
