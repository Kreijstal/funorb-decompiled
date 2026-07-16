/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static boolean field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != -11709) {
            field_b = false;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        if (param1 < 49) {
            return true;
        }
        if (param0 != null) {
            if (param0.length() >= sa.field_i) {
                if (param0.length() <= sg.field_d) {
                    return false;
                }
            }
        }
        return true;
    }

    final static String[] a(String param0, char param1, boolean param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param0;
        int var3 = m.a(0, param1, var10);
        String[] var4 = new String[1 + var3];
        if (!param2) {
            field_a = null;
        }
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0.charAt(var8) != param1; var8++) {
            }
            int incrementValue$0 = var5;
            var5++;
            var4[incrementValue$0] = param0.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "to over <%0> great games";
    }
}
