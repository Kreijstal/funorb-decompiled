/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static SceneWidget[] field_e;
    private java.awt.Component field_c;
    static String field_f;
    static int field_b;
    static SceneWidget field_h;
    static String field_g;
    static String field_a;
    static BinaryBitmapFont field_d;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hk.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hk.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_g = null;
        field_d = null;
        field_h = null;
        if (param0 >= -4) {
          return;
        }
        field_e = null;
        field_a = null;
    }

    final static int packChatFilterSettings(byte param0) {
        if (param0 < -61) {
          return ib.field_e + ((GradientOutlineTextPainter.field_v << 2) + (LoginMethod.field_e << 4));
        }
        DelegatingCanvas.releaseStatics(54);
        return ib.field_e + ((GradientOutlineTextPainter.field_v << 2) + (LoginMethod.field_e << 4));
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 15;
        field_f = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = "Remove <%0> from ignore list";
        field_g = "Your game";
    }
}
