/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static int field_c;
    static ge field_b;
    private java.awt.Component delegateComponent;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.delegateComponent.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "jc.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        uf.a(Lexicominos.field_H, 113, wa.field_k, true);
        lh.field_w = true;
        int var1 = -24 / ((param0 - 43) / 46);
    }

    public static void clearStaticReferences(int param0) {
        if (param0 >= -14) {
          field_b = (ge) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.delegateComponent.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "jc.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.delegateComponent = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
