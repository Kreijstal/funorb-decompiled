/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioServiceHelpers {
    static LoginMethod field_b;
    static String field_d;
    static int[] field_f;
    static String field_a;
    static GameScreen field_h;
    static Sprite field_e;
    static Sprite[] field_j;
    static int[] field_i;
    static int[] field_c;
    static PlatformTask field_g;

    final static void sendReflectionCheckReplies(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -10995) {
            AudioServiceHelpers.onIdleTimeout(117);
          }
          var1 = TextValidationFailure.field_a;
          while (UnitStateEvent.isReflectionCheckReady(1)) {
            var1.writeCipheredOpcode((byte) -35, 8);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            EmailAvailabilityValidator.writeReflectionCheckReply(var1, param0 + 10995);
            TextValidationFailure.field_a.backpatchByteLength(param0 + 11021, var1.position - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "wp.D(" + param0 + ')');
        }
    }

    final static void onIdleTimeout(int param0) {
        if (param0 != 8192) {
          AudioServiceHelpers.sendReflectionCheckReplies(90);
        }
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_e = null;
        field_h = null;
        if (param0 == 26) {
          field_g = null;
          field_d = null;
          field_i = null;
          field_b = null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
        field_j = (Sprite[]) null;
        field_g = null;
        field_d = null;
        field_i = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final static void setUpgradePrerequisites(int param0, int param1, int param2, int param3) {
        BirthDateInputWidget.field_ab[param1][param3] = param0;
        BirthDateInputWidget.field_ab[param1][1] = param2;
    }

    final static void serviceAudio(int param0) {
        PlayingSound var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        PlayingSound var1Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          PowerupEventFactory.field_b.service();
          CipherPacketBuffer.field_u.service();
          EmailLoginCredentials.field_p = EmailLoginCredentials.field_p - 1;
          if (EmailLoginCredentials.field_p == 0) {
            EmailLoginCredentials.field_p = 200;
            var1 = (PlayingSound) (GameKeyHandler.field_e.last(75));
            while (var1 != null) {
              if (!var1.field_h.isLinked(4)) {
                var1.unlink(true);
              }
              var1 = (PlayingSound) (GameKeyHandler.field_e.previous(6));
            }
            if (ScorePopup.field_K != null) {
              var1Lifetime1 = (PlayingSound) (ScorePopup.field_K.last(51));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_h.isLinked(4)) {
                  var1Lifetime1.unlink(true);
                }
                var1Lifetime1 = (PlayingSound) (ScorePopup.field_K.previous(6));
              }
            }
          }
          var1_int = 107 / ((param0 - 76) / 39);
          if (MessageDialogContent.field_L != null) {
            if (MessageDialogContent.field_L.hasMidiData(-119)) {
              return;
            }
            DelayedPacket.field_g = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "wp.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_b = new LoginMethod("email");
        field_d = "SCORE: <%0>";
        field_a = "Confuse their senses.";
        field_i = new int[8192];
        field_f = new int[256];
        for (var0 = 0; var0 < 255; var0++) {
          field_f[var0] = var0 * 65793;
        }
        field_c = new int[5];
    }
}
