/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oea extends ul {
    static DiskCacheWorker field_q;
    static MidiPcmStream field_p;
    static Sprite[] field_s;
    private Object field_r;

    final boolean f(int param0) {
        if (param0 <= 123) {
          oea.g(-45);
          return false;
        }
        return false;
    }

    oea(Object param0, int param1) {
        super(param1);
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "oea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object e(int param0) {
        if (param0 != -19795) {
          return (Object) null;
        }
        return this.field_r;
    }

    public static void g(int param0) {
        field_p = null;
        if (param0 != -8333) {
          field_s = (Sprite[]) null;
          field_s = null;
          field_q = null;
          return;
        }
        field_s = null;
        field_q = null;
    }

    static {
    }
}
