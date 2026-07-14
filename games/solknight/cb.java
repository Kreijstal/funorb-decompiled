/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends IOException {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = -3 % ((-38 - param0) / 59);
        field_b = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (i.field_J != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == -15) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_b = null;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) i.field_J;
                    // monitorenter i.field_J
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        i.field_J = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == -15) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_b = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        ce.field_f = null;
        if (param0 != 32) {
            return;
        }
        rc.field_r = null;
    }

    cb(String param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (wc.field_a >= 224) {
          ah.a((byte) -103, 256);
          if (param0 == -39) {
            return;
          } else {
            cb.b(-18);
            return;
          }
        } else {
          var1 = wc.field_a % 32;
          ah.a((byte) -69, 32 + (wc.field_a - var1));
          if (param0 == -39) {
            return;
          } else {
            cb.b(-18);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Age:";
    }
}
