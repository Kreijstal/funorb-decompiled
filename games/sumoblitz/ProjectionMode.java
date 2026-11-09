/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectionMode {
    static String reassignText;
    static ToolkitSprite field_b;
    static String unpackingSoundEffectsText;
    static boolean field_c;
    static ToolkitSprite[] field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean usesViewTransform(int guard) {
        if (guard == -20011) {
          return ((FourIntReadRequest.PERSPECTIVE == this ? 1 : 0) | (PerlinNoise2D.ORTHOGRAPHIC == this ? 1 : 0)) != 0;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        reassignText = null;
        field_b = null;
        unpackingSoundEffectsText = null;
        if (param0 != -7520) {
          ProjectionMode.releaseStatics(-61);
        }
    }

    static {
        unpackingSoundEffectsText = "Unpacking sound effects";
        reassignText = "reassign";
        field_c = false;
    }
}
