/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -50) {
            Object var2 = null;
            ei.a(true, -72, (am) null);
        }
    }

    final static void a(boolean param0, int param1, am param2) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        hj var7 = ff.field_D;
        hj var8 = var7;
        var8.a(!param0 ? true : false, param1);
        var8.field_h = var8.field_h + 1;
        int var4 = var8.field_h;
        var8.f(6389, 1);
        var8.c(param2.field_p, -159688920);
        var8.c(param2.field_j, -159688920);
        var8.c(param2.field_i, -159688920);
        var8.a(-117, param2.field_g);
        if (!param0) {
            field_a = null;
        }
        var8.a(-124, param2.field_k);
        var8.a(-119, param2.field_h);
        var8.a(-119, param2.field_l);
        var8.f(6389, param2.field_m.length);
        for (var5 = 0; var5 < param2.field_m.length; var5++) {
            var7.a(-117, param2.field_m[var5]);
        }
        int discarded$0 = var8.d(var4, -1323322296);
        var8.a((byte) -42, var8.field_h - var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
