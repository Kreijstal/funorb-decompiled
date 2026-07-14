/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gg {
    static nc field_b;
    long field_g;
    gg field_a;
    gg field_d;
    static o field_e;
    static boolean[] field_f;
    static String field_c;

    final static void a(int param0, int param1) {
        td.field_l = param0;
        if (param1 != 10) {
            boolean discarded$0 = gg.b((byte) -29);
            ed.a((byte) -120);
            return;
        }
        ed.a((byte) -120);
    }

    public static void b(int param0) {
        if (param0 != 12516) {
          field_f = null;
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final void c(int param0) {
        if (!(null != ((gg) this).field_a)) {
            return;
        }
        ((gg) this).field_a.field_d = ((gg) this).field_d;
        ((gg) this).field_d.field_a = ((gg) this).field_a;
        ((gg) this).field_a = null;
        ((gg) this).field_d = null;
        if (param0 != 10) {
            gg.b(32);
        }
    }

    final boolean a(boolean param0) {
        if (null == ((gg) this).field_a) {
            return false;
        }
        if (param0) {
            field_e = null;
            return true;
        }
        return true;
    }

    final static boolean b(byte param0) {
        if (param0 != 89) {
            field_f = null;
            return lb.g((byte) -94);
        }
        return lb.g((byte) -94);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[10];
        field_c = "Retry";
        field_b = new nc();
    }
}
