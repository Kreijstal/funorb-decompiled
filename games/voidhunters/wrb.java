/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wrb extends rqa {
    static int[] field_p;
    static String[] field_r;
    static llb field_q;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_q = null;
          return new nc((Object) (Object) frb.a(122, 118));
        } else {
          return new nc((Object) (Object) frb.a(122, 118));
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_r = null;
        field_q = null;
        if (param0 != 100) {
            wrb.a(34);
        }
    }

    final static int a(int param0, int param1) {
        if (param0 == 100) {
          if (!li.field_i) {
            return 100;
          } else {
            return mmb.field_d[param1].d();
          }
        } else {
          int discarded$7 = wrb.a(-120, -74);
          if (!li.field_i) {
            return 100;
          } else {
            return mmb.field_d[param1].d();
          }
        }
    }

    wrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "Double Assassination";
    }
}
