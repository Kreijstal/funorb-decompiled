/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static int field_a;
    long field_b;
    static Object field_d;
    private LegacyOpenGlGraphicsToolkit field_c;

    public static void releaseStatics(int param0) {
        if (param0 != -25140) {
          mk.releaseStatics(-127);
          field_d = null;
          return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_b, (byte) -81);
        super.finalize();
    }

    mk(LegacyOpenGlGraphicsToolkit param0, long param1, int param2) {
        try {
          this.field_c = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
