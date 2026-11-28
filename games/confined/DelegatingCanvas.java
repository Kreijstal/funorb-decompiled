/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    private java.awt.Component delegateComponent;
    static String field_c;
    static ModalDialogHost field_b;
    static boolean field_a;

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.delegateComponent = param0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_c = null;
        if (param0 > -56) {
          field_c = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.delegateComponent.update(param0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ie.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.delegateComponent.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "ie.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "EXT";
        field_a = false;
    }
}
