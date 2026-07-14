/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends dq {
    static String field_P;
    static dk field_ib;
    String field_gb;
    String field_jb;
    int field_kb;
    static String field_hb;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            if (param2 != -103) {
                return;
            }
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = td.a((byte) 125, param1, var3);
                kj.a(param2 ^ 23067, param1, true, var3.toString());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            field_P = null;
            field_ib = null;
            field_hb = null;
            field_P = null;
            return;
        }
        field_ib = null;
        field_hb = null;
        field_P = null;
    }

    final static void a(float param0, ab param1, int param2, byte[] param3, int param4, float param5, float param6, float param7, int param8, float param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = Sumoblitz.field_L ? 1 : 0;
        if (param8 != 24046) {
            return;
        }
        for (var13 = 0; var13 < param11; var13++) {
            ls.a(param0, param6, param2, param10, param3, var13, param7, param11, -95, param12, param4, param9, param1, param5);
            param2 = param2 + param10 * param12;
        }
    }

    cn() {
        super(0L, (dq) null);
    }

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param1;
        int var3 = vs.a((byte) -117, var10, param0);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        if (param2 != -27224) {
            int discarded$0 = cn.c(39, 126);
            for (var7 = 0; var3 > var7; var7++) {
                for (var8 = var6; param0 != param1.charAt(var8); var8++) {
                }
                var5++;
                var4[var5] = param1.substring(var6, var8);
                var6 = 1 + var8;
            }
            var4[var3] = param1.substring(var6);
            return var4;
        }
        for (var7 = 0; var3 > var7; var7++) {
            for (var8 = var6; param0 != param1.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param1.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    final static int c(int param0, int param1) {
        if (param0 != 0) {
            field_hb = null;
            param1 = param1 & 8191;
            if (-4097 >= (param1 ^ -1)) {
                return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
            }
            return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
        }
        param1 = param1 & 8191;
        if (-4097 >= (param1 ^ -1)) {
            return 6144 <= param1 ? ce.field_p[param1 - 6144] : -ce.field_p[-param1 + 6144];
        }
        return 2048 > param1 ? ce.field_p[-param1 + 2048] : -ce.field_p[-2048 + param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_ib = new dk();
        field_hb = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
