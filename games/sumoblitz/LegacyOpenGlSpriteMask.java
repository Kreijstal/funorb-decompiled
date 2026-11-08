/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSpriteMask extends SpriteMask {
    f texture;
    static ToolkitSprite field_e;
    static float[] field_g;

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_e = null;
        if (param0) {
          field_e = (ToolkitSprite) null;
        }
    }

    private LegacyOpenGlSpriteMask() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new float[4];
    }
}
