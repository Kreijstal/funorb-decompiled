/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ActiveCanvasProvider {
    static String mouseOverAnIconText;
    static int field_c;
    static int field_a;

    public static void releaseStatics(int param0) {
        mouseOverAnIconText = null;
        if (param0 != 0) {
          field_c = 88;
        }
    }

    final static java.awt.Canvas currentCanvas(int guard) {
        int var1 = 30 / ((guard - 33) / 43);
        return null == CompactMeshGeometry.field_o ? qn.field_f : (java.awt.Canvas) ((Object) CompactMeshGeometry.field_o);
    }

    static {
        field_c = 0;
        mouseOverAnIconText = "Mouse over an icon for details";
        field_a = 0;
    }
}
