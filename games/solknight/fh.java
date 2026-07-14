/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static o field_f;
    static int field_a;
    static boolean[] field_d;
    static boolean field_g;
    static da field_c;
    static rj field_e;
    static int field_b;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(kk.a(91, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param0 <= 15) {
                field_g = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != 58) {
            Object var2 = null;
            pc discarded$0 = fh.a((String) null, (byte) 19);
        }
        field_d = null;
    }

    final static pc a(String param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        int var2 = param0.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param1 < 65) {
            Object var6 = null;
            pc discarded$0 = fh.a((String) null, (byte) -122);
        }
        return si.field_C;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new boolean[112];
        field_g = true;
    }
}
