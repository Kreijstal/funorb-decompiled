/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasPresentationHook {
    private static String field_z;

    final static void beforeCanvasPresent(byte guard) {
        if (guard > -124) {
          return;
        }
    }

    static {
        field_z = "tu.A(";
    }
}
