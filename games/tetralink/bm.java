/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bm extends mc {
    static int field_q;
    int field_t;
    static String field_s;
    int field_r;
    static int field_n;
    static int field_p;
    static String field_o;

    public static void b(byte param0) {
        if (param0 < 57) {
            return;
        }
        field_s = null;
        field_o = null;
    }

    final static kl a(int param0, int param1, int param2, int param3, int param4, ie param5) {
        java.awt.Frame var8 = sk.a(param2, param5, 10, param3, param4, param0);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        kl var7 = new kl();
        var7.field_d = var8;
        java.awt.Component discarded$0 = var7.field_d.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, param1, param3, param0);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    private bm() throws Throwable {
        throw new Error();
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
                        var3 = TetraLink.field_J;
                        if (null == vh.field_e) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        vh.field_e.a((byte) 80);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != qc.field_X) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        qc.field_X.b(-23641);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == ch.field_r) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ch.field_r.a(param0 ^ 25675);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0 == -25676) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        field_s = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != ok.field_b) {
                            statePc = 13;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var1 >= ok.field_b.length) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (ok.field_b[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ok.field_b[var1].a(-1);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
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

    final static void b(int param0, int param1) {
        if ((param1 ^ -1) != param0) {
            throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Name";
    }
}
