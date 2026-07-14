/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    private String field_i;
    static byte[] field_m;
    static int field_e;
    private boolean field_f;
    static sk field_b;
    private boolean field_k;
    static String field_g;
    static String field_l;
    static String field_c;
    static int field_h;
    static int field_j;
    static int field_a;
    static String field_d;

    final static boolean a(byte param0, int param1, int param2, ue param3) {
        int var4 = 0;
        byte[] var5 = null;
        var4 = 52 / ((15 - param0) / 60);
        var5 = param3.a(param1, true, param2);
        if (var5 == null) {
          return false;
        } else {
          hi.a(var5, 0);
          return true;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        ((qb) this).field_k = true;
        ((qb) this).field_f = param0 ? true : false;
    }

    final String a(byte param0) {
        if (param0 != 2) {
            ((qb) this).field_i = null;
            return ((qb) this).field_i;
        }
        return ((qb) this).field_i;
    }

    final static void b(int param0) {
        tc.field_x = false;
        s.field_c = false;
        fd.a(param0, 0);
        ie.field_x = cl.field_k;
        uh.field_k = cl.field_k;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 >= -49) {
          field_j = 100;
          field_b = null;
          field_m = null;
          field_c = null;
          field_l = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_m = null;
          field_c = null;
          field_l = null;
          field_d = null;
          return;
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return ((qb) this).field_k;
    }

    final boolean b(byte param0) {
        int var2 = 14 % ((param0 - -8) / 44);
        return ((qb) this).field_f;
    }

    final static fi a(boolean param0) {
        if (!param0) {
            return null;
        }
        return (fi) (Object) new hf();
    }

    qb(String param0) {
        ((qb) this).field_f = false;
        ((qb) this).field_k = false;
        ((qb) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = new sk();
        field_c = "Not yet achieved";
        field_d = "This entry doesn't match";
        field_l = "Discard";
    }
}
