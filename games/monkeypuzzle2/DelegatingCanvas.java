/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    private java.awt.Component delegateComponent;
    static Sprite[] field_b;

    public static void a(int param0) {
        if (param0 >= -24) {
          DelegatingCanvas.a(-117);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.delegateComponent.update(param0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ji.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.delegateComponent.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ji.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.delegateComponent = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ji.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
