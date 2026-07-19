/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String[] field_h;
    static cn field_e;
    static long field_d;
    static int field_b;
    static int[] field_a;
    static int field_f;
    static om field_g;
    static mf field_c;

    final static int a(byte param0) {
        if (param0 != -12) {
            return 95;
        }
        return ui.field_e;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_e = (cn) null;
          field_h = null;
          field_c = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_c = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    static {
        field_h = new String[]{"Retrieval", "Retribution", "Simulator"};
        field_a = new int[8192];
        field_e = new cn();
        field_g = new om(14, 0, 4, 1);
    }
}
