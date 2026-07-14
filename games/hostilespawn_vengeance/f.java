/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class f implements nn {
    static bd field_d;
    static String[][] field_a;
    static String field_c;
    static bd field_b;

    final static void a(int param0, int param1, p param2, int param3) {
        dn.a(param2.field_e / param3, uf.field_e, uf.field_d, param0, -1, param1);
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -90) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        if (param2 != 15430) {
            return;
        }
        int var6 = param3.field_v + param1;
        int var7 = param0 + param3.field_m;
        ij.a(param3.field_x, param3.field_s, var7, var6, false);
        bd var8 = cf.field_u[1];
        if (param3 instanceof ph) {
            if (!(!((ph) (Object) param3).field_A)) {
                var8.c(var6 + (1 + (param3.field_s - var8.field_u >> -661236991)), (-var8.field_r + param3.field_x >> -1156139647) + (var7 + 1), 256);
            }
        }
        if (param3.g(-9015)) {
            bh.a(param3.field_x - 4, 2 + var7, (byte) 65, 2 + var6, param3.field_s + -4);
        }
    }

    final static boolean a(byte param0) {
        if (rc.field_c == null) {
            return false;
        }
        if (param0 != 119) {
            Object var2 = null;
            f.a(74, (vi) null);
        }
        eh.field_c.a((tj) (Object) rc.field_c);
        rc.field_c = null;
        return true;
    }

    final static void a(int param0, vi param1) {
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
                        var5 = HostileSpawn.field_I ? 1 : 0;
                        var6 = new byte[param0];
                        var2 = var6;
                        if (q.field_b == null) {
                            statePc = 12;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            q.field_b.a(0L, (byte) 117);
                            q.field_b.a(var6, (byte) -117);
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
                                statePc = 6;
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
                            if (0 == var2[var3_int]) {
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
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
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
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var3_int < 24) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
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
                        if (var4 >= 24) {
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
                        param1.a(24, var2, true, 0);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[][]{new String[11], new String[11]};
        field_c = "Retry mission";
    }
}
