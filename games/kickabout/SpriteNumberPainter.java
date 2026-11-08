/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteNumberPainter {
    static int field_a;
    static String field_b;
    static boolean field_c;
    static int field_d;

    final static int drawNumberDigits(byte param0, int param1, int param2, int param3, int param4) {
        Sprite var5 = null;
        Sprite var5Lifetime1;
        if (10 <= param1) {
          param4 = SpriteNumberPainter.drawNumberDigits(120, param1 / 10, param2, param3, param4);
        }
        if (param0 > 109) {
          var5 = SocketArchiveNetworkClient.field_q[param1 % 10];
          var5.drawAdditive(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        }
        SpriteNumberPainter.drawNumberDigits(-108, -67, -1, 23, 75);
        var5Lifetime1 = SocketArchiveNetworkClient.field_q[param1 % 10];
        var5Lifetime1.drawAdditive(-var5Lifetime1.field_s + param4, param3, param2);
        return var5Lifetime1.field_q + param4 + 3;
    }

    final static void loadPitchMusicTracks(ResourceArchive param0, byte param1) {
        try {
          LocalizedTextLoader.field_d[0] = MusicTrack.load(param0, "", "KaB_park_menu");
          LoadingProgressSupport.reportStageProgress(80, 8, 0);
          LocalizedTextLoader.field_d[1] = MusicTrack.load(param0, "", "KaB_beach_atmospherics_loop_lvl1_2");
          LoadingProgressSupport.reportStageProgress(73, 8, 1);
          int var2_int = 109 / ((param1 - 28) / 61);
          LocalizedTextLoader.field_d[2] = MusicTrack.load(param0, "", "KaB_park_atmospherics_loop_lvl1_2");
          LoadingProgressSupport.reportStageProgress(94, 8, 2);
          LocalizedTextLoader.field_d[3] = MusicTrack.load(param0, "", "KaB_street_atmospherics_loop_lvl1_2");
          LoadingProgressSupport.reportStageProgress(-119, 8, 3);
          LocalizedTextLoader.field_d[4] = MusicTrack.load(param0, "", "KaB_crowd_loop_MIDDLE_PITCH_lvl3");
          LoadingProgressSupport.reportStageProgress(83, 8, 4);
          LocalizedTextLoader.field_d[5] = MusicTrack.load(param0, "", "KaB_crowd_loop_END_PITCH_lvl3");
          LoadingProgressSupport.reportStageProgress(98, 8, 5);
          LocalizedTextLoader.field_d[6] = MusicTrack.load(param0, "", "KaB_crowd_loop_MIDDLE_PITCH_lvl4");
          LoadingProgressSupport.reportStageProgress(-53, 8, 6);
          LocalizedTextLoader.field_d[7] = MusicTrack.load(param0, "", "KaB_crowd_loop_END_PITCH_lvl4");
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "f.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 >= -71) {
          field_c = true;
        }
    }

    static {
        field_a = 104;
        field_b = "Buyout smaller than Bid";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int drawNumberDigits(int param0, int param1, int param2, int param3, int param4) {
        Sprite var5 = null;
        Sprite var5Lifetime1;
        if (10 <= param1) {
          param4 = SpriteNumberPainter.drawNumberDigits(120, param1 / 10, param2, param3, param4);
        }
        if (param0 > 109) {
          var5 = SocketArchiveNetworkClient.field_q[param1 % 10];
          var5.drawAdditive(-var5.field_s + param4, param3, param2);
          return var5.field_q + param4 + 3;
        }
        SpriteNumberPainter.drawNumberDigits(-108, -67, -1, 23, 75);
        var5Lifetime1 = SocketArchiveNetworkClient.field_q[param1 % 10];
        var5Lifetime1.drawAdditive(-var5Lifetime1.field_s + param4, param3, param2);
        return var5Lifetime1.field_q + param4 + 3;
    }
}
