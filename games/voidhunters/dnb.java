/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dnb extends ksa {
    int field_d;
    byte[] field_e;

    final static tja c(byte param0) {
        tja var1 = null;
        bk.field_w.field_e = 0;
        bk.field_w.p(-23497);
        var1 = (tja) (Object) gva.field_a.a((byte) 69);
        if (var1 instanceof utb) {
          ((utb) (Object) var1).a(bk.field_w, 32);
          bk.field_w.f((byte) -92);
          return var1;
        } else {
          var1.a(bk.field_w, false);
          bk.field_w.f((byte) -92);
          return var1;
        }
    }

    dnb(byte[] param0) {
        try {
            ((dnb) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dnb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
