/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static he[] field_e;
    static int[] field_c;
    static vj field_d;
    static og field_a;
    static String[] field_b;

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param2 < -110) {
          if (!param1) {
            wj.c();
            a.a((byte) -123, param1);
            return;
          } else {
            wj.d(0, 0, wj.field_k, wj.field_c, 0, 192);
            a.a((byte) -123, param1);
            return;
          }
        } else {
          field_e = (he[]) null;
          if (!param1) {
            wj.c();
            a.a((byte) -123, param1);
            return;
          } else {
            wj.d(0, 0, wj.field_k, wj.field_c, 0, 192);
            a.a((byte) -123, param1);
            return;
          }
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            field_a = (og) null;
            return hi.field_a;
        }
        return hi.field_a;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != 23050) {
            kf.a(-121);
        }
    }

    static {
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
