/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pab extends fh {
    static kka[] field_k;
    static int field_m;
    byte[] field_l;

    final static void a(int param0, int param1, byte param2) {
        rda.field_p = param1;
        lva.field_p = param1;
        if (param2 >= -27) {
          field_k = (kka[]) null;
          fua.field_p = param0;
          uqa.field_p = param0;
          rda.field_q = true;
          return;
        } else {
          fua.field_p = param0;
          uqa.field_p = param0;
          rda.field_q = true;
          return;
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
            field_k = (kka[]) null;
        }
    }

    pab(byte[] param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 100;
    }
}
