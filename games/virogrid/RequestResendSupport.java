/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RequestResendSupport {
    static String field_c;
    static int[] field_d;
    static String textSwitch3d;
    static String[] field_b;
    static String field_f;
    static int field_e;

    final static void resendQueuedRequests(int param0, byte param1) {
        int var3 = 0;
        PendingHighscoreRequest var4 = null;
        PendingScoreQuery var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 < 23) {
            field_f = (String) null;
          }
          var4 = (PendingHighscoreRequest) (DialWidget.field_P.first((byte) -49));
          while (var4 != null) {
            ScoreSubmissionHelpers.writeScoreSubmission(param0, 1, var4);
            var4 = (PendingHighscoreRequest) (DialWidget.field_P.next(16213));
          }
          var5 = (PendingScoreQuery) (LobbySessionHelpers.field_a.first((byte) -27));
          while (var5 != null) {
            TextEncodingHelpers.sendListRequest(-26039, var5, param0);
            var5 = (PendingScoreQuery) (LobbySessionHelpers.field_a.next(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "o.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        if (param0 > 45) {
          field_c = null;
          field_b = null;
          textSwitch3d = null;
          field_f = null;
          return;
        }
        field_e = -104;
        field_c = null;
        field_b = null;
        textSwitch3d = null;
        field_f = null;
    }

    static {
        field_c = "Please remove <%0> from your friend list first.";
        textSwitch3d = "2D mode";
        field_e = 0;
        field_f = "To Customer Support";
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
