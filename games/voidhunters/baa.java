/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class baa extends rqa {
    static dja field_o;
    static int field_p;
    static volatile int field_q;

    final static void a(boolean param0, asb param1, asb param2, asb param3, boolean param4) {
        wba.field_p = gi.a("", (byte) 110);
        wba.field_p.a(7861, param4);
        uo.a(param3, param2, param1, 0);
        ieb.e(121);
        dn.field_r = kla.field_d;
        lrb.field_b = kla.field_d;
    }

    baa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((baa) this).a((nc[]) null, 42);
          return new nc(rfa.field_p);
        } else {
          return new nc(rfa.field_p);
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -47) {
            Object var2 = null;
            baa.a(true, (asb) null, (asb) null, (asb) null, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new isb();
        field_p = 27;
        field_q = 0;
    }
}
