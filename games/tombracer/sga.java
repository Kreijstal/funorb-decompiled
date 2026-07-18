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
        if (!(!((sga) this).field_m)) {
            return 0;
        }
        return 100;
    }

    final byte[] b(byte param0) {
        if (((sga) this).field_m) {
          throw new RuntimeException();
        } else {
          if (param0 != -126) {
            ((sga) this).field_o = null;
            return ((sga) this).field_p;
          } else {
            return ((sga) this).field_p;
          }
        }
    }

    public static void c(byte param0) {
        field_n = null;
    }

    sga() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new su(6, 0, 4, 2);
    }
}
