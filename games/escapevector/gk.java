/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk {
    static Random field_a;
    static String field_b;
    static boolean field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -1 / ((-32 - param0) / 60);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != -9787) {
                    field_c = true;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(sh.a((byte) 114, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
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
        field_b = "Crate";
        field_a = new Random();
        field_c = true;
    }
}
