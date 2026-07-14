/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends rqa {
    static int[][] field_o;
    static String field_p;

    final static void a(int param0) {
        if (param0 > 48) {
          if (!li.field_i) {
            bia.a((byte) 124);
            return;
          } else {
            feb.a(og.field_r, true).a(true);
            return;
          }
        } else {
          tm.a(45);
          if (!li.field_i) {
            bia.a((byte) 124);
            return;
          } else {
            feb.a(og.field_r, true).a(true);
            return;
          }
        }
    }

    tm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(66, 94));
        } else {
          return new nc((Object) (Object) frb.a(66, 94));
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_p = null;
        if (!param0) {
            field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Who can join";
    }
}
