/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlShaderProgram {
    static ResourceArchive field_d;
    private LegacyOpenGlGraphicsToolkit toolkit;
    long programHandle;
    static Sprite field_a;

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 > -30) {
          field_a = (Sprite) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    LegacyOpenGlShaderProgram(LegacyOpenGlGraphicsToolkit owner, long handle, LegacyOpenGlShader[] shaders) {
        try {
          this.programHandle = handle;
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sn.<init>(" + (owner != null ? "{...}" : "null") + ',' + handle + ',' + (shaders != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.toolkit.queueShaderObjectDeletion(this.programHandle, (byte) -88);
        super.finalize();
    }

    static {
        field_a = new Sprite(540, 140);
    }
}
