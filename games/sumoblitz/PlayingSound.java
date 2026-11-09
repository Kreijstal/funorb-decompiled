/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayingSound extends IntrusiveNode {
    PcmSampleStream stream;
    static String fullScreenText;
    static String[] scoreFilterLabels;
    static ToolkitSprite field_l;
    static int field_n;
    IntrusiveNode lifetimeNode;
    int originalVolume;
    static Object legacyHeightNoise;

    final static boolean a(int param0, int param1) {
        int var2 = 90 / ((30 - param0) / 44);
        if (param1 == 1) {
          return false;
        }
        if (param1 != 7) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 == 1022768328) {
          fullScreenText = null;
          legacyHeightNoise = null;
          scoreFilterLabels = null;
          return;
        }
        PlayingSound.a(-56, -102);
        fullScreenText = null;
        legacyHeightNoise = null;
        scoreFilterLabels = null;
    }

    PlayingSound(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.stream = param0;
          this.originalVolume = param0.targetVolume();
          this.lifetimeNode = param1;
          this.stream.setVolume(128 + this.originalVolume * kr.field_c >> 8);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        fullScreenText = "Full screen";
        scoreFilterLabels = new String[]{"All scores", "My scores", "Best each"};
    }
}
