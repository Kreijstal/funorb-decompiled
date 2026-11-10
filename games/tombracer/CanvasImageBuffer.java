/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CanvasImageBuffer extends IntrusiveNode {
    int[] pixels;
    static String field_i;
    int width;
    int height;

    abstract void drawRegion(int param0, int param1, int param2, int param3, int param4, int param5, java.awt.Graphics param6, int param7);

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param1 > 79) {
          if (param2) {
            wk.field_m = wk.field_m + 1;
            ComponentTargetList.b((byte) 58);
          }
          if (param0) {
            KaleidoscopeOperator.field_m = KaleidoscopeOperator.field_m + 1;
            tha.a(906);
          }
          return;
        }
        CanvasImageBuffer.a(false, (byte) 60, false);
        if (param2) {
          wk.field_m = wk.field_m + 1;
          ComponentTargetList.b((byte) 58);
        }
        if (param0) {
          KaleidoscopeOperator.field_m = KaleidoscopeOperator.field_m + 1;
          tha.a(906);
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 2) {
          return;
        }
        field_i = null;
    }

    abstract void initialize(java.awt.Canvas param0, int param1, int param2, int param3);

    CanvasImageBuffer() {
    }

    static {
        field_i = "Name";
    }
}
