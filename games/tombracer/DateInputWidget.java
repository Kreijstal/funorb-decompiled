/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends WidgetContainer implements ValidationProvider {
    static RendererOption field_z;
    static String field_y;
    static int[] field_x;
    private uba field_w;

    abstract boolean isEmpty(byte param0);

    final static void openPlayerContextMenu(ScrollPanel param0, int param1, String param2, long param3, int param4, int[] param5, UiComponent param6, int param7, String param8) {
        if (param4 != -11635) {
          return;
        }
        try {
          ChatTarget.field_b = param0;
          hka.field_b = new PlayerContextMenu(param6, param3, param2, param8, param1, param7, param5);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "paa.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    abstract int getDay(byte param0);

    final static RoomDefinition getCourseRoom(int param0, int param1, int param2) {
        CourseDefinition var5 = cm.field_a[param0];
        CourseDefinition var3 = var5;
        int var4 = 70 / ((param1 - 5) / 61);
        return var5.field_c[param2];
    }

    public final ValidationSource getValidationSource(byte param0) {
        if (param0 <= 44) {
          return (ValidationSource) null;
        }
        return (ValidationSource) ((Object) this.field_w);
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        if (param0 >= 29) {
          field_z = null;
          field_x = null;
          return;
        }
        DateInputWidget.getCourseRoom(81, -67, 72);
        field_z = null;
        field_x = null;
    }

    void setValidator(byte param0, uba param1) {
        try {
          int var3_int = 126 % ((-36 - param0) / 59);
          this.field_w = param1;
          this.field_w.field_i = this;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "paa.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void loadMusicTrack(boolean param0, int param1) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 == param1) {
            MenuEntry.field_j[0] = MusicTrack.load(TextBlockLayout.field_a, "", "TR_theme");
          }
          if (1 == param1) {
            MenuEntry.field_j[1] = MusicTrack.load(TextBlockLayout.field_a, "", "TR_temple_music");
          }
          if (param1 == 2) {
            MenuEntry.field_j[2] = MusicTrack.load(TextBlockLayout.field_a, "", "TR_win_jingle_long");
          }
          if (param0) {
            return;
          }
          if (3 == param1) {
            MenuEntry.field_j[3] = MusicTrack.load(TextBlockLayout.field_a, "", "TR_lose_jingle_long");
          }
          while (!RewardChoicePhase.field_n.field_y.prepareTrack(176400, MenuEntry.field_j[param1], S2CNextRoundPacket.field_a, LegacyOpenGlTurbulentTextureEffect.field_j, 0)) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "paa.F(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int getYear(int param0);

    abstract int year(int param0);

    final static vb playLandingSound(int param0) {
        if (param0 != 141) {
          return (vb) null;
        }
        return it.playMenuSound(255, 141 + uca.cosmeticRandom.nextBounded(2, param0 ^ 141));
    }

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        field_y = "Game drawn";
        field_x = new int[]{17, 10, 11};
    }
}
