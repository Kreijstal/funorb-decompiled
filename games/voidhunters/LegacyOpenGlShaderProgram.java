/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlShaderProgram {
    static gj field_a;
    long handle;
    private OpenGlToolkit toolkit;

    protected final void finalize() throws Throwable {
        this.toolkit.enqueueShaderObjectDisposal((byte) 18, this.handle);
        super.finalize();
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 8345) {
          field_a = (gj) null;
        }
    }

    LegacyOpenGlShaderProgram(OpenGlToolkit param0, long param1, LegacyOpenGlShader[] param2) {
        try {
          this.handle = param1;
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "of.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new gj();
        SettingsChangeFactory discarded$0 = new SettingsChangeFactory();
    }
}
