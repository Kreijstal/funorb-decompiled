/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static cg field_c;
    static String field_b;
    static ub field_a;

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = stellarshard.field_B;
        if (param2 != 10287) {
            return null;
        }
        CharSequence var10 = (CharSequence) (Object) param1;
        int var3 = dc.a(var10, 2, param0);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0 != param1.charAt(var8); var8++) {
            }
            int incrementValue$0 = var5;
            var5++;
            var4[incrementValue$0] = param1.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -69) {
            field_c = null;
        }
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(lk.a(param1, var2, -109), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param0 <= 96) {
                Object var3 = null;
                qj.a((byte) 36, (java.applet.Applet) null);
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
        field_c = new cg();
        field_b = "You are not currently logged in to the<nbsp>game.";
    }
}
