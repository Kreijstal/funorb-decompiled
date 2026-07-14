/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hq {
    static char[] field_b;
    static ru[] field_a;
    static String field_c;
    static String field_d;
    static int field_f;
    static int field_e;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -50) {
            return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, boolean param9, String param10, hd param11, long param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        mg.field_e = new bv(param3);
                        vl.field_n = new bv(param1);
                        io.field_t = param5;
                        k.field_c = param10;
                        if (!param9) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        stackOut_1_0 = 1;
                        stackIn_3_0 = stackOut_1_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 2: {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        aw.field_l = stackIn_3_0 != 0;
                        sm.field_c = param2;
                        wj.field_n = param11;
                        rn.field_d = param8;
                        if (!param4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        stackOut_4_0 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 5: {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ul.field_a = stackIn_6_0 != 0;
                        an.field_E = param12;
                        fu.field_d = param0;
                        fl.field_e = param13;
                        ng.field_v = param6;
                        if (null != wj.field_n.field_m) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        hq.a(58, -109, 31, 35, false, 42, -98, -22, -122, true, (String) null, (hd) null, -46L, 85);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            le.field_d = new ue(wj.field_n.field_m, 64, 0);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        if (param7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        hq.a(58, -109, 31, 35, false, 42, -98, -22, -122, true, (String) null, (hd) null, -46L, 85);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        var15 = (IOException) (Object) caughtException;
                        throw new RuntimeException(var15.toString());
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
        field_b = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_d = "Previous";
        field_f = 64;
        field_c = "Drawn";
    }
}
