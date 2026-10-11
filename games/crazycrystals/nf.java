/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends oh {
    static boolean field_f;
    static dl field_g;

    final int a(byte param0, boolean param1) {
        if (param0 <= -53) {
          return !param1 ? 8 : 16;
        }
        this.a((byte) -2, false);
        return !param1 ? 8 : 16;
    }

    final int a(int param0, int param1) {
        if (param0 == 1843275042) {
          return q.field_a[ma.field_n[param1]].field_j;
        }
        field_f = false;
        return q.field_a[ma.field_n[param1]].field_j;
    }

    nf() {
    }

    public static void c(byte param0) {
        if (param0 != 39) {
          field_f = true;
          field_g = null;
          return;
        }
        field_g = null;
    }

    static {
    }
}
