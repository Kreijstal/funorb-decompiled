/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qra extends rqa {
    static int[] field_p;
    static int field_o;

    final static void a(int param0) {
        Exception exception = null;
        File var1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == wqb.field_e) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var1 = null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var1 = lfb.a(ata.field_L, (byte) 34);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    exception = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param0 <= -95) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (var1 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    fkb.a(67, (Object) (Object) wqb.field_e, var1);
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(132, 62, param0[0].a(12));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        if (param0 != -80) {
            field_p = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[1];
        field_o = 50;
    }
}
