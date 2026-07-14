/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends rqa {
    static int field_o;
    static int field_p;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((gaa) this).a((nc[]) null, 10);
          return new nc(sn.field_Y);
        } else {
          return new nc(sn.field_Y);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 != 11343) {
          gaa.a(72, 8, 14, true);
          lfa.a((byte) 34, param3);
          ha.a(param3, param0, param2, 5);
          return;
        } else {
          lfa.a((byte) 34, param3);
          ha.a(param3, param0, param2, 5);
          return;
        }
    }

    gaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 10;
    }
}
