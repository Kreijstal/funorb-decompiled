/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static UiComponent field_b;
    static String field_a;
    static boolean field_c;

    public static void a(int param0) {
        if (param0 < 1) {
          field_a = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void popRaster(int obfuscationGuard) {
        if (obfuscationGuard > -75) {
          return;
        }
        RasterSnapshot snapshot = (RasterSnapshot) (ButtonWidgetRenderer.rasterStack.removeLast(113));
        if (snapshot == null) {
          throw new IllegalStateException();
        }
        Rasterizer2D.bind(snapshot.pixels, snapshot.width, snapshot.height);
        Rasterizer2D.setClip(snapshot.clipLeft, snapshot.clipTop, snapshot.clipRight, snapshot.clipBottom);
        snapshot.pixels = null;
        Mesh3D.rasterSnapshotPool.addLast(snapshot, (byte) 3);
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
