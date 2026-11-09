/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionReplySender {
    static String[] loadingTextTranslations;

    final static void sendReflectionReplies(int opcode) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = InwardSparkParticle.field_v;
          while (Js5Client.nextReflectionCheckReady((byte) 125)) {
            var1.writeCipherByte(8, opcode ^ 0);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            SoftLruCache.writeReflectionReply(var1, opcode + 119);
            InwardSparkParticle.field_v.patchByteLength(var1.position - var2, -13745);
          }
          if (opcode == 8) {
            return;
          }
          loadingTextTranslations = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "qi.B(" + opcode + ')');
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
