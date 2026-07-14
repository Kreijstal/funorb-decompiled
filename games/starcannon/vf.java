/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vf {
    static boolean field_b;
    static String field_a;

    final static sk a(String param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = StarCannon.field_A;
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param1 >= -13) {
            Object var6 = null;
            boolean discarded$0 = vf.a((rb) null, -44);
        }
        return ra.field_t;
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = StarCannon.field_A;
                        if (null == jh.field_b) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        jh.field_b.a(-4628);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (bc.field_j == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        bc.field_j.a(6843);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (param0 >= 52) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var4 = null;
                        sk discarded$3 = vf.a((String) null, (byte) -52);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == ne.field_l) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ne.field_l.a(40);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (fe.field_J != null) {
                            statePc = 12;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var1 >= fe.field_J.length) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (fe.field_J[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            fe.field_J[var1].a(49);
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
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 13;
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

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            vf.a(false);
        }
    }

    final static boolean a(rb param0, int param1) {
        if (param1 != 0) {
            field_a = null;
        }
        int var2 = param0.j(7909);
        int var3 = var2 != 1 ? 0 : 1;
        return var3 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = "Paragulan homeworld destroyed<br><br>Level 4<br>Earth is under attack<br>Defeat the Paragulan revenge fleet";
    }
}
