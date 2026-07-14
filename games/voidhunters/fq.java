/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends rqa {
    static String field_p;
    static int[] field_o;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 1) {
            fq.a(-20);
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((fq) this).a((nc[]) null, 16);
          return new nc(iva.field_p);
        } else {
          return new nc(iva.field_p);
        }
    }

    fq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Capture the points to deplete the enemy's reinforcements";
        field_o = new int[]{-1, 0, 1, -1, 0, 1, 0, 1, 0, 1, 0, 1};
        field_q = "There are no valid types of game that match your preferences.";
    }
}
