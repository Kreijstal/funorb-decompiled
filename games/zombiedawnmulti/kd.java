/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String[] field_c;
    static cj field_a;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2791) {
            return;
        }
        field_a = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0.length();
        int var3 = 0;
        int var4 = 96 / ((65 - param1) / 49);
        for (var5 = 0; var2 > var5; var5++) {
            var3 = bd.a(param0.charAt(var5), (byte) -68) + (-var3 + (var3 << 247643621));
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = 0;
    }
}
