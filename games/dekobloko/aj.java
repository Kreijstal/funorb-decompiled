/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static w field_a;
    static String field_b;
    static ck field_c;
    static mm field_e;
    static mm field_d;

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            java.net.URL var3_ref_java_net_URL = null;
            try {
                var3_ref_java_net_URL = new java.net.URL(param2.getCodeBase(), param0);
                var3_ref_java_net_URL = gn.a(var3_ref_java_net_URL, -1, param2);
                c.a((byte) 92, var3_ref_java_net_URL.toString(), true, param2);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            int var3 = 92 / ((44 - param1) / 48);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        pk.field_r = 0;
        if (param0 != -1045) {
            return;
        }
        v.b(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> has left the lobby.";
    }
}
