/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends ij {
    private Object field_x;
    static tf field_z;
    static int field_y;
    static hd field_u;
    static String field_v;
    static String field_B;
    static ot field_w;
    static String field_C;
    static String field_E;
    static int field_t;
    static String[] field_D;
    static String field_A;

    public static void b(int param0) {
        field_A = null;
        field_C = null;
        field_E = null;
        field_u = null;
        field_v = null;
        if (param0 != -1) {
          pn.b(-99);
          field_B = null;
          field_w = null;
          field_D = null;
          field_z = null;
          return;
        } else {
          field_B = null;
          field_w = null;
          field_D = null;
          field_z = null;
          return;
        }
    }

    final static boolean g(int param0) {
        return null == e.field_m ? vb.field_k : true;
    }

    pn(Object param0, int param1) {
        super(param1);
        try {
            ((pn) this).field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean h(byte param0) {
        if (param0 <= 105) {
            field_t = -26;
            return false;
        }
        return false;
    }

    final Object a(int param0) {
        if (param0 > -25) {
            field_t = 51;
            return ((pn) this).field_x;
        }
        return ((pn) this).field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new tf();
        field_t = -1;
        field_v = "Please send me news and updates (I can unsubscribe at any time)";
        field_E = "<%0> has entered another game.";
        field_B = "Loading lobby";
        field_C = "Trade players online with other FunOrb users.";
        field_A = "Click on a player in your squad.";
    }
}
