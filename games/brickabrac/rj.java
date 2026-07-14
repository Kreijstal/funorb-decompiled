/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static bh field_c;
    static String field_a;
    static int field_b;

    final static void b(int param0) {
        if (param0 >= -78) {
            field_a = null;
        }
    }

    final static void a(byte param0, kl param1) {
        if (param0 != 80) {
            return;
        }
        ob.field_J.a((qd) (Object) param1);
    }

    final static void a(fk param0, boolean param1) {
        so.field_d = param0;
        if (param1) {
            rj.b(-94);
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 24311) {
          var2 = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You cannot add yourself!";
    }
}
