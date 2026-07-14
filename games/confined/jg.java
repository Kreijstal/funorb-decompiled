/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class jg {
    static String field_a;
    static nf field_g;
    static bm[] field_d;
    static Calendar field_c;
    static int[] field_f;
    static bi field_e;
    static double[] field_b;

    abstract void a(byte param0);

    final static ce a(int param0, byte[] param1) {
        if (param1 == null) {
            return null;
        }
        if (param0 != 2563) {
            return null;
        }
        ce var2 = new ce(param1, jl.field_p, ij.field_r, rg.field_I, sd.field_f, rj.field_f);
        ql.a(false);
        return var2;
    }

    final static void a(kg param0, int param1) {
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
                        var5 = Confined.field_J ? 1 : 0;
                        var6 = new byte[param1];
                        var2 = var6;
                        if (bg.field_b == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            bg.field_b.a((byte) 123, 0L);
                            bg.field_b.a(var6, (byte) -4);
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
                            if (-25 >= (var3_int ^ -1)) {
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
                            if ((var3_int ^ -1) <= -25) {
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
                            param0.a(24, 0, var2, param1 ^ 119);
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
                        if ((var4 ^ -1) <= -25) {
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
                        param0.a(24, 0, var2, param1 ^ 119);
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

    abstract long a(int param0);

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_f = null;
        int var1 = 121 % ((64 - param0) / 39);
        field_c = null;
        field_g = null;
        field_a = null;
    }

    final int b(int param0, long param1) {
        if (param0 != 0) {
            return 102;
        }
        long var4 = ((jg) this).a(10);
        if (!(-1L <= (var4 ^ -1L))) {
            jd.a(1, var4);
        }
        return ((jg) this).a(-25, param1);
    }

    final static void b(int param0) {
        tk.field_e = null;
        fj.field_s = null;
        if (param0 != 15229) {
            field_e = null;
        }
        tf.field_d = null;
        jc.field_d = null;
        in.field_h = false;
    }

    abstract int a(int param0, long param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_f = new int[]{14, -1, 0, 1, -1, 10, 3};
        field_b = new double[]{0.0, -256.0, 0.0};
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
