/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static tu field_a;
    static int field_f;
    static fl field_c;
    static int field_e;
    static je field_g;
    static byte[] field_b;
    static wk[] field_d;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_g = null;
        field_b = null;
    }

    final static int a(String param0, String[] param1, byte param2) {
        int var5 = 0;
        String var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == null) {
            return -1;
        }
        int var3 = param1.length;
        int var4 = 64 % ((param2 - 80) / 35);
        for (var5 = 0; var5 < var3; var5++) {
            var6 = param1[var5];
            if (!(!param0.equals((Object) (Object) var6))) {
                return var5;
            }
        }
        return -1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                if (param0 != -118) {
                    Object var6 = null;
                    int discarded$0 = t.a((String) null, (String[]) null, (byte) -128);
                }
                var2 = param1.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!(-1 < (var3 ^ -1))) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(ck.a(-3780, var5, param1), "_self");
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
        field_f = -1;
        field_e = 0;
    }
}
