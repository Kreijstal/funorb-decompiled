/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb {
    static int field_b;
    static long field_c;
    qb field_d;
    qb field_a;
    static long field_f;
    long field_e;

    final static void a(byte param0) {
        wf.a((byte) -96, mk.g(-120));
    }

    final void c(int param0) {
        if (null != ((qb) this).field_a) {
          ((qb) this).field_a.field_d = ((qb) this).field_d;
          ((qb) this).field_d.field_a = ((qb) this).field_a;
          if (param0 <= 81) {
            return;
          } else {
            ((qb) this).field_d = null;
            ((qb) this).field_a = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(int param0) {
        if (!(((qb) this).field_a != null)) {
            return false;
        }
        int var2 = 22 / ((param0 - -36) / 56);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 20000000L;
    }
}
