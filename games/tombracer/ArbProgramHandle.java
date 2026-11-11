/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArbProgramHandle {
    private OpenGlToolkit field_b;
    int field_a;

    protected final void finalize() throws Throwable {
        this.field_b.queueProgramDeletion(this.field_a, -1);
        super.finalize();
    }

    ArbProgramHandle(OpenGlToolkit param0, int param1, int param2) {
        try {
          this.field_a = param2;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pva.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
