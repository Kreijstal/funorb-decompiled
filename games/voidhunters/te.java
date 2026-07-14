/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends rqa {
    static dja field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          te.a(27, (Object) null, (Object) null);
          return new nc((Object) (Object) frb.a(0, 86));
        } else {
          return new nc((Object) (Object) frb.a(0, 86));
        }
    }

    final static void a(int param0, Object param1, Object param2) {
        if (param0 != 29786) {
          field_o = null;
          System.out.println("before=" + param2 + ", now=" + param1);
          return;
        } else {
          System.out.println("before=" + param2 + ", now=" + param1);
          return;
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            field_o = null;
        }
    }

    te(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new wqa();
    }
}
