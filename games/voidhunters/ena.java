/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends rqa {
    static dja field_p;
    static int field_q;
    static String[] field_o;
    static String field_r;

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -57) {
            field_r = null;
            field_r = null;
            field_p = null;
            return;
        }
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, float param1, int param2, int param3, int param4) {
        if (li.field_i) {
          if (lfa.field_j) {
            og.field_r.a(param4 | -16777216, Math.max(1, (int)param1), param3, param0, (byte) -123);
            if (param2 >= -16) {
              field_p = null;
              return;
            } else {
              return;
            }
          } else {
            if (param2 < -16) {
              return;
            } else {
              field_p = null;
              return;
            }
          }
        } else {
          dma.f(param3, param0, (int)param1, param4);
          if (param2 < -16) {
            return;
          } else {
            field_p = null;
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ena) this).a((nc[]) null, 79);
          return new nc((Object) (Object) frb.a(112, 119));
        } else {
          return new nc((Object) (Object) frb.a(112, 119));
        }
    }

    ena(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = (dja) (Object) new ecb();
        field_q = 3;
        field_o = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_r = "Missile scrambler";
    }
}
