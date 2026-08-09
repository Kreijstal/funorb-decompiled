/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static bh field_c;
    static String field_a;
    static int field_b;

    final static void b(int param0) {
        if (param0 >= -78) {
            field_a = (String) null;
        }
    }

    final static void a(byte param0, kl param1) {
        if (param0 != 80) {
            return;
        }
        try {
            ob.field_J.a(param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "rj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(fk param0, boolean param1) {
        try {
            so.field_d = param0;
            if (param1) {
                rj.b(-94);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "rj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        fk var2;
        if (param0 != 24311) {
          var2 = (fk) null;
          rj.a((fk) null, true);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = "You cannot add yourself!";
    }
}
