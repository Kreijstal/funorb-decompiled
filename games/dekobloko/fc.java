/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fc {
    static w field_f;
    static int[] field_d;
    static w field_c;
    static int[] field_b;
    static long field_h;
    static int field_a;
    static String field_g;
    static int field_e;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        Object var5 = null;
        L0: {
          fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, (mm) (Object) w.field_kb);
          param0 += 26;
          fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[0].c(122 + param3, param0);
          param0 += 16;
          fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 - -4, (mm) (Object) se.field_S);
          ph.field_yb[1].c(param3 + 122, param0);
          param0 += 23;
          if (param1 == 5) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$1 = fc.a((byte) 7, (String) null);
            break L0;
          }
        }
        L1: {
          fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[3].c(122 + param3, param0);
          param0 += 16;
          fl.a(param0 - -12, 256, 16777215, vk.field_b[3], 4 + param3, (mm) (Object) se.field_S);
          ph.field_yb[2].c(param3 + 100, param0);
          ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, (mm) (Object) se.field_S);
          ph.field_yb[4].c(122 + param3, param0);
          param0 += 23;
          fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 - -4, (mm) (Object) se.field_S);
          ph.field_yb[5].c(122 + param3, param0);
          param0 += 23;
          if (param2) {
            fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, (mm) (Object) se.field_S);
            ph.field_yb[6].c(param3 + 122, param0);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
            param1 = false;
        }
        cg.b(param1, 1);
        ub.a((byte) 54);
        if (param0 != 5) {
            field_g = null;
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            return;
        }
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1, int param2) {
        int var7 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = client.field_A ? 1 : 0;
        ck[] var3 = new ck[param0];
        int[] var4 = param1.field_D;
        int var5 = param1.field_K / param0;
        if (param2 != -10241) {
            return null;
        }
        int var6 = param1.field_I - var5;
        for (var7 = 0; var7 < param0; var7++) {
            var3[var7] = new ck(var5, param1.field_H);
            var8 = new ck(var5, param1.field_H);
            var9 = var8.field_D;
            var10 = var7 * var5 + param1.field_F;
            var11 = param1.field_z;
            var12 = var11 * var5 + var10;
            var13 = 0;
            for (var14 = -param1.field_H; var14 > -1; var14++) {
                for (var15 = -var5; -1 > var15; var15++) {
                    var13++;
                    var12++;
                    var9[var13] = var4[var12];
                }
                var12 = var12 + var6;
            }
        }
        return var3;
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!fd.field_d.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.startsWith("https://")) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 >= param1.length()) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0 != (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        if (param0 == -19) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            int var2 = 0;
            IOException var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = client.field_A ? 1 : 0;
                        if (ta.field_k == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ta.field_k.d((byte) 117);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (qb.field_r == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        qb.field_r.a((byte) -98);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != mk.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            mk.field_d.c((byte) 124);
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
                        var1 = -32 % ((param0 - -41) / 50);
                        if (null != ig.field_cc) {
                            statePc = 11;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (ig.field_cc.length <= var2) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (ig.field_cc[var2] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ig.field_cc[var2].c((byte) 125);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 17: {
                        var3 = (IOException) (Object) caughtException;
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
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
        field_d = new int[8192];
        field_g = "Cancel";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
