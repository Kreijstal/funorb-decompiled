/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String[] field_a;

    final static void a(int param0) {
        pl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var1 = as.field_v;
            L1: while (true) {
              if (!gd.b((byte) 125)) {
                break L0;
              } else {
                var1.g(8, 8);
                int fieldTemp$2 = var1.field_p + 1;
                var1.field_p = var1.field_p + 1;
                var2 = fieldTemp$2;
                sd.a(var1, 127);
                as.field_v.c(var1.field_p + -var2, -13745);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1_ref, "qi.B(" + 8 + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
