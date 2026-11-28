/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementNotification extends IntrusiveNode {
    int field_k;
    static String field_l;
    static sa field_j;
    static IntrusiveDeque field_n;
    static String field_m;

    final static void setBackgroundMusicTrack(MusicTrack param0, int param1) {
        if (LoginPanel.field_R == param0) {
          return;
        }
        try {
          SpriteGeometry.field_q.e(-3435);
          mh.field_d.flushAndMarkDrainCheck();
          LoginPanel.field_R = param0;
          if (LoginPanel.field_R != null) {
            SpriteGeometry.field_q.a(false, LoginPanel.field_R, 59);
          }
          int var2_int = 0 % ((-35 - param1) / 36);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ef.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    AchievementNotification(int param0) {
        this.field_k = param0;
    }

    public static void clearAchievementNotificationGlobals(int param0) {
        field_n = null;
        field_j = null;
        if (param0 == 27706) {
          field_l = null;
          field_m = null;
          return;
        }
        MusicTrack var2 = (MusicTrack) null;
        AchievementNotification.setBackgroundMusicTrack((MusicTrack) null, -119);
        field_l = null;
        field_m = null;
    }

    static {
        field_l = "Hide chat";
        field_j = new sa();
        field_n = new IntrusiveDeque();
        field_m = "Remove friend";
    }
}
