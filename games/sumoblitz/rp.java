/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    private qa field_a;
    static String field_b;
    static int field_d;
    Runnable field_e;
    private int[] field_f;
    bg field_c;

    final static void a(boolean param0) {
        kn.field_c[93] = 43;
        kn.field_c[44] = 71;
        kn.field_c[45] = 26;
        kn.field_c[92] = 74;
        kn.field_c[59] = 57;
        kn.field_c[47] = 73;
        if (param0) {
          rp.b(true);
          kn.field_c[61] = 27;
          kn.field_c[222] = 58;
          kn.field_c[520] = 59;
          kn.field_c[192] = 28;
          kn.field_c[46] = 72;
          kn.field_c[91] = 42;
          return;
        } else {
          kn.field_c[61] = 27;
          kn.field_c[222] = 58;
          kn.field_c[520] = 59;
          kn.field_c[192] = 28;
          kn.field_c[46] = 72;
          kn.field_c[91] = 42;
          return;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            rp.a(false);
        }
    }

    final void a(Runnable param0, boolean param1) {
        if (!param1) {
            rp.a(true);
            ((rp) this).field_e = param0;
            return;
        }
        ((rp) this).field_e = param0;
    }

    final void a(int param0) {
        ((rp) this).field_c = new bg(((rp) this).field_a, (rp) this);
        if (param0 < 124) {
            Object var3 = null;
            ((rp) this).a((Runnable) null, true);
        }
    }

    rp(qa param0) {
        int var2 = 0;
        kn discarded$0 = new kn();
        ((rp) this).field_a = param0;
        ((rp) this).field_c = new bg(param0, (rp) this);
        af discarded$1 = new af(((rp) this).field_a);
        af discarded$2 = new af(((rp) this).field_a);
        af discarded$3 = new af(((rp) this).field_a);
        af discarded$4 = new af(((rp) this).field_a);
        af discarded$5 = new af(((rp) this).field_a);
        af discarded$6 = new af(((rp) this).field_a);
        af discarded$7 = new af(((rp) this).field_a);
        af discarded$8 = new af(((rp) this).field_a);
        af discarded$9 = new af(((rp) this).field_a);
        af discarded$10 = new af(((rp) this).field_a);
        ((rp) this).field_f = new int[af.field_c];
        for (var2 = 0; af.field_c > var2; var2++) {
            ((rp) this).field_f[var2] = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 48;
    }
}
