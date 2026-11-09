/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenDisplayMode {
    int width;
    int refreshRate;
    static int field_d;
    int bitDepth;
    static SpriteData[] field_c;
    static int[] field_f;
    int height;

    final static boolean updateDroneIntroduction(boolean guard) {
        if (OpenGlVertexLayout.field_f.isVisible((byte) 91)) {
          OpenGlVertexLayout.field_f.update(0);
          return true;
        }
        if (guard) {
          field_c = (SpriteData[]) null;
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -82) {
          field_d = -61;
          field_c = null;
          field_f = null;
          return;
        }
        field_c = null;
        field_f = null;
    }

    static {
        field_f = new int[4];
    }
}
