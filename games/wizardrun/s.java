/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static db[] field_c;
    static od field_b;
    static o field_a;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var10 = null;
        CharSequence var4_ref_CharSequence = null;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = wizardrun.field_H;
        if (param3 > -60) {
            return null;
        }
        if (!((param0 ^ -1) != -1)) {
            return "";
        }
        if (-2 == (param0 ^ -1)) {
            var10 = param1[param2];
            var4_ref_CharSequence = var10;
            if (!(var4_ref_CharSequence != null)) {
                return "null";
            }
            return ((Object) (Object) var10).toString();
        }
        int var4 = param0 + param2;
        int var5 = 0;
        for (var6_int = param2; var4 > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence != null) {
                var5 = var5 + var7_ref_CharSequence.length();
            } else {
                var5 += 4;
            }
        }
        StringBuilder var6 = new StringBuilder(var5);
        for (var7 = param2; (var7 ^ -1) > (var4 ^ -1); var7++) {
            var8 = param1[var7];
            if (var8 != null) {
                StringBuilder discarded$1 = var6.append(var8);
            } else {
                StringBuilder discarded$2 = var6.append("null");
            }
        }
        return var6.toString();
    }

    public static void a(int param0) {
        if (param0 != 540) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new o(540, 140);
    }
}
