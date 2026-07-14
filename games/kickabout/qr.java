/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qr {
    static String field_c;
    static String field_f;
    static int[] field_e;
    static String field_a;
    static String field_d;
    static String field_g;
    static hd[] field_b;

    final static void a(int param0) {
        int var4 = Kickabout.field_G;
        if (param0 <= 31) {
            field_a = null;
        }
        int[] var5 = vu.field_zb;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        if (param2 != 3) {
            return null;
        }
        String var3 = null;
        String var4 = null;
        if (wk.field_b != null) {
            if (!(wk.field_b.equals((Object) (Object) param0.getParameter("settings")))) {
                var3 = wk.field_b;
                var4 = var3;
                var4 = var3;
            }
        }
        if (lu.field_t != null) {
            if (!lu.field_t.equals((Object) (Object) param0.getParameter("session"))) {
                var4 = lu.field_t;
            }
        }
        return rt.a(param1, var4, -1, var3, false);
    }

    final static int a(int param0, byte param1) {
        if (param1 != -1) {
            field_f = null;
        }
        return (int)((double)((-320 + param0 << 559870344) / hw.field_i) + hd.field_K);
    }

    final static void a(int param0, iw param1) {
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
                        var5 = Kickabout.field_G;
                        var6 = new byte[param0];
                        var2 = var6;
                        if (pd.field_G == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            pd.field_G.a((byte) 4, 0L);
                            pd.field_G.a(param0 ^ 64, var6);
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
                            if (0 == var2[var3_int]) {
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
                            if (-25 >= (var3_int ^ -1)) {
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
                            param1.a(0, 24, param0 ^ 1991220136, var2);
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
                        if (-25 >= (var4 ^ -1)) {
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
                        param1.a(0, 24, param0 ^ 1991220136, var2);
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

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_g = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_a = "When EXP reaches 100% you can spend it on a stat point!";
        field_e = new int[3];
        field_d = "<%0> must play 1 more rated game before playing with the current options.";
        field_e[0] = 14;
        field_e[1] = 18;
        field_e[2] = 21;
        field_g = "Tournament Lobby";
    }
}
