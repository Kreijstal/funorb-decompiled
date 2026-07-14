/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa {
    private bua field_d;
    static String field_b;
    private int field_c;
    private int field_a;
    static String field_e;

    final static int a(ft param0, int param1) {
        if (param1 != 1383) {
            field_e = null;
            if (param0 == it.field_b) {
                return 6407;
            }
            if (gpa.field_a == param0) {
                return 6408;
            }
            if (rp.field_g == param0) {
                return 6406;
            }
            if (param0 == qr.field_w) {
                return 6409;
            }
            if (wo.field_i == param0) {
                return 6410;
            }
            if (!(param0 != js.field_g)) {
                return 6145;
            }
            throw new IllegalStateException();
        }
        if (param0 == it.field_b) {
            return 6407;
        }
        if (gpa.field_a == param0) {
            return 6408;
        }
        if (rp.field_g == param0) {
            return 6406;
        }
        if (param0 == qr.field_w) {
            return 6409;
        }
        if (wo.field_i == param0) {
            return 6410;
        }
        if (!(param0 != js.field_g)) {
            return 6145;
        }
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 4974) {
            field_e = null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 6) {
          ((waa) this).field_c = -128;
          ura.a(param1 ^ -10991);
          hp.a(1024, 4095 & ((waa) this).field_a * ((waa) this).field_c, 1996, ((waa) this).field_d.b((byte) 74), -1918106173, param2 + ((waa) this).field_c, ((waa) this).field_a + param0);
          se.f((byte) -6);
          return;
        } else {
          ura.a(param1 ^ -10991);
          hp.a(1024, 4095 & ((waa) this).field_a * ((waa) this).field_c, 1996, ((waa) this).field_d.b((byte) 74), -1918106173, param2 + ((waa) this).field_c, ((waa) this).field_a + param0);
          se.f((byte) -6);
          return;
        }
    }

    final void b(int param0) {
        Object var3 = null;
        if (param0 != -9310) {
          var3 = null;
          int discarded$2 = waa.a((ft) null, 19);
          ((waa) this).field_d.a(0);
          return;
        } else {
          ((waa) this).field_d.a(0);
          return;
        }
    }

    waa(int param0, int param1) {
        ((waa) this).field_d = new bua(6, 4, 1);
        ((waa) this).field_d.a(1, true, (byte) -94, 6);
        ((waa) this).field_a = (int)((double)param0 * Math.random());
        ((waa) this).field_c = (int)(Math.random() * (double)param1);
        if ((((waa) this).field_a ^ -1) > -21) {
            ((waa) this).field_a = 20;
        }
        if (20 > ((waa) this).field_c) {
            ((waa) this).field_c = 20;
        }
        if (param0 - 20 < ((waa) this).field_a) {
            ((waa) this).field_a = param0 - 20;
        }
        if (((waa) this).field_c > -20 + param1) {
            ((waa) this).field_c = param1 - 20;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Keys";
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
