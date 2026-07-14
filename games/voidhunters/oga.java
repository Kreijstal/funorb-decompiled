/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oga extends rqa {
    static int field_o;

    oga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            Object var4 = null;
            nc discarded$0 = ((oga) this).a((nc[]) null, 8);
        }
        return new nc((Object) (Object) frb.a(32, 118));
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        if (param0 <= 27) {
            boolean discarded$0 = oga.a(23, 89, -52, 81, -123, -26, false);
        }
        if (!(!wq.e((byte) 105))) {
            gaa.a(param2, 11343, param4, param6);
            if (null != cka.field_o) {
                if (cka.field_o.a(param6, -11, param1, param4, param3)) {
                    lnb.d(0);
                    param6 = false;
                }
            }
            jra.a(param4, param6, 19717);
            oj.a((byte) -127, param6, param5);
            param6 = false;
        }
        return param6;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 >= 32) {
            if (!(param0 > 126)) {
                return true;
            }
        }
        if (160 <= param0) {
            if (!(param0 > 255)) {
                return true;
            }
        }
        if (param0 != 8364) {
            // if_icmpeq L78
            // if_icmpeq L78
            // if_icmpeq L78
            // if_icmpeq L78
        } else {
            return true;
        }
        if (param1 != 32) {
            return false;
        }
        return false;
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = VoidHunters.field_G;
                        if (param0 == 16928) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_o = -75;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (ff.field_o == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        ff.field_o.a(116);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (nj.field_a == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        nj.field_a.a(23474);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (cba.field_e != null) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            cba.field_e.a(true);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != btb.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var1 >= btb.field_d.length) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (null != btb.field_d[var1]) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            btb.field_d[var1].a(true);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
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
        field_o = 0;
    }
}
