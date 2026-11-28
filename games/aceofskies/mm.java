/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static DraggableWidgetContainer field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        if (param0 != 104) {
          mm.clearStaticReferences((byte) 55);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_z = "mm.A(";
    }
}
