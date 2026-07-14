/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bib extends uda {
    static java.math.BigInteger field_g;
    static String field_e;
    static int field_f;

    final void a(int param0, boolean param1) {
        if (param0 != 5) {
            field_f = -59;
        }
    }

    final boolean a(byte param0) {
        int var2 = -37 % ((param0 - 34) / 63);
        return false;
    }

    final void a(byte param0, int param1, ura param2) {
        ((bib) this).field_d.a(param2, -123);
        if (param0 <= 42) {
          field_g = null;
          ((bib) this).field_d.h(54, param1);
          return;
        } else {
          ((bib) this).field_d.h(54, param1);
          return;
        }
    }

    final void a(int param0) {
        if (param0 != 2543) {
            field_g = null;
        }
    }

    public static void c(boolean param0) {
        field_g = null;
        field_e = null;
        if (param0) {
            field_g = null;
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != 5) {
            field_f = -43;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 5) {
            field_f = -9;
        }
    }

    bib(pf param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new java.math.BigInteger("65537");
        field_e = "Lobby";
        field_f = 50;
    }
}
