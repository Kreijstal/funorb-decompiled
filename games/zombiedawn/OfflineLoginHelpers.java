/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OfflineLoginHelpers {
    static ClientProtocolStage field_b;
    static IntrusiveDeque field_c;
    static int field_d;
    static int field_a;
    static long field_e;

    final static void resendHighscoreRequests(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        PendingHighscoreRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          var4 = (PendingHighscoreRequest) (DecodedSpriteHelpers.field_a.last((byte) 26));
          while (var4 != null) {
            ImageProducerRasterBuffer.writeHighscoreRequest((byte) 25, param0, var4);
            var4 = (PendingHighscoreRequest) (DecodedSpriteHelpers.field_a.previous(false));
          }
          if (param1 <= -62) {
            return;
          }
          field_b = (ClientProtocolStage) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "td.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 != 94) {
          OfflineLoginHelpers.releaseStatics((byte) -16);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void returnToLoginFromOffline(int param0) {
        if (FullscreenErrorDialog.field_Y) {
          PacketBuffer.field_i = true;
          int var1 = -64 / ((param0 - 77) / 35);
          EmailAvailabilityValidator.showLoginPanelDefault(true, 116);
          AccountResultHelpers.field_a = 0;
          return;
        }
        throw new IllegalStateException();
    }

    static {
        field_b = new ClientProtocolStage();
        field_c = new IntrusiveDeque();
        field_d = 50;
    }
}
