/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicTrackHelpers {
    static RgbSprite[] field_f;
    static String field_a;
    static String field_e;
    static RgbSprite[] field_d;
    static ContextMenu field_h;
    static boolean field_g;
    static int field_c;
    static ListRequestHelpers field_b;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 > 55) {
          field_f = null;
          field_h = null;
          field_e = null;
          field_a = null;
          return;
        }
        field_d = (RgbSprite[]) null;
        field_f = null;
        field_h = null;
        field_e = null;
        field_a = null;
    }

    final static void changeMusicTrack(boolean param0, byte param1, int param2, MusicTrack param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        MusicTrack var6 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref2 = null;
        try {
          if (IconLookupHelpers.field_g != null) {
            MusicAndEmailHelpers.selectMusicTrack(-26907, 1048576, param0, param2, param3);
          }
          if (null != IterableNodeHashTable.field_f) {
            var4_ref2 = SoundAndUrlHelpers.field_a;
            synchronized (var4_ref2) {
              IterableNodeHashTable.field_f.setChannelVolume(-1, (byte) 20, param2);
              if (ListRequestHelpers.field_g == param3) {
                return;
              }
              IterableNodeHashTable.field_f.stop((byte) -98);
              SoundAndUrlHelpers.field_a.flush();
              ListRequestHelpers.field_g = param3;
              if (null != ListRequestHelpers.field_g) {
                IterableNodeHashTable.field_f.playTrack(true, param0, ListRequestHelpers.field_g);
              }
            }
          }
          if (param1 >= 65) {
            return;
          }
          var6 = (MusicTrack) null;
          MusicTrackHelpers.changeMusicTrack(true, (byte) -9, -7, (MusicTrack) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("jn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = "Menu";
        field_e = "Warning: ";
        field_g = true;
        field_c = 480;
    }
}
