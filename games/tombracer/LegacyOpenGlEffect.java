/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlEffect {
    OpenGlToolkit toolkit;
    static String field_b;

    abstract void bindTexture(int param0, int param1, LegacyOpenGlTexture param2);

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -18318) {
          field_b = (String) null;
        }
    }

    LegacyOpenGlEffect(OpenGlToolkit param0) {
        try {
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void disable(boolean param0);

    abstract void refreshState(boolean param0, int param1);

    abstract boolean isSupported(int param0);

    abstract void enable(boolean param0, int param1);

    abstract void setParameters(int param0, int param1, int param2);

    static {
        field_b = "Only show lobby chat from my friends";
    }
}
