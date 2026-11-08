/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String[] loadingTextTranslations;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        pl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = as.field_v;
          while (gd.b((byte) 125)) {
            var1.g(8, param0 ^ 0);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            sd.a(var1, param0 + 119);
            as.field_v.c(var1.position - var2, -13745);
          }
          if (param0 == 8) {
            return;
          }
          loadingTextTranslations = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "qi.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 16) {
          loadingTextTranslations = (String[]) null;
          loadingTextTranslations = null;
          return;
        }
        loadingTextTranslations = null;
    }

    static {
        loadingTextTranslations = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
