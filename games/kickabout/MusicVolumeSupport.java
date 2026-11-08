/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVolumeSupport {
    static String field_a;
    static int field_b;

    final static void drawMessagePanel(String param0, int param1, int param2, boolean param3, int param4, int param5) {
        try {
          String var7 = (String) null;
          RegistrationRequestState.drawCaptionedMessage(param2, param0, false, (String) null, param5, false, param3, param1);
          if (param4 != 0) {
            field_b = -32;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ms.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void setMusicVolume(int param0, int param1) {
        RankingsRequest.field_n[param0] = param1;
        if (LoadingProgressSupport.field_d != null) {
          LoadingProgressSupport.field_d.a(0, param1, (byte) -85);
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 53) {
          MusicVolumeSupport.setMusicVolume(-17, -62);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "<gt>";
    }
}
