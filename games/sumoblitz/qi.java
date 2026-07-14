/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String[] field_a;

    final static void a(int param0) {
        pl var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var1 = as.field_v;
        L0: while (true) {
          if (!gd.b((byte) 125)) {
            if (param0 != 8) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            var1.g(8, param0 ^ 0);
            var1.field_p = var1.field_p + 1;
            var2 = var1.field_p + 1;
            sd.a(var1, param0 + 119);
            as.field_v.c(var1.field_p + -var2, -13745);
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 16) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
