/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlShader {
    private OpenGlGraphicsToolkit toolkit;
    long shaderHandle;
    static java.applet.Applet field_c;
    static long field_d;

    OpenGlShader(OpenGlGraphicsToolkit owner, long handle, int shaderType) {
        try {
          this.shaderHandle = handle;
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qj.<init>(" + (owner != null ? "{...}" : "null") + ',' + handle + ',' + shaderType + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueShaderObjectDeletion(33984, this.shaderHandle);
        super.finalize();
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        int var1 = 0 % ((8 - param0) / 63);
    }

    static {
    }
}
