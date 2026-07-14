/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(int param0) {
        int var4 = CrazyCrystals.field_B;
        dl var1 = new dl(540, 140);
        em.a((byte) 38, var1);
        nb.b();
        kh.a();
        sn.field_c = 0;
        ja.d((byte) -67);
        dl var2 = var1.d();
        int var3 = 0;
        if (param0 > -66) {
            on.a((byte) -56);
        }
        while ((var3 ^ -1) > -16) {
            var2.g(-2, -2, 16777215);
            kh.c(4, 4, 0, 0, 540, 140);
            var3++;
        }
        eq.field_k.a();
        var1.b(0, 0);
        lg.a(1);
    }

    public static void a(byte param0) {
        if (param0 >= -84) {
            on.a((byte) -80);
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var3 = null;
            try {
                int var2_int = 10 % ((-8 - param0) / 55);
                var3 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(gh.a(param1, var3, (byte) 67), "_top");
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
        field_a = "Names cannot start or end with space or underscore";
        field_b = 4;
        field_c = "Unfortunately you are not eligible to create an account.";
    }
}
