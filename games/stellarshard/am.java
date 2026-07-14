/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_i;
    static int field_f;
    static re field_c;
    static int[] field_d;
    static pf field_g;
    static String field_b;
    private boolean field_a;
    private String field_h;
    static String field_e;

    am(String param0) {
        this(param0, false);
    }

    final String a(byte param0) {
        int var2 = -64 % ((53 - param0) / 50);
        return ((am) this).field_h;
    }

    final static void a(int param0, int param1, int param2) {
        ea.field_p = param1;
        fg.field_O = param0;
        int var3 = 21 % ((-58 - param2) / 59);
        n.field_L = 255;
        tl.field_c = 6;
    }

    public static void b(int param0) {
        if (param0 > -53) {
          field_g = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_g = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_i = null;
          field_g = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final boolean a(int param0) {
        if (param0 != 5) {
            field_g = null;
            return ((am) this).field_a;
        }
        return ((am) this).field_a;
    }

    am(String param0, boolean param1) {
        ((am) this).field_h = param0;
        if (null == ((am) this).field_h) {
            ((am) this).field_h = "";
        }
        ((am) this).field_a = param1 ? true : false;
        if (((am) this).field_h.length() == 0) {
            ((am) this).field_a = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept";
        field_d = new int[]{2, 2, 2, 2, 2, 5, 3, 5, 2, 5, 10, 2, 3, 1};
        field_f = -1;
        field_e = "Loading graphics";
    }
}
