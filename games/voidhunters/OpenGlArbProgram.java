/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlArbProgram {
    int programId;
    static String field_b;
    private OpenGlGpuToolkit toolkit;

    protected final void finalize() throws Throwable {
        this.toolkit.a(this.programId, (byte) 98);
        super.finalize();
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != -5709) {
          OpenGlArbProgram.clearSharedReferences(-15);
        }
    }

    OpenGlArbProgram(OpenGlGpuToolkit param0, int param1, int param2) {
        try {
          this.toolkit = param0;
          this.programId = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Click here or press V to select the grapple";
    }
}
