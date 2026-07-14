/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo {
    static String field_e;
    private bc field_f;
    private bc field_h;
    private ol field_b;
    static qr field_a;
    static String field_d;
    static String field_c;
    static String[] field_g;

    public static void a(boolean param0) {
        field_g = null;
        field_c = null;
        field_e = null;
        if (!param0) {
            jo.a(false);
        }
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, ob param1) {
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
                        var5 = ShatteredPlansClient.field_F ? 1 : 0;
                        var6 = new byte[param0];
                        var2 = var6;
                        if (vc.field_a != null) {
                            statePc = 2;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            vc.field_a.a((byte) 95, 0L);
                            vc.field_a.a(var6, true);
                            var3_int = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            param1.a(0, 24, var2, 22186);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var4 >= 24) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        param1.a(0, 24, var2, 22186);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
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

    final static void a(int param0, gh param1, boolean param2, int param3) {
        if (param0 != 32767) {
            Object var5 = null;
            jo.a(6, (gh) null, false, -66);
        }
        u.field_b.a(1000000, 256, (byte) -121, !param2 ? true : false, param3, param1);
    }

    jo(int param0, bc param1, bc param2) {
        ((jo) this).field_b = new ol(64);
        ((jo) this).field_h = param2;
        ((jo) this).field_f = param1;
        if (((jo) this).field_f != null) {
            int discarded$0 = ((jo) this).field_f.a(0, -26268);
        }
        if (((jo) this).field_h != null) {
            int discarded$1 = ((jo) this).field_h.a(0, -26268);
        }
    }

    final si a(int param0, byte param1) {
        byte[] var4 = null;
        if (param1 != 100) {
            Object var5 = null;
            jo.a(71, (gh) null, true, -32);
        }
        si var3 = (si) ((jo) this).field_b.a((long)param0, param1 + -100);
        if (!(var3 == null)) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = ((jo) this).field_f.a(0, -1, param0);
        } else {
            var4 = ((jo) this).field_h.a(0, param1 ^ -101, param0 & 32767);
        }
        si var6 = new si();
        if (var4 != null) {
            var6.a(new ob(var4), -1);
        }
        if (!((param0 ^ -1) > -32769)) {
            var6.e(-81);
        }
        ((jo) this).field_b.a((long)param0, (Object) (Object) var6, (byte) -108);
        return var6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[16];
        field_c = "Game";
        field_e = "Match by...";
    }
}
