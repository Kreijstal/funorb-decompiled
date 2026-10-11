/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    byte[] field_k;
    int field_l;
    static String field_n;
    int field_i;
    int field_j;
    byte[] field_b;
    int field_c;
    static int field_d;
    int field_a;
    static String field_m;
    static int[] field_g;
    int field_h;
    int field_f;
    static int[] field_e;

    final static java.awt.Canvas a(int param0) {
        if (param0 > 26) {
          return null != gi.field_d ? (java.awt.Canvas) ((Object) gi.field_d) : bg.field_P;
        }
        ab.a(81);
        return null != gi.field_d ? (java.awt.Canvas) ((Object) gi.field_d) : bg.field_P;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_e = null;
        field_m = null;
        field_g = null;
        if (!param0) {
          ab.a(-3);
        }
    }

    static {
        field_m = "Age:";
        field_n = "Close";
        field_d = 1;
        field_g = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 127, 256};
        field_e = new int[]{-192, -256, 384, 512};
    }
}
