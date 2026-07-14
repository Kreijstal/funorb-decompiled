/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qja extends bf {
    nq field_i;

    final static void a(int param0) {
        fr.field_n = false;
        wba.field_a = null;
        ta.field_b = null;
        if (param0 != 0) {
            return;
        }
        vka.field_p = null;
        mq.field_a = null;
    }

    final static void b(int param0, lu param1) {
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
                        var5 = BachelorFridge.field_y;
                        var6 = new byte[param0];
                        var2 = var6;
                        if (vg.field_n != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        param1.a(0, param0 + -103, 24, var2);
                        return;
                    }
                    case 2: {
                        try {
                            vg.field_n.a(0L, (byte) -114);
                            vg.field_n.a((byte) -102, var6);
                            var3_int = 0;
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
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 6;
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
                            if (0 != var6[var3_int]) {
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
                            var3_int++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (24 <= var3_int) {
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
                            param1.a(0, param0 + -103, 24, var2);
                            return;
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
                        param1.a(0, param0 + -103, 24, var2);
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

    final void a(op param0, int param1) {
        if (param1 != -26281) {
            ((qja) this).field_i = null;
        }
    }

    qja(nq param0) {
        ((qja) this).field_i = param0;
    }

    final void a(int param0, lu param1) {
        er.a(((qja) this).field_i, 123, param1);
        int var3 = -82 / ((param0 - -53) / 50);
    }

    qja(lu param0) {
        ((qja) this).field_i = qi.a(param0, (byte) 19);
    }

    static {
    }
}
