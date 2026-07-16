/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String[] field_a;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        for (var5 = param0; var5 < fb.field_b.length; var5++) {
            param3 = fb.field_b[var5];
            var6 = var5 << -634199996;
            while (true) {
                int incrementValue$0 = param3;
                param3--;
                if (incrementValue$0 == 0) {
                    break;
                }
                int incrementValue$1 = var6;
                var6++;
                param4 = he.field_a[incrementValue$1];
                param2[param1[param4]] = param2[param1[param4]] + 1;
                he.field_a[param2[param1[param4]]] = param4;
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -100) {
            Object var2 = null;
            qj.a(-2, (byte[]) null, (int[]) null, 24, 76);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
