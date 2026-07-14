/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static ok field_c;
    static he field_b;
    static he[] field_a;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (!param0) {
            field_a = null;
        }
    }

    final static String[] a(byte param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = tf.a(var10, param1, 16752);
        if (param0 > -79) {
            field_b = null;
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2.charAt(var8) != param1; var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    static {
    }
}
