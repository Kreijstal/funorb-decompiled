/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends br {
    int field_h;
    static int field_i;
    byte[] field_f;
    static boolean field_g;

    final static void b(boolean param0) {
        rn.a(-54);
        if (dk.field_Ib != null) {
          nq.a(95, dk.field_Ib);
        }
        tb.b(4862);
        if (param0) {
          return;
        }
        qb.b(31);
        da.b(-8);
        if (!ib.b(23517)) {
          ak.a((byte) -111);
          return;
        }
        ma.field_a.b((byte) -35, 1);
        cb.a(0, false);
        ak.a((byte) -111);
    }

    final static boolean c(byte param0) {
        if (param0 != 107) {
          field_g = true;
          if (!ia.field_r) {
            return wc.j(98) ? true : false;
          }
          if (!qd.field_bb) {
            return wc.j(98) ? true : false;
          }
          return true;
        }
        if (ia.field_r) {
          if (qd.field_bb) {
            return true;
          }
          return wc.j(98) ? true : false;
        }
        if (!wc.j(98)) {
          return false;
        }
        return true;
    }

    n(byte[] param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -16) {
          return true;
        }
        return bq.field_c;
    }

    static {
        field_i = 1;
        field_g = false;
    }
}
