/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    int field_x;
    bi field_c;
    int field_A;
    int field_s;
    bi field_e;
    bi field_b;
    pf field_i;
    lo field_m;
    int field_g;
    bi field_r;
    bi field_p;
    bi field_v;
    static bi[] field_a;
    bi field_o;
    int field_w;
    int[] field_u;
    static int field_z;
    int[] field_f;
    boolean[] field_h;
    bi field_n;
    int field_k;
    static fg field_l;
    bi field_d;
    um field_q;
    String field_t;
    static String field_j;
    static int[] field_y;

    final static boolean a(int param0, String param1) {
        if (!sr.field_h) {
            return false;
        }
        if (-3 != (em.field_h ^ -1)) {
            return false;
        }
        if (null == nd.field_k) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        if (!(nd.field_k.equals((Object) (Object) ji.a(var3, true)))) {
            return false;
        }
        int var2 = -10 % ((param0 - -1) / 38);
        return true;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 4) {
          var2 = null;
          boolean discarded$2 = fs.a(-14, (String) null);
          field_y = null;
          field_j = null;
          field_l = null;
          field_a = null;
          return;
        } else {
          field_y = null;
          field_j = null;
          field_l = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        gr.a(true, param1, 0);
        if (param0 <= 85) {
            field_l = null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        ol.field_e = param0;
        ri.field_O = param1;
        if (param2) {
            field_z = -11;
        }
    }

    fs(int param0, String param1, int param2, int param3, int param4) {
        ((fs) this).field_k = param3;
        ((fs) this).field_s = param4;
        ((fs) this).field_x = param0;
        ((fs) this).field_g = param2;
        ((fs) this).field_t = param1;
        ((fs) this).field_i = new pf();
        ((fs) this).field_w = 0;
        ((fs) this).field_f = null;
        ((fs) this).field_u = new int[4];
        ((fs) this).field_h = null;
        ((fs) this).field_A = 0;
        ((fs) this).field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 360;
        field_l = new fg();
        field_j = "Breaking real-world laws";
    }
}
