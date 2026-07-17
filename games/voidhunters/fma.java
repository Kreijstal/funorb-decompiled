/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fma extends mfb {
    static String field_b;
    static String field_c;

    final int c(byte param0) {
        int var2 = 3 / ((75 - param0) / 46);
        return cqa.field_p;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            return 126;
        }
        return bba.field_a;
    }

    final int e(byte param0) {
        if (param0 != -63) {
            return 85;
        }
        return ea.field_j;
    }

    final int a(boolean param0) {
        if (param0) {
            field_c = null;
            return 31;
        }
        return 31;
    }

    final int g(byte param0) {
        if (param0 > -12) {
            field_b = null;
            return qca.field_yb;
        }
        return qca.field_yb;
    }

    final int g(int param0) {
        if (param0 != 2769) {
            int discarded$0 = ((fma) this).b(-10);
            return hrb.field_a;
        }
        return hrb.field_a;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            field_b = null;
            return wja.field_b;
        }
        return wja.field_b;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
            field_c = null;
            return false;
        }
        return false;
    }

    final int k(int param0) {
        if (param0 != 0) {
            field_b = null;
            return 3;
        }
        return 3;
    }

    final static void l() {
        lw.field_i = new llb(0L, (llb) null);
        if (ll.field_o) {
          lw.field_i.b(-561, nna.field_v);
          lw.field_i.b(-561, fh.field_f);
          lc.field_b = new bs(bib.field_e, lw.field_i);
          tb.field_a = new llb(0L, (llb) null);
          tb.field_a.b(-561, (llb) (Object) lc.field_b.field_a);
          tb.field_a.b(-561, gmb.field_c);
          int discarded$2 = 5;
          bp.a();
          return;
        } else {
          lw.field_i.b(-561, fh.field_f);
          lc.field_b = new bs(bib.field_e, lw.field_i);
          tb.field_a = new llb(0L, (llb) null);
          tb.field_a.b(-561, (llb) (Object) lc.field_b.field_a);
          tb.field_a.b(-561, gmb.field_c);
          int discarded$3 = 5;
          bp.a();
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((fma) this).h((byte) 11);
            return bv.field_e;
        }
        return bv.field_e;
    }

    final int b(int param0) {
        int var2 = 32 % ((param0 - 7) / 47);
        return qab.field_d;
    }

    fma() {
    }

    public static void i() {
        field_c = null;
        field_b = null;
    }

    final int b(boolean param0) {
        if (param0) {
            field_c = null;
            return uab.field_b;
        }
        return uab.field_b;
    }

    final boolean i(int param0) {
        if (param0 != 1024) {
            return false;
        }
        return true;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return -23;
        }
        return bn.field_a;
    }

    final int a(byte param0) {
        int var2 = -8 / ((param0 - -48) / 43);
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Resign";
        field_c = "Reload game";
    }
}
