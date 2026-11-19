/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoAnimationLoader {
    static MidiTrack field_d;
    static String field_e;
    static Sprite field_b;
    static String[] field_a;
    static int[] field_g;
    static byte[][] field_f;
    static int field_c;
    static String field_h;

    final static void loadLogoAnimation(ResourceArchive param0, byte param1, int param2, PcmStreamMixer param3) {
        try {
          WidgetContainer.field_B = NameCheckHelpers.getTickRate((byte) -109) * param2 / 1000;
          StripedProgressBar.loadLogoAudio(param0, -125);
          if (param1 > -61) {
            LogoAnimationLoader.releaseStatics(-127);
          }
          QuickChatPhraseRepository.loadLogoMeshes(125, param0);
          IntrusiveNodeHashTable.loadEndingFrame(param0, (byte) 1);
          RankingStatsRequest.buildSpecularTable(256);
          TimedValidator.prepareLogoBlur(350);
          DualLinkNodeHashTable.field_f = 0 - WidgetContainer.field_B;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ec.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_d = null;
        field_f = (byte[][]) null;
        field_b = null;
        field_h = null;
        if (param0 <= -13) {
          field_a = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_a = null;
        field_e = null;
    }

    static {
        field_e = "Type your email address again to make sure it's correct";
        field_h = "This entry doesn't match";
        field_f = new byte[1000][];
    }
}
