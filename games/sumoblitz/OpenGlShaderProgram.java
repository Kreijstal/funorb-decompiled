/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlShaderProgram {
    long programHandle;
    private OpenGlGraphicsToolkit toolkit;
    static java.math.BigInteger field_c;
    static String toReturnToTheText;
    static int levelIndex;

    OpenGlShaderProgram(OpenGlGraphicsToolkit owner, long handle, OpenGlShader[] shaders) {
        try {
          this.toolkit = owner;
          this.programHandle = handle;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "oh.<init>(" + (owner != null ? "{...}" : "null") + ',' + handle + ',' + (shaders != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        toReturnToTheText = null;
        if (param0 != -60) {
          toReturnToTheText = (String) null;
        }
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueShaderObjectDeletion(33984, this.programHandle);
        super.finalize();
    }

    static {
        field_c = new java.math.BigInteger("65537");
        toReturnToTheText = "to return to the normal view.";
    }
}
