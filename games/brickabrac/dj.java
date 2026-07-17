/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class dj {
    static int field_d;
    static String field_h;
    static jp[] field_f;
    static jp field_e;
    static jp field_a;
    static int field_g;
    static bn field_c;
    static int field_b;

    final int a(long param0, byte param1) {
        long var4 = 0L;
        var4 = ((dj) this).d((byte) 107);
        if (var4 <= 0L) {
          if (param1 != -71) {
            return 106;
          } else {
            return ((dj) this).a(15, param0);
          }
        } else {
          wj.a(-124, var4);
          if (param1 != -71) {
            return 106;
          } else {
            return ((dj) this).a(15, param0);
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(0 != param0)) {
            return 0;
        }
        if (0 < param0) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (param0 > 255) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(1 >= param0)) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (!(param0 >= -256)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param0 < -16) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(-4 <= param0)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    abstract void a(int param0);

    final static boolean c(byte param0) {
        int var1 = 15 % ((81 - param0) / 36);
        hk.field_R = true;
        cg.field_i = 15000L + ue.a(false);
        return i.field_j == 11 ? true : false;
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_c = null;
        field_h = null;
        field_e = null;
        int var1 = 0;
    }

    abstract long d(byte param0);

    abstract int a(int param0, long param1);

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            String stackOut_5_0 = null;
            String stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = param1.getParameter("cookieprefix");
                            var3 = var2 + "settings";
                            var4 = (String) ne.a("getcookies", -125, param1);
                            var5 = qb.a((byte) 123, var4, ';');
                            var6 = 0;
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
                            if (var5.length <= var6) {
                                statePc = 10;
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
                            var7 = var5[var6].indexOf('=');
                            if (0 > var7) {
                                statePc = 7;
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2_ref = caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (wp.field_d != null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            return param1.getParameter("settings");
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = wp.field_d;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_14_0 = (RuntimeException) var2_ref2;
                        stackOut_14_1 = new StringBuilder().append("dj.G(").append(1).append(44);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param1 == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
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

    final static void b() {
        kd.field_d = new String[rg.field_a];
        kd.field_d[18] = ta.field_c;
        kd.field_d[4] = fd.field_a;
        kd.field_d[16] = oj.field_o;
        kd.field_d[21] = br.field_Rb;
        kd.field_d[5] = k.field_i;
        kd.field_d[15] = tk.field_i;
        kd.field_d[9] = sh.field_b;
        kd.field_d[6] = pg.field_i;
        kd.field_d[20] = c.field_n;
        kd.field_d[7] = nk.field_i;
        kd.field_d[17] = pb.field_l;
        kd.field_d[19] = tq.field_g;
        kd.field_d[13] = ed.field_a;
        kd.field_d[11] = bl.field_I;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
    }
}
