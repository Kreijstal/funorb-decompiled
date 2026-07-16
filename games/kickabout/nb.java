/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    private String field_a;
    int field_c;
    static int field_b;
    static int field_k;
    static String field_g;
    static wc field_i;
    to field_l;
    static int[] field_e;
    static ut[] field_j;
    boolean field_d;
    static String field_h;
    static boolean field_f;

    final static int a(nl param0, int param1) {
        if (param1 != 170) {
            return -67;
        }
        return 170 + -(param0.field_o * 8);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_h = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (sr.field_h.a(false, ((nb) this).field_a)) {
          if (param0 != 32) {
            return true;
          } else {
            ((nb) this).field_l = tg.a(sr.field_h, ((nb) this).field_a, "").c();
            ((nb) this).field_d = true;
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 64) {
            return false;
        }
        return -1 > (da.field_h.a(false) ^ -1) ? true : false;
    }

    final static void a(byte param0) {
        int var3 = Kickabout.field_G;
        ue.field_f = new vs[64];
        int var1 = 0;
        int var2 = 74 % ((-30 - param0) / 62);
        while (ue.field_f.length > var1) {
            ue.field_f[var1] = new vs();
            var1++;
        }
    }

    final static int b(byte param0) {
        int var1 = 47 / ((49 - param0) / 51);
        return (int)(1000000000L / no.field_H);
    }

    final static bs a(Throwable param0, String param1) {
        bs var2 = null;
        if (param0 instanceof bs) {
            var2 = (bs) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        } else {
            var2 = new bs(param0, param1);
        }
        return var2;
    }

    nb(int param0, int param1, String param2) {
        ((nb) this).field_l = null;
        ((nb) this).field_d = false;
        ((nb) this).field_a = param2;
        ((nb) this).field_c = param0;
    }

    nb(to param0) {
        ((nb) this).field_l = null;
        ((nb) this).field_d = false;
        ((nb) this).field_d = true;
        ((nb) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[16384];
        field_g = "Unfortunately you are not eligible to create an account.";
        field_h = "Management";
        field_f = true;
    }
}
