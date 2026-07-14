/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String[] field_i;
    private int field_c;
    private int field_g;
    private int field_e;
    static sj field_b;
    private int field_h;
    private int field_j;
    int field_a;
    private ut field_f;
    static int field_d;

    final void a(int param0) {
        if (param0 != 17) {
          L0: {
            ((v) this).a(-40);
            if ((((v) this).field_a ^ -1) < -1) {
              ((v) this).field_a = ((v) this).field_a - 1;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if ((((v) this).field_a ^ -1) < -1) {
              ((v) this).field_a = ((v) this).field_a - 1;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(gm param0, int param1, boolean param2) {
        int var4 = 0;
        ((v) this).field_j = param0.field_bb >> 2067993136;
        ((v) this).field_a = 17;
        ((v) this).field_c = param0.field_kb >> -508080528;
        ((v) this).field_e = param1;
        ((v) this).field_g = 64;
        ((v) this).field_h = 96;
        iw.a(74, ((v) this).field_f);
        on.b();
        var4 = 486400 / hw.field_i;
        param0.a(var4, 300, ((v) this).field_g, ((v) this).field_h, (byte) -74);
        ta.e(124);
        if (!param2) {
          ((v) this).c(119);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        if (0 < ((v) this).field_a) {
          var2 = ug.a(0, ((v) this).field_c) + -((v) this).field_g;
          var3 = lf.a((byte) -83, ((v) this).field_j) + -((v) this).field_h;
          ((v) this).field_f.b(var2, var3, ((v) this).field_e * ((v) this).field_a / 17);
          if (param0 >= -1) {
            var4 = null;
            ((v) this).a((gm) null, 55, true);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static Boolean d(int param0) {
        int var2 = -80 % ((1 - param0) / 56);
        Boolean var1 = ep.field_f;
        ep.field_f = null;
        return var1;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_i = null;
        field_b = null;
    }

    v() {
        ((v) this).field_f = new ut(128, 128);
    }

    final void a(int param0, byte param1, ob param2) {
        ((v) this).field_g = 64;
        ((v) this).field_h = 64;
        ((v) this).field_c = param2.field_N >> 2129710096;
        ((v) this).field_e = param0;
        ((v) this).field_j = param2.c(true);
        ((v) this).field_a = 17;
        iw.a(-57, ((v) this).field_f);
        on.b();
        int var5 = 64 / ((-64 - param1) / 38);
        int var4 = (param2.j(-1) << 1095012936) / hw.field_i;
        param2.a(300, ((v) this).field_g, ((v) this).field_h, var4, 300);
        ta.e(123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_d = 5;
    }
}
