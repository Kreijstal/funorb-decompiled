/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class u {
    static vd field_f;
    static String field_e;
    static he[] field_a;
    static he[] field_c;
    static vh field_b;
    static rf field_d;

    final static int a(int param0, byte param1) {
        if (param1 != 74) {
            field_b = null;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return (param0 ^ -1) > -6145 ? -tc.field_a[6144 - param0] : tc.field_a[param0 - 6144];
        }
        return (param0 ^ -1) > -2049 ? tc.field_a[2048 + -param0] : -tc.field_a[param0 + -2048];
    }

    final static boolean a(String param0, boolean param1, String param2) {
        if (!(!oi.a(8975, param0))) {
            return false;
        }
        if (g.b((byte) 99, param0)) {
            return false;
        }
        if (kj.a(param0, (byte) 59)) {
            return false;
        }
        if (param1) {
            Object var4 = null;
            ig discarded$0 = u.a((vj) null, 120, -66);
        }
        if (!(param2.length() != 0)) {
            return true;
        }
        if (!(!rb.a(param2, param0, -1))) {
            return false;
        }
        if (!(!gk.a(-1, param2, param0))) {
            return false;
        }
        if (!pc.a((byte) -123, param2, param0)) {
            return true;
        }
        return false;
    }

    abstract void a(od param0, int param1);

    final static ig a(vj param0, int param1, int param2) {
        byte[] var4 = param0.b(param2, -2);
        byte[] var3 = var4;
        if (var4 == null) {
            return null;
        }
        if (param1 != 0) {
            field_d = null;
        }
        return new ig(var4);
    }

    final static int a(String param0, boolean param1, boolean param2) {
        if (!param2) {
            int discarded$0 = u.a(-18, (byte) 118);
        }
        if (param1) {
            return cj.field_a.b(param0);
        }
        return uj.field_i.b(param0);
    }

    final static void a(od param0, byte param1) {
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
                        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        if (param1 < -62) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_f = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var6 = new byte[24];
                        var2 = var6;
                        if (null != mi.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        param0.a(24, 0, 29211, var2);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            mi.field_f.a(0L, (byte) -63);
                            mi.field_f.a((byte) -111, var6);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_int++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var3_int < 24) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (24 <= var4) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(24, 0, 29211, var2);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
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

    public static void a(byte param0) {
        if (param0 != 50) {
            return;
        }
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    abstract db b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new vd();
        field_e = "Player";
        field_b = new vh();
    }
}
