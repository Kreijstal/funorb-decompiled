/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicTrackHelpers {
    static String field_a;
    static int[] field_b;

    final static void changeMusicTrack(MusicTrack param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref2 = null;
        try {
          if (null != ProxyAuthenticationRequiredException.field_c) {
            DateOfBirthValidator.playMusicTrack(param2, (byte) -56, 1048576, param0, param1);
          }
          if (SharedPanelFactory.field_b != null) {
            var4_ref2 = PatchNoteUsage.field_q;
            synchronized (var4_ref2) {
              SharedPanelFactory.field_b.setChannelVolume(param1, -1, 94);
              if (param0 == HighscoreQuery.field_B) {
                return;
              }
              SharedPanelFactory.field_b.stop(19);
              PatchNoteUsage.field_q.flush();
              HighscoreQuery.field_B = param0;
              if (null != HighscoreQuery.field_B) {
                SharedPanelFactory.field_b.playTrack(param2, HighscoreQuery.field_B, (byte) 23);
              }
            }
          }
          if (param3 > 20) {
            return;
          }
          field_b = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = "Accept <%0> into this game";
    }
}
