/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jl {
    static java.util.zip.CRC32 field_a;
    static cn field_c;
    static String field_b;
    static int field_d;

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(j.a((byte) 104, var2, param0), "_top");
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        jl.a((byte) 127);
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

    final static boolean a(wj param0, int param1) {
        int var2 = 56 / ((param1 - -57) / 60);
        return (param0.j(-55, 1) ^ -1) == -2 ? true : false;
    }

    public static void a(byte param0) {
        if (param0 > -49) {
          field_b = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.util.zip.CRC32();
        field_b = "Mercenary Knight";
    }
}
