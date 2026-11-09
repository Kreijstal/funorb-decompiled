/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexLayout extends VertexLayout {
    static PrimitiveType TRIANGLE_STRIP;
    VertexStreamLayout[] streams;
    static qc field_f;
    static String multiplierText;

    final static void a(int param0, int param1) {
        if (param0 != 16440) {
          return;
        }
        lf.a(param1, (byte) -58);
    }

    OpenGlVertexLayout(VertexStreamLayout[] streamLayouts) {
        try {
          this.streams = streamLayouts;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fq.<init>(" + (streamLayouts != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= 96) {
          field_f = null;
          TRIANGLE_STRIP = null;
          multiplierText = null;
          return;
        }
        field_f = (qc) null;
        field_f = null;
        TRIANGLE_STRIP = null;
        multiplierText = null;
    }

    static {
        TRIANGLE_STRIP = new PrimitiveType();
        field_f = new qc();
        multiplierText = "multiplier: ";
    }
}
