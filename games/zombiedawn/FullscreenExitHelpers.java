/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenExitHelpers {
    int field_d;
    int field_a;
    static int field_e;
    int field_b;
    int field_f;
    static String field_c;
    static Font field_g;

    final static void exitFullscreen(byte param0) {
        if (DisplayState.field_b == null) {
          return;
        }
        SpatialObject.detachCanvasInput((byte) -46, DisplayState.field_b);
        DisplayState.field_b.exitFullscreen(SpriteFadeHelpers.field_a, (byte) 115);
        if (param0 != -71) {
          return;
        }
        DisplayState.field_b = null;
        if (null == SpriteSheetDecoder.field_b) {
          IntrusiveDequeCursor.field_d.requestFocus();
          return;
        }
        SpriteSheetDecoder.field_b.restoreWindowedSize(true);
        IntrusiveDequeCursor.field_d.requestFocus();
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        if (param0) {
          FullscreenExitHelpers.exitFullscreen((byte) -8);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_e = 0;
        field_c = "Close";
    }
}
