/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasInputCleanup {
    static String field_h;
    static String field_b;
    static RgbSprite[] field_d;
    static String field_e;
    static String field_c;
    static RgbSprite field_a;
    static UiComponent field_f;
    static boolean field_g;

    public static void a(int param0) {
        field_e = null;
        if (param0 == -11470) {
          field_f = null;
          field_b = null;
          field_d = null;
          field_h = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void detachCanvasInput(boolean preserveMouseWheel, java.awt.Canvas canvas) {
        RuntimeException failure = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String canvasSummary = null;
        RuntimeException caughtFailure = null;
        try {
          PowerUp.detachKeyboardInput(-2846, (java.awt.Component) ((Object) canvas));
          MouseInputCleanup.detachMouseInput(20616, (java.awt.Component) ((Object) canvas));
          if (preserveMouseWheel) {
            return;
          }
          if (null == NinjaBackground.mouseWheelSource) {
            return;
          }
          NinjaBackground.mouseWheelSource.detach((java.awt.Component) ((Object) canvas), -117);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("t.B(").append(preserveMouseWheel).append(',');
          if (canvas == null) {
            canvasSummary = "null";
          } else {
            canvasSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(canvasSummary).append(')').toString());
        }
    }

    static {
        field_b = "Offer draw";
        field_h = "Resigned";
        field_c = "Continue";
        field_e = "Clan";
        field_g = false;
    }
}
