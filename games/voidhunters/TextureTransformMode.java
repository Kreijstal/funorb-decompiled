/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureTransformMode {
    static Camera2D field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 != 17121) {
          field_a = (Camera2D) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
