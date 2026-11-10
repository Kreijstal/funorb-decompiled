/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayState {
    static GzipDecompressor field_d;
    static Sprite field_i;
    static int field_h;
    static int field_j;
    static Sprite[] field_c;
    static RasterBuffer field_f;
    static int field_g;
    static Sprite[] field_a;
    static String[] field_e;
    static FullscreenFocusCanvas field_b;

    final static LoginMethod[] getLoginMethodPreferences(int param0) {
        if (param0 == 31114) {
          return new LoginMethod[]{Scrollbar.field_J, AudioSetupHelpers.field_a, MenuBackgroundActor.field_e};
        }
        return (LoginMethod[]) null;
    }

    final static void requestFullscreen(boolean param0, boolean param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = ZombieDawn.field_J;
        if (OctaveNoiseMap.field_j <= 0) {
          if (MeleeHuman.isGuestSession(13296)) {
            var2 = 0;
            if (param1) {
              field_g = 58;
            }
            if (SpriteSheetDecoder.field_b == null) {
              if (!Scrollbar.field_H) {
                return;
              }
              PopupMenuBuilder.buildPopupMenu(var2, 113, param0);
            }
            return;
          }
          var2Lifetime3 = 1;
          if (param1) {
            field_g = 58;
          }
          if (SpriteSheetDecoder.field_b == null) {
            if (!Scrollbar.field_H) {
              return;
            }
            PopupMenuBuilder.buildPopupMenu(var2Lifetime3, 113, param0);
          }
          return;
        }
        if (null == SpriteSheetDecoder.field_b) {
          field_b = FullscreenCanvasHelpers.createFullscreenCanvas(480, 640, SpriteFadeHelpers.field_a, 0, param1, 0);
          if (null == field_b) {
            var2Lifetime1 = 3;
          } else {
            ProxySocketConnector.attachCanvasInput(20922, field_b);
            var2Lifetime1 = 2;
          }
          if (param1) {
            field_g = 58;
          }
          if (SpriteSheetDecoder.field_b != null) {
            return;
          }
          if (Scrollbar.field_H) {
            PopupMenuBuilder.buildPopupMenu(var2Lifetime1, 113, param0);
          }
          return;
        }
        field_b = SpriteSheetDecoder.field_b.enterFullscreen(true);
        SessionSocketHelpers.notifyBrowserResize(2, 27102);
        if (null == field_b) {
          var2Lifetime2 = 3;
        } else {
          ProxySocketConnector.attachCanvasInput(20922, field_b);
          var2Lifetime2 = 2;
        }
        if (param1) {
          field_g = 58;
        }
        if (SpriteSheetDecoder.field_b != null) {
          return;
        }
        if (!Scrollbar.field_H) {
          return;
        }
        PopupMenuBuilder.buildPopupMenu(var2Lifetime2, 113, param0);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_i = null;
        field_d = null;
        if (param0 < 54) {
          DisplayState.clearMenuMessageText((byte) -37);
        }
    }

    final static void clearMenuMessageText(byte param0) {
        ValidatedTextWidget.field_U = false;
        if (param0 <= 40) {
          return;
        }
        ResizableDialog.field_R = null;
        NodeHashTableIterator.field_b = null;
        Js5ArchiveManager.field_a = null;
        NodeHashTable.field_h = null;
    }

    static {
        field_d = new GzipDecompressor();
        field_g = 1;
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
