/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static tf field_c;
    static int[] field_b;
    static int field_a;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static String a(boolean param0, int param1) {
        int var6 = Pixelate.field_H ? 1 : 0;
        String var2 = Integer.toString(param1);
        int var3 = var2.length();
        if (!(var3 > 3)) {
            return var2;
        }
        int var4 = var3 % 3;
        if (!(var4 != 0)) {
            var4 = 3;
        }
        StringBuilder var5 = new StringBuilder((var3 - var4) / 3);
        StringBuilder discarded$0 = var5.append(var2.substring(0, var4));
        var2 = var2.substring(var4);
        while (var2.length() > 0) {
            StringBuilder discarded$1 = var5.append(wl.field_f);
            StringBuilder discarded$2 = var5.append(var2.substring(0, 3));
            var2 = var2.substring(3);
        }
        return var5.toString();
    }

    final static void a(int param0, long param1, String param2, byte param3, int param4) {
        try {
            ih.field_f = param0;
            ej.field_a = param1;
            ck.field_g = param2;
            jo.field_r = true;
            kk.field_a = param4;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "di.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + 9 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
