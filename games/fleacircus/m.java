/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static volatile int field_a;
    static ll field_b;
    static int[] field_c;

    final static String[] a(char param0, int param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = ei.a(-78, var10, param0);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        if (param1 < 113) {
            return null;
        }
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    public static void a(int param0) {
        if (param0 <= 70) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, String[] param1) {
        if (ol.field_d != null) {
            ol.field_d.field_N.a(param1, -69);
        }
        if (!(null == uc.field_e)) {
            uc.field_e.field_H.a(param1, -102);
        }
        if (param0 >= -20) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_a = 0;
    }
}
