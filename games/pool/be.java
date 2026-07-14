/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be extends ob {
    static String field_K;
    static String field_J;
    static int field_I;
    private static int field_H;
    static vh field_L;

    final static void a(ge param0, int param1) {
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
                        var5 = Pool.field_O;
                        var6 = new byte[24];
                        var2 = var6;
                        if (nl.field_c == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            nl.field_c.a(0, 0L);
                            nl.field_c.a(param1 + 114, var6);
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
                            if (-25 >= var3_int) {
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
                            if (-1 == var2[var3_int]) {
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
                            param0.a(var2, (byte) 0, param1, 24);
                            statePc = 14;
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
                        if (var4 >= 24) {
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
                        param0.a(var2, (byte) 0, param1, 24);
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

    public static void f(byte param0) {
        field_J = null;
        if (param0 != -89) {
            field_H = -35;
        }
        field_L = null;
        field_K = null;
    }

    final static void f(int param0) {
        ep.field_z = false;
        ro.field_e = false;
        lf.a(param0, (byte) 111);
        pa.field_I = aa.field_c;
        wd.field_Lb = aa.field_c;
    }

    final boolean f(int param0, int param1) {
        if (param0 != -13676) {
            field_L = null;
        }
        return param1 == ((be) this).field_h.length + -1 ? true : false;
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
            int discarded$0 = ((be) this).b((byte) 113, 90);
        }
        return ((be) this).field_s * param1 + (((be) this).field_x + (param1 != -1 + ((be) this).field_h.length ? 0 : 20));
    }

    final static void a(int param0, int param1, int param2, int param3, so[] param4, int param5, eg param6) {
        int[] var8 = mj.a(-31121);
        int[] var7 = var8;
        var8[param3] = param1;
        var8[0] = param5;
        var8[2] = param2;
        param4[0 + param0] = hc.a(param6, var8, (byte) 101);
        int[] var9 = dq.a((byte) 10, f.a((byte) 94, var8));
        var7 = var9;
        param4[param0 - -1] = hc.a(param6, var9, (byte) 101);
    }

    be(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(mc.field_k, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        if (param0 <= 36) {
            field_K = null;
        }
        super.c(92);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Cancel";
        field_H = 3;
        field_J = "More suggestions";
        field_I = 1 << field_H;
    }
}
