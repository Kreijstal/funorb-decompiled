/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sga extends hha {
    byte[] field_p;
    int field_q;
    static su field_n;
    ppa field_o;

    final int a(byte param0) {
        if (param0 >= -7) {
          return -69;
        }
        if (this.field_m) {
          return 0;
        }
        return 100;
    }

    final byte[] b(byte param0) {
        if (this.field_m) {
          throw new RuntimeException();
        }
        if (param0 == -126) {
          return this.field_p;
        }
        this.field_o = (ppa) null;
        return this.field_p;
    }

    public static void c(byte param0) {
        if (param0 >= -100) {
          return;
        }
        field_n = null;
    }

    sga() {
    }

    static {
        field_n = new su(6, 0, 4, 2);
    }
}
