/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ed extends ca {
    static int field_v;
    int field_x;
    static th field_q;
    int field_p;
    int field_s;
    int field_u;
    int field_w;
    int field_r;
    static String[] field_t;

    public static void c(int param0) {
        field_q = null;
        field_t = null;
        if (param0 >= -31) {
            field_v = -74;
        }
    }

    final static void a(int param0, wf param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            Object var6 = null;
            byte[] var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Lexicominos.field_L ? 1 : 0;
                        var7 = new byte[24];
                        var2 = var7;
                        if (null == kf.field_y) {
                            statePc = 12;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            kf.field_y.a((byte) 40, 0L);
                            kf.field_y.a(var7, 0);
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
                            if (24 <= var3_int) {
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
                            if (var7[var3_int] != 0) {
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
                            if (-25 >= var3_int) {
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
                            statePc = 12;
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
                        if (-25 <= var4) {
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
                        if (param0 > 79) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var6 = null;
                        ed.a(-106, (wf) null);
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        param1.a(0, var2, 255, 24);
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

    final static void a(int param0, sh param1) {
        sd.b(param1.a((byte) 127, "", "headers.packvorbis"));
        if (param0 != 0) {
            ed.c(-110);
        }
        sd var2 = sd.a(param1, "jagex logo2.packvorbis", "");
        ke discarded$0 = var2.c();
    }

    final static eb[] a(sh param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eb var7 = null;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        eb[] var2 = new eb[64];
        if (!param1) {
            field_q = null;
        }
        wf var3 = new wf(param0.a((byte) 127, "", "index"));
        while (var3.field_j.length > var3.field_h) {
            var4 = var3.d(true);
            var5 = var3.b(-1698573656);
            var6 = var3.d(true);
            var7 = new eb(var4, var3.b(-1698573656));
            var2[var7.field_g] = var7;
            for (var8 = 0; var8 < var7.field_c.length; var8++) {
                var7.field_c[var8][0] = var3.c(false);
                var7.field_c[var8][1] = var3.c(false);
            }
            var7.a(new wf(param0.a(var5, -27493, var6)), (byte) 96);
        }
        return var2;
    }

    ed() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
    }
}
