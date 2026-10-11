/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static int field_c;
    private fa field_e;
    static String field_a;
    static rh field_d;
    static String[] field_b;
    private fa field_g;
    private qk field_f;

    final mb a(boolean param0, int param1) {
        byte[] var4 = null;
        mb var3 = (mb) (this.field_f.a((long)param1, -24469));
        if (var3 != null) {
          return var3;
        }
        if (32768 > param1) {
          var4 = this.field_g.b(1, 116, param1);
        } else {
          var4 = this.field_e.b(1, 19, 32767 & param1);
        }
        mb var5 = new mb();
        if (var4 != null) {
          var5.a(new dh(var4), param0);
        }
        if (!param0) {
          field_a = (String) null;
          if (32768 <= param1) {
            var5.c(-12);
            this.field_f.a((byte) -3, var5, (long)param1);
            return var5;
          }
          this.field_f.a((byte) -3, var5, (long)param1);
          return var5;
        }
        if (32768 > param1) {
          this.field_f.a((byte) -3, var5, (long)param1);
          return var5;
        }
        var5.c(-12);
        this.field_f.a((byte) -3, var5, (long)param1);
        return var5;
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
          if (param0) {
            var4 += 2;
          }
          if (param3) {
            var4++;
          }
          if (param1 > 97) {
            return kf.field_e[var4];
          }
          return (String) null;
        }
        if (param0) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        if (param1 > 97) {
          return kf.field_e[var4];
        }
        return (String) null;
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 41 / ((44 - param0) / 57);
        field_d = null;
    }

    final static void a(int param0) {
        int var1 = -1 / ((36 - param0) / 61);
        pe.field_b = new pl();
        bj.field_f.a(pe.field_b, -100);
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = 100;
        field_d = new rh(9, 0, 4, 1);
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$feb7e63b59d8(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
          if (param0) {
            var4 += 2;
          }
          if (param3) {
            var4++;
          }
          if (param1 > 97) {
            return kf.field_e[var4];
          }
          return (String) null;
        }
        if (param0) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        if (param1 > 97) {
          return kf.field_e[var4];
        }
        return (String) null;
    }
}
