/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static ResourceArchive field_d;
    private LegacyOpenGlGraphicsToolkit field_b;
    long field_c;
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

    sn(LegacyOpenGlGraphicsToolkit param0, long param1, mk[] param2) {
        try {
          this.field_c = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_b.a(this.field_c, (byte) -88);
        super.finalize();
    }

    static {
        field_a = new Sprite(540, 140);
    }
}
