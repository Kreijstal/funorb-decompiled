/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlShader {
    static int field_a;
    long shaderHandle;
    static Object field_d;
    private LegacyOpenGlGraphicsToolkit toolkit;

    public static void releaseStatics(int param0) {
        if (param0 != -25140) {
          LegacyOpenGlShader.releaseStatics(-127);
          field_d = null;
          return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueShaderObjectDeletion(this.shaderHandle, (byte) -81);
        super.finalize();
    }

    LegacyOpenGlShader(LegacyOpenGlGraphicsToolkit owner, long handle, int shaderType) {
        try {
          this.toolkit = owner;
          this.shaderHandle = handle;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mk.<init>(" + (owner != null ? "{...}" : "null") + ',' + handle + ',' + shaderType + ')');
        }
    }

    static {
        field_a = 0;
    }
}
