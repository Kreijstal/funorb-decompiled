/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends nl {
    static String[][] field_L;
    static volatile boolean pointerChanged;
    static int field_K;
    static RgbSprite field_J;

    public static void k(int param0) {
        if (param0 <= 43) {
          return;
        }
        field_L = (String[][]) null;
        field_J = null;
    }

    final static CampaignQuicksave getStoredQuicksave(int obfuscationGuard) {
        if (obfuscationGuard <= 78) {
          ku.k(-59);
          if (null != bu.storedQuicksave) {
            return bu.storedQuicksave;
          }
          return null;
        }
        if (null != bu.storedQuicksave) {
          return bu.storedQuicksave;
        }
        return null;
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        wc var9 = null;
        try {
          super.pointerReleased(originY, rootWidget, pointerX, (byte) 42, pointerY, originX);
          int var8 = -111 % ((-58 - obfuscationGuard) / 53);
          var9 = bn.field_f;
          if (var9 != null &&
            this.containsPointer(1, originX, pointerY, pointerX, originY)) {
            if (!(this.listener instanceof ch)) {
              if (!(var9.listener instanceof ch)) {
                return;
              }
              ((ch) (var9.listener)).a(var9, -14486, this);
              bn.field_f = null;
              return;
            }
            ((ch) (this.listener)).a(var9, -14486, this);
            bn.field_f = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ku.JA(" + originY + ',' + (rootWidget != null ? "{...}" : "null") + ',' + pointerX + ',' + obfuscationGuard + ',' + pointerY + ',' + originX + ')');
        }
    }

    final static void a(byte param0, boolean param1, MusicTrack param2) {
        try {
          MusicCrossfadeStream.setMusicTrack(param2, param1, 256, (byte) 41);
          if (param0 >= -28) {
            field_K = -125;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ku.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private ku(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, Widget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_E = param6;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ku.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        pointerChanged = false;
        field_L = new String[][]{new String[]{"240", "180", "150", "120", "90", "60", "30"}, new String[]{"Small", "Medium", "Large", "Epic"}, new String[]{"Regular", "Double", "Triple", "Quadruple"}, new String[]{null, null, null, null, null}, new String[]{"Free For All", "Team Game"}, new String[]{"Off", "25", "75", "150", "No limit"}};
        field_J = new RgbSprite(224, 224);
    }
}
