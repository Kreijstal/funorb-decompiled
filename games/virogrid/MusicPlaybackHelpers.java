/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPlaybackHelpers {
    static GameSession field_b;
    static String field_e;
    static volatile int field_f;
    static PlatformTaskDispatcher field_c;
    static boolean[] field_d;
    static boolean field_a;

    final static void playMusicTrack(int param0, MusicTrack param1) {
        try {
          if (param0 != 0) {
            MusicTrack var3 = (MusicTrack) null;
            MusicPlaybackHelpers.playMusicTrack(-102, (MusicTrack) null);
          }
          UsernameAvailabilityValidator.playMusicTrack(param1, param0 ^ 109, true);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ei.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 > -54) {
          field_a = false;
        }
    }

    static {
        field_e = "Offer unrated rematch";
        field_f = 0;
        field_a = false;
    }
}
