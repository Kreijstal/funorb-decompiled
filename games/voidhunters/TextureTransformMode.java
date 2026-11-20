/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureTransformMode {
    static Camera2D soundCamera;

    public static void clearSharedReferences(int param0) {
        if (param0 != 17121) {
          soundCamera = (Camera2D) null;
          soundCamera = null;
          return;
        }
        soundCamera = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
